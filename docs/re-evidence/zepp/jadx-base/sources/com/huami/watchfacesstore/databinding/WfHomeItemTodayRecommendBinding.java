package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHomeItemTodayRecommendBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ShapeableImageView bgIv;

    @NonNull
    public final TextView feeBtn;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final ConstraintLayout infoLayout;

    @NonNull
    public final TextView recommendTitleTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final TextView watchAuthorTv;

    @NonNull
    public final AppCompatImageView watchIv;

    @NonNull
    public final TextView watchNameTv;

    private WfHomeItemTodayRecommendBinding(@NonNull ConstraintLayout rootView, @NonNull ShapeableImageView bgIv, @NonNull TextView feeBtn, @NonNull Guideline guideline, @NonNull ConstraintLayout infoLayout, @NonNull TextView recommendTitleTv, @NonNull TextView titleTv, @NonNull TextView watchAuthorTv, @NonNull AppCompatImageView watchIv, @NonNull TextView watchNameTv) {
        this.a = rootView;
        this.bgIv = bgIv;
        this.feeBtn = feeBtn;
        this.guideline = guideline;
        this.infoLayout = infoLayout;
        this.recommendTitleTv = recommendTitleTv;
        this.titleTv = titleTv;
        this.watchAuthorTv = watchAuthorTv;
        this.watchIv = watchIv;
        this.watchNameTv = watchNameTv;
    }

    @NonNull
    public static WfHomeItemTodayRecommendBinding bind(@NonNull View rootView) {
        int i = R.id.bgIv;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(rootView, i);
        if (shapeableImageView != null) {
            i = R.id.feeBtn;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, i);
                if (guideline != null) {
                    i = R.id.infoLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                    if (constraintLayout != null) {
                        i = R.id.recommendTitleTv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = R.id.titleTv;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = R.id.watchAuthorTv;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView4 != null) {
                                    i = R.id.watchIv;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (appCompatImageView != null) {
                                        i = R.id.watchNameTv;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView5 != null) {
                                            return new WfHomeItemTodayRecommendBinding((ConstraintLayout) rootView, shapeableImageView, textView, guideline, constraintLayout, textView2, textView3, textView4, appCompatImageView, textView5);
                                        }
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
    public static WfHomeItemTodayRecommendBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfHomeItemTodayRecommendBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_home_item_today_recommend, parent, false);
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
