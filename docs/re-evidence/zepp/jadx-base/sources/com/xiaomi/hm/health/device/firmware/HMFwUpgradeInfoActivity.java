package com.xiaomi.hm.health.device.firmware;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.LullabyDevice;
import com.xiaomi.hm.health.bt.profile.base.BaseResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.headset.MozartUpgradePrepareActivity;
import com.xiaomi.hm.health.device.headset.MozartUpgradePrepareViewModel;
import com.xiaomi.hm.health.device.headset.SingleHeadsetUpgradeActivity;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwUpgradeInfoActivity extends BaseTitleActivity {
    private static final String H = "HMFwUpgradeInfoActivity";
    private static final String I = "device_source";
    private static final String J = "device_address";
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 20;
    private HMDeviceSource A;
    private HMDeviceType B;
    private Device C;
    private Button D;
    private View E;
    private boolean F;
    private final Lazy<DeviceManagerApi> x = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> y = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceXNavigator> z = KoinJavaComponent.inject(DeviceXNavigator.class);
    private MozartUpgradePrepareViewModel G = null;

    public class a extends BLEStatueListenerAdapter {
        public a() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public HMDeviceType getHMDeviceType() {
            return HMFwUpgradeInfoActivity.this.B;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public boolean isActivatedDevice() {
            return HMFwUpgradeInfoActivity.this.C == null || ((DeviceManagerApi) HMFwUpgradeInfoActivity.this.x.getValue()).isActive(HMFwUpgradeInfoActivity.this.C);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMFwUpgradeInfoActivity.this.L(z);
        }
    }

    public class b extends HMCallback<DfuState> {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onData(DfuState dfuState) {
            if (dfuState.getState() == 48 || dfuState.getState() == 32 || dfuState.getState() == 33) {
                HMFwUpgradeInfoActivity.this.M(dfuState.getState());
            } else {
                HMFwUpgradeInfoActivity.this.K();
            }
        }
    }

    private void A(DeviceInfo deviceInfo) {
        if (this.F) {
            final String changeLog = HMFwOnlineUpgradeManager.getInstance().getChangeLog(deviceInfo);
            if (TextUtils.isEmpty(changeLog)) {
                return;
            }
            TextView textView = (TextView) findViewById(R.id.fw_upgrade_log);
            textView.setVisibility(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: cw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.H(changeLog, view);
                }
            });
        }
    }

    private void B(DeviceInfo deviceInfo, HMDeviceSource hMDeviceSource) {
        if (!HMDeviceConfig.hasFeatureFontRes(hMDeviceSource)) {
            findViewById(R.id.fw_info_font_id).setVisibility(8);
            return;
        }
        if (!this.F && HMFwUtils.getCurrentFontFlag(hMDeviceSource, deviceInfo.getHardwareVersionStr()) == -1) {
            findViewById(R.id.fw_info_font_id).setVisibility(8);
            return;
        }
        IHMFwUpgradeInfo iHMFwUpgradeInfoCheckFont = this.F ? HMFwOnlineUpgradeManager.getInstance().checkFont(this, deviceInfo) : HMFwUpgradeManager.getInstance().checkFont(this, deviceInfo);
        if (iHMFwUpgradeInfoCheckFont != null) {
            ((TextView) findViewById(R.id.fw_info_font_ver)).setText(getString(R.string.mili_fw_info_font, new Object[]{iHMFwUpgradeInfoCheckFont.getFwVersionName()}));
            return;
        }
        ((TextView) findViewById(R.id.fw_info_font_ver)).setText(getString(R.string.mili_fw_info_font, new Object[]{String.valueOf(deviceInfo.getOtherVersion().getFontVersion())}));
        int i = R.id.fw_info_font_ver_st;
        ((TextView) findViewById(i)).setText(R.string.mili_fw_info_upgraded);
        ((TextView) findViewById(i)).setTextColor(getResources().getColor(R.color.s1));
    }

    private void C(String str) {
        String fwVersionName;
        IHMFwUpgradeInfo iHMFwUpgradeInfoCheckDeviceVersion = this.F ? HMFwOnlineUpgradeManager.getInstance().checkDeviceVersion(this, this.B) : HMFwUpgradeManager.getInstance().checkDeviceVersion(this, this.B);
        if (iHMFwUpgradeInfoCheckDeviceVersion != null) {
            TextView textView = (TextView) findViewById(R.id.fw_info_fw_ver);
            int i = R.string.mili_fw_info_fw;
            Object[] objArr = new Object[1];
            if (iHMFwUpgradeInfoCheckDeviceVersion.getFwVersionName().contains("V")) {
                fwVersionName = iHMFwUpgradeInfoCheckDeviceVersion.getFwVersionName();
            } else {
                fwVersionName = "V" + iHMFwUpgradeInfoCheckDeviceVersion.getFwVersionName();
            }
            objArr[0] = fwVersionName;
            textView.setText(getString(i, objArr));
            return;
        }
        HMLog.d(H, "" + str, new Object[0]);
        TextView textView2 = (TextView) findViewById(R.id.fw_info_fw_ver);
        int i2 = R.string.mili_fw_info_fw;
        Object[] objArr2 = new Object[1];
        if (!str.contains("V")) {
            str = "V" + str;
        }
        objArr2[0] = str;
        textView2.setText(getString(i2, objArr2));
        int i3 = R.id.fw_info_fw_st;
        ((TextView) findViewById(i3)).setText(R.string.mili_fw_info_upgraded);
        ((TextView) findViewById(i3)).setTextColor(getResources().getColor(R.color.s1));
    }

    private void D(DeviceInfo deviceInfo) {
        if (!ConfigHelperKt.hasFeature(Feature.SUPPORT_GPS, deviceInfo.getDeviceSource())) {
            findViewById(R.id.fw_info_gps_id).setVisibility(8);
            return;
        }
        if ((this.F ? HMFwOnlineUpgradeManager.getInstance().checkChaohuGps(this, this.B) : HMFwUpgradeManager.getInstance().checkChaohuGps(this, this.B)) == null) {
            String gpsVersionStr = deviceInfo.getGpsVersionStr();
            HMLog.d(H, "" + gpsVersionStr, new Object[0]);
            int i = R.id.fw_info_gps_st;
            ((TextView) findViewById(i)).setText(R.string.mili_fw_info_upgraded);
            ((TextView) findViewById(i)).setTextColor(getResources().getColor(R.color.s1));
        }
    }

    private void E(DeviceInfo deviceInfo) {
        if (!HMDeviceConfig.hasFeatureFontRes(this.A)) {
            findViewById(R.id.fw_info_res_id).setVisibility(8);
            return;
        }
        IHMFwUpgradeInfo iHMFwUpgradeInfoCheckResource = this.F ? HMFwOnlineUpgradeManager.getInstance().checkResource(this, deviceInfo) : HMFwUpgradeManager.getInstance().checkResouce(this, deviceInfo);
        if (iHMFwUpgradeInfoCheckResource != null) {
            ((TextView) findViewById(R.id.fw_info_res_ver)).setText(getString(R.string.mili_fw_info_res, new Object[]{iHMFwUpgradeInfoCheckResource.getFwVersionName()}));
            return;
        }
        String str = deviceInfo.getOtherVersion().getResourceVersion() + "";
        HMLog.d(H, "" + str, new Object[0]);
        ((TextView) findViewById(R.id.fw_info_res_ver)).setText(getString(R.string.mili_fw_info_res, new Object[]{str}));
        int i = R.id.fw_info_res_st;
        ((TextView) findViewById(i)).setText(R.string.mili_fw_info_upgraded);
        ((TextView) findViewById(i)).setTextColor(getResources().getColor(R.color.s1));
    }

    private void F() {
        BTStatusFragment.newInstance(R.id.fw_tips_container, getSupportFragmentManager()).setBLEStatusListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(String str, View view) {
        this.z.getValue().startHMFwChangeLogActivity(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        if (this.y.getValue().isFastDoubleClick(view)) {
            return;
        }
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        if (!ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, this.A) || v()) {
            if (this.F) {
                HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
                hMFwOnlineUpgradeManager.clearFwUpgradeTime();
                hMFwOnlineUpgradeManager.enableFwUpgrade(true);
                hMFwOnlineUpgradeManager.checkFwUpgrade(this, this.B, true);
            } else {
                HMFwUpgradeManager hMFwUpgradeManager = HMFwUpgradeManager.getInstance();
                hMFwUpgradeManager.enableFwUpgrade(true);
                hMFwUpgradeManager.checkFwUpgrade(this, this.B, true);
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(boolean z) {
        if (z) {
            this.E.setVisibility(8);
            this.D.setEnabled(true);
            this.D.setTextColor(ContextCompat.getColor(this, R.color.s1));
        } else {
            this.E.setVisibility(0);
            this.D.setEnabled(false);
            this.D.setTextColor(ContextCompat.getColor(this, R.color.s1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i) {
        int i2;
        boolean zIsWatch = HMDeviceConfig.isWatch(this.A);
        if (i == 32) {
            i2 = zIsWatch ? R.string.fw_upgrade_stop_sport_watch : R.string.fw_upgrade_stop_sport_band;
        } else if (i == 33) {
            i2 = zIsWatch ? R.string.fw_upgrade_stop_timing_watch : R.string.fw_upgrade_stop_timing_band;
        } else {
            i2 = zIsWatch ? R.string.fw_upgrade_stop_music_watch : R.string.fw_upgrade_stop_music_band;
        }
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(i2).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: aw2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean N(HMBaseDevice hMBaseDevice) {
        HeadsetDevice.HeadsetDeviceState headsetState;
        if (!(hMBaseDevice instanceof HeadsetDevice) || !ConfigHelperKt.hasFeature(Feature.IS_SUPPORT_SINGLE_EAR_UPGRADE) || (headsetState = ((HeadsetDevice) hMBaseDevice).getHeadsetState()) == null) {
            return false;
        }
        boolean zIsDualConnected = headsetState.isDualConnected();
        boolean zEquals = hMBaseDevice.getDeviceInfo().getFirmwareVersionStr().equals(((HeadsetDevice) hMBaseDevice).getSecondEarVer());
        if (zIsDualConnected && zEquals) {
            return false;
        }
        startActivityForResult(SingleHeadsetUpgradeActivity.newInstance(this, !zIsDualConnected), 2);
        return true;
    }

    private void initView() {
        HMBaseDevice device = this.x.getValue().getDevice(this.B);
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null) {
            return;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        String str = H;
        HMLog.d(str, "HMOtherVersion:" + otherVersion, new Object[0]);
        if (otherVersion == null) {
            HMLog.d(str, "return as no version info!!!", new Object[0]);
            return;
        }
        C(device.getDeviceVersion());
        z(deviceInfo);
        E(deviceInfo);
        B(deviceInfo, deviceSource);
        D(deviceInfo);
        this.E = findViewById(R.id.fw_upgrade_mask_view);
        Button button = (Button) findViewById(R.id.mili_fw_info_upgrade_now_bt);
        this.D = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: bw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.I(view);
            }
        });
        A(deviceInfo);
        L(device.isConnected());
        F();
    }

    public static Intent newIntent(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource) {
        return newIntent(context, hMDeviceSource, null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Multi-variable type inference failed */
    private boolean v() {
        boolean z;
        HMBaseDevice device = this.x.getValue().getDevice(this.B);
        if (N(device)) {
            return false;
        }
        if (device instanceof HeadsetDevice) {
            if (device instanceof LullabyDevice) {
                BatteryInfo batteryInfo = device.getBatteryInfo();
                if (batteryInfo == null || batteryInfo.getLevel() < 20) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                HeadsetDevice headsetDevice = (HeadsetDevice) device;
                BatteryInfo batteryInfo2 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
                BatteryInfo batteryInfo3 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
                if (batteryInfo2 == null || batteryInfo2.getLevel() < 20 || batteryInfo3 == null || batteryInfo3.getLevel() < 20) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(getString(R.string.headset_upgrade_low_battery, new Object[]{20})).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: zv2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.G(dialogInterface, i);
                    }
                }).show(getSupportFragmentManager());
                return false;
            }
        }
        if (y().isReady()) {
            return true;
        }
        startActivityForResult(MozartUpgradePrepareActivity.newIntent(this, this.C.getDevice_address()), 1);
        return false;
    }

    private void w() {
        HMBoltClassicDevice hMBoltClassicDevice = (HMBoltClassicDevice) this.x.getValue().getDevice(HMDeviceType.TREADMILL);
        if (hMBoltClassicDevice.getSportState() == HMSportController.TreadmillSportState.NONE) {
            K();
            return;
        }
        HMLog.i(H, "sport ongoing: " + hMBoltClassicDevice.getSportState(), new Object[0]);
        HMFwUpgradeActivity.showSportOnGoing(this);
    }

    private void x() {
        if (this.B == HMDeviceType.TREADMILL) {
            w();
            return;
        }
        HMBaseDevice device = this.x.getValue().getDevice(this.B);
        if (device == null || !this.x.getValue().isConnected(this.B)) {
            HMLog.i(H, "no device connected.", new Object[0]);
        } else if (HMDeviceConfig.hasFeatureSportOrTimer(this.A)) {
            ((HMMiLiProDevice) device).getDfuState(new b());
        } else {
            K();
        }
    }

    private MozartUpgradePrepareViewModel y() {
        if (this.G == null) {
            MozartUpgradePrepareViewModel mozartUpgradePrepareViewModel = (MozartUpgradePrepareViewModel) new ViewModelProvider(this).get(MozartUpgradePrepareViewModel.class);
            this.G = mozartUpgradePrepareViewModel;
            mozartUpgradePrepareViewModel.setDevice(this.C);
        }
        return this.G;
    }

    private void z(DeviceInfo deviceInfo) {
        String strValueOf;
        if (!HMDeviceFeature.hasFeatureBaseResource(this.A)) {
            findViewById(R.id.fw_info_base_res_id).setVisibility(8);
            return;
        }
        IHMFwUpgradeInfo iHMFwUpgradeInfoCheckBaseResource = this.F ? HMFwOnlineUpgradeManager.getInstance().checkBaseResource(this, deviceInfo) : HMFwUpgradeManager.getInstance().checkBaseResource(this, deviceInfo);
        if (iHMFwUpgradeInfoCheckBaseResource != null) {
            ((TextView) findViewById(R.id.fw_info_base_res_ver)).setText(getString(R.string.mili_fw_info_base_res, new Object[]{iHMFwUpgradeInfoCheckBaseResource.getFwVersionName()}));
            return;
        }
        BaseResourceInfo baseResourceInfo = deviceInfo.getOtherVersion().getBaseResourceInfo();
        if (baseResourceInfo == null) {
            HMLog.i(H, "ERROR:baseResourceInfo is null!!!", new Object[0]);
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(baseResourceInfo.getResVersion());
        }
        ((TextView) findViewById(R.id.fw_info_base_res_ver)).setText(getString(R.string.mili_fw_info_base_res, new Object[]{strValueOf}));
        int i = R.id.fw_info_base_res_st;
        ((TextView) findViewById(i)).setText(R.string.mili_fw_info_upgraded);
        ((TextView) findViewById(i)).setTextColor(getResources().getColor(R.color.s1));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                K();
            }
        } else if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        if (GlobalConfig.get().isBuildMidong()) {
            UnifyTitleBarStyle.setUnifyTitleStyle(this, getString(R.string.setting_update));
        } else {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.dark_sky_blue_three), getString(R.string.setting_update));
        }
        setContentView(R.layout.activity_fw_info);
        if (bundle == null) {
            this.A = (HMDeviceSource) getIntent().getSerializableExtra("device_source");
            string = getIntent().getStringExtra(J);
        } else {
            this.A = (HMDeviceSource) bundle.getSerializable("device_source");
            string = bundle.getString(J);
        }
        if (this.A == null) {
            this.A = HMDeviceSource.VDEVICE;
        }
        this.B = this.A.getType();
        if (string != null) {
            this.C = this.x.getValue().getBindDevice(this.B, string);
        }
        this.F = DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(this.B);
        initView();
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("device_source", this.A);
        Device device = this.C;
        if (device != null) {
            bundle.putString(J, device.getDevice_address());
        }
    }

    public static Intent newIntent(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource, @org.jetbrains.annotations.Nullable String str) {
        Intent intent = new Intent(context, (Class<?>) HMFwUpgradeInfoActivity.class);
        intent.putExtra("device_source", hMDeviceSource);
        if (str != null) {
            intent.putExtra(J, str);
        }
        return intent;
    }
}
