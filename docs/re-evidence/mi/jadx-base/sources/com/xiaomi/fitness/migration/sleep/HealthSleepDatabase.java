package com.xiaomi.fitness.migration.sleep;

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
import defpackage.iw3;
import defpackage.lm1;
import defpackage.ow3;
import defpackage.q3n;
import defpackage.szm;
import defpackage.u3n;
import defpackage.yzm;

/* JADX INFO: loaded from: classes9.dex */
@TypeConverters({lm1.class})
@Database(entities = {yzm.class, q3n.class}, version = 3)
public abstract class HealthSleepDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Migration f12435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Migration f12436b;
    public static HealthSleepDatabase c;
    public static Migration[] d;

    public class a extends Migration {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS snore_report('snore_duration' INTEGER NOT NULL,'snore_frequency' INTEGER NOT NULL,'snore_list' TEXT,'max_noise_decibel' REAL NOT NULL,'snore_times' INTEGER NOT NULL,'max_snore_decibel' REAL NOT NULL,'noise_list' TEXT,'dream_talk_list' TEXT,'id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,'device_id' TEXT,'device_type' TEXT,'device_model' TEXT,'data_type' TEXT,'timestamp' INTEGER NOT NULL DEFAULT 0,'update_time' INTEGER NOT NULL DEFAULT 0,'deleted' INTEGER NOT NULL DEFAULT 0)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX 'index_snore_report_device_id_device_type_data_type_timestamp' ON 'snore_report' ('device_id', 'device_type', 'data_type', 'timestamp')");
        }
    }

    public class b extends Migration {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE record_sleep ADD COLUMN segEnd INTEGER NOT NULL DEFAULT 0");
        }
    }

    static {
        a aVar = new a(1, 2);
        f12435a = aVar;
        b bVar = new b(2, 3);
        f12436b = bVar;
        d = new Migration[]{aVar, bVar};
    }

    public static HealthSleepDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthSleepDatabase) Room.databaseBuilder(context, HealthSleepDatabase.class, "health_sleep").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(2082319789).getBytes()).a("2019-12-19".getBytes()))).addMigrations(d).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
        } catch (CipherException e) {
            throw new IllegalStateException("create health sleep database fail", e);
        }
    }

    public static HealthSleepDatabase h(Context context) {
        HealthSleepDatabase healthSleepDatabase = c;
        if (healthSleepDatabase != null) {
            return healthSleepDatabase;
        }
        synchronized (HealthSleepDatabase.class) {
            try {
                HealthSleepDatabase healthSleepDatabase2 = c;
                if (healthSleepDatabase2 != null) {
                    return healthSleepDatabase2;
                }
                HealthSleepDatabase healthSleepDatabaseG = g(context);
                c = healthSleepDatabaseG;
                return healthSleepDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract u3n i();

    public abstract szm j();
}
