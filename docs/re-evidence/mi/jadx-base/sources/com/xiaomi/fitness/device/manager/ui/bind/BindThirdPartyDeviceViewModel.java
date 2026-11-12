package com.xiaomi.fitness.device.manager.ui.bind;

import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.e;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.bind.BindDeviceInfo;
import com.xiaomi.fitness.device.manager.ui.bind.BindThirdPartyDeviceViewModel;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindViewModel;", "<init>", "()V", "callback", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel$ThirdBindCallback;", "getCallback", "()Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel$ThirdBindCallback;", "setCallback", "(Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel$ThirdBindCallback;)V", "needNfcActivate", "Landroidx/lifecycle/MutableLiveData;", "", "getNeedNfcActivate", "()Landroidx/lifecycle/MutableLiveData;", "onBindListener", "com/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel$onBindListener$1", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel$onBindListener$1;", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "startBind", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bind/BindDeviceInfo;", LifecycleConstantKt.ON_DESTROY, "ThirdBindCallback", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindThirdPartyDeviceViewModel extends BindViewModel {

    @Nullable
    private ThirdBindCallback callback;

    @NotNull
    private final MutableLiveData<Boolean> needNfcActivate = new MutableLiveData<>();

    @NotNull
    private final BindThirdPartyDeviceViewModel$onBindListener$1 onBindListener = new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindThirdPartyDeviceViewModel$onBindListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
        public void onBind(String did, boolean isRebind) {
            super.onBind(did, isRebind);
            Logger.i(BindViewModel.TAG, "onBind() called with: did = " + did + ", isRebind = " + isRebind);
            BindThirdPartyDeviceViewModel.ThirdBindCallback callback = this.this$0.getCallback();
            if (callback != null) {
                callback.onBindSuccess(did);
            }
        }
    };

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\nJ#\u0010\u0016\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\fR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel$ThirdBindCallback;", "Lcom/xiaomi/fitness/device/manager/a$a;", "", "did", "", "onBindSuccess", "(Ljava/lang/String;)V", "", "status", "onBindFailure", "(I)V", "onConnectSuccess", "()V", "onConnectFailure", "", "key", "onPairingSuccess", "([B)V", "onPairingFailure", "code", "Lcom/xiaomi/fitness/device/manager/e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showPairingCode", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/e;)V", "dismissPairingCode", "onRequestDeviceSuccess", "onRequestDeviceFailure", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel;", "vmRef", "Ljava/lang/ref/WeakReference;", "vm", "<init>", "(Lcom/xiaomi/fitness/device/manager/ui/bind/BindThirdPartyDeviceViewModel;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ThirdBindCallback extends a.AbstractBinderC0419a {

        @Nullable
        private WeakReference<BindThirdPartyDeviceViewModel> vmRef;

        public ThirdBindCallback(@NotNull BindThirdPartyDeviceViewModel vm) {
            Intrinsics.checkNotNullParameter(vm, "vm");
            this.vmRef = new WeakReference<>(vm);
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void dismissPairingCode() {
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void onBindFailure(int status) {
            WeakReference<BindThirdPartyDeviceViewModel> weakReference;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel;
            MutableLiveData<Integer> pairDeviceStatus$device_manager_chinaProductRelease;
            Integer value;
            WeakReference<BindThirdPartyDeviceViewModel> weakReference2;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel2;
            MutableLiveData<Integer> connectDeviceStatus$device_manager_chinaProductRelease;
            Integer value2;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel3;
            ObservableInt isFail;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel4;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel5;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel6;
            MutableLiveData<Integer> bindAccountStatus$device_manager_chinaProductRelease;
            WeakReference<BindThirdPartyDeviceViewModel> weakReference3;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel7;
            MutableLiveData<Integer> connectDeviceStatus$device_manager_chinaProductRelease2;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel8;
            MutableLiveData<Integer> connectDeviceStatus$device_manager_chinaProductRelease3;
            Integer value3;
            WeakReference<BindThirdPartyDeviceViewModel> weakReference4;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel9;
            MutableLiveData<Integer> pairDeviceStatus$device_manager_chinaProductRelease2;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel10;
            MutableLiveData<Integer> pairDeviceStatus$device_manager_chinaProductRelease3;
            Integer value4;
            Logger.i(BindViewModel.TAG, "onBindFailure() called with: status = " + status);
            WeakReference<BindThirdPartyDeviceViewModel> weakReference5 = this.vmRef;
            if (((weakReference5 != null && (bindThirdPartyDeviceViewModel10 = weakReference5.get()) != null && (pairDeviceStatus$device_manager_chinaProductRelease3 = bindThirdPartyDeviceViewModel10.getPairDeviceStatus$device_manager_chinaProductRelease()) != null && (value4 = pairDeviceStatus$device_manager_chinaProductRelease3.getValue()) != null && value4.intValue() == 100) || ((weakReference = this.vmRef) != null && (bindThirdPartyDeviceViewModel = weakReference.get()) != null && (pairDeviceStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel.getPairDeviceStatus$device_manager_chinaProductRelease()) != null && (value = pairDeviceStatus$device_manager_chinaProductRelease.getValue()) != null && value.intValue() == 0)) && (weakReference4 = this.vmRef) != null && (bindThirdPartyDeviceViewModel9 = weakReference4.get()) != null && (pairDeviceStatus$device_manager_chinaProductRelease2 = bindThirdPartyDeviceViewModel9.getPairDeviceStatus$device_manager_chinaProductRelease()) != null) {
                pairDeviceStatus$device_manager_chinaProductRelease2.postValue(102);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference6 = this.vmRef;
            if (((weakReference6 != null && (bindThirdPartyDeviceViewModel8 = weakReference6.get()) != null && (connectDeviceStatus$device_manager_chinaProductRelease3 = bindThirdPartyDeviceViewModel8.getConnectDeviceStatus$device_manager_chinaProductRelease()) != null && (value3 = connectDeviceStatus$device_manager_chinaProductRelease3.getValue()) != null && value3.intValue() == 100) || ((weakReference2 = this.vmRef) != null && (bindThirdPartyDeviceViewModel2 = weakReference2.get()) != null && (connectDeviceStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel2.getConnectDeviceStatus$device_manager_chinaProductRelease()) != null && (value2 = connectDeviceStatus$device_manager_chinaProductRelease.getValue()) != null && value2.intValue() == 0)) && (weakReference3 = this.vmRef) != null && (bindThirdPartyDeviceViewModel7 = weakReference3.get()) != null && (connectDeviceStatus$device_manager_chinaProductRelease2 = bindThirdPartyDeviceViewModel7.getConnectDeviceStatus$device_manager_chinaProductRelease()) != null) {
                connectDeviceStatus$device_manager_chinaProductRelease2.postValue(102);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference7 = this.vmRef;
            if (weakReference7 != null && (bindThirdPartyDeviceViewModel6 = weakReference7.get()) != null && (bindAccountStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel6.getBindAccountStatus$device_manager_chinaProductRelease()) != null) {
                bindAccountStatus$device_manager_chinaProductRelease.postValue(102);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference8 = this.vmRef;
            if (weakReference8 != null && (bindThirdPartyDeviceViewModel5 = weakReference8.get()) != null && (bindStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel5.getBindStatus$device_manager_chinaProductRelease()) != null) {
                bindStatus$device_manager_chinaProductRelease.postValue(Integer.valueOf(status));
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference9 = this.vmRef;
            if (weakReference9 != null && (bindThirdPartyDeviceViewModel4 = weakReference9.get()) != null) {
                bindThirdPartyDeviceViewModel4.onBoundFail(status);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference10 = this.vmRef;
            if (weakReference10 == null || (bindThirdPartyDeviceViewModel3 = weakReference10.get()) == null || (isFail = bindThirdPartyDeviceViewModel3.getIsFail()) == null) {
                return;
            }
            isFail.set(0);
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void onBindSuccess(@Nullable String did) {
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel2;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel3;
            MutableLiveData<Integer> bindAccountStatus$device_manager_chinaProductRelease;
            Logger.i(BindViewModel.TAG, "onBindSuccess() called");
            WeakReference<BindThirdPartyDeviceViewModel> weakReference = this.vmRef;
            if (weakReference != null && (bindThirdPartyDeviceViewModel3 = weakReference.get()) != null && (bindAccountStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel3.getBindAccountStatus$device_manager_chinaProductRelease()) != null) {
                bindAccountStatus$device_manager_chinaProductRelease.postValue(101);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference2 = this.vmRef;
            if (weakReference2 != null && (bindThirdPartyDeviceViewModel2 = weakReference2.get()) != null && (bindStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel2.getBindStatus$device_manager_chinaProductRelease()) != null) {
                bindStatus$device_manager_chinaProductRelease.postValue(6);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference3 = this.vmRef;
            if (weakReference3 == null || (bindThirdPartyDeviceViewModel = weakReference3.get()) == null) {
                return;
            }
            bindThirdPartyDeviceViewModel.onBoundSuccess(did);
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void onConnectFailure(int status) {
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel;
            MutableLiveData<Boolean> needNfcActivate;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel2;
            ObservableInt isFail;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel3;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel4;
            MutableLiveData<Integer> pairDeviceStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel5;
            Logger.i(BindViewModel.TAG, "onConnectFailure() called with: status = " + status);
            WeakReference<BindThirdPartyDeviceViewModel> weakReference = this.vmRef;
            if (weakReference != null && (bindThirdPartyDeviceViewModel5 = weakReference.get()) != null) {
                bindThirdPartyDeviceViewModel5.onBoundFail(status);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference2 = this.vmRef;
            if (weakReference2 != null && (bindThirdPartyDeviceViewModel4 = weakReference2.get()) != null && (pairDeviceStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel4.getPairDeviceStatus$device_manager_chinaProductRelease()) != null) {
                pairDeviceStatus$device_manager_chinaProductRelease.postValue(102);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference3 = this.vmRef;
            if (weakReference3 != null && (bindThirdPartyDeviceViewModel3 = weakReference3.get()) != null && (bindStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel3.getBindStatus$device_manager_chinaProductRelease()) != null) {
                bindStatus$device_manager_chinaProductRelease.postValue(1);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference4 = this.vmRef;
            if (weakReference4 != null && (bindThirdPartyDeviceViewModel2 = weakReference4.get()) != null && (isFail = bindThirdPartyDeviceViewModel2.getIsFail()) != null) {
                isFail.set(0);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference5 = this.vmRef;
            if (weakReference5 == null || (bindThirdPartyDeviceViewModel = weakReference5.get()) == null || (needNfcActivate = bindThirdPartyDeviceViewModel.getNeedNfcActivate()) == null) {
                return;
            }
            needNfcActivate.postValue(Boolean.TRUE);
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void onConnectSuccess() {
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel2;
            MutableLiveData<Integer> bindAccountStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel3;
            MutableLiveData<Integer> pairDeviceStatus$device_manager_chinaProductRelease;
            Logger.i(BindViewModel.TAG, "onConnectSuccess() called");
            WeakReference<BindThirdPartyDeviceViewModel> weakReference = this.vmRef;
            if (weakReference != null && (bindThirdPartyDeviceViewModel3 = weakReference.get()) != null && (pairDeviceStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel3.getPairDeviceStatus$device_manager_chinaProductRelease()) != null) {
                pairDeviceStatus$device_manager_chinaProductRelease.postValue(101);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference2 = this.vmRef;
            if (weakReference2 != null && (bindThirdPartyDeviceViewModel2 = weakReference2.get()) != null && (bindAccountStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel2.getBindAccountStatus$device_manager_chinaProductRelease()) != null) {
                bindAccountStatus$device_manager_chinaProductRelease.postValue(100);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference3 = this.vmRef;
            if (weakReference3 == null || (bindThirdPartyDeviceViewModel = weakReference3.get()) == null || (bindStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel.getBindStatus$device_manager_chinaProductRelease()) == null) {
                return;
            }
            bindStatus$device_manager_chinaProductRelease.postValue(4);
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void onPairingFailure(int status) {
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease;
            Integer value;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel2;
            ObservableInt isFail;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel3;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease2;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel4;
            MutableLiveData<Integer> connectDeviceStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel5;
            Logger.i(BindViewModel.TAG, "onPairingFailure() called with: status = " + status);
            WeakReference<BindThirdPartyDeviceViewModel> weakReference = this.vmRef;
            if (weakReference == null || (bindThirdPartyDeviceViewModel = weakReference.get()) == null || (bindStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel.getBindStatus$device_manager_chinaProductRelease()) == null || (value = bindStatus$device_manager_chinaProductRelease.getValue()) == null || value.intValue() != 0) {
                return;
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference2 = this.vmRef;
            if (weakReference2 != null && (bindThirdPartyDeviceViewModel5 = weakReference2.get()) != null) {
                bindThirdPartyDeviceViewModel5.onBoundFail(status);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference3 = this.vmRef;
            if (weakReference3 != null && (bindThirdPartyDeviceViewModel4 = weakReference3.get()) != null && (connectDeviceStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel4.getConnectDeviceStatus$device_manager_chinaProductRelease()) != null) {
                connectDeviceStatus$device_manager_chinaProductRelease.postValue(102);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference4 = this.vmRef;
            if (weakReference4 != null && (bindThirdPartyDeviceViewModel3 = weakReference4.get()) != null && (bindStatus$device_manager_chinaProductRelease2 = bindThirdPartyDeviceViewModel3.getBindStatus$device_manager_chinaProductRelease()) != null) {
                bindStatus$device_manager_chinaProductRelease2.postValue(Integer.valueOf(status));
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference5 = this.vmRef;
            if (weakReference5 == null || (bindThirdPartyDeviceViewModel2 = weakReference5.get()) == null || (isFail = bindThirdPartyDeviceViewModel2.getIsFail()) == null) {
                return;
            }
            isFail.set(0);
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void onPairingSuccess(@Nullable byte[] key) {
            WeakReference<BindThirdPartyDeviceViewModel> weakReference;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease;
            Integer value;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel2;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease2;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel3;
            MutableLiveData<Integer> pairDeviceStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel4;
            MutableLiveData<Integer> connectDeviceStatus$device_manager_chinaProductRelease;
            BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel5;
            MutableLiveData<Integer> bindStatus$device_manager_chinaProductRelease3;
            Integer value2;
            Logger.i(BindViewModel.TAG, "onPairingSuccess() called");
            WeakReference<BindThirdPartyDeviceViewModel> weakReference2 = this.vmRef;
            if ((weakReference2 == null || (bindThirdPartyDeviceViewModel5 = weakReference2.get()) == null || (bindStatus$device_manager_chinaProductRelease3 = bindThirdPartyDeviceViewModel5.getBindStatus$device_manager_chinaProductRelease()) == null || (value2 = bindStatus$device_manager_chinaProductRelease3.getValue()) == null || value2.intValue() != 0) && ((weakReference = this.vmRef) == null || (bindThirdPartyDeviceViewModel = weakReference.get()) == null || (bindStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel.getBindStatus$device_manager_chinaProductRelease()) == null || (value = bindStatus$device_manager_chinaProductRelease.getValue()) == null || value.intValue() != 1)) {
                return;
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference3 = this.vmRef;
            if (weakReference3 != null && (bindThirdPartyDeviceViewModel4 = weakReference3.get()) != null && (connectDeviceStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel4.getConnectDeviceStatus$device_manager_chinaProductRelease()) != null) {
                connectDeviceStatus$device_manager_chinaProductRelease.postValue(101);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference4 = this.vmRef;
            if (weakReference4 != null && (bindThirdPartyDeviceViewModel3 = weakReference4.get()) != null && (pairDeviceStatus$device_manager_chinaProductRelease = bindThirdPartyDeviceViewModel3.getPairDeviceStatus$device_manager_chinaProductRelease()) != null) {
                pairDeviceStatus$device_manager_chinaProductRelease.postValue(100);
            }
            WeakReference<BindThirdPartyDeviceViewModel> weakReference5 = this.vmRef;
            if (weakReference5 == null || (bindThirdPartyDeviceViewModel2 = weakReference5.get()) == null || (bindStatus$device_manager_chinaProductRelease2 = bindThirdPartyDeviceViewModel2.getBindStatus$device_manager_chinaProductRelease()) == null) {
                return;
            }
            bindStatus$device_manager_chinaProductRelease2.postValue(2);
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void onRequestDeviceFailure() {
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void onRequestDeviceSuccess() {
        }

        @Override // com.xiaomi.fitness.device.manager.a
        public void showPairingCode(@Nullable String code, @Nullable e listener) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BindThirdPartyDeviceViewModel this$0, Integer num) {
        ThirdBindCallback thirdBindCallback;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(BindViewModel.TAG, "onCreate() called bindDeviceLiveData " + num);
        if ((num == null || num.intValue() != -1) && (thirdBindCallback = this$0.callback) != null) {
            Intrinsics.checkNotNull(num);
            thirdBindCallback.onBindFailure(num.intValue());
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final ThirdBindCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final MutableLiveData<Boolean> getNeedNfcActivate() {
        return this.needNfcActivate;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        ThirdBindCallback thirdBindCallback;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        Integer value = BloodSugarExtKt.getBindDeviceResult().getValue();
        if ((value == null || value.intValue() != -1) && (thirdBindCallback = this.callback) != null) {
            thirdBindCallback.onBindFailure(0);
        }
        BloodSugarExtKt.getBindDeviceResult().observe(owner, new BindThirdPartyDeviceViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mo2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BindThirdPartyDeviceViewModel.onCreate$lambda$0(this.f27039a, (Integer) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindViewModel, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.callback = null;
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.onBindListener);
    }

    public final void setCallback(@Nullable ThirdBindCallback thirdBindCallback) {
        this.callback = thirdBindCallback;
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindViewModel
    public void startBind(@NotNull BindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        getConnectDeviceStatus$device_manager_chinaProductRelease().setValue(100);
        getBindStatus$device_manager_chinaProductRelease().setValue(0);
        this.callback = new ThirdBindCallback(this);
        Logger.d(BindViewModel.TAG, "startBind() called with: step = " + deviceInfo.getStep());
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.onBindListener);
        if (deviceInfo.getStep() >= 1) {
            getConnectDeviceStatus$device_manager_chinaProductRelease().setValue(101);
        }
        if (deviceInfo.getStep() >= 2) {
            getPairDeviceStatus$device_manager_chinaProductRelease().setValue(101);
        }
        if (deviceInfo.getStep() >= 3) {
            getBindAccountStatus$device_manager_chinaProductRelease().setValue(101);
        }
    }
}
