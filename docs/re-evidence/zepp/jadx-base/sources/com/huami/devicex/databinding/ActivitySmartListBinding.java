package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySmartListBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RainbowTitleBar actionbar;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final View maskView;

    @NonNull
    public final RecyclerView rvAppCards;

    private ActivitySmartListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.actionbar = rainbowTitleBar;
        this.container = frameLayout;
        this.maskView = view;
        this.rvAppCards = recyclerView;
    }

    @NonNull
    public static ActivitySmartListBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.actionbar;
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
        if (rainbowTitleBar != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                i = R.id.rv_app_cards;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new ActivitySmartListBinding((ConstraintLayout) view, rainbowTitleBar, frameLayout, viewFindChildViewById, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySmartListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySmartListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_smart_list, viewGroup, false);
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
