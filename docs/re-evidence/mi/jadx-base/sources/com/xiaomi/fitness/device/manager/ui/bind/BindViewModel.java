package com.xiaomi.fitness.device.manager.ui.bind;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.e;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.ui.bind.BindViewModel;
import com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.uzi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 `2\u00020\u0001:\u0001`B\t\b\u0007¢\u0006\u0004\b_\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\"\u001a\u00020\u00022\u001e\u0010\u001a\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\t0!0 \"\b\u0012\u0004\u0012\u00020\t0!H\u0004¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010\u001fJ\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0012¢\u0006\u0004\b'\u0010&R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010/\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00103\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R \u00105\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\"\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R%\u0010:\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\u00120\u00120!8\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R\u0016\u0010<\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R0\u0010>\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\t0\t0!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u00100\u001a\u0004\b?\u00102\"\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010ER\u0017\u0010F\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\bG\u0010ER\"\u0010H\u001a\u00020\r8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010\u0010R\"\u0010M\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\fR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00100\u001a\u0004\bR\u00102\"\u0004\bS\u0010AR*\u0010U\u001a\u0015\u0012\u0011\u0012\u000f 9*\u0004\u0018\u00010\u00160\u0016¢\u0006\u0002\bT0!8\u0006¢\u0006\f\n\u0004\bU\u00100\u001a\u0004\bV\u00102R\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010=R$\u0010Y\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006a"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "cancelBind", "()V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "", "from", "setFrom", "(I)V", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "deviceInfo", StatConstants.PARAM_START, "(Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;)V", "startBind", "", "confirm", "onConfirmResult", "(Z)V", "", "did", "onBoundSuccess", "(Ljava/lang/String;)V", "status", "onBoundFail", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_STOP, "(Landroidx/lifecycle/LifecycleOwner;)V", "", "Landroidx/lifecycle/MutableLiveData;", "showErrorIfLoading", "([Landroidx/lifecycle/MutableLiveData;)V", LifecycleConstantKt.ON_DESTROY, "isInitializedDeviceInfo", "()Z", "needShowPrivacy", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "mDeviceManager", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "getMDeviceManager", "()Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "setMDeviceManager", "(Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;)V", "connectDeviceStatus", "Landroidx/lifecycle/MutableLiveData;", "getConnectDeviceStatus$device_manager_chinaProductRelease", "()Landroidx/lifecycle/MutableLiveData;", "pairDeviceStatus", "getPairDeviceStatus$device_manager_chinaProductRelease", "bindAccountStatus", "getBindAccountStatus$device_manager_chinaProductRelease", "pairCode", "getPairCode$device_manager_chinaProductRelease", "kotlin.jvm.PlatformType", "policyFlag", "getPolicyFlag", "requestDevice", "Z", "bindStatus", "getBindStatus$device_manager_chinaProductRelease", "setBindStatus$device_manager_chinaProductRelease", "(Landroidx/lifecycle/MutableLiveData;)V", "Landroidx/databinding/ObservableInt;", "isFail", "Landroidx/databinding/ObservableInt;", "()Landroidx/databinding/ObservableInt;", "silentUpgrade", "getSilentUpgrade", "mDeviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "getMDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", "setMDeviceInfo", "mFrom", "I", "getMFrom", "()I", "setMFrom", "getDid", "setDid", "Lkotlin/jvm/internal/EnhancedNullability;", "bindStatusTip", "getBindStatusTip", "showPairingCode", "Lcom/xiaomi/fitness/device/manager/e;", "oobResultListener", "Lcom/xiaomi/fitness/device/manager/e;", "getOobResultListener", "()Lcom/xiaomi/fitness/device/manager/e;", "setOobResultListener", "(Lcom/xiaomi/fitness/device/manager/e;)V", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBindViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindViewModel.kt\ncom/xiaomi/fitness/device/manager/ui/bind/BindViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,296:1\n1#2:297\n13402#3,2:298\n*S KotlinDebug\n*F\n+ 1 BindViewModel.kt\ncom/xiaomi/fitness/device/manager/ui/bind/BindViewModel\n*L\n266#1:298,2\n*E\n"})
public class BindViewModel extends AbsViewModel {
    public static final int BINDING = 4;
    public static final int BIND_FAILURE = 5;
    public static final int BIND_HAVE_BOUND = 7;
    public static final int BIND_IS_PARALLEL = 12;
    public static final int BIND_NETWORK_NOT_AVAILABLE = 9;
    public static final int BIND_REQUEST_ERROR = 8;
    public static final int BIND_SUCCESS = 6;
    public static final int CONNECTING = 0;
    public static final int CONNECT_FAILURE = 1;

