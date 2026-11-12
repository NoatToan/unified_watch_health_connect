package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.stats.CodePackage;
import com.huami.android.zxing.Intents;
import com.huami.mifit.sportlib.model.CoachSegment;
import com.huami.passport.user.IAuthService;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrackrecordDao extends AbstractDao<Trackrecord, Long> {
    public static final String TABLENAME = "TRACKRECORD";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Source = new Property(1, Integer.class, "source", false, "SOURCE");
        public static final Property Type = new Property(2, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Date = new Property(3, String.class, "date", false, "DATE");
        public static final Property Trackid = new Property(4, Long.class, "trackid", false, "TRACKID");
        public static final Property Distance = new Property(5, Integer.class, "distance", false, "DISTANCE");
        public static final Property Costtime = new Property(6, Integer.class, "costtime", false, "COSTTIME");
        public static final Property Cal = new Property(7, Integer.class, "cal", false, "CAL");
        public static final Property Pace = new Property(8, Float.class, "pace", false, "PACE");
        public static final Property Sfreq = new Property(9, Integer.class, "sfreq", false, "SFREQ");
        public static final Property Avghr = new Property(10, Integer.class, CoachSegment.AVG_HR, false, "AVGHR");
        public static final Property Ffpercent = new Property(11, Integer.class, "ffpercent", false, "FFPERCENT");
        public static final Property V = new Property(12, Integer.class, "v", false, "V");
        public static final Property Endtime = new Property(13, Long.class, "endtime", false, "ENDTIME");
        public static final Property Maxrtp = new Property(14, Float.class, "maxrtp", false, "MAXRTP");
        public static final Property Minrtp = new Property(15, Float.class, "minrtp", false, "MINRTP");
        public static final Property Device = new Property(16, String.class, "device", false, "DEVICE");
        public static final Property Summary = new Property(17, String.class, "summary", false, "SUMMARY");
        public static final Property Location = new Property(18, String.class, "location", false, CodePackage.LOCATION);
        public static final Property Locationdesc = new Property(19, String.class, "locationdesc", false, "LOCATIONDESC");
        public static final Property State = new Property(20, Integer.class, "state", false, IAuthService.STATE.STATE);
        public static final Property Statistics = new Property(21, String.class, StatEvent.BF_OPERATION_STATICS_TYPE, false, "STATISTICS");
        public static final Property Size = new Property(22, Integer.class, "size", false, "SIZE");
        public static final Property Contoururi = new Property(23, String.class, "contoururi", false, "CONTOURURI");
        public static final Property Statisticed = new Property(24, Integer.class, "statisticed", false, "STATISTICED");
        public static final Property Synced = new Property(25, Integer.class, "synced", false, "SYNCED");
        public static final Property AltitudeAscend = new Property(26, Integer.class, "altitudeAscend", false, "ALTITUDE_ASCEND");
        public static final Property AltitudeDescend = new Property(27, Integer.class, "altitudeDescend", false, "ALTITUDE_DESCEND");
        public static final Property TotalStep = new Property(28, Integer.class, "totalStep", false, "TOTAL_STEP");
        public static final Property AvgStrideLength = new Property(29, Integer.class, "avgStrideLength", false, "AVG_STRIDE_LENGTH");
        public static final Property ClimbDisascend = new Property(30, Integer.class, "climbDisascend", false, "CLIMB_DISASCEND");
        public static final Property MaxCadence = new Property(31, Integer.class, "maxCadence", false, "MAX_CADENCE");
        public static final Property AvgCadence = new Property(32, Integer.class, "avgCadence", false, "AVG_CADENCE");
        public static final Property LandingTime = new Property(33, Integer.class, "landingTime", false, "LANDING_TIME");
        public static final Property FlightRatio = new Property(34, Integer.class, "flightRatio", false, "FLIGHT_RATIO");
        public static final Property ClimbDisDescend = new Property(35, Integer.class, "climbDisDescend", false, "CLIMB_DIS_DESCEND");
        public static final Property ClimbDisAscendTime = new Property(36, Integer.class, "climbDisAscendTime", false, "CLIMB_DIS_ASCEND_TIME");
        public static final Property ClimbDisDescendTime = new Property(37, Integer.class, "climbDisDescendTime", false, "CLIMB_DIS_DESCEND_TIME");
        public static final Property ParentTrackId = new Property(38, Long.class, "parentTrackId", false, "PARENT_TRACK_ID");
        public static final Property ChildListData = new Property(39, String.class, "childListData", false, "CHILD_LIST_DATA");
        public static final Property MaxHR = new Property(40, Integer.class, "maxHR", false, "MAX_HR");
        public static final Property MinHR = new Property(41, Integer.class, "minHR", false, "MIN_HR");
        public static final Property Unit = new Property(42, Integer.class, "unit", false, "UNIT");
        public static final Property TeValue = new Property(43, Integer.class, "teValue", false, "TE_VALUE");
        public static final Property SwimSWOLF = new Property(44, Integer.class, "swimSWOLF", false, "SWIM_SWOLF");
        public static final Property SwimStrokes = new Property(45, Integer.class, "swimStrokes", false, "SWIM_STROKES");
        public static final Property SwimTurns = new Property(46, Integer.class, "swimTurns", false, "SWIM_TURNS");
        public static final Property SwimAvgStrokeSpeed = new Property(47, Float.class, "swimAvgStrokeSpeed", false, "SWIM_AVG_STROKE_SPEED");
        public static final Property SwimMaxStrokeSpeed = new Property(48, Float.class, "swimMaxStrokeSpeed", false, "SWIM_MAX_STROKE_SPEED");
        public static final Property SwimDistancePerStroke = new Property(49, Float.class, "swimDistancePerStroke", false, "SWIM_DISTANCE_PER_STROKE");
        public static final Property SwimPoolLength = new Property(50, Integer.class, "swimPoolLength", false, "SWIM_POOL_LENGTH");
        public static final Property SwimStyle = new Property(51, Integer.class, "swimStyle", false, "SWIM_STYLE");
        public static final Property IndoorRunCalibrated = new Property(52, Integer.class, "indoorRunCalibrated", false, "INDOOR_RUN_CALIBRATED");
        public static final Property LeftLandingTime = new Property(53, Integer.class, "leftLandingTime", false, "LEFT_LANDING_TIME");
        public static final Property LeftFlightRatio = new Property(54, Integer.class, "leftFlightRatio", false, "LEFT_FLIGHT_RATIO");
        public static final Property RightLandingTime = new Property(55, Integer.class, "rightLandingTime", false, "RIGHT_LANDING_TIME");
        public static final Property RightFlightRatio = new Property(56, Integer.class, "rightFlightRatio", false, "RIGHT_FLIGHT_RATIO");
        public static final Property AddInfo = new Property(57, String.class, "addInfo", false, "ADD_INFO");
        public static final Property OriginalJsonData = new Property(58, String.class, "originalJsonData", false, "ORIGINAL_JSON_DATA");
        public static final Property TouchStrokes = new Property(59, Integer.TYPE, "touchStrokes", false, "TOUCH_STROKES");
        public static final Property FriendId = new Property(60, String.class, "friendId", false, "FRIEND_ID");
    }

    public TrackrecordDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRACKRECORD\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"SOURCE\" INTEGER,\"TYPE\" INTEGER,\"DATE\" TEXT,\"TRACKID\" INTEGER,\"DISTANCE\" INTEGER,\"COSTTIME\" INTEGER,\"CAL\" INTEGER,\"PACE\" REAL,\"SFREQ\" INTEGER,\"AVGHR\" INTEGER,\"FFPERCENT\" INTEGER,\"V\" INTEGER,\"ENDTIME\" INTEGER,\"MAXRTP\" REAL,\"MINRTP\" REAL,\"DEVICE\" TEXT,\"SUMMARY\" TEXT,\"LOCATION\" TEXT,\"LOCATIONDESC\" TEXT,\"STATE\" INTEGER,\"STATISTICS\" TEXT,\"SIZE\" INTEGER,\"CONTOURURI\" TEXT,\"STATISTICED\" INTEGER,\"SYNCED\" INTEGER,\"ALTITUDE_ASCEND\" INTEGER,\"ALTITUDE_DESCEND\" INTEGER,\"TOTAL_STEP\" INTEGER,\"AVG_STRIDE_LENGTH\" INTEGER,\"CLIMB_DISASCEND\" INTEGER,\"MAX_CADENCE\" INTEGER,\"AVG_CADENCE\" INTEGER,\"LANDING_TIME\" INTEGER,\"FLIGHT_RATIO\" INTEGER,\"CLIMB_DIS_DESCEND\" INTEGER,\"CLIMB_DIS_ASCEND_TIME\" INTEGER,\"CLIMB_DIS_DESCEND_TIME\" INTEGER,\"PARENT_TRACK_ID\" INTEGER,\"CHILD_LIST_DATA\" TEXT,\"MAX_HR\" INTEGER,\"MIN_HR\" INTEGER,\"UNIT\" INTEGER,\"TE_VALUE\" INTEGER,\"SWIM_SWOLF\" INTEGER,\"SWIM_STROKES\" INTEGER,\"SWIM_TURNS\" INTEGER,\"SWIM_AVG_STROKE_SPEED\" REAL,\"SWIM_MAX_STROKE_SPEED\" REAL,\"SWIM_DISTANCE_PER_STROKE\" REAL,\"SWIM_POOL_LENGTH\" INTEGER,\"SWIM_STYLE\" INTEGER,\"INDOOR_RUN_CALIBRATED\" INTEGER,\"LEFT_LANDING_TIME\" INTEGER,\"LEFT_FLIGHT_RATIO\" INTEGER,\"RIGHT_LANDING_TIME\" INTEGER,\"RIGHT_FLIGHT_RATIO\" INTEGER,\"ADD_INFO\" TEXT,\"ORIGINAL_JSON_DATA\" TEXT,\"TOUCH_STROKES\" INTEGER NOT NULL ,\"FRIEND_ID\" TEXT,UNIQUE (SOURCE,TYPE,TRACKID) ON CONFLICT REPLACE);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRACKRECORD\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrackrecordDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Trackrecord trackrecord) {
        if (trackrecord != null) {
            return trackrecord.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Trackrecord trackrecord) {
        return trackrecord.getId() != null;
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
    public final Long updateKeyAfterInsert(Trackrecord trackrecord, long j) {
        trackrecord.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Trackrecord trackrecord) {
        databaseStatement.clearBindings();
        Long id = trackrecord.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Integer source = trackrecord.getSource();
        if (source != null) {
            databaseStatement.bindLong(2, source.intValue());
        }
        Integer type = trackrecord.getType();
        if (type != null) {
            databaseStatement.bindLong(3, type.intValue());
        }
        String date = trackrecord.getDate();
        if (date != null) {
            databaseStatement.bindString(4, date);
        }
        Long trackid = trackrecord.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(5, trackid.longValue());
        }
        Integer distance = trackrecord.getDistance();
        if (distance != null) {
            databaseStatement.bindLong(6, distance.intValue());
        }
        Integer costtime = trackrecord.getCosttime();
        if (costtime != null) {
            databaseStatement.bindLong(7, costtime.intValue());
        }
        Integer cal = trackrecord.getCal();
        if (cal != null) {
            databaseStatement.bindLong(8, cal.intValue());
        }
        Float pace = trackrecord.getPace();
        if (pace != null) {
            databaseStatement.bindDouble(9, pace.floatValue());
        }
        Integer sfreq = trackrecord.getSfreq();
        if (sfreq != null) {
            databaseStatement.bindLong(10, sfreq.intValue());
        }
        Integer avghr = trackrecord.getAvghr();
        if (avghr != null) {
            databaseStatement.bindLong(11, avghr.intValue());
        }
        Integer ffpercent = trackrecord.getFfpercent();
        if (ffpercent != null) {
            databaseStatement.bindLong(12, ffpercent.intValue());
        }
        Integer v = trackrecord.getV();
        if (v != null) {
            databaseStatement.bindLong(13, v.intValue());
        }
        Long endtime = trackrecord.getEndtime();
        if (endtime != null) {
            databaseStatement.bindLong(14, endtime.longValue());
        }
        Float maxrtp = trackrecord.getMaxrtp();
        if (maxrtp != null) {
            databaseStatement.bindDouble(15, maxrtp.floatValue());
        }
        Float minrtp = trackrecord.getMinrtp();
        if (minrtp != null) {
            databaseStatement.bindDouble(16, minrtp.floatValue());
        }
        String device = trackrecord.getDevice();
        if (device != null) {
            databaseStatement.bindString(17, device);
        }
        String summary = trackrecord.getSummary();
        if (summary != null) {
            databaseStatement.bindString(18, summary);
        }
        String location = trackrecord.getLocation();
        if (location != null) {
            databaseStatement.bindString(19, location);
        }
        String locationdesc = trackrecord.getLocationdesc();
        if (locationdesc != null) {
            databaseStatement.bindString(20, locationdesc);
        }
        Integer state = trackrecord.getState();
        if (state != null) {
            databaseStatement.bindLong(21, state.intValue());
        }
        String statistics = trackrecord.getStatistics();
        if (statistics != null) {
            databaseStatement.bindString(22, statistics);
        }
        Integer size = trackrecord.getSize();
        if (size != null) {
            databaseStatement.bindLong(23, size.intValue());
        }
        String contoururi = trackrecord.getContoururi();
        if (contoururi != null) {
            databaseStatement.bindString(24, contoururi);
        }
        Integer statisticed = trackrecord.getStatisticed();
        if (statisticed != null) {
            databaseStatement.bindLong(25, statisticed.intValue());
        }
        Integer synced = trackrecord.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(26, synced.intValue());
        }
        Integer altitudeAscend = trackrecord.getAltitudeAscend();
        if (altitudeAscend != null) {
            databaseStatement.bindLong(27, altitudeAscend.intValue());
        }
        Integer altitudeDescend = trackrecord.getAltitudeDescend();
        if (altitudeDescend != null) {
            databaseStatement.bindLong(28, altitudeDescend.intValue());
        }
        Integer totalStep = trackrecord.getTotalStep();
        if (totalStep != null) {
            databaseStatement.bindLong(29, totalStep.intValue());
        }
        Integer avgStrideLength = trackrecord.getAvgStrideLength();
        if (avgStrideLength != null) {
            databaseStatement.bindLong(30, avgStrideLength.intValue());
        }
        Integer climbDisascend = trackrecord.getClimbDisascend();
        if (climbDisascend != null) {
            databaseStatement.bindLong(31, climbDisascend.intValue());
        }
        Integer maxCadence = trackrecord.getMaxCadence();
        if (maxCadence != null) {
            databaseStatement.bindLong(32, maxCadence.intValue());
        }
        Integer avgCadence = trackrecord.getAvgCadence();
        if (avgCadence != null) {
            databaseStatement.bindLong(33, avgCadence.intValue());
        }
        Integer landingTime = trackrecord.getLandingTime();
        if (landingTime != null) {
            databaseStatement.bindLong(34, landingTime.intValue());
        }
        Integer flightRatio = trackrecord.getFlightRatio();
        if (flightRatio != null) {
            databaseStatement.bindLong(35, flightRatio.intValue());
        }
        Integer climbDisDescend = trackrecord.getClimbDisDescend();
        if (climbDisDescend != null) {
            databaseStatement.bindLong(36, climbDisDescend.intValue());
        }
        Integer climbDisAscendTime = trackrecord.getClimbDisAscendTime();
        if (climbDisAscendTime != null) {
            databaseStatement.bindLong(37, climbDisAscendTime.intValue());
        }
        Integer climbDisDescendTime = trackrecord.getClimbDisDescendTime();
        if (climbDisDescendTime != null) {
            databaseStatement.bindLong(38, climbDisDescendTime.intValue());
        }
        Long parentTrackId = trackrecord.getParentTrackId();
        if (parentTrackId != null) {
            databaseStatement.bindLong(39, parentTrackId.longValue());
        }
        String childListData = trackrecord.getChildListData();
        if (childListData != null) {
            databaseStatement.bindString(40, childListData);
        }
        Integer maxHR = trackrecord.getMaxHR();
        if (maxHR != null) {
            databaseStatement.bindLong(41, maxHR.intValue());
        }
        Integer minHR = trackrecord.getMinHR();
        if (minHR != null) {
            databaseStatement.bindLong(42, minHR.intValue());
        }
        Integer unit = trackrecord.getUnit();
        if (unit != null) {
            databaseStatement.bindLong(43, unit.intValue());
        }
        Integer teValue = trackrecord.getTeValue();
        if (teValue != null) {
            databaseStatement.bindLong(44, teValue.intValue());
        }
        Integer swimSWOLF = trackrecord.getSwimSWOLF();
        if (swimSWOLF != null) {
            databaseStatement.bindLong(45, swimSWOLF.intValue());
        }
        Integer swimStrokes = trackrecord.getSwimStrokes();
        if (swimStrokes != null) {
            databaseStatement.bindLong(46, swimStrokes.intValue());
        }
        Integer swimTurns = trackrecord.getSwimTurns();
        if (swimTurns != null) {
            databaseStatement.bindLong(47, swimTurns.intValue());
        }
        Float swimAvgStrokeSpeed = trackrecord.getSwimAvgStrokeSpeed();
        if (swimAvgStrokeSpeed != null) {
            databaseStatement.bindDouble(48, swimAvgStrokeSpeed.floatValue());
        }
        Float swimMaxStrokeSpeed = trackrecord.getSwimMaxStrokeSpeed();
        if (swimMaxStrokeSpeed != null) {
            databaseStatement.bindDouble(49, swimMaxStrokeSpeed.floatValue());
        }
        Float swimDistancePerStroke = trackrecord.getSwimDistancePerStroke();
        if (swimDistancePerStroke != null) {
            databaseStatement.bindDouble(50, swimDistancePerStroke.floatValue());
        }
        Integer swimPoolLength = trackrecord.getSwimPoolLength();
        if (swimPoolLength != null) {
            databaseStatement.bindLong(51, swimPoolLength.intValue());
        }
        Integer swimStyle = trackrecord.getSwimStyle();
        if (swimStyle != null) {
            databaseStatement.bindLong(52, swimStyle.intValue());
        }
        Integer indoorRunCalibrated = trackrecord.getIndoorRunCalibrated();
        if (indoorRunCalibrated != null) {
            databaseStatement.bindLong(53, indoorRunCalibrated.intValue());
        }
        Integer leftLandingTime = trackrecord.getLeftLandingTime();
        if (leftLandingTime != null) {
            databaseStatement.bindLong(54, leftLandingTime.intValue());
        }
        Integer leftFlightRatio = trackrecord.getLeftFlightRatio();
        if (leftFlightRatio != null) {
            databaseStatement.bindLong(55, leftFlightRatio.intValue());
        }
        Integer rightLandingTime = trackrecord.getRightLandingTime();
        if (rightLandingTime != null) {
            databaseStatement.bindLong(56, rightLandingTime.intValue());
        }
        Integer rightFlightRatio = trackrecord.getRightFlightRatio();
        if (rightFlightRatio != null) {
            databaseStatement.bindLong(57, rightFlightRatio.intValue());
        }
        String addInfo = trackrecord.getAddInfo();
        if (addInfo != null) {
            databaseStatement.bindString(58, addInfo);
        }
        String originalJsonData = trackrecord.getOriginalJsonData();
        if (originalJsonData != null) {
            databaseStatement.bindString(59, originalJsonData);
        }
        databaseStatement.bindLong(60, trackrecord.getTouchStrokes());
        String friendId = trackrecord.getFriendId();
        if (friendId != null) {
            databaseStatement.bindString(61, friendId);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Trackrecord readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Integer numValueOf = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 2;
        Integer numValueOf2 = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        String string = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        Long lValueOf2 = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 5;
        Integer numValueOf3 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        Integer numValueOf4 = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        Integer numValueOf5 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i + 8;
        Float fValueOf = cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10));
        int i11 = i + 9;
        Integer numValueOf6 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i + 10;
        Integer numValueOf7 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i + 11;
        Integer numValueOf8 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i + 12;
        Integer numValueOf9 = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i + 13;
        Long lValueOf3 = cursor.isNull(i15) ? null : Long.valueOf(cursor.getLong(i15));
        int i16 = i + 14;
        Float fValueOf2 = cursor.isNull(i16) ? null : Float.valueOf(cursor.getFloat(i16));
        int i17 = i + 15;
        Float fValueOf3 = cursor.isNull(i17) ? null : Float.valueOf(cursor.getFloat(i17));
        int i18 = i + 16;
        String string2 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 17;
        String string3 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 18;
        String string4 = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = i + 19;
        String string5 = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i + 20;
        Integer numValueOf10 = cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22));
        int i23 = i + 21;
        String string6 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 22;
        Integer numValueOf11 = cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24));
        int i25 = i + 23;
        String string7 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 24;
        Integer numValueOf12 = cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26));
        int i27 = i + 25;
        Integer numValueOf13 = cursor.isNull(i27) ? null : Integer.valueOf(cursor.getInt(i27));
        int i28 = i + 26;
        Integer numValueOf14 = cursor.isNull(i28) ? null : Integer.valueOf(cursor.getInt(i28));
        int i29 = i + 27;
        Integer numValueOf15 = cursor.isNull(i29) ? null : Integer.valueOf(cursor.getInt(i29));
        int i30 = i + 28;
        Integer numValueOf16 = cursor.isNull(i30) ? null : Integer.valueOf(cursor.getInt(i30));
        int i31 = i + 29;
        Integer numValueOf17 = cursor.isNull(i31) ? null : Integer.valueOf(cursor.getInt(i31));
        int i32 = i + 30;
        Integer numValueOf18 = cursor.isNull(i32) ? null : Integer.valueOf(cursor.getInt(i32));
        int i33 = i + 31;
        Integer numValueOf19 = cursor.isNull(i33) ? null : Integer.valueOf(cursor.getInt(i33));
        int i34 = i + 32;
        Integer numValueOf20 = cursor.isNull(i34) ? null : Integer.valueOf(cursor.getInt(i34));
        int i35 = i + 33;
        Integer numValueOf21 = cursor.isNull(i35) ? null : Integer.valueOf(cursor.getInt(i35));
        int i36 = i + 34;
        Integer numValueOf22 = cursor.isNull(i36) ? null : Integer.valueOf(cursor.getInt(i36));
        int i37 = i + 35;
        Integer numValueOf23 = cursor.isNull(i37) ? null : Integer.valueOf(cursor.getInt(i37));
        int i38 = i + 36;
        Integer numValueOf24 = cursor.isNull(i38) ? null : Integer.valueOf(cursor.getInt(i38));
        int i39 = i + 37;
        Integer numValueOf25 = cursor.isNull(i39) ? null : Integer.valueOf(cursor.getInt(i39));
        int i40 = i + 38;
        Long lValueOf4 = cursor.isNull(i40) ? null : Long.valueOf(cursor.getLong(i40));
        int i41 = i + 39;
        String string8 = cursor.isNull(i41) ? null : cursor.getString(i41);
        int i42 = i + 40;
        Integer numValueOf26 = cursor.isNull(i42) ? null : Integer.valueOf(cursor.getInt(i42));
        int i43 = i + 41;
        Integer numValueOf27 = cursor.isNull(i43) ? null : Integer.valueOf(cursor.getInt(i43));
        int i44 = i + 42;
        Integer numValueOf28 = cursor.isNull(i44) ? null : Integer.valueOf(cursor.getInt(i44));
        int i45 = i + 43;
        Integer numValueOf29 = cursor.isNull(i45) ? null : Integer.valueOf(cursor.getInt(i45));
        int i46 = i + 44;
        Integer numValueOf30 = cursor.isNull(i46) ? null : Integer.valueOf(cursor.getInt(i46));
        int i47 = i + 45;
        Integer numValueOf31 = cursor.isNull(i47) ? null : Integer.valueOf(cursor.getInt(i47));
        int i48 = i + 46;
        Integer numValueOf32 = cursor.isNull(i48) ? null : Integer.valueOf(cursor.getInt(i48));
        int i49 = i + 47;
        Float fValueOf4 = cursor.isNull(i49) ? null : Float.valueOf(cursor.getFloat(i49));
        int i50 = i + 48;
        Float fValueOf5 = cursor.isNull(i50) ? null : Float.valueOf(cursor.getFloat(i50));
        int i51 = i + 49;
        Float fValueOf6 = cursor.isNull(i51) ? null : Float.valueOf(cursor.getFloat(i51));
        int i52 = i + 50;
        Integer numValueOf33 = cursor.isNull(i52) ? null : Integer.valueOf(cursor.getInt(i52));
        int i53 = i + 51;
        Integer numValueOf34 = cursor.isNull(i53) ? null : Integer.valueOf(cursor.getInt(i53));
        int i54 = i + 52;
        Integer numValueOf35 = cursor.isNull(i54) ? null : Integer.valueOf(cursor.getInt(i54));
        int i55 = i + 53;
        Integer numValueOf36 = cursor.isNull(i55) ? null : Integer.valueOf(cursor.getInt(i55));
        int i56 = i + 54;
        Integer numValueOf37 = cursor.isNull(i56) ? null : Integer.valueOf(cursor.getInt(i56));
        int i57 = i + 55;
        Integer numValueOf38 = cursor.isNull(i57) ? null : Integer.valueOf(cursor.getInt(i57));
        int i58 = i + 56;
        Integer numValueOf39 = cursor.isNull(i58) ? null : Integer.valueOf(cursor.getInt(i58));
        int i59 = i + 57;
        String string9 = cursor.isNull(i59) ? null : cursor.getString(i59);
        int i60 = i + 58;
        String string10 = cursor.isNull(i60) ? null : cursor.getString(i60);
        int i61 = i + 60;
        return new Trackrecord(lValueOf, numValueOf, numValueOf2, string, lValueOf2, numValueOf3, numValueOf4, numValueOf5, fValueOf, numValueOf6, numValueOf7, numValueOf8, numValueOf9, lValueOf3, fValueOf2, fValueOf3, string2, string3, string4, string5, numValueOf10, string6, numValueOf11, string7, numValueOf12, numValueOf13, numValueOf14, numValueOf15, numValueOf16, numValueOf17, numValueOf18, numValueOf19, numValueOf20, numValueOf21, numValueOf22, numValueOf23, numValueOf24, numValueOf25, lValueOf4, string8, numValueOf26, numValueOf27, numValueOf28, numValueOf29, numValueOf30, numValueOf31, numValueOf32, fValueOf4, fValueOf5, fValueOf6, numValueOf33, numValueOf34, numValueOf35, numValueOf36, numValueOf37, numValueOf38, numValueOf39, string9, string10, cursor.getInt(i + 59), cursor.isNull(i61) ? null : cursor.getString(i61));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Trackrecord trackrecord, int i) {
        int i2 = i + 0;
        trackrecord.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trackrecord.setSource(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        trackrecord.setType(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        trackrecord.setDate(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        trackrecord.setTrackid(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i + 5;
        trackrecord.setDistance(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        trackrecord.setCosttime(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        trackrecord.setCal(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 8;
        trackrecord.setPace(cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)));
        int i11 = i + 9;
        trackrecord.setSfreq(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 10;
        trackrecord.setAvghr(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 11;
        trackrecord.setFfpercent(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i + 12;
        trackrecord.setV(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i + 13;
        trackrecord.setEndtime(cursor.isNull(i15) ? null : Long.valueOf(cursor.getLong(i15)));
        int i16 = i + 14;
        trackrecord.setMaxrtp(cursor.isNull(i16) ? null : Float.valueOf(cursor.getFloat(i16)));
        int i17 = i + 15;
        trackrecord.setMinrtp(cursor.isNull(i17) ? null : Float.valueOf(cursor.getFloat(i17)));
        int i18 = i + 16;
        trackrecord.setDevice(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i + 17;
        trackrecord.setSummary(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i20 = i + 18;
        trackrecord.setLocation(cursor.isNull(i20) ? null : cursor.getString(i20));
        int i21 = i + 19;
        trackrecord.setLocationdesc(cursor.isNull(i21) ? null : cursor.getString(i21));
        int i22 = i + 20;
        trackrecord.setState(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
        int i23 = i + 21;
        trackrecord.setStatistics(cursor.isNull(i23) ? null : cursor.getString(i23));
        int i24 = i + 22;
        trackrecord.setSize(cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24)));
        int i25 = i + 23;
        trackrecord.setContoururi(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i + 24;
        trackrecord.setStatisticed(cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26)));
        int i27 = i + 25;
        trackrecord.setSynced(cursor.isNull(i27) ? null : Integer.valueOf(cursor.getInt(i27)));
        int i28 = i + 26;
        trackrecord.setAltitudeAscend(cursor.isNull(i28) ? null : Integer.valueOf(cursor.getInt(i28)));
        int i29 = i + 27;
        trackrecord.setAltitudeDescend(cursor.isNull(i29) ? null : Integer.valueOf(cursor.getInt(i29)));
        int i30 = i + 28;
        trackrecord.setTotalStep(cursor.isNull(i30) ? null : Integer.valueOf(cursor.getInt(i30)));
        int i31 = i + 29;
        trackrecord.setAvgStrideLength(cursor.isNull(i31) ? null : Integer.valueOf(cursor.getInt(i31)));
        int i32 = i + 30;
        trackrecord.setClimbDisascend(cursor.isNull(i32) ? null : Integer.valueOf(cursor.getInt(i32)));
        int i33 = i + 31;
        trackrecord.setMaxCadence(cursor.isNull(i33) ? null : Integer.valueOf(cursor.getInt(i33)));
        int i34 = i + 32;
        trackrecord.setAvgCadence(cursor.isNull(i34) ? null : Integer.valueOf(cursor.getInt(i34)));
        int i35 = i + 33;
        trackrecord.setLandingTime(cursor.isNull(i35) ? null : Integer.valueOf(cursor.getInt(i35)));
        int i36 = i + 34;
        trackrecord.setFlightRatio(cursor.isNull(i36) ? null : Integer.valueOf(cursor.getInt(i36)));
        int i37 = i + 35;
        trackrecord.setClimbDisDescend(cursor.isNull(i37) ? null : Integer.valueOf(cursor.getInt(i37)));
        int i38 = i + 36;
        trackrecord.setClimbDisAscendTime(cursor.isNull(i38) ? null : Integer.valueOf(cursor.getInt(i38)));
        int i39 = i + 37;
        trackrecord.setClimbDisDescendTime(cursor.isNull(i39) ? null : Integer.valueOf(cursor.getInt(i39)));
        int i40 = i + 38;
        trackrecord.setParentTrackId(cursor.isNull(i40) ? null : Long.valueOf(cursor.getLong(i40)));
        int i41 = i + 39;
        trackrecord.setChildListData(cursor.isNull(i41) ? null : cursor.getString(i41));
        int i42 = i + 40;
        trackrecord.setMaxHR(cursor.isNull(i42) ? null : Integer.valueOf(cursor.getInt(i42)));
        int i43 = i + 41;
        trackrecord.setMinHR(cursor.isNull(i43) ? null : Integer.valueOf(cursor.getInt(i43)));
        int i44 = i + 42;
        trackrecord.setUnit(cursor.isNull(i44) ? null : Integer.valueOf(cursor.getInt(i44)));
        int i45 = i + 43;
        trackrecord.setTeValue(cursor.isNull(i45) ? null : Integer.valueOf(cursor.getInt(i45)));
        int i46 = i + 44;
        trackrecord.setSwimSWOLF(cursor.isNull(i46) ? null : Integer.valueOf(cursor.getInt(i46)));
        int i47 = i + 45;
        trackrecord.setSwimStrokes(cursor.isNull(i47) ? null : Integer.valueOf(cursor.getInt(i47)));
        int i48 = i + 46;
        trackrecord.setSwimTurns(cursor.isNull(i48) ? null : Integer.valueOf(cursor.getInt(i48)));
        int i49 = i + 47;
        trackrecord.setSwimAvgStrokeSpeed(cursor.isNull(i49) ? null : Float.valueOf(cursor.getFloat(i49)));
        int i50 = i + 48;
        trackrecord.setSwimMaxStrokeSpeed(cursor.isNull(i50) ? null : Float.valueOf(cursor.getFloat(i50)));
        int i51 = i + 49;
        trackrecord.setSwimDistancePerStroke(cursor.isNull(i51) ? null : Float.valueOf(cursor.getFloat(i51)));
        int i52 = i + 50;
        trackrecord.setSwimPoolLength(cursor.isNull(i52) ? null : Integer.valueOf(cursor.getInt(i52)));
        int i53 = i + 51;
        trackrecord.setSwimStyle(cursor.isNull(i53) ? null : Integer.valueOf(cursor.getInt(i53)));
        int i54 = i + 52;
        trackrecord.setIndoorRunCalibrated(cursor.isNull(i54) ? null : Integer.valueOf(cursor.getInt(i54)));
        int i55 = i + 53;
        trackrecord.setLeftLandingTime(cursor.isNull(i55) ? null : Integer.valueOf(cursor.getInt(i55)));
        int i56 = i + 54;
        trackrecord.setLeftFlightRatio(cursor.isNull(i56) ? null : Integer.valueOf(cursor.getInt(i56)));
        int i57 = i + 55;
        trackrecord.setRightLandingTime(cursor.isNull(i57) ? null : Integer.valueOf(cursor.getInt(i57)));
        int i58 = i + 56;
        trackrecord.setRightFlightRatio(cursor.isNull(i58) ? null : Integer.valueOf(cursor.getInt(i58)));
        int i59 = i + 57;
        trackrecord.setAddInfo(cursor.isNull(i59) ? null : cursor.getString(i59));
        int i60 = i + 58;
        trackrecord.setOriginalJsonData(cursor.isNull(i60) ? null : cursor.getString(i60));
        trackrecord.setTouchStrokes(cursor.getInt(i + 59));
        int i61 = i + 60;
        trackrecord.setFriendId(cursor.isNull(i61) ? null : cursor.getString(i61));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Trackrecord trackrecord) {
        sQLiteStatement.clearBindings();
        Long id = trackrecord.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Integer source = trackrecord.getSource();
        if (source != null) {
            sQLiteStatement.bindLong(2, source.intValue());
        }
        Integer type = trackrecord.getType();
        if (type != null) {
            sQLiteStatement.bindLong(3, type.intValue());
        }
        String date = trackrecord.getDate();
        if (date != null) {
            sQLiteStatement.bindString(4, date);
        }
        Long trackid = trackrecord.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(5, trackid.longValue());
        }
        Integer distance = trackrecord.getDistance();
        if (distance != null) {
            sQLiteStatement.bindLong(6, distance.intValue());
        }
        Integer costtime = trackrecord.getCosttime();
        if (costtime != null) {
            sQLiteStatement.bindLong(7, costtime.intValue());
        }
        Integer cal = trackrecord.getCal();
        if (cal != null) {
            sQLiteStatement.bindLong(8, cal.intValue());
        }
        Float pace = trackrecord.getPace();
        if (pace != null) {
            sQLiteStatement.bindDouble(9, pace.floatValue());
        }
        Integer sfreq = trackrecord.getSfreq();
        if (sfreq != null) {
            sQLiteStatement.bindLong(10, sfreq.intValue());
        }
        Integer avghr = trackrecord.getAvghr();
        if (avghr != null) {
            sQLiteStatement.bindLong(11, avghr.intValue());
        }
        Integer ffpercent = trackrecord.getFfpercent();
        if (ffpercent != null) {
            sQLiteStatement.bindLong(12, ffpercent.intValue());
        }
        Integer v = trackrecord.getV();
        if (v != null) {
            sQLiteStatement.bindLong(13, v.intValue());
        }
        Long endtime = trackrecord.getEndtime();
        if (endtime != null) {
            sQLiteStatement.bindLong(14, endtime.longValue());
        }
        Float maxrtp = trackrecord.getMaxrtp();
        if (maxrtp != null) {
            sQLiteStatement.bindDouble(15, maxrtp.floatValue());
        }
        Float minrtp = trackrecord.getMinrtp();
        if (minrtp != null) {
            sQLiteStatement.bindDouble(16, minrtp.floatValue());
        }
        String device = trackrecord.getDevice();
        if (device != null) {
            sQLiteStatement.bindString(17, device);
        }
        String summary = trackrecord.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(18, summary);
        }
        String location = trackrecord.getLocation();
        if (location != null) {
            sQLiteStatement.bindString(19, location);
        }
        String locationdesc = trackrecord.getLocationdesc();
        if (locationdesc != null) {
            sQLiteStatement.bindString(20, locationdesc);
        }
        Integer state = trackrecord.getState();
        if (state != null) {
            sQLiteStatement.bindLong(21, state.intValue());
        }
        String statistics = trackrecord.getStatistics();
        if (statistics != null) {
            sQLiteStatement.bindString(22, statistics);
        }
        Integer size = trackrecord.getSize();
        if (size != null) {
            sQLiteStatement.bindLong(23, size.intValue());
        }
        String contoururi = trackrecord.getContoururi();
        if (contoururi != null) {
            sQLiteStatement.bindString(24, contoururi);
        }
        Integer statisticed = trackrecord.getStatisticed();
        if (statisticed != null) {
            sQLiteStatement.bindLong(25, statisticed.intValue());
        }
        Integer synced = trackrecord.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(26, synced.intValue());
        }
        Integer altitudeAscend = trackrecord.getAltitudeAscend();
        if (altitudeAscend != null) {
            sQLiteStatement.bindLong(27, altitudeAscend.intValue());
        }
        Integer altitudeDescend = trackrecord.getAltitudeDescend();
        if (altitudeDescend != null) {
            sQLiteStatement.bindLong(28, altitudeDescend.intValue());
        }
        Integer totalStep = trackrecord.getTotalStep();
        if (totalStep != null) {
            sQLiteStatement.bindLong(29, totalStep.intValue());
        }
        Integer avgStrideLength = trackrecord.getAvgStrideLength();
        if (avgStrideLength != null) {
            sQLiteStatement.bindLong(30, avgStrideLength.intValue());
        }
        Integer climbDisascend = trackrecord.getClimbDisascend();
        if (climbDisascend != null) {
            sQLiteStatement.bindLong(31, climbDisascend.intValue());
        }
        Integer maxCadence = trackrecord.getMaxCadence();
        if (maxCadence != null) {
            sQLiteStatement.bindLong(32, maxCadence.intValue());
        }
        Integer avgCadence = trackrecord.getAvgCadence();
        if (avgCadence != null) {
            sQLiteStatement.bindLong(33, avgCadence.intValue());
        }
        Integer landingTime = trackrecord.getLandingTime();
        if (landingTime != null) {
            sQLiteStatement.bindLong(34, landingTime.intValue());
        }
        Integer flightRatio = trackrecord.getFlightRatio();
        if (flightRatio != null) {
            sQLiteStatement.bindLong(35, flightRatio.intValue());
        }
        Integer climbDisDescend = trackrecord.getClimbDisDescend();
        if (climbDisDescend != null) {
            sQLiteStatement.bindLong(36, climbDisDescend.intValue());
        }
        Integer climbDisAscendTime = trackrecord.getClimbDisAscendTime();
        if (climbDisAscendTime != null) {
            sQLiteStatement.bindLong(37, climbDisAscendTime.intValue());
        }
        Integer climbDisDescendTime = trackrecord.getClimbDisDescendTime();
        if (climbDisDescendTime != null) {
            sQLiteStatement.bindLong(38, climbDisDescendTime.intValue());
        }
        Long parentTrackId = trackrecord.getParentTrackId();
        if (parentTrackId != null) {
            sQLiteStatement.bindLong(39, parentTrackId.longValue());
        }
        String childListData = trackrecord.getChildListData();
        if (childListData != null) {
            sQLiteStatement.bindString(40, childListData);
        }
        Integer maxHR = trackrecord.getMaxHR();
        if (maxHR != null) {
            sQLiteStatement.bindLong(41, maxHR.intValue());
        }
        Integer minHR = trackrecord.getMinHR();
        if (minHR != null) {
            sQLiteStatement.bindLong(42, minHR.intValue());
        }
        Integer unit = trackrecord.getUnit();
        if (unit != null) {
            sQLiteStatement.bindLong(43, unit.intValue());
        }
        Integer teValue = trackrecord.getTeValue();
        if (teValue != null) {
            sQLiteStatement.bindLong(44, teValue.intValue());
        }
        Integer swimSWOLF = trackrecord.getSwimSWOLF();
        if (swimSWOLF != null) {
            sQLiteStatement.bindLong(45, swimSWOLF.intValue());
        }
        Integer swimStrokes = trackrecord.getSwimStrokes();
        if (swimStrokes != null) {
            sQLiteStatement.bindLong(46, swimStrokes.intValue());
        }
        Integer swimTurns = trackrecord.getSwimTurns();
        if (swimTurns != null) {
            sQLiteStatement.bindLong(47, swimTurns.intValue());
        }
        Float swimAvgStrokeSpeed = trackrecord.getSwimAvgStrokeSpeed();
        if (swimAvgStrokeSpeed != null) {
            sQLiteStatement.bindDouble(48, swimAvgStrokeSpeed.floatValue());
        }
        Float swimMaxStrokeSpeed = trackrecord.getSwimMaxStrokeSpeed();
        if (swimMaxStrokeSpeed != null) {
            sQLiteStatement.bindDouble(49, swimMaxStrokeSpeed.floatValue());
        }
        Float swimDistancePerStroke = trackrecord.getSwimDistancePerStroke();
        if (swimDistancePerStroke != null) {
            sQLiteStatement.bindDouble(50, swimDistancePerStroke.floatValue());
        }
        Integer swimPoolLength = trackrecord.getSwimPoolLength();
        if (swimPoolLength != null) {
            sQLiteStatement.bindLong(51, swimPoolLength.intValue());
        }
        Integer swimStyle = trackrecord.getSwimStyle();
        if (swimStyle != null) {
            sQLiteStatement.bindLong(52, swimStyle.intValue());
        }
        Integer indoorRunCalibrated = trackrecord.getIndoorRunCalibrated();
        if (indoorRunCalibrated != null) {
            sQLiteStatement.bindLong(53, indoorRunCalibrated.intValue());
        }
        Integer leftLandingTime = trackrecord.getLeftLandingTime();
        if (leftLandingTime != null) {
            sQLiteStatement.bindLong(54, leftLandingTime.intValue());
        }
        Integer leftFlightRatio = trackrecord.getLeftFlightRatio();
        if (leftFlightRatio != null) {
            sQLiteStatement.bindLong(55, leftFlightRatio.intValue());
        }
        Integer rightLandingTime = trackrecord.getRightLandingTime();
        if (rightLandingTime != null) {
            sQLiteStatement.bindLong(56, rightLandingTime.intValue());
        }
        Integer rightFlightRatio = trackrecord.getRightFlightRatio();
        if (rightFlightRatio != null) {
            sQLiteStatement.bindLong(57, rightFlightRatio.intValue());
        }
        String addInfo = trackrecord.getAddInfo();
        if (addInfo != null) {
            sQLiteStatement.bindString(58, addInfo);
        }
        String originalJsonData = trackrecord.getOriginalJsonData();
        if (originalJsonData != null) {
            sQLiteStatement.bindString(59, originalJsonData);
        }
        sQLiteStatement.bindLong(60, trackrecord.getTouchStrokes());
        String friendId = trackrecord.getFriendId();
        if (friendId != null) {
            sQLiteStatement.bindString(61, friendId);
        }
    }
}
