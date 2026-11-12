package services.reminder.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.facebook.react.modules.appstate.AppStateModule;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckSettingConfig;
import defpackage.cjk;
import defpackage.gjk;
import defpackage.njk;
import defpackage.qwg;
import defpackage.uwg;
import defpackage.yjk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ReminderDB_Impl extends ReminderDB {
    public volatile njk h;
    public volatile qwg i;
    public volatile cjk j;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `reminder` (`reminder_id` TEXT NOT NULL, `type` INTEGER NOT NULL, `event_value` TEXT, `timed_value` INTEGER NOT NULL, `remind_cb` TEXT, `def_notice_id` TEXT, `active` INTEGER NOT NULL, `remind_interval` INTEGER NOT NULL, `last_remind_time` INTEGER NOT NULL, PRIMARY KEY(`reminder_id`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `notice` (`template` INTEGER NOT NULL, `notice_id` TEXT NOT NULL, `notify_id` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `importance` INTEGER NOT NULL, `title` TEXT, `content` TEXT, `big_pic_url` TEXT, `intent_uri` TEXT, `delete_intent_uri` TEXT, `small_icon` INTEGER NOT NULL, `icon` INTEGER NOT NULL, `vibration_pattern` TEXT, `message_producer` TEXT, `group_key` TEXT, `actions` TEXT, `channel_id` TEXT, `channel_name` TEXT, PRIMARY KEY(`notice_id`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `reminder_notice_mapping` (`notice_id` TEXT NOT NULL, `remind_id` TEXT NOT NULL, `last_notice_time` INTEGER NOT NULL, `display_duration` INTEGER NOT NULL, `notification_id` INTEGER NOT NULL, PRIMARY KEY(`notice_id`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0bc551bf24d57d261601d1921dec8223')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `reminder`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `notice`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `reminder_notice_mapping`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            ReminderDB_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(SQLiteConnection sQLiteConnection) {
            DBUtil.dropFtsSyncTriggers(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
            HashMap map = new HashMap(9);
            map.put("reminder_id", new TableInfo.Column("reminder_id", "TEXT", true, 1, null, 1));
            map.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
            map.put("event_value", new TableInfo.Column("event_value", "TEXT", false, 0, null, 1));
            map.put("timed_value", new TableInfo.Column("timed_value", "INTEGER", true, 0, null, 1));
            map.put("remind_cb", new TableInfo.Column("remind_cb", "TEXT", false, 0, null, 1));
            map.put("def_notice_id", new TableInfo.Column("def_notice_id", "TEXT", false, 0, null, 1));
            map.put(AppStateModule.APP_STATE_ACTIVE, new TableInfo.Column(AppStateModule.APP_STATE_ACTIVE, "INTEGER", true, 0, null, 1));
            map.put("remind_interval", new TableInfo.Column("remind_interval", "INTEGER", true, 0, null, 1));
            map.put("last_remind_time", new TableInfo.Column("last_remind_time", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo(HealthCheckSettingConfig.KEY_REMINDER, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, HealthCheckSettingConfig.KEY_REMINDER);
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "reminder(services.reminder.data.entity.Reminder).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(18);
            map2.put("template", new TableInfo.Column("template", "INTEGER", true, 0, null, 1));
            map2.put("notice_id", new TableInfo.Column("notice_id", "TEXT", true, 1, null, 1));
            map2.put("notify_id", new TableInfo.Column("notify_id", "INTEGER", true, 0, null, 1));
            map2.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, null, 1));
            map2.put("importance", new TableInfo.Column("importance", "INTEGER", true, 0, null, 1));
            map2.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
            map2.put(MiuiCursorConstants.CONTENT, new TableInfo.Column(MiuiCursorConstants.CONTENT, "TEXT", false, 0, null, 1));
            map2.put("big_pic_url", new TableInfo.Column("big_pic_url", "TEXT", false, 0, null, 1));
            map2.put("intent_uri", new TableInfo.Column("intent_uri", "TEXT", false, 0, null, 1));
            map2.put("delete_intent_uri", new TableInfo.Column("delete_intent_uri", "TEXT", false, 0, null, 1));
            map2.put("small_icon", new TableInfo.Column("small_icon", "INTEGER", true, 0, null, 1));
            map2.put("icon", new TableInfo.Column("icon", "INTEGER", true, 0, null, 1));
            map2.put("vibration_pattern", new TableInfo.Column("vibration_pattern", "TEXT", false, 0, null, 1));
            map2.put("message_producer", new TableInfo.Column("message_producer", "TEXT", false, 0, null, 1));
            map2.put("group_key", new TableInfo.Column("group_key", "TEXT", false, 0, null, 1));
            map2.put("actions", new TableInfo.Column("actions", "TEXT", false, 0, null, 1));
            map2.put("channel_id", new TableInfo.Column("channel_id", "TEXT", false, 0, null, 1));
            map2.put("channel_name", new TableInfo.Column("channel_name", "TEXT", false, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("notice", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "notice");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(false, "notice(services.reminder.data.entity.Notice).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(5);
            map3.put("notice_id", new TableInfo.Column("notice_id", "TEXT", true, 1, null, 1));
            map3.put("remind_id", new TableInfo.Column("remind_id", "TEXT", true, 0, null, 1));
            map3.put("last_notice_time", new TableInfo.Column("last_notice_time", "INTEGER", true, 0, null, 1));
            map3.put("display_duration", new TableInfo.Column("display_duration", "INTEGER", true, 0, null, 1));
            map3.put("notification_id", new TableInfo.Column("notification_id", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("reminder_notice_mapping", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "reminder_notice_mapping");
            if (tableInfo5.equals(tableInfo6)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "reminder_notice_mapping(services.reminder.data.entity.RemindNoticeMapping).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, HealthCheckSettingConfig.KEY_REMINDER, "notice", "reminder_notice_mapping");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), HealthCheckSettingConfig.KEY_REMINDER, "notice", "reminder_notice_mapping");
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(njk.class, yjk.u());
        map.put(qwg.class, uwg.g());
        map.put(cjk.class, gjk.g());
        return map;
    }

    @Override // services.reminder.data.db.ReminderDB
    public cjk h() {
        cjk cjkVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            try {
                if (this.j == null) {
                    this.j = new gjk(this);
                }
                cjkVar = this.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cjkVar;
    }

    @Override // services.reminder.data.db.ReminderDB
    public qwg i() {
        qwg qwgVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            try {
                if (this.i == null) {
                    this.i = new uwg(this);
                }
                qwgVar = this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qwgVar;
    }

    @Override // services.reminder.data.db.ReminderDB
    public njk j() {
        njk njkVar;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            try {
                if (this.h == null) {
                    this.h = new yjk(this);
                }
                njkVar = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return njkVar;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(7, "0bc551bf24d57d261601d1921dec8223", "e6131942d660a1aba74f4076b03ff333");
    }
}
