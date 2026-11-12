package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.xiaomi.fitness.device.manager.dao.DeviceRecordDao;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class pb6 implements DeviceRecordDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f30190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<DeviceRecord> f30191b = new a();
    public final EntityDeleteOrUpdateAdapter<DeviceRecord> c = new b();
    public final EntityDeleteOrUpdateAdapter<DeviceRecord> d = new c();

    public class a extends EntityInsertAdapter<DeviceRecord> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, DeviceRecord deviceRecord) {
            sQLiteStatement.mo50bindLong(1, deviceRecord.getDeviceRecordId());
            if (deviceRecord.getDeviceRecordValue() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, deviceRecord.getDeviceRecordValue());
            }
            if (deviceRecord.getDid() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, deviceRecord.getDid());
            }
            sQLiteStatement.mo50bindLong(4, deviceRecord.getNeed_check());
            sQLiteStatement.mo50bindLong(5, deviceRecord.getRecord_time());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `device_record` (`deviceRecordId`,`deviceRecordValue`,`did`,`need_check`,`record_time`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<DeviceRecord> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, DeviceRecord deviceRecord) {
            sQLiteStatement.mo50bindLong(1, deviceRecord.getDeviceRecordId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `device_record` WHERE `deviceRecordId` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<DeviceRecord> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, DeviceRecord deviceRecord) {
            sQLiteStatement.mo50bindLong(1, deviceRecord.getDeviceRecordId());
            if (deviceRecord.getDeviceRecordValue() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, deviceRecord.getDeviceRecordValue());
            }
            if (deviceRecord.getDid() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, deviceRecord.getDid());
            }
            sQLiteStatement.mo50bindLong(4, deviceRecord.getNeed_check());
            sQLiteStatement.mo50bindLong(5, deviceRecord.getRecord_time());
            sQLiteStatement.mo50bindLong(6, deviceRecord.getDeviceRecordId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `device_record` SET `deviceRecordId` = ?,`deviceRecordValue` = ?,`did` = ?,`need_check` = ?,`record_time` = ? WHERE `deviceRecordId` = ?";
        }
    }

    public pb6(RoomDatabase roomDatabase) {
        this.f30190a = roomDatabase;
    }

    public static List<Class<?>> n() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit r(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM device_record");
        try {
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List s(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device_record");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceRecordId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceRecordValue");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "need_check");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "record_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                DeviceRecord deviceRecord = new DeviceRecord();
                deviceRecord.setDeviceRecordId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                String text = null;
                deviceRecord.setDeviceRecordValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                deviceRecord.setDid(text);
                deviceRecord.setNeed_check((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                deviceRecord.setRecord_time(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                arrayList.add(deviceRecord);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List x(int i, int i2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device_record LIMIT ?,?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.mo50bindLong(2, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceRecordId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceRecordValue");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "need_check");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "record_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                DeviceRecord deviceRecord = new DeviceRecord();
                deviceRecord.setDeviceRecordId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                String text = null;
                deviceRecord.setDeviceRecordValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                deviceRecord.setDid(text);
                deviceRecord.setNeed_check((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                deviceRecord.setRecord_time(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                arrayList.add(deviceRecord);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List y(long j, long j2, int i, int i2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device_record WHERE (? - record_time) > ? AND need_check = 1 LIMIT ?,?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.mo50bindLong(3, i);
            sQLiteStatementPrepare.mo50bindLong(4, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceRecordId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceRecordValue");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "need_check");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "record_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                DeviceRecord deviceRecord = new DeviceRecord();
                deviceRecord.setDeviceRecordId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                String text = null;
                deviceRecord.setDeviceRecordValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                deviceRecord.setDid(text);
                deviceRecord.setNeed_check((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                deviceRecord.setRecord_time(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                arrayList.add(deviceRecord);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List z(int i, int i2, int i3, int i4, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device_record WHERE deviceRecordId >= ? AND deviceRecordId <= ? LIMIT ?,?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.mo50bindLong(2, i2);
            sQLiteStatementPrepare.mo50bindLong(3, i3);
            sQLiteStatementPrepare.mo50bindLong(4, i4);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceRecordId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceRecordValue");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "need_check");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "record_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                DeviceRecord deviceRecord = new DeviceRecord();
                deviceRecord.setDeviceRecordId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                String text = null;
                deviceRecord.setDeviceRecordValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                deviceRecord.setDid(text);
                deviceRecord.setNeed_check((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                deviceRecord.setRecord_time(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                arrayList.add(deviceRecord);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Integer A(DeviceRecord deviceRecord, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, deviceRecord));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Object update(final DeviceRecord deviceRecord, Continuation<? super Integer> continuation) {
        deviceRecord.getClass();
        return DBUtil.performSuspending(this.f30190a, false, true, new Function1() { // from class: fb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f17623a.A(deviceRecord, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDao
    public Object delete(final List<DeviceRecord> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.f30190a, false, true, new Function1() { // from class: jb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22610a.p(list, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f30190a, false, true, new Function1() { // from class: mb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return pb6.r((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDao
    public Object getAllDeviceRecord(Continuation<? super List<DeviceRecord>> continuation) {
        return DBUtil.performSuspending(this.f30190a, true, false, new Function1() { // from class: ib6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return pb6.s((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super DeviceRecord> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f30190a, true, false, new Function1() { // from class: eb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16457a.t(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDao
    public Object insertAll(final List<DeviceRecord> list, Continuation<? super Long[]> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.f30190a, false, true, new Function1() { // from class: hb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f19899a.v(list, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<DeviceRecord>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f30190a, true, false, new Function1() { // from class: nb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27744a.w(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final DeviceRecord m(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "deviceRecordId");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "deviceRecordValue");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "need_check");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "record_time");
        DeviceRecord deviceRecord = new DeviceRecord();
        if (columnIndex != -1) {
            deviceRecord.setDeviceRecordId((int) sQLiteStatement.getLong(columnIndex));
        }
        if (columnIndex2 != -1) {
            deviceRecord.setDeviceRecordValue(sQLiteStatement.isNull(columnIndex2) ? null : sQLiteStatement.getText(columnIndex2));
        }
        if (columnIndex3 != -1) {
            deviceRecord.setDid(sQLiteStatement.isNull(columnIndex3) ? null : sQLiteStatement.getText(columnIndex3));
        }
        if (columnIndex4 != -1) {
            deviceRecord.setNeed_check((int) sQLiteStatement.getLong(columnIndex4));
        }
        if (columnIndex5 != -1) {
            deviceRecord.setRecord_time(sQLiteStatement.getLong(columnIndex5));
        }
        return deviceRecord;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Object insert(final DeviceRecord[] deviceRecordArr, Continuation<? super Unit> continuation) {
        deviceRecordArr.getClass();
        return DBUtil.performSuspending(this.f30190a, false, true, new Function1() { // from class: db6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15336a.u(deviceRecordArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit p(List list, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Integer q(DeviceRecord[] deviceRecordArr, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.c.handleMultiple(sQLiteConnection, deviceRecordArr));
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDao
    public Object queryPagedDeviceRecord(final int i, final int i2, Continuation<? super List<DeviceRecord>> continuation) {
        return DBUtil.performSuspending(this.f30190a, true, false, new Function1() { // from class: lb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return pb6.x(i2, i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDao
    public Object queryPagedDeviceRecordOverTime(final long j, final long j2, final int i, final int i2, Continuation<? super List<DeviceRecord>> continuation) {
        return DBUtil.performSuspending(this.f30190a, true, false, new Function1() { // from class: gb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return pb6.y(j, j2, i2, i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDao
    public Object queryRecordByDeviceId(final int i, final int i2, final int i3, final int i4, Continuation<? super List<DeviceRecord>> continuation) {
        return DBUtil.performSuspending(this.f30190a, true, false, new Function1() { // from class: ob6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return pb6.z(i, i2, i4, i3, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ DeviceRecord t(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? m(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit u(DeviceRecord[] deviceRecordArr, SQLiteConnection sQLiteConnection) {
        this.f30191b.insert(sQLiteConnection, deviceRecordArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Long[] v(List list, SQLiteConnection sQLiteConnection) {
        return this.f30191b.insertAndReturnIdsArrayBox(sQLiteConnection, list);
    }

    public final /* synthetic */ List w(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(m(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceRecordDao
    public Object delete(final DeviceRecord[] deviceRecordArr, Continuation<? super Integer> continuation) {
        deviceRecordArr.getClass();
        return DBUtil.performSuspending(this.f30190a, false, true, new Function1() { // from class: kb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23676a.q(deviceRecordArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
