package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.moving.sport.ui.R;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiFragmentSportDataDetailBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final AppCompatImageView ivBackground;

    @NonNull
    public final LinearLayoutCompat rootContainer;

    @NonNull
    public final RecyclerView rvContainer;

    @NonNull
    public final RainbowTitleBar titleBar;

    private MovingUiFragmentSportDataDetailBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = frameLayout;
        this.ivBackground = appCompatImageView;
        this.rootContainer = linearLayoutCompat;
        this.rvContainer = recyclerView;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static MovingUiFragmentSportDataDetailBinding bind(@NonNull View view) {
        int i = R.id.iv_background;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.root_container;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.rv_container;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        return new MovingUiFragmentSportDataDetailBinding((FrameLayout) view, appCompatImageView, linearLayoutCompat, recyclerView, rainbowTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MovingUiFragmentSportDataDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiFragmentSportDataDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_fragment_sport_data_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
