package com.huawei.health.ecologydevice.connectivity;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.efx;
import defpackage.ega;
import defpackage.etn;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ScanFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MatchRule f6480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6481c;
    private String[] d = {"0000180d-0000-1000-8000-00805f9b34fb"};
    private String[] e;

    public enum MatchRule {
        STRICT,
        INCLUSIVE,
        FRONT,
        REAR
    }

    private ScanFilter(String str, String str2, MatchRule matchRule) {
        if (str != null) {
            this.e = str.split(";");
        }
        this.f6481c = str2;
        this.f6480b = matchRule;
    }

    public boolean c(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        try {
            String[] strArr = this.e;
            if (strArr == null || strArr.length <= 0) {
                return !TextUtils.isEmpty(this.f6481c) && this.f6481c.equals(bluetoothDevice.getAddress());
            }
            String name = bluetoothDevice.getName();
            if (name != null) {
                return b(name);
            }
            return false;
        } catch (SecurityException e) {
            LogUtil.e("ScanFilter", "matches SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    public boolean c(efx efxVar) {
        if (efxVar == null) {
            return false;
        }
        String[] strArr = this.e;
        if (strArr == null || strArr.length <= 0) {
            return !TextUtils.isEmpty(this.f6481c) && this.f6481c.equals(efxVar.getAddress());
        }
        String deviceName = efxVar.getDeviceName();
        if (deviceName != null) {
            return b(deviceName);
        }
        return false;
    }

    public boolean b(byte[] bArr) {
        String[] strArr = this.e;
        if (strArr != null && bArr.length > 0) {
            for (String str : strArr) {
                if ("moredevice".equals(str) && etn.a(this.f6481c) == HealthDevice.HealthDeviceKind.HDK_HEART_RATE) {
                    return ega.a(bArr, UUID.fromString(this.d[0]));
                }
            }
        }
        return false;
    }

    public boolean b(String str) {
        String[] strArr;
        if (!TextUtils.isEmpty(str) && (strArr = this.e) != null) {
            for (String str2 : strArr) {
                LogUtil.d("ScanFilter", "isDeviceNameMatched ScanFilter target name is ", str2, " and device name is ", str);
                if (this.f6480b == MatchRule.STRICT) {
                    if (str.equals(str2)) {
                        return true;
                    }
                } else if (this.f6480b == MatchRule.FRONT) {
                    if (str.startsWith(str2)) {
                        return true;
                    }
                } else if (this.f6480b == MatchRule.INCLUSIVE) {
                    if (str.contains(str2)) {
                        return true;
                    }
                } else if (this.f6480b == MatchRule.REAR && str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ScanFilter c(String str, String str2, MatchRule matchRule) {
        return new ScanFilter(str, str2, matchRule);
    }
}
