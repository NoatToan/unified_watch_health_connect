package com.xiaomi.fitness.sport_eco_manager.extension;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.bt.sdk.ISportHrCallback;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.a8r;
import defpackage.bsc;
import defpackage.cu9;
import defpackage.eu9;
import defpackage.fs9;
import defpackage.ir9;
import defpackage.j7r;
import defpackage.ku9;
import defpackage.psc;
import defpackage.sr9;
import defpackage.u7r;
import defpackage.uv9;
import defpackage.vr9;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000e\u001a#\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u0016¢\u0006\u0004\b\u0015\u0010\u0017\u001a)\u0010\u001c\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!\u001a\u001b\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001d\u0010)\u001a\u00020\u0005*\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010+\u001a\u00020\u0005*\u00020&¢\u0006\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u00100\"#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0001018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\" \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", DailyRecordKey.sportType, "Lj7r;", "callback", "", "isSupportLaunchSport", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;ILj7r;)V", "", "Lfs9;", "gymSettingsList", "Lbsc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "locks", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;[Lfs9;Lbsc;)V", "Lir9;", "deviceFault", "ecoDeviceFault", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Lir9;Lbsc;)V", "ecoGymSetting", "Lsr9;", "ftpState", "Lpsc;", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Lsr9;Lpsc;)V", "", "did", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportStateSyncCallback;", "La8r;", "syncDeviceSportStatus", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Ljava/lang/String;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportStateSyncCallback;)V", "deviceModel", "sportVersion", "sendPhoneSportPreRequest", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;IILj7r;)V", "Lu7r;", "wearPacket", "handleWearSportStatus", "(Lu7r;)La8r;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;", "huamiCallback", "startDeviceHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;)V", "stopDeviceHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "TAG", "Ljava/lang/String;", "retryCount", "I", "Ljava/util/HashMap;", "curDeviceRetry", "Ljava/util/HashMap;", "getCurDeviceRetry", "()Ljava/util/HashMap;", "hashMap", "sport-eco-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceModelExt.kt\ncom/xiaomi/fitness/sport_eco_manager/extension/DeviceModelExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,269:1\n13402#2,2:270\n13402#2,2:272\n*S KotlinDebug\n*F\n+ 1 DeviceModelExt.kt\ncom/xiaomi/fitness/sport_eco_manager/extension/DeviceModelExtKt\n*L\n74#1:270,2\n109#1:272,2\n*E\n"})
public final class DeviceModelExtKt {

    @NotNull
    public static final String TAG = "SportManager_DeviceModelExt";

    @NotNull
    private static final HashMap<String, Integer> curDeviceRetry = new HashMap<>();

    @NotNull
    private static final HashMap<String, Integer> hashMap = new HashMap<>();
    public static final int retryCount = 3;

    public static final void ecoDeviceFault(@NotNull EcoDeviceModel ecoDeviceModel, @Nullable ir9 ir9Var, @NotNull bsc listener) throws RemoteException {
        int i;
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (ir9Var != null && (i = ir9Var.c) > 0) {
            listener.ecoDeviceFault(i);
        }
    }

    public static final void ecoGymSetting(@NotNull EcoDeviceModel ecoDeviceModel, @Nullable fs9[] fs9VarArr, @NotNull bsc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (fs9VarArr == null) {
            return;
        }
        for (fs9 fs9Var : fs9VarArr) {
            if (fs9Var.c == 5) {
                listener.onModeSwitch(fs9Var.d == 1);
            }
        }
    }

    public static final void ftpState(@NotNull EcoDeviceModel ecoDeviceModel, @Nullable sr9 sr9Var, @NotNull psc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (sr9Var == null) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("version", Integer.valueOf(sr9Var.c));
        jsonObject.addProperty(StepsInfo.KEY_STAGE, Integer.valueOf(sr9Var.d));
        jsonObject.addProperty("retryCount", Integer.valueOf(sr9Var.e));
        jsonObject.addProperty(DialWidgetType.COUNT_DOWN, Integer.valueOf(sr9Var.g));
        jsonObject.addProperty("lightOnNumber", Integer.valueOf(sr9Var.f));
        listener.onFtpStateChange(new Gson().toJson((JsonElement) jsonObject));
    }

