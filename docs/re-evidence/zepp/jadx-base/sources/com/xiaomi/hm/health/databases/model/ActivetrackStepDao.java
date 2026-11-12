package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.mifit.sportlib.common.Constants;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ActivetrackStepDao extends AbstractDao<ActivetrackStep, Long> {
    public static final String TABLENAME = "ACTIVETRACK_STEP";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Trackid = new Property(1, Long.class, "trackid", false, "TRACKID");
        public static final Property Time = new Property(2, Long.class, "time", false, "TIME");
        public static final Property Steps = new Property(3, Integer.class, GetWatermarkAPI.KEY_NAME_STEPS, false, "STEPS");
        public static final Property Stepl = new Property(4, Float.class, "stepl", false, "STEPL");
        public static final Property StepFreq = new Property(5, Float.class, Constants.DATA_KEY_STEP_FREQ, false, "STEP_FREQ");
    }

    public ActivetrackStepDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ACTIVETRACK_STEP\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRACKID\" INTEGER,\"TIME\" INTEGER,\"STEPS\" INTEGER,\"STEPL\" REAL,\"STEP_FREQ\" REAL,UNIQUE (TRACKID,TIME) ON CONFLICT REPLACE);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ACTIVETRACK_STEP\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ActivetrackStepDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ActivetrackStep activetrackStep) {
        if (activetrackStep != null) {
            return activetrackStep.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ActivetrackStep activetrackStep) {
        return activetrackStep.getId() != null;
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
    public final Long updateKeyAfterInsert(ActivetrackStep activetrackStep, long j) {
        activetrackStep.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ActivetrackStep activetrackStep) {
        databaseStatement.clearBindings();
        Long id = activetrackStep.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trackid = activetrackStep.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(2, trackid.longValue());
        }
        Long time = activetrackStep.getTime();
        if (time != null) {
            databaseStatement.bindLong(3, time.longValue());
        }
        Integer steps = activetrackStep.getSteps();
        if (steps != null) {
            databaseStatement.bindLong(4, steps.intValue());
        }
        Float stepl = activetrackStep.getStepl();
        if (stepl != null) {
            databaseStatement.bindDouble(5, stepl.floatValue());
        }
        Float stepFreq = activetrackStep.getStepFreq();
        if (stepFreq != null) {
            databaseStatement.bindDouble(6, stepFreq.floatValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ActivetrackStep readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Long lValueOf3 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        int i7 = i + 5;
        return new ActivetrackStep(lValueOf, lValueOf2, lValueOf3, numValueOf, cursor.isNull(i6) ? null : Float.valueOf(cursor.getFloat(i6)), cursor.isNull(i7) ? null : Float.valueOf(cursor.getFloat(i7)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ActivetrackStep activetrackStep, int i) {
        int i2 = i + 0;
        activetrackStep.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        activetrackStep.setTrackid(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        activetrackStep.setTime(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        activetrackStep.setSteps(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        activetrackStep.setStepl(cursor.isNull(i6) ? null : Float.valueOf(cursor.getFloat(i6)));
        int i7 = i + 5;
        activetrackStep.setStepFreq(cursor.isNull(i7) ? null : Float.valueOf(cursor.getFloat(i7)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ActivetrackStep activetrackStep) {
        sQLiteStatement.clearBindings();
        Long id = activetrackStep.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trackid = activetrackStep.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(2, trackid.longValue());
        }
        Long time = activetrackStep.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(3, time.longValue());
        }
        Integer steps = activetrackStep.getSteps();
        if (steps != null) {
            sQLiteStatement.bindLong(4, steps.intValue());
        }
        Float stepl = activetrackStep.getStepl();
        if (stepl != null) {
            sQLiteStatement.bindDouble(5, stepl.floatValue());
        }
        Float stepFreq = activetrackStep.getStepFreq();
        if (stepFreq != null) {
            sQLiteStatement.bindDouble(6, stepFreq.floatValue());
        }
    }
}
