package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentPlayNewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TabLayout playTabLayout;

    @NonNull
    public final ViewPager2 playViewpager;

    private FragmentPlayNewBinding(@NonNull LinearLayout rootView, @NonNull TabLayout playTabLayout, @NonNull ViewPager2 playViewpager) {
        this.a = rootView;
        this.playTabLayout = playTabLayout;
        this.playViewpager = playViewpager;
    }

    @NonNull
    public static FragmentPlayNewBinding bind(@NonNull View rootView) {
        int i = R.id.play_tabLayout;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.play_tabLayout);
        if (tabLayout != null) {
            i = R.id.play_viewpager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(rootView, R.id.play_viewpager);
            if (viewPager2 != null) {
                return new FragmentPlayNewBinding((LinearLayout) rootView, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPlayNewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPlayNewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_play_new, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
