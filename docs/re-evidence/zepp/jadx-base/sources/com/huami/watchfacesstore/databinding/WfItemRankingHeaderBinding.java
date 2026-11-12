package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class WfItemRankingHeaderBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout flImage;

    @NonNull
    public final ImageView ivRankBg;

    @NonNull
    public final ImageView ivWatchFace;

    @NonNull
    public final ImageView ivWatchFaceBg;

    @NonNull
    public final RatingBar ratingBar;

    @NonNull
    public final TextView tvDetail;

    @NonNull
    public final TextView tvWatchName;

    private WfItemRankingHeaderBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout flImage, @NonNull ImageView ivRankBg, @NonNull ImageView ivWatchFace, @NonNull ImageView ivWatchFaceBg, @NonNull RatingBar ratingBar, @NonNull TextView tvDetail, @NonNull TextView tvWatchName) {
        this.a = rootView;
        this.flImage = flImage;
        this.ivRankBg = ivRankBg;
        this.ivWatchFace = ivWatchFace;
        this.ivWatchFaceBg = ivWatchFaceBg;
        this.ratingBar = ratingBar;
        this.tvDetail = tvDetail;
        this.tvWatchName = tvWatchName;
    }

    @NonNull
    public static WfItemRankingHeaderBinding bind(@NonNull View rootView) {
        int i = R.id.fl_image;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.iv_rank_bg;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.iv_watch_face;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = R.id.iv_watch_face_bg;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = R.id.rating_bar;
                        RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(rootView, i);
                        if (ratingBar != null) {
                            i = R.id.tv_detail;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView != null) {
                                i = R.id.tv_watch_name;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    return new WfItemRankingHeaderBinding((ConstraintLayout) rootView, frameLayout, imageView, imageView2, imageView3, ratingBar, textView, textView2);
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
    public static WfItemRankingHeaderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemRankingHeaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_ranking_header, parent, false);
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
