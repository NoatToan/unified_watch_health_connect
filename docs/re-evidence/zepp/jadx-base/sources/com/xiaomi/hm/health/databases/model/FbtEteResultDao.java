package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.moving.ui.utils.SportAnalytics;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class FbtEteResultDao extends AbstractDao<FbtEteResult, Long> {
    public static final String TABLENAME = "FBT_ETE_RESULT";

    public static class Properties {
        public static final Property AerobicFeedbackNumber;
        public static final Property ArtifactPercent;
        public static final Property CorrectedHR;
        public static final Property CumulativeEnergyExpenditure;
        public static final Property DailyPerformance;
        public static final Property EndTime;
        public static final Property EnergyExpenditure;
        public static final Property ExerciseType;
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property MaximalHR;
        public static final Property MaximalMet;
        public static final Property MaximalMetMinutes;
        public static final Property MinimalHR;
        public static final Property PercentAchieved;
        public static final Property PhraseNumber;
        public static final Property PhraseVariableOne;
        public static final Property PhraseVariableTwo;
        public static final Property RecoveryTime;
        public static final Property Source;
        public static final Property SyncState;
        public static final Property TimeStamp;
        public static final Property TrackId;
        public static final Property TrainingEffect;
        public static final Property TrainingLoadPeak;

        static {
            Class cls = Long.TYPE;
            TrackId = new Property(1, cls, "trackId", false, "TRACK_ID");
            Class cls2 = Integer.TYPE;
            Source = new Property(2, cls2, "source", false, "SOURCE");
            CorrectedHR = new Property(3, cls2, "correctedHR", false, "CORRECTED_HR");
            ArtifactPercent = new Property(4, cls2, "artifactPercent", false, "ARTIFACT_PERCENT");
            MinimalHR = new Property(5, cls2, "minimalHR", false, "MINIMAL_HR");
            MaximalHR = new Property(6, cls2, "maximalHR", false, "MAXIMAL_HR");
            TrainingLoadPeak = new Property(7, cls2, "trainingLoadPeak", false, "TRAINING_LOAD_PEAK");
            TrainingEffect = new Property(8, cls2, SportAnalytics.ParamValue.ChartType.CHART_TRAINING_EFFECT, false, "TRAINING_EFFECT");
            PercentAchieved = new Property(9, cls2, "percentAchieved", false, "PERCENT_ACHIEVED");
            PhraseNumber = new Property(10, cls2, "phraseNumber", false, "PHRASE_NUMBER");
            PhraseVariableOne = new Property(11, cls2, "phraseVariableOne", false, "PHRASE_VARIABLE_ONE");
            PhraseVariableTwo = new Property(12, cls2, "phraseVariableTwo", false, "PHRASE_VARIABLE_TWO");
            EnergyExpenditure = new Property(13, cls2, "energyExpenditure", false, "ENERGY_EXPENDITURE");
            CumulativeEnergyExpenditure = new Property(14, cls2, "cumulativeEnergyExpenditure", false, "CUMULATIVE_ENERGY_EXPENDITURE");
            MaximalMet = new Property(15, cls2, "maximalMet", false, "MAXIMAL_MET");
            MaximalMetMinutes = new Property(16, cls2, "maximalMetMinutes", false, "MAXIMAL_MET_MINUTES");
            RecoveryTime = new Property(17, cls2, "recoveryTime", false, "RECOVERY_TIME");
            DailyPerformance = new Property(18, cls2, "dailyPerformance", false, "DAILY_PERFORMANCE");
            AerobicFeedbackNumber = new Property(19, cls2, "aerobicFeedbackNumber", false, "AEROBIC_FEEDBACK_NUMBER");
            TimeStamp = new Property(20, cls, "timeStamp", false, "TIME_STAMP");
            EndTime = new Property(21, cls, "endTime", false, "END_TIME");
            ExerciseType = new Property(22, cls2, "exerciseType", false, "EXERCISE_TYPE");
            SyncState = new Property(23, cls2, "syncState", false, "SYNC_STATE");
        }
    }

    public FbtEteResultDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"FBT_ETE_RESULT\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRACK_ID\" INTEGER NOT NULL ,\"SOURCE\" INTEGER NOT NULL ,\"CORRECTED_HR\" INTEGER NOT NULL ,\"ARTIFACT_PERCENT\" INTEGER NOT NULL ,\"MINIMAL_HR\" INTEGER NOT NULL ,\"MAXIMAL_HR\" INTEGER NOT NULL ,\"TRAINING_LOAD_PEAK\" INTEGER NOT NULL ,\"TRAINING_EFFECT\" INTEGER NOT NULL ,\"PERCENT_ACHIEVED\" INTEGER NOT NULL ,\"PHRASE_NUMBER\" INTEGER NOT NULL ,\"PHRASE_VARIABLE_ONE\" INTEGER NOT NULL ,\"PHRASE_VARIABLE_TWO\" INTEGER NOT NULL ,\"ENERGY_EXPENDITURE\" INTEGER NOT NULL ,\"CUMULATIVE_ENERGY_EXPENDITURE\" INTEGER NOT NULL ,\"MAXIMAL_MET\" INTEGER NOT NULL ,\"MAXIMAL_MET_MINUTES\" INTEGER NOT NULL ,\"RECOVERY_TIME\" INTEGER NOT NULL ,\"DAILY_PERFORMANCE\" INTEGER NOT NULL ,\"AEROBIC_FEEDBACK_NUMBER\" INTEGER NOT NULL ,\"TIME_STAMP\" INTEGER NOT NULL ,\"END_TIME\" INTEGER NOT NULL ,\"EXERCISE_TYPE\" INTEGER NOT NULL ,\"SYNC_STATE\" INTEGER NOT NULL ,UNIQUE (SOURCE,TRACK_ID) ON CONFLICT REPLACE);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"FBT_ETE_RESULT\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public FbtEteResultDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(FbtEteResult fbtEteResult) {
        if (fbtEteResult != null) {
            return fbtEteResult.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(FbtEteResult fbtEteResult) {
        return fbtEteResult.getId() != null;
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
    public final Long updateKeyAfterInsert(FbtEteResult fbtEteResult, long j) {
        fbtEteResult.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, FbtEteResult fbtEteResult) {
        databaseStatement.clearBindings();
        Long id = fbtEteResult.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        databaseStatement.bindLong(2, fbtEteResult.getTrackId());
        databaseStatement.bindLong(3, fbtEteResult.getSource());
        databaseStatement.bindLong(4, fbtEteResult.getCorrectedHR());
        databaseStatement.bindLong(5, fbtEteResult.getArtifactPercent());
        databaseStatement.bindLong(6, fbtEteResult.getMinimalHR());
        databaseStatement.bindLong(7, fbtEteResult.getMaximalHR());
        databaseStatement.bindLong(8, fbtEteResult.getTrainingLoadPeak());
        databaseStatement.bindLong(9, fbtEteResult.getTrainingEffect());
        databaseStatement.bindLong(10, fbtEteResult.getPercentAchieved());
        databaseStatement.bindLong(11, fbtEteResult.getPhraseNumber());
        databaseStatement.bindLong(12, fbtEteResult.getPhraseVariableOne());
        databaseStatement.bindLong(13, fbtEteResult.getPhraseVariableTwo());
        databaseStatement.bindLong(14, fbtEteResult.getEnergyExpenditure());
        databaseStatement.bindLong(15, fbtEteResult.getCumulativeEnergyExpenditure());
        databaseStatement.bindLong(16, fbtEteResult.getMaximalMet());
        databaseStatement.bindLong(17, fbtEteResult.getMaximalMetMinutes());
        databaseStatement.bindLong(18, fbtEteResult.getRecoveryTime());
        databaseStatement.bindLong(19, fbtEteResult.getDailyPerformance());
        databaseStatement.bindLong(20, fbtEteResult.getAerobicFeedbackNumber());
        databaseStatement.bindLong(21, fbtEteResult.getTimeStamp());
        databaseStatement.bindLong(22, fbtEteResult.getEndTime());
        databaseStatement.bindLong(23, fbtEteResult.getExerciseType());
        databaseStatement.bindLong(24, fbtEteResult.getSyncState());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public FbtEteResult readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        return new FbtEteResult(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.getLong(i + 1), cursor.getInt(i + 2), cursor.getInt(i + 3), cursor.getInt(i + 4), cursor.getInt(i + 5), cursor.getInt(i + 6), cursor.getInt(i + 7), cursor.getInt(i + 8), cursor.getInt(i + 9), cursor.getInt(i + 10), cursor.getInt(i + 11), cursor.getInt(i + 12), cursor.getInt(i + 13), cursor.getInt(i + 14), cursor.getInt(i + 15), cursor.getInt(i + 16), cursor.getInt(i + 17), cursor.getInt(i + 18), cursor.getInt(i + 19), cursor.getLong(i + 20), cursor.getLong(i + 21), cursor.getInt(i + 22), cursor.getInt(i + 23));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, FbtEteResult fbtEteResult, int i) {
        int i2 = i + 0;
        fbtEteResult.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        fbtEteResult.setTrackId(cursor.getLong(i + 1));
        fbtEteResult.setSource(cursor.getInt(i + 2));
        fbtEteResult.setCorrectedHR(cursor.getInt(i + 3));
        fbtEteResult.setArtifactPercent(cursor.getInt(i + 4));
        fbtEteResult.setMinimalHR(cursor.getInt(i + 5));
        fbtEteResult.setMaximalHR(cursor.getInt(i + 6));
        fbtEteResult.setTrainingLoadPeak(cursor.getInt(i + 7));
        fbtEteResult.setTrainingEffect(cursor.getInt(i + 8));
        fbtEteResult.setPercentAchieved(cursor.getInt(i + 9));
        fbtEteResult.setPhraseNumber(cursor.getInt(i + 10));
        fbtEteResult.setPhraseVariableOne(cursor.getInt(i + 11));
        fbtEteResult.setPhraseVariableTwo(cursor.getInt(i + 12));
        fbtEteResult.setEnergyExpenditure(cursor.getInt(i + 13));
        fbtEteResult.setCumulativeEnergyExpenditure(cursor.getInt(i + 14));
        fbtEteResult.setMaximalMet(cursor.getInt(i + 15));
        fbtEteResult.setMaximalMetMinutes(cursor.getInt(i + 16));
        fbtEteResult.setRecoveryTime(cursor.getInt(i + 17));
        fbtEteResult.setDailyPerformance(cursor.getInt(i + 18));
        fbtEteResult.setAerobicFeedbackNumber(cursor.getInt(i + 19));
        fbtEteResult.setTimeStamp(cursor.getLong(i + 20));
        fbtEteResult.setEndTime(cursor.getLong(i + 21));
        fbtEteResult.setExerciseType(cursor.getInt(i + 22));
        fbtEteResult.setSyncState(cursor.getInt(i + 23));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, FbtEteResult fbtEteResult) {
        sQLiteStatement.clearBindings();
        Long id = fbtEteResult.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        sQLiteStatement.bindLong(2, fbtEteResult.getTrackId());
        sQLiteStatement.bindLong(3, fbtEteResult.getSource());
        sQLiteStatement.bindLong(4, fbtEteResult.getCorrectedHR());
        sQLiteStatement.bindLong(5, fbtEteResult.getArtifactPercent());
        sQLiteStatement.bindLong(6, fbtEteResult.getMinimalHR());
        sQLiteStatement.bindLong(7, fbtEteResult.getMaximalHR());
        sQLiteStatement.bindLong(8, fbtEteResult.getTrainingLoadPeak());
        sQLiteStatement.bindLong(9, fbtEteResult.getTrainingEffect());
        sQLiteStatement.bindLong(10, fbtEteResult.getPercentAchieved());
        sQLiteStatement.bindLong(11, fbtEteResult.getPhraseNumber());
        sQLiteStatement.bindLong(12, fbtEteResult.getPhraseVariableOne());
        sQLiteStatement.bindLong(13, fbtEteResult.getPhraseVariableTwo());
        sQLiteStatement.bindLong(14, fbtEteResult.getEnergyExpenditure());
        sQLiteStatement.bindLong(15, fbtEteResult.getCumulativeEnergyExpenditure());
        sQLiteStatement.bindLong(16, fbtEteResult.getMaximalMet());
        sQLiteStatement.bindLong(17, fbtEteResult.getMaximalMetMinutes());
        sQLiteStatement.bindLong(18, fbtEteResult.getRecoveryTime());
        sQLiteStatement.bindLong(19, fbtEteResult.getDailyPerformance());
        sQLiteStatement.bindLong(20, fbtEteResult.getAerobicFeedbackNumber());
        sQLiteStatement.bindLong(21, fbtEteResult.getTimeStamp());
        sQLiteStatement.bindLong(22, fbtEteResult.getEndTime());
        sQLiteStatement.bindLong(23, fbtEteResult.getExerciseType());
        sQLiteStatement.bindLong(24, fbtEteResult.getSyncState());
    }
}
