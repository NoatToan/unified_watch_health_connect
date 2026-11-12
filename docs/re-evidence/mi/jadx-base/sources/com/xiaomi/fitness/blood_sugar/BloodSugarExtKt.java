package com.xiaomi.fitness.blood_sugar;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.wearable.connection.Connection;
import com.xiaomi.wearable.connection.ConnectionCallback;
import com.xiaomi.wearable.core.CapabilityCallback;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.device.model.ThirdPartyDeviceInfo;
import com.xiaomi.wearable.transport.queue.Messenger;
import com.xiaomi.wearable.wear.api.UnbindCallback;
import com.xiaomi.wearable.wear.api.WearBinder;
import defpackage.kb;
import defpackage.kj2;
import defpackage.mvc;
import defpackage.nzc;
import defpackage.zd4;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u001d\u001a\u00020\u0001\u001a\u0006\u0010\u001e\u001a\u00020\u0001\u001a\u0006\u0010\u001f\u001a\u00020 \u001a\u001e\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010$\u001a\u00020\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0001\u001a\u001e\u0010&\u001a\u00020\"*\u00020#2\b\u0010'\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010(\u001a\u00020\"*\u00020#\u001a\n\u0010)\u001a\u00020\"*\u00020#\u001a\u0012\u0010*\u001a\u00020\"*\u00020+2\u0006\u0010,\u001a\u00020-\u001a\n\u0010.\u001a\u00020/*\u00020+\u001a\u0006\u00100\u001a\u00020\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\"\u001f\u0010\u0005\u001a\u00020\f*\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\b\u0010\u000e\"\u001f\u0010\u0005\u001a\u00020\u0010*\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\b\u0010\u0012\"\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u000e\u0010\u0019\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000\"\u0015\u00101\u001a\u00020 *\u00020+8F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"PATH_BIND_BLOOD_SUGAR", "", "PATH_RE_ACTIVE_DEVICE", "PATH_GUIDE_BLOOD_SUGAR", "PATH_BIND_SUGAR_NFC", "instance", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager;", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$Companion;)Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingManager;", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingManager$Companion;", "(Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingManager$Companion;)Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingManager;", "instance$delegate$1", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarManagerWrapper;", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarManagerWrapper$Companion;", "(Lcom/xiaomi/fitness/blood_sugar/BloodSugarManagerWrapper$Companion;)Lcom/xiaomi/fitness/blood_sugar/BloodSugarManagerWrapper;", "instance$delegate$2", "bindDeviceResult", "Landroidx/lifecycle/MutableLiveData;", "", "getBindDeviceResult", "()Landroidx/lifecycle/MutableLiveData;", "FLOW_BIND_FAILURE_TOKEN", "BIND_APPDEVICE_ENDUSING", "BIND_APPDEVICE_OUTOFPRODUCETIME", "BIND_APPDEVICE_ALREADYUSED", "getBloodSugarGuideUrl", "getBloodSugarNFCUrl", "hasNFC", "", "launchBloodSugarBind", "", "Landroid/content/Context;", "productId", "mac", "launchBloodSugarReActive", "did", "launchBindNfc", "launchBloodSugarGuide", "setGlucoseCallback", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "callback", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarManager$GlucoseCallback;", "getDeviceExpireTime", "Lcom/xiaomi/fitness/blood_sugar/DeviceTime;", "getBloodSugarHistoryDeviceSize", "isBloodSugar", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "blood-sugar-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BloodSugarExtKt {
    public static final int BIND_APPDEVICE_ALREADYUSED = 10;
    public static final int BIND_APPDEVICE_ENDUSING = 8;
    public static final int BIND_APPDEVICE_OUTOFPRODUCETIME = 9;
    public static final int FLOW_BIND_FAILURE_TOKEN = 1;

    @NotNull
    public static final String PATH_BIND_BLOOD_SUGAR = "/bloodsugar/guide/web";

    @NotNull
    public static final String PATH_BIND_SUGAR_NFC = "/bloodsugar/bind/nfc";

    @NotNull
    public static final String PATH_GUIDE_BLOOD_SUGAR = "/bloodsugar/guide/activity";

    @NotNull
    public static final String PATH_RE_ACTIVE_DEVICE = "/bloodsugar/active/web";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p13
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BloodSugarExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: q13
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BloodSugarExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r13
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BloodSugarExtKt.instance_delegate$lambda$2();
        }
    });

    @NotNull
    private static final MutableLiveData<Integer> bindDeviceResult = new MutableLiveData<>();

    @NotNull
    public static final MutableLiveData<Integer> getBindDeviceResult() {
        return bindDeviceResult;
    }

    @NotNull
    public static final String getBloodSugarGuideUrl() {
        return "https://watch.iot.mi.com/html/guidance/index.html?model=synaps.watch.m8&locale=zh_cn&nfc=" + hasNFC();
    }

    public static final int getBloodSugarHistoryDeviceSize() {
        return getInstance(BloodSugarManagerWrapper.INSTANCE).getHistoryDeviceSize();
    }

    @NotNull
    public static final String getBloodSugarNFCUrl() {
        return "https://watch.iot.mi.com/html/guidance/index.html?model=synaps.watch.m8&startPage=7&nfc=" + hasNFC();
    }

    @NotNull
    public static final DeviceTime getDeviceExpireTime(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (!isBloodSugar(wearableDeviceModel)) {
            throw new IllegalStateException("not blood sugar device");
        }
        BloodSugarManagerWrapper.Companion companion = BloodSugarManagerWrapper.INSTANCE;
        Long activeExpireTime = getInstance(companion).getDeviceTime().getActiveExpireTime();
        return new DeviceTime(Long.valueOf(activeExpireTime != null ? activeExpireTime.longValue() : 1209600000L), getInstance(companion).getDeviceTime().getActiveTime());
    }

    @NotNull
    public static final BloodSugarManager getInstance(@NotNull BloodSugarManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (BloodSugarManager) instance$delegate.getValue();
    }

    public static final boolean hasNFC() {
        return ApplicationExtKt.getApplication().getPackageManager().hasSystemFeature("android.hardware.nfc");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.fitness.blood_sugar.BloodSugarExtKt$instance$2$1] */
    public static final BloodSugarExtKt$instance$2$1 instance_delegate$lambda$0() {
        return new BloodSugarManager() { // from class: com.xiaomi.fitness.blood_sugar.BloodSugarExtKt$instance$2$1
            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void bindDevice(String mac, kj2 bindCallback) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                Intrinsics.checkNotNullParameter(bindCallback, "bindCallback");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void connectDevice() {
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void disconnectDevice() {
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public void getAllUnSyncGlucose() {
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public String getAppId() {
                return "";
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public ThirdPartyDeviceInfo getBindDeviceInfo() {
                return new ThirdPartyDeviceInfo("", "", "");
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public BloodSugarDeviceApi getBloodSugarDeviceApi(DeviceInfo deviceInfo) {
                Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
                return new BloodSugarDeviceApi() { // from class: com.xiaomi.fitness.blood_sugar.BloodSugarExtKt$instance$2$1$getBloodSugarDeviceApi$1
                    private int appCapability;
                    private WearBinder binder;
                    private final Connection connection = new Connection() { // from class: com.xiaomi.fitness.blood_sugar.BloodSugarExtKt$instance$2$1$getBloodSugarDeviceApi$1$connection$1
                        @Override // com.xiaomi.wearable.connection.Connection
                        public void connect() {
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public void disconnect(boolean z) {
                            Connection.DefaultImpls.disconnect(this, z);
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public ConnectionCallback getCallback() {
                            return null;
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public boolean isConnect() {
                            return false;
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public boolean needKeepAlive() {
                            return false;
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public boolean needRetryConnect(int status) {
                            return false;
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public void onBluetoothClose() {
                            Connection.DefaultImpls.onBluetoothClose(this);
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public void onBluetoothOpen() {
                            Connection.DefaultImpls.onBluetoothOpen(this);
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public void setCallback(ConnectionCallback connectionCallback) {
                        }

                        @Override // com.xiaomi.wearable.connection.Connection
                        public void connect(boolean z, boolean z2, int i) {
                            Connection.DefaultImpls.connect(this, z, z2, i);
                        }
                    };
                    private boolean currentDevice;
                    private int deviceCapability;
                    public DeviceInfo deviceInfo;
                    private final Messenger messenger;
                    private final boolean specificModel;

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void destroy() {
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public int getAppCapability() {
                        return this.appCapability;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public WearBinder getBinder() {
                        return this.binder;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public Connection getConnection() {
                        return this.connection;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public boolean getCurrentDevice() {
                        return this.currentDevice;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public int getDeviceCapability() {
                        return this.deviceCapability;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public DeviceInfo getDeviceInfo() {
                        DeviceInfo deviceInfo2 = this.deviceInfo;
                        if (deviceInfo2 != null) {
                            return deviceInfo2;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("deviceInfo");
                        return null;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public Messenger getMessenger() {
                        return this.messenger;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public boolean getSpecificModel() {
                        return this.specificModel;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void init() {
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void onUpdate(DeviceInfo deviceInfo2) {
                        Intrinsics.checkNotNullParameter(deviceInfo2, "deviceInfo");
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void setAppCapability(int i) {
                        this.appCapability = i;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void setBinder(WearBinder wearBinder) {
                        this.binder = wearBinder;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void setCurrentDevice(boolean z) {
                        this.currentDevice = z;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void setDeviceCapability(int i) {
                        this.deviceCapability = i;
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void setDeviceCapabilityCallback(CapabilityCallback capabilityCallback) {
                        BloodSugarDeviceApi.DefaultImpls.setDeviceCapabilityCallback(this, capabilityCallback);
                    }

                    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
                    public void setDeviceInfo(DeviceInfo deviceInfo2) {
                        Intrinsics.checkNotNullParameter(deviceInfo2, "<set-?>");
                        this.deviceInfo = deviceInfo2;
                    }
                };
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public BloodSugarManager.DeviceTime getDeviceActiveTime() {
                return new BloodSugarManager.DeviceTime(0L, 0L);
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public void getGlucoseListAllByTimePeriod(long startTime, long endTime) {
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public String getModel() {
                return "";
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public String getThirdPartyAppId() {
                return "";
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public String getThirdPartyAppKey() {
                return "";
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public String getThirdPartyToken() {
                return "";
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public String getVerifyName() {
                return "";
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public void goBloodSugarDevice(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void init() {
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public boolean isConnected() {
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public boolean isLogin() {
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void login(String userKey, String token, IBloodSugarDevice.LoginCallback loginCallback) {
                Intrinsics.checkNotNullParameter(userKey, "userKey");
                Intrinsics.checkNotNullParameter(token, "token");
                Intrinsics.checkNotNullParameter(loginCallback, "loginCallback");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void logout() {
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public boolean needReconnect() {
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public void rebind(String mac) {
                Intrinsics.checkNotNullParameter(mac, "mac");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void setConnectListener(zd4 connectCallback) {
                Intrinsics.checkNotNullParameter(connectCallback, "connectCallback");
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public void setGlucoseCallback(BloodSugarManager.GlucoseCallback callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void setOtaCallback(IBloodSugarDevice.OTACallback callback) {
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public void setStepCallback(BloodSugarManager.StepCallback listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void setThirdPartyToken(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void unbindDevice(String mac, UnbindCallback unbindCallback) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                Intrinsics.checkNotNullParameter(unbindCallback, "unbindCallback");
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public void updateGlucoseUploadState(GlucoseValue data) {
                Intrinsics.checkNotNullParameter(data, "data");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice
            public void unbindDevice(String mac, UnbindCallback unbindCallback, boolean syncData) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                Intrinsics.checkNotNullParameter(unbindCallback, "unbindCallback");
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager
            public void updateGlucoseUploadState(List<GlucoseValue> list) {
                Intrinsics.checkNotNullParameter(list, "list");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.fitness.blood_sugar.BloodSugarExtKt$instance$5$1] */
    public static final BloodSugarExtKt$instance$5$1 instance_delegate$lambda$1() {
        return new BloodSugarRemindSettingManager() { // from class: com.xiaomi.fitness.blood_sugar.BloodSugarExtKt$instance$5$1
            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public Long expireInitDoneTime(DeviceTime deviceTime) {
                Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
                return 0L;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public Long expireOneDayTime(DeviceTime deviceTime) {
                Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
                return 0L;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public Long expireOneHourTime(DeviceTime deviceTime) {
                Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
                return 0L;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public Long expireTime(DeviceTime deviceTime) {
                Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
                return 0L;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public BloodSugarRemindSettingModel getBloodSugarRemindSettingFromLocal() {
                return new BloodSugarRemindSettingModel(false, false, 0, 0, 0, 0, 0.0d, 0.0d, 0, 511, null);
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public void goBloodSugarDeviceSettingsPage(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public boolean isDeviceInConnectTime(WearableDeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public boolean isDeviceInReactiveTime(WearableDeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public Boolean isDeviceInitDone(WearableDeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
                return Boolean.FALSE;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public boolean isDeviceTimeExpire(WearableDeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public boolean isDeviceTimeExpireOneDay(WearableDeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public boolean isDeviceTimeExpireOneHour(WearableDeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public Integer isDeviceToInitDoneTime(WearableDeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
                return 0;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public boolean isSugarDadaSyncDone(WearableDeviceModel deviceModel) {
                Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
                return false;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public void registerBloodSugarTimeChangeReceive(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public void unregisterBloodSugarTimeChangeReceive(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager
            public void updateBloodSugarRemindSettingToLocal(BloodSugarRemindSettingModel bloodSugarRemindSettingModel) {
                Intrinsics.checkNotNullParameter(bloodSugarRemindSettingModel, "bloodSugarRemindSettingModel");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.fitness.blood_sugar.BloodSugarExtKt$instance$8$1] */
    public static final BloodSugarExtKt$instance$8$1 instance_delegate$lambda$2() {
        return new BloodSugarManagerWrapper() { // from class: com.xiaomi.fitness.blood_sugar.BloodSugarExtKt$instance$8$1
            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManagerWrapper
            public DeviceTime getDeviceTime() {
                return new DeviceTime(0L, 0L);
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManagerWrapper
            public int getHistoryDeviceSize() {
                return 0;
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManagerWrapper
            public void setOtaProgressListener(mvc listener) {
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManagerWrapper
            public void setStepCallback(nzc listener) {
            }
        };
    }

    public static final boolean isBloodSugar(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return DeviceModelExtKt.isBloodSugar(wearableDeviceModel.getProduct());
    }

    public static final void launchBindNfc(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        kb.c().a(PATH_BIND_SUGAR_NFC).navigation(context);
    }

    public static final void launchBloodSugarBind(@NotNull Context context, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        kb.c().a(PATH_BIND_BLOOD_SUGAR).withInt("key_product_info", i).withString("URL", getBloodSugarGuideUrl()).withString("mac", str).withBoolean("reactive", false).withString("did", null).navigation(context);
    }

    public static /* synthetic */ void launchBloodSugarBind$default(Context context, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        launchBloodSugarBind(context, i, str);
    }

    public static final void launchBloodSugarGuide(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        kb.c().a(PATH_GUIDE_BLOOD_SUGAR).navigation(context);
    }

    public static final void launchBloodSugarReActive(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        kb.c().a(PATH_BIND_BLOOD_SUGAR).withString("URL", getBloodSugarNFCUrl()).withString("mac", str2).withBoolean("reactive", true).withString("did", str).navigation(context);
    }

    public static final void setGlucoseCallback(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull BloodSugarManager.GlucoseCallback callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!isBloodSugar(wearableDeviceModel)) {
            throw new IllegalStateException("not blood sugar device");
        }
        getInstance(BloodSugarManager.INSTANCE).setGlucoseCallback(callback);
    }

    @NotNull
    public static final BloodSugarRemindSettingManager getInstance(@NotNull BloodSugarRemindSettingManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (BloodSugarRemindSettingManager) instance$delegate$1.getValue();
    }

    @NotNull
    public static final BloodSugarManagerWrapper getInstance(@NotNull BloodSugarManagerWrapper.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (BloodSugarManagerWrapper) instance$delegate$2.getValue();
    }
}
