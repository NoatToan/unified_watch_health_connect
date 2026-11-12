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

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolReminderItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolReminderSubTitle;

    @NonNull
    public final AppCompatTextView toolReminderTitle;

    private LayoutToolReminderItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolReminderSubTitle, @NonNull AppCompatTextView toolReminderTitle) {
        this.a = rootView;
        this.toolReminderSubTitle = toolReminderSubTitle;
        this.toolReminderTitle = toolReminderTitle;
    }

    @NonNull
    public static LayoutToolReminderItemBinding bind(@NonNull View rootView) {
        int i = R.id.tool_reminder_sub_title;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_reminder_sub_title);
        if (appCompatTextView != null) {
            i = R.id.tool_reminder_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_reminder_title);
            if (appCompatTextView2 != null) {
                return new LayoutToolReminderItemBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolReminderItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolReminderItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_reminder_item, parent, false);
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
