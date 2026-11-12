package com.huami.femalehealth.logiclib.db.dao;

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
import com.huami.femalehealth.logiclib.db.DateConverter;
import com.huami.femalehealth.logiclib.db.po.MenstruationHistory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class HistoryDao_Impl implements HistoryDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<MenstruationHistory> b;
    private final DateConverter c = new DateConverter();
    private final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<MenstruationHistory> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, MenstruationHistory menstruationHistory) {
            if (menstruationHistory.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, menstruationHistory.getId());
            }
            supportSQLiteStatement.bindLong(2, menstruationHistory.getCycle());
            supportSQLiteStatement.bindLong(3, HistoryDao_Impl.this.c.dateToInt(menstruationHistory.getMenstrualPeriod()));
            supportSQLiteStatement.bindLong(4, HistoryDao_Impl.this.c.dateToInt(menstruationHistory.getMenstrualEndTime()));
            supportSQLiteStatement.bindLong(5, HistoryDao_Impl.this.c.dateToInt(menstruationHistory.getMonth()));
            if (menstruationHistory.getUserId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, menstruationHistory.getUserId());
            }
            supportSQLiteStatement.bindLong(7, menstruationHistory.isEnd() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `MenstruationHistory` (`id`,`cycle`,`menstrualPeriod`,`menstrualEndTime`,`month`,`userId`,`isEnd`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete From MenstruationHistory";
        }
    }

    public class c extends DataSource.Factory<Integer, MenstruationHistory> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<MenstruationHistory> {
            public a(RoomDatabase db, RoomSQLiteQuery query, boolean inTransaction, String... tables) {
                super(db, query, inTransaction, tables);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<MenstruationHistory> convertRows(Cursor cursor) {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "cycle");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "menstrualPeriod");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "menstrualEndTime");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "month");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "isEnd");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i = columnIndexOrThrow;
                    arrayList.add(new MenstruationHistory(cursor.getString(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow3)), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow4)), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow5)), cursor.getString(columnIndexOrThrow6), cursor.getInt(columnIndexOrThrow7) != 0));
                    columnIndexOrThrow = i;
                }
                return arrayList;
            }
        }

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, MenstruationHistory> create() {
            return new a(HistoryDao_Impl.this.a, this.a, false, "MenstruationHistory");
        }
    }

    public class d extends DataSource.Factory<Integer, MenstruationHistory> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<MenstruationHistory> {
            public a(RoomDatabase db, RoomSQLiteQuery query, boolean inTransaction, String... tables) {
                super(db, query, inTransaction, tables);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<MenstruationHistory> convertRows(Cursor cursor) {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "cycle");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "menstrualPeriod");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "menstrualEndTime");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "month");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "isEnd");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i = columnIndexOrThrow;
                    arrayList.add(new MenstruationHistory(cursor.getString(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow3)), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow4)), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow5)), cursor.getString(columnIndexOrThrow6), cursor.getInt(columnIndexOrThrow7) != 0));
                    columnIndexOrThrow = i;
                }
                return arrayList;
            }
        }

        public d(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, MenstruationHistory> create() {
            return new a(HistoryDao_Impl.this.a, this.a, false, "MenstruationHistory");
        }
    }

    public class e extends DataSource.Factory<Integer, MenstruationHistory> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<MenstruationHistory> {
            public a(RoomDatabase db, RoomSQLiteQuery query, boolean inTransaction, String... tables) {
                super(db, query, inTransaction, tables);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<MenstruationHistory> convertRows(Cursor cursor) {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "cycle");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "menstrualPeriod");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "menstrualEndTime");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "month");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "isEnd");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i = columnIndexOrThrow;
                    arrayList.add(new MenstruationHistory(cursor.getString(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow3)), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow4)), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow5)), cursor.getString(columnIndexOrThrow6), cursor.getInt(columnIndexOrThrow7) != 0));
                    columnIndexOrThrow = i;
                }
                return arrayList;
            }
        }

        public e(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, MenstruationHistory> create() {
            return new a(HistoryDao_Impl.this.a, this.a, false, "MenstruationHistory");
        }
    }

    public class f extends DataSource.Factory<Integer, MenstruationHistory> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<MenstruationHistory> {
            public a(RoomDatabase db, RoomSQLiteQuery query, boolean inTransaction, String... tables) {
                super(db, query, inTransaction, tables);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<MenstruationHistory> convertRows(Cursor cursor) {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "cycle");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "menstrualPeriod");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "menstrualEndTime");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "month");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "isEnd");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i = columnIndexOrThrow;
                    arrayList.add(new MenstruationHistory(cursor.getString(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow3)), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow4)), HistoryDao_Impl.this.c.intToDate(cursor.getLong(columnIndexOrThrow5)), cursor.getString(columnIndexOrThrow6), cursor.getInt(columnIndexOrThrow7) != 0));
                    columnIndexOrThrow = i;
                }
                return arrayList;
            }
        }

        public f(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, MenstruationHistory> create() {
            return new a(HistoryDao_Impl.this.a, this.a, false, "MenstruationHistory");
        }
    }

    public HistoryDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.d = new b(__db);
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public void deleteAll() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public DataSource.Factory<Integer, MenstruationHistory> findAll() {
        return new c(RoomSQLiteQuery.acquire("SELECT * FROM MenstruationHistory ORDER BY menstrualPeriod DESC", 0));
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public List<MenstruationHistory> findAllEntity() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM MenstruationHistory", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cycle");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "menstrualPeriod");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "menstrualEndTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "month");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isEnd");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new MenstruationHistory(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), this.c.intToDate(cursorQuery.getLong(columnIndexOrThrow3)), this.c.intToDate(cursorQuery.getLong(columnIndexOrThrow4)), this.c.intToDate(cursorQuery.getLong(columnIndexOrThrow5)), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7) != 0));
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

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public DataSource.Factory<Integer, MenstruationHistory> findByMonth(final int year, final int month, final long offsetDateTime) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM MenstruationHistory WHERE CAST(strftime('%Y',datetime((menstrualPeriod + ?)/1000, 'unixepoch')) AS int) = ? And CAST(strftime('%m',datetime((menstrualPeriod + ?)/1000, 'unixepoch')) AS int) = ?", 4);
        roomSQLiteQueryAcquire.bindLong(1, offsetDateTime);
        roomSQLiteQueryAcquire.bindLong(2, year);
        roomSQLiteQueryAcquire.bindLong(3, offsetDateTime);
        roomSQLiteQueryAcquire.bindLong(4, month);
        return new e(roomSQLiteQueryAcquire);
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public DataSource.Factory<Integer, MenstruationHistory> findEndingAll() {
        return new d(RoomSQLiteQuery.acquire("SELECT * FROM MenstruationHistory WHERE isEnd = 1 ORDER BY menstrualPeriod DESC", 0));
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public DataSource.Factory<Integer, MenstruationHistory> findEndingByMonth(final int year, final int month, final long offsetDateTime) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM MenstruationHistory WHERE CAST(strftime('%Y',datetime((menstrualPeriod + ?)/1000, 'unixepoch')) AS int) = ? And CAST(strftime('%m',datetime((menstrualPeriod + ?)/1000, 'unixepoch')) AS int) = ? And isEnd = 1", 4);
        roomSQLiteQueryAcquire.bindLong(1, offsetDateTime);
        roomSQLiteQueryAcquire.bindLong(2, year);
        roomSQLiteQueryAcquire.bindLong(3, offsetDateTime);
        roomSQLiteQueryAcquire.bindLong(4, month);
        return new f(roomSQLiteQueryAcquire);
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public void insert(final MenstruationHistory history) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(history);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public void insertAll(final List<MenstruationHistory> history) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(history);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryDao
    public List<HistoryBean> testHistory2Date() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT CAST(strftime('%Y',datetime(menstrualPeriod/1000, 'unixepoch')) AS int) as year,CAST(strftime('%m',datetime(menstrualPeriod/1000, 'unixepoch')) AS int) as month , CAST(strftime('%d',datetime(menstrualPeriod/1000, 'unixepoch')) AS string) as day , CAST(strftime('%H %M %S %s',datetime(menstrualPeriod/1000, 'unixepoch')) AS string) as time FROM MenstruationHistory where id > 0", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "year");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "month");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new HistoryBean(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4)));
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
}
