package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.widget.TipComponent;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySmAlertByNotificationBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile smEnable;

    @NonNull
    public final TipComponent smTip;

    @NonNull
    public final ListTile smVibrate;

    private ActivitySmAlertByNotificationBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull TipComponent tipComponent, @NonNull ListTile listTile2) {
        this.a = linearLayout;
        this.smEnable = listTile;
        this.smTip = tipComponent;
        this.smVibrate = listTile2;
    }

    @NonNull
    public static ActivitySmAlertByNotificationBinding bind(@NonNull View view) {
        int i = R.id.sm_enable;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.sm_tip;
            TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(view, i);
            if (tipComponent != null) {
                i = R.id.sm_vibrate;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    return new ActivitySmAlertByNotificationBinding((LinearLayout) view, listTile, tipComponent, listTile2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySmAlertByNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySmAlertByNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sm_alert_by_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
