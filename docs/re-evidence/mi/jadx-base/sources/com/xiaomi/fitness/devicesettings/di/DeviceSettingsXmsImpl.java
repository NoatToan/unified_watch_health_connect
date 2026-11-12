package com.xiaomi.fitness.devicesettings.di;

import android.os.Bundle;
import android.os.RemoteException;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.di.DeviceSettingsXmsImpl;
import com.xiaomi.fitness.devicesettings.xms.b;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.push.export.PushManagerKt;
import defpackage.kb;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsXmsImpl;", "Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsXms;", "", "did", "Lcom/xiaomi/fitness/devicesettings/xms/b;", "callback", "", "startFindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/devicesettings/xms/b;)V", "stopFindDevice", "jumpToMainPage", "()V", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceSettingsXmsImpl implements DeviceSettingsXms {

    @NotNull
    public static final String TAG = "DeviceSettingsXmsImpl";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean startFindDevice$lambda$0(String str, WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDid(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stopFindDevice$lambda$1(String str, WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDid(), str);
    }

    @Override // com.xiaomi.fitness.devicesettings.di.DeviceSettingsXms
    public void jumpToMainPage() {
        kb.d(ApplicationExtKt.getApplication());
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        MainExtKt.showMainActivity(AppUtil.getApp(), PushManagerKt.sMainPageHandlerPaddingAction, bundle);
    }

    @Override // com.xiaomi.fitness.devicesettings.di.DeviceSettingsXms
    public void startFindDevice(@Nullable final String did, @Nullable b callback) throws RemoteException {
        if (did == null || did.length() == 0) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        }
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: on6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceSettingsXmsImpl.startFindDevice$lambda$0(did, (WearableDeviceModel) obj));
            }
        });
        if (wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected()) {
            if (callback != null) {
                callback.onResult(0);
                return;
            }
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
            HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(wearableDeviceModel2);
            if (huamiDevice != null) {
                huamiDevice.alertFind();
            }
            if (callback != null) {
                callback.onResult(1);
                return;
            }
            return;
        }
        if (DeviceModelExtKt.isBluetooth(wearableDeviceModel2)) {
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 18;
            txo txoVar = new txo();
            txoVar.X(0);
            s7rVar.c0(txoVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel2.getDid(), s7rVar, false, (OnSyncCallback) null, 0, 24, (Object) null);
            if (callback != null) {
                callback.onResult(1);
            }
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.di.DeviceSettingsXms
    public void stopFindDevice(@Nullable final String did, @Nullable b callback) throws RemoteException {
        if (did == null || did.length() == 0) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        }
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: pn6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceSettingsXmsImpl.stopFindDevice$lambda$1(did, (WearableDeviceModel) obj));
            }
        });
        if (wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected()) {
            if (callback != null) {
                callback.onResult(0);
                return;
            }
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
            if (callback != null) {
                callback.onResult(0);
            }
        } else if (DeviceModelExtKt.isBluetooth(wearableDeviceModel2)) {
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 18;
            txo txoVar = new txo();
            txoVar.X(1);
            s7rVar.c0(txoVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel2.getDid(), s7rVar, false, (OnSyncCallback) null, 0, 24, (Object) null);
            if (callback != null) {
                callback.onResult(1);
            }
        }
    }
}
