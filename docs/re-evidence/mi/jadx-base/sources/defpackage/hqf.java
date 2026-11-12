package defpackage;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.di.FitnessDataSingleModuleKt;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthStatus;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.menstruation.HealthMenstruationDatabase;
import com.xiaomi.fitness.migration.menstruation.v0.MenstruationDatabase;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class hqf implements frc {
    public final Context c;
    public Calendar d = Calendar.getInstance();
    public final MigrationManager e = MigrationManager.INSTANCE.getInstance();

    public hqf(Context context) {
        this.c = context;
    }

    private void a(SupportSQLiteDatabase supportSQLiteDatabase, List<WomenHealthStatus> list) {
        if (supportSQLiteDatabase == null || list == null || list.isEmpty()) {
            return;
        }
        Logger.i("MenstruationTransformation", "batchInsert list:" + Arrays.toString(list.toArray()));
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordFemaleHealthStatus("xiaomiwear_app_manually", this.e.getCurTimeZoneOffsetInSecond(), list);
    }

    public final List<WomenHealthStatus> b(List<zpf> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        for (zpf zpfVar : list) {
            int iF = f(zpfVar.f41550b);
            if (iF >= 0) {
                linkedList.add(new WomenHealthStatus(TimeUnit.MILLISECONDS.toSeconds(zpfVar.f41549a), iF, 0L));
            }
        }
        return linkedList;
    }

    public final List<WomenHealthStatus> c(List<aqf> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        for (aqf aqfVar : list) {
            int iF = f(aqfVar.C());
            if (iF >= 0) {
                linkedList.add(new WomenHealthStatus(TimeUnit.MILLISECONDS.toSeconds(aqfVar.A()), iF, 0L));
            }
        }
        return linkedList;
    }

    public final boolean d(SupportSQLiteDatabase supportSQLiteDatabase) {
        MenstruationDatabase menstruationDatabaseG = MenstruationDatabase.g(this.c);
        if (menstruationDatabaseG == null) {
            return false;
        }
        upf upfVarI = menstruationDatabaseG.i();
        long jB = upfVarI.b();
        if (jB <= 0) {
            return true;
        }
        this.d.setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(this.d);
        long timeInMillis = this.d.getTimeInMillis();
        long j = timeInMillis - frc.f18124b;
        while (true) {
            if (j < jB) {
                j = jB;
            }
            List<zpf> listA = upfVarI.a(j, timeInMillis);
            a(supportSQLiteDatabase, b(listA));
            upfVarI.delete(listA);
            if (j == jB) {
                return true;
            }
            timeInMillis = j;
            j -= frc.f18124b;
        }
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        Logger.i("MenstruationTransformation", "doTransformation..");
        String str = FileUtils.getDatabaseDir(this.c) + File.separator;
        String str2 = str + FitnessPersistKey.WomenHealthStatus;
        String str3 = str + "health_menstruate";
        if (FileUtils.isFileExists(str3)) {
            if (e(supportSQLiteDatabase)) {
                deleteDbFile(str3);
            }
        } else if (FileUtils.isFileExists(str2) && d(supportSQLiteDatabase)) {
            deleteDbFile(str2);
        }
        FitnessDataSingleModuleKt.getCurseRepo().migrateSettings();
        FitnessDataSingleModuleKt.getCurseRepo().aggregateData(true);
    }

    public final boolean e(SupportSQLiteDatabase supportSQLiteDatabase) {
        HealthMenstruationDatabase healthMenstruationDatabaseH = HealthMenstruationDatabase.h(this.c);
        if (healthMenstruationDatabaseH == null) {
            return false;
        }
        bqf bqfVarI = healthMenstruationDatabaseH.i();
        aqf aqfVarC = bqfVarI.c();
        FitnessLogUtils.i("DB_Trans", "Menstruation migration latest begin record:" + aqfVarC);
        if (aqfVarC != null && aqfVarC.A() > 0) {
            this.c.getSharedPreferences("pref:menstruation.cloud_pref", 0).edit().putLong("menstruation_latest_begin", aqfVarC.A()).apply();
        }
        TimeInfo timeInfoA = bqfVarI.a();
        long minTime = timeInfoA.getMinTime();
        if (minTime <= 0) {
            return true;
        }
        this.e.setMinTimestamp(minTime);
        this.e.setMaxTimestamp(timeInfoA.getMaxTime());
        this.d.setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(this.d);
        long timeInMillis = this.d.getTimeInMillis();
        long j = timeInMillis - frc.f18124b;
        while (true) {
            if (j < minTime) {
                j = minTime;
            }
            List<aqf> listB = bqfVarI.b(j, timeInMillis);
            a(supportSQLiteDatabase, c(listB));
            bqfVarI.delete(listB);
            if (j == minTime) {
                return true;
            }
            timeInMillis = j;
            j -= frc.f18124b;
        }
    }

    public final int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? -1 : 3;
        }
        return 2;
    }
}
