package com.garmin.android.apps.connectmobile.permissions;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d1;
import d53.w;
import f12.l;
import gt2.b;
import gt2.c;
import j22.g;
import java.util.ArrayList;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.x;
import sz0.e;
import sz0.f;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/permissions/a;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40304a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f40305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f40306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f40307d;

    static {
        int i14 = c.f79010a;
        f40305b = b.f79005a.h("GNCS##App#PermissionsNeededReceiver");
        f40306c = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
    }

    private a() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String str = d1.f33127i;
        if (str == null) {
            str = "";
        }
        boolean z14 = w.z(str, "RequestPermissionsActivity", false);
        Logger logger = f40305b;
        if (z14) {
            logger.debug("User is currently on the permissions request page. Not posting notification.");
            return;
        }
        if (w.z(str, "DeviceSetupActivity", false)) {
            logger.debug("Device setup is currently in progress, which will request these permissions itself.");
            return;
        }
        l.f68084a.getClass();
        if (l.a.a().S3(g.f96766k)) {
            logger.debug("onReceive: User blocked phone permission requests, returning");
            return;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.garmin.android.gncs.PERMISSIONS_NEEDED");
        if (stringArrayListExtra != null) {
            if (stringArrayListExtra.isEmpty()) {
                stringArrayListExtra = null;
            }
            if (stringArrayListExtra != null) {
                logger.debug("onReceive: Posting notification");
                Intent intent2 = new Intent(context, (Class<?>) PermissionRequestNotificationReceiver.class);
                intent2.setAction("PHONE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                String string = context.getString(R.string.permission_request_summary_phone_newer_os);
                String strD = p6.b.d(context, R.string.permission_request_notification_phone_newer_os, string);
                f.a aVar = f.f161394a;
                e eVar = e.f161367g;
                q qVar = new q(context, eVar.f161386a);
                qVar.N.icon = 2131232010;
                qVar.f202683e = q.e(context.getText(R.string.permission_request_notification_title_phone));
                qVar.f202684f = q.e(context.getText(R.string.permission_request_notification_collapsed_phone));
                o oVar = new o();
                oVar.f202664e = q.e(strD);
                qVar.l(oVar);
                qVar.f202689k = q.e("");
                qVar.B = "recommendation";
                qVar.N.vibrate = f40306c;
                qVar.f202691m = 1;
                qVar.i(16, true);
                qVar.i(8, true);
                qVar.f202686h = PendingIntent.getActivity(context, 0, RequestPermissionsActivity.a.a(RequestPermissionsActivity.f40292l, context, stringArrayListExtra, new ArrayList(x.d(string)), null, null, 32), 201326592);
                qVar.a(2131232010, context.getResources().getString(R.string.button_dont_ask_again), broadcast);
                Notification notificationC = qVar.c();
                notificationC.getClass();
                aVar.getClass();
                f.a.f(context, notificationC, 30, eVar);
                return;
            }
        }
        logger.debug("Permissions list is either null or empty, returning");
    }
}
