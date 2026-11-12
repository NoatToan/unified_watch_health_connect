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
import com.xiaomi.fitness.sync.export.db.StockDao;
import com.xiaomi.fitness.sync.export.db.StockInfoEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class dgo implements StockDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f15516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<StockInfoEntity> f15517b = new a();
    public final EntityDeleteOrUpdateAdapter<StockInfoEntity> c = new b();

    public class a extends EntityInsertAdapter<StockInfoEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, StockInfoEntity stockInfoEntity) {
            if (stockInfoEntity.getSymbol() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, stockInfoEntity.getSymbol());
            }
            if (stockInfoEntity.getMarket() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, stockInfoEntity.getMarket());
            }
            if (stockInfoEntity.getNameCN() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, stockInfoEntity.getNameCN());
            }
            sQLiteStatement.mo49bindDouble(4, stockInfoEntity.getLatestPrice());
            sQLiteStatement.mo49bindDouble(5, stockInfoEntity.getPreClose());
            sQLiteStatement.mo50bindLong(6, stockInfoEntity.getHalted());
            sQLiteStatement.mo50bindLong(7, stockInfoEntity.getDelay());
            sQLiteStatement.mo50bindLong(8, stockInfoEntity.getTimestamp());
            sQLiteStatement.mo50bindLong(9, stockInfoEntity.getUpdateTimestamp());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `StockInfo` (`symbol`,`market`,`nameCN`,`latestPrice`,`preClose`,`halted`,`delay`,`timestamp`,`updateTimestamp`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<StockInfoEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, StockInfoEntity stockInfoEntity) {
            if (stockInfoEntity.getSymbol() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, stockInfoEntity.getSymbol());
            }
            if (stockInfoEntity.getMarket() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, stockInfoEntity.getMarket());
            }
            if (stockInfoEntity.getNameCN() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, stockInfoEntity.getNameCN());
            }
            sQLiteStatement.mo49bindDouble(4, stockInfoEntity.getLatestPrice());
            sQLiteStatement.mo49bindDouble(5, stockInfoEntity.getPreClose());
            sQLiteStatement.mo50bindLong(6, stockInfoEntity.getHalted());
            sQLiteStatement.mo50bindLong(7, stockInfoEntity.getDelay());
            sQLiteStatement.mo50bindLong(8, stockInfoEntity.getTimestamp());
            sQLiteStatement.mo50bindLong(9, stockInfoEntity.getUpdateTimestamp());
            if (stockInfoEntity.getSymbol() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, stockInfoEntity.getSymbol());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `StockInfo` SET `symbol` = ?,`market` = ?,`nameCN` = ?,`latestPrice` = ?,`preClose` = ?,`halted` = ?,`delay` = ?,`timestamp` = ?,`updateTimestamp` = ? WHERE `symbol` = ?";
        }
    }

    public dgo(RoomDatabase roomDatabase) {
        this.f15516a = roomDatabase;
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    public static /* synthetic */ StockInfoEntity k(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM StockInfo WHERE symbol = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "market");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nameCN");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "latestPrice");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "preClose");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "halted");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTimestamp");
            StockInfoEntity stockInfoEntity = null;
            if (sQLiteStatementPrepare.step()) {
                stockInfoEntity = new StockInfoEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
            }
            sQLiteStatementPrepare.close();
            return stockInfoEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final StockInfoEntity g(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "symbol");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "market");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "nameCN");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "latestPrice");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "preClose");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "halted");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "delay");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "timestamp");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "updateTimestamp");
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text3 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        if (columnIndex3 != -1 && !sQLiteStatement.isNull(columnIndex3)) {
            text = sQLiteStatement.getText(columnIndex3);
        }
        return new StockInfoEntity(text2, text3, text, columnIndex4 == -1 ? 0.0f : (float) sQLiteStatement.getDouble(columnIndex4), columnIndex5 != -1 ? (float) sQLiteStatement.getDouble(columnIndex5) : 0.0f, columnIndex6 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex6), columnIndex7 != -1 ? (int) sQLiteStatement.getLong(columnIndex7) : 0, columnIndex8 == -1 ? 0L : sQLiteStatement.getLong(columnIndex8), columnIndex9 == -1 ? 0L : sQLiteStatement.getLong(columnIndex9));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super StockInfoEntity> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f15516a, true, false, new Function1() { // from class: xfo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f39080a.j(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.sync.export.db.StockDao
    public StockInfoEntity getStockInfo(final String str) {
        return (StockInfoEntity) DBUtil.performBlocking(this.f15516a, true, false, new Function1() { // from class: yfo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return dgo.k(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object insert(final StockInfoEntity[] stockInfoEntityArr, Continuation<? super Unit> continuation) {
        stockInfoEntityArr.getClass();
        return DBUtil.performSuspending(this.f15516a, false, true, new Function1() { // from class: cgo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f5315a.l(stockInfoEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.sync.export.db.StockDao
    public long insertOrUpdate(final StockInfoEntity stockInfoEntity) {
        stockInfoEntity.getClass();
        return ((Long) DBUtil.performBlocking(this.f15516a, false, true, new Function1() { // from class: bgo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4190a.m(stockInfoEntity, (SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ StockInfoEntity j(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? g(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit l(StockInfoEntity[] stockInfoEntityArr, SQLiteConnection sQLiteConnection) {
        this.f15517b.insert(sQLiteConnection, stockInfoEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<StockInfoEntity>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f15516a, true, false, new Function1() { // from class: zfo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f41228a.n(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Long m(StockInfoEntity stockInfoEntity, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f15517b.insertAndReturnId(sQLiteConnection, stockInfoEntity));
    }

    public final /* synthetic */ List n(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(g(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Integer o(StockInfoEntity stockInfoEntity, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.c.handle(sQLiteConnection, stockInfoEntity));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Object update(final StockInfoEntity stockInfoEntity, Continuation<? super Integer> continuation) {
        stockInfoEntity.getClass();
        return DBUtil.performSuspending(this.f15516a, false, true, new Function1() { // from class: ago
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f996a.o(stockInfoEntity, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
