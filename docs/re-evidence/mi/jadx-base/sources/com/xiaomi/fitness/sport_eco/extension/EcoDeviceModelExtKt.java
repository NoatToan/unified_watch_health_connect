package com.xiaomi.fitness.sport_eco.extension;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback;
import com.xiaomi.hm.health.bt.sdk.ISportHrCallback;
import defpackage.a8r;
import defpackage.bt7;
import defpackage.cz7;
import defpackage.eu6;
import defpackage.ez7;
import defpackage.fs9;
import defpackage.fz7;
import defpackage.iz7;
import defpackage.ku9;
import defpackage.tr9;
import defpackage.two;
import defpackage.u7r;
import defpackage.uu9;
import defpackage.uxo;
import defpackage.vr9;
import defpackage.w64;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a%\u0010\r\u001a\u00020\f*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0010\u001a\u00020\f*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b¢\u0006\u0004\b\u0010\u0010\u000e\u001a-\u0010\u0012\u001a\u00020\f*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0017\u001a\u00020\f*\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\f*\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001f\u001a\u00020\f*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0015\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010/\u001a\u00020+2\u0006\u0010.\u001a\u00020+H\u0002¢\u0006\u0004\b/\u00100\u001a\u001f\u00103\u001a\u00020\f*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b3\u00104\u001a\u001f\u00106\u001a\u00020\f*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020501¢\u0006\u0004\b6\u00104\u001a\u0011\u00107\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b7\u00108\u001a\u0019\u0010;\u001a\u00020\f*\u00020\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a%\u0010=\u001a\u00020\f*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t01¢\u0006\u0004\b=\u00104\u001a-\u0010>\u001a\u00020\f*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", "isSupportChildLock", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Z", "isSupportSpeedLimit", "isSupportDeviceDebugMode", "isSupportIntelligentLinkage", "isSupportInsuranceIntroduction", "Leu6;", "", "Ltr9;", "callback", "", "getEcoFtpTarget", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Leu6;)V", "Lfs9;", "getGYMSettings", "list", "setGYMSettings", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;[Lfs9;Leu6;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;", "huamiCallback", "startDeviceHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;)V", "stopDeviceHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "did", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportStateSyncCallback;", "La8r;", "syncDeviceSportStatus", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Ljava/lang/String;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportStateSyncCallback;)V", "Lu7r;", "wearPacket", "handleWearSportStatus", "(Lu7r;)La8r;", "Lku9;", "sportStatus", "convertProtoToSportStatus", "(Lku9;)La8r;", "Lw64;", "protoTimeZone", "", "convertToDataIdTimeZone", "(Lw64;)I", "protoSportType", "convertProtoToSportType", "(I)I", "Lbt7;", "Ltwo;", "getRopeInfo", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Lbt7;)V", "Lfz7;", "getBattery", "syncTime", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "", "weight", "setUserProfile", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;F)V", "getEcoGYMSettings", "setEcoGYMSettings", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;[Lfs9;Lbt7;)V", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class EcoDeviceModelExtKt {
    @NotNull
    public static final a8r convertProtoToSportStatus(@NotNull ku9 sportStatus) {
        Intrinsics.checkNotNullParameter(sportStatus, "sportStatus");
        a8r a8rVar = new a8r();
        a8rVar.f779a = sportStatus.e;
        a8rVar.f780b = convertToDataIdTimeZone(sportStatus.f);
        a8rVar.c = convertProtoToSportType(sportStatus.c);
        a8rVar.d = sportStatus.h;
        a8rVar.e = sportStatus.g;
        a8rVar.f = sportStatus.j;
        a8rVar.g = sportStatus.f24295k;
        a8rVar.h = sportStatus.i;
        return a8rVar;
    }

    private static final int convertProtoToSportType(int i) {
        if (i == 14) {
            return 14;
        }
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

    private static final int convertToDataIdTimeZone(w64 w64Var) {
        if (w64Var == null) {
            return 0;
        }
        if (TextUtils.isEmpty(w64Var.e)) {
            return w64Var.d + w64Var.c;
        }
        TimeZone timeZone = TimeZone.getTimeZone(w64Var.e);
        return ((int) TimeUnit.MILLISECONDS.toMinutes(timeZone.getDSTSavings() + timeZone.getRawOffset())) / 15;
    }

    public static final void getBattery(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull final bt7<fz7> callback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 3;
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getBattery.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("CommonSportModel", "getBattery error " + code);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                u7r packet;
                cz7 cz7VarP;
                fz7 fz7VarQ;
                if (result == null || (packet = result.getPacket()) == null || (cz7VarP = packet.p()) == null || (fz7VarQ = cz7VarP.q()) == null) {
                    onError(did, type, -1);
                    return;
                }
                bt7<fz7> bt7Var = callback;
                Logger.d("CommonSportModel", "getBattery success");
                bt7Var.onResult(fz7VarQ);
            }
        }, 0, 16, null);
    }

    public static final void getEcoFtpTarget(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull final eu6<tr9[]> callback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 71;
        tr9.a aVar = new tr9.a();
        aVar.c = tr9.n();
        vr9 vr9Var = new vr9();
        vr9Var.K(aVar);
        u7rVar.B(vr9Var);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getEcoFtpTarget.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("getFtpTargetList error " + code, new Object[0]);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                u7r packet;
                vr9 vr9VarR;
                tr9.a aVarR;
                if (result == null || (packet = result.getPacket()) == null || (vr9VarR = packet.r()) == null || (aVarR = vr9VarR.r()) == null) {
                    onError(did, type, -1);
                    return;
                }
                eu6<tr9[]> eu6Var = callback;
                Logger.d("getFtpTargetList success", new Object[0]);
                Logger.d("getFtpTargetList success,it.list " + aVarR.c[3].d, new Object[0]);
                eu6Var.onResult(aVarR.c);
            }
        }, 0, 16, null);
    }

    public static final void getEcoGYMSettings(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull final bt7<fs9[]> callback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 67;
        fs9.a aVar = new fs9.a();
        aVar.c = fs9.n();
        vr9 vr9Var = new vr9();
        vr9Var.N(aVar);
        u7rVar.B(vr9Var);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getEcoGYMSettings.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("getGYMSettings error " + code, new Object[0]);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                u7r packet;
                vr9 vr9VarR;
                fs9.a aVarW;
                if (result == null || (packet = result.getPacket()) == null || (vr9VarR = packet.r()) == null || (aVarW = vr9VarR.w()) == null) {
                    onError(did, type, -1);
                    return;
                }
                bt7<fs9[]> bt7Var = callback;
                Logger.d("getGYMSettings success", new Object[0]);
                bt7Var.onResult(aVarW.c);
            }
        }, 0, 16, null);
    }

    public static final void getGYMSettings(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull final eu6<fs9[]> callback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 67;
        fs9.a aVar = new fs9.a();
        aVar.c = fs9.n();
        vr9 vr9Var = new vr9();
        vr9Var.N(aVar);
        u7rVar.B(vr9Var);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getGYMSettings.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("getGYMSettings error " + code, new Object[0]);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                u7r packet;
                vr9 vr9VarR;
                fs9.a aVarW;
                if (result == null || (packet = result.getPacket()) == null || (vr9VarR = packet.r()) == null || (aVarW = vr9VarR.w()) == null) {
                    onError(did, type, -1);
                    return;
                }
                eu6<fs9[]> eu6Var = callback;
                Logger.d("getGYMSettings success", new Object[0]);
                eu6Var.onResult(aVarW.c);
            }
        }, 0, 16, null);
    }

    public static final void getRopeInfo(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull final bt7<two> callback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 2;
        u7rVar.f = 2;
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getRopeInfo.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("CommonSportModel", "getRopeInfo error " + code);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                u7r packet;
                uxo uxoVarU;
                two twoVarO;
                if (result == null || (packet = result.getPacket()) == null || (uxoVarU = packet.u()) == null || (twoVarO = uxoVarU.o()) == null) {
                    onError(did, type, -1);
                    return;
                }
                bt7<two> bt7Var = callback;
                Logger.d("CommonSportModel", "getRopeInfo success firmwareVersion = " + twoVarO.d);
                bt7Var.onResult(twoVarO);
            }
        }, 0, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8r handleWearSportStatus(u7r u7rVar) {
        if (u7rVar == null) {
            FitnessLogUtils.w("CommonSportModel", "handleWearSportStatus -- wearPacket is null");
            return null;
        }
        if (u7rVar.e != 8) {
            FitnessLogUtils.w("CommonSportModel", "handleWearSportStatus -- not fitness response type");
            return null;
        }
        vr9 vr9VarR = u7rVar.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w("CommonSportModel", "handleWearSportStatus -- no fitness proto");
            return null;
        }
        ku9 ku9VarE = vr9VarR.E();
        if (ku9VarE == null) {
            FitnessLogUtils.w("CommonSportModel", "no fitness sportStatus proto");
            return null;
        }
        a8r a8rVarConvertProtoToSportStatus = convertProtoToSportStatus(ku9VarE);
        FitnessLogUtils.i("CommonSportModel", "WearSportStatus: " + a8rVarConvertProtoToSportStatus);
        return a8rVarConvertProtoToSportStatus;
    }

    public static final boolean isSupportChildLock(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isSupportFeature(ecoDeviceModel, Feature.CHILD_LOCK);
    }

    public static final boolean isSupportDeviceDebugMode(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isSupportFeature(ecoDeviceModel, Feature.DEVICE_IN_DEBUG_MODE);
    }

    public static final boolean isSupportInsuranceIntroduction(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isSupportFeature(ecoDeviceModel, Feature.INSURANCE_INTRODUCTION);
    }

    public static final boolean isSupportIntelligentLinkage(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isSupportFeature(ecoDeviceModel, Feature.INTELLIGENT_LINKAGE);
    }

    public static final boolean isSupportSpeedLimit(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isSupportFeature(ecoDeviceModel, Feature.SPEED_UP_LIMIT);
    }

    public static final void setEcoGYMSettings(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull fs9[] list, @NotNull final bt7<Boolean> callback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 68;
        fs9.a aVar = new fs9.a();
        aVar.c = list;
        vr9 vr9Var = new vr9();
        vr9Var.N(aVar);
        u7rVar.B(vr9Var);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.setEcoGYMSettings.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("setGYMSettings error:" + code, new Object[0]);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.d("setGYMSettings success:" + result, new Object[0]);
                callback.onResult(Boolean.TRUE);
            }
        }, 0, 16, null);
    }

    public static final void setGYMSettings(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull fs9[] list, @NotNull final eu6<Boolean> callback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 68;
        fs9.a aVar = new fs9.a();
        aVar.c = list;
        vr9 vr9Var = new vr9();
        vr9Var.N(aVar);
        u7rVar.B(vr9Var);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.setGYMSettings.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("setGYMSettings error:" + code, new Object[0]);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.d("setGYMSettings success:" + result, new Object[0]);
                callback.onResult(Boolean.TRUE);
            }
        }, 0, 16, null);
    }

    public static final void setUserProfile(@NotNull EcoDeviceModel ecoDeviceModel, float f) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 0;
        uu9 uu9Var = new uu9();
        uu9Var.d = f;
        vr9 vr9Var = new vr9();
        vr9Var.X(uu9Var);
        u7rVar.B(vr9Var);
        Logger.d("CommonSportModel", "setUserProfile " + uu9Var.d);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.setUserProfile.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("CommonSportModel", "setUserProfile error " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.d("CommonSportModel", "setUserProfile success");
            }
        }, 0, 16, null);
    }

    public static final void startDeviceHr(@NotNull WearableDeviceModel wearableDeviceModel, @Nullable ISportHrCallback iSportHrCallback) {
        String mac;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (wearableDeviceModel.getIsDeviceConnected()) {
            if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel) || iSportHrCallback == null) {
                FitnessLogUtils.d("CommonSportModel", "ble registerDeviceHr");
                u7r u7rVar = new u7r();
                u7rVar.e = 8;
                u7rVar.f = 45;
                EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), u7rVar, false, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.startDeviceHr.1
                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onError(String did, int type, int code) {
                        FitnessLogUtils.i("CommonSportModel", "ble registerDeviceHr error , did : " + did + " , type : " + type + " , code : " + code);
                    }

                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onSuccess(String did, int type, EcoSyncResult result) {
                        FitnessLogUtils.d("CommonSportModel", "ble registerDeviceHr success");
                    }
                }, 0, 8, null);
                return;
            }
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (ecoDeviceModel == null || (mac = com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(ecoDeviceModel)) == null) {
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
        if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            FitnessLogUtils.d("CommonSportModel", "unRegisterDeviceHr");
            u7r u7rVar = new u7r();
            u7rVar.e = 8;
            u7rVar.f = 46;
            EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), u7rVar, false, null, 0, 8, null);
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (ecoDeviceModel == null || (mac = com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(ecoDeviceModel)) == null) {
            mac = "";
        }
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        if (huaMiApiCaller != null) {
            huaMiApiCaller.stopRealtimeMeasureHr();
        }
    }

    public static final void syncDeviceSportStatus(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull String did, @Nullable final SportStateSyncCallback<a8r> sportStateSyncCallback) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(did, "did");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 29;
        u7rVar.B(new vr9());
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.syncDeviceSportStatus.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                SportStateSyncCallback<a8r> sportStateSyncCallback2 = sportStateSyncCallback;
                if (sportStateSyncCallback2 != null) {
                    sportStateSyncCallback2.onError(code);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                a8r a8rVarHandleWearSportStatus = EcoDeviceModelExtKt.handleWearSportStatus(result != null ? result.getPacket() : null);
                if ((a8rVarHandleWearSportStatus != null && a8rVarHandleWearSportStatus.h) || a8rVarHandleWearSportStatus == null) {
                    FitnessLogUtils.i("CommonSportModel", "syncDeviceSportStatus onSuccess return");
                    return;
                }
                SportStateSyncCallback<a8r> sportStateSyncCallback2 = sportStateSyncCallback;
                if (sportStateSyncCallback2 != null) {
                    sportStateSyncCallback2.onResult(a8rVarHandleWearSportStatus);
                }
            }
        }, 0, 16, null);
    }

    public static final void syncTime(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 0;
        cz7 cz7Var = new cz7();
        iz7 iz7Var = new iz7();
        iz7Var.c = (int) (System.currentTimeMillis() / ((long) 1000));
        cz7Var.y(iz7Var);
        u7rVar.A(cz7Var);
        Logger.i("CommonSportModel", "syncTime " + iz7Var.c);
        EcoDeviceContact.Companion companion = EcoDeviceContact.INSTANCE;
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(companion), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.syncTime.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("CommonSportModel", "syncTime error " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i("CommonSportModel", "syncTime success");
            }
        }, 0, 16, null);
        u7r u7rVar2 = new u7r();
        u7rVar2.e = 33;
        u7rVar2.f = 5;
        cz7 cz7Var2 = new cz7();
        ez7 ez7Var = new ez7();
        ez7Var.f = String.valueOf(FitnessDateUtils.getCurrentTZOffsetIn15min());
        cz7Var2.w(ez7Var);
        u7rVar2.A(cz7Var2);
        Logger.i("CommonSportModel", "timeZone " + ez7Var.f);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(companion), ecoDeviceModel.getDid(), u7rVar2, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.syncTime.2
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("CommonSportModel", "syncTimeZone error " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i("CommonSportModel", "syncTimeZone success");
            }
        }, 0, 16, null);
    }
}
