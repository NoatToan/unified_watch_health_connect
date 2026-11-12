package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes7.dex */
public final class TimeSelectorWheelViewBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final TextView btnCancel;

    @NonNull
    public final TextView btnYes;

    @NonNull
    public final Space space1;

    @NonNull
    public final Space space2;

    @NonNull
    public final Space space3;

    @NonNull
    public final TextView timeSelectorTitle;

    @NonNull
    public final WheelView wheelViewAmPm;

    @NonNull
    public final WheelView wheelViewHour;

    @NonNull
    public final WheelView wheelViewMinute;

    private TimeSelectorWheelViewBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Space space, @NonNull Space space2, @NonNull Space space3, @NonNull TextView textView3, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull WheelView wheelView3) {
        this.a = frameLayout;
        this.btnCancel = textView;
        this.btnYes = textView2;
        this.space1 = space;
        this.space2 = space2;
        this.space3 = space3;
        this.timeSelectorTitle = textView3;
        this.wheelViewAmPm = wheelView;
        this.wheelViewHour = wheelView2;
        this.wheelViewMinute = wheelView3;
    }

    @NonNull
    public static TimeSelectorWheelViewBinding bind(@NonNull View view) {
        int i = R.id.btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btn_yes;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.space1;
                Space space = (Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    i = R.id.space2;
                    Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                    if (space2 != null) {
                        i = R.id.space3;
                        Space space3 = (Space) ViewBindings.findChildViewById(view, i);
                        if (space3 != null) {
                            i = R.id.time_selector_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.wheelView_am_pm;
                                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                                if (wheelView != null) {
                                    i = R.id.wheelView_hour;
                                    WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                                    if (wheelView2 != null) {
                                        i = R.id.wheelView_minute;
                                        WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i);
                                        if (wheelView3 != null) {
                                            return new TimeSelectorWheelViewBinding((FrameLayout) view, textView, textView2, space, space2, space3, textView3, wheelView, wheelView2, wheelView3);
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
    public static TimeSelectorWheelViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TimeSelectorWheelViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.time_selector_wheel_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
