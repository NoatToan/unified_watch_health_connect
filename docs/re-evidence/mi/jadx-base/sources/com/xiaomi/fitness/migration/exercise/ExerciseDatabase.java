package com.xiaomi.fitness.migration.exercise;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.migration.exercise.entity.StepDetail;
import defpackage.hg8;
import defpackage.ydo;

/* JADX INFO: loaded from: classes9.dex */
@Database(entities = {StepDetail.class, hg8.class}, version = 3)
public abstract class ExerciseDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Migration f12409a = new a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Migration f12410b = new b(2, 3);
    public static ExerciseDatabase c;

    public class a extends Migration {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    public class b extends Migration {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE step_detail ADD COLUMN deleted INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE step_detail ADD COLUMN origin TEXT");
        }
    }

    public static class c extends RoomDatabase.Callback {
        @Override // androidx.room.RoomDatabase.Callback
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            super.onCreate(supportSQLiteDatabase);
            supportSQLiteDatabase.execSQL("insert into goal (julianDay,recordTime,type,value) values (1,1,0,6000)");
        }

        public c() {
        }
    }

    public static ExerciseDatabase g(Context context) {
        synchronized (ExerciseDatabase.class) {
            try {
                if (c == null) {
                    c = (ExerciseDatabase) Room.databaseBuilder(UIUtils.getSafeContext(context), ExerciseDatabase.class, "exercise").addCallback(new c()).addMigrations(f12409a).addMigrations(f12410b).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public abstract ydo h();
}
