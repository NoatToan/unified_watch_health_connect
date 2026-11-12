package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class hxl implements ServerRequestDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f20576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<ServerRequestEntity> f20577b = new a();
    public final EntityDeleteOrUpdateAdapter<ServerRequestEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<ServerRequestEntity> d = new c();

    public class a extends EntityInsertAdapter<ServerRequestEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ServerRequestEntity serverRequestEntity) {
            if (serverRequestEntity.getAction() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, serverRequestEntity.getAction());
            }
            if (serverRequestEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, serverRequestEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, serverRequestEntity.getWatermark());
            sQLiteStatement.mo50bindLong(4, serverRequestEntity.getStartTime());
            sQLiteStatement.mo50bindLong(5, serverRequestEntity.getEndTime());
            if (serverRequestEntity.getNextKey() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, serverRequestEntity.getNextKey());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `server_request` (`action`,`key`,`watermark`,`startTime`,`endTime`,`nextKey`) VALUES (?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<ServerRequestEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ServerRequestEntity serverRequestEntity) {
            if (serverRequestEntity.getAction() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, serverRequestEntity.getAction());
            }
            if (serverRequestEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, serverRequestEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, serverRequestEntity.getEndTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `server_request` WHERE `action` = ? AND `key` = ? AND `endTime` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<ServerRequestEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ServerRequestEntity serverRequestEntity) {
            if (serverRequestEntity.getAction() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, serverRequestEntity.getAction());
            }
            if (serverRequestEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, serverRequestEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, serverRequestEntity.getWatermark());
            sQLiteStatement.mo50bindLong(4, serverRequestEntity.getStartTime());
            sQLiteStatement.mo50bindLong(5, serverRequestEntity.getEndTime());
            if (serverRequestEntity.getNextKey() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, serverRequestEntity.getNextKey());
            }
            if (serverRequestEntity.getAction() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, serverRequestEntity.getAction());
            }
            if (serverRequestEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, serverRequestEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(9, serverRequestEntity.getEndTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `server_request` SET `action` = ?,`key` = ?,`watermark` = ?,`startTime` = ?,`endTime` = ?,`nextKey` = ? WHERE `action` = ? AND `key` = ? AND `endTime` = ?";
        }
    }

    public hxl(RoomDatabase roomDatabase) {
        this.f20576a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object k(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from server_request");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List n(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM server_request WHERE `action` = ? AND `key` = ?");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "action");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "watermark");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextKey");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                ServerRequestEntity serverRequestEntity = new ServerRequestEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                serverRequestEntity.setWatermark(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                serverRequestEntity.setStartTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                serverRequestEntity.setEndTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                serverRequestEntity.setNextKey(text);
                arrayList.add(serverRequestEntity);
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ ServerRequestEntity o(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM server_request WHERE `action` = ? AND `key` = ?");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "action");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "watermark");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextKey");
            ServerRequestEntity serverRequestEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                ServerRequestEntity serverRequestEntity2 = new ServerRequestEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                serverRequestEntity2.setWatermark(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                serverRequestEntity2.setStartTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                serverRequestEntity2.setEndTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                serverRequestEntity2.setNextKey(text);
                serverRequestEntity = serverRequestEntity2;
            }
            sQLiteStatementPrepare.close();
            return serverRequestEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List r(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from server_request");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "action");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "watermark");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextKey");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                ServerRequestEntity serverRequestEntity = new ServerRequestEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                serverRequestEntity.setWatermark(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                serverRequestEntity.setStartTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                serverRequestEntity.setEndTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                serverRequestEntity.setNextKey(text);
                arrayList.add(serverRequestEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public void clear() {
        DBUtil.performBlocking(this.f20576a, false, true, new Function1() { // from class: zwl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return hxl.k((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public Object delete(final ServerRequestEntity[] serverRequestEntityArr, Continuation<? super Unit> continuation) {
        serverRequestEntityArr.getClass();
        return DBUtil.performSuspending(this.f20576a, false, true, new Function1() { // from class: bxl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4709a.l(serverRequestEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public void deleteAll(final List<ServerRequestEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.f20576a, false, true, new Function1() { // from class: dxl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16037a.m(list, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public Object getServerRequestList(final String str, final String str2, Continuation<? super List<ServerRequestEntity>> continuation) {
        return DBUtil.performSuspending(this.f20576a, true, false, new Function1() { // from class: ywl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return hxl.n(str, str2, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public Object getTheServerRequest(final String str, final String str2, Continuation<? super ServerRequestEntity> continuation) {
        return DBUtil.performSuspending(this.f20576a, true, false, new Function1() { // from class: gxl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return hxl.o(str, str2, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public Object insert(final ServerRequestEntity[] serverRequestEntityArr, Continuation<? super Unit> continuation) {
        serverRequestEntityArr.getClass();
        return DBUtil.performSuspending(this.f20576a, false, true, new Function1() { // from class: axl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f3543a.p(serverRequestEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public void insertAll(final List<ServerRequestEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.f20576a, false, true, new Function1() { // from class: cxl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f14842a.q(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit l(ServerRequestEntity[] serverRequestEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, serverRequestEntityArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Object m(List list, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, list);
        return null;
    }

    public final /* synthetic */ Unit p(ServerRequestEntity[] serverRequestEntityArr, SQLiteConnection sQLiteConnection) {
        this.f20577b.insert(sQLiteConnection, serverRequestEntityArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Object q(List list, SQLiteConnection sQLiteConnection) {
        this.f20577b.insert(sQLiteConnection, list);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public List<ServerRequestEntity> queryAllEntity() {
        return (List) DBUtil.performBlocking(this.f20576a, true, false, new Function1() { // from class: fxl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return hxl.r((SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit s(ServerRequestEntity[] serverRequestEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, serverRequestEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao
    public Object update(final ServerRequestEntity[] serverRequestEntityArr, Continuation<? super Unit> continuation) {
        serverRequestEntityArr.getClass();
        return DBUtil.performSuspending(this.f20576a, false, true, new Function1() { // from class: exl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f17165a.s(serverRequestEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
