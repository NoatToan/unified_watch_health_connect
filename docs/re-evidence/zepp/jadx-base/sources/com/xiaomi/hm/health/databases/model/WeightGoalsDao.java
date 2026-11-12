package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import androidx.exifinterface.media.ExifInterface;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class WeightGoalsDao extends AbstractDao<WeightGoals, Long> {
    public static final String TABLENAME = "WEIGHT_GOALS";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property UID = new Property(1, String.class, "UID", false, "UID");
        public static final Property FUID = new Property(2, Long.class, "FUID", false, "FUID");
        public static final Property GoalType = new Property(3, Integer.class, "GoalType", false, "GOAL_TYPE");
        public static final Property CurrentVal = new Property(4, Float.class, "CurrentVal", false, "CURRENT_VAL");
        public static final Property Goal = new Property(5, Float.class, "Goal", false, "GOAL");
        public static final Property DateTime = new Property(6, Long.class, ExifInterface.TAG_DATETIME, false, "DATE_TIME");
        public static final Property Height = new Property(7, Integer.class, "Height", false, "HEIGHT");
        public static final Property Synced = new Property(8, Integer.class, "Synced", false, "SYNCED");
    }

    public WeightGoalsDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"WEIGHT_GOALS\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"UID\" TEXT,\"FUID\" INTEGER,\"GOAL_TYPE\" INTEGER,\"CURRENT_VAL\" REAL,\"GOAL\" REAL,\"DATE_TIME\" INTEGER,\"HEIGHT\" INTEGER,\"SYNCED\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"WEIGHT_GOALS\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public WeightGoalsDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(WeightGoals weightGoals) {
        if (weightGoals != null) {
            return weightGoals.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(WeightGoals weightGoals) {
        return weightGoals.getId() != null;
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
    public final Long updateKeyAfterInsert(WeightGoals weightGoals, long j) {
        weightGoals.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, WeightGoals weightGoals) {
        databaseStatement.clearBindings();
        Long id = weightGoals.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String uid = weightGoals.getUID();
        if (uid != null) {
            databaseStatement.bindString(2, uid);
        }
        Long fuid = weightGoals.getFUID();
        if (fuid != null) {
            databaseStatement.bindLong(3, fuid.longValue());
        }
        Integer goalType = weightGoals.getGoalType();
        if (goalType != null) {
            databaseStatement.bindLong(4, goalType.intValue());
        }
        Float currentVal = weightGoals.getCurrentVal();
        if (currentVal != null) {
            databaseStatement.bindDouble(5, currentVal.floatValue());
        }
        Float goal = weightGoals.getGoal();
        if (goal != null) {
            databaseStatement.bindDouble(6, goal.floatValue());
        }
        Long dateTime = weightGoals.getDateTime();
        if (dateTime != null) {
            databaseStatement.bindLong(7, dateTime.longValue());
        }
        Integer height = weightGoals.getHeight();
        if (height != null) {
            databaseStatement.bindLong(8, height.intValue());
        }
        Integer synced = weightGoals.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(9, synced.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public WeightGoals readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        Long lValueOf2 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        Float fValueOf = cursor.isNull(i6) ? null : Float.valueOf(cursor.getFloat(i6));
        int i7 = i + 5;
        Float fValueOf2 = cursor.isNull(i7) ? null : Float.valueOf(cursor.getFloat(i7));
        int i8 = i + 6;
        Long lValueOf3 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i + 7;
        int i10 = i + 8;
        return new WeightGoals(lValueOf, string, lValueOf2, numValueOf, fValueOf, fValueOf2, lValueOf3, cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)), cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, WeightGoals weightGoals, int i) {
        int i2 = i + 0;
        weightGoals.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        weightGoals.setUID(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        weightGoals.setFUID(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        weightGoals.setGoalType(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        weightGoals.setCurrentVal(cursor.isNull(i6) ? null : Float.valueOf(cursor.getFloat(i6)));
        int i7 = i + 5;
        weightGoals.setGoal(cursor.isNull(i7) ? null : Float.valueOf(cursor.getFloat(i7)));
        int i8 = i + 6;
        weightGoals.setDateTime(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i + 7;
        weightGoals.setHeight(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 8;
        weightGoals.setSynced(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, WeightGoals weightGoals) {
        sQLiteStatement.clearBindings();
        Long id = weightGoals.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String uid = weightGoals.getUID();
        if (uid != null) {
            sQLiteStatement.bindString(2, uid);
        }
        Long fuid = weightGoals.getFUID();
        if (fuid != null) {
            sQLiteStatement.bindLong(3, fuid.longValue());
        }
        Integer goalType = weightGoals.getGoalType();
        if (goalType != null) {
            sQLiteStatement.bindLong(4, goalType.intValue());
        }
        Float currentVal = weightGoals.getCurrentVal();
        if (currentVal != null) {
            sQLiteStatement.bindDouble(5, currentVal.floatValue());
        }
        Float goal = weightGoals.getGoal();
        if (goal != null) {
            sQLiteStatement.bindDouble(6, goal.floatValue());
        }
        Long dateTime = weightGoals.getDateTime();
        if (dateTime != null) {
            sQLiteStatement.bindLong(7, dateTime.longValue());
        }
        Integer height = weightGoals.getHeight();
        if (height != null) {
            sQLiteStatement.bindLong(8, height.intValue());
        }
        Integer synced = weightGoals.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(9, synced.intValue());
        }
    }
}
