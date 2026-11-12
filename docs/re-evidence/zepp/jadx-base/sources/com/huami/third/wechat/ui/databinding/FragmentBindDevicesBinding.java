package com.huami.third.wechat.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.third.wechat.ui.R;

/* JADX INFO: loaded from: classes14.dex */
public final class FragmentBindDevicesBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListView listDevices;

    @NonNull
    public final RainbowTitleBar titleBar;

    private FragmentBindDevicesBinding(@NonNull LinearLayout linearLayout, @NonNull ListView listView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.listDevices = listView;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentBindDevicesBinding bind(@NonNull View view) {
        int i = R.id.list_devices;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
        if (listView != null) {
            i = R.id.title_bar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
            if (rainbowTitleBar != null) {
                return new FragmentBindDevicesBinding((LinearLayout) view, listView, rainbowTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBindDevicesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBindDevicesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bind_devices, viewGroup, false);
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
