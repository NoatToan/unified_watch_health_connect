package com.xiaomi.fitness.migration.heartrate;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.tencent.wcdb.room.db.WCDBOpenHelperFactory;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.f6c;
import defpackage.fhe;
import defpackage.iw3;
import defpackage.ow3;
import defpackage.q5c;

/* JADX INFO: loaded from: classes9.dex */
@TypeConverters({fhe.class})
@Database(entities = {f6c.class}, version = 2)
public abstract class HealthHeartRateDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Migration f12427a = new a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HealthHeartRateDatabase f12428b;

    public class a extends Migration {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE heart_rate ADD COLUMN detect_type INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static HealthHeartRateDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthHeartRateDatabase) Room.databaseBuilder(context, HealthHeartRateDatabase.class, "health_heart_rate").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(131789720).getBytes()).a("2020-07-14".getBytes()))).addMigrations(f12427a).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            throw new IllegalStateException("create health heart rate database fail", e);
        }
    }

    public static HealthHeartRateDatabase i(Context context) {
        HealthHeartRateDatabase healthHeartRateDatabase = f12428b;
        if (healthHeartRateDatabase != null) {
            return healthHeartRateDatabase;
        }
        synchronized (HealthHeartRateDatabase.class) {
            try {
                HealthHeartRateDatabase healthHeartRateDatabase2 = f12428b;
                if (healthHeartRateDatabase2 != null) {
                    return healthHeartRateDatabase2;
                }
                HealthHeartRateDatabase healthHeartRateDatabaseG = g(UIUtils.getSafeContext(context));
                f12428b = healthHeartRateDatabaseG;
                return healthHeartRateDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract q5c h();
}
