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
import com.huami.bodymeasurements.temperature.model.local.entity.SingleTempEntity;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
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
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SingleTempEntity singleTempEntity) {
            supportSQLiteStatement.bindLong(1, singleTempEntity.getTimestamp());
            supportSQLiteStatement.bindDouble(2, singleTempEntity.getTemp());
            supportSQLiteStatement.bindDouble(3, singleTempEntity.getEnvTemp());
            if (singleTempEntity.getUserId() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, singleTempEntity.getUserId());
            }
            supportSQLiteStatement.bindLong(5, singleTempEntity.getDeviceSource());
            if (singleTempEntity.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, singleTempEntity.getDeviceId());
            }
            if (singleTempEntity.getDeviceMac() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, singleTempEntity.getDeviceMac());
            }
            if (singleTempEntity.getDeviceSn() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, singleTempEntity.getDeviceSn());
            }
            supportSQLiteStatement.bindLong(9, singleTempEntity.getDeviceType());
            if (singleTempEntity.getAppName() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, singleTempEntity.getAppName());
            }
            if (singleTempEntity.getFirmVersion() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, singleTempEntity.getFirmVersion());
            }
            if (singleTempEntity.getPhoneSource() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, singleTempEntity.getPhoneSource());
            }
            supportSQLiteStatement.bindLong(13, singleTempEntity.getSyncStatus() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SingleTemp` (`timestamp`,`temp`,`envTemp`,`userId`,`deviceSource`,`deviceId`,`deviceMac`,`deviceSn`,`deviceType`,`appName`,`firmVersion`,`phoneSource`,`syncStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
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

    public class c implements Callable<SingleTempEntity> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleTempEntity call() throws Exception {
            SingleTempEntity singleTempEntity = null;
            Cursor cursorQuery = DBUtil.query(SingleTempDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "envTemp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    singleTempEntity = new SingleTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12));
                    singleTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                }
                return singleTempEntity;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public SingleTempDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao
    public SingleTempEntity getLatestSingleTemp(final String userId) {
        SingleTempEntity singleTempEntity;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleTemp where userId=? order by timestamp desc limit 1", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "envTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
            if (cursorQuery.moveToFirst()) {
                SingleTempEntity singleTempEntity2 = new SingleTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12));
                singleTempEntity2.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                singleTempEntity = singleTempEntity2;
            } else {
                singleTempEntity = null;
            }
            return singleTempEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao
    public Flow<SingleTempEntity> getLatestSingleTempFlow() {
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"SingleTemp"}, new c(RoomSQLiteQuery.acquire("select * from SingleTemp order by timestamp desc limit 1", 0)));
    }

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao
    public List<SingleTempEntity> getSingleTempAll() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleTemp ", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "envTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    SingleTempEntity singleTempEntity = new SingleTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12));
                    singleTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                    arrayList.add(singleTempEntity);
                    columnIndexOrThrow = columnIndexOrThrow;
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao
    public List<SingleTempEntity> getSingleTempBetweenTimestamp(final long start, final long end, final String userId) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleTemp where timestamp >=? and timestamp<=? and userId=?", 3);
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
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "envTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    SingleTempEntity singleTempEntity = new SingleTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12));
                    int i = columnIndexOrThrow;
                    singleTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                    arrayList.add(singleTempEntity);
                    columnIndexOrThrow = i;
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao
    public List<SingleTempEntity> getUnSyncSingleTempList() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleTemp where syncStatus = 0", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "temp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "envTemp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneSource");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    SingleTempEntity singleTempEntity = new SingleTempEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getString(columnIndexOrThrow12));
                    singleTempEntity.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                    arrayList.add(singleTempEntity);
                    columnIndexOrThrow = columnIndexOrThrow;
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

    @Override // com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao
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
