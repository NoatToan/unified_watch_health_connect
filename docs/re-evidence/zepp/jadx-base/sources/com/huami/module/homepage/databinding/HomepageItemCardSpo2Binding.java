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
import com.airbnb.lottie.LottieAnimationView;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardSpo2Binding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CardTitleBarView spo2Bar;

    @NonNull
    public final TextView spo2Desc;

    @NonNull
    public final LottieAnimationView spo2Lottie;

    @NonNull
    public final BackgroundTextView spo2Mask;

    @NonNull
    public final TextView spo2Value;

    private HomepageItemCardSpo2Binding(@NonNull ConstraintLayout rootView, @NonNull CardTitleBarView spo2Bar, @NonNull TextView spo2Desc, @NonNull LottieAnimationView spo2Lottie, @NonNull BackgroundTextView spo2Mask, @NonNull TextView spo2Value) {
        this.a = rootView;
        this.spo2Bar = spo2Bar;
        this.spo2Desc = spo2Desc;
        this.spo2Lottie = spo2Lottie;
        this.spo2Mask = spo2Mask;
        this.spo2Value = spo2Value;
    }

    @NonNull
    public static HomepageItemCardSpo2Binding bind(@NonNull View rootView) {
        int i = R.id.spo2_bar;
        CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
        if (cardTitleBarView != null) {
            i = R.id.spo2_desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.spo2_lottie;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
                if (lottieAnimationView != null) {
                    i = R.id.spo2_mask;
                    BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                    if (backgroundTextView != null) {
                        i = R.id.spo2_value;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new HomepageItemCardSpo2Binding((ConstraintLayout) rootView, cardTitleBarView, textView, lottieAnimationView, backgroundTextView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardSpo2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardSpo2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_spo2, parent, false);
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
