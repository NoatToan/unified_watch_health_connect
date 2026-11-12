package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes20.dex */
public final class DelayAlertTimeDialogNewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final WheelView delayTimePicker;

    @NonNull
    public final LinearLayout dialogLayout;

    @NonNull
    public final TextView timeValue;

    private DelayAlertTimeDialogNewBinding(@NonNull LinearLayout rootView, @NonNull WheelView delayTimePicker, @NonNull LinearLayout dialogLayout, @NonNull TextView timeValue) {
        this.a = rootView;
        this.delayTimePicker = delayTimePicker;
        this.dialogLayout = dialogLayout;
        this.timeValue = timeValue;
    }

    @NonNull
    public static DelayAlertTimeDialogNewBinding bind(@NonNull View rootView) {
        int i = R.id.delay_time_picker;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.delay_time_picker);
        if (wheelView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.time_value);
            if (textView != null) {
                return new DelayAlertTimeDialogNewBinding(linearLayout, wheelView, linearLayout, textView);
            }
            i = R.id.time_value;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static DelayAlertTimeDialogNewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DelayAlertTimeDialogNewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.delay_alert_time_dialog_new, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
