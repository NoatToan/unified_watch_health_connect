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
public final class HeartRateActivityHeartRateBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout dataContainer;

    @NonNull
    public final HeartRateLayoutDateTabBinding heartRateTab;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private HeartRateActivityHeartRateBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout dataContainer, @NonNull HeartRateLayoutDateTabBinding heartRateTab, @NonNull RainbowTitleBar tvTitleBar) {
        this.a = rootView;
        this.dataContainer = dataContainer;
        this.heartRateTab = heartRateTab;
        this.tvTitleBar = tvTitleBar;
    }

    @NonNull
    public static HeartRateActivityHeartRateBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.dataContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.heartRateTab))) != null) {
            HeartRateLayoutDateTabBinding heartRateLayoutDateTabBindingBind = HeartRateLayoutDateTabBinding.bind(viewFindChildViewById);
            int i2 = R.id.tv_title_bar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, i2);
            if (rainbowTitleBar != null) {
                return new HeartRateActivityHeartRateBinding((LinearLayout) rootView, frameLayout, heartRateLayoutDateTabBindingBind, rainbowTitleBar);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateActivityHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateActivityHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_activity_heart_rate, parent, false);
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
