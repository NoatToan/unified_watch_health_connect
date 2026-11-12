package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolAlarmBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolAlarm;

    @NonNull
    public final AppCompatTextView toolAlarmAdd;

    @NonNull
    public final AppCompatImageView toolAlarmAddIcon;

    @NonNull
    public final ConstraintLayout toolAlarmMore;

    @NonNull
    public final AppCompatTextView toolAlarmNotActive;

    @NonNull
    public final RecyclerView toolAlarmRecycler;

    @NonNull
    public final AppCompatTextView toolAlarmSubTitle;

    @NonNull
    public final AppCompatTextView toolNoAlarm;

    private LayoutToolAlarmBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolAlarm, @NonNull AppCompatTextView toolAlarmAdd, @NonNull AppCompatImageView toolAlarmAddIcon, @NonNull ConstraintLayout toolAlarmMore, @NonNull AppCompatTextView toolAlarmNotActive, @NonNull RecyclerView toolAlarmRecycler, @NonNull AppCompatTextView toolAlarmSubTitle, @NonNull AppCompatTextView toolNoAlarm) {
        this.a = rootView;
        this.toolAlarm = toolAlarm;
        this.toolAlarmAdd = toolAlarmAdd;
        this.toolAlarmAddIcon = toolAlarmAddIcon;
        this.toolAlarmMore = toolAlarmMore;
        this.toolAlarmNotActive = toolAlarmNotActive;
        this.toolAlarmRecycler = toolAlarmRecycler;
        this.toolAlarmSubTitle = toolAlarmSubTitle;
        this.toolNoAlarm = toolNoAlarm;
    }

    @NonNull
    public static LayoutToolAlarmBinding bind(@NonNull View rootView) {
        int i = R.id.tool_alarm;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm);
        if (appCompatTextView != null) {
            i = R.id.tool_alarm_add;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_add);
            if (appCompatTextView2 != null) {
                i = R.id.tool_alarm_add_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_add_icon);
                if (appCompatImageView != null) {
                    i = R.id.tool_alarm_more;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_more);
                    if (constraintLayout != null) {
                        i = R.id.tool_alarm_not_active;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_not_active);
                        if (appCompatTextView3 != null) {
                            i = R.id.tool_alarm_recycler;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_recycler);
                            if (recyclerView != null) {
                                i = R.id.tool_alarm_sub_title;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_alarm_sub_title);
                                if (appCompatTextView4 != null) {
                                    i = R.id.tool_no_alarm;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_no_alarm);
                                    if (appCompatTextView5 != null) {
                                        return new LayoutToolAlarmBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2, appCompatImageView, constraintLayout, appCompatTextView3, recyclerView, appCompatTextView4, appCompatTextView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolAlarmBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolAlarmBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_alarm, parent, false);
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
