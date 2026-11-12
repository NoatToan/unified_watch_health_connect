package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
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
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.enr;
import defpackage.ewo;
import defpackage.f7i;
import defpackage.n0a;
import defpackage.ppe;
import defpackage.qfl;
import defpackage.zhq;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {
    public static final String e = ppe.i("ForceStopRunnable");
    public static final long f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final enr f3273b;
    public final f7i c;
    public int d = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f3274a = ppe.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            ppe.e().j(f3274a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, enr enrVar) {
        this.f3272a = context.getApplicationContext();
        this.f3273b = enrVar;
        this.c = enrVar.f();
    }

    @VisibleForTesting
    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(DialWidgetType.ALARM);
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    @VisibleForTesting
    public boolean a() {
        boolean zH = ewo.h(this.f3272a, this.f3273b.j());
        WorkDatabase workDatabaseJ = this.f3273b.j();
        WorkSpecDao workSpecDao = workDatabaseJ.workSpecDao();
        WorkProgressDao workProgressDao = workDatabaseJ.workProgressDao();
        workDatabaseJ.beginTransaction();
        try {
            List<WorkSpec> runningWork = workSpecDao.getRunningWork();
            boolean z = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z) {
                for (WorkSpec workSpec : runningWork) {
                    workSpecDao.setState(WorkInfo.State.ENQUEUED, workSpec.id);
                    workSpecDao.setStopReason(workSpec.id, WorkInfo.STOP_REASON_UNKNOWN);
                    workSpecDao.markWorkSpecScheduled(workSpec.id, -1L);
                }
            }
            workProgressDao.deleteAll();
            workDatabaseJ.setTransactionSuccessful();
            workDatabaseJ.endTransaction();
            return z || zH;
        } catch (Throwable th) {
            workDatabaseJ.endTransaction();
            throw th;
        }
    }

    @VisibleForTesting
    public void b() {
        boolean zA = a();
        if (h()) {
            ppe.e().a(e, "Rescheduling Workers.");
            this.f3273b.o();
            this.f3273b.f().j(false);
        } else if (e()) {
            ppe.e().a(e, "Application was force-stopped, rescheduling.");
            this.f3273b.o();
            this.c.i(this.f3273b.getConfiguration().getClock().currentTimeMillis());
        } else if (zA) {
            ppe.e().a(e, "Found unfinished work, scheduling it.");
            qfl.h(this.f3273b.getConfiguration(), this.f3273b.j(), this.f3273b.h());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @VisibleForTesting
    public boolean e() {
        try {
            int i = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f3272a, i >= 31 ? 570425344 : 536870912);
            if (i >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f3272a.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jD = this.c.d();
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        ApplicationExitInfo applicationExitInfoA = n0a.a(historicalProcessExitReasons.get(i2));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jD) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f3272a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e2) {
            e = e2;
            ppe.e().l(e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e3) {
            e = e3;
            ppe.e().l(e, "Ignoring exception", e);
            return true;
        }
    }

    @VisibleForTesting
    public boolean f() {
        Configuration configuration = this.f3273b.getConfiguration();
        if (TextUtils.isEmpty(configuration.getDefaultProcessName())) {
            ppe.e().a(e, "The default process name was not specified.");
            return true;
        }
        boolean zIsDefaultProcess = ProcessUtils.isDefaultProcess(this.f3272a, configuration);
        ppe.e().a(e, "Is default app process = " + zIsDefaultProcess);
        return zIsDefaultProcess;
    }

    @VisibleForTesting
    public boolean h() {
        return this.f3273b.f().e();
    }

    @VisibleForTesting
    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (!f()) {
                this.f3273b.n();
                return;
            }
            while (true) {
                try {
                    WorkDatabasePathHelper.migrateDatabase(this.f3272a);
                    ppe.e().a(e, "Performing cleanup operations.");
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            String str = zhq.a(this.f3272a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            ppe ppeVarE = ppe.e();
                            String str2 = e;
                            ppeVarE.d(str2, str, e2);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e2);
                            Consumer<Throwable> initializationExceptionHandler = this.f3273b.getConfiguration().getInitializationExceptionHandler();
                            if (initializationExceptionHandler == null) {
                                throw illegalStateException;
                            }
                            ppe.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                            initializationExceptionHandler.accept(illegalStateException);
                            break;
                        }
                        ppe.e().b(e, "Retrying after " + (((long) i) * 300), e2);
                        i(((long) this.d) * 300);
                    }
                    ppe.e().b(e, "Retrying after " + (((long) i) * 300), e2);
                    i(((long) this.d) * 300);
                } catch (SQLiteException e3) {
                    ppe.e().c(e, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    Consumer<Throwable> initializationExceptionHandler2 = this.f3273b.getConfiguration().getInitializationExceptionHandler();
                    if (initializationExceptionHandler2 == null) {
                        throw illegalStateException2;
                    }
                    initializationExceptionHandler2.accept(illegalStateException2);
                }
            }
            this.f3273b.n();
        } catch (Throwable th) {
            this.f3273b.n();
            throw th;
        }
    }
}
