package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huami.bloodpressure_ui.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentBloodPressurePagerBinding implements ViewBinding {

    @NonNull
    private final ViewPager2 a;

    @NonNull
    public final ViewPager2 viewpager;

    private FragmentBloodPressurePagerBinding(@NonNull ViewPager2 viewPager2, @NonNull ViewPager2 viewPager3) {
        this.a = viewPager2;
        this.viewpager = viewPager3;
    }

    @NonNull
    public static FragmentBloodPressurePagerBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        ViewPager2 viewPager2 = (ViewPager2) view;
        return new FragmentBloodPressurePagerBinding(viewPager2, viewPager2);
    }

    @NonNull
    public static FragmentBloodPressurePagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBloodPressurePagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_blood_pressure_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ViewPager2 getRoot() {
        return this.a;
    }
}
