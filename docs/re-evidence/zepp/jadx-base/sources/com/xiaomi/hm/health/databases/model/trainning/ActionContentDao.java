package com.xiaomi.hm.health.databases.model.trainning;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.assistant.calendar.ICalendar;
import com.ingenic.iwds.HardwareList;
import com.xiaomi.hm.health.databases.model.DaoSession;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ActionContentDao extends AbstractDao<ActionContent, Long> {
    public static final String TABLENAME = "ACTION_CONTENT";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property TrainingId = new Property(1, Long.class, "trainingId", false, "TRAINING_ID");
        public static final Property Round = new Property(2, Integer.class, HardwareList.VALUE_LCD_EXTERIOR_ROUND, false, "ROUND");
        public static final Property Group = new Property(3, Integer.class, "group", false, "GROUP");
        public static final Property Duration = new Property(4, String.class, "duration", false, ICalendar.Property.DURATION);
        public static final Property NextRestTime = new Property(5, Long.class, "nextRestTime", false, "NEXT_REST_TIME");
        public static final Property Type = new Property(6, String.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property RepeatNumber = new Property(7, Integer.class, "repeatNumber", false, "REPEAT_NUMBER");
    }

    public ActionContentDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ACTION_CONTENT\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRAINING_ID\" INTEGER,\"ROUND\" INTEGER,\"GROUP\" INTEGER,\"DURATION\" TEXT,\"NEXT_REST_TIME\" INTEGER,\"TYPE\" TEXT,\"REPEAT_NUMBER\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ACTION_CONTENT\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ActionContentDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ActionContent actionContent) {
        if (actionContent != null) {
            return actionContent.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ActionContent actionContent) {
        return actionContent.getId() != null;
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
    public final Long updateKeyAfterInsert(ActionContent actionContent, long j) {
        actionContent.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ActionContent actionContent) {
        databaseStatement.clearBindings();
        Long id = actionContent.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trainingId = actionContent.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(2, trainingId.longValue());
        }
        Integer round = actionContent.getRound();
        if (round != null) {
            databaseStatement.bindLong(3, round.intValue());
        }
        Integer group = actionContent.getGroup();
        if (group != null) {
            databaseStatement.bindLong(4, group.intValue());
        }
        String duration = actionContent.getDuration();
        if (duration != null) {
            databaseStatement.bindString(5, duration);
        }
        Long nextRestTime = actionContent.getNextRestTime();
        if (nextRestTime != null) {
            databaseStatement.bindLong(6, nextRestTime.longValue());
        }
        String type = actionContent.getType();
        if (type != null) {
            databaseStatement.bindString(7, type);
        }
        Integer repeatNumber = actionContent.getRepeatNumber();
        if (repeatNumber != null) {
            databaseStatement.bindLong(8, repeatNumber.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ActionContent readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Integer numValueOf = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        Integer numValueOf2 = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        String string = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        Long lValueOf3 = cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7));
        int i8 = i + 6;
        int i9 = i + 7;
        return new ActionContent(lValueOf, lValueOf2, numValueOf, numValueOf2, string, lValueOf3, cursor.isNull(i8) ? null : cursor.getString(i8), cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ActionContent actionContent, int i) {
        int i2 = i + 0;
        actionContent.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        actionContent.setTrainingId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        actionContent.setRound(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        actionContent.setGroup(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        actionContent.setDuration(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        actionContent.setNextRestTime(cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)));
        int i8 = i + 6;
        actionContent.setType(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        actionContent.setRepeatNumber(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ActionContent actionContent) {
        sQLiteStatement.clearBindings();
        Long id = actionContent.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trainingId = actionContent.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(2, trainingId.longValue());
        }
        Integer round = actionContent.getRound();
        if (round != null) {
            sQLiteStatement.bindLong(3, round.intValue());
        }
        Integer group = actionContent.getGroup();
        if (group != null) {
            sQLiteStatement.bindLong(4, group.intValue());
        }
        String duration = actionContent.getDuration();
        if (duration != null) {
            sQLiteStatement.bindString(5, duration);
        }
        Long nextRestTime = actionContent.getNextRestTime();
        if (nextRestTime != null) {
            sQLiteStatement.bindLong(6, nextRestTime.longValue());
        }
        String type = actionContent.getType();
        if (type != null) {
            sQLiteStatement.bindString(7, type);
        }
        Integer repeatNumber = actionContent.getRepeatNumber();
        if (repeatNumber != null) {
            sQLiteStatement.bindLong(8, repeatNumber.intValue());
        }
    }
}
