package com.garmin.android.apps.connectmobile;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.SmartNotificationsUtil;
import java.util.Iterator;
import java.util.LinkedList;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v1;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f47374a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedList f47375b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f47376c = a.DISCONNECTED;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f47377d = gt2.c.b(a2.DEVICE_SERVICES.f28756a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f47378e = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v1$a;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        CONNECTED,
        CONNECTING,
        DISCONNECTED
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/v1$b", "Lhh2/b$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements hh2.b.a {
        @Override // hh2.b.a
        public final void a() {
            v1.f47377d.debug("Device foreground service SecurityException");
        }

        @Override // hh2.b.a
        public final void b() {
            v1.f47377d.error("Device foreground service IllegalStateException");
        }

        @Override // hh2.b.a
        public final void c() {
            v1.f47377d.debug("Device foreground service already connected");
            v1.f47376c = a.CONNECTED;
            Iterator it = v1.f47375b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            v1.f47375b.clear();
        }

        @Override // hh2.b.a
        public final void d() {
            v1.f47377d.debug("Device foreground service started");
        }

        @Override // hh2.b.a
        public final void e() {
            v1.f47377d.debug("Device foreground service disconnected");
            v1.f47376c = a.DISCONNECTED;
        }

        @Override // hh2.b.a
        public final void f() {
            v1.f47377d.debug("Device foreground service connected");
            v1.f47376c = a.CONNECTED;
            Iterator it = v1.f47375b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            v1.f47375b.clear();
        }
    }

    private v1() {
    }

    public static hh2.e a(Context context) {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
        intent.setFlags(536870912);
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(tn.k.g(GCMSettingManager.k().i(), context.getString(R.string.garmin_connect_sync_service_learn_more_path))));
        String string = context.getString(R.string.common_learn_more);
        string.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent2, 201326592);
        activity.getClass();
        hh2.c cVar = new hh2.c(string, 2131232010, activity);
        int color = a7.b.getColor(context, R.color.palette_delta_2);
        return new hh2.e(10717, null, b(context, false, null), Integer.valueOf(color), PendingIntent.getActivity(context, 0, intent, 201326592), cVar, null, null, 2131232010, null, null, null, null, 7874, null);
    }

    public static String b(Context context, boolean z14, Bundle bundle) {
        StringBuilder sb3 = new StringBuilder(context.getString(R.string.app_sync_service, context.getString(R.string.launcher_name_garmin_connect)));
        if (z14) {
            String string = bundle != null ? bundle.getString("GCM_deviceName") : null;
            String string2 = TextUtils.isEmpty(string) ? context.getString(R.string.devices_sync_in_progress) : context.getString(R.string.msg_syncing_with_device, string);
            string2.getClass();
            sb3.append(" - ");
            sb3.append(string2);
        }
        return sb3.toString();
    }

    public static final boolean c(Context context) {
        context.getClass();
        GarminConnectMobileApp.f28685g.getClass();
        boolean z14 = GarminConnectMobileApp.a.b().f28689a;
        boolean zC = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c();
        f47374a.getClass();
        boolean zIsNotificationAccessEnabled = SmartNotificationsUtil.isNotificationAccessEnabled(context);
        boolean zIsServiceConnected = GNCSListenerService.isServiceConnected();
        String strE = com.airbnb.lottie.animation.keyframe.a.e("notificationServiceOn() -> notificationAccessEnabled=[", "] , notificationServiceConnected=[", "]", zIsNotificationAccessEnabled, zIsServiceConnected);
        Logger logger = f47377d;
        logger.debug(strE);
        boolean z15 = zIsNotificationAccessEnabled && zIsServiceConnected;
        boolean zD = ((m80.a) KoinJavaComponent.get$default(m80.a.class, null, null, 6, null)).d();
        logger.debug(com.airbnb.lottie.animation.keyframe.a.f("] && isCompanionDeviceServiceDisabled=[", "]", com.airbnb.lottie.animation.keyframe.a.m("shouldManageForegroundService() -> background=[", "] && userSignedIn=[", "] && notificationServiceOff=[", z14, zC), !z15, !zD));
        return z14 && zC && !z15 && !zD;
    }

    public static void d(Context context) {
        Context applicationContext = context.getApplicationContext();
        Logger logger = f47377d;
        logger.debug("Creating GFDIService (starting GDI and Sync services)...");
        hk0.p.a(applicationContext);
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        if (com.garmin.android.apps.connectmobile.audioprompts.b.d(com.garmin.android.apps.connectmobile.audioprompts.b.a.a(), null, null, 0L, 15)) {
            logger.debug("Starting audio prompts service (only if any capable device available)...");
        }
    }

    public static void e(Context context) {
        a aVar = f47376c;
        a aVar2 = a.DISCONNECTED;
        Logger logger = f47377d;
        if (aVar != aVar2) {
            com.airbnb.lottie.animation.keyframe.a.u("Trying to start device foreground service, but the service state is ", f47376c.name(), "...", logger);
            return;
        }
        try {
            f47376c = a.CONNECTING;
            logger.debug("Starting device foreground service...");
            hh2.d dVar = new hh2.d("Device Connectivity", "Shows device connectivity notification", null, 4, null);
            hh2.e eVarA = a(context);
            hh2.b bVar = hh2.b.f83747a;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            hh2.b.a(bVar, applicationContext, eVarA, dVar, f47378e);
        } catch (Exception e4) {
            f47376c = a.CONNECTING;
            com.airbnb.lottie.animation.keyframe.a.u("Failed to start device foreground service, due to error ", e4.getMessage(), "...", logger);
        }
    }

    public static void f(Context context, Intent intent) {
        context.getClass();
        Logger logger = f47377d;
        logger.debug("startDeviceService()");
        if (c(context)) {
            g(context, intent);
            return;
        }
        ComponentName component = intent.getComponent();
        String string = component != null ? component.toString() : null;
        com.airbnb.lottie.animation.keyframe.a.u("Starting device service ", string, " without foreground service...", logger);
        try {
            context.startService(intent);
        } catch (IllegalStateException unused) {
            com.airbnb.lottie.animation.keyframe.a.z("Starting device service ", string, " without foreground service FAILED...", logger);
            g(context, intent);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void g(Context context, Intent intent) {
        Logger logger = f47377d;
        ComponentName component = intent.getComponent();
        String string = component != null ? component.toString() : null;
        try {
            logger.debug("Starting device service " + string + " with foreground service...");
            hh2.b bVar = hh2.b.f83747a;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            bVar.getClass();
            hh2.b.b(applicationContext, intent);
        } catch (IllegalStateException e4) {
            logger.error("Error starting " + string + "... " + e4);
            f47375b.add(new cd0.f(4, context, intent));
            logger.debug("Scheduled startService for " + string + " after foreground service is connected...");
            e(context);
        }
    }

    public static void h(Context context) throws RemoteException {
        context.getClass();
        i();
        Logger logger = f47377d;
        logger.debug("Stop Sync service...");
        hk0.p pVar = hk0.p.f84079d;
        if (pVar != null && pVar.n()) {
            try {
                hk0.p.f84079d.f84080a.terminate();
            } catch (Exception e4) {
                i2.g(e4, "TMP#GFDIService");
            }
        }
        gb2.a.b().f76762a.clear();
        logger.debug("Stop Gdi service...");
        la2.e eVarC = hk0.p.c();
        eVarC.n();
        eVarC.f111643b.clear();
        eVarC.f111645d.clear();
        if (hk0.p.f() != null) {
            hk0.p.f().f58876a.clear();
        }
        logger.debug("Stop Audio Prompts service...");
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.b.a.a().getClass();
        context.stopService(new Intent(context, (Class<?>) AudioPromptsService.class));
    }

    public static void i() throws RemoteException {
        f47375b.clear();
        f47377d.debug("Stopping device foreground service...");
        hh2.b.f83747a.getClass();
        if (hh2.b.f83749c.get()) {
            Message messageObtain = Message.obtain(null, 2, 0, 0);
            Messenger messenger = hh2.b.f83748b;
            if (messenger == null) {
                return;
            }
            messenger.send(messageObtain);
        }
    }

    public static void j(Context context, boolean z14, Bundle bundle) throws RemoteException {
        if (f47376c == a.CONNECTED) {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
            intent.setFlags(536870912);
            try {
                hh2.e eVar = new hh2.e(0, null, b(context, z14, bundle), null, PendingIntent.getActivity(context, 0, intent, 201326592), null, null, null, null, null, null, null, null, 8171, null);
                hh2.b.f83747a.getClass();
                if (!hh2.b.f83749c.get()) {
                    throw new IllegalStateException("must first call startBroker before modifying notification");
                }
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("NotificationData", eVar);
                messageObtain.obj = bundle2;
                Messenger messenger = hh2.b.f83748b;
                if (messenger == null) {
                    return;
                }
                messenger.send(messageObtain);
            } catch (IllegalStateException e4) {
                f47377d.error("Error updating foreground notification... " + e4);
            }
        }
    }
}
