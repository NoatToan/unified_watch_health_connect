package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrackhrDao extends AbstractDao<Trackhr, Long> {
    public static final String TABLENAME = "TRACKHR";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Source = new Property(1, Integer.class, "source", false, "SOURCE");
        public static final Property Type = new Property(2, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Trackid = new Property(3, Long.class, "trackid", false, "TRACKID");
        public static final Property Segment = new Property(4, Integer.class, SportDetail.COLUMN_SEGMENT, false, "SEGMENT");
        public static final Property Size = new Property(5, Integer.class, "size", false, "SIZE");
        public static final Property Compressed = new Property(6, Integer.class, "compressed", false, "COMPRESSED");
        public static final Property Summary = new Property(7, String.class, "summary", false, "SUMMARY");
        public static final Property Bulkhr = new Property(8, String.class, "bulkhr", false, "BULKHR");
        public static final Property Synced = new Property(9, Integer.class, "synced", false, "SYNCED");
    }

    public TrackhrDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRACKHR\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"SOURCE\" INTEGER,\"TYPE\" INTEGER,\"TRACKID\" INTEGER,\"SEGMENT\" INTEGER,\"SIZE\" INTEGER,\"COMPRESSED\" INTEGER,\"SUMMARY\" TEXT,\"BULKHR\" TEXT,\"SYNCED\" INTEGER,UNIQUE (SOURCE,TYPE,SEGMENT,TRACKID) ON CONFLICT REPLACE);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRACKHR\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrackhrDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Trackhr trackhr) {
        if (trackhr != null) {
            return trackhr.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Trackhr trackhr) {
        return trackhr.getId() != null;
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
    public final Long updateKeyAfterInsert(Trackhr trackhr, long j) {
        trackhr.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Trackhr trackhr) {
        databaseStatement.clearBindings();
        Long id = trackhr.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Integer source = trackhr.getSource();
        if (source != null) {
            databaseStatement.bindLong(2, source.intValue());
        }
        Integer type = trackhr.getType();
        if (type != null) {
            databaseStatement.bindLong(3, type.intValue());
        }
        Long trackid = trackhr.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(4, trackid.longValue());
        }
        Integer segment = trackhr.getSegment();
        if (segment != null) {
            databaseStatement.bindLong(5, segment.intValue());
        }
        Integer size = trackhr.getSize();
        if (size != null) {
            databaseStatement.bindLong(6, size.intValue());
        }
        Integer compressed = trackhr.getCompressed();
        if (compressed != null) {
            databaseStatement.bindLong(7, compressed.intValue());
        }
        String summary = trackhr.getSummary();
        if (summary != null) {
            databaseStatement.bindString(8, summary);
        }
        String bulkhr = trackhr.getBulkhr();
        if (bulkhr != null) {
            databaseStatement.bindString(9, bulkhr);
        }
        Integer synced = trackhr.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(10, synced.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Trackhr readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Integer numValueOf = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 2;
        Integer numValueOf2 = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        Long lValueOf2 = cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5));
        int i6 = i + 4;
        Integer numValueOf3 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf4 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        Integer numValueOf5 = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        int i11 = i + 9;
        return new Trackhr(lValueOf, numValueOf, numValueOf2, lValueOf2, numValueOf3, numValueOf4, numValueOf5, string, cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Trackhr trackhr, int i) {
        int i2 = i + 0;
        trackhr.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trackhr.setSource(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        trackhr.setType(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        trackhr.setTrackid(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        trackhr.setSegment(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        trackhr.setSize(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        trackhr.setCompressed(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        trackhr.setSummary(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        trackhr.setBulkhr(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        trackhr.setSynced(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Trackhr trackhr) {
        sQLiteStatement.clearBindings();
        Long id = trackhr.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Integer source = trackhr.getSource();
        if (source != null) {
            sQLiteStatement.bindLong(2, source.intValue());
        }
        Integer type = trackhr.getType();
        if (type != null) {
            sQLiteStatement.bindLong(3, type.intValue());
        }
        Long trackid = trackhr.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(4, trackid.longValue());
        }
        Integer segment = trackhr.getSegment();
        if (segment != null) {
            sQLiteStatement.bindLong(5, segment.intValue());
        }
        Integer size = trackhr.getSize();
        if (size != null) {
            sQLiteStatement.bindLong(6, size.intValue());
        }
        Integer compressed = trackhr.getCompressed();
        if (compressed != null) {
            sQLiteStatement.bindLong(7, compressed.intValue());
        }
        String summary = trackhr.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(8, summary);
        }
        String bulkhr = trackhr.getBulkhr();
        if (bulkhr != null) {
            sQLiteStatement.bindString(9, bulkhr);
        }
        Integer synced = trackhr.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(10, synced.intValue());
        }
    }
}
