package com.xiaomi.fitness.migration.exercise;

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
import com.xiaomi.fitness.migration.exercise.entity.ExerciseRecord;
import defpackage.b2c;
import defpackage.iw3;
import defpackage.kg8;
import defpackage.ow3;
import defpackage.seo;
import defpackage.vcd;

/* JADX INFO: loaded from: classes9.dex */
@TypeConverters({vcd.class})
@Database(entities = {b2c.class, ExerciseRecord.class}, version = 5)
public abstract class HealthExerciseDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Migration f12412a = new a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Migration f12413b = new b(2, 3);
    public static final Migration c = new c(3, 4);
    public static final Migration d = new d(4, 5);
    public static HealthExerciseDatabase e;

    public class a extends Migration {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS record_exercise('id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,'sports_type' TEXT,'begin_time' INTEGER NOT NULL,'end_time' INTEGER NOT NULL,'duration' INTEGER NOT NULL,'distance' INTEGER NOT NULL,'total_consume' INTEGER NOT NULL,'calories' INTEGER NOT NULL,'detail' TEXT,'intensity' TEXT,'device_id' TEXT,'device_type' TEXT,'device_model' TEXT,'data_type' TEXT,'timestamp' INTEGER DEFAULT 0 NOT NULL,'update_time' INTEGER NOT NULL DEFAULT 0,'deleted' INTEGER NOT NULL DEFAULT 0)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX 'index_record_exercise_device_id_device_type_data_type_timestamp' ON 'record_exercise' ('device_id', 'device_type', 'data_type', 'timestamp')");
        }
    }

    public class b extends Migration {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE record_exercise ADD COLUMN track_filename TEXT");
        }
    }

    public class c extends Migration {
        public c(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE record_exercise ADD COLUMN source INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE record_exercise ADD COLUMN course_id INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class d extends Migration {
        public d(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE record_exercise ADD COLUMN pressure_filename TEXT");
        }
    }

    public static HealthExerciseDatabase g(Context context) {
        try {
            iw3.a(context);
            return (HealthExerciseDatabase) Room.databaseBuilder(context, HealthExerciseDatabase.class, "health_exercise").openHelperFactory(new WCDBOpenHelperFactory().passphrase(ow3.f().a(String.valueOf(2082319820).getBytes()).a("2019-12-29".getBytes()))).setQueryExecutor(ExecutorHelper.getBackgroundPool()).addMigrations(f12412a, f12413b, c, d).build();
        } catch (CipherException e2) {
            throw new IllegalStateException("create health sleep database fail", e2);
        }
    }

    public static HealthExerciseDatabase i(Context context) {
        HealthExerciseDatabase healthExerciseDatabase = e;
        if (healthExerciseDatabase != null) {
            return healthExerciseDatabase;
        }
        synchronized (HealthExerciseDatabase.class) {
            try {
                HealthExerciseDatabase healthExerciseDatabase2 = e;
                if (healthExerciseDatabase2 != null) {
                    return healthExerciseDatabase2;
                }
                HealthExerciseDatabase healthExerciseDatabaseG = g(UIUtils.getSafeContext(context));
                e = healthExerciseDatabaseG;
                return healthExerciseDatabaseG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract kg8 h();

    public abstract seo j();
}
