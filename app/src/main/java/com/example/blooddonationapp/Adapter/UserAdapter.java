package com.example.blooddonationapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.blooddonationapp.Model.User;
import com.example.blooddonationapp.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter  extends  RecyclerView.Adapter<UserAdapter.ViewHolder>{

private Context context;
private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate
                (R.layout.user_displayed_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

     final User user = userList.get(position);

        holder.type.setText(user.getType());

        if (user.getType().equals("donor")){
            holder.emailNow.setVisibility(View.VISIBLE);
        }
        holder.userEmail.setText(user.getType());
        holder.phoneNumber.setText(user.getType());
        holder.username.setText(user.getType());
        holder.bloodGroup.setText(user.getType());

        Glide.with(context).load(user.getProfileimagepocture()).into(holder.userProfileImage);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

             public CircleImageView userProfileImage;
             public TextView type, username, userEmail, phoneNumber, bloodGroup;
             public Button emailNow;

             public ViewHolder(@NonNull View itemView) {
                 super(itemView);

                 userProfileImage = itemView.findViewById(R.id.userProfileImage);
                 type = itemView.findViewById(R.id.type);
                 username = itemView.findViewById(R.id.userName);
                 userEmail = itemView.findViewById(R.id.userEmail);
                 phoneNumber = itemView.findViewById(R.id.phoneNumber);
                 bloodGroup = itemView.findViewById(R.id.bloodGroup);
                 emailNow = itemView.findViewById(R.id.emailNow);

             }

         }
}
