package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.databases.model.trainning.Coach;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class CoachDao extends AbstractDao<Coach, Long> {
    public static final String TABLENAME = "COACH";

    public static class Properties {
        public static final Property HuamiId = new Property(0, String.class, "huamiId", false, "HUAMI_ID");
        public static final Property Id = new Property(1, Long.class, "id", true, "_id");
        public static final Property Name = new Property(2, String.class, "name", false, "NAME");
        public static final Property Gender = new Property(3, Integer.class, "gender", false, "GENDER");
        public static final Property Introduction = new Property(4, String.class, "introduction", false, "INTRODUCTION");
        public static final Property Portrait = new Property(5, String.class, "portrait", false, "PORTRAIT");
        public static final Property UpdateTime = new Property(6, Long.class, EcgData.TIMESTAMP_SERVER_UPDATED, false, "UPDATE_TIME");
        public static final Property HomePageUrl = new Property(7, String.class, "homePageUrl", false, "HOME_PAGE_URL");
    }

    public CoachDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"COACH\" (\"HUAMI_ID\" TEXT,\"_id\" INTEGER PRIMARY KEY ,\"NAME\" TEXT,\"GENDER\" INTEGER,\"INTRODUCTION\" TEXT,\"PORTRAIT\" TEXT,\"UPDATE_TIME\" INTEGER,\"HOME_PAGE_URL\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"COACH\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public CoachDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Coach coach) {
        if (coach != null) {
            return coach.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Coach coach) {
        return coach.getId() != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 1;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(Coach coach, long j) {
        coach.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Coach coach) {
        databaseStatement.clearBindings();
        String huamiId = coach.getHuamiId();
        if (huamiId != null) {
            databaseStatement.bindString(1, huamiId);
        }
        Long id = coach.getId();
        if (id != null) {
            databaseStatement.bindLong(2, id.longValue());
        }
        String name = coach.getName();
        if (name != null) {
            databaseStatement.bindString(3, name);
        }
        Integer gender = coach.getGender();
        if (gender != null) {
            databaseStatement.bindLong(4, gender.intValue());
        }
        String introduction = coach.getIntroduction();
        if (introduction != null) {
            databaseStatement.bindString(5, introduction);
        }
        String portrait = coach.getPortrait();
        if (portrait != null) {
            databaseStatement.bindString(6, portrait);
        }
        Long updateTime = coach.getUpdateTime();
        if (updateTime != null) {
            databaseStatement.bindLong(7, updateTime.longValue());
        }
        String homePageUrl = coach.getHomePageUrl();
        if (homePageUrl != null) {
            databaseStatement.bindString(8, homePageUrl);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Coach readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        Long lValueOf = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        String string3 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        String string4 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        int i9 = i + 7;
        return new Coach(string, lValueOf, string2, numValueOf, string3, string4, cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)), cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Coach coach, int i) {
        int i2 = i + 0;
        coach.setHuamiId(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        coach.setId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        coach.setName(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        coach.setGender(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        coach.setIntroduction(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        coach.setPortrait(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        coach.setUpdateTime(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i + 7;
        coach.setHomePageUrl(cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Coach coach) {
        sQLiteStatement.clearBindings();
        String huamiId = coach.getHuamiId();
        if (huamiId != null) {
            sQLiteStatement.bindString(1, huamiId);
        }
        Long id = coach.getId();
        if (id != null) {
            sQLiteStatement.bindLong(2, id.longValue());
        }
        String name = coach.getName();
        if (name != null) {
            sQLiteStatement.bindString(3, name);
        }
        Integer gender = coach.getGender();
        if (gender != null) {
            sQLiteStatement.bindLong(4, gender.intValue());
        }
        String introduction = coach.getIntroduction();
        if (introduction != null) {
            sQLiteStatement.bindString(5, introduction);
        }
        String portrait = coach.getPortrait();
        if (portrait != null) {
            sQLiteStatement.bindString(6, portrait);
        }
        Long updateTime = coach.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(7, updateTime.longValue());
        }
        String homePageUrl = coach.getHomePageUrl();
        if (homePageUrl != null) {
            sQLiteStatement.bindString(8, homePageUrl);
        }
    }
}
