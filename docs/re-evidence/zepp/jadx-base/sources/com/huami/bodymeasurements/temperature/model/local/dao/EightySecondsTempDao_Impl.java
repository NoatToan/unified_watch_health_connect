package com.huami.bodymeasurements.temperature.model.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.bodymeasurements.temperature.model.local.entity.EightySecondsTempEntity;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
public final class EightySecondsTempDao_Impl implements EightySecondsTempDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<EightySecondsTempEntity> b;
    private final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<EightySecondsTempEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EightySecondsTempEntity eightySecondsTempEntity) {
            supportSQLiteStatement.bindLong(1, eightySecondsTempEntity.getTimestamp());
            supportSQLiteStatement.bindLong(2, eightySecondsTempEntity.getFlag());
            supportSQLiteStatement.bindLong(3, eightySecondsTempEntity.getWearDuration());
            supportSQLiteStatement.bindDouble(4, eightySecondsTempEntity.getTemp());
            if (eightySecondsTempEntity.getRawData() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, eightySecondsTempEntity.getRawData());
            }
            if (eightySecondsTempEntity.getUserId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, eightySecondsTempEntity.getUserId());
            }
            supportSQLiteStatement.bindLong(7, eightySecondsTempEntity.getDeviceSource());
            if (eightySecondsTempEntity.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, eightySecondsTempEntity.getDeviceId());
            }
            if (eightySecondsTempEntity.getDeviceMac() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, eightySecondsTempEntity.getDeviceMac());
            }
            if (eightySecondsTempEntity.getDeviceSn() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, eightySecondsTempEntity.getDeviceSn());
            }
            supportSQLiteStatement.bindLong(11, eightySecondsTempEntity.getDeviceType());
            if (eightySecondsTempEntity.getAppName() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, eightySecondsTempEntity.getAppName());
            }
            if (eightySecondsTempEntity.getFirmVersion() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, eightySecondsTempEntity.getFirmVersion());
            }
            if (eightySecondsTempEntity.getPhoneSource() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, eightySecondsTempEntity.getPhoneSource());
            }
            supportSQLiteStatement.bindLong(15, eightySecondsTempEntity.getSyncStatus() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `EightySecondsTemp` (`timestamp`,`flag`,`wearDuration`,`temp`,`rawData`,`userId`,`deviceSource`,`deviceId`,`deviceMac`,`deviceSn`,`deviceType`,`appName`,`firmVersion`,`phoneSource`,`syncStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from EightySecondsTemp";
        }
    }

    public class c implements Callable<EightySecondsTempEntity> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EightySecondsTempEntity call() throws Exception {
            EightySecondsTempEntity eightySecondsTempEntity;
            Cursor cursorQuery = DBUtil.query(EightySecondsTempDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flag");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "wearDuration");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rawData");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    eightySecondsTempEntity = new EightySecondsTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(columnIndexOrThrow14));
                    eightySecondsTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow15) != 0);
                } else {
                    eightySecondsTempEntity = null;
                }
                return eightySecondsTempEntity;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public EightySecondsTempDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao
    public void clean() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao
    public List<EightySecondsTempEntity> getEightySecondsTempAll() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from EightySecondsTemp ", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flag");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "wearDuration");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rawData");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i2 = i;
                    int i3 = columnIndexOrThrow;
                    EightySecondsTempEntity eightySecondsTempEntity = new EightySecondsTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(i2));
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    eightySecondsTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow15) != 0);
                    arrayList.add(eightySecondsTempEntity);
                    columnIndexOrThrow = i3;
                    i = i2;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao
    public List<EightySecondsTempEntity> getEightySecondsTempBetweenTimestamp(final long start, final long end, final String userId) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from EightySecondsTemp where timestamp >=? and timestamp<=? and userId=?", 3);
        roomSQLiteQueryAcquire.bindLong(1, start);
        roomSQLiteQueryAcquire.bindLong(2, end);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flag");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "wearDuration");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rawData");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i2 = i;
                    int i3 = columnIndexOrThrow;
                    EightySecondsTempEntity eightySecondsTempEntity = new EightySecondsTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(i2));
                    int i4 = columnIndexOrThrow15;
                    columnIndexOrThrow15 = i4;
                    eightySecondsTempEntity.setSyncStatus(cursorQuery.getInt(i4) != 0);
                    arrayList.add(eightySecondsTempEntity);
                    columnIndexOrThrow = i3;
                    i = i2;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao
    public EightySecondsTempEntity getLatestEightySecondsTemp() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        EightySecondsTempEntity eightySecondsTempEntity;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from EightySecondsTemp order by timestamp desc limit 1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flag");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "wearDuration");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rawData");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    eightySecondsTempEntity = new EightySecondsTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(columnIndexOrThrow14));
                    eightySecondsTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow15) != 0);
                } else {
                    eightySecondsTempEntity = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return eightySecondsTempEntity;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao
    public Flow<EightySecondsTempEntity> getLatestEightySecondsTempFlow() {
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"EightySecondsTemp"}, new c(RoomSQLiteQuery.acquire("select * from EightySecondsTemp order by timestamp desc limit 1", 0)));
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao
    public List<EightySecondsTempEntity> getUnSyncEightySecondsTempList() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from EightySecondsTemp where syncStatus = 0", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flag");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "wearDuration");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rawData");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i2 = i;
                    int i3 = columnIndexOrThrow;
                    EightySecondsTempEntity eightySecondsTempEntity = new EightySecondsTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(i2));
                    columnIndexOrThrow15 = columnIndexOrThrow15;
                    eightySecondsTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow15) != 0);
                    arrayList.add(eightySecondsTempEntity);
                    columnIndexOrThrow = i3;
                    i = i2;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.EightySecondsTempDao
    public void insertOrUpdateEightySecondsTemp(final List<EightySecondsTempEntity> data) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(data);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
