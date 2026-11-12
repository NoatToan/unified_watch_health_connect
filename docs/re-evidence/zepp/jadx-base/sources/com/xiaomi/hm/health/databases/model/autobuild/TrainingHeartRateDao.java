package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.watch.companion.dataflow.Constant;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingHeartRateDao extends AbstractDao<TrainingHeartRate, Long> {
    public static final String TABLENAME = "TRAINING_HEART_RATE";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property TrainingId = new Property(1, Long.class, "trainingId", false, "TRAINING_ID");
        public static final Property TrainingPlanId = new Property(2, Long.class, "trainingPlanId", false, "TRAINING_PLAN_ID");
        public static final Property TrainingStartTime = new Property(3, Long.class, "trainingStartTime", false, "TRAINING_START_TIME");
        public static final Property Index = new Property(4, Long.class, "index", false, "INDEX");
        public static final Property RecordTime = new Property(5, Long.class, "recordTime", false, "RECORD_TIME");
        public static final Property HeartRate = new Property(6, Integer.class, Constant.KEY_HR_VALUE, false, "HEART_RATE");
    }

    public TrainingHeartRateDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"TRAINING_HEART_RATE\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRAINING_ID\" INTEGER,\"TRAINING_PLAN_ID\" INTEGER,\"TRAINING_START_TIME\" INTEGER,\"INDEX\" INTEGER,\"RECORD_TIME\" INTEGER,\"HEART_RATE\" INTEGER);");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_TRAINING_HEART_RATE_TRAINING_ID_TRAINING_START_TIME_INDEX ON \"TRAINING_HEART_RATE\" (\"TRAINING_ID\" ASC,\"TRAINING_START_TIME\" ASC,\"INDEX\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRAINING_HEART_RATE\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrainingHeartRateDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(TrainingHeartRate trainingHeartRate) {
        if (trainingHeartRate != null) {
            return trainingHeartRate.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(TrainingHeartRate trainingHeartRate) {
        return trainingHeartRate.getId() != null;
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
    public final Long updateKeyAfterInsert(TrainingHeartRate trainingHeartRate, long j) {
        trainingHeartRate.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, TrainingHeartRate trainingHeartRate) {
        databaseStatement.clearBindings();
        Long id = trainingHeartRate.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trainingId = trainingHeartRate.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(2, trainingId.longValue());
        }
        Long trainingPlanId = trainingHeartRate.getTrainingPlanId();
        if (trainingPlanId != null) {
            databaseStatement.bindLong(3, trainingPlanId.longValue());
        }
        Long trainingStartTime = trainingHeartRate.getTrainingStartTime();
        if (trainingStartTime != null) {
            databaseStatement.bindLong(4, trainingStartTime.longValue());
        }
        Long index = trainingHeartRate.getIndex();
        if (index != null) {
            databaseStatement.bindLong(5, index.longValue());
        }
        Long recordTime = trainingHeartRate.getRecordTime();
        if (recordTime != null) {
            databaseStatement.bindLong(6, recordTime.longValue());
        }
        Integer heartRate = trainingHeartRate.getHeartRate();
        if (heartRate != null) {
            databaseStatement.bindLong(7, heartRate.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public TrainingHeartRate readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Long lValueOf3 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        Long lValueOf4 = cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5));
        int i6 = i + 4;
        Long lValueOf5 = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 5;
        int i8 = i + 6;
        return new TrainingHeartRate(lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)), cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, TrainingHeartRate trainingHeartRate, int i) {
        int i2 = i + 0;
        trainingHeartRate.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trainingHeartRate.setTrainingId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        trainingHeartRate.setTrainingPlanId(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        trainingHeartRate.setTrainingStartTime(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        trainingHeartRate.setIndex(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i + 5;
        trainingHeartRate.setRecordTime(cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)));
        int i8 = i + 6;
        trainingHeartRate.setHeartRate(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, TrainingHeartRate trainingHeartRate) {
        sQLiteStatement.clearBindings();
        Long id = trainingHeartRate.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trainingId = trainingHeartRate.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(2, trainingId.longValue());
        }
        Long trainingPlanId = trainingHeartRate.getTrainingPlanId();
        if (trainingPlanId != null) {
            sQLiteStatement.bindLong(3, trainingPlanId.longValue());
        }
        Long trainingStartTime = trainingHeartRate.getTrainingStartTime();
        if (trainingStartTime != null) {
            sQLiteStatement.bindLong(4, trainingStartTime.longValue());
        }
        Long index = trainingHeartRate.getIndex();
        if (index != null) {
            sQLiteStatement.bindLong(5, index.longValue());
        }
        Long recordTime = trainingHeartRate.getRecordTime();
        if (recordTime != null) {
            sQLiteStatement.bindLong(6, recordTime.longValue());
        }
        Integer heartRate = trainingHeartRate.getHeartRate();
        if (heartRate != null) {
            sQLiteStatement.bindLong(7, heartRate.intValue());
        }
    }
}
