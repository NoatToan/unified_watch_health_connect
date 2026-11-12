package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.huami.wallet.accessdoor.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class ActivitySimulationSuccessBinding implements ViewBinding {

    @NonNull
    private final CoordinatorLayout a;

    private ActivitySimulationSuccessBinding(@NonNull CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @NonNull
    public static ActivitySimulationSuccessBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ActivitySimulationSuccessBinding((CoordinatorLayout) view);
    }

    @NonNull
    public static ActivitySimulationSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySimulationSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_simulation_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.a;
    }
}
