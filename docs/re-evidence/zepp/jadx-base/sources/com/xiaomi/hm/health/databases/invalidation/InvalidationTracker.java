package com.xiaomi.hm.health.databases.invalidation;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.FirebasePerformance;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 <2\u00020\u0001:\u0001<B%\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0007R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R.\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070#8\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010+R(\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020.0-8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010(R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/xiaomi/hm/health/databases/invalidation/InvalidationTracker;", "", "", GoogleApiAvailabilityLight.a, "", "b", "", "", "a", "Lorg/greenrobot/greendao/database/Database;", "writableDb", "tableId", "e", "f", "syncTriggers", "refreshVersionsAsync", "internalInit", "Lcom/xiaomi/hm/health/databases/invalidation/Observer;", "observer", "addObserver", "addWeakObserver", "removeObserver", "Lorg/greenrobot/greendao/database/Database;", "database", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "closeLock", "", "", "c", "[Ljava/lang/String;", "tableNames", "Lcom/xiaomi/hm/health/databases/invalidation/ObservedTableTracker;", "Lcom/xiaomi/hm/health/databases/invalidation/ObservedTableTracker;", "observedTableTracker", "", "Ljava/util/Map;", "getTableIdLookup$database_release", "()Ljava/util/Map;", "getTableIdLookup$database_release$annotations", "()V", "tableIdLookup", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPendingRefresh", "Lcom/xiaomi/hm/health/databases/invalidation/SafeIterableMap;", "Lcom/xiaomi/hm/health/databases/invalidation/ObserverWrapper;", "g", "Lcom/xiaomi/hm/health/databases/invalidation/SafeIterableMap;", "getObserverMap$annotations", "observerMap", "Lorg/greenrobot/greendao/database/DatabaseStatement;", "h", "Lorg/greenrobot/greendao/database/DatabaseStatement;", "cleanupStatement", "i", "Z", "initialized", "<init>", "(Lorg/greenrobot/greendao/database/Database;Ljava/util/concurrent/locks/ReentrantLock;[Ljava/lang/String;)V", "Companion", "database_release"}, k = 1, mv = {1, 5, 1})
public final class InvalidationTracker {

    @NotNull
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";

    @NotNull
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    @NotNull
    private static final String j = "InvalidationTracker";

    @NotNull
    private static final String l = "room_table_modification_log";

    @NotNull
    private static final String m = "table_id";

    @NotNull
    private static final String n = "invalidated";

