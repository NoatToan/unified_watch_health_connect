package com.huami.restheartrate.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.restheartrate.entity.RestHeartEntity;
import com.huami.watch.companion.dataflow.Constant;

/* JADX INFO: loaded from: classes13.dex */
public final class RestHeartDao_Impl implements RestHeartDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<RestHeartEntity> b;

    public class a extends EntityInsertionAdapter<RestHeartEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, RestHeartEntity value) {
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
            return "INSERT OR REPLACE INTO `rest_heart_rate` (`userId`,`date`,`heartRate`,`timestamp`) VALUES (?,?,?,?)";
        }
    }

    public RestHeartDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // com.huami.restheartrate.room.RestHeartDao
    public RestHeartEntity getRestHeartByDate(final String userId, final String date) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from rest_heart_rate where userId=? and date=?", 2);
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
            return cursorQuery.moveToFirst() ? new RestHeartEntity(cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "date")), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.KEY_HR_VALUE)), cursorQuery.getLong(CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp"))) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.restheartrate.room.RestHeartDao
    public void insertRestHeart(final RestHeartEntity... data) {
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
