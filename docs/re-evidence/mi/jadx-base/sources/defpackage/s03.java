package defpackage;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.bloodpressure.HealthBloodPressureDatabase;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class s03 implements frc {
    public static final long f = TimeUnit.DAYS.toMillis(7);
    public final Context c;
    public final Calendar d = Calendar.getInstance();
    public final MigrationManager e = MigrationManager.INSTANCE.getInstance();

    public s03(Context context) {
        this.c = context;
    }

    public final void a(SupportSQLiteDatabase supportSQLiteDatabase, List<BloodPressureItem> list) {
        if (supportSQLiteDatabase == null || list == null || list.isEmpty()) {
            return;
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordBloodPressure("xiaomiwear_app_manually", this.e.getCurTimeZoneOffsetInSecond(), list);
    }

    public final List<BloodPressureItem> b(List<wz2> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        for (wz2 wz2Var : list) {
            linkedList.add(new BloodPressureItem(TimeUnit.MILLISECONDS.toSeconds(wz2Var.j()), wz2Var.A(), wz2Var.C()));
        }
        return linkedList;
    }

    public final boolean c(SupportSQLiteDatabase supportSQLiteDatabase) {
        az2 az2VarH = HealthBloodPressureDatabase.i(this.c).h();
        TimeInfo timeInfoA = az2VarH.a();
        long minTime = timeInfoA.getMinTime();
        if (minTime <= 0) {
            return true;
        }
        this.e.setMinTimestamp(minTime);
        this.e.setMaxTimestamp(timeInfoA.getMaxTime());
        this.d.setTimeInMillis(System.currentTimeMillis());
        this.d.add(5, 1);
        TimeUtils.setToZeroOClock(this.d);
        long timeInMillis = this.d.getTimeInMillis();
        long j = timeInMillis - f;
        int size = 0;
        while (true) {
            if (j < minTime) {
                j = minTime;
            }
            try {
                List<wz2> listB = az2VarH.b(j, timeInMillis);
                a(supportSQLiteDatabase, b(listB));
                az2VarH.delete(listB);
                size += listB.size();
                if (j == minTime) {
                    FitnessLogUtils.i("DB_Trans", "BloodPressure migration success, size = " + size);
                    return true;
                }
                timeInMillis = j;
                j -= f;
            } catch (Exception e) {
                FitnessLogUtils.e("DB_Trans", "BloodPressure migration error:" + e.getMessage());
                return false;
            }
        }
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = FileUtils.getDatabaseDir(this.c) + File.separator + "health_blood_pressure";
        if (FileUtils.isFileExists(str) && c(supportSQLiteDatabase)) {
            deleteDbFile(str);
        }
        FitnessLogUtils.i("DB_Trans", "BloodPressure migration finished");
    }
}
