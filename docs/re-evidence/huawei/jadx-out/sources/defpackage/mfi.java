package defpackage;

import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mfi {
    public static void a(int i, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.e("ServiceCallback", "Enter registerNotificationCallback method. serviceId : ", Integer.valueOf(i));
        if (iBaseResponseCallback == null) {
            LogUtil.e("ServiceCallback", "registerNotificationCallback callback is null");
        } else {
            lvk.e(i, new BluetoothDataReceiveCallback() { // from class: mfi.3
                @Override // com.huawei.callback.BluetoothDataReceiveCallback
                public void onDataReceived(int i2, DeviceInfo deviceInfo, byte[] bArr) {
                    if (bArr.length > 1) {
                        LogUtil.a("ServiceCallback", "FAQ onResponse recv bt bytes" + eeq.e(bArr));
                        byte b2 = bArr[1];
                        if (b2 == 7) {
                            int iD = mfi.d(bArr);
                            LogUtil.a("ServiceCallback", "FAQ onResponse resCode = " + iD);
                            if (iD == 100000) {
                                iBaseResponseCallback.a(0, Integer.valueOf(iD));
                                return;
                            } else {
                                iBaseResponseCallback.a(iD, Integer.valueOf(iD));
                                return;
                            }
                        }
                        if (b2 == 8) {
                            int iD2 = mfi.d(bArr);
                            LogUtil.a("ServiceCallback", "wear push onResponse resCodeWear = " + iD2);
                            if (iD2 == 100000) {
                                iBaseResponseCallback.a(0, Integer.valueOf(iD2));
                                return;
                            } else {
                                iBaseResponseCallback.a(iD2, Integer.valueOf(iD2));
                                return;
                            }
                        }
                        LogUtil.a("ServiceCallback", "enter mNotificationServiceCallback default branch");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE.length() < 9) {
            LogUtil.j("ServiceCallback", "messageHex length is illegal");
            return 0;
        }
        return CommonUtil.v(strE.substring(8));
    }
}
