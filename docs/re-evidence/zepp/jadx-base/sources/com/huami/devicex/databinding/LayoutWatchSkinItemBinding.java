package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutWatchSkinItemBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final CardView cardView;

    @NonNull
    public final AppCompatImageView deleteImg;

    @NonNull
    public final AppCompatImageView thumbnailImg;

    private LayoutWatchSkinItemBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2) {
        this.a = cardView;
        this.cardView = cardView2;
        this.deleteImg = appCompatImageView;
        this.thumbnailImg = appCompatImageView2;
    }

    @NonNull
    public static LayoutWatchSkinItemBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.delete_img;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.thumbnail_img;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                return new LayoutWatchSkinItemBinding(cardView, cardView, appCompatImageView, appCompatImageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutWatchSkinItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutWatchSkinItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_watch_skin_item, viewGroup, false);
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
