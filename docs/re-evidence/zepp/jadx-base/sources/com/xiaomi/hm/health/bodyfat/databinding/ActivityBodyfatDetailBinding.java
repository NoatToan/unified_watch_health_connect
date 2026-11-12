package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.text.UnitTextView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.SlidingConflictScrollView;
import com.xiaomi.hm.health.bodyfat.view.WeightLoadingStatus;
import com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBodyfatDetailBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout bfEmptyRl;

    @NonNull
    public final TextView bfEmptyTv;

    @NonNull
    public final ImageView bodyFatCharAdView;

    @NonNull
    public final RelativeLayout bodyFatRl;

    @NonNull
    public final FrameLayout bodyIndexContainer;

    @NonNull
    public final FrameLayout bodyfatChangeContainer;

    @NonNull
    public final ConstraintLayout bodyfatContent;

    @NonNull
    public final RelativeLayout bodyfatHeader;

    @NonNull
    public final LayoutWeightDetailBottomBinding bottomLayout;

    @NonNull
    public final ImageView chartBgView;

    @NonNull
    public final RelativeLayout chartContainer;

    @NonNull
    public final View divider;

    @NonNull
    public final View divider1;

    @NonNull
    public final FrameLayout hrPressureContainer;

    @NonNull
    public final TypefaceTextView jpBodyFatHintText;

    @NonNull
    public final LinearLayout layoutBodyParamsAllId;

    @NonNull
    public final WeightLoadingStatus loadingStatus;

    @NonNull
    public final TypefaceTextView midDataTv;

    @NonNull
    public final FrameLayout muscleChangeContainer;

    @NonNull
    public final TypefaceTextView scoreDesc;

    @NonNull
    public final UnitTextView scoreValueTv;

    @NonNull
    public final SlidingConflictScrollView scrollViewBodyfat;

    @NonNull
    public final WeightUserQuickPicker userPicker;

    @NonNull
    public final RelativeLayout userPickerLl;

    @NonNull
    public final View viewAlpha;

    @NonNull
    public final FrameLayout weightChangeContainer;

    private ActivityBodyfatDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout3, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull RelativeLayout relativeLayout4, @NonNull LayoutWeightDetailBottomBinding layoutWeightDetailBottomBinding, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout5, @NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout3, @NonNull TypefaceTextView typefaceTextView, @NonNull LinearLayout linearLayout, @NonNull WeightLoadingStatus weightLoadingStatus, @NonNull TypefaceTextView typefaceTextView2, @NonNull FrameLayout frameLayout4, @NonNull TypefaceTextView typefaceTextView3, @NonNull UnitTextView unitTextView, @NonNull SlidingConflictScrollView slidingConflictScrollView, @NonNull WeightUserQuickPicker weightUserQuickPicker, @NonNull RelativeLayout relativeLayout6, @NonNull View view3, @NonNull FrameLayout frameLayout5) {
        this.a = relativeLayout;
        this.bfEmptyRl = relativeLayout2;
        this.bfEmptyTv = textView;
        this.bodyFatCharAdView = imageView;
        this.bodyFatRl = relativeLayout3;
        this.bodyIndexContainer = frameLayout;
        this.bodyfatChangeContainer = frameLayout2;
        this.bodyfatContent = constraintLayout;
        this.bodyfatHeader = relativeLayout4;
        this.bottomLayout = layoutWeightDetailBottomBinding;
        this.chartBgView = imageView2;
        this.chartContainer = relativeLayout5;
        this.divider = view;
        this.divider1 = view2;
        this.hrPressureContainer = frameLayout3;
        this.jpBodyFatHintText = typefaceTextView;
        this.layoutBodyParamsAllId = linearLayout;
        this.loadingStatus = weightLoadingStatus;
        this.midDataTv = typefaceTextView2;
        this.muscleChangeContainer = frameLayout4;
        this.scoreDesc = typefaceTextView3;
        this.scoreValueTv = unitTextView;
        this.scrollViewBodyfat = slidingConflictScrollView;
        this.userPicker = weightUserQuickPicker;
        this.userPickerLl = relativeLayout6;
        this.viewAlpha = view3;
        this.weightChangeContainer = frameLayout5;
    }

    @NonNull
    public static ActivityBodyfatDetailBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i = R.id.bf_empty_rl;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.bf_empty_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.body_fat_char_ad_view;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.body_fat_rl;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        i = R.id.body_index_container;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.bodyfat_change_container;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                i = R.id.bodyfat_content;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = R.id.bodyfat_header;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bottom_layout))) != null) {
                                        LayoutWeightDetailBottomBinding layoutWeightDetailBottomBindingBind = LayoutWeightDetailBottomBinding.bind(viewFindChildViewById);
                                        i = R.id.chart_bg_view;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.chart_container;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.divider1))) != null) {
                                                i = R.id.hr_pressure_container;
                                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                if (frameLayout3 != null) {
                                                    i = R.id.jp_body_fat_hint_text;
                                                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                    if (typefaceTextView != null) {
                                                        i = R.id.layout_body_params_all_id;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout != null) {
                                                            i = R.id.loading_status;
                                                            WeightLoadingStatus weightLoadingStatus = (WeightLoadingStatus) ViewBindings.findChildViewById(view, i);
                                                            if (weightLoadingStatus != null) {
                                                                i = R.id.mid_data_tv;
                                                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                if (typefaceTextView2 != null) {
                                                                    i = R.id.muscle_change_container;
                                                                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (frameLayout4 != null) {
                                                                        i = R.id.score_desc;
                                                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (typefaceTextView3 != null) {
                                                                            i = R.id.score_value_tv;
                                                                            UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (unitTextView != null) {
                                                                                i = R.id.scroll_view_bodyfat;
                                                                                SlidingConflictScrollView slidingConflictScrollView = (SlidingConflictScrollView) ViewBindings.findChildViewById(view, i);
                                                                                if (slidingConflictScrollView != null) {
                                                                                    i = R.id.user_picker;
                                                                                    WeightUserQuickPicker weightUserQuickPicker = (WeightUserQuickPicker) ViewBindings.findChildViewById(view, i);
                                                                                    if (weightUserQuickPicker != null) {
                                                                                        i = R.id.user_picker_ll;
                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (relativeLayout5 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.view_alpha))) != null) {
                                                                                            i = R.id.weight_change_container;
                                                                                            FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (frameLayout5 != null) {
                                                                                                return new ActivityBodyfatDetailBinding((RelativeLayout) view, relativeLayout, textView, imageView, relativeLayout2, frameLayout, frameLayout2, constraintLayout, relativeLayout3, layoutWeightDetailBottomBindingBind, imageView2, relativeLayout4, viewFindChildViewById2, viewFindChildViewById3, frameLayout3, typefaceTextView, linearLayout, weightLoadingStatus, typefaceTextView2, frameLayout4, typefaceTextView3, unitTextView, slidingConflictScrollView, weightUserQuickPicker, relativeLayout5, viewFindChildViewById4, frameLayout5);
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
    public static ActivityBodyfatDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBodyfatDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bodyfat_detail, viewGroup, false);
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