    @NotNull
    private static final String o = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Database database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ReentrantLock closeLock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String[] tableNames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ObservedTableTracker observedTableTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Integer> tableIdLookup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean mPendingRefresh;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SuppressLint({"RestrictedApi"})
    @NotNull
    private final SafeIterableMap<Observer, ObserverWrapper> observerMap;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private volatile DatabaseStatement cleanupStatement;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private volatile boolean initialized;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] k = {"UPDATE", FirebasePerformance.HttpMethod.DELETE, "INSERT"};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0010J$\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u00020\u00058\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u0012\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00020\u00058\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u0012\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/databases/invalidation/InvalidationTracker$Companion;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "tableName", "triggerType", "", "a", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "LOG_TAG", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$database_release$annotations", "()V", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$database_release$annotations", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "<init>", "database_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(StringBuilder builder, String tableName, String triggerType) {
            builder.append("`");
            builder.append("room_table_modification_trigger_");
            builder.append(tableName);
            builder.append("_");
            builder.append(triggerType);
            builder.append("`");
        }

        @VisibleForTesting
        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$database_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$database_release$annotations() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.databases.invalidation.InvalidationTracker$refresh$1", f = "InvalidationTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Ref.ObjectRef<Set<Integer>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<Set<Integer>> objectRef, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InvalidationTracker.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Unit unit;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SafeIterableMap safeIterableMap = InvalidationTracker.this.observerMap;
            InvalidationTracker invalidationTracker = InvalidationTracker.this;
            Ref.ObjectRef<Set<Integer>> objectRef = this.c;
            synchronized (safeIterableMap) {
                Iterator it2 = invalidationTracker.observerMap.iterator();
                while (it2.hasNext()) {
                    ((ObserverWrapper) ((Map.Entry) it2.next()).getValue()).notifyByTableInvalidStatus(objectRef.element);
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.databases.invalidation.InvalidationTracker$refreshVersionsAsync$1", f = "InvalidationTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InvalidationTracker.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvalidationTracker.this.d();
            return Unit.INSTANCE;
        }
    }

    public InvalidationTracker(@NotNull Database database, @NotNull ReentrantLock reentrantLock, @NotNull String[] strArr) {
        this.database = database;
        this.closeLock = reentrantLock;
        this.tableNames = strArr;
        this.observedTableTracker = new ObservedTableTracker(strArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = strArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String str = this.tableNames[i];
                Locale locale = Locale.US;
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                linkedHashMap.put(str.toLowerCase(locale), Integer.valueOf(i));
                if (i2 > length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        this.tableIdLookup = linkedHashMap;
        this.mPendingRefresh = new AtomicBoolean(false);
        this.observerMap = new SafeIterableMap<>();
    }

    private final Set<Integer> a() {
        DatabaseStatement databaseStatement;
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = this.database.rawQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", null);
        while (cursorRawQuery.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorRawQuery.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorRawQuery, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(cursorRawQuery, null);
        if ((!hashSet.isEmpty()) && (databaseStatement = this.cleanupStatement) != null) {
            databaseStatement.execute();
        }
        return hashSet;
    }

    private final boolean b() {
        if (this.database.getRawDatabase() instanceof SQLiteDatabase) {
            Object rawDatabase = this.database.getRawDatabase();
            Objects.requireNonNull(rawDatabase, "null cannot be cast to non-null type android.database.sqlite.SQLiteDatabase");
            return ((SQLiteDatabase) rawDatabase).isOpen();
        }
        if (this.initialized) {
            return true;
        }
        Log.e(j, "database is not initialized even though it is open");
        return false;
    }

    @VisibleForTesting
    private static /* synthetic */ void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, java.util.Set] */
    public final void d() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            try {
                this.closeLock.lock();
                if (b() && this.mPendingRefresh.compareAndSet(true, false) && !this.database.inTransaction()) {
                    objectRef.element = a();
                    this.closeLock.unlock();
                    T t = objectRef.element;
                    if (t == 0 || !(!((Collection) t).isEmpty())) {
                        return;
                    }
                    e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(objectRef, null), 2, null);
                    return;
                }
                this.closeLock.unlock();
            } catch (SQLiteException e) {
                Log.e(j, "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (IllegalStateException e2) {
                Log.e(j, "Cannot run invalidation tracker. Is the db closed?", e2);
            }
        } catch (Throwable th) {
            this.closeLock.unlock();
            throw th;
        }
    }

    private final void e(Database writableDb, int tableId) {
        writableDb.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + tableId + ", 0)");
        String str = this.tableNames[tableId];
        StringBuilder sb = new StringBuilder();
        String[] strArr = k;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            i++;
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            INSTANCE.a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append(l);
            sb.append(" SET ");
            sb.append(n);
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append(m);
            sb.append(" = ");
            sb.append(tableId);
            sb.append(" AND ");
            sb.append(n);
            sb.append(" = 0");
            sb.append("; END");
            writableDb.execSQL(sb.toString());
        }
    }

    private final void f(Database writableDb, int tableId) {
        String str = this.tableNames[tableId];
        StringBuilder sb = new StringBuilder();
        String[] strArr = k;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            i++;
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            INSTANCE.a(sb, str, str2);
            writableDb.execSQL(sb.toString());
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getTableIdLookup$database_release$annotations() {
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public final void addObserver(@NotNull Observer observer) {
        ObserverWrapper observerWrapperPutIfAbsent;
        String[] mTables = observer.getMTables();
        int length = mTables.length;
        int[] iArr = new int[length];
        int length2 = mTables.length;
        if (length2 > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Map<String, Integer> map = this.tableIdLookup;
                String str = mTables[i];
                Locale locale = Locale.US;
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                Integer num = map.get(str.toLowerCase(locale));
                if (num == null) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("There is no table with name ", mTables[i]));
                }
                iArr[i] = num.intValue();
                if (i2 >= length2) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, mTables);
        synchronized (this.observerMap) {
            observerWrapperPutIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
            Unit unit = Unit.INSTANCE;
        }
        if (observerWrapperPutIfAbsent == null && this.observedTableTracker.onAdded(Arrays.copyOf(iArr, length))) {
            syncTriggers();
        }
    }

    public final void addWeakObserver(@NotNull Observer observer) {
        addObserver(new WeakObserver(this, observer));
    }

    @NotNull
    public final Map<String, Integer> getTableIdLookup$database_release() {
        return this.tableIdLookup;
    }

    public final void internalInit() {
        synchronized (this) {
            if (this.initialized) {
                Log.e(j, "Invalidation tracker is initialized twice :/.");
                return;
            }
            this.database.execSQL("PRAGMA temp_store = MEMORY;");
            this.database.execSQL("PRAGMA recursive_triggers='ON';");
            this.database.execSQL(o);
            syncTriggers();
            this.cleanupStatement = this.database.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.initialized = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void refreshVersionsAsync() {
        if (this.mPendingRefresh.compareAndSet(false, true)) {
            e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(null), 2, null);
        }
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public final void removeObserver(@NotNull Observer observer) {
        ObserverWrapper observerWrapperRemove;
        synchronized (this.observerMap) {
            observerWrapperRemove = this.observerMap.remove(observer);
            Unit unit = Unit.INSTANCE;
        }
        if (observerWrapperRemove != null) {
            ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] mTableIds = observerWrapperRemove.getMTableIds();
            if (observedTableTracker.onRemoved(Arrays.copyOf(mTableIds, mTableIds.length))) {
                syncTriggers();
            }
        }
    }

    public final void syncTriggers() {
        if (this.database.inTransaction()) {
            return;
        }
        while (true) {
            try {
                this.closeLock.lock();
                try {
                    int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        this.closeLock.unlock();
                        return;
                    }
                    int length = tablesToSync.length;
                    this.database.beginTransaction();
                    int i = 0;
                    if (length > 0) {
                        while (true) {
                            int i2 = i + 1;
                            try {
                                int i3 = tablesToSync[i];
                                if (i3 == 1) {
                                    e(this.database, i);
                                } else if (i3 == 2) {
                                    f(this.database, i);
                                }
                                if (i2 >= length) {
                                    break;
                                } else {
                                    i = i2;
                                }
                            } catch (Throwable th) {
                                this.database.endTransaction();
                                throw th;
                            }
                        }
                    }
                    this.database.setTransactionSuccessful();
                    this.database.endTransaction();
                    this.observedTableTracker.onSyncCompleted();
                    this.closeLock.unlock();
                } catch (Throwable th2) {
                    this.closeLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException e) {
                Log.e(j, "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            } catch (IllegalStateException e2) {
                Log.e(j, "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }
}
