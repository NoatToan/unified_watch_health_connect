package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0007¢\u0006\u0004\b.\u0010/J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010JY\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016H\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0'8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/Observer;", "", "observer", "observerLoadStatus", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "", "isDeviceConnected", "()Z", "Ls7r;", "packet", "needResponse", "", "method", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "successCallback", "failureCallback", "deviceApiCall", "(Ls7r;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "mDeviceSync", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "getMDeviceSync", "()Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "setMDeviceSync", "(Lcom/xiaomi/fitness/device/contact/export/DeviceContact;)V", "Landroidx/lifecycle/MutableLiveData;", "loadStatus", "Landroidx/lifecycle/MutableLiveData;", "getLoadStatus", "()Landroidx/lifecycle/MutableLiveData;", "type", "getType", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class BaseHealthMonitorViewModel extends AbsViewModel {
    public static final int LOAD_STATUS_FIRMWARE_NOT_SUPPORT = 4;
    public static final int LOAD_STATUS_INITIALIZE = -1;
    public static final int LOAD_STATUS_LOADED = 2;
    public static final int LOAD_STATUS_LOADING = 1;
    public static final int LOAD_STATUS_LOAD_ERROR = 3;
    public static final int sTypeHr = 1;
    public static final int sTypePresure = 3;
    public static final int sTypeSpo = 2;
    public DeviceContact mDeviceSync;

    @NotNull
    private final String TAG = "BaseHealthMonitorViewModel";

    @NotNull
    private final MutableLiveData<Integer> loadStatus = new MutableLiveData<>(-1);

    @NotNull
    private final MutableLiveData<Integer> type = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel$deviceApiCall$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorViewModel$deviceApiCall$1", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements OnSyncCallback {
        final /* synthetic */ Function1<Integer, Unit> $failureCallback;
        final /* synthetic */ String $method;
        final /* synthetic */ Function1<SyncResult, Unit> $successCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Function1<? super SyncResult, Unit> function1, Function1<? super Integer, Unit> function2) {
            this.$method = str;
            this.$successCallback = function1;
            this.$failureCallback = function2;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String did, int type, int code) {
            BaseHealthMonitorViewModel.this.getLoadStatus().postValue(3);
            AnyExtKt.main$default(null, new BaseHealthMonitorViewModel$deviceApiCall$1$onError$1(BaseHealthMonitorViewModel.this, this.$method, type, did, code, this.$failureCallback, null), 1, null);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String did, int type, SyncResult result) {
            BaseHealthMonitorViewModel.this.getLoadStatus().postValue(2);
            AnyExtKt.main$default(null, new BaseHealthMonitorViewModel$deviceApiCall$1$onSuccess$1(result, BaseHealthMonitorViewModel.this, this.$method, this.$successCallback, this, did, type, this.$failureCallback, null), 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deviceApiCall$default(BaseHealthMonitorViewModel baseHealthMonitorViewModel, s7r s7rVar, boolean z, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deviceApiCall");
        }
        if ((i & 4) != 0) {
            str = "";
        }
        baseHealthMonitorViewModel.deviceApiCall(s7rVar, z, str, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function2);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void deviceApiCall(@NotNull s7r packet, boolean needResponse, @NotNull String method, @Nullable Function1<? super SyncResult, Unit> successCallback, @Nullable Function1<? super Integer, Unit> failureCallback) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        Intrinsics.checkNotNullParameter(method, "method");
        this.loadStatus.postValue(1);
        DeviceContact.DefaultImpls.call$default(getMDeviceSync(), packet, needResponse, new AnonymousClass1(method, successCallback, failureCallback), 0, 8, null);
    }

    @NotNull
    public final MutableLiveData<Integer> getLoadStatus() {
        return this.loadStatus;
    }

    @NotNull
    public final DeviceContact getMDeviceSync() {
        DeviceContact deviceContact = this.mDeviceSync;
        if (deviceContact != null) {
            return deviceContact;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDeviceSync");
        return null;
    }

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final MutableLiveData<Integer> getType() {
        return this.type;
    }

    public final boolean isDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.isDeviceConnected();
        }
        return false;
    }

    public final void observerLoadStatus(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<Integer> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.loadStatus.observe(lifecycleOwner, observer);
    }

    public final void setMDeviceSync(@NotNull DeviceContact deviceContact) {
        Intrinsics.checkNotNullParameter(deviceContact, "<set-?>");
        this.mDeviceSync = deviceContact;
    }
}
