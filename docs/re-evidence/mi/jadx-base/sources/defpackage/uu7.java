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
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.eco.device.manager.dao.EcoLocalDeviceDao;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceConverter;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class uu7 implements EcoLocalDeviceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f36146a;
    public final EcoDeviceConverter c = new EcoDeviceConverter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<EcoLocalDevice> f36147b = new a();
    public final EntityDeleteOrUpdateAdapter<EcoLocalDevice> d = new b();
    public final EntityDeleteOrUpdateAdapter<EcoLocalDevice> e = new c();

    public class a extends EntityInsertAdapter<EcoLocalDevice> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, EcoLocalDevice ecoLocalDevice) {
            if (ecoLocalDevice.getAppDeviceId() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, ecoLocalDevice.getAppDeviceId());
            }
            if (ecoLocalDevice.getAppToken() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, ecoLocalDevice.getAppToken());
            }
            if (ecoLocalDevice.getSn() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, ecoLocalDevice.getSn());
            }
            if (ecoLocalDevice.getOob() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, ecoLocalDevice.getOob());
            }
            if (ecoLocalDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, ecoLocalDevice.getDid());
            }
            sQLiteStatement.mo50bindLong(6, ecoLocalDevice.getProductId());
            if (ecoLocalDevice.getModel() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, ecoLocalDevice.getModel());
            }
            if (ecoLocalDevice.getName() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, ecoLocalDevice.getName());
            }
            if (ecoLocalDevice.getAlias() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, ecoLocalDevice.getAlias());
            }
            String strDetailToString = uu7.this.c.detailToString(ecoLocalDevice.getDetail());
            if (strDetailToString == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, strDetailToString);
            }
            String strMapToString = uu7.this.c.mapToString(ecoLocalDevice.getExtraValues());
            if (strMapToString == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, strMapToString);
            }
            if (ecoLocalDevice.getIdentifier() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, ecoLocalDevice.getIdentifier());
            }
            sQLiteStatement.mo50bindLong(13, ecoLocalDevice.getStatus());
            sQLiteStatement.mo50bindLong(14, ecoLocalDevice.getDeviceType());
            sQLiteStatement.mo50bindLong(15, ecoLocalDevice.getIsOwner() ? 1L : 0L);
            if (ecoLocalDevice.getUserId() == null) {
                sQLiteStatement.mo51bindNull(16);
            } else {
                sQLiteStatement.mo52bindText(16, ecoLocalDevice.getUserId());
            }
            if (ecoLocalDevice.getShareUserId() == null) {
                sQLiteStatement.mo51bindNull(17);
            } else {
                sQLiteStatement.mo52bindText(17, ecoLocalDevice.getShareUserId());
            }
            if (ecoLocalDevice.getShareId() == null) {
                sQLiteStatement.mo51bindNull(18);
            } else {
                sQLiteStatement.mo52bindText(18, ecoLocalDevice.getShareId());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `eco_local_device` (`app_device_id`,`token`,`sn`,`oob`,`did`,`productId`,`model`,`name`,`alias`,`detail`,`extraValues`,`identifier`,`status`,`deviceType`,`isOwner`,`userId`,`shareUserId`,`shareId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<EcoLocalDevice> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, EcoLocalDevice ecoLocalDevice) {
            if (ecoLocalDevice.getAppDeviceId() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, ecoLocalDevice.getAppDeviceId());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `eco_local_device` WHERE `app_device_id` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<EcoLocalDevice> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, EcoLocalDevice ecoLocalDevice) {
            if (ecoLocalDevice.getAppDeviceId() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, ecoLocalDevice.getAppDeviceId());
            }
            if (ecoLocalDevice.getAppToken() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, ecoLocalDevice.getAppToken());
            }
            if (ecoLocalDevice.getSn() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, ecoLocalDevice.getSn());
            }
            if (ecoLocalDevice.getOob() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, ecoLocalDevice.getOob());
            }
            if (ecoLocalDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, ecoLocalDevice.getDid());
            }
            sQLiteStatement.mo50bindLong(6, ecoLocalDevice.getProductId());
            if (ecoLocalDevice.getModel() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, ecoLocalDevice.getModel());
            }
            if (ecoLocalDevice.getName() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, ecoLocalDevice.getName());
            }
            if (ecoLocalDevice.getAlias() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, ecoLocalDevice.getAlias());
            }
            String strDetailToString = uu7.this.c.detailToString(ecoLocalDevice.getDetail());
            if (strDetailToString == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, strDetailToString);
            }
            String strMapToString = uu7.this.c.mapToString(ecoLocalDevice.getExtraValues());
            if (strMapToString == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, strMapToString);
            }
            if (ecoLocalDevice.getIdentifier() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, ecoLocalDevice.getIdentifier());
            }
            sQLiteStatement.mo50bindLong(13, ecoLocalDevice.getStatus());
            sQLiteStatement.mo50bindLong(14, ecoLocalDevice.getDeviceType());
            sQLiteStatement.mo50bindLong(15, ecoLocalDevice.getIsOwner() ? 1L : 0L);
            if (ecoLocalDevice.getUserId() == null) {
                sQLiteStatement.mo51bindNull(16);
            } else {
                sQLiteStatement.mo52bindText(16, ecoLocalDevice.getUserId());
            }
            if (ecoLocalDevice.getShareUserId() == null) {
                sQLiteStatement.mo51bindNull(17);
            } else {
                sQLiteStatement.mo52bindText(17, ecoLocalDevice.getShareUserId());
            }
            if (ecoLocalDevice.getShareId() == null) {
                sQLiteStatement.mo51bindNull(18);
            } else {
                sQLiteStatement.mo52bindText(18, ecoLocalDevice.getShareId());
            }
            if (ecoLocalDevice.getAppDeviceId() == null) {
                sQLiteStatement.mo51bindNull(19);
            } else {
                sQLiteStatement.mo52bindText(19, ecoLocalDevice.getAppDeviceId());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `eco_local_device` SET `app_device_id` = ?,`token` = ?,`sn` = ?,`oob` = ?,`did` = ?,`productId` = ?,`model` = ?,`name` = ?,`alias` = ?,`detail` = ?,`extraValues` = ?,`identifier` = ?,`status` = ?,`deviceType` = ?,`isOwner` = ?,`userId` = ?,`shareUserId` = ?,`shareId` = ? WHERE `app_device_id` = ?";
        }
    }

    public uu7(RoomDatabase roomDatabase) {
        this.f36146a = roomDatabase;
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit n(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM eco_local_device");
        try {
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(j(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List r(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM eco_local_device");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "app_device_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "token");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "oob");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "detail");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraValues");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifier");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceType");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isOwner");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareUserId");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                EcoLocalDevice ecoLocalDevice = new EcoLocalDevice(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), this.c.stringToDetail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                ecoLocalDevice.setExtraValues(this.c.stringToMap(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                ecoLocalDevice.setIdentifier(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                ecoLocalDevice.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                int i = columnIndexOrThrow14;
                int i2 = columnIndexOrThrow4;
                ecoLocalDevice.setDeviceType((int) sQLiteStatementPrepare.getLong(i));
                int i3 = columnIndexOrThrow15;
                int i4 = columnIndexOrThrow5;
                ecoLocalDevice.setOwner(((int) sQLiteStatementPrepare.getLong(i3)) != 0);
                int i5 = columnIndexOrThrow16;
                ecoLocalDevice.setUserId(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                int i6 = columnIndexOrThrow17;
                ecoLocalDevice.setShareUserId(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                int i7 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i7;
                ecoLocalDevice.setShareId(sQLiteStatementPrepare.isNull(i7) ? null : sQLiteStatementPrepare.getText(i7));
                arrayList.add(ecoLocalDevice);
                columnIndexOrThrow16 = i5;
                columnIndexOrThrow17 = i6;
                columnIndexOrThrow5 = i4;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow4 = i2;
                columnIndexOrThrow14 = i;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow2 = columnIndexOrThrow2;
                columnIndexOrThrow3 = columnIndexOrThrow3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoLocalDeviceDao
    public Object delete(final EcoLocalDevice[] ecoLocalDeviceArr, Continuation<? super Integer> continuation) {
        ecoLocalDeviceArr.getClass();
        return DBUtil.performSuspending(this.f36146a, false, true, new Function1() { // from class: ou7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f29682a.m(ecoLocalDeviceArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoLocalDeviceDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f36146a, false, true, new Function1() { // from class: mu7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return uu7.n((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super EcoLocalDevice> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f36146a, true, false, new Function1() { // from class: tu7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35048a.o(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final EcoLocalDevice j(SQLiteStatement sQLiteStatement) {
        Device.Detail detailStringToDetail;
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "app_device_id");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "token");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sn");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "oob");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "productId");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "model");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "name");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "alias");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "detail");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "extraValues");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "identifier");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "status");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "deviceType");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isOwner");
        int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "userId");
        int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "shareUserId");
        int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "shareId");
        String text = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text2 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        String text3 = (columnIndex3 == -1 || sQLiteStatement.isNull(columnIndex3)) ? null : sQLiteStatement.getText(columnIndex3);
        String text4 = (columnIndex4 == -1 || sQLiteStatement.isNull(columnIndex4)) ? null : sQLiteStatement.getText(columnIndex4);
        String text5 = (columnIndex5 == -1 || sQLiteStatement.isNull(columnIndex5)) ? null : sQLiteStatement.getText(columnIndex5);
        int i = columnIndex6 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex6);
        String text6 = (columnIndex7 == -1 || sQLiteStatement.isNull(columnIndex7)) ? null : sQLiteStatement.getText(columnIndex7);
        String text7 = (columnIndex8 == -1 || sQLiteStatement.isNull(columnIndex8)) ? null : sQLiteStatement.getText(columnIndex8);
        String text8 = (columnIndex9 == -1 || sQLiteStatement.isNull(columnIndex9)) ? null : sQLiteStatement.getText(columnIndex9);
        if (columnIndex10 == -1) {
            detailStringToDetail = null;
        } else {
            detailStringToDetail = this.c.stringToDetail(sQLiteStatement.isNull(columnIndex10) ? null : sQLiteStatement.getText(columnIndex10));
        }
        EcoLocalDevice ecoLocalDevice = new EcoLocalDevice(text, text2, text3, text4, text5, i, text6, text7, text8, detailStringToDetail);
        if (columnIndex11 != -1) {
            ecoLocalDevice.setExtraValues(this.c.stringToMap(sQLiteStatement.isNull(columnIndex11) ? null : sQLiteStatement.getText(columnIndex11)));
        }
        if (columnIndex12 != -1) {
            ecoLocalDevice.setIdentifier(sQLiteStatement.isNull(columnIndex12) ? null : sQLiteStatement.getText(columnIndex12));
        }
        if (columnIndex13 != -1) {
            ecoLocalDevice.setStatus((int) sQLiteStatement.getLong(columnIndex13));
        }
        if (columnIndex14 != -1) {
            ecoLocalDevice.setDeviceType((int) sQLiteStatement.getLong(columnIndex14));
        }
        if (columnIndex15 != -1) {
            ecoLocalDevice.setOwner(((int) sQLiteStatement.getLong(columnIndex15)) != 0);
        }
        if (columnIndex16 != -1) {
            ecoLocalDevice.setUserId(sQLiteStatement.isNull(columnIndex16) ? null : sQLiteStatement.getText(columnIndex16));
        }
        if (columnIndex17 != -1) {
            ecoLocalDevice.setShareUserId(sQLiteStatement.isNull(columnIndex17) ? null : sQLiteStatement.getText(columnIndex17));
        }
        if (columnIndex18 != -1) {
            ecoLocalDevice.setShareId(sQLiteStatement.isNull(columnIndex18) ? null : sQLiteStatement.getText(columnIndex18));
        }
        return ecoLocalDevice;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Object insert(final EcoLocalDevice[] ecoLocalDeviceArr, Continuation<? super Unit> continuation) {
        ecoLocalDeviceArr.getClass();
        return DBUtil.performSuspending(this.f36146a, false, true, new Function1() { // from class: qu7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31847a.p(ecoLocalDeviceArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<EcoLocalDevice>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f36146a, true, false, new Function1() { // from class: pu7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30784a.q(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Integer m(EcoLocalDevice[] ecoLocalDeviceArr, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handleMultiple(sQLiteConnection, ecoLocalDeviceArr));
    }

    public final /* synthetic */ EcoLocalDevice o(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? j(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit p(EcoLocalDevice[] ecoLocalDeviceArr, SQLiteConnection sQLiteConnection) {
        this.f36147b.insert(sQLiteConnection, ecoLocalDeviceArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoLocalDeviceDao
    public Object queryAllLocalDevices(Continuation<? super List<EcoLocalDevice>> continuation) {
        return DBUtil.performSuspending(this.f36146a, true, false, new Function1() { // from class: su7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33990a.r((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.dao.EcoLocalDeviceDao
    public Object queryLocalDevices(final String str, Continuation<? super EcoLocalDevice> continuation) {
        return DBUtil.performSuspending(this.f36146a, true, false, new Function1() { // from class: nu7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f28372a.s(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ EcoLocalDevice s(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM eco_local_device WHERE app_device_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "app_device_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "token");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sn");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "oob");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "detail");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraValues");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifier");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceType");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isOwner");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareUserId");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shareId");
            EcoLocalDevice ecoLocalDevice = null;
            if (sQLiteStatementPrepare.step()) {
                EcoLocalDevice ecoLocalDevice2 = new EcoLocalDevice(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), this.c.stringToDetail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                ecoLocalDevice2.setExtraValues(this.c.stringToMap(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                ecoLocalDevice2.setIdentifier(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                ecoLocalDevice2.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                ecoLocalDevice2.setDeviceType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                ecoLocalDevice2.setOwner(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15)) != 0);
                ecoLocalDevice2.setUserId(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16));
                ecoLocalDevice2.setShareUserId(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                ecoLocalDevice2.setShareId(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                ecoLocalDevice = ecoLocalDevice2;
            }
            sQLiteStatementPrepare.close();
            return ecoLocalDevice;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Integer t(EcoLocalDevice ecoLocalDevice, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.e.handle(sQLiteConnection, ecoLocalDevice));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Object update(final EcoLocalDevice ecoLocalDevice, Continuation<? super Integer> continuation) {
        ecoLocalDevice.getClass();
        return DBUtil.performSuspending(this.f36146a, false, true, new Function1() { // from class: ru7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32908a.t(ecoLocalDevice, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
