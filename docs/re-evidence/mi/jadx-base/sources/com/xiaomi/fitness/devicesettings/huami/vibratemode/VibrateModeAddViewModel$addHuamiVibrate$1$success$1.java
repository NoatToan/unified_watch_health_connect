package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAddViewModel$addHuamiVibrate$1$success$1", f = "VibrateModeAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nVibrateModeAddViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$addHuamiVibrate$1$success$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1557#2:301\n1628#2,3:302\n*S KotlinDebug\n*F\n+ 1 VibrateModeAddViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAddViewModel$addHuamiVibrate$1$success$1\n*L\n119#1:301\n119#1:302,3\n*E\n"})
public final class VibrateModeAddViewModel$addHuamiVibrate$1$success$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ VibrateBean $vibrateBean;
    final /* synthetic */ VibrateType $vibrateType;
    int label;
    final /* synthetic */ VibrateModeAddViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibrateModeAddViewModel$addHuamiVibrate$1$success$1(VibrateModeAddViewModel vibrateModeAddViewModel, VibrateType vibrateType, VibrateBean vibrateBean, Continuation<? super VibrateModeAddViewModel$addHuamiVibrate$1$success$1> continuation) {
        super(2, continuation);
        this.this$0 = vibrateModeAddViewModel;
        this.$vibrateType = vibrateType;
        this.$vibrateBean = vibrateBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibrateModeAddViewModel$addHuamiVibrate$1$success$1(this.this$0, this.$vibrateType, this.$vibrateBean, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
        boolean vibrate = false;
        if (mDeviceModel != null) {
            VibrateType vibrateType = this.$vibrateType;
            List<VibrateModeProgressBar.VibrateDataItem> times = this.$vibrateBean.getTimes();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(times, 10));
            Iterator<T> it = times.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxShort((short) ((VibrateModeProgressBar.VibrateDataItem) it.next()).getProgress()));
            }
            vibrate = DeviceModelExtKt.setVibrate(mDeviceModel, vibrateType, (short) 0, CollectionsKt___CollectionsKt.toShortArray(arrayList));
        }
        return Boxing.boxBoolean(vibrate);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((VibrateModeAddViewModel$addHuamiVibrate$1$success$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
