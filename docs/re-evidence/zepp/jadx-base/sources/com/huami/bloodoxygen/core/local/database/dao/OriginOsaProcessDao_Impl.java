package com.huami.bloodoxygen.core.local.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.bloodoxygen.core.local.database.entity.IntArrayConverter;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class OriginOsaProcessDao_Impl implements OriginOsaProcessDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<OriginOsaProcess> b;

    public class a extends EntityInsertionAdapter<OriginOsaProcess> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, OriginOsaProcess originOsaProcess) {
            if (originOsaProcess.getUserId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, originOsaProcess.getUserId());
            }
            supportSQLiteStatement.bindLong(2, originOsaProcess.getUtcTimestamp());
            supportSQLiteStatement.bindLong(3, originOsaProcess.getSpo2());
            supportSQLiteStatement.bindLong(4, originOsaProcess.getDuration());
            if (originOsaProcess.getTimeZoneId() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, originOsaProcess.getTimeZoneId());
            }
            supportSQLiteStatement.bindLong(6, originOsaProcess.getDeviceSource());
            if (originOsaProcess.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, originOsaProcess.getDeviceId());
            }
            if (originOsaProcess.getSn() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, originOsaProcess.getSn());
            }
            IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
            String stringFromIntArray = IntArrayConverter.getStringFromIntArray(originOsaProcess.getSpo2High());
            if (stringFromIntArray == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, stringFromIntArray);
            }
            String stringFromIntArray2 = IntArrayConverter.getStringFromIntArray(originOsaProcess.getSpo2Low());
            if (stringFromIntArray2 == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, stringFromIntArray2);
            }
            String stringFromIntArray3 = IntArrayConverter.getStringFromIntArray(originOsaProcess.getSignalQuality());
            if (stringFromIntArray3 == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, stringFromIntArray3);
            }
            String stringFromIntArray4 = IntArrayConverter.getStringFromIntArray(originOsaProcess.getExtended());
            if (stringFromIntArray4 == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, stringFromIntArray4);
            }
            if (originOsaProcess.getDate() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, originOsaProcess.getDate());
            }
            supportSQLiteStatement.bindLong(14, originOsaProcess.getUploaded() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `origin_osa_process` (`userId`,`utcTimestamp`,`spo2`,`duration`,`timeZoneId`,`deviceSource`,`deviceId`,`sn`,`spo2High`,`spo2Low`,`signalQuality`,`extended`,`date`,`uploaded`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b implements Callable<List<OriginOsaProcess>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<OriginOsaProcess> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(OriginOsaProcessDao_Impl.this.a, this.a, false, null);
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
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
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
                    arrayList.add(new OriginOsaProcess(string, j, i, i2, string2, i3, string3, string4, IntArrayConverter.getIntArrayFromString(string5), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10)), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11)), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12)), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14) != 0));
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow14;
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

    public OriginOsaProcessDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OriginOsaProcessDao
    public List<OriginOsaProcess> getShouldUpload(final String userId) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM origin_osa_process WHERE userId = ? AND uploaded = 0", 1);
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
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
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
                    arrayList.add(new OriginOsaProcess(string, j, i, i2, string2, i3, string3, string4, IntArrayConverter.getIntArrayFromString(string5), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10)), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11)), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12)), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14) != 0));
                    columnIndexOrThrow = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow14;
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

    @Override // com.huami.bloodoxygen.core.local.database.dao.OriginOsaProcessDao
    public Flow<List<OriginOsaProcess>> getShouldUploadFlow(final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM origin_osa_process WHERE userId = ? AND uploaded = 0", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"origin_osa_process"}, new b(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OriginOsaProcessDao
    public long[] insert(final List<OriginOsaProcess> osaProcesses) {
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

    @Override // com.huami.bloodoxygen.core.local.database.dao.OriginOsaProcessDao
    public List<OriginOsaProcess> queryOriginOsaProcesses(final String userId, final String from, final String to) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM origin_osa_process WHERE userId = ? AND date BETWEEN ? AND ?", 3);
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
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
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
                    List<Integer> intArrayFromString = IntArrayConverter.getIntArrayFromString(string5);
                    List<Integer> intArrayFromString2 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    List<Integer> intArrayFromString3 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    List<Integer> intArrayFromString4 = IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    String string6 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow14);
                    int i5 = columnIndexOrThrow;
                    arrayList.add(new OriginOsaProcess(string, j, i, i2, string2, i3, string3, string4, intArrayFromString, intArrayFromString2, intArrayFromString3, intArrayFromString4, string6, i4 != 0));
                    columnIndexOrThrow = i5;
                    columnIndexOrThrow14 = columnIndexOrThrow14;
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
}
