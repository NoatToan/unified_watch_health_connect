package com.xiaomi.fitness.device.manager.ui.tab;

import com.xiaomi.fitness.watch.face.export.FaceWearOsHelper;
import com.xiaomi.fitness.watch.face.export.FaceWearOsHelperExtKt;
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
@DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListViewModel$unbind$1$onSuccess$1", f = "DeviceSettingListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceSettingListViewModel$unbind$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Integer, Unit> $callback;
    final /* synthetic */ String $did;
    final /* synthetic */ boolean $isWearOS;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSettingListViewModel$unbind$1$onSuccess$1(boolean z, String str, Function1<? super Integer, Unit> function1, Continuation<? super DeviceSettingListViewModel$unbind$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$isWearOS = z;
        this.$did = str;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceSettingListViewModel$unbind$1$onSuccess$1(this.$isWearOS, this.$did, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isWearOS) {
            FaceWearOsHelperExtKt.getInstance(FaceWearOsHelper.INSTANCE).unbindWearOs(this.$did);
        }
        this.$callback.invoke2(Boxing.boxInt(0));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceSettingListViewModel$unbind$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
