package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.view.SwitchButton;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolAlarmItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolAlarmAmPm;

    @NonNull
    public final SwitchButton toolAlarmEnable;

    @NonNull
    public final AppCompatTextView toolAlarmRepeat;

    @NonNull
    public final AppCompatTextView toolAlarmTime;

    private LayoutToolAlarmItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolAlarmAmPm, @NonNull SwitchButton toolAlarmEnable, @NonNull AppCompatTextView toolAlarmRepeat, @NonNull AppCompatTextView toolAlarmTime) {
        this.a = rootView;
        this.toolAlarmAmPm = toolAlarmAmPm;
        this.toolAlarmEnable = toolAlarmEnable;
        this.toolAlarmRepeat = toolAlarmRepeat;
        this.toolAlarmTime = toolAlarmTime;
    }

    @NonNull
    public static LayoutToolAlarmItemBinding bind(@NonNull View rootView) {
        int i = R.id.tool_alarm_am_pm;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_am_pm);
        if (appCompatTextView != null) {
            i = R.id.tool_alarm_enable;
            SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_enable);
            if (switchButton != null) {
                i = R.id.tool_alarm_repeat;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_repeat);
                if (appCompatTextView2 != null) {
                    i = R.id.tool_alarm_time;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_time);
                    if (appCompatTextView3 != null) {
                        return new LayoutToolAlarmItemBinding((ConstraintLayout) rootView, appCompatTextView, switchButton, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolAlarmItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolAlarmItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_alarm_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
