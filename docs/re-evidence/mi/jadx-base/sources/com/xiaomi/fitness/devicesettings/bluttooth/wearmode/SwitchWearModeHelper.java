package com.xiaomi.fitness.devicesettings.bluttooth.wearmode;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.sport_export.IJustDanceApi;
import com.xiaomi.fitness.sport_export.JustDanceExtKt;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tJ\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeHelper;", "", "<init>", "()V", "getWearMode", "", "did", "", "block", "Lkotlin/Function1;", "", "setWearMode", "mode", "fromLaunch", "", "TAG", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SwitchWearModeHelper {

    @NotNull
    public static final SwitchWearModeHelper INSTANCE = new SwitchWearModeHelper();

    @NotNull
    private static final String TAG = "SwitchWearModeHelper";

    private SwitchWearModeHelper() {
    }

    public static /* synthetic */ void getWearMode$default(SwitchWearModeHelper switchWearModeHelper, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        switchWearModeHelper.getWearMode(str, function1);
    }

    public final void getWearMode(@Nullable String did, @NotNull final Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 14;
        vxo.i iVar = new vxo.i();
        iVar.c = 4;
        txo txoVar = new txo();
        txoVar.n0(iVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeHelper.getWearMode.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(SwitchWearModeHelper.TAG, "loadWearMode fail: " + code);
                block.invoke2(-1);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                txo txoVarE;
                vxo vxoVarI;
                vxo.j jVar;
                if (result == null || !result.isSuccess()) {
                    onError(did2, type, 255);
                    return;
                }
                s7r packet = result.getPacket();
                Integer numValueOf = (packet == null || (txoVarE = packet.E()) == null || (vxoVarI = txoVarE.I()) == null || (jVar = vxoVarI.e) == null) ? null : Integer.valueOf(jVar.c);
                Logger.i(SwitchWearModeHelper.TAG, "loadWearMode success: " + numValueOf);
                block.invoke2(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : -1));
            }
        }, 0, 16, (Object) null);
    }

    public final void setWearMode(@NotNull String did, final int mode, final boolean fromLaunch) {
        Intrinsics.checkNotNullParameter(did, "did");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 15;
        txo txoVar = new txo();
        vxo vxoVar = new vxo();
        vxo.j jVar = new vxo.j();
        jVar.c = mode;
        vxoVar.e = jVar;
        txoVar.m0(vxoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeHelper.setWearMode.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.e(SwitchWearModeHelper.TAG, "setWearMode fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                if (result == null || !result.isSuccess()) {
                    onError(did2, type, 255);
                    return;
                }
                if (did2 != null) {
                    WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                    DeviceManagerExtKt.getInstance(companion).switchDeviceWearMode(did2, mode, true);
                    DeviceManagerExtKt.getInstance(companion).switchDevice(DeviceManagerExtKt.getInstance(companion).getDeviceModel(did2));
                    if (fromLaunch) {
                        return;
                    }
                    JustDanceExtKt.getInstance(IJustDanceApi.INSTANCE).gotoLaunchActivity(ApplicationExtKt.getApplication());
                }
            }
        }, 0, 16, (Object) null);
    }
}
