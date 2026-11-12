package defpackage;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.hearing.noise.HealthNoiseDatabase;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class zvg implements frc {
    public final Context c;
    public final MigrationManager d = MigrationManager.INSTANCE.getInstance();

    public zvg(Context context) {
        this.c = context;
    }

    private void a(List<yvg> list) {
        LinkedList linkedList = new LinkedList();
        for (yvg yvgVar : list) {
            linkedList.add(new NoiseItem(yvgVar.j() / 1000, yvgVar.A()));
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordHeadsetNoise(this.d.requestPhoneSid(), this.d.getCurTimeZoneOffsetInSecond(), (NoiseItem[]) linkedList.toArray(new NoiseItem[0]));
    }

    private boolean b(SupportSQLiteDatabase supportSQLiteDatabase) {
        HealthNoiseDatabase healthNoiseDatabaseH = HealthNoiseDatabase.h(this.c);
        if (healthNoiseDatabaseH == null) {
            return true;
        }
        tvg tvgVarI = healthNoiseDatabaseH.i();
        if (tvgVarI.a().getMinTime() <= 0) {
            return true;
        }
        int size = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            List<yvg> listB = tvgVarI.b(j, 200);
            if (listB == null || listB.isEmpty()) {
                break;
            }
            size += listB.size();
            long j2 = listB.get(listB.size() - 1).j();
            a(listB);
            tvgVarI.delete(listB);
            j = j2;
        }
        FitnessLogUtils.i("DB_Trans", "HealthNoiseDatabase migration finished,cnt = " + size);
        return true;
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = FileUtils.getDatabaseDir(this.c) + File.separator + "health_noise";
        if (FileUtils.isFileExists(str) && b(supportSQLiteDatabase)) {
            deleteDbFile(str);
        }
        FitnessLogUtils.i("DB_Trans", "HealthNoiseDatabase migration finished");
    }
}
