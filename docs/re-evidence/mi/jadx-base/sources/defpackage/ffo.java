package defpackage;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.exercise.ExerciseDatabase;
import com.xiaomi.fitness.migration.exercise.entity.StepDetail;
import com.xiaomi.fitness.migration.exercise.transformation.StepItemInserter;
import java.io.File;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class ffo implements frc {
    public Context c;
    public String d;
    public Calendar e;
    public final MigrationManager f;
    public final String g;

    public ffo(Context context) {
        Objects.requireNonNull(context);
        this.c = context;
        this.d = FileUtils.getDatabaseDir(context).getAbsolutePath();
        this.e = Calendar.getInstance();
        MigrationManager companion = MigrationManager.INSTANCE.getInstance();
        this.f = companion;
        this.g = companion.requestPhoneSid();
    }

    public final void a(SupportSQLiteDatabase supportSQLiteDatabase, long j, long j2, List<StepDetail> list) {
        if (supportSQLiteDatabase == null || list == null || list.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StepDetail stepDetail : list) {
            linkedList.add(new b2c(stepDetail.d(), stepDetail.c(), stepDetail.a()));
        }
        StepItemInserter.INSTANCE.insertStepItemToDB(j, j2, linkedList);
    }

    public final boolean b(SupportSQLiteDatabase supportSQLiteDatabase) {
        ydo ydoVarH = ExerciseDatabase.g(this.c).h();
        TimeInfo timeInfoA = ydoVarH.a();
        long minTime = timeInfoA.getMinTime();
        if (minTime <= 0) {
            FitnessLogUtils.i("DB_Trans", "exercise db is empty");
            return true;
        }
        this.f.setMinTimestamp(minTime);
        this.f.setMaxTimestamp(timeInfoA.getMaxTime());
        this.e.add(5, 1);
        TimeUtils.setToZeroOClock(this.e);
        long timeInMillis = this.e.getTimeInMillis();
        long j = timeInMillis - frc.f18124b;
        long j2 = timeInMillis;
        int size = 0;
        while (true) {
            if (j < minTime) {
                j = minTime;
            }
            try {
                List<StepDetail> listB = ydoVarH.b(j, j2);
                long j3 = j;
                a(supportSQLiteDatabase, j, j2, listB);
                ydoVarH.delete(listB);
                size += listB.size();
                if (j3 == minTime) {
                    FitnessLogUtils.d("DB_Trans", "StepRecord migration，size = " + size);
                    return true;
                }
                j = j3 - frc.f18124b;
                j2 = j3;
            } catch (Exception e) {
                FitnessLogUtils.e("DB_Trans", "StepRecord migration error:" + e.getMessage());
                return false;
            }
        }
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = this.d + File.separator + "exercise";
        if (FileUtils.isFileExists(str) && b(supportSQLiteDatabase)) {
            deleteDbFile(str);
        }
        FitnessLogUtils.i("DB_Trans", "StepRecord migration finished");
    }
}
