package com.example.trademark.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trademark.BookingActivity;
import com.example.trademark.HotelMenuAccount;
import com.example.trademark.MeetingsActivity;
import com.example.trademark.R;

import soup.neumorphism.NeumorphCardView;
import soup.neumorphism.ShapeType;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private NeumorphCardView neumorphCardView, RoomsSuite,Meetings;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        neumorphCardView = root.findViewById(R.id.eatdronkcard);
        RoomsSuite = root.findViewById(R.id.rooms_suites);
        Meetings = root.findViewById(R.id.meetings);

        neumorphCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neumorphCardView.setShapeType(ShapeType.PRESSED);
                Intent intent = new Intent(getActivity(), HotelMenuAccount.class);
                startActivity(intent);
            }
        });


        RoomsSuite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RoomsSuite.setShapeType(ShapeType.PRESSED);
                Intent intent = new Intent(getActivity(), BookingActivity.class);
                startActivity(intent);
            }
        });



        Meetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Meetings.setShapeType(ShapeType.PRESSED);
                Intent intent = new Intent(getActivity(), MeetingsActivity.class);
                startActivity(intent);
            }
        });


        return root;
    }
}