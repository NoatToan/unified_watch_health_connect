package com.huami.healthlabel.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.healthlabel.db.po.HealthLabel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthLabelDao_Impl implements HealthLabelDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<HealthLabel> b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<HealthLabel> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, HealthLabel value) {
            stmt.bindLong(1, value.getLabelId());
            stmt.bindLong(2, value.getTimestamp());
            if (value.getLabelText() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getLabelText());
            }
            if (value.getLabelColor() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, value.getLabelColor());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `health_table` (`labelId`,`timestamp`,`labelText`,`labelColor`) VALUES (?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from health_table where labelText==? and timestamp>=? and timestamp<?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from health_table where timestamp>=? and timestamp<?";
        }
    }

    public class d implements Callable<List<HealthLabel>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public d(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<HealthLabel> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(HealthLabelDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelText");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelColor");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new HealthLabel(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4)));
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public HealthLabelDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
        this.d = new c(__db);
    }

    @Override // com.huami.healthlabel.db.dao.HealthLabelDao
    public void deleteLabel(final String label, final long startTime, final long endTime) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        if (label == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, label);
        }
        supportSQLiteStatementAcquire.bindLong(2, startTime);
        supportSQLiteStatementAcquire.bindLong(3, endTime);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.healthlabel.db.dao.HealthLabelDao
    public void insertLabel(final HealthLabel healthLabel) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(healthLabel);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.healthlabel.db.dao.HealthLabelDao
    public LiveData<List<HealthLabel>> queryLabel(final int limit, final long start, final long end) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from health_table where timestamp>=? and timestamp<? order by timestamp asc limit?", 3);
        roomSQLiteQueryAcquire.bindLong(1, start);
        roomSQLiteQueryAcquire.bindLong(2, end);
        roomSQLiteQueryAcquire.bindLong(3, limit);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"health_table"}, false, new d(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.healthlabel.db.dao.HealthLabelDao
    public List<HealthLabel> queryLabelList(final int limit, final long start, final long end) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from health_table where timestamp>=? and timestamp<? order by timestamp desc limit?", 3);
        roomSQLiteQueryAcquire.bindLong(1, start);
        roomSQLiteQueryAcquire.bindLong(2, end);
        roomSQLiteQueryAcquire.bindLong(3, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelText");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelColor");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new HealthLabel(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4)));
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

    @Override // com.huami.healthlabel.db.dao.HealthLabelDao
    public List<HealthLabel> querySameLabels(final long start, final long end, final String labelText) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from health_table where timestamp>=? and timestamp<? and labelText==?", 3);
        roomSQLiteQueryAcquire.bindLong(1, start);
        roomSQLiteQueryAcquire.bindLong(2, end);
        if (labelText == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, labelText);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelText");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelColor");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new HealthLabel(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4)));
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

    @Override // com.huami.healthlabel.db.dao.HealthLabelDao
    public HealthLabel querySingleLabel(final long searchTime) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from health_table where timestamp==?", 1);
        roomSQLiteQueryAcquire.bindLong(1, searchTime);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new HealthLabel(cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelId")), cursorQuery.getLong(CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelText")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "labelColor"))) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.healthlabel.db.dao.HealthLabelDao
    public void insertLabel(final List<HealthLabel> healthLabel) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(healthLabel);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.healthlabel.db.dao.HealthLabelDao
    public void deleteLabel(final long startTime, final long endTime) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        supportSQLiteStatementAcquire.bindLong(1, startTime);
        supportSQLiteStatementAcquire.bindLong(2, endTime);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }
}
