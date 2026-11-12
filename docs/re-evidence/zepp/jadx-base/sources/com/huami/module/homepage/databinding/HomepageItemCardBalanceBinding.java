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
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.PiecewiseLineView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardBalanceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CardTitleBarView balanceBar;

    @NonNull
    public final TextView balanceDescription;

    @NonNull
    public final TextView balanceKeepTime;

    @NonNull
    public final TextView balanceKeepTimeUnit;

    @NonNull
    public final BackgroundTextView balanceMask;

    @NonNull
    public final PiecewiseLineView balanceState;

    private HomepageItemCardBalanceBinding(@NonNull ConstraintLayout rootView, @NonNull CardTitleBarView balanceBar, @NonNull TextView balanceDescription, @NonNull TextView balanceKeepTime, @NonNull TextView balanceKeepTimeUnit, @NonNull BackgroundTextView balanceMask, @NonNull PiecewiseLineView balanceState) {
        this.a = rootView;
        this.balanceBar = balanceBar;
        this.balanceDescription = balanceDescription;
        this.balanceKeepTime = balanceKeepTime;
        this.balanceKeepTimeUnit = balanceKeepTimeUnit;
        this.balanceMask = balanceMask;
        this.balanceState = balanceState;
    }

    @NonNull
    public static HomepageItemCardBalanceBinding bind(@NonNull View rootView) {
        int i = R.id.balance_bar;
        CardTitleBarView cardTitleBarView = (CardTitleBarView) ViewBindings.findChildViewById(rootView, i);
        if (cardTitleBarView != null) {
            i = R.id.balance_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.balance_keep_time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.balance_keep_time_unit;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = R.id.balance_mask;
                        BackgroundTextView backgroundTextView = (BackgroundTextView) ViewBindings.findChildViewById(rootView, i);
                        if (backgroundTextView != null) {
                            i = R.id.balance_state;
                            PiecewiseLineView piecewiseLineView = (PiecewiseLineView) ViewBindings.findChildViewById(rootView, i);
                            if (piecewiseLineView != null) {
                                return new HomepageItemCardBalanceBinding((ConstraintLayout) rootView, cardTitleBarView, textView, textView2, textView3, backgroundTextView, piecewiseLineView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardBalanceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardBalanceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_balance, parent, false);
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
