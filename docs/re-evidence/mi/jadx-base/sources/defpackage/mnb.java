package defpackage;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.HeadsetItem;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.hearing.headset.HealthHeadSetDatabase;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class mnb implements frc {
    public final Context c;
    public final MigrationManager d = MigrationManager.INSTANCE.getInstance();

    public mnb(Context context) {
        this.c = context;
    }

    private boolean b(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (HealthHeadSetDatabase.i(this.c) == null) {
            FitnessLogUtils.i("DB_Trans", "HealthHeadSetDatabase instance is null: ignore");
            return true;
        }
        slb slbVarH = HealthHeadSetDatabase.i(this.c).h();
        if (slbVarH.a().getMinTime() <= 0) {
            return true;
        }
        int size = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            List<xlb> listB = slbVarH.b(j, 200);
            if (listB == null || listB.isEmpty()) {
                break;
            }
            size += listB.size();
            long jB = listB.get(listB.size() - 1).B();
            a(listB);
            slbVarH.delete(listB);
            j = jB;
        }
        FitnessLogUtils.i("DB_Trans", "HeadSetDatabase migration finished,cnt = " + size);
        return true;
    }

    public final void a(List<xlb> list) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            xlb xlbVar = list.get(i);
            linkedList.add(new HeadsetItem(xlbVar.A() / 1000, xlbVar.B() / 1000, xlbVar.F()));
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordHeadset(this.d.requestPhoneSid(), this.d.getCurTimeZoneOffsetInSecond(), (HeadsetItem[]) linkedList.toArray(new HeadsetItem[0]));
    }

    @Override // defpackage.frc
    public void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str = FileUtils.getDatabaseDir(this.c) + File.separator + "health_head_set";
        if (FileUtils.isFileExists(str) && b(supportSQLiteDatabase)) {
            deleteDbFile(str);
        }
        FitnessLogUtils.i("DB_Trans", "HeadsetDatabase migration finished");
    }
}
