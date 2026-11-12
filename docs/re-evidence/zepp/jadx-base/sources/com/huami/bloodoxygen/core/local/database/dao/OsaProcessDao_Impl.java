package com.huami.bloodoxygen.core.local.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.bloodoxygen.core.local.database.entity.IntArrayConverter;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class OsaProcessDao_Impl implements OsaProcessDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<OsaProcess> b;
    private final EntityDeletionOrUpdateAdapter<OsaProcess> c;
    private final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<OsaProcess> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, OsaProcess osaProcess) {
            if (osaProcess.getUserId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, osaProcess.getUserId());
            }
            supportSQLiteStatement.bindLong(2, osaProcess.getUtcTimestamp());
            supportSQLiteStatement.bindLong(3, osaProcess.getSpo2());
            supportSQLiteStatement.bindLong(4, osaProcess.getDuration());
            if (osaProcess.getTimeZoneId() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, osaProcess.getTimeZoneId());
            }
            supportSQLiteStatement.bindLong(6, osaProcess.getDeviceSource());
            if (osaProcess.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, osaProcess.getDeviceId());
            }
            if (osaProcess.getSn() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, osaProcess.getSn());
            }
            IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
            String stringFromIntArray = IntArrayConverter.getStringFromIntArray(osaProcess.getSpo2High());
            if (stringFromIntArray == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, stringFromIntArray);
            }
            String stringFromIntArray2 = IntArrayConverter.getStringFromIntArray(osaProcess.getSpo2Low());
            if (stringFromIntArray2 == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, stringFromIntArray2);
            }
            String stringFromIntArray3 = IntArrayConverter.getStringFromIntArray(osaProcess.getSignalQuality());
            if (stringFromIntArray3 == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, stringFromIntArray3);
            }
            String stringFromIntArray4 = IntArrayConverter.getStringFromIntArray(osaProcess.getExtended());
            if (stringFromIntArray4 == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, stringFromIntArray4);
            }
            if (osaProcess.getVersion() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, osaProcess.getVersion());
            }
            if (osaProcess.getDate() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, osaProcess.getDate());
            }
            supportSQLiteStatement.bindLong(15, osaProcess.getUploaded() ? 1L : 0L);
            if (osaProcess.getSleepDate() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, osaProcess.getSleepDate());
            }
            supportSQLiteStatement.bindLong(17, osaProcess.getToDelete() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `osa_process` (`userId`,`utcTimestamp`,`spo2`,`duration`,`timeZoneId`,`deviceSource`,`deviceId`,`sn`,`spo2High`,`spo2Low`,`signalQuality`,`extended`,`version`,`date`,`uploaded`,`sleepDate`,`toDelete`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<OsaProcess> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, OsaProcess value) {
            if (value.getUserId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getUserId());
            }
            stmt.bindLong(2, value.getUtcTimestamp());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `osa_process` WHERE `userId` = ? AND `utcTimestamp` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM osa_process WHERE userId = ?";
        }
    }

    public class d implements Callable<List<OsaProcess>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public d(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<OsaProcess> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(OsaProcessDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "utcTimestamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2High");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Low");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "signalQuality");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extended");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "toDelete");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow3);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow4);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow6);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                    List<Integer> intArrayFromString = IntArrayConverter.getIntArrayFromString(string5);
                    List<Integer> intArrayFromString2 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    List<Integer> intArrayFromString3 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    List<Integer> intArrayFromString4 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    String string6 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    String string7 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    boolean z = cursorQuery.getInt(i5) != 0;
                    int i7 = columnIndexOrThrow16;
                    String string8 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                    int i8 = columnIndexOrThrow17;
                    arrayList.add(new OsaProcess(string, j, i2, i3, string2, i4, string3, string4, intArrayFromString, intArrayFromString2, intArrayFromString3, intArrayFromString4, string6, string7, z, string8, cursorQuery.getInt(i8) != 0));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i5;
                    columnIndexOrThrow16 = i7;
                    columnIndexOrThrow17 = i8;
                    i = i;
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

    public class e implements Callable<Boolean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public e(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            Boolean boolValueOf = null;
            Cursor cursorQuery = DBUtil.query(OsaProcessDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    Integer numValueOf = cursorQuery.isNull(0) ? null : Integer.valueOf(cursorQuery.getInt(0));
                    if (numValueOf != null) {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                }
                return boolValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class f implements Callable<OsaProcess> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public f(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OsaProcess call() throws Exception {
            OsaProcess osaProcess;
            Cursor cursorQuery = DBUtil.query(OsaProcessDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "utcTimestamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2High");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Low");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "signalQuality");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extended");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "toDelete");
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    int i = cursorQuery.getInt(columnIndexOrThrow3);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow4);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow6);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                    osaProcess = new OsaProcess(string, j, i, i2, string2, i3, string3, string4, IntArrayConverter.getIntArrayFromString(string5), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10)), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11)), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12)), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13), cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14), cursorQuery.getInt(columnIndexOrThrow15) != 0, cursorQuery.isNull(r17) ? null : cursorQuery.getString(columnIndexOrThrow16), cursorQuery.getInt(columnIndexOrThrow17) != 0);
                } else {
                    osaProcess = null;
                }
                return osaProcess;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public OsaProcessDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
        this.d = new c(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public void clear(final String userId) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        if (userId == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, userId);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public Flow<List<OsaProcess>> getFlow(final String userId, final String from, final String to) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM osa_process WHERE userId = ? AND date BETWEEN ? AND ? AND toDelete = 0", 3);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (from == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, from);
        }
        if (to == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, to);
        }
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"osa_process"}, new d(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public Flow<Boolean> getIfRawExistsFlow(final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT EXISTS (SELECT * FROM osa_process WHERE userId = ? AND toDelete = 0)", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"osa_process"}, new e(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public OsaProcess getLatest(final String userId) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        OsaProcess osaProcess;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM osa_process WHERE userId = ? AND toDelete = 0 ORDER BY date DESC LIMIT 1", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "utcTimestamp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2High");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Low");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "signalQuality");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extended");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "toDelete");
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    int i = cursorQuery.getInt(columnIndexOrThrow3);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow4);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow6);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                    osaProcess = new OsaProcess(string, j, i, i2, string2, i3, string3, string4, IntArrayConverter.getIntArrayFromString(string5), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10)), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11)), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12)), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13), cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14), cursorQuery.getInt(columnIndexOrThrow15) != 0, cursorQuery.isNull(r18) ? null : cursorQuery.getString(columnIndexOrThrow16), cursorQuery.getInt(columnIndexOrThrow17) != 0);
                } else {
                    osaProcess = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return osaProcess;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public Flow<OsaProcess> getLatestFlow(final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM osa_process WHERE userId = ? AND toDelete = 0 ORDER BY date DESC LIMIT 1", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"osa_process"}, new f(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public List<OsaProcess> getShouldDelete(final String userId) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM osa_process WHERE userId = ? AND toDelete = 1", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "utcTimestamp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2High");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Low");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "signalQuality");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extended");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "toDelete");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow3);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow4);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow6);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                    List<Integer> intArrayFromString = IntArrayConverter.getIntArrayFromString(string5);
                    List<Integer> intArrayFromString2 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    List<Integer> intArrayFromString3 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    List<Integer> intArrayFromString4 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    String string6 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    String string7 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    boolean z = cursorQuery.getInt(i5) != 0;
                    int i7 = columnIndexOrThrow16;
                    String string8 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                    int i8 = columnIndexOrThrow17;
                    arrayList.add(new OsaProcess(string, j, i2, i3, string2, i4, string3, string4, intArrayFromString, intArrayFromString2, intArrayFromString3, intArrayFromString4, string6, string7, z, string8, cursorQuery.getInt(i8) != 0));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i5;
                    columnIndexOrThrow16 = i7;
                    columnIndexOrThrow17 = i8;
                    i = i;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public List<OsaProcess> getShouldUpload(final String userId) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM osa_process WHERE userId = ? AND uploaded = 0 AND toDelete = 0", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "utcTimestamp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2High");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Low");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "signalQuality");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extended");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "toDelete");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow3);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow4);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow6);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                    List<Integer> intArrayFromString = IntArrayConverter.getIntArrayFromString(string5);
                    List<Integer> intArrayFromString2 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    List<Integer> intArrayFromString3 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    List<Integer> intArrayFromString4 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    String string6 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    String string7 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    boolean z = cursorQuery.getInt(i5) != 0;
                    int i7 = columnIndexOrThrow16;
                    String string8 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                    int i8 = columnIndexOrThrow17;
                    arrayList.add(new OsaProcess(string, j, i2, i3, string2, i4, string3, string4, intArrayFromString, intArrayFromString2, intArrayFromString3, intArrayFromString4, string6, string7, z, string8, cursorQuery.getInt(i8) != 0));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i5;
                    columnIndexOrThrow16 = i7;
                    columnIndexOrThrow17 = i8;
                    i = i;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public long[] insert(final List<OsaProcess> osaProcesses) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long[] jArrInsertAndReturnIdsArray = this.b.insertAndReturnIdsArray(osaProcesses);
            this.a.setTransactionSuccessful();
            return jArrInsertAndReturnIdsArray;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public List<OsaProcess> queryOsaProcesses(final String userId, final String from, final String to) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM osa_process WHERE userId = ? AND date BETWEEN ? AND ? AND toDelete = 0", 3);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (from == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, from);
        }
        if (to == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, to);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "utcTimestamp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2High");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Low");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "signalQuality");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extended");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "toDelete");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow3);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow4);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow6);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                    List<Integer> intArrayFromString = IntArrayConverter.getIntArrayFromString(string5);
                    List<Integer> intArrayFromString2 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    List<Integer> intArrayFromString3 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    List<Integer> intArrayFromString4 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    String string6 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    String string7 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    boolean z = cursorQuery.getInt(i6) != 0;
                    int i7 = columnIndexOrThrow16;
                    String string8 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                    int i8 = columnIndexOrThrow17;
                    arrayList.add(new OsaProcess(string, j, i2, i3, string2, i4, string3, string4, intArrayFromString, intArrayFromString2, intArrayFromString3, intArrayFromString4, string6, string7, z, string8, cursorQuery.getInt(i8) != 0));
                    columnIndexOrThrow = i5;
                    columnIndexOrThrow15 = i6;
                    columnIndexOrThrow16 = i7;
                    columnIndexOrThrow17 = i8;
                    i = i;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public List<OsaProcess> queryOsaProcessesBySleepDate(final String userId, final String sleepDate) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM osa_process WHERE userId = ? AND sleepDate = ?", 2);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (sleepDate == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, sleepDate);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "utcTimestamp");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2High");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Low");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "signalQuality");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extended");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepDate");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "toDelete");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow3);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow4);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow6);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                    List<Integer> intArrayFromString = IntArrayConverter.getIntArrayFromString(string5);
                    List<Integer> intArrayFromString2 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    List<Integer> intArrayFromString3 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    List<Integer> intArrayFromString4 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    String string6 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    String string7 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                    int i5 = columnIndexOrThrow15;
                    int i6 = columnIndexOrThrow;
                    boolean z = cursorQuery.getInt(i5) != 0;
                    int i7 = columnIndexOrThrow16;
                    String string8 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                    int i8 = columnIndexOrThrow17;
                    arrayList.add(new OsaProcess(string, j, i2, i3, string2, i4, string3, string4, intArrayFromString, intArrayFromString2, intArrayFromString3, intArrayFromString4, string6, string7, z, string8, cursorQuery.getInt(i8) != 0));
                    columnIndexOrThrow = i6;
                    columnIndexOrThrow15 = i5;
                    columnIndexOrThrow16 = i7;
                    columnIndexOrThrow17 = i8;
                    i = i;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao
    public void remove(final OsaProcess... OsaProcess) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handleMultiple(OsaProcess);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
