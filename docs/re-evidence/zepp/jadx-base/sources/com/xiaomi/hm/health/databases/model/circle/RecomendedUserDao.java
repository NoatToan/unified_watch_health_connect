package com.xiaomi.hm.health.databases.model.circle;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.huami.android.zxing.Intents;
import com.huami.hmchartui.utils.Constant;
import com.xiaomi.hm.health.databases.model.DaoSession;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class RecomendedUserDao extends AbstractDao<RecomendedUser, String> {
    public static final String TABLENAME = "RECOMENDED_USER";

    public static class Properties {
        public static final Property UserID = new Property(0, String.class, SDKConstants.PARAM_USER_ID, true, Constant.USER_ID);
        public static final Property UserName = new Property(1, String.class, "userName", false, "USER_NAME");
        public static final Property Avatar = new Property(2, String.class, WebAPI.PARAM_SHARE_INVITE_AVATAR, false, "AVATAR");
        public static final Property Type = new Property(3, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property FollowStatus = new Property(4, String.class, "followStatus", false, "FOLLOW_STATUS");
        public static final Property ChatWithStranger = new Property(5, Boolean.class, "chatWithStranger", false, "CHAT_WITH_STRANGER");
        public static final Property Summary = new Property(6, String.class, "summary", false, "SUMMARY");
        public static final Property IsFamily = new Property(7, Boolean.class, "isFamily", false, "IS_FAMILY");
        public static final Property IsNew = new Property(8, Boolean.class, "isNew", false, "IS_NEW");
        public static final Property FollowerNumber = new Property(9, Integer.class, "followerNumber", false, "FOLLOWER_NUMBER");
        public static final Property FolloweeNumber = new Property(10, Integer.class, "followeeNumber", false, "FOLLOWEE_NUMBER");
        public static final Property PsotImage = new Property(11, String.class, "psotImage", false, "PSOT_IMAGE");
        public static final Property Link = new Property(12, String.class, "link", false, ShareConstants.CONTENT_URL);
    }

    public RecomendedUserDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"RECOMENDED_USER\" (\"USER_ID\" TEXT PRIMARY KEY NOT NULL ,\"USER_NAME\" TEXT,\"AVATAR\" TEXT,\"TYPE\" INTEGER,\"FOLLOW_STATUS\" TEXT,\"CHAT_WITH_STRANGER\" INTEGER,\"SUMMARY\" TEXT,\"IS_FAMILY\" INTEGER,\"IS_NEW\" INTEGER,\"FOLLOWER_NUMBER\" INTEGER,\"FOLLOWEE_NUMBER\" INTEGER,\"PSOT_IMAGE\" TEXT,\"LINK\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"RECOMENDED_USER\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public RecomendedUserDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(RecomendedUser recomendedUser) {
        if (recomendedUser != null) {
            return recomendedUser.getUserID();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(RecomendedUser recomendedUser) {
        return recomendedUser.getUserID() != null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return cursor.getString(i2);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(RecomendedUser recomendedUser, long j) {
        return recomendedUser.getUserID();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, RecomendedUser recomendedUser) {
        databaseStatement.clearBindings();
        String userID = recomendedUser.getUserID();
        if (userID != null) {
            databaseStatement.bindString(1, userID);
        }
        String userName = recomendedUser.getUserName();
        if (userName != null) {
            databaseStatement.bindString(2, userName);
        }
        String avatar = recomendedUser.getAvatar();
        if (avatar != null) {
            databaseStatement.bindString(3, avatar);
        }
        Integer type = recomendedUser.getType();
        if (type != null) {
            databaseStatement.bindLong(4, type.intValue());
        }
        String followStatus = recomendedUser.getFollowStatus();
        if (followStatus != null) {
            databaseStatement.bindString(5, followStatus);
        }
        Boolean chatWithStranger = recomendedUser.getChatWithStranger();
        if (chatWithStranger != null) {
            databaseStatement.bindLong(6, chatWithStranger.booleanValue() ? 1L : 0L);
        }
        String summary = recomendedUser.getSummary();
        if (summary != null) {
            databaseStatement.bindString(7, summary);
        }
        Boolean isFamily = recomendedUser.getIsFamily();
        if (isFamily != null) {
            databaseStatement.bindLong(8, isFamily.booleanValue() ? 1L : 0L);
        }
        Boolean isNew = recomendedUser.getIsNew();
        if (isNew != null) {
            databaseStatement.bindLong(9, isNew.booleanValue() ? 1L : 0L);
        }
        Integer followerNumber = recomendedUser.getFollowerNumber();
        if (followerNumber != null) {
            databaseStatement.bindLong(10, followerNumber.intValue());
        }
        Integer followeeNumber = recomendedUser.getFolloweeNumber();
        if (followeeNumber != null) {
            databaseStatement.bindLong(11, followeeNumber.intValue());
        }
        String psotImage = recomendedUser.getPsotImage();
        if (psotImage != null) {
            databaseStatement.bindString(12, psotImage);
        }
        String link = recomendedUser.getLink();
        if (link != null) {
            databaseStatement.bindString(13, link);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public RecomendedUser readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        String string4 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        if (cursor.isNull(i7)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i7) != 0);
        }
        int i8 = i + 6;
        String string5 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i + 8;
        if (cursor.isNull(i10)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        int i11 = i + 9;
        int i12 = i + 10;
        int i13 = i + 11;
        int i14 = i + 12;
        return new RecomendedUser(string, string2, string3, numValueOf, string4, boolValueOf, string5, boolValueOf2, boolValueOf3, cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : cursor.getString(i13), cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, RecomendedUser recomendedUser, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i2 = i + 0;
        recomendedUser.setUserID(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        recomendedUser.setUserName(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        recomendedUser.setAvatar(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        recomendedUser.setType(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        recomendedUser.setFollowStatus(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        if (cursor.isNull(i7)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i7) != 0);
        }
        recomendedUser.setChatWithStranger(boolValueOf);
        int i8 = i + 6;
        recomendedUser.setSummary(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        recomendedUser.setIsFamily(boolValueOf2);
        int i10 = i + 8;
        if (cursor.isNull(i10)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        recomendedUser.setIsNew(boolValueOf3);
        int i11 = i + 9;
        recomendedUser.setFollowerNumber(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 10;
        recomendedUser.setFolloweeNumber(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 11;
        recomendedUser.setPsotImage(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 12;
        recomendedUser.setLink(cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, RecomendedUser recomendedUser) {
        sQLiteStatement.clearBindings();
        String userID = recomendedUser.getUserID();
        if (userID != null) {
            sQLiteStatement.bindString(1, userID);
        }
        String userName = recomendedUser.getUserName();
        if (userName != null) {
            sQLiteStatement.bindString(2, userName);
        }
        String avatar = recomendedUser.getAvatar();
        if (avatar != null) {
            sQLiteStatement.bindString(3, avatar);
        }
        Integer type = recomendedUser.getType();
        if (type != null) {
            sQLiteStatement.bindLong(4, type.intValue());
        }
        String followStatus = recomendedUser.getFollowStatus();
        if (followStatus != null) {
            sQLiteStatement.bindString(5, followStatus);
        }
        Boolean chatWithStranger = recomendedUser.getChatWithStranger();
        if (chatWithStranger != null) {
            sQLiteStatement.bindLong(6, chatWithStranger.booleanValue() ? 1L : 0L);
        }
        String summary = recomendedUser.getSummary();
        if (summary != null) {
            sQLiteStatement.bindString(7, summary);
        }
        Boolean isFamily = recomendedUser.getIsFamily();
        if (isFamily != null) {
            sQLiteStatement.bindLong(8, isFamily.booleanValue() ? 1L : 0L);
        }
        Boolean isNew = recomendedUser.getIsNew();
        if (isNew != null) {
            sQLiteStatement.bindLong(9, isNew.booleanValue() ? 1L : 0L);
        }
        Integer followerNumber = recomendedUser.getFollowerNumber();
        if (followerNumber != null) {
            sQLiteStatement.bindLong(10, followerNumber.intValue());
        }
        Integer followeeNumber = recomendedUser.getFolloweeNumber();
        if (followeeNumber != null) {
            sQLiteStatement.bindLong(11, followeeNumber.intValue());
        }
        String psotImage = recomendedUser.getPsotImage();
        if (psotImage != null) {
            sQLiteStatement.bindString(12, psotImage);
        }
        String link = recomendedUser.getLink();
        if (link != null) {
            sQLiteStatement.bindString(13, link);
        }
    }
}
