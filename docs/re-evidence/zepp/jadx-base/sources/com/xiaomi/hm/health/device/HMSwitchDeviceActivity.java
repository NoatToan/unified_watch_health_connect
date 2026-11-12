package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMSwitchDeviceActivity;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchLogic;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import com.xiaomi.hm.health.device.bind.enable.ISwitchDeviceCallback;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncGpsDataEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.introduce.BindIntroEvent;
import com.xiaomi.hm.health.device.introduce.BindIntroExtendsKt;
import com.xiaomi.hm.health.device.introduce.BindIntroStatus;
import com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment;
import com.xiaomi.hm.health.device.introduce.ChooseRestoreFragment;
import com.xiaomi.hm.health.device.introduce.RestoreChooseCallback;
import com.xiaomi.hm.health.device.introduce.RestoreItem;
import com.xiaomi.hm.health.device.introduce.SwitchConditionProvider;
import com.xiaomi.hm.health.device.introduce.recocver.RestoreParserKt;
import com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.view.HMLoadingView;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMSwitchDeviceActivity extends BaseTitleActivity implements SwitchConditionProvider, RestoreChooseCallback {
    public static final int REQUEST_CODE_START_DEVICE = 1024;
    private static final String S = "HMSwitchDeviceActivity";
    public static final int STOP_NOT_CONNECTED = 1;
    private static final String T = "start_db_device";
    public static final String TAG_ENABLE = "TAG_ENABLE";
    private static final String U = "stop_db_device";
    private static final int V = 0;
    private static final int W = 1;
    private static final int X = 2;
    private static final int Y = 4111;
    private static final int Z = 30000;
    private static final int m0 = 0;
    private static final String n0 = "from_bind";

    @SuppressLint({"StaticFieldLeak"})
    private static HMBaseDevice o0;
    private static final DeviceXNavigator p0 = (DeviceXNavigator) KoinJavaComponent.get(DeviceXNavigator.class);
    private static final Lazy<DeviceManagerApi> q0 = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<DeviceUtilsApi> r0 = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private static final Lazy<DeviceTimeStoreApi> s0 = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
    private static final Lazy<AgpsTimeStore> t0 = KoinJavaComponent.inject(AgpsTimeStore.class);
    private HMLoadingView A;
    private final Lazy<DeviceXNavigator> x = KoinJavaComponent.inject(DeviceXNavigator.class);
    private Device y = null;
    private Device z = null;
    private TextView B = null;
    private TextView C = null;
    private TextView D = null;
    private TextView E = null;
    private TextView F = null;
    private TextView G = null;
    private ImageView H = null;
    private RelativeLayout I = null;
    private RelativeLayout J = null;
    private ViewGroup K = null;
    private final ConditionVariable L = new ConditionVariable();
    private final ConditionVariable M = new ConditionVariable();
    private final ConditionVariable N = new ConditionVariable();
    private HMDeviceType O = HMDeviceType.VDevice;
    private int P = 1;
    public boolean Q = false;
    private final Lazy<BindServiceApi> R = KoinJavaComponent.inject(BindServiceApi.class);

    public static class MyStartTask extends AsyncTask<Void, Void, Boolean> {
        private WeakReference<Object> a;
        private final Device b;
        private final Device c;
        private HMDeviceSource d;
        private HMDeviceSource e;
        private String f;
        private final Lazy<ISwitchDeviceCallback> g = KoinJavaComponent.inject(ISwitchDeviceCallback.class);
        private final int h = 65535;

        public MyStartTask(Object obj) {
            this.a = new WeakReference<>(obj);
            if (!(obj instanceof SwitchConditionProvider)) {
                throw new IllegalArgumentException("参数类型错误，必须为SwitchConditionProvider子类！");
            }
            SwitchConditionProvider switchConditionProvider = (SwitchConditionProvider) obj;
            Device startDevice = switchConditionProvider.getStartDevice();
            this.b = startDevice;
            Device stopDevice = switchConditionProvider.getStopDevice();
            this.c = stopDevice;
            if (startDevice != null) {
                this.d = HMDeviceSource.fromValue(startDevice.getDevice_source().intValue());
                this.f = startDevice.getDevice_address();
            }
            if (stopDevice != null) {
                this.e = HMDeviceSource.fromValue(stopDevice.getDevice_source().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String e() {
            return "start, source: " + this.d + ", mac: " + this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f(boolean z) {
            return "unbind virtual device from cloud, result" + z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g(Exception exc) {
            return "onEnableStart: " + exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String h(Boolean bool) {
            return "startResult: " + bool;
        }

        private void i(Object obj) {
            try {
                this.g.getValue().onEnableStart(obj instanceof HMSwitchDeviceActivity ? (AppCompatActivity) obj : (AppCompatActivity) ((BindIntroduceMainFragment) obj).requireActivity(), ((SwitchConditionProvider) obj).getStartBleDevice());
            } catch (Exception e) {
                HMLog.error(HMSwitchDeviceActivity.S, new Function0() { // from class: aj3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMSwitchDeviceActivity.MyStartTask.g(e);
                    }
                });
            }
        }

        private void j(HMDeviceSource hMDeviceSource) {
            HMMiLiProDevice hMMiLiProDevice;
            if (HMDeviceConfig.hasFeatureG1(hMDeviceSource)) {
                HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) ((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).getDevice(hMDeviceSource.getType());
                if (hMMiLiDevice != null && hMMiLiDevice.isConnected()) {
                    hMMiLiDevice.setGoalSync(65535);
                    List<AlarmClockExt> oneBandAlarmExt = AlarmClockManager.getInstance().getOneBandAlarmExt();
                    if (oneBandAlarmExt != null && oneBandAlarmExt.size() > 0) {
                        Iterator<AlarmClockExt> it2 = oneBandAlarmExt.iterator();
                        while (it2.hasNext()) {
                            it2.next().setEnable(false);
                        }
                        hMMiLiDevice.setAlarmSync(oneBandAlarmExt);
                    }
                }
            } else if (HMDeviceConfig.hasFeatureG3(hMDeviceSource) && (hMMiLiProDevice = (HMMiLiProDevice) ((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).getDevice(hMDeviceSource.getType())) != null && hMMiLiProDevice.isConnected()) {
                hMMiLiProDevice.stopDeviceSync();
            }
            if (ConfigHelperKt.hasFeature(Feature.SUPPORT_GPS, hMDeviceSource)) {
                ((AgpsTimeStore) HMSwitchDeviceActivity.t0.getValue()).reset();
                DeviceGpsHelper.Companion.INSTANCE.clearLastLocSendToDevice();
            }
            if (HMDeviceConfig.hasFeatureClassicBtGPS(hMDeviceSource)) {
                DeviceGpsHelper.Companion.INSTANCE.clearLastLocSendToDevice();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            Object obj;
            super.onPreExecute();
            WeakReference<Object> weakReference = this.a;
            if (weakReference == null || (obj = weakReference.get()) == null) {
                return;
            }
            i(obj);
            if (obj instanceof HMSwitchDeviceActivity) {
                HMSwitchDeviceActivity hMSwitchDeviceActivity = (HMSwitchDeviceActivity) obj;
                hMSwitchDeviceActivity.B.setText(R.string.start_device_now);
                hMSwitchDeviceActivity.C.setText(this.d == HMDeviceSource.MILI_WUHAN ? ((DeviceUtilsApi) HMSwitchDeviceActivity.r0.getValue()).getMiLiDeviceDescription(this.d, this.b.getHardwareVersion()) : ((DeviceUtilsApi) HMSwitchDeviceActivity.r0.getValue()).getDeviceDescription(this.b));
                ((DeviceUtilsApi) HMSwitchDeviceActivity.r0.getValue()).updateDeviceImg(hMSwitchDeviceActivity.H, this.d);
                hMSwitchDeviceActivity.D.setVisibility(8);
            }
            if (obj instanceof BindIntroduceMainFragment) {
                EventBus.getDefault().post(new BindIntroEvent(BindIntroStatus.USE_START, true));
            }
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            HMLog.info(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: yi3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return this.a.e();
                }
            });
            WeakReference<Object> weakReference = this.a;
            if (weakReference == null) {
                return Boolean.FALSE;
            }
            Object obj = weakReference.get();
            if (obj == null) {
                return Boolean.FALSE;
            }
            SwitchConditionProvider switchConditionProvider = (SwitchConditionProvider) obj;
            Device device = this.c;
            if (device != null) {
                if (!HMDeviceWebAPI.updateDeviceToWeb(HMWebBindInfo.createUpdateInfo(device.getDevice_type().intValue(), this.c.getDevice_id(), 0, this.c.getDisplayName()))) {
                    return Boolean.FALSE;
                }
                HMDeviceType type = this.e.getType();
                if (type == HMDeviceType.MILI) {
                    HMUnbindBaseLogic.unbindThirdRelationForMiLi(DeviceXFunctionsKt.getContext(), "SwitchDevice");
                } else if (type == HMDeviceType.WATCH) {
                    BindUtil.switchOffMainDevice(switchConditionProvider.getMyContext());
                }
                j(this.e);
                if (ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, this.e)) {
                    final boolean zBindDeviceToWeb = HMDeviceWebAPI.bindDeviceToWeb(HMWebBindInfo.createUnbindInfo(type.getValue(), this.c.getDevice_id(), 0, this.e.getValue(), this.c.getDevice_address()));
                    HMLog.info(HMSwitchDeviceActivity.S, new Function0() { // from class: bj3
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return HMSwitchDeviceActivity.MyStartTask.f(zBindDeviceToWeb);
                        }
                    });
                    if (!zBindDeviceToWeb) {
                        return Boolean.FALSE;
                    }
                }
                ((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).disableDevice(type);
                EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, type));
            }
            HMWebBindInfo hMWebBindInfoCreateUpdateInfo = HMWebBindInfo.createUpdateInfo(this.b.getDevice_type().intValue(), this.b.getDevice_id(), 1, this.b.getDisplayName());
            HMBaseDevice startBleDevice = switchConditionProvider.getStartBleDevice();
            if (startBleDevice != null && startBleDevice.getDeviceInfo() != null && startBleDevice.getDeviceInfo().getFirmwareVersionStr() != null) {
                hMWebBindInfoCreateUpdateInfo.mFwVersion = startBleDevice.getDeviceInfo().getFirmwareVersionStr();
            }
            if (!HMDeviceWebAPI.updateDeviceToWeb(hMWebBindInfoCreateUpdateInfo)) {
                return Boolean.FALSE;
            }
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = calendar.getTimeInMillis();
            int timezoneKey = ProfileUtils.getTimezoneKey(calendar.getTimeZone());
            this.b.setActiveStatus(1);
            this.b.setDevice_sync_data_time(Long.valueOf(timeInMillis));
            this.b.setTime_zone(Integer.valueOf(timezoneKey));
            this.b.setDevice_sync_data_time_hr(Long.valueOf(timeInMillis));
            this.b.setTime_zone_sync_hr(Integer.valueOf(timezoneKey));
            DeviceSyncTimeMmkv.INSTANCE.onDeviceFirstEnable();
            if (GlobalConfig.get().isBuildMidong() && this.d.getType() == HMDeviceType.WATCH) {
                HMWatchLogic.switchMainDevice(switchConditionProvider.getMyContext(), switchConditionProvider.getStartDevice());
            }
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (hMDeviceType == this.d.getType()) {
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) {
                    HMFwOnlineUpgradeManager.getInstance().setAllowUpgrade(false);
                } else {
                    HMFwUpgradeManager.getInstance().setAllowUpgrade(false);
                }
                ((DeviceTimeStoreApi) HMSwitchDeviceActivity.s0.getValue()).setPressureAllDaySyncTime(calendar);
                ((DeviceTimeStoreApi) HMSwitchDeviceActivity.s0.getValue()).setPressureSingleSyncTime(calendar);
            }
            if (ConfigHelperKt.hasFeature(Feature.EVEREST_2_SERIES, this.d)) {
                HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
                StringBuilder sb = new StringBuilder();
                sb.append("smartWatchDevice not null: ");
                sb.append(hMSmartWatchDevice != null);
                HMLog.d(HMSwitchDeviceActivity.S, sb.toString(), new Object[0]);
                ((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).enableDevice(this.b, hMSmartWatchDevice);
            } else {
                ((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).enableDevice(this.b, startBleDevice);
            }
            EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, this.d.getType()));
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(final Boolean bool) {
            Object obj;
            super.onPostExecute(bool);
            HMLog.info(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: zi3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMSwitchDeviceActivity.MyStartTask.h(bool);
                }
            });
            WeakReference<Object> weakReference = this.a;
            if (weakReference == null || (obj = weakReference.get()) == null) {
                return;
            }
            if (!bool.booleanValue()) {
                HMSwitchDeviceActivity.destroyDevice(this.c);
            }
            if (!(obj instanceof HMSwitchDeviceActivity)) {
                if (obj instanceof BindIntroduceMainFragment) {
                    EventBus.getDefault().post(new BindIntroEvent(bool.booleanValue() ? BindIntroStatus.CHOOSE_RECOVER : BindIntroStatus.USE_FAIL, bool.booleanValue()));
                    return;
                }
                return;
            }
            HMSwitchDeviceActivity hMSwitchDeviceActivity = (HMSwitchDeviceActivity) obj;
            hMSwitchDeviceActivity.A.stopLoading();
            if (bool.booleanValue()) {
                hMSwitchDeviceActivity.F();
            } else {
                IconToast.showError(hMSwitchDeviceActivity, R.string.start_device_failed);
                hMSwitchDeviceActivity.I();
            }
        }
    }

    public static class MyStopTask extends AsyncTask<Void, Void, Integer> {
        private final WeakReference<Object> a;
        private final Device b;
        private final Device c;
        private HMDeviceSource d;
        private HMDeviceSource e;
        private String f;

        public MyStopTask(Object obj) {
            this.a = new WeakReference<>(obj);
            if (!(obj instanceof SwitchConditionProvider)) {
                throw new IllegalArgumentException("参数类型错误，必须为SwitchConditionProvider子类！");
            }
            SwitchConditionProvider switchConditionProvider = (SwitchConditionProvider) obj;
            Device startDevice = switchConditionProvider.getStartDevice();
            this.b = startDevice;
            Device stopDevice = switchConditionProvider.getStopDevice();
            this.c = stopDevice;
            if (startDevice != null) {
                this.d = HMDeviceSource.fromValue(startDevice.getDevice_source().intValue());
            }
            if (stopDevice != null) {
                this.e = HMDeviceSource.fromValue(stopDevice.getDevice_source().intValue());
                this.f = stopDevice.getDevice_address();
            }
        }

        private boolean f() {
            boolean z = (this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
            if (!z) {
                HMLog.error(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: gj3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMSwitchDeviceActivity.MyStopTask.g();
                    }
                });
            }
            return z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g() {
            return "sth null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String h() {
            return "stop start, source: " + this.e + ", mac:" + this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String i() {
            return "block for sync running";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String j() {
            return "block for need sync";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String k(Integer num) {
            return "stopResult: " + num;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            Object obj;
            super.onPreExecute();
            WeakReference<Object> weakReference = this.a;
            if (weakReference != null && (obj = weakReference.get()) != null && f() && (obj instanceof HMSwitchDeviceActivity)) {
                HMSwitchDeviceActivity hMSwitchDeviceActivity = (HMSwitchDeviceActivity) obj;
                hMSwitchDeviceActivity.B.setText(R.string.stop_device_now);
                hMSwitchDeviceActivity.C.setText(((DeviceUtilsApi) HMSwitchDeviceActivity.r0.getValue()).getDeviceDescription(this.c));
                hMSwitchDeviceActivity.D.setVisibility(0);
                ((DeviceUtilsApi) HMSwitchDeviceActivity.r0.getValue()).updateDeviceImg(hMSwitchDeviceActivity.H, this.e);
                hMSwitchDeviceActivity.D.setText(hMSwitchDeviceActivity.getString(R.string.stop_and_use, new Object[]{this.d == HMDeviceSource.MILI_WUHAN ? ((DeviceUtilsApi) HMSwitchDeviceActivity.r0.getValue()).getMiLiDeviceDescription(this.d, this.b.getHardwareVersion()) : ((DeviceUtilsApi) HMSwitchDeviceActivity.r0.getValue()).getDeviceDescription(this.b)}));
            }
        }

        @Override // android.os.AsyncTask
        public Integer doInBackground(Void... voidArr) {
            Object obj;
            HMLog.info(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: cj3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return this.a.h();
                }
            });
            WeakReference<Object> weakReference = this.a;
            if (weakReference == null || (obj = weakReference.get()) == null || !f()) {
                return 1;
            }
            SwitchConditionProvider switchConditionProvider = (SwitchConditionProvider) obj;
            HMDeviceType type = this.e.getType();
            if (!((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).isConnected(type)) {
                switchConditionProvider.getConnectCondition().block(30000L);
            }
            if (!((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).isConnected(type)) {
                return 1;
            }
            if (((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).isSyncingData(type)) {
                HMLog.info(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: fj3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMSwitchDeviceActivity.MyStopTask.i();
                    }
                });
                switchConditionProvider.getSyncCondition().block(30000L);
            } else if (switchConditionProvider.needSyncData()) {
                HMLog.info(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: ej3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMSwitchDeviceActivity.MyStopTask.j();
                    }
                });
                ((DeviceManagerApi) HMSwitchDeviceActivity.q0.getValue()).startSyncData(type);
                switchConditionProvider.getSyncCondition().block(30000L);
            }
            if (this.e == HMDeviceSource.MILI_PEYTO) {
                switchConditionProvider.getSyncGpsCondition().block(30000L);
            }
            return 0;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(final Integer num) {
            Object obj;
            HMLog.info(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: dj3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMSwitchDeviceActivity.MyStopTask.k(num);
                }
            });
            WeakReference<Object> weakReference = this.a;
            if (weakReference == null || (obj = weakReference.get()) == null) {
                return;
            }
            super.onPostExecute(num);
            if (num.intValue() == 0) {
                new MyStartTask(obj).execute(new Void[0]);
            } else {
                ((SwitchConditionProvider) obj).showFailedDlg(num.intValue());
            }
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            a = iArr;
            try {
                iArr[HMDeviceType.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceType.MILI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceType.SHOES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceType.WATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.P = 2;
        this.K.setVisibility(0);
        this.I.setVisibility(8);
        this.B.setText(R.string.start_device_success);
        this.E.setVisibility(0);
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(this.y.getDevice_source().intValue());
        r0.getValue().updateDeviceImg((ImageView) findViewById(R.id.device_success_img), hMDeviceSourceFromValue);
        P((ImageView) findViewById(R.id.use_success_img), hMDeviceSourceFromValue);
    }

    private static void G(Device device) {
        destroyDevice(device);
        HMFwUpgradeManager.removeIgnoreActivity(HMUnusedDeviceActivity.class);
        HMFwUpgradeManager.removeIgnoreActivity(HMUnusedDeviceActivityNew.class);
    }

    private void H() {
        this.P = 1;
        this.F.setVisibility(8);
        this.G.setVisibility(8);
        this.I.setVisibility(0);
        this.J.setVisibility(8);
        this.A.startLoading();
        if (needSyncData()) {
            new MyStopTask(this).execute(new Void[0]);
        } else {
            new MyStartTask(this).execute(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J(String str) {
        return "restore: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K(boolean z) {
        return "showConflict, app foreground: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(Device device, AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        G(device);
        dialogInterface.dismiss();
        if (appCompatActivity instanceof HMUseDeviceActivity) {
            p0.navigateToUnused(appCompatActivity, device);
            appCompatActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(AppCompatActivity appCompatActivity, Device device, Device device2, DialogInterface dialogInterface, int i) {
        if (NetUtil.isNetworkConnected(appCompatActivity)) {
            dialogInterface.dismiss();
            R(appCompatActivity, device, device2);
        } else {
            HMFwUpgradeManager.removeIgnoreActivity(HMUnusedDeviceActivity.class);
            HMFwUpgradeManager.removeIgnoreActivity(HMUnusedDeviceActivityNew.class);
            destroyDevice(device);
            IconToast.showError(appCompatActivity, appCompatActivity.getString(R.string.no_network_connection));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(DialogInterface dialogInterface, int i) {
        new MyStartTask(this).execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(DialogInterface dialogInterface, int i) {
        destroyDevice(getStopDevice());
        I();
    }

    private void P(ImageView imageView, HMDeviceSource hMDeviceSource) {
        HMDeviceType type = hMDeviceSource.getType();
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
        int i = a.a[type.ordinal()];
        if (i == 1) {
            layoutParams.setMargins((int) ViewUtils.dp2px(this, 30.0f), 0, 0, 0);
        } else if (i != 2) {
            if (i == 3 || i == 4) {
                layoutParams.setMargins((int) ViewUtils.dp2px(this, 10.0f), (int) ViewUtils.dp2px(this, 24.0f), 0, 0);
            }
        } else if (HMDeviceConfig.isWatch(hMDeviceSource)) {
            layoutParams.setMargins((int) ViewUtils.dp2px(this, 10.0f), (int) ViewUtils.dp2px(this, 24.0f), 0, 0);
        } else {
            layoutParams.setMargins(0, (int) ViewUtils.dp2px(this, 24.0f), 0, 0);
        }
        imageView.setLayoutParams(layoutParams);
    }

    private static void Q(final AppCompatActivity appCompatActivity, final Device device, final Device device2, boolean z) {
        final boolean zIsForeground = DeviceXFunctionsKt.getAppStateApi().isForeground();
        HMLog.info(S, new Function0() { // from class: xi3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMSwitchDeviceActivity.K(zIsForeground);
            }
        });
        if (!zIsForeground) {
            G(device);
        } else {
            new AlertDialogFragment.Builder(appCompatActivity).setMessage(appCompatActivity.getString(z ? R.string.unuse_other_tips : R.string.unuse_other_tips_bound, new Object[]{r0.getValue().getDeviceDescription(device2)})).setCancelable(false).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: qi3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    HMSwitchDeviceActivity.L(device, appCompatActivity, dialogInterface, i);
                }
            }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: pi3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    HMSwitchDeviceActivity.M(appCompatActivity, device, device2, dialogInterface, i);
                }
            }).show(appCompatActivity.getSupportFragmentManager());
        }
    }

    private static void R(AppCompatActivity appCompatActivity, Device device, Device device2) {
        StringBuilder sb = new StringBuilder();
        sb.append("startDevice:");
        sb.append(device != null ? device.getDevice_address() : "null");
        HMLog.d(S, sb.toString(), new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("stopDevice:");
        sb2.append(device2 != null ? device2.getDevice_address() : "null");
        HMLog.d(S, sb2.toString(), new Object[0]);
        Intent intent = new Intent(appCompatActivity, (Class<?>) HMSwitchDeviceActivity.class);
        intent.putExtra(T, device);
        if (device2 != null) {
            intent.putExtra(U, device2);
        }
        if (appCompatActivity instanceof HMUseDeviceActivity) {
            intent.putExtra(n0, true);
        }
        appCompatActivity.startActivityForResult(intent, 1024);
    }

    public static void destroyDevice(Device device, HMBaseDevice hMBaseDevice) {
        if (device == null) {
            return;
        }
        if (HMDeviceType.fromValue(device.getDevice_type().intValue()) == HMDeviceType.WATCH) {
            BindUtil.disconnectDevice(device.getDevice_address());
        } else if (hMBaseDevice != null) {
            hMBaseDevice.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        setResult(-1);
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(this.y.getDevice_source().intValue());
        if (!ConfigHelperKt.hasFeature(Feature.SELECT_RESTORE_SOURCE, hMDeviceSourceFromValue)) {
            this.R.getValue().goNext(this, this.y, false, true);
            finish();
            return;
        }
        int i = R.id.choose_container;
        findViewById(i).setVisibility(0);
        ChooseRestoreFragment chooseRestoreFragmentNewInstance = ChooseRestoreFragment.newInstance(hMDeviceSourceFromValue, false);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(i, chooseRestoreFragmentNewInstance);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        finish();
        if (this.Q) {
            p0.navigateToUnused(this, this.y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), Y);
    }

    public static void startUseDevice(AppCompatActivity appCompatActivity, Device device) {
        startUseDevice(appCompatActivity, device, null, false);
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public ConditionVariable getConnectCondition() {
        return this.L;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public Context getMyContext() {
        return this;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public HMBaseDevice getStartBleDevice() {
        return o0;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @Nullable
    public Device getStartDevice() {
        return this.y;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public Device getStopDevice() {
        return this.z;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public HMDeviceType getStopType() {
        return this.O;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public ConditionVariable getSyncCondition() {
        return this.M;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    @NotNull
    public ConditionVariable getSyncGpsCondition() {
        return this.N;
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    public boolean needSyncData() {
        return BindIntroExtendsKt.needSyncData(this.z, this.O);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == Y && i2 == -1) {
            H();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.P == 0) {
            super.onBackPressed();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_stop_device);
        boolean z = true;
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), !RainbowUtils.isDarkMode(this));
        Intent intent = getIntent();
        this.Q = intent.getBooleanExtra(n0, false);
        this.y = (Device) intent.getSerializableExtra(T);
        if (intent.hasExtra(U)) {
            this.z = (Device) intent.getSerializableExtra(U);
        }
        Device device = this.z;
        if (device != null) {
            this.O = HMDeviceType.fromValue(device.getDevice_type().intValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mStopDevice:");
        Device device2 = this.z;
        sb.append(device2 != null ? device2.getDevice_address() : "null");
        HMLog.d(S, sb.toString(), new Object[0]);
        this.I = (RelativeLayout) findViewById(R.id.work_rl);
        this.J = (RelativeLayout) findViewById(R.id.bt_disable_rl);
        this.K = (ViewGroup) findViewById(R.id.start_success_rl);
        this.B = (TextView) findViewById(R.id.title_tv);
        this.C = (TextView) findViewById(R.id.stop_device_sub_title_tv);
        this.D = (TextView) findViewById(R.id.stop_and_use_tv);
        HMLoadingView hMLoadingView = (HMLoadingView) findViewById(R.id.loading_view);
        this.A = hMLoadingView;
        hMLoadingView.setStyle(1);
        if (GlobalConfig.get().isBuildMidong()) {
            int color = ContextCompat.getColor(this, R.color.midong_progress_color);
            this.A.setStartColor(color);
            this.A.setProgressColor(color);
            this.A.setEndColor(ContextCompat.getColor(this, R.color.trans));
        }
        TextView textView = (TextView) findViewById(R.id.switch_confirm);
        this.E = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: ti3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.bt_cancel_tv);
        this.F = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ui3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.bt_enable_tv);
        this.G = textView3;
        textView3.setOnClickListener(new View.OnClickListener() { // from class: vi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        this.H = (ImageView) findViewById(R.id.device_img);
        EventBus.getDefault().register(this);
        boolean z2 = !q0.getValue().isBluetoothEnable();
        boolean zIsBuildMidong = GlobalConfig.get().isBuildMidong();
        if ((!zIsBuildMidong || this.z == null) && (zIsBuildMidong || (this.z == null && this.y.getDevice_source().intValue() == HMDeviceType.WATCH.getValue()))) {
            z = false;
        }
        if (!z2 || !z) {
            H();
            return;
        }
        this.P = 0;
        this.B.setText(R.string.ble_not_open);
        this.C.setText(R.string.ble_open_bluetooth_tip);
        this.D.setVisibility(8);
        this.I.setVisibility(8);
        this.J.setVisibility(0);
        this.F.setVisibility(0);
        this.G.setVisibility(0);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A.stopLoading();
        EventBus.getDefault().unregister(this);
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreChooseCallback
    public void onEvent(@Nullable List<? extends RestoreItem> list) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(this.y.getDevice_source().intValue());
        final String configStr = RestoreParserKt.toConfigStr(list);
        HMLog.info(S, new Function0() { // from class: wi3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMSwitchDeviceActivity.J(configStr);
            }
        });
        p0.navigateToDeviceSetting(this, hMDeviceSourceFromValue);
        this.x.getValue().startRestoreDeviceConfigActivity(this, hMDeviceSourceFromValue, configStr);
        finish();
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        HMLog.d(S, "connection:" + hMDeviceConnectionEvent, new Object[0]);
        if (hMDeviceConnectionEvent.getDeviceType() == this.O && hMDeviceConnectionEvent.isConnected()) {
            this.L.open();
        }
    }

    @Override // com.xiaomi.hm.health.device.introduce.SwitchConditionProvider
    public void showFailedDlg(int i) {
        new AlertDialogFragment.Builder(this).setMessage(i == 1 ? R.string.connect_failed_tips : R.string.sync_failed_tips).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ri3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.N(dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: si3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.O(dialogInterface, i2);
            }
        }).create().show(getSupportFragmentManager());
    }

    public static void startUseDevice(AppCompatActivity appCompatActivity, Device device, HMBaseDevice hMBaseDevice, boolean z) {
        o0 = hMBaseDevice;
        Device conflictDevice = q0.getValue().getConflictDevice(HMDeviceSource.fromValue(device.getDevice_source().intValue()));
        if (conflictDevice == null) {
            R(appCompatActivity, device, null);
        } else if (conflictDevice.getDevice_type().intValue() == HMDeviceType.WEIGHT.getValue()) {
            R(appCompatActivity, device, conflictDevice);
        } else {
            Q(appCompatActivity, device, conflictDevice, z);
        }
    }

    public void onEventMainThread(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        HMLog.d(S, "sync data:" + hMDeviceSyncDataEvent, new Object[0]);
        if (hMDeviceSyncDataEvent.getDeviceType() == this.O && hMDeviceSyncDataEvent.isStop()) {
            this.M.open();
        }
    }

    public static void destroyDevice(Device device) {
        destroyDevice(device, o0);
    }

    public void onEventMainThread(HMDeviceSyncGpsDataEvent hMDeviceSyncGpsDataEvent) {
        HMLog.d(S, "sync gps data:" + hMDeviceSyncGpsDataEvent, new Object[0]);
        if (hMDeviceSyncGpsDataEvent.getDeviceType() == this.O && hMDeviceSyncGpsDataEvent.isStop()) {
            this.N.open();
        }
    }
}
