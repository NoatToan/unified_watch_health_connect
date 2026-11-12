package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ShoesDataDao extends AbstractDao<ShoesData, String> {
    public static final String TABLENAME = "SHOES_DATA";

    public static class Properties {
        public static final Property Type = new Property(0, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Source = new Property(1, Integer.class, "source", false, "SOURCE");
        public static final Property Mac = new Property(2, String.class, "mac", false, "MAC");
        public static final Property Deviceid = new Property(3, String.class, "deviceid", false, "DEVICEID");
        public static final Property Sn = new Property(4, String.class, "sn", false, "SN");
        public static final Property Shoesid = new Property(5, String.class, "shoesid", false, "SHOESID");
        public static final Property Date = new Property(6, String.class, "date", true, "DATE");
        public static final Property Summary = new Property(7, String.class, "summary", false, "SUMMARY");
        public static final Property Data = new Property(8, byte[].class, "data", false, "DATA");
        public static final Property Synced = new Property(9, Integer.class, "synced", false, "SYNCED");
    }

    public ShoesDataDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"SHOES_DATA\" (\"TYPE\" INTEGER,\"SOURCE\" INTEGER,\"MAC\" TEXT,\"DEVICEID\" TEXT,\"SN\" TEXT,\"SHOESID\" TEXT,\"DATE\" TEXT PRIMARY KEY NOT NULL ,\"SUMMARY\" TEXT,\"DATA\" BLOB,\"SYNCED\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"SHOES_DATA\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ShoesDataDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(ShoesData shoesData) {
        if (shoesData != null) {
            return shoesData.getDate();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ShoesData shoesData) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 6);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(ShoesData shoesData, long j) {
        return shoesData.getDate();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ShoesData shoesData) {
        databaseStatement.clearBindings();
        Integer type = shoesData.getType();
        if (type != null) {
            databaseStatement.bindLong(1, type.intValue());
        }
        Integer source = shoesData.getSource();
        if (source != null) {
            databaseStatement.bindLong(2, source.intValue());
        }
        String mac = shoesData.getMac();
        if (mac != null) {
            databaseStatement.bindString(3, mac);
        }
        String deviceid = shoesData.getDeviceid();
        if (deviceid != null) {
            databaseStatement.bindString(4, deviceid);
        }
        String sn = shoesData.getSn();
        if (sn != null) {
            databaseStatement.bindString(5, sn);
        }
        String shoesid = shoesData.getShoesid();
        if (shoesid != null) {
            databaseStatement.bindString(6, shoesid);
        }
        databaseStatement.bindString(7, shoesData.getDate());
        String summary = shoesData.getSummary();
        if (summary != null) {
            databaseStatement.bindString(8, summary);
        }
        byte[] data = shoesData.getData();
        if (data != null) {
            databaseStatement.bindBlob(9, data);
        }
        Integer synced = shoesData.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(10, synced.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ShoesData readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Integer numValueOf = cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2));
        int i3 = i + 1;
        Integer numValueOf2 = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 2;
        String string = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string2 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        String string3 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        String string4 = cursor.isNull(i7) ? null : cursor.getString(i7);
        String string5 = cursor.getString(i + 6);
        int i8 = i + 7;
        String string6 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 8;
        int i10 = i + 9;
        return new ShoesData(numValueOf, numValueOf2, string, string2, string3, string4, string5, string6, cursor.isNull(i9) ? null : cursor.getBlob(i9), cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ShoesData shoesData, int i) {
        int i2 = i + 0;
        shoesData.setType(cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2)));
        int i3 = i + 1;
        shoesData.setSource(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        shoesData.setMac(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        shoesData.setDeviceid(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        shoesData.setSn(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        shoesData.setShoesid(cursor.isNull(i7) ? null : cursor.getString(i7));
        shoesData.setDate(cursor.getString(i + 6));
        int i8 = i + 7;
        shoesData.setSummary(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 8;
        shoesData.setData(cursor.isNull(i9) ? null : cursor.getBlob(i9));
        int i10 = i + 9;
        shoesData.setSynced(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ShoesData shoesData) {
        sQLiteStatement.clearBindings();
        Integer type = shoesData.getType();
        if (type != null) {
            sQLiteStatement.bindLong(1, type.intValue());
        }
        Integer source = shoesData.getSource();
        if (source != null) {
            sQLiteStatement.bindLong(2, source.intValue());
        }
        String mac = shoesData.getMac();
        if (mac != null) {
            sQLiteStatement.bindString(3, mac);
        }
        String deviceid = shoesData.getDeviceid();
        if (deviceid != null) {
            sQLiteStatement.bindString(4, deviceid);
        }
        String sn = shoesData.getSn();
        if (sn != null) {
            sQLiteStatement.bindString(5, sn);
        }
        String shoesid = shoesData.getShoesid();
        if (shoesid != null) {
            sQLiteStatement.bindString(6, shoesid);
        }
        sQLiteStatement.bindString(7, shoesData.getDate());
        String summary = shoesData.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(8, summary);
        }
        byte[] data = shoesData.getData();
        if (data != null) {
            sQLiteStatement.bindBlob(9, data);
        }
        Integer synced = shoesData.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(10, synced.intValue());
        }
    }
}
