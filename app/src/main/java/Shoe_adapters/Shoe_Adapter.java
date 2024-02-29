package Shoe_adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam_project.R;
import com.example.exam_project.Shoes_Activity;

public class Shoe_Adapter extends RecyclerView.Adapter<Shoe_Adapter.ShoeViewHolder> {

    Context context;
    Integer[] image;
    String[] name;
    String[] price;

    public Shoe_Adapter(Context context,Integer[] image,String[] name,String[] price){
        this.context = context;
        this.image = image;
        this.name = name;
        this.price = price;
    }
    @NonNull
    @Override
    public ShoeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.shoe_view,parent,false);
        return new ShoeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoeViewHolder holder, int position) {

        holder.img.setImageResource(image[position]);
        holder.txt1.setText(name[position]);
        holder.txt2.setText(price[position]);

        holder.card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Shoes_Activity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    class ShoeViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txt1,txt2;
        CardView card1;
        public ShoeViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            txt1 = itemView.findViewById(R.id.txt1);
            txt2 = itemView.findViewById(R.id.txt2);
            card1 = itemView.findViewById(R.id.card1);


        }
    }
}
