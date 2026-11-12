package com.huami.xiaopeng.ui.amazfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huami.xiaopeng.ui.amazfit.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public final class FragmentHostXpBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    private FragmentHostXpBinding(@NonNull ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    @NonNull
    public static FragmentHostXpBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new FragmentHostXpBinding((ConstraintLayout) view);
    }

    @NonNull
    public static FragmentHostXpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentHostXpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_host_xp, viewGroup, false);
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
