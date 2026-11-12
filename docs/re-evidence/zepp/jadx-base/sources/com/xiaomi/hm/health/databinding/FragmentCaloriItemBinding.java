package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentCaloriItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ViewPager sportEnergyContent;

    private FragmentCaloriItemBinding(@NonNull ConstraintLayout rootView, @NonNull ViewPager sportEnergyContent) {
        this.a = rootView;
        this.sportEnergyContent = sportEnergyContent;
    }

    @NonNull
    public static FragmentCaloriItemBinding bind(@NonNull View rootView) {
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.sport_energy_content);
        if (viewPager != null) {
            return new FragmentCaloriItemBinding((ConstraintLayout) rootView, viewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.sport_energy_content)));
    }

    @NonNull
    public static FragmentCaloriItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentCaloriItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_calori_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
