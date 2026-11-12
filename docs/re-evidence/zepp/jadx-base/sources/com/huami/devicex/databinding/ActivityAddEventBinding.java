package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityAddEventBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final WheelView apPmWheel;

    @NonNull
    public final WheelView dateWheel;

    @NonNull
    public final View divider;

    @NonNull
    public final View divider1;

    @NonNull
    public final WheelView hourWheel;

    @NonNull
    public final WheelView minuteWheel;

    @NonNull
    public final RelativeLayout periodContainer;

    @NonNull
    public final TextView periodTv;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    @NonNull
    public final EditText remindTitleEdit;

    @NonNull
    public final LinearLayout timeContainer;

    @NonNull
    public final TextView timeTv;

    private ActivityAddEventBinding(@NonNull RelativeLayout relativeLayout, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull View view, @NonNull View view2, @NonNull WheelView wheelView3, @NonNull WheelView wheelView4, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull EditText editText, @NonNull LinearLayout linearLayout, @NonNull TextView textView2) {
        this.a = relativeLayout;
        this.apPmWheel = wheelView;
        this.dateWheel = wheelView2;
        this.divider = view;
        this.divider1 = view2;
        this.hourWheel = wheelView3;
        this.minuteWheel = wheelView4;
        this.periodContainer = relativeLayout2;
        this.periodTv = textView;
        this.rainbowTitleBar = rainbowTitleBar;
        this.remindTitleEdit = editText;
        this.timeContainer = linearLayout;
        this.timeTv = textView2;
    }

    @NonNull
    public static ActivityAddEventBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.ap_pm_wheel;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
        if (wheelView != null) {
            i = R.id.date_wheel;
            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
            if (wheelView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.divider_1))) != null) {
                i = R.id.hour_wheel;
                WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView3 != null) {
                    i = R.id.minute_wheel;
                    WheelView wheelView4 = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView4 != null) {
                        i = R.id.period_container;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.period_tv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.rainbowTitleBar;
                                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                if (rainbowTitleBar != null) {
                                    i = R.id.remind_title_edit;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                                    if (editText != null) {
                                        i = R.id.time_container;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.time_tv;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                return new ActivityAddEventBinding((RelativeLayout) view, wheelView, wheelView2, viewFindChildViewById, viewFindChildViewById2, wheelView3, wheelView4, relativeLayout, textView, rainbowTitleBar, editText, linearLayout, textView2);
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
    public static ActivityAddEventBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAddEventBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_add_event, viewGroup, false);
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
