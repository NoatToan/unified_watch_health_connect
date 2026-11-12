package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.Detail;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class DetailDao extends AbstractDao<Detail, Long> {
    public static final String TABLENAME = "DETAIL";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Uid = new Property(1, String.class, "uid", false, "UID");
        public static final Property Step = new Property(2, Integer.class, "step", false, "STEP");
        public static final Property DeepSleep = new Property(3, Integer.class, "deepSleep", false, "DEEP_SLEEP");
        public static final Property ShallowSleep = new Property(4, Integer.class, "shallowSleep", false, "SHALLOW_SLEEP");
        public static final Property CreateTime = new Property(5, Long.class, ParamKey.createTime, false, "CREATE_TIME");
        public static final Property Distance = new Property(6, Integer.class, "distance", false, "DISTANCE");
        public static final Property Calorie = new Property(7, Integer.class, "calorie", false, "CALORIE");
        public static final Property FallSleepTime = new Property(8, Long.class, "fallSleepTime", false, "FALL_SLEEP_TIME");
        public static final Property WakeTime = new Property(9, Long.class, "wakeTime", false, "WAKE_TIME");
        public static final Property Tz = new Property(10, Integer.class, "tz", false, "TZ");
        public static final Property Dt = new Property(11, Long.class, "dt", false, "DT");
        public static final Property TotalSleeptime = new Property(12, Long.class, "totalSleeptime", false, "TOTAL_SLEEPTIME");
    }

    public DetailDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"DETAIL\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"UID\" TEXT,\"STEP\" INTEGER,\"DEEP_SLEEP\" INTEGER,\"SHALLOW_SLEEP\" INTEGER,\"CREATE_TIME\" INTEGER,\"DISTANCE\" INTEGER,\"CALORIE\" INTEGER,\"FALL_SLEEP_TIME\" INTEGER,\"WAKE_TIME\" INTEGER,\"TZ\" INTEGER,\"DT\" INTEGER,\"TOTAL_SLEEPTIME\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"DETAIL\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public DetailDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Detail detail) {
        if (detail != null) {
            return detail.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Detail detail) {
        return detail.getId() != null;
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
    public final Long updateKeyAfterInsert(Detail detail, long j) {
        detail.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Detail detail) {
        databaseStatement.clearBindings();
        Long id = detail.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String uid = detail.getUid();
        if (uid != null) {
            databaseStatement.bindString(2, uid);
        }
        Integer step = detail.getStep();
        if (step != null) {
            databaseStatement.bindLong(3, step.intValue());
        }
        Integer deepSleep = detail.getDeepSleep();
        if (deepSleep != null) {
            databaseStatement.bindLong(4, deepSleep.intValue());
        }
        Integer shallowSleep = detail.getShallowSleep();
        if (shallowSleep != null) {
            databaseStatement.bindLong(5, shallowSleep.intValue());
        }
        Long createTime = detail.getCreateTime();
        if (createTime != null) {
            databaseStatement.bindLong(6, createTime.longValue());
        }
        Integer distance = detail.getDistance();
        if (distance != null) {
            databaseStatement.bindLong(7, distance.intValue());
        }
        Integer calorie = detail.getCalorie();
        if (calorie != null) {
            databaseStatement.bindLong(8, calorie.intValue());
        }
        Long fallSleepTime = detail.getFallSleepTime();
        if (fallSleepTime != null) {
            databaseStatement.bindLong(9, fallSleepTime.longValue());
        }
        Long wakeTime = detail.getWakeTime();
        if (wakeTime != null) {
            databaseStatement.bindLong(10, wakeTime.longValue());
        }
        Integer tz = detail.getTz();
        if (tz != null) {
            databaseStatement.bindLong(11, tz.intValue());
        }
        Long dt = detail.getDt();
        if (dt != null) {
            databaseStatement.bindLong(12, dt.longValue());
        }
        Long totalSleeptime = detail.getTotalSleeptime();
        if (totalSleeptime != null) {
            databaseStatement.bindLong(13, totalSleeptime.longValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Detail readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        int i5 = i + 3;
        int i6 = i + 4;
        int i7 = i + 5;
        int i8 = i + 6;
        int i9 = i + 7;
        int i10 = i + 8;
        int i11 = i + 9;
        int i12 = i + 10;
        int i13 = i + 11;
        int i14 = i + 12;
        return new Detail(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : cursor.getString(i3), cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)), cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)), cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)), cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)), cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)), cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)), cursor.isNull(i10) ? null : Long.valueOf(cursor.getLong(i10)), cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11)), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)), cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Detail detail, int i) {
        int i2 = i + 0;
        detail.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        detail.setUid(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        detail.setStep(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        detail.setDeepSleep(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        detail.setShallowSleep(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        detail.setCreateTime(cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)));
        int i8 = i + 6;
        detail.setDistance(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        detail.setCalorie(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 8;
        detail.setFallSleepTime(cursor.isNull(i10) ? null : Long.valueOf(cursor.getLong(i10)));
        int i11 = i + 9;
        detail.setWakeTime(cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11)));
        int i12 = i + 10;
        detail.setTz(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 11;
        detail.setDt(cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)));
        int i14 = i + 12;
        detail.setTotalSleeptime(cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Detail detail) {
        sQLiteStatement.clearBindings();
        Long id = detail.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String uid = detail.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(2, uid);
        }
        Integer step = detail.getStep();
        if (step != null) {
            sQLiteStatement.bindLong(3, step.intValue());
        }
        Integer deepSleep = detail.getDeepSleep();
        if (deepSleep != null) {
            sQLiteStatement.bindLong(4, deepSleep.intValue());
        }
        Integer shallowSleep = detail.getShallowSleep();
        if (shallowSleep != null) {
            sQLiteStatement.bindLong(5, shallowSleep.intValue());
        }
        Long createTime = detail.getCreateTime();
        if (createTime != null) {
            sQLiteStatement.bindLong(6, createTime.longValue());
        }
        Integer distance = detail.getDistance();
        if (distance != null) {
            sQLiteStatement.bindLong(7, distance.intValue());
        }
        Integer calorie = detail.getCalorie();
        if (calorie != null) {
            sQLiteStatement.bindLong(8, calorie.intValue());
        }
        Long fallSleepTime = detail.getFallSleepTime();
        if (fallSleepTime != null) {
            sQLiteStatement.bindLong(9, fallSleepTime.longValue());
        }
        Long wakeTime = detail.getWakeTime();
        if (wakeTime != null) {
            sQLiteStatement.bindLong(10, wakeTime.longValue());
        }
        Integer tz = detail.getTz();
        if (tz != null) {
            sQLiteStatement.bindLong(11, tz.intValue());
        }
        Long dt = detail.getDt();
        if (dt != null) {
            sQLiteStatement.bindLong(12, dt.longValue());
        }
        Long totalSleeptime = detail.getTotalSleeptime();
        if (totalSleeptime != null) {
            sQLiteStatement.bindLong(13, totalSleeptime.longValue());
        }
    }
}
