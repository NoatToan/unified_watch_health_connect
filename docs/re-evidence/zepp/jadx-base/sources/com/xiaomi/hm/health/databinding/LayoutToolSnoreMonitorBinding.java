package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolSnoreMonitorBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolSnoreMonitor;

    @NonNull
    public final Button toolSnoreMonitorCheck;

    @NonNull
    public final AppCompatTextView toolSnoreMonitorDate;

    @NonNull
    public final AppCompatTextView toolSnoreMonitorPrompt;

    @NonNull
    public final AppCompatImageView toolSnoreMonitorStatus;

    @NonNull
    public final AppCompatTextView toolSnoreMonitorTitle;

    private LayoutToolSnoreMonitorBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolSnoreMonitor, @NonNull Button toolSnoreMonitorCheck, @NonNull AppCompatTextView toolSnoreMonitorDate, @NonNull AppCompatTextView toolSnoreMonitorPrompt, @NonNull AppCompatImageView toolSnoreMonitorStatus, @NonNull AppCompatTextView toolSnoreMonitorTitle) {
        this.a = rootView;
        this.toolSnoreMonitor = toolSnoreMonitor;
        this.toolSnoreMonitorCheck = toolSnoreMonitorCheck;
        this.toolSnoreMonitorDate = toolSnoreMonitorDate;
        this.toolSnoreMonitorPrompt = toolSnoreMonitorPrompt;
        this.toolSnoreMonitorStatus = toolSnoreMonitorStatus;
        this.toolSnoreMonitorTitle = toolSnoreMonitorTitle;
    }

    @NonNull
    public static LayoutToolSnoreMonitorBinding bind(@NonNull View rootView) {
        int i = R.id.tool_snore_monitor;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_snore_monitor);
        if (appCompatTextView != null) {
            i = R.id.tool_snore_monitor_check;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.tool_snore_monitor_check);
            if (button != null) {
                i = R.id.tool_snore_monitor_date;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_snore_monitor_date);
                if (appCompatTextView2 != null) {
                    i = R.id.tool_snore_monitor_prompt;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_snore_monitor_prompt);
                    if (appCompatTextView3 != null) {
                        i = R.id.tool_snore_monitor_status;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_snore_monitor_status);
                        if (appCompatImageView != null) {
                            i = R.id.tool_snore_monitor_title;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_snore_monitor_title);
                            if (appCompatTextView4 != null) {
                                return new LayoutToolSnoreMonitorBinding((ConstraintLayout) rootView, appCompatTextView, button, appCompatTextView2, appCompatTextView3, appCompatImageView, appCompatTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolSnoreMonitorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolSnoreMonitorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_snore_monitor, parent, false);
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
