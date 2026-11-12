package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.gms.stats.CodePackage;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.hmchartui.utils.Constant;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.xiaomi.hm.health.databases.model.UserInfos;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class UserInfosDao extends AbstractDao<UserInfos, String> {
    public static final String TABLENAME = "USER_INFOS";

    public static class Properties {
        public static final Property AvatarIdOfScale;
        public static final Property DefaultFields;
        public static final Property MeasureMode;
        public static final Property UserId = new Property(0, String.class, "UserId", true, Constant.USER_ID);
        public static final Property Name = new Property(1, String.class, MAPCookie.KEY_NAME, false, "NAME");
        public static final Property Birthday = new Property(2, String.class, AnalyticsEvents.EVENT_CLICK_BIRTHDAY, false, "BIRTHDAY");
        public static final Property AvatarUrl = new Property(3, String.class, "AvatarUrl", false, "AVATAR_URL");
        public static final Property AvatarPath = new Property(4, String.class, "AvatarPath", false, "AVATAR_PATH");
        public static final Property Gender = new Property(5, Integer.class, "Gender", false, "GENDER");
        public static final Property Height = new Property(6, Integer.class, "Height", false, "HEIGHT");
        public static final Property Synced = new Property(7, Integer.class, "Synced", false, "SYNCED");
        public static final Property Weight = new Property(8, Float.class, "Weight", false, "WEIGHT");
        public static final Property TargetWeight = new Property(9, Float.class, "TargetWeight", false, "TARGET_WEIGHT");
        public static final Property City = new Property(10, String.class, "city", false, "CITY");
        public static final Property Longitude = new Property(11, String.class, com.huami.nfc.web.Constant.KEY_LONGITUDE, false, "LONGITUDE");
        public static final Property Latitude = new Property(12, String.class, com.huami.nfc.web.Constant.KEY_LATITUDE, false, "LATITUDE");
        public static final Property Creat_time = new Property(13, String.class, "creat_time", false, "CREAT_TIME");
        public static final Property Last_login_time = new Property(14, String.class, "last_login_time", false, "LAST_LOGIN_TIME");
        public static final Property Downloaded = new Property(15, Boolean.class, "downloaded", false, "DOWNLOADED");
        public static final Property Location = new Property(16, String.class, "location", false, CodePackage.LOCATION);
        public static final Property UserIntroduction = new Property(17, String.class, HMAccountWebAPI.PARAM_BIND_INTRODUCTION, false, "USER_INTRODUCTION");

        static {
            Class cls = Integer.TYPE;
            AvatarIdOfScale = new Property(18, cls, "avatarIdOfScale", false, "AVATAR_ID_OF_SCALE");
            MeasureMode = new Property(19, cls, "measureMode", false, "MEASURE_MODE");
            DefaultFields = new Property(20, String.class, HMAccountWebAPI.PARAM_DEFAULT_FIELDS, false, "DEFAULT_FIELDS");
        }
    }

    public UserInfosDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"USER_INFOS\" (\"USER_ID\" TEXT PRIMARY KEY NOT NULL ,\"NAME\" TEXT,\"BIRTHDAY\" TEXT,\"AVATAR_URL\" TEXT,\"AVATAR_PATH\" TEXT,\"GENDER\" INTEGER,\"HEIGHT\" INTEGER,\"SYNCED\" INTEGER,\"WEIGHT\" REAL,\"TARGET_WEIGHT\" REAL,\"CITY\" TEXT,\"LONGITUDE\" TEXT,\"LATITUDE\" TEXT,\"CREAT_TIME\" TEXT,\"LAST_LOGIN_TIME\" TEXT,\"DOWNLOADED\" INTEGER,\"LOCATION\" TEXT,\"USER_INTRODUCTION\" TEXT,\"AVATAR_ID_OF_SCALE\" INTEGER NOT NULL ,\"MEASURE_MODE\" INTEGER NOT NULL ,\"DEFAULT_FIELDS\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"USER_INFOS\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public UserInfosDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(UserInfos userInfos) {
        if (userInfos != null) {
            return userInfos.getUserId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(UserInfos userInfos) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(UserInfos userInfos, long j) {
        return userInfos.getUserId();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, UserInfos userInfos) {
        databaseStatement.clearBindings();
        databaseStatement.bindString(1, userInfos.getUserId());
        String name = userInfos.getName();
        if (name != null) {
            databaseStatement.bindString(2, name);
        }
        String birthday = userInfos.getBirthday();
        if (birthday != null) {
            databaseStatement.bindString(3, birthday);
        }
        String avatarUrl = userInfos.getAvatarUrl();
        if (avatarUrl != null) {
            databaseStatement.bindString(4, avatarUrl);
        }
        String avatarPath = userInfos.getAvatarPath();
        if (avatarPath != null) {
            databaseStatement.bindString(5, avatarPath);
        }
        Integer gender = userInfos.getGender();
        if (gender != null) {
            databaseStatement.bindLong(6, gender.intValue());
        }
        Integer height = userInfos.getHeight();
        if (height != null) {
            databaseStatement.bindLong(7, height.intValue());
        }
        Integer synced = userInfos.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(8, synced.intValue());
        }
        Float weight = userInfos.getWeight();
        if (weight != null) {
            databaseStatement.bindDouble(9, weight.floatValue());
        }
        Float targetWeight = userInfos.getTargetWeight();
        if (targetWeight != null) {
            databaseStatement.bindDouble(10, targetWeight.floatValue());
        }
        String city = userInfos.getCity();
        if (city != null) {
            databaseStatement.bindString(11, city);
        }
        String longitude = userInfos.getLongitude();
        if (longitude != null) {
            databaseStatement.bindString(12, longitude);
        }
        String latitude = userInfos.getLatitude();
        if (latitude != null) {
            databaseStatement.bindString(13, latitude);
        }
        String creat_time = userInfos.getCreat_time();
        if (creat_time != null) {
            databaseStatement.bindString(14, creat_time);
        }
        String last_login_time = userInfos.getLast_login_time();
        if (last_login_time != null) {
            databaseStatement.bindString(15, last_login_time);
        }
        Boolean downloaded = userInfos.getDownloaded();
        if (downloaded != null) {
            databaseStatement.bindLong(16, downloaded.booleanValue() ? 1L : 0L);
        }
        String location = userInfos.getLocation();
        if (location != null) {
            databaseStatement.bindString(17, location);
        }
        String userIntroduction = userInfos.getUserIntroduction();
        if (userIntroduction != null) {
            databaseStatement.bindString(18, userIntroduction);
        }
        databaseStatement.bindLong(19, userInfos.getAvatarIdOfScale());
        databaseStatement.bindLong(20, userInfos.getMeasureMode());
        String defaultFields = userInfos.getDefaultFields();
        if (defaultFields != null) {
            databaseStatement.bindString(21, defaultFields);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public UserInfos readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        String string = cursor.getString(i + 0);
        int i2 = i + 1;
        String string2 = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 2;
        String string3 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 3;
        String string4 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 4;
        String string5 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 5;
        Integer numValueOf = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 6;
        Integer numValueOf2 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 7;
        Integer numValueOf3 = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 8;
        Float fValueOf = cursor.isNull(i9) ? null : Float.valueOf(cursor.getFloat(i9));
        int i10 = i + 9;
        Float fValueOf2 = cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10));
        int i11 = i + 10;
        String string6 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 11;
        String string7 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 12;
        String string8 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 13;
        String string9 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 14;
        String string10 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 15;
        if (cursor.isNull(i16)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        int i17 = i + 16;
        String string11 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 17;
        String string12 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 20;
        return new UserInfos(string, string2, string3, string4, string5, numValueOf, numValueOf2, numValueOf3, fValueOf, fValueOf2, string6, string7, string8, string9, string10, boolValueOf, string11, string12, cursor.getInt(i + 18), cursor.getInt(i + 19), cursor.isNull(i19) ? null : cursor.getString(i19));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, UserInfos userInfos, int i) {
        Boolean boolValueOf;
        userInfos.setUserId(cursor.getString(i + 0));
        int i2 = i + 1;
        userInfos.setName(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        userInfos.setBirthday(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 3;
        userInfos.setAvatarUrl(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        userInfos.setAvatarPath(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 5;
        userInfos.setGender(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 6;
        userInfos.setHeight(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 7;
        userInfos.setSynced(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 8;
        userInfos.setWeight(cursor.isNull(i9) ? null : Float.valueOf(cursor.getFloat(i9)));
        int i10 = i + 9;
        userInfos.setTargetWeight(cursor.isNull(i10) ? null : Float.valueOf(cursor.getFloat(i10)));
        int i11 = i + 10;
        userInfos.setCity(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 11;
        userInfos.setLongitude(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 12;
        userInfos.setLatitude(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 13;
        userInfos.setCreat_time(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 14;
        userInfos.setLast_login_time(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 15;
        if (cursor.isNull(i16)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        userInfos.setDownloaded(boolValueOf);
        int i17 = i + 16;
        userInfos.setLocation(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i + 17;
        userInfos.setUserIntroduction(cursor.isNull(i18) ? null : cursor.getString(i18));
        userInfos.setAvatarIdOfScale(cursor.getInt(i + 18));
        userInfos.setMeasureMode(cursor.getInt(i + 19));
        int i19 = i + 20;
        userInfos.setDefaultFields(cursor.isNull(i19) ? null : cursor.getString(i19));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, UserInfos userInfos) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, userInfos.getUserId());
        String name = userInfos.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String birthday = userInfos.getBirthday();
        if (birthday != null) {
            sQLiteStatement.bindString(3, birthday);
        }
        String avatarUrl = userInfos.getAvatarUrl();
        if (avatarUrl != null) {
            sQLiteStatement.bindString(4, avatarUrl);
        }
        String avatarPath = userInfos.getAvatarPath();
        if (avatarPath != null) {
            sQLiteStatement.bindString(5, avatarPath);
        }
        Integer gender = userInfos.getGender();
        if (gender != null) {
            sQLiteStatement.bindLong(6, gender.intValue());
        }
        Integer height = userInfos.getHeight();
        if (height != null) {
            sQLiteStatement.bindLong(7, height.intValue());
        }
        Integer synced = userInfos.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(8, synced.intValue());
        }
        Float weight = userInfos.getWeight();
        if (weight != null) {
            sQLiteStatement.bindDouble(9, weight.floatValue());
        }
        Float targetWeight = userInfos.getTargetWeight();
        if (targetWeight != null) {
            sQLiteStatement.bindDouble(10, targetWeight.floatValue());
        }
        String city = userInfos.getCity();
        if (city != null) {
            sQLiteStatement.bindString(11, city);
        }
        String longitude = userInfos.getLongitude();
        if (longitude != null) {
            sQLiteStatement.bindString(12, longitude);
        }
        String latitude = userInfos.getLatitude();
        if (latitude != null) {
            sQLiteStatement.bindString(13, latitude);
        }
        String creat_time = userInfos.getCreat_time();
        if (creat_time != null) {
            sQLiteStatement.bindString(14, creat_time);
        }
        String last_login_time = userInfos.getLast_login_time();
        if (last_login_time != null) {
            sQLiteStatement.bindString(15, last_login_time);
        }
        Boolean downloaded = userInfos.getDownloaded();
        if (downloaded != null) {
            sQLiteStatement.bindLong(16, downloaded.booleanValue() ? 1L : 0L);
        }
        String location = userInfos.getLocation();
        if (location != null) {
            sQLiteStatement.bindString(17, location);
        }
        String userIntroduction = userInfos.getUserIntroduction();
        if (userIntroduction != null) {
            sQLiteStatement.bindString(18, userIntroduction);
        }
        sQLiteStatement.bindLong(19, userInfos.getAvatarIdOfScale());
        sQLiteStatement.bindLong(20, userInfos.getMeasureMode());
        String defaultFields = userInfos.getDefaultFields();
        if (defaultFields != null) {
            sQLiteStatement.bindString(21, defaultFields);
        }
    }
}
