package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityNightSettingModeBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ListTile modeSettingNight;

    @NonNull
    public final ListTile modeSettingNormal;

    @NonNull
    public final ListTile modeSettingSystem;

    @NonNull
    public final RainbowTitleBar modeSettingTitleBar;

    private ActivityNightSettingModeBinding(@NonNull ConstraintLayout rootView, @NonNull ListTile modeSettingNight, @NonNull ListTile modeSettingNormal, @NonNull ListTile modeSettingSystem, @NonNull RainbowTitleBar modeSettingTitleBar) {
        this.a = rootView;
        this.modeSettingNight = modeSettingNight;
        this.modeSettingNormal = modeSettingNormal;
        this.modeSettingSystem = modeSettingSystem;
        this.modeSettingTitleBar = modeSettingTitleBar;
    }

    @NonNull
    public static ActivityNightSettingModeBinding bind(@NonNull View rootView) {
        int i = R.id.mode_setting_night;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.mode_setting_night);
        if (listTile != null) {
            i = R.id.mode_setting_normal;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.mode_setting_normal);
            if (listTile2 != null) {
                i = R.id.mode_setting_system;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.mode_setting_system);
                if (listTile3 != null) {
                    i = R.id.mode_setting_title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, R.id.mode_setting_title_bar);
                    if (rainbowTitleBar != null) {
                        return new ActivityNightSettingModeBinding((ConstraintLayout) rootView, listTile, listTile2, listTile3, rainbowTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityNightSettingModeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityNightSettingModeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_night_setting_mode, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
