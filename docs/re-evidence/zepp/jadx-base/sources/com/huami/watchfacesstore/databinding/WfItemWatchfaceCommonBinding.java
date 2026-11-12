package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfItemWatchfaceCommonBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView price;

    @NonNull
    public final RatingBar ratingBar;

    @NonNull
    public final ImageView thumbnailImg;

    @NonNull
    public final ImageView thumbnailImgShadow;

    @NonNull
    public final TextView tvNewName;

    @NonNull
    public final TextView tvUpdate;

    private WfItemWatchfaceCommonBinding(@NonNull ConstraintLayout rootView, @NonNull TextView price, @NonNull RatingBar ratingBar, @NonNull ImageView thumbnailImg, @NonNull ImageView thumbnailImgShadow, @NonNull TextView tvNewName, @NonNull TextView tvUpdate) {
        this.a = rootView;
        this.price = price;
        this.ratingBar = ratingBar;
        this.thumbnailImg = thumbnailImg;
        this.thumbnailImgShadow = thumbnailImgShadow;
        this.tvNewName = tvNewName;
        this.tvUpdate = tvUpdate;
    }

    @NonNull
    public static WfItemWatchfaceCommonBinding bind(@NonNull View rootView) {
        int i = R.id.price;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.rating_bar;
            RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(rootView, i);
            if (ratingBar != null) {
                i = R.id.thumbnail_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = R.id.thumbnail_img_shadow;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = R.id.tv_new_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = R.id.tv_update;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                return new WfItemWatchfaceCommonBinding((ConstraintLayout) rootView, textView, ratingBar, imageView, imageView2, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfItemWatchfaceCommonBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemWatchfaceCommonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_watchface_common, parent, false);
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
