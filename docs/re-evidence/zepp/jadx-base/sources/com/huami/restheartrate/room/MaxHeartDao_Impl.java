package com.huami.restheartrate.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.restheartrate.entity.MaxHeartEntity;
import com.huami.watch.companion.dataflow.Constant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class MaxHeartDao_Impl implements MaxHeartDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<MaxHeartEntity> b;

    public class a extends EntityInsertionAdapter<MaxHeartEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, MaxHeartEntity value) {
            if (value.getUserId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getUserId());
            }
            if (value.getDate() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getDate());
            }
            stmt.bindLong(3, value.getHeartRate());
            stmt.bindLong(4, value.getTimestamp());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `max_heart_rate` (`userId`,`date`,`heartRate`,`timestamp`) VALUES (?,?,?,?)";
        }
    }

    public MaxHeartDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // com.huami.restheartrate.room.MaxHeartDao
    public List<MaxHeartEntity> getMaxHeartBetweenDate(final String userId, final String startDate, final String endDate) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from max_heart_rate where userId=? and date>=? and date<=?", 3);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (startDate == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, startDate);
        }
        if (endDate == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, endDate);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.KEY_HR_VALUE);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new MaxHeartEntity(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4)));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // com.huami.restheartrate.room.MaxHeartDao
    public MaxHeartEntity getMaxHeartByDate(final String userId, final String date) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from max_heart_rate where userId=? and date=?", 2);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (date == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, date);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new MaxHeartEntity(cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "date")), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.KEY_HR_VALUE)), cursorQuery.getLong(CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp"))) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.restheartrate.room.MaxHeartDao
    public void insertMaxHeart(final MaxHeartEntity... data) {
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
