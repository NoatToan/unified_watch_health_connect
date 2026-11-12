package com.huawei.maps.offlinedata.service.persist.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes40.dex */
public final class b implements com.huawei.maps.offlinedata.service.persist.dao.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f17999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EntityInsertionAdapter f18000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedSQLiteStatement f18001c;
    private final SharedSQLiteStatement d;

    class a extends EntityInsertionAdapter {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `map_offline_data_item` (`id`,`dataType`,`countryId`,`countryCode`,`countryName`,`regionId`,`regionName`,`cityId`,`cityName`,`political`,`fileId`,`version`,`packageSize`,`originalSize`,`fileCheck`,`lon`,`lat`,`maxLon`,`maxLat`,`minLon`,`minLat`,`lastModifiedTime`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public void bind(SupportSQLiteStatement supportSQLiteStatement, MapOfflineDataItemEntity mapOfflineDataItemEntity) {
            supportSQLiteStatement.bindLong(1, mapOfflineDataItemEntity.getId());
            if (mapOfflineDataItemEntity.getDataType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, mapOfflineDataItemEntity.getDataType());
            }
            if (mapOfflineDataItemEntity.getCountryId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, mapOfflineDataItemEntity.getCountryId());
            }
            if (mapOfflineDataItemEntity.getCountryCode() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, mapOfflineDataItemEntity.getCountryCode());
            }
            if (mapOfflineDataItemEntity.getCountryName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, mapOfflineDataItemEntity.getCountryName());
            }
            if (mapOfflineDataItemEntity.getRegionId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, mapOfflineDataItemEntity.getRegionId());
            }
            if (mapOfflineDataItemEntity.getRegionName() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, mapOfflineDataItemEntity.getRegionName());
            }
            if (mapOfflineDataItemEntity.getCityId() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, mapOfflineDataItemEntity.getCityId());
            }
            if (mapOfflineDataItemEntity.getCityName() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, mapOfflineDataItemEntity.getCityName());
            }
            if (mapOfflineDataItemEntity.getPolitical() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, mapOfflineDataItemEntity.getPolitical());
            }
            if (mapOfflineDataItemEntity.getFileId() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, mapOfflineDataItemEntity.getFileId());
            }
            if (mapOfflineDataItemEntity.getVersion() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, mapOfflineDataItemEntity.getVersion());
            }
            if (mapOfflineDataItemEntity.getPackageSize() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, mapOfflineDataItemEntity.getPackageSize());
            }
            if (mapOfflineDataItemEntity.getOriginalSize() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, mapOfflineDataItemEntity.getOriginalSize());
            }
            if (mapOfflineDataItemEntity.getFileCheck() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, mapOfflineDataItemEntity.getFileCheck());
            }
            if (mapOfflineDataItemEntity.getLon() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, mapOfflineDataItemEntity.getLon());
            }
            if (mapOfflineDataItemEntity.getLat() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, mapOfflineDataItemEntity.getLat());
            }
            if (mapOfflineDataItemEntity.getMaxLon() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, mapOfflineDataItemEntity.getMaxLon());
            }
            if (mapOfflineDataItemEntity.getMaxLat() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, mapOfflineDataItemEntity.getMaxLat());
            }
            if (mapOfflineDataItemEntity.getMinLon() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, mapOfflineDataItemEntity.getMinLon());
            }
            if (mapOfflineDataItemEntity.getMinLat() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, mapOfflineDataItemEntity.getMinLat());
            }
            if (mapOfflineDataItemEntity.getLastModifiedTime() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, mapOfflineDataItemEntity.getLastModifiedTime());
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.service.persist.dao.b$b, reason: collision with other inner class name */
    class C0192b extends SharedSQLiteStatement {
        C0192b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from map_offline_data_item";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from map_offline_data_item where dataType=?";
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.f17999a = roomDatabase;
        this.f18000b = new a(roomDatabase);
        this.f18001c = new C0192b(roomDatabase);
        this.d = new c(roomDatabase);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.a
    public void a(List list) {
        this.f17999a.assertNotSuspendingTransaction();
        this.f17999a.beginTransaction();
        try {
            this.f18000b.insert((Iterable) list);
            this.f17999a.setTransactionSuccessful();
        } finally {
            this.f17999a.endTransaction();
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.a
    public void b() {
        this.f17999a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f18001c.acquire();
        this.f17999a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f17999a.setTransactionSuccessful();
        } finally {
            this.f17999a.endTransaction();
            this.f18001c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.a
    public void a(String str) {
        this.f17999a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.f17999a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f17999a.setTransactionSuccessful();
        } finally {
            this.f17999a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.a
    public List a() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from map_offline_data_item", 0);
        this.f17999a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f17999a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryCode");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryName");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionName");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityName");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "political");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RecommendConstants.FILE_ID);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "packageSize");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalSize");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileCheck");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lon");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lat");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxLon");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxLat");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minLon");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minLat");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastModifiedTime");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    MapOfflineDataItemEntity mapOfflineDataItemEntity = new MapOfflineDataItemEntity();
                    ArrayList arrayList2 = arrayList;
                    int i2 = columnIndexOrThrow13;
                    mapOfflineDataItemEntity.setId(cursorQuery.getLong(columnIndexOrThrow));
                    mapOfflineDataItemEntity.setDataType(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    mapOfflineDataItemEntity.setCountryId(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    mapOfflineDataItemEntity.setCountryCode(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    mapOfflineDataItemEntity.setCountryName(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    mapOfflineDataItemEntity.setRegionId(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    mapOfflineDataItemEntity.setRegionName(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    mapOfflineDataItemEntity.setCityId(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    mapOfflineDataItemEntity.setCityName(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    mapOfflineDataItemEntity.setPolitical(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    mapOfflineDataItemEntity.setFileId(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    mapOfflineDataItemEntity.setVersion(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    mapOfflineDataItemEntity.setPackageSize(cursorQuery.isNull(i2) ? null : cursorQuery.getString(i2));
                    int i3 = i;
                    mapOfflineDataItemEntity.setOriginalSize(cursorQuery.isNull(i3) ? null : cursorQuery.getString(i3));
                    int i4 = columnIndexOrThrow15;
                    mapOfflineDataItemEntity.setFileCheck(cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4));
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    mapOfflineDataItemEntity.setLon(cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16));
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    mapOfflineDataItemEntity.setLat(cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    mapOfflineDataItemEntity.setMaxLon(cursorQuery.isNull(columnIndexOrThrow18) ? null : cursorQuery.getString(columnIndexOrThrow18));
                    columnIndexOrThrow19 = columnIndexOrThrow19;
                    mapOfflineDataItemEntity.setMaxLat(cursorQuery.isNull(columnIndexOrThrow19) ? null : cursorQuery.getString(columnIndexOrThrow19));
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    mapOfflineDataItemEntity.setMinLon(cursorQuery.isNull(columnIndexOrThrow20) ? null : cursorQuery.getString(columnIndexOrThrow20));
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    mapOfflineDataItemEntity.setMinLat(cursorQuery.isNull(columnIndexOrThrow21) ? null : cursorQuery.getString(columnIndexOrThrow21));
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    mapOfflineDataItemEntity.setLastModifiedTime(cursorQuery.isNull(columnIndexOrThrow22) ? null : cursorQuery.getString(columnIndexOrThrow22));
                    arrayList2.add(mapOfflineDataItemEntity);
                    columnIndexOrThrow15 = i4;
                    i = i3;
                    columnIndexOrThrow13 = i2;
                    arrayList = arrayList2;
                    columnIndexOrThrow = columnIndexOrThrow;
                }
                ArrayList arrayList3 = arrayList;
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList3;
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

    @Override // com.huawei.maps.offlinedata.service.persist.dao.a
    public MapOfflineDataItemEntity a(String str, String str2, String str3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        MapOfflineDataItemEntity mapOfflineDataItemEntity;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from map_offline_data_item where cityId=? and dataType=? and version=? limit 1", 3);
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
        this.f17999a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f17999a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryCode");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "countryName");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionId");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "regionName");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityId");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cityName");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "political");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RecommendConstants.FILE_ID);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "packageSize");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalSize");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileCheck");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lon");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lat");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxLon");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxLat");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minLon");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minLat");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastModifiedTime");
                if (cursorQuery.moveToFirst()) {
                    MapOfflineDataItemEntity mapOfflineDataItemEntity2 = new MapOfflineDataItemEntity();
                    mapOfflineDataItemEntity2.setId(cursorQuery.getLong(columnIndexOrThrow));
                    mapOfflineDataItemEntity2.setDataType(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    mapOfflineDataItemEntity2.setCountryId(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    mapOfflineDataItemEntity2.setCountryCode(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    mapOfflineDataItemEntity2.setCountryName(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    mapOfflineDataItemEntity2.setRegionId(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    mapOfflineDataItemEntity2.setRegionName(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    mapOfflineDataItemEntity2.setCityId(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    mapOfflineDataItemEntity2.setCityName(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    mapOfflineDataItemEntity2.setPolitical(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    mapOfflineDataItemEntity2.setFileId(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    mapOfflineDataItemEntity2.setVersion(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    mapOfflineDataItemEntity2.setPackageSize(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                    mapOfflineDataItemEntity2.setOriginalSize(cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14));
                    mapOfflineDataItemEntity2.setFileCheck(cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15));
                    mapOfflineDataItemEntity2.setLon(cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16));
                    mapOfflineDataItemEntity2.setLat(cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17));
                    mapOfflineDataItemEntity2.setMaxLon(cursorQuery.isNull(columnIndexOrThrow18) ? null : cursorQuery.getString(columnIndexOrThrow18));
                    mapOfflineDataItemEntity2.setMaxLat(cursorQuery.isNull(columnIndexOrThrow19) ? null : cursorQuery.getString(columnIndexOrThrow19));
                    mapOfflineDataItemEntity2.setMinLon(cursorQuery.isNull(columnIndexOrThrow20) ? null : cursorQuery.getString(columnIndexOrThrow20));
                    mapOfflineDataItemEntity2.setMinLat(cursorQuery.isNull(columnIndexOrThrow21) ? null : cursorQuery.getString(columnIndexOrThrow21));
                    mapOfflineDataItemEntity2.setLastModifiedTime(cursorQuery.isNull(columnIndexOrThrow22) ? null : cursorQuery.getString(columnIndexOrThrow22));
                    mapOfflineDataItemEntity = mapOfflineDataItemEntity2;
                } else {
                    mapOfflineDataItemEntity = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return mapOfflineDataItemEntity;
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
