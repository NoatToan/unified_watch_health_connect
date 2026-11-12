package com.xiaomi.fitness.device.manager.dao;

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
import com.xiaomi.fitness.device.manager.bean.DeviceConverter;
import com.xiaomi.fitness.device.manager.dao.a;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements DeviceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11911a;
    public final DeviceConverter c = new DeviceConverter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<WearableDevice> f11912b = new C0424a();
    public final EntityDeleteOrUpdateAdapter<WearableDevice> d = new b();
    public final EntityDeleteOrUpdateAdapter<WearableDevice> e = new c();

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.dao.a$a, reason: collision with other inner class name */
    public class C0424a extends EntityInsertAdapter<WearableDevice> {
        public C0424a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WearableDevice wearableDevice) {
            if (wearableDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, wearableDevice.getDid());
            }
            sQLiteStatement.mo50bindLong(2, wearableDevice.getProductId());
            if (wearableDevice.getModel() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, wearableDevice.getModel());
            }
            if (wearableDevice.getName() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, wearableDevice.getName());
            }
            String strMapToString = a.this.c.mapToString(wearableDevice.getExtraValues());
            if (strMapToString == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, strMapToString);
            }
            if (wearableDevice.getIdentifier() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, wearableDevice.getIdentifier());
            }
            if (wearableDevice.getAlias() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, wearableDevice.getAlias());
            }
            sQLiteStatement.mo50bindLong(8, wearableDevice.getStatus());
            String strDetailToString = a.this.c.detailToString(wearableDevice.getDetail());
            if (strDetailToString == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, strDetailToString);
            }
            sQLiteStatement.mo50bindLong(10, wearableDevice.getUploaded());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `device` (`did`,`productId`,`model`,`name`,`extraValues`,`identifier`,`alias`,`status`,`detail`,`uploaded`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<WearableDevice> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WearableDevice wearableDevice) {
            if (wearableDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, wearableDevice.getDid());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `device` WHERE `did` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<WearableDevice> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WearableDevice wearableDevice) {
            if (wearableDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, wearableDevice.getDid());
            }
            sQLiteStatement.mo50bindLong(2, wearableDevice.getProductId());
            if (wearableDevice.getModel() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, wearableDevice.getModel());
            }
            if (wearableDevice.getName() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, wearableDevice.getName());
            }
            String strMapToString = a.this.c.mapToString(wearableDevice.getExtraValues());
            if (strMapToString == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, strMapToString);
            }
            if (wearableDevice.getIdentifier() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, wearableDevice.getIdentifier());
            }
            if (wearableDevice.getAlias() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, wearableDevice.getAlias());
            }
            sQLiteStatement.mo50bindLong(8, wearableDevice.getStatus());
            String strDetailToString = a.this.c.detailToString(wearableDevice.getDetail());
            if (strDetailToString == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, strDetailToString);
            }
            sQLiteStatement.mo50bindLong(10, wearableDevice.getUploaded());
            if (wearableDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, wearableDevice.getDid());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `device` SET `did` = ?,`productId` = ?,`model` = ?,`name` = ?,`extraValues` = ?,`identifier` = ?,`alias` = ?,`status` = ?,`detail` = ?,`uploaded` = ? WHERE `did` = ?";
        }
    }

    public a(RoomDatabase roomDatabase) {
        this.f11911a = roomDatabase;
    }

    public static List<Class<?>> n() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit q(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM device");
        try {
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Unit r(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM device WHERE status = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Unit s(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM device WHERE did = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            Unit unit = Unit.INSTANCE;
            sQLiteStatementPrepare.close();
            return unit;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Object update(final WearableDevice wearableDevice, Continuation<? super Integer> continuation) {
        wearableDevice.getClass();
        return DBUtil.performSuspending(this.f11911a, false, true, new Function1() { // from class: t26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34223a.y(wearableDevice, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDao
    public Object delete(final WearableDevice[] wearableDeviceArr, Continuation<? super Integer> continuation) {
        wearableDeviceArr.getClass();
        return DBUtil.performSuspending(this.f11911a, false, true, new Function1() { // from class: u26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35305a.p(wearableDeviceArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super WearableDevice> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11911a, true, false, new Function1() { // from class: v26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36405a.t(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<WearableDevice>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11911a, true, false, new Function1() { // from class: w26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37472a.v(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final WearableDevice m(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "productId");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "model");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "name");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "extraValues");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "identifier");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "alias");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "status");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "detail");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "uploaded");
        WearableDevice wearableDevice = new WearableDevice();
        if (columnIndex != -1) {
            wearableDevice.setDid(sQLiteStatement.isNull(columnIndex) ? null : sQLiteStatement.getText(columnIndex));
        }
        if (columnIndex2 != -1) {
            wearableDevice.setProductId((int) sQLiteStatement.getLong(columnIndex2));
        }
        if (columnIndex3 != -1) {
            wearableDevice.setModel(sQLiteStatement.isNull(columnIndex3) ? null : sQLiteStatement.getText(columnIndex3));
        }
        if (columnIndex4 != -1) {
            wearableDevice.setName(sQLiteStatement.isNull(columnIndex4) ? null : sQLiteStatement.getText(columnIndex4));
        }
        if (columnIndex5 != -1) {
            wearableDevice.setExtraValues(this.c.stringToMap(sQLiteStatement.isNull(columnIndex5) ? null : sQLiteStatement.getText(columnIndex5)));
        }
        if (columnIndex6 != -1) {
            wearableDevice.setIdentifier(sQLiteStatement.isNull(columnIndex6) ? null : sQLiteStatement.getText(columnIndex6));
        }
        if (columnIndex7 != -1) {
            wearableDevice.setAlias(sQLiteStatement.isNull(columnIndex7) ? null : sQLiteStatement.getText(columnIndex7));
        }
        if (columnIndex8 != -1) {
            wearableDevice.setStatus((int) sQLiteStatement.getLong(columnIndex8));
        }
        if (columnIndex9 != -1) {
            wearableDevice.setDetail(this.c.stringToDetail(sQLiteStatement.isNull(columnIndex9) ? null : sQLiteStatement.getText(columnIndex9)));
        }
        if (columnIndex10 != -1) {
            wearableDevice.setUploaded((int) sQLiteStatement.getLong(columnIndex10));
        }
        return wearableDevice;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Object insert(final WearableDevice[] wearableDeviceArr, Continuation<? super Unit> continuation) {
        wearableDeviceArr.getClass();
        return DBUtil.performSuspending(this.f11911a, false, true, new Function1() { // from class: p26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f29928a.u(wearableDeviceArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Integer p(WearableDevice[] wearableDeviceArr, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handleMultiple(sQLiteConnection, wearableDeviceArr));
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDao
    public Object queryAllDevices(Continuation<? super List<? extends WearableDevice>> continuation) {
        return DBUtil.performSuspending(this.f11911a, true, false, new Function1() { // from class: r26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32103a.w((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDao
    public Object queryDevices(final int i, Continuation<? super List<? extends WearableDevice>> continuation) {
        return DBUtil.performSuspending(this.f11911a, true, false, new Function1() { // from class: s26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33198a.x(i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ WearableDevice t(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? m(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit u(WearableDevice[] wearableDeviceArr, SQLiteConnection sQLiteConnection) {
        this.f11912b.insert(sQLiteConnection, wearableDeviceArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDao
    public Object updateBindDeviceList(final List<? extends WearableDevice> list, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.f11911a, new Function1() { // from class: x26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f38600a.z(list, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ List v(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    public final /* synthetic */ List w(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraValues");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifier");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "detail");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uploaded");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                WearableDevice wearableDevice = new WearableDevice();
                wearableDevice.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                wearableDevice.setProductId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                wearableDevice.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                wearableDevice.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                wearableDevice.setExtraValues(this.c.stringToMap(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
                wearableDevice.setIdentifier(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                wearableDevice.setAlias(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                wearableDevice.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                wearableDevice.setDetail(this.c.stringToDetail(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                wearableDevice.setUploaded((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                arrayList.add(wearableDevice);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ List x(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device WHERE status = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraValues");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifier");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "detail");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uploaded");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                WearableDevice wearableDevice = new WearableDevice();
                wearableDevice.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                wearableDevice.setProductId((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                wearableDevice.setModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                wearableDevice.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                wearableDevice.setExtraValues(this.c.stringToMap(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)));
                wearableDevice.setIdentifier(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                wearableDevice.setAlias(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                wearableDevice.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                wearableDevice.setDetail(this.c.stringToDetail(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                wearableDevice.setUploaded((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                arrayList.add(wearableDevice);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Integer y(WearableDevice wearableDevice, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.e.handle(sQLiteConnection, wearableDevice));
    }

    public final /* synthetic */ Object z(List list, Continuation continuation) {
        return DeviceDao.DefaultImpls.updateBindDeviceList(this, list, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDao
    public Object delete(Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f11911a, false, true, new Function1() { // from class: q26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.q((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDao
    public Object delete(final int i, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f11911a, false, true, new Function1() { // from class: o26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.r(i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.DeviceDao
    public Object delete(final String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f11911a, false, true, new Function1() { // from class: y26
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.s(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
