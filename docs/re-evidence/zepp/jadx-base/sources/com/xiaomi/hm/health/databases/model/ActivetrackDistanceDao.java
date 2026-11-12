package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ActivetrackDistanceDao extends AbstractDao<ActivetrackDistance, Long> {
    public static final String TABLENAME = "ACTIVETRACK_DISTANCE";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Trackid = new Property(1, Long.class, "trackid", false, "TRACKID");
        public static final Property Time = new Property(2, Long.class, "time", false, "TIME");
        public static final Property Distance = new Property(3, Float.class, "distance", false, "DISTANCE");
    }

    public ActivetrackDistanceDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ACTIVETRACK_DISTANCE\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRACKID\" INTEGER,\"TIME\" INTEGER,\"DISTANCE\" REAL,UNIQUE (TRACKID,TIME) ON CONFLICT REPLACE);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ACTIVETRACK_DISTANCE\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ActivetrackDistanceDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ActivetrackDistance activetrackDistance) {
        if (activetrackDistance != null) {
            return activetrackDistance.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ActivetrackDistance activetrackDistance) {
        return activetrackDistance.getId() != null;
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
    public final Long updateKeyAfterInsert(ActivetrackDistance activetrackDistance, long j) {
        activetrackDistance.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ActivetrackDistance activetrackDistance) {
        databaseStatement.clearBindings();
        Long id = activetrackDistance.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trackid = activetrackDistance.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(2, trackid.longValue());
        }
        Long time = activetrackDistance.getTime();
        if (time != null) {
            databaseStatement.bindLong(3, time.longValue());
        }
        Float distance = activetrackDistance.getDistance();
        if (distance != null) {
            databaseStatement.bindDouble(4, distance.floatValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ActivetrackDistance readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        int i5 = i + 3;
        return new ActivetrackDistance(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)), cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)), cursor.isNull(i5) ? null : Float.valueOf(cursor.getFloat(i5)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ActivetrackDistance activetrackDistance, int i) {
        int i2 = i + 0;
        activetrackDistance.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        activetrackDistance.setTrackid(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        activetrackDistance.setTime(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        activetrackDistance.setDistance(cursor.isNull(i5) ? null : Float.valueOf(cursor.getFloat(i5)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ActivetrackDistance activetrackDistance) {
        sQLiteStatement.clearBindings();
        Long id = activetrackDistance.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trackid = activetrackDistance.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(2, trackid.longValue());
        }
        Long time = activetrackDistance.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(3, time.longValue());
        }
        Float distance = activetrackDistance.getDistance();
        if (distance != null) {
            sQLiteStatement.bindDouble(4, distance.floatValue());
        }
    }
}
