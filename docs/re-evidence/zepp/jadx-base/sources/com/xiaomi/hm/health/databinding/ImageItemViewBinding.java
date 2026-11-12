package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ImageItemViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView imageItemDot;

    @NonNull
    public final ShapeableImageView imageItemIv;

    @NonNull
    public final TextView imageItemName;

    private ImageItemViewBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView imageItemDot, @NonNull ShapeableImageView imageItemIv, @NonNull TextView imageItemName) {
        this.a = rootView;
        this.imageItemDot = imageItemDot;
        this.imageItemIv = imageItemIv;
        this.imageItemName = imageItemName;
    }

    @NonNull
    public static ImageItemViewBinding bind(@NonNull View rootView) {
        int i = R.id.image_item_dot;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.image_item_dot);
        if (appCompatImageView != null) {
            i = R.id.image_item_iv;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(rootView, R.id.image_item_iv);
            if (shapeableImageView != null) {
                i = R.id.image_item_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.image_item_name);
                if (textView != null) {
                    return new ImageItemViewBinding((ConstraintLayout) rootView, appCompatImageView, shapeableImageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ImageItemViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ImageItemViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.image_item_view, parent, false);
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
