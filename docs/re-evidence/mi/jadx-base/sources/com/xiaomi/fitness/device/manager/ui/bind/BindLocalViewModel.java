package com.xiaomi.fitness.device.manager.ui.bind;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.device.manager.ui.scan.UriDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010#\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010$\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010%\u001a\u00020\u001aH\u0002J\u0012\u0010&\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010'\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001aH\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\n¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindLocalViewModel;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindViewModel;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "<init>", "()V", "bindMode", "", "getBindMode", "()Z", "setBindMode", "(Z)V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setMDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "bindFinish", "Landroidx/lifecycle/MutableLiveData;", "", "getBindFinish", "()Landroidx/lifecycle/MutableLiveData;", "agreesPolicy", "getAgreesPolicy", "setAgreesPolicy", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", StatConstants.PARAM_START, "deviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "startBind", "onBoundSuccess", "did", "onConnectStart", "onConnectSuccess", "onBindLocalFinish", "onDisconnect", "onConnectFailure", "errorCode", "", "retryTimes", LifecycleConstantKt.ON_STOP, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "onCleared", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindLocalViewModel extends BindViewModel implements OnDeviceStatusListener {
    private boolean agreesPolicy;

    @NotNull
    private final MutableLiveData<String> bindFinish = new MutableLiveData<>();
    private boolean bindMode;

    @Nullable
    private WearableDeviceModel mDeviceModel;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.bind.BindLocalViewModel$onConnectFailure$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.bind.BindLocalViewModel$onConnectFailure$2", f = "BindLocalViewModel.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BindLocalViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(VibrateModeProgressBar.sLongToLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BindLocalViewModel.this.setBindMode(true);
            BindLocalViewModel bindLocalViewModel = BindLocalViewModel.this;
            bindLocalViewModel.startBind(bindLocalViewModel.getMDeviceInfo());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    private final void onBindLocalFinish() {
        String to;
        Logger.d(BindViewModel.TAG, "onBindLocalFinish() called");
        if (getMDeviceInfo() instanceof UriDeviceInfo) {
            BindDeviceInfo mDeviceInfo = getMDeviceInfo();
            Intrinsics.checkNotNull(mDeviceInfo, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.ui.scan.UriDeviceInfo");
            to = ((UriDeviceInfo) mDeviceInfo).getTo();
        } else if (getMDeviceInfo() instanceof ScannedDeviceInfo) {
            BindDeviceInfo mDeviceInfo2 = getMDeviceInfo();
            Intrinsics.checkNotNull(mDeviceInfo2, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo");
            ScannedDeviceInfo scannedDeviceInfo = (ScannedDeviceInfo) mDeviceInfo2;
            if (scannedDeviceInfo.getTo() == null) {
                to = "";
            } else {
                to = scannedDeviceInfo.getTo();
            }
        } else {
            to = "";
        }
        getBindAccountStatus$device_manager_chinaProductRelease().postValue(101);
        this.bindFinish.postValue(to);
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        getMDeviceManager().addDeviceStatusListener(this);
    }

    public final boolean getAgreesPolicy() {
        return this.agreesPolicy;
    }

    @NotNull
    public final MutableLiveData<String> getBindFinish() {
        return this.bindFinish;
    }

    public final boolean getBindMode() {
        return this.bindMode;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return this.mDeviceModel;
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindViewModel
    public void onBoundSuccess(@Nullable String did) {
        onBindLocalFinish();
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        getMDeviceManager().removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
        if (did == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) getMDeviceManager().getDeviceModel(did);
        if (wearableDeviceModel == null || !DeviceModelExtKt.isLocalDevice(wearableDeviceModel)) {
            Logger.i(BindViewModel.TAG, "onConnectFailure: not local device connect failure event");
            return;
        }
        if (!Intrinsics.areEqual(DeviceModelExtKt.getMac(wearableDeviceModel), getMDeviceInfo().getBleMac())) {
            Logger.i(BindViewModel.TAG, "onConnectFailure: " + DeviceModelExtKt.getMac(wearableDeviceModel) + " , " + getMDeviceInfo().getBleMac());
            return;
        }
        Logger.i(BindViewModel.TAG, "onConnectFailure() called with: did = " + did + ", errorCode = " + errorCode + ", retryTimes = " + retryTimes);
        if (errorCode == 2005 || errorCode == 2007) {
            getMDeviceManager().unbindDevice(did, new l.a() { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindLocalViewModel.onConnectFailure.1
                @Override // com.xiaomi.fitness.device.manager.l
                public void onFail(int code) {
                    com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(BindViewModel.TAG, "onFail code = " + code);
                }

                @Override // com.xiaomi.fitness.device.manager.l
                public void onSuccess() {
                    com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(BindViewModel.TAG, "onSuccess: ");
                }
            });
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
        } else {
            getBindStatus$device_manager_chinaProductRelease().postValue(1);
            getConnectDeviceStatus$device_manager_chinaProductRelease().postValue(1);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
            getConnectDeviceStatus$device_manager_chinaProductRelease().postValue(100);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        Logger.i(BindViewModel.TAG, "onConnectSuccess() called with: did = " + did);
        if (this.bindMode) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
            getBindStatus$device_manager_chinaProductRelease().postValue(6);
            getConnectDeviceStatus$device_manager_chinaProductRelease().postValue(101);
            onBindLocalFinish();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindViewModel, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Integer value = getBindStatus$device_manager_chinaProductRelease().getValue();
        if ((value != null && value.intValue() == 6) || !this.bindMode) {
            return;
        }
        Logger.d(BindViewModel.TAG, "onStop() called with: cancel bind bindState = " + getBindStatus$device_manager_chinaProductRelease().getValue());
        getMDeviceManager().cancelBind(getMDeviceInfo().getBleMac());
    }

    public final void setAgreesPolicy(boolean z) {
        this.agreesPolicy = z;
    }

    public final void setBindMode(boolean z) {
        this.bindMode = z;
    }

    public final void setMDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.mDeviceModel = wearableDeviceModel;
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindViewModel
    public void start(@NotNull BindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        super.start(deviceInfo);
        String upperCase = deviceInfo.getBleMac().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.mDeviceModel = (WearableDeviceModel) getMDeviceManager().getDeviceModelByMac(upperCase);
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("BindLocalViewModel " + deviceInfo.getBleMac() + ", " + (this.mDeviceModel == null ? "startBind" : "Connect"));
        if (this.mDeviceModel != null) {
            this.agreesPolicy = true;
            this.bindMode = false;
        } else {
            getPolicyFlag().setValue(Boolean.TRUE);
            this.bindMode = true;
            this.agreesPolicy = false;
        }
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindViewModel
    public void startBind(@NotNull BindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (this.bindMode) {
            super.startBind(deviceInfo);
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        deviceManagerExtKt.connectLocalDevice(wearableDeviceModel.getDid());
    }
}
