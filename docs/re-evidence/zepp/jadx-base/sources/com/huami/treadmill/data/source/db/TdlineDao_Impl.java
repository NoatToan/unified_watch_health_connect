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
import com.huami.treadmill.data.TdLine;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class TdlineDao_Impl implements TdlineDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<TdLine> __insertionAdapterOfTdLine;
    private final SharedSQLiteStatement __preparedStmtOfDeleteLins;

    public TdlineDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTdLine = new EntityInsertionAdapter<TdLine>(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdlineDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `tdlines` (`index`,`runLineIcon`,`runLineDetailIcon`,`runLineTitle`,`runLineIntroduction`,`runLineArea`,`runLineDis`,`runLineMan`,`runLineId`,`runLineTime`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TdLine tdLine) {
                supportSQLiteStatement.bindLong(1, tdLine.getIndex());
                if (tdLine.getRunLineIcon() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, tdLine.getRunLineIcon());
                }
                if (tdLine.getRunLineDetailIcon() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, tdLine.getRunLineDetailIcon());
                }
                if (tdLine.getRunLineTitle() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, tdLine.getRunLineTitle());
                }
                if (tdLine.getRunLineIntroduction() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, tdLine.getRunLineIntroduction());
                }
                if (tdLine.getRunLineArea() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, tdLine.getRunLineArea());
                }
                supportSQLiteStatement.bindDouble(7, tdLine.getRunLineDis());
                supportSQLiteStatement.bindLong(8, tdLine.getRunLineMan());
                supportSQLiteStatement.bindLong(9, tdLine.getRunLineId());
                supportSQLiteStatement.bindLong(10, tdLine.getRunLineTime());
            }
        };
        this.__preparedStmtOfDeleteLins = new SharedSQLiteStatement(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdlineDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM tdlines ";
            }
        };
    }

    @Override // com.huami.treadmill.data.source.db.TdlineDao
    public void deleteLins() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteLins.acquire();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteLins.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdlineDao
    public void insert(List<TdLine> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfTdLine.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdlineDao
    public TdLine queryLastLine() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM tdlines ORDER BY `index` desc limit 1 ", 0);
        this.__db.assertNotSuspendingTransaction();
        TdLine tdLine = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineIcon");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineDetailIcon");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineTitle");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineIntroduction");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineArea");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineDis");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineMan");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineTime");
            if (cursorQuery.moveToFirst()) {
                tdLine = new TdLine();
                tdLine.setIndex(cursorQuery.getInt(columnIndexOrThrow));
                tdLine.setRunLineIcon(cursorQuery.getString(columnIndexOrThrow2));
                tdLine.setRunLineDetailIcon(cursorQuery.getString(columnIndexOrThrow3));
                tdLine.setRunLineTitle(cursorQuery.getString(columnIndexOrThrow4));
                tdLine.setRunLineIntroduction(cursorQuery.getString(columnIndexOrThrow5));
                tdLine.setRunLineArea(cursorQuery.getString(columnIndexOrThrow6));
                tdLine.setRunLineDis(cursorQuery.getFloat(columnIndexOrThrow7));
                tdLine.setRunLineMan(cursorQuery.getInt(columnIndexOrThrow8));
                tdLine.setRunLineId(cursorQuery.getLong(columnIndexOrThrow9));
                tdLine.setRunLineTime(cursorQuery.getLong(columnIndexOrThrow10));
            }
            return tdLine;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdlineDao
    public DataSource.Factory<Integer, TdLine> queryLines() {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM tdlines ORDER BY `index` asc ", 0);
        return new DataSource.Factory<Integer, TdLine>() { // from class: com.huami.treadmill.data.source.db.TdlineDao_Impl.3
            @Override // androidx.paging.DataSource.Factory
            public DataSource<Integer, TdLine> create() {
                return new LimitOffsetDataSource<TdLine>(TdlineDao_Impl.this.__db, roomSQLiteQueryAcquire, false, "tdlines") { // from class: com.huami.treadmill.data.source.db.TdlineDao_Impl.3.1
                    @Override // androidx.room.paging.LimitOffsetDataSource
                    public List<TdLine> convertRows(Cursor cursor) {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "index");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineIcon");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineDetailIcon");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineTitle");
                        int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineIntroduction");
                        int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineArea");
                        int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineDis");
                        int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineMan");
                        int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineId");
                        int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineTime");
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        while (cursor.moveToNext()) {
                            TdLine tdLine = new TdLine();
                            tdLine.setIndex(cursor.getInt(columnIndexOrThrow));
                            tdLine.setRunLineIcon(cursor.getString(columnIndexOrThrow2));
                            tdLine.setRunLineDetailIcon(cursor.getString(columnIndexOrThrow3));
                            tdLine.setRunLineTitle(cursor.getString(columnIndexOrThrow4));
                            tdLine.setRunLineIntroduction(cursor.getString(columnIndexOrThrow5));
                            tdLine.setRunLineArea(cursor.getString(columnIndexOrThrow6));
                            tdLine.setRunLineDis(cursor.getFloat(columnIndexOrThrow7));
                            tdLine.setRunLineMan(cursor.getInt(columnIndexOrThrow8));
                            tdLine.setRunLineId(cursor.getLong(columnIndexOrThrow9));
                            tdLine.setRunLineTime(cursor.getLong(columnIndexOrThrow10));
                            arrayList.add(tdLine);
                        }
                        return arrayList;
                    }
                };
            }
        };
    }
}
