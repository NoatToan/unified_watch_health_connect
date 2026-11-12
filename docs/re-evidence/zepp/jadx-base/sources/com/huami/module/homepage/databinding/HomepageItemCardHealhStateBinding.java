package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardHealhStateBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final BackgroundTextView bloodPressureMask;

    @NonNull
    public final TextView bloodPressureTitle;

    @NonNull
    public final AppCompatImageView bloodPressureTv;

    @NonNull
    public final TextView bloodPressureUnit;

    @NonNull
    public final TextView bloodPressureValue;

    @NonNull
    public final BackgroundTextView bloodSugarMask;

    @NonNull
    public final TextView bloodSugarTitle;

    @NonNull
    public final AppCompatImageView bloodSugarTv;

    @NonNull
    public final TextView bloodSugarUnit;

    @NonNull
    public final TextView bloodSugarValue;

    @NonNull
    public final Guideline homepageGuideline;

    @NonNull
    public final CardTitleBarView signsStateTitle;

    private HomepageItemCardHealhStateBinding(@NonNull ConstraintLayout rootView, @NonNull BackgroundTextView bloodPressureMask, @NonNull TextView bloodPressureTitle, @NonNull AppCompatImageView bloodPressureTv, @NonNull TextView bloodPressureUnit, @NonNull TextView bloodPressureValue, @NonNull BackgroundTextView bloodSugarMask, @NonNull TextView bloodSugarTitle, @NonNull AppCompatImageView bloodSugarTv, @NonNull TextView bloodSugarUnit, @NonNull TextView bloodSugarValue, @NonNull Guideline homepageGuideline, @NonNull CardTitleBarView signsStateTitle) {
        this.a = rootView;
        this.bloodPressureMask = bloodPressureMask;
        this.bloodPressureTitle = bloodPressureTitle;
        this.bloodPressureTv = bloodPressureTv;
        this.bloodPressureUnit = bloodPressureUnit;
        this.bloodPressureValue = bloodPressureValue;
        this.bloodSugarMask = bloodSugarMask;
        this.bloodSugarTitle = bloodSugarTitle;
        this.bloodSugarTv = bloodSugarTv;
        this.bloodSugarUnit = bloodSugarUnit;
        this.bloodSugarValue = bloodSugarValue;
        this.homepageGuideline = homepageGuideline;
        this.signsStateTitle = signsStateTitle;
    }

    @NonNull
    public static HomepageItemCardHealhStateBinding bind(@NonNull View rootView) {
        int i = R.id.blood_pressure_mask;
        BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
        if (backgroundTextView != null) {
            i = R.id.blood_pressure_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.blood_pressure_tv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatImageView != null) {
                    i = R.id.blood_pressure_unit;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.blood_pressure_value;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.blood_sugar_mask;
                            BackgroundTextView backgroundTextView2 = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                            if (backgroundTextView2 != null) {
                                i = R.id.blood_sugar_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView4 != null) {
                                    i = R.id.blood_sugar_tv;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (appCompatImageView2 != null) {
                                        i = R.id.blood_sugar_unit;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView5 != null) {
                                            i = R.id.blood_sugar_value;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView6 != null) {
                                                i = R.id.homepage_guideline;
                                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, i);
                                                if (guideline != null) {
                                                    i = R.id.signs_state_title;
                                                    CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
                                                    if (cardTitleBarView != null) {
                                                        return new HomepageItemCardHealhStateBinding((ConstraintLayout) rootView, backgroundTextView, textView, appCompatImageView, textView2, textView3, backgroundTextView2, textView4, appCompatImageView2, textView5, textView6, guideline, cardTitleBarView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardHealhStateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardHealhStateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_healh_state, parent, false);
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
