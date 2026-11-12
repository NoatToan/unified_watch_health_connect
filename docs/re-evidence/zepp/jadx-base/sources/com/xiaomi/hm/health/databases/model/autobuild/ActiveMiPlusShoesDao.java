package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.databases.model.ActiveMiPlusShoes;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ActiveMiPlusShoesDao extends AbstractDao<ActiveMiPlusShoes, Long> {
    public static final String TABLENAME = "ACTIVE_MI_PLUS_SHOES";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Trackid = new Property(1, Long.class, "trackid", false, "TRACKID");
        public static final Property LandingTime = new Property(2, Integer.class, "landingTime", false, "LANDING_TIME");
        public static final Property FlightTime = new Property(3, Integer.class, "flightTime", false, "FLIGHT_TIME");
        public static final Property RealSteps = new Property(4, Integer.class, "realSteps", false, "REAL_STEPS");
        public static final Property LeftRight = new Property(5, Integer.class, "leftRight", false, "LEFT_RIGHT");
    }

    public ActiveMiPlusShoesDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ACTIVE_MI_PLUS_SHOES\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRACKID\" INTEGER,\"LANDING_TIME\" INTEGER,\"FLIGHT_TIME\" INTEGER,\"REAL_STEPS\" INTEGER,\"LEFT_RIGHT\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ACTIVE_MI_PLUS_SHOES\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ActiveMiPlusShoesDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ActiveMiPlusShoes activeMiPlusShoes) {
        if (activeMiPlusShoes != null) {
            return activeMiPlusShoes.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ActiveMiPlusShoes activeMiPlusShoes) {
        return activeMiPlusShoes.getId() != null;
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
    public final Long updateKeyAfterInsert(ActiveMiPlusShoes activeMiPlusShoes, long j) {
        activeMiPlusShoes.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ActiveMiPlusShoes activeMiPlusShoes) {
        databaseStatement.clearBindings();
        Long id = activeMiPlusShoes.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trackid = activeMiPlusShoes.getTrackid();
        if (trackid != null) {
            databaseStatement.bindLong(2, trackid.longValue());
        }
        Integer landingTime = activeMiPlusShoes.getLandingTime();
        if (landingTime != null) {
            databaseStatement.bindLong(3, landingTime.intValue());
        }
        Integer flightTime = activeMiPlusShoes.getFlightTime();
        if (flightTime != null) {
            databaseStatement.bindLong(4, flightTime.intValue());
        }
        Integer realSteps = activeMiPlusShoes.getRealSteps();
        if (realSteps != null) {
            databaseStatement.bindLong(5, realSteps.intValue());
        }
        Integer leftRight = activeMiPlusShoes.getLeftRight();
        if (leftRight != null) {
            databaseStatement.bindLong(6, leftRight.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ActiveMiPlusShoes readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Integer numValueOf = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        Integer numValueOf2 = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        int i7 = i + 5;
        return new ActiveMiPlusShoes(lValueOf, lValueOf2, numValueOf, numValueOf2, cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)), cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ActiveMiPlusShoes activeMiPlusShoes, int i) {
        int i2 = i + 0;
        activeMiPlusShoes.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        activeMiPlusShoes.setTrackid(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        activeMiPlusShoes.setLandingTime(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        activeMiPlusShoes.setFlightTime(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        activeMiPlusShoes.setRealSteps(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        activeMiPlusShoes.setLeftRight(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ActiveMiPlusShoes activeMiPlusShoes) {
        sQLiteStatement.clearBindings();
        Long id = activeMiPlusShoes.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trackid = activeMiPlusShoes.getTrackid();
        if (trackid != null) {
            sQLiteStatement.bindLong(2, trackid.longValue());
        }
        Integer landingTime = activeMiPlusShoes.getLandingTime();
        if (landingTime != null) {
            sQLiteStatement.bindLong(3, landingTime.intValue());
        }
        Integer flightTime = activeMiPlusShoes.getFlightTime();
        if (flightTime != null) {
            sQLiteStatement.bindLong(4, flightTime.intValue());
        }
        Integer realSteps = activeMiPlusShoes.getRealSteps();
        if (realSteps != null) {
            sQLiteStatement.bindLong(5, realSteps.intValue());
        }
        Integer leftRight = activeMiPlusShoes.getLeftRight();
        if (leftRight != null) {
            sQLiteStatement.bindLong(6, leftRight.intValue());
        }
    }
}
