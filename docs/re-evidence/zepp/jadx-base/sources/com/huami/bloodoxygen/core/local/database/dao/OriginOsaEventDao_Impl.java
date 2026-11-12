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
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.mifit.sportlib.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class OriginOsaEventDao_Impl implements OriginOsaEventDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<OriginOsaEvent> b;

    public class a extends EntityInsertionAdapter<OriginOsaEvent> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, OriginOsaEvent originOsaEvent) {
            if (originOsaEvent.getUserId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, originOsaEvent.getUserId());
            }
            supportSQLiteStatement.bindLong(2, originOsaEvent.getUtcTimestamp());
            IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
            String stringFromIntArray = IntArrayConverter.getStringFromIntArray(originOsaEvent.getSpo2());
            if (stringFromIntArray == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, stringFromIntArray);
            }
            String stringFromIntArray2 = IntArrayConverter.getStringFromIntArray(originOsaEvent.getHr());
            if (stringFromIntArray2 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, stringFromIntArray2);
            }
            supportSQLiteStatement.bindLong(5, originOsaEvent.getSpo2Decrease());
            if (originOsaEvent.getTimeZoneId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, originOsaEvent.getTimeZoneId());
            }
            supportSQLiteStatement.bindLong(7, originOsaEvent.getDeviceSource());
            if (originOsaEvent.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, originOsaEvent.getDeviceId());
            }
            if (originOsaEvent.getSn() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, originOsaEvent.getSn());
            }
            if (originOsaEvent.getDate() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, originOsaEvent.getDate());
            }
            supportSQLiteStatement.bindLong(11, originOsaEvent.getUploaded() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `origin_osa_event` (`userId`,`utcTimestamp`,`spo2`,`hr`,`spo2Decrease`,`timeZoneId`,`deviceSource`,`deviceId`,`sn`,`date`,`uploaded`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b implements Callable<List<OriginOsaEvent>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<OriginOsaEvent> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(OriginOsaEventDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "utcTimestamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.DATA_KEY_HR);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Decrease");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                    arrayList.add(new OriginOsaEvent(string, j, IntArrayConverter.getIntArrayFromString(string2), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11) != 0));
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

    public OriginOsaEventDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OriginOsaEventDao
    public List<OriginOsaEvent> getShouldUpload(final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM origin_osa_event WHERE userId = ? AND uploaded = 0", 1);
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
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.DATA_KEY_HR);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Decrease");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                long j = cursorQuery.getLong(columnIndexOrThrow2);
                String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                arrayList.add(new OriginOsaEvent(string, j, IntArrayConverter.getIntArrayFromString(string2), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11) != 0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OriginOsaEventDao
    public Flow<List<OriginOsaEvent>> getShouldUploadFlow(final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM origin_osa_event WHERE userId = ? AND uploaded = 0", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"origin_osa_event"}, new b(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OriginOsaEventDao
    public long[] insert(final List<OriginOsaEvent> osaEvent) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long[] jArrInsertAndReturnIdsArray = this.b.insertAndReturnIdsArray(osaEvent);
            this.a.setTransactionSuccessful();
            return jArrInsertAndReturnIdsArray;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.OriginOsaEventDao
    public List<OriginOsaEvent> queryOriginOsaEvents(final String userId, final String from, final String to) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM origin_osa_event WHERE userId = ? AND date BETWEEN ? AND ?", 3);
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
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.DATA_KEY_HR);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "spo2Decrease");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZoneId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                long j = cursorQuery.getLong(columnIndexOrThrow2);
                String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                IntArrayConverter intArrayConverter = IntArrayConverter.INSTANCE;
                arrayList.add(new OriginOsaEvent(string, j, IntArrayConverter.getIntArrayFromString(string2), IntArrayConverter.getIntArrayFromString(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11) != 0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
