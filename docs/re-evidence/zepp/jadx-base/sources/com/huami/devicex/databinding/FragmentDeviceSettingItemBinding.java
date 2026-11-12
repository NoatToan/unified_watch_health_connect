package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentDeviceSettingItemBinding implements ViewBinding {

    @NonNull
    private final ListTile a;

    @NonNull
    public final ListTile itemView;

    private FragmentDeviceSettingItemBinding(@NonNull ListTile listTile, @NonNull ListTile listTile2) {
        this.a = listTile;
        this.itemView = listTile2;
    }

    @NonNull
    public static FragmentDeviceSettingItemBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        ListTile listTile = (ListTile) view;
        return new FragmentDeviceSettingItemBinding(listTile, listTile);
    }

    @NonNull
    public static FragmentDeviceSettingItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSettingItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_setting_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ListTile getRoot() {
        return this.a;
    }
}
