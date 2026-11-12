package com.xiaomi.fitness.migration.menstruation.v0;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.tencent.wcdb.room.db.WCDBOpenHelperFactory;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.ow3;
import defpackage.upf;
import defpackage.zpf;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {zpf.class}, version = 1)
public abstract class MenstruationDatabase extends RoomDatabase {
    public static MenstruationDatabase g(Context context) {
        synchronized (MenstruationDatabase.class) {
            try {
                if (!context.getDatabasePath(FitnessPersistKey.WomenHealthStatus).exists()) {
                    return null;
                }
                try {
                    MenstruationDatabase menstruationDatabaseH = h(UIUtils.getSafeContext(context));
                    menstruationDatabaseH.getOpenHelper().getReadableDatabase();
                    return menstruationDatabaseH;
                } catch (Exception e) {
                    context.deleteDatabase(FitnessPersistKey.WomenHealthStatus);
                    FitnessLogUtils.e("MenstruationDatabase", "get open db fail, create new: %s", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static MenstruationDatabase h(Context context) {
        try {
            return (MenstruationDatabase) Room.databaseBuilder(context, MenstruationDatabase.class, FitnessPersistKey.WomenHealthStatus).openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().b(String.valueOf(1116232894).getBytes()).a("passphrase_2019713".getBytes()))).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            throw new IllegalStateException("create menstruation db fail", e);
        }
    }

    public abstract upf i();
}
