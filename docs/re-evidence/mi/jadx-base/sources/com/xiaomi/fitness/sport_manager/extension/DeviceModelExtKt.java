package com.xiaomi.fitness.sport_manager.extension;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager_export.listener.SportStateSyncCallback;
import com.xiaomi.hm.health.bt.sdk.ISportHrCallback;
import defpackage.bu9;
import defpackage.du9;
import defpackage.gs9;
import defpackage.i7r;
import defpackage.ju9;
import defpackage.ptc;
import defpackage.s7r;
import defpackage.tv9;
import defpackage.ur9;
import defpackage.z7r;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010!\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&\"#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\" \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)\"\u0015\u0010.\u001a\u00020-*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u00020-*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b0\u0010/¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "did", "", DailyRecordKey.sportType, "Li7r;", "callback", "", "isSupportLaunchSport", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;ILi7r;)V", "", "Lgs9;", "gymSettingsList", "Lptc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "locks", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;[Lgs9;Lptc;)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportStateSyncCallback;", "Lz7r;", "syncDeviceSportStatus", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/listener/SportStateSyncCallback;)V", "deviceModel", "sportVersion", "sendPhoneSportPreRequest", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;IILi7r;)V", "Ls7r;", "wearPacket", "handleWearSportStatus", "(Ls7r;)Lz7r;", "Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;", "huamiCallback", "startDeviceHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;)V", "stopDeviceHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "TAG", "Ljava/lang/String;", "retryCount", "I", "Ljava/util/HashMap;", "curDeviceRetry", "Ljava/util/HashMap;", "getCurDeviceRetry", "()Ljava/util/HashMap;", "hashMap", "", "isAccessory", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "isAccessoryConnected", "sport-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceModelExt.kt\ncom/xiaomi/fitness/sport_manager/extension/DeviceModelExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,253:1\n13402#2,2:254\n*S KotlinDebug\n*F\n+ 1 DeviceModelExt.kt\ncom/xiaomi/fitness/sport_manager/extension/DeviceModelExtKt\n*L\n90#1:254,2\n*E\n"})
public final class DeviceModelExtKt {

    @NotNull
    public static final String TAG = "SportManager_DeviceModelExt";

    @NotNull
    private static final HashMap<String, Integer> curDeviceRetry = new HashMap<>();

    @NotNull
    private static final HashMap<String, Integer> hashMap = new HashMap<>();
    public static final int retryCount = 3;

