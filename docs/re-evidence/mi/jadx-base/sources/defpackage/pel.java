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
import com.xiaomi.fitness.motion.recognition.db.SceneEventDao;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneEvent;
import com.xiaomi.fitness.motion.recognition.db.entity.ScenePressureEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class pel implements SceneEventDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f30321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SceneEvent> f30322b = new a();
    public final EntityInsertAdapter<ScenePressureEvent> c = new b();
    public final EntityDeleteOrUpdateAdapter<SceneEvent> d = new c();

    public class a extends EntityInsertAdapter<SceneEvent> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SceneEvent sceneEvent) {
            sQLiteStatement.mo50bindLong(1, sceneEvent.getId());
            sQLiteStatement.mo50bindLong(2, sceneEvent.getSceneTime());
            sQLiteStatement.mo50bindLong(3, sceneEvent.getSceneType());
            sQLiteStatement.mo49bindDouble(4, sceneEvent.getSceneAccuracy());
            sQLiteStatement.mo49bindDouble(5, sceneEvent.getScenePressure());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `scene_event` (`id`,`scene_time`,`scene_type`,`scene_accuracy`,`scene_pressure`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    public class b extends EntityInsertAdapter<ScenePressureEvent> {
        public b() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ScenePressureEvent scenePressureEvent) {
            sQLiteStatement.mo50bindLong(1, scenePressureEvent.getId());
            sQLiteStatement.mo50bindLong(2, scenePressureEvent.getTime());
            sQLiteStatement.mo49bindDouble(3, scenePressureEvent.getPressure());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `scene_pressure_event` (`id`,`time`,`pressure`) VALUES (nullif(?, 0),?,?)";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<SceneEvent> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SceneEvent sceneEvent) {
            sQLiteStatement.mo50bindLong(1, sceneEvent.getId());
            sQLiteStatement.mo50bindLong(2, sceneEvent.getSceneTime());
            sQLiteStatement.mo50bindLong(3, sceneEvent.getSceneType());
            sQLiteStatement.mo49bindDouble(4, sceneEvent.getSceneAccuracy());
            sQLiteStatement.mo49bindDouble(5, sceneEvent.getScenePressure());
            sQLiteStatement.mo50bindLong(6, sceneEvent.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `scene_event` SET `id` = ?,`scene_time` = ?,`scene_type` = ?,`scene_accuracy` = ?,`scene_pressure` = ? WHERE `id` = ?";
        }
    }

    public pel(RoomDatabase roomDatabase) {
        this.f30321a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object l(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM scene_pressure_event WHERE time BETWEEN ? AND ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List p(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    public static /* synthetic */ List q(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM scene_event WHERE scene_time BETWEEN ? AND ? ORDER BY scene_time");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "scene_time");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "scene_type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "scene_accuracy");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "scene_pressure");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SceneEvent sceneEvent = new SceneEvent();
                sceneEvent.setId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                sceneEvent.setSceneTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                sceneEvent.setSceneType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sceneEvent.setSceneAccuracy((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4));
                sceneEvent.setScenePressure((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow5));
                arrayList.add(sceneEvent);
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List r(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM scene_pressure_event WHERE time BETWEEN ? AND ? ORDER BY time");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pressure");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ScenePressureEvent scenePressureEvent = new ScenePressureEvent();
                scenePressureEvent.setId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                scenePressureEvent.setTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                scenePressureEvent.setPressure((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3));
                arrayList.add(scenePressureEvent);
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneEventDao
    public void deleteScenePressureEvents(final long j, final long j2) {
        DBUtil.performBlocking(this.f30321a, false, true, new Function1() { // from class: jel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return pel.l(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super SceneEvent> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f30321a, true, false, new Function1() { // from class: oel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f29078a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final SceneEvent i(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "id");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "scene_time");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "scene_type");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "scene_accuracy");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "scene_pressure");
        SceneEvent sceneEvent = new SceneEvent();
        if (columnIndex != -1) {
            sceneEvent.setId(sQLiteStatement.getLong(columnIndex));
        }
        if (columnIndex2 != -1) {
            sceneEvent.setSceneTime(sQLiteStatement.getLong(columnIndex2));
        }
        if (columnIndex3 != -1) {
            sceneEvent.setSceneType((int) sQLiteStatement.getLong(columnIndex3));
        }
        if (columnIndex4 != -1) {
            sceneEvent.setSceneAccuracy((float) sQLiteStatement.getDouble(columnIndex4));
        }
        if (columnIndex5 != -1) {
            sceneEvent.setScenePressure((float) sQLiteStatement.getDouble(columnIndex5));
        }
        return sceneEvent;
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneEventDao
    public void insertPressure(final ScenePressureEvent... scenePressureEventArr) {
        scenePressureEventArr.getClass();
        DBUtil.performBlocking(this.f30321a, false, true, new Function1() { // from class: iel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f21059a.o(scenePressureEventArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Object insert(final SceneEvent[] sceneEventArr, Continuation<? super Unit> continuation) {
        sceneEventArr.getClass();
        return DBUtil.performSuspending(this.f30321a, false, true, new Function1() { // from class: lel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f24976a.n(sceneEventArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<SceneEvent>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f30321a, true, false, new Function1() { // from class: mel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f26079a.p(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ SceneEvent m(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? i(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit n(SceneEvent[] sceneEventArr, SQLiteConnection sQLiteConnection) {
        this.f30322b.insert(sQLiteConnection, sceneEventArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Object o(ScenePressureEvent[] scenePressureEventArr, SQLiteConnection sQLiteConnection) {
        this.c.insert(sQLiteConnection, scenePressureEventArr);
        return null;
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneEventDao
    public List<SceneEvent> querySceneEvents(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f30321a, true, false, new Function1() { // from class: kel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return pel.q(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneEventDao
    public List<ScenePressureEvent> queryScenePressureEvents(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f30321a, true, false, new Function1() { // from class: hel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return pel.r(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Integer s(SceneEvent sceneEvent, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, sceneEvent));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Object update(final SceneEvent sceneEvent, Continuation<? super Integer> continuation) {
        sceneEvent.getClass();
        return DBUtil.performSuspending(this.f30321a, false, true, new Function1() { // from class: nel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27861a.s(sceneEvent, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
