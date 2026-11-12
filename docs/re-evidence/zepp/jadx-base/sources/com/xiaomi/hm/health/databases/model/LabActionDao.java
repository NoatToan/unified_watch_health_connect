package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.hmchartui.utils.Constant;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class LabActionDao extends AbstractDao<LabAction, Long> {
    public static final String TABLENAME = "LAB_ACTION";
    private DaoSession c;

    public static class Properties {
        public static final Property LabActionId = new Property(0, Long.class, "labActionId", true, "LAB_ACTION_ID");
        public static final Property UserId = new Property(1, String.class, "userId", false, Constant.USER_ID);
        public static final Property ProductVersion = new Property(2, Integer.class, "productVersion", false, "PRODUCT_VERSION");
        public static final Property ProtocolVersion = new Property(3, Integer.class, BehaviorTaggingWebApi.g.g, false, "PROTOCOL_VERSION");
        public static final Property DeviceId = new Property(4, String.class, "deviceId", false, "DEVICE_ID");
        public static final Property DeviceSource = new Property(5, Integer.class, "deviceSource", false, "DEVICE_SOURCE");
        public static final Property BehaviorName = new Property(6, String.class, BehaviorTaggingWebApi.g.j, false, "BEHAVIOR_NAME");
        public static final Property CustomizeBehaviorName = new Property(7, String.class, BehaviorTaggingWebApi.g.k, false, "CUSTOMIZE_BEHAVIOR_NAME");
        public static final Property ZipFileName = new Property(8, String.class, BehaviorTaggingWebApi.g.m, false, "ZIP_FILE_NAME");
        public static final Property UploadStatus = new Property(9, Integer.class, "uploadStatus", false, "UPLOAD_STATUS");
        public static final Property TimeZone = new Property(10, Integer.class, "timeZone", false, "TIME_ZONE");
        public static final Property StartBehaviorTime = new Property(11, Long.class, "startBehaviorTime", false, "START_BEHAVIOR_TIME");
        public static final Property EndBehaviorTime = new Property(12, Long.class, BehaviorTaggingWebApi.g.q, false, "END_BEHAVIOR_TIME");
    }

    public LabActionDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"LAB_ACTION\" (\"LAB_ACTION_ID\" INTEGER PRIMARY KEY ,\"USER_ID\" TEXT,\"PRODUCT_VERSION\" INTEGER,\"PROTOCOL_VERSION\" INTEGER,\"DEVICE_ID\" TEXT,\"DEVICE_SOURCE\" INTEGER,\"BEHAVIOR_NAME\" TEXT,\"CUSTOMIZE_BEHAVIOR_NAME\" TEXT,\"ZIP_FILE_NAME\" TEXT,\"UPLOAD_STATUS\" INTEGER,\"TIME_ZONE\" INTEGER,\"START_BEHAVIOR_TIME\" INTEGER,\"END_BEHAVIOR_TIME\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"LAB_ACTION\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public LabActionDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        this.c = daoSession;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void attachEntity(LabAction labAction) {
        super.attachEntity(labAction);
        labAction.__setDaoSession(this.c);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(LabAction labAction) {
        if (labAction != null) {
            return labAction.getLabActionId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(LabAction labAction) {
        return labAction.getLabActionId() != null;
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
    public final Long updateKeyAfterInsert(LabAction labAction, long j) {
        labAction.setLabActionId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, LabAction labAction) {
        databaseStatement.clearBindings();
        Long labActionId = labAction.getLabActionId();
        if (labActionId != null) {
            databaseStatement.bindLong(1, labActionId.longValue());
        }
        String userId = labAction.getUserId();
        if (userId != null) {
            databaseStatement.bindString(2, userId);
        }
        Integer productVersion = labAction.getProductVersion();
        if (productVersion != null) {
            databaseStatement.bindLong(3, productVersion.intValue());
        }
        Integer protocolVersion = labAction.getProtocolVersion();
        if (protocolVersion != null) {
            databaseStatement.bindLong(4, protocolVersion.intValue());
        }
        String deviceId = labAction.getDeviceId();
        if (deviceId != null) {
            databaseStatement.bindString(5, deviceId);
        }
        Integer deviceSource = labAction.getDeviceSource();
        if (deviceSource != null) {
            databaseStatement.bindLong(6, deviceSource.intValue());
        }
        String behaviorName = labAction.getBehaviorName();
        if (behaviorName != null) {
            databaseStatement.bindString(7, behaviorName);
        }
        String customizeBehaviorName = labAction.getCustomizeBehaviorName();
        if (customizeBehaviorName != null) {
            databaseStatement.bindString(8, customizeBehaviorName);
        }
        String zipFileName = labAction.getZipFileName();
        if (zipFileName != null) {
            databaseStatement.bindString(9, zipFileName);
        }
        Integer uploadStatus = labAction.getUploadStatus();
        if (uploadStatus != null) {
            databaseStatement.bindLong(10, uploadStatus.intValue());
        }
        Integer timeZone = labAction.getTimeZone();
        if (timeZone != null) {
            databaseStatement.bindLong(11, timeZone.intValue());
        }
        Long startBehaviorTime = labAction.getStartBehaviorTime();
        if (startBehaviorTime != null) {
            databaseStatement.bindLong(12, startBehaviorTime.longValue());
        }
        Long endBehaviorTime = labAction.getEndBehaviorTime();
        if (endBehaviorTime != null) {
            databaseStatement.bindLong(13, endBehaviorTime.longValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public LabAction readEntity(Cursor cursor, int i) {
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
        int i14 = i + 12;
        return new LabAction(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : cursor.getString(i3), cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)), cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)), cursor.isNull(i6) ? null : cursor.getString(i6), cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)), cursor.isNull(i8) ? null : cursor.getString(i8), cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)), cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, LabAction labAction, int i) {
        int i2 = i + 0;
        labAction.setLabActionId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        labAction.setUserId(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        labAction.setProductVersion(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        labAction.setProtocolVersion(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        labAction.setDeviceId(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        labAction.setDeviceSource(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        labAction.setBehaviorName(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        labAction.setCustomizeBehaviorName(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        labAction.setZipFileName(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        labAction.setUploadStatus(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 10;
        labAction.setTimeZone(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 11;
        labAction.setStartBehaviorTime(cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)));
        int i14 = i + 12;
        labAction.setEndBehaviorTime(cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, LabAction labAction) {
        sQLiteStatement.clearBindings();
        Long labActionId = labAction.getLabActionId();
        if (labActionId != null) {
            sQLiteStatement.bindLong(1, labActionId.longValue());
        }
        String userId = labAction.getUserId();
        if (userId != null) {
            sQLiteStatement.bindString(2, userId);
        }
        Integer productVersion = labAction.getProductVersion();
        if (productVersion != null) {
            sQLiteStatement.bindLong(3, productVersion.intValue());
        }
        Integer protocolVersion = labAction.getProtocolVersion();
        if (protocolVersion != null) {
            sQLiteStatement.bindLong(4, protocolVersion.intValue());
        }
        String deviceId = labAction.getDeviceId();
        if (deviceId != null) {
            sQLiteStatement.bindString(5, deviceId);
        }
        Integer deviceSource = labAction.getDeviceSource();
        if (deviceSource != null) {
            sQLiteStatement.bindLong(6, deviceSource.intValue());
        }
        String behaviorName = labAction.getBehaviorName();
        if (behaviorName != null) {
            sQLiteStatement.bindString(7, behaviorName);
        }
        String customizeBehaviorName = labAction.getCustomizeBehaviorName();
        if (customizeBehaviorName != null) {
            sQLiteStatement.bindString(8, customizeBehaviorName);
        }
        String zipFileName = labAction.getZipFileName();
        if (zipFileName != null) {
            sQLiteStatement.bindString(9, zipFileName);
        }
        Integer uploadStatus = labAction.getUploadStatus();
        if (uploadStatus != null) {
            sQLiteStatement.bindLong(10, uploadStatus.intValue());
        }
        Integer timeZone = labAction.getTimeZone();
        if (timeZone != null) {
            sQLiteStatement.bindLong(11, timeZone.intValue());
        }
        Long startBehaviorTime = labAction.getStartBehaviorTime();
        if (startBehaviorTime != null) {
            sQLiteStatement.bindLong(12, startBehaviorTime.longValue());
        }
        Long endBehaviorTime = labAction.getEndBehaviorTime();
        if (endBehaviorTime != null) {
            sQLiteStatement.bindLong(13, endBehaviorTime.longValue());
        }
    }
}
