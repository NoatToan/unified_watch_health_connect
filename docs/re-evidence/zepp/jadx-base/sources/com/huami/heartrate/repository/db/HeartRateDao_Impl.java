package com.huami.heartrate.repository.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.mifit.sportlib.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateDao_Impl implements HeartRateDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<HeartRateEntity> b;
    private final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<HeartRateEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, HeartRateEntity value) {
            if (value.getType() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindLong(1, value.getType().intValue());
            }
            if (value.getDeviceType() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindLong(2, value.getDeviceType().intValue());
            }
            if (value.getDeviceSource() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindLong(3, value.getDeviceSource().intValue());
            }
            stmt.bindLong(4, value.getTime());
            if (value.getHr() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindLong(5, value.getHr().intValue());
            }
            if (value.getState() == null) {
                stmt.bindNull(6);
            } else {
                stmt.bindLong(6, value.getState().intValue());
            }
            if (value.getTimeZone() == null) {
                stmt.bindNull(7);
            } else {
                stmt.bindLong(7, value.getTimeZone().intValue());
            }
            if (value.getDeviceId() == null) {
                stmt.bindNull(8);
            } else {
                stmt.bindString(8, value.getDeviceId());
            }
            if (value.getUserId() == null) {
                stmt.bindNull(9);
            } else {
                stmt.bindString(9, value.getUserId());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `HEART_RATE` (`type`,`deviceType`,`deviceSource`,`time`,`hr`,`state`,`timeZone`,`deviceId`,`userId`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM HEART_RATE WHERE userId = ? AND type = ? AND time between ? and ? AND state = ?";
        }
    }

    public HeartRateDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // com.huami.heartrate.repository.db.HeartRateDao
    public void deleteHeartRateByUserId(final String userId, final int type, final int state, final long from, final long to) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        if (userId == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, userId);
        }
        supportSQLiteStatementAcquire.bindLong(2, type);
        supportSQLiteStatementAcquire.bindLong(3, from);
        supportSQLiteStatementAcquire.bindLong(4, to);
        supportSQLiteStatementAcquire.bindLong(5, state);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.heartrate.repository.db.HeartRateDao
    public List<HeartRateEntity> getHeartRateByUserId(final String userId, final int type, final int state, final long from, final long to) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM HEART_RATE WHERE userId = ? AND type = ? AND time between ? and ? AND state != ? Order by time Desc", 5);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        roomSQLiteQueryAcquire.bindLong(2, type);
        roomSQLiteQueryAcquire.bindLong(3, from);
        roomSQLiteQueryAcquire.bindLong(4, to);
        roomSQLiteQueryAcquire.bindLong(5, state);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.DATA_KEY_HR);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new HeartRateEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)), cursorQuery.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow2)), cursorQuery.isNull(columnIndexOrThrow3) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow3)), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6)), cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.heartrate.repository.db.HeartRateDao
    public void insertManualHeartRate(final HeartRateEntity... users) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(users);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.heartrate.repository.db.HeartRateDao
    public HeartRateEntity queryEarliestHeartRateByUserId(String str, int i, int i2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM HEART_RATE WHERE userId = ? AND type = ? AND state != ? Order by time ASC LIMIT 1", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        this.a.assertNotSuspendingTransaction();
        HeartRateEntity heartRateEntity = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.DATA_KEY_HR);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            if (cursorQuery.moveToFirst()) {
                heartRateEntity = new HeartRateEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)), cursorQuery.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow2)), cursorQuery.isNull(columnIndexOrThrow3) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow3)), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6)), cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)), cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getString(columnIndexOrThrow9));
            }
            return heartRateEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
