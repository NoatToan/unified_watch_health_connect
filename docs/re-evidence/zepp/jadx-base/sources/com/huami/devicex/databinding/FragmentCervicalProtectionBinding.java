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
public final class FragmentCervicalProtectionBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final ListTile headsetSettingsCervicalProtectionSwitch;

    private FragmentCervicalProtectionBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ListTile listTile) {
        this.a = linearLayoutCompat;
        this.headsetSettingsCervicalProtectionSwitch = listTile;
    }

    @NonNull
    public static FragmentCervicalProtectionBinding bind(@NonNull View view) {
        int i = R.id.headset_settings_cervical_protection_switch;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            return new FragmentCervicalProtectionBinding((LinearLayoutCompat) view, listTile);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCervicalProtectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCervicalProtectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_cervical_protection, viewGroup, false);
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
