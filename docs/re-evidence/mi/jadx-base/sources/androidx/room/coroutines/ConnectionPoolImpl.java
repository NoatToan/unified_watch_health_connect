package androidx.room.coroutines;

import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.room.coroutines.ConnectionPoolImpl;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import com.miui.tsmclient.util.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bJ@\u0010\"\u001a\u0002H#\"\u0004\b\u0000\u0010#2\u0006\u0010$\u001a\u00020\u00192\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0(\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0096@¢\u0006\u0002\u0010*J\"\u0010+\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0006\u0012\u0004\u0018\u00010.0,*\u00020\rH\u0082H¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0011H\u0002J\u0010\u00103\u001a\u0002042\u0006\u0010$\u001a\u00020\u0019H\u0002J\b\u00105\u001a\u000206H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\u001b\u001a\u00020\u001cX\u0080\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00067"}, d2 = {"Landroidx/room/coroutines/ConnectionPoolImpl;", "Landroidx/room/coroutines/ConnectionPool;", "driver", "Landroidx/sqlite/SQLiteDriver;", "fileName", "", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;)V", "maxNumOfReaders", "", "maxNumOfWriters", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;II)V", "readers", "Landroidx/room/coroutines/Pool;", "writers", "threadLocal", "Ljava/lang/ThreadLocal;", "Landroidx/room/coroutines/PooledConnectionImpl;", "Landroidx/room/concurrent/ThreadLocal;", "Ljava/lang/ThreadLocal;", "_isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "", "()Z", "timeout", "Lkotlin/time/Duration;", "getTimeout-UwyO8pc$room_runtime_release", "()J", "setTimeout-LRDsOJo$room_runtime_release", "(J)V", "J", "useConnection", "R", "isReadOnly", "block", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireWithTimeout", "Lkotlin/Pair;", "Landroidx/room/coroutines/ConnectionWithLock;", "", "(Landroidx/room/coroutines/Pool;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createConnectionContext", "Lkotlin/coroutines/CoroutineContext;", "connection", "throwTimeoutException", "", Constants.EXTRA_CLOSE_TAI, "", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionPoolImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,537:1\n168#1,8:539\n1#2:538\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionPoolImpl\n*L\n132#1:539,8\n*E\n"})
public final class ConnectionPoolImpl implements ConnectionPool {

    @NotNull
    private final AtomicBoolean _isClosed;

    @NotNull
    private final SQLiteDriver driver;

    @NotNull
    private final Pool readers;

    @NotNull
    private final ThreadLocal<PooledConnectionImpl> threadLocal;
    private long timeout;

