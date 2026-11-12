package defpackage;

import android.content.Intent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.fitness.activity.coresleep.notification.HealthCommondReceiver;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class utd {
    public static void e() {
        LogUtil.a("BloodPressureReminderScheduler", "syncScheduleNextReminder enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: utd.1
            @Override // java.lang.Runnable
            public void run() {
                utd.d();
            }
        });
    }

    public static void d() {
        c();
        uub.b((ResponseCallback<dfk>) new ResponseCallback() { // from class: utc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                utd.b(i, (dfk) obj);
            }
        });
    }

    static /* synthetic */ void b(int i, dfk dfkVar) {
        if (dfkVar == null) {
            LogUtil.j("BloodPressureReminderScheduler", "getBloodPressureReminderPlan list is null");
            return;
        }
        if (njy.e(dfkVar.a())) {
            LogUtil.j("BloodPressureReminderScheduler", "getReminderPlans is null");
            return;
        }
        long j = Long.MAX_VALUE;
        for (dfk.e eVar : dfkVar.a()) {
            if (eVar.a() == 1) {
                long jE = e(eVar);
                if (jE > System.currentTimeMillis() && jE < j) {
                    j = jE;
                }
            }
        }
        LogUtil.a("BloodPressureReminderScheduler", "nextTriggerTime=", Long.valueOf(j));
        if (j < Long.MAX_VALUE) {
            xjk.c(1001, e(lsl.m(j), lsl.n(j)), 201326592, 0, j);
        }
    }

    public static void c() {
        LogUtil.a("BloodPressureReminderScheduler", "cancelAllReminders");
        uth.e();
        xjk.d(1001, e(-1, -1), 201326592);
    }

    private static long e(dfk.e eVar) {
        LogUtil.a("BloodPressureReminderScheduler", "calculateNextTriggerTime, ReminderPlan=", eVar.toString());
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (eVar.c() == 1) {
            return b(eVar, jCurrentTimeMillis);
        }
        return a(eVar, jCurrentTimeMillis);
    }

    private static long b(dfk.e eVar, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 7; i++) {
            Long.valueOf(jCurrentTimeMillis).getClass();
            long jD = lsl.d(lsl.a(jCurrentTimeMillis, eVar.f(), eVar.g()), i);
            if (e(eVar, jD) && jD > j) {
                return jD;
            }
        }
        return Long.MAX_VALUE;
    }

    private static long a(dfk.e eVar, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jH = ((long) (eVar.h() * 60)) * 1000;
        if (jH <= 0) {
            ReleaseLogUtil.c("R_BloodPressureReminderScheduler", "intervalMillis :", Long.valueOf(jH), "paln: ", eVar.toString());
            return Long.MAX_VALUE;
        }
        for (int i = 0; i < 7; i++) {
            long jD = lsl.d(jCurrentTimeMillis, i);
            if (e(eVar, jD)) {
                long jA = lsl.a(jD, eVar.j(), eVar.i());
                long jA2 = lsl.a(jD, eVar.d(), eVar.e());
                if (i != 0) {
                    return jA;
                }
                if (j >= jA2) {
                    continue;
                } else {
                    if (j >= jA) {
                        jA += (((j - jA) / jH) + 1) * jH;
                    }
                    if (jA <= jA2) {
                        return jA;
                    }
                }
            }
        }
        return Long.MAX_VALUE;
    }

    private static boolean e(dfk.e eVar, long j) {
        int iE = lsl.e(j);
        return (eVar.b() & (1 << (iE == 1 ? 6 : iE + (-2)))) != 0;
    }

    private static Intent e(int i, int i2) {
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) HealthCommondReceiver.class);
        intent.setPackage(BaseApplication.d());
        intent.setAction("BLOOD_PRESSURE_MEASURE_PLAN_ACTION");
        intent.putExtra("BLOOD_PRESSURE_MEASURE_PLAN_HOUR_OF_DAY", i);
        intent.putExtra("BLOOD_PRESSURE_MEASURE_PLAN_MINUTE", i2);
        return intent;
    }

    public static dfk c(dfk dfkVar, List<dfl> list) {
        if (dfkVar == null) {
            dfkVar = new dfk();
        }
        if (list != null && !list.isEmpty()) {
            List<dfk.e> listA = dfkVar.a();
            if (listA == null) {
                dfkVar.b(new ArrayList());
                listA = dfkVar.a();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<dfl> it = list.iterator();
            while (it.hasNext()) {
                listA.add(d(it.next(), jCurrentTimeMillis));
                jCurrentTimeMillis += TimeUnit.SECONDS.toMillis(1L);
            }
            LogUtil.a("BloodPressureReminderScheduler", "appendFromOldBloodPlan, targetPlan=", dfkVar.toString());
        }
        return dfkVar;
    }

    private static dfk.e d(dfl dflVar, long j) {
        dfk.e eVar = new dfk.e();
        eVar.b(j);
        eVar.a(dflVar.a());
        eVar.h(dflVar.c());
        eVar.f(dflVar.e());
        eVar.e(dflVar.h() ? 1 : 0);
        eVar.c(1);
        eVar.j(0);
        eVar.g(0);
        eVar.b(0);
        eVar.d(0);
        eVar.i(0);
        eVar.e(j);
        return eVar;
    }

    public static dfk a() {
        dfk dfkVar = new dfk();
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        dfk.e eVar = new dfk.e();
        eVar.b(jCurrentTimeMillis);
        eVar.a(127);
        eVar.e(0);
        eVar.c(1);
        eVar.h(8);
        eVar.f(0);
        eVar.j(0);
        eVar.g(0);
        eVar.b(0);
        eVar.d(0);
        eVar.i(0);
        eVar.e(jCurrentTimeMillis);
        long j = 1000 + jCurrentTimeMillis;
        dfk.e eVar2 = new dfk.e();
        eVar2.b(j);
        eVar2.a(127);
        eVar2.e(0);
        eVar2.c(1);
        eVar2.h(20);
        eVar2.f(0);
        eVar2.j(0);
        eVar2.g(0);
        eVar2.b(0);
        eVar2.d(0);
        eVar2.i(0);
        eVar2.e(j);
        long j2 = jCurrentTimeMillis + 2000;
        dfk.e eVar3 = new dfk.e();
        eVar3.b(j2);
        eVar3.a(127);
        eVar3.e(0);
        eVar3.c(2);
        eVar3.h(0);
        eVar3.f(0);
        eVar3.j(9);
        eVar3.g(0);
        eVar3.b(12);
        eVar3.d(0);
        eVar3.i(30);
        eVar3.e(j2);
        arrayList.add(eVar);
        arrayList.add(eVar2);
        arrayList.add(eVar3);
        dfkVar.b(arrayList);
        return dfkVar;
    }
}
