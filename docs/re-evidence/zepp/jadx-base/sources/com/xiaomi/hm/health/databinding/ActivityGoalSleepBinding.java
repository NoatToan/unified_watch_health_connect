package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityGoalSleepBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final WheelView pickerGoalSleepHour;

    @NonNull
    public final WheelView pickerGoalSleepMin;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final Button tvConfirm;

    private ActivityGoalSleepBinding(@NonNull LinearLayout rootView, @NonNull WheelView pickerGoalSleepHour, @NonNull WheelView pickerGoalSleepMin, @NonNull RainbowTitleBar titleBar, @NonNull Button tvConfirm) {
        this.a = rootView;
        this.pickerGoalSleepHour = pickerGoalSleepHour;
        this.pickerGoalSleepMin = pickerGoalSleepMin;
        this.titleBar = titleBar;
        this.tvConfirm = tvConfirm;
    }

    @NonNull
    public static ActivityGoalSleepBinding bind(@NonNull View rootView) {
        int i = R.id.picker_goal_sleep_hour;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.picker_goal_sleep_hour);
        if (wheelView != null) {
            i = R.id.picker_goal_sleep_min;
            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.picker_goal_sleep_min);
            if (wheelView2 != null) {
                i = R.id.titleBar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, R.id.titleBar);
                if (rainbowTitleBar != null) {
                    i = R.id.tv_confirm;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.tv_confirm);
                    if (button != null) {
                        return new ActivityGoalSleepBinding((LinearLayout) rootView, wheelView, wheelView2, rainbowTitleBar, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityGoalSleepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGoalSleepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_goal_sleep, parent, false);
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
