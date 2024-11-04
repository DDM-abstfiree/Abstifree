package com.example.abstifree;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abstifree.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Product> productList; // Declaração da lista de produtos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Binding da activity
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Inicializa a lista de produtos
        productList = new ArrayList<>();

        // Configurando o RecyclerView
        RecyclerView recyclerView = binding.recommendedProducts; // Acessa o RecyclerView pelo binding
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 colunas

        // Adicionando produtos à lista (exemplo)
        productList.add(new Product("Produto 1", "29.99", R.drawable.product_image_1));
        productList.add(new Product("Produto 2", "49.99", R.drawable.product_image_1));
        productList.add(new Product("Produto 3", "19.99", R.drawable.product_image_1));
        // Adicione mais produtos conforme necessário

        // Defina o adapter do RecyclerView aqui, se ainda não tiver feito
        ProductAdapter productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
    }
}
