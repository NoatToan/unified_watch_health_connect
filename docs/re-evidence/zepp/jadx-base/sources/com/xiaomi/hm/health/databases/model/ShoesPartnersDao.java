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
public class ShoesPartnersDao extends AbstractDao<ShoesPartners, Long> {
    public static final String TABLENAME = "SHOES_PARTNERS";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Brand = new Property(1, String.class, "brand", false, "BRAND");
        public static final Property Type = new Property(2, String.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Synctime = new Property(3, String.class, "synctime", false, "SYNCTIME");
        public static final Property Summary = new Property(4, String.class, "summary", false, "SUMMARY");
        public static final Property Biguri = new Property(5, String.class, "biguri", false, "BIGURI");
        public static final Property Uri = new Property(6, String.class, "uri", false, "URI");
    }

    public ShoesPartnersDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"SHOES_PARTNERS\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"BRAND\" TEXT,\"TYPE\" TEXT,\"SYNCTIME\" TEXT,\"SUMMARY\" TEXT,\"BIGURI\" TEXT,\"URI\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"SHOES_PARTNERS\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ShoesPartnersDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ShoesPartners shoesPartners) {
        if (shoesPartners != null) {
            return shoesPartners.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ShoesPartners shoesPartners) {
        return shoesPartners.getId() != null;
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
    public final Long updateKeyAfterInsert(ShoesPartners shoesPartners, long j) {
        shoesPartners.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ShoesPartners shoesPartners) {
        databaseStatement.clearBindings();
        Long id = shoesPartners.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String brand = shoesPartners.getBrand();
        if (brand != null) {
            databaseStatement.bindString(2, brand);
        }
        String type = shoesPartners.getType();
        if (type != null) {
            databaseStatement.bindString(3, type);
        }
        String synctime = shoesPartners.getSynctime();
        if (synctime != null) {
            databaseStatement.bindString(4, synctime);
        }
        String summary = shoesPartners.getSummary();
        if (summary != null) {
            databaseStatement.bindString(5, summary);
        }
        String biguri = shoesPartners.getBiguri();
        if (biguri != null) {
            databaseStatement.bindString(6, biguri);
        }
        String uri = shoesPartners.getUri();
        if (uri != null) {
            databaseStatement.bindString(7, uri);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ShoesPartners readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string3 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        String string4 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        int i8 = i + 6;
        return new ShoesPartners(lValueOf, string, string2, string3, string4, cursor.isNull(i7) ? null : cursor.getString(i7), cursor.isNull(i8) ? null : cursor.getString(i8));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ShoesPartners shoesPartners, int i) {
        int i2 = i + 0;
        shoesPartners.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        shoesPartners.setBrand(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        shoesPartners.setType(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        shoesPartners.setSynctime(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        shoesPartners.setSummary(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        shoesPartners.setBiguri(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        shoesPartners.setUri(cursor.isNull(i8) ? null : cursor.getString(i8));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ShoesPartners shoesPartners) {
        sQLiteStatement.clearBindings();
        Long id = shoesPartners.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String brand = shoesPartners.getBrand();
        if (brand != null) {
            sQLiteStatement.bindString(2, brand);
        }
        String type = shoesPartners.getType();
        if (type != null) {
            sQLiteStatement.bindString(3, type);
        }
        String synctime = shoesPartners.getSynctime();
        if (synctime != null) {
            sQLiteStatement.bindString(4, synctime);
        }
        String summary = shoesPartners.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(5, summary);
        }
        String biguri = shoesPartners.getBiguri();
        if (biguri != null) {
            sQLiteStatement.bindString(6, biguri);
        }
        String uri = shoesPartners.getUri();
        if (uri != null) {
            sQLiteStatement.bindString(7, uri);
        }
    }
}
