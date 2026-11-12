package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.hmchartui.utils.Constant;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class DeviceDao extends AbstractDao<Device, String> {
    public static final String TABLENAME = "DEVICE";

    public static class Properties {
        public static final Property Device_id = new Property(0, String.class, "device_id", true, "DEVICE_ID");
        public static final Property Device_address = new Property(1, String.class, "device_address", false, "DEVICE_ADDRESS");
        public static final Property Device_type = new Property(2, Integer.class, "device_type", false, "DEVICE_TYPE");
        public static final Property Device_source = new Property(3, Integer.class, "device_source", false, "DEVICE_SOURCE");
        public static final Property Device_bind_status = new Property(4, Integer.class, "device_bind_status", false, "DEVICE_BIND_STATUS");
        public static final Property Device_bind_time = new Property(5, Long.class, "device_bind_time", false, "DEVICE_BIND_TIME");
        public static final Property Device_sync_data_time = new Property(6, Long.class, "device_sync_data_time", false, "DEVICE_SYNC_DATA_TIME");
        public static final Property Device_sync_data_time_hr = new Property(7, Long.class, "device_sync_data_time_hr", false, "DEVICE_SYNC_DATA_TIME_HR");
        public static final Property Authkey = new Property(8, String.class, "authkey", false, "AUTHKEY");
        public static final Property Time_zone = new Property(9, Integer.class, "time_zone", false, "TIME_ZONE");
        public static final Property Time_zone_sync_hr = new Property(10, Integer.class, "time_zone_sync_hr", false, "TIME_ZONE_SYNC_HR");
        public static final Property Sn = new Property(11, String.class, "sn", false, "SN");
        public static final Property Hr_firmware_version = new Property(12, String.class, "hr_firmware_version", false, "HR_FIRMWARE_VERSION");
        public static final Property Firmware_version = new Property(13, String.class, "firmware_version", false, "FIRMWARE_VERSION");
        public static final Property Migrate_device = new Property(14, Integer.class, "migrate_device", false, "MIGRATE_DEVICE");
        public static final Property UserId = new Property(15, String.class, "UserId", false, Constant.USER_ID);
        public static final Property Status = new Property(16, Integer.class, "status", false, "STATUS");
        public static final Property Gps_sync_time = new Property(17, Long.class, "gps_sync_time", false, "GPS_SYNC_TIME");
        public static final Property Gps_sync_timezone = new Property(18, Long.class, "gps_sync_timezone", false, "GPS_SYNC_TIMEZONE");
        public static final Property ActiveStatus = new Property(19, Integer.class, HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS, false, "ACTIVE_STATUS");
        public static final Property DisplayName = new Property(20, String.class, HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, false, "DISPLAY_NAME");
        public static final Property ProductId = new Property(21, Integer.class, "productId", false, "PRODUCT_ID");
        public static final Property ProductVersion = new Property(22, Integer.class, "productVersion", false, "PRODUCT_VERSION");
        public static final Property BrandType = new Property(23, Integer.class, HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE, false, "BRAND_TYPE");
        public static final Property HardwareVersion = new Property(24, String.class, HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, false, "HARDWARE_VERSION");
        public static final Property PaiSyncTime = new Property(25, Long.class, "paiSyncTime", false, "PAI_SYNC_TIME");
        public static final Property PaiSyncTimeZone = new Property(26, Long.class, "paiSyncTimeZone", false, "PAI_SYNC_TIME_ZONE");
        public static final Property AdditionalInfo = new Property(27, String.class, "additionalInfo", false, "ADDITIONAL_INFO");
        public static final Property LastBindingPlatform = new Property(28, String.class, "lastBindingPlatform", false, "LAST_BINDING_PLATFORM");
        public static final Property AfResultSyncTime = new Property(29, Long.class, "afResultSyncTime", false, "AF_RESULT_SYNC_TIME");
        public static final Property RrIntervalSyncTime = new Property(30, Long.class, "rrIntervalSyncTime", false, "RR_INTERVAL_SYNC_TIME");
        public static final Property PpgSyncTime = new Property(31, Long.class, "ppgSyncTime", false, "PPG_SYNC_TIME");
        public static final Property AfResultSyncTimeZone = new Property(32, Long.class, "afResultSyncTimeZone", false, "AF_RESULT_SYNC_TIME_ZONE");
        public static final Property RrIntervalSyncTimeZone = new Property(33, Long.class, "rrIntervalSyncTimeZone", false, "RR_INTERVAL_SYNC_TIME_ZONE");
        public static final Property PpgSyncTimeZone = new Property(34, Long.class, "ppgSyncTimeZone", false, "PPG_SYNC_TIME_ZONE");
        public static final Property AccSyncTime = new Property(35, Long.class, "accSyncTime", false, "ACC_SYNC_TIME");
        public static final Property AccSyncTimeZone = new Property(36, Long.class, "accSyncTimeZone", false, "ACC_SYNC_TIME_ZONE");
        public static final Property PSpo2SyncTime = new Property(37, Long.class, "pSpo2SyncTime", false, "P_SPO2_SYNC_TIME");
        public static final Property OsaSpo2SyncTime = new Property(38, Long.class, "osaSpo2SyncTime", false, "OSA_SPO2_SYNC_TIME");
        public static final Property OsaEventSyncTime = new Property(39, Long.class, "osaEventSyncTime", false, "OSA_EVENT_SYNC_TIME");
        public static final Property OdiSyncTime = new Property(40, Long.class, "odiSyncTime", false, "ODI_SYNC_TIME");
        public static final Property EcgSyncTime = new Property(41, Long.class, "ecgSyncTime", false, "ECG_SYNC_TIME");
        public static final Property EcgSyncTimeZone = new Property(42, Long.class, "ecgSyncTimeZone", false, "ECG_SYNC_TIME_ZONE");
    }

    public DeviceDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"DEVICE\" (\"DEVICE_ID\" TEXT PRIMARY KEY NOT NULL ,\"DEVICE_ADDRESS\" TEXT,\"DEVICE_TYPE\" INTEGER,\"DEVICE_SOURCE\" INTEGER,\"DEVICE_BIND_STATUS\" INTEGER,\"DEVICE_BIND_TIME\" INTEGER,\"DEVICE_SYNC_DATA_TIME\" INTEGER,\"DEVICE_SYNC_DATA_TIME_HR\" INTEGER,\"AUTHKEY\" TEXT,\"TIME_ZONE\" INTEGER,\"TIME_ZONE_SYNC_HR\" INTEGER,\"SN\" TEXT,\"HR_FIRMWARE_VERSION\" TEXT,\"FIRMWARE_VERSION\" TEXT,\"MIGRATE_DEVICE\" INTEGER,\"USER_ID\" TEXT,\"STATUS\" INTEGER,\"GPS_SYNC_TIME\" INTEGER,\"GPS_SYNC_TIMEZONE\" INTEGER,\"ACTIVE_STATUS\" INTEGER,\"DISPLAY_NAME\" TEXT,\"PRODUCT_ID\" INTEGER,\"PRODUCT_VERSION\" INTEGER,\"BRAND_TYPE\" INTEGER,\"HARDWARE_VERSION\" TEXT,\"PAI_SYNC_TIME\" INTEGER,\"PAI_SYNC_TIME_ZONE\" INTEGER,\"ADDITIONAL_INFO\" TEXT,\"LAST_BINDING_PLATFORM\" TEXT,\"AF_RESULT_SYNC_TIME\" INTEGER,\"RR_INTERVAL_SYNC_TIME\" INTEGER,\"PPG_SYNC_TIME\" INTEGER,\"AF_RESULT_SYNC_TIME_ZONE\" INTEGER,\"RR_INTERVAL_SYNC_TIME_ZONE\" INTEGER,\"PPG_SYNC_TIME_ZONE\" INTEGER,\"ACC_SYNC_TIME\" INTEGER,\"ACC_SYNC_TIME_ZONE\" INTEGER,\"P_SPO2_SYNC_TIME\" INTEGER,\"OSA_SPO2_SYNC_TIME\" INTEGER,\"OSA_EVENT_SYNC_TIME\" INTEGER,\"ODI_SYNC_TIME\" INTEGER,\"ECG_SYNC_TIME\" INTEGER,\"ECG_SYNC_TIME_ZONE\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"DEVICE\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public DeviceDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(Device device) {
        if (device != null) {
            return device.getDevice_id();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Device device) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(Device device, long j) {
        return device.getDevice_id();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Device device) {
        databaseStatement.clearBindings();
        databaseStatement.bindString(1, device.getDevice_id());
        String device_address = device.getDevice_address();
        if (device_address != null) {
            databaseStatement.bindString(2, device_address);
        }
        Integer device_type = device.getDevice_type();
        if (device_type != null) {
            databaseStatement.bindLong(3, device_type.intValue());
        }
        Integer device_source = device.getDevice_source();
        if (device_source != null) {
            databaseStatement.bindLong(4, device_source.intValue());
        }
        Integer device_bind_status = device.getDevice_bind_status();
        if (device_bind_status != null) {
            databaseStatement.bindLong(5, device_bind_status.intValue());
        }
        Long device_bind_time = device.getDevice_bind_time();
        if (device_bind_time != null) {
            databaseStatement.bindLong(6, device_bind_time.longValue());
        }
        Long device_sync_data_time = device.getDevice_sync_data_time();
        if (device_sync_data_time != null) {
            databaseStatement.bindLong(7, device_sync_data_time.longValue());
        }
        Long device_sync_data_time_hr = device.getDevice_sync_data_time_hr();
        if (device_sync_data_time_hr != null) {
            databaseStatement.bindLong(8, device_sync_data_time_hr.longValue());
        }
        String authkey = device.getAuthkey();
        if (authkey != null) {
            databaseStatement.bindString(9, authkey);
        }
        Integer time_zone = device.getTime_zone();
        if (time_zone != null) {
            databaseStatement.bindLong(10, time_zone.intValue());
        }
        Integer time_zone_sync_hr = device.getTime_zone_sync_hr();
        if (time_zone_sync_hr != null) {
            databaseStatement.bindLong(11, time_zone_sync_hr.intValue());
        }
        String sn = device.getSn();
        if (sn != null) {
            databaseStatement.bindString(12, sn);
        }
        String hr_firmware_version = device.getHr_firmware_version();
        if (hr_firmware_version != null) {
            databaseStatement.bindString(13, hr_firmware_version);
        }
        String firmware_version = device.getFirmware_version();
        if (firmware_version != null) {
            databaseStatement.bindString(14, firmware_version);
        }
        Integer migrate_device = device.getMigrate_device();
        if (migrate_device != null) {
            databaseStatement.bindLong(15, migrate_device.intValue());
        }
        String userId = device.getUserId();
        if (userId != null) {
            databaseStatement.bindString(16, userId);
        }
        Integer status = device.getStatus();
        if (status != null) {
            databaseStatement.bindLong(17, status.intValue());
        }
        Long gps_sync_time = device.getGps_sync_time();
        if (gps_sync_time != null) {
            databaseStatement.bindLong(18, gps_sync_time.longValue());
        }
        Long gps_sync_timezone = device.getGps_sync_timezone();
        if (gps_sync_timezone != null) {
            databaseStatement.bindLong(19, gps_sync_timezone.longValue());
        }
        Integer activeStatus = device.getActiveStatus();
        if (activeStatus != null) {
            databaseStatement.bindLong(20, activeStatus.intValue());
        }
        String displayName = device.getDisplayName();
        if (displayName != null) {
            databaseStatement.bindString(21, displayName);
        }
        Integer productId = device.getProductId();
        if (productId != null) {
            databaseStatement.bindLong(22, productId.intValue());
        }
        Integer productVersion = device.getProductVersion();
        if (productVersion != null) {
            databaseStatement.bindLong(23, productVersion.intValue());
        }
        Integer brandType = device.getBrandType();
        if (brandType != null) {
            databaseStatement.bindLong(24, brandType.intValue());
        }
        String hardwareVersion = device.getHardwareVersion();
        if (hardwareVersion != null) {
            databaseStatement.bindString(25, hardwareVersion);
        }
        Long paiSyncTime = device.getPaiSyncTime();
        if (paiSyncTime != null) {
            databaseStatement.bindLong(26, paiSyncTime.longValue());
        }
        Long paiSyncTimeZone = device.getPaiSyncTimeZone();
        if (paiSyncTimeZone != null) {
            databaseStatement.bindLong(27, paiSyncTimeZone.longValue());
        }
        String additionalInfo = device.getAdditionalInfo();
        if (additionalInfo != null) {
            databaseStatement.bindString(28, additionalInfo);
        }
        String lastBindingPlatform = device.getLastBindingPlatform();
        if (lastBindingPlatform != null) {
            databaseStatement.bindString(29, lastBindingPlatform);
        }
        Long afResultSyncTime = device.getAfResultSyncTime();
        if (afResultSyncTime != null) {
            databaseStatement.bindLong(30, afResultSyncTime.longValue());
        }
        Long rrIntervalSyncTime = device.getRrIntervalSyncTime();
        if (rrIntervalSyncTime != null) {
            databaseStatement.bindLong(31, rrIntervalSyncTime.longValue());
        }
        Long ppgSyncTime = device.getPpgSyncTime();
        if (ppgSyncTime != null) {
            databaseStatement.bindLong(32, ppgSyncTime.longValue());
        }
        Long afResultSyncTimeZone = device.getAfResultSyncTimeZone();
        if (afResultSyncTimeZone != null) {
            databaseStatement.bindLong(33, afResultSyncTimeZone.longValue());
        }
        Long rrIntervalSyncTimeZone = device.getRrIntervalSyncTimeZone();
        if (rrIntervalSyncTimeZone != null) {
            databaseStatement.bindLong(34, rrIntervalSyncTimeZone.longValue());
        }
        Long ppgSyncTimeZone = device.getPpgSyncTimeZone();
        if (ppgSyncTimeZone != null) {
            databaseStatement.bindLong(35, ppgSyncTimeZone.longValue());
        }
        Long accSyncTime = device.getAccSyncTime();
        if (accSyncTime != null) {
            databaseStatement.bindLong(36, accSyncTime.longValue());
        }
        Long accSyncTimeZone = device.getAccSyncTimeZone();
        if (accSyncTimeZone != null) {
            databaseStatement.bindLong(37, accSyncTimeZone.longValue());
        }
        Long pSpo2SyncTime = device.getPSpo2SyncTime();
        if (pSpo2SyncTime != null) {
            databaseStatement.bindLong(38, pSpo2SyncTime.longValue());
        }
        Long osaSpo2SyncTime = device.getOsaSpo2SyncTime();
        if (osaSpo2SyncTime != null) {
            databaseStatement.bindLong(39, osaSpo2SyncTime.longValue());
        }
        Long osaEventSyncTime = device.getOsaEventSyncTime();
        if (osaEventSyncTime != null) {
            databaseStatement.bindLong(40, osaEventSyncTime.longValue());
        }
        Long odiSyncTime = device.getOdiSyncTime();
        if (odiSyncTime != null) {
            databaseStatement.bindLong(41, odiSyncTime.longValue());
        }
        Long ecgSyncTime = device.getEcgSyncTime();
        if (ecgSyncTime != null) {
            databaseStatement.bindLong(42, ecgSyncTime.longValue());
        }
        Long ecgSyncTimeZone = device.getEcgSyncTimeZone();
        if (ecgSyncTimeZone != null) {
            databaseStatement.bindLong(43, ecgSyncTimeZone.longValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Device readEntity(Cursor cursor, int i) {
        String string = cursor.getString(i + 0);
        int i2 = i + 1;
        String string2 = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 2;
        Integer numValueOf = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 3;
        Integer numValueOf2 = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 4;
        Integer numValueOf3 = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 5;
        Long lValueOf = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 6;
        Long lValueOf2 = cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7));
        int i8 = i + 7;
        Long lValueOf3 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i + 8;
        String string3 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 9;
        Integer numValueOf4 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i + 10;
        Integer numValueOf5 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i + 11;
        String string4 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 12;
        String string5 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 13;
        String string6 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 14;
        Integer numValueOf6 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i + 15;
        String string7 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 16;
        Integer numValueOf7 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i + 17;
        Long lValueOf4 = cursor.isNull(i18) ? null : Long.valueOf(cursor.getLong(i18));
        int i19 = i + 18;
        Long lValueOf5 = cursor.isNull(i19) ? null : Long.valueOf(cursor.getLong(i19));
        int i20 = i + 19;
        Integer numValueOf8 = cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20));
        int i21 = i + 20;
        String string8 = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i + 21;
        Integer numValueOf9 = cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22));
        int i23 = i + 22;
        Integer numValueOf10 = cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23));
        int i24 = i + 23;
        Integer numValueOf11 = cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24));
        int i25 = i + 24;
        String string9 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 25;
        Long lValueOf6 = cursor.isNull(i26) ? null : Long.valueOf(cursor.getLong(i26));
        int i27 = i + 26;
        Long lValueOf7 = cursor.isNull(i27) ? null : Long.valueOf(cursor.getLong(i27));
        int i28 = i + 27;
        String string10 = cursor.isNull(i28) ? null : cursor.getString(i28);
        int i29 = i + 28;
        String string11 = cursor.isNull(i29) ? null : cursor.getString(i29);
        int i30 = i + 29;
        Long lValueOf8 = cursor.isNull(i30) ? null : Long.valueOf(cursor.getLong(i30));
        int i31 = i + 30;
        Long lValueOf9 = cursor.isNull(i31) ? null : Long.valueOf(cursor.getLong(i31));
        int i32 = i + 31;
        Long lValueOf10 = cursor.isNull(i32) ? null : Long.valueOf(cursor.getLong(i32));
        int i33 = i + 32;
        Long lValueOf11 = cursor.isNull(i33) ? null : Long.valueOf(cursor.getLong(i33));
        int i34 = i + 33;
        Long lValueOf12 = cursor.isNull(i34) ? null : Long.valueOf(cursor.getLong(i34));
        int i35 = i + 34;
        Long lValueOf13 = cursor.isNull(i35) ? null : Long.valueOf(cursor.getLong(i35));
        int i36 = i + 35;
        Long lValueOf14 = cursor.isNull(i36) ? null : Long.valueOf(cursor.getLong(i36));
        int i37 = i + 36;
        Long lValueOf15 = cursor.isNull(i37) ? null : Long.valueOf(cursor.getLong(i37));
        int i38 = i + 37;
        Long lValueOf16 = cursor.isNull(i38) ? null : Long.valueOf(cursor.getLong(i38));
        int i39 = i + 38;
        Long lValueOf17 = cursor.isNull(i39) ? null : Long.valueOf(cursor.getLong(i39));
        int i40 = i + 39;
        Long lValueOf18 = cursor.isNull(i40) ? null : Long.valueOf(cursor.getLong(i40));
        int i41 = i + 40;
        Long lValueOf19 = cursor.isNull(i41) ? null : Long.valueOf(cursor.getLong(i41));
        int i42 = i + 41;
        Long lValueOf20 = cursor.isNull(i42) ? null : Long.valueOf(cursor.getLong(i42));
        int i43 = i + 42;
        return new Device(string, string2, numValueOf, numValueOf2, numValueOf3, lValueOf, lValueOf2, lValueOf3, string3, numValueOf4, numValueOf5, string4, string5, string6, numValueOf6, string7, numValueOf7, lValueOf4, lValueOf5, numValueOf8, string8, numValueOf9, numValueOf10, numValueOf11, string9, lValueOf6, lValueOf7, string10, string11, lValueOf8, lValueOf9, lValueOf10, lValueOf11, lValueOf12, lValueOf13, lValueOf14, lValueOf15, lValueOf16, lValueOf17, lValueOf18, lValueOf19, lValueOf20, cursor.isNull(i43) ? null : Long.valueOf(cursor.getLong(i43)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Device device, int i) {
        device.setDevice_id(cursor.getString(i + 0));
        int i2 = i + 1;
        device.setDevice_address(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        device.setDevice_type(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 3;
        device.setDevice_source(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 4;
        device.setDevice_bind_status(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 5;
        device.setDevice_bind_time(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i + 6;
        device.setDevice_sync_data_time(cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)));
        int i8 = i + 7;
        device.setDevice_sync_data_time_hr(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i + 8;
        device.setAuthkey(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 9;
        device.setTime_zone(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 10;
        device.setTime_zone_sync_hr(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 11;
        device.setSn(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 12;
        device.setHr_firmware_version(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 13;
        device.setFirmware_version(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 14;
        device.setMigrate_device(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i + 15;
        device.setUserId(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 16;
        device.setStatus(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i + 17;
        device.setGps_sync_time(cursor.isNull(i18) ? null : Long.valueOf(cursor.getLong(i18)));
        int i19 = i + 18;
        device.setGps_sync_timezone(cursor.isNull(i19) ? null : Long.valueOf(cursor.getLong(i19)));
        int i20 = i + 19;
        device.setActiveStatus(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i + 20;
        device.setDisplayName(cursor.isNull(i21) ? null : cursor.getString(i21));
        int i22 = i + 21;
        device.setProductId(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
        int i23 = i + 22;
        device.setProductVersion(cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23)));
        int i24 = i + 23;
        device.setBrandType(cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24)));
        int i25 = i + 24;
        device.setHardwareVersion(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i + 25;
        device.setPaiSyncTime(cursor.isNull(i26) ? null : Long.valueOf(cursor.getLong(i26)));
        int i27 = i + 26;
        device.setPaiSyncTimeZone(cursor.isNull(i27) ? null : Long.valueOf(cursor.getLong(i27)));
        int i28 = i + 27;
        device.setAdditionalInfo(cursor.isNull(i28) ? null : cursor.getString(i28));
        int i29 = i + 28;
        device.setLastBindingPlatform(cursor.isNull(i29) ? null : cursor.getString(i29));
        int i30 = i + 29;
        device.setAfResultSyncTime(cursor.isNull(i30) ? null : Long.valueOf(cursor.getLong(i30)));
        int i31 = i + 30;
        device.setRrIntervalSyncTime(cursor.isNull(i31) ? null : Long.valueOf(cursor.getLong(i31)));
        int i32 = i + 31;
        device.setPpgSyncTime(cursor.isNull(i32) ? null : Long.valueOf(cursor.getLong(i32)));
        int i33 = i + 32;
        device.setAfResultSyncTimeZone(cursor.isNull(i33) ? null : Long.valueOf(cursor.getLong(i33)));
        int i34 = i + 33;
        device.setRrIntervalSyncTimeZone(cursor.isNull(i34) ? null : Long.valueOf(cursor.getLong(i34)));
        int i35 = i + 34;
        device.setPpgSyncTimeZone(cursor.isNull(i35) ? null : Long.valueOf(cursor.getLong(i35)));
        int i36 = i + 35;
        device.setAccSyncTime(cursor.isNull(i36) ? null : Long.valueOf(cursor.getLong(i36)));
        int i37 = i + 36;
        device.setAccSyncTimeZone(cursor.isNull(i37) ? null : Long.valueOf(cursor.getLong(i37)));
        int i38 = i + 37;
        device.setPSpo2SyncTime(cursor.isNull(i38) ? null : Long.valueOf(cursor.getLong(i38)));
        int i39 = i + 38;
        device.setOsaSpo2SyncTime(cursor.isNull(i39) ? null : Long.valueOf(cursor.getLong(i39)));
        int i40 = i + 39;
        device.setOsaEventSyncTime(cursor.isNull(i40) ? null : Long.valueOf(cursor.getLong(i40)));
        int i41 = i + 40;
        device.setOdiSyncTime(cursor.isNull(i41) ? null : Long.valueOf(cursor.getLong(i41)));
        int i42 = i + 41;
        device.setEcgSyncTime(cursor.isNull(i42) ? null : Long.valueOf(cursor.getLong(i42)));
        int i43 = i + 42;
        device.setEcgSyncTimeZone(cursor.isNull(i43) ? null : Long.valueOf(cursor.getLong(i43)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Device device) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, device.getDevice_id());
        String device_address = device.getDevice_address();
        if (device_address != null) {
            sQLiteStatement.bindString(2, device_address);
        }
        Integer device_type = device.getDevice_type();
        if (device_type != null) {
            sQLiteStatement.bindLong(3, device_type.intValue());
        }
        Integer device_source = device.getDevice_source();
        if (device_source != null) {
            sQLiteStatement.bindLong(4, device_source.intValue());
        }
        Integer device_bind_status = device.getDevice_bind_status();
        if (device_bind_status != null) {
            sQLiteStatement.bindLong(5, device_bind_status.intValue());
        }
        Long device_bind_time = device.getDevice_bind_time();
        if (device_bind_time != null) {
            sQLiteStatement.bindLong(6, device_bind_time.longValue());
        }
        Long device_sync_data_time = device.getDevice_sync_data_time();
        if (device_sync_data_time != null) {
            sQLiteStatement.bindLong(7, device_sync_data_time.longValue());
        }
        Long device_sync_data_time_hr = device.getDevice_sync_data_time_hr();
        if (device_sync_data_time_hr != null) {
            sQLiteStatement.bindLong(8, device_sync_data_time_hr.longValue());
        }
        String authkey = device.getAuthkey();
        if (authkey != null) {
            sQLiteStatement.bindString(9, authkey);
        }
        Integer time_zone = device.getTime_zone();
        if (time_zone != null) {
            sQLiteStatement.bindLong(10, time_zone.intValue());
        }
        Integer time_zone_sync_hr = device.getTime_zone_sync_hr();
        if (time_zone_sync_hr != null) {
            sQLiteStatement.bindLong(11, time_zone_sync_hr.intValue());
        }
        String sn = device.getSn();
        if (sn != null) {
            sQLiteStatement.bindString(12, sn);
        }
        String hr_firmware_version = device.getHr_firmware_version();
        if (hr_firmware_version != null) {
            sQLiteStatement.bindString(13, hr_firmware_version);
        }
        String firmware_version = device.getFirmware_version();
        if (firmware_version != null) {
            sQLiteStatement.bindString(14, firmware_version);
        }
        Integer migrate_device = device.getMigrate_device();
        if (migrate_device != null) {
            sQLiteStatement.bindLong(15, migrate_device.intValue());
        }
        String userId = device.getUserId();
        if (userId != null) {
            sQLiteStatement.bindString(16, userId);
        }
        Integer status = device.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(17, status.intValue());
        }
        Long gps_sync_time = device.getGps_sync_time();
        if (gps_sync_time != null) {
            sQLiteStatement.bindLong(18, gps_sync_time.longValue());
        }
        Long gps_sync_timezone = device.getGps_sync_timezone();
        if (gps_sync_timezone != null) {
            sQLiteStatement.bindLong(19, gps_sync_timezone.longValue());
        }
        Integer activeStatus = device.getActiveStatus();
        if (activeStatus != null) {
            sQLiteStatement.bindLong(20, activeStatus.intValue());
        }
        String displayName = device.getDisplayName();
        if (displayName != null) {
            sQLiteStatement.bindString(21, displayName);
        }
        Integer productId = device.getProductId();
        if (productId != null) {
            sQLiteStatement.bindLong(22, productId.intValue());
        }
        Integer productVersion = device.getProductVersion();
        if (productVersion != null) {
            sQLiteStatement.bindLong(23, productVersion.intValue());
        }
        Integer brandType = device.getBrandType();
        if (brandType != null) {
            sQLiteStatement.bindLong(24, brandType.intValue());
        }
        String hardwareVersion = device.getHardwareVersion();
        if (hardwareVersion != null) {
            sQLiteStatement.bindString(25, hardwareVersion);
        }
        Long paiSyncTime = device.getPaiSyncTime();
        if (paiSyncTime != null) {
            sQLiteStatement.bindLong(26, paiSyncTime.longValue());
        }
        Long paiSyncTimeZone = device.getPaiSyncTimeZone();
        if (paiSyncTimeZone != null) {
            sQLiteStatement.bindLong(27, paiSyncTimeZone.longValue());
        }
        String additionalInfo = device.getAdditionalInfo();
        if (additionalInfo != null) {
            sQLiteStatement.bindString(28, additionalInfo);
        }
        String lastBindingPlatform = device.getLastBindingPlatform();
        if (lastBindingPlatform != null) {
            sQLiteStatement.bindString(29, lastBindingPlatform);
        }
        Long afResultSyncTime = device.getAfResultSyncTime();
        if (afResultSyncTime != null) {
            sQLiteStatement.bindLong(30, afResultSyncTime.longValue());
        }
        Long rrIntervalSyncTime = device.getRrIntervalSyncTime();
        if (rrIntervalSyncTime != null) {
            sQLiteStatement.bindLong(31, rrIntervalSyncTime.longValue());
        }
        Long ppgSyncTime = device.getPpgSyncTime();
        if (ppgSyncTime != null) {
            sQLiteStatement.bindLong(32, ppgSyncTime.longValue());
        }
        Long afResultSyncTimeZone = device.getAfResultSyncTimeZone();
        if (afResultSyncTimeZone != null) {
            sQLiteStatement.bindLong(33, afResultSyncTimeZone.longValue());
        }
        Long rrIntervalSyncTimeZone = device.getRrIntervalSyncTimeZone();
        if (rrIntervalSyncTimeZone != null) {
            sQLiteStatement.bindLong(34, rrIntervalSyncTimeZone.longValue());
        }
        Long ppgSyncTimeZone = device.getPpgSyncTimeZone();
        if (ppgSyncTimeZone != null) {
            sQLiteStatement.bindLong(35, ppgSyncTimeZone.longValue());
        }
        Long accSyncTime = device.getAccSyncTime();
        if (accSyncTime != null) {
            sQLiteStatement.bindLong(36, accSyncTime.longValue());
        }
        Long accSyncTimeZone = device.getAccSyncTimeZone();
        if (accSyncTimeZone != null) {
            sQLiteStatement.bindLong(37, accSyncTimeZone.longValue());
        }
        Long pSpo2SyncTime = device.getPSpo2SyncTime();
        if (pSpo2SyncTime != null) {
            sQLiteStatement.bindLong(38, pSpo2SyncTime.longValue());
        }
        Long osaSpo2SyncTime = device.getOsaSpo2SyncTime();
        if (osaSpo2SyncTime != null) {
            sQLiteStatement.bindLong(39, osaSpo2SyncTime.longValue());
        }
        Long osaEventSyncTime = device.getOsaEventSyncTime();
        if (osaEventSyncTime != null) {
            sQLiteStatement.bindLong(40, osaEventSyncTime.longValue());
        }
        Long odiSyncTime = device.getOdiSyncTime();
        if (odiSyncTime != null) {
            sQLiteStatement.bindLong(41, odiSyncTime.longValue());
        }
        Long ecgSyncTime = device.getEcgSyncTime();
        if (ecgSyncTime != null) {
            sQLiteStatement.bindLong(42, ecgSyncTime.longValue());
        }
        Long ecgSyncTimeZone = device.getEcgSyncTimeZone();
        if (ecgSyncTimeZone != null) {
            sQLiteStatement.bindLong(43, ecgSyncTimeZone.longValue());
        }
    }
}
