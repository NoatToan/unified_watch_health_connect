package com.xiaomi.fitness.eco.device.manager.dao;

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
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.eco.device.manager.dao.a;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements EcoDeviceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12084a;
    public final EcoDeviceConverter c = new EcoDeviceConverter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<EcoDevice> f12085b = new C0555a();
    public final EntityDeleteOrUpdateAdapter<EcoDevice> d = new b();

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.dao.a$a, reason: collision with other inner class name */
    public class C0555a extends EntityInsertAdapter<EcoDevice> {
        public C0555a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, EcoDevice ecoDevice) {
            if (ecoDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, ecoDevice.getDid());
            }
            sQLiteStatement.mo50bindLong(2, ecoDevice.getProductId());
            if (ecoDevice.getModel() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, ecoDevice.getModel());
            }
            if (ecoDevice.getName() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, ecoDevice.getName());
            }
            String strMapToString = a.this.c.mapToString(ecoDevice.getExtraValues());
            if (strMapToString == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, strMapToString);
            }
            if (ecoDevice.getIdentifier() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, ecoDevice.getIdentifier());
            }
            if (ecoDevice.getAlias() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, ecoDevice.getAlias());
            }
            sQLiteStatement.mo50bindLong(8, ecoDevice.getStatus());
            String strDetailToString = a.this.c.detailToString(ecoDevice.getDetail());
            if (strDetailToString == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, strDetailToString);
            }
            sQLiteStatement.mo50bindLong(10, ecoDevice.getDeviceType());
            sQLiteStatement.mo50bindLong(11, ecoDevice.getIsOwner() ? 1L : 0L);
            if (ecoDevice.getUserId() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, ecoDevice.getUserId());
            }
            if (ecoDevice.getShareUserId() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, ecoDevice.getShareUserId());
            }
            if (ecoDevice.getShareId() == null) {
                sQLiteStatement.mo51bindNull(14);
            } else {
                sQLiteStatement.mo52bindText(14, ecoDevice.getShareId());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `eco_device` (`did`,`productId`,`model`,`name`,`extraValues`,`identifier`,`alias`,`status`,`detail`,`deviceType`,`isOwner`,`userId`,`shareUserId`,`shareId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<EcoDevice> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, EcoDevice ecoDevice) {
            if (ecoDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, ecoDevice.getDid());
            }
            sQLiteStatement.mo50bindLong(2, ecoDevice.getProductId());
            if (ecoDevice.getModel() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, ecoDevice.getModel());
            }
            if (ecoDevice.getName() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, ecoDevice.getName());
            }
            String strMapToString = a.this.c.mapToString(ecoDevice.getExtraValues());
            if (strMapToString == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, strMapToString);
            }
            if (ecoDevice.getIdentifier() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, ecoDevice.getIdentifier());
            }
            if (ecoDevice.getAlias() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, ecoDevice.getAlias());
            }
            sQLiteStatement.mo50bindLong(8, ecoDevice.getStatus());
            String strDetailToString = a.this.c.detailToString(ecoDevice.getDetail());
            if (strDetailToString == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, strDetailToString);
            }
            sQLiteStatement.mo50bindLong(10, ecoDevice.getDeviceType());
            sQLiteStatement.mo50bindLong(11, ecoDevice.getIsOwner() ? 1L : 0L);
            if (ecoDevice.getUserId() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, ecoDevice.getUserId());
            }
            if (ecoDevice.getShareUserId() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, ecoDevice.getShareUserId());
            }
            if (ecoDevice.getShareId() == null) {
                sQLiteStatement.mo51bindNull(14);
            } else {
                sQLiteStatement.mo52bindText(14, ecoDevice.getShareId());
            }
            if (ecoDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(15);
            } else {
                sQLiteStatement.mo52bindText(15, ecoDevice.getDid());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `eco_device` SET `did` = ?,`productId` = ?,`model` = ?,`name` = ?,`extraValues` = ?,`identifier` = ?,`alias` = ?,`status` = ?,`detail` = ?,`deviceType` = ?,`isOwner` = ?,`userId` = ?,`shareUserId` = ?,`shareId` = ? WHERE `did` = ?";
        }
    }

    public a(RoomDatabase roomDatabase) {
        this.f12084a = roomDatabase;
    }

    public static List<Class<?>> m() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit o(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM eco_device");
        try {
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Unit p(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM eco_device WHERE status = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Unit q(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM eco_device WHERE did = ?");
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

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao
    public Object delete(Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f12084a, false, true, new Function1() { // from class: hr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.o((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super EcoDevice> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f12084a, true, false, new Function1() { // from class: ir7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22012a.r(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final EcoDevice l(SQLiteStatement sQLiteStatement) {
        Map<String, String> mapStringToMap;
        Device.Detail detailStringToDetail;
        boolean z;
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "productId");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "model");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "name");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "extraValues");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "identifier");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "alias");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "status");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "detail");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "deviceType");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isOwner");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "userId");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "shareUserId");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "shareId");
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        int i = columnIndex2 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex2);
        String text3 = (columnIndex3 == -1 || sQLiteStatement.isNull(columnIndex3)) ? null : sQLiteStatement.getText(columnIndex3);
        String text4 = (columnIndex4 == -1 || sQLiteStatement.isNull(columnIndex4)) ? null : sQLiteStatement.getText(columnIndex4);
        if (columnIndex5 == -1) {
            mapStringToMap = null;
        } else {
            mapStringToMap = this.c.stringToMap(sQLiteStatement.isNull(columnIndex5) ? null : sQLiteStatement.getText(columnIndex5));
        }
        String text5 = (columnIndex6 == -1 || sQLiteStatement.isNull(columnIndex6)) ? null : sQLiteStatement.getText(columnIndex6);
        String text6 = (columnIndex7 == -1 || sQLiteStatement.isNull(columnIndex7)) ? null : sQLiteStatement.getText(columnIndex7);
        int i2 = columnIndex8 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex8);
        if (columnIndex9 == -1) {
            detailStringToDetail = null;
        } else {
            detailStringToDetail = this.c.stringToDetail(sQLiteStatement.isNull(columnIndex9) ? null : sQLiteStatement.getText(columnIndex9));
        }
        int i3 = columnIndex10 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex10);
        if (columnIndex11 == -1) {
            z = false;
        } else {
            z = ((int) sQLiteStatement.getLong(columnIndex11)) != 0;
        }
        String text7 = (columnIndex12 == -1 || sQLiteStatement.isNull(columnIndex12)) ? null : sQLiteStatement.getText(columnIndex12);
        String text8 = (columnIndex13 == -1 || sQLiteStatement.isNull(columnIndex13)) ? null : sQLiteStatement.getText(columnIndex13);
        if (columnIndex14 != -1 && !sQLiteStatement.isNull(columnIndex14)) {
            text = sQLiteStatement.getText(columnIndex14);
        }
        return new EcoDevice(text2, i, text3, text4, mapStringToMap, text5, text6, i2, detailStringToDetail, i3, z, text7, text8, text);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<EcoDevice>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f12084a, true, false, new Function1() { // from class: jr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23052a.t(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object insert(final EcoDevice[] ecoDeviceArr, Continuation<? super Unit> continuation) {
        ecoDeviceArr.getClass();
        return DBUtil.performSuspending(this.f12084a, false, true, new Function1() { // from class: lr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f25370a.s(ecoDeviceArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao
    public Object queryAllDevices(Continuation<? super List<? extends EcoDevice>> continuation) {
        return DBUtil.performSuspending(this.f12084a, true, false, new Function1() { // from class: nr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f28284a.u((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao
    public Object queryDevices(final int i, Continuation<? super List<? extends EcoDevice>> continuation) {
        return DBUtil.performSuspending(this.f12084a, true, false, new Function1() { // from class: fr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18121a.v(i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ EcoDevice r(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? l(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit s(EcoDevice[] ecoDeviceArr, SQLiteConnection sQLiteConnection) {
        this.f12085b.insert(sQLiteConnection, ecoDeviceArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ List t(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(l(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ List u(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM eco_device");
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
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceType");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isOwner");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareUserId");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow4;
                EcoDevice ecoDevice = new EcoDevice(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), this.c.stringToMap(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), this.c.stringToDetail(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                ArrayList arrayList2 = arrayList;
                arrayList2.add(ecoDevice);
                columnIndexOrThrow13 = columnIndexOrThrow13;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow2 = columnIndexOrThrow2;
                arrayList = arrayList2;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow4 = i;
                columnIndexOrThrow14 = columnIndexOrThrow14;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao
    public Object updateBindDeviceList(final List<? extends EcoDevice> list, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.f12084a, new Function1() { // from class: mr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27124a.x(list, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ List v(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM eco_device WHERE status = ?");
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
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceType");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isOwner");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareUserId");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i2 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Map<String, String> mapStringToMap = this.c.stringToMap(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                Device.Detail detailStringToDetail = this.c.stringToDetail(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i5 = columnIndexOrThrow4;
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                int i6 = columnIndexOrThrow13;
                String text7 = sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                columnIndexOrThrow14 = columnIndexOrThrow14;
                arrayList.add(new EcoDevice(text, i2, text2, text3, mapStringToMap, text4, text5, i3, detailStringToDetail, i4, z, text6, text7, text8));
                columnIndexOrThrow12 = columnIndexOrThrow12;
                columnIndexOrThrow2 = columnIndexOrThrow2;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow13 = i6;
                columnIndexOrThrow4 = i5;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Integer w(EcoDevice ecoDevice, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, ecoDevice));
    }

    public final /* synthetic */ Object x(List list, Continuation continuation) {
        return EcoDeviceDao.DefaultImpls.updateBindDeviceList(this, list, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Object update(final EcoDevice ecoDevice, Continuation<? super Integer> continuation) {
        ecoDevice.getClass();
        return DBUtil.performSuspending(this.f12084a, false, true, new Function1() { // from class: er7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16986a.w(ecoDevice, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao
    public Object delete(final int i, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f12084a, false, true, new Function1() { // from class: kr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.p(i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao
    public Object delete(final String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f12084a, false, true, new Function1() { // from class: gr7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.q(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
