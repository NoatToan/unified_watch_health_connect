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
import com.huami.module.homepage.cards.cardui.GradientLineView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardPaiExtBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Guideline homepageGuidelineEnd;

    @NonNull
    public final TextView pai100;

    @NonNull
    public final GradientLineView paiLine;

    @NonNull
    public final TextView paiNextGoal;

    @NonNull
    public final TextView paiZero;

    @NonNull
    public final TextView todayPai;

    private HomepageItemCardPaiExtBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline homepageGuidelineEnd, @NonNull TextView pai100, @NonNull GradientLineView paiLine, @NonNull TextView paiNextGoal, @NonNull TextView paiZero, @NonNull TextView todayPai) {
        this.a = rootView;
        this.homepageGuidelineEnd = homepageGuidelineEnd;
        this.pai100 = pai100;
        this.paiLine = paiLine;
        this.paiNextGoal = paiNextGoal;
        this.paiZero = paiZero;
        this.todayPai = todayPai;
    }

    @NonNull
    public static HomepageItemCardPaiExtBinding bind(@NonNull View rootView) {
        int i = R.id.homepage_guideline_end;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, i);
        if (guideline != null) {
            i = R.id.pai_100;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.pai_line;
                GradientLineView gradientLineView = (GradientLineView) ViewBindings.findChildViewById(rootView, i);
                if (gradientLineView != null) {
                    i = R.id.pai_next_goal;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.pai_zero;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.today_pai;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                return new HomepageItemCardPaiExtBinding((ConstraintLayout) rootView, guideline, textView, gradientLineView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardPaiExtBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardPaiExtBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_pai_ext, parent, false);
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
