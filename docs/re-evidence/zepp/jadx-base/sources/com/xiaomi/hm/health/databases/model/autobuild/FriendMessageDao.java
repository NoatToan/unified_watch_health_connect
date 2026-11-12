package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.databases.model.FriendMessage;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class FriendMessageDao extends AbstractDao<FriendMessage, Long> {
    public static final String TABLENAME = "FRIEND_MESSAGE";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property FromUid = new Property(1, String.class, "fromUid", false, "FROM_UID");
        public static final Property FromUsername = new Property(2, String.class, "fromUsername", false, "FROM_USERNAME");
        public static final Property UpdateTime = new Property(3, Long.class, EcgData.TIMESTAMP_SERVER_UPDATED, false, "UPDATE_TIME");
        public static final Property Type = new Property(4, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property Count = new Property(5, Integer.class, "count", false, "COUNT");
        public static final Property Status = new Property(6, Integer.class, "status", false, "STATUS");
        public static final Property Icon = new Property(7, String.class, "icon", false, "ICON");
    }

    public FriendMessageDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"FRIEND_MESSAGE\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"FROM_UID\" TEXT,\"FROM_USERNAME\" TEXT,\"UPDATE_TIME\" INTEGER,\"TYPE\" INTEGER,\"COUNT\" INTEGER,\"STATUS\" INTEGER,\"ICON\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"FRIEND_MESSAGE\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public FriendMessageDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(FriendMessage friendMessage) {
        if (friendMessage != null) {
            return friendMessage.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(FriendMessage friendMessage) {
        return friendMessage.getId() != null;
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
    public final Long updateKeyAfterInsert(FriendMessage friendMessage, long j) {
        friendMessage.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, FriendMessage friendMessage) {
        databaseStatement.clearBindings();
        Long id = friendMessage.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String fromUid = friendMessage.getFromUid();
        if (fromUid != null) {
            databaseStatement.bindString(2, fromUid);
        }
        String fromUsername = friendMessage.getFromUsername();
        if (fromUsername != null) {
            databaseStatement.bindString(3, fromUsername);
        }
        Long updateTime = friendMessage.getUpdateTime();
        if (updateTime != null) {
            databaseStatement.bindLong(4, updateTime.longValue());
        }
        Integer type = friendMessage.getType();
        if (type != null) {
            databaseStatement.bindLong(5, type.intValue());
        }
        Integer count = friendMessage.getCount();
        if (count != null) {
            databaseStatement.bindLong(6, count.intValue());
        }
        Integer status = friendMessage.getStatus();
        if (status != null) {
            databaseStatement.bindLong(7, status.intValue());
        }
        String icon = friendMessage.getIcon();
        if (icon != null) {
            databaseStatement.bindString(8, icon);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public FriendMessage readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        Long lValueOf2 = cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5));
        int i6 = i + 4;
        Integer numValueOf = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf2 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        int i9 = i + 7;
        return new FriendMessage(lValueOf, string, string2, lValueOf2, numValueOf, numValueOf2, cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)), cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, FriendMessage friendMessage, int i) {
        int i2 = i + 0;
        friendMessage.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        friendMessage.setFromUid(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        friendMessage.setFromUsername(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        friendMessage.setUpdateTime(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        friendMessage.setType(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        friendMessage.setCount(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        friendMessage.setStatus(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        friendMessage.setIcon(cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, FriendMessage friendMessage) {
        sQLiteStatement.clearBindings();
        Long id = friendMessage.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String fromUid = friendMessage.getFromUid();
        if (fromUid != null) {
            sQLiteStatement.bindString(2, fromUid);
        }
        String fromUsername = friendMessage.getFromUsername();
        if (fromUsername != null) {
            sQLiteStatement.bindString(3, fromUsername);
        }
        Long updateTime = friendMessage.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(4, updateTime.longValue());
        }
        Integer type = friendMessage.getType();
        if (type != null) {
            sQLiteStatement.bindLong(5, type.intValue());
        }
        Integer count = friendMessage.getCount();
        if (count != null) {
            sQLiteStatement.bindLong(6, count.intValue());
        }
        Integer status = friendMessage.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(7, status.intValue());
        }
        String icon = friendMessage.getIcon();
        if (icon != null) {
            sQLiteStatement.bindString(8, icon);
        }
    }
}
