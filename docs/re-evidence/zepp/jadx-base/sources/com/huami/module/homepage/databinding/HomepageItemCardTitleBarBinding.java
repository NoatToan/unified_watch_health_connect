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

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardTitleBarBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView cardSecondTitle;

    @NonNull
    public final TextView cardTitle;

    @NonNull
    public final AppCompatImageView foldButton;

    @NonNull
    public final Guideline homepageCardGuideline;

    @NonNull
    public final TextView lastTime;

    @NonNull
    public final TextView secondLastTime;

    private HomepageItemCardTitleBarBinding(@NonNull ConstraintLayout rootView, @NonNull TextView cardSecondTitle, @NonNull TextView cardTitle, @NonNull AppCompatImageView foldButton, @NonNull Guideline homepageCardGuideline, @NonNull TextView lastTime, @NonNull TextView secondLastTime) {
        this.a = rootView;
        this.cardSecondTitle = cardSecondTitle;
        this.cardTitle = cardTitle;
        this.foldButton = foldButton;
        this.homepageCardGuideline = homepageCardGuideline;
        this.lastTime = lastTime;
        this.secondLastTime = secondLastTime;
    }

    @NonNull
    public static HomepageItemCardTitleBarBinding bind(@NonNull View rootView) {
        int i = R.id.card_second_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.card_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.fold_button;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatImageView != null) {
                    i = R.id.homepage_card_guideline;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, i);
                    if (guideline != null) {
                        i = R.id.last_time;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.second_last_time;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                return new HomepageItemCardTitleBarBinding((ConstraintLayout) rootView, textView, textView2, appCompatImageView, guideline, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardTitleBarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardTitleBarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_title_bar, parent, false);
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
