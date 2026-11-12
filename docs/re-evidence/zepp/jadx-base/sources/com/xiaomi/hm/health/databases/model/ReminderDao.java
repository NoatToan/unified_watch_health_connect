package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ReminderDao extends AbstractDao<Reminder, Long> {
    public static final String TABLENAME = "REMINDER";

    public static class Properties {
        public static final Property Time = new Property(0, Long.class, "time", true, "_id");
        public static final Property EventId = new Property(1, Integer.class, DbUtils.Const.Columns.Event.EVENT_ID, false, "EVENT_ID");
        public static final Property Fr = new Property(2, Integer.class, "fr", false, "FR");
        public static final Property Op = new Property(3, Integer.class, AdRemindParserKt.KEY_OP, false, "OP");
        public static final Property IconId = new Property(4, Integer.class, "iconId", false, "ICON_ID");
        public static final Property Status = new Property(5, Integer.class, "status", false, "STATUS");
        public static final Property Loop = new Property(6, String.class, "loop", false, "LOOP");
        public static final Property StartDate = new Property(7, String.class, "startDate", false, "START_DATE");
        public static final Property StopDate = new Property(8, String.class, AdRemindParserKt.KEY_STOP_DATE, false, "STOP_DATE");
        public static final Property Title = new Property(9, String.class, "title", false, ShareConstants.TITLE);
        public static final Property Body = new Property(10, String.class, "body", false, "BODY");
    }

    public ReminderDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"REMINDER\" (\"_id\" INTEGER PRIMARY KEY ,\"EVENT_ID\" INTEGER,\"FR\" INTEGER,\"OP\" INTEGER,\"ICON_ID\" INTEGER,\"STATUS\" INTEGER,\"LOOP\" TEXT,\"START_DATE\" TEXT,\"STOP_DATE\" TEXT,\"TITLE\" TEXT,\"BODY\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"REMINDER\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ReminderDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Reminder reminder) {
        if (reminder != null) {
            return reminder.getTime();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Reminder reminder) {
        return reminder.getTime() != null;
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
    public final Long updateKeyAfterInsert(Reminder reminder, long j) {
        reminder.setTime(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Reminder reminder) {
        databaseStatement.clearBindings();
        Long time = reminder.getTime();
        if (time != null) {
            databaseStatement.bindLong(1, time.longValue());
        }
        Integer eventId = reminder.getEventId();
        if (eventId != null) {
            databaseStatement.bindLong(2, eventId.intValue());
        }
        Integer fr = reminder.getFr();
        if (fr != null) {
            databaseStatement.bindLong(3, fr.intValue());
        }
        Integer op = reminder.getOp();
        if (op != null) {
            databaseStatement.bindLong(4, op.intValue());
        }
        Integer iconId = reminder.getIconId();
        if (iconId != null) {
            databaseStatement.bindLong(5, iconId.intValue());
        }
        Integer status = reminder.getStatus();
        if (status != null) {
            databaseStatement.bindLong(6, status.intValue());
        }
        String loop = reminder.getLoop();
        if (loop != null) {
            databaseStatement.bindString(7, loop);
        }
        String startDate = reminder.getStartDate();
        if (startDate != null) {
            databaseStatement.bindString(8, startDate);
        }
        String stopDate = reminder.getStopDate();
        if (stopDate != null) {
            databaseStatement.bindString(9, stopDate);
        }
        String title = reminder.getTitle();
        if (title != null) {
            databaseStatement.bindString(10, title);
        }
        String body = reminder.getBody();
        if (body != null) {
            databaseStatement.bindString(11, body);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Reminder readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Integer numValueOf = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 2;
        Integer numValueOf2 = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        Integer numValueOf3 = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        Integer numValueOf4 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf5 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        String string = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        String string2 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        String string3 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 9;
        int i12 = i + 10;
        return new Reminder(lValueOf, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, string, string2, string3, cursor.isNull(i11) ? null : cursor.getString(i11), cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Reminder reminder, int i) {
        int i2 = i + 0;
        reminder.setTime(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        reminder.setEventId(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        reminder.setFr(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        reminder.setOp(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        reminder.setIconId(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        reminder.setStatus(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        reminder.setLoop(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        reminder.setStartDate(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        reminder.setStopDate(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        reminder.setTitle(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        reminder.setBody(cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Reminder reminder) {
        sQLiteStatement.clearBindings();
        Long time = reminder.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(1, time.longValue());
        }
        Integer eventId = reminder.getEventId();
        if (eventId != null) {
            sQLiteStatement.bindLong(2, eventId.intValue());
        }
        Integer fr = reminder.getFr();
        if (fr != null) {
            sQLiteStatement.bindLong(3, fr.intValue());
        }
        Integer op = reminder.getOp();
        if (op != null) {
            sQLiteStatement.bindLong(4, op.intValue());
        }
        Integer iconId = reminder.getIconId();
        if (iconId != null) {
            sQLiteStatement.bindLong(5, iconId.intValue());
        }
        Integer status = reminder.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(6, status.intValue());
        }
        String loop = reminder.getLoop();
        if (loop != null) {
            sQLiteStatement.bindString(7, loop);
        }
        String startDate = reminder.getStartDate();
        if (startDate != null) {
            sQLiteStatement.bindString(8, startDate);
        }
        String stopDate = reminder.getStopDate();
        if (stopDate != null) {
            sQLiteStatement.bindString(9, stopDate);
        }
        String title = reminder.getTitle();
        if (title != null) {
            sQLiteStatement.bindString(10, title);
        }
        String body = reminder.getBody();
        if (body != null) {
            sQLiteStatement.bindString(11, body);
        }
    }
}
