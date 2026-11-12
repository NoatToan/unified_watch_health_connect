package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchSkinCollectHeaderBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    private WatchSkinCollectHeaderBinding(@NonNull CardView cardView) {
        this.a = cardView;
    }

    @NonNull
    public static WatchSkinCollectHeaderBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new WatchSkinCollectHeaderBinding((CardView) view);
    }

    @NonNull
    public static WatchSkinCollectHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WatchSkinCollectHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.watch_skin_collect_header, viewGroup, false);
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
