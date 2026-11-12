package com.xiaomi.fitness.devicesettings.huami.typesort;

import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel$setSportTypeSort$1$1", f = "SportTypeSortViewModel.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class SportTypeSortViewModel$setSportTypeSort$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SportTypeConfig $newConfig;
    int label;
    final /* synthetic */ SportTypeSortViewModel this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel$setSportTypeSort$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortViewModel$setSportTypeSort$1$1$1", f = "SportTypeSortViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SportTypeConfig $newConfig;
        int label;
        final /* synthetic */ SportTypeSortViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SportTypeSortViewModel sportTypeSortViewModel, SportTypeConfig sportTypeConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sportTypeSortViewModel;
            this.$newConfig = sportTypeConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$newConfig, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiApiCaller huamiApiCaller = this.this$0.getHuamiApiCaller();
            this.this$0.getSetRet().postValue(huamiApiCaller != null ? Boxing.boxBoolean(huamiApiCaller.sendSportTypeSort(this.$newConfig)) : null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportTypeSortViewModel$setSportTypeSort$1$1(SportTypeSortViewModel sportTypeSortViewModel, SportTypeConfig sportTypeConfig, Continuation<? super SportTypeSortViewModel$setSportTypeSort$1$1> continuation) {
        super(2, continuation);
        this.this$0 = sportTypeSortViewModel;
        this.$newConfig = sportTypeConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportTypeSortViewModel$setSportTypeSort$1$1(this.this$0, this.$newConfig, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$newConfig, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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
        return ((SportTypeSortViewModel$setSportTypeSort$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
