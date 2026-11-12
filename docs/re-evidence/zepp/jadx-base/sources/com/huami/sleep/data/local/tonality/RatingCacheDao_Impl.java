package com.huami.sleep.data.local.tonality;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: loaded from: classes13.dex */
public final class RatingCacheDao_Impl implements RatingCacheDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<RatingCacheBean> b;

    public class a extends EntityInsertionAdapter<RatingCacheBean> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, RatingCacheBean value) {
            if (value.getUserId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getUserId());
            }
            if (value.getCacheDay() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getCacheDay());
            }
            stmt.bindLong(3, value.getRatingScore());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `RatingCacheBean` (`uid`,`cache_day`,`rating_score`) VALUES (?,?,?)";
        }
    }

    public RatingCacheDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // com.huami.sleep.data.local.tonality.RatingCacheDao
    public void insertOrReplaceRatingCacheBean(final RatingCacheBean ratingCacheBean) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(ratingCacheBean);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.sleep.data.local.tonality.RatingCacheDao
    public RatingCacheBean queryRatingCacheBeanByKey(final String cacheDay, final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from RatingCacheBean where cache_day = ? and uid = ?", 2);
        if (cacheDay == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, cacheDay);
        }
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new RatingCacheBean(cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "cache_day")), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, "rating_score"))) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
