package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mla {
    public static boolean b(String str) {
        ees eesVarE = e(str);
        if (eesVarE == null) {
            LogUtil.j("VariableHandshakeUtils", "checkResponseCode tlvFather is null");
            return false;
        }
        List<eew> listE = eesVarE.e();
        if (listE.size() <= 0) {
            return true;
        }
        try {
            return e(listE, CommonUtil.v(listE.get(0).e()));
        } catch (NumberFormatException unused) {
            LogUtil.a("VariableHandshakeUtils", "checkResponseCode NumberFormatException");
            return false;
        }
    }

    private static boolean e(List<eew> list, int i) {
        if (i != 127) {
            return true;
        }
        try {
            int iV = CommonUtil.v(list.get(0).b());
            if (iV == 100000) {
                return true;
            }
            LogUtil.a("VariableHandshakeUtils", "error code = " + iV);
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.a("VariableHandshakeUtils", "NumberFormatException");
            return false;
        }
    }

    public static ees e(String str) {
        if (str == null) {
            LogUtil.j("VariableHandshakeUtils", "praseDataToTlvFormart dataStrInfo is null");
            return null;
        }
        try {
            return new eet().b(str.substring(4, str.length()));
        } catch (eeu unused) {
            LogUtil.a("VariableHandshakeUtils", "tlv resolve exception.");
            return null;
        }
    }

    public static void c(UniteDevice uniteDevice, int i) {
        if (uniteDevice == null) {
            LogUtil.j("VariableHandshakeUtils", "device is null");
            return;
        }
        DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
        if (deviceInfo == null) {
            LogUtil.j("VariableHandshakeUtils", "sendConnectStateBroadcast deviceInfo is null");
            return;
        }
        deviceInfo.setDeviceConnectState(i);
        com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfoC = cox.c(uniteDevice);
        String strA = mkl.d().a(uniteDevice.getIdentify());
        deviceInfoC.setRelationship(strA);
        Intent intentE = e(deviceInfoC);
        LogUtil.j("VariableHandshakeUtils", "sendConnectStateBroadcast connectState is: ", Integer.valueOf(i), " deviceRelation: ", strA);
        BaseApplication.getContext().sendOrderedBroadcast(intentE, LocalBroadcast.f36595c);
    }

    public static Intent e(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        LogUtil.a("VariableHandshakeUtils", "Enter createDeviceStateIntent.");
        Intent intent = new Intent("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intent.setExtrasClassLoader(com.huawei.health.devicemgr.business.entity.DeviceInfo.class.getClassLoader());
        Bundle bundle = new Bundle();
        bundle.putParcelable("deviceinfo", deviceInfo);
        intent.putExtras(bundle);
        return intent;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str2 == null || str2.length() < 4) {
            LogUtil.e("VariableHandshakeUtils", "isCurrentOobeCommand: parameter is invalid.");
            return false;
        }
        String strSubstring = str2.substring(0, 4);
        LogUtil.a("VariableHandshakeUtils", "isCurrentOobeCommand: replyCommand is: ", strSubstring);
        return str.equals(strSubstring);
    }
}
