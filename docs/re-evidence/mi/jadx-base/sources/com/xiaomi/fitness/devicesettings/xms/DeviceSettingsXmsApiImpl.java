package com.xiaomi.fitness.devicesettings.xms;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.di.DeviceSettingsXmsImpl;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u000f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/xms/DeviceSettingsXmsApiImpl;", "Lcom/xiaomi/fitness/devicesettings/xms/a$a;", "", "did", "", "checkDeviceConnectStatus", "(Ljava/lang/String;)I", "Lcom/xiaomi/fitness/devicesettings/xms/b;", "callback", "", "startFindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/devicesettings/xms/b;)V", "stopFindDevice", "Lcom/xiaomi/fitness/devicesettings/xms/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "subscribeFindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/devicesettings/xms/c;)V", "unsubscribeFindDevice", "(Ljava/lang/String;)V", "getDeviceBattery", "(Ljava/lang/String;)Ljava/lang/String;", "jumpToMiHealthPage", "()V", "status", "updateFindDeviceStatus", "(Ljava/lang/String;I)V", "Landroid/os/RemoteCallbackList;", "mFindDeviceFromApplication", "Landroid/os/RemoteCallbackList;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceSettingsXmsApiImpl extends a.AbstractBinderC0539a {

    @NotNull
    public static final String TAG = "DeviceSettingsXmsApiImpl";

    @NotNull
    private final RemoteCallbackList<c> mFindDeviceFromApplication = new RemoteCallbackList<>();

    @Override // com.xiaomi.fitness.devicesettings.xms.a
    public int checkDeviceConnectStatus(@Nullable String did) throws UnsupportedEncodingException {
        if (did == null || did.length() == 0) {
            return 0;
        }
        String strDecode = URLDecoder.decode(did, "UTF-8");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && Intrinsics.areEqual(wearableDeviceModel.getDid(), strDecode)) ? 1 : 0;
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.a
    @NotNull
    public String getDeviceBattery(@Nullable String did) throws UnsupportedEncodingException {
        if (did == null || did.length() == 0) {
            return "0";
        }
        String strDecode = URLDecoder.decode(did, "UTF-8");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && Intrinsics.areEqual(wearableDeviceModel.getDid(), strDecode)) ? String.valueOf(wearableDeviceModel.getDeviceInfo().getBattery()) : "0";
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.a
    public void jumpToMiHealthPage() {
        new DeviceSettingsXmsImpl().jumpToMainPage();
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.a
    public void startFindDevice(@Nullable String did, @Nullable b callback) throws RemoteException, UnsupportedEncodingException {
        String strDecode = URLDecoder.decode(did, "UTF-8");
        Logger.i(TAG, "startFindDevice");
        new DeviceSettingsXmsImpl().startFindDevice(strDecode, callback);
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.a
    public void stopFindDevice(@Nullable String did, @Nullable b callback) throws RemoteException, UnsupportedEncodingException {
        String strDecode = URLDecoder.decode(did, "UTF-8");
        Logger.i(TAG, "stopFindDevice");
        new DeviceSettingsXmsImpl().stopFindDevice(strDecode, callback);
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.a
    public void subscribeFindDevice(@Nullable String did, @Nullable c listener) {
        Logger.i(TAG, "subscribeFindDevice");
        this.mFindDeviceFromApplication.register(listener, "IFindDeviceFromApplication");
        this.mFindDeviceFromApplication.beginBroadcast();
        this.mFindDeviceFromApplication.finishBroadcast();
    }

    @Override // com.xiaomi.fitness.devicesettings.xms.a
    public void unsubscribeFindDevice(@Nullable String did) {
        Logger.i(TAG, "unsubscribeFindDevice");
        try {
            if (this.mFindDeviceFromApplication.getBroadcastItem(0) != null) {
                RemoteCallbackList<c> remoteCallbackList = this.mFindDeviceFromApplication;
                remoteCallbackList.unregister(remoteCallbackList.getBroadcastItem(0));
                this.mFindDeviceFromApplication.beginBroadcast();
                this.mFindDeviceFromApplication.finishBroadcast();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.i(TAG, "unsubscribeFindDevice RemoteException " + e.getMessage());
        }
    }

    public final void updateFindDeviceStatus(@NotNull String did, int status) {
        Intrinsics.checkNotNullParameter(did, "did");
        int iBeginBroadcast = this.mFindDeviceFromApplication.beginBroadcast();
        while (iBeginBroadcast > 0) {
            iBeginBroadcast--;
            try {
                IInterface broadcastItem = this.mFindDeviceFromApplication.getBroadcastItem(iBeginBroadcast);
                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                ((c) broadcastItem).U1(URLEncoder.encode(did, "UTF-8"), status);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        this.mFindDeviceFromApplication.finishBroadcast();
    }
}
