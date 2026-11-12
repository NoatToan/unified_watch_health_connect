package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.mifit.sportlib.common.Constants;
import com.xiaomi.hm.health.databases.model.Activetrackhr;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ActivetrackhrDao extends AbstractDao<Activetrackhr, Long> {
    public static final String TABLENAME = "ACTIVETRACKHR";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Trackid = new Property(1, Long.class, "trackid", false, "TRACKID");
        public static final Property Time = new Property(2, Long.class, "time", false, "TIME");
        public static final Property Hr = new Property(3, Integer.class, Constants.DATA_KEY_HR, false, "HR");
        public static final Property Synced = new Property(4, Integer.class, "synced", false, "SYNCED");
    }

    public ActivetrackhrDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ACTIVETRACKHR\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRACKID\" INTEGER,\"TIME\" INTEGER,\"HR\" INTEGER,\"SYNCED\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ACTIVETRACKHR\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ActivetrackhrDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Activetrackhr activetrackhr) {
        if (activetrackhr != null) {
            return activetrackhr.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Activetrackhr activetrackhr) {
        return activetrackhr.getId() != null;
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
    public final Long updateKeyAfterInsert(Activetrackhr activetrackhr, long j) {
        activetrackhr.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Activetrackhr activetrackhr) {
        databaseStatement.clearBindings();
        Long id = activetrackhr.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trackid = activetrackhr.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(2, trackid.longValue());
        }
        Long time = activetrackhr.getTime();
        if (time != null) {
            databaseStatement.bindLong(3, time.longValue());
        }
        Integer hr = activetrackhr.getHr();
        if (hr != null) {
            databaseStatement.bindLong(4, hr.intValue());
        }
        Integer synced = activetrackhr.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(5, synced.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Activetrackhr readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Long lValueOf3 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        int i6 = i + 4;
        return new Activetrackhr(lValueOf, lValueOf2, lValueOf3, cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)), cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Activetrackhr activetrackhr, int i) {
        int i2 = i + 0;
        activetrackhr.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        activetrackhr.setTrackid(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        activetrackhr.setTime(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        activetrackhr.setHr(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        activetrackhr.setSynced(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Activetrackhr activetrackhr) {
        sQLiteStatement.clearBindings();
        Long id = activetrackhr.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trackid = activetrackhr.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(2, trackid.longValue());
        }
        Long time = activetrackhr.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(3, time.longValue());
        }
        Integer hr = activetrackhr.getHr();
        if (hr != null) {
            sQLiteStatement.bindLong(4, hr.intValue());
        }
        Integer synced = activetrackhr.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(5, synced.intValue());
        }
    }
}
