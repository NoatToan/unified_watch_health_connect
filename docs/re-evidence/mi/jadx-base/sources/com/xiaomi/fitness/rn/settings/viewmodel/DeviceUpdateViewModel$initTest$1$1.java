package com.xiaomi.fitness.rn.settings.viewmodel;

import android.app.Activity;
import android.content.Context;
import com.smarthome.core.device.SmartDeviceInfo;
import com.smarthome.core.ota.SDKBleOtaPresenter;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.extetions.RNLogKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$initTest$1$1", f = "DeviceUpdateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nDeviceUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceUpdateViewModel.kt\ncom/xiaomi/fitness/rn/settings/viewmodel/DeviceUpdateViewModel$initTest$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
public final class DeviceUpdateViewModel$initTest$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ List<RNDevice> $deviceList;
    final /* synthetic */ String $did;
    int label;
    final /* synthetic */ DeviceUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpdateViewModel$initTest$1$1(List<RNDevice> list, String str, DeviceUpdateViewModel deviceUpdateViewModel, Activity activity, Continuation<? super DeviceUpdateViewModel$initTest$1$1> continuation) {
        super(2, continuation);
        this.$deviceList = list;
        this.$did = str;
        this.this$0 = deviceUpdateViewModel;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceUpdateViewModel$initTest$1$1(this.$deviceList, this.$did, this.this$0, this.$activity, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        T next;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        List<RNDevice> list = this.$deviceList;
        String str = this.$did;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((RNDevice) next).getDid(), str));
        objectRef.element = next;
        RNDevice rNDevice = (RNDevice) next;
        RNLogKt.logi(DeviceUpdateViewModel.sTag, "did " + this.$did + "  " + next + " " + (rNDevice != null ? rNDevice.getExtraJson() : null));
        if (((RNDevice) objectRef.element) != null) {
            DeviceUpdateViewModel deviceUpdateViewModel = this.this$0;
            Activity activity = this.$activity;
            SmartDeviceInfo smartDeviceInfo = new SmartDeviceInfo(null, null, null, 0, null, null, null, null, null, null, 1023, null);
            smartDeviceInfo.setDid(((RNDevice) objectRef.element).getDid());
            smartDeviceInfo.setName(((RNDevice) objectRef.element).getName());
            smartDeviceInfo.setModel(((RNDevice) objectRef.element).getModel());
            Device.Detail detail = ((RNDevice) objectRef.element).getDetail();
            smartDeviceInfo.setMac(detail != null ? detail.getMac() : null);
            smartDeviceInfo.setExtraJson(((RNDevice) objectRef.element).getExtraJson());
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            deviceUpdateViewModel.setMPresenter(new SDKBleOtaPresenter(applicationContext, deviceUpdateViewModel, 4, smartDeviceInfo));
            deviceUpdateViewModel.checkBleUpdate();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceUpdateViewModel$initTest$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
