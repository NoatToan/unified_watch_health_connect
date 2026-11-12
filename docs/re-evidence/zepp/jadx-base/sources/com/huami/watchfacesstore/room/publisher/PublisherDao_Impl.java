package com.huami.watchfacesstore.room.publisher;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class PublisherDao_Impl implements PublisherDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<PublisherInfo> b;
    private final EntityDeletionOrUpdateAdapter<PublisherInfo> c;

    public class a extends EntityInsertionAdapter<PublisherInfo> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, PublisherInfo value) {
            stmt.bindLong(1, value.getId());
            if (value.getName() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getName());
            }
            if (value.getIcon() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getIcon());
            }
            if (value.getDescription() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, value.getDescription());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `PublisherInfo` (`id`,`name`,`icon`,`description`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<PublisherInfo> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, PublisherInfo value) {
            stmt.bindLong(1, value.getId());
            if (value.getName() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getName());
            }
            if (value.getIcon() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getIcon());
            }
            if (value.getDescription() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, value.getDescription());
            }
            stmt.bindLong(5, value.getId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `PublisherInfo` SET `id` = ?,`name` = ?,`icon` = ?,`description` = ? WHERE `id` = ?";
        }
    }

    public PublisherDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.watchfacesstore.room.publisher.PublisherDao
    public int deletePublisherInfoByIds(final int[] ids) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM PublisherInfo WHERE id IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, ids.length);
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        int i = 1;
        for (int i2 : ids) {
            supportSQLiteStatementCompileStatement.bindLong(i, i2);
            i++;
        }
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.watchfacesstore.room.publisher.PublisherDao
    public PublisherInfo getPublisherInfo(int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM PublisherInfo WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i);
        this.a.assertNotSuspendingTransaction();
        PublisherInfo publisherInfo = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "icon");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
            if (cursorQuery.moveToFirst()) {
                int i2 = cursorQuery.getInt(columnIndexOrThrow);
                String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                if (!cursorQuery.isNull(columnIndexOrThrow4)) {
                    string = cursorQuery.getString(columnIndexOrThrow4);
                }
                publisherInfo = new PublisherInfo(i2, string2, string3, string);
            }
            return publisherInfo;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.watchfacesstore.room.publisher.PublisherDao
    public void insertPublisher(final PublisherInfo... publisher) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(publisher);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.watchfacesstore.room.publisher.PublisherDao
    public int updatePublisherInfo(final PublisherInfo info) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.c.handle(info) + 0;
            this.a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.a.endTransaction();
        }
    }
}
