package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.xiaomi.hm.health.databases.model.ManualData;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ManualDataDao extends AbstractDao<ManualData, Long> {
    public static final String TABLENAME = "MANUAL_DATA";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Type = new Property(1, String.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Date = new Property(2, String.class, "date", false, "DATE");
        public static final Property Summary = new Property(3, String.class, "summary", false, "SUMMARY");
        public static final Property Synced = new Property(4, Integer.class, "synced", false, "SYNCED");
    }

    public ManualDataDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"MANUAL_DATA\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TYPE\" TEXT,\"DATE\" TEXT,\"SUMMARY\" TEXT,\"SYNCED\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MANUAL_DATA\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ManualDataDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ManualData manualData) {
        if (manualData != null) {
            return manualData.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ManualData manualData) {
        return manualData.getId() != null;
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
    public final Long updateKeyAfterInsert(ManualData manualData, long j) {
        manualData.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ManualData manualData) {
        databaseStatement.clearBindings();
        Long id = manualData.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String type = manualData.getType();
        if (type != null) {
            databaseStatement.bindString(2, type);
        }
        String date = manualData.getDate();
        if (date != null) {
            databaseStatement.bindString(3, date);
        }
        String summary = manualData.getSummary();
        if (summary != null) {
            databaseStatement.bindString(4, summary);
        }
        Integer synced = manualData.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(5, synced.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ManualData readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        int i6 = i + 4;
        return new ManualData(lValueOf, string, string2, cursor.isNull(i5) ? null : cursor.getString(i5), cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ManualData manualData, int i) {
        int i2 = i + 0;
        manualData.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        manualData.setType(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        manualData.setDate(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        manualData.setSummary(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        manualData.setSynced(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ManualData manualData) {
        sQLiteStatement.clearBindings();
        Long id = manualData.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String type = manualData.getType();
        if (type != null) {
            sQLiteStatement.bindString(2, type);
        }
        String date = manualData.getDate();
        if (date != null) {
            sQLiteStatement.bindString(3, date);
        }
        String summary = manualData.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(4, summary);
        }
        Integer synced = manualData.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(5, synced.intValue());
        }
    }
}
