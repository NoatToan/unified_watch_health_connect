package com.xiaomi.fitness.devicesettings;

import android.content.Intent;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.devicesettings.di.FeatureItemModule;
import com.xiaomi.fitness.devicesettings.utils.ZenUtilsKt;
import com.xiaomi.fitness.devicesettings.xms.DeviceSettingsXmsService;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.notify.data.Constant;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import defpackage.aje;
import defpackage.cxo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vxo;
import defpackage.yxo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR(\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/xiaomi/fitness/devicesettings/DeviceSettingsComponent$mainSystemHandler$1", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "wifiSettingDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getWifiSettingDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setWifiSettingDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceSettingsComponent$mainSystemHandler$1 extends DataHandlerWrapper {
    private CommonDialog<?> wifiSettingDialog;

    public final CommonDialog<?> getWifiSettingDialog() {
        return this.wifiSettingDialog;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(String did, int type, s7r packet) {
        yxo yxoVarJ;
        cxo cxoVarW;
        txo txoVarE;
        yxo yxoVarJ2;
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("DeviceSettingsComponent", "handlePacket type:" + type + " id:" + (packet != null ? Integer.valueOf(packet.f) : null) + " timingSetting:" + ((packet == null || (txoVarE = packet.E()) == null || (yxoVarJ2 = txoVarE.J()) == null) ? null : Integer.valueOf(yxoVarJ2.c)));
        if (packet == null) {
            return false;
        }
        int i = packet.f;
        if (i == 18) {
            int iT = packet.E().t();
            Logger.i("DeviceSettingsComponent", "handlePacket FIND_WEAR = " + iT);
            Intent intent = new Intent();
            intent.setClass(ApplicationExtKt.getApplication().getApplicationContext(), DeviceSettingsXmsService.class);
            intent.putExtra(DeviceSettingsXmsService.PARAM_FIND_DEVICE_STATUS, iT);
            ApplicationExtKt.getApplication().startService(intent);
            aje ajeVarB = aje.b(ApplicationExtKt.getApplication());
            Intent intent2 = new Intent(Constant.SYSTEM_DEVICE_SETTINGS_REPORT);
            intent2.putExtra(Constant.SYSTEM_DEVICE_SETTINGS_REPORT_FIND_WEAR_MODE, iT);
            ajeVarB.d(intent2);
            return true;
        }
        if (i == 23) {
            txo txoVarE2 = packet.E();
            if (txoVarE2 != null && (yxoVarJ = txoVarE2.J()) != null) {
                ZenUtilsKt.handleDeviceSetQuietMode(Boolean.valueOf(yxoVarJ.c == 0));
            }
        } else {
            if (i == 42) {
                txo txoVarE3 = packet.E();
                vxo vxoVarI = txoVarE3 != null ? txoVarE3.I() : null;
                Logger.i("DeviceSettingsComponent", "Device Report System Setting report  = " + vxoVarI);
                if ((vxoVarI != null ? vxoVarI.d : null) != null) {
                    vxo.b bVar = vxoVarI.d;
                    ZenUtilsKt.handleDeviceSettingDND(did, bVar != null ? Boolean.valueOf(bVar.c) : null);
                }
                if ((vxoVarI != null ? vxoVarI.c : null) != null) {
                    Intent intent3 = new Intent(Constant.SYSTEM_DEVICE_SETTINGS_REPORT);
                    vxo.g gVar = vxoVarI.c;
                    if (gVar == null || gVar.d != 0) {
                        intent3.putExtra(Constant.SYSTEM_DEVICE_SETTINGS_REPORT_LOCK_NOTIFICATION, gVar != null ? Integer.valueOf(gVar.d) : null);
                        NotifyHelperExtKt.getNotificationManagerExport().updateNotificationOnlyLockscreen(did, vxoVarI.c.d == 1);
                    }
                    vxo.g gVar2 = vxoVarI.c;
                    if (gVar2 == null || gVar2.c != 0) {
                        intent3.putExtra(Constant.SYSTEM_DEVICE_SETTINGS_REPORT_SCREEN_NOTIFICATION, gVar2 != null ? Integer.valueOf(gVar2.c) : null);
                    }
                    vxo.g gVar3 = vxoVarI.c;
                    if (gVar3 == null || gVar3.e != 0) {
                        intent3.putExtra(Constant.SYSTEM_DEVICE_SETTINGS_REPORT_ONLY_WEAR_NOTIFICATION, gVar3 != null ? Integer.valueOf(gVar3.e) : null);
                    }
                    aje.b(ApplicationExtKt.getApplication()).d(intent3);
                }
                if ((vxoVarI != null ? vxoVarI.e : null) != null) {
                    FeatureItemModule featureItemModule = FeatureItemModule.INSTANCE;
                    vxo.j jVar = vxoVarI.e;
                    featureItemModule.setWearMode(jVar != null ? Integer.valueOf(jVar.c) : null);
                    ScopeExtKt.scope$default(null, new DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$3(did, vxoVarI, null), 1, null);
                }
                return true;
            }
            if (i != 82) {
                return false;
            }
            txo txoVarE4 = packet.E();
            if (txoVarE4 != null && (cxoVarW = txoVarE4.w()) != null && cxoVarW.c == 1) {
                AnyExtKt.main$default(null, new DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1(this, null), 1, null);
            }
        }
        return true;
    }

    public final void setWifiSettingDialog(CommonDialog<?> commonDialog) {
        this.wifiSettingDialog = commonDialog;
    }
}
