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
public final class ViewBtphoneSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile delayIv;

    @NonNull
    public final ListTile delayTimeIv;

    private ViewBtphoneSettingBinding(@NonNull LinearLayout rootView, @NonNull ListTile delayIv, @NonNull ListTile delayTimeIv) {
        this.a = rootView;
        this.delayIv = delayIv;
        this.delayTimeIv = delayTimeIv;
    }

    @NonNull
    public static ViewBtphoneSettingBinding bind(@NonNull View rootView) {
        int i = R.id.delay_iv;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.delay_iv);
        if (listTile != null) {
            i = R.id.delay_time_iv;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.delay_time_iv);
            if (listTile2 != null) {
                return new ViewBtphoneSettingBinding((LinearLayout) rootView, listTile, listTile2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewBtphoneSettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewBtphoneSettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_btphone_setting, parent, false);
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
