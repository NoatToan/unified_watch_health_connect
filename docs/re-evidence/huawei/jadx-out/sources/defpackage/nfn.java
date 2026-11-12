package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nfn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f43063b = {"android.permission.SEND_SMS"};

    public static void c(byte[] bArr, DeviceInfo deviceInfo) {
        int iB = b(bArr);
        if (iB == 0) {
            return;
        }
        int i = ((iB & 1) == 1 && lsg.d(BaseApplication.getContext(), f43063b)) ? 1 : 0;
        LogUtil.a("PermissionQueryUtils", "parseQueryPermissionStatus queryType: ", Integer.valueOf(iB), " result: ", Integer.valueOf(i));
        b(iB, i, deviceInfo);
    }

    private static void b(int i, int i2, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(56);
        byte[] bArrE = new cqj().i(1, i).i(2, i2).e();
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private static int b(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            LogUtil.j("PermissionQueryUtils", "parseCommandPackage resultDataHex is empty");
            return 0;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4, strE.length())).e();
            if (listE == null || listE.isEmpty()) {
                LogUtil.j("PermissionQueryUtils", "parseCommandPackage tlvList is empty");
                return 0;
            }
            eew eewVar = listE.get(0);
            if (eewVar == null) {
                LogUtil.j("PermissionQueryUtils", "parseCommandPackage tlv is null");
                return 0;
            }
            if (CommonUtil.b(eewVar.e(), 16) != 1) {
                LogUtil.j("PermissionQueryUtils", "parseCommandPackage type is invalid");
                return 0;
            }
            return CommonUtil.b(eewVar.b(), 16);
        } catch (eeu unused) {
            LogUtil.e("PermissionQueryUtils", "parseCommandPackage TlvException");
            return 0;
        }
    }
}
