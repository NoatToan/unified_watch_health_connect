package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySkyPlaySettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile playStopSetting;

    @NonNull
    public final ListTile playTimeSetting;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivitySkyPlaySettingBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.playStopSetting = listTile;
        this.playTimeSetting = listTile2;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivitySkyPlaySettingBinding bind(@NonNull View view) {
        int i = R.id.play_stop_setting;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.play_time_setting;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null) {
                i = R.id.title_bar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                if (rainbowTitleBar != null) {
                    return new ActivitySkyPlaySettingBinding((LinearLayout) view, listTile, listTile2, rainbowTitleBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySkyPlaySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySkyPlaySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sky_play_setting, viewGroup, false);
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
