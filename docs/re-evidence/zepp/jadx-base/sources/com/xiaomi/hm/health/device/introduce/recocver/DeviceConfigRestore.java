package com.xiaomi.hm.health.device.introduce.recocver;

import android.app.Activity;
import android.os.ConditionVariable;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.todo.TodoModule;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.heartrate.reserve.HRReserveHelper;
import com.huami.watch.companion.heartrate.reserve.bean.HeartRateReserveInfo;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.MiLiHwConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HRReserveUtilsKt;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.health.pai.PaiDataHelper;
import com.xiaomi.hm.health.device.introduce.RestoreItem;
import com.xiaomi.hm.health.device.introduce.recocver.DeviceConfigRestore;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.life.feature.inject.RestoreApi;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.settings.todo.TodoManager;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class DeviceConfigRestore extends RestoreItem {
    public static final String TAG = "DeviceConfigRestore";
    private static final int i = 120000;
    private boolean a;
    private final Lazy<DeviceUtilsApi> b;
    private final Lazy<RestoreApi> c;
    private final Lazy<IRecoverManager> d;
    private final Lazy<DeviceCenter> e;
    private final HMDeviceSource f;
    private final ConditionVariable g;
    private final WeakReference<Activity> h;

    public class a extends HMCallback<Boolean> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(boolean z) {
            return "write back pai info ,ret:" + z;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(final boolean z) {
            HMLog.info(DeviceConfigRestore.TAG, new Function0() { // from class: com.xiaomi.hm.health.device.introduce.recocver.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceConfigRestore.a.b(z);
                }
            });
        }
    }

    public DeviceConfigRestore(HMDeviceSource hMDeviceSource, WeakReference<Activity> weakReference) {
        this.a = true;
        this.b = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.c = KoinJavaComponent.inject(RestoreApi.class);
        this.d = KoinJavaComponent.inject(IRecoverManager.class);
        this.e = KoinJavaComponent.inject(DeviceCenter.class);
        this.g = new ConditionVariable();
        this.f = hMDeviceSource;
        this.h = weakReference;
        EventBus.getDefault().register(this);
    }

    private String j(@StringRes int i2) {
        return DeviceXFunctionsKt.getContext().getString(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String k() {
        return "device type:" + this.f.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "no ble device!!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m() {
        return "no connection!!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(boolean z) {
        return "watchSettingRet: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "device info is null!!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(boolean z) {
        return "initSync ret:" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(boolean z) {
        return "Set heart rate zone result:" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "Unsupported todo module!";
    }

    private boolean t(HMMiLiProDevice hMMiLiProDevice) {
        HeartRateReserveInfo info = HRReserveHelper.getInstance(DeviceXFunctionsKt.getContext()).getInfo();
        if (info.getPercent() == null || info.getPercent().length == 0 || info.getSection() == null || info.getSection().length == 0) {
            return false;
        }
        final boolean heartRateZoneSync = hMMiLiProDevice.setHeartRateZoneSync((byte) info.getHeartRateType(), HRReserveUtilsKt.percentsToBytes(info.getPercent()), HRReserveUtilsKt.sectionsToBytes(info.getSection()), (byte) info.getRestingHeartRate());
        HMLog.info(TAG, new Function0() { // from class: k71
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceConfigRestore.r(heartRateZoneSync);
            }
        });
        return heartRateZoneSync;
    }

    private void u(HMBaseDevice hMBaseDevice) {
        TodoModule todoModule = (TodoModule) hMBaseDevice.getChannelModule(TodoModule.class);
        if (todoModule == null) {
            HMLog.info(TAG, new Function0() { // from class: n71
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceConfigRestore.s();
                }
            });
        } else {
            TodoManager.onActiveDevice(todoModule.loadApi());
        }
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    @MainThread
    public void afterRestore() {
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    @MainThread
    public void beforeRestore() {
    }

    @Nullable
    public Activity getActivity() {
        return this.h.get();
    }

    public HMDeviceType getDeviceType() {
        return this.f.getType();
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    @NotNull
    public String getEnableRestoreTips() {
        return j(R.string.device_config_restore_tips_enable);
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    public boolean getRestore() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    @NotNull
    public String getRestoreName() {
        return j(ConfigHelperKt.hasFeature(this.f, Feature.WATCH_SOURCE_S) ? R.string.device_config_restore_title : R.string.device_config_restore_title_band);
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    @NotNull
    public String getRestoreTips() {
        return j(ConfigHelperKt.hasFeature(this.f, Feature.WATCH_SOURCE_S) ? R.string.device_config_restore_tips : R.string.device_config_restore_tips_band);
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    public void notRestore() throws InterruptedException {
        HMBaseDevice device = this.e.getValue().getDevice();
        if (device instanceof HMMiLiProDevice) {
            HealthDetect.INSTANCE.syncUserConfigToDeviceSync(true);
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
            Iterator<IRecover> it2 = this.d.getValue().getRestoreList(DeviceConfigRestore.class, this.f).iterator();
            while (it2.hasNext()) {
                it2.next().notRecover(hMMiLiProDevice);
            }
            HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
            miliConfig.setSmsNotifyEnabled(false);
            miliConfig.setGoalRemind(true);
            miliConfig.setIncallNotifyEnabled(false);
            miliConfig.setSedentaryRemind("");
            miliConfig.setAndroidappNotifySettings(null);
            NotificationManager.getInstance().getAppsRepo().asyncAppsInfo(HMDeviceType.MILI);
            HMPersonInfo.getInstance().setMiliConfig(miliConfig);
        }
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        if (hMDeviceConnectionEvent.getDeviceType() != this.f.getType() || hMDeviceConnectionEvent.isConnected()) {
            return;
        }
        this.g.open();
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    @WorkerThread
    public boolean restore() {
        HMDeviceSource hMDeviceSource;
        boolean z;
        final boolean zInitSync;
        HMLog.info(TAG, new Function0() { // from class: g71
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.k();
            }
        });
        boolean z2 = false;
        if (this.f.getType() == HMDeviceType.VDevice) {
            return false;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(this.f.getType());
        if (device == null) {
            HMLog.info(TAG, new Function0() { // from class: o71
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceConfigRestore.l();
                }
            });
            return false;
        }
        if (!device.isConnected()) {
            this.g.block(120000L);
        }
        if (!device.isConnected()) {
            HMLog.info(TAG, new Function0() { // from class: m71
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceConfigRestore.m();
                }
            });
            return false;
        }
        final boolean zRestoreAccountSync = WatchSettingExtsKt.getWatchSettingManager().restoreAccountSync();
        HMLog.info(TAG, new Function0() { // from class: j71
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceConfigRestore.n(zRestoreAccountSync);
            }
        });
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.info(TAG, new Function0() { // from class: l71
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceConfigRestore.o();
                }
            });
            return false;
        }
        HMDeviceSource deviceSource = null;
        try {
            if (device instanceof HMMiLiDevice) {
                AlarmClockManager.getInstance().setSupportMultiSmartAlert(((HMMiLiDevice) device).isHuamiOs());
            }
            MiLiHwConfig initMiliDeviceConfig = this.b.getValue().getInitMiliDeviceConfig(deviceInfo, DeviceXFunctionsKt.getContext());
            deviceSource = deviceInfo.getDeviceSource();
            zInitSync = ((HMMiLiDevice) device).initSync(initMiliDeviceConfig);
            try {
                u(device);
                HealthDetect.INSTANCE.syncUserConfigToDeviceSync(false);
            } catch (Exception e) {
                z = zInitSync;
                e = e;
                hMDeviceSource = deviceSource;
                HMLog.error(TAG, "recover user settings error ", new Function0() { // from class: h71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return String.valueOf(e);
                    }
                });
                zInitSync = z;
                deviceSource = hMDeviceSource;
            }
        } catch (Exception e2) {
            e = e2;
            hMDeviceSource = deviceSource;
            z = false;
        }
        HMLog.info(TAG, new Function0() { // from class: i71
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceConfigRestore.q(zInitSync);
            }
        });
        if (ConfigHelperKt.hasFeature(Feature.HEART_RATE_REGION_S, deviceSource) && (device instanceof HMMiLiProDevice)) {
            if (t((HMMiLiProDevice) device) && zInitSync) {
                z2 = true;
            }
            zInitSync = z2;
        }
        boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, deviceSource);
        if (HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(42) && (device instanceof HMMiLiProDevice) && !zHasFeature) {
            ((HMMiLiProDevice) device).writePaiData(PaiDataHelper.getUserWriteBackPaiInfo(), new a());
        }
        List<IRecover> restoreList = this.d.getValue().getRestoreList(DeviceConfigRestore.class, deviceSource);
        if (!restoreList.isEmpty() && (device instanceof HMMiLiProDevice)) {
            Iterator<IRecover> it2 = restoreList.iterator();
            while (it2.hasNext()) {
                it2.next().recover((HMMiLiProDevice) device);
            }
        }
        return zInitSync;
    }

    @Override // com.xiaomi.hm.health.device.introduce.RestoreItem
    public void setRestore(boolean z) {
        this.a = z;
    }

    public boolean shouldSendRestoreEvent() {
        return this.c.getValue().shouldSendRestoreEvent(this.h.get());
    }

    public DeviceConfigRestore(HMDeviceSource hMDeviceSource, Activity activity) {
        this(hMDeviceSource, (WeakReference<Activity>) new WeakReference(activity));
    }
}
