package com.garmin.android.gncs;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.music.AdvancedMusicControlModule;
import com.garmin.android.music.MusicConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import z6.a0;

/* JADX INFO: loaded from: classes11.dex */
public class GNCSListenerService extends NotificationListenerService {
    private static GNCSListenerServiceConfig config = null;
    private static Handler handler = null;
    private static HandlerThread handlerThread = null;
    private static GNCSListenerServiceInitUpdateCallback initializationUpdateCallback = null;

    @SuppressLint({"StaticFieldLeak"})
    private static GNCSListenerService instance = null;
    private static boolean isServiceRebinding = false;
    static final List<NotificationListenerServiceModule> modules = new ArrayList(2);
    private static final List<SmartNotifOSServiceLifecycleCallback> smartNotifOSServiceLifecycleCallbacks = new CopyOnWriteArrayList();

    public static void addSmartNotifOSServiceLifecycleCallback(SmartNotifOSServiceLifecycleCallback smartNotifOSServiceLifecycleCallback) {
        List<SmartNotifOSServiceLifecycleCallback> list = smartNotifOSServiceLifecycleCallbacks;
        if (list.contains(smartNotifOSServiceLifecycleCallback)) {
            return;
        }
        list.add(smartNotifOSServiceLifecycleCallback);
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static void attemptRebind() {
        if (config != null) {
            ComponentName componentName = new ComponentName(config.getAppContext(), (Class<?>) GNCSListenerService.class);
            if (!isServiceRebinding) {
                GNCSListenerService gNCSListenerService = instance;
                if (gNCSListenerService != null) {
                    ih2.b.b("GNCSListenerService.attemptRebind -> requestUnbind()");
                    gNCSListenerService.requestUnbind();
                }
                ih2.b.b("GNCSListenerService.attemptRebind -> requestRebind()");
                isServiceRebinding = true;
                NotificationListenerService.requestRebind(componentName);
                return;
            }
            try {
                ih2.b.b("GNCSListenerService.attemptRebind (workaround) -> rebinding = " + isServiceRebinding);
                PackageManager packageManager = config.getAppContext().getPackageManager();
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                isServiceRebinding = true;
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            } catch (Exception e4) {
                ih2.b.a(e4, "GNCSListenerService.attemptRebind");
            }
        }
    }

    public static GNCSListenerServiceConfig getConfig() {
        return config;
    }

    public static Intent getIntentNotificationListenerSettings() {
        return new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
    }

    @SuppressLint({"UnsafeOptInUsageWarning"})
    public static void init(GNCSListenerServiceConfig.GNCSListenerServiceConfigBuilder gNCSListenerServiceConfigBuilder) {
        GNCSListenerServiceConfig gNCSListenerServiceConfigBuild = gNCSListenerServiceConfigBuilder.build();
        config = gNCSListenerServiceConfigBuild;
        if (gNCSListenerServiceConfigBuild.isSmartNotificationsSupported()) {
            AppManager.INSTANCE.init(config.getAppContext());
            SmartNotificationsConfig.init(config.getAppContext(), config.getRemoteConfig(), initializationUpdateCallback);
        }
        if (config.isMusicControlsSupported()) {
            MusicConfig.init(config.getRemoteConfig());
        }
        internalInit();
    }

    private static synchronized void internalInit() {
        if (config == null) {
            logAndroidWARN("internalInit", "waiting for app to call 'init'");
            return;
        }
        if (instance == null) {
            logAndroidWARN("internalInit", "config received, waiting for Android to call 'onListenerConnected'");
            return;
        }
        if (handlerThread == null || handler == null) {
            HandlerThread handlerThread2 = new HandlerThread("GNCSListenerService");
            handlerThread = handlerThread2;
            handlerThread2.start();
            handler = new Handler(handlerThread.getLooper());
            ih2.b.b("GNCSListenerService.internalInit -> handlerThread created and running");
        } else {
            ih2.b.d("GNCSListenerService.internalInit -> handlerThread already running");
        }
        List<NotificationListenerServiceModule> list = modules;
        list.clear();
        if (config.isSmartNotificationsSupported()) {
            SmartNotificationsModule smartNotificationsModule = new SmartNotificationsModule(instance, handler);
            list.add(smartNotificationsModule);
            smartNotificationsModule.onListenerConnected(smartNotifOSServiceLifecycleCallbacks);
            ih2.b.b("GNCSListenerService.internalInit -> GNCSSmartNotificationsModule");
        }
        if (config.isMusicControlsSupported()) {
            AdvancedMusicControlModule advancedMusicControlModule = new AdvancedMusicControlModule(instance, handler);
            list.add(advancedMusicControlModule);
            advancedMusicControlModule.onListenerConnected(smartNotifOSServiceLifecycleCallbacks);
            ih2.b.b("GNCSListenerService.internalInit -> AdvancedMusicControlModule");
        }
    }

    public static boolean isNotificationAccessAllowed(Context context) {
        ActivityManager activityManager;
        return Build.VERSION.SDK_INT > 29 || (activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity")) == null || !activityManager.isLowRamDevice();
    }

    public static boolean isServiceConnected() {
        return instance != null;
    }

    private static void logAndroidDEBUG(String str, String str2) {
        ih2.b.b("GNCS#GNCSListenerService." + str + "-> " + str2);
    }

    private static void logAndroidWARN(String str, String str2) {
        ih2.b.d("GNCS#GNCSListenerService." + str + "-> " + str2);
    }

    public static void refreshPhoneCallListener() {
        for (NotificationListenerServiceModule notificationListenerServiceModule : modules) {
            if (notificationListenerServiceModule instanceof SmartNotificationsModule) {
                ((SmartNotificationsModule) notificationListenerServiceModule).refreshPhoneCallListenerState();
            }
        }
    }

    public static void registerInitializationUpdateCallback(GNCSListenerServiceInitUpdateCallback gNCSListenerServiceInitUpdateCallback) {
        initializationUpdateCallback = gNCSListenerServiceInitUpdateCallback;
    }

    public static void removeSmartNotifOSServiceLifecycleCallback(SmartNotifOSServiceLifecycleCallback smartNotifOSServiceLifecycleCallback) {
        smartNotifOSServiceLifecycleCallbacks.remove(smartNotifOSServiceLifecycleCallback);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        logAndroidDEBUG("GNCSListenerService.onListenerConnected", "");
        Context applicationContext = getApplicationContext();
        int i14 = ih2.d.f93519a;
        applicationContext.getClass();
        a0.a(applicationContext).f202582b.cancel(null, 98);
        isServiceRebinding = false;
        if (instance != null && !modules.isEmpty()) {
            logAndroidDEBUG("GNCSListenerService.onListenerConnected", "Instance already exists, ignoring duplicate onListenerConnected call");
        } else {
            instance = this;
            internalInit();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        ih2.b.b("GNCSListenerService.onListenerDisconnected");
        instance = null;
        Iterator<NotificationListenerServiceModule> it = modules.iterator();
        while (it.hasNext()) {
            try {
                it.next().onListenerDisconnected(smartNotifOSServiceLifecycleCallbacks);
            } catch (Exception e4) {
                ih2.b.a(e4, "GNCSListenerService.onListenerDisconnected");
            }
        }
        modules.clear();
        Handler handler2 = handler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            handler = null;
        }
        HandlerThread handlerThread2 = handlerThread;
        if (handlerThread2 != null) {
            handlerThread2.quit();
            handlerThread = null;
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        if (statusBarNotification != null) {
            NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
            if (rankingMap != null) {
                rankingMap.getRanking(statusBarNotification.getKey(), ranking);
            }
            Iterator<NotificationListenerServiceModule> it = modules.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onNotificationPosted(statusBarNotification, ranking);
                } catch (Exception e4) {
                    ih2.b.a(e4, "GNCSListenerService.onNotificationPosted");
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null) {
            Iterator<NotificationListenerServiceModule> it = modules.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onNotificationRemoved(statusBarNotification);
                } catch (Exception e4) {
                    ih2.b.a(e4, "GNCSListenerService.onNotificationRemoved");
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        onNotificationRemoved(statusBarNotification);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        onNotificationPosted(statusBarNotification, null);
    }
}
