package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.text.UnitTextView;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class IdealWeightBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TypefaceTextView bodyIdealWeightTitleTv;

    @NonNull
    public final RelativeLayout hasBmiLl;

    @NonNull
    public final UnitTextView paramsIdealWeight;

    @NonNull
    public final WeightFigureView weightFigureView;

    private IdealWeightBinding(@NonNull RelativeLayout relativeLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull RelativeLayout relativeLayout2, @NonNull UnitTextView unitTextView, @NonNull WeightFigureView weightFigureView) {
        this.a = relativeLayout;
        this.bodyIdealWeightTitleTv = typefaceTextView;
        this.hasBmiLl = relativeLayout2;
        this.paramsIdealWeight = unitTextView;
        this.weightFigureView = weightFigureView;
    }

    @NonNull
    public static IdealWeightBinding bind(@NonNull View view) {
        int i = R.id.body_ideal_weight_title_tv;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.params_ideal_weight;
            UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(view, i);
            if (unitTextView != null) {
                i = R.id.weight_figure_view;
                WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(view, i);
                if (weightFigureView != null) {
                    return new IdealWeightBinding(relativeLayout, typefaceTextView, relativeLayout, unitTextView, weightFigureView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IdealWeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IdealWeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.ideal_weight, viewGroup, false);
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
