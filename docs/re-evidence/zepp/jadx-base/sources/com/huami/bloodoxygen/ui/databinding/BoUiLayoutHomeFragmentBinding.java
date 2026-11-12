package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.huami.bloodoxygen.ui.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiLayoutHomeFragmentBinding implements ViewBinding {

    @NonNull
    private final ViewPager a;

    @NonNull
    public final ViewPager viewpager;

    private BoUiLayoutHomeFragmentBinding(@NonNull ViewPager viewPager, @NonNull ViewPager viewPager2) {
        this.a = viewPager;
        this.viewpager = viewPager2;
    }

    @NonNull
    public static BoUiLayoutHomeFragmentBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        ViewPager viewPager = (ViewPager) view;
        return new BoUiLayoutHomeFragmentBinding(viewPager, viewPager);
    }

    @NonNull
    public static BoUiLayoutHomeFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiLayoutHomeFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_layout_home_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ViewPager getRoot() {
        return this.a;
    }
}
