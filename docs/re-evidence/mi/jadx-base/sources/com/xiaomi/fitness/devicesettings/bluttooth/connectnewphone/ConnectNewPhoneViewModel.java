package com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneViewModel;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import defpackage.s33;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020'JC\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010.2#\u0010/\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020'\u0018\u000100R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "START", "", "getSTART", "()I", "DEVICE_CONNECTED", "getDEVICE_CONNECTED", "CONNECT_FAILURE", "getCONNECT_FAILURE", "SWITCH_FAILURE", "getSWITCH_FAILURE", "SWITCH_SUCCESS", "getSWITCH_SUCCESS", "FROMOUT", "getFROMOUT", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", HabitShareActivity.KEY_BIG_ICON, "getBigIcon", "productName", "getProductName", "switchStatus", "Landroidx/lifecycle/MutableLiveData;", "getSwitchStatus", "()Landroidx/lifecycle/MutableLiveData;", "deviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "getDeviceStatusListener", "()Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "connectDevice", "", "removeListener", "sendConnectNewPhone2Device", "openBluetooth", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "success", "Lkotlin/Function0;", "fail", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "code", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectNewPhoneViewModel extends AbsViewModel {
    private final int START;

    @NotNull
    private final String TAG = "ConnectNewPhone";
    private final int DEVICE_CONNECTED = 2;
    private final int CONNECT_FAILURE = 3;
    private final int SWITCH_FAILURE = 4;
    private final int SWITCH_SUCCESS = 5;
    private final int FROMOUT = 7;

    @NotNull
    private final MutableLiveData<Integer> switchStatus = new MutableLiveData<>();

    @NotNull
    private final OnDeviceStatusListener deviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneViewModel$deviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
            this.this$0.removeListener();
            this.this$0.getSwitchStatus().postValue(Integer.valueOf(this.this$0.getCONNECT_FAILURE()));
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            this.this$0.removeListener();
            this.this$0.getSwitchStatus().postValue(Integer.valueOf(this.this$0.getDEVICE_CONNECTED()));
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openBluetooth$lambda$1(Ref.ObjectRef successCallback, Ref.ObjectRef failCallback, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(successCallback, "$successCallback");
        Intrinsics.checkNotNullParameter(failCallback, "$failCallback");
        if (i == -1) {
            Function0 function0 = (Function0) successCallback.element;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function1 function1 = (Function1) failCallback.element;
            if (function1 != null) {
                function1.invoke2(109);
            }
        }
        return Unit.INSTANCE;
    }

    public final void connectDevice() {
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || !deviceModel.getIsDeviceConnected()) {
            return;
        }
        this.switchStatus.postValue(Integer.valueOf(this.DEVICE_CONNECTED));
    }

    @Nullable
    public final String getBigIcon() {
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel != null) {
            return DeviceModelExtKt.getBigIcon(deviceModel);
        }
        return null;
    }

    public final int getCONNECT_FAILURE() {
        return this.CONNECT_FAILURE;
    }

    public final int getDEVICE_CONNECTED() {
        return this.DEVICE_CONNECTED;
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @NotNull
    public final OnDeviceStatusListener getDeviceStatusListener() {
        return this.deviceStatusListener;
    }

    public final int getFROMOUT() {
        return this.FROMOUT;
    }

    @Nullable
    public final String getProductName() {
        Product product;
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (product = deviceModel.getProduct()) == null) {
            return null;
        }
        return product.getProductName();
    }

    public final int getSTART() {
        return this.START;
    }

    public final int getSWITCH_FAILURE() {
        return this.SWITCH_FAILURE;
    }

    public final int getSWITCH_SUCCESS() {
        return this.SWITCH_SUCCESS;
    }

    @NotNull
    public final MutableLiveData<Integer> getSwitchStatus() {
        return this.switchStatus;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void openBluetooth(@NotNull BaseActivity activity, @Nullable Function0<Unit> success, @Nullable Function1<? super Integer, Unit> fail) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = success;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = fail;
        if (s33.e()) {
            Logger.i("Bluetooth is enabled", new Object[0]);
            Function0 function0 = (Function0) objectRef.element;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        final Lifecycle lifecycle = activity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneViewModel.openBluetooth.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    objectRef.element = null;
                    objectRef2.element = null;
                    lifecycle.removeObserver(this);
                }
            }
        });
        try {
            activity.startForActivityResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), new Function2() { // from class: le4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConnectNewPhoneViewModel.openBluetooth$lambda$1(objectRef, objectRef2, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            Logger.i("open bluetooth fail", th);
            Function1 function1 = (Function1) objectRef2.element;
            if (function1 != null) {
                function1.invoke2(109);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void removeListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.deviceStatusListener);
    }

    public final void sendConnectNewPhone2Device() {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 63;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneViewModel.sendConnectNewPhone2Device.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                ConnectNewPhoneViewModel.this.getSwitchStatus().postValue(Integer.valueOf(ConnectNewPhoneViewModel.this.getSWITCH_FAILURE()));
                Logger.i(ConnectNewPhoneViewModel.this.getTAG(), "send ConnectNewPhone failure");
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(ConnectNewPhoneViewModel.this.getTAG(), "send ConnectNewPhone success");
            }
        }, 0, 8, null);
    }
}
