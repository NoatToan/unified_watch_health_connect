package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.monitor.EnumMonitorType;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yli {
    public static DeviceCommand a(String str) {
        byte b2;
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "wearStatus":
                b2 = 0;
                break;
            case "sportStatus":
                b2 = 1;
                break;
            case "powerStatus":
                b2 = 2;
                break;
            case "sleepStatus":
                b2 = 3;
                break;
            case "chargeStatus":
                b2 = 4;
                break;
            case "userAvailableKbytes":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(46);
            deviceCommand.setCommandID(3);
            StringBuilder sb = new StringBuilder(16);
            sb.append(eeq.d(1));
            sb.append(eeq.d(0));
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            deviceCommand.setNeedAck(true);
            return deviceCommand;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                DeviceCommand deviceCommand2 = new DeviceCommand();
                deviceCommand2.setServiceID(1);
                deviceCommand2.setCommandID(8);
                StringBuilder sb2 = new StringBuilder(16);
                sb2.append(eeq.d(1));
                sb2.append(eeq.d(0));
                deviceCommand2.setDataLen(sb2.length() / 2);
                deviceCommand2.setDataContent(eeq.c(sb2.toString()));
                return deviceCommand2;
            }
            if (b2 != 3 && b2 != 4 && b2 != 5) {
                LogUtil.e("WearEngine_MonitorMessageUtil", "not supported eventType", str);
                return null;
            }
        }
        int valueByDesc = EnumMonitorType.getValueByDesc(str);
        if (valueByDesc == -1) {
            return null;
        }
        DeviceCommand deviceCommand3 = new DeviceCommand();
        deviceCommand3.setServiceID(53);
        deviceCommand3.setCommandID(2);
        byte[] bArrC = eeq.c(e(4, valueByDesc));
        deviceCommand3.setDataLength(bArrC.length);
        deviceCommand3.setDataContent(bArrC);
        return deviceCommand3;
    }

    public static DeviceCommand d(int i, String str) {
        DeviceCommand deviceCommand = new DeviceCommand();
        int valueByDesc = EnumMonitorType.getValueByDesc(str);
        if (valueByDesc == -1) {
            return null;
        }
        deviceCommand.setServiceID(53);
        deviceCommand.setCommandID(2);
        byte[] bArrC = eeq.c(e(i, valueByDesc));
        deviceCommand.setDataLength(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        return deviceCommand;
    }

    private static String e(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        String strD = eeq.d(1);
        String strD2 = eeq.d(i);
        String strD3 = eeq.d(strD2.length() / 2);
        sb.append(strD);
        sb.append(strD3);
        sb.append(strD2);
        LogUtil.d("WearEngine_MonitorMessageUtil", "getCommandTlv subCmd is:", sb.toString());
        String strD4 = eeq.d(2);
        String strD5 = eeq.d(i2);
        String strD6 = eeq.d(strD5.length() / 2);
        sb.append(strD4);
        sb.append(strD6);
        sb.append(strD5);
        LogUtil.d("WearEngine_MonitorMessageUtil", "getCommandTlv messageBody is:", sb.toString());
        return sb.toString();
    }

    public static int a(byte[] bArr, int i) {
        try {
            String strE = eeq.e(bArr);
            LogUtil.a("WearEngine_MonitorMessageUtil", "Received message is:", strE);
            if (!TextUtils.isEmpty(strE) && strE.length() >= 4) {
                List<eew> listE = new eet().b(strE.substring(4)).e();
                if (listE != null && listE.size() != 0) {
                    for (eew eewVar : listE) {
                        int iV = CommonUtil.v(eewVar.e());
                        if (iV == 1) {
                            i = CommonUtil.v(eewVar.b());
                            LogUtil.a("WearEngine_MonitorMessageUtil", "original result is:", Integer.valueOf(i));
                        } else if (iV != 127) {
                            LogUtil.j("WearEngine_MonitorMessageUtil", "no support tag");
                        } else {
                            LogUtil.j("WearEngine_MonitorMessageUtil", "errorCode is: ", Integer.valueOf(CommonUtil.v(eewVar.b())));
                        }
                    }
                    return i;
                }
                LogUtil.j("WearEngine_MonitorMessageUtil", "tlvList is error.");
                return i;
            }
            LogUtil.j("WearEngine_MonitorMessageUtil", "tlvString is error.");
            return i;
        } catch (eeu | NumberFormatException unused) {
            LogUtil.e("WearEngine_MonitorMessageUtil", "parse status result Exception");
            return i;
        }
    }
}
