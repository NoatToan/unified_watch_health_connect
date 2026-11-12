package com.huami.treadmill.data.source.db;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.treadmill.data.TdSpeedKingBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class TdKingSpeedDao_Impl implements TdKingSpeedDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<TdSpeedKingBean> __insertionAdapterOfTdSpeedKingBean;
    private final SharedSQLiteStatement __preparedStmtOfDeleteKings;

    public TdKingSpeedDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTdSpeedKingBean = new EntityInsertionAdapter<TdSpeedKingBean>(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdKingSpeedDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `speed_king_rank` (`index`,`userId`,`nickName`,`value`,`icon`,`startDay`,`continueDays`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TdSpeedKingBean tdSpeedKingBean) {
                supportSQLiteStatement.bindLong(1, tdSpeedKingBean.getIndex());
                if (tdSpeedKingBean.getUserId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, tdSpeedKingBean.getUserId());
                }
                if (tdSpeedKingBean.getNickName() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, tdSpeedKingBean.getNickName());
                }
                supportSQLiteStatement.bindLong(4, tdSpeedKingBean.getValue());
                if (tdSpeedKingBean.getIcon() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, tdSpeedKingBean.getIcon());
                }
                supportSQLiteStatement.bindLong(6, tdSpeedKingBean.getStartDay());
                supportSQLiteStatement.bindLong(7, tdSpeedKingBean.getContinueDays());
            }
        };
        this.__preparedStmtOfDeleteKings = new SharedSQLiteStatement(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdKingSpeedDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM speed_king_rank ";
            }
        };
    }

    @Override // com.huami.treadmill.data.source.db.TdKingSpeedDao
    public void deleteKings() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteKings.acquire();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteKings.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdKingSpeedDao
    public void insert(List<TdSpeedKingBean> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfTdSpeedKingBean.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdKingSpeedDao
    public DataSource.Factory<Integer, TdSpeedKingBean> queryKings() {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM speed_king_rank ORDER BY `index` asc ", 0);
        return new DataSource.Factory<Integer, TdSpeedKingBean>() { // from class: com.huami.treadmill.data.source.db.TdKingSpeedDao_Impl.3
            @Override // androidx.paging.DataSource.Factory
            public DataSource<Integer, TdSpeedKingBean> create() {
                return new LimitOffsetDataSource<TdSpeedKingBean>(TdKingSpeedDao_Impl.this.__db, roomSQLiteQueryAcquire, false, "speed_king_rank") { // from class: com.huami.treadmill.data.source.db.TdKingSpeedDao_Impl.3.1
                    @Override // androidx.room.paging.LimitOffsetDataSource
                    public List<TdSpeedKingBean> convertRows(Cursor cursor) {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "index");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "nickName");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "value");
                        int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "icon");
                        int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "startDay");
                        int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "continueDays");
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        while (cursor.moveToNext()) {
                            TdSpeedKingBean tdSpeedKingBean = new TdSpeedKingBean();
                            tdSpeedKingBean.setIndex(cursor.getInt(columnIndexOrThrow));
                            tdSpeedKingBean.setUserId(cursor.getString(columnIndexOrThrow2));
                            tdSpeedKingBean.setNickName(cursor.getString(columnIndexOrThrow3));
                            tdSpeedKingBean.setValue(cursor.getLong(columnIndexOrThrow4));
                            tdSpeedKingBean.setIcon(cursor.getString(columnIndexOrThrow5));
                            tdSpeedKingBean.setStartDay(cursor.getLong(columnIndexOrThrow6));
                            tdSpeedKingBean.setContinueDays(cursor.getLong(columnIndexOrThrow7));
                            arrayList.add(tdSpeedKingBean);
                        }
                        return arrayList;
                    }
                };
            }
        };
    }

    @Override // com.huami.treadmill.data.source.db.TdKingSpeedDao
    public TdSpeedKingBean queryLastKing() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM speed_king_rank ORDER BY `index` desc limit 1 ", 0);
        this.__db.assertNotSuspendingTransaction();
        TdSpeedKingBean tdSpeedKingBean = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nickName");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "icon");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startDay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "continueDays");
            if (cursorQuery.moveToFirst()) {
                tdSpeedKingBean = new TdSpeedKingBean();
                tdSpeedKingBean.setIndex(cursorQuery.getInt(columnIndexOrThrow));
                tdSpeedKingBean.setUserId(cursorQuery.getString(columnIndexOrThrow2));
                tdSpeedKingBean.setNickName(cursorQuery.getString(columnIndexOrThrow3));
                tdSpeedKingBean.setValue(cursorQuery.getLong(columnIndexOrThrow4));
                tdSpeedKingBean.setIcon(cursorQuery.getString(columnIndexOrThrow5));
                tdSpeedKingBean.setStartDay(cursorQuery.getLong(columnIndexOrThrow6));
                tdSpeedKingBean.setContinueDays(cursorQuery.getLong(columnIndexOrThrow7));
            }
            return tdSpeedKingBean;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
