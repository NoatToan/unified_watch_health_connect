package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentAlertSettingsBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RecyclerView rcContainer;

    @NonNull
    public final RainbowTitleBar titleBar;

    private FragmentAlertSettingsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.rcContainer = recyclerView;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentAlertSettingsBinding bind(@NonNull View view) {
        int i = R.id.rc_container;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.title_bar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
            if (rainbowTitleBar != null) {
                return new FragmentAlertSettingsBinding((ConstraintLayout) view, recyclerView, rainbowTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentAlertSettingsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAlertSettingsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_alert_settings, viewGroup, false);
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
