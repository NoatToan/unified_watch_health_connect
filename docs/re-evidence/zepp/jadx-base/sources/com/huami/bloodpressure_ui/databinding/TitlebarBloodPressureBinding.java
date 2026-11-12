package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes6.dex */
public final class TitlebarBloodPressureBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RainbowTitleBar tvTitlebar;

    private TitlebarBloodPressureBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.tvTitlebar = rainbowTitleBar;
    }

    @NonNull
    public static TitlebarBloodPressureBinding bind(@NonNull View view) {
        int i = R.id.tv_titlebar;
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
        if (rainbowTitleBar != null) {
            return new TitlebarBloodPressureBinding((ConstraintLayout) view, rainbowTitleBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static TitlebarBloodPressureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TitlebarBloodPressureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.titlebar_blood_pressure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
