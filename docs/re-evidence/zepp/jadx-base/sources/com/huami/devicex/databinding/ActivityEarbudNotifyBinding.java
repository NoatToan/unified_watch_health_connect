package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.widget.TipComponent;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityEarbudNotifyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile callItem;

    @NonNull
    public final TipComponent callPermissionTips;

    @NonNull
    public final ListTile notifyItem;

    @NonNull
    public final ListTile smartItem;

    @NonNull
    public final ListTile smsItem;

    @NonNull
    public final FrameLayout statusContent;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private ActivityEarbudNotifyBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull TipComponent tipComponent, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull FrameLayout frameLayout, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.callItem = listTile;
        this.callPermissionTips = tipComponent;
        this.notifyItem = listTile2;
        this.smartItem = listTile3;
        this.smsItem = listTile4;
        this.statusContent = frameLayout;
        this.tvTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityEarbudNotifyBinding bind(@NonNull View view) {
        int i = R.id.call_item;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.call_permission_tips;
            TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(view, i);
            if (tipComponent != null) {
                i = R.id.notify_item;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    i = R.id.smart_item;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile3 != null) {
                        i = R.id.sms_item;
                        ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile4 != null) {
                            i = R.id.status_content;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = R.id.tv_title_bar;
                                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                if (rainbowTitleBar != null) {
                                    return new ActivityEarbudNotifyBinding((LinearLayout) view, listTile, tipComponent, listTile2, listTile3, listTile4, frameLayout, rainbowTitleBar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityEarbudNotifyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityEarbudNotifyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_earbud_notify, viewGroup, false);
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
