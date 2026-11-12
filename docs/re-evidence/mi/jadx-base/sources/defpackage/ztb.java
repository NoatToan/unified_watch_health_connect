package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.CaloriesItem;
import com.xiaomi.fit.fitness.export.data.item.MHStrengthItem;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.exercise.HealthExerciseDatabase;
import com.xiaomi.fitness.migration.exercise.entity.ExerciseRecord;
import com.xiaomi.fitness.migration.exercise.entity.IntensityDuration;
import com.xiaomi.fitness.migration.exercise.transformation.PressureFileUtils;
import com.xiaomi.fitness.migration.exercise.transformation.PressureSegment;
import com.xiaomi.fitness.migration.exercise.transformation.StepItemInserter;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class ztb implements frc {
    public final String c;
    public Context d;
    public String e;
    public Calendar f;
    public Map<Long, Float> g;
    public Set<Long> h;
    public final Gson i;
    public final MigrationManager j;

    public ztb(Context context) {
        Objects.requireNonNull(context);
        this.d = context;
        this.e = FileUtils.getDatabaseDir(context).getAbsolutePath();
        this.f = Calendar.getInstance();
        this.g = new LinkedHashMap();
        this.h = new HashSet();
        MigrationManager companion = MigrationManager.INSTANCE.getInstance();
        this.j = companion;
        this.i = companion.getGson();
        this.c = companion.requestPhoneSid();
    }

    public final void a(SupportSQLiteDatabase supportSQLiteDatabase, List<ExerciseRecord> list) throws Throwable {
        if (supportSQLiteDatabase == null || list.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (ExerciseRecord exerciseRecord : list) {
            String strI = exerciseRecord.i();
            if (ep5.d(strI)) {
                ActiveStageItem activeStageItemF = dg8.f(this.d, exerciseRecord);
                if (activeStageItemF != null) {
                    linkedList.add(activeStageItemF);
                }
            } else if (ep5.c(strI) || ep5.a(strI)) {
                SportBasicReport sportBasicReportE = e(exerciseRecord);
                FitnessLogUtils.i("DB_Trans", "report = " + sportBasicReportE);
                linkedList2.add(sportBasicReportE);
                c(exerciseRecord);
            }
            d(exerciseRecord);
        }
        m(linkedList2);
        j(linkedList);
        k();
        l();
    }

    public final void b(SupportSQLiteDatabase supportSQLiteDatabase, long j, long j2, List<b2c> list) {
        if (supportSQLiteDatabase == null || list.isEmpty()) {
            return;
        }
        StepItemInserter.INSTANCE.insertStepItemToDB(j, j2, list);
    }

    public final void c(ExerciseRecord exerciseRecord) {
        long jG = exerciseRecord.G();
        long minutes = TimeUnit.SECONDS.toMinutes(exerciseRecord.F());
        float fMax = Math.max(exerciseRecord.B(), exerciseRecord.W());
        float f = fMax / minutes;
        this.f.setTimeInMillis(jG);
        this.f.set(13, 0);
        this.f.set(14, 0);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f.getTimeInMillis());
        while (minutes > 0 && fMax > 0.0f) {
            Float f2 = this.g.get(Long.valueOf(seconds));
            this.g.put(Long.valueOf(seconds), f2 == null ? Float.valueOf(f) : Float.valueOf(f2.floatValue() + f));
            seconds -= TimeUnit.MINUTES.toSeconds(1L);
            minutes--;
            fMax -= f;
        }
    }

    public final void d(ExerciseRecord exerciseRecord) {
        int minutes;
        long jG = exerciseRecord.G();
        IntensityDuration intensityDurationL = exerciseRecord.L();
        if (intensityDurationL != null && (minutes = (int) TimeUnit.SECONDS.toMinutes(intensityDurationL.a() + intensityDurationL.c())) > 0) {
            this.f.setTimeInMillis(jG);
            this.f.set(13, 0);
            this.f.set(14, 0);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f.getTimeInMillis());
            for (minutes = (int) TimeUnit.SECONDS.toMinutes(intensityDurationL.a() + intensityDurationL.c()); minutes > 0; minutes--) {
                this.h.add(Long.valueOf(seconds));
                seconds -= TimeUnit.MINUTES.toSeconds(1L);
            }
        }
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = this.e + "/health_exercise";
        if (FileUtils.isFileExists(str)) {
            if (q(supportSQLiteDatabase) & r(supportSQLiteDatabase)) {
                deleteDbFile(str);
            }
        }
        FitnessLogUtils.i("DB_Trans", "Exercise migration finished");
    }

    public final SportBasicReport e(ExerciseRecord exerciseRecord) throws Throwable {
        int iB = bh8.b(exerciseRecord.V());
        FitnessDataId.Builder builderSportType = new FitnessDataId.Builder().sportType(iB);
        long jA = exerciseRecord.A();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SportBasicReport sportBasicReport = new SportBasicReport(builderSportType.timeStamp(jA, timeUnit).timeZoneIn15Min(FitnessDateUtils.getCurrentTZOffsetIn15min()).version(1).build());
        if (ep5.b(exerciseRecord.i())) {
            sportBasicReport.setSid("xiaomiwear_app_manually");
        } else {
            sportBasicReport.setSid("xiaomiwear_app");
        }
        sportBasicReport.setSportType(iB);
        sportBasicReport.setStartTime(timeUnit.toSeconds(exerciseRecord.A()));
        sportBasicReport.setEndTime(timeUnit.toSeconds(exerciseRecord.G()));
        sportBasicReport.setDuration((int) exerciseRecord.F());
        if (iB != 8) {
            sportBasicReport.setDistance(Integer.valueOf(exerciseRecord.C()));
        }
        sportBasicReport.setCalories(Integer.valueOf(exerciseRecord.B()));
        int iW = exerciseRecord.W();
        if (iW <= 0) {
            iW = exerciseRecord.B();
        }
        sportBasicReport.setTotalCal(Integer.valueOf(iW));
        p(sportBasicReport, exerciseRecord);
        o("xiaomiwear_app", sportBasicReport, exerciseRecord);
        n(sportBasicReport, exerciseRecord);
        return sportBasicReport;
    }

    public final void f(SportBasicReport sportBasicReport, ExerciseRecord exerciseRecord) {
        gg8 gg8Var = (gg8) dg8.d(this.i, gg8.class, exerciseRecord.H());
        if (gg8Var == null) {
            return;
        }
        sportBasicReport.setMaxHr(Integer.valueOf(gg8Var.b()));
        sportBasicReport.setMinHr(Integer.valueOf(gg8Var.c()));
        sportBasicReport.setAvgHr(Integer.valueOf(gg8Var.a()));
    }

    public final void g(SportBasicReport sportBasicReport, ExerciseRecord exerciseRecord) {
        pg8 pg8Var = (pg8) dg8.d(this.i, pg8.class, exerciseRecord.H());
        if (pg8Var == null) {
            return;
        }
        sportBasicReport.setMinPace(Integer.valueOf(pg8Var.c()));
        sportBasicReport.setMaxPace(Integer.valueOf(pg8Var.b()));
        sportBasicReport.setAvgPace(Integer.valueOf(pg8Var.a()));
    }

    public final void h(SportBasicReport sportBasicReport, ExerciseRecord exerciseRecord) {
        wg8 wg8Var = (wg8) dg8.d(this.i, wg8.class, exerciseRecord.H());
        if (wg8Var == null) {
            return;
        }
        sportBasicReport.setSteps(Integer.valueOf(wg8Var.g()));
        sportBasicReport.setMaxPace(Integer.valueOf(wg8Var.c()));
        sportBasicReport.setMinPace(Integer.valueOf(wg8Var.e()));
        sportBasicReport.setAvgPace(Integer.valueOf(wg8Var.b()));
    }

    public final void i(SportBasicReport sportBasicReport, ExerciseRecord exerciseRecord) {
        wg8 wg8Var = (wg8) dg8.d(this.i, wg8.class, exerciseRecord.H());
        if (wg8Var == null) {
            return;
        }
        sportBasicReport.setSteps(Integer.valueOf(wg8Var.g()));
        sportBasicReport.setMaxCadence(Integer.valueOf(wg8Var.d()));
        sportBasicReport.setMinCadence(Integer.valueOf(wg8Var.f()));
        sportBasicReport.setAvgCadence(Integer.valueOf(wg8Var.a()));
    }

    public final void j(List<ActiveStageItem> list) {
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordActiveStage(this.c, this.j.getCurTimeZoneOffsetInSecond(), list);
    }

    public final void k() {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<Long, Float> entry : this.g.entrySet()) {
            int iIntValue = entry.getValue().intValue();
            if (iIntValue > 0) {
                linkedList.add(new CaloriesItem(entry.getKey().longValue(), iIntValue));
            }
        }
        this.g.clear();
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordCalorie(this.c, this.j.getCurTimeZoneOffsetInSecond(), linkedList);
    }

    public final void l() {
        LinkedList linkedList = new LinkedList();
        Iterator<Long> it = this.h.iterator();
        while (it.hasNext()) {
            linkedList.add(new MHStrengthItem(it.next().longValue()));
        }
        this.h.clear();
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordMHStrength(this.c, this.j.getCurTimeZoneOffsetInSecond(), linkedList);
    }

    public final void m(List<SportBasicReport> list) {
        for (SportBasicReport sportBasicReport : list) {
            FitnessDataRecorderImpl.INSTANCE.getInstance().recordSportReport(sportBasicReport.getSid(), FitnessDateUtils.getTzOffsetInSecBy15min(sportBasicReport.getTzIn15Min()), sportBasicReport);
        }
    }

    public final void n(SportBasicReport sportBasicReport, ExerciseRecord exerciseRecord) {
        String strV = exerciseRecord.V();
        strV.hashCode();
        switch (strV) {
            case "OUTDOOR_RIDING":
                g(sportBasicReport, exerciseRecord);
                break;
            case "OUTDOOR_RUNNING":
                h(sportBasicReport, exerciseRecord);
                break;
            case "FREE_TRAINING":
                f(sportBasicReport, exerciseRecord);
                break;
            case "WALKING":
                i(sportBasicReport, exerciseRecord);
                break;
            case "COURSE":
                FitnessLogUtils.i("DB_Trans", "parseExtra: ignore " + strV);
                break;
            default:
                FitnessLogUtils.e("DB_Trans", "parseExtra error, unknown type : " + strV);
                break;
        }
    }

    public final void o(String str, SportBasicReport sportBasicReport, ExerciseRecord exerciseRecord) throws Throwable {
        String strX = exerciseRecord.X();
        if (TextUtils.isEmpty(strX)) {
            return;
        }
        List<xnp> listC = tmp.c(this.d, strX);
        if (listC.isEmpty()) {
            return;
        }
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportBasicReport.getTimeStamp()).timeZoneIn15Min(sportBasicReport.getTzIn15Min()).sportType(sportBasicReport.getSportType()).fileType(2).version(1).build();
        uuf.c(FitnessFileUtils.getFDSDataFile(this.d, str, fitnessDataIdBuild), fitnessDataIdBuild, listC);
        tmp.a(this.d, strX);
    }

    public final void p(SportBasicReport sportBasicReport, ExerciseRecord exerciseRecord) {
        String strR = exerciseRecord.R();
        if (TextUtils.isEmpty(strR)) {
            return;
        }
        PressureSegment pressureFile = PressureFileUtils.readPressureFile(this.d, strR);
        FitnessLogUtils.i("DB_Trans", "PressureSegment = " + pressureFile);
        if (pressureFile != null) {
            sportBasicReport.setRiseHeight(Float.valueOf(pressureFile.getTotalUpAltitude()));
            sportBasicReport.setFallHeight(Float.valueOf(pressureFile.getTotalDownAltitude()));
        }
        PressureFileUtils.deletePressureFile(this.d, strR);
    }

    public final boolean q(SupportSQLiteDatabase supportSQLiteDatabase) throws Throwable {
        kg8 kg8VarH = HealthExerciseDatabase.i(this.d).h();
        TimeInfo timeInfoA = kg8VarH.a();
        long minTime = timeInfoA.getMinTime();
        if (minTime <= 0) {
            FitnessLogUtils.i("DB_Trans", "ExerciseRecord table is empty");
            return true;
        }
        this.j.setMinTimestamp(minTime);
        this.j.setMaxTimestamp(timeInfoA.getMaxTime());
        this.f.setTimeInMillis(System.currentTimeMillis());
        this.f.add(5, 1);
        TimeUtils.setToZeroOClock(this.f);
        long timeInMillis = this.f.getTimeInMillis();
        long j = timeInMillis - frc.f18124b;
        int size = 0;
        while (true) {
            if (j < minTime) {
                j = minTime;
            }
            try {
                List<ExerciseRecord> listB = kg8VarH.b(j, timeInMillis);
                a(supportSQLiteDatabase, listB);
                kg8VarH.delete(listB);
                size += listB.size();
                if (j == minTime) {
                    FitnessLogUtils.i("DB_Trans", "Exercise convert ExerciseRecord size = " + size);
                    return true;
                }
                timeInMillis = j;
                j -= frc.f18124b;
            } catch (Exception e) {
                FitnessLogUtils.e("DB_Trans", "Exercise transExerciseRecord error: " + e.getMessage());
                return false;
            }
        }
    }

    public final boolean r(SupportSQLiteDatabase supportSQLiteDatabase) {
        seo seoVarJ = HealthExerciseDatabase.i(this.d).j();
        TimeInfo timeInfoA = seoVarJ.a();
        long minTime = timeInfoA.getMinTime();
        if (minTime <= 0) {
            FitnessLogUtils.i("DB_Trans", "Record_Step table is empty");
            return true;
        }
        this.j.setMinTimestamp(minTime);
        this.j.setMaxTimestamp(timeInfoA.getMaxTime());
        this.f.setTimeInMillis(System.currentTimeMillis());
        this.f.add(5, 1);
        TimeUtils.setToZeroOClock(this.f);
        long timeInMillis = this.f.getTimeInMillis();
        long j = timeInMillis - frc.f18124b;
        long j2 = timeInMillis;
        int size = 0;
        while (true) {
            if (j < minTime) {
                j = minTime;
            }
            try {
                List<b2c> listB = seoVarJ.b(j, j2);
                long j3 = j;
                b(supportSQLiteDatabase, j, j2, listB);
                seoVarJ.delete(listB);
                size += listB.size();
                if (j3 == minTime) {
                    FitnessLogUtils.i("DB_Trans", "Exercise convert StepRecord size = " + size);
                    return true;
                }
                j = j3 - frc.f18124b;
                j2 = j3;
            } catch (Exception e) {
                FitnessLogUtils.e("DB_Trans", "Exercise transStepRerecord error:" + e.getMessage());
                return false;
            }
        }
    }
}
