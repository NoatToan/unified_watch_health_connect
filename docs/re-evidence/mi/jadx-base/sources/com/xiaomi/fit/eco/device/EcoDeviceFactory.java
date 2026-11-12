package com.xiaomi.fit.eco.device;

import com.xiaomi.eco.api.p;
import com.xiaomi.fit.eco.device.bind.EcoBleDeviceBinder;
import com.xiaomi.fit.eco.device.bind.EcoLocalDeviceBinder;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceInfoExtKt;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fit.eco.device.extensions.EcoProductExtKt;
import com.xiaomi.fit.eco.device.model.EcoBluetoothDeviceModel;
import com.xiaomi.fit.eco.device.model.EcoLocalSportDeviceModel;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder;
import defpackage.ag7;
import defpackage.asc;
import defpackage.ms7;
import defpackage.si7;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012J9\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0012J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/fit/eco/device/EcoDeviceFactory;", "", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "device", "Lms7;", "createDeviceModel", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)Lms7;", "deviceInfo", "newDeviceModel", "", "key", "Lasc;", "getEcoLocalApiCall", "(Ljava/lang/String;)Lasc;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceBinder;", "getDeviceBinder", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceBinder;", "mac", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceBinder;", "did", "", "isDeviceOwner", "Lcom/xiaomi/eco/api/p$b;", "connectListener", "getEcoApiCall", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;ZLcom/xiaomi/eco/api/p$b;)Lasc;", "removeDeviceBinder", "", "destroyEcoApiCall", "(Ljava/lang/String;)V", "removeEcoApiCallMap", "Ljava/util/HashMap;", "mEcoDeviceBinders", "Ljava/util/HashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lag7;", "mEcoLocalApiCallMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoDeviceFactory {

    @NotNull
    public static final EcoDeviceFactory INSTANCE = new EcoDeviceFactory();

    @NotNull
    private static final HashMap<String, EcoDeviceBinder> mEcoDeviceBinders = new HashMap<>();

    @NotNull
    private static final ConcurrentHashMap<String, ag7> mEcoLocalApiCallMap = new ConcurrentHashMap<>();

    private EcoDeviceFactory() {
    }

    @JvmStatic
    @NotNull
    public static final ms7 createDeviceModel(@NotNull EcoDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        ms7 ms7VarNewDeviceModel = INSTANCE.newDeviceModel(device);
        ms7VarNewDeviceModel.initByModelDevice(device);
        return ms7VarNewDeviceModel;
    }

    public static /* synthetic */ asc getEcoApiCall$default(EcoDeviceFactory ecoDeviceFactory, String str, String str2, EcoDeviceInfo ecoDeviceInfo, boolean z, p.b bVar, int i, Object obj) {
        if ((i & 16) != 0) {
            bVar = null;
        }
        return ecoDeviceFactory.getEcoApiCall(str, str2, ecoDeviceInfo, z, bVar);
    }

    private final asc getEcoLocalApiCall(String key) {
        return mEcoLocalApiCallMap.get(key);
    }

    private final ms7 newDeviceModel(EcoDeviceInfo deviceInfo) {
        Product product = deviceInfo.getProduct();
        Intrinsics.checkNotNull(product);
        if (EcoProductExtKt.isLocalSportMachine(product)) {
            EcoDeviceModelExtKt.logi("new local sport machine");
            return new EcoLocalSportDeviceModel(deviceInfo);
        }
        EcoDeviceModelExtKt.logi("new bluetooth device model");
        return new EcoBluetoothDeviceModel(deviceInfo);
    }

    public final void destroyEcoApiCall(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        asc ecoLocalApiCall = getEcoLocalApiCall(key);
        if (ecoLocalApiCall != null) {
            ecoLocalApiCall.e(null);
            ecoLocalApiCall.destroy();
        }
        mEcoLocalApiCallMap.remove(key);
    }

    @NotNull
    public final EcoDeviceBinder getDeviceBinder(@NotNull EcoDeviceInfo deviceInfo) {
        EcoDeviceBinder ecoBleDeviceBinder;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        HashMap<String, EcoDeviceBinder> map = mEcoDeviceBinders;
        String mac = deviceInfo.getMac();
        Intrinsics.checkNotNull(mac);
        EcoDeviceBinder ecoDeviceBinder = map.get(mac);
        if (ecoDeviceBinder != null) {
            return ecoDeviceBinder;
        }
        Product product = deviceInfo.getProduct();
        Intrinsics.checkNotNull(product);
        if (EcoProductExtKt.isLocalSportMachine(product)) {
            EcoDeviceModelExtKt.logi("new local sport machine binder");
            ecoBleDeviceBinder = new EcoLocalDeviceBinder(deviceInfo);
        } else {
            EcoDeviceModelExtKt.logi("new eco ble binder");
            ecoBleDeviceBinder = new EcoBleDeviceBinder(deviceInfo);
        }
        EcoDeviceModelExtKt.logi("DeviceBinder is " + ecoBleDeviceBinder);
        String mac2 = deviceInfo.getMac();
        Intrinsics.checkNotNull(mac2);
        map.put(mac2, ecoBleDeviceBinder);
        return ecoBleDeviceBinder;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final synchronized asc getEcoApiCall(@NotNull String key, @NotNull String did, @NotNull EcoDeviceInfo deviceInfo, boolean isDeviceOwner, @Nullable p.b connectListener) {
        asc ecoLocalApiCall;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            EcoDeviceModelExtKt.logi("getEcoApiCall getOrInit() called with: key = [" + key + "], did = [" + did + "], isDeviceOwner = [" + isDeviceOwner + "], product = [" + deviceInfo.device + "] ");
            ecoLocalApiCall = getEcoLocalApiCall(key);
            StringBuilder sb = new StringBuilder();
            sb.append("getEcoApiCall localApiCall  ");
            sb.append(ecoLocalApiCall);
            EcoDeviceModelExtKt.logi(sb.toString());
            if (ecoLocalApiCall == null || ((si7) ecoLocalApiCall).E() == null || ((si7) ecoLocalApiCall).E().getConnection() == null) {
                EcoDevice ecoDevice = (EcoDevice) deviceInfo.device;
                if (ecoDevice != null) {
                    ecoDevice.setMac(key);
                }
                EcoDevice ecoDevice2 = (EcoDevice) deviceInfo.device;
                if (ecoDevice2 != null) {
                    ecoDevice2.setDid(did);
                }
                ecoLocalApiCall = new si7(key, did, isDeviceOwner, EcoDeviceInfoExtKt.convertEcoConnectDevice(deviceInfo), connectListener, EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).getDataHandler(did));
                EcoDeviceModelExtKt.logi("getEcoApiCall create localApiCall  " + ecoLocalApiCall);
                mEcoLocalApiCallMap.put(key, (ag7) ecoLocalApiCall);
            } else {
                EcoDeviceModelExtKt.logi("getEcoApiCall user cache localApiCall  " + ecoLocalApiCall);
                ((si7) ecoLocalApiCall).f(connectListener);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ecoLocalApiCall;
    }

    @Nullable
    public final EcoDeviceBinder removeDeviceBinder(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return mEcoDeviceBinders.remove(mac);
    }

    public final void removeEcoApiCallMap(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        mEcoLocalApiCallMap.remove(key);
    }

    @Nullable
    public final EcoDeviceBinder getDeviceBinder(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return mEcoDeviceBinders.get(mac);
    }
}
