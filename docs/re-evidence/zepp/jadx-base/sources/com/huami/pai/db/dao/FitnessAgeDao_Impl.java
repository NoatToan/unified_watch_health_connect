package com.huami.pai.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.pai.db.DayDateConverter;
import com.huami.pai.db.po.FitnessAge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class FitnessAgeDao_Impl implements FitnessAgeDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<FitnessAge> b;
    private final DayDateConverter c = new DayDateConverter();
    private final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<FitnessAge> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, FitnessAge value) {
            String strFromTimestamp = FitnessAgeDao_Impl.this.c.fromTimestamp(value.getDate());
            if (strFromTimestamp == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, strFromTimestamp);
            }
            stmt.bindDouble(2, value.getAge());
            stmt.bindDouble(3, value.getVo2max());
            if (value.getSource() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, value.getSource());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `FitnessAge` (`date`,`age`,`vo2max`,`source`) VALUES (?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM FitnessAge";
        }
    }

    public class c implements Callable<List<FitnessAge>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<FitnessAge> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(FitnessAgeDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "vo2max");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new FitnessAge(FitnessAgeDao_Impl.this.c.dateToTimestamp(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow)), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)));
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

    public FitnessAgeDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.d = new b(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.pai.db.dao.FitnessAgeDao
    public void deleteAllAges() {
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

    @Override // com.huami.pai.db.dao.FitnessAgeDao
    public void insertAges(final List<FitnessAge> ages) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(ages);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.pai.db.dao.FitnessAgeDao
    public LiveData<List<FitnessAge>> queryAges(final Date startDate, final Date endDate) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM FitnessAge WHERE date >= ? AND date <= ? ORDER BY date", 2);
        String strFromTimestamp = this.c.fromTimestamp(startDate);
        if (strFromTimestamp == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, strFromTimestamp);
        }
        String strFromTimestamp2 = this.c.fromTimestamp(endDate);
        if (strFromTimestamp2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, strFromTimestamp2);
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{"FitnessAge"}, false, new c(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.pai.db.dao.FitnessAgeDao
    public List<FitnessAge> queryAllAges() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM FitnessAge", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "vo2max");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new FitnessAge(this.c.dateToTimestamp(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow)), cursorQuery.getFloat(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
