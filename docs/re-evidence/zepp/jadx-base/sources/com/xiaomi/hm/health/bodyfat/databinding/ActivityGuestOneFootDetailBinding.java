package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
public final class ActivityGuestOneFootDetailBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final LinearLayout layoutForScore;

    @NonNull
    public final View lineSplit2;

    @NonNull
    public final View lineSplit3;

    @NonNull
    public final WeightFigureView oneFootFigureView;

    @NonNull
    public final TypefaceTextView oneFootValueTextView;

    @NonNull
    public final RelativeLayout relayoutForNoScore;

    @NonNull
    public final RelativeLayout relayoutForScoreFigure;

    @NonNull
    public final TextView textNoScore;

    @NonNull
    public final TextView textViewScoreLevel;

    @NonNull
    public final TextView unitTV;

    @NonNull
    public final LinearLayout weightBodyTypeLl;

    @NonNull
    public final RelativeLayout weightRl;

    private ActivityGuestOneFootDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull WeightFigureView weightFigureView, @NonNull TypefaceTextView typefaceTextView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout4) {
        this.a = relativeLayout;
        this.layoutForScore = linearLayout;
        this.lineSplit2 = view;
        this.lineSplit3 = view2;
        this.oneFootFigureView = weightFigureView;
        this.oneFootValueTextView = typefaceTextView;
        this.relayoutForNoScore = relativeLayout2;
        this.relayoutForScoreFigure = relativeLayout3;
        this.textNoScore = textView;
        this.textViewScoreLevel = textView2;
        this.unitTV = textView3;
        this.weightBodyTypeLl = linearLayout2;
        this.weightRl = relativeLayout4;
    }

    @NonNull
    public static ActivityGuestOneFootDetailBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.layoutForScore;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_split2))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.line_split3))) != null) {
            i = R.id.oneFootFigureView;
            WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(view, i);
            if (weightFigureView != null) {
                i = R.id.oneFootValueTextView;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView != null) {
                    i = R.id.relayoutForNoScore;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.relayoutForScoreFigure;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.textNoScore;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.textViewScoreLevel;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.unitTV;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.weight_body_type_ll;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            i = R.id.weight_rl;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout3 != null) {
                                                return new ActivityGuestOneFootDetailBinding((RelativeLayout) view, linearLayout, viewFindChildViewById, viewFindChildViewById2, weightFigureView, typefaceTextView, relativeLayout, relativeLayout2, textView, textView2, textView3, linearLayout2, relativeLayout3);
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
    public static ActivityGuestOneFootDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGuestOneFootDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_guest_one_foot_detail, viewGroup, false);
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
