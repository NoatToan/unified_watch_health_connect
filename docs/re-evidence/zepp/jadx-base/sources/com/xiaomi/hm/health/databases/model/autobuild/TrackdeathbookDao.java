package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.databases.model.Trackdeathbook;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrackdeathbookDao extends AbstractDao<Trackdeathbook, Long> {
    public static final String TABLENAME = "TRACKDEATHBOOK";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Trackid = new Property(1, Long.class, "trackid", false, "TRACKID");
        public static final Property Summary = new Property(2, String.class, "summary", false, "SUMMARY");
        public static final Property Ssummary = new Property(3, String.class, "ssummary", false, "SSUMMARY");
        public static final Property Synced = new Property(4, Integer.class, "synced", false, "SYNCED");
    }

    public TrackdeathbookDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRACKDEATHBOOK\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRACKID\" INTEGER,\"SUMMARY\" TEXT,\"SSUMMARY\" TEXT,\"SYNCED\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRACKDEATHBOOK\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrackdeathbookDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Trackdeathbook trackdeathbook) {
        if (trackdeathbook != null) {
            return trackdeathbook.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Trackdeathbook trackdeathbook) {
        return trackdeathbook.getId() != null;
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
    public final Long updateKeyAfterInsert(Trackdeathbook trackdeathbook, long j) {
        trackdeathbook.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Trackdeathbook trackdeathbook) {
        databaseStatement.clearBindings();
        Long id = trackdeathbook.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trackid = trackdeathbook.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(2, trackid.longValue());
        }
        String summary = trackdeathbook.getSummary();
        if (summary != null) {
            databaseStatement.bindString(3, summary);
        }
        String ssummary = trackdeathbook.getSsummary();
        if (ssummary != null) {
            databaseStatement.bindString(4, ssummary);
        }
        Integer synced = trackdeathbook.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(5, synced.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Trackdeathbook readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        String string = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        int i6 = i + 4;
        return new Trackdeathbook(lValueOf, lValueOf2, string, cursor.isNull(i5) ? null : cursor.getString(i5), cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Trackdeathbook trackdeathbook, int i) {
        int i2 = i + 0;
        trackdeathbook.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trackdeathbook.setTrackid(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        trackdeathbook.setSummary(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        trackdeathbook.setSsummary(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        trackdeathbook.setSynced(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Trackdeathbook trackdeathbook) {
        sQLiteStatement.clearBindings();
        Long id = trackdeathbook.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trackid = trackdeathbook.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(2, trackid.longValue());
        }
        String summary = trackdeathbook.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(3, summary);
        }
        String ssummary = trackdeathbook.getSsummary();
        if (ssummary != null) {
            sQLiteStatement.bindString(4, ssummary);
        }
        Integer synced = trackdeathbook.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(5, synced.intValue());
        }
    }
}