    @NotNull
    public static final String TAG = "BindDevice";
    public static final int VERIFYING = 2;
    public static final int VERIFY_FAILURE = 3;
    protected BindDeviceInfo mDeviceInfo;
    public WearableDeviceManagerWrapper mDeviceManager;
    private int mFrom;

    @Nullable
    private e oobResultListener;
    private boolean requestDevice;
    private boolean showPairingCode;

    @NotNull
    private final MutableLiveData<Integer> connectDeviceStatus = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> pairDeviceStatus = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> bindAccountStatus = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<String> pairCode = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> policyFlag = new MutableLiveData<>(Boolean.FALSE);

    @NotNull
    private MutableLiveData<Integer> bindStatus = new MutableLiveData<>(-1);

    @NotNull
    private final ObservableInt isFail = new ObservableInt();

    @NotNull
    private final ObservableInt silentUpgrade = new ObservableInt(8);

    @NotNull
    private MutableLiveData<String> did = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<String> bindStatusTip = new MutableLiveData<>(ApplicationExtKt.getApplication().getString(uzi.b0));

    private final void cancelBind() {
        Integer value = this.bindStatus.getValue();
        if ((value == null || value.intValue() != 6) && this.mDeviceInfo != null) {
            getMDeviceManager().cancelBind(getMDeviceInfo().getBleMac());
            this.isFail.set(0);
        }
        showErrorIfLoading(this.connectDeviceStatus, this.pairDeviceStatus, this.bindAccountStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean needShowPrivacy$lambda$2(BindViewModel this$0, WearableProduct it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == this$0.getMDeviceInfo().getDeviceInfo().getProductId();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.pairDeviceStatus.setValue(0);
        BindSystemConfigKt.disableSystemBindDialog();
    }

    @NotNull
    public final MutableLiveData<Integer> getBindAccountStatus$device_manager_chinaProductRelease() {
        return this.bindAccountStatus;
    }

    @NotNull
    public final MutableLiveData<Integer> getBindStatus$device_manager_chinaProductRelease() {
        return this.bindStatus;
    }

    @NotNull
    public final MutableLiveData<String> getBindStatusTip() {
        return this.bindStatusTip;
    }

    @NotNull
    public final MutableLiveData<Integer> getConnectDeviceStatus$device_manager_chinaProductRelease() {
        return this.connectDeviceStatus;
    }

    @NotNull
    public final MutableLiveData<String> getDid() {
        return this.did;
    }

    @NotNull
    public final BindDeviceInfo getMDeviceInfo() {
        BindDeviceInfo bindDeviceInfo = this.mDeviceInfo;
        if (bindDeviceInfo != null) {
            return bindDeviceInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
        return null;
    }

    @NotNull
    public final WearableDeviceManagerWrapper getMDeviceManager() {
        WearableDeviceManagerWrapper wearableDeviceManagerWrapper = this.mDeviceManager;
        if (wearableDeviceManagerWrapper != null) {
            return wearableDeviceManagerWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDeviceManager");
        return null;
    }

    public final int getMFrom() {
        return this.mFrom;
    }

    @Nullable
    public final e getOobResultListener() {
        return this.oobResultListener;
    }

    @NotNull
    public final MutableLiveData<String> getPairCode$device_manager_chinaProductRelease() {
        return this.pairCode;
    }

    @NotNull
    public final MutableLiveData<Integer> getPairDeviceStatus$device_manager_chinaProductRelease() {
        return this.pairDeviceStatus;
    }

    @NotNull
    public final MutableLiveData<Boolean> getPolicyFlag() {
        return this.policyFlag;
    }

    @NotNull
    public final ObservableInt getSilentUpgrade() {
        return this.silentUpgrade;
    }

    @NotNull
    /* JADX INFO: renamed from: isFail, reason: from getter */
    public final ObservableInt getIsFail() {
        return this.isFail;
    }

    public final boolean isInitializedDeviceInfo() {
        return this.mDeviceInfo != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean needShowPrivacy() {
        WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: ro2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BindViewModel.needShowPrivacy$lambda$2(this.f32738a, (WearableProduct) obj));
            }
        });
        if (wearableProduct != null) {
            return DeviceExtKt.isSupportFeature(wearableProduct, "privacy_policy");
        }
        return false;
    }

    public void onBoundFail(int status) {
    }

    public void onBoundSuccess(@Nullable String did) {
        if (did != null) {
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).connectDevice(did);
        }
    }

