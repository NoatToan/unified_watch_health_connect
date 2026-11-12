package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.GradientLineView;
import com.huami.module.homepage.cards.cardui.I18nNumberView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardPaiExtI18nBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final I18nNumberView pai100;

    @NonNull
    public final GradientLineView paiLine;

    @NonNull
    public final TextView paiNextGoal;

    @NonNull
    public final I18nNumberView paiZero;

    private HomepageItemCardPaiExtI18nBinding(@NonNull ConstraintLayout rootView, @NonNull I18nNumberView pai100, @NonNull GradientLineView paiLine, @NonNull TextView paiNextGoal, @NonNull I18nNumberView paiZero) {
        this.a = rootView;
        this.pai100 = pai100;
        this.paiLine = paiLine;
        this.paiNextGoal = paiNextGoal;
        this.paiZero = paiZero;
    }

    @NonNull
    public static HomepageItemCardPaiExtI18nBinding bind(@NonNull View rootView) {
        int i = R.id.pai_100;
        I18nNumberView i18nNumberView = (I18nNumberView) ViewBindings.findChildViewById(rootView, i);
        if (i18nNumberView != null) {
            i = R.id.pai_line;
            GradientLineView gradientLineView = (GradientLineView) ViewBindings.findChildViewById(rootView, i);
            if (gradientLineView != null) {
                i = R.id.pai_next_goal;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.pai_zero;
                    I18nNumberView i18nNumberView2 = (I18nNumberView) ViewBindings.findChildViewById(rootView, i);
                    if (i18nNumberView2 != null) {
                        return new HomepageItemCardPaiExtI18nBinding((ConstraintLayout) rootView, i18nNumberView, gradientLineView, textView, i18nNumberView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardPaiExtI18nBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardPaiExtI18nBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_pai_ext_i18n, parent, false);
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
