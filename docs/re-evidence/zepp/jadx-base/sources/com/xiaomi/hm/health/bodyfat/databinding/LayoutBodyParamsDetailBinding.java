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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.text.UnitTextView;
import com.huami.view.weightfigure.WeightFigureView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.FillRecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutBodyParamsDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View adapterDividerUp;

    @NonNull
    public final TextView attentionTv;

    @NonNull
    public final View belowShapeIv;

    @NonNull
    public final ImageView bodyAgeIconIv;

    @NonNull
    public final TextView bodyAgeInfoTv;

    @NonNull
    public final LinearLayout bodyAgeLayout;

    @NonNull
    public final TextView bodyAgeTitleTv;

    @NonNull
    public final ImageView bodyIdealWeightIconIv;

    @NonNull
    public final LinearLayout bodyIdealWeightLayout;

    @NonNull
    public final TextView bodyIdealWeightTitleTv;

    @NonNull
    public final FillRecyclerView healthListview;

    @NonNull
    public final RelativeLayout healthRl;

    @NonNull
    public final TextView healthTv;

    @NonNull
    public final WeightFigureView idealWeightFigureView;

    @NonNull
    public final View lineview;

    @NonNull
    public final View lineview2;

    @NonNull
    public final View lineview2Health;

    @NonNull
    public final FillRecyclerView needAttentionListview;

    @NonNull
    public final RelativeLayout needAttentionRl;

    @NonNull
    public final RelativeLayout notStandardRl;

    @NonNull
    public final FillRecyclerView notToStandardListview;

    @NonNull
    public final TextView notToStandardTv;

    @NonNull
    public final TextView otherIndicatorsTv;

    @NonNull
    public final UnitTextView paramsIdealAge;

    @NonNull
    public final UnitTextView paramsIdealWeight;

    @NonNull
    public final LinearLayout partLl;

    @NonNull
    public final TextView shapeIv;

    @NonNull
    public final ImageView shapeIvPre;

    @NonNull
    public final RelativeLayout shapeParamRl;

    private LayoutBodyParamsDetailBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView, @NonNull View view2, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView4, @NonNull FillRecyclerView fillRecyclerView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView5, @NonNull WeightFigureView weightFigureView, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull FillRecyclerView fillRecyclerView2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull FillRecyclerView fillRecyclerView3, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull UnitTextView unitTextView, @NonNull UnitTextView unitTextView2, @NonNull LinearLayout linearLayout4, @NonNull TextView textView8, @NonNull ImageView imageView3, @NonNull RelativeLayout relativeLayout4) {
        this.a = linearLayout;
        this.adapterDividerUp = view;
        this.attentionTv = textView;
        this.belowShapeIv = view2;
        this.bodyAgeIconIv = imageView;
        this.bodyAgeInfoTv = textView2;
        this.bodyAgeLayout = linearLayout2;
        this.bodyAgeTitleTv = textView3;
        this.bodyIdealWeightIconIv = imageView2;
        this.bodyIdealWeightLayout = linearLayout3;
        this.bodyIdealWeightTitleTv = textView4;
        this.healthListview = fillRecyclerView;
        this.healthRl = relativeLayout;
        this.healthTv = textView5;
        this.idealWeightFigureView = weightFigureView;
        this.lineview = view3;
        this.lineview2 = view4;
        this.lineview2Health = view5;
        this.needAttentionListview = fillRecyclerView2;
        this.needAttentionRl = relativeLayout2;
        this.notStandardRl = relativeLayout3;
        this.notToStandardListview = fillRecyclerView3;
        this.notToStandardTv = textView6;
        this.otherIndicatorsTv = textView7;
        this.paramsIdealAge = unitTextView;
        this.paramsIdealWeight = unitTextView2;
        this.partLl = linearLayout4;
        this.shapeIv = textView8;
        this.shapeIvPre = imageView3;
        this.shapeParamRl = relativeLayout4;
    }

    @NonNull
    public static LayoutBodyParamsDetailBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i = R.id.adapter_divider_up;
        View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById5 != null) {
            i = R.id.attention_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.below_shape_iv))) != null) {
                i = R.id.body_age_icon_iv;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.body_age_info_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.body_age_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.body_age_title_tv;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.body_ideal_weight_icon_iv;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.body_ideal_weight_layout;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = R.id.body_ideal_weight_title_tv;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.health_listview;
                                            FillRecyclerView fillRecyclerView = (FillRecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (fillRecyclerView != null) {
                                                i = R.id.health_rl;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout != null) {
                                                    i = R.id.health_tv;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = R.id.ideal_weight_figure_view;
                                                        WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(view, i);
                                                        if (weightFigureView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.lineview))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.lineview2))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.lineview2_health))) != null) {
                                                            i = R.id.need_attention_listview;
                                                            FillRecyclerView fillRecyclerView2 = (FillRecyclerView) ViewBindings.findChildViewById(view, i);
                                                            if (fillRecyclerView2 != null) {
                                                                i = R.id.need_attention_rl;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                if (relativeLayout2 != null) {
                                                                    i = R.id.not_standard_rl;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (relativeLayout3 != null) {
                                                                        i = R.id.not_to_standard_listview;
                                                                        FillRecyclerView fillRecyclerView3 = (FillRecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (fillRecyclerView3 != null) {
                                                                            i = R.id.not_to_standard_tv;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView6 != null) {
                                                                                i = R.id.other_indicators_tv;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.params_ideal_age;
                                                                                    UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (unitTextView != null) {
                                                                                        i = R.id.params_ideal_weight;
                                                                                        UnitTextView unitTextView2 = (UnitTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (unitTextView2 != null) {
                                                                                            i = R.id.part_ll;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout3 != null) {
                                                                                                i = R.id.shape_iv;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.shape_iv_pre;
                                                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (imageView3 != null) {
                                                                                                        i = R.id.shape_param_rl;
                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                                        if (relativeLayout4 != null) {
                                                                                                            return new LayoutBodyParamsDetailBinding((LinearLayout) view, viewFindChildViewById5, textView, viewFindChildViewById, imageView, textView2, linearLayout, textView3, imageView2, linearLayout2, textView4, fillRecyclerView, relativeLayout, textView5, weightFigureView, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, fillRecyclerView2, relativeLayout2, relativeLayout3, fillRecyclerView3, textView6, textView7, unitTextView, unitTextView2, linearLayout3, textView8, imageView3, relativeLayout4);
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
    public static LayoutBodyParamsDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutBodyParamsDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_body_params_detail, viewGroup, false);
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
