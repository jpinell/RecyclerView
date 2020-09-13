package com.jpinell.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView ListaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aqui va la actionbar

        ListaContactos = findViewById(R.id.rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaContactos.setLayoutManager(llm);

        inicializarListaContactos();
        inicializarAdaptador();

       /* ArrayList<String> nombresContacto = new ArrayList<>();
        for (Contacto contacto : contactos){
            nombresContacto.add(contacto.getNombre());
        }*/
    }

    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos);
        ListaContactos.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto(R.mipmap.candy, "Katy Centeno","8856-2869","muchachamayo@gmail.com"));
        contactos.add(new Contacto(R.mipmap.hongo, "Jorge Pinell","8530-6321","jpinell1075@gmail.com"));
        contactos.add(new Contacto(R.mipmap.eskimo, "Amaru Pinell","8530-6321","ajpinell@gmail.com"));
        contactos.add(new Contacto(R.mipmap.candy, "Katy Centeno","8856-2869","muchachamayo@gmail.com"));
        contactos.add(new Contacto(R.mipmap.hongo, "Jorge Pinell","8530-6321","jpinell1075@gmail.com"));
        contactos.add(new Contacto(R.mipmap.candy, "Katy Centeno","8856-2869","muchachamayo@gmail.com"));
        contactos.add(new Contacto(R.mipmap.hongo, "Jorge Pinell","8530-6321","jpinell1075@gmail.com"));
        contactos.add(new Contacto(R.mipmap.candy, "Katy Centeno","8856-2869","muchachamayo@gmail.com"));
        contactos.add(new Contacto(R.mipmap.hongo, "Jorge Pinell","8530-6321","jpinell1075@gmail.com"));
    }
}