package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sky.ui.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes13.dex */
public final class SkyLayoutReminderTimeBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View divider1;

    @NonNull
    public final View divider2;

    @NonNull
    public final WheelView reminderTimeAmPm;

    @NonNull
    public final WheelView reminderTimeHour;

    @NonNull
    public final WheelView reminderTimeMinute;

    private SkyLayoutReminderTimeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull WheelView wheelView3) {
        this.a = constraintLayout;
        this.divider1 = view;
        this.divider2 = view2;
        this.reminderTimeAmPm = wheelView;
        this.reminderTimeHour = wheelView2;
        this.reminderTimeMinute = wheelView3;
    }

    @NonNull
    public static SkyLayoutReminderTimeBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.divider_1;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_2))) != null) {
            i = R.id.reminder_time_am_pm;
            WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
            if (wheelView != null) {
                i = R.id.reminder_time_hour;
                WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView2 != null) {
                    i = R.id.reminder_time_minute;
                    WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView3 != null) {
                        return new SkyLayoutReminderTimeBinding((ConstraintLayout) view, viewFindChildViewById2, viewFindChildViewById, wheelView, wheelView2, wheelView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SkyLayoutReminderTimeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SkyLayoutReminderTimeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sky_layout_reminder_time, viewGroup, false);
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
