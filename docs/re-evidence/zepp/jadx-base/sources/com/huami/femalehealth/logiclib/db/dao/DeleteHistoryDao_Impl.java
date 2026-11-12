package com.huami.femalehealth.logiclib.db.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.femalehealth.logiclib.db.po.DeletedMenstruationSection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DeleteHistoryDao_Impl implements DeleteHistoryDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<DeletedMenstruationSection> b;
    private final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<DeletedMenstruationSection> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, DeletedMenstruationSection value) {
            if (value.getServerId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getServerId());
            }
            stmt.bindLong(2, value.getStartTime());
            stmt.bindLong(3, value.getEndTime());
            if (value.getUpdateTime() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindLong(4, value.getUpdateTime().longValue());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `DeletedMenstruationSection` (`serverId`,`startTime`,`endTime`,`updateTime`) VALUES (?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE  FROM  DeletedMenstruationSection";
        }
    }

    public DeleteHistoryDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.DeleteHistoryDao
    public void clearAll() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.DeleteHistoryDao
    public List<DeletedMenstruationSection> findAll() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM DeletedMenstruationSection", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "serverId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new DeletedMenstruationSection(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow4))));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.DeleteHistoryDao
    public void insert(final DeletedMenstruationSection delRecords) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(delRecords);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
