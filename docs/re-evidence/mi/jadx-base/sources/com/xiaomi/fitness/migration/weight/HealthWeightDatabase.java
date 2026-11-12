package com.xiaomi.fitness.migration.weight;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.tencent.wcdb.room.db.WCDBOpenHelperFactory;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.d4c;
import defpackage.iw3;
import defpackage.ow3;
import defpackage.u3c;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {d4c.class}, version = 2)
public abstract class HealthWeightDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Migration f12443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HealthWeightDatabase f12444b;
    public static Migration[] c;

    public class a extends Migration {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE record_weight ADD COLUMN protein_rate FLOAT NOT NULL DEFAULT 0");
        }
    }

    static {
        a aVar = new a(1, 2);
        f12443a = aVar;
        c = new Migration[]{aVar};
    }

    public static HealthWeightDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthWeightDatabase) Room.databaseBuilder(context, HealthWeightDatabase.class, "health_weight").addMigrations(c).openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(2082319820).getBytes()).a("2019-12-29".getBytes()))).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            throw new IllegalStateException("create health weight database fail", e);
        }
    }

    public static HealthWeightDatabase h(Context context) {
        HealthWeightDatabase healthWeightDatabase = f12444b;
        if (healthWeightDatabase != null) {
            return healthWeightDatabase;
        }
        synchronized (HealthWeightDatabase.class) {
            try {
                HealthWeightDatabase healthWeightDatabase2 = f12444b;
                if (healthWeightDatabase2 != null) {
                    return healthWeightDatabase2;
                }
                HealthWeightDatabase healthWeightDatabaseG = g(UIUtils.getSafeContext(context));
                f12444b = healthWeightDatabaseG;
                return healthWeightDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract u3c i();
}
