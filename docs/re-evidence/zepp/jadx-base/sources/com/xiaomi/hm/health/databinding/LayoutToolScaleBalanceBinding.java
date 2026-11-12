package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolScaleBalanceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolScaleBalance;

    @NonNull
    public final AppCompatTextView toolScaleBalanceCheck;

    @NonNull
    public final AppCompatTextView toolScaleBalanceGrade;

    @NonNull
    public final AppCompatTextView toolScaleBalanceGradeTitle;

    @NonNull
    public final AppCompatImageView toolScaleBalanceImage;

    @NonNull
    public final ConstraintLayout toolScaleBalanceLayout;

    @NonNull
    public final AppCompatTextView toolScaleBalanceNotCheck;

    @NonNull
    public final AppCompatTextView toolScaleBalanceTime;

    @NonNull
    public final AppCompatTextView toolScaleBalanceTimeUnit;

    @NonNull
    public final AppCompatTextView toolScaleDeviceStatus;

    private LayoutToolScaleBalanceBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolScaleBalance, @NonNull AppCompatTextView toolScaleBalanceCheck, @NonNull AppCompatTextView toolScaleBalanceGrade, @NonNull AppCompatTextView toolScaleBalanceGradeTitle, @NonNull AppCompatImageView toolScaleBalanceImage, @NonNull ConstraintLayout toolScaleBalanceLayout, @NonNull AppCompatTextView toolScaleBalanceNotCheck, @NonNull AppCompatTextView toolScaleBalanceTime, @NonNull AppCompatTextView toolScaleBalanceTimeUnit, @NonNull AppCompatTextView toolScaleDeviceStatus) {
        this.a = rootView;
        this.toolScaleBalance = toolScaleBalance;
        this.toolScaleBalanceCheck = toolScaleBalanceCheck;
        this.toolScaleBalanceGrade = toolScaleBalanceGrade;
        this.toolScaleBalanceGradeTitle = toolScaleBalanceGradeTitle;
        this.toolScaleBalanceImage = toolScaleBalanceImage;
        this.toolScaleBalanceLayout = toolScaleBalanceLayout;
        this.toolScaleBalanceNotCheck = toolScaleBalanceNotCheck;
        this.toolScaleBalanceTime = toolScaleBalanceTime;
        this.toolScaleBalanceTimeUnit = toolScaleBalanceTimeUnit;
        this.toolScaleDeviceStatus = toolScaleDeviceStatus;
    }

    @NonNull
    public static LayoutToolScaleBalanceBinding bind(@NonNull View rootView) {
        int i = R.id.tool_scale_balance;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance);
        if (appCompatTextView != null) {
            i = R.id.tool_scale_balance_check;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance_check);
            if (appCompatTextView2 != null) {
                i = R.id.tool_scale_balance_grade;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance_grade);
                if (appCompatTextView3 != null) {
                    i = R.id.tool_scale_balance_grade_title;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance_grade_title);
                    if (appCompatTextView4 != null) {
                        i = R.id.tool_scale_balance_image;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance_image);
                        if (appCompatImageView != null) {
                            i = R.id.tool_scale_balance_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance_layout);
                            if (constraintLayout != null) {
                                i = R.id.tool_scale_balance_not_check;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance_not_check);
                                if (appCompatTextView5 != null) {
                                    i = R.id.tool_scale_balance_time;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance_time);
                                    if (appCompatTextView6 != null) {
                                        i = R.id.tool_scale_balance_time_unit;
                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_balance_time_unit);
                                        if (appCompatTextView7 != null) {
                                            i = R.id.tool_scale_device_status;
                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_scale_device_status);
                                            if (appCompatTextView8 != null) {
                                                return new LayoutToolScaleBalanceBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatImageView, constraintLayout, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolScaleBalanceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolScaleBalanceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_scale_balance, parent, false);
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
