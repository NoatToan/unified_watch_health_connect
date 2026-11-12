package com.huami.health.afppg.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.health.afppg.data.local.bean.AFibData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class AFibDao_Impl implements AFibDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<AFibData> b;
    private final EntityDeletionOrUpdateAdapter<AFibData> c;
    private final EntityDeletionOrUpdateAdapter<AFibData> d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;

    public class a extends EntityInsertionAdapter<AFibData> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, AFibData aFibData) {
            if (aFibData.getType() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, aFibData.getType());
            }
            supportSQLiteStatement.bindLong(2, aFibData.getTimestamp());
            supportSQLiteStatement.bindLong(3, aFibData.getDeviceSource());
            supportSQLiteStatement.bindLong(4, aFibData.getValue());
            supportSQLiteStatement.bindLong(5, aFibData.getGroupTime());
            supportSQLiteStatement.bindLong(6, aFibData.getSynced());
            if (aFibData.getUserId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, aFibData.getUserId());
            }
            if (aFibData.getSn() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, aFibData.getSn());
            }
            if (aFibData.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, aFibData.getDeviceId());
            }
            if (aFibData.getAppName() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, aFibData.getAppName());
            }
            if (aFibData.getFwVer() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, aFibData.getFwVer());
            }
            if (aFibData.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, aFibData.getTimeZone());
            }
            if (aFibData.getDate() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, aFibData.getDate());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `afib` (`type`,`timestamp`,`deviceSource`,`value`,`groupTime`,`synced`,`userId`,`sn`,`deviceId`,`appName`,`fwVer`,`timeZone`,`date`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<AFibData> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, AFibData aFibData) {
            if (aFibData.getUserId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, aFibData.getUserId());
            }
            supportSQLiteStatement.bindLong(2, aFibData.getTimestamp());
            if (aFibData.getDate() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, aFibData.getDate());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `afib` WHERE `userId` = ? AND `timestamp` = ? AND `date` = ?";
        }
    }

    public class c extends EntityDeletionOrUpdateAdapter<AFibData> {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, AFibData aFibData) {
            if (aFibData.getType() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, aFibData.getType());
            }
            supportSQLiteStatement.bindLong(2, aFibData.getTimestamp());
            supportSQLiteStatement.bindLong(3, aFibData.getDeviceSource());
            supportSQLiteStatement.bindLong(4, aFibData.getValue());
            supportSQLiteStatement.bindLong(5, aFibData.getGroupTime());
            supportSQLiteStatement.bindLong(6, aFibData.getSynced());
            if (aFibData.getUserId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, aFibData.getUserId());
            }
            if (aFibData.getSn() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, aFibData.getSn());
            }
            if (aFibData.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, aFibData.getDeviceId());
            }
            if (aFibData.getAppName() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, aFibData.getAppName());
            }
            if (aFibData.getFwVer() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, aFibData.getFwVer());
            }
            if (aFibData.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, aFibData.getTimeZone());
            }
            if (aFibData.getDate() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, aFibData.getDate());
            }
            if (aFibData.getUserId() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, aFibData.getUserId());
            }
            supportSQLiteStatement.bindLong(15, aFibData.getTimestamp());
            if (aFibData.getDate() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, aFibData.getDate());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `afib` SET `type` = ?,`timestamp` = ?,`deviceSource` = ?,`value` = ?,`groupTime` = ?,`synced` = ?,`userId` = ?,`sn` = ?,`deviceId` = ?,`appName` = ?,`fwVer` = ?,`timeZone` = ?,`date` = ? WHERE `userId` = ? AND `timestamp` = ? AND `date` = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM afib WHERE userId = ?";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM afib WHERE userId = ? AND deviceSource = ?";
        }
    }

    public class f extends SharedSQLiteStatement {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM afib WHERE userId = ? AND timestamp <= ?";
        }
    }

    public class g implements Callable<List<AFibData>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<AFibData> call() throws Exception {
            AFibDao_Impl.this.a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(AFibDao_Impl.this.a, this.a, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "groupTime");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            AFibData aFibData = new AFibData();
                            aFibData.setType(cursorQuery.getString(columnIndexOrThrow));
                            aFibData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow2));
                            aFibData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                            aFibData.setValue(cursorQuery.getInt(columnIndexOrThrow4));
                            aFibData.setGroupTime(cursorQuery.getLong(columnIndexOrThrow5));
                            aFibData.setSynced(cursorQuery.getInt(columnIndexOrThrow6));
                            aFibData.setUserId(cursorQuery.getString(columnIndexOrThrow7));
                            aFibData.setSn(cursorQuery.getString(columnIndexOrThrow8));
                            aFibData.setDeviceId(cursorQuery.getString(columnIndexOrThrow9));
                            aFibData.setAppName(cursorQuery.getString(columnIndexOrThrow10));
                            aFibData.setFwVer(cursorQuery.getString(columnIndexOrThrow11));
                            aFibData.setTimeZone(cursorQuery.getString(columnIndexOrThrow12));
                            columnIndexOrThrow13 = columnIndexOrThrow13;
                            aFibData.setDate(cursorQuery.getString(columnIndexOrThrow13));
                            arrayList = arrayList;
                            arrayList.add(aFibData);
                        }
                        AFibDao_Impl.this.a.setTransactionSuccessful();
                        cursorQuery.close();
                        AFibDao_Impl.this.a.endTransaction();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        cursorQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                AFibDao_Impl.this.a.endTransaction();
                throw th3;
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public AFibDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.e = new d(roomDatabase);
        this.f = new e(roomDatabase);
        this.g = new f(roomDatabase);
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public void clear(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public void delete(AFibData aFibData) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handle(aFibData);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public void deleteByTimeStamp(String str, List<Long> list) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM afib WHERE userId = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND timestamp IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        if (str == null) {
            supportSQLiteStatementCompileStatement.bindNull(1);
        } else {
            supportSQLiteStatementCompileStatement.bindString(1, str);
        }
        int i = 2;
        for (Long l : list) {
            if (l == null) {
                supportSQLiteStatementCompileStatement.bindNull(i);
            } else {
                supportSQLiteStatementCompileStatement.bindLong(i, l.longValue());
            }
            i++;
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public List<AFibData> getAFibData(String str, String str2, String str3, int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM afib WHERE userId = ? AND date between ? and ? AND value = ? order by date desc", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        if (str3 == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, str3);
        }
        roomSQLiteQueryAcquire.bindLong(4, i);
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "groupTime");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            AFibData aFibData = new AFibData();
                            ArrayList arrayList2 = arrayList;
                            aFibData.setType(cursorQuery.getString(columnIndexOrThrow));
                            int i2 = columnIndexOrThrow12;
                            int i3 = columnIndexOrThrow13;
                            aFibData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow2));
                            aFibData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                            aFibData.setValue(cursorQuery.getInt(columnIndexOrThrow4));
                            aFibData.setGroupTime(cursorQuery.getLong(columnIndexOrThrow5));
                            aFibData.setSynced(cursorQuery.getInt(columnIndexOrThrow6));
                            aFibData.setUserId(cursorQuery.getString(columnIndexOrThrow7));
                            aFibData.setSn(cursorQuery.getString(columnIndexOrThrow8));
                            aFibData.setDeviceId(cursorQuery.getString(columnIndexOrThrow9));
                            aFibData.setAppName(cursorQuery.getString(columnIndexOrThrow10));
                            aFibData.setFwVer(cursorQuery.getString(columnIndexOrThrow11));
                            aFibData.setTimeZone(cursorQuery.getString(i2));
                            aFibData.setDate(cursorQuery.getString(i3));
                            arrayList2.add(aFibData);
                            columnIndexOrThrow12 = i2;
                            arrayList = arrayList2;
                            columnIndexOrThrow13 = i3;
                        }
                        ArrayList arrayList3 = arrayList;
                        this.a.setTransactionSuccessful();
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        this.a.endTransaction();
                        return arrayList3;
                    } catch (Throwable th) {
                        th = th;
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                roomSQLiteQuery = roomSQLiteQueryAcquire;
            }
        } catch (Throwable th4) {
            this.a.endTransaction();
            throw th4;
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public Flow<List<AFibData>> getAFibDataFlow(String str, String str2, String str3, int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM afib WHERE userId = ? AND date between ? and ? AND value = ? order by date desc", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        if (str3 == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, str3);
        }
        roomSQLiteQueryAcquire.bindLong(4, i);
        return CoroutinesRoom.createFlow(this.a, true, new String[]{"afib"}, new g(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public void insert(AFibData aFibData) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(aFibData);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public List<AFibData> queryDataByTimestamps(String str, long j, long j2) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM afib WHERE userId = ? AND timestamp BETWEEN ? AND ?", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        roomSQLiteQueryAcquire.bindLong(3, j2);
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "groupTime");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            AFibData aFibData = new AFibData();
                            ArrayList arrayList2 = arrayList;
                            aFibData.setType(cursorQuery.getString(columnIndexOrThrow));
                            int i = columnIndexOrThrow12;
                            int i2 = columnIndexOrThrow13;
                            aFibData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow2));
                            aFibData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                            aFibData.setValue(cursorQuery.getInt(columnIndexOrThrow4));
                            aFibData.setGroupTime(cursorQuery.getLong(columnIndexOrThrow5));
                            aFibData.setSynced(cursorQuery.getInt(columnIndexOrThrow6));
                            aFibData.setUserId(cursorQuery.getString(columnIndexOrThrow7));
                            aFibData.setSn(cursorQuery.getString(columnIndexOrThrow8));
                            aFibData.setDeviceId(cursorQuery.getString(columnIndexOrThrow9));
                            aFibData.setAppName(cursorQuery.getString(columnIndexOrThrow10));
                            aFibData.setFwVer(cursorQuery.getString(columnIndexOrThrow11));
                            aFibData.setTimeZone(cursorQuery.getString(i));
                            aFibData.setDate(cursorQuery.getString(i2));
                            arrayList2.add(aFibData);
                            columnIndexOrThrow12 = i;
                            arrayList = arrayList2;
                            columnIndexOrThrow13 = i2;
                        }
                        ArrayList arrayList3 = arrayList;
                        this.a.setTransactionSuccessful();
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        this.a.endTransaction();
                        return arrayList3;
                    } catch (Throwable th) {
                        th = th;
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                roomSQLiteQuery = roomSQLiteQueryAcquire;
            }
        } catch (Throwable th4) {
            this.a.endTransaction();
            throw th4;
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public List<AFibData> queryDataExists(String str, long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM afib WHERE userId = ? AND timestamp = ? ORDER BY timestamp DESC", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "groupTime");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            AFibData aFibData = new AFibData();
                            ArrayList arrayList2 = arrayList;
                            aFibData.setType(cursorQuery.getString(columnIndexOrThrow));
                            int i = columnIndexOrThrow12;
                            int i2 = columnIndexOrThrow13;
                            aFibData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow2));
                            aFibData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                            aFibData.setValue(cursorQuery.getInt(columnIndexOrThrow4));
                            aFibData.setGroupTime(cursorQuery.getLong(columnIndexOrThrow5));
                            aFibData.setSynced(cursorQuery.getInt(columnIndexOrThrow6));
                            aFibData.setUserId(cursorQuery.getString(columnIndexOrThrow7));
                            aFibData.setSn(cursorQuery.getString(columnIndexOrThrow8));
                            aFibData.setDeviceId(cursorQuery.getString(columnIndexOrThrow9));
                            aFibData.setAppName(cursorQuery.getString(columnIndexOrThrow10));
                            aFibData.setFwVer(cursorQuery.getString(columnIndexOrThrow11));
                            aFibData.setTimeZone(cursorQuery.getString(i));
                            aFibData.setDate(cursorQuery.getString(i2));
                            arrayList2.add(aFibData);
                            columnIndexOrThrow12 = i;
                            arrayList = arrayList2;
                            columnIndexOrThrow13 = i2;
                        }
                        ArrayList arrayList3 = arrayList;
                        this.a.setTransactionSuccessful();
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        this.a.endTransaction();
                        return arrayList3;
                    } catch (Throwable th) {
                        th = th;
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                roomSQLiteQuery = roomSQLiteQueryAcquire;
            }
        } catch (Throwable th4) {
            this.a.endTransaction();
            throw th4;
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public List<AFibData> queryUnsyncedData(String str, long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM afib WHERE userId = ? AND timestamp >= ? AND synced = 0 ORDER BY timestamp DESC", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "groupTime");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            AFibData aFibData = new AFibData();
                            ArrayList arrayList2 = arrayList;
                            aFibData.setType(cursorQuery.getString(columnIndexOrThrow));
                            int i = columnIndexOrThrow12;
                            int i2 = columnIndexOrThrow13;
                            aFibData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow2));
                            aFibData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                            aFibData.setValue(cursorQuery.getInt(columnIndexOrThrow4));
                            aFibData.setGroupTime(cursorQuery.getLong(columnIndexOrThrow5));
                            aFibData.setSynced(cursorQuery.getInt(columnIndexOrThrow6));
                            aFibData.setUserId(cursorQuery.getString(columnIndexOrThrow7));
                            aFibData.setSn(cursorQuery.getString(columnIndexOrThrow8));
                            aFibData.setDeviceId(cursorQuery.getString(columnIndexOrThrow9));
                            aFibData.setAppName(cursorQuery.getString(columnIndexOrThrow10));
                            aFibData.setFwVer(cursorQuery.getString(columnIndexOrThrow11));
                            aFibData.setTimeZone(cursorQuery.getString(i));
                            aFibData.setDate(cursorQuery.getString(i2));
                            arrayList2.add(aFibData);
                            columnIndexOrThrow12 = i;
                            arrayList = arrayList2;
                            columnIndexOrThrow13 = i2;
                        }
                        ArrayList arrayList3 = arrayList;
                        this.a.setTransactionSuccessful();
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        this.a.endTransaction();
                        return arrayList3;
                    } catch (Throwable th) {
                        th = th;
                        cursorQuery.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                roomSQLiteQuery = roomSQLiteQueryAcquire;
            }
        } catch (Throwable th4) {
            this.a.endTransaction();
            throw th4;
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public void updateSyncedState(AFibData aFibData) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.handle(aFibData);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public void delete(String str, long j) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        supportSQLiteStatementAcquire.bindLong(2, j);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.AFibDao
    public void clear(String str, int i) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        supportSQLiteStatementAcquire.bindLong(2, i);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }
}
