package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class DismissAdvDao extends AbstractDao<DismissAdv, Long> {
    public static final String TABLENAME = "DISMISS_ADV";

    public static class Properties {
        public static final Property CreateTime = new Property(0, Long.TYPE, ParamKey.createTime, true, "CREATE_TIME");
        public static final Property Title = new Property(1, String.class, "title", false, ShareConstants.TITLE);
    }

    public DismissAdvDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"DISMISS_ADV\" (\"CREATE_TIME\" INTEGER PRIMARY KEY NOT NULL ,\"TITLE\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"DISMISS_ADV\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public DismissAdvDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(DismissAdv dismissAdv) {
        if (dismissAdv != null) {
            return Long.valueOf(dismissAdv.getCreateTime());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(DismissAdv dismissAdv) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i + 0));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(DismissAdv dismissAdv, long j) {
        dismissAdv.setCreateTime(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, DismissAdv dismissAdv) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, dismissAdv.getCreateTime());
        String title = dismissAdv.getTitle();
        if (title != null) {
            databaseStatement.bindString(2, title);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public DismissAdv readEntity(Cursor cursor, int i) {
        long j = cursor.getLong(i + 0);
        int i2 = i + 1;
        return new DismissAdv(j, cursor.isNull(i2) ? null : cursor.getString(i2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, DismissAdv dismissAdv, int i) {
        dismissAdv.setCreateTime(cursor.getLong(i + 0));
        int i2 = i + 1;
        dismissAdv.setTitle(cursor.isNull(i2) ? null : cursor.getString(i2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, DismissAdv dismissAdv) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, dismissAdv.getCreateTime());
        String title = dismissAdv.getTitle();
        if (title != null) {
            sQLiteStatement.bindString(2, title);
        }
    }
}
