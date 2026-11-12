package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import cf.d;
import cf.m;
import cf.r;
import cf.t;
import com.google.android.exoplayer2.source.mediaparser.b;
import df.p;
import df.q;
import h7.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ue.h0;
import ue.u;
import ve.d0;
import ve.t0;
import xe.c;
import xe.e;

/* JADX INFO: loaded from: classes7.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f11493e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f11495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f11496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11497d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            u.b("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            u.a().getClass();
            ForceStopRunnable.b(context);
        }
    }

    static {
        u.b("ForceStopRunnable");
        f11493e = 315360000000L;
    }

    public ForceStopRunnable(Context context, t0 t0Var) {
        this.f11494a = context.getApplicationContext();
        this.f11495b = t0Var;
        this.f11496c = t0Var.f177610h;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i14 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i14);
        long jCurrentTimeMillis = System.currentTimeMillis() + f11493e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01b6  */
    public final void a() {
        boolean z14;
        p pVar = this.f11496c;
        t0 t0Var = this.f11495b;
        WorkDatabase workDatabase = t0Var.f177606d;
        a aVar = t0Var.f177605c;
        p pVar2 = t0Var.f177610h;
        WorkDatabase workDatabase2 = t0Var.f177606d;
        int i14 = e.f190407f;
        Context context = this.f11494a;
        JobScheduler jobSchedulerB = c.b(context);
        ArrayList<JobInfo> arrayListD = e.d(context, jobSchedulerB);
        List<String> listA = workDatabase.g().a();
        HashSet hashSet = new HashSet(arrayListD != null ? arrayListD.size() : 0);
        if (arrayListD != null && !arrayListD.isEmpty()) {
            for (JobInfo jobInfo : arrayListD) {
                m mVarF = e.f(jobInfo);
                if (mVarF != null) {
                    hashSet.add(mVarF.f26929a);
                } else {
                    e.b(jobSchedulerB, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listA.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    u uVarA = u.a();
                    int i15 = e.f190407f;
                    uVarA.getClass();
                    z14 = true;
                    break;
                }
            } else {
                z14 = false;
                break;
            }
        }
        if (z14) {
            workDatabase.beginTransaction();
            try {
                cf.u uVarJ = workDatabase.j();
                Iterator<String> it3 = listA.iterator();
                while (it3.hasNext()) {
                    uVarJ.u(-1L, it3.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th3) {
                workDatabase.endTransaction();
                throw th3;
            }
        }
        cf.u uVarJ2 = workDatabase2.j();
        r rVarI = workDatabase2.i();
        workDatabase2.beginTransaction();
        try {
            List<t> listM = uVarJ2.m();
            boolean z15 = (listM == null || listM.isEmpty()) ? false : true;
            if (z15) {
                for (t tVar : listM) {
                    h0.c cVar = h0.c.ENQUEUED;
                    String str = tVar.f26941a;
                    uVarJ2.h(str, cVar);
                    uVarJ2.setStopReason(str, -512);
                    uVarJ2.u(-1L, str);
                }
            }
            rVarI.deleteAll();
            workDatabase2.setTransactionSuccessful();
            workDatabase2.endTransaction();
            boolean z16 = z15 || z14;
            Long lA = pVar2.f59416a.f().a("reschedule_needed");
            if (lA != null && lA.longValue() == 1) {
                u.a().getClass();
                t0Var.j();
                pVar2.getClass();
                pVar2.f59416a.f().b(new d("reschedule_needed", false));
                return;
            }
            try {
                int i16 = Build.VERSION.SDK_INT;
                int i17 = i16 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i17);
                if (i16 < 30) {
                    if (broadcast == null) {
                        b(context);
                        u.a().getClass();
                        t0Var.j();
                        long jCurrentTimeMillis = aVar.f11438d.currentTimeMillis();
                        pVar.getClass();
                        pVar.f59416a.f().b(new d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                        return;
                    }
                    if (z16) {
                        u.a().getClass();
                        ve.t.b(aVar, workDatabase2, t0Var.f177608f);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = pVar.f59416a.f().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i18 = 0; i18 < historicalProcessExitReasons.size(); i18++) {
                        ApplicationExitInfo applicationExitInfoG = b.g(historicalProcessExitReasons.get(i18));
                        if (applicationExitInfoG.getReason() == 10 && applicationExitInfoG.getTimestamp() >= jLongValue) {
                            u.a().getClass();
                            t0Var.j();
                            long jCurrentTimeMillis2 = aVar.f11438d.currentTimeMillis();
                            pVar.getClass();
                            pVar.f59416a.f().b(new d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                            return;
                        }
                    }
                }
                if (z16) {
                    u.a().getClass();
                    ve.t.b(aVar, workDatabase2, t0Var.f177608f);
                }
            } catch (IllegalArgumentException | SecurityException unused) {
                u.a().getClass();
            }
        } catch (Throwable th4) {
            workDatabase2.endTransaction();
            throw th4;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        t0 t0Var = this.f11495b;
        try {
            a aVar = t0Var.f177605c;
            aVar.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f11494a;
            if (zIsEmpty) {
                u.a().getClass();
                zA = true;
            } else {
                zA = q.a(context, aVar);
                u.a().getClass();
            }
            if (!zA) {
                t0Var.i();
                return;
            }
            while (true) {
                try {
                    d0.a(context);
                    u.a().getClass();
                    try {
                        a();
                        t0Var.i();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e4) {
                        int i14 = this.f11497d + 1;
                        this.f11497d = i14;
                        if (i14 >= 3) {
                            String str = k.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            u.a().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e4);
                            t0Var.f177605c.getClass();
                            throw illegalStateException;
                        }
                        u.a().getClass();
                        try {
                            Thread.sleep(((long) this.f11497d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e14) {
                    u.a().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e14);
                    t0Var.f177605c.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th3) {
            t0Var.i();
            throw th3;
        }
    }
}
