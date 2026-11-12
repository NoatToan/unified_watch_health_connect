package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityParamsBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout baseLayout;

    @NonNull
    public final WeightFigureView figureView;

    @NonNull
    public final TextView hasFigureviewTv;

    @NonNull
    public final TextView levelTv;

    @NonNull
    public final TextView noFigureviewTv;

    @NonNull
    public final View splitView;

    @NonNull
    public final TextView unitTv;

    @NonNull
    public final RelativeLayout upLayout;

    @NonNull
    public final RelativeLayout valueLl;

    @NonNull
    public final TypefaceTextView valueTv;

    private ActivityParamsBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull WeightFigureView weightFigureView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TypefaceTextView typefaceTextView) {
        this.a = relativeLayout;
        this.baseLayout = relativeLayout2;
        this.figureView = weightFigureView;
        this.hasFigureviewTv = textView;
        this.levelTv = textView2;
        this.noFigureviewTv = textView3;
        this.splitView = view;
        this.unitTv = textView4;
        this.upLayout = relativeLayout3;
        this.valueLl = relativeLayout4;
        this.valueTv = typefaceTextView;
    }

    @NonNull
    public static ActivityParamsBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.figure_view;
        WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(view, i);
        if (weightFigureView != null) {
            i = R.id.has_figureview_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.level_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.no_figureview_tv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.split_view))) != null) {
                        i = R.id.unit_tv;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.up_layout;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = R.id.value_ll;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout3 != null) {
                                    i = R.id.value_tv;
                                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                    if (typefaceTextView != null) {
                                        return new ActivityParamsBinding(relativeLayout, relativeLayout, weightFigureView, textView, textView2, textView3, viewFindChildViewById, textView4, relativeLayout2, relativeLayout3, typefaceTextView);
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
    public static ActivityParamsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityParamsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_params, viewGroup, false);
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
