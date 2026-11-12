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
public class DateDataDao extends AbstractDao<DateData, String> {
    public static final String TABLENAME = "DATE_DATA";

    public static class Properties {
        public static final Property Type = new Property(0, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Source = new Property(1, Integer.class, "source", false, "SOURCE");
        public static final Property Date = new Property(2, String.class, "date", true, "DATE");
        public static final Property Summary = new Property(3, String.class, "summary", false, "SUMMARY");
        public static final Property UserSummary = new Property(4, String.class, "userSummary", false, "USER_SUMMARY");
        public static final Property Indexs = new Property(5, String.class, "indexs", false, "INDEXS");
        public static final Property Data = new Property(6, String.class, "data", false, "DATA");
        public static final Property Data_hr = new Property(7, byte[].class, "data_hr", false, "DATA_HR");
        public static final Property Summary_hr = new Property(8, String.class, "summary_hr", false, "SUMMARY_HR");
        public static final Property Sync = new Property(9, Integer.class, "sync", false, EntityKt.FETCH_APDU_MODE_SYNC);
        public static final Property Sync_qqhealth = new Property(10, Integer.class, "sync_qqhealth", false, "SYNC_QQHEALTH");
        public static final Property Time_zone = new Property(11, Integer.class, "time_zone", false, "TIME_ZONE");
        public static final Property Device_id = new Property(12, String.class, "device_id", false, "DEVICE_ID");
        public static final Property StageStepsSummary = new Property(13, String.class, "stageStepsSummary", false, "STAGE_STEPS_SUMMARY");
    }

