package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityGuestBalanceDetailBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CardStatusIntroducesBinding layoutIntro;

    private ActivityGuestBalanceDetailBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CardStatusIntroducesBinding cardStatusIntroducesBinding) {
        this.a = constraintLayout;
        this.layoutIntro = cardStatusIntroducesBinding;
    }

    @NonNull
    public static ActivityGuestBalanceDetailBinding bind(@NonNull View view) {
        int i = R.id.layout_intro;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new ActivityGuestBalanceDetailBinding((ConstraintLayout) view, CardStatusIntroducesBinding.bind(viewFindChildViewById));
    }

    @NonNull
    public static ActivityGuestBalanceDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGuestBalanceDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_guest_balance_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