    @NotNull
    public static final HashMap<String, Integer> getCurDeviceRetry() {
        return curDeviceRetry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8r handleWearSportStatus(u7r u7rVar) {
        if (u7rVar == null) {
            FitnessLogUtils.w("SportManager_DeviceModelExt", "handleWearSportStatus -- wearPacket is null");
            return null;
        }
        if (u7rVar.e != 8) {
            FitnessLogUtils.w("SportManager_DeviceModelExt", "handleWearSportStatus -- not fitness response type");
            return null;
        }
        vr9 vr9VarR = u7rVar.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w("SportManager_DeviceModelExt", "handleWearSportStatus -- no fitness proto");
            return null;
        }
        ku9 ku9VarE = vr9VarR.E();
        if (ku9VarE == null) {
            FitnessLogUtils.w("SportManager_DeviceModelExt", "no fitness sportStatus proto");
            return null;
        }
        a8r a8rVarJ = uv9.j(ku9VarE);
        Intrinsics.checkNotNullExpressionValue(a8rVarJ, "convertProtoToSportStatus(...)");
        FitnessLogUtils.i("SportManager_DeviceModelExt", "WearSportStatus: " + a8rVarJ);
        return a8rVarJ;
    }

    public static final void isSupportLaunchSport(@NotNull EcoDeviceModel ecoDeviceModel, int i, @NotNull j7r callback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        FitnessLogUtils.i("SportManager_DeviceModelExt", "currentDeviceModel : " + ecoDeviceModel2 + " , isConnect:" + (ecoDeviceModel2 != null ? ecoDeviceModel2.getIsDeviceConnected() : false));
        if (ecoDeviceModel2 == null || !ecoDeviceModel2.getIsDeviceConnected() || SportDeviceModel.INSTANCE.isNotSupportLinkForWear()) {
            callback.a(Boolean.FALSE);
            return;
        }
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(ecoDeviceModel2)) {
            callback.a(Boolean.TRUE);
            return;
        }
        if (!EcoDeviceModelExtKt.isBluetooth(ecoDeviceModel2) && !EcoDeviceModelExtKt.isBle(ecoDeviceModel2)) {
            callback.a(Boolean.FALSE);
            return;
        }
        Integer num = hashMap.get(ecoDeviceModel2.getDeviceInfo().getDid() + i);
        if (num != null && num.intValue() == 0) {
            sendPhoneSportPreRequest$default(ecoDeviceModel2, i, 0, callback, 4, null);
            return;
        }
        if (num != null && num.intValue() == 2) {
            callback.a(Boolean.FALSE);
        } else if (num != null && num.intValue() == 1) {
            callback.a(Boolean.TRUE);
        } else {
            sendPhoneSportPreRequest$default(ecoDeviceModel2, i, 0, callback, 4, null);
        }
    }

    public static final void locks(@NotNull EcoDeviceModel ecoDeviceModel, @Nullable fs9[] fs9VarArr, @NotNull bsc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (fs9VarArr == null) {
            return;
        }
        for (fs9 fs9Var : fs9VarArr) {
            int i = fs9Var.c;
            if (i == 1) {
                listener.onLock(fs9Var.d == 1, 0);
            } else if (i == 2) {
                listener.onLock(fs9Var.d == 1, 1);
            }
        }
    }

    private static final void sendPhoneSportPreRequest(final EcoDeviceModel ecoDeviceModel, final int i, int i2, final j7r j7rVar) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 30;
        cu9 cu9Var = new cu9();
        cu9Var.c = i;
        cu9Var.e = i2;
        vr9 vr9Var = new vr9();
        vr9Var.U(cu9Var);
        u7rVar.B(vr9Var);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.sendPhoneSportPreRequest.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.i("SportManager_DeviceModelExt", "error , the ble device is not support launch sport , code : " + code);
                j7rVar.a(Boolean.FALSE);
                if (did != null) {
                    Integer num = DeviceModelExtKt.getCurDeviceRetry().get(did);
                    DeviceModelExtKt.getCurDeviceRetry().put(did, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    FitnessLogUtils.i("SportManager_DeviceModelExt", "retry : " + DeviceModelExtKt.getCurDeviceRetry().get(did) + " , did : " + did);
                    Integer num2 = DeviceModelExtKt.getCurDeviceRetry().get(did);
                    Intrinsics.checkNotNull(num2);
                    if (num2.intValue() > 3) {
                        DeviceModelExtKt.hashMap.put(did + i, 2);
                    }
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                u7r packet;
                vr9 vr9VarR;
                eu9 eu9VarB;
                u7r packet2;
                boolean z = false;
                if (result != null && (packet2 = result.getPacket()) != null && packet2.e == 8) {
                    z = true;
                }
                Integer numValueOf = (result == null || (packet = result.getPacket()) == null || (vr9VarR = packet.r()) == null || (eu9VarB = vr9VarR.B()) == null) ? null : Integer.valueOf(eu9VarB.d);
                if (result == null || !result.isSuccess() || !z || (numValueOf != null && numValueOf.intValue() == 1)) {
                    FitnessLogUtils.i("SportManager_DeviceModelExt", "success , the ble device is not support launch sport");
                    j7rVar.a(Boolean.FALSE);
                    DeviceModelExtKt.hashMap.put(ecoDeviceModel.getDeviceInfo().getDid() + i, 2);
                    return;
                }
                FitnessLogUtils.i("SportManager_DeviceModelExt", "the ble device is support launch sport");
                j7rVar.a(Boolean.TRUE);
                DeviceModelExtKt.hashMap.put(ecoDeviceModel.getDeviceInfo().getDid() + i, 1);
            }
        }, 0, 8, null);
    }

    public static /* synthetic */ void sendPhoneSportPreRequest$default(EcoDeviceModel ecoDeviceModel, int i, int i2, j7r j7rVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 3;
        }
        sendPhoneSportPreRequest(ecoDeviceModel, i, i2, j7rVar);
    }

    public static final void startDeviceHr(@NotNull WearableDeviceModel wearableDeviceModel, @Nullable ISportHrCallback iSportHrCallback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (wearableDeviceModel.getIsDeviceConnected()) {
            if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) && iSportHrCallback != null) {
                HuamiApiCaller huamiCaller = com.xiaomi.fitness.sport_eco_manager.SportDeviceModel.getHuamiCaller();
                if (huamiCaller != null) {
                    huamiCaller.startRealtimeMeasureHr(iSportHrCallback);
                    return;
                }
                return;
            }
            FitnessLogUtils.i("SportManager_DeviceModelExt", "ble registerDeviceHr");
            u7r u7rVar = new u7r();
            u7rVar.e = 8;
            u7rVar.f = 45;
            EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), u7rVar, false, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.startDeviceHr.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did, int type, int code) {
                    FitnessLogUtils.i("SportManager_DeviceModelExt", "ble registerDeviceHr error , did : " + did + " , type : " + type + " , code : " + code);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did, int type, EcoSyncResult result) {
                    FitnessLogUtils.i("SportManager_DeviceModelExt", "ble registerDeviceHr success");
                }
            }, 0, 8, null);
        }
    }

    public static /* synthetic */ void startDeviceHr$default(WearableDeviceModel wearableDeviceModel, ISportHrCallback iSportHrCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            iSportHrCallback = null;
        }
        startDeviceHr(wearableDeviceModel, iSportHrCallback);
    }

    public static final void stopDeviceHr(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuamiApiCaller huamiCaller = com.xiaomi.fitness.sport_eco_manager.SportDeviceModel.getHuamiCaller();
            if (huamiCaller != null) {
                huamiCaller.stopRealtimeMeasureHr();
                return;
            }
            return;
        }
        FitnessLogUtils.i("SportManager_DeviceModelExt", "unRegisterDeviceHr");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 46;
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), u7rVar, false, null, 0, 8, null);
    }

    public static final void syncDeviceSportStatus(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull String did, @Nullable final SportStateSyncCallback<a8r> sportStateSyncCallback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 29;
        u7rVar.B(new vr9());
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.syncDeviceSportStatus.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                SportStateSyncCallback<a8r> sportStateSyncCallback2 = sportStateSyncCallback;
                if (sportStateSyncCallback2 != null) {
                    sportStateSyncCallback2.onError(code);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                SportStateSyncCallback<a8r> sportStateSyncCallback2;
                a8r a8rVarHandleWearSportStatus = DeviceModelExtKt.handleWearSportStatus(result != null ? result.getPacket() : null);
                if ((a8rVarHandleWearSportStatus != null && a8rVarHandleWearSportStatus.h) || a8rVarHandleWearSportStatus == null || (sportStateSyncCallback2 = sportStateSyncCallback) == null) {
                    return;
                }
                sportStateSyncCallback2.onResult(a8rVarHandleWearSportStatus);
            }
        }, 0, 8, null);
    }
}
