package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.db.dao.CgmGlucoseDao;
import com.xiaomi.fit.fitness.db.dao.CgmGlucoseEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class ss3 implements CgmGlucoseDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f33934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<CgmGlucoseEntity> f33935b = new a();
    public final EntityDeleteOrUpdateAdapter<CgmGlucoseEntity> c = new b();

    public class a extends EntityInsertAdapter<CgmGlucoseEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, CgmGlucoseEntity cgmGlucoseEntity) {
            if (cgmGlucoseEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, cgmGlucoseEntity.getDid());
            }
            sQLiteStatement.mo50bindLong(2, cgmGlucoseEntity.getTime());
            sQLiteStatement.mo50bindLong(3, cgmGlucoseEntity.getDataType());
            if (cgmGlucoseEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, cgmGlucoseEntity.getValue());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `cgm_glucose` (`did`,`time`,`dataType`,`value`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<CgmGlucoseEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, CgmGlucoseEntity cgmGlucoseEntity) {
            if (cgmGlucoseEntity.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, cgmGlucoseEntity.getDid());
            }
            sQLiteStatement.mo50bindLong(2, cgmGlucoseEntity.getTime());
            sQLiteStatement.mo50bindLong(3, cgmGlucoseEntity.getDataType());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `cgm_glucose` WHERE `did` = ? AND `time` = ? AND `dataType` = ?";
        }
    }

    public ss3(RoomDatabase roomDatabase) {
        this.f33934a = roomDatabase;
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List g(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM cgm_glucose limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new CgmGlucoseEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.db.dao.CgmGlucoseDao
    public Object delete(final List<CgmGlucoseEntity> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.f33934a, false, true, new Function1() { // from class: rs3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32846a.e(list, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit e(List list, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Unit f(CgmGlucoseEntity[] cgmGlucoseEntityArr, SQLiteConnection sQLiteConnection) {
        this.f33935b.insert(sQLiteConnection, cgmGlucoseEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fit.fitness.db.dao.CgmGlucoseDao
    public Object insert(final CgmGlucoseEntity[] cgmGlucoseEntityArr, Continuation<? super Unit> continuation) {
        cgmGlucoseEntityArr.getClass();
        return DBUtil.performSuspending(this.f33934a, false, true, new Function1() { // from class: ps3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30696a.f(cgmGlucoseEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.db.dao.CgmGlucoseDao
    public Object queryGlucoseList(final int i, Continuation<? super List<CgmGlucoseEntity>> continuation) {
        return DBUtil.performSuspending(this.f33934a, true, false, new Function1() { // from class: qs3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ss3.g(i, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
