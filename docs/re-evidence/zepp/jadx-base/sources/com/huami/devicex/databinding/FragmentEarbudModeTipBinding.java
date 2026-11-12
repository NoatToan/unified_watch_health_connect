package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentEarbudModeTipBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Guideline lineEnd;

    @NonNull
    public final Guideline lineStart;

    @NonNull
    public final RelativeLayout restCard;

    @NonNull
    public final ImageView startRest;

    @NonNull
    public final ImageView startTomato;

    @NonNull
    public final View tomatoCardSpilt;

    @NonNull
    public final TextView tomatoCardTitle;

    @NonNull
    public final View xiaoqiCardSpilt;

    @NonNull
    public final TextView xiaoqiCardTitle;

    private FragmentEarbudModeTipBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView, @NonNull View view2, @NonNull TextView textView2) {
        this.a = constraintLayout;
        this.lineEnd = guideline;
        this.lineStart = guideline2;
        this.restCard = relativeLayout;
        this.startRest = imageView;
        this.startTomato = imageView2;
        this.tomatoCardSpilt = view;
        this.tomatoCardTitle = textView;
        this.xiaoqiCardSpilt = view2;
        this.xiaoqiCardTitle = textView2;
    }

    @NonNull
    public static FragmentEarbudModeTipBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.line_end;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.line_start;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline2 != null) {
                i = R.id.rest_card;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.start_rest;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.start_tomato;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.tomato_card_spilt))) != null) {
                            i = R.id.tomato_card_title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.xiaoqi_card_spilt))) != null) {
                                i = R.id.xiaoqi_card_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new FragmentEarbudModeTipBinding((ConstraintLayout) view, guideline, guideline2, relativeLayout, imageView, imageView2, viewFindChildViewById, textView, viewFindChildViewById2, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEarbudModeTipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEarbudModeTipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_earbud_mode_tip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
