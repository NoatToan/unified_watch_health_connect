package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.stats.CodePackage;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItem;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingItemDao extends AbstractDao<TrainingItem, Long> {
    public static final String TABLENAME = "TRAINING_ITEM";

    public static class Properties {
        public static final Property TrainingId = new Property(0, Long.class, "trainingId", true, "_id");
        public static final Property Name = new Property(1, String.class, "name", false, "NAME");
        public static final Property ParticipantNumber = new Property(2, Long.class, "participantNumber", false, "PARTICIPANT_NUMBER");
        public static final Property Instrument = new Property(3, String.class, "instrument", false, "INSTRUMENT");
        public static final Property Location = new Property(4, String.class, "location", false, CodePackage.LOCATION);
        public static final Property Time = new Property(5, String.class, "time", false, "TIME");
        public static final Property DifficultyDegree = new Property(6, Integer.class, "difficultyDegree", false, "DIFFICULTY_DEGREE");
        public static final Property ListPageIllustrated = new Property(7, String.class, "listPageIllustrated", false, "LIST_PAGE_ILLUSTRATED");
        public static final Property Status = new Property(8, Integer.class, "status", false, "STATUS");
        public static final Property UpdateTime = new Property(9, Long.class, EcgData.TIMESTAMP_SERVER_UPDATED, false, "UPDATE_TIME");
        public static final Property LastTrainingTime = new Property(10, Long.class, "lastTrainingTime", false, "LAST_TRAINING_TIME");
        public static final Property IsParticipate = new Property(11, Boolean.class, "isParticipate", false, "IS_PARTICIPATE");
        public static final Property ListImgUrl = new Property(12, String.class, "listImgUrl", false, "LIST_IMG_URL");
        public static final Property DetailImgUrl = new Property(13, String.class, "detailImgUrl", false, "DETAIL_IMG_URL");
        public static final Property TrainingType = new Property(14, String.class, "trainingType", false, "TRAINING_TYPE");
        public static final Property ActionAmount = new Property(15, Integer.class, "actionAmount", false, "ACTION_AMOUNT");
    }

    public TrainingItemDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRAINING_ITEM\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"PARTICIPANT_NUMBER\" INTEGER,\"INSTRUMENT\" TEXT,\"LOCATION\" TEXT,\"TIME\" TEXT,\"DIFFICULTY_DEGREE\" INTEGER,\"LIST_PAGE_ILLUSTRATED\" TEXT,\"STATUS\" INTEGER,\"UPDATE_TIME\" INTEGER,\"LAST_TRAINING_TIME\" INTEGER,\"IS_PARTICIPATE\" INTEGER,\"LIST_IMG_URL\" TEXT,\"DETAIL_IMG_URL\" TEXT,\"TRAINING_TYPE\" TEXT,\"ACTION_AMOUNT\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRAINING_ITEM\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrainingItemDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(TrainingItem trainingItem) {
        if (trainingItem != null) {
            return trainingItem.getTrainingId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(TrainingItem trainingItem) {
        return trainingItem.getTrainingId() != null;
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
    public final Long updateKeyAfterInsert(TrainingItem trainingItem, long j) {
        trainingItem.setTrainingId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, TrainingItem trainingItem) {
        databaseStatement.clearBindings();
        Long trainingId = trainingItem.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(1, trainingId.longValue());
        }
        String name = trainingItem.getName();
        if (name != null) {
            databaseStatement.bindString(2, name);
        }
        Long participantNumber = trainingItem.getParticipantNumber();
        if (participantNumber != null) {
            databaseStatement.bindLong(3, participantNumber.longValue());
        }
        String instrument = trainingItem.getInstrument();
        if (instrument != null) {
            databaseStatement.bindString(4, instrument);
        }
        String location = trainingItem.getLocation();
        if (location != null) {
            databaseStatement.bindString(5, location);
        }
        String time = trainingItem.getTime();
        if (time != null) {
            databaseStatement.bindString(6, time);
        }
        Integer difficultyDegree = trainingItem.getDifficultyDegree();
        if (difficultyDegree != null) {
            databaseStatement.bindLong(7, difficultyDegree.intValue());
        }
        String listPageIllustrated = trainingItem.getListPageIllustrated();
        if (listPageIllustrated != null) {
            databaseStatement.bindString(8, listPageIllustrated);
        }
        Integer status = trainingItem.getStatus();
        if (status != null) {
            databaseStatement.bindLong(9, status.intValue());
        }
        Long updateTime = trainingItem.getUpdateTime();
        if (updateTime != null) {
            databaseStatement.bindLong(10, updateTime.longValue());
        }
        Long lastTrainingTime = trainingItem.getLastTrainingTime();
        if (lastTrainingTime != null) {
            databaseStatement.bindLong(11, lastTrainingTime.longValue());
        }
        Boolean isParticipate = trainingItem.getIsParticipate();
        if (isParticipate != null) {
            databaseStatement.bindLong(12, isParticipate.booleanValue() ? 1L : 0L);
        }
        String listImgUrl = trainingItem.getListImgUrl();
        if (listImgUrl != null) {
            databaseStatement.bindString(13, listImgUrl);
        }
        String detailImgUrl = trainingItem.getDetailImgUrl();
        if (detailImgUrl != null) {
            databaseStatement.bindString(14, detailImgUrl);
        }
        String trainingType = trainingItem.getTrainingType();
        if (trainingType != null) {
            databaseStatement.bindString(15, trainingType);
        }
        Integer actionAmount = trainingItem.getActionAmount();
        if (actionAmount != null) {
            databaseStatement.bindLong(16, actionAmount.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public TrainingItem readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        Long lValueOf2 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        String string2 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        String string3 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        String string4 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        Integer numValueOf = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        String string5 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        Integer numValueOf2 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i + 9;
        Long lValueOf3 = cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11));
        int i12 = i + 10;
        Long lValueOf4 = cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12));
        int i13 = i + 11;
        if (cursor.isNull(i13)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        int i14 = i + 12;
        String string6 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        String string7 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        String string8 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 15;
        return new TrainingItem(lValueOf, string, lValueOf2, string2, string3, string4, numValueOf, string5, numValueOf2, lValueOf3, lValueOf4, boolValueOf, string6, string7, string8, cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, TrainingItem trainingItem, int i) {
        Boolean boolValueOf;
        int i2 = i + 0;
        trainingItem.setTrainingId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trainingItem.setName(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        trainingItem.setParticipantNumber(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        trainingItem.setInstrument(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        trainingItem.setLocation(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        trainingItem.setTime(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        trainingItem.setDifficultyDegree(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        trainingItem.setListPageIllustrated(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        trainingItem.setStatus(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 9;
        trainingItem.setUpdateTime(cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11)));
        int i12 = i + 10;
        trainingItem.setLastTrainingTime(cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
        int i13 = i + 11;
        if (cursor.isNull(i13)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        trainingItem.setIsParticipate(boolValueOf);
        int i14 = i + 12;
        trainingItem.setListImgUrl(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 13;
        trainingItem.setDetailImgUrl(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 14;
        trainingItem.setTrainingType(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 15;
        trainingItem.setActionAmount(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, TrainingItem trainingItem) {
        sQLiteStatement.clearBindings();
        Long trainingId = trainingItem.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(1, trainingId.longValue());
        }
        String name = trainingItem.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        Long participantNumber = trainingItem.getParticipantNumber();
        if (participantNumber != null) {
            sQLiteStatement.bindLong(3, participantNumber.longValue());
        }
        String instrument = trainingItem.getInstrument();
        if (instrument != null) {
            sQLiteStatement.bindString(4, instrument);
        }
        String location = trainingItem.getLocation();
        if (location != null) {
            sQLiteStatement.bindString(5, location);
        }
        String time = trainingItem.getTime();
        if (time != null) {
            sQLiteStatement.bindString(6, time);
        }
        Integer difficultyDegree = trainingItem.getDifficultyDegree();
        if (difficultyDegree != null) {
            sQLiteStatement.bindLong(7, difficultyDegree.intValue());
        }
        String listPageIllustrated = trainingItem.getListPageIllustrated();
        if (listPageIllustrated != null) {
            sQLiteStatement.bindString(8, listPageIllustrated);
        }
        Integer status = trainingItem.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(9, status.intValue());
        }
        Long updateTime = trainingItem.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(10, updateTime.longValue());
        }
        Long lastTrainingTime = trainingItem.getLastTrainingTime();
        if (lastTrainingTime != null) {
            sQLiteStatement.bindLong(11, lastTrainingTime.longValue());
        }
        Boolean isParticipate = trainingItem.getIsParticipate();
        if (isParticipate != null) {
            sQLiteStatement.bindLong(12, isParticipate.booleanValue() ? 1L : 0L);
        }
        String listImgUrl = trainingItem.getListImgUrl();
        if (listImgUrl != null) {
            sQLiteStatement.bindString(13, listImgUrl);
        }
        String detailImgUrl = trainingItem.getDetailImgUrl();
        if (detailImgUrl != null) {
            sQLiteStatement.bindString(14, detailImgUrl);
        }
        String trainingType = trainingItem.getTrainingType();
        if (trainingType != null) {
            sQLiteStatement.bindString(15, trainingType);
        }
        Integer actionAmount = trainingItem.getActionAmount();
        if (actionAmount != null) {
            sQLiteStatement.bindLong(16, actionAmount.intValue());
        }
    }
}
