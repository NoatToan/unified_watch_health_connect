package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityWeightAboutBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final ListTile firmwareVersion;

    @NonNull
    public final ListTile macAddress;

    @NonNull
    public final ListTile wifiVersion;

    private ActivityWeightAboutBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3) {
        this.a = linearLayoutCompat;
        this.firmwareVersion = listTile;
        this.macAddress = listTile2;
        this.wifiVersion = listTile3;
    }

    @NonNull
    public static ActivityWeightAboutBinding bind(@NonNull View view) {
        int i = R.id.firmware_version;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.mac_address;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null) {
                i = R.id.wifi_version;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile3 != null) {
                    return new ActivityWeightAboutBinding((LinearLayoutCompat) view, listTile, listTile2, listTile3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWeightAboutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWeightAboutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_weight_about, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.a;
    }
}
