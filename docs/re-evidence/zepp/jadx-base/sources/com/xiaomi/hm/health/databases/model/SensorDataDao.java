package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes20.dex */
public class SensorDataDao extends AbstractDao<SensorData, Long> {
    public static final String TABLENAME = "SENSOR_DATA";
    private Query<SensorData> c;

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property LabActionId = new Property(1, Long.class, "labActionId", false, "LAB_ACTION_ID");
        public static final Property SamplingRate = new Property(2, Integer.class, "samplingRate", false, "SAMPLING_RATE");
        public static final Property StartTagTime = new Property(3, Long.class, "startTagTime", false, "START_TAG_TIME");
        public static final Property EndTagTime = new Property(4, Long.class, "endTagTime", false, "END_TAG_TIME");
        public static final Property FileName = new Property(5, String.class, "fileName", false, "FILE_NAME");
        public static final Property SensorType = new Property(6, Integer.class, BehaviorTaggingWebApi.g.w, false, "SENSOR_TYPE");
        public static final Property Resolution = new Property(7, String.class, "resolution", false, "RESOLUTION");
    }

    public SensorDataDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"SENSOR_DATA\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"LAB_ACTION_ID\" INTEGER,\"SAMPLING_RATE\" INTEGER,\"START_TAG_TIME\" INTEGER,\"END_TAG_TIME\" INTEGER,\"FILE_NAME\" TEXT,\"SENSOR_TYPE\" INTEGER,\"RESOLUTION\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"SENSOR_DATA\"");
        database.execSQL(sb.toString());
    }

    public List<SensorData> _queryLabAction_SensorDatas(Long l) {
        synchronized (this) {
            if (this.c == null) {
                QueryBuilder<SensorData> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.LabActionId.eq(null), new WhereCondition[0]);
                this.c = queryBuilder.build();
            }
        }
        Query<SensorData> queryForCurrentThread = this.c.forCurrentThread();
        queryForCurrentThread.setParameter(0, (Object) l);
        return queryForCurrentThread.list();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public SensorDataDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(SensorData sensorData) {
        if (sensorData != null) {
            return sensorData.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(SensorData sensorData) {
        return sensorData.getId() != null;
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
    public final Long updateKeyAfterInsert(SensorData sensorData, long j) {
        sensorData.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, SensorData sensorData) {
        databaseStatement.clearBindings();
        Long id = sensorData.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long labActionId = sensorData.getLabActionId();
        if (labActionId != null) {
            databaseStatement.bindLong(2, labActionId.longValue());
        }
        Integer samplingRate = sensorData.getSamplingRate();
        if (samplingRate != null) {
            databaseStatement.bindLong(3, samplingRate.intValue());
        }
        Long startTagTime = sensorData.getStartTagTime();
        if (startTagTime != null) {
            databaseStatement.bindLong(4, startTagTime.longValue());
        }
        Long endTagTime = sensorData.getEndTagTime();
        if (endTagTime != null) {
            databaseStatement.bindLong(5, endTagTime.longValue());
        }
        String fileName = sensorData.getFileName();
        if (fileName != null) {
            databaseStatement.bindString(6, fileName);
        }
        Integer sensorType = sensorData.getSensorType();
        if (sensorType != null) {
            databaseStatement.bindLong(7, sensorType.intValue());
        }
        String resolution = sensorData.getResolution();
        if (resolution != null) {
            databaseStatement.bindString(8, resolution);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public SensorData readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Integer numValueOf = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        Long lValueOf3 = cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5));
        int i6 = i + 4;
        Long lValueOf4 = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 5;
        String string = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        int i9 = i + 7;
        return new SensorData(lValueOf, lValueOf2, numValueOf, lValueOf3, lValueOf4, string, cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)), cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, SensorData sensorData, int i) {
        int i2 = i + 0;
        sensorData.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        sensorData.setLabActionId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        sensorData.setSamplingRate(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        sensorData.setStartTagTime(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        sensorData.setEndTagTime(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i + 5;
        sensorData.setFileName(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        sensorData.setSensorType(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        sensorData.setResolution(cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, SensorData sensorData) {
        sQLiteStatement.clearBindings();
        Long id = sensorData.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long labActionId = sensorData.getLabActionId();
        if (labActionId != null) {
            sQLiteStatement.bindLong(2, labActionId.longValue());
        }
        Integer samplingRate = sensorData.getSamplingRate();
        if (samplingRate != null) {
            sQLiteStatement.bindLong(3, samplingRate.intValue());
        }
        Long startTagTime = sensorData.getStartTagTime();
        if (startTagTime != null) {
            sQLiteStatement.bindLong(4, startTagTime.longValue());
        }
        Long endTagTime = sensorData.getEndTagTime();
        if (endTagTime != null) {
            sQLiteStatement.bindLong(5, endTagTime.longValue());
        }
        String fileName = sensorData.getFileName();
        if (fileName != null) {
            sQLiteStatement.bindString(6, fileName);
        }
        Integer sensorType = sensorData.getSensorType();
        if (sensorType != null) {
            sQLiteStatement.bindLong(7, sensorType.intValue());
        }
        String resolution = sensorData.getResolution();
        if (resolution != null) {
            sQLiteStatement.bindString(8, resolution);
        }
    }
}
