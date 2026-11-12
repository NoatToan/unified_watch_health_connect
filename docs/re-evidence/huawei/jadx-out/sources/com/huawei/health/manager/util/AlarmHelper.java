package com.huawei.health.manager.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.manager.LiteAutoTrackDataManager;
import com.huawei.health.manager.RealTimeStepDataReportHelper;
import com.huawei.health.manager.SportStatusDetectManager;
import com.huawei.health.manager.TriggerSportInterface;
import com.huawei.health.manager.powerkit.PowerKitManager;
import defpackage.xjk;
import health.compact.a.CommonUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f8127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingIntent f8128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlarmManager f8129c;
    private LiteAutoTrackDataManager d;
    private int f;
    private PendingIntent l;
    private RealTimeStepDataReportHelper m;
    private int x;
    private final List<String> e = new CopyOnWriteArrayList();
    private final List<String> q = new CopyOnWriteArrayList();
    private long t = 0;
    private long v = 0;
    private long y = 0;
    private long p = 0;
    private long r = 0;
    private int o = 0;
    private long k = 0;
    private long j = 0;
    private long g = 0;
    private long h = 0;
    private long s = 0;
    private long n = 0;
    private LogicalStepCounter i = LogicalStepCounter.d(BaseApplication.b());

    static {
        f8127a = Build.VERSION.SDK_INT > 30 && CommonUtil.bg();
    }

    public AlarmHelper() {
        this.f8129c = null;
        Object systemService = BaseApplication.b().getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (!(systemService instanceof AlarmManager)) {
            ReleaseLogUtil.d("Track_AlarmHelper", "object is not instance of AlarmManager");
        } else {
            this.f8129c = (AlarmManager) systemService;
            this.d = new LiteAutoTrackDataManager();
        }
    }

    private void v() {
        s();
        int iA = this.i.a();
        ReleaseLogUtil.d("Track_AlarmHelper", "get get Base steps");
        this.d.e(iA);
    }

    private void s() {
        if (this.m == null) {
            this.m = new RealTimeStepDataReportHelper(BaseApplication.b());
        }
        ReleaseLogUtil.d("Track_AlarmHelper", "forceRefreshStep enter");
        this.m.e();
    }

    private void c(List<String> list, long j, PendingIntent pendingIntent) {
        if (f8127a) {
            a(list);
            xjk.e(this.f8129c, 2, j, pendingIntent, "Track_AlarmHelpersetAlarmByAction");
        } else {
            this.f8129c.set(2, j, pendingIntent);
        }
    }

    public void l() {
        this.p = System.currentTimeMillis();
        ReleaseLogUtil.d("Track_AlarmHelper", "setRun alarm,last Run Time", Long.valueOf(this.t));
        this.e.clear();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.t < 30) {
            this.d.d(0);
            this.e.add("SEND_ENTER_PRE_SPORT_BROADCAST");
            PendingIntent pendingIntentD = d(BaseApplication.b(), "SEND_ENTER_PRE_SPORT_BROADCAST");
            this.l = pendingIntentD;
            c(this.e, 30000 + jElapsedRealtime, pendingIntentD);
        }
        if (this.j == 0) {
            this.q.add("SEND_END_RECOGNIZE_BROADCAST");
            PendingIntent pendingIntentD2 = d(BaseApplication.b(), "SEND_END_RECOGNIZE_BROADCAST");
            this.f8128b = pendingIntentD2;
            c(this.q, jElapsedRealtime + 120000, pendingIntentD2);
            this.j = this.p;
        }
    }

    public void k() {
        this.f++;
        this.r = System.currentTimeMillis();
        ReleaseLogUtil.d("Track_AlarmHelper", "setHangTime alarm,last hang is ", Integer.valueOf(this.x));
        this.e.clear();
        this.e.add("SEND_STOP_BROADCAST");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = (11000 + jElapsedRealtime) - ((long) this.x);
        if (this.f >= 4) {
            ReleaseLogUtil.d("Track_AlarmHelper", "max hang time" + this.f);
            j = 1000 + jElapsedRealtime;
        }
        if (this.x > 11000) {
            j = 2000 + jElapsedRealtime;
        }
        ReleaseLogUtil.d("Track_AlarmHelper", "triggerAtTime is", Long.valueOf(j));
        PendingIntent pendingIntentD = d(BaseApplication.b(), "SEND_STOP_BROADCAST");
        this.l = pendingIntentD;
        c(this.e, j, pendingIntentD);
    }

    public void o() {
        this.y = System.currentTimeMillis();
        ReleaseLogUtil.d("Track_AlarmHelper", "setWalk alarm,last WalkTime is ", Long.valueOf(this.v));
        this.q.clear();
        this.q.add("SEND_END_RECOGNIZE_BROADCAST");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.v;
        PendingIntent pendingIntentD = d(BaseApplication.b(), "SEND_END_RECOGNIZE_BROADCAST");
        this.f8128b = pendingIntentD;
        c(this.q, (jElapsedRealtime + 120000) - j, pendingIntentD);
    }

    public void c() {
        if (this.f8129c == null || this.l == null) {
            ReleaseLogUtil.a("Track_AlarmHelper", "mAlarmManager is null or mPendingIntent is null");
            return;
        }
        Iterator<String> it = this.e.iterator();
        while (it.hasNext()) {
            ReleaseLogUtil.d("Track_AlarmHelper", "cancel tag is ", it.next());
        }
        c(this.e);
        this.e.clear();
        this.f8129c.cancel(this.l);
    }

    public void e() {
        if (this.f8129c == null || this.f8128b == null) {
            ReleaseLogUtil.a("Track_AlarmHelper", "cancelAlarmTasks mAlarmManager is null or mPendingIntent is null");
            return;
        }
        Iterator<String> it = this.q.iterator();
        while (it.hasNext()) {
            ReleaseLogUtil.d("Track_AlarmHelper", "cancelAlarmTasks cancel tag is ", it.next());
        }
        c(this.q);
        this.q.clear();
        this.f8129c.cancel(this.f8128b);
    }

    public void a() {
        this.f = 0;
        this.t = 0L;
        this.v = 0L;
        this.x = 0;
        this.r = 0L;
        this.p = 0L;
        this.y = 0L;
        this.j = 0L;
        this.g = 0L;
        this.n = 0L;
        this.h = 0L;
    }

    public void d() {
        this.j = 0L;
        this.f = 0;
        this.r = 0L;
        this.p = 0L;
        this.y = 0L;
    }

    public void b() {
        this.g = 0L;
        this.p = 0L;
        this.y = 0L;
    }

    public void q() {
        long j = this.t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.p;
        long j3 = j + (jCurrentTimeMillis - j2);
        this.t = j3;
        ReleaseLogUtil.d("Track_AlarmHelper", "settlementRunTime enter mStartRunTimestamp ", Long.valueOf(j2), " mStartRunTime ", Long.valueOf(j3));
        this.p = 0L;
    }

    public void r() {
        ReleaseLogUtil.d("Track_AlarmHelper", "settlementHangTime enter mStartHangTimestamp ", Long.valueOf(this.r));
        this.x = (int) (((long) this.x) + (System.currentTimeMillis() - this.r));
        this.r = 0L;
    }

    public void p() {
        long j = this.v;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.y;
        long j3 = j + (jCurrentTimeMillis - j2);
        this.v = j3;
        ReleaseLogUtil.d("Track_AlarmHelper", "settlementForWalk enter mStartWalkTimestamp ", Long.valueOf(j2), " mStartWalkTime ", Long.valueOf(j3));
        this.y = 0L;
    }

    public void m() {
        this.o = (int) (((long) this.o) + (System.currentTimeMillis() - this.k));
        this.k = 0L;
    }

    private PendingIntent d(Context context, String str) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClass(context, DaemonService.class);
        intent.setAction(str);
        return PendingIntent.getService(context, 0, intent, 201326592);
    }

    private PendingIntent c(Context context, String str, int i) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClass(context, DaemonService.class);
        intent.setAction(str);
        intent.putExtra("type", i);
        return PendingIntent.getService(context, 0, intent, 201326592);
    }

    private void c(List<String> list) {
        if (f8127a) {
            ReleaseLogUtil.d("Track_AlarmHelper", "unapplyForAlarmExemption actions ", list);
            PowerKitManager.a().b(list);
        }
    }

    private void a(List<String> list) {
        if (f8127a) {
            ReleaseLogUtil.d("Track_AlarmHelper", "applyForAlarmExemption actions ", list);
            PowerKitManager.a().e(list);
        }
    }

    public void n() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.k = jCurrentTimeMillis;
        ReleaseLogUtil.d("Track_AlarmHelper", "setPauseInPreSport ", Long.valueOf(jCurrentTimeMillis));
        this.e.clear();
        this.e.add("SEND_STOP_BROADCAST");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o > 108000) {
            PendingIntent pendingIntentD = d(BaseApplication.b(), "SEND_STOP_BROADCAST");
            this.l = pendingIntentD;
            c(this.e, jElapsedRealtime + 60000, pendingIntentD);
        }
    }

    private void w() {
        s();
        ReleaseLogUtil.d("Track_AlarmHelper", "get final steps");
        this.d.a(this.i.a());
    }

    public SportStatusDetectManager.AutoRecognizeStatus d(SportStatusDetectManager.AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface) {
        c();
        w();
        if (autoRecognizeStatus.getStatus() == SportStatusDetectManager.AutoRecognizeStatus.IDLE.getStatus()) {
            return SportStatusDetectManager.AutoRecognizeStatus.FAULT_TOLERANT;
        }
        long j = this.t;
        long j2 = j / 1000;
        long j3 = this.v;
        long j4 = (j3 / 1000) + j2;
        int i = (int) ((j2 * 100) / j4);
        ReleaseLogUtil.d("Track_AlarmHelper", "setEndPreSport totalSportTime ", Long.valueOf(j4), " mPauseTimeInPreSport ", Integer.valueOf(this.o), " mStartRunTime ", Long.valueOf(j), " runPercent ", Integer.valueOf(i), " mStartWalkTime ", Long.valueOf(j3));
        if (i > 50) {
            SportStatusDetectManager.AutoRecognizeStatus autoRecognizeStatus2 = SportStatusDetectManager.AutoRecognizeStatus.RUN;
            triggerSportInterface.startRunning(this.d.a());
            return autoRecognizeStatus2;
        }
        SportStatusDetectManager.AutoRecognizeStatus autoRecognizeStatus3 = SportStatusDetectManager.AutoRecognizeStatus.WALK;
        triggerSportInterface.startWalking(this.d.a());
        return autoRecognizeStatus3;
    }

    public SportStatusDetectManager.AutoRecognizeStatus b(SportStatusDetectManager.AutoRecognizeStatus autoRecognizeStatus) {
        this.e.clear();
        long j = this.t / 1000;
        long j2 = this.v / 1000;
        long j3 = j + j2;
        ReleaseLogUtil.d("Track_AlarmHelper", "setEndRecognize enter totalSportDuration ", Long.valueOf(j3), " walkSecond ", Long.valueOf(j2), " runSecond ", Long.valueOf(j));
        if (j3 == 0) {
            return SportStatusDetectManager.AutoRecognizeStatus.IDLE;
        }
        int i = (int) ((j * 100) / j3);
        int i2 = (int) ((j2 * 100) / j3);
        boolean z = i2 > 60 || i > 60;
        ReleaseLogUtil.d("Track_AlarmHelper", "setEndRecognize enter mStartRunTime ", Long.valueOf(this.t), " mStartWalkTime ", Long.valueOf(this.v), " walkPercent ", Integer.valueOf(i2), " runPercent ", Integer.valueOf(i));
        if (!z) {
            this.e.add("SEND_STOP_BROADCAST");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            PendingIntent pendingIntentD = d(BaseApplication.b(), "SEND_STOP_BROADCAST");
            this.l = pendingIntentD;
            c(this.e, jElapsedRealtime + 1000, pendingIntentD);
            return SportStatusDetectManager.AutoRecognizeStatus.IDLE;
        }
        this.d.d(120000);
        return autoRecognizeStatus;
    }

    public void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.p = jCurrentTimeMillis;
        ReleaseLogUtil.d("Track_AlarmHelper", "setEnterPreSportRun enter ", Long.valueOf(jCurrentTimeMillis), " mEnterPreSportTimestamp ", Long.valueOf(this.g));
        if (this.g == 0) {
            this.q.clear();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.q.add("SEND_EXIT_PRE_SPORT_BROADCAST");
            PendingIntent pendingIntentC = c(BaseApplication.b(), "SEND_EXIT_PRE_SPORT_BROADCAST", SportStatusDetectManager.AutoRecognizeStatus.RUN.getStatus());
            this.f8128b = pendingIntentC;
            c(this.q, jElapsedRealtime + 180000, pendingIntentC);
            this.g = this.p;
            v();
        }
    }

    public void i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.y = jCurrentTimeMillis;
        ReleaseLogUtil.d("Track_AlarmHelper", "setEnterPreSportWalk enter ", Long.valueOf(jCurrentTimeMillis), " mEnterPreSportTimestamp ", Long.valueOf(this.g));
        if (this.g == 0) {
            this.q.clear();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.q.add("SEND_EXIT_PRE_SPORT_BROADCAST");
            PendingIntent pendingIntentC = c(BaseApplication.b(), "SEND_EXIT_PRE_SPORT_BROADCAST", SportStatusDetectManager.AutoRecognizeStatus.WALK.getStatus());
            this.f8128b = pendingIntentC;
            c(this.q, jElapsedRealtime + 180000, pendingIntentC);
            this.g = this.y;
            v();
        }
    }

    public void h() {
        if (this.g == 0) {
            this.g = System.currentTimeMillis();
        }
        this.k = System.currentTimeMillis();
    }

    public void j() {
        if (this.h == 0 || System.currentTimeMillis() - this.h > 180000) {
            this.h = System.currentTimeMillis();
            this.n = 0L;
        }
        this.s = System.currentTimeMillis();
    }

    public void t() {
        if (this.s == 0) {
            ReleaseLogUtil.a("Track_AlarmHelper", "settleStopTime error enter");
        } else {
            this.n += System.currentTimeMillis() - this.s;
            this.s = 0L;
        }
    }

    public void f() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.q.add("SEND_ENTER_PRE_STOP_BROADCAST");
        long j = this.n;
        PendingIntent pendingIntentD = d(BaseApplication.b(), "SEND_ENTER_PRE_STOP_BROADCAST");
        this.f8128b = pendingIntentD;
        c(this.q, (jElapsedRealtime + 126000) - j, pendingIntentD);
    }
}
