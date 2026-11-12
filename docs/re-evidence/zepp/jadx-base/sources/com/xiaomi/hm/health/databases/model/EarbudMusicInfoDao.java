package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class EarbudMusicInfoDao extends AbstractDao<EarbudMusicInfo, Long> {
    public static final String TABLENAME = "EARBUD_MUSIC_INFO";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "ID");
        public static final Property Name = new Property(1, String.class, "name", false, "NAME");
        public static final Property Description = new Property(2, String.class, "description", false, ShareConstants.DESCRIPTION);
        public static final Property OfficialBuiltin = new Property(3, Boolean.class, "officialBuiltin", false, "OFFICIAL_BUILTIN");
        public static final Property IsFree = new Property(4, Boolean.class, "isFree", false, "IS_FREE");
        public static final Property Price = new Property(5, Float.class, FirebaseAnalytics.Param.PRICE, false, "PRICE");
        public static final Property SkuId = new Property(6, String.class, TrainingWebConst.QueryParam.SKUID, false, "SKU_ID");
        public static final Property DownloadAble = new Property(7, Boolean.class, "downloadAble", false, "DOWNLOAD_ABLE");
        public static final Property Thumb = new Property(8, String.class, "thumb", false, "THUMB");
        public static final Property Image = new Property(9, String.class, "image", false, ShareConstants.IMAGE_URL);
        public static final Property Banner = new Property(10, String.class, "banner", false, "BANNER");
        public static final Property Audio = new Property(11, String.class, "audio", false, "AUDIO");
        public static final Property LeftChannel = new Property(12, String.class, "leftChannel", false, "LEFT_CHANNEL");
        public static final Property RightChannel = new Property(13, String.class, "rightChannel", false, "RIGHT_CHANNEL");
        public static final Property LocalStatus = new Property(14, Integer.class, "localStatus", false, "LOCAL_STATUS");
        public static final Property LocalUpdateTime = new Property(15, Long.class, "localUpdateTime", false, "LOCAL_UPDATE_TIME");
    }

    public EarbudMusicInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"EARBUD_MUSIC_INFO\" (\"ID\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"DESCRIPTION\" TEXT,\"OFFICIAL_BUILTIN\" INTEGER,\"IS_FREE\" INTEGER,\"PRICE\" REAL,\"SKU_ID\" TEXT,\"DOWNLOAD_ABLE\" INTEGER,\"THUMB\" TEXT,\"IMAGE\" TEXT,\"BANNER\" TEXT,\"AUDIO\" TEXT,\"LEFT_CHANNEL\" TEXT,\"RIGHT_CHANNEL\" TEXT,\"LOCAL_STATUS\" INTEGER,\"LOCAL_UPDATE_TIME\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"EARBUD_MUSIC_INFO\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public EarbudMusicInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(EarbudMusicInfo earbudMusicInfo) {
        if (earbudMusicInfo != null) {
            return earbudMusicInfo.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(EarbudMusicInfo earbudMusicInfo) {
        return earbudMusicInfo.getId() != null;
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
    public final Long updateKeyAfterInsert(EarbudMusicInfo earbudMusicInfo, long j) {
        return earbudMusicInfo.getId();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, EarbudMusicInfo earbudMusicInfo) {
        databaseStatement.clearBindings();
        Long id = earbudMusicInfo.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String name = earbudMusicInfo.getName();
        if (name != null) {
            databaseStatement.bindString(2, name);
        }
        String description = earbudMusicInfo.getDescription();
        if (description != null) {
            databaseStatement.bindString(3, description);
        }
        Boolean officialBuiltin = earbudMusicInfo.getOfficialBuiltin();
        if (officialBuiltin != null) {
            databaseStatement.bindLong(4, officialBuiltin.booleanValue() ? 1L : 0L);
        }
        Boolean isFree = earbudMusicInfo.getIsFree();
        if (isFree != null) {
            databaseStatement.bindLong(5, isFree.booleanValue() ? 1L : 0L);
        }
        Float price = earbudMusicInfo.getPrice();
        if (price != null) {
            databaseStatement.bindDouble(6, price.floatValue());
        }
        String skuId = earbudMusicInfo.getSkuId();
        if (skuId != null) {
            databaseStatement.bindString(7, skuId);
        }
        Boolean downloadAble = earbudMusicInfo.getDownloadAble();
        if (downloadAble != null) {
            databaseStatement.bindLong(8, downloadAble.booleanValue() ? 1L : 0L);
        }
        String thumb = earbudMusicInfo.getThumb();
        if (thumb != null) {
            databaseStatement.bindString(9, thumb);
        }
        String image = earbudMusicInfo.getImage();
        if (image != null) {
            databaseStatement.bindString(10, image);
        }
        String banner = earbudMusicInfo.getBanner();
        if (banner != null) {
            databaseStatement.bindString(11, banner);
        }
        String audio = earbudMusicInfo.getAudio();
        if (audio != null) {
            databaseStatement.bindString(12, audio);
        }
        String leftChannel = earbudMusicInfo.getLeftChannel();
        if (leftChannel != null) {
            databaseStatement.bindString(13, leftChannel);
        }
        String rightChannel = earbudMusicInfo.getRightChannel();
        if (rightChannel != null) {
            databaseStatement.bindString(14, rightChannel);
        }
        Integer localStatus = earbudMusicInfo.getLocalStatus();
        if (localStatus != null) {
            databaseStatement.bindLong(15, localStatus.intValue());
        }
        Long localUpdateTime = earbudMusicInfo.getLocalUpdateTime();
        if (localUpdateTime != null) {
            databaseStatement.bindLong(16, localUpdateTime.longValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public EarbudMusicInfo readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        int i6 = i + 4;
        if (cursor.isNull(i6)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        int i7 = i + 5;
        Float fValueOf = cursor.isNull(i7) ? null : Float.valueOf(cursor.getFloat(i7));
        int i8 = i + 6;
        String string3 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i + 8;
        String string4 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 9;
        String string5 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 10;
        String string6 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 11;
        String string7 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 12;
        String string8 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        String string9 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        Integer numValueOf = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i + 15;
        return new EarbudMusicInfo(lValueOf, string, string2, boolValueOf, boolValueOf2, fValueOf, string3, boolValueOf3, string4, string5, string6, string7, string8, string9, numValueOf, cursor.isNull(i17) ? null : Long.valueOf(cursor.getLong(i17)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, EarbudMusicInfo earbudMusicInfo, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i2 = i + 0;
        earbudMusicInfo.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        earbudMusicInfo.setName(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        earbudMusicInfo.setDescription(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        earbudMusicInfo.setOfficialBuiltin(boolValueOf);
        int i6 = i + 4;
        if (cursor.isNull(i6)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        earbudMusicInfo.setIsFree(boolValueOf2);
        int i7 = i + 5;
        earbudMusicInfo.setPrice(cursor.isNull(i7) ? null : Float.valueOf(cursor.getFloat(i7)));
        int i8 = i + 6;
        earbudMusicInfo.setSkuId(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        earbudMusicInfo.setDownloadAble(boolValueOf3);
        int i10 = i + 8;
        earbudMusicInfo.setThumb(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        earbudMusicInfo.setImage(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        earbudMusicInfo.setBanner(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 11;
        earbudMusicInfo.setAudio(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 12;
        earbudMusicInfo.setLeftChannel(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 13;
        earbudMusicInfo.setRightChannel(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 14;
        earbudMusicInfo.setLocalStatus(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i + 15;
        earbudMusicInfo.setLocalUpdateTime(cursor.isNull(i17) ? null : Long.valueOf(cursor.getLong(i17)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, EarbudMusicInfo earbudMusicInfo) {
        sQLiteStatement.clearBindings();
        Long id = earbudMusicInfo.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String name = earbudMusicInfo.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String description = earbudMusicInfo.getDescription();
        if (description != null) {
            sQLiteStatement.bindString(3, description);
        }
        Boolean officialBuiltin = earbudMusicInfo.getOfficialBuiltin();
        if (officialBuiltin != null) {
            sQLiteStatement.bindLong(4, officialBuiltin.booleanValue() ? 1L : 0L);
        }
        Boolean isFree = earbudMusicInfo.getIsFree();
        if (isFree != null) {
            sQLiteStatement.bindLong(5, isFree.booleanValue() ? 1L : 0L);
        }
        Float price = earbudMusicInfo.getPrice();
        if (price != null) {
            sQLiteStatement.bindDouble(6, price.floatValue());
        }
        String skuId = earbudMusicInfo.getSkuId();
        if (skuId != null) {
            sQLiteStatement.bindString(7, skuId);
        }
        Boolean downloadAble = earbudMusicInfo.getDownloadAble();
        if (downloadAble != null) {
            sQLiteStatement.bindLong(8, downloadAble.booleanValue() ? 1L : 0L);
        }
        String thumb = earbudMusicInfo.getThumb();
        if (thumb != null) {
            sQLiteStatement.bindString(9, thumb);
        }
        String image = earbudMusicInfo.getImage();
        if (image != null) {
            sQLiteStatement.bindString(10, image);
        }
        String banner = earbudMusicInfo.getBanner();
        if (banner != null) {
            sQLiteStatement.bindString(11, banner);
        }
        String audio = earbudMusicInfo.getAudio();
        if (audio != null) {
            sQLiteStatement.bindString(12, audio);
        }
        String leftChannel = earbudMusicInfo.getLeftChannel();
        if (leftChannel != null) {
            sQLiteStatement.bindString(13, leftChannel);
        }
        String rightChannel = earbudMusicInfo.getRightChannel();
        if (rightChannel != null) {
            sQLiteStatement.bindString(14, rightChannel);
        }
        Integer localStatus = earbudMusicInfo.getLocalStatus();
        if (localStatus != null) {
            sQLiteStatement.bindLong(15, localStatus.intValue());
        }
        Long localUpdateTime = earbudMusicInfo.getLocalUpdateTime();
        if (localUpdateTime != null) {
            sQLiteStatement.bindLong(16, localUpdateTime.longValue());
        }
    }
}
