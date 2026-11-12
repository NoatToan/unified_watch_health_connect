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
import com.huami.treadmill.data.TdkingBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class TdKingDiligentDao_Impl implements TdKingDiligentDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<TdkingBean> __insertionAdapterOfTdkingBean;
    private final SharedSQLiteStatement __preparedStmtOfDeleteKings;

    public TdKingDiligentDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTdkingBean = new EntityInsertionAdapter<TdkingBean>(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdKingDiligentDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `king_rank` (`index`,`userId`,`nickName`,`value`,`icon`,`startDay`,`continueDays`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TdkingBean tdkingBean) {
                supportSQLiteStatement.bindLong(1, tdkingBean.getIndex());
                if (tdkingBean.getUserId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, tdkingBean.getUserId());
                }
                if (tdkingBean.getNickName() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, tdkingBean.getNickName());
                }
                supportSQLiteStatement.bindLong(4, tdkingBean.getValue());
                if (tdkingBean.getIcon() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, tdkingBean.getIcon());
                }
                supportSQLiteStatement.bindLong(6, tdkingBean.getStartDay());
                supportSQLiteStatement.bindLong(7, tdkingBean.getContinueDays());
            }
        };
        this.__preparedStmtOfDeleteKings = new SharedSQLiteStatement(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdKingDiligentDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM king_rank ";
            }
        };
    }

    @Override // com.huami.treadmill.data.source.db.TdKingDiligentDao
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

    @Override // com.huami.treadmill.data.source.db.TdKingDiligentDao
    public void insert(List<TdkingBean> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfTdkingBean.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdKingDiligentDao
    public DataSource.Factory<Integer, TdkingBean> queryKings() {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM king_rank ORDER BY `index` asc ", 0);
        return new DataSource.Factory<Integer, TdkingBean>() { // from class: com.huami.treadmill.data.source.db.TdKingDiligentDao_Impl.3
            @Override // androidx.paging.DataSource.Factory
            public DataSource<Integer, TdkingBean> create() {
                return new LimitOffsetDataSource<TdkingBean>(TdKingDiligentDao_Impl.this.__db, roomSQLiteQueryAcquire, false, "king_rank") { // from class: com.huami.treadmill.data.source.db.TdKingDiligentDao_Impl.3.1
                    @Override // androidx.room.paging.LimitOffsetDataSource
                    public List<TdkingBean> convertRows(Cursor cursor) {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "index");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "nickName");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "value");
                        int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "icon");
                        int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "startDay");
                        int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "continueDays");
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        while (cursor.moveToNext()) {
                            TdkingBean tdkingBean = new TdkingBean();
                            tdkingBean.setIndex(cursor.getInt(columnIndexOrThrow));
                            tdkingBean.setUserId(cursor.getString(columnIndexOrThrow2));
                            tdkingBean.setNickName(cursor.getString(columnIndexOrThrow3));
                            tdkingBean.setValue(cursor.getLong(columnIndexOrThrow4));
                            tdkingBean.setIcon(cursor.getString(columnIndexOrThrow5));
                            tdkingBean.setStartDay(cursor.getLong(columnIndexOrThrow6));
                            tdkingBean.setContinueDays(cursor.getLong(columnIndexOrThrow7));
                            arrayList.add(tdkingBean);
                        }
                        return arrayList;
                    }
                };
            }
        };
    }

    @Override // com.huami.treadmill.data.source.db.TdKingDiligentDao
    public TdkingBean queryLastKing() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM king_rank ORDER BY `index` desc limit 1 ", 0);
        this.__db.assertNotSuspendingTransaction();
        TdkingBean tdkingBean = null;
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
                tdkingBean = new TdkingBean();
                tdkingBean.setIndex(cursorQuery.getInt(columnIndexOrThrow));
                tdkingBean.setUserId(cursorQuery.getString(columnIndexOrThrow2));
                tdkingBean.setNickName(cursorQuery.getString(columnIndexOrThrow3));
                tdkingBean.setValue(cursorQuery.getLong(columnIndexOrThrow4));
                tdkingBean.setIcon(cursorQuery.getString(columnIndexOrThrow5));
                tdkingBean.setStartDay(cursorQuery.getLong(columnIndexOrThrow6));
                tdkingBean.setContinueDays(cursorQuery.getLong(columnIndexOrThrow7));
            }
            return tdkingBean;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
