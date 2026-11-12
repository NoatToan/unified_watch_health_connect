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
import com.huami.lib.view.ItemView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHrSettingScreenBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ItemView allDayPressureItem;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ItemView hrAlertItem;

    @NonNull
    public final ItemView hrAlertValueItem;

    @NonNull
    public final ItemView hrDetectItem;

    @NonNull
    public final ItemView hrFreqItem;

    @NonNull
    public final ItemView spo2OsaItem;

    @NonNull
    public final ItemView sportDetectItem;

    private ActivityHrSettingScreenBinding(@NonNull LinearLayout linearLayout, @NonNull ItemView itemView, @NonNull FrameLayout frameLayout, @NonNull ItemView itemView2, @NonNull ItemView itemView3, @NonNull ItemView itemView4, @NonNull ItemView itemView5, @NonNull ItemView itemView6, @NonNull ItemView itemView7) {
        this.a = linearLayout;
        this.allDayPressureItem = itemView;
        this.container = frameLayout;
        this.hrAlertItem = itemView2;
        this.hrAlertValueItem = itemView3;
        this.hrDetectItem = itemView4;
        this.hrFreqItem = itemView5;
        this.spo2OsaItem = itemView6;
        this.sportDetectItem = itemView7;
    }

    @NonNull
    public static ActivityHrSettingScreenBinding bind(@NonNull View view) {
        int i = R.id.all_day_pressure_item;
        ItemView itemView = (ItemView) ViewBindings.findChildViewById(view, i);
        if (itemView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.hr_alert_item;
                ItemView itemView2 = (ItemView) ViewBindings.findChildViewById(view, i);
                if (itemView2 != null) {
                    i = R.id.hr_alert_value_item;
                    ItemView itemView3 = (ItemView) ViewBindings.findChildViewById(view, i);
                    if (itemView3 != null) {
                        i = R.id.hr_detect_item;
                        ItemView itemView4 = (ItemView) ViewBindings.findChildViewById(view, i);
                        if (itemView4 != null) {
                            i = R.id.hr_freq_item;
                            ItemView itemView5 = (ItemView) ViewBindings.findChildViewById(view, i);
                            if (itemView5 != null) {
                                i = R.id.spo2_osa_item;
                                ItemView itemView6 = (ItemView) ViewBindings.findChildViewById(view, i);
                                if (itemView6 != null) {
                                    i = R.id.sport_detect_item;
                                    ItemView itemView7 = (ItemView) ViewBindings.findChildViewById(view, i);
                                    if (itemView7 != null) {
                                        return new ActivityHrSettingScreenBinding((LinearLayout) view, itemView, frameLayout, itemView2, itemView3, itemView4, itemView5, itemView6, itemView7);
                                    }
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
    public static ActivityHrSettingScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHrSettingScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_hr_setting_screen, viewGroup, false);
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
