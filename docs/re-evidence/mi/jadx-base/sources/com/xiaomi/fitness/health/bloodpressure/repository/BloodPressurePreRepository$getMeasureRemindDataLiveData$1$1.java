package com.xiaomi.fitness.health.bloodpressure.repository;

import androidx.lifecycle.LiveDataScope;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressureRemindUtils;
import defpackage.i4b;
import defpackage.tz2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Ltz2;", "", "<anonymous>", "(Landroidx/lifecycle/LiveDataScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1", f = "BloodPressurePreRepository.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1 extends SuspendLambda implements Function2<LiveDataScope<tz2>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $input;
    final /* synthetic */ String $keyItem;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1$1", f = "BloodPressurePreRepository.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LiveDataScope<tz2> $$this$liveData;
        final /* synthetic */ String $input;
        final /* synthetic */ String $keyItem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, LiveDataScope<tz2> liveDataScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$input = str;
            this.$keyItem = str2;
            this.$$this$liveData = liveDataScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$input, this.$keyItem, this.$$this$liveData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$input;
                String defaultRemindMeasureString = (str == null || StringsKt__StringsKt.isBlank(str)) ? BloodPressureRemindUtils.INSTANCE.getDefaultRemindMeasureString(this.$keyItem) : this.$input;
                Object objFromJson = i4b.a().fromJson(defaultRemindMeasureString, (Class<Object>) tz2.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                tz2 tz2Var = (tz2) objFromJson;
                Logger.i(BloodPressurePreRepository.TAG, "request keyItem:" + this.$keyItem + ";finalInput:" + defaultRemindMeasureString + ";originInput:" + this.$input + ";result:" + tz2Var);
                LiveDataScope<tz2> liveDataScope = this.$$this$liveData;
                this.label = 1;
                if (liveDataScope.emit(tz2Var, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1(String str, String str2, Continuation<? super BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1> continuation) {
        super(2, continuation);
        this.$input = str;
        this.$keyItem = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1 bloodPressurePreRepository$getMeasureRemindDataLiveData$1$1 = new BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1(this.$input, this.$keyItem, continuation);
        bloodPressurePreRepository$getMeasureRemindDataLiveData$1$1.L$0 = obj;
        return bloodPressurePreRepository$getMeasureRemindDataLiveData$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<tz2> liveDataScope, Continuation<? super Unit> continuation) {
        return ((BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$input, this.$keyItem, liveDataScope, null);
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
}
