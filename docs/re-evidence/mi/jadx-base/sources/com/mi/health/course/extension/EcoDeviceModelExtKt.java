package com.mi.health.course.extension;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack;
import defpackage.fs9;
import defpackage.u7r;
import defpackage.vr9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\u0005*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;", "", "Lfs9;", "callback", "", "getEcoGYMSettings", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;)V", "list", "", "setEcoGYMSettings", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;[Lfs9;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/DeviceTaskCallBack;)V", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class EcoDeviceModelExtKt {
    public static final void getEcoGYMSettings(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull final DeviceTaskCallBack<fs9[]> callback) {
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
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.mi.health.course.extension.EcoDeviceModelExtKt.getEcoGYMSettings.1
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
                DeviceTaskCallBack<fs9[]> deviceTaskCallBack = callback;
                Logger.d("getGYMSettings success", new Object[0]);
                fs9[] list = aVarW.c;
                Intrinsics.checkNotNullExpressionValue(list, "list");
                deviceTaskCallBack.onResult(list);
            }
        }, 0, 16, null);
    }

    public static final void setEcoGYMSettings(@NotNull EcoDeviceModel ecoDeviceModel, @NotNull fs9[] list, @NotNull final DeviceTaskCallBack<Boolean> callback) {
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
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.mi.health.course.extension.EcoDeviceModelExtKt.setEcoGYMSettings.1
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
}
