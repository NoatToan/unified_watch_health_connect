package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityWeightSettingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ListTile amazfitScaleAboutDevice;

    @NonNull
    public final ListTile bodyAnalyseLayout;

    @NonNull
    public final DeviceSettingHeaderBinding deviceStatusWrapper;

    @NonNull
    public final LinearLayout llPar1;

    @NonNull
    public final LinearLayout llPar2;

    @NonNull
    public final ListTile macAddress;

    @NonNull
    public final ListTile memberLayout;

    @NonNull
    public final ListTile miliSettingFaqItem;

    @NonNull
    public final NestedScrollView scrollContent;

    @NonNull
    public final ListTile showSettingLayout;

    @NonNull
    public final ListTile testAlgoLayout;

    @NonNull
    public final ListTile testLayout;

    @NonNull
    public final RainbowTitleBar toolbar;

    @NonNull
    public final ListTile unitSetLayout;

    @NonNull
    public final ListTile weightPressureLayout;

    @NonNull
    public final ListTile weightSettingEraseData;

    @NonNull
    public final ListTile weightSettingFirmwareUpgrade;

    @NonNull
    public final ListTile weightSettingFirmwareVersion;

    @NonNull
    public final ListTile weightSettingHelp;

    @NonNull
    public final ListTile weightSettingMerge;

    @NonNull
    public final ListTile weightSettingSmartWeight;

    @NonNull
    public final AppCompatButton weightSettingUnbind;

    @NonNull
    public final ListTile wifiSetLayout;

    private ActivityWeightSettingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull DeviceSettingHeaderBinding deviceSettingHeaderBinding, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5, @NonNull NestedScrollView nestedScrollView, @NonNull ListTile listTile6, @NonNull ListTile listTile7, @NonNull ListTile listTile8, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull ListTile listTile9, @NonNull ListTile listTile10, @NonNull ListTile listTile11, @NonNull ListTile listTile12, @NonNull ListTile listTile13, @NonNull ListTile listTile14, @NonNull ListTile listTile15, @NonNull ListTile listTile16, @NonNull AppCompatButton appCompatButton, @NonNull ListTile listTile17) {
        this.a = constraintLayout;
        this.amazfitScaleAboutDevice = listTile;
        this.bodyAnalyseLayout = listTile2;
        this.deviceStatusWrapper = deviceSettingHeaderBinding;
        this.llPar1 = linearLayout;
        this.llPar2 = linearLayout2;
        this.macAddress = listTile3;
        this.memberLayout = listTile4;
        this.miliSettingFaqItem = listTile5;
        this.scrollContent = nestedScrollView;
        this.showSettingLayout = listTile6;
        this.testAlgoLayout = listTile7;
        this.testLayout = listTile8;
        this.toolbar = rainbowTitleBar;
        this.unitSetLayout = listTile9;
        this.weightPressureLayout = listTile10;
        this.weightSettingEraseData = listTile11;
        this.weightSettingFirmwareUpgrade = listTile12;
        this.weightSettingFirmwareVersion = listTile13;
        this.weightSettingHelp = listTile14;
        this.weightSettingMerge = listTile15;
        this.weightSettingSmartWeight = listTile16;
        this.weightSettingUnbind = appCompatButton;
        this.wifiSetLayout = listTile17;
    }

    @NonNull
    public static ActivityWeightSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.amazfit_scale_about_device;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.body_analyse_layout;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.device_status_wrapper))) != null) {
                DeviceSettingHeaderBinding deviceSettingHeaderBindingBind = DeviceSettingHeaderBinding.bind(viewFindChildViewById);
                i = R.id.ll_par1;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.ll_par2;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.mac_address;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            i = R.id.member_layout;
                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile4 != null) {
                                i = R.id.mili_setting_faq_item;
                                ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile5 != null) {
                                    i = R.id.scroll_content;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (nestedScrollView != null) {
                                        i = R.id.show_setting_layout;
                                        ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile6 != null) {
                                            i = R.id.test_algo_layout;
                                            ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile7 != null) {
                                                i = R.id.test_layout;
                                                ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                if (listTile8 != null) {
                                                    i = R.id.toolbar;
                                                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                                    if (rainbowTitleBar != null) {
                                                        i = R.id.unit_set_layout;
                                                        ListTile listTile9 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                        if (listTile9 != null) {
                                                            i = R.id.weight_pressure_layout;
                                                            ListTile listTile10 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                            if (listTile10 != null) {
                                                                i = R.id.weight_setting_erase_data;
                                                                ListTile listTile11 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                if (listTile11 != null) {
                                                                    i = R.id.weight_setting_firmware_upgrade;
                                                                    ListTile listTile12 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                    if (listTile12 != null) {
                                                                        i = R.id.weight_setting_firmware_version;
                                                                        ListTile listTile13 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                        if (listTile13 != null) {
                                                                            i = R.id.weight_setting_help;
                                                                            ListTile listTile14 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                            if (listTile14 != null) {
                                                                                i = R.id.weight_setting_merge;
                                                                                ListTile listTile15 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                if (listTile15 != null) {
                                                                                    i = R.id.weight_setting_smart_weight;
                                                                                    ListTile listTile16 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                    if (listTile16 != null) {
                                                                                        i = R.id.weight_setting_unbind;
                                                                                        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatButton != null) {
                                                                                            i = R.id.wifi_set_layout;
                                                                                            ListTile listTile17 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                                            if (listTile17 != null) {
                                                                                                return new ActivityWeightSettingBinding((ConstraintLayout) view, listTile, listTile2, deviceSettingHeaderBindingBind, linearLayout, linearLayout2, listTile3, listTile4, listTile5, nestedScrollView, listTile6, listTile7, listTile8, rainbowTitleBar, listTile9, listTile10, listTile11, listTile12, listTile13, listTile14, listTile15, listTile16, appCompatButton, listTile17);
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
    public static ActivityWeightSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWeightSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_weight_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
