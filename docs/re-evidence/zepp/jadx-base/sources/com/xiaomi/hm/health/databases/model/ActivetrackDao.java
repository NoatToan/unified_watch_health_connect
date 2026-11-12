package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.nfc.web.Constant;
import com.huami.passport.user.IAuthService;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ActivetrackDao extends AbstractDao<Activetrack, Long> {
    public static final String TABLENAME = "ACTIVETRACK";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Trackid = new Property(1, Long.class, "trackid", false, "TRACKID");
        public static final Property Latitude = new Property(2, Float.class, Constant.KEY_LATITUDE, false, "LATITUDE");
        public static final Property Longitude = new Property(3, Float.class, Constant.KEY_LONGITUDE, false, "LONGITUDE");
        public static final Property Time = new Property(4, Long.class, "time", false, "TIME");
        public static final Property Altitude = new Property(5, Float.class, "altitude", false, "ALTITUDE");
        public static final Property Accuracy = new Property(6, Integer.class, "accuracy", false, "ACCURACY");
        public static final Property Steps = new Property(7, Integer.class, GetWatermarkAPI.KEY_NAME_STEPS, false, "STEPS");
        public static final Property Stepl = new Property(8, Float.class, "stepl", false, "STEPL");
        public static final Property Pace = new Property(9, Float.class, "pace", false, "PACE");
        public static final Property State = new Property(10, Integer.class, "state", false, IAuthService.STATE.STATE);
        public static final Property Extra = new Property(11, String.class, "extra", false, "EXTRA");
        public static final Property Synced = new Property(12, Integer.class, "synced", false, "SYNCED");
        public static final Property Distance = new Property(13, Float.class, "distance", false, "DISTANCE");
        public static final Property BarometerAltitude = new Property(14, Float.class, "barometerAltitude", false, "BAROMETER_ALTITUDE");
        public static final Property Hr = new Property(15, Integer.class, Constants.DATA_KEY_HR, false, "HR");
        public static final Property Speed = new Property(16, Float.class, "speed", false, "SPEED");
    }

    public ActivetrackDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ACTIVETRACK\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRACKID\" INTEGER,\"LATITUDE\" REAL,\"LONGITUDE\" REAL,\"TIME\" INTEGER,\"ALTITUDE\" REAL,\"ACCURACY\" INTEGER,\"STEPS\" INTEGER,\"STEPL\" REAL,\"PACE\" REAL,\"STATE\" INTEGER,\"EXTRA\" TEXT,\"SYNCED\" INTEGER,\"DISTANCE\" REAL,\"BAROMETER_ALTITUDE\" REAL,\"HR\" INTEGER,\"SPEED\" REAL,UNIQUE (TRACKID,TIME) ON CONFLICT REPLACE);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ACTIVETRACK\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ActivetrackDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Activetrack activetrack) {
        if (activetrack != null) {
            return activetrack.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Activetrack activetrack) {
        return activetrack.getId() != null;
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
    public final Long updateKeyAfterInsert(Activetrack activetrack, long j) {
        activetrack.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Activetrack activetrack) {
        databaseStatement.clearBindings();
        Long id = activetrack.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trackid = activetrack.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(2, trackid.longValue());
        }
        Float latitude = activetrack.getLatitude();
        if (latitude != null) {
            databaseStatement.bindDouble(3, latitude.floatValue());
        }
        Float longitude = activetrack.getLongitude();
        if (longitude != null) {
            databaseStatement.bindDouble(4, longitude.floatValue());
        }
        Long time = activetrack.getTime();
        if (time != null) {
            databaseStatement.bindLong(5, time.longValue());
        }
        Float altitude = activetrack.getAltitude();
        if (altitude != null) {
            databaseStatement.bindDouble(6, altitude.floatValue());
        }
        Integer accuracy = activetrack.getAccuracy();
        if (accuracy != null) {
            databaseStatement.bindLong(7, accuracy.intValue());
        }
        Integer steps = activetrack.getSteps();
        if (steps != null) {
            databaseStatement.bindLong(8, steps.intValue());
        }
        Float stepl = activetrack.getStepl();
        if (stepl != null) {
            databaseStatement.bindDouble(9, stepl.floatValue());
        }
        Float pace = activetrack.getPace();
        if (pace != null) {
            databaseStatement.bindDouble(10, pace.floatValue());
        }
        Integer state = activetrack.getState();
        if (state != null) {
            databaseStatement.bindLong(11, state.intValue());
        }
        String extra = activetrack.getExtra();
        if (extra != null) {
            databaseStatement.bindString(12, extra);
        }
        Integer synced = activetrack.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(13, synced.intValue());
        }
        Float distance = activetrack.getDistance();
        if (distance != null) {
            databaseStatement.bindDouble(14, distance.floatValue());
        }
        Float barometerAltitude = activetrack.getBarometerAltitude();
        if (barometerAltitude != null) {
            databaseStatement.bindDouble(15, barometerAltitude.floatValue());
        }
        Integer hr = activetrack.getHr();
        if (hr != null) {
            databaseStatement.bindLong(16, hr.intValue());
        }
        Float speed = activetrack.getSpeed();
        if (speed != null) {
            databaseStatement.bindDouble(17, speed.floatValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Activetrack readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Float fValueOf = cursor.isNull(i4) ? null : Float.valueOf(cursor.getFloat(i4));
        int i5 = i + 3;
        Float fValueOf2 = cursor.isNull(i5) ? null : Float.valueOf(cursor.getFloat(i5));
        int i6 = i + 4;
        Long lValueOf3 = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 5;
        Float fValueOf3 = cursor.isNull(i7) ? null : Float.valueOf(cursor.getFloat(i7));
        int i8 = i + 6;
        Integer numValueOf = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        Integer numValueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i + 8;
        Float fValueOf4 = cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10));
        int i11 = i + 9;
        Float fValueOf5 = cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11));
        int i12 = i + 10;
        Integer numValueOf3 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i + 11;
        String string = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 12;
        Integer numValueOf4 = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i + 13;
        Float fValueOf6 = cursor.isNull(i15) ? null : Float.valueOf(cursor.getFloat(i15));
        int i16 = i + 14;
        Float fValueOf7 = cursor.isNull(i16) ? null : Float.valueOf(cursor.getFloat(i16));
        int i17 = i + 15;
        Integer numValueOf5 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i + 16;
        return new Activetrack(lValueOf, lValueOf2, fValueOf, fValueOf2, lValueOf3, fValueOf3, numValueOf, numValueOf2, fValueOf4, fValueOf5, numValueOf3, string, numValueOf4, fValueOf6, fValueOf7, numValueOf5, cursor.isNull(i18) ? null : Float.valueOf(cursor.getFloat(i18)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Activetrack activetrack, int i) {
        int i2 = i + 0;
        activetrack.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        activetrack.setTrackid(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        activetrack.setLatitude(cursor.isNull(i4) ? null : Float.valueOf(cursor.getFloat(i4)));
        int i5 = i + 3;
        activetrack.setLongitude(cursor.isNull(i5) ? null : Float.valueOf(cursor.getFloat(i5)));
        int i6 = i + 4;
        activetrack.setTime(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i + 5;
        activetrack.setAltitude(cursor.isNull(i7) ? null : Float.valueOf(cursor.getFloat(i7)));
        int i8 = i + 6;
        activetrack.setAccuracy(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        activetrack.setSteps(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 8;
        activetrack.setStepl(cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)));
        int i11 = i + 9;
        activetrack.setPace(cursor.isNull(i11) ? null : Float.valueOf(cursor.getFloat(i11)));
        int i12 = i + 10;
        activetrack.setState(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 11;
        activetrack.setExtra(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 12;
        activetrack.setSynced(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i + 13;
        activetrack.setDistance(cursor.isNull(i15) ? null : Float.valueOf(cursor.getFloat(i15)));
        int i16 = i + 14;
        activetrack.setBarometerAltitude(cursor.isNull(i16) ? null : Float.valueOf(cursor.getFloat(i16)));
        int i17 = i + 15;
        activetrack.setHr(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i + 16;
        activetrack.setSpeed(cursor.isNull(i18) ? null : Float.valueOf(cursor.getFloat(i18)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Activetrack activetrack) {
        sQLiteStatement.clearBindings();
        Long id = activetrack.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trackid = activetrack.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(2, trackid.longValue());
        }
        Float latitude = activetrack.getLatitude();
        if (latitude != null) {
            sQLiteStatement.bindDouble(3, latitude.floatValue());
        }
        Float longitude = activetrack.getLongitude();
        if (longitude != null) {
            sQLiteStatement.bindDouble(4, longitude.floatValue());
        }
        Long time = activetrack.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(5, time.longValue());
        }
        Float altitude = activetrack.getAltitude();
        if (altitude != null) {
            sQLiteStatement.bindDouble(6, altitude.floatValue());
        }
        Integer accuracy = activetrack.getAccuracy();
        if (accuracy != null) {
            sQLiteStatement.bindLong(7, accuracy.intValue());
        }
        Integer steps = activetrack.getSteps();
        if (steps != null) {
            sQLiteStatement.bindLong(8, steps.intValue());
        }
        Float stepl = activetrack.getStepl();
        if (stepl != null) {
            sQLiteStatement.bindDouble(9, stepl.floatValue());
        }
        Float pace = activetrack.getPace();
        if (pace != null) {
            sQLiteStatement.bindDouble(10, pace.floatValue());
        }
        Integer state = activetrack.getState();
        if (state != null) {
            sQLiteStatement.bindLong(11, state.intValue());
        }
        String extra = activetrack.getExtra();
        if (extra != null) {
            sQLiteStatement.bindString(12, extra);
        }
        Integer synced = activetrack.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(13, synced.intValue());
        }
        Float distance = activetrack.getDistance();
        if (distance != null) {
            sQLiteStatement.bindDouble(14, distance.floatValue());
        }
        Float barometerAltitude = activetrack.getBarometerAltitude();
        if (barometerAltitude != null) {
            sQLiteStatement.bindDouble(15, barometerAltitude.floatValue());
        }
        Integer hr = activetrack.getHr();
        if (hr != null) {
            sQLiteStatement.bindLong(16, hr.intValue());
        }
        Float speed = activetrack.getSpeed();
        if (speed != null) {
            sQLiteStatement.bindDouble(17, speed.floatValue());
        }
    }
}
