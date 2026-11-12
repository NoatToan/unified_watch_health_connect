package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.wallet.accessdoor.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivityAccessCardDetailBinding implements ViewBinding {

    @NonNull
    private final View a;

    private ActivityAccessCardDetailBinding(@NonNull View view) {
        this.a = view;
    }

    @NonNull
    public static ActivityAccessCardDetailBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ActivityAccessCardDetailBinding(view);
    }

    @NonNull
    public static ActivityAccessCardDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }

    @NonNull
    public static ActivityAccessCardDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_access_card_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
