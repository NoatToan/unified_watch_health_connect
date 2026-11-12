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
public final class ViewIncommingCallSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile delayItv;

    @NonNull
    public final ListTile delayTimeItv;

    @NonNull
    public final ListTile showDialInfoItv;

    private ViewIncommingCallSettingBinding(@NonNull LinearLayout rootView, @NonNull ListTile delayItv, @NonNull ListTile delayTimeItv, @NonNull ListTile showDialInfoItv) {
        this.a = rootView;
        this.delayItv = delayItv;
        this.delayTimeItv = delayTimeItv;
        this.showDialInfoItv = showDialInfoItv;
    }

    @NonNull
    public static ViewIncommingCallSettingBinding bind(@NonNull View rootView) {
        int i = R.id.delay_itv;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.delay_itv);
        if (listTile != null) {
            i = R.id.delay_time_itv;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.delay_time_itv);
            if (listTile2 != null) {
                i = R.id.show_dial_info_itv;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.show_dial_info_itv);
                if (listTile3 != null) {
                    return new ViewIncommingCallSettingBinding((LinearLayout) rootView, listTile, listTile2, listTile3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewIncommingCallSettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewIncommingCallSettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_incomming_call_setting, parent, false);
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
