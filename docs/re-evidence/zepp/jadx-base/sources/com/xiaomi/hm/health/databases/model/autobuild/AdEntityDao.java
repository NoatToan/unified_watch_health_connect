package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.AdEntity;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class AdEntityDao extends AbstractDao<AdEntity, String> {
    public static final String TABLENAME = "AD_ENTITY";

    public static class Properties {
        public static final Property Id = new Property(0, String.class, "id", true, "ID");
        public static final Property Title = new Property(1, String.class, "title", false, ShareConstants.TITLE);
        public static final Property SubTitle = new Property(2, String.class, "subTitle", false, "SUB_TITLE");
        public static final Property Target = new Property(3, String.class, "target", false, "TARGET");
        public static final Property ImgUrl = new Property(4, String.class, "imgUrl", false, "IMG_URL");
        public static final Property Description = new Property(5, String.class, "description", false, ShareConstants.DESCRIPTION);
        public static final Property Mode = new Property(6, Integer.class, "mode", false, "MODE");
        public static final Property IconUrl = new Property(7, String.class, "iconUrl", false, "ICON_URL");
        public static final Property Status = new Property(8, Integer.class, "status", false, "STATUS");
        public static final Property JsbridgeAuth = new Property(9, Boolean.class, "jsbridgeAuth", false, "JSBRIDGE_AUTH");
        public static final Property SupportType = new Property(10, String.class, "supportType", false, "SUPPORT_TYPE");
        public static final Property ClassifyName = new Property(11, String.class, "classifyName", false, "CLASSIFY_NAME");
        public static final Property EndTime = new Property(12, Long.class, "endTime", false, "END_TIME");
        public static final Property StartTime = new Property(13, Long.class, "startTime", false, "START_TIME");
        public static final Property Badge = new Property(14, String.class, "badge", false, "BADGE");
        public static final Property DisplayCount = new Property(15, Integer.class, "displayCount", false, "DISPLAY_COUNT");
        public static final Property CreateTime = new Property(16, Long.class, ParamKey.createTime, false, "CREATE_TIME");
        public static final Property Category = new Property(17, String.class, "category", false, "CATEGORY");
        public static final Property IsValidity = new Property(18, Boolean.class, "isValidity", false, "IS_VALIDITY");
        public static final Property BgImgUrl = new Property(19, String.class, "bgImgUrl", false, "BG_IMG_URL");
        public static final Property ColorStr = new Property(20, String.class, "colorStr", false, "COLOR_STR");
        public static final Property JumpStr = new Property(21, String.class, "jumpStr", false, "JUMP_STR");
        public static final Property FgLogoUrl = new Property(22, String.class, "fgLogoUrl", false, "FG_LOGO_URL");
        public static final Property BgBodyUrl = new Property(23, String.class, "bgBodyUrl", false, "BG_BODY_URL");
        public static final Property FgBannerUrl = new Property(24, String.class, "fgBannerUrl", false, "FG_BANNER_URL");
        public static final Property HomeColor = new Property(25, String.class, "homeColor", false, "HOME_COLOR");
        public static final Property Assets = new Property(26, String.class, "assets", false, "ASSETS");
        public static final Property AdMonitor = new Property(27, String.class, "adMonitor", false, "AD_MONITOR");
        public static final Property CloseTime = new Property(28, Long.TYPE, "closeTime", false, "CLOSE_TIME");
    }

    public AdEntityDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"AD_ENTITY\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"TITLE\" TEXT,\"SUB_TITLE\" TEXT,\"TARGET\" TEXT,\"IMG_URL\" TEXT,\"DESCRIPTION\" TEXT,\"MODE\" INTEGER,\"ICON_URL\" TEXT,\"STATUS\" INTEGER,\"JSBRIDGE_AUTH\" INTEGER,\"SUPPORT_TYPE\" TEXT,\"CLASSIFY_NAME\" TEXT,\"END_TIME\" INTEGER,\"START_TIME\" INTEGER,\"BADGE\" TEXT,\"DISPLAY_COUNT\" INTEGER,\"CREATE_TIME\" INTEGER,\"CATEGORY\" TEXT,\"IS_VALIDITY\" INTEGER,\"BG_IMG_URL\" TEXT,\"COLOR_STR\" TEXT,\"JUMP_STR\" TEXT,\"FG_LOGO_URL\" TEXT,\"BG_BODY_URL\" TEXT,\"FG_BANNER_URL\" TEXT,\"HOME_COLOR\" TEXT,\"ASSETS\" TEXT,\"AD_MONITOR\" TEXT,\"CLOSE_TIME\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"AD_ENTITY\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AdEntityDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(AdEntity adEntity) {
        if (adEntity != null) {
            return adEntity.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(AdEntity adEntity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(AdEntity adEntity, long j) {
        return adEntity.getId();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, AdEntity adEntity) {
        databaseStatement.clearBindings();
        databaseStatement.bindString(1, adEntity.getId());
        String title = adEntity.getTitle();
        if (title != null) {
            databaseStatement.bindString(2, title);
        }
        String subTitle = adEntity.getSubTitle();
        if (subTitle != null) {
            databaseStatement.bindString(3, subTitle);
        }
        String target = adEntity.getTarget();
        if (target != null) {
            databaseStatement.bindString(4, target);
        }
        String imgUrl = adEntity.getImgUrl();
        if (imgUrl != null) {
            databaseStatement.bindString(5, imgUrl);
        }
        String description = adEntity.getDescription();
        if (description != null) {
            databaseStatement.bindString(6, description);
        }
        Integer mode = adEntity.getMode();
        if (mode != null) {
            databaseStatement.bindLong(7, mode.intValue());
        }
        String iconUrl = adEntity.getIconUrl();
        if (iconUrl != null) {
            databaseStatement.bindString(8, iconUrl);
        }
        Integer status = adEntity.getStatus();
        if (status != null) {
            databaseStatement.bindLong(9, status.intValue());
        }
        Boolean jsbridgeAuth = adEntity.getJsbridgeAuth();
        if (jsbridgeAuth != null) {
            databaseStatement.bindLong(10, jsbridgeAuth.booleanValue() ? 1L : 0L);
        }
        String supportType = adEntity.getSupportType();
        if (supportType != null) {
            databaseStatement.bindString(11, supportType);
        }
        String classifyName = adEntity.getClassifyName();
        if (classifyName != null) {
            databaseStatement.bindString(12, classifyName);
        }
        Long endTime = adEntity.getEndTime();
        if (endTime != null) {
            databaseStatement.bindLong(13, endTime.longValue());
        }
        Long startTime = adEntity.getStartTime();
        if (startTime != null) {
            databaseStatement.bindLong(14, startTime.longValue());
        }
        String badge = adEntity.getBadge();
        if (badge != null) {
            databaseStatement.bindString(15, badge);
        }
        Integer displayCount = adEntity.getDisplayCount();
        if (displayCount != null) {
            databaseStatement.bindLong(16, displayCount.intValue());
        }
        Long createTime = adEntity.getCreateTime();
        if (createTime != null) {
            databaseStatement.bindLong(17, createTime.longValue());
        }
        String category = adEntity.getCategory();
        if (category != null) {
            databaseStatement.bindString(18, category);
        }
        Boolean isValidity = adEntity.getIsValidity();
        if (isValidity != null) {
            databaseStatement.bindLong(19, isValidity.booleanValue() ? 1L : 0L);
        }
        String bgImgUrl = adEntity.getBgImgUrl();
        if (bgImgUrl != null) {
            databaseStatement.bindString(20, bgImgUrl);
        }
        String colorStr = adEntity.getColorStr();
        if (colorStr != null) {
            databaseStatement.bindString(21, colorStr);
        }
        String jumpStr = adEntity.getJumpStr();
        if (jumpStr != null) {
            databaseStatement.bindString(22, jumpStr);
        }
        String fgLogoUrl = adEntity.getFgLogoUrl();
        if (fgLogoUrl != null) {
            databaseStatement.bindString(23, fgLogoUrl);
        }
        String bgBodyUrl = adEntity.getBgBodyUrl();
        if (bgBodyUrl != null) {
            databaseStatement.bindString(24, bgBodyUrl);
        }
        String fgBannerUrl = adEntity.getFgBannerUrl();
        if (fgBannerUrl != null) {
            databaseStatement.bindString(25, fgBannerUrl);
        }
        String homeColor = adEntity.getHomeColor();
        if (homeColor != null) {
            databaseStatement.bindString(26, homeColor);
        }
        String assets = adEntity.getAssets();
        if (assets != null) {
            databaseStatement.bindString(27, assets);
        }
        String adMonitor = adEntity.getAdMonitor();
        if (adMonitor != null) {
            databaseStatement.bindString(28, adMonitor);
        }
        databaseStatement.bindLong(29, adEntity.getCloseTime());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public AdEntity readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
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
        String string6 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 6;
        Integer numValueOf = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 7;
        String string7 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 8;
        Integer numValueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i + 9;
        if (cursor.isNull(i10)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        int i11 = i + 10;
        String string8 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 11;
        String string9 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 12;
        Long lValueOf = cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13));
        int i14 = i + 13;
        Long lValueOf2 = cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14));
        int i15 = i + 14;
        String string10 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 15;
        Integer numValueOf3 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i + 16;
        Long lValueOf3 = cursor.isNull(i17) ? null : Long.valueOf(cursor.getLong(i17));
        int i18 = i + 17;
        String string11 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 18;
        if (cursor.isNull(i19)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i19) != 0);
        }
        int i20 = i + 19;
        String string12 = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = i + 20;
        String string13 = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i + 21;
        String string14 = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i + 22;
        String string15 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 23;
        String string16 = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = i + 24;
        String string17 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 25;
        String string18 = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 26;
        String string19 = cursor.isNull(i27) ? null : cursor.getString(i27);
        int i28 = i + 27;
        return new AdEntity(string, string2, string3, string4, string5, string6, numValueOf, string7, numValueOf2, boolValueOf, string8, string9, lValueOf, lValueOf2, string10, numValueOf3, lValueOf3, string11, boolValueOf2, string12, string13, string14, string15, string16, string17, string18, string19, cursor.isNull(i28) ? null : cursor.getString(i28), cursor.getLong(i + 28));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, AdEntity adEntity, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        adEntity.setId(cursor.getString(i + 0));
        int i2 = i + 1;
        adEntity.setTitle(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        adEntity.setSubTitle(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 3;
        adEntity.setTarget(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        adEntity.setImgUrl(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 5;
        adEntity.setDescription(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 6;
        adEntity.setMode(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 7;
        adEntity.setIconUrl(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 8;
        adEntity.setStatus(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 9;
        if (cursor.isNull(i10)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        adEntity.setJsbridgeAuth(boolValueOf);
        int i11 = i + 10;
        adEntity.setSupportType(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 11;
        adEntity.setClassifyName(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 12;
        adEntity.setEndTime(cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)));
        int i14 = i + 13;
        adEntity.setStartTime(cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
        int i15 = i + 14;
        adEntity.setBadge(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 15;
        adEntity.setDisplayCount(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i + 16;
        adEntity.setCreateTime(cursor.isNull(i17) ? null : Long.valueOf(cursor.getLong(i17)));
        int i18 = i + 17;
        adEntity.setCategory(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i + 18;
        if (cursor.isNull(i19)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i19) != 0);
        }
        adEntity.setIsValidity(boolValueOf2);
        int i20 = i + 19;
        adEntity.setBgImgUrl(cursor.isNull(i20) ? null : cursor.getString(i20));
        int i21 = i + 20;
        adEntity.setColorStr(cursor.isNull(i21) ? null : cursor.getString(i21));
        int i22 = i + 21;
        adEntity.setJumpStr(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i + 22;
        adEntity.setFgLogoUrl(cursor.isNull(i23) ? null : cursor.getString(i23));
        int i24 = i + 23;
        adEntity.setBgBodyUrl(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i + 24;
        adEntity.setFgBannerUrl(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i + 25;
        adEntity.setHomeColor(cursor.isNull(i26) ? null : cursor.getString(i26));
        int i27 = i + 26;
        adEntity.setAssets(cursor.isNull(i27) ? null : cursor.getString(i27));
        int i28 = i + 27;
        adEntity.setAdMonitor(cursor.isNull(i28) ? null : cursor.getString(i28));
        adEntity.setCloseTime(cursor.getLong(i + 28));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, AdEntity adEntity) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, adEntity.getId());
        String title = adEntity.getTitle();
        if (title != null) {
            sQLiteStatement.bindString(2, title);
        }
        String subTitle = adEntity.getSubTitle();
        if (subTitle != null) {
            sQLiteStatement.bindString(3, subTitle);
        }
        String target = adEntity.getTarget();
        if (target != null) {
            sQLiteStatement.bindString(4, target);
        }
        String imgUrl = adEntity.getImgUrl();
        if (imgUrl != null) {
            sQLiteStatement.bindString(5, imgUrl);
        }
        String description = adEntity.getDescription();
        if (description != null) {
            sQLiteStatement.bindString(6, description);
        }
        Integer mode = adEntity.getMode();
        if (mode != null) {
            sQLiteStatement.bindLong(7, mode.intValue());
        }
        String iconUrl = adEntity.getIconUrl();
        if (iconUrl != null) {
            sQLiteStatement.bindString(8, iconUrl);
        }
        Integer status = adEntity.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(9, status.intValue());
        }
        Boolean jsbridgeAuth = adEntity.getJsbridgeAuth();
        if (jsbridgeAuth != null) {
            sQLiteStatement.bindLong(10, jsbridgeAuth.booleanValue() ? 1L : 0L);
        }
        String supportType = adEntity.getSupportType();
        if (supportType != null) {
            sQLiteStatement.bindString(11, supportType);
        }
        String classifyName = adEntity.getClassifyName();
        if (classifyName != null) {
            sQLiteStatement.bindString(12, classifyName);
        }
        Long endTime = adEntity.getEndTime();
        if (endTime != null) {
            sQLiteStatement.bindLong(13, endTime.longValue());
        }
        Long startTime = adEntity.getStartTime();
        if (startTime != null) {
            sQLiteStatement.bindLong(14, startTime.longValue());
        }
        String badge = adEntity.getBadge();
        if (badge != null) {
            sQLiteStatement.bindString(15, badge);
        }
        Integer displayCount = adEntity.getDisplayCount();
        if (displayCount != null) {
            sQLiteStatement.bindLong(16, displayCount.intValue());
        }
        Long createTime = adEntity.getCreateTime();
        if (createTime != null) {
            sQLiteStatement.bindLong(17, createTime.longValue());
        }
        String category = adEntity.getCategory();
        if (category != null) {
            sQLiteStatement.bindString(18, category);
        }
        Boolean isValidity = adEntity.getIsValidity();
        if (isValidity != null) {
            sQLiteStatement.bindLong(19, isValidity.booleanValue() ? 1L : 0L);
        }
        String bgImgUrl = adEntity.getBgImgUrl();
        if (bgImgUrl != null) {
            sQLiteStatement.bindString(20, bgImgUrl);
        }
        String colorStr = adEntity.getColorStr();
        if (colorStr != null) {
            sQLiteStatement.bindString(21, colorStr);
        }
        String jumpStr = adEntity.getJumpStr();
        if (jumpStr != null) {
            sQLiteStatement.bindString(22, jumpStr);
        }
        String fgLogoUrl = adEntity.getFgLogoUrl();
        if (fgLogoUrl != null) {
            sQLiteStatement.bindString(23, fgLogoUrl);
        }
        String bgBodyUrl = adEntity.getBgBodyUrl();
        if (bgBodyUrl != null) {
            sQLiteStatement.bindString(24, bgBodyUrl);
        }
        String fgBannerUrl = adEntity.getFgBannerUrl();
        if (fgBannerUrl != null) {
            sQLiteStatement.bindString(25, fgBannerUrl);
        }
        String homeColor = adEntity.getHomeColor();
        if (homeColor != null) {
            sQLiteStatement.bindString(26, homeColor);
        }
        String assets = adEntity.getAssets();
        if (assets != null) {
            sQLiteStatement.bindString(27, assets);
        }
        String adMonitor = adEntity.getAdMonitor();
        if (adMonitor != null) {
            sQLiteStatement.bindString(28, adMonitor);
        }
        sQLiteStatement.bindLong(29, adEntity.getCloseTime());
    }
}
