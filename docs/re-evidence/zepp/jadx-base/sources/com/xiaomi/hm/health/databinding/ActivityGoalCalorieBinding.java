package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityGoalCalorieBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final LinearLayout calorieGoalTip;

    @NonNull
    public final LinearLayout calorieMask;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final WheelView pickerGoalCalorie;

    @NonNull
    public final Button tvConfirm;

    private ActivityGoalCalorieBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout calorieGoalTip, @NonNull LinearLayout calorieMask, @NonNull FrameLayout container, @NonNull WheelView pickerGoalCalorie, @NonNull Button tvConfirm) {
        this.a = rootView;
        this.calorieGoalTip = calorieGoalTip;
        this.calorieMask = calorieMask;
        this.container = container;
        this.pickerGoalCalorie = pickerGoalCalorie;
        this.tvConfirm = tvConfirm;
    }

    @NonNull
    public static ActivityGoalCalorieBinding bind(@NonNull View rootView) {
        int i = R.id.calorie_goal_tip;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.calorie_goal_tip);
        if (linearLayout != null) {
            i = R.id.calorie_mask;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.calorie_mask);
            if (linearLayout2 != null) {
                i = R.id.container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (frameLayout != null) {
                    i = R.id.picker_goal_calorie;
                    WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.picker_goal_calorie);
                    if (wheelView != null) {
                        i = R.id.tv_confirm;
                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.tv_confirm);
                        if (button != null) {
                            return new ActivityGoalCalorieBinding((FrameLayout) rootView, linearLayout, linearLayout2, frameLayout, wheelView, button);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityGoalCalorieBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGoalCalorieBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_goal_calorie, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
