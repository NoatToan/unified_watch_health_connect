package com.xiaomi.fitness.rn;

import com.xiaomi.fitness.device.manager.DeviceContainer;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.RNDeviceContainer;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.extetions.RNLogKt;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0002\u0010\nJU\u0010\u0007\u001a\u00020\u000b2,\u0010\f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000ej\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b\u0018\u0001`\r2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/rn/RNDeviceContainer;", "Lcom/xiaomi/fitness/device/manager/DeviceContainer;", "<init>", "()V", "mBindDevices", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "requestBindDeviceList", "", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "updateBindDeviceList", "devices", "clearBindDevice", "getBindDeviceList", "getAllDeviceList", "removeDevice", "did", "", "clearAll", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNDeviceContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNDeviceContainer.kt\ncom/xiaomi/fitness/rn/RNDeviceContainer\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,81:1\n314#2,11:82\n*S KotlinDebug\n*F\n+ 1 RNDeviceContainer.kt\ncom/xiaomi/fitness/rn/RNDeviceContainer\n*L\n25#1:82,11\n*E\n"})
public final class RNDeviceContainer implements DeviceContainer {

    @NotNull
    private final CopyOnWriteArrayList<RNDevice> mBindDevices = new CopyOnWriteArrayList<>();

    private final void clearBindDevice() {
        this.mBindDevices.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestBindDeviceList$lambda$1(RNDeviceContainer this$0, Function1 function1, List deviceList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        RNLogKt.logi("requestBindDeviceList bindDevices is " + deviceList);
        this$0.updateBindDeviceList(deviceList);
        if (function1 != null) {
            function1.invoke2(this$0.mBindDevices);
        }
        return Unit.INSTANCE;
    }

    private final void updateBindDeviceList(List<RNDevice> devices) {
        List<RNDevice> list = devices;
        if (!(!list.isEmpty()) && !(!this.mBindDevices.isEmpty())) {
            clearBindDevice();
        } else {
            this.mBindDevices.clear();
            this.mBindDevices.addAll(list);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    public void clearAll() {
        this.mBindDevices.clear();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    @NotNull
    public List<Device> getAllDeviceList() {
        return this.mBindDevices;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    @NotNull
    public List<Device> getBindDeviceList() {
        return this.mBindDevices;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    public void removeDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        for (Object obj : this.mBindDevices) {
            if (Intrinsics.areEqual(((RNDevice) obj).getDid(), did)) {
                this.mBindDevices.remove((RNDevice) obj);
            }
        }
        obj = null;
        this.mBindDevices.remove((RNDevice) obj);
    }

    public final void requestBindDeviceList(@Nullable final Function1<? super List<RNDevice>, Unit> onSuccess, @Nullable Function1<? super ApiException, Unit> onFail) {
        MiJiaSDKCompat.INSTANCE.getInstance().getBoundDeviceList(new Function1() { // from class: b7j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNDeviceContainer.requestBindDeviceList$lambda$1(this.f3888a, onSuccess, (List) obj);
            }
        }, onFail);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceContainer
    @Nullable
    public Object requestBindDeviceList(@NotNull Continuation<? super List<? extends Device>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        MiJiaSDKCompat.INSTANCE.getInstance().getBoundDeviceList(new Function1<List<? extends RNDevice>, Unit>() { // from class: com.xiaomi.fitness.rn.RNDeviceContainer$requestBindDeviceList$2$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(List<? extends RNDevice> list) {
                invoke2((List<RNDevice>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<RNDevice> deviceList) {
                Intrinsics.checkNotNullParameter(deviceList, "deviceList");
                final CancellableContinuation<List<? extends Device>> cancellableContinuation = cancellableContinuationImpl;
                cancellableContinuation.resume(deviceList, new Function1<Throwable, Unit>() { // from class: com.xiaomi.fitness.rn.RNDeviceContainer$requestBindDeviceList$2$1.1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable t) {
                        Intrinsics.checkNotNullParameter(t, "t");
                        CancellableContinuation<List<? extends Device>> cancellableContinuation2 = cancellableContinuation;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation2.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(new ApiException(t))));
                    }
                });
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.rn.RNDeviceContainer$requestBindDeviceList$2$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                CancellableContinuation<List<? extends Device>> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(exception)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
