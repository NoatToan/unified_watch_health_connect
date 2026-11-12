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
public final class WfItemRankingInnerBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView ivRankImg;

    @NonNull
    public final ImageView ivRankImgShadow;

    @NonNull
    public final RatingBar ratingBar;

    @NonNull
    public final TextView syncApplyBtn;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final TextView tvRankNum;

    private WfItemRankingInnerBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivRankImg, @NonNull ImageView ivRankImgShadow, @NonNull RatingBar ratingBar, @NonNull TextView syncApplyBtn, @NonNull TextView tvName, @NonNull TextView tvRankNum) {
        this.a = rootView;
        this.ivRankImg = ivRankImg;
        this.ivRankImgShadow = ivRankImgShadow;
        this.ratingBar = ratingBar;
        this.syncApplyBtn = syncApplyBtn;
        this.tvName = tvName;
        this.tvRankNum = tvRankNum;
    }

    @NonNull
    public static WfItemRankingInnerBinding bind(@NonNull View rootView) {
        int i = R.id.iv_rank_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.iv_rank_img_shadow;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = R.id.rating_bar;
                RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(rootView, i);
                if (ratingBar != null) {
                    i = R.id.sync_apply_btn;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = R.id.tv_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = R.id.tv_rank_num;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                return new WfItemRankingInnerBinding((ConstraintLayout) rootView, imageView, imageView2, ratingBar, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfItemRankingInnerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemRankingInnerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_ranking_inner, parent, false);
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
