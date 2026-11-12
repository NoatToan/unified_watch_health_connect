package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.watch.dataflow.model.firstbeat.FirstbeatParams;
import com.xiaomi.hm.health.databases.model.FbtThaResult;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class FbtThaResultDao extends AbstractDao<FbtThaResult, Long> {
    public static final String TABLENAME = "FBT_THA_RESULT";

    public static class Properties {
        public static final Property CurrentStatus;
        public static final Property FitnessClass;
        public static final Property FitnessLevelIncrease;
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Source;
        public static final Property SyncState;
        public static final Property TimeStamp;
        public static final Property TrainingLoadTrend;
        public static final Property Vo2maxTrend;
        public static final Property Vo2maxTrendType;
        public static final Property Wtl;
        public static final Property WtlSum;
        public static final Property WtlSumOptimalMax;
        public static final Property WtlSumOptimalMin;
        public static final Property WtlSumOverreaching;

        static {
            Class cls = Integer.TYPE;
            CurrentStatus = new Property(1, cls, "currentStatus", false, "CURRENT_STATUS");
            Vo2maxTrend = new Property(2, cls, "vo2maxTrend", false, "VO2MAX_TREND");
            Vo2maxTrendType = new Property(3, cls, "vo2maxTrendType", false, "VO2MAX_TREND_TYPE");
            TrainingLoadTrend = new Property(4, cls, "trainingLoadTrend", false, "TRAINING_LOAD_TREND");
            Wtl = new Property(5, cls, "wtl", false, "WTL");
            WtlSum = new Property(6, cls, FirstbeatParams.PARAM_TL_WEEKLY_SUM, false, "WTL_SUM");
            WtlSumOptimalMin = new Property(7, cls, FirstbeatParams.PARAM_TL_WEEKLY_SUM_OPTIMAL_MIN, false, "WTL_SUM_OPTIMAL_MIN");
            WtlSumOptimalMax = new Property(8, cls, FirstbeatParams.PARAM_TL_WEEKLY_SUM_OPTIMAL_MAX, false, "WTL_SUM_OPTIMAL_MAX");
            WtlSumOverreaching = new Property(9, cls, FirstbeatParams.PARAM_TL_WEEKLY_SUM_OVERREACHING, false, "WTL_SUM_OVERREACHING");
            FitnessClass = new Property(10, cls, "fitnessClass", false, "FITNESS_CLASS");
            FitnessLevelIncrease = new Property(11, cls, "fitnessLevelIncrease", false, "FITNESS_LEVEL_INCREASE");
            TimeStamp = new Property(12, Long.TYPE, "timeStamp", false, "TIME_STAMP");
            Source = new Property(13, cls, "source", false, "SOURCE");
            SyncState = new Property(14, cls, "syncState", false, "SYNC_STATE");
        }
    }

    public FbtThaResultDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"FBT_THA_RESULT\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"CURRENT_STATUS\" INTEGER NOT NULL ,\"VO2MAX_TREND\" INTEGER NOT NULL ,\"VO2MAX_TREND_TYPE\" INTEGER NOT NULL ,\"TRAINING_LOAD_TREND\" INTEGER NOT NULL ,\"WTL\" INTEGER NOT NULL ,\"WTL_SUM\" INTEGER NOT NULL ,\"WTL_SUM_OPTIMAL_MIN\" INTEGER NOT NULL ,\"WTL_SUM_OPTIMAL_MAX\" INTEGER NOT NULL ,\"WTL_SUM_OVERREACHING\" INTEGER NOT NULL ,\"FITNESS_CLASS\" INTEGER NOT NULL ,\"FITNESS_LEVEL_INCREASE\" INTEGER NOT NULL ,\"TIME_STAMP\" INTEGER NOT NULL ,\"SOURCE\" INTEGER NOT NULL ,\"SYNC_STATE\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"FBT_THA_RESULT\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public FbtThaResultDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(FbtThaResult fbtThaResult) {
        if (fbtThaResult != null) {
            return fbtThaResult.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(FbtThaResult fbtThaResult) {
        return fbtThaResult.getId() != null;
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
    public final Long updateKeyAfterInsert(FbtThaResult fbtThaResult, long j) {
        fbtThaResult.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, FbtThaResult fbtThaResult) {
        databaseStatement.clearBindings();
        Long id = fbtThaResult.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        databaseStatement.bindLong(2, fbtThaResult.getCurrentStatus());
        databaseStatement.bindLong(3, fbtThaResult.getVo2maxTrend());
        databaseStatement.bindLong(4, fbtThaResult.getVo2maxTrendType());
        databaseStatement.bindLong(5, fbtThaResult.getTrainingLoadTrend());
        databaseStatement.bindLong(6, fbtThaResult.getWtl());
        databaseStatement.bindLong(7, fbtThaResult.getWtlSum());
        databaseStatement.bindLong(8, fbtThaResult.getWtlSumOptimalMin());
        databaseStatement.bindLong(9, fbtThaResult.getWtlSumOptimalMax());
        databaseStatement.bindLong(10, fbtThaResult.getWtlSumOverreaching());
        databaseStatement.bindLong(11, fbtThaResult.getFitnessClass());
        databaseStatement.bindLong(12, fbtThaResult.getFitnessLevelIncrease());
        databaseStatement.bindLong(13, fbtThaResult.getTimeStamp());
        databaseStatement.bindLong(14, fbtThaResult.getSource());
        databaseStatement.bindLong(15, fbtThaResult.getSyncState());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public FbtThaResult readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        return new FbtThaResult(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.getInt(i + 1), cursor.getInt(i + 2), cursor.getInt(i + 3), cursor.getInt(i + 4), cursor.getInt(i + 5), cursor.getInt(i + 6), cursor.getInt(i + 7), cursor.getInt(i + 8), cursor.getInt(i + 9), cursor.getInt(i + 10), cursor.getInt(i + 11), cursor.getLong(i + 12), cursor.getInt(i + 13), cursor.getInt(i + 14));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, FbtThaResult fbtThaResult, int i) {
        int i2 = i + 0;
        fbtThaResult.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        fbtThaResult.setCurrentStatus(cursor.getInt(i + 1));
        fbtThaResult.setVo2maxTrend(cursor.getInt(i + 2));
        fbtThaResult.setVo2maxTrendType(cursor.getInt(i + 3));
        fbtThaResult.setTrainingLoadTrend(cursor.getInt(i + 4));
        fbtThaResult.setWtl(cursor.getInt(i + 5));
        fbtThaResult.setWtlSum(cursor.getInt(i + 6));
        fbtThaResult.setWtlSumOptimalMin(cursor.getInt(i + 7));
        fbtThaResult.setWtlSumOptimalMax(cursor.getInt(i + 8));
        fbtThaResult.setWtlSumOverreaching(cursor.getInt(i + 9));
        fbtThaResult.setFitnessClass(cursor.getInt(i + 10));
        fbtThaResult.setFitnessLevelIncrease(cursor.getInt(i + 11));
        fbtThaResult.setTimeStamp(cursor.getLong(i + 12));
        fbtThaResult.setSource(cursor.getInt(i + 13));
        fbtThaResult.setSyncState(cursor.getInt(i + 14));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, FbtThaResult fbtThaResult) {
        sQLiteStatement.clearBindings();
        Long id = fbtThaResult.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        sQLiteStatement.bindLong(2, fbtThaResult.getCurrentStatus());
        sQLiteStatement.bindLong(3, fbtThaResult.getVo2maxTrend());
        sQLiteStatement.bindLong(4, fbtThaResult.getVo2maxTrendType());
        sQLiteStatement.bindLong(5, fbtThaResult.getTrainingLoadTrend());
        sQLiteStatement.bindLong(6, fbtThaResult.getWtl());
        sQLiteStatement.bindLong(7, fbtThaResult.getWtlSum());
        sQLiteStatement.bindLong(8, fbtThaResult.getWtlSumOptimalMin());
        sQLiteStatement.bindLong(9, fbtThaResult.getWtlSumOptimalMax());
        sQLiteStatement.bindLong(10, fbtThaResult.getWtlSumOverreaching());
        sQLiteStatement.bindLong(11, fbtThaResult.getFitnessClass());
        sQLiteStatement.bindLong(12, fbtThaResult.getFitnessLevelIncrease());
        sQLiteStatement.bindLong(13, fbtThaResult.getTimeStamp());
        sQLiteStatement.bindLong(14, fbtThaResult.getSource());
        sQLiteStatement.bindLong(15, fbtThaResult.getSyncState());
    }
}
