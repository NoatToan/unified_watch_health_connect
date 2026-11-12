package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.nfc.applet.EntityKt;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class EarbudDateDataDao extends AbstractDao<EarbudDateData, String> {
    public static final String TABLENAME = "EARBUD_DATE_DATA";

    public static class Properties {
        public static final Property Type = new Property(0, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Source = new Property(1, Integer.class, "source", false, "SOURCE");
        public static final Property Date = new Property(2, String.class, "date", true, "DATE");
        public static final Property Summary = new Property(3, String.class, "summary", false, "SUMMARY");
        public static final Property UserSummary = new Property(4, String.class, "userSummary", false, "USER_SUMMARY");
        public static final Property Data = new Property(5, String.class, "data", false, "DATA");
        public static final Property Sync = new Property(6, Integer.class, "sync", false, EntityKt.FETCH_APDU_MODE_SYNC);
        public static final Property TimeZone = new Property(7, Integer.class, "timeZone", false, "TIME_ZONE");
        public static final Property DeviceId = new Property(8, String.class, "deviceId", false, "DEVICE_ID");
    }

    public EarbudDateDataDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"EARBUD_DATE_DATA\" (\"TYPE\" INTEGER,\"SOURCE\" INTEGER,\"DATE\" TEXT PRIMARY KEY NOT NULL ,\"SUMMARY\" TEXT,\"USER_SUMMARY\" TEXT,\"DATA\" TEXT,\"SYNC\" INTEGER,\"TIME_ZONE\" INTEGER,\"DEVICE_ID\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"EARBUD_DATE_DATA\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public EarbudDateDataDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(EarbudDateData earbudDateData) {
        if (earbudDateData != null) {
            return earbudDateData.getDate();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(EarbudDateData earbudDateData) {
        return earbudDateData.getDate() != null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        int i2 = i + 2;
        if (cursor.isNull(i2)) {
            return null;
        }
        return cursor.getString(i2);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(EarbudDateData earbudDateData, long j) {
        return earbudDateData.getDate();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, EarbudDateData earbudDateData) {
        databaseStatement.clearBindings();
        Integer type = earbudDateData.getType();
        if (type != null) {
            databaseStatement.bindLong(1, type.intValue());
        }
        Integer source = earbudDateData.getSource();
        if (source != null) {
            databaseStatement.bindLong(2, source.intValue());
        }
        String date = earbudDateData.getDate();
        if (date != null) {
            databaseStatement.bindString(3, date);
        }
        String summary = earbudDateData.getSummary();
        if (summary != null) {
            databaseStatement.bindString(4, summary);
        }
        String userSummary = earbudDateData.getUserSummary();
        if (userSummary != null) {
            databaseStatement.bindString(5, userSummary);
        }
        String data = earbudDateData.getData();
        if (data != null) {
            databaseStatement.bindString(6, data);
        }
        Integer sync = earbudDateData.getSync();
        if (sync != null) {
            databaseStatement.bindLong(7, sync.intValue());
        }
        Integer timeZone = earbudDateData.getTimeZone();
        if (timeZone != null) {
            databaseStatement.bindLong(8, timeZone.intValue());
        }
        String deviceId = earbudDateData.getDeviceId();
        if (deviceId != null) {
            databaseStatement.bindString(9, deviceId);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public EarbudDateData readEntity(Cursor cursor, int i) {
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
        int i8 = i + 6;
        Integer numValueOf3 = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        int i10 = i + 8;
        return new EarbudDateData(numValueOf, numValueOf2, string, string2, string3, string4, numValueOf3, cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)), cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, EarbudDateData earbudDateData, int i) {
        int i2 = i + 0;
        earbudDateData.setType(cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2)));
        int i3 = i + 1;
        earbudDateData.setSource(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        earbudDateData.setDate(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        earbudDateData.setSummary(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        earbudDateData.setUserSummary(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        earbudDateData.setData(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        earbudDateData.setSync(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        earbudDateData.setTimeZone(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 8;
        earbudDateData.setDeviceId(cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, EarbudDateData earbudDateData) {
        sQLiteStatement.clearBindings();
        Integer type = earbudDateData.getType();
        if (type != null) {
            sQLiteStatement.bindLong(1, type.intValue());
        }
        Integer source = earbudDateData.getSource();
        if (source != null) {
            sQLiteStatement.bindLong(2, source.intValue());
        }
        String date = earbudDateData.getDate();
        if (date != null) {
            sQLiteStatement.bindString(3, date);
        }
        String summary = earbudDateData.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(4, summary);
        }
        String userSummary = earbudDateData.getUserSummary();
        if (userSummary != null) {
            sQLiteStatement.bindString(5, userSummary);
        }
        String data = earbudDateData.getData();
        if (data != null) {
            sQLiteStatement.bindString(6, data);
        }
        Integer sync = earbudDateData.getSync();
        if (sync != null) {
            sQLiteStatement.bindLong(7, sync.intValue());
        }
        Integer timeZone = earbudDateData.getTimeZone();
        if (timeZone != null) {
            sQLiteStatement.bindLong(8, timeZone.intValue());
        }
        String deviceId = earbudDateData.getDeviceId();
        if (deviceId != null) {
            sQLiteStatement.bindString(9, deviceId);
        }
    }
}
