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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.device.setting.ui.DeviceSettingItemView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentDeviceSettingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatButton btnCharging;

    @NonNull
    public final AppCompatButton btnConnectingState;

    @NonNull
    public final AppCompatButton btnDisconnectState;

    @NonNull
    public final AppCompatButton btnOpenNormalSetting;

    @NonNull
    public final AppCompatButton btnOpenSchedule;

    @NonNull
    public final AppCompatButton btnSyncGpsState;

    @NonNull
    public final AppCompatButton btnSyncGpsStateFail;

    @NonNull
    public final AppCompatButton btnSyncState;

    @NonNull
    public final AppCompatButton btnUnbind;

    @NonNull
    public final LinearLayout connectStateLayout;

    @NonNull
    public final FragmentDeviceSettingHeaderBinding deviceStatusWrapper;

    @NonNull
    public final DeviceSettingItemView itemAbout;

    @NonNull
    public final DeviceSettingItemView itemBluetoothBroadcast;

    @NonNull
    public final DeviceSettingItemView itemBluetoothSportBroadcast;

    @NonNull
    public final DeviceSettingItemView itemCheckUpdate;

    @NonNull
    public final DeviceSettingItemView itemDeviceAppItemSetting;

    @NonNull
    public final DeviceSettingItemView itemDeviceAppManager;

    @NonNull
    public final DeviceSettingItemView itemEsim;

    @NonNull
    public final DeviceSettingItemView itemFaq;

    @NonNull
    public final DeviceSettingItemView itemFindDevice;

    @NonNull
    public final DeviceSettingItemView itemHealthDetect;

    @NonNull
    public final DeviceSettingItemView itemInstruction;

    @NonNull
    public final DeviceSettingItemView itemJsAppDeveloperMode;

    @NonNull
    public final DeviceSettingItemView itemJsAppStore;

    @NonNull
    public final DeviceSettingItemView itemKeepAlive;

    @NonNull
    public final DeviceSettingItemView itemLab;

    @NonNull
    public final DeviceSettingItemView itemNotificationAndReminder;

    @NonNull
    public final DeviceSettingItemView itemOfflineVoiceCmd;

    @NonNull
    public final DeviceSettingItemView itemRealtimeData;

    @NonNull
    public final DeviceSettingItemView itemSmartAssistantSetting;

    @NonNull
    public final DeviceSettingItemView itemSpiteBindingItem;

    @NonNull
    public final DeviceSettingItemView itemUnlockScreen;

    @NonNull
    public final DeviceSettingItemView itemVibrateMode;

    @NonNull
    public final DeviceSettingItemView itemWatchSetting;

    @NonNull
    public final DeviceSettingItemView itemWatchSkin;

    @NonNull
    public final LinearLayout llPar1;

    @NonNull
    public final LinearLayout llPar2;

    @NonNull
    public final LinearLayout llPar3;

    @NonNull
    public final LinearLayout llPar4;

    @NonNull
    public final View mask1;

    @NonNull
    public final View mask2;

    @NonNull
    public final View mask3;

    @NonNull
    public final View mask4;

    @NonNull
    public final RecyclerView rvAppSettingItems;

    @NonNull
    public final NestedScrollView scrollContent;

    @NonNull
    public final RainbowTitleBar toolbar;

    private FragmentDeviceSettingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatButton appCompatButton, @NonNull AppCompatButton appCompatButton2, @NonNull AppCompatButton appCompatButton3, @NonNull AppCompatButton appCompatButton4, @NonNull AppCompatButton appCompatButton5, @NonNull AppCompatButton appCompatButton6, @NonNull AppCompatButton appCompatButton7, @NonNull AppCompatButton appCompatButton8, @NonNull AppCompatButton appCompatButton9, @NonNull LinearLayout linearLayout, @NonNull FragmentDeviceSettingHeaderBinding fragmentDeviceSettingHeaderBinding, @NonNull DeviceSettingItemView deviceSettingItemView, @NonNull DeviceSettingItemView deviceSettingItemView2, @NonNull DeviceSettingItemView deviceSettingItemView3, @NonNull DeviceSettingItemView deviceSettingItemView4, @NonNull DeviceSettingItemView deviceSettingItemView5, @NonNull DeviceSettingItemView deviceSettingItemView6, @NonNull DeviceSettingItemView deviceSettingItemView7, @NonNull DeviceSettingItemView deviceSettingItemView8, @NonNull DeviceSettingItemView deviceSettingItemView9, @NonNull DeviceSettingItemView deviceSettingItemView10, @NonNull DeviceSettingItemView deviceSettingItemView11, @NonNull DeviceSettingItemView deviceSettingItemView12, @NonNull DeviceSettingItemView deviceSettingItemView13, @NonNull DeviceSettingItemView deviceSettingItemView14, @NonNull DeviceSettingItemView deviceSettingItemView15, @NonNull DeviceSettingItemView deviceSettingItemView16, @NonNull DeviceSettingItemView deviceSettingItemView17, @NonNull DeviceSettingItemView deviceSettingItemView18, @NonNull DeviceSettingItemView deviceSettingItemView19, @NonNull DeviceSettingItemView deviceSettingItemView20, @NonNull DeviceSettingItemView deviceSettingItemView21, @NonNull DeviceSettingItemView deviceSettingItemView22, @NonNull DeviceSettingItemView deviceSettingItemView23, @NonNull DeviceSettingItemView deviceSettingItemView24, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull RecyclerView recyclerView, @NonNull NestedScrollView nestedScrollView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.btnCharging = appCompatButton;
        this.btnConnectingState = appCompatButton2;
        this.btnDisconnectState = appCompatButton3;
        this.btnOpenNormalSetting = appCompatButton4;
        this.btnOpenSchedule = appCompatButton5;
        this.btnSyncGpsState = appCompatButton6;
        this.btnSyncGpsStateFail = appCompatButton7;
        this.btnSyncState = appCompatButton8;
        this.btnUnbind = appCompatButton9;
        this.connectStateLayout = linearLayout;
        this.deviceStatusWrapper = fragmentDeviceSettingHeaderBinding;
        this.itemAbout = deviceSettingItemView;
        this.itemBluetoothBroadcast = deviceSettingItemView2;
        this.itemBluetoothSportBroadcast = deviceSettingItemView3;
        this.itemCheckUpdate = deviceSettingItemView4;
        this.itemDeviceAppItemSetting = deviceSettingItemView5;
        this.itemDeviceAppManager = deviceSettingItemView6;
        this.itemEsim = deviceSettingItemView7;
        this.itemFaq = deviceSettingItemView8;
        this.itemFindDevice = deviceSettingItemView9;
        this.itemHealthDetect = deviceSettingItemView10;
        this.itemInstruction = deviceSettingItemView11;
        this.itemJsAppDeveloperMode = deviceSettingItemView12;
        this.itemJsAppStore = deviceSettingItemView13;
        this.itemKeepAlive = deviceSettingItemView14;
        this.itemLab = deviceSettingItemView15;
        this.itemNotificationAndReminder = deviceSettingItemView16;
        this.itemOfflineVoiceCmd = deviceSettingItemView17;
        this.itemRealtimeData = deviceSettingItemView18;
        this.itemSmartAssistantSetting = deviceSettingItemView19;
        this.itemSpiteBindingItem = deviceSettingItemView20;
        this.itemUnlockScreen = deviceSettingItemView21;
        this.itemVibrateMode = deviceSettingItemView22;
        this.itemWatchSetting = deviceSettingItemView23;
        this.itemWatchSkin = deviceSettingItemView24;
        this.llPar1 = linearLayout2;
        this.llPar2 = linearLayout3;
        this.llPar3 = linearLayout4;
        this.llPar4 = linearLayout5;
        this.mask1 = view;
        this.mask2 = view2;
        this.mask3 = view3;
        this.mask4 = view4;
        this.rvAppSettingItems = recyclerView;
        this.scrollContent = nestedScrollView;
        this.toolbar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentDeviceSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        int i = R.id.btn_charging;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.btn_connecting_state;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
            if (appCompatButton2 != null) {
                i = R.id.btn_disconnect_state;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                if (appCompatButton3 != null) {
                    i = R.id.btn_open_normal_setting;
                    AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                    if (appCompatButton4 != null) {
                        i = R.id.btn_open_schedule;
                        AppCompatButton appCompatButton5 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                        if (appCompatButton5 != null) {
                            i = R.id.btn_sync_gps_state;
                            AppCompatButton appCompatButton6 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                            if (appCompatButton6 != null) {
                                i = R.id.btn_sync_gps_state_fail;
                                AppCompatButton appCompatButton7 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                if (appCompatButton7 != null) {
                                    i = R.id.btn_sync_state;
                                    AppCompatButton appCompatButton8 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                    if (appCompatButton8 != null) {
                                        i = R.id.btn_unbind;
                                        AppCompatButton appCompatButton9 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                        if (appCompatButton9 != null) {
                                            i = R.id.connect_state_layout;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.device_status_wrapper))) != null) {
                                                FragmentDeviceSettingHeaderBinding fragmentDeviceSettingHeaderBindingBind = FragmentDeviceSettingHeaderBinding.bind(viewFindChildViewById);
                                                i = R.id.item_about;
                                                DeviceSettingItemView deviceSettingItemView = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                if (deviceSettingItemView != null) {
                                                    i = R.id.item_bluetooth_broadcast;
                                                    DeviceSettingItemView deviceSettingItemView2 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                    if (deviceSettingItemView2 != null) {
                                                        i = R.id.item_bluetooth_sport_broadcast;
                                                        DeviceSettingItemView deviceSettingItemView3 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                        if (deviceSettingItemView3 != null) {
                                                            i = R.id.item_check_update;
                                                            DeviceSettingItemView deviceSettingItemView4 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                            if (deviceSettingItemView4 != null) {
                                                                i = R.id.item_device_app_item_setting;
                                                                DeviceSettingItemView deviceSettingItemView5 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                if (deviceSettingItemView5 != null) {
                                                                    i = R.id.item_device_app_manager;
                                                                    DeviceSettingItemView deviceSettingItemView6 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                    if (deviceSettingItemView6 != null) {
                                                                        i = R.id.item_esim;
                                                                        DeviceSettingItemView deviceSettingItemView7 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                        if (deviceSettingItemView7 != null) {
                                                                            i = R.id.item_faq;
                                                                            DeviceSettingItemView deviceSettingItemView8 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                            if (deviceSettingItemView8 != null) {
                                                                                i = R.id.item_find_device;
                                                                                DeviceSettingItemView deviceSettingItemView9 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                if (deviceSettingItemView9 != null) {
                                                                                    i = R.id.item_health_detect;
                                                                                    DeviceSettingItemView deviceSettingItemView10 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                    if (deviceSettingItemView10 != null) {
                                                                                        i = R.id.item_instruction;
                                                                                        DeviceSettingItemView deviceSettingItemView11 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                        if (deviceSettingItemView11 != null) {
                                                                                            i = R.id.item_js_app_developer_mode;
                                                                                            DeviceSettingItemView deviceSettingItemView12 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                            if (deviceSettingItemView12 != null) {
                                                                                                i = R.id.item_js_app_store;
                                                                                                DeviceSettingItemView deviceSettingItemView13 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                if (deviceSettingItemView13 != null) {
                                                                                                    i = R.id.item_keep_alive;
                                                                                                    DeviceSettingItemView deviceSettingItemView14 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (deviceSettingItemView14 != null) {
                                                                                                        i = R.id.item_lab;
                                                                                                        DeviceSettingItemView deviceSettingItemView15 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (deviceSettingItemView15 != null) {
                                                                                                            i = R.id.item_notification_and_reminder;
                                                                                                            DeviceSettingItemView deviceSettingItemView16 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (deviceSettingItemView16 != null) {
                                                                                                                i = R.id.item_offline_voice_cmd;
                                                                                                                DeviceSettingItemView deviceSettingItemView17 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (deviceSettingItemView17 != null) {
                                                                                                                    i = R.id.item_realtime_data;
                                                                                                                    DeviceSettingItemView deviceSettingItemView18 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (deviceSettingItemView18 != null) {
                                                                                                                        i = R.id.item_smart_assistant_setting;
                                                                                                                        DeviceSettingItemView deviceSettingItemView19 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (deviceSettingItemView19 != null) {
                                                                                                                            i = R.id.item_spite_binding_item;
                                                                                                                            DeviceSettingItemView deviceSettingItemView20 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (deviceSettingItemView20 != null) {
                                                                                                                                i = R.id.item_unlock_screen;
                                                                                                                                DeviceSettingItemView deviceSettingItemView21 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (deviceSettingItemView21 != null) {
                                                                                                                                    i = R.id.item_vibrate_mode;
                                                                                                                                    DeviceSettingItemView deviceSettingItemView22 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (deviceSettingItemView22 != null) {
                                                                                                                                        i = R.id.item_watch_setting;
                                                                                                                                        DeviceSettingItemView deviceSettingItemView23 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (deviceSettingItemView23 != null) {
                                                                                                                                            i = R.id.item_watch_skin;
                                                                                                                                            DeviceSettingItemView deviceSettingItemView24 = (DeviceSettingItemView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (deviceSettingItemView24 != null) {
                                                                                                                                                i = R.id.ll_par1;
                                                                                                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (linearLayout2 != null) {
                                                                                                                                                    i = R.id.ll_par2;
                                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                                        i = R.id.ll_par3;
                                                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                        if (linearLayout4 != null) {
                                                                                                                                                            i = R.id.ll_par4;
                                                                                                                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                            if (linearLayout5 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.mask_1))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.mask_2))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.mask_3))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.mask_4))) != null) {
                                                                                                                                                                i = R.id.rv_app_setting_items;
                                                                                                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                if (recyclerView != null) {
                                                                                                                                                                    i = R.id.scroll_content;
                                                                                                                                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                    if (nestedScrollView != null) {
                                                                                                                                                                        i = R.id.toolbar;
                                                                                                                                                                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                                                                                                                                                        if (rainbowTitleBar != null) {
                                                                                                                                                                            return new FragmentDeviceSettingBinding((ConstraintLayout) view, appCompatButton, appCompatButton2, appCompatButton3, appCompatButton4, appCompatButton5, appCompatButton6, appCompatButton7, appCompatButton8, appCompatButton9, linearLayout, fragmentDeviceSettingHeaderBindingBind, deviceSettingItemView, deviceSettingItemView2, deviceSettingItemView3, deviceSettingItemView4, deviceSettingItemView5, deviceSettingItemView6, deviceSettingItemView7, deviceSettingItemView8, deviceSettingItemView9, deviceSettingItemView10, deviceSettingItemView11, deviceSettingItemView12, deviceSettingItemView13, deviceSettingItemView14, deviceSettingItemView15, deviceSettingItemView16, deviceSettingItemView17, deviceSettingItemView18, deviceSettingItemView19, deviceSettingItemView20, deviceSettingItemView21, deviceSettingItemView22, deviceSettingItemView23, deviceSettingItemView24, linearLayout2, linearLayout3, linearLayout4, linearLayout5, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, recyclerView, nestedScrollView, rainbowTitleBar);
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
    public static FragmentDeviceSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_setting, viewGroup, false);
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
