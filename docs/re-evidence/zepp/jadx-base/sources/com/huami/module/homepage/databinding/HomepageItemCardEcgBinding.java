package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public final class HomepageItemCardEcgBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView ecgAnimation;

    @NonNull
    public final CardTitleBarView ecgBar;

    @NonNull
    public final ImageView ecgIcon;

    @NonNull
    public final TextView ecgState;

    @NonNull
    public final TextView hrv;

    @NonNull
    public final View middleLine;

    @NonNull
    public final BackgroundTextView noHrv;

    @NonNull
    public final TextView tip;

    private HomepageItemCardEcgBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView ecgAnimation, @NonNull CardTitleBarView ecgBar, @NonNull ImageView ecgIcon, @NonNull TextView ecgState, @NonNull TextView hrv, @NonNull View middleLine, @NonNull BackgroundTextView noHrv, @NonNull TextView tip) {
        this.a = rootView;
        this.ecgAnimation = ecgAnimation;
        this.ecgBar = ecgBar;
        this.ecgIcon = ecgIcon;
        this.ecgState = ecgState;
        this.hrv = hrv;
        this.middleLine = middleLine;
        this.noHrv = noHrv;
        this.tip = tip;
    }

    @NonNull
    public static HomepageItemCardEcgBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.ecg_animation;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatImageView != null) {
            i = R.id.ecg_bar;
            CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
            if (cardTitleBarView != null) {
                i = R.id.ecg_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = R.id.ecg_state;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = R.id.hrv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.middle_line))) != null) {
                            i = R.id.no_hrv;
                            BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                            if (backgroundTextView != null) {
                                i = R.id.tip;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    return new HomepageItemCardEcgBinding((ConstraintLayout) rootView, appCompatImageView, cardTitleBarView, imageView, textView, textView2, viewFindChildViewById, backgroundTextView, textView3);
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
    public static HomepageItemCardEcgBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardEcgBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_ecg, parent, false);
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
