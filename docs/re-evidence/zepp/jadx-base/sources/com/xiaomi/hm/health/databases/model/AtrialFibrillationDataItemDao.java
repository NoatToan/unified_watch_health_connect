package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huami.hmchartui.utils.Constant;
import com.huami.nfc.applet.EntityKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class AtrialFibrillationDataItemDao extends AbstractDao<AtrialFibrillationDataItem, Long> {
    public static final String TABLENAME = "ATRIAL_FIBRILLATION_DATA_ITEM";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Timestamp = new Property(1, Long.class, "timestamp", false, "TIMESTAMP");
        public static final Property EventType = new Property(2, String.class, "eventType", false, "EVENT_TYPE");
        public static final Property UserId = new Property(3, String.class, "userId", false, Constant.USER_ID);
        public static final Property Active = new Property(4, Integer.class, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false, "ACTIVE");
        public static final Property Sync = new Property(5, Integer.class, "sync", false, EntityKt.FETCH_APDU_MODE_SYNC);
        public static final Property DeviceId = new Property(6, String.class, "deviceId", false, "DEVICE_ID");
        public static final Property DeviceSn = new Property(7, String.class, ParamKey.deviceSn, false, "DEVICE_SN");
        public static final Property DeviceSource = new Property(8, Integer.TYPE, "deviceSource", false, "DEVICE_SOURCE");
        public static final Property DeviceVersion = new Property(9, String.class, "deviceVersion", false, "DEVICE_VERSION");
    }

    public AtrialFibrillationDataItemDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ATRIAL_FIBRILLATION_DATA_ITEM\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TIMESTAMP\" INTEGER,\"EVENT_TYPE\" TEXT,\"USER_ID\" TEXT,\"ACTIVE\" INTEGER,\"SYNC\" INTEGER,\"DEVICE_ID\" TEXT,\"DEVICE_SN\" TEXT,\"DEVICE_SOURCE\" INTEGER NOT NULL ,\"DEVICE_VERSION\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ATRIAL_FIBRILLATION_DATA_ITEM\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AtrialFibrillationDataItemDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(AtrialFibrillationDataItem atrialFibrillationDataItem) {
        if (atrialFibrillationDataItem != null) {
            return atrialFibrillationDataItem.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(AtrialFibrillationDataItem atrialFibrillationDataItem) {
        return atrialFibrillationDataItem.getId() != null;
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
    public final Long updateKeyAfterInsert(AtrialFibrillationDataItem atrialFibrillationDataItem, long j) {
        atrialFibrillationDataItem.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, AtrialFibrillationDataItem atrialFibrillationDataItem) {
        databaseStatement.clearBindings();
        Long id = atrialFibrillationDataItem.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long timestamp = atrialFibrillationDataItem.getTimestamp();
        if (timestamp != null) {
            databaseStatement.bindLong(2, timestamp.longValue());
        }
        String eventType = atrialFibrillationDataItem.getEventType();
        if (eventType != null) {
            databaseStatement.bindString(3, eventType);
        }
        String userId = atrialFibrillationDataItem.getUserId();
        if (userId != null) {
            databaseStatement.bindString(4, userId);
        }
        Integer active = atrialFibrillationDataItem.getActive();
        if (active != null) {
            databaseStatement.bindLong(5, active.intValue());
        }
        Integer sync = atrialFibrillationDataItem.getSync();
        if (sync != null) {
            databaseStatement.bindLong(6, sync.intValue());
        }
        String deviceId = atrialFibrillationDataItem.getDeviceId();
        if (deviceId != null) {
            databaseStatement.bindString(7, deviceId);
        }
        String deviceSn = atrialFibrillationDataItem.getDeviceSn();
        if (deviceSn != null) {
            databaseStatement.bindString(8, deviceSn);
        }
        databaseStatement.bindLong(9, atrialFibrillationDataItem.getDeviceSource());
        String deviceVersion = atrialFibrillationDataItem.getDeviceVersion();
        if (deviceVersion != null) {
            databaseStatement.bindString(10, deviceVersion);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public AtrialFibrillationDataItem readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        String string = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string2 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        Integer numValueOf = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf2 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        String string3 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        String string4 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = cursor.getInt(i + 8);
        int i11 = i + 9;
        return new AtrialFibrillationDataItem(lValueOf, lValueOf2, string, string2, numValueOf, numValueOf2, string3, string4, i10, cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, AtrialFibrillationDataItem atrialFibrillationDataItem, int i) {
        int i2 = i + 0;
        atrialFibrillationDataItem.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        atrialFibrillationDataItem.setTimestamp(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        atrialFibrillationDataItem.setEventType(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        atrialFibrillationDataItem.setUserId(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        atrialFibrillationDataItem.setActive(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        atrialFibrillationDataItem.setSync(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        atrialFibrillationDataItem.setDeviceId(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        atrialFibrillationDataItem.setDeviceSn(cursor.isNull(i9) ? null : cursor.getString(i9));
        atrialFibrillationDataItem.setDeviceSource(cursor.getInt(i + 8));
        int i10 = i + 9;
        atrialFibrillationDataItem.setDeviceVersion(cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, AtrialFibrillationDataItem atrialFibrillationDataItem) {
        sQLiteStatement.clearBindings();
        Long id = atrialFibrillationDataItem.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long timestamp = atrialFibrillationDataItem.getTimestamp();
        if (timestamp != null) {
            sQLiteStatement.bindLong(2, timestamp.longValue());
        }
        String eventType = atrialFibrillationDataItem.getEventType();
        if (eventType != null) {
            sQLiteStatement.bindString(3, eventType);
        }
        String userId = atrialFibrillationDataItem.getUserId();
        if (userId != null) {
            sQLiteStatement.bindString(4, userId);
        }
        Integer active = atrialFibrillationDataItem.getActive();
        if (active != null) {
            sQLiteStatement.bindLong(5, active.intValue());
        }
        Integer sync = atrialFibrillationDataItem.getSync();
        if (sync != null) {
            sQLiteStatement.bindLong(6, sync.intValue());
        }
        String deviceId = atrialFibrillationDataItem.getDeviceId();
        if (deviceId != null) {
            sQLiteStatement.bindString(7, deviceId);
        }
        String deviceSn = atrialFibrillationDataItem.getDeviceSn();
        if (deviceSn != null) {
            sQLiteStatement.bindString(8, deviceSn);
        }
        sQLiteStatement.bindLong(9, atrialFibrillationDataItem.getDeviceSource());
        String deviceVersion = atrialFibrillationDataItem.getDeviceVersion();
        if (deviceVersion != null) {
            sQLiteStatement.bindString(10, deviceVersion);
        }
    }
}
