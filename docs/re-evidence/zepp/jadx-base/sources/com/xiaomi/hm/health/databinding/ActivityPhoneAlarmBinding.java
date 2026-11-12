package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityPhoneAlarmBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile phoneAlarmEnable;

    @NonNull
    public final ListTile vibrateModeIv;

    private ActivityPhoneAlarmBinding(@NonNull LinearLayout rootView, @NonNull ListTile phoneAlarmEnable, @NonNull ListTile vibrateModeIv) {
        this.a = rootView;
        this.phoneAlarmEnable = phoneAlarmEnable;
        this.vibrateModeIv = vibrateModeIv;
    }

    @NonNull
    public static ActivityPhoneAlarmBinding bind(@NonNull View rootView) {
        int i = R.id.phone_alarm_enable;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.phone_alarm_enable);
        if (listTile != null) {
            i = R.id.vibrate_mode_iv;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.vibrate_mode_iv);
            if (listTile2 != null) {
                return new ActivityPhoneAlarmBinding((LinearLayout) rootView, listTile, listTile2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPhoneAlarmBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPhoneAlarmBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_phone_alarm, parent, false);
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
