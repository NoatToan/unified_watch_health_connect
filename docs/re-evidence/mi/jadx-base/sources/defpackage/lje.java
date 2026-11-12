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
import com.xiaomi.fitness.device.manager.bean.DeviceConverter;
import com.xiaomi.fitness.device.manager.dao.LocalDeviceDao;
import com.xiaomi.fitness.device.manager.export.bean.LocalDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class lje implements LocalDeviceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f25125a;
    public final DeviceConverter c = new DeviceConverter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<LocalDevice> f25126b = new a();
    public final EntityDeleteOrUpdateAdapter<LocalDevice> d = new b();
    public final EntityDeleteOrUpdateAdapter<LocalDevice> e = new c();

    public class a extends EntityInsertAdapter<LocalDevice> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, LocalDevice localDevice) {
            if (localDevice.getAppDeviceId() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, localDevice.getAppDeviceId());
            }
            if (localDevice.getAppToken() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, localDevice.getAppToken());
            }
            if (localDevice.getSn() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, localDevice.getSn());
            }
            if (localDevice.getOob() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, localDevice.getOob());
            }
            if (localDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, localDevice.getDid());
            }
            sQLiteStatement.mo50bindLong(6, localDevice.getProductId());
            if (localDevice.getModel() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, localDevice.getModel());
            }
            if (localDevice.getName() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, localDevice.getName());
            }
            if (localDevice.getAlias() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, localDevice.getAlias());
            }
            String strDetailToString = lje.this.c.detailToString(localDevice.getDetail());
            if (strDetailToString == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, strDetailToString);
            }
            String strMapToString = lje.this.c.mapToString(localDevice.getExtraValues());
            if (strMapToString == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, strMapToString);
            }
            if (localDevice.getIdentifier() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, localDevice.getIdentifier());
            }
            sQLiteStatement.mo50bindLong(13, localDevice.getStatus());
            sQLiteStatement.mo50bindLong(14, localDevice.getUploaded());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `local_device` (`app_device_id`,`token`,`sn`,`oob`,`did`,`productId`,`model`,`name`,`alias`,`detail`,`extraValues`,`identifier`,`status`,`uploaded`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<LocalDevice> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, LocalDevice localDevice) {
            if (localDevice.getAppDeviceId() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, localDevice.getAppDeviceId());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `local_device` WHERE `app_device_id` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<LocalDevice> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, LocalDevice localDevice) {
            if (localDevice.getAppDeviceId() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, localDevice.getAppDeviceId());
            }
            if (localDevice.getAppToken() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, localDevice.getAppToken());
            }
            if (localDevice.getSn() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, localDevice.getSn());
            }
            if (localDevice.getOob() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, localDevice.getOob());
            }
            if (localDevice.getDid() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, localDevice.getDid());
            }
            sQLiteStatement.mo50bindLong(6, localDevice.getProductId());
            if (localDevice.getModel() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, localDevice.getModel());
            }
            if (localDevice.getName() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, localDevice.getName());
            }
            if (localDevice.getAlias() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, localDevice.getAlias());
            }
            String strDetailToString = lje.this.c.detailToString(localDevice.getDetail());
            if (strDetailToString == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, strDetailToString);
            }
            String strMapToString = lje.this.c.mapToString(localDevice.getExtraValues());
            if (strMapToString == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, strMapToString);
            }
            if (localDevice.getIdentifier() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, localDevice.getIdentifier());
            }
            sQLiteStatement.mo50bindLong(13, localDevice.getStatus());
            sQLiteStatement.mo50bindLong(14, localDevice.getUploaded());
            if (localDevice.getAppDeviceId() == null) {
                sQLiteStatement.mo51bindNull(15);
            } else {
                sQLiteStatement.mo52bindText(15, localDevice.getAppDeviceId());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `local_device` SET `app_device_id` = ?,`token` = ?,`sn` = ?,`oob` = ?,`did` = ?,`productId` = ?,`model` = ?,`name` = ?,`alias` = ?,`detail` = ?,`extraValues` = ?,`identifier` = ?,`status` = ?,`uploaded` = ? WHERE `app_device_id` = ?";
        }
    }

    public lje(RoomDatabase roomDatabase) {
        this.f25125a = roomDatabase;
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit n(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM local_device");
        try {
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.dao.LocalDeviceDao
    public Object delete(final LocalDevice[] localDeviceArr, Continuation<? super Integer> continuation) {
        localDeviceArr.getClass();
        return DBUtil.performSuspending(this.f25125a, false, true, new Function1() { // from class: gje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f19053a.m(localDeviceArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.LocalDeviceDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f25125a, false, true, new Function1() { // from class: fje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return lje.n((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super LocalDevice> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f25125a, true, false, new Function1() { // from class: hje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f20127a.o(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final LocalDevice j(SQLiteStatement sQLiteStatement) {
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
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "uploaded");
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
        LocalDevice localDevice = new LocalDevice(text, text2, text3, text4, text5, i, text6, text7, text8, detailStringToDetail);
        if (columnIndex11 != -1) {
            localDevice.setExtraValues(this.c.stringToMap(sQLiteStatement.isNull(columnIndex11) ? null : sQLiteStatement.getText(columnIndex11)));
        }
        if (columnIndex12 != -1) {
            localDevice.setIdentifier(sQLiteStatement.isNull(columnIndex12) ? null : sQLiteStatement.getText(columnIndex12));
        }
        if (columnIndex13 != -1) {
            localDevice.setStatus((int) sQLiteStatement.getLong(columnIndex13));
        }
        if (columnIndex14 != -1) {
            localDevice.setUploaded((int) sQLiteStatement.getLong(columnIndex14));
        }
        return localDevice;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Object insert(final LocalDevice[] localDeviceArr, Continuation<? super Unit> continuation) {
        localDeviceArr.getClass();
        return DBUtil.performSuspending(this.f25125a, false, true, new Function1() { // from class: dje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15589a.p(localDeviceArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<LocalDevice>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f25125a, true, false, new Function1() { // from class: eje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16703a.q(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Integer m(LocalDevice[] localDeviceArr, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handleMultiple(sQLiteConnection, localDeviceArr));
    }

    public final /* synthetic */ LocalDevice o(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? j(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit p(LocalDevice[] localDeviceArr, SQLiteConnection sQLiteConnection) {
        this.f25126b.insert(sQLiteConnection, localDeviceArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ List q(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    @Override // com.xiaomi.fitness.device.manager.dao.LocalDeviceDao
    public Object queryAllLocalDevices(Continuation<? super List<LocalDevice>> continuation) {
        return DBUtil.performSuspending(this.f25125a, true, false, new Function1() { // from class: ije
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f21220a.r((SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.device.manager.dao.LocalDeviceDao
    public Object queryLocalDevices(final String str, Continuation<? super LocalDevice> continuation) {
        return DBUtil.performSuspending(this.f25125a, true, false, new Function1() { // from class: kje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23917a.s(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ List r(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM local_device");
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
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uploaded");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                LocalDevice localDevice = new LocalDevice(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), this.c.stringToDetail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                localDevice.setExtraValues(this.c.stringToMap(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                localDevice.setIdentifier(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                localDevice.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                int i = columnIndexOrThrow14;
                int i2 = columnIndexOrThrow4;
                localDevice.setUploaded((int) sQLiteStatementPrepare.getLong(i));
                arrayList.add(localDevice);
                columnIndexOrThrow4 = i2;
                columnIndexOrThrow14 = i;
                columnIndexOrThrow2 = columnIndexOrThrow2;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow = columnIndexOrThrow;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ LocalDevice s(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM local_device WHERE app_device_id = ?");
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
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uploaded");
            LocalDevice localDevice = null;
            if (sQLiteStatementPrepare.step()) {
                LocalDevice localDevice2 = new LocalDevice(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), this.c.stringToDetail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)));
                localDevice2.setExtraValues(this.c.stringToMap(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                localDevice2.setIdentifier(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                localDevice2.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                localDevice2.setUploaded((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                localDevice = localDevice2;
            }
            sQLiteStatementPrepare.close();
            return localDevice;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Integer t(LocalDevice localDevice, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.e.handle(sQLiteConnection, localDevice));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Object update(final LocalDevice localDevice, Continuation<? super Integer> continuation) {
        localDevice.getClass();
        return DBUtil.performSuspending(this.f25125a, false, true, new Function1() { // from class: jje
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22860a.t(localDevice, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
