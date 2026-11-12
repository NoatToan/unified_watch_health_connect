package com.xiaomi.fitness.electronic.scale.manager;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.electronic.scale.dao.ClaimRecordDatabase;
import com.xiaomi.fitness.electronic.scale.dao.dao.ClaimRecordDao;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper;
import defpackage.qal;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\"\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ$\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0004\u0012\u00020\u000b0\u0019R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/manager/ClaimRecordHelper;", "", "<init>", "()V", "claimRecordDao", "Lcom/xiaomi/fitness/electronic/scale/dao/dao/ClaimRecordDao;", "getClaimRecordDao", "()Lcom/xiaomi/fitness/electronic/scale/dao/dao/ClaimRecordDao;", "claimRecordDao$delegate", "Lkotlin/Lazy;", "insertClaimRecord", "", "claimRecord", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "callBack", "Lkotlin/Function0;", "insertClaimRecords", "claimRecords", "", "deleteClaimRecord", "did", "", "createTime", "", "queryByDid", "Lkotlin/Function1;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClaimRecordHelper {

    @NotNull
    public static final ClaimRecordHelper INSTANCE = new ClaimRecordHelper();

    /* JADX INFO: renamed from: claimRecordDao$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy claimRecordDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gy3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimRecordHelper.claimRecordDao_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$deleteClaimRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$deleteClaimRecord$1", f = "ClaimRecordHelper.kt", i = {0}, l = {50}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ long $createTime;
        final /* synthetic */ String $did;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$deleteClaimRecord$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$deleteClaimRecord$1$1", f = "ClaimRecordHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callBack;
            final /* synthetic */ Ref.IntRef $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05591(Ref.IntRef intRef, Function0<Unit> function0, Continuation<? super C05591> continuation) {
                super(2, continuation);
                this.$result = intRef;
                this.$callBack = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05591(this.$result, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                qal.c("claim record db deleteClaimRecord() result:" + this.$result.element);
                this.$callBack.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$createTime = j;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$did, this.$createTime, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.IntRef intRef;
            Ref.IntRef intRef2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.IntRef intRef3 = new Ref.IntRef();
                ClaimRecordDao claimRecordDao = ClaimRecordHelper.INSTANCE.getClaimRecordDao();
                String str = this.$did;
                long j = this.$createTime;
                this.L$0 = intRef3;
                this.L$1 = intRef3;
                this.label = 1;
                Object objDeleteClaimRecord = claimRecordDao.deleteClaimRecord(str, j, this);
                if (objDeleteClaimRecord == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intRef = intRef3;
                obj = objDeleteClaimRecord;
                intRef2 = intRef;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef = (Ref.IntRef) this.L$1;
                intRef2 = (Ref.IntRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            intRef.element = ((Number) obj).intValue();
            AnyExtKt.main$default(null, new C05591(intRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$insertClaimRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$insertClaimRecord$1", f = "ClaimRecordHelper.kt", i = {0}, l = {22}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class C23651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ ClaimRecord $claimRecord;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$insertClaimRecord$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$insertClaimRecord$1$1", f = "ClaimRecordHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callBack;
            final /* synthetic */ Ref.LongRef $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05601(Ref.LongRef longRef, Function0<Unit> function0, Continuation<? super C05601> continuation) {
                super(2, continuation);
                this.$result = longRef;
                this.$callBack = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05601(this.$result, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                qal.c("claim record db insertClaimRecord() result:" + this.$result.element);
                this.$callBack.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23651(ClaimRecord claimRecord, Function0<Unit> function0, Continuation<? super C23651> continuation) {
            super(2, continuation);
            this.$claimRecord = claimRecord;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23651(this.$claimRecord, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.LongRef longRef;
            Ref.LongRef longRef2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.LongRef longRef3 = new Ref.LongRef();
                ClaimRecordDao claimRecordDao = ClaimRecordHelper.INSTANCE.getClaimRecordDao();
                ClaimRecord claimRecord = this.$claimRecord;
                this.L$0 = longRef3;
                this.L$1 = longRef3;
                this.label = 1;
                Object objInsertClaimRecord = claimRecordDao.insertClaimRecord(claimRecord, this);
                if (objInsertClaimRecord == coroutine_suspended) {
                    return coroutine_suspended;
                }
                longRef = longRef3;
                obj = objInsertClaimRecord;
                longRef2 = longRef;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (Ref.LongRef) this.L$1;
                longRef2 = (Ref.LongRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            longRef.element = ((Number) obj).longValue();
            AnyExtKt.main$default(null, new C05601(longRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$insertClaimRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$insertClaimRecords$1", f = "ClaimRecordHelper.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class C23661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ List<ClaimRecord> $claimRecords;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$insertClaimRecords$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$insertClaimRecords$1$1", f = "ClaimRecordHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callBack;
            final /* synthetic */ Ref.ObjectRef<Long[]> $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05611(Ref.ObjectRef<Long[]> objectRef, Function0<Unit> function0, Continuation<? super C05611> continuation) {
                super(2, continuation);
                this.$result = objectRef;
                this.$callBack = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05611(this.$result, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                qal.c("claim record db insertClaimRecords() result:" + this.$result.element);
                this.$callBack.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23661(List<ClaimRecord> list, Function0<Unit> function0, Continuation<? super C23661> continuation) {
            super(2, continuation);
            this.$claimRecords = list;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23661(this.$claimRecords, this.$callBack, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            T t;
            Ref.ObjectRef objectRef2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                ClaimRecordDao claimRecordDao = ClaimRecordHelper.INSTANCE.getClaimRecordDao();
                List<ClaimRecord> list = this.$claimRecords;
                this.L$0 = objectRef3;
                this.L$1 = objectRef3;
                this.label = 1;
                Object objInsertClaimRecords = claimRecordDao.insertClaimRecords(list, this);
                if (objInsertClaimRecords == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef3;
                t = objInsertClaimRecords;
                objectRef2 = objectRef;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
            }
            objectRef.element = t;
            AnyExtKt.main$default(null, new C05611(objectRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$queryByDid$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$queryByDid$1", f = "ClaimRecordHelper.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"list"}, s = {"L$0"})
    public static final class C23671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<ClaimRecord>, Unit> $callBack;
        final /* synthetic */ String $did;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$queryByDid$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper$queryByDid$1$1", f = "ClaimRecordHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<ClaimRecord>, Unit> $callBack;
            final /* synthetic */ Ref.ObjectRef<List<ClaimRecord>> $list;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05621(Ref.ObjectRef<List<ClaimRecord>> objectRef, Function1<? super List<ClaimRecord>, Unit> function1, Continuation<? super C05621> continuation) {
                super(2, continuation);
                this.$list = objectRef;
                this.$callBack = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05621(this.$list, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<ClaimRecord> list = this.$list.element;
                qal.c("claim record db queryByUid list size:" + (list != null ? Boxing.boxInt(list.size()) : null));
                this.$callBack.invoke2(this.$list.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23671(String str, Function1<? super List<ClaimRecord>, Unit> function1, Continuation<? super C23671> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23671(this.$did, this.$callBack, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            T t;
            Ref.ObjectRef objectRef2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                ClaimRecordDao claimRecordDao = ClaimRecordHelper.INSTANCE.getClaimRecordDao();
                String str = this.$did;
                this.L$0 = objectRef3;
                this.L$1 = objectRef3;
                this.label = 1;
                Object objQueryByDid = claimRecordDao.queryByDid(str, this);
                if (objQueryByDid == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef3;
                t = objQueryByDid;
                objectRef2 = objectRef;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
            }
            objectRef.element = t;
            AnyExtKt.main$default(null, new C05621(objectRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private ClaimRecordHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClaimRecordDao claimRecordDao_delegate$lambda$0() {
        return ClaimRecordDatabase.INSTANCE.getInstance().getClaimRecordDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClaimRecordDao getClaimRecordDao() {
        return (ClaimRecordDao) claimRecordDao.getValue();
    }

    public final void deleteClaimRecord(@NotNull String did, long createTime, @NotNull Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new AnonymousClass1(did, createTime, callBack, null), 1, null);
    }

    public final void insertClaimRecord(@NotNull ClaimRecord claimRecord, @NotNull Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(claimRecord, "claimRecord");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23651(claimRecord, callBack, null), 1, null);
    }

    public final void insertClaimRecords(@NotNull List<ClaimRecord> claimRecords, @NotNull Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(claimRecords, "claimRecords");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23661(claimRecords, callBack, null), 1, null);
    }

    public final void queryByDid(@NotNull String did, @NotNull Function1<? super List<ClaimRecord>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23671(did, callBack, null), 1, null);
    }
}
