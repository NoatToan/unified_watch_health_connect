package com.huami.rawdata_uploader.relation.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class RawDataDao_Impl implements RawDataDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<RawDataDbVo> b;

    public class a extends EntityInsertionAdapter<RawDataDbVo> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, RawDataDbVo value) {
            stmt.bindLong(1, value.getMeasureTime());
            if (value.getUserId() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getUserId());
            }
            stmt.bindLong(3, value.getDataType());
            if (value.getZipName() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, value.getZipName());
            }
            stmt.bindLong(5, value.getDeviceSource());
            stmt.bindLong(6, value.getDeviceType());
            if (value.getDeviceId() == null) {
                stmt.bindNull(7);
            } else {
                stmt.bindString(7, value.getDeviceId());
            }
            if (value.getDeviceMac() == null) {
                stmt.bindNull(8);
            } else {
                stmt.bindString(8, value.getDeviceMac());
            }
            if (value.getFirmVersion() == null) {
                stmt.bindNull(9);
            } else {
                stmt.bindString(9, value.getFirmVersion());
            }
            if (value.getSn() == null) {
                stmt.bindNull(10);
            } else {
                stmt.bindString(10, value.getSn());
            }
            if (value.getRawLocalPath() == null) {
                stmt.bindNull(11);
            } else {
                stmt.bindString(11, value.getRawLocalPath());
            }
            stmt.bindLong(12, value.getRawLocalFileSize());
            if (value.getExtra() == null) {
                stmt.bindNull(13);
            } else {
                stmt.bindString(13, value.getExtra());
            }
            if (value.getExtra1() == null) {
                stmt.bindNull(14);
            } else {
                stmt.bindString(14, value.getExtra1());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `RawDataDbVo` (`measureTime`,`userId`,`dataType`,`zipName`,`deviceSource`,`deviceType`,`deviceId`,`deviceMac`,`firmVersion`,`sn`,`rawLocalPath`,`rawLocalFileSize`,`extra`,`extra1`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b implements Callable<List<RawDataDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<RawDataDbVo> call() throws Exception {
            b bVar;
            Cursor cursorQuery = DBUtil.query(RawDataDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "zipName");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rawLocalFileSize");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra");
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new RawDataDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13), cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14)));
                        columnIndexOrThrow = columnIndexOrThrow;
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    bVar = this;
                    cursorQuery.close();
                    bVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = this;
            }
        }
    }

    public class c implements Callable<List<RawDataDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<RawDataDbVo> call() throws Exception {
            c cVar;
            Cursor cursorQuery = DBUtil.query(RawDataDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "zipName");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmVersion");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rawLocalFileSize");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra");
                try {
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new RawDataDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13), cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14)));
                        columnIndexOrThrow = columnIndexOrThrow;
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    cVar = this;
                    cursorQuery.close();
                    cVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = this;
            }
        }
    }

    public class d implements Callable<Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public d(final List val$measureTimeList, final String val$zipName, final String val$userId, final int val$dataType) {
            this.a = val$measureTimeList;
            this.b = val$zipName;
            this.c = val$userId;
            this.d = val$dataType;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
            sbNewStringBuilder.append("UPDATE RawDataDbVo SET zipName = ");
            sbNewStringBuilder.append("?");
            sbNewStringBuilder.append(" WHERE measureTime in (");
            int size = this.a.size();
            StringUtil.appendPlaceholders(sbNewStringBuilder, size);
            sbNewStringBuilder.append(") AND userId = ");
            sbNewStringBuilder.append("?");
            sbNewStringBuilder.append(" AND dataType = ");
            sbNewStringBuilder.append("?");
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = RawDataDao_Impl.this.a.compileStatement(sbNewStringBuilder.toString());
            String str = this.b;
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(1);
            } else {
                supportSQLiteStatementCompileStatement.bindString(1, str);
            }
            int i = 2;
            for (Long l : this.a) {
                if (l == null) {
                    supportSQLiteStatementCompileStatement.bindNull(i);
                } else {
                    supportSQLiteStatementCompileStatement.bindLong(i, l.longValue());
                }
                i++;
            }
            int i2 = size + 2;
            String str2 = this.c;
            if (str2 == null) {
                supportSQLiteStatementCompileStatement.bindNull(i2);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i2, str2);
            }
            supportSQLiteStatementCompileStatement.bindLong(size + 3, this.d);
            RawDataDao_Impl.this.a.beginTransaction();
            try {
                supportSQLiteStatementCompileStatement.executeUpdateDelete();
                RawDataDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                RawDataDao_Impl.this.a.endTransaction();
            }
        }
    }

    public class e implements Callable<Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public e(final List val$measureTimeList, final String val$userId, final int val$dataType) {
            this.a = val$measureTimeList;
            this.b = val$userId;
            this.c = val$dataType;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
            sbNewStringBuilder.append("DELETE FROM RawDataDbVo where userId = ");
            sbNewStringBuilder.append("?");
            sbNewStringBuilder.append(" AND measureTime in (");
            int size = this.a.size();
            StringUtil.appendPlaceholders(sbNewStringBuilder, size);
            sbNewStringBuilder.append(") AND dataType = ");
            sbNewStringBuilder.append("?");
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = RawDataDao_Impl.this.a.compileStatement(sbNewStringBuilder.toString());
            String str = this.b;
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(1);
            } else {
                supportSQLiteStatementCompileStatement.bindString(1, str);
            }
            int i = 2;
            for (Long l : this.a) {
                if (l == null) {
                    supportSQLiteStatementCompileStatement.bindNull(i);
                } else {
                    supportSQLiteStatementCompileStatement.bindLong(i, l.longValue());
                }
                i++;
            }
            supportSQLiteStatementCompileStatement.bindLong(size + 2, this.c);
            RawDataDao_Impl.this.a.beginTransaction();
            try {
                supportSQLiteStatementCompileStatement.executeUpdateDelete();
                RawDataDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                RawDataDao_Impl.this.a.endTransaction();
            }
        }
    }

    public RawDataDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.rawdata_uploader.relation.local.RawDataDao
    public Object deleteDataByUserId(final String userId, final List<Long> measureTimeList, final int dataType, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new e(measureTimeList, userId, dataType), continuation);
    }

    @Override // com.huami.rawdata_uploader.relation.local.RawDataDao
    public Object getDataByUserIdASC(final String userId, final String zipName, final int limit, final int dataType, final Continuation<? super List<RawDataDbVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM RawDataDbVo where userId = ? AND zipName = ? AND dataType = ? ORDER BY measureTime ASC LIMIT ? ", 4);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (zipName == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, zipName);
        }
        roomSQLiteQueryAcquire.bindLong(3, dataType);
        roomSQLiteQueryAcquire.bindLong(4, limit);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new b(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.rawdata_uploader.relation.local.RawDataDao
    public Object getExcludeDataByUserId(final String userId, final String zipName, final int dataType, final int limit, final Continuation<? super List<RawDataDbVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM RawDataDbVo where userId = ? AND zipName <> ? AND dataType = ? ORDER BY measureTime ASC LIMIT ? ", 4);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (zipName == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, zipName);
        }
        roomSQLiteQueryAcquire.bindLong(3, dataType);
        roomSQLiteQueryAcquire.bindLong(4, limit);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new c(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.rawdata_uploader.relation.local.RawDataDao
    public void insert(final RawDataDbVo dataDbVo) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(dataDbVo);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.rawdata_uploader.relation.local.RawDataDao
    public Object updateZipNameByUserId(final String userId, final List<Long> measureTimeList, final String zipName, final int dataType, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new d(measureTimeList, zipName, userId, dataType), continuation);
    }
}
