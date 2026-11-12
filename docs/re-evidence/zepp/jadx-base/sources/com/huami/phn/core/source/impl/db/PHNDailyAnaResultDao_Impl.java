package com.huami.phn.core.source.impl.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class PHNDailyAnaResultDao_Impl implements PHNDailyAnaResultDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<PHNDailyAnalysisResult> b;
    private final DailyAnaResultInfoConverter c = new DailyAnaResultInfoConverter();
    private final EntityInsertionAdapter<PHNDailyAnalysisResult> d;
    private final SharedSQLiteStatement e;

    public class a extends EntityInsertionAdapter<PHNDailyAnalysisResult> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, PHNDailyAnalysisResult value) {
            stmt.bindLong(1, value.getTimestamp());
            stmt.bindLong(2, value.getTimezoneOffset());
            stmt.bindLong(3, value.getPhnPlanId());
            String strObjectToJsonString = PHNDailyAnaResultDao_Impl.this.c.objectToJsonString(value.getResult());
            if (strObjectToJsonString == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, strObjectToJsonString);
            }
            stmt.bindLong(5, value.getSynced());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `phn_daily_ana_result` (`timestamp`,`timezoneOffset`,`phnPlanId`,`result`,`synced`) VALUES (?,?,?,?,?)";
        }
    }

    public class b extends EntityInsertionAdapter<PHNDailyAnalysisResult> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, PHNDailyAnalysisResult value) {
            stmt.bindLong(1, value.getTimestamp());
            stmt.bindLong(2, value.getTimezoneOffset());
            stmt.bindLong(3, value.getPhnPlanId());
            String strObjectToJsonString = PHNDailyAnaResultDao_Impl.this.c.objectToJsonString(value.getResult());
            if (strObjectToJsonString == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, strObjectToJsonString);
            }
            stmt.bindLong(5, value.getSynced());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `phn_daily_ana_result` (`timestamp`,`timezoneOffset`,`phnPlanId`,`result`,`synced`) VALUES (?,?,?,?,?)";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM phn_daily_ana_result";
        }
    }

    public PHNDailyAnaResultDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.d = new b(__db);
        this.e = new c(__db);
    }

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public void clearAll() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public void insertIfNotExists(final List<PHNDailyAnalysisResult> data) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(data);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public void insertOrUpdateResults(final List<PHNDailyAnalysisResult> data) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.insert(data);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public List<PHNDailyAnalysisResult> queryAllPHNResult(final int limit) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_daily_ana_result  ORDER BY timestamp DESC limit ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezoneOffset");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phnPlanId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNDailyAnalysisResult(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5)));
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

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public List<PHNDailyAnalysisResult> queryAllPHNResultBeforeTimestamp(final int limit, final long timestamp) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_daily_ana_result WHERE timestamp <= ? ORDER BY timestamp DESC limit ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, timestamp);
        roomSQLiteQueryAcquire.bindLong(2, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezoneOffset");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phnPlanId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNDailyAnalysisResult(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5)));
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

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public List<PHNDailyAnalysisResult> queryAllUnSyncedPHNResult(final int limit, final long timestamp) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_daily_ana_result WHERE timestamp >= ? AND synced = 0 ORDER BY timestamp DESC limit ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, timestamp);
        roomSQLiteQueryAcquire.bindLong(2, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezoneOffset");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phnPlanId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNDailyAnalysisResult(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5)));
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

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public List<PHNDailyAnalysisResult> queryOldestPHNResult() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_daily_ana_result  ORDER BY timestamp ASC limit 1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezoneOffset");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phnPlanId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNDailyAnalysisResult(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5)));
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

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public List<PHNDailyAnalysisResult> queryOldestPHNResultByPlanId(final long projectId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_daily_ana_result WHERE phnPlanId = ? ORDER BY timestamp ASC limit 1", 1);
        roomSQLiteQueryAcquire.bindLong(1, projectId);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezoneOffset");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phnPlanId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNDailyAnalysisResult(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5)));
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

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public List<PHNDailyAnalysisResult> queryPHNResultByPlanId(final int limit, final long projectId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_daily_ana_result WHERE phnPlanId = ?  ORDER BY timestamp DESC limit ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, projectId);
        roomSQLiteQueryAcquire.bindLong(2, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezoneOffset");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phnPlanId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNDailyAnalysisResult(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5)));
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

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public List<PHNDailyAnalysisResult> queryPHNResultByPlanIdAndBeforeTimeStamp(final int limit, final long timestamp, final long projectId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_daily_ana_result WHERE timestamp <= ? AND phnPlanId = ?  ORDER BY timestamp DESC limit ?", 3);
        roomSQLiteQueryAcquire.bindLong(1, timestamp);
        roomSQLiteQueryAcquire.bindLong(2, projectId);
        roomSQLiteQueryAcquire.bindLong(3, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezoneOffset");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phnPlanId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNDailyAnalysisResult(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5)));
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

    @Override // com.huami.phn.core.source.impl.db.PHNDailyAnaResultDao
    public List<PHNDailyAnalysisResult> queryUnSyncedPHNResultByPlanId(final int limit, final long timestamp, final long projectId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_daily_ana_result WHERE timestamp >= ? AND phnPlanId = ? AND synced = 0 ORDER BY timestamp DESC limit ?", 3);
        roomSQLiteQueryAcquire.bindLong(1, timestamp);
        roomSQLiteQueryAcquire.bindLong(2, projectId);
        roomSQLiteQueryAcquire.bindLong(3, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezoneOffset");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phnPlanId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNDailyAnalysisResult(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5)));
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
