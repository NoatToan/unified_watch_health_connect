package com.huami.sky.lib.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.sky.lib.entity.RelaxInfo;
import com.huami.sky.lib.entity.UserRelaxScore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class RelaxScoreDao_Impl implements RelaxScoreDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<UserRelaxScore> b;

    public class a extends EntityInsertionAdapter<UserRelaxScore> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, UserRelaxScore value) {
            if (value.getUserId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getUserId());
            }
            RelaxInfo relaxInfo = value.getRelaxInfo();
            if (relaxInfo != null) {
                stmt.bindLong(2, relaxInfo.getValue());
                stmt.bindLong(3, relaxInfo.getCreatedAt());
            } else {
                stmt.bindNull(2);
                stmt.bindNull(3);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `relaxScore` (`userId`,`value`,`createdAt`) VALUES (?,?,?)";
        }
    }

    public class b implements Callable<List<UserRelaxScore>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<UserRelaxScore> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(RelaxScoreDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new UserRelaxScore(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), (cursorQuery.isNull(columnIndexOrThrow2) && cursorQuery.isNull(columnIndexOrThrow3)) ? null : new RelaxInfo(cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3))));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public RelaxScoreDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.sky.lib.room.RelaxScoreDao
    public UserRelaxScore getLatestRelaxScore(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from relaxScore where userId=? order by createdAt limit 1", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        UserRelaxScore userRelaxScore = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
            if (cursorQuery.moveToFirst()) {
                userRelaxScore = new UserRelaxScore(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), (cursorQuery.isNull(columnIndexOrThrow2) && cursorQuery.isNull(columnIndexOrThrow3)) ? null : new RelaxInfo(cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3)));
            }
            return userRelaxScore;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.sky.lib.room.RelaxScoreDao
    public Flow<List<UserRelaxScore>> getRelaxScoreAfterTime(final String userId, final long start) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from relaxScore where userId=? and createdAt >= ? order by createdAt", 2);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        roomSQLiteQueryAcquire.bindLong(2, start);
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"relaxScore"}, new b(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.sky.lib.room.RelaxScoreDao
    public List<UserRelaxScore> getRelaxScoreByRange(final String userId, final long start, final long end) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from relaxScore where userId=? and createdAt between ? and ? order by createdAt", 3);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        roomSQLiteQueryAcquire.bindLong(2, start);
        roomSQLiteQueryAcquire.bindLong(3, end);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new UserRelaxScore(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), (cursorQuery.isNull(columnIndexOrThrow2) && cursorQuery.isNull(columnIndexOrThrow3)) ? null : new RelaxInfo(cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3))));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.sky.lib.room.RelaxScoreDao
    public long[] insert(final List<UserRelaxScore> relaxScores) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long[] jArrInsertAndReturnIdsArray = this.b.insertAndReturnIdsArray(relaxScores);
            this.a.setTransactionSuccessful();
            return jArrInsertAndReturnIdsArray;
        } finally {
            this.a.endTransaction();
        }
    }
}
