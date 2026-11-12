package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.heartrate.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateActivityRestingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    @NonNull
    public final ViewPager viewPager;

    private HeartRateActivityRestingBinding(@NonNull LinearLayout rootView, @NonNull RainbowTitleBar tvTitleBar, @NonNull ViewPager viewPager) {
        this.a = rootView;
        this.tvTitleBar = tvTitleBar;
        this.viewPager = viewPager;
    }

    @NonNull
    public static HeartRateActivityRestingBinding bind(@NonNull View rootView) {
        int i = R.id.tv_title_bar;
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, i);
        if (rainbowTitleBar != null) {
            i = R.id.view_pager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, i);
            if (viewPager != null) {
                return new HeartRateActivityRestingBinding((LinearLayout) rootView, rainbowTitleBar, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateActivityRestingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateActivityRestingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_activity_resting, parent, false);
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