    @NotNull
    public static final HashMap<String, Integer> getCurDeviceRetry() {
        return curDeviceRetry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z7r handleWearSportStatus(s7r s7rVar) {
        if (s7rVar == null) {
            FitnessLogUtils.w("SportManager_DeviceModelExt", "handleWearSportStatus -- wearPacket is null");
            return null;
        }
        if (s7rVar.e != 8) {
            FitnessLogUtils.w("SportManager_DeviceModelExt", "handleWearSportStatus -- not fitness response type");
            return null;
        }
        ur9 ur9VarU = s7rVar.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w("SportManager_DeviceModelExt", "handleWearSportStatus -- no fitness proto");
            return null;
        }
        ju9 ju9VarV = ur9VarU.V();
        if (ju9VarV == null) {
            FitnessLogUtils.w("SportManager_DeviceModelExt", "no fitness sportStatus proto");
            return null;
        }
        z7r z7rVarK = tv9.k(ju9VarV);
        Intrinsics.checkNotNullExpressionValue(z7rVarK, "convertProtoToSportStatus(...)");
        FitnessLogUtils.i("SportManager_DeviceModelExt", "WearSportStatus: " + z7rVarK);
        return z7rVarK;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c A[ORIG_RETURN, RETURN] */
    public static final boolean isAccessory(@NotNull WearableDeviceModel wearableDeviceModel) {
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

    public static final void isSupportLaunchSport(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String did, int i, @NotNull i7r callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) (did.length() > 0 ? DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did) : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
        FitnessLogUtils.d("SportManager_DeviceModelExt", "currentDeviceModel : " + wearableDeviceModel2 + " , isConnect:" + (wearableDeviceModel2 != null ? wearableDeviceModel2.getIsDeviceConnected() : false));
        if (wearableDeviceModel2 != null && isAccessory(wearableDeviceModel2)) {
            callback.a(Boolean.TRUE);
            return;
        }
        if (wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected()) {
            callback.a(Boolean.FALSE);
            return;
        }
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
            callback.a(Boolean.TRUE);
            return;
        }
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel2) && !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBle(wearableDeviceModel2) && !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel2)) {
            FitnessLogUtils.i("SportManager_DeviceModelExt", "isSupportLaunchSport , not has supported deviceModel");
            callback.a(Boolean.FALSE);
            return;
        }
        Integer num = hashMap.get(wearableDeviceModel2.getDeviceInfo().getDid() + i);
        if (num != null && num.intValue() == 0) {
            FitnessLogUtils.i("SportManager_DeviceModelExt", "isSupportLaunchSport , none , key:" + wearableDeviceModel2.getDeviceInfo().getDid() + i);
            sendPhoneSportPreRequest$default(wearableDeviceModel2, i, 0, callback, 4, null);
            return;
        }
        if (num != null && num.intValue() == 2) {
            FitnessLogUtils.i("SportManager_DeviceModelExt", "isSupportLaunchSport , noSupport , key:" + wearableDeviceModel2.getDeviceInfo().getDid() + i);
            callback.a(Boolean.FALSE);
            return;
        }
        if (num == null || num.intValue() != 1) {
            sendPhoneSportPreRequest$default(wearableDeviceModel2, i, 0, callback, 4, null);
            return;
        }
        FitnessLogUtils.i("SportManager_DeviceModelExt", "isSupportLaunchSport , support , key:" + wearableDeviceModel2.getDeviceInfo().getDid() + i);
        callback.a(Boolean.TRUE);
    }

    public static /* synthetic */ void isSupportLaunchSport$default(WearableDeviceModel wearableDeviceModel, String str, int i, i7r i7rVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        isSupportLaunchSport(wearableDeviceModel, str, i, i7rVar);
    }

    public static final void locks(@NotNull WearableDeviceModel wearableDeviceModel, @Nullable gs9[] gs9VarArr, @NotNull ptc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (gs9VarArr == null) {
            return;
        }
        for (gs9 gs9Var : gs9VarArr) {
            int i = gs9Var.c;
            if (i == 1) {
                listener.onLock(gs9Var.d == 1, 0);
            } else if (i == 2) {
                listener.onLock(gs9Var.d == 1, 1);
            }
        }
    }

    private static final void sendPhoneSportPreRequest(final WearableDeviceModel wearableDeviceModel, final int i, int i2, final i7r i7rVar) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 30;
        bu9 bu9Var = new bu9();
        bu9Var.c = i;
        bu9Var.e = i2;
        ur9 ur9Var = new ur9();
        ur9Var.L0(bu9Var);
        s7rVar.S(ur9Var);
        FitnessLogUtils.i("SportManager_DeviceModelExt", "sendPhoneSportPreRequest , deviceModel:" + wearableDeviceModel + " , sportType:" + i);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.sendPhoneSportPreRequest.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.i("SportManager_DeviceModelExt", "error , the ble device is not support launch sport , code : " + code);
                i7rVar.a(Boolean.FALSE);
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

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                ur9 ur9VarU;
                du9 du9VarS;
                s7r packet2;
                boolean z = false;
                if (result != null && (packet2 = result.getPacket()) != null && packet2.e == 8) {
                    z = true;
                }
                Integer numValueOf = (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null || (du9VarS = ur9VarU.S()) == null) ? null : Integer.valueOf(du9VarS.d);
                if (result == null || !result.isSuccess() || !z || (numValueOf != null && numValueOf.intValue() == 1)) {
                    FitnessLogUtils.i("SportManager_DeviceModelExt", "success , the ble device is not support launch sport");
                    i7rVar.a(Boolean.FALSE);
                    DeviceModelExtKt.hashMap.put(wearableDeviceModel.getDeviceInfo().getDid() + i, 2);
                    return;
                }
                FitnessLogUtils.i("SportManager_DeviceModelExt", "the ble device is support launch sport");
                i7rVar.a(Boolean.TRUE);
                DeviceModelExtKt.hashMap.put(wearableDeviceModel.getDeviceInfo().getDid() + i, 1);
            }
        }, 0, 8, null);
    }

    public static /* synthetic */ void sendPhoneSportPreRequest$default(WearableDeviceModel wearableDeviceModel, int i, int i2, i7r i7rVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 3;
        }
        sendPhoneSportPreRequest(wearableDeviceModel, i, i2, i7rVar);
    }

    public static final void startDeviceHr(@NotNull WearableDeviceModel wearableDeviceModel, @Nullable ISportHrCallback iSportHrCallback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (wearableDeviceModel.getIsDeviceConnected()) {
            if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) && iSportHrCallback != null) {
                HuamiApiCaller huamiCaller = SportDeviceModel.getHuamiCaller();
                if (huamiCaller != null) {
                    huamiCaller.startRealtimeMeasureHr(iSportHrCallback);
                    return;
                }
                return;
            }
            FitnessLogUtils.i("SportManager_DeviceModelExt", "ble registerDeviceHr");
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 45;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.startDeviceHr.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    FitnessLogUtils.i("SportManager_DeviceModelExt", "ble registerDeviceHr error , did : " + did + " , type : " + type + " , code : " + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
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
            HuamiApiCaller huamiCaller = SportDeviceModel.getHuamiCaller();
            if (huamiCaller != null) {
                huamiCaller.stopRealtimeMeasureHr();
                return;
            }
            return;
        }
        FitnessLogUtils.i("SportManager_DeviceModelExt", "unRegisterDeviceHr");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 46;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }

    public static final void syncDeviceSportStatus(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String did, @NotNull final SportStateSyncCallback<z7r> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 29;
        s7rVar.S(new ur9());
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.syncDeviceSportStatus.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                z7r z7rVarHandleWearSportStatus = DeviceModelExtKt.handleWearSportStatus(result != null ? result.getPacket() : null);
                if ((z7rVarHandleWearSportStatus == null || !z7rVarHandleWearSportStatus.h) && z7rVarHandleWearSportStatus != null) {
                    callback.onResult(z7rVarHandleWearSportStatus);
                }
            }
        }, 0, 8, null);
    }
}
