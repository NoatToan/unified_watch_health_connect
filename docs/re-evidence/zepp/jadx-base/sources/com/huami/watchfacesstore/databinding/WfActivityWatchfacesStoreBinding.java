package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfActivityWatchfacesStoreBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView ivChangeView;

    @NonNull
    public final ImageView ivHomeBack;

    @NonNull
    public final TabLayout tabLayout;

    @NonNull
    public final FrameLayout wfContainer;

    private WfActivityWatchfacesStoreBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivChangeView, @NonNull ImageView ivHomeBack, @NonNull TabLayout tabLayout, @NonNull FrameLayout wfContainer) {
        this.a = rootView;
        this.ivChangeView = ivChangeView;
        this.ivHomeBack = ivHomeBack;
        this.tabLayout = tabLayout;
        this.wfContainer = wfContainer;
    }

    @NonNull
    public static WfActivityWatchfacesStoreBinding bind(@NonNull View rootView) {
        int i = R.id.iv_change_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.iv_home_back;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = R.id.tabLayout;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, i);
                if (tabLayout != null) {
                    i = R.id.wf_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                    if (frameLayout != null) {
                        return new WfActivityWatchfacesStoreBinding((LinearLayout) rootView, imageView, imageView2, tabLayout, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfActivityWatchfacesStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfActivityWatchfacesStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_activity_watchfaces_store, parent, false);
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
