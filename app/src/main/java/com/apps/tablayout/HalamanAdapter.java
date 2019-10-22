package com.apps.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class HalamanAdapter extends FragmentStatePagerAdapter {

    public HalamanAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0: fragment = new SatuFragment();
                return fragment;
            case 1: fragment = new DuaFragment();
                return fragment;
            default: fragment = new SatuFragment();
                return fragment;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Pesan";
            case 1: return  "Panggilan";
            default: return "Satu";
        }
    }
}
