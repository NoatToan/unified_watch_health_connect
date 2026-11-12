package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentSetCalorieGoalBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView btnCancel;

    @NonNull
    public final TextView btnSave;

    @NonNull
    public final WheelView wheelCalorie;

    private FragmentSetCalorieGoalBinding(@NonNull LinearLayout rootView, @NonNull TextView btnCancel, @NonNull TextView btnSave, @NonNull WheelView wheelCalorie) {
        this.a = rootView;
        this.btnCancel = btnCancel;
        this.btnSave = btnSave;
        this.wheelCalorie = wheelCalorie;
    }

    @NonNull
    public static FragmentSetCalorieGoalBinding bind(@NonNull View rootView) {
        int i = R.id.btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.btn_cancel);
        if (textView != null) {
            i = R.id.btn_save;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.btn_save);
            if (textView2 != null) {
                i = R.id.wheel_calorie;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.wheel_calorie);
                if (wheelView != null) {
                    return new FragmentSetCalorieGoalBinding((LinearLayout) rootView, textView, textView2, wheelView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSetCalorieGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSetCalorieGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_set_calorie_goal, parent, false);
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
