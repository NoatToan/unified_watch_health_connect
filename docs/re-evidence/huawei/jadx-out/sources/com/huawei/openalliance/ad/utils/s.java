package com.huawei.openalliance.ad.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.common.Constant;
import com.huawei.openalliance.ad.beans.metadata.BluetoothInfo;
import com.huawei.openalliance.ad.hw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class s {

    public interface a {
        void a(List<BluetoothInfo> list, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(a aVar, List<BluetoothInfo> list) {
        a(aVar, list, bm.a(list) ? 3 : 0);
    }

    private static void a(a aVar, List<BluetoothInfo> list, int i) {
        if (aVar != null) {
            try {
                Collections.sort(list);
            } catch (Throwable th) {
                hw.c("BluetoothUtils", "sort bluetoothInfos exception: %s", th.getClass().getSimpleName());
            }
            aVar.a(list, i);
        }
    }

    public static void a(Context context, final a aVar) {
        int i;
        final ArrayList arrayList = new ArrayList();
        if (context == null) {
            i = 4;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (cj.a(applicationContext)) {
                final HashMap map = new HashMap();
                try {
                    final BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                        Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
                        if (bm.a(bondedDevices)) {
                            a(aVar, arrayList, 3);
                            return;
                        }
                        for (BluetoothDevice bluetoothDevice : bondedDevices) {
                            if (bluetoothDevice != null) {
                                BluetoothInfo bluetoothInfo = new BluetoothInfo();
                                bluetoothInfo.a(bluetoothDevice.getName());
                                bluetoothInfo.b(bluetoothDevice.getAddress());
                                arrayList.add(bluetoothInfo);
                                map.put(bluetoothInfo.a(), bluetoothInfo);
                            }
                        }
                        int iA = a(defaultAdapter);
                        hw.b("BluetoothUtils", "BluetoothProfile: %s", Integer.valueOf(iA));
                        if (iA == -1) {
                            b(aVar, arrayList);
                            return;
                        } else {
                            defaultAdapter.getProfileProxy(applicationContext, new BluetoothProfile.ServiceListener() { // from class: com.huawei.openalliance.ad.utils.s.1
                                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                                public void onServiceDisconnected(int i2) {
                                    hw.b("BluetoothUtils", "onServiceDisconnected");
                                    s.b(aVar, arrayList);
                                }

                                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                                public void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
                                    BluetoothInfo bluetoothInfo2;
                                    try {
                                        hw.b("BluetoothUtils", Constant.SERVICE_CONNECT_MESSAGE);
                                        List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
                                        if (!bm.a(connectedDevices)) {
                                            for (BluetoothDevice bluetoothDevice2 : connectedDevices) {
                                                if (bluetoothDevice2 != null) {
                                                    String address = bluetoothDevice2.getAddress();
                                                    if (!TextUtils.isEmpty(address) && (bluetoothInfo2 = (BluetoothInfo) map.get(address)) != null) {
                                                        bluetoothInfo2.a((Integer) 1);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        hw.c("BluetoothUtils", "onServiceConnected exception: %s", th.getClass().getSimpleName());
                                    }
                                    defaultAdapter.closeProfileProxy(i2, bluetoothProfile);
                                    s.b(aVar, arrayList);
                                }
                            }, iA);
                            return;
                        }
                    }
                    hw.b("BluetoothUtils", "bluetooth service is unavailable");
                    a(aVar, arrayList, 2);
                    return;
                } catch (Throwable th) {
                    hw.c("BluetoothUtils", "getBondedBluetoothDevices exception: %s", th.getClass().getSimpleName());
                    a(aVar, arrayList, 5);
                    return;
                }
            }
            hw.b("BluetoothUtils", "missing permissions");
            i = 1;
        }
        a(aVar, arrayList, i);
    }

    public static List<BluetoothInfo> a(List<BluetoothInfo> list) {
        if (!bm.a(list)) {
            for (BluetoothInfo bluetoothInfo : list) {
                if (bluetoothInfo != null) {
                    bluetoothInfo.b("");
                }
            }
        }
        return list;
    }

    private static int a(BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter.getProfileConnectionState(2) == 2) {
            return 2;
        }
        return bluetoothAdapter.getProfileConnectionState(1) == 2 ? 1 : -1;
    }
}
