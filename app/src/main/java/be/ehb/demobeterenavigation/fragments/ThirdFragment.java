package be.ehb.demobeterenavigation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import be.ehb.demobeterenavigation.R;

public class ThirdFragment extends Fragment {

    public ThirdFragment() {
    }

    //factory method
    public static ThirdFragment newInstance(){
        return new ThirdFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_third, container, false);

        String waKrijgenWe = getArguments().getString("data_key");

        TextView textView = view.findViewById(R.id.tv_third_details);
        textView.setText(waKrijgenWe);

        return view;
    }
}
