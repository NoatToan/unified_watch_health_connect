package defpackage;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.stand.HealthStandDatabase;
import java.io.File;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class bbo implements frc {
    public final Context c;
    public final Calendar d = Calendar.getInstance();
    public final MigrationManager e;
    public final String f;
    public final List<ValidStandItem> g;
    public final List<ValidStandItem> h;

    public bbo(Context context) {
        this.c = context;
        MigrationManager companion = MigrationManager.INSTANCE.getInstance();
        this.e = companion;
        this.f = companion.requestPhoneSid();
        this.g = new LinkedList();
        this.h = new LinkedList();
    }

    private void a(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase == null) {
            return;
        }
        FitnessDataRecorderImpl.Companion companion = FitnessDataRecorderImpl.INSTANCE;
        companion.getInstance().recordValidStand("xiaomiwear_app_manually", this.e.getCurTimeZoneOffsetInSecond(), this.g);
        companion.getInstance().recordValidStand(this.f, this.e.getCurTimeZoneOffsetInSecond(), this.h);
    }

    private boolean c(SupportSQLiteDatabase supportSQLiteDatabase) {
        jao jaoVarI = HealthStandDatabase.h(this.c).i();
        TimeInfo timeInfoA = jaoVarI.a();
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
        long j = timeInMillis - frc.f18124b;
        int size = 0;
        while (true) {
            if (j < minTime) {
                j = minTime;
            }
            try {
                List<iao> listQueryStandRecords = jaoVarI.queryStandRecords(j, timeInMillis);
                size += listQueryStandRecords.size();
                b(listQueryStandRecords);
                a(supportSQLiteDatabase);
                jaoVarI.delete(listQueryStandRecords);
                if (j == minTime) {
                    FitnessLogUtils.i("DB_Trans", "Stand migration success, size = " + size);
                    return true;
                }
                timeInMillis = j;
                j -= frc.f18124b;
            } catch (Exception e) {
                FitnessLogUtils.e("DB_Trans", "Stand migration error:" + e.getMessage());
                return false;
            }
        }
    }

    public final void b(List<iao> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (iao iaoVar : list) {
            this.d.setTimeInMillis(iaoVar.j());
            this.d.set(12, 0);
            this.d.set(13, 0);
            this.d.set(14, 0);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.d.getTimeInMillis());
            long seconds2 = TimeUnit.HOURS.toSeconds(1L) + seconds;
            String strI = iaoVar.i();
            ValidStandItem validStandItem = new ValidStandItem(seconds, seconds2);
            if (ep5.b(strI)) {
                this.g.add(validStandItem);
            } else if (ep5.d(strI)) {
                this.h.add(validStandItem);
            }
        }
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = FileUtils.getDatabaseDir(this.c) + File.separator + "health_stand";
        if (FileUtils.isFileExists(str) && c(supportSQLiteDatabase)) {
            deleteDbFile(str);
        }
        FitnessLogUtils.i("DB_Trans", "Stand migration finished");
    }
}
