package com.nsu.dorbesh.mynearby;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DORBESH on 1/28/2017.
 */

public class NearByAdapter extends RecyclerView.Adapter<NearByAdapter.NearbyViewHolder>{

     ArrayList<NearBy> arrayList = new ArrayList<>();
    Context context;

    public NearByAdapter(ArrayList<NearBy> arrayList,Context context){
        this.arrayList = arrayList;
        this.context = context;
    }
    @Override
    public NearbyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nearby_layour,parent,false);
        NearbyViewHolder viewHolder = new NearbyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final NearbyViewHolder holder, final int position) {

        holder.txtName.setText(arrayList.get(position).getName());
        holder.txtVincity.setText(arrayList.get(position).getVincity());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lat = arrayList.get(position).getLatitude();
                String lng = arrayList.get(position).getLongitude();
                String clat = arrayList.get(position).getClatitude();
                String clng = arrayList.get(position).getClongitude();


                Intent intent = new Intent(context,DirectionActivity.class);

                intent.putExtra("lat",lat);
                intent.putExtra("lng",lng);
                intent.putExtra("clat",clat);
                intent.putExtra("clng",clng);
                intent.putExtra("h_name",holder.txtName.getText().toString());

                context.startActivity(intent);

                //Toast.makeText(context,lat+"  "+lng+" Current:->"+clat+" "+clng, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class NearbyViewHolder extends RecyclerView.ViewHolder{

        TextView txtName,txtVincity;
        RelativeLayout relativeLayout;

        public NearbyViewHolder(View v) {
            super(v);
            txtName = (TextView)v.findViewById(R.id.PlaceName);
            txtVincity = (TextView)v.findViewById(R.id.vincity);
            relativeLayout = (RelativeLayout)v.findViewById(R.id.nearclick);
        }
    }
}
