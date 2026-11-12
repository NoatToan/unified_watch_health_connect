package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHomeItemCoolSpecialImgBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ShapeableImageView img;

    @NonNull
    public final View placeHolder;

    private WfHomeItemCoolSpecialImgBinding(@NonNull LinearLayout rootView, @NonNull ShapeableImageView img, @NonNull View placeHolder) {
        this.a = rootView;
        this.img = img;
        this.placeHolder = placeHolder;
    }

    @NonNull
    public static WfHomeItemCoolSpecialImgBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.img;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(rootView, i);
        if (shapeableImageView == null || (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.placeHolder))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
        }
        return new WfHomeItemCoolSpecialImgBinding((LinearLayout) rootView, shapeableImageView, viewFindChildViewById);
    }

    @NonNull
    public static WfHomeItemCoolSpecialImgBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfHomeItemCoolSpecialImgBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_home_item_cool_special_img, parent, false);
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
