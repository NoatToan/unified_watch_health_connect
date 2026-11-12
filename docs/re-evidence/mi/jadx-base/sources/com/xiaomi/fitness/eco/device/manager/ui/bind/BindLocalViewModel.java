package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mibi.sdk.common.CommonConstants;
import com.miot.rn.plugin.activity.PluginRNActivity;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010#\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020\u0013H\u0016J\u001a\u0010%\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020\u001aH\u0002J\u001a\u0010'\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020\u0013H\u0016J*\u0010(\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u001aH\u0014J\u0006\u00100\u001a\u00020\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\n¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindLocalViewModel;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindViewModel;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "<init>", "()V", "bindMode", "", "getBindMode", "()Z", "setBindMode", "(Z)V", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "setMDeviceModel", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "bindFinish", "Landroidx/lifecycle/MutableLiveData;", "", "getBindFinish", "()Landroidx/lifecycle/MutableLiveData;", "agreesPolicy", "getAgreesPolicy", "setAgreesPolicy", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", StatConstants.PARAM_START, "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "startBind", "onBoundSuccess", "did", "onConnectStart", "mac", "onConnectSuccess", "onBindLocalFinish", "onDisconnect", "onConnectFailure", "errorCode", "", "retryTimes", LifecycleConstantKt.ON_STOP, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "onCleared", "finishRopeSkipping2Page", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindLocalViewModel extends EcoBindViewModel implements OnEcoDeviceStatusListener {
    private boolean agreesPolicy;

    @NotNull
    private final MutableLiveData<String> bindFinish = new MutableLiveData<>();
    private boolean bindMode;

    @Nullable
    private EcoDeviceModel mDeviceModel;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalViewModel$onConnectFailure$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalViewModel$onConnectFailure$2", f = "BindLocalViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
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

    private final void onBindLocalFinish() {
        Logger.d(EcoBindViewModel.TAG, "onBindLocalFinish() called");
        getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(101);
        this.bindFinish.postValue(getMDeviceInfo().getTo());
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        getMEcoDeviceManager().addDeviceStatusListener(this);
    }

    public final void finishRopeSkipping2Page() {
        if (isInitializedDeviceInfo() && StringsKt__StringsJVMKt.startsWith$default(getMDeviceInfo().getModel(), SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX, false, 2, null)) {
            Logger.i(EcoBindViewModel.TAG, "finishRopeSkipping2Page model = " + getMDeviceInfo().getModel());
            AppManager.Companion companion = AppManager.INSTANCE;
            AppManager companion2 = companion.getInstance();
            int i = PluginRNActivity.o;
            Intrinsics.checkNotNullExpressionValue(PluginRNActivity.class, "forName(...)");
            companion2.killActivity(PluginRNActivity.class);
            AppManager companion3 = companion.getInstance();
            BindRopeSkippingListActivity.Companion companion4 = BindRopeSkippingListActivity.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(BindRopeSkippingListActivity.class, "forName(...)");
            companion3.killActivity(BindRopeSkippingListActivity.class);
        }
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
    public final EcoDeviceModel getMDeviceModel() {
        return this.mDeviceModel;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel
    public void onBoundSuccess(@Nullable String did) {
        onBindLocalFinish();
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        getMEcoDeviceManager().removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (did == null) {
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) getMEcoDeviceManager().getDeviceModel(did);
        if (ecoDeviceModel == null || !EcoDeviceModelExtKt.isLocalDevice(ecoDeviceModel)) {
            Logger.i(EcoBindViewModel.TAG, "onConnectFailure: not local device connect failure event");
            return;
        }
        String mac2 = EcoDeviceModelExtKt.getMac(ecoDeviceModel);
        Locale locale = Locale.ROOT;
        String upperCase = mac2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = getMDeviceInfo().getBleMac().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        if (!Intrinsics.areEqual(upperCase, upperCase2)) {
            Logger.i(EcoBindViewModel.TAG, "onConnectFailure: " + EcoDeviceModelExtKt.getMac(ecoDeviceModel) + " , " + getMDeviceInfo().getBleMac());
            return;
        }
        Logger.i(EcoBindViewModel.TAG, "onConnectFailure() called with: did = " + did + ", errorCode = " + errorCode + ", retryTimes = " + retryTimes);
        switch (errorCode) {
            case CommonConstants.Mgc.RECHARGE_NOT_EXIST /* 2005 */:
            case CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST /* 2006 */:
            case CommonConstants.Mgc.PUB_KEY_NOT_EXIST /* 2007 */:
                getMEcoDeviceManager().unbindDevice(did, new l.a() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalViewModel.onConnectFailure.1
                    @Override // com.xiaomi.fitness.device.manager.l
                    public void onFail(int code) {
                        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi(EcoBindViewModel.TAG, "onFail code = " + code);
                    }

                    @Override // com.xiaomi.fitness.device.manager.l
                    public void onSuccess() {
                        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi(EcoBindViewModel.TAG, "onSuccess: ");
                    }
                });
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
                break;
            default:
                getBindStatus$eco_device_manager_chinaProductRelease().postValue(1);
                getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(1);
                break;
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did)) {
            getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(100);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(EcoBindViewModel.TAG, "onConnectSuccess() called with: did = " + did);
        if (this.bindMode) {
            return;
        }
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (Intrinsics.areEqual(ecoDeviceModel != null ? ecoDeviceModel.getDid() : null, did)) {
            getBindStatus$eco_device_manager_chinaProductRelease().postValue(6);
            getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(101);
            onBindLocalFinish();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Integer value = getBindStatus$eco_device_manager_chinaProductRelease().getValue();
        if ((value != null && value.intValue() == 6) || !this.bindMode) {
            return;
        }
        Logger.d(EcoBindViewModel.TAG, "onStop() called with: cancel bind bindState = " + getBindStatus$eco_device_manager_chinaProductRelease().getValue());
        getMEcoDeviceManager().cancelBind(getMDeviceInfo().getBleMac());
    }

    public final void setAgreesPolicy(boolean z) {
        this.agreesPolicy = z;
    }

    public final void setBindMode(boolean z) {
        this.bindMode = z;
    }

    public final void setMDeviceModel(@Nullable EcoDeviceModel ecoDeviceModel) {
        this.mDeviceModel = ecoDeviceModel;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel
    public void start(@NotNull EcoBindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        super.start(deviceInfo);
        String upperCase = deviceInfo.getBleMac().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.mDeviceModel = (EcoDeviceModel) getMEcoDeviceManager().getDeviceModelByMac(upperCase);
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("BindLocalViewModel " + deviceInfo.getBleMac() + ", " + (this.mDeviceModel == null ? "startBind" : "Connect"));
        if (this.mDeviceModel == null) {
            getPolicyFlag().setValue(Boolean.TRUE);
            this.bindMode = true;
            this.agreesPolicy = false;
        } else {
            getPolicyFlag().setValue(Boolean.FALSE);
            this.agreesPolicy = true;
            this.bindMode = false;
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel
    public void startBind(@NotNull EcoBindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (this.bindMode) {
            super.startBind(deviceInfo);
            return;
        }
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        Intrinsics.checkNotNull(ecoDeviceModel);
        ecoDeviceManagerExtKt.connectLocalDevice(ecoDeviceModel.getDid());
    }
}
