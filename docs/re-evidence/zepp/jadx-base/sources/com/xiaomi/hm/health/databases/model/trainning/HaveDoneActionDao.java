package com.xiaomi.hm.health.databases.model.trainning;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.assistant.calendar.ICalendar;
import com.ingenic.iwds.HardwareList;
import com.xiaomi.hm.health.databases.model.DaoSession;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class HaveDoneActionDao extends AbstractDao<HaveDoneAction, Long> {
    public static final String TABLENAME = "HAVE_DONE_ACTION";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property TrainingId = new Property(1, Long.class, "trainingId", false, "TRAINING_ID");
        public static final Property TrainingStartTime = new Property(2, Long.class, "trainingStartTime", false, "TRAINING_START_TIME");
        public static final Property ActionAudioId = new Property(3, Long.class, "actionAudioId", false, "ACTION_AUDIO_ID");
        public static final Property Name = new Property(4, String.class, "name", false, "NAME");
        public static final Property Round = new Property(5, Integer.class, HardwareList.VALUE_LCD_EXTERIOR_ROUND, false, "ROUND");
        public static final Property Group = new Property(6, Integer.class, "group", false, "GROUP");
        public static final Property Duration = new Property(7, String.class, "duration", false, ICalendar.Property.DURATION);
        public static final Property NextRestTime = new Property(8, Integer.class, "nextRestTime", false, "NEXT_REST_TIME");
        public static final Property Type = new Property(9, String.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property TrainingPlanId = new Property(10, Long.class, "trainingPlanId", false, "TRAINING_PLAN_ID");
        public static final Property RepeatNumber = new Property(11, Integer.class, "repeatNumber", false, "REPEAT_NUMBER");
    }

    public HaveDoneActionDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"HAVE_DONE_ACTION\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRAINING_ID\" INTEGER,\"TRAINING_START_TIME\" INTEGER,\"ACTION_AUDIO_ID\" INTEGER,\"NAME\" TEXT,\"ROUND\" INTEGER,\"GROUP\" INTEGER,\"DURATION\" TEXT,\"NEXT_REST_TIME\" INTEGER,\"TYPE\" TEXT,\"TRAINING_PLAN_ID\" INTEGER,\"REPEAT_NUMBER\" INTEGER);");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_HAVE_DONE_ACTION_TRAINING_ID_TRAINING_START_TIME_ROUND_GROUP_TYPE ON HAVE_DONE_ACTION (\"TRAINING_ID\" ASC,\"TRAINING_START_TIME\" ASC,\"ROUND\" ASC,\"GROUP\" ASC,\"TYPE\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"HAVE_DONE_ACTION\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public HaveDoneActionDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(HaveDoneAction haveDoneAction) {
        if (haveDoneAction != null) {
            return haveDoneAction.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(HaveDoneAction haveDoneAction) {
        return haveDoneAction.getId() != null;
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
    public final Long updateKeyAfterInsert(HaveDoneAction haveDoneAction, long j) {
        haveDoneAction.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, HaveDoneAction haveDoneAction) {
        databaseStatement.clearBindings();
        Long id = haveDoneAction.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trainingId = haveDoneAction.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(2, trainingId.longValue());
        }
        Long trainingStartTime = haveDoneAction.getTrainingStartTime();
        if (trainingStartTime != null) {
            databaseStatement.bindLong(3, trainingStartTime.longValue());
        }
        Long actionAudioId = haveDoneAction.getActionAudioId();
        if (actionAudioId != null) {
            databaseStatement.bindLong(4, actionAudioId.longValue());
        }
        String name = haveDoneAction.getName();
        if (name != null) {
            databaseStatement.bindString(5, name);
        }
        Integer round = haveDoneAction.getRound();
        if (round != null) {
            databaseStatement.bindLong(6, round.intValue());
        }
        Integer group = haveDoneAction.getGroup();
        if (group != null) {
            databaseStatement.bindLong(7, group.intValue());
        }
        String duration = haveDoneAction.getDuration();
        if (duration != null) {
            databaseStatement.bindString(8, duration);
        }
        Integer nextRestTime = haveDoneAction.getNextRestTime();
        if (nextRestTime != null) {
            databaseStatement.bindLong(9, nextRestTime.intValue());
        }
        String type = haveDoneAction.getType();
        if (type != null) {
            databaseStatement.bindString(10, type);
        }
        Long trainingPlanId = haveDoneAction.getTrainingPlanId();
        if (trainingPlanId != null) {
            databaseStatement.bindLong(11, trainingPlanId.longValue());
        }
        Integer repeatNumber = haveDoneAction.getRepeatNumber();
        if (repeatNumber != null) {
            databaseStatement.bindLong(12, repeatNumber.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public HaveDoneAction readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        int i5 = i + 3;
        int i6 = i + 4;
        int i7 = i + 5;
        int i8 = i + 6;
        int i9 = i + 7;
        int i10 = i + 8;
        int i11 = i + 9;
        int i12 = i + 10;
        int i13 = i + 11;
        return new HaveDoneAction(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)), cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)), cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)), cursor.isNull(i6) ? null : cursor.getString(i6), cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)), cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)), cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)), cursor.isNull(i11) ? null : cursor.getString(i11), cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, HaveDoneAction haveDoneAction, int i) {
        int i2 = i + 0;
        haveDoneAction.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        haveDoneAction.setTrainingId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        haveDoneAction.setTrainingStartTime(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        haveDoneAction.setActionAudioId(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        haveDoneAction.setName(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        haveDoneAction.setRound(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        haveDoneAction.setGroup(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        haveDoneAction.setDuration(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        haveDoneAction.setNextRestTime(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 9;
        haveDoneAction.setType(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        haveDoneAction.setTrainingPlanId(cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
        int i13 = i + 11;
        haveDoneAction.setRepeatNumber(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, HaveDoneAction haveDoneAction) {
        sQLiteStatement.clearBindings();
        Long id = haveDoneAction.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trainingId = haveDoneAction.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(2, trainingId.longValue());
        }
        Long trainingStartTime = haveDoneAction.getTrainingStartTime();
        if (trainingStartTime != null) {
            sQLiteStatement.bindLong(3, trainingStartTime.longValue());
        }
        Long actionAudioId = haveDoneAction.getActionAudioId();
        if (actionAudioId != null) {
            sQLiteStatement.bindLong(4, actionAudioId.longValue());
        }
        String name = haveDoneAction.getName();
        if (name != null) {
            sQLiteStatement.bindString(5, name);
        }
        Integer round = haveDoneAction.getRound();
        if (round != null) {
            sQLiteStatement.bindLong(6, round.intValue());
        }
        Integer group = haveDoneAction.getGroup();
        if (group != null) {
            sQLiteStatement.bindLong(7, group.intValue());
        }
        String duration = haveDoneAction.getDuration();
        if (duration != null) {
            sQLiteStatement.bindString(8, duration);
        }
        Integer nextRestTime = haveDoneAction.getNextRestTime();
        if (nextRestTime != null) {
            sQLiteStatement.bindLong(9, nextRestTime.intValue());
        }
        String type = haveDoneAction.getType();
        if (type != null) {
            sQLiteStatement.bindString(10, type);
        }
        Long trainingPlanId = haveDoneAction.getTrainingPlanId();
        if (trainingPlanId != null) {
            sQLiteStatement.bindLong(11, trainingPlanId.longValue());
        }
        Integer repeatNumber = haveDoneAction.getRepeatNumber();
        if (repeatNumber != null) {
            sQLiteStatement.bindLong(12, repeatNumber.intValue());
        }
    }
}
