package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityBloodPressureIntroBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ConstraintLayout containerBp;

    @NonNull
    public final ConstraintLayout containerForbit;

    @NonNull
    public final TitlebarBloodPressureBinding containerTitlebar;

    @NonNull
    public final ConstraintLayout containerUse;

    @NonNull
    public final ConstraintLayout containerWatchout;

    @NonNull
    public final ConstraintLayout flexForbitDesc;

    @NonNull
    public final FlexboxLayout flexForbitIc;

    @NonNull
    public final ConstraintLayout flexWatchoutDesc;

    @NonNull
    public final ImageView icBp;

    @NonNull
    public final ImageView ivUse;

    @NonNull
    public final TextView tvBpDesc;

    @NonNull
    public final TextView tvBpTitle;

    @NonNull
    public final TextView tvForbitItem1;

    @NonNull
    public final TextView tvForbitItem2;

    @NonNull
    public final TextView tvForbitItem3;

    @NonNull
    public final TextView tvForbitItem4;

    @NonNull
    public final TextView tvForbitItem5;

    @NonNull
    public final TextView tvForbitTitle;

    @NonNull
    public final TextView tvUseDesc;

    @NonNull
    public final TextView tvUseTitle;

    @NonNull
    public final TextView tvWatchoutItem1;

    @NonNull
    public final TextView tvWatchoutItem2;

    @NonNull
    public final TextView tvWatchoutItem3;

    @NonNull
    public final TextView tvWatchoutItem4;

    @NonNull
    public final TextView tvWatchoutItem5;

    @NonNull
    public final TextView tvWatchoutItem6;

    @NonNull
    public final TextView tvWatchoutTitle;

    private ActivityBloodPressureIntroBinding(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TitlebarBloodPressureBinding titlebarBloodPressureBinding, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ConstraintLayout constraintLayout5, @NonNull FlexboxLayout flexboxLayout, @NonNull ConstraintLayout constraintLayout6, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17) {
        this.a = linearLayout;
        this.containerBp = constraintLayout;
        this.containerForbit = constraintLayout2;
        this.containerTitlebar = titlebarBloodPressureBinding;
        this.containerUse = constraintLayout3;
        this.containerWatchout = constraintLayout4;
        this.flexForbitDesc = constraintLayout5;
        this.flexForbitIc = flexboxLayout;
        this.flexWatchoutDesc = constraintLayout6;
        this.icBp = imageView;
        this.ivUse = imageView2;
        this.tvBpDesc = textView;
        this.tvBpTitle = textView2;
        this.tvForbitItem1 = textView3;
        this.tvForbitItem2 = textView4;
        this.tvForbitItem3 = textView5;
        this.tvForbitItem4 = textView6;
        this.tvForbitItem5 = textView7;
        this.tvForbitTitle = textView8;
        this.tvUseDesc = textView9;
        this.tvUseTitle = textView10;
        this.tvWatchoutItem1 = textView11;
        this.tvWatchoutItem2 = textView12;
        this.tvWatchoutItem3 = textView13;
        this.tvWatchoutItem4 = textView14;
        this.tvWatchoutItem5 = textView15;
        this.tvWatchoutItem6 = textView16;
        this.tvWatchoutTitle = textView17;
    }

    @NonNull
    public static ActivityBloodPressureIntroBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.container_bp;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.container_forbit;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.container_titlebar))) != null) {
                TitlebarBloodPressureBinding titlebarBloodPressureBindingBind = TitlebarBloodPressureBinding.bind(viewFindChildViewById);
                i = R.id.container_use;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout3 != null) {
                    i = R.id.container_watchout;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout4 != null) {
                        i = R.id.flex_forbit_desc;
                        ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout5 != null) {
                            i = R.id.flex_forbit_ic;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                            if (flexboxLayout != null) {
                                i = R.id.flex_watchout_desc;
                                ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout6 != null) {
                                    i = R.id.ic_bp;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.iv_use;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.tv_bp_desc;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = R.id.tv_bp_title;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.tv_forbit_item1;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_forbit_item2;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = R.id.tv_forbit_item3;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                i = R.id.tv_forbit_item4;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView6 != null) {
                                                                    i = R.id.tv_forbit_item5;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView7 != null) {
                                                                        i = R.id.tv_forbit_title;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView8 != null) {
                                                                            i = R.id.tv_use_desc;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView9 != null) {
                                                                                i = R.id.tv_use_title;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView10 != null) {
                                                                                    i = R.id.tv_watchout_item1;
                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView11 != null) {
                                                                                        i = R.id.tv_watchout_item2;
                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView12 != null) {
                                                                                            i = R.id.tv_watchout_item3;
                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView13 != null) {
                                                                                                i = R.id.tv_watchout_item4;
                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView14 != null) {
                                                                                                    i = R.id.tv_watchout_item5;
                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView15 != null) {
                                                                                                        i = R.id.tv_watchout_item6;
                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView16 != null) {
                                                                                                            i = R.id.tv_watchout_title;
                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView17 != null) {
                                                                                                                return new ActivityBloodPressureIntroBinding((LinearLayout) view, constraintLayout, constraintLayout2, titlebarBloodPressureBindingBind, constraintLayout3, constraintLayout4, constraintLayout5, flexboxLayout, constraintLayout6, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBloodPressureIntroBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBloodPressureIntroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_blood_pressure_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
