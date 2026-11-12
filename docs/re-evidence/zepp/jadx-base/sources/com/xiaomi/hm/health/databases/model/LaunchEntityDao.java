package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.facebook.share.internal.ShareConstants;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class LaunchEntityDao extends AbstractDao<LaunchEntity, Long> {
    public static final String TABLENAME = "LAUNCH_ENTITY";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property StartTime = new Property(1, Long.class, "startTime", false, "START_TIME");
        public static final Property EndTime = new Property(2, Long.class, "endTime", false, "END_TIME");
        public static final Property Title = new Property(3, String.class, "title", false, ShareConstants.TITLE);
        public static final Property Url = new Property(4, String.class, "url", false, DTransferConstants.URL);
        public static final Property ImageUrl = new Property(5, String.class, "imageUrl", false, "IMAGE_URL");
        public static final Property Sort = new Property(6, Integer.class, "sort", false, "SORT");
        public static final Property Province = new Property(7, String.class, "province", false, "PROVINCE");
        public static final Property City = new Property(8, String.class, "city", false, "CITY");
        public static final Property Share = new Property(9, Integer.class, "share", false, "SHARE");
        public static final Property ShareTtitle = new Property(10, String.class, "shareTtitle", false, "SHARE_TTITLE");
        public static final Property ShareSubtitle = new Property(11, String.class, "shareSubtitle", false, "SHARE_SUBTITLE");
        public static final Property ShareUrl = new Property(12, String.class, "shareUrl", false, "SHARE_URL");
        public static final Property AppId = new Property(13, String.class, "appId", false, "APP_ID");
        public static final Property Cookie = new Property(14, String.class, AbstractJSONTokenResponse.COOKIE, false, "COOKIE");
        public static final Property AdType = new Property(15, String.class, "adType", false, "AD_TYPE");
        public static final Property IsLoadWithGPRS = new Property(16, Integer.class, "isLoadWithGPRS", false, "IS_LOAD_WITH_GPRS");
        public static final Property BgVideoUrl = new Property(17, String.class, "bgVideoUrl", false, "BG_VIDEO_URL");
        public static final Property Extensions = new Property(18, String.class, GPXTrackPoint.XML.TAG_EXTENSIONS, false, "EXTENSIONS");
        public static final Property Mode = new Property(19, Integer.class, "mode", false, "MODE");
    }

    public LaunchEntityDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"LAUNCH_ENTITY\" (\"_id\" INTEGER PRIMARY KEY ,\"START_TIME\" INTEGER,\"END_TIME\" INTEGER,\"TITLE\" TEXT,\"URL\" TEXT,\"IMAGE_URL\" TEXT,\"SORT\" INTEGER,\"PROVINCE\" TEXT,\"CITY\" TEXT,\"SHARE\" INTEGER,\"SHARE_TTITLE\" TEXT,\"SHARE_SUBTITLE\" TEXT,\"SHARE_URL\" TEXT,\"APP_ID\" TEXT,\"COOKIE\" TEXT,\"AD_TYPE\" TEXT,\"IS_LOAD_WITH_GPRS\" INTEGER,\"BG_VIDEO_URL\" TEXT,\"EXTENSIONS\" TEXT,\"MODE\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"LAUNCH_ENTITY\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public LaunchEntityDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(LaunchEntity launchEntity) {
        if (launchEntity != null) {
            return launchEntity.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(LaunchEntity launchEntity) {
        return launchEntity.getId() != null;
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
    public final Long updateKeyAfterInsert(LaunchEntity launchEntity, long j) {
        launchEntity.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, LaunchEntity launchEntity) {
        databaseStatement.clearBindings();
        Long id = launchEntity.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long startTime = launchEntity.getStartTime();
        if (startTime != null) {
            databaseStatement.bindLong(2, startTime.longValue());
        }
        Long endTime = launchEntity.getEndTime();
        if (endTime != null) {
            databaseStatement.bindLong(3, endTime.longValue());
        }
        String title = launchEntity.getTitle();
        if (title != null) {
            databaseStatement.bindString(4, title);
        }
        String url = launchEntity.getUrl();
        if (url != null) {
            databaseStatement.bindString(5, url);
        }
        String imageUrl = launchEntity.getImageUrl();
        if (imageUrl != null) {
            databaseStatement.bindString(6, imageUrl);
        }
        Integer sort = launchEntity.getSort();
        if (sort != null) {
            databaseStatement.bindLong(7, sort.intValue());
        }
        String province = launchEntity.getProvince();
        if (province != null) {
            databaseStatement.bindString(8, province);
        }
        String city = launchEntity.getCity();
        if (city != null) {
            databaseStatement.bindString(9, city);
        }
        Integer share = launchEntity.getShare();
        if (share != null) {
            databaseStatement.bindLong(10, share.intValue());
        }
        String shareTtitle = launchEntity.getShareTtitle();
        if (shareTtitle != null) {
            databaseStatement.bindString(11, shareTtitle);
        }
        String shareSubtitle = launchEntity.getShareSubtitle();
        if (shareSubtitle != null) {
            databaseStatement.bindString(12, shareSubtitle);
        }
        String shareUrl = launchEntity.getShareUrl();
        if (shareUrl != null) {
            databaseStatement.bindString(13, shareUrl);
        }
        String appId = launchEntity.getAppId();
        if (appId != null) {
            databaseStatement.bindString(14, appId);
        }
        String cookie = launchEntity.getCookie();
        if (cookie != null) {
            databaseStatement.bindString(15, cookie);
        }
        String adType = launchEntity.getAdType();
        if (adType != null) {
            databaseStatement.bindString(16, adType);
        }
        Integer isLoadWithGPRS = launchEntity.getIsLoadWithGPRS();
        if (isLoadWithGPRS != null) {
            databaseStatement.bindLong(17, isLoadWithGPRS.intValue());
        }
        String bgVideoUrl = launchEntity.getBgVideoUrl();
        if (bgVideoUrl != null) {
            databaseStatement.bindString(18, bgVideoUrl);
        }
        String extensions = launchEntity.getExtensions();
        if (extensions != null) {
            databaseStatement.bindString(19, extensions);
        }
        Integer mode = launchEntity.getMode();
        if (mode != null) {
            databaseStatement.bindLong(20, mode.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public LaunchEntity readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Long lValueOf3 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        String string = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        String string2 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        String string3 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        Integer numValueOf = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        String string4 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        String string5 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 9;
        Integer numValueOf2 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i + 10;
        String string6 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 11;
        String string7 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 12;
        String string8 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        String string9 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        String string10 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 15;
        String string11 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 16;
        Integer numValueOf3 = cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18));
        int i19 = i + 17;
        String string12 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 18;
        String string13 = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = i + 19;
        return new LaunchEntity(lValueOf, lValueOf2, lValueOf3, string, string2, string3, numValueOf, string4, string5, numValueOf2, string6, string7, string8, string9, string10, string11, numValueOf3, string12, string13, cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, LaunchEntity launchEntity, int i) {
        int i2 = i + 0;
        launchEntity.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        launchEntity.setStartTime(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        launchEntity.setEndTime(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        launchEntity.setTitle(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        launchEntity.setUrl(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        launchEntity.setImageUrl(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        launchEntity.setSort(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        launchEntity.setProvince(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        launchEntity.setCity(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        launchEntity.setShare(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 10;
        launchEntity.setShareTtitle(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 11;
        launchEntity.setShareSubtitle(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 12;
        launchEntity.setShareUrl(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 13;
        launchEntity.setAppId(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 14;
        launchEntity.setCookie(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 15;
        launchEntity.setAdType(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i + 16;
        launchEntity.setIsLoadWithGPRS(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i + 17;
        launchEntity.setBgVideoUrl(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i20 = i + 18;
        launchEntity.setExtensions(cursor.isNull(i20) ? null : cursor.getString(i20));
        int i21 = i + 19;
        launchEntity.setMode(cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, LaunchEntity launchEntity) {
        sQLiteStatement.clearBindings();
        Long id = launchEntity.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long startTime = launchEntity.getStartTime();
        if (startTime != null) {
            sQLiteStatement.bindLong(2, startTime.longValue());
        }
        Long endTime = launchEntity.getEndTime();
        if (endTime != null) {
            sQLiteStatement.bindLong(3, endTime.longValue());
        }
        String title = launchEntity.getTitle();
        if (title != null) {
            sQLiteStatement.bindString(4, title);
        }
        String url = launchEntity.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(5, url);
        }
        String imageUrl = launchEntity.getImageUrl();
        if (imageUrl != null) {
            sQLiteStatement.bindString(6, imageUrl);
        }
        Integer sort = launchEntity.getSort();
        if (sort != null) {
            sQLiteStatement.bindLong(7, sort.intValue());
        }
        String province = launchEntity.getProvince();
        if (province != null) {
            sQLiteStatement.bindString(8, province);
        }
        String city = launchEntity.getCity();
        if (city != null) {
            sQLiteStatement.bindString(9, city);
        }
        Integer share = launchEntity.getShare();
        if (share != null) {
            sQLiteStatement.bindLong(10, share.intValue());
        }
        String shareTtitle = launchEntity.getShareTtitle();
        if (shareTtitle != null) {
            sQLiteStatement.bindString(11, shareTtitle);
        }
        String shareSubtitle = launchEntity.getShareSubtitle();
        if (shareSubtitle != null) {
            sQLiteStatement.bindString(12, shareSubtitle);
        }
        String shareUrl = launchEntity.getShareUrl();
        if (shareUrl != null) {
            sQLiteStatement.bindString(13, shareUrl);
        }
        String appId = launchEntity.getAppId();
        if (appId != null) {
            sQLiteStatement.bindString(14, appId);
        }
        String cookie = launchEntity.getCookie();
        if (cookie != null) {
            sQLiteStatement.bindString(15, cookie);
        }
        String adType = launchEntity.getAdType();
        if (adType != null) {
            sQLiteStatement.bindString(16, adType);
        }
        Integer isLoadWithGPRS = launchEntity.getIsLoadWithGPRS();
        if (isLoadWithGPRS != null) {
            sQLiteStatement.bindLong(17, isLoadWithGPRS.intValue());
        }
        String bgVideoUrl = launchEntity.getBgVideoUrl();
        if (bgVideoUrl != null) {
            sQLiteStatement.bindString(18, bgVideoUrl);
        }
        String extensions = launchEntity.getExtensions();
        if (extensions != null) {
            sQLiteStatement.bindString(19, extensions);
        }
        Integer mode = launchEntity.getMode();
        if (mode != null) {
            sQLiteStatement.bindLong(20, mode.intValue());
        }
    }
}
