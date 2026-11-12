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
public final class WfItemNewWatchfaceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView price;

    @NonNull
    public final RatingBar ratingBar;

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

    @NonNull
    public final TextView tvNewName;

    @NonNull
    public final TextView tvUpdate;

    private WfItemNewWatchfaceBinding(@NonNull ConstraintLayout rootView, @NonNull TextView price, @NonNull RatingBar ratingBar, @NonNull View selectedBg, @NonNull ImageView selectedImg, @NonNull ImageView thumbnailImg, @NonNull ImageView thumbnailImgShadow, @NonNull ImageView transparentImg, @NonNull TextView tvNewName, @NonNull TextView tvUpdate) {
        this.a = rootView;
        this.price = price;
        this.ratingBar = ratingBar;
        this.selectedBg = selectedBg;
        this.selectedImg = selectedImg;
        this.thumbnailImg = thumbnailImg;
        this.thumbnailImgShadow = thumbnailImgShadow;
        this.transparentImg = transparentImg;
        this.tvNewName = tvNewName;
        this.tvUpdate = tvUpdate;
    }

    @NonNull
    public static WfItemNewWatchfaceBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.price;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.rating_bar;
            RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(rootView, i);
            if (ratingBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.selected_bg))) != null) {
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
                                i = R.id.tv_new_name;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = R.id.tv_update;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView3 != null) {
                                        return new WfItemNewWatchfaceBinding((ConstraintLayout) rootView, textView, ratingBar, viewFindChildViewById, imageView, imageView2, imageView3, imageView4, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfItemNewWatchfaceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemNewWatchfaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_new_watchface, parent, false);
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
