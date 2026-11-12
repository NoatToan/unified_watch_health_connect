package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySetAlarmBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView alarmDelayText;

    @NonNull
    public final LinearLayout alarmTime;

    @NonNull
    public final WheelView ampmWheel;

    @NonNull
    public final View divider;

    @NonNull
    public final WheelView hourWheel;

    @NonNull
    public final ListTile lazyItem;

    @NonNull
    public final WheelView minWheel;

    @NonNull
    public final ListTile repeatItem;

    @NonNull
    public final ListTile smartItem;

    private ActivitySetAlarmBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull WheelView wheelView, @NonNull View view, @NonNull WheelView wheelView2, @NonNull ListTile listTile, @NonNull WheelView wheelView3, @NonNull ListTile listTile2, @NonNull ListTile listTile3) {
        this.a = relativeLayout;
        this.alarmDelayText = textView;
        this.alarmTime = linearLayout;
        this.ampmWheel = wheelView;
        this.divider = view;
        this.hourWheel = wheelView2;
        this.lazyItem = listTile;
        this.minWheel = wheelView3;
        this.repeatItem = listTile2;
        this.smartItem = listTile3;
    }

    @NonNull
    public static ActivitySetAlarmBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.alarm_delay_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.alarm_time;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ampm_wheel;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
                    i = R.id.hour_wheel;
                    WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView2 != null) {
                        i = R.id.lazy_item;
                        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile != null) {
                            i = R.id.min_wheel;
                            WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i);
                            if (wheelView3 != null) {
                                i = R.id.repeat_item;
                                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile2 != null) {
                                    i = R.id.smart_item;
                                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile3 != null) {
                                        return new ActivitySetAlarmBinding((RelativeLayout) view, textView, linearLayout, wheelView, viewFindChildViewById, wheelView2, listTile, wheelView3, listTile2, listTile3);
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
    public static ActivitySetAlarmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySetAlarmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_set_alarm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
