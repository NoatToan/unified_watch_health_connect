package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.huami.hmchartui.utils.Constant;
import com.xiaomi.hm.health.databases.model.circle.CirclePost;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class CirclePostDao extends AbstractDao<CirclePost, String> {
    public static final String TABLENAME = "CIRCLE_POST";

    public static class Properties {
        public static final Property PostID = new Property(0, String.class, "postID", true, "POST_ID");
        public static final Property PostTime = new Property(1, Long.class, "postTime", false, "POST_TIME");
        public static final Property PraiseNumber = new Property(2, Integer.class, "praiseNumber", false, "PRAISE_NUMBER");
        public static final Property HasPraise = new Property(3, Boolean.class, "hasPraise", false, "HAS_PRAISE");
        public static final Property Content = new Property(4, String.class, "content", false, "CONTENT");
        public static final Property Image = new Property(5, String.class, "image", false, ShareConstants.IMAGE_URL);
        public static final Property Link = new Property(6, String.class, "link", false, ShareConstants.CONTENT_URL);
        public static final Property Avatar = new Property(7, String.class, WebAPI.PARAM_SHARE_INVITE_AVATAR, false, "AVATAR");
        public static final Property UserID = new Property(8, String.class, SDKConstants.PARAM_USER_ID, false, Constant.USER_ID);
        public static final Property UserName = new Property(9, String.class, "userName", false, "USER_NAME");
        public static final Property ImageWidth = new Property(10, Integer.class, "imageWidth", false, "IMAGE_WIDTH");
        public static final Property ImageHeight = new Property(11, Integer.class, "imageHeight", false, "IMAGE_HEIGHT");
        public static final Property Next = new Property(12, String.class, "next", false, "NEXT");
    }

    public CirclePostDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"CIRCLE_POST\" (\"POST_ID\" TEXT PRIMARY KEY NOT NULL ,\"POST_TIME\" INTEGER,\"PRAISE_NUMBER\" INTEGER,\"HAS_PRAISE\" INTEGER,\"CONTENT\" TEXT,\"IMAGE\" TEXT,\"LINK\" TEXT,\"AVATAR\" TEXT,\"USER_ID\" TEXT,\"USER_NAME\" TEXT,\"IMAGE_WIDTH\" INTEGER,\"IMAGE_HEIGHT\" INTEGER,\"NEXT\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"CIRCLE_POST\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public CirclePostDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(CirclePost circlePost) {
        if (circlePost != null) {
            return circlePost.getPostID();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(CirclePost circlePost) {
        return circlePost.getPostID() != null;
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
    public final String updateKeyAfterInsert(CirclePost circlePost, long j) {
        return circlePost.getPostID();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, CirclePost circlePost) {
        databaseStatement.clearBindings();
        String postID = circlePost.getPostID();
        if (postID != null) {
            databaseStatement.bindString(1, postID);
        }
        Long postTime = circlePost.getPostTime();
        if (postTime != null) {
            databaseStatement.bindLong(2, postTime.longValue());
        }
        Integer praiseNumber = circlePost.getPraiseNumber();
        if (praiseNumber != null) {
            databaseStatement.bindLong(3, praiseNumber.intValue());
        }
        Boolean hasPraise = circlePost.getHasPraise();
        if (hasPraise != null) {
            databaseStatement.bindLong(4, hasPraise.booleanValue() ? 1L : 0L);
        }
        String content = circlePost.getContent();
        if (content != null) {
            databaseStatement.bindString(5, content);
        }
        String image = circlePost.getImage();
        if (image != null) {
            databaseStatement.bindString(6, image);
        }
        String link = circlePost.getLink();
        if (link != null) {
            databaseStatement.bindString(7, link);
        }
        String avatar = circlePost.getAvatar();
        if (avatar != null) {
            databaseStatement.bindString(8, avatar);
        }
        String userID = circlePost.getUserID();
        if (userID != null) {
            databaseStatement.bindString(9, userID);
        }
        String userName = circlePost.getUserName();
        if (userName != null) {
            databaseStatement.bindString(10, userName);
        }
        Integer imageWidth = circlePost.getImageWidth();
        if (imageWidth != null) {
            databaseStatement.bindLong(11, imageWidth.intValue());
        }
        Integer imageHeight = circlePost.getImageHeight();
        if (imageHeight != null) {
            databaseStatement.bindLong(12, imageHeight.intValue());
        }
        String next = circlePost.getNext();
        if (next != null) {
            databaseStatement.bindString(13, next);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public CirclePost readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        Long lValueOf = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Integer numValueOf = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        int i6 = i + 4;
        int i7 = i + 5;
        int i8 = i + 6;
        int i9 = i + 7;
        int i10 = i + 8;
        int i11 = i + 9;
        int i12 = i + 10;
        int i13 = i + 11;
        int i14 = i + 12;
        return new CirclePost(string, lValueOf, numValueOf, boolValueOf, cursor.isNull(i6) ? null : cursor.getString(i6), cursor.isNull(i7) ? null : cursor.getString(i7), cursor.isNull(i8) ? null : cursor.getString(i8), cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : cursor.getString(i11), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)), cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, CirclePost circlePost, int i) {
        Boolean boolValueOf;
        int i2 = i + 0;
        circlePost.setPostID(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        circlePost.setPostTime(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        circlePost.setPraiseNumber(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        circlePost.setHasPraise(boolValueOf);
        int i6 = i + 4;
        circlePost.setContent(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        circlePost.setImage(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        circlePost.setLink(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        circlePost.setAvatar(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        circlePost.setUserID(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        circlePost.setUserName(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        circlePost.setImageWidth(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 11;
        circlePost.setImageHeight(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i + 12;
        circlePost.setNext(cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, CirclePost circlePost) {
        sQLiteStatement.clearBindings();
        String postID = circlePost.getPostID();
        if (postID != null) {
            sQLiteStatement.bindString(1, postID);
        }
        Long postTime = circlePost.getPostTime();
        if (postTime != null) {
            sQLiteStatement.bindLong(2, postTime.longValue());
        }
        Integer praiseNumber = circlePost.getPraiseNumber();
        if (praiseNumber != null) {
            sQLiteStatement.bindLong(3, praiseNumber.intValue());
        }
        Boolean hasPraise = circlePost.getHasPraise();
        if (hasPraise != null) {
            sQLiteStatement.bindLong(4, hasPraise.booleanValue() ? 1L : 0L);
        }
        String content = circlePost.getContent();
        if (content != null) {
            sQLiteStatement.bindString(5, content);
        }
        String image = circlePost.getImage();
        if (image != null) {
            sQLiteStatement.bindString(6, image);
        }
        String link = circlePost.getLink();
        if (link != null) {
            sQLiteStatement.bindString(7, link);
        }
        String avatar = circlePost.getAvatar();
        if (avatar != null) {
            sQLiteStatement.bindString(8, avatar);
        }
        String userID = circlePost.getUserID();
        if (userID != null) {
            sQLiteStatement.bindString(9, userID);
        }
        String userName = circlePost.getUserName();
        if (userName != null) {
            sQLiteStatement.bindString(10, userName);
        }
        Integer imageWidth = circlePost.getImageWidth();
        if (imageWidth != null) {
            sQLiteStatement.bindLong(11, imageWidth.intValue());
        }
        Integer imageHeight = circlePost.getImageHeight();
        if (imageHeight != null) {
            sQLiteStatement.bindLong(12, imageHeight.intValue());
        }
        String next = circlePost.getNext();
        if (next != null) {
            sQLiteStatement.bindString(13, next);
        }
    }
}
