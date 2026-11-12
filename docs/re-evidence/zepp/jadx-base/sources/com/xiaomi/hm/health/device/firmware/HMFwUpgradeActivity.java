package com.xiaomi.hm.health.device.firmware;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.AppNotificationApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.view.progress.ProgressView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeActivity;
import com.xiaomi.hm.health.device.fw_upgrade.FwDaoManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import de.greenrobot.event.EventBus;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwUpgradeActivity extends BaseTitleActivity {
    public static final String FW_UPGRADE_CHANGE_LOG = "upgrade_change_log";
    public static final String FW_UPGRADE_DEVICE_IS_FORCE = "upgrade_is_force";
    public static final String FW_UPGRADE_DEVICE_SOURCE_KEY = "device_source";
    public static final String FW_UPGRADE_INFO_KEY = "fw_info";
    public static final String FW_UPGRADE_RESULT = "upgrade_result";
    public static final String FW_UPGRADE_RETRY = "upgrade_retry";
    public static final String FW_UPGRADE_TYPE_KEY = "bind_type";
    private static final String S = "com.xiaomi.hm.health.device.firmware.HMFwUpgradeActivity";
    private static final String T = "FW_TASK_ID";
    private TextView x = null;
    private TextView y = null;
    private TextView z = null;
    private ProgressView A = null;
    private ViewGroup B = null;
    private int C = 0;
    private HMDeviceSource D = HMDeviceSource.VDEVICE;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private long H = System.currentTimeMillis();
    private boolean I = false;
    private HMFirmwareType J = HMFirmwareType.RESOURCE;
    private String K = null;
    private boolean L = false;
    private final Lazy<DeviceManagerApi> M = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceXNavigator> N = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<DeviceUtilsApi> O = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<AppNotificationApi> P = KoinJavaComponent.inject(AppNotificationApi.class);
    private final Lazy<KeeperProxyApi> Q = KoinJavaComponent.inject(KeeperProxyApi.class);
    private boolean R = false;

    public class a extends HMCallback<DfuState> {
        public final /* synthetic */ HMMiLiProDevice a;

        public a(HMMiLiProDevice hMMiLiProDevice) {
            this.a = hMMiLiProDevice;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onData(DfuState dfuState) {
            int i;
            if (dfuState.getState() != 48 && dfuState.getState() != 32 && dfuState.getState() != 33) {
                HMFwUpgradeActivity.this.H();
                return;
            }
            if (HMDeviceConfig.isWatch(this.a.getDeviceInfo().getDeviceSource())) {
                if (dfuState.getState() == 32) {
                    i = R.string.fw_upgrade_stop_sport_watch;
                } else {
                    i = dfuState.getState() == 33 ? R.string.fw_upgrade_stop_timing_watch : R.string.fw_upgrade_stop_music_watch;
                }
            } else if (dfuState.getState() == 32) {
                i = R.string.fw_upgrade_stop_sport_band;
            } else {
                i = dfuState.getState() == 33 ? R.string.fw_upgrade_stop_timing_band : R.string.fw_upgrade_stop_music_band;
            }
            new AlertDialogFragment.Builder(HMFwUpgradeActivity.this).setCancelable(false).setMessage(i).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.device.firmware.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            }).show(HMFwUpgradeActivity.this.getSupportFragmentManager());
        }
    }

    public class b implements LoadingDialog.OnAnimEndListener {
        public b() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            if (HMFwUpgradeActivity.this.isDestroyed()) {
                return;
            }
            HMFwUpgradeActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        return "retryUpgradeCheck -->" + hMDeviceFwUpgradeEvent.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B() {
        return "The current retry of the upgrade has failed";
    }

    private void D(HMMiLiProDevice hMMiLiProDevice) {
        hMMiLiProDevice.getDfuState(new a(hMMiLiProDevice));
    }

    private void E() {
        final HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent;
        if (this.I && (hMDeviceFwUpgradeEvent = (HMDeviceFwUpgradeEvent) EventBus.getDefault().getStickyEvent(HMDeviceFwUpgradeEvent.class)) != null) {
            String str = S;
            HMLog.info(str, new Function0() { // from class: rv2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMFwUpgradeActivity.A(hMDeviceFwUpgradeEvent);
                }
            });
            if (System.currentTimeMillis() - hMDeviceFwUpgradeEvent.getEventCreateTime() < 1000) {
                HMLog.info(str, new Function0() { // from class: sv2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMFwUpgradeActivity.B();
                    }
                });
                onEventMainThread(hMDeviceFwUpgradeEvent);
            }
        }
        EventBus.getDefault().removeStickyEvent(HMDeviceFwUpgradeEvent.class);
    }

    private void F(boolean z) {
        HMBaseDevice device;
        DeviceInfo deviceInfo;
        if (!z || !this.L || t() || (device = this.M.getValue().getDevice(this.D.getType())) == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return;
        }
        this.P.getValue().showFwUpgradeFinish(deviceInfo);
    }

    private void G() {
        LoadingDialog.showDialog(this).setSuccess(getString(R.string.fw_upgrade_success), 1500, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.H = System.currentTimeMillis();
        this.F = true;
        ((TextView) findViewById(R.id.fw_upgrade_log)).setVisibility(8);
        if (this.G) {
            this.B.setVisibility(8);
            return;
        }
        if (L()) {
            HMFwOnlineUpgradeManager.getInstance().startFwUpgrade();
        } else {
            HMFwUpgradeManager.getInstance().startFwUpgrade();
        }
        this.B.setVisibility(8);
        K();
    }

    private void I() {
        int imageForDevice;
        if (!ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, this.D) && (imageForDevice = this.O.getValue().getImageForDevice(this.D)) > 0) {
            if (ConfigHelperKt.hasFeature(this.D, Feature.BOLT_SERIES)) {
                this.A.setImageResource(imageForDevice, 0.48f);
            } else {
                this.A.setImageResource(imageForDevice, 0.67f);
            }
        }
    }

    private void J(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        this.A.setMax(hMDeviceFwUpgradeEvent.getProgress().total);
        this.A.setProgress(hMDeviceFwUpgradeEvent.getProgress().progress);
        if (hMDeviceFwUpgradeEvent.getProgress().total == hMDeviceFwUpgradeEvent.getProgress().progress) {
            if (this.J != HMFirmwareType.RESOURCE_COMPRESS) {
                if (this.C == 9) {
                    this.x.setText(R.string.fw_upgrade_chaohu_gps_title);
                }
            } else {
                this.x.setText(R.string.fw_upgrade_mili_resource_title);
                if (L()) {
                    HMFwOnlineAnalyticsKt.firmwareTransferSuccess(System.currentTimeMillis() - this.H);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0116  */
    /* JADX WARN: Code duplicated, block: B:80:0x013b  */
    /* JADX WARN: Code duplicated, block: B:83:0x014e  */
    private void K() {
        int i;
        int i2;
        String string;
        int i3;
        int i4;
        boolean z;
        boolean zHasBoundWatch = HMDeviceConfig.hasBoundWatch();
        switch (this.C) {
            case 0:
                i = zHasBoundWatch ? this.F ? R.string.fw_upgrade_chaohu_title : R.string.fw_upgrade_chaohu_title_select : this.F ? R.string.fw_upgrade_mili_title : R.string.fw_upgrade_mili_title_select;
                i2 = zHasBoundWatch ? R.string.fw_upgrade_chaohu_tips : R.string.fw_upgrade_mili_tips;
                string = getString(R.string.fw_upgrade_device_description);
                z = false;
                int i5 = i;
                i4 = i2;
                i3 = i5;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView = this.x;
                    int i6 = R.string.chip_device_name;
                    textView.setText(getString(i3, new Object[]{getString(i6)}));
                    this.y.setText(getString(i4, new Object[]{getString(i6)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F && this.J == HMFirmwareType.RESOURCE_COMPRESS) {
                    this.x.setText(R.string.fw_upgrade_res_transmitting);
                    break;
                }
                break;
            case 1:
                i3 = R.string.fw_upgrade_hr_title;
                i4 = R.string.fw_upgrade_hr_tips;
                string = getString(R.string.fw_upgrade_device_description);
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView2 = this.x;
                    int i7 = R.string.chip_device_name;
                    textView2.setText(getString(i3, new Object[]{getString(i7)}));
                    this.y.setText(getString(i4, new Object[]{getString(i7)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 2:
                boolean zHasBoundBfs = HMDeviceConfig.hasBoundBfs();
                i = zHasBoundBfs ? R.string.fw_upgrade_weight_bfs_title : R.string.fw_upgrade_weight_title;
                i2 = zHasBoundBfs ? R.string.fw_upgrade_weight_bfs_tips : R.string.fw_upgrade_weight_tips;
                string = getString(R.string.fw_upgrade_device_description);
                z = false;
                int i8 = i;
                i4 = i2;
                i3 = i8;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView3 = this.x;
                    int i9 = R.string.chip_device_name;
                    textView3.setText(getString(i3, new Object[]{getString(i9)}));
                    this.y.setText(getString(i4, new Object[]{getString(i9)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 3:
                i3 = R.string.fw_upgrade_shoes_title;
                i4 = R.string.fw_upgrade_shoes_tips;
                string = getString(R.string.fw_upgrade_device_description);
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView4 = this.x;
                    int i10 = R.string.chip_device_name;
                    textView4.setText(getString(i3, new Object[]{getString(i10)}));
                    this.y.setText(getString(i4, new Object[]{getString(i10)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 4:
                i3 = R.string.normandy_upgrade_title;
                i4 = R.string.normandy_upgrade_tips;
                string = getString(R.string.fw_upgrade_device_description);
                z = true;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView5 = this.x;
                    int i11 = R.string.chip_device_name;
                    textView5.setText(getString(i3, new Object[]{getString(i11)}));
                    this.y.setText(getString(i4, new Object[]{getString(i11)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 5:
                i = this.F ? R.string.fw_upgrade_mili_font_title : R.string.fw_upgrade_chaohu_title_select_ft;
                i2 = zHasBoundWatch ? R.string.fw_upgrade_chaohu_tips : R.string.fw_upgrade_mili_tips;
                string = getString(R.string.fw_upgrade_font_description);
                z = false;
                int i12 = i;
                i4 = i2;
                i3 = i12;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView6 = this.x;
                    int i13 = R.string.chip_device_name;
                    textView6.setText(getString(i3, new Object[]{getString(i13)}));
                    this.y.setText(getString(i4, new Object[]{getString(i13)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 6:
                i = this.F ? R.string.fw_upgrade_mili_resource_title : zHasBoundWatch ? R.string.fw_upgrade_chaohu_title_select_res : R.string.fw_upgrade_mili_title_select_res;
                i2 = zHasBoundWatch ? R.string.fw_upgrade_chaohu_tips : R.string.fw_upgrade_mili_tips;
                string = getString(R.string.fw_upgrade_resource_description);
                z = false;
                int i14 = i;
                i4 = i2;
                i3 = i14;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView7 = this.x;
                    int i15 = R.string.chip_device_name;
                    textView7.setText(getString(i3, new Object[]{getString(i15)}));
                    this.y.setText(getString(i4, new Object[]{getString(i15)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 7:
                i3 = R.string.fw_upgrade_agps_title;
                i4 = R.string.fw_upgrade_agps_tips;
                string = "";
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView8 = this.x;
                    int i16 = R.string.chip_device_name;
                    textView8.setText(getString(i3, new Object[]{getString(i16)}));
                    this.y.setText(getString(i4, new Object[]{getString(i16)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 8:
                i3 = this.F ? R.string.fw_upgrade_chaohu_title : R.string.fw_upgrade_chaohu_title_select;
                i4 = R.string.fw_upgrade_chaohu_tips;
                string = getString(R.string.fw_upgrade_device_description);
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView9 = this.x;
                    int i17 = R.string.chip_device_name;
                    textView9.setText(getString(i3, new Object[]{getString(i17)}));
                    this.y.setText(getString(i4, new Object[]{getString(i17)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 9:
                i3 = !this.F ? R.string.fw_upgrade_chaohu_title_select_gps : R.string.fw_upgrade_chaohu_gps_transmitting;
                i4 = R.string.fw_upgrade_chaohu_tips;
                string = getString(R.string.fw_upgrade_gps_description);
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView10 = this.x;
                    int i18 = R.string.chip_device_name;
                    textView10.setText(getString(i3, new Object[]{getString(i18)}));
                    this.y.setText(getString(i4, new Object[]{getString(i18)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 10:
                i3 = this.F ? R.string.fw_upgrade_bm_title : R.string.fw_upgrade_bm_title_select;
                i4 = R.string.fw_upgrade_bm_tips;
                string = getString(R.string.fw_upgrade_device_description);
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView11 = this.x;
                    int i19 = R.string.chip_device_name;
                    textView11.setText(getString(i3, new Object[]{getString(i19)}));
                    this.y.setText(getString(i4, new Object[]{getString(i19)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 11:
                i3 = this.F ? R.string.treadmill_upgrading : R.string.treadmill_upgrading_now;
                i4 = R.string.treadmill_upgrading_tip;
                string = getString(R.string.fw_upgrade_device_description);
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView12 = this.x;
                    int i110 = R.string.chip_device_name;
                    textView12.setText(getString(i3, new Object[]{getString(i110)}));
                    this.y.setText(getString(i4, new Object[]{getString(i110)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 12:
                i3 = R.string.headset_fw_upgrading_title;
                i4 = R.string.headset_fw_upgrading_tip;
                string = getString(R.string.fw_upgrade_device_description);
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView13 = this.x;
                    int i111 = R.string.chip_device_name;
                    textView13.setText(getString(i3, new Object[]{getString(i111)}));
                    this.y.setText(getString(i4, new Object[]{getString(i111)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
            case 13:
                i3 = this.F ? R.string.fw_upgrade_earbud_title : R.string.fw_upgrade_earbud_title_select;
                i4 = R.string.fw_upgrade_earbud_tips;
                string = "";
                z = false;
                UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
                if (z) {
                    TextView textView14 = this.x;
                    int i112 = R.string.chip_device_name;
                    textView14.setText(getString(i3, new Object[]{getString(i112)}));
                    this.y.setText(getString(i4, new Object[]{getString(i112)}));
                } else {
                    this.x.setText(i3);
                    this.y.setText(i4);
                }
                this.z.setText(string);
                if (!this.F) {
                }
                break;
        }
    }

    private boolean L() {
        return DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(this.D.getType());
    }

    private void initViews() {
        this.x = (TextView) findViewById(R.id.fw_upgrade_title);
        this.y = (TextView) findViewById(R.id.fw_upgrade_tips);
        this.z = (TextView) findViewById(R.id.fw_upgrade_description);
        this.A = (ProgressView) findViewById(R.id.fw_upgrade_progress);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ll_update_select);
        this.B = viewGroup;
        if (this.I) {
            viewGroup.setVisibility(8);
            this.F = true;
            K();
            w();
            return;
        }
        final HMBaseDevice device = this.M.getValue().getDevice(this.D.getType());
        if (this.E) {
            if (L() && device != null && device.getDeviceInfo() != null) {
                FwDaoManager.getManager().updateForce(device.getDeviceInfo().getDeviceSource(), device.getDeviceInfo().getProductVersion());
            }
            H();
        } else {
            this.F = false;
            TextView textView = (TextView) findViewById(R.id.left_btn);
            textView.setText(R.string.abandon_update);
            textView.setOnClickListener(new View.OnClickListener() { // from class: qv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.y(device, view);
                }
            });
            TextView textView2 = (TextView) findViewById(R.id.right_btn);
            textView2.setText(R.string.update_now);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: pv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.z(device, view);
                }
            });
        }
        w();
    }

    private void s(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        String str;
        boolean result = hMDeviceFwUpgradeEvent.getResult();
        String str2 = result ? StatEvent.FW_UPGRADE_SUCCESS : StatEvent.FW_UPGRADE_FAILED;
        String str3 = result ? StatEvent.FW_UPGRADE_SUCCESS_VERSION : StatEvent.FW_UPGRADE_FAILED_VERSION;
        String str4 = result ? StatEvent.FW_UPGRADE_SUCCESS_MODEL : StatEvent.FW_UPGRADE_FAILED_MODEL;
        DeviceManagerApi value = this.M.getValue();
        int i = this.C;
        String str5 = StatEvent.FW_UPGRADE_TYPE_BAND1;
        if (i != 0) {
            if (i == 1) {
                str5 = StatEvent.FW_UPGRADE_TYPE_1S;
            } else if (i == 3) {
                str = value.getBoundDeviceSource(HMDeviceType.SHOES) == HMDeviceSource.SHOES_CHILD ? StatEvent.FW_UPGRADE_TYPE_KIDSHOE : "RunShoe";
                str5 = str;
            }
        } else if (value.getBoundDeviceSource(HMDeviceType.MILI) == HMDeviceSource.MILI_PRO) {
            str = StatEvent.FW_UPGRADE_TYPE_PRO;
            str5 = str;
        }
        Analytics.recordEvent(new CountEventBuilder(str2).setValue(str5));
        Analytics.recordEvent(new CountEventBuilder(str3).setValue(hMDeviceFwUpgradeEvent.getDeviceSource().getValue() + "_" + hMDeviceFwUpgradeEvent.getFwVersion()));
        Analytics.recordEvent(new CountEventBuilder(str4).setValue(Build.BRAND + "_" + Build.MODEL + "_" + hMDeviceFwUpgradeEvent.getFwVersion()));
        if (L()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.H;
            if (result) {
                HMFwOnlineAnalyticsKt.firmwareUpgradeSuccess(jCurrentTimeMillis);
                return;
            }
            if (this.J == HMFirmwareType.RESOURCE_COMPRESS) {
                if (!this.M.getValue().isBluetoothEnable()) {
                    HMFwOnlineAnalyticsKt.firmwareTransferFail(HMFwOnlineAnalyticsKt.BLUETOOTH_CLOSED, jCurrentTimeMillis);
                    return;
                } else if (this.M.getValue().isConnected(this.D.getType())) {
                    HMFwOnlineAnalyticsKt.firmwareTransferFail("other", jCurrentTimeMillis);
                    return;
                } else {
                    HMFwOnlineAnalyticsKt.firmwareTransferFail(HMFwOnlineAnalyticsKt.BLE_DISCONNECT, jCurrentTimeMillis);
                    return;
                }
            }
            if (!this.M.getValue().isBluetoothEnable()) {
                HMFwOnlineAnalyticsKt.firmwareUpgradeFail(HMFwOnlineAnalyticsKt.BLUETOOTH_CLOSED, jCurrentTimeMillis);
            } else if (this.M.getValue().isConnected(this.D.getType())) {
                HMFwOnlineAnalyticsKt.firmwareUpgradeFail("other", jCurrentTimeMillis);
            } else {
                HMFwOnlineAnalyticsKt.firmwareUpgradeFail(HMFwOnlineAnalyticsKt.BLE_DISCONNECT, jCurrentTimeMillis);
            }
        }
    }

    public static void showSportOnGoing(AppCompatActivity appCompatActivity) {
        new AlertDialogFragment.Builder(appCompatActivity).setCancelable(false).setMessage(R.string.treadmill_upgrade_sport_ongoing).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: nv2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show(appCompatActivity.getSupportFragmentManager());
    }

    private boolean t() {
        HMDeviceSource hMDeviceSource = this.D;
        return (hMDeviceSource == HMDeviceSource.MILI_PYH || hMDeviceSource == HMDeviceSource.MILI_PYH_W || hMDeviceSource == HMDeviceSource.MILI_FALCON || hMDeviceSource == HMDeviceSource.MILI_FALCON_W || hMDeviceSource == HMDeviceSource.MILI_FALCON_L || hMDeviceSource == HMDeviceSource.MILI_FALCON_WL || hMDeviceSource == HMDeviceSource.MILI_FALCON_DISNEY || hMDeviceSource == HMDeviceSource.MILI_HAWK || hMDeviceSource == HMDeviceSource.MILI_HAWK_W || hMDeviceSource == HMDeviceSource.MILI_HAWK_L || hMDeviceSource == HMDeviceSource.MILI_HAWK_WL || hMDeviceSource == HMDeviceSource.MILI_HAWK_SWK || hMDeviceSource == HMDeviceSource.MILI_HAWK_SWK_W || hMDeviceSource == HMDeviceSource.MILI_KESTREL || hMDeviceSource == HMDeviceSource.MILI_KESTREL_W || hMDeviceSource == HMDeviceSource.MILI_KESTREL_L || hMDeviceSource == HMDeviceSource.MILI_KESTREL_WL) ? false : true;
    }

    private void u(boolean z) {
        Intent intent = new Intent();
        if (z) {
            intent.setClass(this, HMFwUpgradeSuccessActivity.class);
        } else {
            intent.setClass(this, HMFwUpgradeFailedActivity.class);
            intent.putExtra(FW_UPGRADE_CHANGE_LOG, this.K);
        }
        intent.putExtra("bind_type", this.C);
        intent.putExtra("device_source", this.D.getValue());
        startActivity(intent);
        finish();
    }

    private void v(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        boolean z;
        boolean z2 = false;
        boolean z3 = true;
        if (hMDeviceFwUpgradeEvent.getmFwType() == -1 || this.C == hMDeviceFwUpgradeEvent.getmFwType()) {
            z = false;
        } else {
            this.C = hMDeviceFwUpgradeEvent.getmFwType();
            z = true;
        }
        if (!Objects.equals(this.K, hMDeviceFwUpgradeEvent.getmUpgradeLog())) {
            this.K = hMDeviceFwUpgradeEvent.getmUpgradeLog();
            z = true;
        }
        if (this.J != hMDeviceFwUpgradeEvent.getFirmwareType()) {
            HMFirmwareType firmwareType = hMDeviceFwUpgradeEvent.getFirmwareType();
            this.J = firmwareType;
            if (firmwareType == HMFirmwareType.RESOURCE_COMPRESS) {
                HMFwOnlineAnalyticsKt.firmwareTransferC();
            }
            if (L() && HMFwOnlineUpgradeManager.getInstance().c0(this, this.D.getType(), this.J)) {
                z2 = true;
            }
            this.L = z2;
        } else {
            z3 = z;
        }
        if (z3) {
            K();
            w();
        }
    }

    private void w() {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            TextView textView = (TextView) findViewById(R.id.fw_upgrade_log);
            if (!TextUtils.isEmpty(this.K) && !this.E) {
                textView.setVisibility(0);
                textView.setOnClickListener(new View.OnClickListener() { // from class: ov2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.x(view);
                    }
                });
                HMFwOnlineAnalyticsKt.firmwareDownloadWatchLogV();
            }
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view) {
        this.N.getValue().startHMFwChangeLogActivity(this, this.K);
        HMFwOnlineAnalyticsKt.firmwareDownloadWatchLogC();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(HMBaseDevice hMBaseDevice, View view) {
        if (L()) {
            if (hMBaseDevice != null && hMBaseDevice.getDeviceInfo() != null) {
                this.Q.getValue().saveFwUpgradeTime(HMFwOnlineManager.createDeviceValue(hMBaseDevice.getDeviceInfo()), System.currentTimeMillis());
            }
            if (!this.I) {
                HMFwOnlineAnalyticsKt.firmwareDownloadStopC();
            }
            HMFwOnlineUpgradeManager.getInstance().cancelFwUpgrade();
        } else {
            HMFwUpgradeManager.getInstance().cancelFwUpgrade();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(HMBaseDevice hMBaseDevice, View view) {
        if (this.O.getValue().isFastDoubleClick(view)) {
            return;
        }
        if (hMBaseDevice == null || !hMBaseDevice.isConnected()) {
            HMLog.i(S, "no device connected.", new Object[0]);
            return;
        }
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.i(S, "deviceInfo null", new Object[0]);
            return;
        }
        if (L()) {
            FwDaoManager.getManager().updateForce(hMBaseDevice.getDeviceInfo().getDeviceSource(), hMBaseDevice.getDeviceInfo().getProductVersion());
            if (this.I) {
                HMFwOnlineAnalyticsKt.firmwareUpgradeRetryC();
            } else {
                HMFwOnlineAnalyticsKt.firmwareDownloadContinueC();
            }
        }
        if (deviceInfo.getDeviceSource().getType() != HMDeviceType.TREADMILL) {
            if (!HMDeviceConfig.hasFeatureSportOrTimer(hMBaseDevice.getDeviceInfo().getDeviceSource())) {
                H();
                return;
            } else if (hMBaseDevice instanceof HMMiLiProDevice) {
                D((HMMiLiProDevice) hMBaseDevice);
                return;
            } else {
                H();
                return;
            }
        }
        HMBoltClassicDevice hMBoltClassicDevice = (HMBoltClassicDevice) hMBaseDevice;
        if (hMBoltClassicDevice.getSportState() == HMSportController.TreadmillSportState.NONE) {
            H();
            return;
        }
        HMLog.i(S, "sport ongoing: " + hMBoltClassicDevice.getSportState(), new Object[0]);
        showSportOnGoing(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_fw_upgrade);
        getWindow().addFlags(128);
        if (bundle != null) {
            long j = bundle.getLong(T);
            long fwTaskId = HMFwUpgradeManager.getInstance().getFwTaskId();
            long jE = HMFwOnlineUpgradeManager.getInstance().E();
            if (j == 0 || !(fwTaskId == j || jE == j)) {
                startActivity(this.N.getValue().createMainTabIntent(this));
                finish();
                return;
            }
            this.G = true;
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.C = intent.getIntExtra("bind_type", 0);
            this.J = (HMFirmwareType) intent.getSerializableExtra(FW_UPGRADE_INFO_KEY);
            HMLog.i(S, "hmFirmwareType: " + this.J, new Object[0]);
            this.D = HMDeviceSource.fromValue(intent.getIntExtra("device_source", HMDeviceSource.VDEVICE.getValue()));
            this.E = intent.getBooleanExtra(FW_UPGRADE_DEVICE_IS_FORCE, false);
            this.I = intent.getBooleanExtra(FW_UPGRADE_RETRY, false);
            this.K = intent.getStringExtra(FW_UPGRADE_CHANGE_LOG);
        }
        initViews();
        K();
        EventBus.getDefault().register(this);
        E();
        if (L()) {
            HMFwOnlineAnalyticsKt.firmwareDownloadV();
            if (this.J == HMFirmwareType.RESOURCE_COMPRESS) {
                HMFwOnlineAnalyticsKt.firmwareTransferC();
            }
        }
        this.L = L() && HMFwOnlineUpgradeManager.getInstance().c0(this, this.D.getType(), this.J);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWindow().clearFlags(128);
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        v(hMDeviceFwUpgradeEvent);
        if (hMDeviceFwUpgradeEvent.isProgress()) {
            J(hMDeviceFwUpgradeEvent);
            return;
        }
        if (!hMDeviceFwUpgradeEvent.isStop() || this.R) {
            return;
        }
        this.R = true;
        if (!hMDeviceFwUpgradeEvent.getResult() || hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE) {
            u(hMDeviceFwUpgradeEvent.getResult());
        } else {
            G();
        }
        if (!DeviceXFunctionsKt.getAppStateApi().isForeground() && HMDeviceConfig.isNeedDestroyInBackground(hMDeviceFwUpgradeEvent.getDeviceType())) {
            this.M.getValue().destroyDevice(hMDeviceFwUpgradeEvent.getDeviceType());
        }
        F(hMDeviceFwUpgradeEvent.getResult());
        s(hMDeviceFwUpgradeEvent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        long fwTaskId = HMFwUpgradeManager.getInstance().getFwTaskId();
        long jE = HMFwOnlineUpgradeManager.getInstance().E();
        if (jE != -1) {
            fwTaskId = jE;
        }
        bundle.putLong(T, fwTaskId);
    }
}