    public DateDataDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"DATE_DATA\" (\"TYPE\" INTEGER,\"SOURCE\" INTEGER,\"DATE\" TEXT PRIMARY KEY NOT NULL ,\"SUMMARY\" TEXT,\"USER_SUMMARY\" TEXT,\"INDEXS\" TEXT,\"DATA\" TEXT,\"DATA_HR\" BLOB,\"SUMMARY_HR\" TEXT,\"SYNC\" INTEGER,\"SYNC_QQHEALTH\" INTEGER,\"TIME_ZONE\" INTEGER,\"DEVICE_ID\" TEXT,\"STAGE_STEPS_SUMMARY\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"DATE_DATA\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public DateDataDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(DateData dateData) {
        if (dateData != null) {
            return dateData.getDate();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(DateData dateData) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 2);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(DateData dateData, long j) {
        return dateData.getDate();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, DateData dateData) {
        databaseStatement.clearBindings();
        Integer type = dateData.getType();
        if (type != null) {
            databaseStatement.bindLong(1, type.intValue());
        }
        Integer source = dateData.getSource();
        if (source != null) {
            databaseStatement.bindLong(2, source.intValue());
        }
        databaseStatement.bindString(3, dateData.getDate());
        String summary = dateData.getSummary();
        if (summary != null) {
            databaseStatement.bindString(4, summary);
        }
        String userSummary = dateData.getUserSummary();
        if (userSummary != null) {
            databaseStatement.bindString(5, userSummary);
        }
        String indexs = dateData.getIndexs();
        if (indexs != null) {
            databaseStatement.bindString(6, indexs);
        }
        String data = dateData.getData();
        if (data != null) {
            databaseStatement.bindString(7, data);
        }
        byte[] data_hr = dateData.getData_hr();
        if (data_hr != null) {
            databaseStatement.bindBlob(8, data_hr);
        }
        String summary_hr = dateData.getSummary_hr();
        if (summary_hr != null) {
            databaseStatement.bindString(9, summary_hr);
        }
        Integer sync = dateData.getSync();
        if (sync != null) {
            databaseStatement.bindLong(10, sync.intValue());
        }
        Integer sync_qqhealth = dateData.getSync_qqhealth();
        if (sync_qqhealth != null) {
            databaseStatement.bindLong(11, sync_qqhealth.intValue());
        }
        Integer time_zone = dateData.getTime_zone();
        if (time_zone != null) {
            databaseStatement.bindLong(12, time_zone.intValue());
        }
        String device_id = dateData.getDevice_id();
        if (device_id != null) {
            databaseStatement.bindString(13, device_id);
        }
        String stageStepsSummary = dateData.getStageStepsSummary();
        if (stageStepsSummary != null) {
            databaseStatement.bindString(14, stageStepsSummary);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public DateData readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 3;
        int i5 = i + 4;
        int i6 = i + 5;
        int i7 = i + 6;
        int i8 = i + 7;
        int i9 = i + 8;
        int i10 = i + 9;
        int i11 = i + 10;
        int i12 = i + 11;
        int i13 = i + 12;
        int i14 = i + 13;
        return new DateData(cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2)), cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)), cursor.getString(i + 2), cursor.isNull(i4) ? null : cursor.getString(i4), cursor.isNull(i5) ? null : cursor.getString(i5), cursor.isNull(i6) ? null : cursor.getString(i6), cursor.isNull(i7) ? null : cursor.getString(i7), cursor.isNull(i8) ? null : cursor.getBlob(i8), cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)), cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : cursor.getString(i13), cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, DateData dateData, int i) {
        int i2 = i + 0;
        dateData.setType(cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2)));
        int i3 = i + 1;
        dateData.setSource(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        dateData.setDate(cursor.getString(i + 2));
        int i4 = i + 3;
        dateData.setSummary(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        dateData.setUserSummary(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 5;
        dateData.setIndexs(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 6;
        dateData.setData(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 7;
        dateData.setData_hr(cursor.isNull(i8) ? null : cursor.getBlob(i8));
        int i9 = i + 8;
        dateData.setSummary_hr(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 9;
        dateData.setSync(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 10;
        dateData.setSync_qqhealth(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 11;
        dateData.setTime_zone(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 12;
        dateData.setDevice_id(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 13;
        dateData.setStageStepsSummary(cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, DateData dateData) {
        sQLiteStatement.clearBindings();
        Integer type = dateData.getType();
        if (type != null) {
            sQLiteStatement.bindLong(1, type.intValue());
        }
        Integer source = dateData.getSource();
        if (source != null) {
            sQLiteStatement.bindLong(2, source.intValue());
        }
        sQLiteStatement.bindString(3, dateData.getDate());
        String summary = dateData.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(4, summary);
        }
        String userSummary = dateData.getUserSummary();
        if (userSummary != null) {
            sQLiteStatement.bindString(5, userSummary);
        }
        String indexs = dateData.getIndexs();
        if (indexs != null) {
            sQLiteStatement.bindString(6, indexs);
        }
        String data = dateData.getData();
        if (data != null) {
            sQLiteStatement.bindString(7, data);
        }
        byte[] data_hr = dateData.getData_hr();
        if (data_hr != null) {
            sQLiteStatement.bindBlob(8, data_hr);
        }
        String summary_hr = dateData.getSummary_hr();
        if (summary_hr != null) {
            sQLiteStatement.bindString(9, summary_hr);
        }
        Integer sync = dateData.getSync();
        if (sync != null) {
            sQLiteStatement.bindLong(10, sync.intValue());
        }
        Integer sync_qqhealth = dateData.getSync_qqhealth();
        if (sync_qqhealth != null) {
            sQLiteStatement.bindLong(11, sync_qqhealth.intValue());
        }
        Integer time_zone = dateData.getTime_zone();
        if (time_zone != null) {
            sQLiteStatement.bindLong(12, time_zone.intValue());
        }
        String device_id = dateData.getDevice_id();
        if (device_id != null) {
            sQLiteStatement.bindString(13, device_id);
        }
        String stageStepsSummary = dateData.getStageStepsSummary();
        if (stageStepsSummary != null) {
            sQLiteStatement.bindString(14, stageStepsSummary);
        }
    }
}
