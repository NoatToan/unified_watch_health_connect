package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.baseui.widget.ItemView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentBandSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ItemView deviceSportSettingTitle;

    @NonNull
    public final View maskView;

    @NonNull
    public final ItemView miliSettingGesScreen;

    @NonNull
    public final ItemView miliSettingOffWistLock;

    @NonNull
    public final ItemView miliSettingSetWear;

    @NonNull
    public final ItemView nightMode;

    @NonNull
    public final ItemView settingPeytoAppsTitleBand;

    @NonNull
    public final ItemView settingShotcutAppsTitle;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final ItemView watchLanguageWristband;

    private FragmentBandSettingBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout, @NonNull ItemView itemView, @NonNull View view, @NonNull ItemView itemView2, @NonNull ItemView itemView3, @NonNull ItemView itemView4, @NonNull ItemView itemView5, @NonNull ItemView itemView6, @NonNull ItemView itemView7, @NonNull Toolbar toolbar, @NonNull ItemView itemView8) {
        this.a = linearLayoutCompat;
        this.btnBack = appCompatImageView;
        this.container = frameLayout;
        this.deviceSportSettingTitle = itemView;
        this.maskView = view;
        this.miliSettingGesScreen = itemView2;
        this.miliSettingOffWistLock = itemView3;
        this.miliSettingSetWear = itemView4;
        this.nightMode = itemView5;
        this.settingPeytoAppsTitleBand = itemView6;
        this.settingShotcutAppsTitle = itemView7;
        this.toolbar = toolbar;
        this.watchLanguageWristband = itemView8;
    }

    @NonNull
    public static FragmentBandSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.device_sport_setting_title;
                ItemView itemView = (ItemView) ViewBindings.findChildViewById(view, i);
                if (itemView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                    i = R.id.mili_setting_ges_screen;
                    ItemView itemView2 = (ItemView) ViewBindings.findChildViewById(view, i);
                    if (itemView2 != null) {
                        i = R.id.mili_setting_off_wist_lock;
                        ItemView itemView3 = (ItemView) ViewBindings.findChildViewById(view, i);
                        if (itemView3 != null) {
                            i = R.id.mili_setting_set_wear;
                            ItemView itemView4 = (ItemView) ViewBindings.findChildViewById(view, i);
                            if (itemView4 != null) {
                                i = R.id.night_mode;
                                ItemView itemView5 = (ItemView) ViewBindings.findChildViewById(view, i);
                                if (itemView5 != null) {
                                    i = R.id.setting_peyto_apps_title_band;
                                    ItemView itemView6 = (ItemView) ViewBindings.findChildViewById(view, i);
                                    if (itemView6 != null) {
                                        i = R.id.setting_shotcut_apps_title;
                                        ItemView itemView7 = (ItemView) ViewBindings.findChildViewById(view, i);
                                        if (itemView7 != null) {
                                            i = R.id.toolbar;
                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                                            if (toolbar != null) {
                                                i = R.id.watch_language_wristband;
                                                ItemView itemView8 = (ItemView) ViewBindings.findChildViewById(view, i);
                                                if (itemView8 != null) {
                                                    return new FragmentBandSettingBinding((LinearLayoutCompat) view, appCompatImageView, frameLayout, itemView, viewFindChildViewById, itemView2, itemView3, itemView4, itemView5, itemView6, itemView7, toolbar, itemView8);
                                                }
                                            }
                                        }
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
    public static FragmentBandSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBandSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_band_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.a;
    }
}
