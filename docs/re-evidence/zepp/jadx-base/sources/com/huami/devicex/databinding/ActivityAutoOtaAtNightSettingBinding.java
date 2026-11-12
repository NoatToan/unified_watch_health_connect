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

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityAutoOtaAtNightSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RainbowTitleBar actionBar;

    @NonNull
    public final FrameLayout autoOtaAtNightSettingTipsContainer;

    @NonNull
    public final ListTile autoOtaAtNightSwitch;

    private ActivityAutoOtaAtNightSettingBinding(@NonNull LinearLayout linearLayout, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile) {
        this.a = linearLayout;
        this.actionBar = rainbowTitleBar;
        this.autoOtaAtNightSettingTipsContainer = frameLayout;
        this.autoOtaAtNightSwitch = listTile;
    }

    @NonNull
    public static ActivityAutoOtaAtNightSettingBinding bind(@NonNull View view) {
        int i = R.id.action_bar;
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
        if (rainbowTitleBar != null) {
            i = R.id.auto_ota_at_night_setting_tips_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.auto_ota_at_night_switch;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    return new ActivityAutoOtaAtNightSettingBinding((LinearLayout) view, rainbowTitleBar, frameLayout, listTile);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAutoOtaAtNightSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAutoOtaAtNightSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_auto_ota_at_night_setting, viewGroup, false);
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
