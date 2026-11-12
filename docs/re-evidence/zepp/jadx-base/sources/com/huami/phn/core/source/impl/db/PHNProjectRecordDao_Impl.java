package com.huami.phn.core.source.impl.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.phn.core.model.PHNProjectRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class PHNProjectRecordDao_Impl implements PHNProjectRecordDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<PHNProjectRecord> b;
    private final PHNProjectSettingConverter c = new PHNProjectSettingConverter();
    private final JsonObjectConverter d = new JsonObjectConverter();
    private final SharedSQLiteStatement e;

    public class a extends EntityInsertionAdapter<PHNProjectRecord> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, PHNProjectRecord value) {
            stmt.bindLong(1, value.getTimestamp());
            if (value.getVersion() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getVersion());
            }
            String strObjectToJsonString = PHNProjectRecordDao_Impl.this.c.objectToJsonString(value.getSetting());
            if (strObjectToJsonString == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, strObjectToJsonString);
            }
            String strObjectToJsonString2 = PHNProjectRecordDao_Impl.this.d.objectToJsonString(value.getResult());
            if (strObjectToJsonString2 == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, strObjectToJsonString2);
            }
            stmt.bindLong(5, value.getSource());
            stmt.bindLong(6, value.getSynced());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `phn_project` (`timestamp`,`version`,`setting`,`result`,`source`,`synced`) VALUES (?,?,?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM phn_project";
        }
    }

    public class c implements Callable<List<PHNProjectRecord>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<PHNProjectRecord> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(PHNProjectRecordDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "setting");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new PHNProjectRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), PHNProjectRecordDao_Impl.this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow3)), PHNProjectRecordDao_Impl.this.d.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6)));
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

    public PHNProjectRecordDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.e = new b(__db);
    }

    @Override // com.huami.phn.core.source.impl.db.PHNProjectRecordDao
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

    @Override // com.huami.phn.core.source.impl.db.PHNProjectRecordDao
    public void insertOrUpdateRecords(final List<PHNProjectRecord> data) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(data);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.phn.core.source.impl.db.PHNProjectRecordDao
    public Flow<List<PHNProjectRecord>> queryLatestPHNProjectAsFlow() {
        return CoroutinesRoom.createFlow(this.a, false, new String[]{PHNProjectRecord.TABLE_NAME}, new c(RoomSQLiteQuery.acquire("SELECT * FROM phn_project ORDER BY timestamp DESC limit 1", 0)));
    }

    @Override // com.huami.phn.core.source.impl.db.PHNProjectRecordDao
    public PHNProjectRecord queryOldestPHNProject() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_project ORDER BY timestamp ASC limit 1", 0);
        this.a.assertNotSuspendingTransaction();
        PHNProjectRecord pHNProjectRecord = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "setting");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            if (cursorQuery.moveToFirst()) {
                pHNProjectRecord = new PHNProjectRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow3)), this.d.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6));
            }
            return pHNProjectRecord;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.phn.core.source.impl.db.PHNProjectRecordDao
    public PHNProjectRecord queryPHNProject(final long timestamp) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_project WHERE timestamp = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, timestamp);
        this.a.assertNotSuspendingTransaction();
        PHNProjectRecord pHNProjectRecord = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "setting");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            if (cursorQuery.moveToFirst()) {
                pHNProjectRecord = new PHNProjectRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow3)), this.d.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6));
            }
            return pHNProjectRecord;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.phn.core.source.impl.db.PHNProjectRecordDao
    public List<PHNProjectRecord> queryUnSyncedPHNProject(final int limit, final long timestamp) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_project WHERE timestamp >= ? AND synced = 0 ORDER BY timestamp DESC limit ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, timestamp);
        roomSQLiteQueryAcquire.bindLong(2, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "setting");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNProjectRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow3)), this.d.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6)));
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

    @Override // com.huami.phn.core.source.impl.db.PHNProjectRecordDao
    public List<PHNProjectRecord> queryPHNProject(final int limit, final long timestamp) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM phn_project WHERE timestamp >= ? ORDER BY timestamp DESC limit ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, timestamp);
        roomSQLiteQueryAcquire.bindLong(2, limit);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "setting");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PHNProjectRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), this.c.jsonString2Object(cursorQuery.getString(columnIndexOrThrow3)), this.d.jsonString2Object(cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6)));
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