    public final void onConfirmResult(boolean confirm) throws RemoteException {
        if (confirm) {
            e eVar = this.oobResultListener;
            if (eVar != null) {
                eVar.onConfirm();
                return;
            }
            return;
        }
        e eVar2 = this.oobResultListener;
        if (eVar2 != null) {
            eVar2.onCanceled();
        }
    }

    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        BindSystemConfigKt.enableSystemBindDialog();
        cancelBind();
    }

    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        if (this.showPairingCode) {
            cancelBind();
            this.showPairingCode = false;
        }
    }

    public final void setBindStatus$device_manager_chinaProductRelease(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bindStatus = mutableLiveData;
    }

    public final void setDid(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.did = mutableLiveData;
    }

    public final void setFrom(int from) {
        Logger.i(TAG, "setFrom() called with: from = " + from);
        this.mFrom = from;
    }

    public final void setMDeviceInfo(@NotNull BindDeviceInfo bindDeviceInfo) {
        Intrinsics.checkNotNullParameter(bindDeviceInfo, "<set-?>");
        this.mDeviceInfo = bindDeviceInfo;
    }

    public final void setMDeviceManager(@NotNull WearableDeviceManagerWrapper wearableDeviceManagerWrapper) {
        Intrinsics.checkNotNullParameter(wearableDeviceManagerWrapper, "<set-?>");
        this.mDeviceManager = wearableDeviceManagerWrapper;
    }

    public final void setMFrom(int i) {
        this.mFrom = i;
    }

    public final void setOobResultListener(@Nullable e eVar) {
        this.oobResultListener = eVar;
    }

    public final void showErrorIfLoading(@NotNull MutableLiveData<Integer>... status) {
        Intrinsics.checkNotNullParameter(status, "status");
        for (MutableLiveData<Integer> mutableLiveData : status) {
            Integer value = mutableLiveData.getValue();
            if (value != null && value.intValue() == 100) {
                mutableLiveData.setValue(102);
            }
        }
    }

    public void start(@NotNull BindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        setMDeviceInfo(deviceInfo);
        this.connectDeviceStatus.setValue(100);
        this.bindStatus.setValue(0);
        this.isFail.set(8);
    }

    public void startBind(@NotNull BindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.connectDeviceStatus.setValue(100);
        this.bindStatus.setValue(0);
        this.isFail.set(8);
        getMDeviceManager().bindDevice(new DeviceParameter(deviceInfo.getModel(), deviceInfo.getBleMac(), deviceInfo.getBleName(), deviceInfo.getNodeId(), deviceInfo.getOob(), this.requestDevice, null, this.mFrom, 64, null), new a.AbstractBinderC0419a() { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindViewModel.startBind.1
            @Override // com.xiaomi.fitness.device.manager.a
            public void dismissPairingCode() {
                Logger.i(BindViewModel.TAG, "dismissPairingCode() called");
                BindViewModel.this.getPairCode$device_manager_chinaProductRelease().postValue(null);
                BindViewModel.this.showPairingCode = false;
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindFailure(int status) {
                int i;
                Logger.i(BindViewModel.TAG, "onBindFailure() called with: status = " + status);
                MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease = BindViewModel.this.getBindStatus$device_manager_chinaProductRelease();
                if (status == 1003) {
                    BindViewModel.this.getConnectDeviceStatus$device_manager_chinaProductRelease().postValue(102);
                    BindViewModel.this.getPairDeviceStatus$device_manager_chinaProductRelease().postValue(102);
                    i = 7;
                } else {
                    Integer value = BindViewModel.this.getConnectDeviceStatus$device_manager_chinaProductRelease().getValue();
                    if (value != null && value.intValue() == 100) {
                        BindViewModel.this.getConnectDeviceStatus$device_manager_chinaProductRelease().postValue(102);
                    }
                    BindViewModel.this.getBindAccountStatus$device_manager_chinaProductRelease().postValue(102);
                    BindViewModel.this.getPairDeviceStatus$device_manager_chinaProductRelease().postValue(102);
                    i = 12;
                    if (status != 12) {
                        i = 5;
                    }
                }
                bindStatus$device_manager_chinaProductRelease.postValue(Integer.valueOf(i));
                BindViewModel.this.onBoundFail(status);
                BindViewModel.this.getIsFail().set(0);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindSuccess(String did) {
                Logger.i(BindViewModel.TAG, "onBindSuccess() called");
                BindViewModel.this.getBindAccountStatus$device_manager_chinaProductRelease().postValue(101);
                BindViewModel.this.getDid().postValue(did);
                BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().postValue(6);
                BindViewModel.this.onBoundSuccess(did);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectFailure(int status) {
                Logger.i(BindViewModel.TAG, "onConnectFailure() called with: status = " + status);
                Integer value = BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().getValue();
                if (value != null && value.intValue() == 0) {
                    BindViewModel.this.onBoundFail(status);
                    BindViewModel.this.getConnectDeviceStatus$device_manager_chinaProductRelease().postValue(102);
                    BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().postValue(1);
                    BindViewModel.this.getIsFail().set(0);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectSuccess() {
                Integer value;
                Logger.i(BindViewModel.TAG, "onConnectSuccess() called");
                Integer value2 = BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().getValue();
                if ((value2 != null && value2.intValue() == 0) || ((value = BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().getValue()) != null && value.intValue() == 1)) {
                    BindViewModel.this.getConnectDeviceStatus$device_manager_chinaProductRelease().postValue(101);
                    BindViewModel.this.getPairDeviceStatus$device_manager_chinaProductRelease().postValue(100);
                    BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().postValue(2);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingFailure(int status) {
                Logger.i(BindViewModel.TAG, "onPairingFailure() called with: status = " + status);
                BindViewModel.this.onBoundFail(status);
                BindViewModel.this.getPairDeviceStatus$device_manager_chinaProductRelease().postValue(102);
                BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().postValue(3);
                BindViewModel.this.getIsFail().set(0);
                BindViewModel.this.showPairingCode = false;
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingSuccess(byte[] key) {
                Logger.i(BindViewModel.TAG, "onPairingSuccess() called with: key = " + key);
                BindViewModel.this.getPairDeviceStatus$device_manager_chinaProductRelease().postValue(101);
                BindViewModel.this.getBindAccountStatus$device_manager_chinaProductRelease().postValue(100);
                BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().postValue(4);
                BindViewModel.this.showPairingCode = false;
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceFailure() {
                Logger.i(BindViewModel.TAG, "onRequestDeviceFailure() called");
                BindViewModel.this.getBindStatus$device_manager_chinaProductRelease().postValue(8);
                BindViewModel.this.requestDevice = true;
                BindViewModel.this.getIsFail().set(0);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceSuccess() {
                Logger.i(BindViewModel.TAG, "onRequestDeviceSuccess() called");
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void showPairingCode(String code, e listener) {
                Logger.i(BindViewModel.TAG, "showPairingCode() called with: code = " + code + ", listener = " + listener);
                BindViewModel.this.setOobResultListener(listener);
                BindViewModel.this.showPairingCode = true;
                BindViewModel.this.getPairCode$device_manager_chinaProductRelease().postValue(code);
            }
        });
    }
}
