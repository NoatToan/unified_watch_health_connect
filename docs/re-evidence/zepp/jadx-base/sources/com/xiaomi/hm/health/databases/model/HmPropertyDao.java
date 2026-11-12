package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class HmPropertyDao extends AbstractDao<HmProperty, String> {
    public static final String TABLENAME = "HM_PROPERTY";

    public static class Properties {
        public static final Property Key = new Property(0, String.class, "key", true, "KEY");
        public static final Property Value = new Property(1, String.class, "value", false, "VALUE");
        public static final Property Status = new Property(2, Integer.class, "status", false, "STATUS");
    }

    public HmPropertyDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"HM_PROPERTY\" (\"KEY\" TEXT PRIMARY KEY NOT NULL ,\"VALUE\" TEXT,\"STATUS\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"HM_PROPERTY\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public HmPropertyDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(HmProperty hmProperty) {
        if (hmProperty != null) {
            return hmProperty.getKey();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(HmProperty hmProperty) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(HmProperty hmProperty, long j) {
        return hmProperty.getKey();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, HmProperty hmProperty) {
        databaseStatement.clearBindings();
        databaseStatement.bindString(1, hmProperty.getKey());
        String value = hmProperty.getValue();
        if (value != null) {
            databaseStatement.bindString(2, value);
        }
        Integer status = hmProperty.getStatus();
        if (status != null) {
            databaseStatement.bindLong(3, status.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public HmProperty readEntity(Cursor cursor, int i) {
        String string = cursor.getString(i + 0);
        int i2 = i + 1;
        int i3 = i + 2;
        return new HmProperty(string, cursor.isNull(i2) ? null : cursor.getString(i2), cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, HmProperty hmProperty, int i) {
        hmProperty.setKey(cursor.getString(i + 0));
        int i2 = i + 1;
        hmProperty.setValue(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        hmProperty.setStatus(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, HmProperty hmProperty) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, hmProperty.getKey());
        String value = hmProperty.getValue();
        if (value != null) {
            sQLiteStatement.bindString(2, value);
        }
        Integer status = hmProperty.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(3, status.intValue());
        }
    }
}
