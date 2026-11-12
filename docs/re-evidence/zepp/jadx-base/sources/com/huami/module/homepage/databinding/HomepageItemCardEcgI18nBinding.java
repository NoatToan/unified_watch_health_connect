package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardEcgI18nBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView ecgAnimation;

    @NonNull
    public final CardTitleBarView ecgBar;

    @NonNull
    public final TextView ecgState;

    @NonNull
    public final TextView hrv;

    @NonNull
    public final BackgroundTextView noHrv;

    @NonNull
    public final TextView tip;

    private HomepageItemCardEcgI18nBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView ecgAnimation, @NonNull CardTitleBarView ecgBar, @NonNull TextView ecgState, @NonNull TextView hrv, @NonNull BackgroundTextView noHrv, @NonNull TextView tip) {
        this.a = rootView;
        this.ecgAnimation = ecgAnimation;
        this.ecgBar = ecgBar;
        this.ecgState = ecgState;
        this.hrv = hrv;
        this.noHrv = noHrv;
        this.tip = tip;
    }

    @NonNull
    public static HomepageItemCardEcgI18nBinding bind(@NonNull View rootView) {
        int i = R.id.ecg_animation;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatImageView != null) {
            i = R.id.ecg_bar;
            CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
            if (cardTitleBarView != null) {
                i = R.id.ecg_state;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.hrv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.no_hrv;
                        BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                        if (backgroundTextView != null) {
                            i = R.id.tip;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                return new HomepageItemCardEcgI18nBinding((ConstraintLayout) rootView, appCompatImageView, cardTitleBarView, textView, textView2, backgroundTextView, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardEcgI18nBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardEcgI18nBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_ecg_i18n, parent, false);
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
