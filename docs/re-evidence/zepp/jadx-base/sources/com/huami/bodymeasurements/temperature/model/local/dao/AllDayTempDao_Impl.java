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
import com.huami.bodymeasurements.temperature.model.local.entity.AllDayTempEntity;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
public final class AllDayTempDao_Impl implements AllDayTempDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<AllDayTempEntity> b;
    private final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<AllDayTempEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, AllDayTempEntity allDayTempEntity) {
            supportSQLiteStatement.bindLong(1, allDayTempEntity.getTimestamp());
            supportSQLiteStatement.bindDouble(2, allDayTempEntity.getMaxTemp());
            supportSQLiteStatement.bindDouble(3, allDayTempEntity.getMinTemp());
            supportSQLiteStatement.bindDouble(4, allDayTempEntity.getAvgTemp());
            if (allDayTempEntity.getData() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, allDayTempEntity.getData());
            }
            if (allDayTempEntity.getOriginalRawData() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, allDayTempEntity.getOriginalRawData());
            }
            if (allDayTempEntity.getUserId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, allDayTempEntity.getUserId());
            }
            supportSQLiteStatement.bindLong(8, allDayTempEntity.getDeviceSource());
            if (allDayTempEntity.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, allDayTempEntity.getDeviceId());
            }
            if (allDayTempEntity.getDeviceMac() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, allDayTempEntity.getDeviceMac());
            }
            if (allDayTempEntity.getDeviceSn() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, allDayTempEntity.getDeviceSn());
            }
            supportSQLiteStatement.bindLong(12, allDayTempEntity.getDeviceType());
            if (allDayTempEntity.getAppName() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, allDayTempEntity.getAppName());
            }
            if (allDayTempEntity.getFirmVersion() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, allDayTempEntity.getFirmVersion());
            }
            if (allDayTempEntity.getPhoneSource() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, allDayTempEntity.getPhoneSource());
            }
            supportSQLiteStatement.bindLong(16, allDayTempEntity.getSyncStatus() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `AllDayTemp` (`timestamp`,`maxTemp`,`minTemp`,`avgTemp`,`data`,`originalRawData`,`userId`,`deviceSource`,`deviceId`,`deviceMac`,`deviceSn`,`deviceType`,`appName`,`firmVersion`,`phoneSource`,`syncStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from AllDayTemp";
        }
    }

    public class c implements Callable<AllDayTempEntity> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AllDayTempEntity call() throws Exception {
            AllDayTempEntity allDayTempEntity;
            Cursor cursorQuery = DBUtil.query(AllDayTempDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalRawData");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    allDayTempEntity = new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(columnIndexOrThrow14), cursorQuery.getString(columnIndexOrThrow15));
                    allDayTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow16) != 0);
                } else {
                    allDayTempEntity = null;
                }
                return allDayTempEntity;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public AllDayTempDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
    public List<AllDayTempEntity> getAllDayTempAll() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayTemp ", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalRawData");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i2 = i;
                    int i3 = columnIndexOrThrow;
                    int i4 = columnIndexOrThrow15;
                    columnIndexOrThrow15 = i4;
                    AllDayTempEntity allDayTempEntity = new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(i2), cursorQuery.getString(i4));
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    allDayTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow16) != 0);
                    arrayList.add(allDayTempEntity);
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
    public List<AllDayTempEntity> getAllDayTempBetweenTimestamp(final long start, final long end, final String userId) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayTemp where timestamp >=? and timestamp<=? and userId=?", 3);
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
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalRawData");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i2 = i;
                    int i3 = columnIndexOrThrow;
                    int i4 = columnIndexOrThrow15;
                    columnIndexOrThrow15 = i4;
                    AllDayTempEntity allDayTempEntity = new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(i2), cursorQuery.getString(i4));
                    int i5 = columnIndexOrThrow16;
                    columnIndexOrThrow16 = i5;
                    allDayTempEntity.setSyncStatus(cursorQuery.getInt(i5) != 0);
                    arrayList.add(allDayTempEntity);
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
    public AllDayTempEntity getAllDayTempByTimestamp(final long timestamp) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        AllDayTempEntity allDayTempEntity;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayTemp where timestamp =?", 1);
        roomSQLiteQueryAcquire.bindLong(1, timestamp);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalRawData");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    allDayTempEntity = new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(columnIndexOrThrow14), cursorQuery.getString(columnIndexOrThrow15));
                    allDayTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow16) != 0);
                } else {
                    allDayTempEntity = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return allDayTempEntity;
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
    public AllDayTempEntity getLatestAllDayTemp(final String userId) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        AllDayTempEntity allDayTempEntity;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayTemp where userId=? order by timestamp desc limit 1", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalRawData");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    allDayTempEntity = new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(columnIndexOrThrow14), cursorQuery.getString(columnIndexOrThrow15));
                    allDayTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow16) != 0);
                } else {
                    allDayTempEntity = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return allDayTempEntity;
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
    public Flow<AllDayTempEntity> getLatestAllDayTempFlow() {
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"AllDayTemp"}, new c(RoomSQLiteQuery.acquire("select * from AllDayTemp order by timestamp desc limit 1", 0)));
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
    public List<AllDayTempEntity> getUnSyncAllDayTempList() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayTemp where syncStatus = 0", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalRawData");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i2 = i;
                    int i3 = columnIndexOrThrow;
                    int i4 = columnIndexOrThrow15;
                    columnIndexOrThrow15 = i4;
                    AllDayTempEntity allDayTempEntity = new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getString(i2), cursorQuery.getString(i4));
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    allDayTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow16) != 0);
                    arrayList.add(allDayTempEntity);
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
    public void insertOrUpdateAllDayTemp(final AllDayTempEntity data) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(data);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao
    public void insertOrUpdateAllDayTempList(final List<AllDayTempEntity> data) {
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
