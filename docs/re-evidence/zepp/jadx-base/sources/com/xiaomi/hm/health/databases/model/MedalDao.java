package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.huami.passport.user.IAuthService;
import com.xiaomi.hm.health.databases.converter.ListStringConverter;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class MedalDao extends AbstractDao<Medal, Long> {
    public static final String TABLENAME = "MEDAL";
    private final ListStringConverter c;

    public static class Properties {
        public static final Property Id = new Property(0, Long.TYPE, "id", true, "_id");
        public static final Property Title = new Property(1, String.class, "title", false, ShareConstants.TITLE);
        public static final Property SubTitle = new Property(2, String.class, "subTitle", false, "SUB_TITLE");
        public static final Property Category = new Property(3, String.class, "category", false, "CATEGORY");
        public static final Property TitleImg = new Property(4, String.class, "titleImg", false, "TITLE_IMG");
        public static final Property NotObtainIcon = new Property(5, String.class, "notObtainIcon", false, "NOT_OBTAIN_ICON");
        public static final Property ObtainIcon = new Property(6, String.class, "obtainIcon", false, "OBTAIN_ICON");
        public static final Property NotObtainText = new Property(7, String.class, "notObtainText", false, "NOT_OBTAIN_TEXT");
        public static final Property ObtainText = new Property(8, String.class, "obtainText", false, "OBTAIN_TEXT");
        public static final Property Tags = new Property(9, String.class, "tags", false, "TAGS");
        public static final Property State = new Property(10, Integer.TYPE, "state", false, IAuthService.STATE.STATE);
    }

    public MedalDao(DaoConfig daoConfig) {
        super(daoConfig);
        this.c = new ListStringConverter();
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"MEDAL\" (\"_id\" INTEGER PRIMARY KEY NOT NULL ,\"TITLE\" TEXT,\"SUB_TITLE\" TEXT,\"CATEGORY\" TEXT,\"TITLE_IMG\" TEXT,\"NOT_OBTAIN_ICON\" TEXT,\"OBTAIN_ICON\" TEXT,\"NOT_OBTAIN_TEXT\" TEXT,\"OBTAIN_TEXT\" TEXT,\"TAGS\" TEXT,\"STATE\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MEDAL\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Medal medal) {
        if (medal != null) {
            return Long.valueOf(medal.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Medal medal) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i + 0));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(Medal medal, long j) {
        medal.setId(j);
        return Long.valueOf(j);
    }

    public MedalDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        this.c = new ListStringConverter();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Medal medal) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, medal.getId());
        String title = medal.getTitle();
        if (title != null) {
            databaseStatement.bindString(2, title);
        }
        String subTitle = medal.getSubTitle();
        if (subTitle != null) {
            databaseStatement.bindString(3, subTitle);
        }
        String category = medal.getCategory();
        if (category != null) {
            databaseStatement.bindString(4, category);
        }
        String titleImg = medal.getTitleImg();
        if (titleImg != null) {
            databaseStatement.bindString(5, titleImg);
        }
        String notObtainIcon = medal.getNotObtainIcon();
        if (notObtainIcon != null) {
            databaseStatement.bindString(6, notObtainIcon);
        }
        String obtainIcon = medal.getObtainIcon();
        if (obtainIcon != null) {
            databaseStatement.bindString(7, obtainIcon);
        }
        String notObtainText = medal.getNotObtainText();
        if (notObtainText != null) {
            databaseStatement.bindString(8, notObtainText);
        }
        String obtainText = medal.getObtainText();
        if (obtainText != null) {
            databaseStatement.bindString(9, obtainText);
        }
        List<String> tags = medal.getTags();
        if (tags != null) {
            databaseStatement.bindString(10, this.c.convertToDatabaseValue(tags));
        }
        databaseStatement.bindLong(11, medal.getState().intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Medal readEntity(Cursor cursor, int i) {
        long j = cursor.getLong(i + 0);
        int i2 = i + 1;
        List<String> listConvertToEntityProperty = null;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 2;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 3;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 4;
        String string4 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 5;
        String string5 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 6;
        String string6 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 7;
        String string7 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 8;
        String string8 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 9;
        if (!cursor.isNull(i10)) {
            listConvertToEntityProperty = this.c.convertToEntityProperty(cursor.getString(i10));
        }
        return new Medal(j, string, string2, string3, string4, string5, string6, string7, string8, listConvertToEntityProperty, Integer.valueOf(cursor.getInt(i + 10)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Medal medal, int i) {
        medal.setId(cursor.getLong(i + 0));
        int i2 = i + 1;
        medal.setTitle(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        medal.setSubTitle(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 3;
        medal.setCategory(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        medal.setTitleImg(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 5;
        medal.setNotObtainIcon(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 6;
        medal.setObtainIcon(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 7;
        medal.setNotObtainText(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 8;
        medal.setObtainText(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 9;
        medal.setTags(cursor.isNull(i10) ? null : this.c.convertToEntityProperty(cursor.getString(i10)));
        medal.setState(Integer.valueOf(cursor.getInt(i + 10)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Medal medal) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, medal.getId());
        String title = medal.getTitle();
        if (title != null) {
            sQLiteStatement.bindString(2, title);
        }
        String subTitle = medal.getSubTitle();
        if (subTitle != null) {
            sQLiteStatement.bindString(3, subTitle);
        }
        String category = medal.getCategory();
        if (category != null) {
            sQLiteStatement.bindString(4, category);
        }
        String titleImg = medal.getTitleImg();
        if (titleImg != null) {
            sQLiteStatement.bindString(5, titleImg);
        }
        String notObtainIcon = medal.getNotObtainIcon();
        if (notObtainIcon != null) {
            sQLiteStatement.bindString(6, notObtainIcon);
        }
        String obtainIcon = medal.getObtainIcon();
        if (obtainIcon != null) {
            sQLiteStatement.bindString(7, obtainIcon);
        }
        String notObtainText = medal.getNotObtainText();
        if (notObtainText != null) {
            sQLiteStatement.bindString(8, notObtainText);
        }
        String obtainText = medal.getObtainText();
        if (obtainText != null) {
            sQLiteStatement.bindString(9, obtainText);
        }
        List<String> tags = medal.getTags();
        if (tags != null) {
            sQLiteStatement.bindString(10, this.c.convertToDatabaseValue(tags));
        }
        sQLiteStatement.bindLong(11, medal.getState().intValue());
    }
}
