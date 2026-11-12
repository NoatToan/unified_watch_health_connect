package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.xiaomi.hm.health.databases.model.Trackdata;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrackdataDao extends AbstractDao<Trackdata, Long> {
    public static final String TABLENAME = "TRACKDATA";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Source = new Property(1, Integer.class, "source", false, "SOURCE");
        public static final Property Type = new Property(2, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Trackid = new Property(3, Long.class, "trackid", false, "TRACKID");
        public static final Property Segment = new Property(4, Integer.class, SportDetail.COLUMN_SEGMENT, false, "SEGMENT");
        public static final Property Bulkll = new Property(5, String.class, "bulkll", false, "BULKLL");
        public static final Property Bulkgait = new Property(6, String.class, "bulkgait", false, "BULKGAIT");
        public static final Property Bulkal = new Property(7, String.class, "bulkal", false, "BULKAL");
        public static final Property Bulkacc = new Property(8, String.class, "bulkacc", false, "BULKACC");
        public static final Property Bulktime = new Property(9, String.class, "bulktime", false, "BULKTIME");
        public static final Property Bulkflag = new Property(10, String.class, "bulkflag", false, "BULKFLAG");
        public static final Property Bulkpace = new Property(11, String.class, "bulkpace", false, "BULKPACE");
        public static final Property Bulkpause = new Property(12, String.class, "bulkpause", false, "BULKPAUSE");
        public static final Property Kilomarked = new Property(13, String.class, "kilomarked", false, "KILOMARKED");
        public static final Property Bulkdistance = new Property(14, String.class, "bulkdistance", false, "BULKDISTANCE");
        public static final Property BulkbarometerAltitude = new Property(15, String.class, "bulkbarometerAltitude", false, "BULKBAROMETER_ALTITUDE");
        public static final Property Bulkhr = new Property(16, String.class, "bulkhr", false, "BULKHR");
        public static final Property Milemarked = new Property(17, String.class, "milemarked", false, "MILEMARKED");
        public static final Property Size = new Property(18, Integer.class, "size", false, "SIZE");
        public static final Property V = new Property(19, Integer.class, "v", false, "V");
        public static final Property Compressed = new Property(20, Integer.class, "compressed", false, "COMPRESSED");
        public static final Property Provider = new Property(21, Integer.class, "provider", false, "PROVIDER");
        public static final Property Synced = new Property(22, Integer.class, "synced", false, "SYNCED");
        public static final Property CorrectAltitude = new Property(23, String.class, "correctAltitude", false, "CORRECT_ALTITUDE");
        public static final Property StrokeSpeed = new Property(24, String.class, "strokeSpeed", false, "STROKE_SPEED");
        public static final Property Cadence = new Property(25, String.class, "cadence", false, "CADENCE");
        public static final Property DailyPerformance = new Property(26, String.class, "dailyPerformance", false, "DAILY_PERFORMANCE");
        public static final Property Lap = new Property(27, String.class, "lap", false, "LAP");
        public static final Property Bulkspeed = new Property(28, String.class, "bulkspeed", false, "BULKSPEED");
        public static final Property CoachSegment = new Property(29, String.class, "coachSegment", false, "COACH_SEGMENT");
        public static final Property WeatherInfo = new Property(30, String.class, "weatherInfo", false, "WEATHER_INFO");
        public static final Property BulkRopeSkippingFreq = new Property(31, String.class, "bulkRopeSkippingFreq", false, "BULK_ROPE_SKIPPING_FREQ");
        public static final Property FriendId = new Property(32, String.class, "friendId", false, "FRIEND_ID");
        public static final Property Bulkspo2 = new Property(33, String.class, "bulkspo2", false, "BULKSPO2");
        public static final Property BulkPressure = new Property(34, String.class, "bulkPressure", false, "BULK_PRESSURE");
        public static final Property BulkTemperature = new Property(35, String.class, "bulkTemperature", false, "BULK_TEMPERATURE");
        public static final Property TimeDeltaAltitude = new Property(36, String.class, "timeDeltaAltitude", false, "TIME_DELTA_ALTITUDE");
        public static final Property GolfBeat = new Property(37, String.class, "golfBeat", false, "GOLF_BEAT");
        public static final Property GolfAngle = new Property(38, String.class, "golfAngle", false, "GOLF_ANGLE");
        public static final Property GolfUpTime = new Property(39, String.class, "golfUpTime", false, "GOLF_UP_TIME");
        public static final Property GolfDownTime = new Property(40, String.class, "golfDownTime", false, "GOLF_DOWN_TIME");
    }

    public TrackdataDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRACKDATA\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"SOURCE\" INTEGER,\"TYPE\" INTEGER,\"TRACKID\" INTEGER,\"SEGMENT\" INTEGER,\"BULKLL\" TEXT,\"BULKGAIT\" TEXT,\"BULKAL\" TEXT,\"BULKACC\" TEXT,\"BULKTIME\" TEXT,\"BULKFLAG\" TEXT,\"BULKPACE\" TEXT,\"BULKPAUSE\" TEXT,\"KILOMARKED\" TEXT,\"BULKDISTANCE\" TEXT,\"BULKBAROMETER_ALTITUDE\" TEXT,\"BULKHR\" TEXT,\"MILEMARKED\" TEXT,\"SIZE\" INTEGER,\"V\" INTEGER,\"COMPRESSED\" INTEGER,\"PROVIDER\" INTEGER,\"SYNCED\" INTEGER,\"CORRECT_ALTITUDE\" TEXT,\"STROKE_SPEED\" TEXT,\"CADENCE\" TEXT,\"DAILY_PERFORMANCE\" TEXT,\"LAP\" TEXT,\"BULKSPEED\" TEXT,\"COACH_SEGMENT\" TEXT,\"WEATHER_INFO\" TEXT,\"BULK_ROPE_SKIPPING_FREQ\" TEXT,\"FRIEND_ID\" TEXT,\"BULKSPO2\" TEXT,\"BULK_PRESSURE\" TEXT,\"BULK_TEMPERATURE\" TEXT,\"TIME_DELTA_ALTITUDE\" TEXT,\"GOLF_BEAT\" TEXT,\"GOLF_ANGLE\" TEXT,\"GOLF_UP_TIME\" TEXT,\"GOLF_DOWN_TIME\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRACKDATA\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrackdataDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Trackdata trackdata) {
        if (trackdata != null) {
            return trackdata.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Trackdata trackdata) {
        return trackdata.getId() != null;
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
    public final Long updateKeyAfterInsert(Trackdata trackdata, long j) {
        trackdata.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Trackdata trackdata) {
        databaseStatement.clearBindings();
        Long id = trackdata.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Integer source = trackdata.getSource();
        if (source != null) {
            databaseStatement.bindLong(2, source.intValue());
        }
        Integer type = trackdata.getType();
        if (type != null) {
            databaseStatement.bindLong(3, type.intValue());
        }
        Long trackid = trackdata.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(4, trackid.longValue());
        }
        Integer segment = trackdata.getSegment();
        if (segment != null) {
            databaseStatement.bindLong(5, segment.intValue());
        }
        String bulkll = trackdata.getBulkll();
        if (bulkll != null) {
            databaseStatement.bindString(6, bulkll);
        }
        String bulkgait = trackdata.getBulkgait();
        if (bulkgait != null) {
            databaseStatement.bindString(7, bulkgait);
        }
        String bulkal = trackdata.getBulkal();
        if (bulkal != null) {
            databaseStatement.bindString(8, bulkal);
        }
        String bulkacc = trackdata.getBulkacc();
        if (bulkacc != null) {
            databaseStatement.bindString(9, bulkacc);
        }
        String bulktime = trackdata.getBulktime();
        if (bulktime != null) {
            databaseStatement.bindString(10, bulktime);
        }
        String bulkflag = trackdata.getBulkflag();
        if (bulkflag != null) {
            databaseStatement.bindString(11, bulkflag);
        }
        String bulkpace = trackdata.getBulkpace();
        if (bulkpace != null) {
            databaseStatement.bindString(12, bulkpace);
        }
        String bulkpause = trackdata.getBulkpause();
        if (bulkpause != null) {
            databaseStatement.bindString(13, bulkpause);
        }
        String kilomarked = trackdata.getKilomarked();
        if (kilomarked != null) {
            databaseStatement.bindString(14, kilomarked);
        }
        String bulkdistance = trackdata.getBulkdistance();
        if (bulkdistance != null) {
            databaseStatement.bindString(15, bulkdistance);
        }
        String bulkbarometerAltitude = trackdata.getBulkbarometerAltitude();
        if (bulkbarometerAltitude != null) {
            databaseStatement.bindString(16, bulkbarometerAltitude);
        }
        String bulkhr = trackdata.getBulkhr();
        if (bulkhr != null) {
            databaseStatement.bindString(17, bulkhr);
        }
        String milemarked = trackdata.getMilemarked();
        if (milemarked != null) {
            databaseStatement.bindString(18, milemarked);
        }
        Integer size = trackdata.getSize();
        if (size != null) {
            databaseStatement.bindLong(19, size.intValue());
        }
        Integer v = trackdata.getV();
        if (v != null) {
            databaseStatement.bindLong(20, v.intValue());
        }
        Integer compressed = trackdata.getCompressed();
        if (compressed != null) {
            databaseStatement.bindLong(21, compressed.intValue());
        }
        Integer provider = trackdata.getProvider();
        if (provider != null) {
            databaseStatement.bindLong(22, provider.intValue());
        }
        Integer synced = trackdata.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(23, synced.intValue());
        }
        String correctAltitude = trackdata.getCorrectAltitude();
        if (correctAltitude != null) {
            databaseStatement.bindString(24, correctAltitude);
        }
        String strokeSpeed = trackdata.getStrokeSpeed();
        if (strokeSpeed != null) {
            databaseStatement.bindString(25, strokeSpeed);
        }
        String cadence = trackdata.getCadence();
        if (cadence != null) {
            databaseStatement.bindString(26, cadence);
        }
        String dailyPerformance = trackdata.getDailyPerformance();
        if (dailyPerformance != null) {
            databaseStatement.bindString(27, dailyPerformance);
        }
        String lap = trackdata.getLap();
        if (lap != null) {
            databaseStatement.bindString(28, lap);
        }
        String bulkspeed = trackdata.getBulkspeed();
        if (bulkspeed != null) {
            databaseStatement.bindString(29, bulkspeed);
        }
        String coachSegment = trackdata.getCoachSegment();
        if (coachSegment != null) {
            databaseStatement.bindString(30, coachSegment);
        }
        String weatherInfo = trackdata.getWeatherInfo();
        if (weatherInfo != null) {
            databaseStatement.bindString(31, weatherInfo);
        }
        String bulkRopeSkippingFreq = trackdata.getBulkRopeSkippingFreq();
        if (bulkRopeSkippingFreq != null) {
            databaseStatement.bindString(32, bulkRopeSkippingFreq);
        }
        String friendId = trackdata.getFriendId();
        if (friendId != null) {
            databaseStatement.bindString(33, friendId);
        }
        String bulkspo2 = trackdata.getBulkspo2();
        if (bulkspo2 != null) {
            databaseStatement.bindString(34, bulkspo2);
        }
        String bulkPressure = trackdata.getBulkPressure();
        if (bulkPressure != null) {
            databaseStatement.bindString(35, bulkPressure);
        }
        String bulkTemperature = trackdata.getBulkTemperature();
        if (bulkTemperature != null) {
            databaseStatement.bindString(36, bulkTemperature);
        }
        String timeDeltaAltitude = trackdata.getTimeDeltaAltitude();
        if (timeDeltaAltitude != null) {
            databaseStatement.bindString(37, timeDeltaAltitude);
        }
        String golfBeat = trackdata.getGolfBeat();
        if (golfBeat != null) {
            databaseStatement.bindString(38, golfBeat);
        }
        String golfAngle = trackdata.getGolfAngle();
        if (golfAngle != null) {
            databaseStatement.bindString(39, golfAngle);
        }
        String golfUpTime = trackdata.getGolfUpTime();
        if (golfUpTime != null) {
            databaseStatement.bindString(40, golfUpTime);
        }
        String golfDownTime = trackdata.getGolfDownTime();
        if (golfDownTime != null) {
            databaseStatement.bindString(41, golfDownTime);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Trackdata readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Integer numValueOf = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 2;
        Integer numValueOf2 = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        Long lValueOf2 = cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5));
        int i6 = i + 4;
        Integer numValueOf3 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        String string = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        String string2 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        String string3 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        String string4 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 9;
        String string5 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 10;
        String string6 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 11;
        String string7 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 12;
        String string8 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        String string9 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        String string10 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 15;
        String string11 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 16;
        String string12 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 17;
        String string13 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 18;
        Integer numValueOf4 = cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20));
        int i21 = i + 19;
        Integer numValueOf5 = cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21));
        int i22 = i + 20;
        Integer numValueOf6 = cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22));
        int i23 = i + 21;
        Integer numValueOf7 = cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23));
        int i24 = i + 22;
        Integer numValueOf8 = cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24));
        int i25 = i + 23;
        String string14 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 24;
        String string15 = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 25;
        String string16 = cursor.isNull(i27) ? null : cursor.getString(i27);
        int i28 = i + 26;
        String string17 = cursor.isNull(i28) ? null : cursor.getString(i28);
        int i29 = i + 27;
        String string18 = cursor.isNull(i29) ? null : cursor.getString(i29);
        int i30 = i + 28;
        String string19 = cursor.isNull(i30) ? null : cursor.getString(i30);
        int i31 = i + 29;
        String string20 = cursor.isNull(i31) ? null : cursor.getString(i31);
        int i32 = i + 30;
        String string21 = cursor.isNull(i32) ? null : cursor.getString(i32);
        int i33 = i + 31;
        String string22 = cursor.isNull(i33) ? null : cursor.getString(i33);
        int i34 = i + 32;
        String string23 = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i + 33;
        String string24 = cursor.isNull(i35) ? null : cursor.getString(i35);
        int i36 = i + 34;
        String string25 = cursor.isNull(i36) ? null : cursor.getString(i36);
        int i37 = i + 35;
        String string26 = cursor.isNull(i37) ? null : cursor.getString(i37);
        int i38 = i + 36;
        String string27 = cursor.isNull(i38) ? null : cursor.getString(i38);
        int i39 = i + 37;
        String string28 = cursor.isNull(i39) ? null : cursor.getString(i39);
        int i40 = i + 38;
        String string29 = cursor.isNull(i40) ? null : cursor.getString(i40);
        int i41 = i + 39;
        String string30 = cursor.isNull(i41) ? null : cursor.getString(i41);
        int i42 = i + 40;
        return new Trackdata(lValueOf, numValueOf, numValueOf2, lValueOf2, numValueOf3, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, cursor.isNull(i42) ? null : cursor.getString(i42));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Trackdata trackdata, int i) {
        int i2 = i + 0;
        trackdata.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trackdata.setSource(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        trackdata.setType(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        trackdata.setTrackid(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        trackdata.setSegment(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        trackdata.setBulkll(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        trackdata.setBulkgait(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        trackdata.setBulkal(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        trackdata.setBulkacc(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        trackdata.setBulktime(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        trackdata.setBulkflag(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 11;
        trackdata.setBulkpace(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 12;
        trackdata.setBulkpause(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 13;
        trackdata.setKilomarked(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 14;
        trackdata.setBulkdistance(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 15;
        trackdata.setBulkbarometerAltitude(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i + 16;
        trackdata.setBulkhr(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i + 17;
        trackdata.setMilemarked(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i20 = i + 18;
        trackdata.setSize(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i + 19;
        trackdata.setV(cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
        int i22 = i + 20;
        trackdata.setCompressed(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
        int i23 = i + 21;
        trackdata.setProvider(cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23)));
        int i24 = i + 22;
        trackdata.setSynced(cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24)));
        int i25 = i + 23;
        trackdata.setCorrectAltitude(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i + 24;
        trackdata.setStrokeSpeed(cursor.isNull(i26) ? null : cursor.getString(i26));
        int i27 = i + 25;
        trackdata.setCadence(cursor.isNull(i27) ? null : cursor.getString(i27));
        int i28 = i + 26;
        trackdata.setDailyPerformance(cursor.isNull(i28) ? null : cursor.getString(i28));
        int i29 = i + 27;
        trackdata.setLap(cursor.isNull(i29) ? null : cursor.getString(i29));
        int i30 = i + 28;
        trackdata.setBulkspeed(cursor.isNull(i30) ? null : cursor.getString(i30));
        int i31 = i + 29;
        trackdata.setCoachSegment(cursor.isNull(i31) ? null : cursor.getString(i31));
        int i32 = i + 30;
        trackdata.setWeatherInfo(cursor.isNull(i32) ? null : cursor.getString(i32));
        int i33 = i + 31;
        trackdata.setBulkRopeSkippingFreq(cursor.isNull(i33) ? null : cursor.getString(i33));
        int i34 = i + 32;
        trackdata.setFriendId(cursor.isNull(i34) ? null : cursor.getString(i34));
        int i35 = i + 33;
        trackdata.setBulkspo2(cursor.isNull(i35) ? null : cursor.getString(i35));
        int i36 = i + 34;
        trackdata.setBulkPressure(cursor.isNull(i36) ? null : cursor.getString(i36));
        int i37 = i + 35;
        trackdata.setBulkTemperature(cursor.isNull(i37) ? null : cursor.getString(i37));
        int i38 = i + 36;
        trackdata.setTimeDeltaAltitude(cursor.isNull(i38) ? null : cursor.getString(i38));
        int i39 = i + 37;
        trackdata.setGolfBeat(cursor.isNull(i39) ? null : cursor.getString(i39));
        int i40 = i + 38;
        trackdata.setGolfAngle(cursor.isNull(i40) ? null : cursor.getString(i40));
        int i41 = i + 39;
        trackdata.setGolfUpTime(cursor.isNull(i41) ? null : cursor.getString(i41));
        int i42 = i + 40;
        trackdata.setGolfDownTime(cursor.isNull(i42) ? null : cursor.getString(i42));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Trackdata trackdata) {
        sQLiteStatement.clearBindings();
        Long id = trackdata.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Integer source = trackdata.getSource();
        if (source != null) {
            sQLiteStatement.bindLong(2, source.intValue());
        }
        Integer type = trackdata.getType();
        if (type != null) {
            sQLiteStatement.bindLong(3, type.intValue());
        }
        Long trackid = trackdata.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(4, trackid.longValue());
        }
        Integer segment = trackdata.getSegment();
        if (segment != null) {
            sQLiteStatement.bindLong(5, segment.intValue());
        }
        String bulkll = trackdata.getBulkll();
        if (bulkll != null) {
            sQLiteStatement.bindString(6, bulkll);
        }
        String bulkgait = trackdata.getBulkgait();
        if (bulkgait != null) {
            sQLiteStatement.bindString(7, bulkgait);
        }
        String bulkal = trackdata.getBulkal();
        if (bulkal != null) {
            sQLiteStatement.bindString(8, bulkal);
        }
        String bulkacc = trackdata.getBulkacc();
        if (bulkacc != null) {
            sQLiteStatement.bindString(9, bulkacc);
        }
        String bulktime = trackdata.getBulktime();
        if (bulktime != null) {
            sQLiteStatement.bindString(10, bulktime);
        }
        String bulkflag = trackdata.getBulkflag();
        if (bulkflag != null) {
            sQLiteStatement.bindString(11, bulkflag);
        }
        String bulkpace = trackdata.getBulkpace();
        if (bulkpace != null) {
            sQLiteStatement.bindString(12, bulkpace);
        }
        String bulkpause = trackdata.getBulkpause();
        if (bulkpause != null) {
            sQLiteStatement.bindString(13, bulkpause);
        }
        String kilomarked = trackdata.getKilomarked();
        if (kilomarked != null) {
            sQLiteStatement.bindString(14, kilomarked);
        }
        String bulkdistance = trackdata.getBulkdistance();
        if (bulkdistance != null) {
            sQLiteStatement.bindString(15, bulkdistance);
        }
        String bulkbarometerAltitude = trackdata.getBulkbarometerAltitude();
        if (bulkbarometerAltitude != null) {
            sQLiteStatement.bindString(16, bulkbarometerAltitude);
        }
        String bulkhr = trackdata.getBulkhr();
        if (bulkhr != null) {
            sQLiteStatement.bindString(17, bulkhr);
        }
        String milemarked = trackdata.getMilemarked();
        if (milemarked != null) {
            sQLiteStatement.bindString(18, milemarked);
        }
        Integer size = trackdata.getSize();
        if (size != null) {
            sQLiteStatement.bindLong(19, size.intValue());
        }
        Integer v = trackdata.getV();
        if (v != null) {
            sQLiteStatement.bindLong(20, v.intValue());
        }
        Integer compressed = trackdata.getCompressed();
        if (compressed != null) {
            sQLiteStatement.bindLong(21, compressed.intValue());
        }
        Integer provider = trackdata.getProvider();
        if (provider != null) {
            sQLiteStatement.bindLong(22, provider.intValue());
        }
        Integer synced = trackdata.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(23, synced.intValue());
        }
        String correctAltitude = trackdata.getCorrectAltitude();
        if (correctAltitude != null) {
            sQLiteStatement.bindString(24, correctAltitude);
        }
        String strokeSpeed = trackdata.getStrokeSpeed();
        if (strokeSpeed != null) {
            sQLiteStatement.bindString(25, strokeSpeed);
        }
        String cadence = trackdata.getCadence();
        if (cadence != null) {
            sQLiteStatement.bindString(26, cadence);
        }
        String dailyPerformance = trackdata.getDailyPerformance();
        if (dailyPerformance != null) {
            sQLiteStatement.bindString(27, dailyPerformance);
        }
        String lap = trackdata.getLap();
        if (lap != null) {
            sQLiteStatement.bindString(28, lap);
        }
        String bulkspeed = trackdata.getBulkspeed();
        if (bulkspeed != null) {
            sQLiteStatement.bindString(29, bulkspeed);
        }
        String coachSegment = trackdata.getCoachSegment();
        if (coachSegment != null) {
            sQLiteStatement.bindString(30, coachSegment);
        }
        String weatherInfo = trackdata.getWeatherInfo();
        if (weatherInfo != null) {
            sQLiteStatement.bindString(31, weatherInfo);
        }
        String bulkRopeSkippingFreq = trackdata.getBulkRopeSkippingFreq();
        if (bulkRopeSkippingFreq != null) {
            sQLiteStatement.bindString(32, bulkRopeSkippingFreq);
        }
        String friendId = trackdata.getFriendId();
        if (friendId != null) {
            sQLiteStatement.bindString(33, friendId);
        }
        String bulkspo2 = trackdata.getBulkspo2();
        if (bulkspo2 != null) {
            sQLiteStatement.bindString(34, bulkspo2);
        }
        String bulkPressure = trackdata.getBulkPressure();
        if (bulkPressure != null) {
            sQLiteStatement.bindString(35, bulkPressure);
        }
        String bulkTemperature = trackdata.getBulkTemperature();
        if (bulkTemperature != null) {
            sQLiteStatement.bindString(36, bulkTemperature);
        }
        String timeDeltaAltitude = trackdata.getTimeDeltaAltitude();
        if (timeDeltaAltitude != null) {
            sQLiteStatement.bindString(37, timeDeltaAltitude);
        }
        String golfBeat = trackdata.getGolfBeat();
        if (golfBeat != null) {
            sQLiteStatement.bindString(38, golfBeat);
        }
        String golfAngle = trackdata.getGolfAngle();
        if (golfAngle != null) {
            sQLiteStatement.bindString(39, golfAngle);
        }
        String golfUpTime = trackdata.getGolfUpTime();
        if (golfUpTime != null) {
            sQLiteStatement.bindString(40, golfUpTime);
        }
        String golfDownTime = trackdata.getGolfDownTime();
        if (golfDownTime != null) {
            sQLiteStatement.bindString(41, golfDownTime);
        }
    }
}
