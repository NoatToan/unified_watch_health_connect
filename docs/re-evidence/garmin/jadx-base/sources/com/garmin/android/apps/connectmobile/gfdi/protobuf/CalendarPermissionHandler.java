package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d1;
import com.garmin.android.apps.connectmobile.permissions.PermissionRequestNotificationReceiver;
import com.garmin.android.apps.connectmobile.permissions.RequestPermissionsActivity;
import d53.w;
import f12.l;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import yi2.k;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/CalendarPermissionHandler;", "Lyi2/k;", "<init>", "()V", "", "requestReadCalendarPermissions", "Lkotlin/Function1;", "", "completion", "requestCalendarPermission", "(Le23/l;)V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CalendarPermissionHandler implements k {
    private static final long DEFAULT_TIMER_RESET = 14400000;
    private static final long MEDIUM_TIMER_RESET = 900000;
    private static final long SHORT_TIMER_RESET = 300000;
    private final Logger logger;
    public static final int $stable = 8;

    public CalendarPermissionHandler() {
        int i14 = gt2.c.f79010a;
        this.logger = gt2.b.f79005a.h("CalendarPermissionHandler");
    }

    private final void requestReadCalendarPermissions() {
        l.f68084a.getClass();
        l.a.a().w4(System.currentTimeMillis());
        l.a.a().h1();
        GarminConnectMobileApp.f28685g.getClass();
        Intent intent = new Intent(GarminConnectMobileApp.a.a(), (Class<?>) RequestPermissionsActivity.class);
        j22.a aVar = j22.a.f96715d;
        intent.putExtra(aVar.f96735b, GarminConnectMobileApp.a.a().getString(R.string.permission_request_summary_calendar));
        intent.putExtra("GCM_permissionType", x.d(aVar.f96735b));
        PendingIntent activity = PendingIntent.getActivity(GarminConnectMobileApp.a.a(), 14, intent, 201326592);
        Intent intent2 = new Intent(GarminConnectMobileApp.a.a(), (Class<?>) PermissionRequestNotificationReceiver.class);
        intent2.setAction("CALENDAR");
        PendingIntent broadcast = PendingIntent.getBroadcast(GarminConnectMobileApp.a.a(), 0, intent2, 67108864);
        Context contextA = GarminConnectMobileApp.a.a();
        sz0.e eVar = sz0.e.f161367g;
        q qVar = new q(contextA, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(GarminConnectMobileApp.a.a().getResources().getString(R.string.permission_request_notification_title_calendar));
        qVar.f202684f = q.e(GarminConnectMobileApp.a.a().getResources().getString(R.string.permission_request_notification_collapsed_calendar));
        qVar.f202689k = q.e("");
        qVar.f202691m = 1;
        qVar.B = "recommendation";
        o oVar = new o();
        oVar.f202664e = q.e(GarminConnectMobileApp.a.a().getResources().getString(R.string.permission_request_notification_expanded_calendar));
        qVar.l(oVar);
        qVar.f202686h = activity;
        qVar.a(2131232010, GarminConnectMobileApp.a.a().getResources().getString(R.string.button_dont_ask_again), broadcast);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        notificationC.flags = 16;
        sz0.f.a aVar2 = sz0.f.f161394a;
        Context contextA2 = GarminConnectMobileApp.a.a();
        aVar2.getClass();
        sz0.f.a.f(contextA2, notificationC, 14, eVar);
    }

    @Override // yi2.k
    public void requestCalendarPermission(e23.l<? super Boolean, Unit> completion) {
        long j8;
        completion.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        l.f68084a.getClass();
        long jJ3 = l.a.a().J3();
        long jN1 = l.a.a().n1();
        if (jN1 <= 3) {
            j8 = 300000;
        } else {
            j8 = jN1 <= 18 ? MEDIUM_TIMER_RESET : DEFAULT_TIMER_RESET;
        }
        String str = d1.f33127i;
        if (str == null) {
            str = "";
        }
        com.airbnb.lottie.animation.keyframe.a.u("handlePermissionDenied: currentActivityName=[", str, "]", this.logger);
        if (w.z(str, "DeviceSetupActivity", false) || w.z(str, "RequestPermissionsActivity", false)) {
            this.logger.debug("handlePermissionDenied: We are currently in setup or on the permissions request page, ignore");
            return;
        }
        if (l.a.a().S3(j22.g.f96761f)) {
            this.logger.debug("handlePermissionDenied: User has blocked the calendar permission request");
            return;
        }
        long jAbs = Math.abs(jCurrentTimeMillis - jJ3);
        Logger logger = this.logger;
        if (jAbs <= j8) {
            logger.debug("handlePermissionDenied: still within retry period, ignoring request for now");
        } else {
            logger.debug("handlePermissionDenied: read calendar permission has NOT been granted, requesting permission");
            requestReadCalendarPermissions();
        }
    }
}
