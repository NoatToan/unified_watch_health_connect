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
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutSingleSelectBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView arrowImg;

    @NonNull
    public final AppCompatImageView deleteImg;

    @NonNull
    public final View divider;

    @NonNull
    public final TextView titleTv;

    private LayoutSingleSelectBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView arrowImg, @NonNull AppCompatImageView deleteImg, @NonNull View divider, @NonNull TextView titleTv) {
        this.a = rootView;
        this.arrowImg = arrowImg;
        this.deleteImg = deleteImg;
        this.divider = divider;
        this.titleTv = titleTv;
    }

    @NonNull
    public static LayoutSingleSelectBinding bind(@NonNull View rootView) {
        int i = R.id.arrow_img;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.arrow_img);
        if (appCompatImageView != null) {
            i = R.id.delete_img;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.delete_img);
            if (appCompatImageView2 != null) {
                i = R.id.divider;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                if (viewFindChildViewById != null) {
                    i = R.id.title_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                    if (textView != null) {
                        return new LayoutSingleSelectBinding((ConstraintLayout) rootView, appCompatImageView, appCompatImageView2, viewFindChildViewById, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutSingleSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutSingleSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_single_select, parent, false);
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
