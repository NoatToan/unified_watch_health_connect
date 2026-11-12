package com.xiaomi.fitness.common.extension;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.curse.data.CurseMixedRecord;
import com.xiaomi.fitness.health.curse.data.CurseNotifyType;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import defpackage.jv9;
import defpackage.s7r;
import defpackage.ur9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a*\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t\u001a\u0012\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003\u001a,\u0010\u0010\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0004\u001a$\u0010\u0013\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a\u001a\u0010\u0014\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t\u001a\u0014\u0010\u0018\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0014\u0010\u001a\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"TAG", "", "isSupportCurse", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "curseNotifyEnable", "", "enable", "inDays", "", "ovumDays", "pregnancyDays", "curseSetTotalRecord", "data", "", "curseSetPredict", "curseBleNotifyEnable", "getHuamiDevice", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "curseHuamiNotifyEnable", "curseSetNotify", "type", "Lcom/xiaomi/fitness/health/curse/data/CurseNotifyType;", "days", "curseSetBleTotalRecord", "curseSetHuamiTotalRecord", "curseSetBlePredict", "curseSetHuamiPredict", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CurseDeviceSyncExtKt {

    @NotNull
    public static final String TAG = "CurseDeviceSync";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurseNotifyType.values().length];
            try {
                iArr[CurseNotifyType.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurseNotifyType.OVUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void curseBleNotifyEnable(WearableDeviceModel wearableDeviceModel, boolean z, int i, int i2, int i3) {
        Logger.i(TAG, "curseBleNotifyEnable enable " + z + ";inDays " + i + ";ovumDays " + i2 + ";pregnancyDays " + i3);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 40;
        jv9.b.a aVar = new jv9.b.a();
        if (z) {
            jv9.b bVar = new jv9.b();
            bVar.c = 1;
            bVar.d = i;
            jv9.b bVar2 = new jv9.b();
            bVar2.c = 2;
            bVar2.d = i2;
            jv9.b bVar3 = new jv9.b();
            bVar3.c = 3;
            bVar3.d = i3;
            aVar.c = new jv9.b[]{bVar, bVar2, bVar3};
        } else {
            aVar.c = null;
        }
        ur9 ur9Var = new ur9();
        ur9Var.A0(aVar);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt.curseBleNotifyEnable.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(CurseDeviceSyncExtKt.TAG, "curseBleNotify error:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(CurseDeviceSyncExtKt.TAG, "curseBleNotify success,ret = " + (result != null ? Integer.valueOf(result.getCode()) : null));
            }
        }, 0, 16, (Object) null);
    }

    private static final void curseHuamiNotifyEnable(WearableDeviceModel wearableDeviceModel, boolean z, int i, int i2) {
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        boolean zSwitchMenstruationDeviceNotify = huamiDevice != null ? huamiDevice.switchMenstruationDeviceNotify(z) : false;
        if (zSwitchMenstruationDeviceNotify) {
            curseSetNotify(wearableDeviceModel, CurseNotifyType.IN, i);
            curseSetNotify(wearableDeviceModel, CurseNotifyType.OVUM, i2);
        }
        Logger.i(TAG, "curseHuamiNotifyEnable: enable = " + z + "; inDays = " + i + "; ovumDays = " + i2 + "; ret = " + zSwitchMenstruationDeviceNotify);
    }

    public static final void curseNotifyEnable(@NotNull WearableDeviceModel wearableDeviceModel, boolean z, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            curseHuamiNotifyEnable(wearableDeviceModel, z, i, i2);
        } else {
            curseBleNotifyEnable(wearableDeviceModel, z, i, i2, i3);
        }
    }

    private static final void curseSetBlePredict(WearableDeviceModel wearableDeviceModel, boolean z) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 39;
        ur9 ur9Var = new ur9();
        ur9Var.j0(z);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt.curseSetBlePredict.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(CurseDeviceSyncExtKt.TAG, "curseSetBlePredict error " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(CurseDeviceSyncExtKt.TAG, "curseSetBlePredict success " + result);
            }
        }, 0, 16, (Object) null);
    }

    private static final void curseSetBleTotalRecord(WearableDeviceModel wearableDeviceModel, Object obj) {
        Logger.i(TAG, "curseSetBleTotalRecord");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.health.curse.data.CurseMixedRecord");
        jv9 protoRecord = ((CurseMixedRecord) obj).getProtoRecord();
        if (protoRecord == null) {
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 38;
        ur9 ur9Var = new ur9();
        ur9Var.V0(protoRecord);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt.curseSetBleTotalRecord.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(CurseDeviceSyncExtKt.TAG, "curseSetBleTotalRecord error :" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(CurseDeviceSyncExtKt.TAG, "curseSetBleTotalRecord success :" + result);
            }
        }, 0, 16, (Object) null);
    }

    private static final void curseSetHuamiPredict(WearableDeviceModel wearableDeviceModel, boolean z) {
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            huamiDevice.switchSmartPredict(z);
        }
    }

    private static final void curseSetHuamiTotalRecord(WearableDeviceModel wearableDeviceModel, Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.health.curse.data.CurseMixedRecord");
        MenstruationTotalRecord hmRecord = ((CurseMixedRecord) obj).getHmRecord();
        if (hmRecord != null) {
            HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
            Logger.i(TAG, "curseSetHuamiTotalRecord result " + (huamiDevice != null ? huamiDevice.setMenstruationTotalRecord(hmRecord) : false));
        }
    }

    public static final void curseSetNotify(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull CurseNotifyType type, int i) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Logger.i(TAG, "curseSetNotify type is " + type + ", days is " + i + ",isHuaMi " + DeviceModelExtKt.isHuaMi(wearableDeviceModel));
        int i2 = 1;
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            if (type == CurseNotifyType.EASY_PREGNANCY) {
                return;
            }
            Boolean boolValueOf = null;
            if (type == CurseNotifyType.IN) {
                HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
                if (huamiDevice != null) {
                    boolValueOf = Boolean.valueOf(huamiDevice.setMenstruationNotify(true, i));
                }
            } else {
                HuamiApiCaller huamiDevice2 = getHuamiDevice(wearableDeviceModel);
                if (huamiDevice2 != null) {
                    boolValueOf = Boolean.valueOf(huamiDevice2.setMenstruationOvulation(true, i));
                }
            }
            Logger.i(TAG, "curseSetNotify[huami] device ret = " + boolValueOf);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 40;
        ur9 ur9Var = new ur9();
        jv9.b.a aVar = new jv9.b.a();
        jv9.b bVar = new jv9.b();
        int i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i3 != 1) {
            i2 = 2;
            if (i3 != 2) {
                i2 = 3;
            }
        }
        bVar.c = i2;
        bVar.d = i;
        aVar.c = new jv9.b[]{bVar};
        ur9Var.A0(aVar);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt.curseSetNotify.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type2, int code) {
                Logger.e(CurseDeviceSyncExtKt.TAG, "curseSetNotify[ble] error: type = " + type2 + "; code = " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type2, SyncResult result) {
                Logger.i(CurseDeviceSyncExtKt.TAG, "curseSetNotify[ble] success: type = " + type2 + "; code = " + (result != null ? Integer.valueOf(result.getCode()) : null));
            }
        }, 0, 16, (Object) null);
    }

    public static final void curseSetPredict(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            curseSetHuamiPredict(wearableDeviceModel, z);
        } else {
            curseSetBlePredict(wearableDeviceModel, z);
        }
    }

    public static final void curseSetTotalRecord(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            curseSetHuamiTotalRecord(wearableDeviceModel, data);
        } else {
            curseSetBleTotalRecord(wearableDeviceModel, data);
        }
    }

    @Nullable
    public static final HuamiApiCaller getHuamiDevice(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        }
        return null;
    }

    public static final boolean isSupportCurse(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "curse");
    }
}
