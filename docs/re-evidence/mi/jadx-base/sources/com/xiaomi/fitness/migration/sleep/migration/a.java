package com.xiaomi.fitness.migration.sleep.migration;

import android.content.Context;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.sleep.HealthSleepDatabase;
import defpackage.frc;
import defpackage.szm;
import defpackage.yzm;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class a implements frc {
    public Context c;
    public Calendar d = Calendar.getInstance();
    public Map<Long, SleepSegmentReport> e = new LinkedHashMap();
    public Map<Long, SleepSegmentReport> f = new LinkedHashMap();
    public Map<Long, SleepSegmentReport> g = new LinkedHashMap();
    public final MigrationManager h;
    public final String i;
    public final b j;

    public a(Context context) {
        this.c = UIUtils.getSafeContext(context);
        MigrationManager companion = MigrationManager.INSTANCE.getInstance();
        this.h = companion;
        this.i = companion.requestPhoneSid();
        this.j = new b(context);
    }

    public static SleepStateItem g(yzm yzmVar) {
        int i;
        switch (yzmVar.G()) {
            case 6:
                i = 5;
                break;
            case 7:
            default:
                i = 0;
                break;
            case 8:
                i = 6;
                break;
            case 9:
                i = 3;
                break;
            case 10:
                i = 2;
                break;
        }
        return new SleepStateItem(i(yzmVar.B()), i(yzmVar.C()), i);
    }

    public static int h(long j) {
        return (int) TimeUnit.MILLISECONDS.toMinutes(j);
    }

    public static int i(long j) {
        return (int) TimeUnit.MILLISECONDS.toSeconds(j);
    }

    public final void a(List<yzm> list) {
        SleepSegmentReport sleepSegmentReportD;
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yzm yzmVar = list.get(i);
            if (yzmVar.G() == 8 && TextUtils.equals(yzmVar.i(), "PHONE")) {
                if (yzmVar.H() && (sleepSegmentReportD = d(linkedList)) != null) {
                    this.e.put(Long.valueOf(sleepSegmentReportD.getWakeupTime()), sleepSegmentReportD);
                    linkedList.clear();
                }
                linkedList.add(yzmVar);
            }
        }
        SleepSegmentReport sleepSegmentReportD2 = d(linkedList);
        if (sleepSegmentReportD2 != null) {
            this.e.put(Long.valueOf(sleepSegmentReportD2.getWakeupTime()), sleepSegmentReportD2);
            linkedList.clear();
        }
    }

    public final void b(List<yzm> list) {
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yzm yzmVar = list.get(i);
            if (yzmVar.G() == 8 && TextUtils.equals(yzmVar.i(), "MANUAL")) {
                linkedList.add(yzmVar);
            }
        }
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            yzm yzmVar2 = (yzm) linkedList.get(i2);
            long jI = i(yzmVar2.B());
            long jI2 = i(yzmVar2.C());
            SleepSegmentReport.Builder builder = new SleepSegmentReport.Builder();
            builder.setTzIn15Min(Integer.valueOf(this.h.getCurTimeZoneOffset15Min()));
            builder.bedTime(jI).deviceBedTime(Long.valueOf(jI));
            builder.wakeupTime(jI2).deviceWakeupTime(Long.valueOf(jI2));
            builder.sleepDuration(h(yzmVar2.C()) - h(yzmVar2.B()));
            this.f.put(Long.valueOf(jI2), builder.build());
        }
    }

    public final void c(List<yzm> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a(list);
        b(list);
        e(list);
    }

    public SleepSegmentReport d(List<yzm> list) {
        long j;
        int size = list.size();
        LinkedList linkedList = new LinkedList();
        SleepSegmentReport sleepSegmentReportBuild = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        yzm yzmVar = null;
        while (i < size) {
            yzm yzmVar2 = list.get(i);
            int i3 = size;
            int iG = yzmVar2.G();
            if (yzmVar2.H()) {
                long jI = i(yzmVar2.C());
                SleepSegmentReport.Builder builder = new SleepSegmentReport.Builder();
                builder.setDeviceWakeupTime(Long.valueOf(jI));
                builder.wakeupTime(jI);
                builder.setTzIn15Min(Integer.valueOf(this.h.getCurTimeZoneOffset15Min()));
                sleepSegmentReportBuild = builder.build();
            }
            long jH = h(yzmVar2.C()) - h(yzmVar2.B());
            SleepSegmentReport sleepSegmentReport = sleepSegmentReportBuild;
            if (yzmVar != null) {
                j = jH;
                long jH2 = h(yzmVar.B()) - h(yzmVar2.C());
                if (jH2 > 0) {
                    i2++;
                    j2 += jH2;
                    yzm yzmVar3 = new yzm();
                    yzmVar3.I(yzmVar2.C());
                    yzmVar3.L(yzmVar.B());
                    yzmVar3.W(6);
                    linkedList.add(g(yzmVar3));
                }
            } else {
                j = jH;
            }
            if (iG == 9) {
                j4 += j;
                j5 += j;
                linkedList.add(g(yzmVar2));
            }
            if (iG == 10) {
                j3 += j;
                j5 += j;
                linkedList.add(g(yzmVar2));
            } else {
                j3 = j3;
            }
            if (iG == 6) {
                i2++;
                j2 += j;
                linkedList.add(g(yzmVar2));
            }
            if (iG == 8) {
                j5 += j;
                linkedList.add(g(yzmVar2));
                z = true;
            }
            i++;
            yzmVar = yzmVar2;
            size = i3;
            sleepSegmentReportBuild = sleepSegmentReport;
        }
        long j6 = j3;
        long j7 = j5;
        if (sleepSegmentReportBuild != null) {
            long jI2 = i(yzmVar.B());
            sleepSegmentReportBuild.setBedTime(jI2);
            sleepSegmentReportBuild.setDeviceBedTime(Long.valueOf(jI2));
            sleepSegmentReportBuild.setWakeCount(Integer.valueOf(i2));
            sleepSegmentReportBuild.setWakeDuration(Integer.valueOf((int) j2));
            sleepSegmentReportBuild.setDeepDuration((int) j6);
            sleepSegmentReportBuild.setLightDuration((int) j4);
            int i4 = (int) j7;
            sleepSegmentReportBuild.setSleepDuration(i4);
            if (z) {
                sleepSegmentReportBuild.setSleepTraceDuration(Integer.valueOf(i4));
            }
            Collections.sort(linkedList);
            sleepSegmentReportBuild.setSleepItems(linkedList);
        }
        return sleepSegmentReportBuild;
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = FileUtils.getDatabaseDir(this.c) + "/health_sleep";
        if (FileUtils.isFileExists(str)) {
            j();
            deleteDbFile(str);
        }
        SleepAudioMigrateUtils.INSTANCE.getInstance().migrateOldHealthSleepData();
        FitnessLogUtils.i("DB_Trans", "SleepStage and Snore migration finished");
    }

    public final void e(List<yzm> list) {
        SleepSegmentReport sleepSegmentReportD;
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yzm yzmVar = list.get(i);
            int iG = yzmVar.G();
            if (iG == 10 || iG == 9) {
                if (yzmVar.H() && (sleepSegmentReportD = d(linkedList)) != null) {
                    this.g.put(Long.valueOf(sleepSegmentReportD.getWakeupTime()), sleepSegmentReportD);
                    linkedList.clear();
                }
                linkedList.add(yzmVar);
            }
        }
        SleepSegmentReport sleepSegmentReportD2 = d(linkedList);
        if (sleepSegmentReportD2 != null) {
            this.g.put(Long.valueOf(sleepSegmentReportD2.getWakeupTime()), sleepSegmentReportD2);
            linkedList.clear();
        }
    }

    public final void f() {
        Iterator<Map.Entry<Long, SleepSegmentReport>> it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            Long key = it.next().getKey();
            key.longValue();
            this.e.remove(key);
        }
        LinkedList linkedList = new LinkedList();
        Iterator<Map.Entry<Long, SleepSegmentReport>> it2 = this.g.entrySet().iterator();
        while (it2.hasNext()) {
            linkedList.add(it2.next().getValue());
        }
        this.j.b(linkedList);
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordSleepSegment(this.i, this.h.getCurTimeZoneOffsetInSecond(), linkedList);
        this.g.clear();
        linkedList.clear();
        LinkedList linkedList2 = new LinkedList();
        Iterator<Map.Entry<Long, SleepSegmentReport>> it3 = this.e.entrySet().iterator();
        while (it3.hasNext()) {
            linkedList2.add(it3.next().getValue());
        }
        this.j.b(linkedList2);
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordSleepSegment(this.i, this.h.getCurTimeZoneOffsetInSecond(), linkedList2);
        this.e.clear();
        linkedList2.clear();
        LinkedList linkedList3 = new LinkedList();
        Iterator<Map.Entry<Long, SleepSegmentReport>> it4 = this.f.entrySet().iterator();
        while (it4.hasNext()) {
            linkedList3.add(it4.next().getValue());
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordSleepSegment("xiaomiwear_app_manually", this.h.getCurTimeZoneOffsetInSecond(), linkedList3);
        this.f.clear();
        linkedList3.clear();
    }

    public void j() {
        szm szmVarJ = HealthSleepDatabase.h(this.c).j();
        TimeInfo timeInfoA = szmVarJ.a();
        long minTime = timeInfoA.getMinTime();
        FitnessLogUtils.i("DB_Trans", "sleep transform minTimestamp = " + minTime);
        if (minTime <= 0) {
            szmVarJ.b();
            return;
        }
        this.h.setMinTimestamp(minTime);
        this.h.setMaxTimestamp(timeInfoA.getMaxTime());
        this.d.setTimeInMillis(minTime);
        TimeUtils.setToZeroOClock(this.d);
        this.d.add(5, -1);
        long timeInMillis = this.d.getTimeInMillis();
        this.d.setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(this.d);
        long timeInMillis2 = this.d.getTimeInMillis();
        long j = frc.f18123a;
        while (true) {
            long jC = timeInMillis2 + j;
            timeInMillis2 -= j;
            if (timeInMillis2 < timeInMillis) {
                timeInMillis2 = timeInMillis;
            }
            yzm yzmVarD = szmVarJ.d(jC);
            if (yzmVarD != null) {
                jC = 1 + yzmVarD.C();
            }
            c(szmVarJ.c(timeInMillis2, jC));
            f();
            if (timeInMillis2 == timeInMillis) {
                szmVarJ.b();
                this.j.a();
                return;
            }
            j = frc.f18123a;
        }
    }
}
