package services.reminder.data.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.bjk;
import defpackage.cjk;
import defpackage.mjk;
import defpackage.njk;
import defpackage.owg;
import defpackage.pwg;
import defpackage.qwg;

/* JADX INFO: loaded from: classes3.dex */
@TypeConverters({pwg.class})
@Database(entities = {mjk.class, owg.class, bjk.class}, exportSchema = false, version = 7)
public abstract class ReminderDB extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Migration f33576a = new a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Migration f33577b = new b(2, 3);
    public static final Migration c = new c(3, 4);
    public static final Migration d = new d(4, 5);
    public static final Migration e = new e(5, 6);
    public static final Migration f = new f(6, 7);
    public static ReminderDB g;

    public class a extends Migration {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE reminder ADD COLUMN remind_interval INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE reminder ADD COLUMN last_remind_time INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN small_icon INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class b extends Migration {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN icon INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class c extends Migration {
        public c(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN importance INTEGER NOT NULL DEFAULT 3");
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN delete_intent_uri TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN notify_id INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class d extends Migration {
        public d(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN vibration_pattern TEXT");
        }
    }

    public class e extends Migration {
        public e(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN message_producer TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN template INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN big_pic_url TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN actions TEXT");
        }
    }

    public class f extends Migration {
        public f(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS reminder_notice_mapping('notice_id' TEXT PRIMARY KEY NOT NULL,'remind_id' TEXT NOT NULL,'last_notice_time' INTEGER NOT NULL,'display_duration' INTEGER NOT NULL,'notification_id' INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("ALTER TABLE notice ADD COLUMN group_key TEXT");
        }
    }

    public static ReminderDB g(Context context) {
        synchronized (ReminderDB.class) {
            try {
                if (g == null) {
                    g = (ReminderDB) Room.databaseBuilder(UIUtils.getSafeContext(context), ReminderDB.class, "reminder_db").addMigrations(f33576a, f33577b, c, d, e, f).setQueryExecutor(ExecutorHelper.getBackgroundPool()).build();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g;
    }

    public abstract cjk h();

    public abstract qwg i();

    public abstract njk j();
}
