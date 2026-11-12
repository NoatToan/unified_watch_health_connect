package com.xiaomi.fit.eco.device.model;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.xiaomi.eco.api.p;
import com.xiaomi.fit.eco.device.EcoDeviceFactory;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fit.eco.device.model.EcoBaseDeviceModel;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceStatus;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalInfo;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoInstanceExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoOhterExtKt;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote;
import defpackage.asc;
import defpackage.eu6;
import defpackage.ms7;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0001mB\u0011\b\u0004\u0012\u0006\u0010,\u001a\u00020\u0003¢\u0006\u0004\bl\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0005H$¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u001d\u0010\rJ\u001a\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\rJ\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\rJ\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\rJ\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0015J\u001f\u0010*\u001a\u00020\u00052\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0016¢\u0006\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0007R\"\u00102\u001a\u0002018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010\u001c\"\u0004\b:\u0010\u0015R\"\u0010;\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u00109\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u0015R\"\u0010=\u001a\u00020\u00188\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00109R\"\u0010D\u001a\u00020C8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u001cR\u0014\u0010Z\u001a\u00020C8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bY\u0010GR$\u0010a\u001a\u00020[2\u0006\u0010\\\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u001cR\u0016\u0010d\u001a\u0004\u0018\u00010C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010GR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u001cR\u0011\u0010k\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bj\u0010G¨\u0006n"}, d2 = {"Lcom/xiaomi/fit/eco/device/model/EcoBaseDeviceModel;", "Lms7;", "Lcom/xiaomi/eco/api/p$b;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "device", "", "compareDeviceInfo", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "initOnReAdd", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;)V", "initOnNormal", "initDeviceStatus", "()V", "initApiCall", "resetToInitialStatus", "initSpecial", "initByModelDevice", "", "isRemoved", "destroy", "(Z)V", "isNeedReset", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;)Z", "Lasc;", "newEcoApiCall", "()Lasc;", "isInvalid", "()Z", "destroyApiCall", "", "other", "equals", "(Ljava/lang/Object;)Z", "removeUserDevice", "onConnected", "onDisconnected", "rebind", "onBindSuccess", "Leu6;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalInfo;", "callback", "readLocalInfo", "(Leu6;)V", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "setDeviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceStatus;", "mEcoDeviceStatus", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceStatus;", "getMEcoDeviceStatus", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceStatus;", "setMEcoDeviceStatus", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceStatus;)V", "isReAdded", "Z", "setReAdded", "isCurrent", "setCurrent", "mEcoApiCall", "Lasc;", "getMEcoApiCall", "setMEcoApiCall", "(Lasc;)V", "isInitSpecial", "", "did", "Ljava/lang/String;", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "remote", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "getRemote", "()Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "setRemote", "(Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;)V", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "mEcoDeviceManager$delegate", "Lkotlin/Lazy;", "getMEcoDeviceManager", "()Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "mEcoDeviceManager", "getApiEcoCallValid", "apiEcoCallValid", "getDeviceKey", "deviceKey", "", "value", "getDeviceStatus", "()I", "setDeviceStatus", "(I)V", "deviceStatus", "isDeviceConnected", "getAlias", "alias", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "product", "isConnectActive", "getNodeID", "nodeID", "<init>", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class EcoBaseDeviceModel implements ms7, p.b {

    @JvmField
    @NotNull
    public static String TAG = "[EcoDeviceModel]";

    @NotNull
    private EcoDeviceInfo deviceInfo;

    @NotNull
    private String did;
    private boolean isCurrent;
    private boolean isInitSpecial;
    private boolean isReAdded;
    protected volatile asc mEcoApiCall;

    /* JADX INFO: renamed from: mEcoDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcoDeviceManager;

    @NotNull
    private volatile EcoDeviceStatus mEcoDeviceStatus;

    @NotNull
    private EcoDeviceModelRemote remote;

    public EcoBaseDeviceModel(@NotNull EcoDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
        this.mEcoDeviceStatus = new EcoDeviceStatus(0);
        this.did = getDeviceInfo().getDid();
        this.remote = new EcoDeviceModelRemote(getDid());
        this.mEcoDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zf7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcoBaseDeviceModel.mEcoDeviceManager_delegate$lambda$0();
            }
        });
    }

    private final void compareDeviceInfo(EcoDeviceInfo device) {
        EcoDevice ecoDevice = (EcoDevice) getDeviceInfo().device;
        EcoDevice ecoDevice2 = (EcoDevice) device.device;
        if (ecoDevice == null || ecoDevice2 == null) {
            EcoDeviceModelExtKt.logi("device info with null device");
            return;
        }
        Device.Detail detail = ecoDevice.getDetail();
        Device.Detail detail2 = ecoDevice2.getDetail();
        if (detail == null || detail2 == null) {
            EcoDeviceModelExtKt.logi("device info with null detail");
            return;
        }
        String phoneId = detail.getPhoneId();
        String phoneId2 = detail2.getPhoneId();
        if (phoneId == null || phoneId2 == null) {
            EcoDeviceModelExtKt.logi("device info with null id");
        } else if (Intrinsics.areEqual(phoneId, phoneId2)) {
            EcoDeviceModelExtKt.logi("same phone id , do noting");
        } else {
            EcoDeviceModelExtKt.logi("compareDeviceInfo: disconnect device");
            getMEcoApiCall().e(null);
        }
    }

    private final boolean getApiEcoCallValid() {
        boolean z = this.mEcoApiCall != null;
        EcoDeviceModelExtKt.logi("EcoApiCall is initialized:" + z);
        return z;
    }

    private final EcoDeviceManagerInternalRemote getMEcoDeviceManager() {
        return (EcoDeviceManagerInternalRemote) this.mEcoDeviceManager.getValue();
    }

    private final void initApiCall() {
        if (getApiEcoCallValid()) {
            return;
        }
        setMEcoApiCall(newEcoApiCall());
        Logger.i("create new mEcoApiCall = " + getMEcoApiCall(), new Object[0]);
    }

    private final void initDeviceStatus() {
        if (EcoOhterExtKt.isAppAbandon(ApplicationExtKt.getApplication())) {
            setDeviceStatus(8);
        } else if (getDeviceStatus() == 0) {
            setDeviceStatus(1);
        }
    }

    @SuppressLint({"DefaultLocale"})
    private final void initOnNormal(EcoDevice device) {
        String mac;
        initDeviceStatus();
        if ((device == null || (mac = device.getMac()) == null || mac.length() != 0) && !this.isInitSpecial) {
            initApiCall();
            initSpecial(device);
            this.isInitSpecial = true;
        }
    }

    @SuppressLint({"DefaultLocale"})
    private final void initOnReAdd(EcoDevice device) {
        Intrinsics.checkNotNull(device);
        if (device.getMac().length() == 0) {
            return;
        }
        initApiCall();
        initSpecial(device);
        this.isInitSpecial = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceManagerRemoteImpl mEcoDeviceManager_delegate$lambda$0() {
        return EcoInstanceExtKt.getInstance(EcoDeviceManagerRemoteImpl.INSTANCE);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
        EcoDeviceModelExtKt.logi("destroy:" + getDeviceInfo());
        setDeviceStatus(0);
        if (getDeviceKey().length() > 0) {
            EcoDeviceFactory.INSTANCE.destroyEcoApiCall(getDeviceKey());
        }
        getMEcoDeviceManager().notifyDeviceDestroy(getDid(), isRemoved);
    }

    public final void destroyApiCall() {
        if (getApiEcoCallValid()) {
            getMEcoApiCall().destroy();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WearableDeviceModel)) {
            return false;
        }
        if (getDid().length() > 0) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) other;
            if (wearableDeviceModel.getDid().length() > 0) {
                return Intrinsics.areEqual(getDid(), wearableDeviceModel.getDid());
            }
        }
        return Intrinsics.areEqual(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(this), DeviceModelExtKt.getMac((DeviceModel) other));
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @Nullable
    public String getAlias() {
        return getProduct().getAlias();
    }

    @NotNull
    public String getDeviceKey() {
        return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(this);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public int getDeviceStatus() {
        return this.mEcoDeviceStatus.getStatus();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public String getDid() {
        return this.did;
    }

    @NotNull
    public final asc getMEcoApiCall() {
        asc ascVar = this.mEcoApiCall;
        if (ascVar != null) {
            return ascVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEcoApiCall");
        return null;
    }

    @NotNull
    public final EcoDeviceStatus getMEcoDeviceStatus() {
        return this.mEcoDeviceStatus;
    }

    @NotNull
    public final String getNodeID() {
        if (getDeviceInfo().getNodeID() == null) {
            return "---";
        }
        String nodeID = getDeviceInfo().getNodeID();
        Intrinsics.checkNotNull(nodeID);
        return nodeID;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public Product getProduct() {
        Product product = getDeviceInfo().getProduct();
        Intrinsics.checkNotNull(product);
        return product;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    @NotNull
    public EcoDeviceModelRemote getRemote() {
        return this.remote;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void initByModelDevice(@NotNull EcoDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        EcoDeviceModelExtKt.logi("init api call by device(" + device + ")");
        compareDeviceInfo(device);
        T t = device.device;
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice");
        EcoDevice ecoDevice = (EcoDevice) t;
        if (isNeedReset(ecoDevice)) {
            initOnReAdd(ecoDevice);
        } else {
            initOnNormal(ecoDevice);
        }
        setDeviceInfo(device);
    }

    public void initSpecial(@Nullable EcoDevice device) {
        getMEcoDeviceManager().notifyDeviceInit(getDid(), getIsReAdded());
    }

    @Override // com.xiaomi.eco.server.IEcoConnectActive
    /* JADX INFO: renamed from: isConnectActive */
    public boolean getIsConnectActive() {
        Device.Detail detail;
        EcoDevice ecoDevice = (EcoDevice) getDeviceInfo().device;
        String phoneId = (ecoDevice == null || (detail = ecoDevice.getDetail()) == null) ? null : detail.getPhoneId();
        String uniqueIdentify = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getUniqueIdentify();
        EcoDeviceModelExtKt.logi("checkConnectAppId local id = " + uniqueIdentify + " , connect id = " + phoneId);
        return TextUtils.isEmpty(phoneId) || Intrinsics.areEqual(uniqueIdentify, phoneId);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isCurrent, reason: from getter */
    public boolean getIsCurrent() {
        return this.isCurrent;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    /* JADX INFO: renamed from: isDeviceConnected */
    public boolean getIsDeviceConnected() {
        return this.mEcoDeviceStatus.isConnected();
    }

    public boolean isInvalid() {
        return this.mEcoDeviceStatus.isNotBound();
    }

    public boolean isNeedReset(@Nullable EcoDevice device) {
        return false;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    /* JADX INFO: renamed from: isReAdded, reason: from getter */
    public boolean getIsReAdded() {
        return this.isReAdded;
    }

    @NotNull
    public asc newEcoApiCall() {
        EcoDeviceInfo deviceInfo = getDeviceInfo();
        Intrinsics.checkNotNull(deviceInfo, "null cannot be cast to non-null type com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo");
        return EcoDeviceFactory.INSTANCE.getEcoApiCall(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(this), getDid(), deviceInfo, deviceInfo.isOwner(), this);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void onBindSuccess(boolean rebind) {
        setReAdded(true);
        removeUserDevice();
    }

    @Override // com.xiaomi.eco.api.p.b
    public void onConnected() {
    }

    @Override // com.xiaomi.eco.api.p.b
    public void onDisconnected() {
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel
    public void readLocalInfo(@Nullable eu6<EcoLocalInfo> callback) {
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void removeUserDevice() {
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeDid(getDid());
    }

    public abstract void resetToInitialStatus();

    public void setCurrent(boolean z) {
        this.isCurrent = z;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public synchronized void setDeviceStatus(int i) {
        EcoDeviceModelExtKt.logi("set device status: " + i);
        this.mEcoDeviceStatus.setStatus(i);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setMEcoApiCall(@NotNull asc ascVar) {
        Intrinsics.checkNotNullParameter(ascVar, "<set-?>");
        this.mEcoApiCall = ascVar;
    }

    public final void setMEcoDeviceStatus(@NotNull EcoDeviceStatus ecoDeviceStatus) {
        Intrinsics.checkNotNullParameter(ecoDeviceStatus, "<set-?>");
        this.mEcoDeviceStatus = ecoDeviceStatus;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void setReAdded(boolean z) {
        this.isReAdded = z;
    }

    public void setRemote(@NotNull EcoDeviceModelRemote ecoDeviceModelRemote) {
        Intrinsics.checkNotNullParameter(ecoDeviceModelRemote, "<set-?>");
        this.remote = ecoDeviceModelRemote;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    @NotNull
    public EcoDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceModel
    public void setDeviceInfo(@NotNull EcoDeviceInfo ecoDeviceInfo) {
        Intrinsics.checkNotNullParameter(ecoDeviceInfo, "<set-?>");
        this.deviceInfo = ecoDeviceInfo;
    }
}
