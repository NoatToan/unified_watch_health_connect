package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityWatchSkinOrderBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final LinearLayout layoutContainer;

    @NonNull
    public final RadioButton skinAlipayRb;

    @NonNull
    public final TextView skinBuyTv;

    @NonNull
    public final CardView skinCard;

    @NonNull
    public final ImageView skinIv;

    @NonNull
    public final TextView skinNameTv;

    @NonNull
    public final TextView skinPriceTv;

    @NonNull
    public final TextView skinTotalPriceTv;

    @NonNull
    public final RadioButton skinWxRb;

    private ActivityWatchSkinOrderBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull RadioButton radioButton, @NonNull TextView textView, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull RadioButton radioButton2) {
        this.a = frameLayout;
        this.layoutContainer = linearLayout;
        this.skinAlipayRb = radioButton;
        this.skinBuyTv = textView;
        this.skinCard = cardView;
        this.skinIv = imageView;
        this.skinNameTv = textView2;
        this.skinPriceTv = textView3;
        this.skinTotalPriceTv = textView4;
        this.skinWxRb = radioButton2;
    }

    @NonNull
    public static ActivityWatchSkinOrderBinding bind(@NonNull View view) {
        int i = R.id.layout_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.skin_alipay_rb;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
            if (radioButton != null) {
                i = R.id.skin_buy_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.skin_card;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.skin_iv;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.skin_name_tv;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.skin_price_tv;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.skin_total_price_tv;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.skin_wx_rb;
                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                        if (radioButton2 != null) {
                                            return new ActivityWatchSkinOrderBinding((FrameLayout) view, linearLayout, radioButton, textView, cardView, imageView, textView2, textView3, textView4, radioButton2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWatchSkinOrderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWatchSkinOrderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_watch_skin_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
