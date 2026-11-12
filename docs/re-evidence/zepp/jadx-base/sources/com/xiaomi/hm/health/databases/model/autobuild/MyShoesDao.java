package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.passport.user.IAuthService;
import com.xiaomi.hm.health.databases.model.MyShoes;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class MyShoesDao extends AbstractDao<MyShoes, Long> {
    public static final String TABLENAME = "MY_SHOES";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Date = new Property(1, String.class, "date", false, "DATE");
        public static final Property Mac = new Property(2, String.class, "mac", false, "MAC");
        public static final Property Deviceid = new Property(3, String.class, "deviceid", false, "DEVICEID");
        public static final Property Sn = new Property(4, String.class, "sn", false, "SN");
        public static final Property Shoesid = new Property(5, String.class, "shoesid", false, "SHOESID");
        public static final Property Brand = new Property(6, String.class, "brand", false, "BRAND");
        public static final Property Type = new Property(7, String.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Synced = new Property(8, String.class, "synced", false, "SYNCED");
        public static final Property State = new Property(9, String.class, "state", false, IAuthService.STATE.STATE);
        public static final Property Summary = new Property(10, String.class, "summary", false, "SUMMARY");
        public static final Property Cached = new Property(11, String.class, "cached", false, "CACHED");
    }

    public MyShoesDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"MY_SHOES\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"DATE\" TEXT,\"MAC\" TEXT,\"DEVICEID\" TEXT,\"SN\" TEXT,\"SHOESID\" TEXT,\"BRAND\" TEXT,\"TYPE\" TEXT,\"SYNCED\" TEXT,\"STATE\" TEXT,\"SUMMARY\" TEXT,\"CACHED\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MY_SHOES\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public MyShoesDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(MyShoes myShoes) {
        if (myShoes != null) {
            return myShoes.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(MyShoes myShoes) {
        return myShoes.getId() != null;
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
    public final Long updateKeyAfterInsert(MyShoes myShoes, long j) {
        myShoes.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, MyShoes myShoes) {
        databaseStatement.clearBindings();
        Long id = myShoes.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String date = myShoes.getDate();
        if (date != null) {
            databaseStatement.bindString(2, date);
        }
        String mac = myShoes.getMac();
        if (mac != null) {
            databaseStatement.bindString(3, mac);
        }
        String deviceid = myShoes.getDeviceid();
        if (deviceid != null) {
            databaseStatement.bindString(4, deviceid);
        }
        String sn = myShoes.getSn();
        if (sn != null) {
            databaseStatement.bindString(5, sn);
        }
        String shoesid = myShoes.getShoesid();
        if (shoesid != null) {
            databaseStatement.bindString(6, shoesid);
        }
        String brand = myShoes.getBrand();
        if (brand != null) {
            databaseStatement.bindString(7, brand);
        }
        String type = myShoes.getType();
        if (type != null) {
            databaseStatement.bindString(8, type);
        }
        String synced = myShoes.getSynced();
        if (synced != null) {
            databaseStatement.bindString(9, synced);
        }
        String state = myShoes.getState();
        if (state != null) {
            databaseStatement.bindString(10, state);
        }
        String summary = myShoes.getSummary();
        if (summary != null) {
            databaseStatement.bindString(11, summary);
        }
        String cached = myShoes.getCached();
        if (cached != null) {
            databaseStatement.bindString(12, cached);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public MyShoes readEntity(Cursor cursor, int i) {
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
        return new MyShoes(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : cursor.getString(i3), cursor.isNull(i4) ? null : cursor.getString(i4), cursor.isNull(i5) ? null : cursor.getString(i5), cursor.isNull(i6) ? null : cursor.getString(i6), cursor.isNull(i7) ? null : cursor.getString(i7), cursor.isNull(i8) ? null : cursor.getString(i8), cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : cursor.getString(i11), cursor.isNull(i12) ? null : cursor.getString(i12), cursor.isNull(i13) ? null : cursor.getString(i13));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, MyShoes myShoes, int i) {
        int i2 = i + 0;
        myShoes.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        myShoes.setDate(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        myShoes.setMac(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        myShoes.setDeviceid(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        myShoes.setSn(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        myShoes.setShoesid(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        myShoes.setBrand(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        myShoes.setType(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        myShoes.setSynced(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        myShoes.setState(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        myShoes.setSummary(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 11;
        myShoes.setCached(cursor.isNull(i13) ? null : cursor.getString(i13));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, MyShoes myShoes) {
        sQLiteStatement.clearBindings();
        Long id = myShoes.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String date = myShoes.getDate();
        if (date != null) {
            sQLiteStatement.bindString(2, date);
        }
        String mac = myShoes.getMac();
        if (mac != null) {
            sQLiteStatement.bindString(3, mac);
        }
        String deviceid = myShoes.getDeviceid();
        if (deviceid != null) {
            sQLiteStatement.bindString(4, deviceid);
        }
        String sn = myShoes.getSn();
        if (sn != null) {
            sQLiteStatement.bindString(5, sn);
        }
        String shoesid = myShoes.getShoesid();
        if (shoesid != null) {
            sQLiteStatement.bindString(6, shoesid);
        }
        String brand = myShoes.getBrand();
        if (brand != null) {
            sQLiteStatement.bindString(7, brand);
        }
        String type = myShoes.getType();
        if (type != null) {
            sQLiteStatement.bindString(8, type);
        }
        String synced = myShoes.getSynced();
        if (synced != null) {
            sQLiteStatement.bindString(9, synced);
        }
        String state = myShoes.getState();
        if (state != null) {
            sQLiteStatement.bindString(10, state);
        }
        String summary = myShoes.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(11, summary);
        }
        String cached = myShoes.getCached();
        if (cached != null) {
            sQLiteStatement.bindString(12, cached);
        }
    }
}
