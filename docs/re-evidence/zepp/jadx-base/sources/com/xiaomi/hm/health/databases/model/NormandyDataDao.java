package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.nfc.applet.EntityKt;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class NormandyDataDao extends AbstractDao<NormandyData, String> {
    public static final String TABLENAME = "NORMANDY_DATA";

    public static class Properties {
        public static final Property Type = new Property(0, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Source = new Property(1, Integer.class, "source", false, "SOURCE");
        public static final Property Date = new Property(2, String.class, "date", true, "DATE");
        public static final Property Summary = new Property(3, String.class, "summary", false, "SUMMARY");
        public static final Property Data = new Property(4, byte[].class, "data", false, "DATA");
        public static final Property Sync = new Property(5, Integer.class, "sync", false, EntityKt.FETCH_APDU_MODE_SYNC);
        public static final Property Time_zone = new Property(6, Integer.class, "time_zone", false, "TIME_ZONE");
        public static final Property Device_id = new Property(7, String.class, "device_id", false, "DEVICE_ID");
    }

    public NormandyDataDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"NORMANDY_DATA\" (\"TYPE\" INTEGER,\"SOURCE\" INTEGER,\"DATE\" TEXT PRIMARY KEY NOT NULL ,\"SUMMARY\" TEXT,\"DATA\" BLOB,\"SYNC\" INTEGER,\"TIME_ZONE\" INTEGER,\"DEVICE_ID\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"NORMANDY_DATA\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public NormandyDataDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(NormandyData normandyData) {
        if (normandyData != null) {
            return normandyData.getDate();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(NormandyData normandyData) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 2);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(NormandyData normandyData, long j) {
        return normandyData.getDate();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, NormandyData normandyData) {
        databaseStatement.clearBindings();
        Integer type = normandyData.getType();
        if (type != null) {
            databaseStatement.bindLong(1, type.intValue());
        }
        Integer source = normandyData.getSource();
        if (source != null) {
            databaseStatement.bindLong(2, source.intValue());
        }
        databaseStatement.bindString(3, normandyData.getDate());
        String summary = normandyData.getSummary();
        if (summary != null) {
            databaseStatement.bindString(4, summary);
        }
        byte[] data = normandyData.getData();
        if (data != null) {
            databaseStatement.bindBlob(5, data);
        }
        Integer sync = normandyData.getSync();
        if (sync != null) {
            databaseStatement.bindLong(6, sync.intValue());
        }
        Integer time_zone = normandyData.getTime_zone();
        if (time_zone != null) {
            databaseStatement.bindLong(7, time_zone.intValue());
        }
        String device_id = normandyData.getDevice_id();
        if (device_id != null) {
            databaseStatement.bindString(8, device_id);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public NormandyData readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Integer numValueOf = cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2));
        int i3 = i + 1;
        Integer numValueOf2 = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        String string = cursor.getString(i + 2);
        int i4 = i + 3;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 4;
        byte[] blob = cursor.isNull(i5) ? null : cursor.getBlob(i5);
        int i6 = i + 5;
        Integer numValueOf3 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 6;
        int i8 = i + 7;
        return new NormandyData(numValueOf, numValueOf2, string, string2, blob, numValueOf3, cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)), cursor.isNull(i8) ? null : cursor.getString(i8));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, NormandyData normandyData, int i) {
        int i2 = i + 0;
        normandyData.setType(cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2)));
        int i3 = i + 1;
        normandyData.setSource(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        normandyData.setDate(cursor.getString(i + 2));
        int i4 = i + 3;
        normandyData.setSummary(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        normandyData.setData(cursor.isNull(i5) ? null : cursor.getBlob(i5));
        int i6 = i + 5;
        normandyData.setSync(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 6;
        normandyData.setTime_zone(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 7;
        normandyData.setDevice_id(cursor.isNull(i8) ? null : cursor.getString(i8));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, NormandyData normandyData) {
        sQLiteStatement.clearBindings();
        Integer type = normandyData.getType();
        if (type != null) {
            sQLiteStatement.bindLong(1, type.intValue());
        }
        Integer source = normandyData.getSource();
        if (source != null) {
            sQLiteStatement.bindLong(2, source.intValue());
        }
        sQLiteStatement.bindString(3, normandyData.getDate());
        String summary = normandyData.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(4, summary);
        }
        byte[] data = normandyData.getData();
        if (data != null) {
            sQLiteStatement.bindBlob(5, data);
        }
        Integer sync = normandyData.getSync();
        if (sync != null) {
            sQLiteStatement.bindLong(6, sync.intValue());
        }
        Integer time_zone = normandyData.getTime_zone();
        if (time_zone != null) {
            sQLiteStatement.bindLong(7, time_zone.intValue());
        }
        String device_id = normandyData.getDevice_id();
        if (device_id != null) {
            sQLiteStatement.bindString(8, device_id);
        }
    }
}
