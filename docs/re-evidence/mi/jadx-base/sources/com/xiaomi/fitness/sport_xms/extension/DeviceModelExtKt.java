package com.xiaomi.fitness.sport_xms.extension;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.ju9;
import defpackage.s7r;
import defpackage.txo;
import defpackage.ur9;
import defpackage.vxo;
import defpackage.z7r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0012\u0010\u0006\u001a-\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/Function1;", "", "", "callback", "isDeviceSporting", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function1;)V", "Ls7r;", "wearPacket", "Lz7r;", "handleWearSportStatus", "(Ls7r;)Lz7r;", "Lju9;", "sportStatus", "convertProtoToSportStatus", "(Lju9;)Lz7r;", "", "block", "getDeviceWearMode", "wearMode", "setDeviceWearMode", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ILkotlin/jvm/functions/Function1;)V", "", "TAG", "Ljava/lang/String;", "errorCode", "I", "sport-xms_release"}, k = 2, mv = {2, 0, 0})
public final class DeviceModelExtKt {

    @NotNull
    public static final String TAG = "Sport-Xms-DeviceModel";
    public static final int errorCode = -1;

    @NotNull
    public static final z7r convertProtoToSportStatus(@NotNull ju9 sportStatus) {
        Intrinsics.checkNotNullParameter(sportStatus, "sportStatus");
        z7r z7rVar = new z7r();
        z7rVar.f40996a = sportStatus.e;
        z7rVar.d = sportStatus.h;
        z7rVar.e = sportStatus.g;
        z7rVar.f = sportStatus.j;
        z7rVar.g = sportStatus.f23136k;
        z7rVar.h = sportStatus.i;
        z7rVar.c = sportStatus.c;
        return z7rVar;
    }

    public static final void getDeviceWearMode(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull final Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 14;
        vxo.i iVar = new vxo.i();
        iVar.c = 4;
        txo txoVar = new txo();
        txoVar.n0(iVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_xms.extension.DeviceModelExtKt.getDeviceWearMode.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(DeviceModelExtKt.TAG, "getDeviceWearMode onError: " + code);
                block.invoke2(-1);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                txo txoVarE;
                vxo vxoVarI;
                vxo.j jVar;
                Integer numValueOf = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (vxoVarI = txoVarE.I()) == null || (jVar = vxoVarI.e) == null) ? null : Integer.valueOf(jVar.c);
                Logger.i(DeviceModelExtKt.TAG, "getDeviceWearMode success: " + numValueOf);
                block.invoke2(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
            }
        }, 0, 8, null);
    }

    @Nullable
    public static final z7r handleWearSportStatus(@Nullable s7r s7rVar) {
        if (s7rVar == null) {
            FitnessLogUtils.w(TAG, "handleWearSportStatus -- wearPacket is null");
            return null;
        }
        if (s7rVar.e != 8) {
            FitnessLogUtils.w(TAG, "handleWearSportStatus -- not fitness response type");
            return null;
        }
        ur9 ur9VarU = s7rVar.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w(TAG, "handleWearSportStatus -- no fitness proto");
            return null;
        }
        ju9 ju9VarV = ur9VarU.V();
        if (ju9VarV == null) {
            FitnessLogUtils.w(TAG, "no fitness sportStatus proto");
            return null;
        }
        z7r z7rVarConvertProtoToSportStatus = convertProtoToSportStatus(ju9VarV);
        FitnessLogUtils.d(TAG, "WearSportStatus: " + z7rVarConvertProtoToSportStatus);
        return z7rVarConvertProtoToSportStatus;
    }

    public static final void isDeviceSporting(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 29;
        s7rVar.S(new ur9());
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_xms.extension.DeviceModelExtKt$isDeviceSporting$1$2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.i(DeviceModelExtKt.TAG, "onError , did:" + did + " , type : " + type + " , code : " + code);
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                z7r z7rVarHandleWearSportStatus = DeviceModelExtKt.handleWearSportStatus(result != null ? result.getPacket() : null);
                FitnessLogUtils.i(DeviceModelExtKt.TAG, "onSuccess , did:" + did + " , type : " + type + " , timeStamp:" + (z7rVarHandleWearSportStatus != null ? Long.valueOf(z7rVarHandleWearSportStatus.f40996a) : null) + " , sportType:" + (z7rVarHandleWearSportStatus != null ? Integer.valueOf(z7rVarHandleWearSportStatus.c) : null));
                if (z7rVarHandleWearSportStatus == null || z7rVarHandleWearSportStatus.c != 0) {
                    callback.invoke2(Boolean.TRUE);
                } else {
                    callback.invoke2(Boolean.FALSE);
                }
            }
        }, 0, 8, null);
    }

    public static final void setDeviceWearMode(@NotNull WearableDeviceModel wearableDeviceModel, final int i, @NotNull final Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        final s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 15;
        vxo.j jVar = new vxo.j();
        jVar.c = i;
        vxo vxoVar = new vxo();
        vxoVar.e = jVar;
        txo txoVar = new txo();
        txoVar.m0(vxoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_xms.extension.DeviceModelExtKt$setDeviceWearMode$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                block.invoke2(Integer.valueOf(code));
                Logger.i(DeviceModelExtKt.TAG, "setDeviceWearMode error ,did:" + did + " , mode:" + i);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                block.invoke2(Integer.valueOf(result != null ? result.getCode() : s7rVar.s()));
                Logger.i(DeviceModelExtKt.TAG, "setDeviceWearMode success,did:" + did + " , mode:" + i);
            }
        }, 0, 8, null);
    }
}
