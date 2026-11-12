package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.watchskinstore.ui.NestRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchSkinRecycleBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final CardView cardView;

    @NonNull
    public final NestRecyclerView rvItem;

    private WatchSkinRecycleBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull NestRecyclerView nestRecyclerView) {
        this.a = cardView;
        this.cardView = cardView2;
        this.rvItem = nestRecyclerView;
    }

    @NonNull
    public static WatchSkinRecycleBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.rv_item;
        NestRecyclerView nestRecyclerView = (NestRecyclerView) ViewBindings.findChildViewById(view, i);
        if (nestRecyclerView != null) {
            return new WatchSkinRecycleBinding(cardView, cardView, nestRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WatchSkinRecycleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WatchSkinRecycleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.watch_skin_recycle, viewGroup, false);
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
