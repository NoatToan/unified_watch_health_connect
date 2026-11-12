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
import com.huami.treadmill.data.TdPromotionLine;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class TdPromotionLineDao_Impl implements TdPromotionLineDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<TdPromotionLine> __insertionAdapterOfTdPromotionLine;
    private final SharedSQLiteStatement __preparedStmtOfDeleteLins;

    public TdPromotionLineDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTdPromotionLine = new EntityInsertionAdapter<TdPromotionLine>(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdPromotionLineDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `tdpromotionlines` (`index`,`runLineIcon`,`runLineDetailIcon`,`runLineTitle`,`runLineIntroduction`,`runLineArea`,`runLineRunDetail`,`runLineDis`,`runLineMan`,`runLineId`,`runLineTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TdPromotionLine tdPromotionLine) {
                supportSQLiteStatement.bindLong(1, tdPromotionLine.getIndex());
                if (tdPromotionLine.getRunLineIcon() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, tdPromotionLine.getRunLineIcon());
                }
                if (tdPromotionLine.getRunLineDetailIcon() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, tdPromotionLine.getRunLineDetailIcon());
                }
                if (tdPromotionLine.getRunLineTitle() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, tdPromotionLine.getRunLineTitle());
                }
                if (tdPromotionLine.getRunLineIntroduction() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, tdPromotionLine.getRunLineIntroduction());
                }
                if (tdPromotionLine.getRunLineArea() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, tdPromotionLine.getRunLineArea());
                }
                if (tdPromotionLine.getRunLineRunDetail() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, tdPromotionLine.getRunLineRunDetail());
                }
                supportSQLiteStatement.bindDouble(8, tdPromotionLine.getRunLineDis());
                supportSQLiteStatement.bindLong(9, tdPromotionLine.getRunLineMan());
                supportSQLiteStatement.bindLong(10, tdPromotionLine.getRunLineId());
                supportSQLiteStatement.bindLong(11, tdPromotionLine.getRunLineTime());
            }
        };
        this.__preparedStmtOfDeleteLins = new SharedSQLiteStatement(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdPromotionLineDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM tdpromotionlines ";
            }
        };
    }

    @Override // com.huami.treadmill.data.source.db.TdPromotionLineDao
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

    @Override // com.huami.treadmill.data.source.db.TdPromotionLineDao
    public void insert(List<TdPromotionLine> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfTdPromotionLine.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdPromotionLineDao
    public TdPromotionLine queryLastLine() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM tdpromotionlines ORDER BY `index` desc limit 1 ", 0);
        this.__db.assertNotSuspendingTransaction();
        TdPromotionLine tdPromotionLine = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "index");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineIcon");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineDetailIcon");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineTitle");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineIntroduction");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineArea");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineRunDetail");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineDis");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineMan");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineId");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runLineTime");
            if (cursorQuery.moveToFirst()) {
                tdPromotionLine = new TdPromotionLine();
                tdPromotionLine.setIndex(cursorQuery.getInt(columnIndexOrThrow));
                tdPromotionLine.setRunLineIcon(cursorQuery.getString(columnIndexOrThrow2));
                tdPromotionLine.setRunLineDetailIcon(cursorQuery.getString(columnIndexOrThrow3));
                tdPromotionLine.setRunLineTitle(cursorQuery.getString(columnIndexOrThrow4));
                tdPromotionLine.setRunLineIntroduction(cursorQuery.getString(columnIndexOrThrow5));
                tdPromotionLine.setRunLineArea(cursorQuery.getString(columnIndexOrThrow6));
                tdPromotionLine.setRunLineRunDetail(cursorQuery.getString(columnIndexOrThrow7));
                tdPromotionLine.setRunLineDis(cursorQuery.getFloat(columnIndexOrThrow8));
                tdPromotionLine.setRunLineMan(cursorQuery.getInt(columnIndexOrThrow9));
                tdPromotionLine.setRunLineId(cursorQuery.getLong(columnIndexOrThrow10));
                tdPromotionLine.setRunLineTime(cursorQuery.getLong(columnIndexOrThrow11));
            }
            return tdPromotionLine;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdPromotionLineDao
    public DataSource.Factory<Integer, TdPromotionLine> queryLines() {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM tdpromotionlines ORDER BY `index` asc ", 0);
        return new DataSource.Factory<Integer, TdPromotionLine>() { // from class: com.huami.treadmill.data.source.db.TdPromotionLineDao_Impl.3
            @Override // androidx.paging.DataSource.Factory
            public DataSource<Integer, TdPromotionLine> create() {
                return new LimitOffsetDataSource<TdPromotionLine>(TdPromotionLineDao_Impl.this.__db, roomSQLiteQueryAcquire, false, "tdpromotionlines") { // from class: com.huami.treadmill.data.source.db.TdPromotionLineDao_Impl.3.1
                    @Override // androidx.room.paging.LimitOffsetDataSource
                    public List<TdPromotionLine> convertRows(Cursor cursor) {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "index");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineIcon");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineDetailIcon");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineTitle");
                        int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineIntroduction");
                        int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineArea");
                        int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineRunDetail");
                        int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineDis");
                        int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineMan");
                        int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineId");
                        int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursor, "runLineTime");
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        while (cursor.moveToNext()) {
                            TdPromotionLine tdPromotionLine = new TdPromotionLine();
                            tdPromotionLine.setIndex(cursor.getInt(columnIndexOrThrow));
                            tdPromotionLine.setRunLineIcon(cursor.getString(columnIndexOrThrow2));
                            tdPromotionLine.setRunLineDetailIcon(cursor.getString(columnIndexOrThrow3));
                            tdPromotionLine.setRunLineTitle(cursor.getString(columnIndexOrThrow4));
                            tdPromotionLine.setRunLineIntroduction(cursor.getString(columnIndexOrThrow5));
                            tdPromotionLine.setRunLineArea(cursor.getString(columnIndexOrThrow6));
                            tdPromotionLine.setRunLineRunDetail(cursor.getString(columnIndexOrThrow7));
                            tdPromotionLine.setRunLineDis(cursor.getFloat(columnIndexOrThrow8));
                            tdPromotionLine.setRunLineMan(cursor.getInt(columnIndexOrThrow9));
                            tdPromotionLine.setRunLineId(cursor.getLong(columnIndexOrThrow10));
                            tdPromotionLine.setRunLineTime(cursor.getLong(columnIndexOrThrow11));
                            arrayList.add(tdPromotionLine);
                        }
                        return arrayList;
                    }
                };
            }
        };
    }
}
