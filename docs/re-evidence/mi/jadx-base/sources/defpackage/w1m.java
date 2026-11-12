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
import com.xiaomi.fitness.settingitem.db.dao.SettingItemDao;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class w1m implements SettingItemDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f37450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SettingItemEntity> f37451b = new a();
    public final EntityDeleteOrUpdateAdapter<SettingItemEntity> c = new b();

    public class a extends EntityInsertAdapter<SettingItemEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SettingItemEntity settingItemEntity) {
            if (settingItemEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, settingItemEntity.getKey());
            }
            if (settingItemEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, settingItemEntity.getValue());
            }
            if (settingItemEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, settingItemEntity.getDid());
            }
            if (settingItemEntity.getModule() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, settingItemEntity.getModule());
            }
            sQLiteStatement.mo50bindLong(5, settingItemEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(6, settingItemEntity.getModifyTime());
            sQLiteStatement.mo50bindLong(7, settingItemEntity.isUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, settingItemEntity.isBig() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `settingitem` (`key`,`value`,`did`,`module`,`updateTime`,`modifyTime`,`isUpload`,`isBig`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<SettingItemEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SettingItemEntity settingItemEntity) {
            if (settingItemEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, settingItemEntity.getKey());
            }
            if (settingItemEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, settingItemEntity.getValue());
            }
            if (settingItemEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, settingItemEntity.getDid());
            }
            if (settingItemEntity.getModule() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, settingItemEntity.getModule());
            }
            sQLiteStatement.mo50bindLong(5, settingItemEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(6, settingItemEntity.getModifyTime());
            sQLiteStatement.mo50bindLong(7, settingItemEntity.isUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, settingItemEntity.isBig() ? 1L : 0L);
            if (settingItemEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, settingItemEntity.getDid());
            }
            if (settingItemEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, settingItemEntity.getKey());
            }
            if (settingItemEntity.getModule() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, settingItemEntity.getModule());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `settingitem` SET `key` = ?,`value` = ?,`did` = ?,`module` = ?,`updateTime` = ?,`modifyTime` = ?,`isUpload` = ?,`isBig` = ? WHERE `did` = ? AND `key` = ? AND `module` = ?";
        }
    }

    public w1m(RoomDatabase roomDatabase) {
        this.f37450a = roomDatabase;
    }

    public static List<Class<?>> m() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object o(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM settingitem");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object p(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM settingitem WHERE did = ?");
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

    public static /* synthetic */ List r(String str, boolean z, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM settingitem WHERE did = ? AND isUpload = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, z ? 1L : 0L);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RnReportConst.ApiReport.PARAM_MODULE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "modifyTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isBig");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new SettingItemEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ SettingItemEntity s(String str, String str2, String str3, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM settingitem WHERE did = ? AND module =? AND `key` = ?");
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
            if (str3 == null) {
                sQLiteStatementPrepare.mo51bindNull(3);
            } else {
                sQLiteStatementPrepare.mo52bindText(3, str3);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RnReportConst.ApiReport.PARAM_MODULE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "modifyTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isBig");
            SettingItemEntity settingItemEntity = null;
            if (sQLiteStatementPrepare.step()) {
                settingItemEntity = new SettingItemEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
            }
            sQLiteStatementPrepare.close();
            return settingItemEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List t(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM settingitem WHERE did = ?");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RnReportConst.ApiReport.PARAM_MODULE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "modifyTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isBig");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new SettingItemEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0 ? z : false, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0));
                columnIndexOrThrow2 = columnIndexOrThrow2;
                z = true;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List w(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    public static /* synthetic */ List x(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from settingitem where isUpload = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RnReportConst.ApiReport.PARAM_MODULE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "modifyTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isBig");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new SettingItemEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingItemDao
    public void deleteAll() {
        DBUtil.performBlocking(this.f37450a, false, true, new Function1() { // from class: o1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w1m.o((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingItemDao
    public void deleteByDid(final String str) {
        DBUtil.performBlocking(this.f37450a, false, true, new Function1() { // from class: u1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w1m.p(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super SettingItemEntity> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f37450a, true, false, new Function1() { // from class: q1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30996a.q(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingItemDao
    public List<SettingItemEntity> getSettingByDid(final String str, final boolean z) {
        return (List) DBUtil.performBlocking(this.f37450a, true, false, new Function1() { // from class: n1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w1m.r(str, z, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingItemDao
    public SettingItemEntity getSettingByKey(final String str, final String str2, final String str3) {
        return (SettingItemEntity) DBUtil.performBlocking(this.f37450a, true, false, new Function1() { // from class: v1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w1m.s(str, str2, str3, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingItemDao
    public List<SettingItemEntity> getSettings(final String str) {
        return (List) DBUtil.performBlocking(this.f37450a, true, false, new Function1() { // from class: r1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w1m.t(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingItemDao
    public long insertOrUpdateSettingItem(final SettingItemEntity settingItemEntity) {
        settingItemEntity.getClass();
        return ((Long) DBUtil.performBlocking(this.f37450a, false, true, new Function1() { // from class: s1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33174a.v(settingItemEntity, (SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final SettingItemEntity l(SQLiteStatement sQLiteStatement) {
        boolean z;
        boolean z2;
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, RnReportConst.ApiReport.PARAM_MODULE);
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "updateTime");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "modifyTime");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isBig");
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text3 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        String text4 = (columnIndex3 == -1 || sQLiteStatement.isNull(columnIndex3)) ? null : sQLiteStatement.getText(columnIndex3);
        if (columnIndex4 != -1 && !sQLiteStatement.isNull(columnIndex4)) {
            text = sQLiteStatement.getText(columnIndex4);
        }
        String str = text;
        long j = columnIndex5 == -1 ? 0L : sQLiteStatement.getLong(columnIndex5);
        long j2 = columnIndex6 != -1 ? sQLiteStatement.getLong(columnIndex6) : 0L;
        if (columnIndex7 == -1) {
            z = false;
        } else {
            z = ((int) sQLiteStatement.getLong(columnIndex7)) != 0;
        }
        if (columnIndex8 == -1) {
            z2 = false;
        } else {
            z2 = ((int) sQLiteStatement.getLong(columnIndex8)) != 0;
        }
        return new SettingItemEntity(text2, text3, text4, str, j, j2, z, z2);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<SettingItemEntity>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f37450a, true, false, new Function1() { // from class: t1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34204a.w(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object insert(final SettingItemEntity[] settingItemEntityArr, Continuation<? super Unit> continuation) {
        settingItemEntityArr.getClass();
        return DBUtil.performSuspending(this.f37450a, false, true, new Function1() { // from class: m1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f25653a.u(settingItemEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ SettingItemEntity q(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? l(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.settingitem.db.dao.SettingItemDao
    public List<SettingItemEntity> querySettingItemsNotUpload() {
        return (List) DBUtil.performBlocking(this.f37450a, true, false, new Function1() { // from class: l1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w1m.x((SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit u(SettingItemEntity[] settingItemEntityArr, SQLiteConnection sQLiteConnection) {
        this.f37451b.insert(sQLiteConnection, settingItemEntityArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Long v(SettingItemEntity settingItemEntity, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f37451b.insertAndReturnId(sQLiteConnection, settingItemEntity));
    }

    public final /* synthetic */ Integer y(SettingItemEntity settingItemEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.c.handle(sQLiteConnection, settingItemEntity));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object update(final SettingItemEntity settingItemEntity, Continuation<? super Integer> continuation) {
        settingItemEntity.getClass();
        return DBUtil.performSuspending(this.f37450a, false, true, new Function1() { // from class: p1m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f29916a.y(settingItemEntity, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
