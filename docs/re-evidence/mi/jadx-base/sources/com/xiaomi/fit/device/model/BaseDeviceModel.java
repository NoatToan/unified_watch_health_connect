package com.xiaomi.fit.device.model;

import android.os.Build;
import android.text.TextUtils;
import com.mi.fitness.capability.export.CapabilityManager;
import com.mi.fitness.capability.export.CapabilityManagerExtKt;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.device.model.BaseDeviceModel;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.AccessoryDevicePreference;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.DeviceStatus;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.InstanceExtKt;
import com.xiaomi.fitness.device.manager.extensions.OhterExtKt;
import com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import com.xiaomi.wearable.core.client.ServiceStateListener;
import defpackage.eu6;
import defpackage.ni4;
import defpackage.qa6;
import defpackage.s33;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001`B\u0011\b\u0004\u0012\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b_\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!J\u001f\u0010&\u001a\u00020\u00032\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\"\u0010.\u001a\u00020-8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u0010\u000fR\"\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\b\r\u00106\"\u0004\b8\u0010\u000fR\"\u00109\u001a\u00020\b8V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u00105\u001a\u0004\b9\u00106\"\u0004\b:\u0010\u000fR\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR$\u0010S\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010!\"\u0004\bQ\u0010RR$\u0010V\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010!\"\u0004\bU\u0010RR\u0014\u0010W\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u00106R\u0016\u0010Y\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010?R\u0014\u0010]\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u00106¨\u0006a"}, d2 = {"Lcom/xiaomi/fit/device/model/BaseDeviceModel;", "Lqa6;", "Lcom/xiaomi/wearable/core/client/ServiceStateListener;", "", "printPhoneId", "()V", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "device", "", "isDeviceChanged", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)Z", "initDeviceStatus", "init", "isCurrent", "setCurrentStatus", "(Z)V", "update", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "onUpdate", "isPhoneIdChanged", "isRemoved", "destroy", "", "other", "equals", "(Ljava/lang/Object;)Z", "removeUserDevice", "rebind", "onBindSuccess", "connectDevice", "disconnectDevice", "", "getDeviceCapability", "()I", "getDeviceCapabilityV2", "Leu6;", "Lcom/xiaomi/fitness/device/manager/export/bean/WatchInfo;", "callback", "readWatchInfo", "(Leu6;)V", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "setDeviceInfo", "Lcom/xiaomi/fitness/device/manager/DeviceStatus;", "mDeviceStatus", "Lcom/xiaomi/fitness/device/manager/DeviceStatus;", "getMDeviceStatus", "()Lcom/xiaomi/fitness/device/manager/DeviceStatus;", "setMDeviceStatus", "(Lcom/xiaomi/fitness/device/manager/DeviceStatus;)V", "isReAdded", "Z", "()Z", "setReAdded", "setCurrent", "isAccessory", "setAccessory", "", "did", "Ljava/lang/String;", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "remote", "Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "getRemote", "()Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "setRemote", "(Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;)V", "Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "mDeviceManager$delegate", "Lkotlin/Lazy;", "getMDeviceManager", "()Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "mDeviceManager", "value", "getAccessoryMode", "setAccessoryMode", "(I)V", "accessoryMode", "getDeviceStatus", "setDeviceStatus", "deviceStatus", "isDeviceConnected", "getAlias", "alias", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "product", "isConnectActive", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseDeviceModel implements qa6, ServiceStateListener {

    @JvmField
    @NotNull
    public static String TAG = "[DeviceModel]";

    @NotNull
    private WearableDeviceInfo deviceInfo;

    @NotNull
    private String did;
    private boolean isAccessory;
    private boolean isCurrent;
    private boolean isReAdded;

    /* JADX INFO: renamed from: mDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceManager;

    @NotNull
    private volatile DeviceStatus mDeviceStatus;

    @NotNull
    private DeviceModelRemote remote;

    public BaseDeviceModel(@NotNull WearableDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
        this.mDeviceStatus = new DeviceStatus(0);
        this.did = getDeviceInfo().getDid();
        this.remote = new DeviceModelRemote(this.did);
        this.mDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y62
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDeviceModel.mDeviceManager_delegate$lambda$0();
            }
        });
    }

    private final void initDeviceStatus() {
        if (OhterExtKt.isAppAbandon(ApplicationExtKt.getApplication())) {
            setDeviceStatus(8);
        } else if (getDeviceStatus() == 0) {
            setDeviceStatus(1);
        }
    }

    private final boolean isDeviceChanged(WearableDeviceInfo device) {
        return !Intrinsics.areEqual(getDeviceInfo().device, device.device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceManagerRemoteImpl mDeviceManager_delegate$lambda$0() {
        return InstanceExtKt.getInstance(DeviceManagerRemoteImpl.INSTANCE);
    }

    private final void printPhoneId() {
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void connectDevice() {
        Logger.i(TAG, "connectDevice() called");
        if (Build.VERSION.SDK_INT < 31) {
            IMiWearCoreClient.INSTANCE.getInstance().connect(this.did);
            return;
        }
        if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.BLUETOOTH_CONNECT") != 0) {
            DeviceModelExtKt.logi(TAG, "connectDevice() called no permission");
        } else if (s33.e()) {
            IMiWearCoreClient.INSTANCE.getInstance().connect(this.did);
        } else {
            DeviceModelExtKt.logi(TAG, "connectDevice() called bluetooth is not enable");
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
        DeviceModelExtKt.logi("destroy:" + getDeviceInfo());
        setDeviceStatus(0);
        getMDeviceManager().notifyDeviceDestroy(this.did, isRemoved);
        IMiWearCoreClient.INSTANCE.getInstance().removeServiceStateListener(this);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void disconnectDevice() {
        Logger.i(TAG, "disconnectDevice() called");
        IMiWearCoreClient.INSTANCE.getInstance().disconnect(this.did);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WearableDeviceModel)) {
            return false;
        }
        if (this.did.length() > 0) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) other;
            if (wearableDeviceModel.getDid().length() > 0) {
                return Intrinsics.areEqual(this.did, wearableDeviceModel.getDid());
            }
        }
        return Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this), com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac((DeviceModel) other));
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public int getAccessoryMode() {
        Integer num = AccessoryDevicePreference.INSTANCE.getACCESSORY_DEVICE().get(this.did);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @Nullable
    public String getAlias() {
        return getProduct().getAlias();
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public int getDeviceCapability() {
        return IMiWearCoreClient.INSTANCE.getInstance().getDeviceCapabilities(this.did);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public int getDeviceCapabilityV2() {
        return IMiWearCoreClient.INSTANCE.getInstance().getDeviceCapabilitiesV2(this.did);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public int getDeviceStatus() {
        return this.mDeviceStatus.getStatus();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final DeviceManagerInternalRemote getMDeviceManager() {
        return (DeviceManagerInternalRemote) this.mDeviceManager.getValue();
    }

    @NotNull
    public final DeviceStatus getMDeviceStatus() {
        return this.mDeviceStatus;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public Product getProduct() {
        Product product = getDeviceInfo().getProduct();
        Intrinsics.checkNotNull(product);
        return product;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    @NotNull
    public DeviceModelRemote getRemote() {
        return this.remote;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void init() {
        initDeviceStatus();
        IMiWearCoreClient.Companion companion = IMiWearCoreClient.INSTANCE;
        companion.getInstance().addServiceStateListener(this);
        companion.getInstance().setWearMode(this.did, getAccessoryMode());
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public boolean isAccessory() {
        return getAccessoryMode() == 1;
    }

    @Override // com.xiaomi.fitness.device.manager.export.IConnectActive
    /* JADX INFO: renamed from: isConnectActive */
    public boolean getIsConnectActive() {
        Device.Detail detail;
        WearableDevice wearableDevice = (WearableDevice) getDeviceInfo().device;
        String phoneId = (wearableDevice == null || (detail = wearableDevice.getDetail()) == null) ? null : detail.getPhoneId();
        return TextUtils.isEmpty(phoneId) || Intrinsics.areEqual(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify(), phoneId) || DevicePreference.INSTANCE.getCONNECT_NEW_PHONE();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isCurrent, reason: from getter */
    public boolean getIsCurrent() {
        return this.isCurrent;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isDeviceConnected */
    public boolean getIsDeviceConnected() {
        return this.mDeviceStatus.isConnected();
    }

    public boolean isPhoneIdChanged(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        WearableDevice wearableDevice = (WearableDevice) getDeviceInfo().device;
        WearableDevice wearableDevice2 = (WearableDevice) device.device;
        if (wearableDevice == null || wearableDevice2 == null) {
            DeviceModelExtKt.logi("device info with null device");
            return false;
        }
        Device.Detail detail = wearableDevice.getDetail();
        Device.Detail detail2 = wearableDevice2.getDetail();
        if (detail == null || detail2 == null) {
            DeviceModelExtKt.logi("device info with null detail");
            return false;
        }
        String phoneId = detail.getPhoneId();
        String phoneId2 = detail2.getPhoneId();
        if (phoneId == null || phoneId2 == null) {
            DeviceModelExtKt.logi("device info with null id");
            return false;
        }
        if (Intrinsics.areEqual(phoneId, phoneId2)) {
            DeviceModelExtKt.logi("same phone id , do noting");
            return false;
        }
        String uniqueIdentify = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify();
        DeviceModelExtKt.logi("local phone id compare with new phone id,  " + Intrinsics.areEqual(uniqueIdentify, phoneId2));
        return !Intrinsics.areEqual(uniqueIdentify, phoneId2);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    /* JADX INFO: renamed from: isReAdded, reason: from getter */
    public boolean getIsReAdded() {
        return this.isReAdded;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void onBindSuccess(boolean rebind) {
        setReAdded(true);
        removeUserDevice();
    }

    public void onUpdate(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        setReAdded(true);
        getMDeviceManager().notifyDeviceInit(this.did, true);
    }

    @Override // com.xiaomi.fitness.device.manager.export.WearableDeviceModel
    public void readWatchInfo(@Nullable eu6<WatchInfo> callback) {
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void removeUserDevice() {
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeDid(this.did);
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setAccessory(boolean z) {
        this.isAccessory = z;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setAccessoryMode(int i) {
        AccessoryDevicePreference accessoryDevicePreference = AccessoryDevicePreference.INSTANCE;
        ConcurrentHashMap<String, Integer> accessory_device = accessoryDevicePreference.getACCESSORY_DEVICE();
        if (i == 1) {
            accessory_device.put(this.did, Integer.valueOf(i));
        } else {
            accessory_device.remove(this.did);
        }
        IMiWearCoreClient.INSTANCE.getInstance().setWearMode(this.did, i);
        accessoryDevicePreference.setACCESSORY_DEVICE(accessory_device);
        Logger.i(TAG, "accessoryDevice = " + accessory_device);
    }

    public void setCurrent(boolean z) {
        this.isCurrent = z;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setCurrentStatus(boolean isCurrent) {
        setCurrent(isCurrent);
        IMiWearCoreClient.Companion companion = IMiWearCoreClient.INSTANCE;
        companion.getInstance().setCurrentDevice(getDeviceInfo().getDid(), isCurrent);
        if (isCurrent) {
            companion.getInstance().setAppCapabilities(CapabilityManagerExtKt.getInstance(CapabilityManager.INSTANCE).getCapabilitiesInt());
        }
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public synchronized void setDeviceStatus(int i) {
        DeviceModelExtKt.logi("set device status: " + i);
        this.mDeviceStatus.setStatus(i);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setMDeviceStatus(@NotNull DeviceStatus deviceStatus) {
        Intrinsics.checkNotNullParameter(deviceStatus, "<set-?>");
        this.mDeviceStatus = deviceStatus;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setReAdded(boolean z) {
        this.isReAdded = z;
    }

    public void setRemote(@NotNull DeviceModelRemote deviceModelRemote) {
        Intrinsics.checkNotNullParameter(deviceModelRemote, "<set-?>");
        this.remote = deviceModelRemote;
    }

    @Override // com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void update(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        DeviceModelExtKt.logi(TAG, "update() called ");
        if (isDeviceChanged(device)) {
            DeviceModelExtKt.logi("update() called with: new device = " + device + ", old = " + getDeviceInfo() + " ");
            onUpdate(device);
        }
        if (isPhoneIdChanged(device) && getIsCurrent()) {
            disconnectDevice();
        }
        device.setBatteryInfo(getDeviceInfo().getBatteryInfo());
        setDeviceInfo(device);
        initDeviceStatus();
        printPhoneId();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public WearableDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceInfo(@NotNull WearableDeviceInfo wearableDeviceInfo) {
        Intrinsics.checkNotNullParameter(wearableDeviceInfo, "<set-?>");
        this.deviceInfo = wearableDeviceInfo;
    }
}
