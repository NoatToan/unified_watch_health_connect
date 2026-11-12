package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.databases.model.NewCalories;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class NewCaloriesDao extends AbstractDao<NewCalories, Long> {
    public static final String TABLENAME = "NEW_CALORIES";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Date = new Property(1, String.class, "date", false, "DATE");
        public static final Property DeviceId = new Property(2, String.class, "deviceId", false, "DEVICE_ID");
        public static final Property BindTime = new Property(3, Long.TYPE, "bindTime", false, "BIND_TIME");
        public static final Property Cal = new Property(4, Integer.TYPE, "cal", false, "CAL");
    }

    public NewCaloriesDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"NEW_CALORIES\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"DATE\" TEXT,\"DEVICE_ID\" TEXT,\"BIND_TIME\" INTEGER NOT NULL ,\"CAL\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"NEW_CALORIES\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public NewCaloriesDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(NewCalories newCalories) {
        if (newCalories != null) {
            return newCalories.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(NewCalories newCalories) {
        return newCalories.getId() != null;
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
    public final Long updateKeyAfterInsert(NewCalories newCalories, long j) {
        newCalories.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, NewCalories newCalories) {
        databaseStatement.clearBindings();
        Long id = newCalories.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String date = newCalories.getDate();
        if (date != null) {
            databaseStatement.bindString(2, date);
        }
        String deviceId = newCalories.getDeviceId();
        if (deviceId != null) {
            databaseStatement.bindString(3, deviceId);
        }
        databaseStatement.bindLong(4, newCalories.getBindTime());
        databaseStatement.bindLong(5, newCalories.getCal());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public NewCalories readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        return new NewCalories(lValueOf, string, cursor.isNull(i4) ? null : cursor.getString(i4), cursor.getLong(i + 3), cursor.getInt(i + 4));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, NewCalories newCalories, int i) {
        int i2 = i + 0;
        newCalories.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        newCalories.setDate(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        newCalories.setDeviceId(cursor.isNull(i4) ? null : cursor.getString(i4));
        newCalories.setBindTime(cursor.getLong(i + 3));
        newCalories.setCal(cursor.getInt(i + 4));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, NewCalories newCalories) {
        sQLiteStatement.clearBindings();
        Long id = newCalories.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String date = newCalories.getDate();
        if (date != null) {
            sQLiteStatement.bindString(2, date);
        }
        String deviceId = newCalories.getDeviceId();
        if (deviceId != null) {
            sQLiteStatement.bindString(3, deviceId);
        }
        sQLiteStatement.bindLong(4, newCalories.getBindTime());
        sQLiteStatement.bindLong(5, newCalories.getCal());
    }
}
