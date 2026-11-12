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
public final class ActivityAntiTheftRemindBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile disNotifyIv;

    @NonNull
    public final ListTile disNotifyStartIv;

    @NonNull
    public final ListTile disNotifyStopIv;

    @NonNull
    public final ListTile vibrateModeIv;

    private ActivityAntiTheftRemindBinding(@NonNull LinearLayout rootView, @NonNull ListTile disNotifyIv, @NonNull ListTile disNotifyStartIv, @NonNull ListTile disNotifyStopIv, @NonNull ListTile vibrateModeIv) {
        this.a = rootView;
        this.disNotifyIv = disNotifyIv;
        this.disNotifyStartIv = disNotifyStartIv;
        this.disNotifyStopIv = disNotifyStopIv;
        this.vibrateModeIv = vibrateModeIv;
    }

    @NonNull
    public static ActivityAntiTheftRemindBinding bind(@NonNull View rootView) {
        int i = R.id.dis_notify_iv;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.dis_notify_iv);
        if (listTile != null) {
            i = R.id.dis_notify_start_iv;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.dis_notify_start_iv);
            if (listTile2 != null) {
                i = R.id.dis_notify_stop_iv;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.dis_notify_stop_iv);
                if (listTile3 != null) {
                    i = R.id.vibrate_mode_iv;
                    ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.vibrate_mode_iv);
                    if (listTile4 != null) {
                        return new ActivityAntiTheftRemindBinding((LinearLayout) rootView, listTile, listTile2, listTile3, listTile4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAntiTheftRemindBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAntiTheftRemindBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_anti_theft_remind, parent, false);
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
