package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentDeviceSettingAboutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ListTile itemFwVersion;

    @NonNull
    public final ListTile itemMacAddress;

    @NonNull
    public final RainbowTitleBar toolbar;

    private FragmentDeviceSettingAboutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.itemFwVersion = listTile;
        this.itemMacAddress = listTile2;
        this.toolbar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentDeviceSettingAboutBinding bind(@NonNull View view) {
        int i = R.id.item_fw_version;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.item_mac_address;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null) {
                i = R.id.toolbar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                if (rainbowTitleBar != null) {
                    return new FragmentDeviceSettingAboutBinding((ConstraintLayout) view, listTile, listTile2, rainbowTitleBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDeviceSettingAboutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSettingAboutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_setting_about, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
