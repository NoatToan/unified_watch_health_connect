package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.PiecewiseArcView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardSportStateBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final PiecewiseArcView epocArc;

    @NonNull
    public final TextView epocValue;

    @NonNull
    public final PiecewiseArcView maxVo2Arc;

    @NonNull
    public final TextView maxVo2Value;

    @NonNull
    public final Guideline middleLine;

    @NonNull
    public final TextView title;

    private HomepageItemCardSportStateBinding(@NonNull ConstraintLayout rootView, @NonNull PiecewiseArcView epocArc, @NonNull TextView epocValue, @NonNull PiecewiseArcView maxVo2Arc, @NonNull TextView maxVo2Value, @NonNull Guideline middleLine, @NonNull TextView title) {
        this.a = rootView;
        this.epocArc = epocArc;
        this.epocValue = epocValue;
        this.maxVo2Arc = maxVo2Arc;
        this.maxVo2Value = maxVo2Value;
        this.middleLine = middleLine;
        this.title = title;
    }

    @NonNull
    public static HomepageItemCardSportStateBinding bind(@NonNull View rootView) {
        int i = R.id.epoc_arc;
        PiecewiseArcView piecewiseArcView = (PiecewiseArcView) ViewBindings.findChildViewById(rootView, i);
        if (piecewiseArcView != null) {
            i = R.id.epoc_value;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.max_vo2_arc;
                PiecewiseArcView piecewiseArcView2 = (PiecewiseArcView) ViewBindings.findChildViewById(rootView, i);
                if (piecewiseArcView2 != null) {
                    i = R.id.max_vo2_value;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.middle_line;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, i);
                        if (guideline != null) {
                            i = R.id.title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                return new HomepageItemCardSportStateBinding((ConstraintLayout) rootView, piecewiseArcView, textView, piecewiseArcView2, textView2, guideline, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardSportStateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardSportStateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_sport_state, parent, false);
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
