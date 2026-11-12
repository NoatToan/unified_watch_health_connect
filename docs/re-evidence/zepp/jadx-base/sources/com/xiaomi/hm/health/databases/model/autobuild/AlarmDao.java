package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.databases.model.Alarm;
import io.flutter.plugins.firebase.crashlytics.Constants;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class AlarmDao extends AbstractDao<Alarm, Long> {
    public static final String TABLENAME = "ALARM";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Calendar = new Property(1, Long.class, "calendar", false, "CALENDAR");
        public static final Property Enabled = new Property(2, Boolean.class, Constants.ENABLED, false, "ENABLED");
        public static final Property IsUpdate = new Property(3, Boolean.class, "isUpdate", false, "IS_UPDATE");
        public static final Property MDays = new Property(4, Integer.class, "mDays", false, "M_DAYS");
        public static final Property MSmartWakeupDuration = new Property(5, Integer.class, "mSmartWakeupDuration", false, "M_SMART_WAKEUP_DURATION");
        public static final Property Visible = new Property(6, Boolean.class, "visible", false, "VISIBLE");
        public static final Property IsSmartWakeup = new Property(7, Boolean.class, "isSmartWakeup", false, "IS_SMART_WAKEUP");
        public static final Property Index = new Property(8, Integer.class, "index", false, "INDEX");
        public static final Property IsSmart = new Property(9, Boolean.class, "isSmart", false, "IS_SMART");
    }

    public AlarmDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ALARM\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"CALENDAR\" INTEGER,\"ENABLED\" INTEGER,\"IS_UPDATE\" INTEGER,\"M_DAYS\" INTEGER,\"M_SMART_WAKEUP_DURATION\" INTEGER,\"VISIBLE\" INTEGER,\"IS_SMART_WAKEUP\" INTEGER,\"INDEX\" INTEGER,\"IS_SMART\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ALARM\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AlarmDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Alarm alarm) {
        if (alarm != null) {
            return alarm.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Alarm alarm) {
        return alarm.getId() != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(Alarm alarm, long j) {
        alarm.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Alarm alarm) {
        databaseStatement.clearBindings();
        Long id = alarm.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long calendar = alarm.getCalendar();
        if (calendar != null) {
            databaseStatement.bindLong(2, calendar.longValue());
        }
        Boolean enabled = alarm.getEnabled();
        if (enabled != null) {
            databaseStatement.bindLong(3, enabled.booleanValue() ? 1L : 0L);
        }
        Boolean isUpdate = alarm.getIsUpdate();
        if (isUpdate != null) {
            databaseStatement.bindLong(4, isUpdate.booleanValue() ? 1L : 0L);
        }
        Integer mDays = alarm.getMDays();
        if (mDays != null) {
            databaseStatement.bindLong(5, mDays.intValue());
        }
        Integer mSmartWakeupDuration = alarm.getMSmartWakeupDuration();
        if (mSmartWakeupDuration != null) {
            databaseStatement.bindLong(6, mSmartWakeupDuration.intValue());
        }
        Boolean visible = alarm.getVisible();
        if (visible != null) {
            databaseStatement.bindLong(7, visible.booleanValue() ? 1L : 0L);
        }
        Boolean isSmartWakeup = alarm.getIsSmartWakeup();
        if (isSmartWakeup != null) {
            databaseStatement.bindLong(8, isSmartWakeup.booleanValue() ? 1L : 0L);
        }
        Integer index = alarm.getIndex();
        if (index != null) {
            databaseStatement.bindLong(9, index.intValue());
        }
        Boolean isSmart = alarm.getIsSmart();
        if (isSmart != null) {
            databaseStatement.bindLong(10, isSmart.booleanValue() ? 1L : 0L);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Alarm readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        if (cursor.isNull(i4)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i4) != 0);
        }
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        int i6 = i + 4;
        Integer numValueOf = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf2 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        if (cursor.isNull(i8)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i8) != 0);
        }
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i + 8;
        Integer numValueOf3 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i + 9;
        if (cursor.isNull(i11)) {
            boolValueOf5 = null;
        } else {
            boolValueOf5 = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        return new Alarm(lValueOf, lValueOf2, boolValueOf, boolValueOf2, numValueOf, numValueOf2, boolValueOf3, boolValueOf4, numValueOf3, boolValueOf5);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Alarm alarm, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        int i2 = i + 0;
        Boolean boolValueOf5 = null;
        alarm.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        alarm.setCalendar(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        if (cursor.isNull(i4)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i4) != 0);
        }
        alarm.setEnabled(boolValueOf);
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        alarm.setIsUpdate(boolValueOf2);
        int i6 = i + 4;
        alarm.setMDays(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        alarm.setMSmartWakeupDuration(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        if (cursor.isNull(i8)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i8) != 0);
        }
        alarm.setVisible(boolValueOf3);
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        alarm.setIsSmartWakeup(boolValueOf4);
        int i10 = i + 8;
        alarm.setIndex(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 9;
        if (!cursor.isNull(i11)) {
            boolValueOf5 = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        alarm.setIsSmart(boolValueOf5);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Alarm alarm) {
        sQLiteStatement.clearBindings();
        Long id = alarm.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long calendar = alarm.getCalendar();
        if (calendar != null) {
            sQLiteStatement.bindLong(2, calendar.longValue());
        }
        Boolean enabled = alarm.getEnabled();
        if (enabled != null) {
            sQLiteStatement.bindLong(3, enabled.booleanValue() ? 1L : 0L);
        }
        Boolean isUpdate = alarm.getIsUpdate();
        if (isUpdate != null) {
            sQLiteStatement.bindLong(4, isUpdate.booleanValue() ? 1L : 0L);
        }
        Integer mDays = alarm.getMDays();
        if (mDays != null) {
            sQLiteStatement.bindLong(5, mDays.intValue());
        }
        Integer mSmartWakeupDuration = alarm.getMSmartWakeupDuration();
        if (mSmartWakeupDuration != null) {
            sQLiteStatement.bindLong(6, mSmartWakeupDuration.intValue());
        }
        Boolean visible = alarm.getVisible();
        if (visible != null) {
            sQLiteStatement.bindLong(7, visible.booleanValue() ? 1L : 0L);
        }
        Boolean isSmartWakeup = alarm.getIsSmartWakeup();
        if (isSmartWakeup != null) {
            sQLiteStatement.bindLong(8, isSmartWakeup.booleanValue() ? 1L : 0L);
        }
        Integer index = alarm.getIndex();
        if (index != null) {
            sQLiteStatement.bindLong(9, index.intValue());
        }
        Boolean isSmart = alarm.getIsSmart();
        if (isSmart != null) {
            sQLiteStatement.bindLong(10, isSmart.booleanValue() ? 1L : 0L);
        }
    }
}
