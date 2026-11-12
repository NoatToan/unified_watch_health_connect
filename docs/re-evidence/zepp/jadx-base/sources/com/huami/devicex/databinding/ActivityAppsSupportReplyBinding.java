package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityAppsSupportReplyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RecyclerView rvAppsSupport;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private ActivityAppsSupportReplyBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.rvAppsSupport = recyclerView;
        this.tvTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityAppsSupportReplyBinding bind(@NonNull View view) {
        int i = R.id.rv_apps_support;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.tv_title_bar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
            if (rainbowTitleBar != null) {
                return new ActivityAppsSupportReplyBinding((LinearLayout) view, recyclerView, rainbowTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAppsSupportReplyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAppsSupportReplyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_apps_support_reply, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
