package com.xiaomi.hm.health.ui.smartplay;

import android.content.Context;
import android.content.SharedPreferences;
import android.service.notification.NotificationListenerService;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.huami.device.feature.notification.appnotify.LinkageNotificationCenter;
import com.huami.device.feature.notification.data.AlertDataCompat;
import com.huami.device.feature.notification.module.INotificationModule;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.earbud.repo.EarbudConfigDataManager;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.MyNotificationModule;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
public class MyNotificationModule implements INotificationModule {
    private static final String a = "MyNotificationModule";

    public class a extends HMCallback<Boolean> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            if (result) {
                Analytics.event(BraceletApp.getContext(), "Message_Remind_Num");
            }
        }
    }

    public class b extends HMCallback<Boolean> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ HMAlertModeExt c;

        public b(final boolean val$supportLinkageNotification, final String val$key, final HMAlertModeExt val$ext) {
            this.a = val$supportLinkageNotification;
            this.b = val$key;
            this.c = val$ext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(Boolean bool) {
            return "alert result: " + bool;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(final Boolean result) {
            super.onFinish(result);
            HMLog.info(MyNotificationModule.a, new Function0() { // from class: com.xiaomi.hm.health.ui.smartplay.d
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MyNotificationModule.b.b(result);
                }
            });
            if (result.booleanValue() && this.a) {
                LinkageNotificationCenter.INSTANCE.saveKeyId(this.b, this.c.getId());
            }
        }
    }

    public class c extends HMCallback<Boolean> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ HMAlertModeExt c;

        public c(final boolean val$supportLinkageNotification, final String val$key, final HMAlertModeExt val$ext) {
            this.a = val$supportLinkageNotification;
            this.b = val$key;
            this.c = val$ext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(boolean z) {
            return "alert result: " + z;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(final boolean result) {
            super.onFinish(result);
            HMLog.info(MyNotificationModule.a, new Function0() { // from class: com.xiaomi.hm.health.ui.smartplay.e
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MyNotificationModule.c.b(result);
                }
            });
            if (result && this.a) {
                LinkageNotificationCenter.INSTANCE.saveKeyId(this.b, this.c.getId());
            }
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            a = iArr;
            try {
                iArr[HMDeviceType.EARBUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceType.MILI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e() {
        return "no active device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Exception exc) {
        return "e: " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(HMDeviceType hMDeviceType) {
        return "Prepare to alert to device: " + hMDeviceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        return "Failed to alert to device.";
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    @NotNull
    public Context context() {
        return BraceletApp.getContext();
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    @Nullable
    public HMMiLiDevice currentDevice() {
        return (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    @NotNull
    public Class<? extends NotificationListenerService> getNotificationListenerService() {
        return NotificationAccessService.class;
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    @NotNull
    public HashMap<HMDeviceType, String> getSettingsOfActive() {
        HashMap<HMDeviceType, String> map = new HashMap<>();
        for (Device device : HMDeviceManager.getActiveDevices()) {
            int i = d.a[HMDeviceType.fromValue(device.getDevice_type().intValue()).ordinal()];
            map.put(HMDeviceType.fromValue(device.getDevice_type().intValue()), i != 1 ? i != 2 ? "" : HMPersonInfo.getInstance().getMiliConfig().getAndroidappNotifySettings() : EarbudConfigDataManager.INSTANCE.getInstance().getConfig().getAndroidappNotifySettings());
        }
        if (map.size() == 0) {
            HMLog.info(a, new Function0() { // from class: kb5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MyNotificationModule.e();
                }
            });
        }
        return map;
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    @NotNull
    public SharedPreferences getSharedPreferences() {
        return HMKeeper.getSharedPref();
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    public boolean hasFeatureLinkageNotification() {
        try {
            return HMDeviceConfig.hasFeatureLinkageNotification();
        } catch (Exception e) {
            HMLog.error(a, new Function0() { // from class: jb5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MyNotificationModule.f(e);
                }
            });
            return false;
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    public boolean isFromMiPush(@NotNull Context context, String pkgName) {
        return MiuiAPI.getXiaomiServiceFrameworkPackageName().equals(pkgName) && MiuiAPI.isMiui(context);
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    public boolean isSmsNotifyEnabled() {
        return HMPersonInfo.getInstance().getMiliConfig().isSmsNotifyEnabled();
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    public void saveSettings(@NotNull HMDeviceType type, @NotNull String json) {
        int i = d.a[type.ordinal()];
        if (i == 1) {
            EarbudConfigDataManager companion = EarbudConfigDataManager.INSTANCE.getInstance();
            companion.getConfig().setAndroidappNotifySettings(json);
            companion.save();
        } else {
            if (i != 2) {
                return;
            }
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            hMPersonInfo.getMiliConfig().setAndroidappNotifySettings(json);
            hMPersonInfo.saveInfo(2);
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationModule
    public void syncToDevice(@NotNull final HMDeviceType type, @NotNull String key, @NotNull AlertDataCompat alertData) {
        HMAlertModeExt hMAlertModeExt = alertData.getCom.xmlywind.sdk.common.Constants.EXT java.lang.String();
        HMLog.info(new Function0() { // from class: ib5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MyNotificationModule.g(type);
            }
        });
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(type);
        if (device == null || !device.isConnected()) {
            HMLog.info(new Function0() { // from class: lb5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MyNotificationModule.h();
                }
            });
            return;
        }
        int i = d.a[type.ordinal()];
        if (i == 1) {
            ((HmEarbudDevice) device).alert(hMAlertModeExt, new a());
            return;
        }
        if (i != 2) {
            return;
        }
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) device;
        boolean z = !TextUtils.isEmpty(key) && LinkageNotificationCenter.supportLinkageNotification();
        if (hMMiLiDevice.supportModule(NotificationModule.class)) {
            ((HMMiLiProDevice) hMMiLiDevice).notify(AlertDataHelper.INSTANCE.getNotificationInfo(alertData), new b(z, key, hMAlertModeExt));
        } else {
            hMMiLiDevice.alert(hMAlertModeExt, new c(z, key, hMAlertModeExt));
        }
    }
}
