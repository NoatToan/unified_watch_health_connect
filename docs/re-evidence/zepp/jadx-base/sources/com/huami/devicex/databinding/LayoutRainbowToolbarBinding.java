package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutRainbowToolbarBinding implements ViewBinding {

    @NonNull
    private final RainbowTitleBar a;

    @NonNull
    public final RainbowTitleBar titleBar;

    private LayoutRainbowToolbarBinding(@NonNull RainbowTitleBar rainbowTitleBar, @NonNull RainbowTitleBar rainbowTitleBar2) {
        this.a = rainbowTitleBar;
        this.titleBar = rainbowTitleBar2;
    }

    @NonNull
    public static LayoutRainbowToolbarBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) view;
        return new LayoutRainbowToolbarBinding(rainbowTitleBar, rainbowTitleBar);
    }

    @NonNull
    public static LayoutRainbowToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutRainbowToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_rainbow_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RainbowTitleBar getRoot() {
        return this.a;
    }
}
