package com.xiaomi.hm.health.databases.model.trainning;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.stats.CodePackage;
import com.huami.ecg.core.db.entity.EcgData;
import com.tencent.connect.share.QzonePublish;
import com.xiaomi.hm.health.databases.model.DaoSession;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingDetailDao extends AbstractDao<TrainingDetail, Long> {
    public static final String TABLENAME = "TRAINING_DETAIL";

    public static class Properties {
        public static final Property TrainingId = new Property(0, Long.class, "trainingId", true, "_id");
        public static final Property Name = new Property(1, String.class, "name", false, "NAME");
        public static final Property Consumption = new Property(2, Integer.class, "consumption", false, "CONSUMPTION");
        public static final Property ParticipantNumber = new Property(3, Long.class, "participantNumber", false, "PARTICIPANT_NUMBER");
        public static final Property Instrument = new Property(4, String.class, "instrument", false, "INSTRUMENT");
        public static final Property SuitableGender = new Property(5, String.class, "suitableGender", false, "SUITABLE_GENDER");
        public static final Property Function = new Property(6, String.class, "function", false, "FUNCTION");
        public static final Property Location = new Property(7, String.class, "location", false, CodePackage.LOCATION);
        public static final Property Time = new Property(8, String.class, "time", false, "TIME");
        public static final Property UpdateTime = new Property(9, Long.class, EcgData.TIMESTAMP_SERVER_UPDATED, false, "UPDATE_TIME");
        public static final Property DetailsPageIllustrated = new Property(10, String.class, "detailsPageIllustrated", false, "DETAILS_PAGE_ILLUSTRATED");
        public static final Property ListPageIllustrated = new Property(11, String.class, "listPageIllustrated", false, "LIST_PAGE_ILLUSTRATED");
        public static final Property Introduction = new Property(12, String.class, "introduction", false, "INTRODUCTION");
        public static final Property DifficultyDegree = new Property(13, Integer.class, "difficultyDegree", false, "DIFFICULTY_DEGREE");
        public static final Property CoachGender = new Property(14, Integer.class, "coachGender", false, "COACH_GENDER");
        public static final Property Status = new Property(15, Integer.class, "status", false, "STATUS");
        public static final Property FinishNumber = new Property(16, Integer.class, "finishNumber", false, "FINISH_NUMBER");
        public static final Property CoachId = new Property(17, Long.class, "coachId", false, "COACH_ID");
        public static final Property TrainingType = new Property(18, String.class, "trainingType", false, "TRAINING_TYPE");
        public static final Property YogaUrl = new Property(19, String.class, "yogaUrl", false, "YOGA_URL");
        public static final Property VideoSize = new Property(20, Long.TYPE, QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, false, "VIDEO_SIZE");
    }

    public TrainingDetailDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRAINING_DETAIL\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"CONSUMPTION\" INTEGER,\"PARTICIPANT_NUMBER\" INTEGER,\"INSTRUMENT\" TEXT,\"SUITABLE_GENDER\" TEXT,\"FUNCTION\" TEXT,\"LOCATION\" TEXT,\"TIME\" TEXT,\"UPDATE_TIME\" INTEGER,\"DETAILS_PAGE_ILLUSTRATED\" TEXT,\"LIST_PAGE_ILLUSTRATED\" TEXT,\"INTRODUCTION\" TEXT,\"DIFFICULTY_DEGREE\" INTEGER,\"COACH_GENDER\" INTEGER,\"STATUS\" INTEGER,\"FINISH_NUMBER\" INTEGER,\"COACH_ID\" INTEGER,\"TRAINING_TYPE\" TEXT,\"YOGA_URL\" TEXT,\"VIDEO_SIZE\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRAINING_DETAIL\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrainingDetailDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(TrainingDetail trainingDetail) {
        if (trainingDetail != null) {
            return trainingDetail.getTrainingId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(TrainingDetail trainingDetail) {
        return trainingDetail.getTrainingId() != null;
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
    public final Long updateKeyAfterInsert(TrainingDetail trainingDetail, long j) {
        trainingDetail.setTrainingId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, TrainingDetail trainingDetail) {
        databaseStatement.clearBindings();
        Long trainingId = trainingDetail.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(1, trainingId.longValue());
        }
        String name = trainingDetail.getName();
        if (name != null) {
            databaseStatement.bindString(2, name);
        }
        Integer consumption = trainingDetail.getConsumption();
        if (consumption != null) {
            databaseStatement.bindLong(3, consumption.intValue());
        }
        Long participantNumber = trainingDetail.getParticipantNumber();
        if (participantNumber != null) {
            databaseStatement.bindLong(4, participantNumber.longValue());
        }
        String instrument = trainingDetail.getInstrument();
        if (instrument != null) {
            databaseStatement.bindString(5, instrument);
        }
        String suitableGender = trainingDetail.getSuitableGender();
        if (suitableGender != null) {
            databaseStatement.bindString(6, suitableGender);
        }
        String function = trainingDetail.getFunction();
        if (function != null) {
            databaseStatement.bindString(7, function);
        }
        String location = trainingDetail.getLocation();
        if (location != null) {
            databaseStatement.bindString(8, location);
        }
        String time = trainingDetail.getTime();
        if (time != null) {
            databaseStatement.bindString(9, time);
        }
        Long updateTime = trainingDetail.getUpdateTime();
        if (updateTime != null) {
            databaseStatement.bindLong(10, updateTime.longValue());
        }
        String detailsPageIllustrated = trainingDetail.getDetailsPageIllustrated();
        if (detailsPageIllustrated != null) {
            databaseStatement.bindString(11, detailsPageIllustrated);
        }
        String listPageIllustrated = trainingDetail.getListPageIllustrated();
        if (listPageIllustrated != null) {
            databaseStatement.bindString(12, listPageIllustrated);
        }
        String introduction = trainingDetail.getIntroduction();
        if (introduction != null) {
            databaseStatement.bindString(13, introduction);
        }
        Integer difficultyDegree = trainingDetail.getDifficultyDegree();
        if (difficultyDegree != null) {
            databaseStatement.bindLong(14, difficultyDegree.intValue());
        }
        Integer coachGender = trainingDetail.getCoachGender();
        if (coachGender != null) {
            databaseStatement.bindLong(15, coachGender.intValue());
        }
        Integer status = trainingDetail.getStatus();
        if (status != null) {
            databaseStatement.bindLong(16, status.intValue());
        }
        Integer finishNumber = trainingDetail.getFinishNumber();
        if (finishNumber != null) {
            databaseStatement.bindLong(17, finishNumber.intValue());
        }
        Long coachId = trainingDetail.getCoachId();
        if (coachId != null) {
            databaseStatement.bindLong(18, coachId.longValue());
        }
        String trainingType = trainingDetail.getTrainingType();
        if (trainingType != null) {
            databaseStatement.bindString(19, trainingType);
        }
        String yogaUrl = trainingDetail.getYogaUrl();
        if (yogaUrl != null) {
            databaseStatement.bindString(20, yogaUrl);
        }
        databaseStatement.bindLong(21, trainingDetail.getVideoSize());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public TrainingDetail readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        Integer numValueOf = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        Long lValueOf2 = cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5));
        int i6 = i + 4;
        String string2 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        String string3 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        String string4 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        String string5 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        String string6 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 9;
        Long lValueOf3 = cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11));
        int i12 = i + 10;
        String string7 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 11;
        String string8 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 12;
        String string9 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        Integer numValueOf2 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i + 14;
        Integer numValueOf3 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i + 15;
        Integer numValueOf4 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i + 16;
        Integer numValueOf5 = cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18));
        int i19 = i + 17;
        Long lValueOf4 = cursor.isNull(i19) ? null : Long.valueOf(cursor.getLong(i19));
        int i20 = i + 18;
        String string10 = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = i + 19;
        return new TrainingDetail(lValueOf, string, numValueOf, lValueOf2, string2, string3, string4, string5, string6, lValueOf3, string7, string8, string9, numValueOf2, numValueOf3, numValueOf4, numValueOf5, lValueOf4, string10, cursor.isNull(i21) ? null : cursor.getString(i21), cursor.getLong(i + 20));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, TrainingDetail trainingDetail, int i) {
        int i2 = i + 0;
        trainingDetail.setTrainingId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trainingDetail.setName(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        trainingDetail.setConsumption(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        trainingDetail.setParticipantNumber(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        trainingDetail.setInstrument(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        trainingDetail.setSuitableGender(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        trainingDetail.setFunction(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        trainingDetail.setLocation(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        trainingDetail.setTime(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        trainingDetail.setUpdateTime(cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11)));
        int i12 = i + 10;
        trainingDetail.setDetailsPageIllustrated(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 11;
        trainingDetail.setListPageIllustrated(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 12;
        trainingDetail.setIntroduction(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 13;
        trainingDetail.setDifficultyDegree(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i + 14;
        trainingDetail.setCoachGender(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i + 15;
        trainingDetail.setStatus(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i + 16;
        trainingDetail.setFinishNumber(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i + 17;
        trainingDetail.setCoachId(cursor.isNull(i19) ? null : Long.valueOf(cursor.getLong(i19)));
        int i20 = i + 18;
        trainingDetail.setTrainingType(cursor.isNull(i20) ? null : cursor.getString(i20));
        int i21 = i + 19;
        trainingDetail.setYogaUrl(cursor.isNull(i21) ? null : cursor.getString(i21));
        trainingDetail.setVideoSize(cursor.getLong(i + 20));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, TrainingDetail trainingDetail) {
        sQLiteStatement.clearBindings();
        Long trainingId = trainingDetail.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(1, trainingId.longValue());
        }
        String name = trainingDetail.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        Integer consumption = trainingDetail.getConsumption();
        if (consumption != null) {
            sQLiteStatement.bindLong(3, consumption.intValue());
        }
        Long participantNumber = trainingDetail.getParticipantNumber();
        if (participantNumber != null) {
            sQLiteStatement.bindLong(4, participantNumber.longValue());
        }
        String instrument = trainingDetail.getInstrument();
        if (instrument != null) {
            sQLiteStatement.bindString(5, instrument);
        }
        String suitableGender = trainingDetail.getSuitableGender();
        if (suitableGender != null) {
            sQLiteStatement.bindString(6, suitableGender);
        }
        String function = trainingDetail.getFunction();
        if (function != null) {
            sQLiteStatement.bindString(7, function);
        }
        String location = trainingDetail.getLocation();
        if (location != null) {
            sQLiteStatement.bindString(8, location);
        }
        String time = trainingDetail.getTime();
        if (time != null) {
            sQLiteStatement.bindString(9, time);
        }
        Long updateTime = trainingDetail.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(10, updateTime.longValue());
        }
        String detailsPageIllustrated = trainingDetail.getDetailsPageIllustrated();
        if (detailsPageIllustrated != null) {
            sQLiteStatement.bindString(11, detailsPageIllustrated);
        }
        String listPageIllustrated = trainingDetail.getListPageIllustrated();
        if (listPageIllustrated != null) {
            sQLiteStatement.bindString(12, listPageIllustrated);
        }
        String introduction = trainingDetail.getIntroduction();
        if (introduction != null) {
            sQLiteStatement.bindString(13, introduction);
        }
        Integer difficultyDegree = trainingDetail.getDifficultyDegree();
        if (difficultyDegree != null) {
            sQLiteStatement.bindLong(14, difficultyDegree.intValue());
        }
        Integer coachGender = trainingDetail.getCoachGender();
        if (coachGender != null) {
            sQLiteStatement.bindLong(15, coachGender.intValue());
        }
        Integer status = trainingDetail.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(16, status.intValue());
        }
        Integer finishNumber = trainingDetail.getFinishNumber();
        if (finishNumber != null) {
            sQLiteStatement.bindLong(17, finishNumber.intValue());
        }
        Long coachId = trainingDetail.getCoachId();
        if (coachId != null) {
            sQLiteStatement.bindLong(18, coachId.longValue());
        }
        String trainingType = trainingDetail.getTrainingType();
        if (trainingType != null) {
            sQLiteStatement.bindString(19, trainingType);
        }
        String yogaUrl = trainingDetail.getYogaUrl();
        if (yogaUrl != null) {
            sQLiteStatement.bindString(20, yogaUrl);
        }
        sQLiteStatement.bindLong(21, trainingDetail.getVideoSize());
    }
}
