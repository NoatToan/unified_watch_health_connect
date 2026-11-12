package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfItemMoreColorSelectorBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ImageView selectedImg;

    private WfItemMoreColorSelectorBinding(@NonNull FrameLayout rootView, @NonNull ImageView selectedImg) {
        this.a = rootView;
        this.selectedImg = selectedImg;
    }

    @NonNull
    public static WfItemMoreColorSelectorBinding bind(@NonNull View rootView) {
        int i = R.id.selected_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            return new WfItemMoreColorSelectorBinding((FrameLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfItemMoreColorSelectorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemMoreColorSelectorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_more_color_selector, parent, false);
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
