package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingCourseDao extends AbstractDao<TrainingCourse, Long> {
    public static final String TABLENAME = "TRAINING_COURSE";

    public static class Properties {
        public static final Property TotalDays;
        public static final Property TrainingDays;
        public static final Property TrainingPlanId = new Property(0, Long.class, "trainingPlanId", true, "_id");
        public static final Property Name = new Property(1, String.class, "name", false, "NAME");
        public static final Property DetailsPageIllustrated = new Property(2, String.class, "detailsPageIllustrated", false, "DETAILS_PAGE_ILLUSTRATED");
        public static final Property Consumption = new Property(3, Integer.class, "consumption", false, "CONSUMPTION");
        public static final Property Introduction = new Property(4, String.class, "introduction", false, "INTRODUCTION");
        public static final Property DifficultyDegree = new Property(5, String.class, "difficultyDegree", false, "DIFFICULTY_DEGREE");
        public static final Property StartDay = new Property(6, String.class, "startDay", false, "START_DAY");
        public static final Property Status = new Property(7, String.class, "status", false, "STATUS");
        public static final Property Time = new Property(8, Long.TYPE, "time", false, "TIME");

        static {
            Class cls = Integer.TYPE;
            TotalDays = new Property(9, cls, "totalDays", false, "TOTAL_DAYS");
            TrainingDays = new Property(10, cls, "trainingDays", false, "TRAINING_DAYS");
        }
    }

    public TrainingCourseDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRAINING_COURSE\" (\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"DETAILS_PAGE_ILLUSTRATED\" TEXT,\"CONSUMPTION\" INTEGER,\"INTRODUCTION\" TEXT,\"DIFFICULTY_DEGREE\" TEXT,\"START_DAY\" TEXT,\"STATUS\" TEXT,\"TIME\" INTEGER NOT NULL ,\"TOTAL_DAYS\" INTEGER NOT NULL ,\"TRAINING_DAYS\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRAINING_COURSE\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrainingCourseDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(TrainingCourse trainingCourse) {
        if (trainingCourse != null) {
            return trainingCourse.getTrainingPlanId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(TrainingCourse trainingCourse) {
        return trainingCourse.getTrainingPlanId() != null;
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
    public final Long updateKeyAfterInsert(TrainingCourse trainingCourse, long j) {
        trainingCourse.setTrainingPlanId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, TrainingCourse trainingCourse) {
        databaseStatement.clearBindings();
        Long trainingPlanId = trainingCourse.getTrainingPlanId();
        if (trainingPlanId != null) {
            databaseStatement.bindLong(1, trainingPlanId.longValue());
        }
        String name = trainingCourse.getName();
        if (name != null) {
            databaseStatement.bindString(2, name);
        }
        String detailsPageIllustrated = trainingCourse.getDetailsPageIllustrated();
        if (detailsPageIllustrated != null) {
            databaseStatement.bindString(3, detailsPageIllustrated);
        }
        Integer consumption = trainingCourse.getConsumption();
        if (consumption != null) {
            databaseStatement.bindLong(4, consumption.intValue());
        }
        String introduction = trainingCourse.getIntroduction();
        if (introduction != null) {
            databaseStatement.bindString(5, introduction);
        }
        String difficultyDegree = trainingCourse.getDifficultyDegree();
        if (difficultyDegree != null) {
            databaseStatement.bindString(6, difficultyDegree);
        }
        String startDay = trainingCourse.getStartDay();
        if (startDay != null) {
            databaseStatement.bindString(7, startDay);
        }
        String status = trainingCourse.getStatus();
        if (status != null) {
            databaseStatement.bindString(8, status);
        }
        databaseStatement.bindLong(9, trainingCourse.getTime());
        databaseStatement.bindLong(10, trainingCourse.getTotalDays());
        databaseStatement.bindLong(11, trainingCourse.getTrainingDays());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public TrainingCourse readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        int i5 = i + 3;
        int i6 = i + 4;
        int i7 = i + 5;
        int i8 = i + 6;
        int i9 = i + 7;
        return new TrainingCourse(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : cursor.getString(i3), cursor.isNull(i4) ? null : cursor.getString(i4), cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)), cursor.isNull(i6) ? null : cursor.getString(i6), cursor.isNull(i7) ? null : cursor.getString(i7), cursor.isNull(i8) ? null : cursor.getString(i8), cursor.isNull(i9) ? null : cursor.getString(i9), cursor.getLong(i + 8), cursor.getInt(i + 9), cursor.getInt(i + 10));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, TrainingCourse trainingCourse, int i) {
        int i2 = i + 0;
        trainingCourse.setTrainingPlanId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trainingCourse.setName(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        trainingCourse.setDetailsPageIllustrated(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        trainingCourse.setConsumption(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        trainingCourse.setIntroduction(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        trainingCourse.setDifficultyDegree(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        trainingCourse.setStartDay(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        trainingCourse.setStatus(cursor.isNull(i9) ? null : cursor.getString(i9));
        trainingCourse.setTime(cursor.getLong(i + 8));
        trainingCourse.setTotalDays(cursor.getInt(i + 9));
        trainingCourse.setTrainingDays(cursor.getInt(i + 10));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, TrainingCourse trainingCourse) {
        sQLiteStatement.clearBindings();
        Long trainingPlanId = trainingCourse.getTrainingPlanId();
        if (trainingPlanId != null) {
            sQLiteStatement.bindLong(1, trainingPlanId.longValue());
        }
        String name = trainingCourse.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String detailsPageIllustrated = trainingCourse.getDetailsPageIllustrated();
        if (detailsPageIllustrated != null) {
            sQLiteStatement.bindString(3, detailsPageIllustrated);
        }
        Integer consumption = trainingCourse.getConsumption();
        if (consumption != null) {
            sQLiteStatement.bindLong(4, consumption.intValue());
        }
        String introduction = trainingCourse.getIntroduction();
        if (introduction != null) {
            sQLiteStatement.bindString(5, introduction);
        }
        String difficultyDegree = trainingCourse.getDifficultyDegree();
        if (difficultyDegree != null) {
            sQLiteStatement.bindString(6, difficultyDegree);
        }
        String startDay = trainingCourse.getStartDay();
        if (startDay != null) {
            sQLiteStatement.bindString(7, startDay);
        }
        String status = trainingCourse.getStatus();
        if (status != null) {
            sQLiteStatement.bindString(8, status);
        }
        sQLiteStatement.bindLong(9, trainingCourse.getTime());
        sQLiteStatement.bindLong(10, trainingCourse.getTotalDays());
        sQLiteStatement.bindLong(11, trainingCourse.getTrainingDays());
    }
}
