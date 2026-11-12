package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class UserScaleInfoDao extends AbstractDao<UserScaleInfo, String> {
    public static final String TABLENAME = "USER_SCALE_INFO";

    public static class Properties {
        public static final Property AvatarIdOfScale;
        public static final Property Id = new Property(0, String.class, "id", true, "ID");
        public static final Property MeasureMode;

        static {
            Class cls = Integer.TYPE;
            AvatarIdOfScale = new Property(1, cls, "avatarIdOfScale", false, "AVATAR_ID_OF_SCALE");
            MeasureMode = new Property(2, cls, "measureMode", false, "MEASURE_MODE");
        }
    }

    public UserScaleInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"USER_SCALE_INFO\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"AVATAR_ID_OF_SCALE\" INTEGER NOT NULL ,\"MEASURE_MODE\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"USER_SCALE_INFO\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public UserScaleInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(UserScaleInfo userScaleInfo) {
        if (userScaleInfo != null) {
            return userScaleInfo.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(UserScaleInfo userScaleInfo) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(UserScaleInfo userScaleInfo, long j) {
        return userScaleInfo.getId();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, UserScaleInfo userScaleInfo) {
        databaseStatement.clearBindings();
        databaseStatement.bindString(1, userScaleInfo.getId());
        databaseStatement.bindLong(2, userScaleInfo.getAvatarIdOfScale());
        databaseStatement.bindLong(3, userScaleInfo.getMeasureMode());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public UserScaleInfo readEntity(Cursor cursor, int i) {
        return new UserScaleInfo(cursor.getString(i + 0), cursor.getInt(i + 1), cursor.getInt(i + 2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, UserScaleInfo userScaleInfo) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, userScaleInfo.getId());
        sQLiteStatement.bindLong(2, userScaleInfo.getAvatarIdOfScale());
        sQLiteStatement.bindLong(3, userScaleInfo.getMeasureMode());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, UserScaleInfo userScaleInfo, int i) {
        userScaleInfo.setId(cursor.getString(i + 0));
        userScaleInfo.setAvatarIdOfScale(cursor.getInt(i + 1));
        userScaleInfo.setMeasureMode(cursor.getInt(i + 2));
    }
}
