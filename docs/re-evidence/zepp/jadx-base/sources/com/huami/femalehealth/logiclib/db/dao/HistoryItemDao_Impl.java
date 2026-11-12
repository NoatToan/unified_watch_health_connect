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
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class HistoryItemDao_Impl implements HistoryItemDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<HistoryItemBean> b;
    private final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<HistoryItemBean> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, HistoryItemBean value) {
            if (value.getId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getId());
            }
            stmt.bindLong(2, value.getCycle());
            stmt.bindLong(3, value.getMenstrualPeriod());
            if (value.getMenstrualEndTime() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindLong(4, value.getMenstrualEndTime().longValue());
            }
            stmt.bindLong(5, value.getMonth());
            if (value.getUserId() == null) {
                stmt.bindNull(6);
            } else {
                stmt.bindString(6, value.getUserId());
            }
            if (value.getUpdateTime() == null) {
                stmt.bindNull(7);
            } else {
                stmt.bindLong(7, value.getUpdateTime().longValue());
            }
            stmt.bindLong(8, value.getEnd());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `HistoryItemBean` (`id`,`cycle`,`menstrualPeriod`,`menstrualEndTime`,`month`,`userId`,`updateTime`,`end`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE  FROM  HistoryItemBean";
        }
    }

    public HistoryItemDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryItemDao
    public void addAll(final List<HistoryItemBean> list) {
        this.a.beginTransaction();
        try {
            HistoryItemDao.DefaultImpls.addAll(this, list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryItemDao
    public void addAllInternal(final List<HistoryItemBean> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryItemDao
    public void clear() {
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

    @Override // com.huami.femalehealth.logiclib.db.dao.HistoryItemDao
    public List<HistoryItemBean> findAll() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM HistoryItemBean ORDER BY menstrualPeriod DESC", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cycle");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "menstrualPeriod");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "menstrualEndTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "month");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new HistoryItemBean(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow4)), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow7)), cursorQuery.getInt(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
