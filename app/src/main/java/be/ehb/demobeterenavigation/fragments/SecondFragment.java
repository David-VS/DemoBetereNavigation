package be.ehb.demobeterenavigation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import be.ehb.demobeterenavigation.R;
import be.ehb.demobeterenavigation.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(view1 ->
                NavHostFragment.findNavController(SecondFragment.this)
                               .navigate(R.id.action_SecondFragment_to_FirstFragment));

        binding.btnNavToThird.setOnClickListener((View v)->{
            Bundle myBundle = new Bundle();
            myBundle.putString("data_key", "Effectieve inhoud");
            myBundle.putInt("pincode", 8965);
            NavHostFragment.findNavController(SecondFragment.this)
                    .navigate(R.id.action_SecondFragment_to_ThirdFragment2, myBundle);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}