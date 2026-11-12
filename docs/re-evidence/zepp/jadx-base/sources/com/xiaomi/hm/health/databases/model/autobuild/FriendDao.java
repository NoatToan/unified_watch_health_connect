package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.Friend;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class FriendDao extends AbstractDao<Friend, String> {
    public static final String TABLENAME = "FRIEND";

    public static class Properties {
        public static final Property Uid = new Property(0, String.class, "uid", true, "UID");
        public static final Property Username = new Property(1, String.class, "username", false, "USERNAME");
        public static final Property Icon = new Property(2, String.class, "icon", false, "ICON");
        public static final Property Weight = new Property(3, Integer.class, "weight", false, "WEIGHT");
        public static final Property Step = new Property(4, Integer.class, "step", false, "STEP");
        public static final Property SleepTime = new Property(5, Integer.class, "sleepTime", false, "SLEEP_TIME");
        public static final Property CareCountByHim = new Property(6, Integer.class, "careCountByHim", false, "CARE_COUNT_BY_HIM");
        public static final Property CareCountByMe = new Property(7, Integer.class, "careCountByMe", false, "CARE_COUNT_BY_ME");
        public static final Property LastUpdateTime = new Property(8, Long.class, "lastUpdateTime", false, "LAST_UPDATE_TIME");
        public static final Property LastDetailUpdateTime = new Property(9, Long.class, "lastDetailUpdateTime", false, "LAST_DETAIL_UPDATE_TIME");
        public static final Property RemarkName = new Property(10, String.class, "remarkName", false, "REMARK_NAME");
        public static final Property CreateTime = new Property(11, Long.class, ParamKey.createTime, false, "CREATE_TIME");
        public static final Property Tz = new Property(12, Integer.class, "tz", false, "TZ");
        public static final Property Distance = new Property(13, Integer.class, "distance", false, "DISTANCE");
        public static final Property Calorie = new Property(14, Integer.class, "calorie", false, "CALORIE");
        public static final Property BirthDay = new Property(15, String.class, "birthDay", false, "BIRTH_DAY");
    }

    public FriendDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"FRIEND\" (\"UID\" TEXT PRIMARY KEY NOT NULL ,\"USERNAME\" TEXT,\"ICON\" TEXT,\"WEIGHT\" INTEGER,\"STEP\" INTEGER,\"SLEEP_TIME\" INTEGER,\"CARE_COUNT_BY_HIM\" INTEGER,\"CARE_COUNT_BY_ME\" INTEGER,\"LAST_UPDATE_TIME\" INTEGER,\"LAST_DETAIL_UPDATE_TIME\" INTEGER,\"REMARK_NAME\" TEXT,\"CREATE_TIME\" INTEGER,\"TZ\" INTEGER,\"DISTANCE\" INTEGER,\"CALORIE\" INTEGER,\"BIRTH_DAY\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"FRIEND\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public FriendDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(Friend friend) {
        if (friend != null) {
            return friend.getUid();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Friend friend) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        return cursor.getString(i + 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(Friend friend, long j) {
        return friend.getUid();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Friend friend) {
        databaseStatement.clearBindings();
        databaseStatement.bindString(1, friend.getUid());
        String username = friend.getUsername();
        if (username != null) {
            databaseStatement.bindString(2, username);
        }
        String icon = friend.getIcon();
        if (icon != null) {
            databaseStatement.bindString(3, icon);
        }
        Integer weight = friend.getWeight();
        if (weight != null) {
            databaseStatement.bindLong(4, weight.intValue());
        }
        Integer step = friend.getStep();
        if (step != null) {
            databaseStatement.bindLong(5, step.intValue());
        }
        Integer sleepTime = friend.getSleepTime();
        if (sleepTime != null) {
            databaseStatement.bindLong(6, sleepTime.intValue());
        }
        Integer careCountByHim = friend.getCareCountByHim();
        if (careCountByHim != null) {
            databaseStatement.bindLong(7, careCountByHim.intValue());
        }
        Integer careCountByMe = friend.getCareCountByMe();
        if (careCountByMe != null) {
            databaseStatement.bindLong(8, careCountByMe.intValue());
        }
        Long lastUpdateTime = friend.getLastUpdateTime();
        if (lastUpdateTime != null) {
            databaseStatement.bindLong(9, lastUpdateTime.longValue());
        }
        Long lastDetailUpdateTime = friend.getLastDetailUpdateTime();
        if (lastDetailUpdateTime != null) {
            databaseStatement.bindLong(10, lastDetailUpdateTime.longValue());
        }
        String remarkName = friend.getRemarkName();
        if (remarkName != null) {
            databaseStatement.bindString(11, remarkName);
        }
        Long createTime = friend.getCreateTime();
        if (createTime != null) {
            databaseStatement.bindLong(12, createTime.longValue());
        }
        Integer tz = friend.getTz();
        if (tz != null) {
            databaseStatement.bindLong(13, tz.intValue());
        }
        Integer distance = friend.getDistance();
        if (distance != null) {
            databaseStatement.bindLong(14, distance.intValue());
        }
        Integer calorie = friend.getCalorie();
        if (calorie != null) {
            databaseStatement.bindLong(15, calorie.intValue());
        }
        String birthDay = friend.getBirthDay();
        if (birthDay != null) {
            databaseStatement.bindString(16, birthDay);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Friend readEntity(Cursor cursor, int i) {
        String string = cursor.getString(i + 0);
        int i2 = i + 1;
        String string2 = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 2;
        String string3 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 3;
        Integer numValueOf = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 4;
        Integer numValueOf2 = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 5;
        Integer numValueOf3 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 6;
        Integer numValueOf4 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 7;
        Integer numValueOf5 = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 8;
        Long lValueOf = cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9));
        int i10 = i + 9;
        Long lValueOf2 = cursor.isNull(i10) ? null : Long.valueOf(cursor.getLong(i10));
        int i11 = i + 10;
        String string4 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 11;
        Long lValueOf3 = cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12));
        int i13 = i + 12;
        Integer numValueOf6 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i + 13;
        Integer numValueOf7 = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i + 14;
        Integer numValueOf8 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i + 15;
        return new Friend(string, string2, string3, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, lValueOf, lValueOf2, string4, lValueOf3, numValueOf6, numValueOf7, numValueOf8, cursor.isNull(i16) ? null : cursor.getString(i16));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Friend friend, int i) {
        friend.setUid(cursor.getString(i + 0));
        int i2 = i + 1;
        friend.setUsername(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        friend.setIcon(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 3;
        friend.setWeight(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 4;
        friend.setStep(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 5;
        friend.setSleepTime(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 6;
        friend.setCareCountByHim(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 7;
        friend.setCareCountByMe(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 8;
        friend.setLastUpdateTime(cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9)));
        int i10 = i + 9;
        friend.setLastDetailUpdateTime(cursor.isNull(i10) ? null : Long.valueOf(cursor.getLong(i10)));
        int i11 = i + 10;
        friend.setRemarkName(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 11;
        friend.setCreateTime(cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
        int i13 = i + 12;
        friend.setTz(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i + 13;
        friend.setDistance(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i + 14;
        friend.setCalorie(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i + 15;
        friend.setBirthDay(cursor.isNull(i16) ? null : cursor.getString(i16));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Friend friend) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, friend.getUid());
        String username = friend.getUsername();
        if (username != null) {
            sQLiteStatement.bindString(2, username);
        }
        String icon = friend.getIcon();
        if (icon != null) {
            sQLiteStatement.bindString(3, icon);
        }
        Integer weight = friend.getWeight();
        if (weight != null) {
            sQLiteStatement.bindLong(4, weight.intValue());
        }
        Integer step = friend.getStep();
        if (step != null) {
            sQLiteStatement.bindLong(5, step.intValue());
        }
        Integer sleepTime = friend.getSleepTime();
        if (sleepTime != null) {
            sQLiteStatement.bindLong(6, sleepTime.intValue());
        }
        Integer careCountByHim = friend.getCareCountByHim();
        if (careCountByHim != null) {
            sQLiteStatement.bindLong(7, careCountByHim.intValue());
        }
        Integer careCountByMe = friend.getCareCountByMe();
        if (careCountByMe != null) {
            sQLiteStatement.bindLong(8, careCountByMe.intValue());
        }
        Long lastUpdateTime = friend.getLastUpdateTime();
        if (lastUpdateTime != null) {
            sQLiteStatement.bindLong(9, lastUpdateTime.longValue());
        }
        Long lastDetailUpdateTime = friend.getLastDetailUpdateTime();
        if (lastDetailUpdateTime != null) {
            sQLiteStatement.bindLong(10, lastDetailUpdateTime.longValue());
        }
        String remarkName = friend.getRemarkName();
        if (remarkName != null) {
            sQLiteStatement.bindString(11, remarkName);
        }
        Long createTime = friend.getCreateTime();
        if (createTime != null) {
            sQLiteStatement.bindLong(12, createTime.longValue());
        }
        Integer tz = friend.getTz();
        if (tz != null) {
            sQLiteStatement.bindLong(13, tz.intValue());
        }
        Integer distance = friend.getDistance();
        if (distance != null) {
            sQLiteStatement.bindLong(14, distance.intValue());
        }
        Integer calorie = friend.getCalorie();
        if (calorie != null) {
            sQLiteStatement.bindLong(15, calorie.intValue());
        }
        String birthDay = friend.getBirthDay();
        if (birthDay != null) {
            sQLiteStatement.bindString(16, birthDay);
        }
    }
}
