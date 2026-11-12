package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1", f = "BaseHealthMonitorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ Function1<Integer, Unit> $failureCallback;
    final /* synthetic */ String $method;
    final /* synthetic */ SyncResult $result;
    final /* synthetic */ Function1<SyncResult, Unit> $successCallback;
    final /* synthetic */ int $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseHealthMonitorViewModel this$0;
    final /* synthetic */ BaseHealthMonitorViewModel.AnonymousClass1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1(SyncResult syncResult, BaseHealthMonitorViewModel baseHealthMonitorViewModel, String str, Function1<? super SyncResult, Unit> function1, BaseHealthMonitorViewModel.AnonymousClass1 anonymousClass1, String str2, int i, Function1<? super Integer, Unit> function2, Continuation<? super BaseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$result = syncResult;
        this.this$0 = baseHealthMonitorViewModel;
        this.$method = str;
        this.$successCallback = function1;
        this.this$1 = anonymousClass1;
        this.$did = str2;
        this.$type = i;
        this.$failureCallback = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1 baseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1 = new BaseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1(this.$result, this.this$0, this.$method, this.$successCallback, this.this$1, this.$did, this.$type, this.$failureCallback, continuation);
        baseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1.L$0 = obj;
        return baseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SyncResult syncResult = this.$result;
        if (syncResult != null) {
            BaseHealthMonitorViewModel baseHealthMonitorViewModel = this.this$0;
            String str = this.$method;
            Function1<SyncResult, Unit> function1 = this.$successCallback;
            BaseHealthMonitorViewModel.AnonymousClass1 anonymousClass1 = this.this$1;
            String str2 = this.$did;
            int i = this.$type;
            if (SyncResultExitKt.isSuccess(syncResult)) {
                Logger.i(baseHealthMonitorViewModel.getTAG(), str + " success");
                if (function1 != null) {
                    function1.invoke2(syncResult);
                }
            } else {
                anonymousClass1.onError(str2, i, syncResult.getCode());
            }
        } else {
            BaseHealthMonitorViewModel baseHealthMonitorViewModel2 = this.this$0;
            String str3 = this.$method;
            Function1<Integer, Unit> function2 = this.$failureCallback;
            baseHealthMonitorViewModel2.getLoadStatus().postValue(Boxing.boxInt(3));
            Logger.e(baseHealthMonitorViewModel2.getTAG(), str3 + " error: result is null");
            if (function2 != null) {
                function2.invoke2(Boxing.boxInt(-1));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
