package com.xiaomi.fitness.aivs.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.common.Scopes;
import com.xiaomi.fitness.aivs.bluetooth.SpeechSynthesizerCapabilityImpl$blueHeadsetListener$1;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/xiaomi/fitness/aivs/bluetooth/SpeechSynthesizerCapabilityImpl$blueHeadsetListener$1", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "onServiceConnected", "", Scopes.PROFILE, "", "proxy", "Landroid/bluetooth/BluetoothProfile;", "onServiceDisconnected", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeechSynthesizerCapabilityImpl$blueHeadsetListener$1 implements BluetoothProfile.ServiceListener {
    final /* synthetic */ SpeechSynthesizerCapabilityImpl this$0;

    public SpeechSynthesizerCapabilityImpl$blueHeadsetListener$1(SpeechSynthesizerCapabilityImpl speechSynthesizerCapabilityImpl) {
        this.this$0 = speechSynthesizerCapabilityImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onServiceConnected$lambda$0(SpeechSynthesizerCapabilityImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String mac = wearableDeviceModel != null ? DeviceModelExtKt.getMac(wearableDeviceModel) : null;
        Object systemService = ApplicationExtKt.getApplication().getSystemService("bluetooth");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothDevice remoteDevice = ((BluetoothManager) systemService).getAdapter().getRemoteDevice(mac);
        Intrinsics.checkNotNullExpressionValue(remoteDevice, "getRemoteDevice(...)");
        BluetoothHeadset bluetoothHeadset = this$0.bluetoothHeadset;
        Logger.i("SpeechSynthesizerCapabilityImpl", "startVoiceRecognition result:" + (bluetoothHeadset != null ? Boolean.valueOf(bluetoothHeadset.startVoiceRecognition(remoteDevice)) : null));
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int profile, BluetoothProfile proxy) {
        List<BluetoothDevice> arrayList;
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Logger.i("SpeechSynthesizerCapabilityImpl", "onServiceConnected profile = " + profile + " isStart:" + this.this$0.getIsStart());
        if (profile == 1) {
            this.this$0.bluetoothHeadset = (BluetoothHeadset) proxy;
        }
        if (Build.VERSION.SDK_INT < 31) {
            BluetoothHeadset bluetoothHeadset = this.this$0.bluetoothHeadset;
            if (bluetoothHeadset == null || (arrayList = bluetoothHeadset.getConnectedDevices()) == null) {
                arrayList = new ArrayList<>();
            }
        } else {
            if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                Logger.i("SpeechSynthesizerCapabilityImpl", "BLUETOOTH_CONNECT permission is not granted, return");
                return;
            }
            BluetoothHeadset bluetoothHeadset2 = this.this$0.bluetoothHeadset;
            if (bluetoothHeadset2 == null || (arrayList = bluetoothHeadset2.getConnectedDevices()) == null) {
                arrayList = new ArrayList<>();
            }
        }
        Iterator<BluetoothDevice> it = arrayList.iterator();
        while (it.hasNext()) {
            Logger.i("SpeechSynthesizerCapabilityImpl", "onServiceConnected   device:" + it.next().getAddress());
        }
        if (this.this$0.getIsStart()) {
            Handler handler = this.this$0.getHandler();
            final SpeechSynthesizerCapabilityImpl speechSynthesizerCapabilityImpl = this.this$0;
            handler.postDelayed(new Runnable() { // from class: w5n
                @Override // java.lang.Runnable
                public final void run() {
                    SpeechSynthesizerCapabilityImpl$blueHeadsetListener$1.onServiceConnected$lambda$0(speechSynthesizerCapabilityImpl);
                }
            }, 200L);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int profile) {
        Logger.i("SpeechSynthesizerCapabilityImpl", "onServiceDisconnected profile = " + profile);
        if (profile == 1) {
            this.this$0.bluetoothHeadset = null;
            this.this$0.stop();
        }
    }
}
