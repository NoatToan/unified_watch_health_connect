package defpackage;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.heartrate.HealthHeartRateDatabase;
import java.io.File;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class q6c implements frc {
    public final Context c;
    public final Calendar d = Calendar.getInstance();
    public final List<HrItem> e;
    public final List<HrItem> f;
    public final MigrationManager g;
    public final String h;

    public q6c(Context context) {
        this.c = context;
        MigrationManager companion = MigrationManager.INSTANCE.getInstance();
        this.g = companion;
        this.h = companion.requestPhoneSid();
        this.e = new LinkedList();
        this.f = new LinkedList();
    }

    public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase == null) {
            return;
        }
        FitnessDataRecorderImpl.Companion companion = FitnessDataRecorderImpl.INSTANCE;
        companion.getInstance().recordManualHr("xiaomiwear_app_manually", this.g.getCurTimeZoneOffsetInSecond(), this.e);
        companion.getInstance().recordManualHr(this.h, this.g.getCurTimeZoneOffsetInSecond(), this.f);
        this.e.clear();
        this.f.clear();
    }

    public final void b(List<f6c> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (f6c f6cVar : list) {
            HrItem hrItem = new HrItem(TimeUnit.MILLISECONDS.toSeconds(f6cVar.j()), f6cVar.A());
            String strI = f6cVar.i();
            if (ep5.a(strI)) {
                this.e.add(hrItem);
            } else if (ep5.d(strI)) {
                this.f.add(hrItem);
            }
        }
    }

    public final boolean c(SupportSQLiteDatabase supportSQLiteDatabase) {
        q5c q5cVarH = HealthHeartRateDatabase.i(this.c).h();
        TimeInfo timeInfoA = q5cVarH.a();
        long minTime = timeInfoA.getMinTime();
        if (minTime <= 0) {
            return true;
        }
        this.g.setMinTimestamp(minTime);
        this.g.setMaxTimestamp(timeInfoA.getMaxTime());
        this.d.setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(this.d);
        this.d.add(5, 1);
        long timeInMillis = this.d.getTimeInMillis();
        long j = timeInMillis - frc.f18124b;
        int size = 0;
        while (true) {
            try {
                this.e.clear();
                this.f.clear();
                if (j <= minTime) {
                    j = minTime;
                }
                List<f6c> listB = q5cVarH.b(j, timeInMillis);
                b(listB);
                a(supportSQLiteDatabase);
                q5cVarH.delete(listB);
                size += listB.size();
                if (j == minTime) {
                    FitnessLogUtils.i("DB_Trans", "HeartRate transformation success, size = " + size);
                    return true;
                }
                timeInMillis = j;
                j -= frc.f18124b;
            } catch (Exception e) {
                FitnessLogUtils.e("DB_Trans", "HeartRate transform error：" + e.getMessage());
                return false;
            }
        }
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = FileUtils.getDatabaseDir(this.c) + File.separator + "health_heart_rate";
        if (FileUtils.isFileExists(str) && c(supportSQLiteDatabase)) {
            deleteDbFile(str);
        }
        FitnessLogUtils.i("DB_Trans", "HeartRate migration finished");
    }
}
