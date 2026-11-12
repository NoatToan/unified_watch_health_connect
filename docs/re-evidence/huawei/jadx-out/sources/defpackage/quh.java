package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class quh {
    public static void d(String str, List<rbg> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.d("CommandUtils", "sendUserSettingCommand list is null or empty");
            return;
        }
        lvb lvbVarE = lvb.e();
        DeviceCommand deviceCommandE = e(str, list);
        if (deviceCommandE == null || lvbVarE == null) {
            return;
        }
        lvbVarE.c(deviceCommandE);
        LogUtil.a("CommandUtils", "sendUserSettingCommand" + deviceCommandE.toString());
    }

    private static DeviceCommand e(String str, List<rbg> list) {
        String strC = c(list);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.d("CommandUtils", "commandHex is null or empty string");
            return null;
        }
        LogUtil.a("CommandUtils", "getDeviceCommand commanHex:" + strC);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setmIdentify(str);
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(48);
        deviceCommand.setDataContent(eeq.c(strC));
        deviceCommand.setDataLen(eeq.c(strC).length);
        return deviceCommand;
    }

    private static String c(List<rbg> list) {
        StringBuilder sb = new StringBuilder(16);
        if (list != null && list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (rbg rbgVar : list) {
                if (rbgVar != null && !TextUtils.isEmpty(rbgVar.c()) && !d(rbgVar.c())) {
                    String strA = eeq.a(rbgVar.c());
                    String str = eeq.d(3) + eeq.d(strA.length() / 2) + strA;
                    String strD = eeq.d(rbgVar.i() ? 1 : 0);
                    String str2 = eeq.d(4) + eeq.d(strD.length() / 2) + strD;
                    String strA2 = eeq.a(rbgVar.h());
                    String str3 = eeq.d(5) + eeq.d(strA2.length() / 2) + strA2;
                    String strA3 = eeq.a(String.valueOf(jCurrentTimeMillis));
                    String str4 = str + str2 + str3 + (eeq.d(6) + eeq.d(strA3.length() / 2) + strA3);
                    sb.append(eeq.d(130) + eeq.d(str4.length() / 2) + str4);
                }
            }
            String str5 = eeq.d(129) + eeq.b(sb.length() / 2);
            if (sb.length() > 0) {
                sb.insert(0, str5);
            }
        } else {
            sb.append(eeq.d(129) + eeq.d(0));
        }
        return sb.toString();
    }

    private static boolean d(String str) {
        for (String str2 : qug.c()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
