package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.net.wifi.ScanResult;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.Task;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes10.dex */
public class ComboDeviceManager {
    public static final String SHT_MIDEA_AIRCONDITION = "midea.aircondition.v1";
    private static HashMap<String, Future<String>> mFutureMap = new HashMap<>();

    private static boolean checkFuture(Future<String> future) {
        BluetoothLog.v(String.format("checkFuture %s", future));
        if (future != null) {
            BluetoothLog.v(String.format(">>> isCanceled = %b", Boolean.valueOf(future.isCancelled())));
            BluetoothLog.v(String.format(">>> isDone = %b", Boolean.valueOf(future.isDone())));
        }
        if (future != null && !future.isCancelled()) {
            try {
                if (!future.isDone()) {
                    return true;
                }
                BluetoothLog.v(String.format(">>> result = %s", future.get()));
                if (!TextUtils.isEmpty(future.get())) {
                    return true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static String getComboKey(String str, String str2) {
        String strReplace;
        int length;
        String deviceUid = str2 != null ? getDeviceUid(str2) : null;
        return ((deviceUid == null || deviceUid.length() != 4) && str != null && (length = (strReplace = str.replace(":", "")).length()) >= 4) ? strReplace.substring(length - 4) : deviceUid;
    }

    public static String getDeviceUid(ScanResult scanResult) {
        return getComboKey(scanResult.BSSID, scanResult.SSID);
    }

    private static String getModelBySSID(String str) {
        int iIndexOf = str.indexOf("_miio");
        if (iIndexOf > 1) {
            return str.substring(0, iIndexOf).replace('-', '.');
        }
        int iIndexOf2 = str.indexOf("_miap");
        if (iIndexOf2 > 1) {
            return str.substring(0, iIndexOf2).replace('-', '.');
        }
        int iIndexOf3 = str.indexOf("_mibt");
        if (iIndexOf3 > 1) {
            return str.substring(0, iIndexOf3).replace('-', '.');
        }
        int iIndexOf4 = str.indexOf("_midev");
        if (iIndexOf4 > 1) {
            return str.substring(0, iIndexOf4).replace('-', '.');
        }
        return (str.contains("midea_AC") || str.contains("midea_ac")) ? "midea.aircondition.v1" : "";
    }

    public static boolean isComboDevice(String str, String str2, String str3) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (strArrSplit = str3.split("\\:")) == null || strArrSplit.length != 6 || !str.equalsIgnoreCase(strArrSplit[4]) || !str2.equalsIgnoreCase(strArrSplit[5])) ? false : true;
    }

    public static Future<String> searchComboDeviceAsync(final ScanResult scanResult) {
        Future<String> future = mFutureMap.get(scanResult.BSSID);
        if (checkFuture(future)) {
            return future;
        }
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.ComboDeviceManager.1
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                return ComboDeviceManager.searchComboDeviceSync(scanResult);
            }
        });
        mFutureMap.put(scanResult.BSSID, futureTask);
        Task.executeDelayed(futureTask, AsyncTask.THREAD_POOL_EXECUTOR, 500L);
        return futureTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String searchComboDeviceSync(ScanResult scanResult) {
        String deviceUid = getDeviceUid(scanResult);
        MiJiaLog.writeLogOnGrey(LogType.BLUETOOTH, "BleComboStep", "searchComboDeviceSync kuailian device uid is " + deviceUid);
        final Bundle bundle = new Bundle();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        BluetoothApi.findComboMac(deviceUid, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.ComboDeviceManager.2
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle2) throws RemoteException {
                BluetoothMyLogger.v(String.format("ComboDeviceManager.searchComboDeviceSync onResponse %s, mac = (%s)", Code.toString(i), BluetoothMyLogger.getBase64(bundle2 != null ? bundle2.getString(IBluetoothService.EXTRA_MAC, "") : "")));
                if (i == 0 && bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bundle.getString(IBluetoothService.EXTRA_MAC, "");
    }

    public static String getDeviceUid(String str) {
        int iIndexOf = str.indexOf("_miio");
        if (iIndexOf > 0) {
            return str.substring(iIndexOf + 5);
        }
        int iIndexOf2 = str.indexOf("_miap");
        if (iIndexOf2 > 0) {
            return str.substring(iIndexOf2 + 5);
        }
        int iIndexOf3 = str.indexOf("_mibt");
        if (iIndexOf3 > 0) {
            return str.substring(iIndexOf3 + 5);
        }
        int iIndexOf4 = str.indexOf("_midev");
        if (iIndexOf4 > 0) {
            return str.substring(iIndexOf4 + 6);
        }
        if (getModelBySSID(str) != null) {
            return "";
        }
        int iIndexOf5 = str.indexOf("midea_ac_");
        return iIndexOf5 >= 0 ? str.substring(iIndexOf5 + 9) : str;
    }
}
