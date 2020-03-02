package com.example.recyclerviewtwo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter {
    List <Pojo> arrayList;

    public TestAdapter(List<Pojo> arrayList){
        this.arrayList = arrayList;
    }
    @Override
    public int getItemViewType(int position) {

       if (arrayList.get(position).equals(0)){
       // if (arrayList.get(position).toString().contains("0")){
            return 0;
        }
        else{
            return 1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;

        if (viewType ==0){
            view = layoutInflater.inflate(R.layout.card1,parent,false);
            return new ViewHolderTwo(view);
        }
        else{
            view = layoutInflater.inflate(R.layout.card,parent,false);
            return  new ViewHolderOne(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (arrayList.get(position).equals(0)){

            ViewHolderTwo viewHolderTwo = (ViewHolderTwo) holder;
            Pojo currentItem = arrayList.get(position);

            viewHolderTwo.dish.setText(currentItem.getmDish());
            viewHolderTwo.type.setText(currentItem.getMtype());
            viewHolderTwo.rating.setText(currentItem.getmRating());
            viewHolderTwo.price.setText(currentItem.getmPrice());
            viewHolderTwo.offers.setText(currentItem.getmOffers());
        }
        else
        {
           ViewHolderOne viewHolderOne = (ViewHolderOne) holder;
            Pojo currentItem = arrayList.get(position);

            viewHolderOne.imageView.setImageResource(currentItem.getmImageResource());
            viewHolderOne.dish.setText(currentItem.getmDish());
            viewHolderOne.type.setText(currentItem.getMtype());
            viewHolderOne.rating.setText(currentItem.getmRating());
            viewHolderOne.price.setText(currentItem.getmPrice());

        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ViewHolderOne extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView dish,type,rating,price;

        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            dish = itemView.findViewById(R.id.txtDish);
            type = itemView.findViewById(R.id.txtType);
            rating = itemView.findViewById(R.id.txtRating);
            price = itemView.findViewById(R.id.txtPrice);
        }
    }

    class ViewHolderTwo extends RecyclerView.ViewHolder{

        TextView dish,type,rating,price,offers;

        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);

            dish = itemView.findViewById(R.id.txtDish);
            type = itemView.findViewById(R.id.txtType);
            rating = itemView.findViewById(R.id.txtRating);
            price = itemView.findViewById(R.id.txtPrice);
            offers =itemView.findViewById(R.id.txtOffers);
        }
    }

}
