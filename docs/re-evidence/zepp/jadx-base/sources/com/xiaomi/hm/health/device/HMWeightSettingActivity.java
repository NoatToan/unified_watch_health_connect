package com.xiaomi.hm.health.device;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.ScaleMode;
import com.huami.core.device.wifi_settings.WifiRouter;
import com.huami.core.device.wifi_settings.bean.ConnectStatus;
import com.huami.core.device.wifi_settings.bean.WiFiConnectStatus;
import com.huami.core.device.wifi_settings.ui.CenterDialogFragment;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.webapi.FaqWebApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bodyfat.activity.AddGuestActivity;
import com.xiaomi.hm.health.bodyfat.activity.BodyIndexAlgoTestActivity;
import com.xiaomi.hm.health.bodyfat.activity.EraseScaleHistoryDataActivity;
import com.xiaomi.hm.health.bodyfat.activity.FamilyListActivity;
import com.xiaomi.hm.health.bodyfat.activity.InternalScoreTestActivity;
import com.xiaomi.hm.health.bodyfat.activity.SettingOfScaleActivity;
import com.xiaomi.hm.health.bodyfat.event.EventUpdateUnit;
import com.xiaomi.hm.health.bodyfat.property.BodyfatProperty;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatSp;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMAmazfitScaleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMWeightSettingActivity;
import com.xiaomi.hm.health.device.SettingMode;
import com.xiaomi.hm.health.device.UpdateState;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeInfoActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.device.permission.WeightPermissionManager;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMWeightSettingActivity extends BaseTitleActivity {
    private static final String G0 = "HMWeightSetting_Activity";
    private static final int H0 = 0;
    private static final int I0 = 16;
    private static final int J0 = 17;
    private static final int K0 = 18;
    private static final int L0 = 256;
    private static final int M0 = 512;
    private static final int N0 = 30000;
    private static final int O0 = 768;
    private static final String P0 = "value_key";
    private static String Q0 = "from_use_or_bind";
    private static String R0 = "from__bind";
    private static final String S0 = "weight_setting_config";
    private static final String T0 = "key_pressure";
    private static final String U0 = "key_pregnant";
    private static final int V0 = 1;
    private static final int W0 = 2;
    private static final int X0 = 3;
    private static final int Y0 = 4;
    private static final int Z0 = 1;
    private static final int a1 = 2;
    private static final int b1 = 3;
    private static final int c1 = 4;
    private static final int d1 = 5;
    public static final /* synthetic */ boolean e1 = false;
    private Group A;
    private TextView B;
    private TextView C;
    private RotateAnimation C0;
    private ImageView D;
    private int D0;
    private TextView E;
    private TextView F;
    private LoadingDialog F0;
    private HMBaseDevice K;
    private Context O;
    private Handler P;
    private ListTile S;
    private String T;
    private ListTile Y;
    private ListTile Z;
    private ListTile m0;
    private KvPersistence n0;
    private Device p0;
    private ListTile q0;
    private ListTile r0;
    private ListTile s0;
    private ListTile t0;
    private NestedScrollView x;
    private RainbowTitleBar y;
    private Group z;
    private View z0;
    private ListTile G = null;
    private ListTile H = null;
    private ListTile I = null;
    private HMDeviceSource J = HMDeviceSource.WEIGHT;
    private ListTile L = null;
    private boolean M = false;
    private int N = 0;
    private String Q = StatEvent.DEVICE_BAND_OPERATE;
    private ListTile R = null;
    private boolean U = false;
    private boolean V = false;
    private boolean W = false;
    private WeightSettingViewModel X = null;
    private LoadingDialogHelper o0 = new LoadingDialogHelper(this);
    private final Lazy<DeviceXNavigator> u0 = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<DeviceManagerApi> v0 = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> w0 = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<AccountWebExtApi> x0 = KoinJavaComponent.inject(AccountWebExtApi.class);
    private final Lazy<FaqWebApi> y0 = KoinJavaComponent.inject(FaqWebApi.class);
    public int A0 = 0;
    public int B0 = 0;
    private boolean E0 = false;

    public class a extends HMCallback {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(HMWeightSettingActivity.G0, "setUnit result = " + z, new Object[0]);
            if (!z) {
                HMWeightSettingActivity.this.o0.hideLoading();
                HMWeightSettingActivity.this.q1();
            } else {
                HMWeightSettingActivity.this.d1(this.a);
                HMWeightSettingActivity.this.B1();
                HMWeightSettingActivity.this.o0.setSuccess(HMWeightSettingActivity.this.getResources().getString(R.string.save_success));
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[UpdateState.values().length];
            b = iArr;
            try {
                iArr[UpdateState.SAVE_FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[UpdateState.SAVE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[UpdateState.SAVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[HMDeviceSource.values().length];
            a = iArr2;
            try {
                iArr2[HMDeviceSource.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.WEIGHT_BFS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.WEIGHT_BODYFAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.WEIGHT_SCALE2.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.WEIGHT_AMAZFIT_SCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class c extends Handler {
        private final WeakReference<HMWeightSettingActivity> a;

        private c(HMWeightSettingActivity hMWeightSettingActivity) {
            this.a = new WeakReference<>(hMWeightSettingActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            HMWeightSettingActivity hMWeightSettingActivity = this.a.get();
            if (hMWeightSettingActivity != null) {
                int i = message.what;
                if (i == 256) {
                    HMLog.d(HMWeightSettingActivity.G0, "MSG_CONNECT_TIMEOUT", new Object[0]);
                    hMWeightSettingActivity.a1();
                } else if (i != 512) {
                    if (i != 768) {
                        return;
                    }
                    hMWeightSettingActivity.S(message.getData().getFloat(HMWeightSettingActivity.P0));
                } else {
                    HMLog.d(HMWeightSettingActivity.G0, "MSG_UPDATE_TIMEOUT", new Object[0]);
                    hMWeightSettingActivity.d0(hMWeightSettingActivity);
                    IconToast.showSuccess(hMWeightSettingActivity, R.string.fw_uptodate);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(HMPersonInfo hMPersonInfo, CompoundButton compoundButton, boolean z) {
        hMPersonInfo.getMiliConfig().setWeightMergeResult(z);
        hMPersonInfo.saveInfo(2);
        this.x0.getValue().updateProfile(false);
        Analytics.recordEvent(new CountEventBuilder(this.Q).setValue("Record"));
    }

    private void A1() {
        this.o0.hideLoading();
        this.o0.setSuccess(getResources().getString(R.string.save_success));
        int i = this.D0;
        if (i == 2) {
            HMLog.d(G0, "switch body analyse success!!!", new Object[0]);
            b1(U0, this.Y.isChecked());
            U();
        } else if (i == 3) {
            HMLog.d(G0, "switch pressure success!!!", new Object[0]);
            b1(T0, this.Z.isChecked());
        } else if (i == 4 && !Y0()) {
            c1(this.R.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            e1(3, this.Z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B1() {
        k1(Z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            e1(4, this.R);
        }
    }

    private void C1(String str) {
        this.m0.setTips(str);
        this.m0.setDotted(TextUtils.isEmpty(str) && this.V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(View view, int i) {
        n1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(View view) {
        WebHelper.launch(this.T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Bundle bundle = new Bundle();
        bundle.putFloat(P0, i2);
        Message message = new Message();
        message.what = 768;
        message.setData(bundle);
        this.P.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(WiFiConnectStatus wiFiConnectStatus) {
        HMLog.i(G0, "wifiStatus:" + wiFiConnectStatus, new Object[0]);
        C1(wiFiConnectStatus.getSsid());
        if (TextUtils.isEmpty(wiFiConnectStatus.getSsid()) && this.U && !this.W) {
            r1(this.K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(Integer num) {
        k1(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(UpdateState updateState) {
        int i = b.b[updateState.ordinal()];
        if (i == 1) {
            z1();
        } else if (i == 2) {
            A1();
        } else {
            if (i != 3) {
                return;
            }
            this.o0.showLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        HMLog.i(G0, "HMDeviceConnectionEvent = " + hMDeviceConnectionEvent.toString(), new Object[0]);
        if (hMDeviceConnectionEvent.getDeviceType() == HMDeviceType.WEIGHT) {
            if (hMDeviceConnectionEvent.isDisconnected()) {
                b0(3);
                return;
            }
            if (hMDeviceConnectionEvent.isConnecting()) {
                b0(1);
                return;
            }
            if (hMDeviceConnectionEvent.isConnected()) {
                b0(2);
                this.P.removeMessages(256);
                if (this.M) {
                    this.o0.hideLoading();
                    f1();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(Boolean bool) {
        if (bool.booleanValue()) {
            o1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(SettingMode settingMode) {
        ScaleMode measureMode = settingMode.getMeasureMode();
        HMLog.i(G0, "DeviceSettingMode:" + settingMode.getType() + ":" + measureMode, new Object[0]);
        boolean z = measureMode == ScaleMode.EnterMode;
        j1(true);
        int type = settingMode.getType();
        if (type == 1) {
            this.Y.setChecked(z);
            b1(U0, z);
        } else if (type != 2) {
            if (type != 3) {
                return;
            }
            this.R.setChecked(z);
        } else {
            this.Z.setChecked(z);
            b1(T0, z);
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(EventFwCheckResult eventFwCheckResult) {
        this.P.removeMessages(512);
        d0(this);
        if (!this.E0) {
            if (eventFwCheckResult.isSuccess) {
                w1();
            }
        } else {
            this.E0 = false;
            if (c0().booleanValue()) {
                w1();
            } else {
                IconToast.showSuccess(this, R.string.fw_uptodate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(DialogInterface dialogInterface, int i) {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit P0() {
        if (this.w0.getValue().isLocationServerOpen()) {
            this.w0.getValue().enableBluetooth(this.O);
        } else {
            new AlertDialogFragment.Builder(this.O).setTitle(R.string.loaction_tips).setMessage(R.string.open_loaction_msg).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: qp3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.O0(dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(String[] strArr, Map map, int i, DialogInterface dialogInterface, int i2) {
        if (!this.v0.getValue().isBluetoothEnable()) {
            IconToast.showError(this.O, getString(R.string.device_tip_ble_not_open));
            dialogInterface.dismiss();
            return;
        }
        Integer num = (Integer) map.get(strArr[i2]);
        if (i == i2 || num == null) {
            return;
        }
        x0(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(HMBaseDevice hMBaseDevice, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        BindWiFISettingHelper.INSTANCE.initIWiFiController(hMBaseDevice);
        WifiRouter.INSTANCE.launchWifiSet(this, this.J.getValue(), 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(float f) {
        View viewFindViewById = findViewById(R.id.device_status_wrapper);
        if (this.A0 == 0) {
            this.A0 = viewFindViewById.getMeasuredHeight();
        }
        int i = this.A0;
        if (f >= i) {
            this.y.setBackgroundResource(R.color.s10);
        } else if (((int) f) == 0) {
            this.y.setBackgroundColor(0);
        } else {
            this.y.setBackgroundColor((((int) ((f / i) * 255.0f)) << 24) | (16777215 & this.B0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        HMLog.i(G0, "Cancel wifi setting", new Object[0]);
    }

    private void T() {
        if (!this.v0.getValue().isBluetoothEnable()) {
            b0(4);
        } else {
            if (this.K.isConnected()) {
                return;
            }
            b0(1);
            HMLog.i(G0, "device reconnect....", new Object[0]);
            this.P.removeMessages(256);
            this.P.sendEmptyMessageDelayed(256, 30000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(DialogInterface dialogInterface) {
        this.W = true;
    }

    private void U() {
        this.Z.setEnabled(this.Y.isChecked());
        if (!this.Y.isChecked() && this.Z.isChecked()) {
            this.Z.setChecked(false);
            e1(3, this.Z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0() {
        this.S.setVisibility(8);
    }

    private void V(View view) {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network_connection));
            return;
        }
        if (this.w0.getValue().isFastDoubleClick(view)) {
            return;
        }
        if (c0().booleanValue()) {
            startActivity(HMFwUpgradeInfoActivity.newIntent(this, this.J));
            return;
        }
        this.E0 = true;
        m1(this);
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineManager.getInstance().checkFw(HMDeviceType.WEIGHT, true);
        } else {
            NetFwUpgradeManager.checkFwFromServerAsync(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(String str) {
        this.T = str;
        this.S.setVisibility(0);
    }

    private void W() {
        j1(false);
        l1();
        this.X.getSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0() {
        final String strIsDeviceManualFaqShow = this.y0.getValue().isDeviceManualFaqShow(this.K.getDeviceInfo());
        if (strIsDeviceManualFaqShow == null) {
            runOnUiThread(new Runnable() { // from class: fq3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.U0();
                }
            });
        } else {
            runOnUiThread(new Runnable() { // from class: gq3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.V0(strIsDeviceManualFaqShow);
                }
            });
        }
    }

    private Boolean X(String str) {
        return (Boolean) this.n0.getValue(str, Boolean.FALSE);
    }

    private void X0() {
        this.x.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: tp3
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                this.a.G0(nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    private int Y() {
        int iZ = Z();
        if (iZ != 0) {
            if (iZ == 1) {
                return 1;
            }
            if (iZ == 16) {
                return 2;
            }
        }
        return 0;
    }

    private boolean Y0() {
        return !p0();
    }

    private int Z() {
        if (Y0()) {
            return HMPersonInfo.getInstance().getMiliConfig().getWeightBfsUnit();
        }
        Integer value = this.X.getDeviceUnitLiveData().getValue();
        if (value == null) {
            return -1;
        }
        return value.intValue();
    }

    private void Z0() {
        this.X.getWifiStateLiveData().observe(this, new Observer() { // from class: up3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.H0((WiFiConnectStatus) obj);
            }
        });
        this.X.getDeviceUnitLiveData().observe(this, new Observer() { // from class: aq3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.I0((Integer) obj);
            }
        });
        this.X.getStatueLiveData().observe(this, new Observer() { // from class: wp3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.J0((UpdateState) obj);
            }
        });
        this.X.getDeviceStatusLiveData().observe(this, new Observer() { // from class: xp3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.K0((HMDeviceConnectionEvent) obj);
            }
        });
        this.X.getDeviceBatteryLiveData().observe(this, new Observer() { // from class: zp3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.L0((Boolean) obj);
            }
        });
        this.X.getDeviceSettingMode().observe(this, new Observer() { // from class: vp3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.M0((SettingMode) obj);
            }
        });
        this.X.getDeviceFwCheckResultLiveData().observe(this, new Observer() { // from class: yp3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.N0((EventFwCheckResult) obj);
            }
        });
    }

    private void a0() {
        startActivityForResult(new Intent(this, (Class<?>) SettingOfScaleActivity.class), 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1() {
        if (this.M) {
            z1();
        }
        b0(3);
    }

    private void b0(int i) {
        this.z.setVisibility(8);
        if (ConfigHelperKt.hasFeature(Feature.WEIGHT_SUPPORT_ACTIVE_CONNECT, this.J)) {
            this.A.setVisibility(0);
            if (i == 1) {
                i1(false);
                s1();
                this.B.setText(R.string.device_tip_connecting);
                this.D.setImageResource(R.drawable.ic_device_connecting);
                this.C.setText(R.string.weight_connect_tips);
                return;
            }
            if (i == 2) {
                t1();
                this.K = this.v0.getValue().getDevice(HMDeviceType.WEIGHT);
                this.B.setText(R.string.add_devices_isconnect);
                this.C.setText("");
                this.D.setImageBitmap(null);
                i1(true);
                if (BindWiFISettingHelper.INSTANCE.isDeviceNeedSettingWiFi(this.J)) {
                    this.X.queryWiFiState();
                }
                u1();
                y1();
                if (Y0()) {
                    return;
                }
                W();
                return;
            }
            if (i == 3) {
                t1();
                this.B.setText(R.string.weight_device_connect_failed);
                this.D.setImageResource(R.drawable.ic_device_connect_fail);
                this.C.setText(R.string.weight_connect_tips);
                i1(false);
                return;
            }
            if (i != 4) {
                return;
            }
            t1();
            this.B.setText(R.string.weight_device_no_connect);
            this.D.setImageResource(R.drawable.ic_device_connect_fail);
            this.C.setText(R.string.weight_help_title_3);
            i1(false);
        }
    }

    private void b1(String str, boolean z) {
        this.n0.setValue(str, Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    private Boolean c0() {
        boolean zHasFwUpgrade;
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
            if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                zHasFwUpgrade = HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(this, hMDeviceType);
            } else {
                zHasFwUpgrade = HMFwUpgradeManager.getInstance().hasFwUpgrade(this, HMDeviceType.WEIGHT);
            }
        } else {
            zHasFwUpgrade = HMFwUpgradeManager.getInstance().hasFwUpgrade(this, HMDeviceType.WEIGHT);
        }
        return Boolean.valueOf(zHasFwUpgrade);
    }

    private void c1(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        DeviceXFunctionsKt.getPropertyStoreApi().setProperty(BodyfatProperty.PROPERTY_SMALL_WEIGHTING_SETTING, jSONObject.toString());
        DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(Activity activity) {
        LoadingDialog loadingDialog;
        if (activity == null || activity.isDestroyed() || activity.isFinishing() || (loadingDialog = this.F0) == null || !loadingDialog.isShowing()) {
            return;
        }
        this.F0.dismiss();
        this.F0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(int i) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        hMPersonInfo.getMiliConfig().setWeightBfsUnit(i);
        hMPersonInfo.saveInfo(2);
        this.x0.getValue().updateProfile(false);
    }

    private void e0() {
        if (this.J != HMDeviceSource.WEIGHT_AMAZFIT_SCALE) {
            this.H.setTrailing((Drawable) null);
            this.s0.setTrailing((Drawable) null);
        } else {
            this.z0.setVisibility(0);
            this.s0.setVisibility(8);
            this.H.setVisibility(8);
            this.z0.setOnClickListener(new View.OnClickListener() { // from class: mq3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.y0(view);
                }
            });
        }
    }

    private void e1(int i, ListTile listTile) {
        if (!this.v0.getValue().isBluetoothEnable()) {
            b0(4);
            IconToast.showError(this.O, getString(R.string.device_tip_ble_not_open));
            if (listTile != null) {
                listTile.setChecked(!listTile.isChecked());
                return;
            }
            return;
        }
        this.M = true;
        this.D0 = i;
        HMBaseDevice device = this.v0.getValue().getDevice(HMDeviceType.WEIGHT);
        if (device != null && device.isConnected()) {
            HMLog.d(G0, "device already connect....", new Object[0]);
            f1();
        } else {
            HMLog.i(G0, "device need reconnect....", new Object[0]);
            this.o0.showLoading(R.string.device_connecting);
            this.P.removeMessages(256);
            this.P.sendEmptyMessageDelayed(256, 30000L);
        }
    }

    private void f0() {
        if (!r0()) {
            this.Y.setVisibility(8);
            return;
        }
        this.Y.setChecked(X(U0).booleanValue());
        this.Y.setVisibility(0);
        this.Y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oq3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.z0(compoundButton, z);
            }
        });
    }

    private void f1() {
        this.M = false;
        int i = this.D0;
        if (i == 1) {
            BindWiFISettingHelper.INSTANCE.initIWiFiController(this.K);
            if (TextUtils.isEmpty(this.X.getWifiStateLiveData().getValue() == null ? null : this.X.getWifiStateLiveData().getValue().getSsid())) {
                WifiRouter.INSTANCE.launchWifiSet(this, this.J.getValue(), 17);
                return;
            } else {
                WifiRouter.INSTANCE.launchWifiConfig(this, this.J.getValue(), 17);
                return;
            }
        }
        if (i == 2) {
            this.X.updateSwitchStatus(1, this.Y.isChecked());
            return;
        }
        if (i == 3) {
            this.X.updateSwitchStatus(2, this.Z.isChecked());
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            g1(this.N);
        } else if (p0()) {
            this.X.updateSwitchStatus(3, this.R.isChecked());
        } else {
            this.X.setPartMeasureModel(this.R.isChecked());
        }
    }

    private void g0() {
        int i;
        int i2 = b.a[this.J.ordinal()];
        if (i2 == 1) {
            i = R.string.weight_setting_weight;
        } else if (i2 == 2) {
            i = R.string.weight_scale_bfs;
        } else if (i2 == 3) {
            i = R.string.weight_setting_weight_bodyfat;
        } else if (i2 != 4) {
            i = i2 != 5 ? 0 : R.string.weight_bfs;
        } else {
            i = R.string.weight_scale2;
        }
        if (i != 0) {
            ((ListTile) findViewById(R.id.weight_setting_help)).setTitle(getString(R.string.play_with_device, new Object[]{getString(i)}));
            return;
        }
        HMLog.i(G0, "Not support device:" + this.J, new Object[0]);
    }

    private void g1(int i) {
        HMBaseDevice device;
        if (v0() && (device = this.v0.getValue().getDevice(HMDeviceType.WEIGHT)) != null && device.isConnected()) {
            HMLog.i(G0, "setUnit unit = " + i, new Object[0]);
            if (p0()) {
                this.X.setUnit(i);
            } else {
                ((HMWeightDevice) device).setUnit(this.w0.getValue().convertToBtUnit(i), new a(i));
            }
        }
    }

    private void h0() {
        String boundDeviceAddress = this.v0.getValue().getBoundDeviceAddress(HMDeviceType.WEIGHT);
        this.s0.setTips(boundDeviceAddress);
        this.w0.getValue().enableGetMacAddress(this, this.s0, boundDeviceAddress);
    }

    private void h1() {
        String deviceDescription = this.w0.getValue().getDeviceDescription(this.J);
        String strTrim = "";
        if (TextUtils.isEmpty(deviceDescription)) {
            this.y.setTitle("");
        } else {
            this.y.setTitle(deviceDescription);
        }
        Device device = this.p0;
        String displayName = device != null ? device.getDisplayName() : null;
        if (displayName != null && !displayName.isEmpty() && displayName.trim().length() > 0) {
            strTrim = displayName.trim();
        }
        this.y.setSubtitle(strTrim);
    }

    private void i0() {
        this.t0.setVisibility(p0() ? 0 : 8);
    }

    private void i1(boolean z) {
        this.q0.setEnabled(z);
        this.m0.setEnabled(z);
        this.L.setEnabled(z);
        this.I.setEnabled(z);
        this.r0.setEnabled(z);
        this.H.setEnabled(z);
        this.s0.setEnabled(z);
        this.t0.setEnabled(z);
        j1(z);
        this.z0.setEnabled(z);
    }

    private void initData() {
        this.U = getIntent().getBooleanExtra(Q0, false);
        this.V = getIntent().getBooleanExtra(R0, false);
        DeviceManagerApi value = this.v0.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
        this.K = value.getDevice(hMDeviceType);
        this.J = this.v0.getValue().getBoundDeviceSource(hMDeviceType);
        this.p0 = this.v0.getValue().getBindInfo(hMDeviceType);
        this.P = new c();
        this.O = this;
        this.X = (WeightSettingViewModel) new ViewModelProvider(this).get(WeightSettingViewModel.class);
        this.n0 = KvKit.getKvPersistence(S0, false);
        if (this.K == null) {
            HMLog.i(G0, "hmWeightDevice is NULL!!!", new Object[0]);
            finish();
        }
    }

    private void initViews() {
        this.y = (RainbowTitleBar) findViewById(R.id.toolbar);
        this.x = (NestedScrollView) findViewById(R.id.scroll_content);
        this.z = (Group) findViewById(R.id.group_battery_info);
        this.A = (Group) findViewById(R.id.group_device_status);
        this.E = (TextView) findViewById(R.id.tv_battery_level);
        this.B = (TextView) findViewById(R.id.tv_device_status);
        this.C = (TextView) findViewById(R.id.tv_device_status_tips);
        this.D = (ImageView) findViewById(R.id.icon_state);
        this.G = (ListTile) findViewById(R.id.weight_setting_merge);
        this.H = (ListTile) findViewById(R.id.weight_setting_firmware_version);
        this.I = (ListTile) findViewById(R.id.weight_setting_firmware_upgrade);
        this.L = (ListTile) findViewById(R.id.unit_set_layout);
        this.R = (ListTile) findViewById(R.id.weight_setting_smart_weight);
        ListTile listTile = (ListTile) findViewById(R.id.mili_setting_faq_item);
        this.S = listTile;
        listTile.setOnClickListener(new View.OnClickListener() { // from class: nq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.F0(view);
            }
        });
        this.Y = (ListTile) findViewById(R.id.body_analyse_layout);
        this.Z = (ListTile) findViewById(R.id.weight_pressure_layout);
        this.m0 = (ListTile) findViewById(R.id.wifi_set_layout);
        this.F = (TextView) findViewById(R.id.tv_low_battery);
        this.q0 = (ListTile) findViewById(R.id.show_setting_layout);
        this.r0 = (ListTile) findViewById(R.id.weight_setting_erase_data);
        this.s0 = (ListTile) findViewById(R.id.mac_address);
        this.t0 = (ListTile) findViewById(R.id.member_layout);
        this.z0 = findViewById(R.id.amazfit_scale_about_device);
        h1();
        x1();
        i0();
        o0();
        j0();
        n0();
        m0();
        f0();
        k0();
        y1();
        h0();
        g0();
        if (p0()) {
            this.r0.setTitle(R.string.bind_restore_factory);
            this.r0.setSubtitle((CharSequence) null);
        } else {
            this.r0.setTitle(R.string.erase_scale_history_data_item_title);
            this.r0.setSubtitle(R.string.erase_scale_history_data_item_sub_title);
        }
        this.r0.setVisibility(this.v0.getValue().hasBound(HMDeviceSource.WEIGHT_BFS, HMDeviceSource.WEIGHT_SCALE2, HMDeviceSource.WEIGHT_AMAZFIT_SCALE) ? 0 : 8);
        this.q0.setVisibility(t0() ? 0 : 8);
        l0();
        X0();
        e0();
        this.y.setNavigationOnClickListener(new View.OnClickListener() { // from class: lq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.D0(view);
            }
        });
        this.y.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: cq3
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                this.a.E0(view, i);
            }
        });
        if (Build.VERSION.SDK_INT >= 23) {
            this.B0 = getColor(R.color.s10);
        } else {
            this.B0 = -1;
        }
        this.y.setBackgroundColor(0);
    }

    public static boolean isSetUnitJin() {
        return HMPersonInfo.getInstance().getMiliConfig().getWeightBfsUnit() == 16;
    }

    private void j0() {
        final HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.G.setChecked(hMPersonInfo.getMiliConfig().isWeightMergeResult());
        this.G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sp3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.A0(hMPersonInfo, compoundButton, z);
            }
        });
    }

    private void j1(boolean z) {
        this.G.setEnabled(z);
        this.R.setEnabled(z);
        this.Y.setEnabled(z);
        this.Z.setEnabled(z);
    }

    private void k0() {
        if (!s0()) {
            this.Z.setVisibility(8);
            return;
        }
        this.Z.setChecked(X(T0).booleanValue());
        this.Z.setVisibility(0);
        this.Z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pq3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.B0(compoundButton, z);
            }
        });
    }

    private void k1(int i) {
        this.L.setTips(ScaleUnitSettingUtilsKt.getUnitString(this, i));
    }

    private void l0() {
        if (GlobalConfig.get().isBuildInner() && HMDeviceConfig.isBfs(this.J)) {
            ((ListTile) findViewById(R.id.test_layout)).setVisibility(0);
            ((ListTile) findViewById(R.id.test_algo_layout)).setVisibility(0);
        }
    }

    private void l1() {
        boolean zEquals = Locale.US.getCountry().equals(Locale.getDefault().getCountry());
        if (this.U && zEquals && p0()) {
            this.X.setUnit(1);
        }
    }

    public static void launch(Context context, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) HMWeightSettingActivity.class);
        intent.putExtra(Q0, z);
        intent.putExtra(R0, z2);
        context.startActivity(intent);
    }

    private void m0() {
        if (!u0()) {
            this.R.setVisibility(8);
            return;
        }
        this.R.setVisibility(0);
        if (!Y0()) {
            this.R.setChecked(q0());
        }
        this.R.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rp3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.C0(compoundButton, z);
            }
        });
    }

    private void m1(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        int i = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, getString(i));
        this.F0 = loadingDialogShowDialog;
        loadingDialogShowDialog.setMessage(getString(i));
        this.F0.setCancelable(false);
        this.F0.show();
        this.P.sendEmptyMessageDelayed(512, 30000L);
    }

    private void n0() {
        ImageView imageView = (ImageView) findViewById(R.id.weight_setting_chart);
        this.L.setVisibility(0);
        if (p0()) {
            imageView.setBackgroundResource(R.drawable.device_amazfit_scale);
            this.L.setTitle(R.string.setting_unit);
            Device device = this.p0;
            if (device != null && device.getProductVersion().intValue() == 257) {
                this.L.setVisibility(8);
            }
        } else if (HMDeviceConfig.isBfs(this.J)) {
            imageView.setBackgroundResource(R.drawable.device_scale_bodyfat);
            this.L.setTitle(R.string.weight_set_unit);
        } else {
            imageView.setBackgroundResource(R.drawable.device_scale);
            this.L.setTitle(R.string.weighing_scale_unit);
        }
        if (!v0()) {
            this.L.setVisibility(8);
        } else if (Y0()) {
            B1();
        }
    }

    private void n1() {
        AlertDialogFragment alertDialogFragmentNewInstance;
        Device device = this.p0;
        if (device == null || (alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(device, getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: dq3
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                this.a.v1(str);
            }
        })) == null) {
            return;
        }
        alertDialogFragmentNewInstance.show(getSupportFragmentManager());
    }

    private void o0() {
        if (w0()) {
            this.m0.setVisibility(0);
        } else {
            this.m0.setVisibility(8);
        }
    }

    private void o1() {
        this.A.setVisibility(8);
        this.F.setVisibility(0);
        this.F.setText(R.string.weight_device_low_pow);
    }

    private boolean p0() {
        return this.J == HMDeviceSource.WEIGHT_AMAZFIT_SCALE;
    }

    private void p1() {
        final Map<String, Integer> scaleUnitResList = ScaleUnitSettingUtilsKt.getScaleUnitResList(this, this.J);
        int iZ = Z();
        final String[] strArr = (String[]) scaleUnitResList.keySet().toArray(new String[0]);
        final int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = -1;
                break;
            } else if (scaleUnitResList.containsKey(strArr[i]) && iZ == scaleUnitResList.get(strArr[i]).intValue()) {
                break;
            } else {
                i++;
            }
        }
        HMLog.i(G0, "defaultIndex = " + i, new Object[0]);
        new AlertDialogFragment.Builder(this).setTitle(HMDeviceConfig.isBfs(this.J) ? R.string.weight_set_unit : R.string.weight_set_unit_scale).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(strArr).setItemChoice((HMWeightUtils.isHideUnitJin() && isSetUnitJin()) ? -1 : i), new DialogInterface.OnClickListener() { // from class: iq3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.Q0(strArr, scaleUnitResList, i, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    private boolean q0() {
        try {
            return new JSONObject(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(BodyfatProperty.PROPERTY_SMALL_WEIGHTING_SETTING, "")).optBoolean("enable");
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q1() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(HMDeviceConfig.hasBoundBfs() ? R.string.update_unit_failure : R.string.weight_setting_failure).setNeutralButton(R.string.got_it, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
    }

    private boolean r0() {
        return p0();
    }

    private void r1(final HMBaseDevice hMBaseDevice) {
        CenterDialogFragment negativeButton = CenterDialogFragment.INSTANCE.newInstance(0).setTitle(getString(this.V ? R.string.bind_set_wifi_tip_title : R.string.re_bind_set_wifi_tip_title)).setMessage(getString(R.string.bind_set_wifi_tip_context)).setPositiveButton(getString(R.string.wifi_config_now), null, new DialogInterface.OnClickListener() { // from class: bq3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.R0(hMBaseDevice, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.wifi_not_config_now), null, new DialogInterface.OnClickListener() { // from class: jq3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMWeightSettingActivity.S0(dialogInterface, i);
            }
        });
        negativeButton.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: kq3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.T0(dialogInterface);
            }
        });
        negativeButton.show(getSupportFragmentManager());
    }

    private boolean s0() {
        return false;
    }

    private void s1() {
        if (this.C0 == null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.C0 = rotateAnimation;
            rotateAnimation.setDuration(3000L);
            this.C0.setInterpolator(new LinearInterpolator());
            this.C0.setRepeatMode(1);
            this.C0.setRepeatCount(-1);
        }
        ImageView imageView = this.D;
        if (imageView == null || imageView.getAnimation() != null) {
            return;
        }
        this.D.startAnimation(this.C0);
    }

    private boolean t0() {
        return p0();
    }

    private void t1() {
        ImageView imageView = this.D;
        if (imageView == null || this.C0 == null || imageView.getAnimation() == null) {
            return;
        }
        this.D.clearAnimation();
    }

    private boolean u0() {
        return this.v0.getValue().hasBound(HMDeviceSource.WEIGHT_BFS, HMDeviceSource.WEIGHT_SCALE2);
    }

    private void u1() {
        if (this.K.getDeviceInfo() == null) {
            return;
        }
        new Thread(new Runnable() { // from class: eq3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.W0();
            }
        }).start();
    }

    private boolean v0() {
        return HMDeviceConfig.isBfs(this.J) || this.J == HMDeviceSource.WEIGHT_SCALE2 || p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v1(String str) {
        h1();
    }

    private boolean w0() {
        return BindWiFISettingHelper.INSTANCE.isDeviceNeedSettingWiFi(this.J);
    }

    private void w1() {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
            if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, hMDeviceType, false);
                return;
            }
        }
        HMFwUpgradeManager.getInstance().checkFwUpgrade(this, HMDeviceType.WEIGHT, false);
    }

    private void x0(int i) {
        this.N = i;
        e1(5, null);
    }

    private void x1() {
        if (!DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            this.I.setVisibility(8);
        } else {
            this.I.setTrailing((Drawable) null);
            this.I.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(View view) {
        DeviceManagerApi value = this.v0.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
        String boundDeviceFirmwareVersion = value.getBoundDeviceFirmwareVersion(hMDeviceType);
        String strReplaceAll = boundDeviceFirmwareVersion != null ? boundDeviceFirmwareVersion.replaceAll("^[vV]", "") : "";
        String boundDeviceAddress = this.v0.getValue().getBoundDeviceAddress(hMDeviceType);
        if (boundDeviceAddress == null) {
            boundDeviceAddress = "";
        }
        HMBaseDevice device = this.v0.getValue().getDevice(hMDeviceType);
        WeightAboutActivity.INSTANCE.startActivity(strReplaceAll, device != null ? ((HMAmazfitScaleDevice) device).getWifiRevision() : "", boundDeviceAddress);
    }

    private void y1() {
        String boundDeviceFirmwareVersion = this.v0.getValue().getBoundDeviceFirmwareVersion(HMDeviceType.WEIGHT);
        this.H.setTips(boundDeviceFirmwareVersion != null ? boundDeviceFirmwareVersion.replaceAll("^[vV]", "") : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            e1(2, this.Y);
        }
    }

    private void z1() {
        this.M = false;
        this.o0.hideLoading();
        q1();
        int i = this.D0;
        if (i == 2) {
            HMLog.i(G0, "打开孕妇开关失败:" + this.Y.isChecked(), new Object[0]);
            ListTile listTile = this.Y;
            listTile.setChecked(listTile.isChecked() ^ true);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            ListTile listTile2 = this.R;
            listTile2.setChecked(!listTile2.isChecked());
            return;
        }
        HMLog.i(G0, "压力测试开关失败:" + this.Y.isChecked(), new Object[0]);
        ListTile listTile3 = this.Z;
        listTile3.setChecked(listTile3.isChecked() ^ true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 0) {
                if ((intent != null ? intent.getIntExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, -1) : -1) == 1) {
                    BFKeeper.clearScaleGuestPrivateTipSetting();
                    BFKeeper.clearSettingOf(AddGuestActivity.GUEST_ONE_FOOT_NEED_SAFETY_WARNING);
                }
                finish();
            }
            switch (i) {
                case 16:
                    if (u0()) {
                        c1(true);
                        this.R.setChecked(true);
                    }
                    BodyFatSp.INSTANCE.setScaleWifi(this, false);
                    break;
                case 17:
                    String stringExtra = intent != null ? intent.getStringExtra(WifiSetActivity.KEY_CONNECT_SSID) : null;
                    HMLog.i(G0, " wifi setting success!!!" + stringExtra, new Object[0]);
                    this.X.getWifiStateLiveData().postValue(new WiFiConnectStatus(stringExtra, ConnectStatus.CONNECTED, null));
                    BodyFatSp.INSTANCE.setScaleWifi(this, true ^ TextUtils.isEmpty(stringExtra));
                    break;
                case 18:
                    HMLog.d(G0, "scale setting success!!!", new Object[0]);
                    break;
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.weight_setting_help) {
            this.u0.getValue().launchWeightDevicePlay(this, this.J);
            Analytics.recordEvent(new CountEventBuilder(this.Q).setValue("LearnMore"));
            return;
        }
        if (id == R.id.member_layout) {
            startActivity(new Intent(this, (Class<?>) FamilyListActivity.class));
            return;
        }
        if (id == R.id.weight_setting_unbind) {
            Intent intent = new Intent();
            intent.setClass(this, HMUnbindDeviceActivity.class);
            intent.putExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, 1);
            startActivityForResult(intent, 0);
            Analytics.recordEvent(new CountEventBuilder(this.Q).setValue("Unbind"));
            return;
        }
        if (id == R.id.unit_set_layout) {
            p1();
            Analytics.recordEvent(new CountEventBuilder(this.Q).setValue("Unit"));
            return;
        }
        if (id == R.id.test_layout) {
            startActivity(new Intent(this, (Class<?>) InternalScoreTestActivity.class));
            return;
        }
        if (id == R.id.test_algo_layout) {
            startActivity(new Intent(this, (Class<?>) BodyIndexAlgoTestActivity.class));
            return;
        }
        if (id == R.id.weight_setting_erase_data) {
            if (this.v0.getValue().isBluetoothEnable()) {
                startActivityForResult(new Intent(this, (Class<?>) EraseScaleHistoryDataActivity.class), 16);
                return;
            } else {
                b0(4);
                IconToast.showError(this.O, getString(R.string.device_tip_ble_not_open));
                return;
            }
        }
        if (id == R.id.show_setting_layout) {
            Intent intent2 = new Intent(this, (Class<?>) HMWeightSmartCardsListActivity.class);
            intent2.putExtra("deviceSource", this.J);
            startActivity(intent2);
        } else {
            if (id == R.id.wifi_set_layout) {
                e1(1, null);
                return;
            }
            if (id == R.id.btn_back) {
                finish();
            } else if (id == R.id.btn_edit) {
                n1();
            } else if (id == R.id.weight_setting_firmware_upgrade) {
                V(view);
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weight_setting);
        setStyle(BaseTitleActivity.STYLE.NONE);
        initData();
        initViews();
        EventBus.getDefault().registerSticky(this);
        if (HMDeviceConfig.isBfs(this.J)) {
            this.Q = StatEvent.DEVICE_BFS_OPERATE;
            Analytics.recordEvent(new CountEventBuilder(StatEvent.BFS_VIEW_NUM));
        } else {
            this.Q = StatEvent.DEVICE_SCALE_OPERATE;
            Analytics.recordEvent(new CountEventBuilder(StatEvent.SCALE_VIEW_NUM));
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.DEVICE_VIEW_NUM).setValue(String.valueOf(this.J.getValue())));
        Z0();
        HMBaseDevice hMBaseDevice = this.K;
        if (hMBaseDevice != null && hMBaseDevice.isConnected()) {
            u1();
            b0(2);
        }
        w1();
        if (this.V && p0()) {
            a0();
        } else {
            WeightPermissionManager.requestWeightPermission(this, new Function0() { // from class: hq3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return this.a.P0();
                }
            });
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        this.P.removeCallbacksAndMessages(null);
        this.o0.hideLoading();
        t1();
    }

    public void onEventMainThread(EventUpdateUnit eventUpdateUnit) {
        B1();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        T();
    }

    public static void launch(Context context) {
        launch(context, false, false);
    }
}
