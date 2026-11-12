package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfItemInternalWatchFaceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View selectedBg;

    @NonNull
    public final ImageView selectedImg;

    @NonNull
    public final ImageView thumbnailImg;

    @NonNull
    public final ImageView thumbnailImgShadow;

    @NonNull
    public final ImageView transparentImg;

    private WfItemInternalWatchFaceBinding(@NonNull ConstraintLayout rootView, @NonNull View selectedBg, @NonNull ImageView selectedImg, @NonNull ImageView thumbnailImg, @NonNull ImageView thumbnailImgShadow, @NonNull ImageView transparentImg) {
        this.a = rootView;
        this.selectedBg = selectedBg;
        this.selectedImg = selectedImg;
        this.thumbnailImg = thumbnailImg;
        this.thumbnailImgShadow = thumbnailImgShadow;
        this.transparentImg = transparentImg;
    }

    @NonNull
    public static WfItemInternalWatchFaceBinding bind(@NonNull View rootView) {
        int i = R.id.selected_bg;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = R.id.selected_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.thumbnail_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = R.id.thumbnail_img_shadow;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = R.id.transparent_img;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                        if (imageView4 != null) {
                            return new WfItemInternalWatchFaceBinding((ConstraintLayout) rootView, viewFindChildViewById, imageView, imageView2, imageView3, imageView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfItemInternalWatchFaceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemInternalWatchFaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_internal_watch_face, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
