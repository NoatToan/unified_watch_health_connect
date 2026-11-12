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
import com.xiaomi.hm.health.temperature.local.entity.SingleTempEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class SingleTempDao_Impl implements SingleTempDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<SingleTempEntity> b;
    private final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<SingleTempEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, SingleTempEntity value) {
            stmt.bindLong(1, value.getTimestamp());
            stmt.bindDouble(2, value.getTemp());
            if (value.getUserId() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getUserId());
            }
            stmt.bindLong(4, value.getDeviceSource());
            if (value.getDeviceId() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindString(5, value.getDeviceId());
            }
            if (value.getDeviceMac() == null) {
                stmt.bindNull(6);
            } else {
                stmt.bindString(6, value.getDeviceMac());
            }
            if (value.getDeviceSn() == null) {
                stmt.bindNull(7);
            } else {
                stmt.bindString(7, value.getDeviceSn());
            }
            stmt.bindLong(8, value.getDeviceType());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SingleTemp` (`timestamp`,`temp`,`userId`,`deviceSource`,`deviceId`,`deviceMac`,`deviceSn`,`deviceType`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from SingleTemp";
        }
    }

    public SingleTempDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.xiaomi.hm.health.temperature.local.dao.SingleTempDao, com.huami.devicex.injection.data.SingleTempDaoApi
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

    @Override // com.xiaomi.hm.health.temperature.local.dao.SingleTempDao, com.huami.devicex.injection.data.SingleTempDaoApi
    public SingleTempEntity getLatestSingleTemp() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleTemp order by timestamp desc limit 1", 0);
        this.a.assertNotSuspendingTransaction();
        SingleTempEntity singleTempEntity = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            if (cursorQuery.moveToFirst()) {
                singleTempEntity = new SingleTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8));
            }
            return singleTempEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.xiaomi.hm.health.temperature.local.dao.SingleTempDao, com.huami.devicex.injection.data.SingleTempDaoApi
    public List<SingleTempEntity> getSingleTempBetweenTimestamp(final long start, final long end) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleTemp where timestamp >=? and timestamp<=?", 2);
        roomSQLiteQueryAcquire.bindLong(1, start);
        roomSQLiteQueryAcquire.bindLong(2, end);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new SingleTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.xiaomi.hm.health.temperature.local.dao.SingleTempDao, com.huami.devicex.injection.data.SingleTempDaoApi
    public void insertOrUpdateSingleTemp(final List<SingleTempEntity> data) {
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
