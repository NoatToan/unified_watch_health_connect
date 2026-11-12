package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.SDAdaptiveTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class CardStatusIntroducesBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout cardStatus;

    @NonNull
    public final View cardStatusDividingLine;

    @NonNull
    public final SDAdaptiveTextView cardStatusIntroduce;

    @NonNull
    public final TextView cardStatusTitle;

    private CardStatusIntroducesBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull SDAdaptiveTextView sDAdaptiveTextView, @NonNull TextView textView) {
        this.a = linearLayout;
        this.cardStatus = linearLayout2;
        this.cardStatusDividingLine = view;
        this.cardStatusIntroduce = sDAdaptiveTextView;
        this.cardStatusTitle = textView;
    }

    @NonNull
    public static CardStatusIntroducesBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.card_status_dividing_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = R.id.card_status_introduce;
            SDAdaptiveTextView sDAdaptiveTextView = (SDAdaptiveTextView) ViewBindings.findChildViewById(view, i);
            if (sDAdaptiveTextView != null) {
                i = R.id.card_status_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new CardStatusIntroducesBinding(linearLayout, linearLayout, viewFindChildViewById, sDAdaptiveTextView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CardStatusIntroducesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CardStatusIntroducesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.card_status_introduces, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
