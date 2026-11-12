package com.huami.health.afppg.data.local.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.health.afppg.data.local.bean.HREventData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class HREventDao_Impl implements HREventDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<HREventData> b;
    private final EntityDeletionOrUpdateAdapter<HREventData> c;

    public class a extends EntityInsertionAdapter<HREventData> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, HREventData hREventData) {
            if (hREventData.getUserID() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, hREventData.getUserID());
            }
            if (hREventData.getEventType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, hREventData.getEventType());
            }
            if (hREventData.getSubType() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, hREventData.getSubType());
            }
            supportSQLiteStatement.bindLong(4, hREventData.getTimestamp());
            if (hREventData.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, hREventData.getTimeZone());
            }
            supportSQLiteStatement.bindLong(6, hREventData.getDuration());
            supportSQLiteStatement.bindLong(7, hREventData.getHighHR());
            supportSQLiteStatement.bindLong(8, hREventData.getLowHR());
            supportSQLiteStatement.bindLong(9, hREventData.getDeviceSource());
            if (hREventData.getDiagnosis() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, hREventData.getDiagnosis());
            }
            if (hREventData.getDeviceID() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, hREventData.getDeviceID());
            }
            if (hREventData.getSn() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, hREventData.getSn());
            }
            if (hREventData.getFwVer() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, hREventData.getFwVer());
            }
            supportSQLiteStatement.bindLong(14, hREventData.getSynced());
            if (hREventData.getDate() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, hREventData.getDate());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `hr_events` (`userID`,`eventType`,`subType`,`timestamp`,`timeZone`,`duration`,`highHR`,`lowHR`,`deviceSource`,`diagnosis`,`deviceID`,`sn`,`fwVer`,`synced`,`date`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<HREventData> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, HREventData hREventData) {
            if (hREventData.getUserID() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, hREventData.getUserID());
            }
            if (hREventData.getEventType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, hREventData.getEventType());
            }
            if (hREventData.getSubType() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, hREventData.getSubType());
            }
            supportSQLiteStatement.bindLong(4, hREventData.getTimestamp());
            if (hREventData.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, hREventData.getTimeZone());
            }
            supportSQLiteStatement.bindLong(6, hREventData.getDuration());
            supportSQLiteStatement.bindLong(7, hREventData.getHighHR());
            supportSQLiteStatement.bindLong(8, hREventData.getLowHR());
            supportSQLiteStatement.bindLong(9, hREventData.getDeviceSource());
            if (hREventData.getDiagnosis() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, hREventData.getDiagnosis());
            }
            if (hREventData.getDeviceID() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, hREventData.getDeviceID());
            }
            if (hREventData.getSn() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, hREventData.getSn());
            }
            if (hREventData.getFwVer() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, hREventData.getFwVer());
            }
            supportSQLiteStatement.bindLong(14, hREventData.getSynced());
            if (hREventData.getDate() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, hREventData.getDate());
            }
            if (hREventData.getUserID() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, hREventData.getUserID());
            }
            supportSQLiteStatement.bindLong(17, hREventData.getTimestamp());
            if (hREventData.getDate() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, hREventData.getDate());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `hr_events` SET `userID` = ?,`eventType` = ?,`subType` = ?,`timestamp` = ?,`timeZone` = ?,`duration` = ?,`highHR` = ?,`lowHR` = ?,`deviceSource` = ?,`diagnosis` = ?,`deviceID` = ?,`sn` = ?,`fwVer` = ?,`synced` = ?,`date` = ? WHERE `userID` = ? AND `timestamp` = ? AND `date` = ?";
        }
    }

    public HREventDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
    }

    @Override // com.huami.health.afppg.data.local.dao.HREventDao
    public List<HREventData> getUnsyncedData() {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM hr_events WHERE synced = 0", 0);
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, SDKConstants.PARAM_USER_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highHR");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lowHR");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceID");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                        int i = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            HREventData hREventData = new HREventData();
                            ArrayList arrayList2 = arrayList;
                            hREventData.setUserID(cursorQuery.getString(columnIndexOrThrow));
                            hREventData.setEventType(cursorQuery.getString(columnIndexOrThrow2));
                            hREventData.setSubType(cursorQuery.getString(columnIndexOrThrow3));
                            int i2 = columnIndexOrThrow;
                            hREventData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow4));
                            hREventData.setTimeZone(cursorQuery.getString(columnIndexOrThrow5));
                            hREventData.setDuration(cursorQuery.getInt(columnIndexOrThrow6));
                            hREventData.setHighHR(cursorQuery.getInt(columnIndexOrThrow7));
                            hREventData.setLowHR(cursorQuery.getInt(columnIndexOrThrow8));
                            hREventData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow9));
                            hREventData.setDiagnosis(cursorQuery.getString(columnIndexOrThrow10));
                            hREventData.setDeviceID(cursorQuery.getString(columnIndexOrThrow11));
                            hREventData.setSn(cursorQuery.getString(columnIndexOrThrow12));
                            hREventData.setFwVer(cursorQuery.getString(columnIndexOrThrow13));
                            int i3 = i;
                            hREventData.setSynced(cursorQuery.getInt(i3));
                            i = i3;
                            int i4 = columnIndexOrThrow15;
                            hREventData.setDate(cursorQuery.getString(i4));
                            arrayList2.add(hREventData);
                            columnIndexOrThrow15 = i4;
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

    @Override // com.huami.health.afppg.data.local.dao.HREventDao
    public void insert(HREventData hREventData) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(hREventData);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.health.afppg.data.local.dao.HREventDao
    public List<HREventData> query(String str, String str2) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM hr_events WHERE date between ? and ? order by date desc", 2);
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
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, SDKConstants.PARAM_USER_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highHR");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lowHR");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceID");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                        int i = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            HREventData hREventData = new HREventData();
                            ArrayList arrayList2 = arrayList;
                            hREventData.setUserID(cursorQuery.getString(columnIndexOrThrow));
                            hREventData.setEventType(cursorQuery.getString(columnIndexOrThrow2));
                            hREventData.setSubType(cursorQuery.getString(columnIndexOrThrow3));
                            int i2 = columnIndexOrThrow;
                            hREventData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow4));
                            hREventData.setTimeZone(cursorQuery.getString(columnIndexOrThrow5));
                            hREventData.setDuration(cursorQuery.getInt(columnIndexOrThrow6));
                            hREventData.setHighHR(cursorQuery.getInt(columnIndexOrThrow7));
                            hREventData.setLowHR(cursorQuery.getInt(columnIndexOrThrow8));
                            hREventData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow9));
                            hREventData.setDiagnosis(cursorQuery.getString(columnIndexOrThrow10));
                            hREventData.setDeviceID(cursorQuery.getString(columnIndexOrThrow11));
                            hREventData.setSn(cursorQuery.getString(columnIndexOrThrow12));
                            hREventData.setFwVer(cursorQuery.getString(columnIndexOrThrow13));
                            int i3 = i;
                            hREventData.setSynced(cursorQuery.getInt(i3));
                            int i4 = columnIndexOrThrow15;
                            i = i3;
                            hREventData.setDate(cursorQuery.getString(i4));
                            arrayList2.add(hREventData);
                            columnIndexOrThrow15 = i4;
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

    @Override // com.huami.health.afppg.data.local.dao.HREventDao
    public List<HREventData> queryWithSubType(String str, String str2, String str3) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM hr_events WHERE date between ? and ? and subType = ? order by date desc", 3);
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
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, SDKConstants.PARAM_USER_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highHR");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lowHR");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceID");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fwVer");
                roomSQLiteQuery = roomSQLiteQueryAcquire;
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "synced");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                        int i = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            HREventData hREventData = new HREventData();
                            ArrayList arrayList2 = arrayList;
                            hREventData.setUserID(cursorQuery.getString(columnIndexOrThrow));
                            hREventData.setEventType(cursorQuery.getString(columnIndexOrThrow2));
                            hREventData.setSubType(cursorQuery.getString(columnIndexOrThrow3));
                            int i2 = columnIndexOrThrow;
                            hREventData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow4));
                            hREventData.setTimeZone(cursorQuery.getString(columnIndexOrThrow5));
                            hREventData.setDuration(cursorQuery.getInt(columnIndexOrThrow6));
                            hREventData.setHighHR(cursorQuery.getInt(columnIndexOrThrow7));
                            hREventData.setLowHR(cursorQuery.getInt(columnIndexOrThrow8));
                            hREventData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow9));
                            hREventData.setDiagnosis(cursorQuery.getString(columnIndexOrThrow10));
                            hREventData.setDeviceID(cursorQuery.getString(columnIndexOrThrow11));
                            hREventData.setSn(cursorQuery.getString(columnIndexOrThrow12));
                            hREventData.setFwVer(cursorQuery.getString(columnIndexOrThrow13));
                            int i3 = i;
                            hREventData.setSynced(cursorQuery.getInt(i3));
                            int i4 = columnIndexOrThrow15;
                            i = i3;
                            hREventData.setDate(cursorQuery.getString(i4));
                            arrayList2.add(hREventData);
                            columnIndexOrThrow15 = i4;
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

    @Override // com.huami.health.afppg.data.local.dao.HREventDao
    public void updateSyncState(HREventData hREventData) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handle(hREventData);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
