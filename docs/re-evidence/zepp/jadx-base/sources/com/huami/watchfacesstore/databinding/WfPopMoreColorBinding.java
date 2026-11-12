package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfPopMoreColorBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final RecyclerView rlMoreColor;

    private WfPopMoreColorBinding(@NonNull FrameLayout rootView, @NonNull RecyclerView rlMoreColor) {
        this.a = rootView;
        this.rlMoreColor = rlMoreColor;
    }

    @NonNull
    public static WfPopMoreColorBinding bind(@NonNull View rootView) {
        int i = R.id.rl_more_color;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
        if (recyclerView != null) {
            return new WfPopMoreColorBinding((FrameLayout) rootView, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfPopMoreColorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfPopMoreColorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_pop_more_color, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
