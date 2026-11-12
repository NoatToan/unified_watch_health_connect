package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.passport.user.IAuthService;
import com.xiaomi.hm.health.databases.model.HeartRate;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class HeartRateDao extends AbstractDao<HeartRate, Long> {
    public static final String TABLENAME = "HEART_RATE";

    public static class Properties {
        public static final Property Type = new Property(0, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Device_type = new Property(1, Integer.class, "device_type", false, "DEVICE_TYPE");
        public static final Property Device_source = new Property(2, Integer.class, "device_source", false, "DEVICE_SOURCE");
        public static final Property Time = new Property(3, Long.class, "time", true, "TIME");
        public static final Property Hr = new Property(4, Integer.class, Constants.DATA_KEY_HR, false, "HR");
        public static final Property State = new Property(5, Integer.class, "state", false, IAuthService.STATE.STATE);
        public static final Property Time_zone = new Property(6, Integer.class, "time_zone", false, "TIME_ZONE");
        public static final Property Device_id = new Property(7, String.class, "device_id", false, "DEVICE_ID");
    }

    public HeartRateDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"HEART_RATE\" (\"TYPE\" INTEGER,\"DEVICE_TYPE\" INTEGER,\"DEVICE_SOURCE\" INTEGER,\"TIME\" INTEGER PRIMARY KEY ,\"HR\" INTEGER,\"STATE\" INTEGER,\"TIME_ZONE\" INTEGER,\"DEVICE_ID\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"HEART_RATE\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public HeartRateDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(HeartRate heartRate) {
        if (heartRate != null) {
            return heartRate.getTime();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(HeartRate heartRate) {
        return heartRate.getTime() != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 3;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(HeartRate heartRate, long j) {
        heartRate.setTime(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, HeartRate heartRate) {
        databaseStatement.clearBindings();
        Integer type = heartRate.getType();
        if (type != null) {
            databaseStatement.bindLong(1, type.intValue());
        }
        Integer device_type = heartRate.getDevice_type();
        if (device_type != null) {
            databaseStatement.bindLong(2, device_type.intValue());
        }
        Integer device_source = heartRate.getDevice_source();
        if (device_source != null) {
            databaseStatement.bindLong(3, device_source.intValue());
        }
        Long time = heartRate.getTime();
        if (time != null) {
            databaseStatement.bindLong(4, time.longValue());
        }
        Integer hr = heartRate.getHr();
        if (hr != null) {
            databaseStatement.bindLong(5, hr.intValue());
        }
        Integer state = heartRate.getState();
        if (state != null) {
            databaseStatement.bindLong(6, state.intValue());
        }
        Integer time_zone = heartRate.getTime_zone();
        if (time_zone != null) {
            databaseStatement.bindLong(7, time_zone.intValue());
        }
        String device_id = heartRate.getDevice_id();
        if (device_id != null) {
            databaseStatement.bindString(8, device_id);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public HeartRate readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Integer numValueOf = cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2));
        int i3 = i + 1;
        Integer numValueOf2 = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 2;
        Integer numValueOf3 = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        Long lValueOf = cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5));
        int i6 = i + 4;
        Integer numValueOf4 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf5 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        int i9 = i + 7;
        return new HeartRate(numValueOf, numValueOf2, numValueOf3, lValueOf, numValueOf4, numValueOf5, cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)), cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, HeartRate heartRate, int i) {
        int i2 = i + 0;
        heartRate.setType(cursor.isNull(i2) ? null : Integer.valueOf(cursor.getInt(i2)));
        int i3 = i + 1;
        heartRate.setDevice_type(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        heartRate.setDevice_source(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        heartRate.setTime(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        heartRate.setHr(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        heartRate.setState(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        heartRate.setTime_zone(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        heartRate.setDevice_id(cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, HeartRate heartRate) {
        sQLiteStatement.clearBindings();
        Integer type = heartRate.getType();
        if (type != null) {
            sQLiteStatement.bindLong(1, type.intValue());
        }
        Integer device_type = heartRate.getDevice_type();
        if (device_type != null) {
            sQLiteStatement.bindLong(2, device_type.intValue());
        }
        Integer device_source = heartRate.getDevice_source();
        if (device_source != null) {
            sQLiteStatement.bindLong(3, device_source.intValue());
        }
        Long time = heartRate.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(4, time.longValue());
        }
        Integer hr = heartRate.getHr();
        if (hr != null) {
            sQLiteStatement.bindLong(5, hr.intValue());
        }
        Integer state = heartRate.getState();
        if (state != null) {
            sQLiteStatement.bindLong(6, state.intValue());
        }
        Integer time_zone = heartRate.getTime_zone();
        if (time_zone != null) {
            sQLiteStatement.bindLong(7, time_zone.intValue());
        }
        String device_id = heartRate.getDevice_id();
        if (device_id != null) {
            sQLiteStatement.bindString(8, device_id);
        }
    }
}
