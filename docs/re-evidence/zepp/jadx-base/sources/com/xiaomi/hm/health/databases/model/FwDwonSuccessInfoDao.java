package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class FwDwonSuccessInfoDao extends AbstractDao<FwDwonSuccessInfo, Long> {
    public static final String TABLENAME = "FW_DWON_SUCCESS_INFO";

    public static class Properties {
        public static final Property BaseResource;
        public static final Property BaseResourceName;
        public static final Property BaseResourcePath;
        public static final Property BaseResourceVersionCode;
        public static final Property BuildTime;
        public static final Property ChangeLog;
        public static final Property ExternalResource;
        public static final Property ExternalResourceName;
        public static final Property ExternalResourcePath;
        public static final Property ExternalResourceVersionCode;
        public static final Property Font;
        public static final Property FontName;
        public static final Property FontPath;
        public static final Property FontVersionCode;
        public static final Property ForceUpgrade;
        public static final Property FwName;
        public static final Property FwPath;
        public static final Property FwRelyVersion;
        public static final Property FwType;
        public static final Property Gps;
        public static final Property GpsName;
        public static final Property GpsPath;
        public static final Property GpsVersionCode;
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property LocalFwHrVersion;
        public static final Property LocalFwHrVersionCode;
        public static final Property LocalFwVersion;
        public static final Property LocalFwVersionCode;
        public static final Property LocalMd5Content;
        public static final Property ProductVersion;
        public static final Property Resource;
        public static final Property ResourceName;
        public static final Property ResourcePath;
        public static final Property ResourceVersionCode;
        public static final Property ServerAppVersion;
        public static final Property Source;

        static {
            Class cls = Integer.TYPE;
            Source = new Property(1, cls, "source", false, "SOURCE");
            ServerAppVersion = new Property(2, cls, "serverAppVersion", false, "SERVER_APP_VERSION");
            LocalFwVersion = new Property(3, String.class, "localFwVersion", false, "LOCAL_FW_VERSION");
            LocalFwVersionCode = new Property(4, cls, "localFwVersionCode", false, "LOCAL_FW_VERSION_CODE");
            LocalFwHrVersion = new Property(5, String.class, "localFwHrVersion", false, "LOCAL_FW_HR_VERSION");
            LocalFwHrVersionCode = new Property(6, cls, "localFwHrVersionCode", false, "LOCAL_FW_HR_VERSION_CODE");
            LocalMd5Content = new Property(7, String.class, "localMd5Content", false, "LOCAL_MD5_CONTENT");
            FwPath = new Property(8, String.class, "fwPath", false, "FW_PATH");
            FwName = new Property(9, String.class, "fwName", false, "FW_NAME");
            FwRelyVersion = new Property(10, String.class, "fwRelyVersion", false, "FW_RELY_VERSION");
            FwType = new Property(11, String.class, "fwType", false, "FW_TYPE");
            ProductVersion = new Property(12, Integer.class, "productVersion", false, "PRODUCT_VERSION");
            Resource = new Property(13, String.class, "resource", false, "RESOURCE");
            ResourceVersionCode = new Property(14, Integer.class, "resourceVersionCode", false, "RESOURCE_VERSION_CODE");
            ResourcePath = new Property(15, String.class, "resourcePath", false, "RESOURCE_PATH");
            ResourceName = new Property(16, String.class, "resourceName", false, "RESOURCE_NAME");
            Gps = new Property(17, String.class, "gps", false, "GPS");
            GpsVersionCode = new Property(18, String.class, "gpsVersionCode", false, "GPS_VERSION_CODE");
            GpsPath = new Property(19, String.class, "gpsPath", false, "GPS_PATH");
            GpsName = new Property(20, String.class, "gpsName", false, "GPS_NAME");
            Font = new Property(21, String.class, "font", false, "FONT");
            FontVersionCode = new Property(22, Integer.class, "fontVersionCode", false, "FONT_VERSION_CODE");
            FontPath = new Property(23, String.class, "fontPath", false, "FONT_PATH");
            FontName = new Property(24, String.class, "fontName", false, "FONT_NAME");
            ForceUpgrade = new Property(25, Boolean.class, "forceUpgrade", false, "FORCE_UPGRADE");
            ChangeLog = new Property(26, String.class, "changeLog", false, "CHANGE_LOG");
            BaseResource = new Property(27, String.class, "baseResource", false, "BASE_RESOURCE");
            BaseResourceVersionCode = new Property(28, Integer.class, "baseResourceVersionCode", false, "BASE_RESOURCE_VERSION_CODE");
            BaseResourcePath = new Property(29, String.class, "baseResourcePath", false, "BASE_RESOURCE_PATH");
            BaseResourceName = new Property(30, String.class, "baseResourceName", false, "BASE_RESOURCE_NAME");
            BuildTime = new Property(31, Integer.class, "buildTime", false, "BUILD_TIME");
            ExternalResource = new Property(32, String.class, "externalResource", false, "EXTERNAL_RESOURCE");
            ExternalResourceVersionCode = new Property(33, Integer.class, "externalResourceVersionCode", false, "EXTERNAL_RESOURCE_VERSION_CODE");
            ExternalResourcePath = new Property(34, String.class, "externalResourcePath", false, "EXTERNAL_RESOURCE_PATH");
            ExternalResourceName = new Property(35, String.class, "externalResourceName", false, "EXTERNAL_RESOURCE_NAME");
        }
    }

    public FwDwonSuccessInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"FW_DWON_SUCCESS_INFO\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"SOURCE\" INTEGER NOT NULL ,\"SERVER_APP_VERSION\" INTEGER NOT NULL ,\"LOCAL_FW_VERSION\" TEXT,\"LOCAL_FW_VERSION_CODE\" INTEGER NOT NULL ,\"LOCAL_FW_HR_VERSION\" TEXT,\"LOCAL_FW_HR_VERSION_CODE\" INTEGER NOT NULL ,\"LOCAL_MD5_CONTENT\" TEXT,\"FW_PATH\" TEXT,\"FW_NAME\" TEXT,\"FW_RELY_VERSION\" TEXT,\"FW_TYPE\" TEXT,\"PRODUCT_VERSION\" INTEGER,\"RESOURCE\" TEXT,\"RESOURCE_VERSION_CODE\" INTEGER,\"RESOURCE_PATH\" TEXT,\"RESOURCE_NAME\" TEXT,\"GPS\" TEXT,\"GPS_VERSION_CODE\" TEXT,\"GPS_PATH\" TEXT,\"GPS_NAME\" TEXT,\"FONT\" TEXT,\"FONT_VERSION_CODE\" INTEGER,\"FONT_PATH\" TEXT,\"FONT_NAME\" TEXT,\"FORCE_UPGRADE\" INTEGER,\"CHANGE_LOG\" TEXT,\"BASE_RESOURCE\" TEXT,\"BASE_RESOURCE_VERSION_CODE\" INTEGER,\"BASE_RESOURCE_PATH\" TEXT,\"BASE_RESOURCE_NAME\" TEXT,\"BUILD_TIME\" INTEGER,\"EXTERNAL_RESOURCE\" TEXT,\"EXTERNAL_RESOURCE_VERSION_CODE\" INTEGER,\"EXTERNAL_RESOURCE_PATH\" TEXT,\"EXTERNAL_RESOURCE_NAME\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"FW_DWON_SUCCESS_INFO\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public FwDwonSuccessInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(FwDwonSuccessInfo fwDwonSuccessInfo) {
        if (fwDwonSuccessInfo != null) {
            return fwDwonSuccessInfo.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(FwDwonSuccessInfo fwDwonSuccessInfo) {
        return fwDwonSuccessInfo.getId() != null;
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
    public final Long updateKeyAfterInsert(FwDwonSuccessInfo fwDwonSuccessInfo, long j) {
        fwDwonSuccessInfo.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, FwDwonSuccessInfo fwDwonSuccessInfo) {
        databaseStatement.clearBindings();
        Long id = fwDwonSuccessInfo.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        databaseStatement.bindLong(2, fwDwonSuccessInfo.getSource());
        databaseStatement.bindLong(3, fwDwonSuccessInfo.getServerAppVersion());
        String localFwVersion = fwDwonSuccessInfo.getLocalFwVersion();
        if (localFwVersion != null) {
            databaseStatement.bindString(4, localFwVersion);
        }
        databaseStatement.bindLong(5, fwDwonSuccessInfo.getLocalFwVersionCode());
        String localFwHrVersion = fwDwonSuccessInfo.getLocalFwHrVersion();
        if (localFwHrVersion != null) {
            databaseStatement.bindString(6, localFwHrVersion);
        }
        databaseStatement.bindLong(7, fwDwonSuccessInfo.getLocalFwHrVersionCode());
        String localMd5Content = fwDwonSuccessInfo.getLocalMd5Content();
        if (localMd5Content != null) {
            databaseStatement.bindString(8, localMd5Content);
        }
        String fwPath = fwDwonSuccessInfo.getFwPath();
        if (fwPath != null) {
            databaseStatement.bindString(9, fwPath);
        }
        String fwName = fwDwonSuccessInfo.getFwName();
        if (fwName != null) {
            databaseStatement.bindString(10, fwName);
        }
        String fwRelyVersion = fwDwonSuccessInfo.getFwRelyVersion();
        if (fwRelyVersion != null) {
            databaseStatement.bindString(11, fwRelyVersion);
        }
        String fwType = fwDwonSuccessInfo.getFwType();
        if (fwType != null) {
            databaseStatement.bindString(12, fwType);
        }
        Integer productVersion = fwDwonSuccessInfo.getProductVersion();
        if (productVersion != null) {
            databaseStatement.bindLong(13, productVersion.intValue());
        }
        String resource = fwDwonSuccessInfo.getResource();
        if (resource != null) {
            databaseStatement.bindString(14, resource);
        }
        Integer resourceVersionCode = fwDwonSuccessInfo.getResourceVersionCode();
        if (resourceVersionCode != null) {
            databaseStatement.bindLong(15, resourceVersionCode.intValue());
        }
        String resourcePath = fwDwonSuccessInfo.getResourcePath();
        if (resourcePath != null) {
            databaseStatement.bindString(16, resourcePath);
        }
        String resourceName = fwDwonSuccessInfo.getResourceName();
        if (resourceName != null) {
            databaseStatement.bindString(17, resourceName);
        }
        String gps = fwDwonSuccessInfo.getGps();
        if (gps != null) {
            databaseStatement.bindString(18, gps);
        }
        String gpsVersionCode = fwDwonSuccessInfo.getGpsVersionCode();
        if (gpsVersionCode != null) {
            databaseStatement.bindString(19, gpsVersionCode);
        }
        String gpsPath = fwDwonSuccessInfo.getGpsPath();
        if (gpsPath != null) {
            databaseStatement.bindString(20, gpsPath);
        }
        String gpsName = fwDwonSuccessInfo.getGpsName();
        if (gpsName != null) {
            databaseStatement.bindString(21, gpsName);
        }
        String font = fwDwonSuccessInfo.getFont();
        if (font != null) {
            databaseStatement.bindString(22, font);
        }
        Integer fontVersionCode = fwDwonSuccessInfo.getFontVersionCode();
        if (fontVersionCode != null) {
            databaseStatement.bindLong(23, fontVersionCode.intValue());
        }
        String fontPath = fwDwonSuccessInfo.getFontPath();
        if (fontPath != null) {
            databaseStatement.bindString(24, fontPath);
        }
        String fontName = fwDwonSuccessInfo.getFontName();
        if (fontName != null) {
            databaseStatement.bindString(25, fontName);
        }
        Boolean forceUpgrade = fwDwonSuccessInfo.getForceUpgrade();
        if (forceUpgrade != null) {
            databaseStatement.bindLong(26, forceUpgrade.booleanValue() ? 1L : 0L);
        }
        String changeLog = fwDwonSuccessInfo.getChangeLog();
        if (changeLog != null) {
            databaseStatement.bindString(27, changeLog);
        }
        String baseResource = fwDwonSuccessInfo.getBaseResource();
        if (baseResource != null) {
            databaseStatement.bindString(28, baseResource);
        }
        Integer baseResourceVersionCode = fwDwonSuccessInfo.getBaseResourceVersionCode();
        if (baseResourceVersionCode != null) {
            databaseStatement.bindLong(29, baseResourceVersionCode.intValue());
        }
        String baseResourcePath = fwDwonSuccessInfo.getBaseResourcePath();
        if (baseResourcePath != null) {
            databaseStatement.bindString(30, baseResourcePath);
        }
        String baseResourceName = fwDwonSuccessInfo.getBaseResourceName();
        if (baseResourceName != null) {
            databaseStatement.bindString(31, baseResourceName);
        }
        Integer buildTime = fwDwonSuccessInfo.getBuildTime();
        if (buildTime != null) {
            databaseStatement.bindLong(32, buildTime.intValue());
        }
        String externalResource = fwDwonSuccessInfo.getExternalResource();
        if (externalResource != null) {
            databaseStatement.bindString(33, externalResource);
        }
        Integer externalResourceVersionCode = fwDwonSuccessInfo.getExternalResourceVersionCode();
        if (externalResourceVersionCode != null) {
            databaseStatement.bindLong(34, externalResourceVersionCode.intValue());
        }
        String externalResourcePath = fwDwonSuccessInfo.getExternalResourcePath();
        if (externalResourcePath != null) {
            databaseStatement.bindString(35, externalResourcePath);
        }
        String externalResourceName = fwDwonSuccessInfo.getExternalResourceName();
        if (externalResourceName != null) {
            databaseStatement.bindString(36, externalResourceName);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public FwDwonSuccessInfo readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = cursor.getInt(i + 1);
        int i4 = cursor.getInt(i + 2);
        int i5 = i + 3;
        String string = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = cursor.getInt(i + 4);
        int i7 = i + 5;
        String string2 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = cursor.getInt(i + 6);
        int i9 = i + 7;
        String string3 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        String string4 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 9;
        String string5 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 10;
        String string6 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 11;
        String string7 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 12;
        Integer numValueOf = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i + 13;
        String string8 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        Integer numValueOf2 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i + 15;
        String string9 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 16;
        String string10 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 17;
        String string11 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 18;
        String string12 = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = i + 19;
        String string13 = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i + 20;
        String string14 = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i + 21;
        String string15 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 22;
        Integer numValueOf3 = cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24));
        int i25 = i + 23;
        String string16 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 24;
        String string17 = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 25;
        if (cursor.isNull(i27)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i27) != 0);
        }
        int i28 = i + 26;
        String string18 = cursor.isNull(i28) ? null : cursor.getString(i28);
        int i29 = i + 27;
        String string19 = cursor.isNull(i29) ? null : cursor.getString(i29);
        int i30 = i + 28;
        Integer numValueOf4 = cursor.isNull(i30) ? null : Integer.valueOf(cursor.getInt(i30));
        int i31 = i + 29;
        String string20 = cursor.isNull(i31) ? null : cursor.getString(i31);
        int i32 = i + 30;
        String string21 = cursor.isNull(i32) ? null : cursor.getString(i32);
        int i33 = i + 31;
        Integer numValueOf5 = cursor.isNull(i33) ? null : Integer.valueOf(cursor.getInt(i33));
        int i34 = i + 32;
        String string22 = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i + 33;
        Integer numValueOf6 = cursor.isNull(i35) ? null : Integer.valueOf(cursor.getInt(i35));
        int i36 = i + 34;
        String string23 = cursor.isNull(i36) ? null : cursor.getString(i36);
        int i37 = i + 35;
        return new FwDwonSuccessInfo(lValueOf, i3, i4, string, i6, string2, i8, string3, string4, string5, string6, string7, numValueOf, string8, numValueOf2, string9, string10, string11, string12, string13, string14, string15, numValueOf3, string16, string17, boolValueOf, string18, string19, numValueOf4, string20, string21, numValueOf5, string22, numValueOf6, string23, cursor.isNull(i37) ? null : cursor.getString(i37));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, FwDwonSuccessInfo fwDwonSuccessInfo, int i) {
        Boolean boolValueOf;
        int i2 = i + 0;
        fwDwonSuccessInfo.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        fwDwonSuccessInfo.setSource(cursor.getInt(i + 1));
        fwDwonSuccessInfo.setServerAppVersion(cursor.getInt(i + 2));
        int i3 = i + 3;
        fwDwonSuccessInfo.setLocalFwVersion(cursor.isNull(i3) ? null : cursor.getString(i3));
        fwDwonSuccessInfo.setLocalFwVersionCode(cursor.getInt(i + 4));
        int i4 = i + 5;
        fwDwonSuccessInfo.setLocalFwHrVersion(cursor.isNull(i4) ? null : cursor.getString(i4));
        fwDwonSuccessInfo.setLocalFwHrVersionCode(cursor.getInt(i + 6));
        int i5 = i + 7;
        fwDwonSuccessInfo.setLocalMd5Content(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 8;
        fwDwonSuccessInfo.setFwPath(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 9;
        fwDwonSuccessInfo.setFwName(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 10;
        fwDwonSuccessInfo.setFwRelyVersion(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 11;
        fwDwonSuccessInfo.setFwType(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 12;
        fwDwonSuccessInfo.setProductVersion(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 13;
        fwDwonSuccessInfo.setResource(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 14;
        fwDwonSuccessInfo.setResourceVersionCode(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 15;
        fwDwonSuccessInfo.setResourcePath(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 16;
        fwDwonSuccessInfo.setResourceName(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 17;
        fwDwonSuccessInfo.setGps(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 18;
        fwDwonSuccessInfo.setGpsVersionCode(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 19;
        fwDwonSuccessInfo.setGpsPath(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i + 20;
        fwDwonSuccessInfo.setGpsName(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i + 21;
        fwDwonSuccessInfo.setFont(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i20 = i + 22;
        fwDwonSuccessInfo.setFontVersionCode(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i + 23;
        fwDwonSuccessInfo.setFontPath(cursor.isNull(i21) ? null : cursor.getString(i21));
        int i22 = i + 24;
        fwDwonSuccessInfo.setFontName(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i + 25;
        if (cursor.isNull(i23)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i23) != 0);
        }
        fwDwonSuccessInfo.setForceUpgrade(boolValueOf);
        int i24 = i + 26;
        fwDwonSuccessInfo.setChangeLog(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i + 27;
        fwDwonSuccessInfo.setBaseResource(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i + 28;
        fwDwonSuccessInfo.setBaseResourceVersionCode(cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26)));
        int i27 = i + 29;
        fwDwonSuccessInfo.setBaseResourcePath(cursor.isNull(i27) ? null : cursor.getString(i27));
        int i28 = i + 30;
        fwDwonSuccessInfo.setBaseResourceName(cursor.isNull(i28) ? null : cursor.getString(i28));
        int i29 = i + 31;
        fwDwonSuccessInfo.setBuildTime(cursor.isNull(i29) ? null : Integer.valueOf(cursor.getInt(i29)));
        int i30 = i + 32;
        fwDwonSuccessInfo.setExternalResource(cursor.isNull(i30) ? null : cursor.getString(i30));
        int i31 = i + 33;
        fwDwonSuccessInfo.setExternalResourceVersionCode(cursor.isNull(i31) ? null : Integer.valueOf(cursor.getInt(i31)));
        int i32 = i + 34;
        fwDwonSuccessInfo.setExternalResourcePath(cursor.isNull(i32) ? null : cursor.getString(i32));
        int i33 = i + 35;
        fwDwonSuccessInfo.setExternalResourceName(cursor.isNull(i33) ? null : cursor.getString(i33));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, FwDwonSuccessInfo fwDwonSuccessInfo) {
        sQLiteStatement.clearBindings();
        Long id = fwDwonSuccessInfo.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        sQLiteStatement.bindLong(2, fwDwonSuccessInfo.getSource());
        sQLiteStatement.bindLong(3, fwDwonSuccessInfo.getServerAppVersion());
        String localFwVersion = fwDwonSuccessInfo.getLocalFwVersion();
        if (localFwVersion != null) {
            sQLiteStatement.bindString(4, localFwVersion);
        }
        sQLiteStatement.bindLong(5, fwDwonSuccessInfo.getLocalFwVersionCode());
        String localFwHrVersion = fwDwonSuccessInfo.getLocalFwHrVersion();
        if (localFwHrVersion != null) {
            sQLiteStatement.bindString(6, localFwHrVersion);
        }
        sQLiteStatement.bindLong(7, fwDwonSuccessInfo.getLocalFwHrVersionCode());
        String localMd5Content = fwDwonSuccessInfo.getLocalMd5Content();
        if (localMd5Content != null) {
            sQLiteStatement.bindString(8, localMd5Content);
        }
        String fwPath = fwDwonSuccessInfo.getFwPath();
        if (fwPath != null) {
            sQLiteStatement.bindString(9, fwPath);
        }
        String fwName = fwDwonSuccessInfo.getFwName();
        if (fwName != null) {
            sQLiteStatement.bindString(10, fwName);
        }
        String fwRelyVersion = fwDwonSuccessInfo.getFwRelyVersion();
        if (fwRelyVersion != null) {
            sQLiteStatement.bindString(11, fwRelyVersion);
        }
        String fwType = fwDwonSuccessInfo.getFwType();
        if (fwType != null) {
            sQLiteStatement.bindString(12, fwType);
        }
        Integer productVersion = fwDwonSuccessInfo.getProductVersion();
        if (productVersion != null) {
            sQLiteStatement.bindLong(13, productVersion.intValue());
        }
        String resource = fwDwonSuccessInfo.getResource();
        if (resource != null) {
            sQLiteStatement.bindString(14, resource);
        }
        Integer resourceVersionCode = fwDwonSuccessInfo.getResourceVersionCode();
        if (resourceVersionCode != null) {
            sQLiteStatement.bindLong(15, resourceVersionCode.intValue());
        }
        String resourcePath = fwDwonSuccessInfo.getResourcePath();
        if (resourcePath != null) {
            sQLiteStatement.bindString(16, resourcePath);
        }
        String resourceName = fwDwonSuccessInfo.getResourceName();
        if (resourceName != null) {
            sQLiteStatement.bindString(17, resourceName);
        }
        String gps = fwDwonSuccessInfo.getGps();
        if (gps != null) {
            sQLiteStatement.bindString(18, gps);
        }
        String gpsVersionCode = fwDwonSuccessInfo.getGpsVersionCode();
        if (gpsVersionCode != null) {
            sQLiteStatement.bindString(19, gpsVersionCode);
        }
        String gpsPath = fwDwonSuccessInfo.getGpsPath();
        if (gpsPath != null) {
            sQLiteStatement.bindString(20, gpsPath);
        }
        String gpsName = fwDwonSuccessInfo.getGpsName();
        if (gpsName != null) {
            sQLiteStatement.bindString(21, gpsName);
        }
        String font = fwDwonSuccessInfo.getFont();
        if (font != null) {
            sQLiteStatement.bindString(22, font);
        }
        Integer fontVersionCode = fwDwonSuccessInfo.getFontVersionCode();
        if (fontVersionCode != null) {
            sQLiteStatement.bindLong(23, fontVersionCode.intValue());
        }
        String fontPath = fwDwonSuccessInfo.getFontPath();
        if (fontPath != null) {
            sQLiteStatement.bindString(24, fontPath);
        }
        String fontName = fwDwonSuccessInfo.getFontName();
        if (fontName != null) {
            sQLiteStatement.bindString(25, fontName);
        }
        Boolean forceUpgrade = fwDwonSuccessInfo.getForceUpgrade();
        if (forceUpgrade != null) {
            sQLiteStatement.bindLong(26, forceUpgrade.booleanValue() ? 1L : 0L);
        }
        String changeLog = fwDwonSuccessInfo.getChangeLog();
        if (changeLog != null) {
            sQLiteStatement.bindString(27, changeLog);
        }
        String baseResource = fwDwonSuccessInfo.getBaseResource();
        if (baseResource != null) {
            sQLiteStatement.bindString(28, baseResource);
        }
        Integer baseResourceVersionCode = fwDwonSuccessInfo.getBaseResourceVersionCode();
        if (baseResourceVersionCode != null) {
            sQLiteStatement.bindLong(29, baseResourceVersionCode.intValue());
        }
        String baseResourcePath = fwDwonSuccessInfo.getBaseResourcePath();
        if (baseResourcePath != null) {
            sQLiteStatement.bindString(30, baseResourcePath);
        }
        String baseResourceName = fwDwonSuccessInfo.getBaseResourceName();
        if (baseResourceName != null) {
            sQLiteStatement.bindString(31, baseResourceName);
        }
        Integer buildTime = fwDwonSuccessInfo.getBuildTime();
        if (buildTime != null) {
            sQLiteStatement.bindLong(32, buildTime.intValue());
        }
        String externalResource = fwDwonSuccessInfo.getExternalResource();
        if (externalResource != null) {
            sQLiteStatement.bindString(33, externalResource);
        }
        Integer externalResourceVersionCode = fwDwonSuccessInfo.getExternalResourceVersionCode();
        if (externalResourceVersionCode != null) {
            sQLiteStatement.bindLong(34, externalResourceVersionCode.intValue());
        }
        String externalResourcePath = fwDwonSuccessInfo.getExternalResourcePath();
        if (externalResourcePath != null) {
            sQLiteStatement.bindString(35, externalResourcePath);
        }
        String externalResourceName = fwDwonSuccessInfo.getExternalResourceName();
        if (externalResourceName != null) {
            sQLiteStatement.bindString(36, externalResourceName);
        }
    }
}
