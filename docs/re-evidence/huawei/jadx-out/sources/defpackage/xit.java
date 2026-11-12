package defpackage;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.p2p.MessageParcel;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xit {
    public static int c(cqa cqaVar) {
        String strC = cqaVar.c();
        int iA = !TextUtils.isEmpty(strC) ? cpb.a(strC) : -1;
        LogUtil.b("P2pCommonUtil", "handleNum num is ", Integer.valueOf(iA));
        return iA;
    }

    public static List<cqa> a(byte[] bArr) {
        String strD = cph.d(bArr);
        if (TextUtils.isEmpty(strD) || strD.length() < 4) {
            LogUtil.e("P2pCommonUtil", "info data is error");
            return null;
        }
        String strSubstring = strD.substring(4);
        LogUtil.c("P2pCommonUtil", "tlvsString is ", strSubstring);
        try {
            return new cqe().a(strSubstring).b();
        } catch (cpy unused) {
            LogUtil.d("P2pCommonUtil", "getResponseTlvFather TlvException");
            return null;
        }
    }

    public static List<cqa> d(byte[] bArr) {
        String strD = cph.d(bArr);
        if (TextUtils.isEmpty(strD) || strD.length() < 4) {
            LogUtil.e("P2pCommonUtil", "info data is error");
            return null;
        }
        LogUtil.c("P2pCommonUtil", "tlvsString is ", strD);
        try {
            return new cqe().a(strD).b();
        } catch (cpy unused) {
            LogUtil.d("P2pCommonUtil", "getResponseTlvListWithHead TlvException");
            return null;
        }
    }

    public static MessageParcel e(xiu xiuVar) {
        File fileE;
        if (xiuVar == null) {
            return null;
        }
        MessageParcel messageParcel = new MessageParcel();
        int iC = xiuVar.c();
        messageParcel.setType(iC);
        messageParcel.setEnableEncrypt(xiuVar.h());
        messageParcel.setPrior(xiuVar.d());
        if (iC == 1) {
            messageParcel.setData(xiuVar.b());
        } else if (iC == 2 && (fileE = xiuVar.e()) != null) {
            try {
                messageParcel.setParcelFileDescriptor(ParcelFileDescriptor.open(fileE, 268435456));
            } catch (FileNotFoundException unused) {
                LogUtil.d("P2pCommonUtil", "convertToMessageParcel FileNotFoundException");
            }
            messageParcel.setFileName(fileE.getName());
            messageParcel.setDescription(xiuVar.a());
            messageParcel.setFileSha256(xhw.e(fileE));
        }
        return messageParcel;
    }

    public static UniteDevice e(String str) {
        List<DeviceInfo> deviceMgrList = xgt.b().getDeviceMgrList(1, str);
        UniteDevice uniteDeviceE = (deviceMgrList == null || deviceMgrList.isEmpty()) ? null : e(deviceMgrList.get(0));
        LogUtil.b("P2pCommonUtil", "uniteDevice is null ", Boolean.valueOf(uniteDeviceE == null));
        return uniteDeviceE;
    }

    public static UniteDevice e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return null;
        }
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo2 = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo2.setDeviceBtType(deviceInfo.getDeviceBluetoothType());
        deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
        deviceInfo2.setDeviceMac(deviceInfo.getDeviceIdentify());
        deviceInfo2.setDeviceType(deviceInfo.getProductType());
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.build(deviceInfo2.getDeviceMac(), deviceInfo2, null);
        return uniteDevice;
    }
}
