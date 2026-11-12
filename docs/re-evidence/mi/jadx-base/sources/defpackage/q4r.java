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
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.xms.wearable.db.dao.WatchAppItemDao;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class q4r implements WatchAppItemDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f31104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<WatchAppItemEntity> f31105b = new a();
    public final EntityDeleteOrUpdateAdapter<WatchAppItemEntity> c = new b();

    public class a extends EntityInsertAdapter<WatchAppItemEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WatchAppItemEntity watchAppItemEntity) {
            if (watchAppItemEntity.getPackageName() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, watchAppItemEntity.getPackageName());
            }
            if (watchAppItemEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, watchAppItemEntity.getDid());
            }
            if (watchAppItemEntity.getFingerprint() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo48bindBlob(3, watchAppItemEntity.getFingerprint());
            }
            sQLiteStatement.mo50bindLong(4, watchAppItemEntity.getCanRemove() ? 1L : 0L);
            if (watchAppItemEntity.getAppName() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, watchAppItemEntity.getAppName());
            }
            sQLiteStatement.mo50bindLong(6, watchAppItemEntity.getVersionCode());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `watch_app_item` (`packageName`,`did`,`fingerprint`,`canRemove`,`appName`,`versionCode`) VALUES (?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<WatchAppItemEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WatchAppItemEntity watchAppItemEntity) {
            if (watchAppItemEntity.getPackageName() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, watchAppItemEntity.getPackageName());
            }
            if (watchAppItemEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, watchAppItemEntity.getDid());
            }
            if (watchAppItemEntity.getFingerprint() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo48bindBlob(3, watchAppItemEntity.getFingerprint());
            }
            sQLiteStatement.mo50bindLong(4, watchAppItemEntity.getCanRemove() ? 1L : 0L);
            if (watchAppItemEntity.getAppName() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, watchAppItemEntity.getAppName());
            }
            sQLiteStatement.mo50bindLong(6, watchAppItemEntity.getVersionCode());
            if (watchAppItemEntity.getPackageName() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, watchAppItemEntity.getPackageName());
            }
            if (watchAppItemEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, watchAppItemEntity.getDid());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `watch_app_item` SET `packageName` = ?,`did` = ?,`fingerprint` = ?,`canRemove` = ?,`appName` = ?,`versionCode` = ? WHERE `packageName` = ? AND `did` = ?";
        }
    }

    public q4r(RoomDatabase roomDatabase) {
        this.f31104a = roomDatabase;
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit m(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM watch_app_item WHERE did=?");
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

    public static /* synthetic */ Unit n(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM watch_app_item WHERE did=? AND packageName=?");
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
            sQLiteStatementPrepare.step();
            Unit unit = Unit.INSTANCE;
            sQLiteStatementPrepare.close();
            return unit;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List o(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM watch_app_item WHERE did=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "packageName");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fingerprint");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canRemove");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CommonConstants.KEY_VERSION_CODE);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new WatchAppItemEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow3), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ WatchAppItemEntity p(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM watch_app_item WHERE packageName=? AND did=? ");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "packageName");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fingerprint");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canRemove");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appName");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CommonConstants.KEY_VERSION_CODE);
            WatchAppItemEntity watchAppItemEntity = null;
            if (sQLiteStatementPrepare.step()) {
                watchAppItemEntity = new WatchAppItemEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow3), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
            }
            sQLiteStatementPrepare.close();
            return watchAppItemEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long[] s(List list, SQLiteConnection sQLiteConnection) {
        return this.f31105b.insertAndReturnIdsArrayBox(sQLiteConnection, list);
    }

    @Override // com.xiaomi.xms.wearable.db.dao.WatchAppItemDao
    public Object deleteAllByDevice(final String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f31104a, false, true, new Function1() { // from class: m4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return q4r.m(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.xms.wearable.db.dao.WatchAppItemDao
    public Object deleteItem(final String str, final String str2, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.f31104a, false, true, new Function1() { // from class: l4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return q4r.n(str, str2, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.xms.wearable.db.dao.WatchAppItemDao
    public Object findAllByDevice(final String str, Continuation<? super List<WatchAppItemEntity>> continuation) {
        return DBUtil.performSuspending(this.f31104a, true, false, new Function1() { // from class: p4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return q4r.o(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.xms.wearable.db.dao.WatchAppItemDao
    public WatchAppItemEntity findAppItem(final String str, final String str2) {
        return (WatchAppItemEntity) DBUtil.performBlocking(this.f31104a, true, false, new Function1() { // from class: k4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return q4r.p(str, str2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super WatchAppItemEntity> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f31104a, true, false, new Function1() { // from class: i4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f20787a.q(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.xms.wearable.db.dao.WatchAppItemDao
    public Object insertAll(final List<WatchAppItemEntity> list, Continuation<? super Long[]> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.f31104a, false, true, new Function1() { // from class: h4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f19693a.s(list, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final WatchAppItemEntity j(SQLiteStatement sQLiteStatement) {
        boolean z;
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "packageName");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "fingerprint");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "canRemove");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "appName");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, CommonConstants.KEY_VERSION_CODE);
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text3 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        byte[] blob = (columnIndex3 == -1 || sQLiteStatement.isNull(columnIndex3)) ? null : sQLiteStatement.getBlob(columnIndex3);
        if (columnIndex4 == -1) {
            z = false;
        } else {
            z = ((int) sQLiteStatement.getLong(columnIndex4)) != 0;
        }
        if (columnIndex5 != -1 && !sQLiteStatement.isNull(columnIndex5)) {
            text = sQLiteStatement.getText(columnIndex5);
        }
        return new WatchAppItemEntity(text2, text3, blob, z, text, columnIndex6 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex6));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Object insert(final WatchAppItemEntity[] watchAppItemEntityArr, Continuation<? super Unit> continuation) {
        watchAppItemEntityArr.getClass();
        return DBUtil.performSuspending(this.f31104a, false, true, new Function1() { // from class: j4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22422a.r(watchAppItemEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<WatchAppItemEntity>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f31104a, true, false, new Function1() { // from class: o4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f28736a.t(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ WatchAppItemEntity q(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? j(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit r(WatchAppItemEntity[] watchAppItemEntityArr, SQLiteConnection sQLiteConnection) {
        this.f31105b.insert(sQLiteConnection, watchAppItemEntityArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ List t(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    public final /* synthetic */ Integer u(WatchAppItemEntity watchAppItemEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.c.handle(sQLiteConnection, watchAppItemEntity));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object update(final WatchAppItemEntity watchAppItemEntity, Continuation<? super Integer> continuation) {
        watchAppItemEntity.getClass();
        return DBUtil.performSuspending(this.f31104a, false, true, new Function1() { // from class: n4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27551a.u(watchAppItemEntity, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
