package com.xiaomi.hm.health.temperature.local.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.temperature.local.entity.AllDayTempEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
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
        public void bind(SupportSQLiteStatement stmt, AllDayTempEntity value) {
            stmt.bindLong(1, value.getTimestamp());
            stmt.bindDouble(2, value.getMaxTemp());
            stmt.bindDouble(3, value.getMinTemp());
            stmt.bindDouble(4, value.getAvgTemp());
            if (value.getData() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindString(5, value.getData());
            }
            if (value.getUserId() == null) {
                stmt.bindNull(6);
            } else {
                stmt.bindString(6, value.getUserId());
            }
            stmt.bindLong(7, value.getDeviceSource());
            if (value.getDeviceId() == null) {
                stmt.bindNull(8);
            } else {
                stmt.bindString(8, value.getDeviceId());
            }
            if (value.getDeviceMac() == null) {
                stmt.bindNull(9);
            } else {
                stmt.bindString(9, value.getDeviceMac());
            }
            if (value.getDeviceSn() == null) {
                stmt.bindNull(10);
            } else {
                stmt.bindString(10, value.getDeviceSn());
            }
            stmt.bindLong(11, value.getDeviceType());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `AllDayTemp` (`timestamp`,`maxTemp`,`minTemp`,`avgTemp`,`data`,`userId`,`deviceSource`,`deviceId`,`deviceMac`,`deviceSn`,`deviceType`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
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

    public AllDayTempDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao, com.huami.devicex.injection.data.AllDayTempDaoApi
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

    @Override // com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao, com.huami.devicex.injection.data.AllDayTempDaoApi
    public List<AllDayTempEntity> getAllDayTempBetweenTimestamp(final long start, final long end) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayTemp where timestamp >=? and timestamp<=?", 2);
        roomSQLiteQueryAcquire.bindLong(1, start);
        roomSQLiteQueryAcquire.bindLong(2, end);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao, com.huami.devicex.injection.data.AllDayTempDaoApi
    public AllDayTempEntity getAllDayTempByTimestamp(long j) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayTemp where timestamp =?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        this.a.assertNotSuspendingTransaction();
        AllDayTempEntity allDayTempEntity = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            if (cursorQuery.moveToFirst()) {
                allDayTempEntity = new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11));
            }
            return allDayTempEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao, com.huami.devicex.injection.data.AllDayTempDaoApi
    public AllDayTempEntity getLatestAllDayTemp() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayTemp order by timestamp desc limit 1", 0);
        this.a.assertNotSuspendingTransaction();
        AllDayTempEntity allDayTempEntity = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxTemp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgTemp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            if (cursorQuery.moveToFirst()) {
                allDayTempEntity = new AllDayTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11));
            }
            return allDayTempEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao, com.huami.devicex.injection.data.AllDayTempDaoApi
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

    @Override // com.xiaomi.hm.health.temperature.local.dao.AllDayTempDao, com.huami.devicex.injection.data.AllDayTempDaoApi
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
