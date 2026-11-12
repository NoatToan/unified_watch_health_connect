package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001a\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001bH\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001f\u001a\u00020\u001bH\u0014J\b\u0010 \u001a\u00020\u001bH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002!\"¨\u0006#"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", "T", "Landroidx/lifecycle/LiveData;", "database", "Landroidx/room/RoomDatabase;", "container", "Landroidx/room/InvalidationLiveDataContainer;", "inTransaction", "", "tableNames", "", "", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;Z[Ljava/lang/String;)V", "getDatabase", "()Landroidx/room/RoomDatabase;", "getInTransaction", "()Z", "observer", "Landroidx/room/InvalidationTracker$Observer;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "registeredObserver", "launchContext", "Lkotlin/coroutines/CoroutineContext;", "refresh", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidated", "compute", "onActive", "onInactive", "Landroidx/room/RoomCallableTrackingLiveData;", "Landroidx/room/RoomLambdaTrackingLiveData;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RoomTrackingLiveData<T> extends LiveData<T> {

    @NotNull
    private final AtomicBoolean computing;

    @NotNull
    private final InvalidationLiveDataContainer container;

    @NotNull
    private final RoomDatabase database;
    private final boolean inTransaction;

    @NotNull
    private final AtomicBoolean invalid;

    @NotNull
    private final CoroutineContext launchContext;

    @NotNull
    private final InvalidationTracker.Observer observer;

    @NotNull
    private final AtomicBoolean registeredObserver;

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$invalidated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData$invalidated$1", f = "RoomTrackingLiveData.android.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RoomTrackingLiveData<T> roomTrackingLiveData = this.this$0;
                this.label = 1;
                if (roomTrackingLiveData.refresh(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$onActive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData$onActive$1", f = "RoomTrackingLiveData.android.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12841(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation<? super C12841> continuation) {
            super(2, continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12841(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RoomTrackingLiveData<T> roomTrackingLiveData = this.this$0;
                this.label = 1;
                if (roomTrackingLiveData.refresh(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$refresh$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", i = {0, 0}, l = {82}, m = "refresh", n = {"this", "computed"}, s = {"L$0", "I$0"})
    public static final class C12851 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12851(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation<? super C12851> continuation) {
            super(continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.refresh(this);
        }
    }

    public /* synthetic */ RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(roomDatabase, invalidationLiveDataContainer, z, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidated() {
        boolean zHasActiveObservers = hasActiveObservers();
        if (this.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            BuildersKt__Builders_commonKt.launch$default(this.database.getCoroutineScope(), this.launchContext, null, new AnonymousClass1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[Catch: all -> 0x0033, Exception -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x002c, B:29:0x0069), top: B:49:0x002c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[LOOP:0: B:27:0x0061->B:32:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002c, B:27:0x0061, B:29:0x0069, B:36:0x0083, B:33:0x0079, B:34:0x0080), top: B:48:0x0022, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005e -> B:27:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0092 -> B:41:0x0094). Please report as a decompilation issue!!! */
    public final Object refresh(Continuation<? super Unit> continuation) {
        C12851 c12851;
        RoomTrackingLiveData roomTrackingLiveData;
        RoomTrackingLiveData roomTrackingLiveData2;
        RoomTrackingLiveData roomTrackingLiveData3;
        int i;
        Object obj;
        Object objCompute;
        if (continuation instanceof C12851) {
            c12851 = (C12851) continuation;
            int i2 = c12851.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c12851.label = i2 - Integer.MIN_VALUE;
            } else {
                c12851 = new C12851(this, continuation);
            }
        } else {
            c12851 = new C12851(this, continuation);
        }
        Object obj2 = c12851.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c12851.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                if (this.registeredObserver.compareAndSet(false, true)) {
                    this.database.getInvalidationTracker().addWeakObserver(this.observer);
                }
                roomTrackingLiveData2 = this;
                if (roomTrackingLiveData2.computing.compareAndSet(false, true)) {
                    obj = null;
                    roomTrackingLiveData = roomTrackingLiveData2;
                    i = 0;
                    while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                        c12851.L$0 = roomTrackingLiveData;
                        c12851.I$0 = 1;
                        c12851.label = 1;
                        objCompute = roomTrackingLiveData.compute(c12851);
                        if (objCompute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objCompute;
                        i = 1;
                    }
                    if (i != 0) {
                        roomTrackingLiveData.postValue(obj);
                    }
                    roomTrackingLiveData.computing.set(false);
                    roomTrackingLiveData3 = roomTrackingLiveData;
                } else {
                    roomTrackingLiveData3 = roomTrackingLiveData2;
                    i = 0;
                }
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c12851.I$0;
            roomTrackingLiveData = (RoomTrackingLiveData) c12851.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                obj = obj2;
                i = i4;
                roomTrackingLiveData = roomTrackingLiveData;
                while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                    c12851.L$0 = roomTrackingLiveData;
                    c12851.I$0 = 1;
                    c12851.label = 1;
                    objCompute = roomTrackingLiveData.compute(c12851);
                    if (objCompute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objCompute;
                    i = 1;
                }
                if (i != 0) {
                    roomTrackingLiveData.postValue(obj);
                }
                roomTrackingLiveData.computing.set(false);
                roomTrackingLiveData3 = roomTrackingLiveData;
                if (i != 0 || !roomTrackingLiveData3.invalid.get()) {
                    return Unit.INSTANCE;
                }
                roomTrackingLiveData2 = roomTrackingLiveData3;
                if (roomTrackingLiveData2.computing.compareAndSet(false, true)) {
                    obj = null;
                    roomTrackingLiveData = roomTrackingLiveData2;
                    i = 0;
                    while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                        c12851.L$0 = roomTrackingLiveData;
                        c12851.I$0 = 1;
                        c12851.label = 1;
                        objCompute = roomTrackingLiveData.compute(c12851);
                        if (objCompute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objCompute;
                        i = 1;
                    }
                    if (i != 0) {
                        roomTrackingLiveData.postValue(obj);
                    }
                    roomTrackingLiveData.computing.set(false);
                    roomTrackingLiveData3 = roomTrackingLiveData;
                } else {
                    roomTrackingLiveData3 = roomTrackingLiveData2;
                    i = 0;
                }
                if (i != 0) {
                }
                return Unit.INSTANCE;
            } catch (Exception e) {
                throw new RuntimeException("Exception while computing database live data.", e);
            }
        } catch (Throwable th) {
            roomTrackingLiveData.computing.set(false);
            throw th;
        }
    }

    @Nullable
    public abstract Object compute(@NotNull Continuation<? super T> continuation);

    @NotNull
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.container.onActive(this);
        BuildersKt__Builders_commonKt.launch$default(this.database.getCoroutineScope(), this.launchContext, null, new C12841(this, null), 2, null);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.container.onInactive(this);
    }

    private RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr) {
        this.database = roomDatabase;
        this.container = invalidationLiveDataContainer;
        this.inTransaction = z;
        this.observer = new RoomTrackingLiveData$observer$1(strArr, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.launchContext = roomDatabase.inCompatibilityMode$room_runtime_release() ? z ? roomDatabase.getTransactionContext$room_runtime_release() : roomDatabase.getQueryContext() : EmptyCoroutineContext.INSTANCE;
    }
}
