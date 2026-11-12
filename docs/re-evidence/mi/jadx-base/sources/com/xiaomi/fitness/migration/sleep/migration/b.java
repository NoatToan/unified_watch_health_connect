package com.xiaomi.fitness.migration.sleep.migration;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.persist.process.SleepSnoreDecibelUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.sleep.HealthSleepDatabase;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.AudioAttributes;
import defpackage.q3n;
import defpackage.u3n;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12439b;
    public final MigrationManager d;
    public final String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12438a = "DB_Trans";
    public final Calendar c = Calendar.getInstance();

    public b(Context context) {
        this.f12439b = context;
        MigrationManager companion = MigrationManager.INSTANCE.getInstance();
        this.d = companion;
        this.e = companion.requestPhoneSid();
    }

    public void a() {
        HealthSleepDatabase.h(this.f12439b).i().b();
    }

    public void b(List<SleepSegmentReport> list) {
        u3n u3nVarI = HealthSleepDatabase.h(this.f12439b).i();
        if (u3nVarI.c() <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList linkedList = new LinkedList();
        for (SleepSegmentReport sleepSegmentReport : list) {
            this.c.setTimeInMillis(sleepSegmentReport.getWakeupTime() * 1000);
            TimeUtils.setToZeroOClock(this.c);
            long timeInMillis = this.c.getTimeInMillis();
            linkedList.add(Long.valueOf(timeInMillis));
            List linkedList2 = (List) linkedHashMap.get(Long.valueOf(timeInMillis));
            if (linkedList2 == null) {
                linkedList2 = new LinkedList();
                linkedHashMap.put(Long.valueOf(timeInMillis), linkedList2);
            }
            linkedList2.add(sleepSegmentReport);
        }
        List<q3n> listA = u3nVarI.a(linkedList);
        if (listA == null || listA.isEmpty()) {
            return;
        }
        for (q3n q3nVar : listA) {
            List<SleepSegmentReport> list2 = (List) linkedHashMap.get(Long.valueOf(q3nVar.j()));
            if (list2 != null && !list2.isEmpty()) {
                for (SleepSegmentReport sleepSegmentReport2 : list2) {
                    long bedTime = sleepSegmentReport2.getBedTime();
                    long wakeupTime = sleepSegmentReport2.getWakeupTime();
                    List<AudioAttributes> listB = q3nVar.B();
                    List<AudioAttributes> listC = q3nVar.C();
                    if (listB != null && !listB.isEmpty()) {
                        long beginTime = listB.get(0).getBeginTime();
                        if (beginTime >= bedTime && beginTime < wakeupTime) {
                            c(q3nVar, sleepSegmentReport2);
                        }
                    } else if (listC != null && !listC.isEmpty()) {
                        long beginTime2 = listC.get(0).getBeginTime();
                        if (beginTime2 >= bedTime && beginTime2 < wakeupTime) {
                            c(q3nVar, sleepSegmentReport2);
                        }
                    }
                }
            }
        }
    }

    public final void c(q3n q3nVar, SleepSegmentReport sleepSegmentReport) {
        List<AudioAttributes> listB = q3nVar.B();
        if (listB != null) {
            sleepSegmentReport.setDreamTalkCount(Integer.valueOf(listB.size()));
        }
        sleepSegmentReport.setSnoreDuration(Integer.valueOf(q3nVar.F()));
        SleepAudioMigrateUtils.Companion companion = SleepAudioMigrateUtils.INSTANCE;
        companion.getInstance().migrateSleepAudioFile(q3nVar.C(), sleepSegmentReport);
        companion.getInstance().migrateSleepAudioFile(q3nVar.B(), sleepSegmentReport);
        d(q3nVar, sleepSegmentReport);
    }

    public final void d(q3n q3nVar, SleepSegmentReport sleepSegmentReport) {
        SleepSnoreDecibelUtils.INSTANCE.getInstance().convertAndUploadDecibelData(this.e, q3nVar.j(), sleepSegmentReport);
    }
}
