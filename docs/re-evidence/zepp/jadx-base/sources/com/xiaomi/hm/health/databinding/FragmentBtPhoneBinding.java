package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.widget.TipComponent;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentBtPhoneBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile btPhoneIv;

    @NonNull
    public final ListTile contactIv;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile delayIv;

    @NonNull
    public final ListTile delayTimeIv;

    @NonNull
    public final TipComponent permissionTips;

    @NonNull
    public final RainbowTitleBar titleBar;

    private FragmentBtPhoneBinding(@NonNull LinearLayout rootView, @NonNull ListTile btPhoneIv, @NonNull ListTile contactIv, @NonNull FrameLayout container, @NonNull ListTile delayIv, @NonNull ListTile delayTimeIv, @NonNull TipComponent permissionTips, @NonNull RainbowTitleBar titleBar) {
        this.a = rootView;
        this.btPhoneIv = btPhoneIv;
        this.contactIv = contactIv;
        this.container = container;
        this.delayIv = delayIv;
        this.delayTimeIv = delayTimeIv;
        this.permissionTips = permissionTips;
        this.titleBar = titleBar;
    }

    @NonNull
    public static FragmentBtPhoneBinding bind(@NonNull View rootView) {
        int i = R.id.bt_phone_iv;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.bt_phone_iv);
        if (listTile != null) {
            i = R.id.contact_iv;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.contact_iv);
            if (listTile2 != null) {
                i = R.id.container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (frameLayout != null) {
                    i = R.id.delay_iv;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.delay_iv);
                    if (listTile3 != null) {
                        i = R.id.delay_time_iv;
                        ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.delay_time_iv);
                        if (listTile4 != null) {
                            i = R.id.permission_tips;
                            TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(rootView, R.id.permission_tips);
                            if (tipComponent != null) {
                                i = R.id.title_bar;
                                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                                if (rainbowTitleBar != null) {
                                    return new FragmentBtPhoneBinding((LinearLayout) rootView, listTile, listTile2, frameLayout, listTile3, listTile4, tipComponent, rainbowTitleBar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBtPhoneBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentBtPhoneBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_bt_phone, parent, false);
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
