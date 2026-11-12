package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySkySleepReminderBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final SkyLayoutReminderNotificationBinding reminderNotification;

    @NonNull
    public final AppCompatTextView reminderRepeat;

    @NonNull
    public final RecyclerView reminderRepeatRecycler;

    @NonNull
    public final AppCompatTextView reminderSave;

    @NonNull
    public final ScrollView reminderScrollView;

    @NonNull
    public final AppCompatTextView reminderSelectTime;

    @NonNull
    public final SkyLayoutReminderTimeBinding reminderSelectTimeLayout;

    @NonNull
    public final AppCompatTextView reminderSetLater;

    @NonNull
    public final AppCompatTextView reminderSubTitle;

    @NonNull
    public final AppCompatTextView reminderTitle;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivitySkySleepReminderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SkyLayoutReminderNotificationBinding skyLayoutReminderNotificationBinding, @NonNull AppCompatTextView appCompatTextView, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView2, @NonNull ScrollView scrollView, @NonNull AppCompatTextView appCompatTextView3, @NonNull SkyLayoutReminderTimeBinding skyLayoutReminderTimeBinding, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.reminderNotification = skyLayoutReminderNotificationBinding;
        this.reminderRepeat = appCompatTextView;
        this.reminderRepeatRecycler = recyclerView;
        this.reminderSave = appCompatTextView2;
        this.reminderScrollView = scrollView;
        this.reminderSelectTime = appCompatTextView3;
        this.reminderSelectTimeLayout = skyLayoutReminderTimeBinding;
        this.reminderSetLater = appCompatTextView4;
        this.reminderSubTitle = appCompatTextView5;
        this.reminderTitle = appCompatTextView6;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivitySkySleepReminderBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.reminder_notification;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            SkyLayoutReminderNotificationBinding skyLayoutReminderNotificationBindingBind = SkyLayoutReminderNotificationBinding.bind(viewFindChildViewById2);
            i = R.id.reminder_repeat;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.reminder_repeat_recycler;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.reminder_save;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = R.id.reminder_scroll_view;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                        if (scrollView != null) {
                            i = R.id.reminder_select_time;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.reminder_select_time_layout))) != null) {
                                SkyLayoutReminderTimeBinding skyLayoutReminderTimeBindingBind = SkyLayoutReminderTimeBinding.bind(viewFindChildViewById);
                                i = R.id.reminder_set_later;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    i = R.id.reminder_sub_title;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView5 != null) {
                                        i = R.id.reminder_title;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView6 != null) {
                                            i = R.id.title_bar;
                                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                            if (rainbowTitleBar != null) {
                                                return new ActivitySkySleepReminderBinding((ConstraintLayout) view, skyLayoutReminderNotificationBindingBind, appCompatTextView, recyclerView, appCompatTextView2, scrollView, appCompatTextView3, skyLayoutReminderTimeBindingBind, appCompatTextView4, appCompatTextView5, appCompatTextView6, rainbowTitleBar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySkySleepReminderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySkySleepReminderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sky_sleep_reminder, viewGroup, false);
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
