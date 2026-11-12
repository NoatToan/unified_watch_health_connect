package defpackage;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.weight.HealthWeightDatabase;
import com.xiaomi.fitness.migration.weight.v1.UserDatabase;
import com.xiaomi.fitness.migration.weight.v2.WeightDataDatabase;
import com.xiaomi.fitness.migration.weight.v2.WeightItemV2;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import java.io.File;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class qgr implements frc {
    public final Context c;
    public final Calendar d = Calendar.getInstance();
    public final MigrationManager e = MigrationManager.INSTANCE.getInstance();

    public qgr(Context context) {
        this.c = context;
    }

    private void a(SupportSQLiteDatabase supportSQLiteDatabase, List<d4c> list) {
        if (supportSQLiteDatabase == null || list == null || list.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (d4c d4cVar : list) {
            linkedList.add(new WeightItem(TimeUnit.MILLISECONDS.toSeconds(d4cVar.j()), d4cVar.X(), Float.valueOf(d4cVar.A()), Float.valueOf(d4cVar.F()), Float.valueOf(d4cVar.B()), Float.valueOf(d4cVar.C()), Integer.valueOf((int) d4cVar.L()), Float.valueOf(d4cVar.R()), Float.valueOf(d4cVar.V()), Float.valueOf(d4cVar.W())));
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordWeight("xiaomiwear_app_manually", this.e.getCurTimeZoneOffsetInSecond(), linkedList);
    }

    public final void b(List<xwf> list, float f) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        float f2 = f / 100.0f;
        for (xwf xwfVar : list) {
            linkedList.add(new WeightItem(TimeUnit.MILLISECONDS.toSeconds(xwfVar.d()), xwfVar.a(), Float.valueOf(xwfVar.a() / (f2 * f2))));
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordWeight("xiaomiwear_app_manually", this.e.getCurTimeZoneOffsetInSecond(), linkedList);
    }

    public final void c(List<WeightItemV2> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (WeightItemV2 weightItemV2 : list) {
            linkedList.add(new WeightItem(TimeUnit.MILLISECONDS.toSeconds(weightItemV2.f()), weightItemV2.f36469a, Float.valueOf(weightItemV2.d())));
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordWeight("xiaomiwear_app_manually", this.e.getCurTimeZoneOffsetInSecond(), linkedList);
    }

    public final boolean d(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase == null) {
            return false;
        }
        yeq yeqVarI = UserDatabase.h(this.c).i();
        vuf vufVarB = yeqVarI.b();
        b(yeqVarI.a(), (vufVarB == null || !vufVarB.c()) ? 170.0f : vufVarB.a());
        return true;
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String absolutePath = FileUtils.getDatabaseDir(this.c).getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        String str = File.separator;
        sb.append(str);
        sb.append("health_weight");
        String string = sb.toString();
        String str2 = absolutePath + str + "measure_data";
        String str3 = absolutePath + str + SceneRecogBroadcastReceiver.FROM_USER;
        if (FileUtils.isFileExists(string)) {
            if (f(supportSQLiteDatabase)) {
                deleteDbFile(string);
                deleteDbFile(str2);
                deleteDbFile(str3);
            }
        } else if (FileUtils.isFileExists(str2)) {
            if (e(supportSQLiteDatabase)) {
                deleteDbFile(str2);
                deleteDbFile(str3);
            }
        } else if (FileUtils.isFileExists(str3) && d(supportSQLiteDatabase)) {
            deleteDbFile(str3);
        }
        FitnessLogUtils.i("DB_Trans", "Weight migration finished");
    }

    public final boolean e(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase == null) {
            return false;
        }
        WeightDataDatabase weightDataDatabaseI = WeightDataDatabase.i(this.c);
        if (weightDataDatabaseI == null) {
            return true;
        }
        bfr bfrVarJ = weightDataDatabaseI.j();
        List<WeightItemV2> listA = bfrVarJ.a();
        c(listA);
        bfrVarJ.delete(listA);
        return true;
    }

    public final boolean f(SupportSQLiteDatabase supportSQLiteDatabase) {
        u3c u3cVarI = HealthWeightDatabase.h(this.c).i();
        TimeInfo timeInfoA = u3cVarI.a();
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
                List<d4c> listB = u3cVarI.b(j, timeInMillis);
                a(supportSQLiteDatabase, listB);
                u3cVarI.delete(listB);
                size += listB.size();
                if (j == minTime) {
                    FitnessLogUtils.i("DB_Trans", "Weight_V3 insert items, size = " + size);
                    return true;
                }
                timeInMillis = j;
                j -= frc.f18124b;
            } catch (Exception e) {
                FitnessLogUtils.e("DB_Trans", "Weight_V3 migration error:" + e.getMessage());
                return false;
            }
        }
    }
}
