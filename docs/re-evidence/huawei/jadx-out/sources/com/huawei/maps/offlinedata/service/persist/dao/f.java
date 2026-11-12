package com.huawei.maps.offlinedata.service.persist.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huawei.maps.offlinedata.handler.dto.persist.WorldMapOfflineDataItemEntity;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes40.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f18014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EntityInsertionAdapter f18015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedSQLiteStatement f18016c;
    private final SharedSQLiteStatement d;

    class a extends EntityInsertionAdapter {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `world_map_offline_data_item` (`id`,`dataType`,`countryId`,`countryName`,`regionId`,`regionName`,`cityId`,`cityName`,`political`,`fileId`,`version`,`packageSize`,`originalSize`,`fileCheck`,`lastModifiedTime`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity) {
            supportSQLiteStatement.bindLong(1, worldMapOfflineDataItemEntity.getId());
            if (worldMapOfflineDataItemEntity.getDataType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, worldMapOfflineDataItemEntity.getDataType());
            }
            if (worldMapOfflineDataItemEntity.getCountryId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, worldMapOfflineDataItemEntity.getCountryId());
            }
            if (worldMapOfflineDataItemEntity.getCountryName() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, worldMapOfflineDataItemEntity.getCountryName());
            }
            if (worldMapOfflineDataItemEntity.getRegionId() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, worldMapOfflineDataItemEntity.getRegionId());
            }
            if (worldMapOfflineDataItemEntity.getRegionName() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, worldMapOfflineDataItemEntity.getRegionName());
            }
            if (worldMapOfflineDataItemEntity.getCityId() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, worldMapOfflineDataItemEntity.getCityId());
            }
            if (worldMapOfflineDataItemEntity.getCityName() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, worldMapOfflineDataItemEntity.getCityName());
            }
            if (worldMapOfflineDataItemEntity.getPolitical() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, worldMapOfflineDataItemEntity.getPolitical());
            }
            if (worldMapOfflineDataItemEntity.getFileId() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, worldMapOfflineDataItemEntity.getFileId());
            }
            if (worldMapOfflineDataItemEntity.getVersion() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, worldMapOfflineDataItemEntity.getVersion());
            }
            if (worldMapOfflineDataItemEntity.getPackageSize() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, worldMapOfflineDataItemEntity.getPackageSize());
            }
            if (worldMapOfflineDataItemEntity.getOriginalSize() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, worldMapOfflineDataItemEntity.getOriginalSize());
            }
            if (worldMapOfflineDataItemEntity.getFileCheck() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, worldMapOfflineDataItemEntity.getFileCheck());
            }
            if (worldMapOfflineDataItemEntity.getLastModifiedTime() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, worldMapOfflineDataItemEntity.getLastModifiedTime());
            }
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from world_map_offline_data_item";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from world_map_offline_data_item where dataType=?";
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f18014a = roomDatabase;
        this.f18015b = new a(roomDatabase);
        this.f18016c = new b(roomDatabase);
        this.d = new c(roomDatabase);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.e
    public void a(WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity) {
        this.f18014a.assertNotSuspendingTransaction();
        this.f18014a.beginTransaction();
        try {
            this.f18015b.insert(worldMapOfflineDataItemEntity);
            this.f18014a.setTransactionSuccessful();
        } finally {
            this.f18014a.endTransaction();
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.e
    public List b() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from world_map_offline_data_item", 0);
        this.f18014a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f18014a, roomSQLiteQueryAcquire, false, null);
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
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RecommendConstants.FILE_ID);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "packageSize");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalSize");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileCheck");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastModifiedTime");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity = new WorldMapOfflineDataItemEntity();
                    ArrayList arrayList2 = arrayList;
                    int i2 = columnIndexOrThrow13;
                    worldMapOfflineDataItemEntity.setId(cursorQuery.getLong(columnIndexOrThrow));
                    worldMapOfflineDataItemEntity.setDataType(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    worldMapOfflineDataItemEntity.setCountryId(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    worldMapOfflineDataItemEntity.setCountryName(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    worldMapOfflineDataItemEntity.setRegionId(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    worldMapOfflineDataItemEntity.setRegionName(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    worldMapOfflineDataItemEntity.setCityId(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    worldMapOfflineDataItemEntity.setCityName(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    worldMapOfflineDataItemEntity.setPolitical(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    worldMapOfflineDataItemEntity.setFileId(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    worldMapOfflineDataItemEntity.setVersion(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    worldMapOfflineDataItemEntity.setPackageSize(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    worldMapOfflineDataItemEntity.setOriginalSize(cursorQuery.isNull(i2) ? null : cursorQuery.getString(i2));
                    int i3 = i;
                    worldMapOfflineDataItemEntity.setFileCheck(cursorQuery.isNull(i3) ? null : cursorQuery.getString(i3));
                    int i4 = columnIndexOrThrow15;
                    worldMapOfflineDataItemEntity.setLastModifiedTime(cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4));
                    arrayList2.add(worldMapOfflineDataItemEntity);
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

    @Override // com.huawei.maps.offlinedata.service.persist.dao.e
    public void a() {
        this.f18014a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f18016c.acquire();
        this.f18014a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f18014a.setTransactionSuccessful();
        } finally {
            this.f18014a.endTransaction();
            this.f18016c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.e
    public void a(String str) {
        this.f18014a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.f18014a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f18014a.setTransactionSuccessful();
        } finally {
            this.f18014a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huawei.maps.offlinedata.service.persist.dao.e
    public WorldMapOfflineDataItemEntity b(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from world_map_offline_data_item where dataType=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.f18014a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f18014a, roomSQLiteQueryAcquire, false, null);
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
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RecommendConstants.FILE_ID);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "packageSize");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "originalSize");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileCheck");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastModifiedTime");
                if (cursorQuery.moveToFirst()) {
                    WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity2 = new WorldMapOfflineDataItemEntity();
                    worldMapOfflineDataItemEntity2.setId(cursorQuery.getLong(columnIndexOrThrow));
                    worldMapOfflineDataItemEntity2.setDataType(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    worldMapOfflineDataItemEntity2.setCountryId(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    worldMapOfflineDataItemEntity2.setCountryName(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    worldMapOfflineDataItemEntity2.setRegionId(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    worldMapOfflineDataItemEntity2.setRegionName(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                    worldMapOfflineDataItemEntity2.setCityId(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                    worldMapOfflineDataItemEntity2.setCityName(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                    worldMapOfflineDataItemEntity2.setPolitical(cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
                    worldMapOfflineDataItemEntity2.setFileId(cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10));
                    worldMapOfflineDataItemEntity2.setVersion(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11));
                    worldMapOfflineDataItemEntity2.setPackageSize(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                    worldMapOfflineDataItemEntity2.setOriginalSize(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                    worldMapOfflineDataItemEntity2.setFileCheck(cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14));
                    worldMapOfflineDataItemEntity2.setLastModifiedTime(cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15));
                    worldMapOfflineDataItemEntity = worldMapOfflineDataItemEntity2;
                } else {
                    worldMapOfflineDataItemEntity = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return worldMapOfflineDataItemEntity;
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
