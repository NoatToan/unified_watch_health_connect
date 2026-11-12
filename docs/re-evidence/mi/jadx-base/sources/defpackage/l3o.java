package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryConverter;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class l3o implements SportSummaryDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f24610a;
    public final SportSummaryConverter c = new SportSummaryConverter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SportSummaryEntity> f24611b = new a();
    public final EntityDeleteOrUpdateAdapter<SportSummaryEntity> d = new b();

    public class a extends EntityInsertAdapter<SportSummaryEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SportSummaryEntity sportSummaryEntity) {
            if (sportSummaryEntity.getCategory() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, sportSummaryEntity.getCategory());
            }
            if (sportSummaryEntity.getDimen() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sportSummaryEntity.getDimen());
            }
            sQLiteStatement.mo50bindLong(3, sportSummaryEntity.getTimeIn0TZ());
            sQLiteStatement.mo50bindLong(4, sportSummaryEntity.getZoneOffsetSec());
            String json = l3o.this.c.toJson(sportSummaryEntity.getSummary());
            if (json == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, json);
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `sport_summary` (`category`,`dimen`,`timeIn0TZ`,`zoneOffsetSec`,`summary`) VALUES (?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<SportSummaryEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SportSummaryEntity sportSummaryEntity) {
            if (sportSummaryEntity.getCategory() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, sportSummaryEntity.getCategory());
            }
            if (sportSummaryEntity.getDimen() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sportSummaryEntity.getDimen());
            }
            sQLiteStatement.mo50bindLong(3, sportSummaryEntity.getTimeIn0TZ());
            sQLiteStatement.mo50bindLong(4, sportSummaryEntity.getZoneOffsetSec());
            String json = l3o.this.c.toJson(sportSummaryEntity.getSummary());
            if (json == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, json);
            }
            if (sportSummaryEntity.getCategory() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, sportSummaryEntity.getCategory());
            }
            if (sportSummaryEntity.getDimen() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, sportSummaryEntity.getDimen());
            }
            sQLiteStatement.mo50bindLong(8, sportSummaryEntity.getTimeIn0TZ());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `sport_summary` SET `category` = ?,`dimen` = ?,`timeIn0TZ` = ?,`zoneOffsetSec` = ?,`summary` = ? WHERE `category` = ? AND `dimen` = ? AND `timeIn0TZ` = ?";
        }
    }

    public l3o(RoomDatabase roomDatabase) {
        this.f24610a = roomDatabase;
    }

    public static List<Class<?>> l() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object m(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from sport_summary");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object n(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from sport_summary where dimen = ? and category = ?");
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
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Object o(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from sport_summary where dimen = 'total'");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public void clearSummary() {
        DBUtil.performBlocking(this.f24610a, false, true, new Function1() { // from class: f3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return l3o.m((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public void deleteSummary(final String str, final String str2) {
        DBUtil.performBlocking(this.f24610a, false, true, new Function1() { // from class: e3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return l3o.n(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public void deleteTotalSummary() {
        DBUtil.performBlocking(this.f24610a, false, true, new Function1() { // from class: k3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return l3o.o((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public SportSummaryEntity getSummary(final String str, final String str2, final long j) {
        return (SportSummaryEntity) DBUtil.performBlocking(this.f24610a, true, false, new Function1() { // from class: d3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15053a.p(str, str2, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public SportSummaryEntity getSummaryByTime(final String str, final String str2, final long j) {
        return (SportSummaryEntity) DBUtil.performBlocking(this.f24610a, true, false, new Function1() { // from class: c3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4899a.q(str, str2, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public List<SportSummaryEntity> getTotalSummaries(final List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from sport_summary where dimen = 'total' and category in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(") ");
        final String string = sb.toString();
        return (List) DBUtil.performBlocking(this.f24610a, true, false, new Function1() { // from class: j3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22386a.r(string, list, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public SportSummaryEntity getTotalSummary(final String str) {
        return (SportSummaryEntity) DBUtil.performBlocking(this.f24610a, true, false, new Function1() { // from class: g3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18561a.s(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public void insertSummary(final List<SportSummaryEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.f24610a, false, true, new Function1() { // from class: b3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f3753a.t(list, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ SportSummaryEntity p(String str, String str2, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from sport_summary where category = ? and dimen = ? and timeIn0TZ = ?");
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
            sQLiteStatementPrepare.mo50bindLong(3, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dimen");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeIn0TZ");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetSec");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "summary");
            SportSummaryEntity sportSummaryEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                int i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                sportSummaryEntity = new SportSummaryEntity(text2, text3, j2, i, this.c.fromJson(text));
            }
            sQLiteStatementPrepare.close();
            return sportSummaryEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ SportSummaryEntity q(String str, String str2, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from sport_summary where category = ? and dimen = ? and timeIn0TZ = ?");
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
            sQLiteStatementPrepare.mo50bindLong(3, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dimen");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeIn0TZ");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetSec");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "summary");
            SportSummaryEntity sportSummaryEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                int i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                sportSummaryEntity = new SportSummaryEntity(text2, text3, j2, i, this.c.fromJson(text));
            }
            sQLiteStatementPrepare.close();
            return sportSummaryEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ List r(String str, List list, SQLiteConnection sQLiteConnection) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo51bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo52bindText(i, str2);
                }
                i++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dimen");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeIn0TZ");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetSec");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "summary");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                try {
                    arrayList.add(new SportSummaryEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), this.c.fromJson(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5))));
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ SportSummaryEntity s(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from sport_summary where category = ? and dimen = 'total' ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dimen");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeIn0TZ");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetSec");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "summary");
            SportSummaryEntity sportSummaryEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                int i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                sportSummaryEntity = new SportSummaryEntity(text2, text3, j, i, this.c.fromJson(text));
            }
            sQLiteStatementPrepare.close();
            return sportSummaryEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Object t(List list, SQLiteConnection sQLiteConnection) {
        this.f24611b.insert(sQLiteConnection, list);
        return null;
    }

    public final /* synthetic */ Long u(SportSummaryEntity sportSummaryEntity, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f24611b.insertAndReturnId(sQLiteConnection, sportSummaryEntity));
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public int updateSummary(final SportSummaryEntity sportSummaryEntity) {
        sportSummaryEntity.getClass();
        return ((Integer) DBUtil.performBlocking(this.f24610a, false, true, new Function1() { // from class: h3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f19657a.v(sportSummaryEntity, (SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ Integer v(SportSummaryEntity sportSummaryEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, sportSummaryEntity));
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao
    public long insertSummary(final SportSummaryEntity sportSummaryEntity) {
        sportSummaryEntity.getClass();
        return ((Long) DBUtil.performBlocking(this.f24610a, false, true, new Function1() { // from class: i3o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f20746a.u(sportSummaryEntity, (SQLiteConnection) obj);
            }
        })).longValue();
    }
}
