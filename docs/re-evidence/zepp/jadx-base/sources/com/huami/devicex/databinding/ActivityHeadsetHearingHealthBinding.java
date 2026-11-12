package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHeadsetHearingHealthBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile itemHeadsetSettingsHearingHealth;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    @NonNull
    public final ViewStub viewstubHeadsetHearingHealthOff;

    @NonNull
    public final ViewStub viewstubHeadsetHearingHealthOn;

    private ActivityHeadsetHearingHealthBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull ViewStub viewStub, @NonNull ViewStub viewStub2) {
        this.a = linearLayout;
        this.container = frameLayout;
        this.itemHeadsetSettingsHearingHealth = listTile;
        this.rainbowTitleBar = rainbowTitleBar;
        this.viewstubHeadsetHearingHealthOff = viewStub;
        this.viewstubHeadsetHearingHealthOn = viewStub2;
    }

    @NonNull
    public static ActivityHeadsetHearingHealthBinding bind(@NonNull View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.item_headset_settings_hearing_health;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                i = R.id.rainbowTitleBar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                if (rainbowTitleBar != null) {
                    i = R.id.viewstub_headset_hearing_health_off;
                    ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                    if (viewStub != null) {
                        i = R.id.viewstub_headset_hearing_health_on;
                        ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(view, i);
                        if (viewStub2 != null) {
                            return new ActivityHeadsetHearingHealthBinding((LinearLayout) view, frameLayout, listTile, rainbowTitleBar, viewStub, viewStub2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHeadsetHearingHealthBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHeadsetHearingHealthBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_headset_hearing_health, viewGroup, false);
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
