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
import com.xiaomi.fitness.settingitem.db.dao.SettingDeviceDao;
import com.xiaomi.fitness.settingitem.db.entity.SettingDeviceEntity;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class h1m implements SettingDeviceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f19579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SettingDeviceEntity> f19580b = new a();
    public final EntityDeleteOrUpdateAdapter<SettingDeviceEntity> c = new b();

    public class a extends EntityInsertAdapter<SettingDeviceEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SettingDeviceEntity settingDeviceEntity) {
            if (settingDeviceEntity.getModule() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, settingDeviceEntity.getModule());
            }
            if (settingDeviceEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, settingDeviceEntity.getDid());
            }
            sQLiteStatement.mo50bindLong(3, settingDeviceEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(4, settingDeviceEntity.getLastId());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `settingdevice` (`module`,`did`,`updateTime`,`lastId`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<SettingDeviceEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SettingDeviceEntity settingDeviceEntity) {
            if (settingDeviceEntity.getModule() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, settingDeviceEntity.getModule());
            }
            if (settingDeviceEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, settingDeviceEntity.getDid());
            }
            sQLiteStatement.mo50bindLong(3, settingDeviceEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(4, settingDeviceEntity.getLastId());
            if (settingDeviceEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, settingDeviceEntity.getDid());
            }
            if (settingDeviceEntity.getModule() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, settingDeviceEntity.getModule());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `settingdevice` SET `module` = ?,`did` = ?,`updateTime` = ?,`lastId` = ? WHERE `did` = ? AND `module` = ?";
        }
    }

    public h1m(RoomDatabase roomDatabase) {
        this.f19579a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object l(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM settingdevice");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object m(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM settingdevice WHERE did = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ SettingDeviceEntity o(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM settingdevice WHERE did = ? AND module = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str2);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RnReportConst.ApiReport.PARAM_MODULE);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastId");
            SettingDeviceEntity settingDeviceEntity = null;
            if (sQLiteStatementPrepare.step()) {
                settingDeviceEntity = new SettingDeviceEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
            }
            sQLiteStatementPrepare.close();
            return settingDeviceEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List r(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(i(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingDeviceDao
    public void deleteAll() {
        DBUtil.performBlocking(this.f19579a, false, true, new Function1() { // from class: c1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return h1m.l((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingDeviceDao
    public void deleteByDid(final String str) {
        DBUtil.performBlocking(this.f19579a, false, true, new Function1() { // from class: a1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return h1m.m(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super SettingDeviceEntity> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f19579a, true, false, new Function1() { // from class: b1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f3690a.n(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingDeviceDao
    public SettingDeviceEntity getSetting(final String str, final String str2) {
        return (SettingDeviceEntity) DBUtil.performBlocking(this.f19579a, true, false, new Function1() { // from class: e1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return h1m.o(str, str2, (SQLiteConnection) obj);
            }
        });
    }

    public final SettingDeviceEntity i(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, RnReportConst.ApiReport.PARAM_MODULE);
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "updateTime");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "lastId");
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        if (columnIndex2 != -1 && !sQLiteStatement.isNull(columnIndex2)) {
            text = sQLiteStatement.getText(columnIndex2);
        }
        return new SettingDeviceEntity(text2, text, columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3), columnIndex4 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex4));
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingDeviceDao
    public long insertOrUpdateSettingDevice(final SettingDeviceEntity settingDeviceEntity) {
        settingDeviceEntity.getClass();
        return ((Long) DBUtil.performBlocking(this.f19579a, false, true, new Function1() { // from class: z0m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f40757a.q(settingDeviceEntity, (SQLiteConnection) obj);
            }
        })).longValue();
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Object insert(final SettingDeviceEntity[] settingDeviceEntityArr, Continuation<? super Unit> continuation) {
        settingDeviceEntityArr.getClass();
        return DBUtil.performSuspending(this.f19579a, false, true, new Function1() { // from class: d1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f14966a.p(settingDeviceEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<SettingDeviceEntity>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f19579a, true, false, new Function1() { // from class: f1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f17297a.r(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ SettingDeviceEntity n(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? i(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit p(SettingDeviceEntity[] settingDeviceEntityArr, SQLiteConnection sQLiteConnection) {
        this.f19580b.insert(sQLiteConnection, settingDeviceEntityArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Long q(SettingDeviceEntity settingDeviceEntity, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f19580b.insertAndReturnId(sQLiteConnection, settingDeviceEntity));
    }

    public final /* synthetic */ Integer s(SettingDeviceEntity settingDeviceEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.c.handle(sQLiteConnection, settingDeviceEntity));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Object update(final SettingDeviceEntity settingDeviceEntity, Continuation<? super Integer> continuation) {
        settingDeviceEntity.getClass();
        return DBUtil.performSuspending(this.f19579a, false, true, new Function1() { // from class: g1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18473a.s(settingDeviceEntity, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
