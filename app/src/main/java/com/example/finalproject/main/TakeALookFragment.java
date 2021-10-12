package com.example.finalproject.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.finalproject.R;
import com.example.finalproject.gallery.Animation;
import com.example.finalproject.gallery.Architecture;
import com.example.finalproject.gallery.CivilEngineer;
import com.example.finalproject.gallery.GraphicDesign;
import com.example.finalproject.gallery.Photographer;
import com.example.finalproject.gallery.UXDesign;


public class TakeALookFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_take_a_look, container, false);

        final ImageView animation, architecture, civilEngineer, graphicDesign, photographer, uxDesign;

        animation = view.findViewById(R.id.iv_animator_view);
        architecture = view.findViewById(R.id.iv_architect_view);
        civilEngineer = view.findViewById(R.id.iv_civil_engineer_view);
        graphicDesign = view.findViewById(R.id.iv_grapic_designer_view);
        photographer = view.findViewById(R.id.iv_photographer_view);
        uxDesign = view.findViewById(R.id.iv_ux_designer_view);

        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container, (Fragment)new Animation()).addToBackStack(null).commit();
            }
        });

        architecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container, (Fragment)new Architecture()).addToBackStack(null).commit();
            }
        });

        civilEngineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container, (Fragment)new CivilEngineer()).addToBackStack(null).commit();
            }
        });

        graphicDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container, (Fragment)new GraphicDesign()).addToBackStack(null).commit();
            }
        });

        photographer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container, (Fragment)new Photographer()).addToBackStack(null).commit();
            }
        });

        uxDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container, (Fragment)new UXDesign()).addToBackStack(null).commit();
            }
        });

        return view;
    }

    public void onResume(){
        super.onResume();

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Take a Look");

    }
}
