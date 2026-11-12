package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.I18nNumberView;
import com.huami.module.homepage.cards.cardui.PairCircleView;
import com.huami.module.homepage.cards.cardui.PiecewiseLineView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardTemperatureBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView icon;

    @NonNull
    public final BackgroundTextView mask;

    @NonNull
    public final PairCircleView pairCircleView;

    @NonNull
    public final PiecewiseLineView piecewiseLineView;

    @NonNull
    public final I18nNumberView temperatureAbnormal;

    @NonNull
    public final CardTitleBarView temperatureBar;

    @NonNull
    public final I18nNumberView temperatureNone;

    @NonNull
    public final I18nNumberView temperatureNormal;

    @NonNull
    public final TextView temperatureStatus;

    private HomepageItemCardTemperatureBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView icon, @NonNull BackgroundTextView mask, @NonNull PairCircleView pairCircleView, @NonNull PiecewiseLineView piecewiseLineView, @NonNull I18nNumberView temperatureAbnormal, @NonNull CardTitleBarView temperatureBar, @NonNull I18nNumberView temperatureNone, @NonNull I18nNumberView temperatureNormal, @NonNull TextView temperatureStatus) {
        this.a = rootView;
        this.icon = icon;
        this.mask = mask;
        this.pairCircleView = pairCircleView;
        this.piecewiseLineView = piecewiseLineView;
        this.temperatureAbnormal = temperatureAbnormal;
        this.temperatureBar = temperatureBar;
        this.temperatureNone = temperatureNone;
        this.temperatureNormal = temperatureNormal;
        this.temperatureStatus = temperatureStatus;
    }

    @NonNull
    public static HomepageItemCardTemperatureBinding bind(@NonNull View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.mask;
            BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
            if (backgroundTextView != null) {
                i = R.id.pairCircleView;
                PairCircleView pairCircleView = (PairCircleView) ViewBindings.findChildViewById(rootView, i);
                if (pairCircleView != null) {
                    i = R.id.piecewiseLineView;
                    PiecewiseLineView piecewiseLineView = (PiecewiseLineView) ViewBindings.findChildViewById(rootView, i);
                    if (piecewiseLineView != null) {
                        i = R.id.temperature_abnormal;
                        I18nNumberView i18nNumberView = (I18nNumberView) ViewBindings.findChildViewById(rootView, i);
                        if (i18nNumberView != null) {
                            i = R.id.temperature_bar;
                            CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                            if (cardTitleBarView != null) {
                                i = R.id.temperature_none;
                                I18nNumberView i18nNumberView2 = (I18nNumberView) ViewBindings.findChildViewById(rootView, i);
                                if (i18nNumberView2 != null) {
                                    i = R.id.temperature_normal;
                                    I18nNumberView i18nNumberView3 = (I18nNumberView) ViewBindings.findChildViewById(rootView, i);
                                    if (i18nNumberView3 != null) {
                                        i = R.id.temperature_status;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView != null) {
                                            return new HomepageItemCardTemperatureBinding((ConstraintLayout) rootView, imageView, backgroundTextView, pairCircleView, piecewiseLineView, i18nNumberView, cardTitleBarView, i18nNumberView2, i18nNumberView3, textView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardTemperatureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardTemperatureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_temperature, parent, false);
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
