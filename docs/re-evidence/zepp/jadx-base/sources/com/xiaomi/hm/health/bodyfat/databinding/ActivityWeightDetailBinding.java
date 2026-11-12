package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.text.TextViewDrawable;
import com.huami.lib.view.text.UnitTextView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.WeightLoadingStatus;
import com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWeightDetailBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final LinearLayout bmiLl;

    @NonNull
    public final TypefaceTextView bmiValueTv;

    @NonNull
    public final TypefaceTextView bmiValueTvShape;

    @NonNull
    public final LayoutWeightDetailBottomBinding bottomLayout;

    @NonNull
    public final RelativeLayout chartContainer;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final View divider;

    @NonNull
    public final ImageView ivBmiArrow;

    @NonNull
    public final View lineSplit1;

    @NonNull
    public final WeightLoadingStatus loadingStatus;

    @NonNull
    public final RelativeLayout noBmiLl;

    @NonNull
    public final TextView noBmiTv;

    @NonNull
    public final TypefaceTextView unitTV;

    @NonNull
    public final WeightUserQuickPicker userPicker;

    @NonNull
    public final RelativeLayout userPickerLl;

    @NonNull
    public final LinearLayout weightBodyTypeLl;

    @NonNull
    public final TextViewDrawable weightChangeLastDate;

    @NonNull
    public final UnitTextView weightChangeLastUv;

    @NonNull
    public final TextViewDrawable weightChangeMonNavDate;

    @NonNull
    public final UnitTextView weightChangeMonUv;

    @NonNull
    public final TypefaceTextView weightChangeTitle;

    @NonNull
    public final LayoutWeightDetailCompareBinding weightCompareLl;

    @NonNull
    public final LinearLayout weightNaviRl;

    @NonNull
    public final RelativeLayout weightRl;

    @NonNull
    public final LinearLayout weightValueLlPicker;

    @NonNull
    public final TypefaceTextView weightValueTv;

    private ActivityWeightDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull LayoutWeightDetailBottomBinding layoutWeightDetailBottomBinding, @NonNull RelativeLayout relativeLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull View view2, @NonNull WeightLoadingStatus weightLoadingStatus, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TypefaceTextView typefaceTextView3, @NonNull WeightUserQuickPicker weightUserQuickPicker, @NonNull RelativeLayout relativeLayout4, @NonNull LinearLayout linearLayout2, @NonNull TextViewDrawable textViewDrawable, @NonNull UnitTextView unitTextView, @NonNull TextViewDrawable textViewDrawable2, @NonNull UnitTextView unitTextView2, @NonNull TypefaceTextView typefaceTextView4, @NonNull LayoutWeightDetailCompareBinding layoutWeightDetailCompareBinding, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout5, @NonNull LinearLayout linearLayout4, @NonNull TypefaceTextView typefaceTextView5) {
        this.a = relativeLayout;
        this.bmiLl = linearLayout;
        this.bmiValueTv = typefaceTextView;
        this.bmiValueTvShape = typefaceTextView2;
        this.bottomLayout = layoutWeightDetailBottomBinding;
        this.chartContainer = relativeLayout2;
        this.constraintLayout = constraintLayout;
        this.divider = view;
        this.ivBmiArrow = imageView;
        this.lineSplit1 = view2;
        this.loadingStatus = weightLoadingStatus;
        this.noBmiLl = relativeLayout3;
        this.noBmiTv = textView;
        this.unitTV = typefaceTextView3;
        this.userPicker = weightUserQuickPicker;
        this.userPickerLl = relativeLayout4;
        this.weightBodyTypeLl = linearLayout2;
        this.weightChangeLastDate = textViewDrawable;
        this.weightChangeLastUv = unitTextView;
        this.weightChangeMonNavDate = textViewDrawable2;
        this.weightChangeMonUv = unitTextView2;
        this.weightChangeTitle = typefaceTextView4;
        this.weightCompareLl = layoutWeightDetailCompareBinding;
        this.weightNaviRl = linearLayout3;
        this.weightRl = relativeLayout5;
        this.weightValueLlPicker = linearLayout4;
        this.weightValueTv = typefaceTextView5;
    }

    @NonNull
    public static ActivityWeightDetailBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i = R.id.bmi_ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.bmi_value_tv;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.bmi_value_tv_shape;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bottom_layout))) != null) {
                    LayoutWeightDetailBottomBinding layoutWeightDetailBottomBindingBind = LayoutWeightDetailBottomBinding.bind(viewFindChildViewById);
                    i = R.id.chart_container;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.constraint_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
                            i = R.id.iv_bmi_arrow;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.line_split1))) != null) {
                                i = R.id.loading_status;
                                WeightLoadingStatus weightLoadingStatus = (WeightLoadingStatus) ViewBindings.findChildViewById(view, i);
                                if (weightLoadingStatus != null) {
                                    i = R.id.no_bmi_ll;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout2 != null) {
                                        i = R.id.no_bmi_tv;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = R.id.unitTV;
                                            TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                            if (typefaceTextView3 != null) {
                                                i = R.id.user_picker;
                                                WeightUserQuickPicker weightUserQuickPicker = (WeightUserQuickPicker) ViewBindings.findChildViewById(view, i);
                                                if (weightUserQuickPicker != null) {
                                                    i = R.id.user_picker_ll;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                    if (relativeLayout3 != null) {
                                                        i = R.id.weight_body_type_ll;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.weight_change_last_date;
                                                            TextViewDrawable textViewDrawable = (TextViewDrawable) ViewBindings.findChildViewById(view, i);
                                                            if (textViewDrawable != null) {
                                                                i = R.id.weight_change_last_uv;
                                                                UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(view, i);
                                                                if (unitTextView != null) {
                                                                    i = R.id.weight_change_mon_nav_date;
                                                                    TextViewDrawable textViewDrawable2 = (TextViewDrawable) ViewBindings.findChildViewById(view, i);
                                                                    if (textViewDrawable2 != null) {
                                                                        i = R.id.weight_change_mon_uv;
                                                                        UnitTextView unitTextView2 = (UnitTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (unitTextView2 != null) {
                                                                            i = R.id.weight_change_title;
                                                                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (typefaceTextView4 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.weight_compare_ll))) != null) {
                                                                                LayoutWeightDetailCompareBinding layoutWeightDetailCompareBindingBind = LayoutWeightDetailCompareBinding.bind(viewFindChildViewById4);
                                                                                i = R.id.weight_navi_rl;
                                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (linearLayout3 != null) {
                                                                                    i = R.id.weight_rl;
                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (relativeLayout4 != null) {
                                                                                        i = R.id.weight_value_ll_picker;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (linearLayout4 != null) {
                                                                                            i = R.id.weight_value_tv;
                                                                                            TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (typefaceTextView5 != null) {
                                                                                                return new ActivityWeightDetailBinding((RelativeLayout) view, linearLayout, typefaceTextView, typefaceTextView2, layoutWeightDetailBottomBindingBind, relativeLayout, constraintLayout, viewFindChildViewById2, imageView, viewFindChildViewById3, weightLoadingStatus, relativeLayout2, textView, typefaceTextView3, weightUserQuickPicker, relativeLayout3, linearLayout2, textViewDrawable, unitTextView, textViewDrawable2, unitTextView2, typefaceTextView4, layoutWeightDetailCompareBindingBind, linearLayout3, relativeLayout4, linearLayout4, typefaceTextView5);
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
    public static ActivityWeightDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWeightDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_weight_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
