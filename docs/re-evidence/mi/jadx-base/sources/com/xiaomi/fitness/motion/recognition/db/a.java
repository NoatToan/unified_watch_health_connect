package com.xiaomi.fitness.motion.recognition.db;

import androidx.lifecycle.LiveData;
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
import com.xiaomi.fitness.motion.recognition.convert.SceneConverters;
import com.xiaomi.fitness.motion.recognition.db.a;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements SceneResultDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SceneResult> f12503b = new C0647a();
    public final EntityDeleteOrUpdateAdapter<SceneResult> c = new b();

    /* JADX INFO: renamed from: com.xiaomi.fitness.motion.recognition.db.a$a, reason: collision with other inner class name */
    public class C0647a extends EntityInsertAdapter<SceneResult> {
        public C0647a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SceneResult sceneResult) {
            sQLiteStatement.mo50bindLong(1, sceneResult.getId());
            sQLiteStatement.mo50bindLong(2, sceneResult.getStart());
            sQLiteStatement.mo50bindLong(3, sceneResult.getActType());
            sQLiteStatement.mo50bindLong(4, sceneResult.getContinued());
            sQLiteStatement.mo50bindLong(5, sceneResult.getEnd());
            sQLiteStatement.mo50bindLong(6, sceneResult.getStepCount());
            sQLiteStatement.mo50bindLong(7, sceneResult.getIsComplete() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, sceneResult.getIsPossible() ? 1L : 0L);
            String strFromPressureSegment = SceneConverters.INSTANCE.fromPressureSegment(sceneResult.getPressureSegment());
            if (strFromPressureSegment == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, strFromPressureSegment);
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `scene_result` (`id`,`start`,`act_type`,`continue`,`end`,`step_count`,`complete`,`possible`,`pressure_segment`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<SceneResult> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SceneResult sceneResult) {
            sQLiteStatement.mo50bindLong(1, sceneResult.getId());
            sQLiteStatement.mo50bindLong(2, sceneResult.getStart());
            sQLiteStatement.mo50bindLong(3, sceneResult.getActType());
            sQLiteStatement.mo50bindLong(4, sceneResult.getContinued());
            sQLiteStatement.mo50bindLong(5, sceneResult.getEnd());
            sQLiteStatement.mo50bindLong(6, sceneResult.getStepCount());
            sQLiteStatement.mo50bindLong(7, sceneResult.getIsComplete() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, sceneResult.getIsPossible() ? 1L : 0L);
            String strFromPressureSegment = SceneConverters.INSTANCE.fromPressureSegment(sceneResult.getPressureSegment());
            if (strFromPressureSegment == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, strFromPressureSegment);
            }
            sQLiteStatement.mo50bindLong(10, sceneResult.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `scene_result` SET `id` = ?,`start` = ?,`act_type` = ?,`continue` = ?,`end` = ?,`step_count` = ?,`complete` = ?,`possible` = ?,`pressure_segment` = ? WHERE `id` = ?";
        }
    }

    public a(RoomDatabase roomDatabase) {
        this.f12502a = roomDatabase;
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object k(long j, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM scene_result WHERE start = ? AND act_type=?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, i);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List n(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM scene_result WHERE start >=? AND `end` <=? AND complete = 0 ORDER BY start");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, StatConstants.PARAM_START);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "act_type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "continue");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, StatConstants.PARAM_END);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "step_count");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "complete");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "possible");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pressure_segment");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SceneResult sceneResult = new SceneResult();
                sceneResult.setId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                sceneResult.setStart(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                sceneResult.setActType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sceneResult.setContinued(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                sceneResult.setEnd(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sceneResult.setStepCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                sceneResult.setComplete(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                sceneResult.setPossible(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                sceneResult.setPressureSegment(SceneConverters.INSTANCE.toPressureSegment(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                arrayList.add(sceneResult);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List o(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM scene_result WHERE start>=? AND `end` <=? AND possible = 1 ORDER BY start DESC");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, StatConstants.PARAM_START);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "act_type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "continue");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, StatConstants.PARAM_END);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "step_count");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "complete");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "possible");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pressure_segment");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SceneResult sceneResult = new SceneResult();
                sceneResult.setId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                sceneResult.setStart(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                sceneResult.setActType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sceneResult.setContinued(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                sceneResult.setEnd(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sceneResult.setStepCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                sceneResult.setComplete(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                sceneResult.setPossible(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                sceneResult.setPressureSegment(SceneConverters.INSTANCE.toPressureSegment(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                arrayList.add(sceneResult);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List p(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM scene_result WHERE start >= ? AND `end`<=? ORDER BY start");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, StatConstants.PARAM_START);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "act_type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "continue");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, StatConstants.PARAM_END);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "step_count");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "complete");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "possible");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pressure_segment");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SceneResult sceneResult = new SceneResult();
                sceneResult.setId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                sceneResult.setStart(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                sceneResult.setActType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sceneResult.setContinued(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                sceneResult.setEnd(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sceneResult.setStepCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                sceneResult.setComplete(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                sceneResult.setPossible(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                sceneResult.setPressureSegment(SceneConverters.INSTANCE.toPressureSegment(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                arrayList.add(sceneResult);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneResultDao
    public void delete(final long j, final int i) {
        DBUtil.performBlocking(this.f12502a, false, true, new Function1() { // from class: efl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.k(j, i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super SceneResult> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f12502a, true, false, new Function1() { // from class: dfl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15487a.l(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final SceneResult h(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "id");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, StatConstants.PARAM_START);
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "act_type");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "continue");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, StatConstants.PARAM_END);
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "step_count");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "complete");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "possible");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "pressure_segment");
        SceneResult sceneResult = new SceneResult();
        if (columnIndex != -1) {
            sceneResult.setId(sQLiteStatement.getLong(columnIndex));
        }
        if (columnIndex2 != -1) {
            sceneResult.setStart(sQLiteStatement.getLong(columnIndex2));
        }
        if (columnIndex3 != -1) {
            sceneResult.setActType((int) sQLiteStatement.getLong(columnIndex3));
        }
        if (columnIndex4 != -1) {
            sceneResult.setContinued(sQLiteStatement.getLong(columnIndex4));
        }
        if (columnIndex5 != -1) {
            sceneResult.setEnd(sQLiteStatement.getLong(columnIndex5));
        }
        if (columnIndex6 != -1) {
            sceneResult.setStepCount((int) sQLiteStatement.getLong(columnIndex6));
        }
        if (columnIndex7 != -1) {
            sceneResult.setComplete(((int) sQLiteStatement.getLong(columnIndex7)) != 0);
        }
        if (columnIndex8 != -1) {
            sceneResult.setPossible(((int) sQLiteStatement.getLong(columnIndex8)) != 0);
        }
        if (columnIndex9 != -1) {
            sceneResult.setPressureSegment(SceneConverters.INSTANCE.toPressureSegment(sQLiteStatement.isNull(columnIndex9) ? null : sQLiteStatement.getText(columnIndex9)));
        }
        return sceneResult;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object insert(final SceneResult[] sceneResultArr, Continuation<? super Unit> continuation) {
        sceneResultArr.getClass();
        return DBUtil.performSuspending(this.f12502a, false, true, new Function1() { // from class: afl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f952a.m(sceneResultArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ SceneResult l(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? h(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneResultDao
    public Object list(long j, long j2, Continuation<? super List<SceneResult>> continuation) {
        return SceneResultDao.DefaultImpls.list(this, j, j2, continuation);
    }

    public final /* synthetic */ Unit m(SceneResult[] sceneResultArr, SQLiteConnection sQLiteConnection) {
        this.f12503b.insert(sQLiteConnection, sceneResultArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Integer q(SceneResult sceneResult, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.c.handle(sQLiteConnection, sceneResult));
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneResultDao
    public List<SceneResult> queryAllNoCompleteResults(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f12502a, true, false, new Function1() { // from class: zel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.n(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneResultDao
    public LiveData<List<SceneResult>> queryPossibleResults(final long j, final long j2) {
        return this.f12502a.getInvalidationTracker().createLiveData(new String[]{"scene_result"}, false, new Function1() { // from class: cfl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.o(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneResultDao
    public List<SceneResult> queryResults(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f12502a, true, false, new Function1() { // from class: bfl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return a.p(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Object update(final SceneResult sceneResult, Continuation<? super Integer> continuation) {
        sceneResult.getClass();
        return DBUtil.performSuspending(this.f12502a, false, true, new Function1() { // from class: yel
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f40103a.q(sceneResult, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.motion.recognition.db.SceneResultDao, com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<SceneResult>> continuation) {
        return SceneResultDao.DefaultImpls.list(this, supportSQLiteQuery, continuation);
    }
}
