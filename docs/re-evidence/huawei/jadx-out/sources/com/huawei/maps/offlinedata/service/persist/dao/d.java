package com.huawei.maps.offlinedata.service.persist.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes40.dex */
public final class d implements com.huawei.maps.offlinedata.service.persist.dao.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f18005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EntityInsertionAdapter f18006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedSQLiteStatement f18007c;
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;

    class a extends EntityInsertionAdapter {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `offline_data_task` (`id`,`dataType`,`countryId`,`countryName`,`regionId`,`regionName`,`cityId`,`cityName`,`political`,`version`,`taskId`,`taskState`,`itemState`,`downloadProgress`,`transmitProgress`,`lastModifyTime`,`downloadType`,`manualPause`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public void bind(SupportSQLiteStatement supportSQLiteStatement, OfflineDataTaskEntity offlineDataTaskEntity) {
            if (offlineDataTaskEntity.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, offlineDataTaskEntity.getId());
            }
            if (offlineDataTaskEntity.getDataType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, offlineDataTaskEntity.getDataType());
            }
            if (offlineDataTaskEntity.getCountryId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, offlineDataTaskEntity.getCountryId());
            }
            if (offlineDataTaskEntity.getCountryName() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, offlineDataTaskEntity.getCountryName());
            }
            if (offlineDataTaskEntity.getRegionId() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, offlineDataTaskEntity.getRegionId());
            }
            if (offlineDataTaskEntity.getRegionName() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, offlineDataTaskEntity.getRegionName());
            }
            if (offlineDataTaskEntity.getCityId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, offlineDataTaskEntity.getCityId());
            }
            if (offlineDataTaskEntity.getCityName() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, offlineDataTaskEntity.getCityName());
            }
            if (offlineDataTaskEntity.getPolitical() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, offlineDataTaskEntity.getPolitical());
            }
            if (offlineDataTaskEntity.getVersion() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, offlineDataTaskEntity.getVersion());
            }
            if (offlineDataTaskEntity.getTaskId() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, offlineDataTaskEntity.getTaskId());
            }
            if (offlineDataTaskEntity.getTaskState() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, offlineDataTaskEntity.getTaskState());
            }
            if (offlineDataTaskEntity.getItemState() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, offlineDataTaskEntity.getItemState());
            }
            if (offlineDataTaskEntity.getDownloadProgress() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindLong(14, offlineDataTaskEntity.getDownloadProgress().intValue());
            }
            if (offlineDataTaskEntity.getTransmitProgress() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindLong(15, offlineDataTaskEntity.getTransmitProgress().intValue());
            }
            if (offlineDataTaskEntity.getLastModifyTime() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, offlineDataTaskEntity.getLastModifyTime());
            }
            if (offlineDataTaskEntity.getDownloadType() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, offlineDataTaskEntity.getDownloadType().intValue());
            }
            supportSQLiteStatement.bindLong(18, offlineDataTaskEntity.isManualPause() ? 1L : 0L);
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "update offline_data_task set itemState = ? , taskState = ? where id = ?";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "update offline_data_task set downloadType = ? where id = ?";
        }
    }

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.service.persist.dao.d$d, reason: collision with other inner class name */
    class C0193d extends SharedSQLiteStatement {
        C0193d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "update offline_data_task set downloadProgress = ? , transmitProgress = ? where id = ?";
        }
    }

    class e extends SharedSQLiteStatement {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from offline_data_task where id = ?";
        }
    }

    class f extends SharedSQLiteStatement {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from offline_data_task";
        }
    }

    public d(RoomDatabase roomDatabase) {
        this.f18005a = roomDatabase;
        this.f18006b = new a(roomDatabase);
        this.f18007c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.e = new C0193d(roomDatabase);
        this.f = new e(roomDatabase);
        this.g = new f(roomDatabase);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public void a(OfflineDataTaskEntity offlineDataTaskEntity) {
        this.f18005a.assertNotSuspendingTransaction();
        this.f18005a.beginTransaction();
        try {
            this.f18006b.insert(offlineDataTaskEntity);
            this.f18005a.setTransactionSuccessful();
        } finally {
            this.f18005a.endTransaction();
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public List b() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from offline_data_task order by lastModifyTime desc", 0);
        this.f18005a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f18005a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryName");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityName");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "political");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "taskId");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "taskState");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "itemState");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadProgress");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transmitProgress");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastModifyTime");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadType");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "manualPause");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    OfflineDataTaskEntity offlineDataTaskEntity = new OfflineDataTaskEntity();
                    offlineDataTaskEntity.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow));
                    offlineDataTaskEntity.setDataType(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    offlineDataTaskEntity.setCountryId(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    offlineDataTaskEntity.setCountryName(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    offlineDataTaskEntity.setRegionId(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    offlineDataTaskEntity.setRegionName(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    offlineDataTaskEntity.setCityId(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    offlineDataTaskEntity.setCityName(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    offlineDataTaskEntity.setPolitical(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    offlineDataTaskEntity.setVersion(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    offlineDataTaskEntity.setTaskId(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    offlineDataTaskEntity.setTaskState(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    offlineDataTaskEntity.setItemState(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                    int i2 = i;
                    offlineDataTaskEntity.setDownloadProgress(cursorQuery.isNull(i2) ? null : Integer.valueOf(cursorQuery.getInt(i2)));
                    int i3 = columnIndexOrThrow15;
                    offlineDataTaskEntity.setTransmitProgress(cursorQuery.isNull(i3) ? null : Integer.valueOf(cursorQuery.getInt(i3)));
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    offlineDataTaskEntity.setLastModifyTime(cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    offlineDataTaskEntity.setDownloadType(cursorQuery.isNull(columnIndexOrThrow17) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow17)));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    offlineDataTaskEntity.setManualPause(cursorQuery.getInt(columnIndexOrThrow18) != 0);
                    arrayList.add(offlineDataTaskEntity);
                    columnIndexOrThrow15 = i3;
                    i = i2;
                    columnIndexOrThrow = columnIndexOrThrow;
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

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public void a(String str, String str2, String str3) {
        this.f18005a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f18007c.acquire();
        if (str2 == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str2);
        }
        if (str3 == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str3);
        }
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(3);
        } else {
            supportSQLiteStatementAcquire.bindString(3, str);
        }
        this.f18005a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f18005a.setTransactionSuccessful();
        } finally {
            this.f18005a.endTransaction();
            this.f18007c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public void a(String str, int i) {
        this.f18005a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i);
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str);
        }
        this.f18005a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f18005a.setTransactionSuccessful();
        } finally {
            this.f18005a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public void a(String str, int i, int i2) {
        this.f18005a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i);
        supportSQLiteStatementAcquire.bindLong(2, i2);
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(3);
        } else {
            supportSQLiteStatementAcquire.bindString(3, str);
        }
        this.f18005a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f18005a.setTransactionSuccessful();
        } finally {
            this.f18005a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public void a(String str) {
        this.f18005a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.f18005a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f18005a.setTransactionSuccessful();
        } finally {
            this.f18005a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public void a() {
        this.f18005a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        this.f18005a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f18005a.setTransactionSuccessful();
        } finally {
            this.f18005a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public List a(List list) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("select * from offline_data_task where itemState in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(Constants.RIGHT_BRACKET_ONLY);
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindString(i, str);
            }
            i++;
        }
        this.f18005a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f18005a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryName");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityName");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "political");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "taskId");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "taskState");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "itemState");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadProgress");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transmitProgress");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastModifyTime");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadType");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "manualPause");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    OfflineDataTaskEntity offlineDataTaskEntity = new OfflineDataTaskEntity();
                    offlineDataTaskEntity.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow));
                    offlineDataTaskEntity.setDataType(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    offlineDataTaskEntity.setCountryId(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    offlineDataTaskEntity.setCountryName(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    offlineDataTaskEntity.setRegionId(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    offlineDataTaskEntity.setRegionName(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    offlineDataTaskEntity.setCityId(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    offlineDataTaskEntity.setCityName(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    offlineDataTaskEntity.setPolitical(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    offlineDataTaskEntity.setVersion(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    offlineDataTaskEntity.setTaskId(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    offlineDataTaskEntity.setTaskState(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    offlineDataTaskEntity.setItemState(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                    int i3 = i2;
                    offlineDataTaskEntity.setDownloadProgress(cursorQuery.isNull(i3) ? null : Integer.valueOf(cursorQuery.getInt(i3)));
                    int i4 = columnIndexOrThrow15;
                    offlineDataTaskEntity.setTransmitProgress(cursorQuery.isNull(i4) ? null : Integer.valueOf(cursorQuery.getInt(i4)));
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    offlineDataTaskEntity.setLastModifyTime(cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    offlineDataTaskEntity.setDownloadType(cursorQuery.isNull(columnIndexOrThrow17) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow17)));
                    int i5 = columnIndexOrThrow18;
                    columnIndexOrThrow18 = i5;
                    offlineDataTaskEntity.setManualPause(cursorQuery.getInt(i5) != 0);
                    arrayList.add(offlineDataTaskEntity);
                    columnIndexOrThrow15 = i4;
                    i2 = i3;
                    columnIndexOrThrow = columnIndexOrThrow;
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

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public OfflineDataTaskEntity b(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        OfflineDataTaskEntity offlineDataTaskEntity;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from offline_data_task where taskId = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.f18005a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f18005a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryName");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityName");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "political");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "taskId");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "taskState");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "itemState");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadProgress");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transmitProgress");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastModifyTime");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadType");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "manualPause");
                if (cursorQuery.moveToFirst()) {
                    OfflineDataTaskEntity offlineDataTaskEntity2 = new OfflineDataTaskEntity();
                    offlineDataTaskEntity2.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow));
                    offlineDataTaskEntity2.setDataType(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    offlineDataTaskEntity2.setCountryId(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    offlineDataTaskEntity2.setCountryName(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    offlineDataTaskEntity2.setRegionId(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    offlineDataTaskEntity2.setRegionName(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    offlineDataTaskEntity2.setCityId(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    offlineDataTaskEntity2.setCityName(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    offlineDataTaskEntity2.setPolitical(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    offlineDataTaskEntity2.setVersion(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    offlineDataTaskEntity2.setTaskId(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    offlineDataTaskEntity2.setTaskState(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    offlineDataTaskEntity2.setItemState(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                    offlineDataTaskEntity2.setDownloadProgress(cursorQuery.isNull(columnIndexOrThrow14) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow14)));
                    offlineDataTaskEntity2.setTransmitProgress(cursorQuery.isNull(columnIndexOrThrow15) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow15)));
                    offlineDataTaskEntity2.setLastModifyTime(cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16));
                    offlineDataTaskEntity2.setDownloadType(cursorQuery.isNull(columnIndexOrThrow17) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow17)));
                    offlineDataTaskEntity2.setManualPause(cursorQuery.getInt(columnIndexOrThrow18) != 0);
                    offlineDataTaskEntity = offlineDataTaskEntity2;
                } else {
                    offlineDataTaskEntity = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return offlineDataTaskEntity;
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

    @Override // com.huawei.maps.offlinedata.service.persist.dao.c
    public OfflineDataTaskEntity a(String str, String str2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        OfflineDataTaskEntity offlineDataTaskEntity;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from offline_data_task where cityId = ? and dataType=?", 2);
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
        this.f18005a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f18005a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryName");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionName");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityName");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "political");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "taskId");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "taskState");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "itemState");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadProgress");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transmitProgress");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastModifyTime");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "downloadType");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "manualPause");
                if (cursorQuery.moveToFirst()) {
                    OfflineDataTaskEntity offlineDataTaskEntity2 = new OfflineDataTaskEntity();
                    offlineDataTaskEntity2.setId(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow));
                    offlineDataTaskEntity2.setDataType(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    offlineDataTaskEntity2.setCountryId(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    offlineDataTaskEntity2.setCountryName(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    offlineDataTaskEntity2.setRegionId(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    offlineDataTaskEntity2.setRegionName(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    offlineDataTaskEntity2.setCityId(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    offlineDataTaskEntity2.setCityName(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    offlineDataTaskEntity2.setPolitical(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    offlineDataTaskEntity2.setVersion(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    offlineDataTaskEntity2.setTaskId(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    offlineDataTaskEntity2.setTaskState(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    offlineDataTaskEntity2.setItemState(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                    offlineDataTaskEntity2.setDownloadProgress(cursorQuery.isNull(columnIndexOrThrow14) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow14)));
                    offlineDataTaskEntity2.setTransmitProgress(cursorQuery.isNull(columnIndexOrThrow15) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow15)));
                    offlineDataTaskEntity2.setLastModifyTime(cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16));
                    offlineDataTaskEntity2.setDownloadType(cursorQuery.isNull(columnIndexOrThrow17) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow17)));
                    offlineDataTaskEntity2.setManualPause(cursorQuery.getInt(columnIndexOrThrow18) != 0);
                    offlineDataTaskEntity = offlineDataTaskEntity2;
                } else {
                    offlineDataTaskEntity = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return offlineDataTaskEntity;
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