    @NotNull
    private final Pool writers;

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<ConnectionWithLock> $connection;
        final /* synthetic */ Pool $this_acquireWithTimeout;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<ConnectionWithLock> objectRef, Pool pool, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$connection = objectRef;
            this.$this_acquireWithTimeout = pool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$connection, this.$this_acquireWithTimeout, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<ConnectionWithLock> objectRef;
            T t;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef<ConnectionWithLock> objectRef2 = this.$connection;
                Pool pool = this.$this_acquireWithTimeout;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objAcquire = pool.acquire(this);
                if (objAcquire == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t = objAcquire;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", i = {2, 2, 2, 2, 2, 2, 2, 3, 3}, l = {114, 118, 541, 147}, m = "useConnection", n = {"this", "block", "pool", "connection", "currentContext", "connection$iv", "isReadOnly", "pool", "connection"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1"})
    public static final class AnonymousClass1<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
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
            return ConnectionPoolImpl.this.useConnection(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12892<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<Transactor, Continuation<? super R>, Object> $block;
        final /* synthetic */ PooledConnectionImpl $confinedConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12892(Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, PooledConnectionImpl pooledConnectionImpl, Continuation<? super C12892> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$confinedConnection = pooledConnectionImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12892(this.$block, this.$confinedConnection, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<Transactor, Continuation<? super R>, Object> function2 = this.$block;
                PooledConnectionImpl pooledConnectionImpl = this.$confinedConnection;
                this.label = 1;
                obj = function2.invoke(pooledConnectionImpl, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C12892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<Transactor, Continuation<? super R>, Object> $block;
        final /* synthetic */ Ref.ObjectRef<PooledConnectionImpl> $connection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Ref.ObjectRef<PooledConnectionImpl> objectRef, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$connection = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$block, this.$connection, continuation);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.room.coroutines.ConnectionPoolImpl$useConnection$4<R> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L29
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r3.$block
                kotlin.jvm.internal.Ref$ObjectRef<androidx.room.coroutines.PooledConnectionImpl> r1 = r3.$connection
                T r1 = r1.element
                r3.label = r2
                java.lang.Object r4 = r4.invoke(r1, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConnectionPoolImpl(@NotNull final SQLiteDriver driver, @NotNull final String fileName) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.Companion;
        this.timeout = DurationKt.toDuration(30, DurationUnit.SECONDS);
        this.driver = driver;
        Pool pool = new Pool(1, new Function0() { // from class: we4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return driver.open(fileName);
            }
        });
        this.readers = pool;
        this.writers = pool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection _init_$lambda$4(SQLiteDriver sQLiteDriver, String str) {
        SQLiteConnection sQLiteConnectionOpen = sQLiteDriver.open(str);
        SQLite.execSQL(sQLiteConnectionOpen, "PRAGMA query_only = 1");
        return sQLiteConnectionOpen;
    }

    private final Object acquireWithTimeout(Pool pool, Continuation<? super Pair<ConnectionWithLock, ? extends Throwable>> continuation) {
        Object obj;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            long j = this.timeout;
            obj = null;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(objectRef, pool, null);
            InlineMarker.mark(0);
            TimeoutKt.m2385withTimeoutKLykuaI(j, anonymousClass2, continuation);
            InlineMarker.mark(1);
        } catch (Throwable th) {
            obj = th;
        }
        return TuplesKt.to(objectRef.element, obj);
    }

    private final CoroutineContext createConnectionContext(PooledConnectionImpl connection) {
        return new ConnectionElement(connection).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.threadLocal, connection));
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    private final Void throwTimeoutException(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append('\n');
        sb.append('\n');
        sb.append("Writer pool:");
        sb.append('\n');
        this.writers.dump(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.readers.dump(sb);
        SQLite.throwSQLiteException(5, sb.toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.close();
            this.writers.close();
        }
    }

    /* JADX INFO: renamed from: getTimeout-UwyO8pc$room_runtime_release, reason: not valid java name and from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: setTimeout-LRDsOJo$room_runtime_release, reason: not valid java name */
    public final void m47setTimeoutLRDsOJo$room_runtime_release(long j) {
        this.timeout = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:86:0x018e A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #7 {all -> 0x019f, blocks: (B:84:0x0188, B:86:0x018e), top: B:121:0x0188 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [T, androidx.room.coroutines.PooledConnectionImpl] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // androidx.room.coroutines.ConnectionPool
    @Nullable
    public <R> Object useConnection(boolean z, @NotNull Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        Pool pool;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Pool pool2;
        CoroutineContext coroutineContext;
        Object obj;
        ConnectionPoolImpl connectionPoolImpl;
        Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function3;
        Ref.ObjectRef objectRef4;
        ConnectionPoolImpl connectionPoolImpl2;
        ConnectionPoolImpl connectionPoolImpl3;
        boolean z2;
        Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function4;
        ?? pooledConnectionImpl;
        PooledConnectionImpl pooledConnectionImpl2;
        boolean z3 = z;
        Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function5 = function2;
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
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                if (isClosed()) {
                    SQLite.throwSQLiteException(21, "Connection pool is closed");
                    throw new KotlinNothingValueException();
                }
                PooledConnectionImpl connectionWrapper = this.threadLocal.get();
                if (connectionWrapper == null) {
                    ConnectionElement connectionElement = (ConnectionElement) anonymousClass1.getContext().get(ConnectionElement.INSTANCE);
                    connectionWrapper = connectionElement != null ? connectionElement.getConnectionWrapper() : null;
                }
                if (connectionWrapper != null) {
                    if (!z3 && connectionWrapper.getIsReadOnly()) {
                        SQLite.throwSQLiteException(1, "Cannot upgrade connection from reader to writer");
                        throw new KotlinNothingValueException();
                    }
                    if (anonymousClass1.getContext().get(ConnectionElement.INSTANCE) == null) {
                        CoroutineContext coroutineContextCreateConnectionContext = createConnectionContext(connectionWrapper);
                        C12892 c12892 = new C12892(function5, connectionWrapper, null);
                        anonymousClass1.label = 1;
                        objInvoke = BuildersKt.withContext(coroutineContextCreateConnectionContext, c12892, anonymousClass1);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        anonymousClass1.label = 2;
                        objInvoke = function5.invoke(connectionWrapper, anonymousClass1);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return objInvoke;
                }
                Pool pool3 = z3 ? this.readers : this.writers;
                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                try {
                    CoroutineContext context = anonymousClass1.getContext();
                    objectRef2 = new Ref.ObjectRef();
                    try {
                        long j = this.timeout;
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(objectRef2, pool3, null);
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = function5;
                        anonymousClass1.L$2 = pool3;
                        anonymousClass1.L$3 = objectRef5;
                        anonymousClass1.L$4 = context;
                        anonymousClass1.L$5 = objectRef2;
                        anonymousClass1.Z$0 = z3;
                        anonymousClass1.label = 3;
                        if (TimeoutKt.m2385withTimeoutKLykuaI(j, anonymousClass2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef3 = objectRef5;
                        pool2 = pool3;
                        coroutineContext = context;
                        function3 = function5;
                        objectRef4 = objectRef2;
                        connectionPoolImpl2 = this;
                        z2 = z3;
                        objectRef = objectRef3;
                        function4 = function3;
                        obj = null;
                        connectionPoolImpl3 = connectionPoolImpl2;
                    } catch (Throwable th2) {
                        objectRef3 = objectRef5;
                        pool2 = pool3;
                        coroutineContext = context;
                        obj = th2;
                        connectionPoolImpl = this;
                        Ref.ObjectRef objectRef6 = objectRef2;
                        connectionPoolImpl3 = connectionPoolImpl;
                        z2 = z3;
                        objectRef = objectRef3;
                        function4 = function5;
                        objectRef4 = objectRef6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    pool = pool3;
                    objectRef = objectRef5;
                    throw th;
                }
            } else {
                if (i2 == 1 || i2 == 2) {
                    ResultKt.throwOnFailure(objInvoke);
                    return objInvoke;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) anonymousClass1.L$1;
                    pool = (Pool) anonymousClass1.L$0;
                    try {
                        ResultKt.throwOnFailure(objInvoke);
                        try {
                            pooledConnectionImpl2 = (PooledConnectionImpl) objectRef.element;
                            if (pooledConnectionImpl2 != null) {
                                pooledConnectionImpl2.markRecycled();
                                pooledConnectionImpl2.getDelegate().markReleased();
                                pool.recycle(pooledConnectionImpl2.getDelegate());
                            }
                        } catch (Throwable unused) {
                        }
                        return objInvoke;
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            try {
                                PooledConnectionImpl pooledConnectionImpl3 = (PooledConnectionImpl) objectRef.element;
                                if (pooledConnectionImpl3 == null) {
                                    throw th5;
                                }
                                pooledConnectionImpl3.markRecycled();
                                pooledConnectionImpl3.getDelegate().markReleased();
                                pool.recycle(pooledConnectionImpl3.getDelegate());
                                throw th5;
                            } catch (Throwable th6) {
                                ExceptionsKt__ExceptionsKt.addSuppressed(th, th6);
                                throw th5;
                            }
                        }
                    }
                }
                z3 = anonymousClass1.Z$0;
                objectRef4 = (Ref.ObjectRef) anonymousClass1.L$5;
                coroutineContext = (CoroutineContext) anonymousClass1.L$4;
                objectRef3 = (Ref.ObjectRef) anonymousClass1.L$3;
                pool2 = (Pool) anonymousClass1.L$2;
                function3 = (Function2) anonymousClass1.L$1;
                ConnectionPoolImpl connectionPoolImpl4 = (ConnectionPoolImpl) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    connectionPoolImpl2 = connectionPoolImpl4;
                    z2 = z3;
                    objectRef = objectRef3;
                    function4 = function3;
                    obj = null;
                    connectionPoolImpl3 = connectionPoolImpl2;
                } catch (Throwable th7) {
                    obj = th7;
                    connectionPoolImpl = connectionPoolImpl4;
                    objectRef2 = objectRef4;
                    function5 = function3;
                    Ref.ObjectRef objectRef7 = objectRef2;
                    connectionPoolImpl3 = connectionPoolImpl;
                    z2 = z3;
                    objectRef = objectRef3;
                    function4 = function5;
                    objectRef4 = objectRef7;
                }
            }
            Pair pair = TuplesKt.to(objectRef4.element, obj);
            ConnectionWithLock connectionWithLock = (ConnectionWithLock) pair.component1();
            Throwable th8 = (Throwable) pair.component2();
            if (connectionWithLock != null) {
                pooledConnectionImpl = new PooledConnectionImpl(connectionWithLock.markAcquired(coroutineContext), connectionPoolImpl3.readers != connectionPoolImpl3.writers && z2);
            } else {
                pooledConnectionImpl = 0;
            }
            objectRef.element = pooledConnectionImpl;
            if (th8 instanceof TimeoutCancellationException) {
                connectionPoolImpl3.throwTimeoutException(z2);
                throw new KotlinNothingValueException();
            }
            if (th8 != null) {
                throw th8;
            }
            if (pooledConnectionImpl == 0) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            CoroutineContext coroutineContextCreateConnectionContext2 = connectionPoolImpl3.createConnectionContext(pooledConnectionImpl);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(function4, objectRef, null);
            anonymousClass1.L$0 = pool2;
            anonymousClass1.L$1 = objectRef;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.L$5 = null;
            anonymousClass1.label = 4;
            objInvoke = BuildersKt.withContext(coroutineContextCreateConnectionContext2, anonymousClass4, anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            pool = pool2;
            pooledConnectionImpl2 = (PooledConnectionImpl) objectRef.element;
            if (pooledConnectionImpl2 != null) {
                pooledConnectionImpl2.markRecycled();
                pooledConnectionImpl2.getDelegate().markReleased();
                pool.recycle(pooledConnectionImpl2.getDelegate());
            }
            return objInvoke;
        } catch (Throwable th9) {
            th = th9;
            pool = pool2;
            throw th;
        }
    }

    public ConnectionPoolImpl(@NotNull final SQLiteDriver driver, @NotNull final String fileName, int i, int i2) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.Companion;
        this.timeout = DurationKt.toDuration(30, DurationUnit.SECONDS);
        if (i <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0".toString());
        }
        if (i2 > 0) {
            this.driver = driver;
            this.readers = new Pool(i, new Function0() { // from class: ue4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConnectionPoolImpl._init_$lambda$4(driver, fileName);
                }
            });
            this.writers = new Pool(i2, new Function0() { // from class: ve4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return driver.open(fileName);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0".toString());
    }
}
