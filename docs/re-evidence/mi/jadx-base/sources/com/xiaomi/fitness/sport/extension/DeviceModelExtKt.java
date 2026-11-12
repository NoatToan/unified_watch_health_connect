package com.xiaomi.fitness.sport.extension;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport_manager_export.listener.SportStateSyncCallback;
import com.xiaomi.hm.health.bt.sdk.ISportHrCallback;
import defpackage.eu6;
import defpackage.gs9;
import defpackage.ju9;
import defpackage.s7r;
import defpackage.txo;
import defpackage.ur9;
import defpackage.v64;
import defpackage.vxo;
import defpackage.z7r;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a%\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0011\u001a\u00020\r*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\r*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u001d\u001a\u00020\r*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0015\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010.\u001a%\u00101\u001a\u00020\r*\u00020\u00002\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0/¢\u0006\u0004\b1\u00102\u001a-\u00104\u001a\u00020\r*\u00020\u00002\u0006\u00103\u001a\u00020)2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0/¢\u0006\u0004\b4\u00105\u001a\u0011\u00106\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b6\u0010\u0003\u001a\u0011\u00107\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b7\u0010\u0003\"\u0015\u00108\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b8\u0010\u0003¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "isSupportAgreementDevices", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "isSupportChildLock", "isSupportSpeedLimit", "isSupportDeviceDebugMode", "isSupportIntelligentLinkage", "isSupportInsuranceIntroduction", "Leu6;", "", "Lgs9;", "callback", "", "getGYMSettings", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Leu6;)V", "list", "setGYMSettings", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;[Lgs9;Leu6;)V", "Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;", "huamiCallback", "startDeviceHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;)V", "stopDeviceHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "did", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportStateSyncCallback;", "Lz7r;", "syncDeviceSportStatus", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/listener/SportStateSyncCallback;)V", "Ls7r;", "wearPacket", "handleWearSportStatus", "(Ls7r;)Lz7r;", "Lju9;", "sportStatus", "convertProtoToSportStatus", "(Lju9;)Lz7r;", "Lv64;", "protoTimeZone", "", "convertToDataIdTimeZone", "(Lv64;)I", "protoSportType", "convertProtoToSportType", "(I)I", "Lkotlin/Function1;", "block", "getDeviceWearMode", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function1;)V", "wearMode", "setDeviceWearMode", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ILkotlin/jvm/functions/Function1;)V", "supportJustDance", "supportTrainingPlan", "isAccessoryConnected", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class DeviceModelExtKt {
    @NotNull
    public static final z7r convertProtoToSportStatus(@NotNull ju9 sportStatus) {
        Intrinsics.checkNotNullParameter(sportStatus, "sportStatus");
        z7r z7rVar = new z7r();
        z7rVar.f40996a = sportStatus.e;
        z7rVar.f40997b = convertToDataIdTimeZone(sportStatus.f);
        z7rVar.c = convertProtoToSportType(sportStatus.c);
        z7rVar.d = sportStatus.h;
        z7rVar.e = sportStatus.g;
        z7rVar.f = sportStatus.j;
        z7rVar.g = sportStatus.f23136k;
        z7rVar.h = sportStatus.i;
        return z7rVar;
    }

    private static final int convertProtoToSportType(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                return 0;
        }
    }

    private static final int convertToDataIdTimeZone(v64 v64Var) {
        if (v64Var == null) {
            return 0;
        }
        if (TextUtils.isEmpty(v64Var.e)) {
            return v64Var.d + v64Var.c;
        }
        TimeZone timeZone = TimeZone.getTimeZone(v64Var.e);
        return ((int) TimeUnit.MILLISECONDS.toMinutes(timeZone.getDSTSavings() + timeZone.getRawOffset())) / 15;
    }

    public static final void getDeviceWearMode(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull final Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Logger.i("CommonSportModel", "mode: " + wearableDeviceModel.getDeviceInfo().getModel());
        Product product = wearableDeviceModel.getDeviceInfo().getProduct();
        if (product != null && com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isM61(product)) {
            block.invoke2(0);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 14;
        vxo.i iVar = new vxo.i();
        iVar.c = 4;
        txo txoVar = new txo();
        txoVar.n0(iVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.extension.DeviceModelExtKt.getDeviceWearMode.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("CommonSportModel", "getDeviceWearMode onError: " + code);
                block.invoke2(0);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                txo txoVarE;
                vxo vxoVarI;
                vxo.j jVar;
                Integer numValueOf = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (vxoVarI = txoVarE.I()) == null || (jVar = vxoVarI.e) == null) ? null : Integer.valueOf(jVar.c);
                SportPreference.INSTANCE.setLAUNCH_SPORT_PAGE_GET_WEAR_MODE(numValueOf != null ? numValueOf.intValue() : 0);
                Logger.i("CommonSportModel", "getDeviceWearMode success: " + numValueOf);
                block.invoke2(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
            }
        }, 0, 8, null);
    }

    public static final void getGYMSettings(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull final eu6<gs9[]> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 67;
        gs9.a aVar = new gs9.a();
        aVar.c = gs9.n();
        ur9 ur9Var = new ur9();
        ur9Var.n0(aVar);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.extension.DeviceModelExtKt.getGYMSettings.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("getGYMSettings error " + code, new Object[0]);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                ur9 ur9VarU;
                gs9.a aVarY;
                if (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null || (aVarY = ur9VarU.y()) == null) {
                    onError(did, type, -1);
                    return;
                }
                eu6<gs9[]> eu6Var = callback;
                Logger.d("getGYMSettings success", new Object[0]);
                eu6Var.onResult(aVarY.c);
            }
        }, 0, 16, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z7r handleWearSportStatus(s7r s7rVar) {
        if (s7rVar == null) {
            FitnessLogUtils.w("CommonSportModel", "handleWearSportStatus -- wearPacket is null");
            return null;
        }
        if (s7rVar.e != 8) {
            FitnessLogUtils.w("CommonSportModel", "handleWearSportStatus -- not fitness response type");
            return null;
        }
        ur9 ur9VarU = s7rVar.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w("CommonSportModel", "handleWearSportStatus -- no fitness proto");
            return null;
        }
        ju9 ju9VarV = ur9VarU.V();
        if (ju9VarV == null) {
            FitnessLogUtils.w("CommonSportModel", "no fitness sportStatus proto");
            return null;
        }
        z7r z7rVarConvertProtoToSportStatus = convertProtoToSportStatus(ju9VarV);
        FitnessLogUtils.i("CommonSportModel", "WearSportStatus: " + z7rVarConvertProtoToSportStatus);
        return z7rVarConvertProtoToSportStatus;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c A[ORIG_RETURN, RETURN] */
    public static final boolean isAccessoryConnected(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        for (Object obj : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels()) {
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) obj;
            if (Intrinsics.areEqual(wearableDeviceModel2.getDid(), wearableDeviceModel.getDid()) && wearableDeviceModel2.getIsDeviceConnected()) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static final boolean isSupportAgreementDevices(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isSupportAgreementLocalDevice(wearableDeviceModel);
    }

    public static final boolean isSupportChildLock(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.CHILD_LOCK);
    }

    public static final boolean isSupportDeviceDebugMode(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.DEVICE_IN_DEBUG_MODE);
    }

    public static final boolean isSupportInsuranceIntroduction(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.INSURANCE_INTRODUCTION);
    }

    public static final boolean isSupportIntelligentLinkage(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.INTELLIGENT_LINKAGE);
    }

    public static final boolean isSupportSpeedLimit(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SPEED_UP_LIMIT);
    }

    public static final void setDeviceWearMode(@NotNull WearableDeviceModel wearableDeviceModel, final int i, @NotNull final Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 15;
        vxo.j jVar = new vxo.j();
        jVar.c = i;
        vxo vxoVar = new vxo();
        vxoVar.e = jVar;
        txo txoVar = new txo();
        txoVar.m0(vxoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.extension.DeviceModelExtKt$setDeviceWearMode$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                block.invoke2(Integer.valueOf(code));
                Logger.i("CommonSportModel", "setDeviceWearMode error ,did:" + did + " , mode:" + i);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                block.invoke2(Integer.valueOf(result != null ? result.getCode() : -1));
                Logger.i("CommonSportModel", "setDeviceWearMode success,did:" + did + " , mode:" + i);
            }
        }, 0, 8, null);
    }

    public static final void setGYMSettings(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull gs9[] list, @NotNull final eu6<Boolean> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 68;
        gs9.a aVar = new gs9.a();
        aVar.c = list;
        ur9 ur9Var = new ur9();
        ur9Var.n0(aVar);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.extension.DeviceModelExtKt.setGYMSettings.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("setGYMSettings error:" + code, new Object[0]);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.d("setGYMSettings success:" + result, new Object[0]);
                callback.onResult(Boolean.TRUE);
            }
        }, 0, 16, (Object) null);
    }

    public static final void startDeviceHr(@NotNull WearableDeviceModel wearableDeviceModel, @Nullable ISportHrCallback iSportHrCallback) {
        String mac;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (wearableDeviceModel.getIsDeviceConnected()) {
            if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) || iSportHrCallback == null) {
                FitnessLogUtils.i("CommonSportModel", "ble registerDeviceHr");
                s7r s7rVar = new s7r();
                s7rVar.e = 8;
                s7rVar.f = 45;
                DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.extension.DeviceModelExtKt.startDeviceHr.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        FitnessLogUtils.i("CommonSportModel", "ble registerDeviceHr error , did : " + did + " , type : " + type + " , code : " + code);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        FitnessLogUtils.i("CommonSportModel", "ble registerDeviceHr success");
                    }
                }, 0, 8, null);
                return;
            }
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel2 == null || (mac = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel2)) == null) {
                mac = "";
            }
            HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
            if (huaMiApiCaller != null) {
                huaMiApiCaller.startRealtimeMeasureHr(iSportHrCallback);
            }
        }
    }

    public static /* synthetic */ void startDeviceHr$default(WearableDeviceModel wearableDeviceModel, ISportHrCallback iSportHrCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            iSportHrCallback = null;
        }
        startDeviceHr(wearableDeviceModel, iSportHrCallback);
    }

    public static final void stopDeviceHr(@NotNull WearableDeviceModel wearableDeviceModel) {
        String mac;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            FitnessLogUtils.i("CommonSportModel", "unRegisterDeviceHr");
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 46;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
            return;
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel2 == null || (mac = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel2)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller != null) {
            huaMiApiCaller.stopRealtimeMeasureHr();
        }
    }

    public static final boolean supportJustDance(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(wearableDeviceModel.getDid()) & 2) == 2;
    }

    public static final boolean supportTrainingPlan(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(wearableDeviceModel.getDid()) & 16) == 16;
    }

    public static final void syncDeviceSportStatus(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String did, @Nullable final SportStateSyncCallback<z7r> sportStateSyncCallback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 29;
        s7rVar.S(new ur9());
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.extension.DeviceModelExtKt.syncDeviceSportStatus.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                SportStateSyncCallback<z7r> sportStateSyncCallback2 = sportStateSyncCallback;
                if (sportStateSyncCallback2 != null) {
                    sportStateSyncCallback2.onError(code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                SportStateSyncCallback<z7r> sportStateSyncCallback2;
                z7r z7rVarHandleWearSportStatus = DeviceModelExtKt.handleWearSportStatus(result != null ? result.getPacket() : null);
                if ((z7rVarHandleWearSportStatus != null && z7rVarHandleWearSportStatus.h) || z7rVarHandleWearSportStatus == null || (sportStateSyncCallback2 = sportStateSyncCallback) == null) {
                    return;
                }
                sportStateSyncCallback2.onResult(z7rVarHandleWearSportStatus);
            }
        }, 0, 16, (Object) null);
    }
}
