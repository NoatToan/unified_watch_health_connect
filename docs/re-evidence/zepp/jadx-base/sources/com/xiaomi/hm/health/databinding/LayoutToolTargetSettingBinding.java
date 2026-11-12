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
public final class LayoutToolTargetSettingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolTargetSetting;

    @NonNull
    public final AppCompatTextView toolTargetSettingHour;

    @NonNull
    public final AppCompatTextView toolTargetSettingHourUnit;

    @NonNull
    public final AppCompatTextView toolTargetSettingKcal;

    @NonNull
    public final ConstraintLayout toolTargetSettingKcalLayout;

    @NonNull
    public final AppCompatImageView toolTargetSettingKcalRight;

    @NonNull
    public final AppCompatTextView toolTargetSettingKcalTitle;

    @NonNull
    public final AppCompatTextView toolTargetSettingKcalUnit;

    @NonNull
    public final AppCompatTextView toolTargetSettingMinute;

    @NonNull
    public final AppCompatTextView toolTargetSettingMinuteUnit;

    @NonNull
    public final ConstraintLayout toolTargetSettingSleepLayout;

    @NonNull
    public final AppCompatImageView toolTargetSettingSleepRight;

    @NonNull
    public final AppCompatTextView toolTargetSettingSleepTitle;

    @NonNull
    public final AppCompatTextView toolTargetSettingStep;

    @NonNull
    public final ConstraintLayout toolTargetSettingStepLayout;

    @NonNull
    public final AppCompatImageView toolTargetSettingStepRight;

    @NonNull
    public final AppCompatTextView toolTargetSettingStepTitle;

    @NonNull
    public final AppCompatTextView toolTargetSettingStepUnit;

    @NonNull
    public final AppCompatTextView toolTargetSettingWeight;

    @NonNull
    public final ConstraintLayout toolTargetSettingWeightLayout;

    @NonNull
    public final AppCompatImageView toolTargetSettingWeightRight;

    @NonNull
    public final AppCompatTextView toolTargetSettingWeightTitle;

    @NonNull
    public final AppCompatTextView toolTargetSettingWeightUnit;

    private LayoutToolTargetSettingBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolTargetSetting, @NonNull AppCompatTextView toolTargetSettingHour, @NonNull AppCompatTextView toolTargetSettingHourUnit, @NonNull AppCompatTextView toolTargetSettingKcal, @NonNull ConstraintLayout toolTargetSettingKcalLayout, @NonNull AppCompatImageView toolTargetSettingKcalRight, @NonNull AppCompatTextView toolTargetSettingKcalTitle, @NonNull AppCompatTextView toolTargetSettingKcalUnit, @NonNull AppCompatTextView toolTargetSettingMinute, @NonNull AppCompatTextView toolTargetSettingMinuteUnit, @NonNull ConstraintLayout toolTargetSettingSleepLayout, @NonNull AppCompatImageView toolTargetSettingSleepRight, @NonNull AppCompatTextView toolTargetSettingSleepTitle, @NonNull AppCompatTextView toolTargetSettingStep, @NonNull ConstraintLayout toolTargetSettingStepLayout, @NonNull AppCompatImageView toolTargetSettingStepRight, @NonNull AppCompatTextView toolTargetSettingStepTitle, @NonNull AppCompatTextView toolTargetSettingStepUnit, @NonNull AppCompatTextView toolTargetSettingWeight, @NonNull ConstraintLayout toolTargetSettingWeightLayout, @NonNull AppCompatImageView toolTargetSettingWeightRight, @NonNull AppCompatTextView toolTargetSettingWeightTitle, @NonNull AppCompatTextView toolTargetSettingWeightUnit) {
        this.a = rootView;
        this.toolTargetSetting = toolTargetSetting;
        this.toolTargetSettingHour = toolTargetSettingHour;
        this.toolTargetSettingHourUnit = toolTargetSettingHourUnit;
        this.toolTargetSettingKcal = toolTargetSettingKcal;
        this.toolTargetSettingKcalLayout = toolTargetSettingKcalLayout;
        this.toolTargetSettingKcalRight = toolTargetSettingKcalRight;
        this.toolTargetSettingKcalTitle = toolTargetSettingKcalTitle;
        this.toolTargetSettingKcalUnit = toolTargetSettingKcalUnit;
        this.toolTargetSettingMinute = toolTargetSettingMinute;
        this.toolTargetSettingMinuteUnit = toolTargetSettingMinuteUnit;
        this.toolTargetSettingSleepLayout = toolTargetSettingSleepLayout;
        this.toolTargetSettingSleepRight = toolTargetSettingSleepRight;
        this.toolTargetSettingSleepTitle = toolTargetSettingSleepTitle;
        this.toolTargetSettingStep = toolTargetSettingStep;
        this.toolTargetSettingStepLayout = toolTargetSettingStepLayout;
        this.toolTargetSettingStepRight = toolTargetSettingStepRight;
        this.toolTargetSettingStepTitle = toolTargetSettingStepTitle;
        this.toolTargetSettingStepUnit = toolTargetSettingStepUnit;
        this.toolTargetSettingWeight = toolTargetSettingWeight;
        this.toolTargetSettingWeightLayout = toolTargetSettingWeightLayout;
        this.toolTargetSettingWeightRight = toolTargetSettingWeightRight;
        this.toolTargetSettingWeightTitle = toolTargetSettingWeightTitle;
        this.toolTargetSettingWeightUnit = toolTargetSettingWeightUnit;
    }

    @NonNull
    public static LayoutToolTargetSettingBinding bind(@NonNull View rootView) {
        int i = R.id.tool_target_setting;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting);
        if (appCompatTextView != null) {
            i = R.id.tool_target_setting_hour;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_hour);
            if (appCompatTextView2 != null) {
                i = R.id.tool_target_setting_hour_unit;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_hour_unit);
                if (appCompatTextView3 != null) {
                    i = R.id.tool_target_setting_kcal;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_kcal);
                    if (appCompatTextView4 != null) {
                        i = R.id.tool_target_setting_kcal_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_kcal_layout);
                        if (constraintLayout != null) {
                            i = R.id.tool_target_setting_kcal_right;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_kcal_right);
                            if (appCompatImageView != null) {
                                i = R.id.tool_target_setting_kcal_title;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_kcal_title);
                                if (appCompatTextView5 != null) {
                                    i = R.id.tool_target_setting_kcal_unit;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_kcal_unit);
                                    if (appCompatTextView6 != null) {
                                        i = R.id.tool_target_setting_minute;
                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_minute);
                                        if (appCompatTextView7 != null) {
                                            i = R.id.tool_target_setting_minute_unit;
                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_minute_unit);
                                            if (appCompatTextView8 != null) {
                                                i = R.id.tool_target_setting_sleep_layout;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_sleep_layout);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.tool_target_setting_sleep_right;
                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_sleep_right);
                                                    if (appCompatImageView2 != null) {
                                                        i = R.id.tool_target_setting_sleep_title;
                                                        AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_sleep_title);
                                                        if (appCompatTextView9 != null) {
                                                            i = R.id.tool_target_setting_step;
                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_step);
                                                            if (appCompatTextView10 != null) {
                                                                i = R.id.tool_target_setting_step_layout;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_step_layout);
                                                                if (constraintLayout3 != null) {
                                                                    i = R.id.tool_target_setting_step_right;
                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_step_right);
                                                                    if (appCompatImageView3 != null) {
                                                                        i = R.id.tool_target_setting_step_title;
                                                                        AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_step_title);
                                                                        if (appCompatTextView11 != null) {
                                                                            i = R.id.tool_target_setting_step_unit;
                                                                            AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_step_unit);
                                                                            if (appCompatTextView12 != null) {
                                                                                i = R.id.tool_target_setting_weight;
                                                                                AppCompatTextView appCompatTextView13 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_weight);
                                                                                if (appCompatTextView13 != null) {
                                                                                    i = R.id.tool_target_setting_weight_layout;
                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_weight_layout);
                                                                                    if (constraintLayout4 != null) {
                                                                                        i = R.id.tool_target_setting_weight_right;
                                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_weight_right);
                                                                                        if (appCompatImageView4 != null) {
                                                                                            i = R.id.tool_target_setting_weight_title;
                                                                                            AppCompatTextView appCompatTextView14 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_weight_title);
                                                                                            if (appCompatTextView14 != null) {
                                                                                                i = R.id.tool_target_setting_weight_unit;
                                                                                                AppCompatTextView appCompatTextView15 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_target_setting_weight_unit);
                                                                                                if (appCompatTextView15 != null) {
                                                                                                    return new LayoutToolTargetSettingBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, constraintLayout, appCompatImageView, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, constraintLayout2, appCompatImageView2, appCompatTextView9, appCompatTextView10, constraintLayout3, appCompatImageView3, appCompatTextView11, appCompatTextView12, appCompatTextView13, constraintLayout4, appCompatImageView4, appCompatTextView14, appCompatTextView15);
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
    public static LayoutToolTargetSettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolTargetSettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_target_setting, parent, false);
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
