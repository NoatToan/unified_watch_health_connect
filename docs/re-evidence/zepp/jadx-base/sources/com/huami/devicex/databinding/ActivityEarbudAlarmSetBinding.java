package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityEarbudAlarmSetBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView alarmDelayText;

    @NonNull
    public final LinearLayout alarmTime;

    @NonNull
    public final WheelView ampmWheel;

    @NonNull
    public final WheelView hourWheel;

    @NonNull
    public final ListTile lazyItem;

    @NonNull
    public final View maskView;

    @NonNull
    public final WheelView minWheel;

    @NonNull
    public final ListTile repeatItem;

    @NonNull
    public final FrameLayout statusContent;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private ActivityEarbudAlarmSetBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull ListTile listTile, @NonNull View view, @NonNull WheelView wheelView3, @NonNull ListTile listTile2, @NonNull FrameLayout frameLayout, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = relativeLayout;
        this.alarmDelayText = textView;
        this.alarmTime = linearLayout;
        this.ampmWheel = wheelView;
        this.hourWheel = wheelView2;
        this.lazyItem = listTile;
        this.maskView = view;
        this.minWheel = wheelView3;
        this.repeatItem = listTile2;
        this.statusContent = frameLayout;
        this.tvTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityEarbudAlarmSetBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.alarm_delay_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.alarm_time;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ampm_wheel;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView != null) {
                    i = R.id.hour_wheel;
                    WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView2 != null) {
                        i = R.id.lazy_item;
                        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                            i = R.id.min_wheel;
                            WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i);
                            if (wheelView3 != null) {
                                i = R.id.repeat_item;
                                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile2 != null) {
                                    i = R.id.status_content;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = R.id.tv_title_bar;
                                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                        if (rainbowTitleBar != null) {
                                            return new ActivityEarbudAlarmSetBinding((RelativeLayout) view, textView, linearLayout, wheelView, wheelView2, listTile, viewFindChildViewById, wheelView3, listTile2, frameLayout, rainbowTitleBar);
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
    public static ActivityEarbudAlarmSetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityEarbudAlarmSetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_earbud_alarm_set, viewGroup, false);
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
