package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchSkinGridItemBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final CardView cardView;

    @NonNull
    public final AppCompatImageView skinIv;

    @NonNull
    public final TextView skinTvName;

    @NonNull
    public final TextView skinTvPrice;

    private WatchSkinGridItemBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = cardView;
        this.cardView = cardView2;
        this.skinIv = appCompatImageView;
        this.skinTvName = textView;
        this.skinTvPrice = textView2;
    }

    @NonNull
    public static WatchSkinGridItemBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.skin_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.skin_tv_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.skin_tv_price;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new WatchSkinGridItemBinding(cardView, cardView, appCompatImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WatchSkinGridItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WatchSkinGridItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.watch_skin_grid_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.a;
    }
}
