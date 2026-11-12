package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.message.api.WebConst;
import com.xiaomi.hm.health.databases.model.Push;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class PushDao extends AbstractDao<Push, Long> {
    public static final String TABLENAME = "PUSH";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property MessageId = new Property(1, Long.class, WebConst.QueryParam.MESSAGE_ID, false, "MESSAGE_ID");
    }

    public PushDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"PUSH\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"MESSAGE_ID\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"PUSH\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public PushDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Push push) {
        if (push != null) {
            return push.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Push push) {
        return push.getId() != null;
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
    public final Long updateKeyAfterInsert(Push push, long j) {
        push.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Push push) {
        databaseStatement.clearBindings();
        Long id = push.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long messageId = push.getMessageId();
        if (messageId != null) {
            databaseStatement.bindLong(2, messageId.longValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Push readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        return new Push(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Push push, int i) {
        int i2 = i + 0;
        push.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        push.setMessageId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Push push) {
        sQLiteStatement.clearBindings();
        Long id = push.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long messageId = push.getMessageId();
        if (messageId != null) {
            sQLiteStatement.bindLong(2, messageId.longValue());
        }
    }
}
