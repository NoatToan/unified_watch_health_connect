package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.xiaomi.hm.health.databases.model.Trackstatistics;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrackstatisticsDao extends AbstractDao<Trackstatistics, Long> {
    public static final String TABLENAME = "TRACKSTATISTICS";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Sporttype = new Property(1, Integer.class, "sporttype", false, "SPORTTYPE");
        public static final Property Type = new Property(2, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Subtype = new Property(3, String.class, "subtype", false, "SUBTYPE");
        public static final Property Summary = new Property(4, String.class, "summary", false, "SUMMARY");
        public static final Property Synced = new Property(5, Integer.class, "synced", false, "SYNCED");
    }

    public TrackstatisticsDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRACKSTATISTICS\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"SPORTTYPE\" INTEGER,\"TYPE\" INTEGER,\"SUBTYPE\" TEXT,\"SUMMARY\" TEXT,\"SYNCED\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRACKSTATISTICS\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrackstatisticsDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Trackstatistics trackstatistics) {
        if (trackstatistics != null) {
            return trackstatistics.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Trackstatistics trackstatistics) {
        return trackstatistics.getId() != null;
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
    public final Long updateKeyAfterInsert(Trackstatistics trackstatistics, long j) {
        trackstatistics.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Trackstatistics trackstatistics) {
        databaseStatement.clearBindings();
        Long id = trackstatistics.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Integer sporttype = trackstatistics.getSporttype();
        if (sporttype != null) {
            databaseStatement.bindLong(2, sporttype.intValue());
        }
        Integer type = trackstatistics.getType();
        if (type != null) {
            databaseStatement.bindLong(3, type.intValue());
        }
        String subtype = trackstatistics.getSubtype();
        if (subtype != null) {
            databaseStatement.bindString(4, subtype);
        }
        String summary = trackstatistics.getSummary();
        if (summary != null) {
            databaseStatement.bindString(5, summary);
        }
        Integer synced = trackstatistics.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(6, synced.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Trackstatistics readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Integer numValueOf = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 2;
        Integer numValueOf2 = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        String string = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        int i7 = i + 5;
        return new Trackstatistics(lValueOf, numValueOf, numValueOf2, string, cursor.isNull(i6) ? null : cursor.getString(i6), cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Trackstatistics trackstatistics, int i) {
        int i2 = i + 0;
        trackstatistics.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trackstatistics.setSporttype(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        trackstatistics.setType(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        trackstatistics.setSubtype(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        trackstatistics.setSummary(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        trackstatistics.setSynced(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Trackstatistics trackstatistics) {
        sQLiteStatement.clearBindings();
        Long id = trackstatistics.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Integer sporttype = trackstatistics.getSporttype();
        if (sporttype != null) {
            sQLiteStatement.bindLong(2, sporttype.intValue());
        }
        Integer type = trackstatistics.getType();
        if (type != null) {
            sQLiteStatement.bindLong(3, type.intValue());
        }
        String subtype = trackstatistics.getSubtype();
        if (subtype != null) {
            sQLiteStatement.bindString(4, subtype);
        }
        String summary = trackstatistics.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(5, summary);
        }
        Integer synced = trackstatistics.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(6, synced.intValue());
        }
    }
}
