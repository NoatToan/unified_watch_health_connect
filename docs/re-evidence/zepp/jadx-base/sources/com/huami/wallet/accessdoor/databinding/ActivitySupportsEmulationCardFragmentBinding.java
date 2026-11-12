package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huami.wallet.accessdoor.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivitySupportsEmulationCardFragmentBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    private ActivitySupportsEmulationCardFragmentBinding(@NonNull ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    @NonNull
    public static ActivitySupportsEmulationCardFragmentBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ActivitySupportsEmulationCardFragmentBinding((ConstraintLayout) view);
    }

    @NonNull
    public static ActivitySupportsEmulationCardFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySupportsEmulationCardFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_supports_emulation_card_fragment, viewGroup, false);
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
