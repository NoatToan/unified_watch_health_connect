package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.bv7;
import defpackage.sh7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 U2\u00020\u0001:\u0001UB\t\b\u0007¢\u0006\u0004\bS\u0010TJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ/\u0010!\u001a\u00020\u00042\u001e\u0010\u0018\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00070 0\u001f\"\b\u0012\u0004\u0012\u00020\u00070 H\u0004¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001dJ\r\u0010$\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00070 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00070 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\"\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R%\u00108\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010\u00100\u00100 8\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u00100R0\u0010:\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010\u00070\u00070 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010.\u001a\u0004\b;\u00100\"\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\"\u0010B\u001a\u00020\u000b8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u000eR\"\u0010G\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010\nR$\u0010M\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "", "from", "setFrom", "(I)V", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "deviceInfo", StatConstants.PARAM_START, "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;)V", "startBind", "", "confirm", "onConfirmResult", "(Z)V", "", "did", "onBoundSuccess", "(Ljava/lang/String;)V", "status", "onBoundFail", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_STOP, "(Landroidx/lifecycle/LifecycleOwner;)V", "releaseDevice", "", "Landroidx/lifecycle/MutableLiveData;", "showErrorIfLoading", "([Landroidx/lifecycle/MutableLiveData;)V", LifecycleConstantKt.ON_DESTROY, "isInitializedDeviceInfo", "()Z", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "mEcoDeviceManager", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "getMEcoDeviceManager", "()Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "setMEcoDeviceManager", "(Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;)V", "connectDeviceStatus", "Landroidx/lifecycle/MutableLiveData;", "getConnectDeviceStatus$eco_device_manager_chinaProductRelease", "()Landroidx/lifecycle/MutableLiveData;", "pairDeviceStatus", "getPairDeviceStatus$eco_device_manager_chinaProductRelease", "bindAccountStatus", "getBindAccountStatus$eco_device_manager_chinaProductRelease", "pairCode", "getPairCode$eco_device_manager_chinaProductRelease", "kotlin.jvm.PlatformType", "policyFlag", "getPolicyFlag", "bindStatus", "getBindStatus$eco_device_manager_chinaProductRelease", "setBindStatus$eco_device_manager_chinaProductRelease", "(Landroidx/lifecycle/MutableLiveData;)V", "Landroidx/databinding/ObservableInt;", "isFail", "Landroidx/databinding/ObservableInt;", "()Landroidx/databinding/ObservableInt;", "mDeviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "getMDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "setMDeviceInfo", "mFrom", "I", "getMFrom", "()I", "setMFrom", "Lbv7;", "oobResultListener", "Lbv7;", "getOobResultListener", "()Lbv7;", "setOobResultListener", "(Lbv7;)V", "<init>", "()V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoBindViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoBindViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,234:1\n13402#2,2:235\n*S KotlinDebug\n*F\n+ 1 EcoBindViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindViewModel\n*L\n219#1:235,2\n*E\n"})
public class EcoBindViewModel extends AbsViewModel {
    public static final int BINDING = 4;
    public static final int BIND_FAILURE = 5;
    public static final int BIND_HAVE_BOUND = 7;
    public static final int BIND_IS_PARALLEL = 12;
    public static final int BIND_SUCCESS = 6;
    public static final int CONNECTING = 0;
    public static final int CONNECT_FAILURE = 1;

    @NotNull
    public static final String TAG = "EcoBindDevice";
    public static final int VERIFYING = 2;
    public static final int VERIFY_FAILURE = 3;
    protected EcoBindDeviceInfo mDeviceInfo;
    public EcoDeviceManagerWrapper mEcoDeviceManager;

