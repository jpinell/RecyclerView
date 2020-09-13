package com.jpinell.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder>{

    ArrayList<Contacto> contactos;

    public ContactoAdaptador(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }


    @NonNull
    //Inflar el layout y lo pasará al viewHolder para que obtenga los views
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto, parent,false);
        return new ContactoViewHolder(v);
    }

    //Asocia cada elemento de la lista a cada view.
    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder contactoViewHolder, int position) {
        Contacto contacto = contactos.get(position);
        contactoViewHolder.imgFoto.setImageResource(contacto.getFoto());
        contactoViewHolder.tvNombreCV.setText(contacto.getNombre());
        contactoViewHolder.tvTelefonoCV.setText(contacto.getTelefono());
    }

    @Override
    public int getItemCount() { //Cantidad de elementos de la lista
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView tvTelefonoCV;
        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto      = itemView.findViewById(R.id.imgFoto);
            tvNombreCV   = itemView.findViewById(R.id.tvNombreCV);
            tvTelefonoCV = itemView.findViewById(R.id.tvTelefonoCV);
        }
    }
}
