package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.huami.android.zxing.Intents;
import com.huami.hmchartui.utils.Constant;
import com.huami.nfc.applet.EntityKt;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class WeightInfosDao extends AbstractDao<WeightInfos, Long> {
    public static final String TABLENAME = "WEIGHT_INFOS";

    public static class Properties {
        public static final Property EncryptImpedance;
        public static final Property HeartRate;
        public static final Property Pressure;
        public static final Property SkeletalMuscle;
        public static final Property SubcutaneousFat;
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Weight = new Property(1, Float.class, "Weight", false, "WEIGHT");
        public static final Property Timestamp = new Property(2, Long.class, RtspHeaders.B, false, "TIMESTAMP");
        public static final Property Type = new Property(3, Integer.class, "Type", false, Intents.WifiConnect.TYPE);
        public static final Property Sync = new Property(4, Integer.class, "sync", false, EntityKt.FETCH_APDU_MODE_SYNC);
        public static final Property Sync_qqhealth = new Property(5, Integer.class, "sync_qqhealth", false, "SYNC_QQHEALTH");
        public static final Property Time_zone = new Property(6, Integer.class, "time_zone", false, "TIME_ZONE");
        public static final Property Fat_percentage = new Property(7, String.class, "fat_percentage", false, "FAT_PERCENTAGE");
        public static final Property Source = new Property(8, Integer.class, "source", false, "SOURCE");
        public static final Property Impedance = new Property(9, Integer.class, ParamKey.impedance, false, "IMPEDANCE");
        public static final Property Bmi = new Property(10, Float.class, "bmi", false, StatEvent.BF_OPERATION_BMI_TYPE);
        public static final Property Height = new Property(11, Integer.class, "height", false, "HEIGHT");
        public static final Property Body_fat = new Property(12, Float.class, BFConstant.TYPE_BODY_FAT_AD, false, "BODY_FAT");
        public static final Property Muscle = new Property(13, Float.class, "muscle", false, "MUSCLE");
        public static final Property Body_shape_type = new Property(14, Integer.class, "body_shape_type", false, "BODY_SHAPE_TYPE");
        public static final Property Moisture = new Property(15, Float.class, "moisture", false, "MOISTURE");
        public static final Property Basal_metabolism = new Property(16, Integer.class, "basal_metabolism", false, "BASAL_METABOLISM");
        public static final Property Visceral_fat = new Property(17, Float.class, "visceral_fat", false, "VISCERAL_FAT");
        public static final Property Bone_mass = new Property(18, Float.class, "bone_mass", false, "BONE_MASS");
        public static final Property Score = new Property(19, Integer.class, "score", false, "SCORE");
        public static final Property Device_id = new Property(20, String.class, "device_id", false, "DEVICE_ID");
        public static final Property UserId = new Property(21, Long.class, "UserId", false, Constant.USER_ID);
        public static final Property Ofmt = new Property(22, Float.class, "ofmt", false, "OFMT");
        public static final Property Ma = new Property(23, Integer.class, "ma", false, "MA");
        public static final Property Pmr = new Property(24, Float.class, "pmr", false, "PMR");
        public static final Property Sbw = new Property(25, Float.class, "sbw", false, "SBW");

        static {
            Class cls = Integer.TYPE;
            HeartRate = new Property(26, cls, com.huami.watch.companion.dataflow.Constant.KEY_HR_VALUE, false, "HEART_RATE");
            Pressure = new Property(27, cls, "pressure", false, "PRESSURE");
            Class cls2 = Float.TYPE;
            SkeletalMuscle = new Property(28, cls2, ParamKey.skeletalMuscle, false, "SKELETAL_MUSCLE");
            SubcutaneousFat = new Property(29, cls2, ParamKey.subcutaneousFat, false, "SUBCUTANEOUS_FAT");
            EncryptImpedance = new Property(30, Integer.class, "encryptImpedance", false, "ENCRYPT_IMPEDANCE");
        }
    }

    public WeightInfosDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"WEIGHT_INFOS\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"WEIGHT\" REAL,\"TIMESTAMP\" INTEGER,\"TYPE\" INTEGER,\"SYNC\" INTEGER,\"SYNC_QQHEALTH\" INTEGER,\"TIME_ZONE\" INTEGER,\"FAT_PERCENTAGE\" TEXT,\"SOURCE\" INTEGER,\"IMPEDANCE\" INTEGER,\"BMI\" REAL,\"HEIGHT\" INTEGER,\"BODY_FAT\" REAL,\"MUSCLE\" REAL,\"BODY_SHAPE_TYPE\" INTEGER,\"MOISTURE\" REAL,\"BASAL_METABOLISM\" INTEGER,\"VISCERAL_FAT\" REAL,\"BONE_MASS\" REAL,\"SCORE\" INTEGER,\"DEVICE_ID\" TEXT,\"USER_ID\" INTEGER,\"OFMT\" REAL,\"MA\" INTEGER,\"PMR\" REAL,\"SBW\" REAL,\"HEART_RATE\" INTEGER NOT NULL ,\"PRESSURE\" INTEGER NOT NULL ,\"SKELETAL_MUSCLE\" REAL NOT NULL ,\"SUBCUTANEOUS_FAT\" REAL NOT NULL ,\"ENCRYPT_IMPEDANCE\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"WEIGHT_INFOS\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public WeightInfosDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(WeightInfos weightInfos) {
        if (weightInfos != null) {
            return weightInfos.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(WeightInfos weightInfos) {
        return weightInfos.getId() != null;
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
    public final Long updateKeyAfterInsert(WeightInfos weightInfos, long j) {
        weightInfos.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, WeightInfos weightInfos) {
        databaseStatement.clearBindings();
        Long id = weightInfos.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Float weight = weightInfos.getWeight();
        if (weight != null) {
            databaseStatement.bindDouble(2, weight.floatValue());
        }
        Long timestamp = weightInfos.getTimestamp();
        if (timestamp != null) {
            databaseStatement.bindLong(3, timestamp.longValue());
        }
        Integer type = weightInfos.getType();
        if (type != null) {
            databaseStatement.bindLong(4, type.intValue());
        }
        Integer sync = weightInfos.getSync();
        if (sync != null) {
            databaseStatement.bindLong(5, sync.intValue());
        }
        Integer sync_qqhealth = weightInfos.getSync_qqhealth();
        if (sync_qqhealth != null) {
            databaseStatement.bindLong(6, sync_qqhealth.intValue());
        }
        Integer time_zone = weightInfos.getTime_zone();
        if (time_zone != null) {
            databaseStatement.bindLong(7, time_zone.intValue());
        }
        String fat_percentage = weightInfos.getFat_percentage();
        if (fat_percentage != null) {
            databaseStatement.bindString(8, fat_percentage);
        }
        Integer source = weightInfos.getSource();
        if (source != null) {
            databaseStatement.bindLong(9, source.intValue());
        }
        Integer impedance = weightInfos.getImpedance();
        if (impedance != null) {
            databaseStatement.bindLong(10, impedance.intValue());
        }
        Float bmi = weightInfos.getBmi();
        if (bmi != null) {
            databaseStatement.bindDouble(11, bmi.floatValue());
        }
        Integer height = weightInfos.getHeight();
        if (height != null) {
            databaseStatement.bindLong(12, height.intValue());
        }
        Float body_fat = weightInfos.getBody_fat();
        if (body_fat != null) {
            databaseStatement.bindDouble(13, body_fat.floatValue());
        }
        Float muscle = weightInfos.getMuscle();
        if (muscle != null) {
            databaseStatement.bindDouble(14, muscle.floatValue());
        }
        Integer body_shape_type = weightInfos.getBody_shape_type();
        if (body_shape_type != null) {
            databaseStatement.bindLong(15, body_shape_type.intValue());
        }
        Float moisture = weightInfos.getMoisture();
        if (moisture != null) {
            databaseStatement.bindDouble(16, moisture.floatValue());
        }
        Integer basal_metabolism = weightInfos.getBasal_metabolism();
        if (basal_metabolism != null) {
            databaseStatement.bindLong(17, basal_metabolism.intValue());
        }
        Float visceral_fat = weightInfos.getVisceral_fat();
        if (visceral_fat != null) {
            databaseStatement.bindDouble(18, visceral_fat.floatValue());
        }
        Float bone_mass = weightInfos.getBone_mass();
        if (bone_mass != null) {
            databaseStatement.bindDouble(19, bone_mass.floatValue());
        }
        Integer score = weightInfos.getScore();
        if (score != null) {
            databaseStatement.bindLong(20, score.intValue());
        }
        String device_id = weightInfos.getDevice_id();
        if (device_id != null) {
            databaseStatement.bindString(21, device_id);
        }
        Long userId = weightInfos.getUserId();
        if (userId != null) {
            databaseStatement.bindLong(22, userId.longValue());
        }
        Float ofmt = weightInfos.getOfmt();
        if (ofmt != null) {
            databaseStatement.bindDouble(23, ofmt.floatValue());
        }
        Integer ma = weightInfos.getMa();
        if (ma != null) {
            databaseStatement.bindLong(24, ma.intValue());
        }
        Float pmr = weightInfos.getPmr();
        if (pmr != null) {
            databaseStatement.bindDouble(25, pmr.floatValue());
        }
        Float sbw = weightInfos.getSbw();
        if (sbw != null) {
            databaseStatement.bindDouble(26, sbw.floatValue());
        }
        databaseStatement.bindLong(27, weightInfos.getHeartRate());
        databaseStatement.bindLong(28, weightInfos.getPressure());
        databaseStatement.bindDouble(29, weightInfos.getSkeletalMuscle());
        databaseStatement.bindDouble(30, weightInfos.getSubcutaneousFat());
        Integer encryptImpedance = weightInfos.getEncryptImpedance();
        if (encryptImpedance != null) {
            databaseStatement.bindLong(31, encryptImpedance.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public WeightInfos readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Float fValueOf = cursor.isNull(i3) ? null : Float.valueOf(cursor.getFloat(i3));
        int i4 = i + 2;
        Long lValueOf2 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        Integer numValueOf2 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf3 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        Integer numValueOf4 = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        String string = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        Integer numValueOf5 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i + 9;
        Integer numValueOf6 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i + 10;
        Float fValueOf2 = cursor.isNull(i12) ? null : Float.valueOf(cursor.getFloat(i12));
        int i13 = i + 11;
        Integer numValueOf7 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i + 12;
        Float fValueOf3 = cursor.isNull(i14) ? null : Float.valueOf(cursor.getFloat(i14));
        int i15 = i + 13;
        Float fValueOf4 = cursor.isNull(i15) ? null : Float.valueOf(cursor.getFloat(i15));
        int i16 = i + 14;
        Integer numValueOf8 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i + 15;
        Float fValueOf5 = cursor.isNull(i17) ? null : Float.valueOf(cursor.getFloat(i17));
        int i18 = i + 16;
        Integer numValueOf9 = cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18));
        int i19 = i + 17;
        Float fValueOf6 = cursor.isNull(i19) ? null : Float.valueOf(cursor.getFloat(i19));
        int i20 = i + 18;
        Float fValueOf7 = cursor.isNull(i20) ? null : Float.valueOf(cursor.getFloat(i20));
        int i21 = i + 19;
        Integer numValueOf10 = cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21));
        int i22 = i + 20;
        String string2 = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i + 21;
        Long lValueOf3 = cursor.isNull(i23) ? null : Long.valueOf(cursor.getLong(i23));
        int i24 = i + 22;
        Float fValueOf8 = cursor.isNull(i24) ? null : Float.valueOf(cursor.getFloat(i24));
        int i25 = i + 23;
        Integer numValueOf11 = cursor.isNull(i25) ? null : Integer.valueOf(cursor.getInt(i25));
        int i26 = i + 24;
        Float fValueOf9 = cursor.isNull(i26) ? null : Float.valueOf(cursor.getFloat(i26));
        int i27 = i + 25;
        Float fValueOf10 = cursor.isNull(i27) ? null : Float.valueOf(cursor.getFloat(i27));
        int i28 = i + 30;
        return new WeightInfos(lValueOf, fValueOf, lValueOf2, numValueOf, numValueOf2, numValueOf3, numValueOf4, string, numValueOf5, numValueOf6, fValueOf2, numValueOf7, fValueOf3, fValueOf4, numValueOf8, fValueOf5, numValueOf9, fValueOf6, fValueOf7, numValueOf10, string2, lValueOf3, fValueOf8, numValueOf11, fValueOf9, fValueOf10, cursor.getInt(i + 26), cursor.getInt(i + 27), cursor.getFloat(i + 28), cursor.getFloat(i + 29), cursor.isNull(i28) ? null : Integer.valueOf(cursor.getInt(i28)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, WeightInfos weightInfos, int i) {
        int i2 = i + 0;
        weightInfos.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        weightInfos.setWeight(cursor.isNull(i3) ? null : Float.valueOf(cursor.getFloat(i3)));
        int i4 = i + 2;
        weightInfos.setTimestamp(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        weightInfos.setType(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        weightInfos.setSync(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        weightInfos.setSync_qqhealth(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        weightInfos.setTime_zone(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        weightInfos.setFat_percentage(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        weightInfos.setSource(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 9;
        weightInfos.setImpedance(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 10;
        weightInfos.setBmi(cursor.isNull(i12) ? null : Float.valueOf(cursor.getFloat(i12)));
        int i13 = i + 11;
        weightInfos.setHeight(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i + 12;
        weightInfos.setBody_fat(cursor.isNull(i14) ? null : Float.valueOf(cursor.getFloat(i14)));
        int i15 = i + 13;
        weightInfos.setMuscle(cursor.isNull(i15) ? null : Float.valueOf(cursor.getFloat(i15)));
        int i16 = i + 14;
        weightInfos.setBody_shape_type(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i + 15;
        weightInfos.setMoisture(cursor.isNull(i17) ? null : Float.valueOf(cursor.getFloat(i17)));
        int i18 = i + 16;
        weightInfos.setBasal_metabolism(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i + 17;
        weightInfos.setVisceral_fat(cursor.isNull(i19) ? null : Float.valueOf(cursor.getFloat(i19)));
        int i20 = i + 18;
        weightInfos.setBone_mass(cursor.isNull(i20) ? null : Float.valueOf(cursor.getFloat(i20)));
        int i21 = i + 19;
        weightInfos.setScore(cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
        int i22 = i + 20;
        weightInfos.setDevice_id(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i + 21;
        weightInfos.setUserId(cursor.isNull(i23) ? null : Long.valueOf(cursor.getLong(i23)));
        int i24 = i + 22;
        weightInfos.setOfmt(cursor.isNull(i24) ? null : Float.valueOf(cursor.getFloat(i24)));
        int i25 = i + 23;
        weightInfos.setMa(cursor.isNull(i25) ? null : Integer.valueOf(cursor.getInt(i25)));
        int i26 = i + 24;
        weightInfos.setPmr(cursor.isNull(i26) ? null : Float.valueOf(cursor.getFloat(i26)));
        int i27 = i + 25;
        weightInfos.setSbw(cursor.isNull(i27) ? null : Float.valueOf(cursor.getFloat(i27)));
        weightInfos.setHeartRate(cursor.getInt(i + 26));
        weightInfos.setPressure(cursor.getInt(i + 27));
        weightInfos.setSkeletalMuscle(cursor.getFloat(i + 28));
        weightInfos.setSubcutaneousFat(cursor.getFloat(i + 29));
        int i28 = i + 30;
        weightInfos.setEncryptImpedance(cursor.isNull(i28) ? null : Integer.valueOf(cursor.getInt(i28)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, WeightInfos weightInfos) {
        sQLiteStatement.clearBindings();
        Long id = weightInfos.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Float weight = weightInfos.getWeight();
        if (weight != null) {
            sQLiteStatement.bindDouble(2, weight.floatValue());
        }
        Long timestamp = weightInfos.getTimestamp();
        if (timestamp != null) {
            sQLiteStatement.bindLong(3, timestamp.longValue());
        }
        Integer type = weightInfos.getType();
        if (type != null) {
            sQLiteStatement.bindLong(4, type.intValue());
        }
        Integer sync = weightInfos.getSync();
        if (sync != null) {
            sQLiteStatement.bindLong(5, sync.intValue());
        }
        Integer sync_qqhealth = weightInfos.getSync_qqhealth();
        if (sync_qqhealth != null) {
            sQLiteStatement.bindLong(6, sync_qqhealth.intValue());
        }
        Integer time_zone = weightInfos.getTime_zone();
        if (time_zone != null) {
            sQLiteStatement.bindLong(7, time_zone.intValue());
        }
        String fat_percentage = weightInfos.getFat_percentage();
        if (fat_percentage != null) {
            sQLiteStatement.bindString(8, fat_percentage);
        }
        Integer source = weightInfos.getSource();
        if (source != null) {
            sQLiteStatement.bindLong(9, source.intValue());
        }
        Integer impedance = weightInfos.getImpedance();
        if (impedance != null) {
            sQLiteStatement.bindLong(10, impedance.intValue());
        }
        Float bmi = weightInfos.getBmi();
        if (bmi != null) {
            sQLiteStatement.bindDouble(11, bmi.floatValue());
        }
        Integer height = weightInfos.getHeight();
        if (height != null) {
            sQLiteStatement.bindLong(12, height.intValue());
        }
        Float body_fat = weightInfos.getBody_fat();
        if (body_fat != null) {
            sQLiteStatement.bindDouble(13, body_fat.floatValue());
        }
        Float muscle = weightInfos.getMuscle();
        if (muscle != null) {
            sQLiteStatement.bindDouble(14, muscle.floatValue());
        }
        Integer body_shape_type = weightInfos.getBody_shape_type();
        if (body_shape_type != null) {
            sQLiteStatement.bindLong(15, body_shape_type.intValue());
        }
        Float moisture = weightInfos.getMoisture();
        if (moisture != null) {
            sQLiteStatement.bindDouble(16, moisture.floatValue());
        }
        Integer basal_metabolism = weightInfos.getBasal_metabolism();
        if (basal_metabolism != null) {
            sQLiteStatement.bindLong(17, basal_metabolism.intValue());
        }
        Float visceral_fat = weightInfos.getVisceral_fat();
        if (visceral_fat != null) {
            sQLiteStatement.bindDouble(18, visceral_fat.floatValue());
        }
        Float bone_mass = weightInfos.getBone_mass();
        if (bone_mass != null) {
            sQLiteStatement.bindDouble(19, bone_mass.floatValue());
        }
        Integer score = weightInfos.getScore();
        if (score != null) {
            sQLiteStatement.bindLong(20, score.intValue());
        }
        String device_id = weightInfos.getDevice_id();
        if (device_id != null) {
            sQLiteStatement.bindString(21, device_id);
        }
        Long userId = weightInfos.getUserId();
        if (userId != null) {
            sQLiteStatement.bindLong(22, userId.longValue());
        }
        Float ofmt = weightInfos.getOfmt();
        if (ofmt != null) {
            sQLiteStatement.bindDouble(23, ofmt.floatValue());
        }
        Integer ma = weightInfos.getMa();
        if (ma != null) {
            sQLiteStatement.bindLong(24, ma.intValue());
        }
        Float pmr = weightInfos.getPmr();
        if (pmr != null) {
            sQLiteStatement.bindDouble(25, pmr.floatValue());
        }
        Float sbw = weightInfos.getSbw();
        if (sbw != null) {
            sQLiteStatement.bindDouble(26, sbw.floatValue());
        }
        sQLiteStatement.bindLong(27, weightInfos.getHeartRate());
        sQLiteStatement.bindLong(28, weightInfos.getPressure());
        sQLiteStatement.bindDouble(29, weightInfos.getSkeletalMuscle());
        sQLiteStatement.bindDouble(30, weightInfos.getSubcutaneousFat());
        Integer encryptImpedance = weightInfos.getEncryptImpedance();
        if (encryptImpedance != null) {
            sQLiteStatement.bindLong(31, encryptImpedance.intValue());
        }
    }
}
