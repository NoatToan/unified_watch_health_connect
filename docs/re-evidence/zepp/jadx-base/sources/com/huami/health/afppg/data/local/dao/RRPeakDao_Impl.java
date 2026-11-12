package com.huami.health.afppg.data.local.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class RRPeakDao_Impl implements RRPeakDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<RRPeak> b;
    private final EntityDeletionOrUpdateAdapter<RRPeak> c;
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;

    public class a extends EntityInsertionAdapter<RRPeak> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, RRPeak rRPeak) {
            supportSQLiteStatement.bindLong(1, rRPeak.getDeviceSource());
            if (rRPeak.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, rRPeak.getDeviceId());
            }
            if (rRPeak.getSn() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, rRPeak.getSn());
            }
            if (rRPeak.getFwVer() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, rRPeak.getFwVer());
            }
            if (rRPeak.getUserId() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, rRPeak.getUserId());
            }
            supportSQLiteStatement.bindLong(6, rRPeak.getDataType());
            supportSQLiteStatement.bindLong(7, rRPeak.getLength());
            supportSQLiteStatement.bindLong(8, rRPeak.getGeneratedTime());
            supportSQLiteStatement.bindLong(9, rRPeak.getLastRrPackageTime());
            supportSQLiteStatement.bindLong(10, rRPeak.getRrRecordSize());
            if (rRPeak.getRawLocalPath() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, rRPeak.getRawLocalPath());
            }
            if (rRPeak.getRawDataURI() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, rRPeak.getRawDataURI());
            }
            supportSQLiteStatement.bindLong(13, rRPeak.getSynced() ? 1L : 0L);
            if (rRPeak.getAfData() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, rRPeak.getAfData());
            }
            supportSQLiteStatement.bindLong(15, rRPeak.getAfResult());
            if (rRPeak.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, rRPeak.getTimeZone());
            }
            if (rRPeak.getDate() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, rRPeak.getDate());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `rrpeak` (`deviceSource`,`deviceId`,`sn`,`fwVer`,`userId`,`dataType`,`length`,`generatedTime`,`lastRrPackageTime`,`rrRecordSize`,`rawLocalPath`,`rawDataURI`,`synced`,`afData`,`afResult`,`timeZone`,`date`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<RRPeak> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, RRPeak rRPeak) {
            supportSQLiteStatement.bindLong(1, rRPeak.getDeviceSource());
            if (rRPeak.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, rRPeak.getDeviceId());
            }
            if (rRPeak.getSn() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, rRPeak.getSn());
            }
            if (rRPeak.getFwVer() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, rRPeak.getFwVer());
            }
            if (rRPeak.getUserId() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, rRPeak.getUserId());
            }
            supportSQLiteStatement.bindLong(6, rRPeak.getDataType());
            supportSQLiteStatement.bindLong(7, rRPeak.getLength());
            supportSQLiteStatement.bindLong(8, rRPeak.getGeneratedTime());
            supportSQLiteStatement.bindLong(9, rRPeak.getLastRrPackageTime());
            supportSQLiteStatement.bindLong(10, rRPeak.getRrRecordSize());
            if (rRPeak.getRawLocalPath() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, rRPeak.getRawLocalPath());
            }
            if (rRPeak.getRawDataURI() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, rRPeak.getRawDataURI());
            }
            supportSQLiteStatement.bindLong(13, rRPeak.getSynced() ? 1L : 0L);
            if (rRPeak.getAfData() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, rRPeak.getAfData());
            }
            supportSQLiteStatement.bindLong(15, rRPeak.getAfResult());
            if (rRPeak.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, rRPeak.getTimeZone());
            }
            if (rRPeak.getDate() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, rRPeak.getDate());
            }
            supportSQLiteStatement.bindLong(18, rRPeak.getGeneratedTime());
            if (rRPeak.getUserId() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, rRPeak.getUserId());
            }
            if (rRPeak.getDate() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, rRPeak.getDate());
            }
            supportSQLiteStatement.bindLong(21, rRPeak.getDataType());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR REPLACE `rrpeak` SET `deviceSource` = ?,`deviceId` = ?,`sn` = ?,`fwVer` = ?,`userId` = ?,`dataType` = ?,`length` = ?,`generatedTime` = ?,`lastRrPackageTime` = ?,`rrRecordSize` = ?,`rawLocalPath` = ?,`rawDataURI` = ?,`synced` = ?,`afData` = ?,`afResult` = ?,`timeZone` = ?,`date` = ? WHERE `generatedTime` = ? AND `userId` = ? AND `date` = ? AND `dataType` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM rrpeak WHERE userId = ? AND deviceSource = ? AND generatedTime = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM rrpeak WHERE userId = ? AND generatedTime = ?";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM rrpeak WHERE userId = ? AND deviceSource = ?";
        }
    }

    public class f extends SharedSQLiteStatement {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM rrpeak WHERE userId = ?";
        }
    }

    public RRPeakDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.e = new d(roomDatabase);
        this.f = new e(roomDatabase);
        this.g = new f(roomDatabase);
    }

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public void clear(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
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
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public void delete(String str, int i, long j) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        supportSQLiteStatementAcquire.bindLong(2, i);
        supportSQLiteStatementAcquire.bindLong(3, j);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public void deleteBySource(String str, int i) {
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

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public List<RRPeak> getUnsyncedData(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM rrpeak WHERE userId = ? AND synced = 0 AND rawLocalPath != 0", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SessionDescription.p);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastRrPackageTime");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rrRecordSize");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afData");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afResult");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                        int i = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            RRPeak rRPeak = new RRPeak();
                            ArrayList arrayList2 = arrayList;
                            rRPeak.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow));
                            rRPeak.setDeviceId(cursorQuery.getString(columnIndexOrThrow2));
                            rRPeak.setSn(cursorQuery.getString(columnIndexOrThrow3));
                            rRPeak.setFwVer(cursorQuery.getString(columnIndexOrThrow4));
                            rRPeak.setUserId(cursorQuery.getString(columnIndexOrThrow5));
                            rRPeak.setDataType(cursorQuery.getInt(columnIndexOrThrow6));
                            int i2 = columnIndexOrThrow;
                            rRPeak.setLength(cursorQuery.getLong(columnIndexOrThrow7));
                            rRPeak.setGeneratedTime(cursorQuery.getLong(columnIndexOrThrow8));
                            rRPeak.setLastRrPackageTime(cursorQuery.getLong(columnIndexOrThrow9));
                            rRPeak.setRrRecordSize(cursorQuery.getInt(columnIndexOrThrow10));
                            rRPeak.setRawLocalPath(cursorQuery.getString(columnIndexOrThrow11));
                            rRPeak.setRawDataURI(cursorQuery.getString(columnIndexOrThrow12));
                            rRPeak.setSynced(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                            int i3 = i;
                            rRPeak.setAfData(cursorQuery.getString(i3));
                            i = i3;
                            int i4 = columnIndexOrThrow15;
                            rRPeak.setAfResult(cursorQuery.getInt(i4));
                            columnIndexOrThrow15 = i4;
                            int i5 = columnIndexOrThrow16;
                            rRPeak.setTimeZone(cursorQuery.getString(i5));
                            columnIndexOrThrow16 = i5;
                            int i6 = columnIndexOrThrow17;
                            rRPeak.setDate(cursorQuery.getString(i6));
                            arrayList2.add(rRPeak);
                            columnIndexOrThrow17 = i6;
                            arrayList = arrayList2;
                            columnIndexOrThrow = i2;
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

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public void insert(RRPeak rRPeak) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(rRPeak);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public List<RRPeak> queryLocalPath(String str, long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM rrpeak WHERE userId = ? AND generatedTime = ?", 2);
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
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SessionDescription.p);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastRrPackageTime");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rrRecordSize");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afData");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afResult");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                        int i = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            RRPeak rRPeak = new RRPeak();
                            ArrayList arrayList2 = arrayList;
                            rRPeak.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow));
                            rRPeak.setDeviceId(cursorQuery.getString(columnIndexOrThrow2));
                            rRPeak.setSn(cursorQuery.getString(columnIndexOrThrow3));
                            rRPeak.setFwVer(cursorQuery.getString(columnIndexOrThrow4));
                            rRPeak.setUserId(cursorQuery.getString(columnIndexOrThrow5));
                            rRPeak.setDataType(cursorQuery.getInt(columnIndexOrThrow6));
                            int i2 = columnIndexOrThrow;
                            rRPeak.setLength(cursorQuery.getLong(columnIndexOrThrow7));
                            rRPeak.setGeneratedTime(cursorQuery.getLong(columnIndexOrThrow8));
                            rRPeak.setLastRrPackageTime(cursorQuery.getLong(columnIndexOrThrow9));
                            rRPeak.setRrRecordSize(cursorQuery.getInt(columnIndexOrThrow10));
                            rRPeak.setRawLocalPath(cursorQuery.getString(columnIndexOrThrow11));
                            rRPeak.setRawDataURI(cursorQuery.getString(columnIndexOrThrow12));
                            rRPeak.setSynced(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                            int i3 = i;
                            rRPeak.setAfData(cursorQuery.getString(i3));
                            int i4 = columnIndexOrThrow15;
                            i = i3;
                            rRPeak.setAfResult(cursorQuery.getInt(i4));
                            int i5 = columnIndexOrThrow16;
                            columnIndexOrThrow15 = i4;
                            rRPeak.setTimeZone(cursorQuery.getString(i5));
                            columnIndexOrThrow16 = i5;
                            int i6 = columnIndexOrThrow17;
                            rRPeak.setDate(cursorQuery.getString(i6));
                            arrayList2.add(rRPeak);
                            columnIndexOrThrow17 = i6;
                            arrayList = arrayList2;
                            columnIndexOrThrow = i2;
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

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public List<RRPeak> queryRRData(String str, long j, int i, int i2) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM rrpeak WHERE userId = ? AND generatedTime = ? AND dataType = ? AND deviceSource = ?", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        roomSQLiteQueryAcquire.bindLong(3, i);
        roomSQLiteQueryAcquire.bindLong(4, i2);
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SessionDescription.p);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastRrPackageTime");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rrRecordSize");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afData");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afResult");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                        int i3 = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            RRPeak rRPeak = new RRPeak();
                            ArrayList arrayList2 = arrayList;
                            rRPeak.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow));
                            rRPeak.setDeviceId(cursorQuery.getString(columnIndexOrThrow2));
                            rRPeak.setSn(cursorQuery.getString(columnIndexOrThrow3));
                            rRPeak.setFwVer(cursorQuery.getString(columnIndexOrThrow4));
                            rRPeak.setUserId(cursorQuery.getString(columnIndexOrThrow5));
                            rRPeak.setDataType(cursorQuery.getInt(columnIndexOrThrow6));
                            int i4 = columnIndexOrThrow;
                            rRPeak.setLength(cursorQuery.getLong(columnIndexOrThrow7));
                            rRPeak.setGeneratedTime(cursorQuery.getLong(columnIndexOrThrow8));
                            rRPeak.setLastRrPackageTime(cursorQuery.getLong(columnIndexOrThrow9));
                            rRPeak.setRrRecordSize(cursorQuery.getInt(columnIndexOrThrow10));
                            rRPeak.setRawLocalPath(cursorQuery.getString(columnIndexOrThrow11));
                            rRPeak.setRawDataURI(cursorQuery.getString(columnIndexOrThrow12));
                            rRPeak.setSynced(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                            int i5 = i3;
                            rRPeak.setAfData(cursorQuery.getString(i5));
                            int i6 = columnIndexOrThrow15;
                            i3 = i5;
                            rRPeak.setAfResult(cursorQuery.getInt(i6));
                            int i7 = columnIndexOrThrow16;
                            columnIndexOrThrow15 = i6;
                            rRPeak.setTimeZone(cursorQuery.getString(i7));
                            int i8 = columnIndexOrThrow17;
                            columnIndexOrThrow16 = i7;
                            rRPeak.setDate(cursorQuery.getString(i8));
                            arrayList2.add(rRPeak);
                            columnIndexOrThrow17 = i8;
                            arrayList = arrayList2;
                            columnIndexOrThrow = i4;
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

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public void update(RRPeak rRPeak) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handle(rRPeak);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public void delete(String str, long j) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
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
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public List<RRPeak> queryRRData(String str, long j, int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM rrpeak WHERE userId = ? AND generatedTime = ? AND deviceSource = ?", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        roomSQLiteQueryAcquire.bindLong(3, i);
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SessionDescription.p);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastRrPackageTime");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rrRecordSize");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afData");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afResult");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                        int i2 = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            RRPeak rRPeak = new RRPeak();
                            ArrayList arrayList2 = arrayList;
                            rRPeak.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow));
                            rRPeak.setDeviceId(cursorQuery.getString(columnIndexOrThrow2));
                            rRPeak.setSn(cursorQuery.getString(columnIndexOrThrow3));
                            rRPeak.setFwVer(cursorQuery.getString(columnIndexOrThrow4));
                            rRPeak.setUserId(cursorQuery.getString(columnIndexOrThrow5));
                            rRPeak.setDataType(cursorQuery.getInt(columnIndexOrThrow6));
                            int i3 = columnIndexOrThrow;
                            rRPeak.setLength(cursorQuery.getLong(columnIndexOrThrow7));
                            rRPeak.setGeneratedTime(cursorQuery.getLong(columnIndexOrThrow8));
                            rRPeak.setLastRrPackageTime(cursorQuery.getLong(columnIndexOrThrow9));
                            rRPeak.setRrRecordSize(cursorQuery.getInt(columnIndexOrThrow10));
                            rRPeak.setRawLocalPath(cursorQuery.getString(columnIndexOrThrow11));
                            rRPeak.setRawDataURI(cursorQuery.getString(columnIndexOrThrow12));
                            rRPeak.setSynced(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                            int i4 = i2;
                            rRPeak.setAfData(cursorQuery.getString(i4));
                            int i5 = columnIndexOrThrow15;
                            i2 = i4;
                            rRPeak.setAfResult(cursorQuery.getInt(i5));
                            int i6 = columnIndexOrThrow16;
                            columnIndexOrThrow15 = i5;
                            rRPeak.setTimeZone(cursorQuery.getString(i6));
                            int i7 = columnIndexOrThrow17;
                            columnIndexOrThrow16 = i6;
                            rRPeak.setDate(cursorQuery.getString(i7));
                            arrayList2.add(rRPeak);
                            columnIndexOrThrow17 = i7;
                            arrayList = arrayList2;
                            columnIndexOrThrow = i3;
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

    @Override // com.huami.health.afppg.data.local.dao.RRPeakDao
    public List<RRPeak> queryRRData(String str, long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM rrpeak WHERE userId = ? AND generatedTime = ?", 2);
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
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SessionDescription.p);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastRrPackageTime");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rrRecordSize");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afData");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "afResult");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                        int i = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            RRPeak rRPeak = new RRPeak();
                            ArrayList arrayList2 = arrayList;
                            rRPeak.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow));
                            rRPeak.setDeviceId(cursorQuery.getString(columnIndexOrThrow2));
                            rRPeak.setSn(cursorQuery.getString(columnIndexOrThrow3));
                            rRPeak.setFwVer(cursorQuery.getString(columnIndexOrThrow4));
                            rRPeak.setUserId(cursorQuery.getString(columnIndexOrThrow5));
                            rRPeak.setDataType(cursorQuery.getInt(columnIndexOrThrow6));
                            int i2 = columnIndexOrThrow;
                            rRPeak.setLength(cursorQuery.getLong(columnIndexOrThrow7));
                            rRPeak.setGeneratedTime(cursorQuery.getLong(columnIndexOrThrow8));
                            rRPeak.setLastRrPackageTime(cursorQuery.getLong(columnIndexOrThrow9));
                            rRPeak.setRrRecordSize(cursorQuery.getInt(columnIndexOrThrow10));
                            rRPeak.setRawLocalPath(cursorQuery.getString(columnIndexOrThrow11));
                            rRPeak.setRawDataURI(cursorQuery.getString(columnIndexOrThrow12));
                            rRPeak.setSynced(cursorQuery.getInt(columnIndexOrThrow13) != 0);
                            int i3 = i;
                            rRPeak.setAfData(cursorQuery.getString(i3));
                            int i4 = columnIndexOrThrow15;
                            i = i3;
                            rRPeak.setAfResult(cursorQuery.getInt(i4));
                            int i5 = columnIndexOrThrow16;
                            columnIndexOrThrow15 = i4;
                            rRPeak.setTimeZone(cursorQuery.getString(i5));
                            columnIndexOrThrow16 = i5;
                            int i6 = columnIndexOrThrow17;
                            rRPeak.setDate(cursorQuery.getString(i6));
                            arrayList2.add(rRPeak);
                            columnIndexOrThrow17 = i6;
                            arrayList = arrayList2;
                            columnIndexOrThrow = i2;
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
}
