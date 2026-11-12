package com.huami.device.feature.notification.appnotify;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.data.AlertDataCompat;
import com.huami.device.feature.notification.data.AppsNotificationInfo;
import com.huami.device.feature.notification.data.AppsNotificationRepo;
import com.huami.device.feature.notification.module.INotificationModule;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.device.feature.notification.statistics.NotificationStatisticsKt;
import com.huami.device.feature.notification.utils.AppUtil;
import com.huami.device.feature.notification.utils.NotificationFilter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class NotificationManager {
    private static final String e = "NotificationLog_NotificationManager";
    private static NotificationManager f;
    private static AppsNotificationRepo g;
    private final Handler a;
    private String b;
    private Runnable c;
    private INotificationModule d;

    private NotificationManager() {
        g = new AppsNotificationRepo();
        HandlerThread handlerThread = new HandlerThread("notification_thread");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public static NotificationManager getInstance() {
        if (f == null) {
            f = new NotificationManager();
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(boolean z, boolean z2, boolean z3) {
        return "notificationOn: " + z + " accessEnabled: " + z2 + " serviceNotRunning: " + z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "dispatchNotification, types is empty.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m() {
        return "dispatchNotification, mili apps info is empty.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n() {
        return "常驻通知被删除";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "isServiceNotRunning, mListener is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("notification listener service is running: ");
        sb.append(!z);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean q(Context context, StatusBarNotification statusBarNotification, HMDeviceType hMDeviceType) {
        w(context, statusBarNotification, hMDeviceType);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(HMAlertModeExt hMAlertModeExt, String str, StatusBarNotification statusBarNotification) {
        BusinessProcessing businessProcessing = BusinessProcessing.INSTANCE;
        final AlertDataCompat alertDataCompat = new AlertDataCompat(hMAlertModeExt, str, 0, businessProcessing.supportReply(statusBarNotification));
        HMLog.info(e, new Function0() { // from class: zg5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return alertDataCompat.toString();
            }
        });
        businessProcessing.notify2Device(alertDataCompat, this.d.currentDevice(), statusBarNotification.getKey());
        NotificationStatisticsKt.recordRemindNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "常驻通知: 延迟半秒提醒";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t() {
        return "mListener is null";
    }

    @RequiresApi(api = 21)
    private void u(final Context context, final StatusBarNotification statusBarNotification, final HMDeviceType hMDeviceType, AppsNotificationInfo appsNotificationInfo) {
        String packageName = statusBarNotification.getPackageName();
        Function0<Boolean> function0 = new Function0() { // from class: yg5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.q(context, statusBarNotification, hMDeviceType);
            }
        };
        BusinessProcessing businessProcessing = BusinessProcessing.INSTANCE;
        businessProcessing.processAppsNotificationInfo(context, packageName, appsNotificationInfo, this.d, function0);
        businessProcessing.processSmsNotify(context, packageName, this.d, function0);
    }

    @RequiresApi(api = 21)
    private void v(Context context, final StatusBarNotification statusBarNotification, HMDeviceType hMDeviceType) {
        final String packageName = statusBarNotification.getPackageName();
        final HMAlertModeExt hMAlertModeExtProduce = new ProduceAlertModeExt(context, packageName, statusBarNotification.getNotification(), this.d).produce();
        if (hMAlertModeExtProduce != null) {
            this.b = packageName;
            this.c = new Runnable() { // from class: wg5
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.r(hMAlertModeExtProduce, packageName, statusBarNotification);
                }
            };
            if (!statusBarNotification.isOngoing()) {
                this.a.post(this.c);
            } else {
                HMLog.info(e, new Function0() { // from class: eh5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationManager.s();
                    }
                });
                this.a.postDelayed(this.c, 500L);
            }
        }
    }

    @RequiresApi(api = 21)
    private void w(Context context, StatusBarNotification statusBarNotification, HMDeviceType hMDeviceType) {
        if (NotificationFilter.INSTANCE.isAvailableNotification(context, statusBarNotification)) {
            v(context, statusBarNotification, hMDeviceType);
        }
    }

    public void checkNotificationService(Context context) {
        if (g.hasNotUsableDeviceType()) {
            return;
        }
        final boolean zIsNotificationOn = g.isNotificationOn();
        final boolean zIsNotificationAccessEnabled = AppUtil.INSTANCE.isNotificationAccessEnabled(context);
        final boolean zIsServiceNotRunning = isServiceNotRunning(context);
        HMLog.info(e, new Function0() { // from class: bh5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationManager.k(zIsNotificationOn, zIsNotificationAccessEnabled, zIsServiceNotRunning);
            }
        });
        if (zIsNotificationOn && zIsNotificationAccessEnabled && zIsServiceNotRunning) {
            NotificationStatisticsKt.recordEvent(NotificationEvent.SERVICE_RESTARTED, context.getPackageName());
            restartNotificationListenerService(context);
        }
    }

    @RequiresApi(api = 21)
    public void dispatchNotification(Context context, StatusBarNotification statusBarNotification) {
        ConcurrentHashMap<HMDeviceType, AppsNotificationInfo> mAppsInfoMap = g.getMAppsInfoMap();
        Set<HMDeviceType> setKeySet = mAppsInfoMap.keySet();
        if (setKeySet.size() == 0) {
            HMLog.info(e, new Function0() { // from class: ch5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotificationManager.l();
                }
            });
            return;
        }
        for (HMDeviceType hMDeviceType : setKeySet) {
            AppsNotificationInfo appsNotificationInfo = mAppsInfoMap.get(hMDeviceType);
            if (appsNotificationInfo != null) {
                BusinessProcessing businessProcessing = BusinessProcessing.INSTANCE;
                if (!businessProcessing.getLogTag().contains(hMDeviceType.name())) {
                    businessProcessing.setLogTag(businessProcessing.getLogTag() + "_" + hMDeviceType.name());
                }
                u(context, statusBarNotification, hMDeviceType, appsNotificationInfo);
            } else if (hMDeviceType == HMDeviceType.MILI) {
                HMLog.info(e, new Function0() { // from class: fh5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationManager.m();
                    }
                });
            }
        }
    }

    public AppsNotificationRepo getAppsRepo() {
        return g;
    }

    public INotificationModule getListener() {
        return this.d;
    }

    public void handleNotificationRemoved(StatusBarNotification statusBarNotification) {
        if (this.c != null && this.a != null && statusBarNotification.getPackageName().equals(this.b)) {
            if (statusBarNotification.isOngoing()) {
                HMLog.info(e, new Function0() { // from class: dh5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationManager.n();
                    }
                });
                this.a.removeCallbacks(this.c);
            }
            this.b = null;
            this.c = null;
        }
        NotificationFilter.INSTANCE.handleResidentNotificationRemoved(statusBarNotification);
    }

    public boolean isServiceNotRunning(Context context) {
        INotificationModule iNotificationModule = this.d;
        if (iNotificationModule == null) {
            HMLog.info(e, new Function0() { // from class: xg5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotificationManager.o();
                }
            });
            return true;
        }
        final boolean zIsServiceNotRunning = AppUtil.INSTANCE.isServiceNotRunning(context, iNotificationModule.getNotificationListenerService());
        HMLog.info(e, new Function0() { // from class: ah5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationManager.p(zIsServiceNotRunning);
            }
        });
        return zIsServiceNotRunning;
    }

    public void restartNotificationListenerService(Context context) {
        INotificationModule iNotificationModule = this.d;
        if (iNotificationModule == null) {
            HMLog.info(e, new Function0() { // from class: gh5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotificationManager.t();
                }
            });
            return;
        }
        Class<? extends NotificationListenerService> notificationListenerService = iNotificationModule.getNotificationListenerService();
        if (Build.VERSION.SDK_INT < 24) {
            PackageManager packageManager = context.getPackageManager();
            packageManager.setComponentEnabledSetting(new ComponentName(context, notificationListenerService), 2, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(context, notificationListenerService), 1, 1);
            return;
        }
        try {
            Method declaredMethod = notificationListenerService.getDeclaredMethod("requestUnbind", new Class[0]);
            declaredMethod.setAccessible(true);
            HMLog.i(e, "requestUnbind " + declaredMethod.invoke(notificationListenerService, new Object[0]), new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
        }
        NotificationListenerService.requestRebind(new ComponentName(context, notificationListenerService));
    }

    public void setListener(INotificationModule iNotificationModule) {
        this.d = iNotificationModule;
    }
}
