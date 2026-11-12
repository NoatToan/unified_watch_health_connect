package com.xiaomi.fitness.device.manager.provider;

import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vwo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "getBattery", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "did", "Lvwo;", "deviceStatus", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "updateDeviceStatus", "(Ljava/lang/String;Lvwo;)Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "TAG", "Ljava/lang/String;", "BATTERY_UPDATE_INTERVAL", "I", "", "batteryUpdateTime", "J", "getBatteryUpdateTime", "()J", "setBatteryUpdateTime", "(J)V", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class DeviceModelExtKt {
    public static final int BATTERY_UPDATE_INTERVAL = 1800000;

    @NotNull
    private static final String TAG = "DeviceModelExt";
    private static long batteryUpdateTime;

    @Nullable
    public static final Object getBattery(@NotNull final WearableDeviceModel wearableDeviceModel, @NotNull Continuation<? super Integer> continuation) {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(TAG, "getBattery() called");
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - batteryUpdateTime > SyncEngine.SYNC_WEATHER_DURATION;
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(TAG, "getBattery() called update " + z);
        if (!z && wearableDeviceModel.getDeviceInfo().getBattery() != -1) {
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(TAG, "getBattery no update " + wearableDeviceModel.getDeviceInfo().getBattery());
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(TAG, "time:" + jCurrentTimeMillis + ",batteryUpdateTime:" + batteryUpdateTime);
            return Boxing.boxInt(wearableDeviceModel.getDeviceInfo().getBattery());
        }
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            DeviceBatteryInfo batteryLevel = huaMiApiCaller != null ? huaMiApiCaller.getBatteryLevel() : null;
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("sync hua mi battery success, battery=" + (batteryLevel != null ? Boxing.boxInt(batteryLevel.getLevel()) : null));
            if (batteryLevel == null) {
                Result.Companion companion = Result.Companion;
                safeContinuation.resumeWith(Result.m886constructorimpl(Boxing.boxInt(0)));
            } else {
                batteryUpdateTime = System.currentTimeMillis();
                Result.Companion companion2 = Result.Companion;
                safeContinuation.resumeWith(Result.m886constructorimpl(Boxing.boxInt(batteryLevel.getLevel())));
            }
        } else {
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 1;
            Boxing.boxInt(DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.manager.provider.DeviceModelExtKt$getBattery$2$1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("DeviceModelExt", "getBattery onOnError: " + wearableDeviceModel.getDeviceInfo().getBattery());
                    try {
                        Continuation<Integer> continuation2 = safeContinuation;
                        Result.Companion companion3 = Result.Companion;
                        continuation2.resumeWith(Result.m886constructorimpl(0));
                    } catch (Exception unused) {
                    }
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    vwo.a aVar;
                    s7r packet;
                    txo txoVarE;
                    vwo vwoVarS = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.s();
                    int battery = (vwoVarS == null || (aVar = vwoVarS.c) == null) ? wearableDeviceModel.getDeviceInfo().getBattery() : aVar.c;
                    wearableDeviceModel.getDeviceInfo().setBattery(battery);
                    Intrinsics.checkNotNull(did);
                    DeviceModelExtKt.updateDeviceStatus(did, vwoVarS);
                    DeviceModelExtKt.setBatteryUpdateTime(System.currentTimeMillis());
                    com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("DeviceModelExt", "getBattery onSuccess: " + battery);
                    Continuation<Integer> continuation2 = safeContinuation;
                    Result.Companion companion3 = Result.Companion;
                    continuation2.resumeWith(Result.m886constructorimpl(Integer.valueOf(battery)));
                }
            }, 0, 16, (Object) null));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final long getBatteryUpdateTime() {
        return batteryUpdateTime;
    }

    public static final void setBatteryUpdateTime(long j) {
        batteryUpdateTime = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final BatteryInfo updateDeviceStatus(String str, vwo vwoVar) {
        boolean z;
        vwo.a aVar;
        vwo.a.C1129a c1129a;
        vwo.a aVar2;
        vwo.a aVar3;
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("deviceBatteryStatus = " + vwoVar);
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        Intrinsics.checkNotNull(str);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(str);
        int i = (vwoVar == null || (aVar3 = vwoVar.c) == null) ? -1 : aVar3.c;
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("sync battery success, battery=" + i);
        vwo.a.C1129a c1129a2 = 0;
        c1129a2 = 0;
        if (wearableDeviceModel == null) {
            return null;
        }
        BatteryInfo batteryInfo = new BatteryInfo();
        batteryInfo.setBattery(i);
        batteryInfo.setChargeStatus((vwoVar == null || (aVar2 = vwoVar.c) == null) ? 0 : aVar2.d);
        if (vwoVar != null && (aVar = vwoVar.c) != null) {
            c1129a = aVar.e;
        }
        if (c1129a2 != 0) {
            BatteryInfo.ChargeInfo chargeInfo = new BatteryInfo.ChargeInfo();
            chargeInfo.setState(c1129a2.c);
            chargeInfo.setTimestamp(c1129a2.d);
            batteryInfo.setChargeInfo(chargeInfo);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(chargeInfo.getTimestamp() * ((long) 1000));
            batteryInfo.setLastCharge(calendar);
            if (batteryInfo.getChargeStatus() == 1) {
                c1129a2 = c1129a;
                z = true;
            } else {
                c1129a2 = c1129a;
                z = false;
            }
            batteryInfo.setCharging(z);
            batteryInfo.setChargeFull(c1129a2.c == 3);
        } else {
            c1129a2 = c1129a;
            batteryInfo.setChargeInfo((BatteryInfo.ChargeInfo) c1129a2);
        }
        WearableDeviceInfo deviceInfo = wearableDeviceModel.getDeviceInfo();
        deviceInfo.setBatteryInfo(batteryInfo);
        wearableDeviceModel.setDeviceInfo(deviceInfo);
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("updateDeviceBatteryStatus = " + wearableDeviceModel.getDeviceInfo().getBatteryInfo());
        return batteryInfo;
    }
}
