package com.huami.treadmill.data.source.db;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.treadmill.data.DateConverters;
import com.huami.treadmill.data.TdRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes15.dex */
public final class TdRecordDao_Impl implements TdRecordDao {
    private final DateConverters __dateConverters = new DateConverters();
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<TdRecord> __deletionAdapterOfTdRecord;
    private final EntityInsertionAdapter<TdRecord> __insertionAdapterOfTdRecord;

    public TdRecordDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTdRecord = new EntityInsertionAdapter<TdRecord>(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdRecordDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `td_record` (`runDis`,`date`,`useTime`,`id`) VALUES (?,?,?,nullif(?, 0))";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TdRecord tdRecord) {
                supportSQLiteStatement.bindDouble(1, tdRecord.getRunDis());
                Long lDateToTimestamp = TdRecordDao_Impl.this.__dateConverters.dateToTimestamp(tdRecord.getDate());
                if (lDateToTimestamp == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindLong(2, lDateToTimestamp.longValue());
                }
                supportSQLiteStatement.bindLong(3, tdRecord.getUseTime());
                supportSQLiteStatement.bindLong(4, tdRecord.getId());
            }
        };
        this.__deletionAdapterOfTdRecord = new EntityDeletionOrUpdateAdapter<TdRecord>(roomDatabase) { // from class: com.huami.treadmill.data.source.db.TdRecordDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `td_record` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TdRecord tdRecord) {
                supportSQLiteStatement.bindLong(1, tdRecord.getId());
            }
        };
    }

    @Override // com.huami.treadmill.data.source.db.TdRecordDao
    public void delete(List<TdRecord> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfTdRecord.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdRecordDao
    public void insert(TdRecord tdRecord) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfTdRecord.insert(tdRecord);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.huami.treadmill.data.source.db.TdRecordDao
    public LiveData<List<TdRecord>> query() {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM td_record", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"td_record"}, false, new Callable<List<TdRecord>>() { // from class: com.huami.treadmill.data.source.db.TdRecordDao_Impl.3
            public void finalize() {
                roomSQLiteQueryAcquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<TdRecord> call() throws Exception {
                Cursor cursorQuery = DBUtil.query(TdRecordDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "runDis");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "useTime");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new TdRecord(cursorQuery.getFloat(columnIndexOrThrow), TdRecordDao_Impl.this.__dateConverters.fromTimestamp(cursorQuery.isNull(columnIndexOrThrow2) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow2))), cursorQuery.getLong(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }
        });
    }
}