    @Nullable
    private bv7 oobResultListener;

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
    private int mFrom = 1;

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.pairDeviceStatus.setValue(0);
        EcoBindSystemConfigKt.disableSystemBindDialog();
    }

    @NotNull
    public final MutableLiveData<Integer> getBindAccountStatus$eco_device_manager_chinaProductRelease() {
        return this.bindAccountStatus;
    }

    @NotNull
    public final MutableLiveData<Integer> getBindStatus$eco_device_manager_chinaProductRelease() {
        return this.bindStatus;
    }

    @NotNull
    public final MutableLiveData<Integer> getConnectDeviceStatus$eco_device_manager_chinaProductRelease() {
        return this.connectDeviceStatus;
    }

    @NotNull
    public final EcoBindDeviceInfo getMDeviceInfo() {
        EcoBindDeviceInfo ecoBindDeviceInfo = this.mDeviceInfo;
        if (ecoBindDeviceInfo != null) {
            return ecoBindDeviceInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
        return null;
    }

    @NotNull
    public final EcoDeviceManagerWrapper getMEcoDeviceManager() {
        EcoDeviceManagerWrapper ecoDeviceManagerWrapper = this.mEcoDeviceManager;
        if (ecoDeviceManagerWrapper != null) {
            return ecoDeviceManagerWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEcoDeviceManager");
        return null;
    }

    public final int getMFrom() {
        return this.mFrom;
    }

    @Nullable
    public final bv7 getOobResultListener() {
        return this.oobResultListener;
    }

    @NotNull
    public final MutableLiveData<String> getPairCode$eco_device_manager_chinaProductRelease() {
        return this.pairCode;
    }

    @NotNull
    public final MutableLiveData<Integer> getPairDeviceStatus$eco_device_manager_chinaProductRelease() {
        return this.pairDeviceStatus;
    }

    @NotNull
    public final MutableLiveData<Boolean> getPolicyFlag() {
        return this.policyFlag;
    }

    @NotNull
    /* JADX INFO: renamed from: isFail, reason: from getter */
    public final ObservableInt getIsFail() {
        return this.isFail;
    }

    public final boolean isInitializedDeviceInfo() {
        return this.mDeviceInfo != null;
    }

    public void onBoundFail(int status) {
    }

    public void onBoundSuccess(@Nullable String did) {
    }

    public final void onConfirmResult(boolean confirm) throws RemoteException {
        if (confirm) {
            bv7 bv7Var = this.oobResultListener;
            if (bv7Var != null) {
                bv7Var.onConfirm();
                return;
            }
            return;
        }
        bv7 bv7Var2 = this.oobResultListener;
        if (bv7Var2 != null) {
            bv7Var2.onCanceled();
        }
    }

    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        EcoBindSystemConfigKt.enableSystemBindDialog();
    }

    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        Integer value = this.bindStatus.getValue();
        if ((value == null || value.intValue() != 6) && this.mDeviceInfo != null) {
            getMEcoDeviceManager().cancelBind(getMDeviceInfo().getBleMac());
            this.isFail.set(0);
        }
        showErrorIfLoading(this.connectDeviceStatus, this.pairDeviceStatus, this.bindAccountStatus);
    }

    public void releaseDevice(@NotNull EcoBindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    public final void setBindStatus$eco_device_manager_chinaProductRelease(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bindStatus = mutableLiveData;
    }

    public final void setFrom(int from) {
        this.mFrom = from;
    }

    public final void setMDeviceInfo(@NotNull EcoBindDeviceInfo ecoBindDeviceInfo) {
        Intrinsics.checkNotNullParameter(ecoBindDeviceInfo, "<set-?>");
        this.mDeviceInfo = ecoBindDeviceInfo;
    }

    public final void setMEcoDeviceManager(@NotNull EcoDeviceManagerWrapper ecoDeviceManagerWrapper) {
        Intrinsics.checkNotNullParameter(ecoDeviceManagerWrapper, "<set-?>");
        this.mEcoDeviceManager = ecoDeviceManagerWrapper;
    }

    public final void setMFrom(int i) {
        this.mFrom = i;
    }

    public final void setOobResultListener(@Nullable bv7 bv7Var) {
        this.oobResultListener = bv7Var;
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

    public void start(@NotNull EcoBindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        setMDeviceInfo(deviceInfo);
        this.connectDeviceStatus.setValue(100);
        this.bindStatus.setValue(0);
        this.isFail.set(8);
    }

    public void startBind(@NotNull EcoBindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.connectDeviceStatus.setValue(100);
        this.bindStatus.setValue(0);
        getMEcoDeviceManager().bindDevice(deviceInfo.getBleMac(), deviceInfo.getModel(), deviceInfo.getBleName(), deviceInfo.getOob(), "", "", "", "", new sh7.a() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel.startBind.1
            @Override // defpackage.sh7
            public void dismissPairingCode() {
                Logger.i(EcoBindViewModel.TAG, "dismissPairingCode() called");
                EcoBindViewModel.this.getPairCode$eco_device_manager_chinaProductRelease().postValue(null);
            }

            @Override // defpackage.sh7
            public void onBindFailure(int status) {
                int i;
                Logger.i(EcoBindViewModel.TAG, "onBindFailure() called with: status = " + status);
                MutableLiveData<Integer> bindStatus$eco_device_manager_chinaProductRelease = EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease();
                if (status == 1003) {
                    EcoBindViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    EcoBindViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    i = 7;
                } else {
                    EcoBindViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    EcoBindViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    i = 12;
                    if (status != 12) {
                        i = 5;
                    }
                }
                bindStatus$eco_device_manager_chinaProductRelease.postValue(Integer.valueOf(i));
                EcoBindViewModel.this.onBoundFail(status);
                EcoBindViewModel.this.getIsFail().set(0);
            }

            @Override // defpackage.sh7
            public void onBindSuccess(String did) {
                Logger.i(EcoBindViewModel.TAG, "onBindSuccess() called");
                EcoBindViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(101);
                EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(6);
                EcoBindViewModel.this.onBoundSuccess(did);
            }

            @Override // defpackage.sh7
            public void onConnectFailure(int status) {
                Logger.i(EcoBindViewModel.TAG, "onConnectFailure() called with: status = " + status);
                Integer value = EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue();
                if (value != null && value.intValue() == 0) {
                    EcoBindViewModel.this.onBoundFail(status);
                    EcoBindViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(1);
                    EcoBindViewModel.this.getIsFail().set(0);
                }
            }

            @Override // defpackage.sh7
            public void onConnectSuccess() {
                Integer value;
                Logger.i(EcoBindViewModel.TAG, "onConnectSuccess() called");
                Integer value2 = EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue();
                if ((value2 != null && value2.intValue() == 0) || ((value = EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue()) != null && value.intValue() == 1)) {
                    EcoBindViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(101);
                    EcoBindViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(100);
                    EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(2);
                }
            }

            @Override // defpackage.sh7
            public void onPairingFailure(int status) {
                Logger.i(EcoBindViewModel.TAG, "onPairingFailure() called with: status = " + status);
                EcoBindViewModel.this.onBoundFail(status);
                EcoBindViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(3);
                EcoBindViewModel.this.getIsFail().set(0);
            }

            @Override // defpackage.sh7
            public void onPairingSuccess(byte[] key) {
                Logger.i(EcoBindViewModel.TAG, "onPairingSuccess() called with: key = " + key);
                EcoBindViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(101);
                EcoBindViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(100);
                EcoBindViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(4);
            }

            @Override // defpackage.sh7
            public void showPairingCode(String code, bv7 listener) {
                Logger.i(EcoBindViewModel.TAG, "showPairingCode() called with: code = " + code + ", listener = " + listener);
                EcoBindViewModel.this.setOobResultListener(listener);
                EcoBindViewModel.this.getPairCode$eco_device_manager_chinaProductRelease().postValue(code);
            }
        });
    }
}
