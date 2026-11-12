package com.xiaomi.fitness.main.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\n\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/main/utils/BluetoothHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getPairedAndConnectedAudioDevices", "", "callback", "Lcom/xiaomi/fitness/main/utils/BluetoothHelper$BluetoothDevicesCallback;", "isTargetDeviceConnected", "Lkotlin/Function1;", "", "Companion", "BluetoothDevicesCallback", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBluetoothHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothHelper.kt\ncom/xiaomi/fitness/main/utils/BluetoothHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n774#2:148\n865#2,2:149\n*S KotlinDebug\n*F\n+ 1 BluetoothHelper.kt\ncom/xiaomi/fitness/main/utils/BluetoothHelper\n*L\n47#1:148\n47#1:149,2\n*E\n"})
public final class BluetoothHelper {

    @NotNull
    private static final String TAG = "BluetoothHelper";

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/main/utils/BluetoothHelper$BluetoothDevicesCallback;", "", "onDevicesReady", "", "devices", "", "Landroid/bluetooth/BluetoothDevice;", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BluetoothDevicesCallback {
        void onDevicesReady(@NotNull List<BluetoothDevice> devices);
    }

    public BluetoothHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void getPairedAndConnectedAudioDevices(final BluetoothDevicesCallback callback) {
        final BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter(...)");
        final ArrayList arrayList = new ArrayList();
        if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.BLUETOOTH_CONNECT") != 0) {
            Logger.i(TAG, "permission denied");
            callback.onDevicesReady(CollectionsKt__CollectionsKt.emptyList());
            return;
        }
        Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
        Intrinsics.checkNotNullExpressionValue(bondedDevices, "getBondedDevices(...)");
        final ArrayList arrayList2 = new ArrayList();
        for (Object obj : bondedDevices) {
            int deviceClass = ((BluetoothDevice) obj).getBluetoothClass().getDeviceClass();
            if (deviceClass == 1048 || deviceClass == 1028 || deviceClass == 1056 || deviceClass == 1032 || deviceClass == 1064 || deviceClass == 1044 || deviceClass == 1052) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            defaultAdapter.getProfileProxy(this.context, new BluetoothProfile.ServiceListener() { // from class: com.xiaomi.fitness.main.utils.BluetoothHelper.getPairedAndConnectedAudioDevices.1
                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceConnected(int profile, BluetoothProfile proxy) {
                    Intrinsics.checkNotNullParameter(proxy, "proxy");
                    Logger.i(BluetoothHelper.TAG, "onServiceConnected");
                    List<BluetoothDevice> list = arrayList2;
                    List<BluetoothDevice> list2 = arrayList;
                    for (BluetoothDevice bluetoothDevice : list) {
                        if (proxy.getConnectedDevices().contains(bluetoothDevice)) {
                            Logger.i(BluetoothHelper.TAG, "device " + bluetoothDevice.getAddress() + " is connected");
                            Intrinsics.checkNotNull(bluetoothDevice);
                            list2.add(bluetoothDevice);
                        }
                    }
                    defaultAdapter.closeProfileProxy(profile, proxy);
                    callback.onDevicesReady(arrayList);
                }

                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceDisconnected(int profile) {
                    Logger.i(BluetoothHelper.TAG, "onServiceDisconnected");
                    callback.onDevicesReady(CollectionsKt__CollectionsKt.emptyList());
                }
            }, 2);
        } else {
            Logger.i(TAG, "pairedDevices is empty");
            callback.onDevicesReady(CollectionsKt__CollectionsKt.emptyList());
        }
    }

    public final void isTargetDeviceConnected(@NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getPairedAndConnectedAudioDevices(new BluetoothDevicesCallback() { // from class: com.xiaomi.fitness.main.utils.BluetoothHelper.isTargetDeviceConnected.1
            @Override // com.xiaomi.fitness.main.utils.BluetoothHelper.BluetoothDevicesCallback
            public void onDevicesReady(List<BluetoothDevice> devices) {
                AudioDeviceInfo[] devices2;
                AudioDeviceInfo[] audioDeviceInfoArr;
                Intrinsics.checkNotNullParameter(devices, "devices");
                Logger.i(BluetoothHelper.TAG, "onDevicesReady");
                if (devices.isEmpty()) {
                    Logger.i(BluetoothHelper.TAG, "devices is empty");
                    callback.invoke2("");
                    return;
                }
                if (Build.VERSION.SDK_INT < 34) {
                    Function1<String, Unit> function1 = callback;
                    int i = 0;
                    for (Object obj : devices) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                        if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                            function1.invoke2("");
                        } else {
                            if (bluetoothDevice.getBluetoothClass().getDeviceClass() == 1048 || bluetoothDevice.getBluetoothClass().getDeviceClass() == 1028 || bluetoothDevice.getBluetoothClass().getDeviceClass() == 1028 || bluetoothDevice.getBluetoothClass().getDeviceClass() == 1056 || bluetoothDevice.getBluetoothClass().getDeviceClass() == 1032 || bluetoothDevice.getBluetoothClass().getDeviceClass() == 1064 || bluetoothDevice.getBluetoothClass().getDeviceClass() == 1044 || bluetoothDevice.getBluetoothClass().getDeviceClass() == 1052) {
                                Logger.i(BluetoothHelper.TAG, "active device " + i);
                                if (i > -1) {
                                    Logger.i(BluetoothHelper.TAG, "connectedIndex " + i + ", devices[connectedIndex].address " + devices.get(i).getAddress());
                                    String address = devices.get(i).getAddress();
                                    Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
                                    function1.invoke2(address);
                                } else {
                                    function1.invoke2("");
                                }
                            }
                            i = i2;
                        }
                        i = i2;
                    }
                    return;
                }
                Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager == null || (devices2 = audioManager.getDevices(2)) == null) {
                    return;
                }
                Function1<String, Unit> function2 = callback;
                int length = devices2.length;
                int i3 = 0;
                while (i3 < length) {
                    AudioDeviceInfo audioDeviceInfo = devices2[i3];
                    if (audioDeviceInfo.getType() == 8) {
                        Iterator<BluetoothDevice> it = devices.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                audioDeviceInfoArr = devices2;
                                i4 = -1;
                                break;
                            }
                            BluetoothDevice next = it.next();
                            String address2 = next.getAddress();
                            audioDeviceInfoArr = devices2;
                            StringBuilder sb = new StringBuilder();
                            Iterator<BluetoothDevice> it2 = it;
                            sb.append("device address ");
                            sb.append(address2);
                            Logger.i(BluetoothHelper.TAG, sb.toString());
                            if (Intrinsics.areEqual(next.getAddress(), audioDeviceInfo.getAddress())) {
                                break;
                            }
                            i4++;
                            devices2 = audioDeviceInfoArr;
                            it = it2;
                        }
                        Logger.i(BluetoothHelper.TAG, "active device " + i4);
                        if (i4 > -1) {
                            Logger.i(BluetoothHelper.TAG, "connectedIndex " + i4 + ", devices[connectedIndex].address " + devices.get(i4).getAddress());
                            String address3 = devices.get(i4).getAddress();
                            Intrinsics.checkNotNullExpressionValue(address3, "getAddress(...)");
                            function2.invoke2(address3);
                        } else {
                            function2.invoke2("");
                        }
                    } else {
                        audioDeviceInfoArr = devices2;
                    }
                    i3++;
                    devices2 = audioDeviceInfoArr;
                }
            }
        });
    }
}
