package com.xiaomi.fitness.watch.face.install;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl$preInstall$1$3$1", f = "FaceInstallHuamiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceInstallHuamiImpl$preInstall$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $action;
    final /* synthetic */ boolean $it;
    int label;
    final /* synthetic */ FaceInstallHuamiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceInstallHuamiImpl$preInstall$1$3$1(boolean z, Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, FaceInstallHuamiImpl faceInstallHuamiImpl, Continuation<? super FaceInstallHuamiImpl$preInstall$1$3$1> continuation) {
        super(2, continuation);
        this.$it = z;
        this.$action = function3;
        this.this$0 = faceInstallHuamiImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceInstallHuamiImpl$preInstall$1$3$1(this.$it, this.$action, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$it) {
            this.$action.invoke(Boxing.boxBoolean(true), Boxing.boxInt(0), null);
        } else {
            Function3<Boolean, Integer, Integer, Unit> function3 = this.$action;
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            WearableDeviceModel wearableDeviceModel = this.this$0.deviceModel;
            function3.invoke(boolBoxBoolean, Boxing.boxInt((wearableDeviceModel == null || !DeviceModelExtKt.isL66(wearableDeviceModel)) ? 101 : 102), null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceInstallHuamiImpl$preInstall$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
