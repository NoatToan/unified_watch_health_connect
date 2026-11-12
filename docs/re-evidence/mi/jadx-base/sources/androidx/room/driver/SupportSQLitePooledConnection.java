package androidx.room.driver;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.RawConnectionAccessor;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002H\u00100\u0014H\u0096@¢\u0006\u0002\u0010\u0016JK\u0010\u0017\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0018\u001a\u00020\n2-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dH\u0096@¢\u0006\u0002\u0010\u001eJK\u0010\u001f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0018\u001a\u00020\n2-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dH\u0082@¢\u0006\u0002\u0010\u001eJ\u000e\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006$"}, d2 = {"Landroidx/room/driver/SupportSQLitePooledConnection;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "delegate", "Landroidx/room/driver/SupportSQLiteConnection;", "<init>", "(Landroidx/room/driver/SupportSQLiteConnection;)V", "getDelegate", "()Landroidx/room/driver/SupportSQLiteConnection;", "currentTransactionType", "Landroidx/room/Transactor$SQLiteTransactionType;", "rawConnection", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "usePrepared", "R", "sql", "", "block", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransaction", "type", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transaction", "inTransaction", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SupportSQLiteTransactor", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSupportSQLiteConnectionPool.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteConnectionPool.android.kt\nandroidx/room/driver/SupportSQLitePooledConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
final class SupportSQLitePooledConnection implements Transactor, RawConnectionAccessor {

    @Nullable
    private Transactor.SQLiteTransactionType currentTransactionType;

    @NotNull
    private final SupportSQLiteConnection delegate;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002H\u000b0\u000fH\u0096@¢\u0006\u0002\u0010\u0011J>\u0010\u0012\u001a\u0002H\u000b\"\u0004\b\u0001\u0010\u000b2(\u0010\u000e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0096@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/room/driver/SupportSQLitePooledConnection$SupportSQLiteTransactor;", "T", "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "<init>", "(Landroidx/room/driver/SupportSQLitePooledConnection;)V", "rawConnection", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "usePrepared", "R", "sql", "", "block", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withNestedTransaction", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rollback", "", "result", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SupportSQLiteTransactor<T> implements TransactionScope<T>, RawConnectionAccessor {
        public SupportSQLiteTransactor() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        @NotNull
        public SQLiteConnection getRawConnection() {
            return SupportSQLitePooledConnection.this.getRawConnection();
        }

        @Override // androidx.room.TransactionScope
        @Nullable
        public Object rollback(T t, @NotNull Continuation<?> continuation) throws ConnectionPool.RollbackException {
            throw new ConnectionPool.RollbackException(t);
        }

        @Override // androidx.room.PooledConnection
        @Nullable
        public <R> Object usePrepared(@NotNull String str, @NotNull Function1<? super SQLiteStatement, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
            return SupportSQLitePooledConnection.this.usePrepared(str, function1, continuation);
        }

        @Override // androidx.room.TransactionScope
        @Nullable
        public <R> Object withNestedTransaction(@NotNull Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
            SupportSQLitePooledConnection supportSQLitePooledConnection = SupportSQLitePooledConnection.this;
            Transactor.SQLiteTransactionType sQLiteTransactionType = supportSQLitePooledConnection.currentTransactionType;
            if (sQLiteTransactionType != null) {
                return supportSQLitePooledConnection.transaction(sQLiteTransactionType, function2, continuation);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.room.driver.SupportSQLitePooledConnection$transaction$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.driver.SupportSQLitePooledConnection", f = "SupportSQLiteConnectionPool.android.kt", i = {0, 0}, l = {83}, m = "transaction", n = {"this", "db"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportSQLitePooledConnection.this.transaction(null, null, this);
        }
    }

    public SupportSQLitePooledConnection(@NotNull SupportSQLiteConnection delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.Transactor$SQLiteTransactionType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.sqlite.db.SupportSQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.room.driver.SupportSQLitePooledConnection] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final <R> Object transaction(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SupportSQLitePooledConnection supportSQLitePooledConnection;
        ConnectionPool.RollbackException e;
        SupportSQLiteDatabase supportSQLiteDatabase;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SupportSQLiteDatabase db = this.delegate.getDb();
                if (!db.inTransaction()) {
                    this.currentTransactionType = sQLiteTransactionType;
                }
                int i3 = WhenMappings.$EnumSwitchMapping$0[sQLiteTransactionType.ordinal()];
                if (i3 == 1) {
                    db.beginTransactionReadOnly();
                } else if (i3 == 2) {
                    db.beginTransactionNonExclusive();
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    db.beginTransaction();
                }
                try {
                    SupportSQLiteTransactor supportSQLiteTransactor = new SupportSQLiteTransactor();
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = db;
                    anonymousClass1.label = 1;
                    Object objInvoke = function2.invoke(supportSQLiteTransactor, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    supportSQLitePooledConnection = this;
                    obj = objInvoke;
                    supportSQLiteDatabase = db;
                } catch (ConnectionPool.RollbackException e2) {
                    supportSQLitePooledConnection = this;
                    e = e2;
                    supportSQLiteDatabase = db;
                    Object result = e.getResult();
                    supportSQLiteDatabase.endTransaction();
                    if (!supportSQLiteDatabase.inTransaction()) {
                        supportSQLitePooledConnection.currentTransactionType = null;
                    }
                    return result;
                } catch (Throwable th) {
                    function2 = (Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object>) this;
                    th = th;
                    sQLiteTransactionType = db;
                    sQLiteTransactionType.endTransaction();
                    if (!sQLiteTransactionType.inTransaction()) {
                        function2.currentTransactionType = null;
                    }
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                supportSQLiteDatabase = (SupportSQLiteDatabase) anonymousClass1.L$1;
                supportSQLitePooledConnection = (SupportSQLitePooledConnection) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (ConnectionPool.RollbackException e3) {
                    e = e3;
                    Object result2 = e.getResult();
                    supportSQLiteDatabase.endTransaction();
                    if (!supportSQLiteDatabase.inTransaction()) {
                        supportSQLitePooledConnection.currentTransactionType = null;
                    }
                    return result2;
                }
            }
            supportSQLiteDatabase.setTransactionSuccessful();
            supportSQLiteDatabase.endTransaction();
            if (!supportSQLiteDatabase.inTransaction()) {
                supportSQLitePooledConnection.currentTransactionType = null;
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @NotNull
    public final SupportSQLiteConnection getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    @NotNull
    public SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    @Nullable
    public Object inTransaction(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.delegate.getDb().inTransaction());
    }

    @Override // androidx.room.PooledConnection
    @Nullable
    public <R> Object usePrepared(@NotNull String str, @NotNull Function1<? super SQLiteStatement, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        SupportSQLiteStatement supportSQLiteStatementPrepare = this.delegate.prepare(str);
        try {
            R rInvoke2 = function1.invoke2(supportSQLiteStatementPrepare);
            AutoCloseableKt.closeFinally(supportSQLiteStatementPrepare, null);
            return rInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(supportSQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    @Override // androidx.room.Transactor
    @Nullable
    public <R> Object withTransaction(@NotNull Transactor.SQLiteTransactionType sQLiteTransactionType, @NotNull Function2<? super TransactionScope<R>, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return transaction(sQLiteTransactionType, function2, continuation);
    }
}
