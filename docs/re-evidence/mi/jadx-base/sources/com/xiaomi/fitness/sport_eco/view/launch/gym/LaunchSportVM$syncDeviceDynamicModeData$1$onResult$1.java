package com.xiaomi.fitness.sport_eco.view.launch.gym;

import defpackage.fs9;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$syncDeviceDynamicModeData$1$onResult$1", f = "LaunchSportVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LaunchSportVM$syncDeviceDynamicModeData$1$onResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ fs9[] $result;
    int label;
    final /* synthetic */ LaunchSportVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchSportVM$syncDeviceDynamicModeData$1$onResult$1(LaunchSportVM launchSportVM, fs9[] fs9VarArr, Continuation<? super LaunchSportVM$syncDeviceDynamicModeData$1$onResult$1> continuation) {
        super(2, continuation);
        this.this$0 = launchSportVM;
        this.$result = fs9VarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchSportVM$syncDeviceDynamicModeData$1$onResult$1(this.this$0, this.$result, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fs9 fs9VarFindEco;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.setMEcoSettingList(this.$result);
        fs9[] mEcoSettingList = this.this$0.getMEcoSettingList();
        boolean z = false;
        if (mEcoSettingList != null && (fs9VarFindEco = this.this$0.findEco(mEcoSettingList, 5)) != null && fs9VarFindEco.d == 1) {
            z = true;
        }
        this.this$0.isDynamicModel().postValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LaunchSportVM$syncDeviceDynamicModeData$1$onResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
