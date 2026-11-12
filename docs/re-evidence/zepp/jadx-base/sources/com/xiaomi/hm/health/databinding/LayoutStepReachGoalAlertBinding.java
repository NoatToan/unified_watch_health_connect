package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutStepReachGoalAlertBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    private LayoutStepReachGoalAlertBinding(@NonNull LinearLayout rootView) {
        this.a = rootView;
    }

    @NonNull
    public static LayoutStepReachGoalAlertBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new LayoutStepReachGoalAlertBinding((LinearLayout) rootView);
    }

    @NonNull
    public static LayoutStepReachGoalAlertBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutStepReachGoalAlertBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_step_reach_goal_alert, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
