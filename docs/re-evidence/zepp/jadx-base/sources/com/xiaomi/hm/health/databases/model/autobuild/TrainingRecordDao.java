package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.assistant.calendar.ICalendar;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.watch.companion.dataflow.Constant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingRecordDao extends AbstractDao<TrainingRecord, String> {
    public static final String TABLENAME = "TRAINING_RECORD";

    public static class Properties {
        public static final Property TrainingRecordId = new Property(0, String.class, "trainingRecordId", true, "TRAINING_RECORD_ID");
        public static final Property TrainingId = new Property(1, Long.class, "trainingId", false, "TRAINING_ID");
        public static final Property TrainingPlanId = new Property(2, Long.class, "trainingPlanId", false, "TRAINING_PLAN_ID");
        public static final Property FinishNumber = new Property(3, Integer.class, "finishNumber", false, "FINISH_NUMBER");
        public static final Property Name = new Property(4, String.class, "name", false, "NAME");
        public static final Property StartTime = new Property(5, Long.class, "startTime", false, "START_TIME");
        public static final Property EndTime = new Property(6, Long.class, "endTime", false, "END_TIME");
        public static final Property AverageHeartRate = new Property(7, Integer.class, "averageHeartRate", false, "AVERAGE_HEART_RATE");
        public static final Property MaxHeartRate = new Property(8, Integer.class, "maxHeartRate", false, "MAX_HEART_RATE");
        public static final Property HeartRate = new Property(9, String.class, Constant.KEY_HR_VALUE, false, "HEART_RATE");
        public static final Property ActionNumber = new Property(10, Integer.class, "actionNumber", false, "ACTION_NUMBER");
        public static final Property Consumption = new Property(11, Integer.class, "consumption", false, "CONSUMPTION");
        public static final Property Duration = new Property(12, Long.class, "duration", false, ICalendar.Property.DURATION);
        public static final Property Time = new Property(13, String.class, "time", false, "TIME");
        public static final Property CreateTime = new Property(14, Long.class, ParamKey.createTime, false, "CREATE_TIME");
        public static final Property Status = new Property(15, Integer.class, "status", false, "STATUS");
        public static final Property DetailsPageIllustrated = new Property(16, String.class, "detailsPageIllustrated", false, "DETAILS_PAGE_ILLUSTRATED");
        public static final Property Pause = new Property(17, String.class, "pause", false, "PAUSE");
        public static final Property TrainingPlanDayIndex = new Property(18, Integer.class, "trainingPlanDayIndex", false, "TRAINING_PLAN_DAY_INDEX");
        public static final Property HasBoundHrDevice = new Property(19, Boolean.class, "hasBoundHrDevice", false, "HAS_BOUND_HR_DEVICE");
        public static final Property TrainingType = new Property(20, String.class, "trainingType", false, "TRAINING_TYPE");
        public static final Property FinishedVideos = new Property(21, String.class, "finishedVideos", false, "FINISHED_VIDEOS");
        public static final Property ActionId = new Property(22, String.class, "actionId", false, "ACTION_ID");
        public static final Property ActionName = new Property(23, String.class, "actionName", false, "ACTION_NAME");
        public static final Property Thumbnail = new Property(24, String.class, DeviceSettingApiImpl.META_KEY_THUMBNAIL, false, "THUMBNAIL");
        public static final Property TrainingStartTime = new Property(25, Long.class, "trainingStartTime", false, "TRAINING_START_TIME");
        public static final Property TrainingEndTime = new Property(26, Long.class, "trainingEndTime", false, "TRAINING_END_TIME");
    }

    public TrainingRecordDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"TRAINING_RECORD\" (\"TRAINING_RECORD_ID\" TEXT PRIMARY KEY NOT NULL ,\"TRAINING_ID\" INTEGER,\"TRAINING_PLAN_ID\" INTEGER,\"FINISH_NUMBER\" INTEGER,\"NAME\" TEXT,\"START_TIME\" INTEGER,\"END_TIME\" INTEGER,\"AVERAGE_HEART_RATE\" INTEGER,\"MAX_HEART_RATE\" INTEGER,\"HEART_RATE\" TEXT,\"ACTION_NUMBER\" INTEGER,\"CONSUMPTION\" INTEGER,\"DURATION\" INTEGER,\"TIME\" TEXT,\"CREATE_TIME\" INTEGER,\"STATUS\" INTEGER,\"DETAILS_PAGE_ILLUSTRATED\" TEXT,\"PAUSE\" TEXT,\"TRAINING_PLAN_DAY_INDEX\" INTEGER,\"HAS_BOUND_HR_DEVICE\" INTEGER,\"TRAINING_TYPE\" TEXT,\"FINISHED_VIDEOS\" TEXT,\"ACTION_ID\" TEXT,\"ACTION_NAME\" TEXT,\"THUMBNAIL\" TEXT,\"TRAINING_START_TIME\" INTEGER,\"TRAINING_END_TIME\" INTEGER);");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_TRAINING_RECORD_TRAINING_ID_START_TIME ON \"TRAINING_RECORD\" (\"TRAINING_ID\" ASC,\"START_TIME\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRAINING_RECORD\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrainingRecordDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(TrainingRecord trainingRecord) {
        if (trainingRecord != null) {
            return trainingRecord.getTrainingRecordId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(TrainingRecord trainingRecord) {
        return trainingRecord.getTrainingRecordId() != null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return cursor.getString(i2);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(TrainingRecord trainingRecord, long j) {
        return trainingRecord.getTrainingRecordId();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, TrainingRecord trainingRecord) {
        databaseStatement.clearBindings();
        String trainingRecordId = trainingRecord.getTrainingRecordId();
        if (trainingRecordId != null) {
            databaseStatement.bindString(1, trainingRecordId);
        }
        Long trainingId = trainingRecord.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(2, trainingId.longValue());
        }
        Long trainingPlanId = trainingRecord.getTrainingPlanId();
        if (trainingPlanId != null) {
            databaseStatement.bindLong(3, trainingPlanId.longValue());
        }
        Integer finishNumber = trainingRecord.getFinishNumber();
        if (finishNumber != null) {
            databaseStatement.bindLong(4, finishNumber.intValue());
        }
        String name = trainingRecord.getName();
        if (name != null) {
            databaseStatement.bindString(5, name);
        }
        Long startTime = trainingRecord.getStartTime();
        if (startTime != null) {
            databaseStatement.bindLong(6, startTime.longValue());
        }
        Long endTime = trainingRecord.getEndTime();
        if (endTime != null) {
            databaseStatement.bindLong(7, endTime.longValue());
        }
        Integer averageHeartRate = trainingRecord.getAverageHeartRate();
        if (averageHeartRate != null) {
            databaseStatement.bindLong(8, averageHeartRate.intValue());
        }
        Integer maxHeartRate = trainingRecord.getMaxHeartRate();
        if (maxHeartRate != null) {
            databaseStatement.bindLong(9, maxHeartRate.intValue());
        }
        String heartRate = trainingRecord.getHeartRate();
        if (heartRate != null) {
            databaseStatement.bindString(10, heartRate);
        }
        Integer actionNumber = trainingRecord.getActionNumber();
        if (actionNumber != null) {
            databaseStatement.bindLong(11, actionNumber.intValue());
        }
        Integer consumption = trainingRecord.getConsumption();
        if (consumption != null) {
            databaseStatement.bindLong(12, consumption.intValue());
        }
        Long duration = trainingRecord.getDuration();
        if (duration != null) {
            databaseStatement.bindLong(13, duration.longValue());
        }
        String time = trainingRecord.getTime();
        if (time != null) {
            databaseStatement.bindString(14, time);
        }
        Long createTime = trainingRecord.getCreateTime();
        if (createTime != null) {
            databaseStatement.bindLong(15, createTime.longValue());
        }
        Integer status = trainingRecord.getStatus();
        if (status != null) {
            databaseStatement.bindLong(16, status.intValue());
        }
        String detailsPageIllustrated = trainingRecord.getDetailsPageIllustrated();
        if (detailsPageIllustrated != null) {
            databaseStatement.bindString(17, detailsPageIllustrated);
        }
        String pause = trainingRecord.getPause();
        if (pause != null) {
            databaseStatement.bindString(18, pause);
        }
        Integer trainingPlanDayIndex = trainingRecord.getTrainingPlanDayIndex();
        if (trainingPlanDayIndex != null) {
            databaseStatement.bindLong(19, trainingPlanDayIndex.intValue());
        }
        Boolean hasBoundHrDevice = trainingRecord.getHasBoundHrDevice();
        if (hasBoundHrDevice != null) {
            databaseStatement.bindLong(20, hasBoundHrDevice.booleanValue() ? 1L : 0L);
        }
        String trainingType = trainingRecord.getTrainingType();
        if (trainingType != null) {
            databaseStatement.bindString(21, trainingType);
        }
        String finishedVideos = trainingRecord.getFinishedVideos();
        if (finishedVideos != null) {
            databaseStatement.bindString(22, finishedVideos);
        }
        String actionId = trainingRecord.getActionId();
        if (actionId != null) {
            databaseStatement.bindString(23, actionId);
        }
        String actionName = trainingRecord.getActionName();
        if (actionName != null) {
            databaseStatement.bindString(24, actionName);
        }
        String thumbnail = trainingRecord.getThumbnail();
        if (thumbnail != null) {
            databaseStatement.bindString(25, thumbnail);
        }
        Long trainingStartTime = trainingRecord.getTrainingStartTime();
        if (trainingStartTime != null) {
            databaseStatement.bindLong(26, trainingStartTime.longValue());
        }
        Long trainingEndTime = trainingRecord.getTrainingEndTime();
        if (trainingEndTime != null) {
            databaseStatement.bindLong(27, trainingEndTime.longValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public TrainingRecord readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        Long lValueOf = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Long lValueOf2 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        String string2 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        Long lValueOf3 = cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7));
        int i8 = i + 6;
        Long lValueOf4 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i + 7;
        Integer numValueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i + 8;
        Integer numValueOf3 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i + 9;
        String string3 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 10;
        Integer numValueOf4 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i + 11;
        Integer numValueOf5 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i + 12;
        Long lValueOf5 = cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14));
        int i15 = i + 13;
        String string4 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        Long lValueOf6 = cursor.isNull(i16) ? null : Long.valueOf(cursor.getLong(i16));
        int i17 = i + 15;
        Integer numValueOf6 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i + 16;
        String string5 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 17;
        String string6 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 18;
        Integer numValueOf7 = cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20));
        int i21 = i + 19;
        if (cursor.isNull(i21)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        int i22 = i + 20;
        String string7 = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i + 21;
        String string8 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 22;
        String string9 = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = i + 23;
        String string10 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 24;
        String string11 = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 25;
        Long lValueOf7 = cursor.isNull(i27) ? null : Long.valueOf(cursor.getLong(i27));
        int i28 = i + 26;
        return new TrainingRecord(string, lValueOf, lValueOf2, numValueOf, string2, lValueOf3, lValueOf4, numValueOf2, numValueOf3, string3, numValueOf4, numValueOf5, lValueOf5, string4, lValueOf6, numValueOf6, string5, string6, numValueOf7, boolValueOf, string7, string8, string9, string10, string11, lValueOf7, cursor.isNull(i28) ? null : Long.valueOf(cursor.getLong(i28)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, TrainingRecord trainingRecord, int i) {
        Boolean boolValueOf;
        int i2 = i + 0;
        trainingRecord.setTrainingRecordId(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        trainingRecord.setTrainingId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        trainingRecord.setTrainingPlanId(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        trainingRecord.setFinishNumber(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        trainingRecord.setName(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        trainingRecord.setStartTime(cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)));
        int i8 = i + 6;
        trainingRecord.setEndTime(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i + 7;
        trainingRecord.setAverageHeartRate(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 8;
        trainingRecord.setMaxHeartRate(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 9;
        trainingRecord.setHeartRate(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        trainingRecord.setActionNumber(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 11;
        trainingRecord.setConsumption(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i + 12;
        trainingRecord.setDuration(cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
        int i15 = i + 13;
        trainingRecord.setTime(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 14;
        trainingRecord.setCreateTime(cursor.isNull(i16) ? null : Long.valueOf(cursor.getLong(i16)));
        int i17 = i + 15;
        trainingRecord.setStatus(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i + 16;
        trainingRecord.setDetailsPageIllustrated(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i + 17;
        trainingRecord.setPause(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i20 = i + 18;
        trainingRecord.setTrainingPlanDayIndex(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i + 19;
        if (cursor.isNull(i21)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        trainingRecord.setHasBoundHrDevice(boolValueOf);
        int i22 = i + 20;
        trainingRecord.setTrainingType(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i + 21;
        trainingRecord.setFinishedVideos(cursor.isNull(i23) ? null : cursor.getString(i23));
        int i24 = i + 22;
        trainingRecord.setActionId(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i + 23;
        trainingRecord.setActionName(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i + 24;
        trainingRecord.setThumbnail(cursor.isNull(i26) ? null : cursor.getString(i26));
        int i27 = i + 25;
        trainingRecord.setTrainingStartTime(cursor.isNull(i27) ? null : Long.valueOf(cursor.getLong(i27)));
        int i28 = i + 26;
        trainingRecord.setTrainingEndTime(cursor.isNull(i28) ? null : Long.valueOf(cursor.getLong(i28)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, TrainingRecord trainingRecord) {
        sQLiteStatement.clearBindings();
        String trainingRecordId = trainingRecord.getTrainingRecordId();
        if (trainingRecordId != null) {
            sQLiteStatement.bindString(1, trainingRecordId);
        }
        Long trainingId = trainingRecord.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(2, trainingId.longValue());
        }
        Long trainingPlanId = trainingRecord.getTrainingPlanId();
        if (trainingPlanId != null) {
            sQLiteStatement.bindLong(3, trainingPlanId.longValue());
        }
        Integer finishNumber = trainingRecord.getFinishNumber();
        if (finishNumber != null) {
            sQLiteStatement.bindLong(4, finishNumber.intValue());
        }
        String name = trainingRecord.getName();
        if (name != null) {
            sQLiteStatement.bindString(5, name);
        }
        Long startTime = trainingRecord.getStartTime();
        if (startTime != null) {
            sQLiteStatement.bindLong(6, startTime.longValue());
        }
        Long endTime = trainingRecord.getEndTime();
        if (endTime != null) {
            sQLiteStatement.bindLong(7, endTime.longValue());
        }
        Integer averageHeartRate = trainingRecord.getAverageHeartRate();
        if (averageHeartRate != null) {
            sQLiteStatement.bindLong(8, averageHeartRate.intValue());
        }
        Integer maxHeartRate = trainingRecord.getMaxHeartRate();
        if (maxHeartRate != null) {
            sQLiteStatement.bindLong(9, maxHeartRate.intValue());
        }
        String heartRate = trainingRecord.getHeartRate();
        if (heartRate != null) {
            sQLiteStatement.bindString(10, heartRate);
        }
        Integer actionNumber = trainingRecord.getActionNumber();
        if (actionNumber != null) {
            sQLiteStatement.bindLong(11, actionNumber.intValue());
        }
        Integer consumption = trainingRecord.getConsumption();
        if (consumption != null) {
            sQLiteStatement.bindLong(12, consumption.intValue());
        }
        Long duration = trainingRecord.getDuration();
        if (duration != null) {
            sQLiteStatement.bindLong(13, duration.longValue());
        }
        String time = trainingRecord.getTime();
        if (time != null) {
            sQLiteStatement.bindString(14, time);
        }
        Long createTime = trainingRecord.getCreateTime();
        if (createTime != null) {
            sQLiteStatement.bindLong(15, createTime.longValue());
        }
        Integer status = trainingRecord.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(16, status.intValue());
        }
        String detailsPageIllustrated = trainingRecord.getDetailsPageIllustrated();
        if (detailsPageIllustrated != null) {
            sQLiteStatement.bindString(17, detailsPageIllustrated);
        }
        String pause = trainingRecord.getPause();
        if (pause != null) {
            sQLiteStatement.bindString(18, pause);
        }
        Integer trainingPlanDayIndex = trainingRecord.getTrainingPlanDayIndex();
        if (trainingPlanDayIndex != null) {
            sQLiteStatement.bindLong(19, trainingPlanDayIndex.intValue());
        }
        Boolean hasBoundHrDevice = trainingRecord.getHasBoundHrDevice();
        if (hasBoundHrDevice != null) {
            sQLiteStatement.bindLong(20, hasBoundHrDevice.booleanValue() ? 1L : 0L);
        }
        String trainingType = trainingRecord.getTrainingType();
        if (trainingType != null) {
            sQLiteStatement.bindString(21, trainingType);
        }
        String finishedVideos = trainingRecord.getFinishedVideos();
        if (finishedVideos != null) {
            sQLiteStatement.bindString(22, finishedVideos);
        }
        String actionId = trainingRecord.getActionId();
        if (actionId != null) {
            sQLiteStatement.bindString(23, actionId);
        }
        String actionName = trainingRecord.getActionName();
        if (actionName != null) {
            sQLiteStatement.bindString(24, actionName);
        }
        String thumbnail = trainingRecord.getThumbnail();
        if (thumbnail != null) {
            sQLiteStatement.bindString(25, thumbnail);
        }
        Long trainingStartTime = trainingRecord.getTrainingStartTime();
        if (trainingStartTime != null) {
            sQLiteStatement.bindLong(26, trainingStartTime.longValue());
        }
        Long trainingEndTime = trainingRecord.getTrainingEndTime();
        if (trainingEndTime != null) {
            sQLiteStatement.bindLong(27, trainingEndTime.longValue());
        }
    }
}
