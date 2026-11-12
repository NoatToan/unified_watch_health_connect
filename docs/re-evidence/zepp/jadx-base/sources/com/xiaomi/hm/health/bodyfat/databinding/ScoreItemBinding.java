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

/* JADX INFO: loaded from: classes19.dex */
public final class ScoreItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View adapterDividerUp;

    @NonNull
    public final ImageView arrowIv;

    @NonNull
    public final TextView bodyIndexDesc;

    @NonNull
    public final ImageView bodyIndexIcon;

    @NonNull
    public final TextView bodyIndexName;

    @NonNull
    public final UnitTextView bodyIndexValue;

    @NonNull
    public final RelativeLayout briefLayout;

    @NonNull
    public final RelativeLayout container;

    @NonNull
    public final LinearLayout detailLayout;

    @NonNull
    public final View dividerBottom;

    @NonNull
    public final TextView infoTv;

    @NonNull
    public final LinearLayout llBf3Params;

    @NonNull
    public final WeightFigureView paramsFigureView;

    @NonNull
    public final TextView textViewDetails;

    private ScoreItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull UnitTextView unitTextView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull LinearLayout linearLayout, @NonNull View view2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull WeightFigureView weightFigureView, @NonNull TextView textView4) {
        this.a = relativeLayout;
        this.adapterDividerUp = view;
        this.arrowIv = imageView;
        this.bodyIndexDesc = textView;
        this.bodyIndexIcon = imageView2;
        this.bodyIndexName = textView2;
        this.bodyIndexValue = unitTextView;
        this.briefLayout = relativeLayout2;
        this.container = relativeLayout3;
        this.detailLayout = linearLayout;
        this.dividerBottom = view2;
        this.infoTv = textView3;
        this.llBf3Params = linearLayout2;
        this.paramsFigureView = weightFigureView;
        this.textViewDetails = textView4;
    }

    @NonNull
    public static ScoreItemBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.adapter_divider_up;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = R.id.arrow_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.body_index_desc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.body_index_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.body_index_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.body_index_value;
                            UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(view, i);
                            if (unitTextView != null) {
                                i = R.id.brief_layout;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout != null) {
                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                    i = R.id.detail_layout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_bottom))) != null) {
                                        i = R.id.info_tv;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.ll_bf3_params;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout2 != null) {
                                                i = R.id.params_figure_view;
                                                WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(view, i);
                                                if (weightFigureView != null) {
                                                    i = R.id.text_view_details;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        return new ScoreItemBinding(relativeLayout2, viewFindChildViewById2, imageView, textView, imageView2, textView2, unitTextView, relativeLayout, relativeLayout2, linearLayout, viewFindChildViewById, textView3, linearLayout2, weightFigureView, textView4);
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
    public static ScoreItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ScoreItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.score_item, viewGroup, false);
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
