package com.xiaomi.fitness.electronic.scale.manager;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.electronic.scale.dao.VirtualAccountDatabase;
import com.xiaomi.fitness.electronic.scale.dao.dao.VirtualAccountDao;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J$\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ(\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\u0004\u0012\u00020\u000b0\u0018J8\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\u0004\u0012\u00020\u000b0\u0018J8\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\u0004\u0012\u00020\u000b0\u0018J(\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\u0004\u0012\u00020\u000b0\u0018J0\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\u0004\u0012\u00020\u000b0\u0018J\u001c\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\"\u0010#\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ(\u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\u0004\u0012\u00020\u000b0\u0018J(\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\u0004\u0012\u00020\u000b0\u0018R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/manager/VirtualAccountHelper;", "", "<init>", "()V", "virtualAccountDao", "Lcom/xiaomi/fitness/electronic/scale/dao/dao/VirtualAccountDao;", "getVirtualAccountDao", "()Lcom/xiaomi/fitness/electronic/scale/dao/dao/VirtualAccountDao;", "virtualAccountDao$delegate", "Lkotlin/Lazy;", "insertVirtualAccount", "", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "callBack", "Lkotlin/Function0;", "onSyncWeightRecordCallback", "Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;", "deleteVirtualAccount", "uid", "", "did", "", "queryByUid", "Lkotlin/Function1;", "", "queryVirtualDayData", "startTime", "endTime", "queryVirtualStatisticsData", "queryByUidAndDid", "queryByUidAndDidAndUserType", "userType", "", "updateVirtualAccount", "updateList", "virtualAccounts", "queryWeightRecordByCreateTime", "queryAllData", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VirtualAccountHelper {

    @NotNull
    public static final VirtualAccountHelper INSTANCE = new VirtualAccountHelper();

    /* JADX INFO: renamed from: virtualAccountDao$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy virtualAccountDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nzq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VirtualAccountHelper.virtualAccountDao_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$deleteVirtualAccount$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$deleteVirtualAccount$1", f = "VirtualAccountHelper.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ String $did;
        final /* synthetic */ long $uid;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$deleteVirtualAccount$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$deleteVirtualAccount$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callBack;
            final /* synthetic */ Ref.IntRef $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05631(Ref.IntRef intRef, Function0<Unit> function0, Continuation<? super C05631> continuation) {
                super(2, continuation);
                this.$result = intRef;
                this.$callBack = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05631(this.$result, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                qal.c("db deleteVirtualAccount() result:" + this.$result.element);
                this.$callBack.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, String str, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uid = j;
            this.$did = str;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$uid, this.$did, this.$callBack, continuation);
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
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                long j = this.$uid;
                String str = this.$did;
                this.L$0 = intRef3;
                this.L$1 = intRef3;
                this.label = 1;
                Object objDeleteVirtualAccount = virtualAccountDao.deleteVirtualAccount(j, str, this);
                if (objDeleteVirtualAccount == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intRef = intRef3;
                obj = objDeleteVirtualAccount;
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
            AnyExtKt.main$default(null, new C05631(intRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$insertVirtualAccount$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$insertVirtualAccount$1", f = "VirtualAccountHelper.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class C23681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ SyncWeightRecordCallback $onSyncWeightRecordCallback;
        final /* synthetic */ VirtualAccount $virtualAccount;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$insertVirtualAccount$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$insertVirtualAccount$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callBack;
            final /* synthetic */ Ref.LongRef $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05641(Ref.LongRef longRef, Function0<Unit> function0, Continuation<? super C05641> continuation) {
                super(2, continuation);
                this.$result = longRef;
                this.$callBack = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05641(this.$result, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                qal.c("db insertVirtualAccount() result:" + this.$result.element);
                this.$callBack.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23681(VirtualAccount virtualAccount, SyncWeightRecordCallback syncWeightRecordCallback, Function0<Unit> function0, Continuation<? super C23681> continuation) {
            super(2, continuation);
            this.$virtualAccount = virtualAccount;
            this.$onSyncWeightRecordCallback = syncWeightRecordCallback;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23681(this.$virtualAccount, this.$onSyncWeightRecordCallback, this.$callBack, continuation);
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
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                VirtualAccount virtualAccount = this.$virtualAccount;
                this.L$0 = longRef3;
                this.L$1 = longRef3;
                this.label = 1;
                Object objInsertVirtualAccount = virtualAccountDao.insertVirtualAccount(virtualAccount, this);
                if (objInsertVirtualAccount == coroutine_suspended) {
                    return coroutine_suspended;
                }
                longRef = longRef3;
                obj = objInsertVirtualAccount;
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
            AnyExtKt.main$default(null, new C05641(longRef2, this.$callBack, null), 1, null);
            ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE).syncRecord(this.$onSyncWeightRecordCallback);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryAllData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryAllData$1", f = "VirtualAccountHelper.kt", i = {0}, l = {182}, m = "invokeSuspend", n = {"list"}, s = {"L$0"})
    public static final class C23691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
        final /* synthetic */ VirtualAccount $virtualAccount;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryAllData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryAllData$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
            final /* synthetic */ Ref.ObjectRef<List<VirtualAccount>> $list;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05651(Ref.ObjectRef<List<VirtualAccount>> objectRef, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C05651> continuation) {
                super(2, continuation);
                this.$list = objectRef;
                this.$callBack = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05651(this.$list, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<VirtualAccount> list = this.$list.element;
                qal.c("db queryByVirtualid list size:" + (list != null ? Boxing.boxInt(list.size()) : null));
                this.$callBack.invoke2(this.$list.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23691(VirtualAccount virtualAccount, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C23691> continuation) {
            super(2, continuation);
            this.$virtualAccount = virtualAccount;
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23691(this.$virtualAccount, this.$callBack, continuation);
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
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                long accountId = this.$virtualAccount.getAccountId();
                this.L$0 = objectRef3;
                this.L$1 = objectRef3;
                this.label = 1;
                Object objQueryByAid = virtualAccountDao.queryByAid(accountId, this);
                if (objQueryByAid == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef3;
                t = objQueryByAid;
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
            AnyExtKt.main$default(null, new C05651(objectRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUid$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUid$1", f = "VirtualAccountHelper.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"list"}, s = {"L$0"})
    public static final class C23701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
        final /* synthetic */ VirtualAccount $virtualAccount;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUid$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUid$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
            final /* synthetic */ Ref.ObjectRef<List<VirtualAccount>> $list;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05661(Ref.ObjectRef<List<VirtualAccount>> objectRef, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C05661> continuation) {
                super(2, continuation);
                this.$list = objectRef;
                this.$callBack = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05661(this.$list, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<VirtualAccount> list = this.$list.element;
                qal.c("db queryByUid list size:" + (list != null ? Boxing.boxInt(list.size()) : null));
                this.$callBack.invoke2(this.$list.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23701(VirtualAccount virtualAccount, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C23701> continuation) {
            super(2, continuation);
            this.$virtualAccount = virtualAccount;
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23701(this.$virtualAccount, this.$callBack, continuation);
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
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                long uid = this.$virtualAccount.getUid();
                this.L$0 = objectRef3;
                this.L$1 = objectRef3;
                this.label = 1;
                Object objQueryByUid = virtualAccountDao.queryByUid(uid, this);
                if (objQueryByUid == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef3;
                t = objQueryByUid;
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
            AnyExtKt.main$default(null, new C05661(objectRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUidAndDid$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUidAndDid$1", f = "VirtualAccountHelper.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"list"}, s = {"L$0"})
    public static final class C23711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
        final /* synthetic */ VirtualAccount $virtualAccount;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUidAndDid$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUidAndDid$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
            final /* synthetic */ Ref.ObjectRef<List<VirtualAccount>> $list;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05671(Ref.ObjectRef<List<VirtualAccount>> objectRef, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C05671> continuation) {
                super(2, continuation);
                this.$list = objectRef;
                this.$callBack = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05671(this.$list, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<VirtualAccount> list = this.$list.element;
                qal.c("db queryByUidAndDid list size:" + (list != null ? Boxing.boxInt(list.size()) : null));
                this.$callBack.invoke2(this.$list.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23711(VirtualAccount virtualAccount, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C23711> continuation) {
            super(2, continuation);
            this.$virtualAccount = virtualAccount;
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23711(this.$virtualAccount, this.$callBack, continuation);
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
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                long uid = this.$virtualAccount.getUid();
                String did = this.$virtualAccount.getDid();
                this.L$0 = objectRef3;
                this.L$1 = objectRef3;
                this.label = 1;
                Object objQueryByUidAndDid = virtualAccountDao.queryByUidAndDid(uid, did, this);
                if (objQueryByUidAndDid == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef3;
                t = objQueryByUidAndDid;
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
            AnyExtKt.main$default(null, new C05671(objectRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUidAndDidAndUserType$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUidAndDidAndUserType$1", f = "VirtualAccountHelper.kt", i = {}, l = {120, 125}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
        final /* synthetic */ int $userType;
        final /* synthetic */ VirtualAccount $virtualAccount;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUidAndDidAndUserType$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryByUidAndDidAndUserType$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
            final /* synthetic */ List<VirtualAccount> $list;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05681(List<VirtualAccount> list, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C05681> continuation) {
                super(2, continuation);
                this.$list = list;
                this.$callBack = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05681(this.$list, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<VirtualAccount> list = this.$list;
                qal.c("db queryByUidAndDid list size:" + (list != null ? Boxing.boxInt(list.size()) : null));
                this.$callBack.invoke2(this.$list);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23721(int i, VirtualAccount virtualAccount, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C23721> continuation) {
            super(2, continuation);
            this.$userType = i;
            this.$virtualAccount = virtualAccount;
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23721(this.$userType, this.$virtualAccount, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$userType == 2) {
                    VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                    long accountId = this.$virtualAccount.getAccountId();
                    String did = this.$virtualAccount.getDid();
                    this.label = 1;
                    obj = virtualAccountDao.queryByAccountIdAndDid(accountId, did, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = (List) obj;
                } else {
                    VirtualAccountDao virtualAccountDao2 = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                    long uid = this.$virtualAccount.getUid();
                    String did2 = this.$virtualAccount.getDid();
                    this.label = 2;
                    obj = virtualAccountDao2.queryByUidAndDid(uid, did2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = (List) obj;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
            }
            AnyExtKt.main$default(null, new C05681(list, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryVirtualDayData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryVirtualDayData$1", f = "VirtualAccountHelper.kt", i = {0}, l = {72}, m = "invokeSuspend", n = {"list"}, s = {"L$0"})
    public static final class C23731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
        final /* synthetic */ long $endTime;
        final /* synthetic */ long $startTime;
        final /* synthetic */ VirtualAccount $virtualAccount;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryVirtualDayData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryVirtualDayData$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
            final /* synthetic */ Ref.ObjectRef<List<VirtualAccount>> $list;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05691(Ref.ObjectRef<List<VirtualAccount>> objectRef, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C05691> continuation) {
                super(2, continuation);
                this.$list = objectRef;
                this.$callBack = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05691(this.$list, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<VirtualAccount> list = this.$list.element;
                qal.c("db queryByVirtualid list size:" + (list != null ? Boxing.boxInt(list.size()) : null));
                this.$callBack.invoke2(this.$list.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23731(VirtualAccount virtualAccount, long j, long j2, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C23731> continuation) {
            super(2, continuation);
            this.$virtualAccount = virtualAccount;
            this.$startTime = j;
            this.$endTime = j2;
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23731(this.$virtualAccount, this.$startTime, this.$endTime, this.$callBack, continuation);
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
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                long accountId = this.$virtualAccount.getAccountId();
                long j = this.$startTime;
                long j2 = this.$endTime;
                this.L$0 = objectRef3;
                this.L$1 = objectRef3;
                this.label = 1;
                Object objQueryVirtualDayData = virtualAccountDao.queryVirtualDayData(accountId, j, j2, this);
                if (objQueryVirtualDayData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef3;
                t = objQueryVirtualDayData;
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
            AnyExtKt.main$default(null, new C05691(objectRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryVirtualStatisticsData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryVirtualStatisticsData$1", f = "VirtualAccountHelper.kt", i = {0}, l = {86}, m = "invokeSuspend", n = {"list"}, s = {"L$0"})
    public static final class C23741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
        final /* synthetic */ long $endTime;
        final /* synthetic */ long $startTime;
        final /* synthetic */ VirtualAccount $virtualAccount;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryVirtualStatisticsData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryVirtualStatisticsData$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
            final /* synthetic */ Ref.ObjectRef<List<VirtualAccount>> $list;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05701(Ref.ObjectRef<List<VirtualAccount>> objectRef, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C05701> continuation) {
                super(2, continuation);
                this.$list = objectRef;
                this.$callBack = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05701(this.$list, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<VirtualAccount> list = this.$list.element;
                qal.c("db queryVirtualStatisticsData list size:" + (list != null ? Boxing.boxInt(list.size()) : null));
                this.$callBack.invoke2(this.$list.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23741(VirtualAccount virtualAccount, long j, long j2, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C23741> continuation) {
            super(2, continuation);
            this.$virtualAccount = virtualAccount;
            this.$startTime = j;
            this.$endTime = j2;
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23741(this.$virtualAccount, this.$startTime, this.$endTime, this.$callBack, continuation);
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
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                long accountId = this.$virtualAccount.getAccountId();
                long j = this.$startTime;
                long j2 = this.$endTime;
                this.L$0 = objectRef3;
                this.L$1 = objectRef3;
                this.label = 1;
                Object objQueryVirtualStatisticsData = virtualAccountDao.queryVirtualStatisticsData(accountId, j, j2, this);
                if (objQueryVirtualStatisticsData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef3;
                t = objQueryVirtualStatisticsData;
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
            AnyExtKt.main$default(null, new C05701(objectRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryWeightRecordByCreateTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryWeightRecordByCreateTime$1", f = "VirtualAccountHelper.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
        final /* synthetic */ VirtualAccount $virtualAccount;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryWeightRecordByCreateTime$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$queryWeightRecordByCreateTime$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<VirtualAccount>, Unit> $callBack;
            final /* synthetic */ List<VirtualAccount> $list;
            final /* synthetic */ VirtualAccount $virtualAccount;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05711(VirtualAccount virtualAccount, Function1<? super List<VirtualAccount>, Unit> function1, List<VirtualAccount> list, Continuation<? super C05711> continuation) {
                super(2, continuation);
                this.$virtualAccount = virtualAccount;
                this.$callBack = function1;
                this.$list = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05711(this.$virtualAccount, this.$callBack, this.$list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                qal.c("db queryLastWeightRecordByCreateTime() createTime : " + this.$virtualAccount.getCreateTime());
                this.$callBack.invoke2(this.$list);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23751(VirtualAccount virtualAccount, Function1<? super List<VirtualAccount>, Unit> function1, Continuation<? super C23751> continuation) {
            super(2, continuation);
            this.$virtualAccount = virtualAccount;
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23751(this.$virtualAccount, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                long accountId = this.$virtualAccount.getAccountId();
                long createTime = this.$virtualAccount.getCreateTime();
                this.label = 1;
                obj = virtualAccountDao.queryLastWeightRecordByCreateTime(accountId, createTime, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C05711(this.$virtualAccount, this.$callBack, (List) obj, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$updateList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$updateList$1", f = "VirtualAccountHelper.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ List<VirtualAccount> $virtualAccounts;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$updateList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$updateList$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callBack;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05721(Function0<Unit> function0, Continuation<? super C05721> continuation) {
                super(2, continuation);
                this.$callBack = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05721(this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                qal.c("db updateList()");
                this.$callBack.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23761(List<VirtualAccount> list, Function0<Unit> function0, Continuation<? super C23761> continuation) {
            super(2, continuation);
            this.$virtualAccounts = list;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23761(this.$virtualAccounts, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                List<VirtualAccount> list = this.$virtualAccounts;
                this.label = 1;
                if (virtualAccountDao.updateVirtualAccount(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C05721(this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$updateVirtualAccount$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$updateVirtualAccount$1", f = "VirtualAccountHelper.kt", i = {0}, l = {140}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class C23771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ VirtualAccount $virtualAccount;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$updateVirtualAccount$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper$updateVirtualAccount$1$1", f = "VirtualAccountHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callBack;
            final /* synthetic */ Ref.IntRef $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05731(Ref.IntRef intRef, Function0<Unit> function0, Continuation<? super C05731> continuation) {
                super(2, continuation);
                this.$result = intRef;
                this.$callBack = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05731(this.$result, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                qal.c("db updateVirtualAccount() result:" + this.$result.element);
                this.$callBack.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23771(VirtualAccount virtualAccount, Function0<Unit> function0, Continuation<? super C23771> continuation) {
            super(2, continuation);
            this.$virtualAccount = virtualAccount;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23771(this.$virtualAccount, this.$callBack, continuation);
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
                VirtualAccountDao virtualAccountDao = VirtualAccountHelper.INSTANCE.getVirtualAccountDao();
                VirtualAccount virtualAccount = this.$virtualAccount;
                this.L$0 = intRef3;
                this.L$1 = intRef3;
                this.label = 1;
                Object objUpdateVirtualAccount = virtualAccountDao.updateVirtualAccount(virtualAccount, this);
                if (objUpdateVirtualAccount == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intRef = intRef3;
                obj = objUpdateVirtualAccount;
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
            AnyExtKt.main$default(null, new C05731(intRef2, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private VirtualAccountHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VirtualAccountDao getVirtualAccountDao() {
        return (VirtualAccountDao) virtualAccountDao.getValue();
    }

    public static /* synthetic */ void insertVirtualAccount$default(VirtualAccountHelper virtualAccountHelper, VirtualAccount virtualAccount, Function0 function0, SyncWeightRecordCallback syncWeightRecordCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            syncWeightRecordCallback = null;
        }
        virtualAccountHelper.insertVirtualAccount(virtualAccount, function0, syncWeightRecordCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VirtualAccountDao virtualAccountDao_delegate$lambda$0() {
        return VirtualAccountDatabase.INSTANCE.getInstance().getVirtualAccountDao();
    }

    public final void deleteVirtualAccount(long uid, @NotNull String did, @NotNull Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new AnonymousClass1(uid, did, callBack, null), 1, null);
    }

    public final void insertVirtualAccount(@NotNull VirtualAccount virtualAccount, @NotNull Function0<Unit> callBack, @Nullable SyncWeightRecordCallback onSyncWeightRecordCallback) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23681(virtualAccount, onSyncWeightRecordCallback, callBack, null), 1, null);
    }

    public final void queryAllData(@NotNull VirtualAccount virtualAccount, @NotNull Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23691(virtualAccount, callBack, null), 1, null);
    }

    public final void queryByUid(@NotNull VirtualAccount virtualAccount, @NotNull Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23701(virtualAccount, callBack, null), 1, null);
    }

    public final void queryByUidAndDid(@NotNull VirtualAccount virtualAccount, @NotNull Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23711(virtualAccount, callBack, null), 1, null);
    }

    public final void queryByUidAndDidAndUserType(int userType, @NotNull VirtualAccount virtualAccount, @NotNull Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23721(userType, virtualAccount, callBack, null), 1, null);
    }

    public final void queryVirtualDayData(@NotNull VirtualAccount virtualAccount, long startTime, long endTime, @NotNull Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23731(virtualAccount, startTime, endTime, callBack, null), 1, null);
    }

    public final void queryVirtualStatisticsData(@NotNull VirtualAccount virtualAccount, long startTime, long endTime, @NotNull Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23741(virtualAccount, startTime, endTime, callBack, null), 1, null);
    }

    public final void queryWeightRecordByCreateTime(@NotNull VirtualAccount virtualAccount, @NotNull Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23751(virtualAccount, callBack, null), 1, null);
    }

    public final void updateList(@NotNull List<VirtualAccount> virtualAccounts, @NotNull Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccounts, "virtualAccounts");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23761(virtualAccounts, callBack, null), 1, null);
    }

    public final void updateVirtualAccount(@NotNull VirtualAccount virtualAccount, @NotNull Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23771(virtualAccount, callBack, null), 1, null);
    }
}
