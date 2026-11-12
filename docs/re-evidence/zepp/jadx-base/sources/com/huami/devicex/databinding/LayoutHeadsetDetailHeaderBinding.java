package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutHeadsetDetailHeaderBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout clHeadsetContainer;

    @NonNull
    public final AppCompatImageView ivBox;

    @NonNull
    public final AppCompatImageView ivBoxCharge;

    @NonNull
    public final AppCompatImageView ivHeadset;

    @NonNull
    public final AppCompatImageView ivLeft;

    @NonNull
    public final AppCompatImageView ivLeftCharge;

    @NonNull
    public final AppCompatImageView ivRight;

    @NonNull
    public final AppCompatImageView ivRightCharge;

    @NonNull
    public final TypefaceTextView tvBoxBattery;

    @NonNull
    public final TypefaceTextView tvBoxBatteryPercent;

    @NonNull
    public final TypefaceTextView tvLeftBattery;

    @NonNull
    public final TypefaceTextView tvLeftBatteryPercent;

    @NonNull
    public final TypefaceTextView tvRightBattery;

    @NonNull
    public final TypefaceTextView tvRightBatteryPercent;

    private LayoutHeadsetDetailHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatImageView appCompatImageView5, @NonNull AppCompatImageView appCompatImageView6, @NonNull AppCompatImageView appCompatImageView7, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TypefaceTextView typefaceTextView4, @NonNull TypefaceTextView typefaceTextView5, @NonNull TypefaceTextView typefaceTextView6) {
        this.a = constraintLayout;
        this.clHeadsetContainer = constraintLayout2;
        this.ivBox = appCompatImageView;
        this.ivBoxCharge = appCompatImageView2;
        this.ivHeadset = appCompatImageView3;
        this.ivLeft = appCompatImageView4;
        this.ivLeftCharge = appCompatImageView5;
        this.ivRight = appCompatImageView6;
        this.ivRightCharge = appCompatImageView7;
        this.tvBoxBattery = typefaceTextView;
        this.tvBoxBatteryPercent = typefaceTextView2;
        this.tvLeftBattery = typefaceTextView3;
        this.tvLeftBatteryPercent = typefaceTextView4;
        this.tvRightBattery = typefaceTextView5;
        this.tvRightBatteryPercent = typefaceTextView6;
    }

    @NonNull
    public static LayoutHeadsetDetailHeaderBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.iv_box;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.iv_box_charge;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = R.id.iv_headset;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = R.id.iv_left;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView4 != null) {
                        i = R.id.iv_left_charge;
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView5 != null) {
                            i = R.id.iv_right;
                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView6 != null) {
                                i = R.id.iv_right_charge;
                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView7 != null) {
                                    i = R.id.tv_box_battery;
                                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                    if (typefaceTextView != null) {
                                        i = R.id.tv_box_battery_percent;
                                        TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                        if (typefaceTextView2 != null) {
                                            i = R.id.tv_left_battery;
                                            TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                            if (typefaceTextView3 != null) {
                                                i = R.id.tv_left_battery_percent;
                                                TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                if (typefaceTextView4 != null) {
                                                    i = R.id.tv_right_battery;
                                                    TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                    if (typefaceTextView5 != null) {
                                                        i = R.id.tv_right_battery_percent;
                                                        TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                        if (typefaceTextView6 != null) {
                                                            return new LayoutHeadsetDetailHeaderBinding(constraintLayout, constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4, typefaceTextView5, typefaceTextView6);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static LayoutHeadsetDetailHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutHeadsetDetailHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_headset_detail_header, viewGroup, false);
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
