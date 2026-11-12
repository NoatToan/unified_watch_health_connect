package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateActivityHeartRateMeasureBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout fragmentContainer;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private HeartRateActivityHeartRateMeasureBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout fragmentContainer, @NonNull RainbowTitleBar tvTitleBar) {
        this.a = rootView;
        this.fragmentContainer = fragmentContainer;
        this.tvTitleBar = tvTitleBar;
    }

    @NonNull
    public static HeartRateActivityHeartRateMeasureBinding bind(@NonNull View rootView) {
        int i = R.id.fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.tv_title_bar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, i);
            if (rainbowTitleBar != null) {
                return new HeartRateActivityHeartRateMeasureBinding((LinearLayout) rootView, frameLayout, rainbowTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateActivityHeartRateMeasureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateActivityHeartRateMeasureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_activity_heart_rate_measure, parent, false);
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
