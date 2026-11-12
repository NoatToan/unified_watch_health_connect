package yr1;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f199058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<Long, EnumC3722a> f199059b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<Long, Long> f199060c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: yr1.a$a, reason: collision with other inner class name */
    public enum EnumC3722a {
        STARTED,
        SINGLE_UPLOAD,
        MULTI_UPLOAD,
        FINISHED
    }

    private a() {
    }

    public static synchronized void b(com.garmin.android.apps.connectmobile.d dVar, int i14) {
        NotificationManager notificationManager = (NotificationManager) dVar.getApplicationContext().getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i14);
        }
    }

    public static a c() {
        if (f199058a == null) {
            f199058a = new a();
        }
        return f199058a;
    }

    public final synchronized void a(long j8, long j14) {
        try {
            ConcurrentHashMap<Long, EnumC3722a> concurrentHashMap = f199059b;
            EnumC3722a enumC3722a = concurrentHashMap.get(Long.valueOf(j8));
            if (enumC3722a != null && (j14 > 0 || j14 == -2)) {
                f199060c.put(Long.valueOf(j8), Long.valueOf(j14));
                int iOrdinal = enumC3722a.ordinal();
                if (iOrdinal == 0) {
                    concurrentHashMap.put(Long.valueOf(j8), EnumC3722a.SINGLE_UPLOAD);
                } else if (iOrdinal == 1) {
                    concurrentHashMap.put(Long.valueOf(j8), EnumC3722a.MULTI_UPLOAD);
                } else if (iOrdinal != 2) {
                    concurrentHashMap.remove(Long.valueOf(j8));
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void d(Context context) {
        com.garmin.android.apps.connectmobile.navigation.b.b();
        Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
        intent.addFlags(67108864);
        Context applicationContext = context.getApplicationContext();
        PendingIntent activity = PendingIntent.getActivity(applicationContext, 0, intent, 201326592);
        sz0.e eVar = sz0.e.f161379r;
        z6.q qVar = new z6.q(applicationContext, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(context.getString(R.string.launcher_name_garmin_connect));
        qVar.f202684f = z6.q.e(context.getString(R.string.msg_health_snapshot_ready_to_view));
        qVar.f202689k = z6.q.e("");
        qVar.N.vibrate = new long[]{75, 75};
        qVar.f202691m = 0;
        qVar.B = "recommendation";
        qVar.f202686h = activity;
        qVar.i(16, true);
        Notification notificationC = qVar.c();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(context, notificationC, 35, eVar);
    }
}
