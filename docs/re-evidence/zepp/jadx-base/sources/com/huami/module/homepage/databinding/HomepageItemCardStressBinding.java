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
public final class HomepageItemCardStressBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CardTitleBarView pressureBar;

    @NonNull
    public final TextView pressureDesc;

    @NonNull
    public final BackgroundTextView pressureMask;

    @NonNull
    public final AppCompatImageView pressureNoneIv;

    @NonNull
    public final AppCompatImageView pressureScaleIv;

    @NonNull
    public final TextView pressureValue;

    private HomepageItemCardStressBinding(@NonNull ConstraintLayout rootView, @NonNull CardTitleBarView pressureBar, @NonNull TextView pressureDesc, @NonNull BackgroundTextView pressureMask, @NonNull AppCompatImageView pressureNoneIv, @NonNull AppCompatImageView pressureScaleIv, @NonNull TextView pressureValue) {
        this.a = rootView;
        this.pressureBar = pressureBar;
        this.pressureDesc = pressureDesc;
        this.pressureMask = pressureMask;
        this.pressureNoneIv = pressureNoneIv;
        this.pressureScaleIv = pressureScaleIv;
        this.pressureValue = pressureValue;
    }

    @NonNull
    public static HomepageItemCardStressBinding bind(@NonNull View rootView) {
        int i = R.id.pressure_bar;
        CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
        if (cardTitleBarView != null) {
            i = R.id.pressure_desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.pressure_mask;
                BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                if (backgroundTextView != null) {
                    i = R.id.pressure_none_iv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                    if (appCompatImageView != null) {
                        i = R.id.pressure_scale_iv;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                        if (appCompatImageView2 != null) {
                            i = R.id.pressure_value;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                return new HomepageItemCardStressBinding((ConstraintLayout) rootView, cardTitleBarView, textView, backgroundTextView, appCompatImageView, appCompatImageView2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardStressBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardStressBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_stress, parent, false);
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
