package com.xiaomi.fit.device.extensions;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002¨\u0006\u0006"}, d2 = {"unpairWatch", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPhoneSwitching", "", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fit.device.extensions.DeviceExtKt$unpairWatch$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.extensions.DeviceExtKt", f = "DeviceExt.kt", i = {0}, l = {13}, m = "unpairWatch", n = {"$this$unpairWatch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceExtKt.unpairWatch(null, this);
        }
    }

    public static final boolean isPhoneSwitching(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        try {
            String nodeID = wearableDeviceModel.getDeviceInfo().getNodeID();
            if (nodeID != null) {
                return WearOsExtKt.getInstance(WearOSUtil.INSTANCE).isPhoneSwitching(nodeID);
            }
            return false;
        } catch (Exception e) {
            DeviceModelExtKt.logi("unpair watch is " + wearableDeviceModel.getDeviceInfo().getNodeID() + ", exception " + e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.xiaomi.fitness.device.manager.DeviceModel, com.xiaomi.fitness.device.manager.export.WearableDeviceModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.xiaomi.fitness.device.manager.DeviceModel] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    @Nullable
    public static final Object unpairWatch(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objUnbind;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceModelExtKt.logi("unpair watch node id is " + ((WearableDeviceInfo) wearableDeviceModel.getDeviceInfo()).getNodeID());
                String nodeID = ((WearableDeviceInfo) wearableDeviceModel.getDeviceInfo()).getNodeID();
                if (nodeID == null) {
                    return Unit.INSTANCE;
                }
                WearOSUtil wearOsExtKt = WearOsExtKt.getInstance(WearOSUtil.INSTANCE);
                anonymousClass1.L$0 = wearableDeviceModel;
                anonymousClass1.label = 1;
                objUnbind = wearOsExtKt.unbind(nodeID, anonymousClass1);
                if (objUnbind == coroutine_suspended) {
                    wearableDeviceModel = objUnbind;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                wearableDeviceModel = wearableDeviceModel2;
            }
            wearableDeviceModel = objUnbind;
        } catch (Exception e) {
            DeviceModelExtKt.logi("unpair watch node id is " + ((WearableDeviceInfo) wearableDeviceModel.getDeviceInfo()).getNodeID() + ", exception " + e);
        }
        return Unit.INSTANCE;
    }
}
