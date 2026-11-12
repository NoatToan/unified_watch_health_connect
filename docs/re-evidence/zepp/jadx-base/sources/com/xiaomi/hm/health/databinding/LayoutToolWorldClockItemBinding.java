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
import com.xiaomi.hm.health.view.ClockView;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolWorldClockItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolClockCity;

    @NonNull
    public final AppCompatTextView toolClockTime;

    @NonNull
    public final ClockView toolClockView;

    private LayoutToolWorldClockItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolClockCity, @NonNull AppCompatTextView toolClockTime, @NonNull ClockView toolClockView) {
        this.a = rootView;
        this.toolClockCity = toolClockCity;
        this.toolClockTime = toolClockTime;
        this.toolClockView = toolClockView;
    }

    @NonNull
    public static LayoutToolWorldClockItemBinding bind(@NonNull View rootView) {
        int i = R.id.tool_clock_city;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_clock_city);
        if (appCompatTextView != null) {
            i = R.id.tool_clock_time;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_clock_time);
            if (appCompatTextView2 != null) {
                i = R.id.tool_clock_view;
                ClockView clockView = (ClockView) ViewBindings.findChildViewById(rootView, R.id.tool_clock_view);
                if (clockView != null) {
                    return new LayoutToolWorldClockItemBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2, clockView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolWorldClockItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolWorldClockItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_world_clock_item, parent, false);
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
