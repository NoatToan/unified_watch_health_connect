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
public final class ActivitySkySettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile reminderSetting;

    @NonNull
    public final ListTile scienceIntro;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final ListTile userFeedback;

    @NonNull
    public final ListTile watchClock;

    private ActivitySkySettingBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull ListTile listTile3, @NonNull ListTile listTile4) {
        this.a = linearLayout;
        this.reminderSetting = listTile;
        this.scienceIntro = listTile2;
        this.titleBar = rainbowTitleBar;
        this.userFeedback = listTile3;
        this.watchClock = listTile4;
    }

    @NonNull
    public static ActivitySkySettingBinding bind(@NonNull View view) {
        int i = R.id.reminder_setting;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.science_intro;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null) {
                i = R.id.title_bar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                if (rainbowTitleBar != null) {
                    i = R.id.user_feedback;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile3 != null) {
                        i = R.id.watch_clock;
                        ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile4 != null) {
                            return new ActivitySkySettingBinding((LinearLayout) view, listTile, listTile2, rainbowTitleBar, listTile3, listTile4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySkySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySkySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sky_setting, viewGroup, false);
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
