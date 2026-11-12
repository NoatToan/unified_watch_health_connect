package com.xiaomi.fitness.devicesettings.base.sedenraty;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import defpackage.st9;
import defpackage.xc6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lst9;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lst9;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1", f = "Sedentary2ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super st9>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Sedentary2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1(Sedentary2ViewModel sedentary2ViewModel, Continuation<? super Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1> continuation) {
        super(2, continuation);
        this.this$0 = sedentary2ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1 sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1 = new Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1(this.this$0, continuation);
        sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1.L$0 = obj;
        return sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
        if (deviceModel != null) {
            Sedentary2ViewModel sedentary2ViewModel = this.this$0;
            Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_SEDENTARY_REMIND).valueToObject(SedentaryConfig.class);
            SedentaryConfig sedentaryConfig = objValueToObject != null ? (SedentaryConfig) objValueToObject : null;
            xc6.d("getHuaMiSedentaryInfo " + (sedentaryConfig == null));
            st9 st9VarConvertConfig2Sedentary = sedentary2ViewModel.convertConfig2Sedentary(sedentaryConfig);
            if (st9VarConvertConfig2Sedentary != null) {
                return st9VarConvertConfig2Sedentary;
            }
        }
        xc6.d("getHuaMiSedentaryInfo error:deviceModel is null");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super st9> continuation) {
        return ((Sedentary2ViewModel$getHuaMiSedentaryInfo$1$sedentary$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
