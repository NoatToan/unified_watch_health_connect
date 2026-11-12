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
import com.huami.lib.view.widget.TipComponent;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivitySmAlertBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile smContact;

    @NonNull
    public final ListTile smEnable;

    @NonNull
    public final ListTile smStrange;

    @NonNull
    public final TipComponent tipSmsPer;

    @NonNull
    public final ListTile vibrateModeIv;

    private ActivitySmAlertBinding(@NonNull LinearLayout rootView, @NonNull ListTile smContact, @NonNull ListTile smEnable, @NonNull ListTile smStrange, @NonNull TipComponent tipSmsPer, @NonNull ListTile vibrateModeIv) {
        this.a = rootView;
        this.smContact = smContact;
        this.smEnable = smEnable;
        this.smStrange = smStrange;
        this.tipSmsPer = tipSmsPer;
        this.vibrateModeIv = vibrateModeIv;
    }

    @NonNull
    public static ActivitySmAlertBinding bind(@NonNull View rootView) {
        int i = R.id.sm_contact;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.sm_contact);
        if (listTile != null) {
            i = R.id.sm_enable;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.sm_enable);
            if (listTile2 != null) {
                i = R.id.sm_strange;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.sm_strange);
                if (listTile3 != null) {
                    i = R.id.tip_sms_per;
                    TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(rootView, R.id.tip_sms_per);
                    if (tipComponent != null) {
                        i = R.id.vibrate_mode_iv;
                        ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.vibrate_mode_iv);
                        if (listTile4 != null) {
                            return new ActivitySmAlertBinding((LinearLayout) rootView, listTile, listTile2, listTile3, tipComponent, listTile4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySmAlertBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySmAlertBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sm_alert, parent, false);
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
