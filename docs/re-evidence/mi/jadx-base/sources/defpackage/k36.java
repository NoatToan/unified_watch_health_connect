package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.db.dao.DataSyncEntity;
import com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class k36 implements DeviceDataSyncDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<DataSyncEntity> f23378b = new a();
    public final EntityDeleteOrUpdateAdapter<DataSyncEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<DataSyncEntity> d = new c();

    public class a extends EntityInsertAdapter<DataSyncEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, DataSyncEntity dataSyncEntity) {
            if (dataSyncEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, dataSyncEntity.getSid());
            }
            if (dataSyncEntity.getIdBytes() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo48bindBlob(2, dataSyncEntity.getIdBytes());
            }
            sQLiteStatement.mo50bindLong(3, dataSyncEntity.getSyncStatus());
            sQLiteStatement.mo50bindLong(4, dataSyncEntity.getForceSync() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `device_sync` (`sid`,`idBytes`,`syncStatus`,`forceSync`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<DataSyncEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, DataSyncEntity dataSyncEntity) {
            if (dataSyncEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, dataSyncEntity.getSid());
            }
            if (dataSyncEntity.getIdBytes() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo48bindBlob(2, dataSyncEntity.getIdBytes());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `device_sync` WHERE `sid` = ? AND `idBytes` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<DataSyncEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, DataSyncEntity dataSyncEntity) {
            if (dataSyncEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, dataSyncEntity.getSid());
            }
            if (dataSyncEntity.getIdBytes() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo48bindBlob(2, dataSyncEntity.getIdBytes());
            }
            sQLiteStatement.mo50bindLong(3, dataSyncEntity.getSyncStatus());
            sQLiteStatement.mo50bindLong(4, dataSyncEntity.getForceSync() ? 1L : 0L);
            if (dataSyncEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, dataSyncEntity.getSid());
            }
            if (dataSyncEntity.getIdBytes() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo48bindBlob(6, dataSyncEntity.getIdBytes());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `device_sync` SET `sid` = ?,`idBytes` = ?,`syncStatus` = ?,`forceSync` = ? WHERE `sid` = ? AND `idBytes` = ?";
        }
    }

    public k36(RoomDatabase roomDatabase) {
        this.f23377a = roomDatabase;
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    public static /* synthetic */ DataSyncEntity j(String str, byte[] bArr, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device_sync WHERE sid = ? AND idBytes = ?");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            if (bArr == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo48bindBlob(2, bArr);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "forceSync");
            DataSyncEntity dataSyncEntity = null;
            byte[] blob = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow2);
                }
                int i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) == 0) {
                    z = false;
                }
                dataSyncEntity = new DataSyncEntity(text, blob, i, z);
            }
            sQLiteStatementPrepare.close();
            return dataSyncEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List k(String str, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device_sync WHERE sid = ? AND syncStatus < ? AND forceSync = 1");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "forceSync");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                byte[] blob = null;
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow2);
                }
                arrayList.add(new DataSyncEntity(text, blob, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List l(String str, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device_sync WHERE sid = ? AND syncStatus < ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "forceSync");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                byte[] blob = null;
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow2);
                }
                arrayList.add(new DataSyncEntity(text, blob, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ DataSyncEntity m(String str, byte[] bArr, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM device_sync WHERE sid =? AND idBytes = ?");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            if (bArr == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo48bindBlob(2, bArr);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "forceSync");
            DataSyncEntity dataSyncEntity = null;
            byte[] blob = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow2);
                }
                int i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) == 0) {
                    z = false;
                }
                dataSyncEntity = new DataSyncEntity(text, blob, i, z);
            }
            sQLiteStatementPrepare.close();
            return dataSyncEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao
    public Object delete(final DataSyncEntity[] dataSyncEntityArr, Continuation<? super Unit> continuation) {
        dataSyncEntityArr.getClass();
        return DBUtil.performSuspending(this.f23377a, false, true, new Function1() { // from class: j36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22372a.i(dataSyncEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao
    public Object get(final String str, final byte[] bArr, Continuation<? super DataSyncEntity> continuation) {
        return DBUtil.performSuspending(this.f23377a, true, false, new Function1() { // from class: g36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return k36.j(str, bArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao
    public Object getForceSyncStatusLessThan(final String str, final int i, Continuation<? super List<DataSyncEntity>> continuation) {
        return DBUtil.performSuspending(this.f23377a, true, false, new Function1() { // from class: h36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return k36.k(str, i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao
    public Object getSyncStatusLessThan(final String str, final int i, Continuation<? super List<DataSyncEntity>> continuation) {
        return DBUtil.performSuspending(this.f23377a, true, false, new Function1() { // from class: i36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return k36.l(str, i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao
    public Object getTheSyncStatus(final String str, final byte[] bArr, Continuation<? super DataSyncEntity> continuation) {
        return DBUtil.performSuspending(this.f23377a, true, false, new Function1() { // from class: f36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return k36.m(str, bArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit i(DataSyncEntity[] dataSyncEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, dataSyncEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao
    public Object insertAll(final DataSyncEntity[] dataSyncEntityArr, Continuation<? super Unit> continuation) {
        dataSyncEntityArr.getClass();
        return DBUtil.performSuspending(this.f23377a, false, true, new Function1() { // from class: e36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16210a.n(dataSyncEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit n(DataSyncEntity[] dataSyncEntityArr, SQLiteConnection sQLiteConnection) {
        this.f23378b.insert(sQLiteConnection, dataSyncEntityArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Unit o(DataSyncEntity[] dataSyncEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, dataSyncEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fit.fitness.db.dao.DeviceDataSyncDao
    public Object updateAll(final DataSyncEntity[] dataSyncEntityArr, Continuation<? super Unit> continuation) {
        dataSyncEntityArr.getClass();
        return DBUtil.performSuspending(this.f23377a, false, true, new Function1() { // from class: d36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15030a.o(dataSyncEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
