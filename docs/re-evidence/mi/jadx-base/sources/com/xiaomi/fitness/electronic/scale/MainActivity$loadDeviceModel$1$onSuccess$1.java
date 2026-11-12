package com.xiaomi.fitness.electronic.scale;

import android.os.Handler;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.MainActivity$loadDeviceModel$1$onSuccess$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/xiaomi/fitness/electronic/scale/MainActivity$loadDeviceModel$1$onSuccess$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1012:1\n1#2:1013\n*E\n"})
public final class MainActivity$loadDeviceModel$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$loadDeviceModel$1$onSuccess$1(MainActivity mainActivity, Continuation<? super MainActivity$loadDeviceModel$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$loadDeviceModel$1$onSuccess$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MainActivity mainActivity = this.this$0;
        String mDeviceDid = mainActivity.getMDeviceDid();
        mainActivity.mDeviceModel = mDeviceDid != null ? (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(mDeviceDid) : null;
        Logger.i(MainActivity.TAG, "refresh mDeviceModel : " + this.this$0.mDeviceModel);
        if (this.this$0.mDeviceModel != null) {
            this.this$0.initDeviceModel();
            this.this$0.updateLogoAndTitle();
            this.this$0.updateSomeEntranceVisibility();
        } else {
            Handler handler = this.this$0.handler;
            final MainActivity mainActivity2 = this.this$0;
            Boxing.boxBoolean(handler.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.electronic.scale.c
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.access$loadDeviceModel(mainActivity2);
                }
            }, VibrateModeProgressBar.sLongToLong));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$loadDeviceModel$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
