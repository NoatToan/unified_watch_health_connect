package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "transactor", "Landroidx/room/Transactor;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 67}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n*L\n1#1,66:1\n91#2:67\n*E\n"})
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1<R> extends SuspendLambda implements Function2<Transactor, Continuation<? super R>, Object> {
    final /* synthetic */ Function1 $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "R", "Landroidx/room/TransactionScope;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n*L\n1#1,59:1\n91#2:60\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<R>, Continuation<? super R>, Object> {
        final /* synthetic */ Function1 $block$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, Function1 function1) {
            super(2, continuation);
            this.$block$inlined = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.$block$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransactionScope<R> transactionScope, Continuation<? super R> continuation) {
            return ((AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.$block$inlined;
                this.label = 1;
                InlineMarker.mark(6);
                obj = function1.invoke2(this);
                InlineMarker.mark(7);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(boolean z, boolean z2, RoomDatabase roomDatabase, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, continuation, this.$block$inlined);
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1.L$0 = obj;
        return dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Transactor transactor, Continuation<? super R> continuation) {
        return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor transactor;
        Transactor transactor2;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Object objInTransaction;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Transactor transactor3 = (Transactor) this.L$0;
            if (!this.$inTransaction) {
                Function1 function1 = this.$block$inlined;
                this.label = 5;
                InlineMarker.mark(6);
                Object objInvoke2 = function1.invoke2(this);
                InlineMarker.mark(7);
                return objInvoke2 == coroutine_suspended ? coroutine_suspended : objInvoke2;
            }
            boolean z = this.$isReadOnly;
            sQLiteTransactionType = z ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
            if (z) {
                transactor = transactor3;
            } else {
                this.L$0 = transactor3;
                this.L$1 = sQLiteTransactionType;
                this.label = 1;
                Object objInTransaction2 = transactor3.inTransaction(this);
                if (objInTransaction2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Transactor.SQLiteTransactionType sQLiteTransactionType3 = sQLiteTransactionType;
                transactor2 = transactor3;
                obj = objInTransaction2;
                sQLiteTransactionType2 = sQLiteTransactionType3;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$block$inlined);
            this.L$0 = transactor;
            this.L$1 = null;
            this.label = 3;
            obj = transactor.withTransaction(sQLiteTransactionType, anonymousClass1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!this.$isReadOnly) {
                return obj;
            }
            this.L$0 = obj;
            this.label = 4;
            objInTransaction = transactor.inTransaction(this);
            if (objInTransaction == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj;
            obj = objInTransaction;
            if (!((Boolean) obj).booleanValue()) {
                this.$this_internalPerform.getInvalidationTracker().refreshAsync();
            }
            return obj2;
        }
        if (i == 1) {
            sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.L$1;
            transactor2 = (Transactor) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.L$1;
            transactor2 = (Transactor) this.L$0;
            ResultKt.throwOnFailure(obj);
            Transactor transactor4 = transactor2;
            sQLiteTransactionType = sQLiteTransactionType2;
            transactor = transactor4;
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(null, this.$block$inlined);
            this.L$0 = transactor;
            this.L$1 = null;
            this.label = 3;
            obj = transactor.withTransaction(sQLiteTransactionType, anonymousClass2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!this.$isReadOnly) {
                return obj;
            }
            this.L$0 = obj;
            this.label = 4;
            objInTransaction = transactor.inTransaction(this);
            if (objInTransaction == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj;
            obj = objInTransaction;
        } else if (i == 3) {
            transactor = (Transactor) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!this.$isReadOnly) {
                return obj;
            }
            this.L$0 = obj;
            this.label = 4;
            objInTransaction = transactor.inTransaction(this);
            if (objInTransaction == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj;
            obj = objInTransaction;
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            this.$this_internalPerform.getInvalidationTracker().refreshAsync();
        }
        return obj2;
        if (!((Boolean) obj).booleanValue()) {
            InvalidationTracker invalidationTracker = this.$this_internalPerform.getInvalidationTracker();
            this.L$0 = transactor2;
            this.L$1 = sQLiteTransactionType2;
            this.label = 2;
            if (invalidationTracker.sync$room_runtime_release(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Transactor transactor5 = transactor2;
        sQLiteTransactionType = sQLiteTransactionType2;
        transactor = transactor5;
        AnonymousClass1 anonymousClass3 = new AnonymousClass1(null, this.$block$inlined);
        this.L$0 = transactor;
        this.L$1 = null;
        this.label = 3;
        obj = transactor.withTransaction(sQLiteTransactionType, anonymousClass3, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (!this.$isReadOnly) {
            return obj;
        }
        this.L$0 = obj;
        this.label = 4;
        objInTransaction = transactor.inTransaction(this);
        if (objInTransaction == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj2 = obj;
        obj = objInTransaction;
        if (!((Boolean) obj).booleanValue()) {
            this.$this_internalPerform.getInvalidationTracker().refreshAsync();
        }
        return obj2;
    }
}
