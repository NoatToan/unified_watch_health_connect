package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import health.compact.a.CommonUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mrs {
    public static DeviceCommand c(mrk mrkVar) {
        StringBuilder sb = new StringBuilder(c(mrkVar.n(), mrkVar.p(), mrkVar.q()));
        String strA = eeq.a(mrkVar.ac());
        String str = eeq.d(8) + eeq.b(strA.length() / 2) + strA;
        String strA2 = eeq.a(mrkVar.f());
        String str2 = eeq.d(9) + eeq.b(strA2.length() / 2) + strA2;
        String strA3 = eeq.a(mrkVar.e());
        String str3 = eeq.d(10) + eeq.b(strA3.length() / 2) + strA3;
        String strA4 = eeq.a(mrkVar.v());
        String str4 = eeq.d(11) + eeq.b(strA4.length() / 2) + strA4;
        String strA5 = eeq.a(mrkVar.i());
        String str5 = eeq.d(12) + eeq.b(strA5.length() / 2) + strA5;
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(40);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setDataLen(eeq.c(sb.toString()).length);
        deviceCommand.setNeedAck(true);
        LogUtil.a("CommonFile_CommandUtils", "getStartSendCommand deviceCommand:", deviceCommand.toString());
        return deviceCommand;
    }

    public static String c(String str, long j, int i) {
        String strA = eeq.a(str);
        return (eeq.d(1) + eeq.b(strA.length() / 2) + strA) + (eeq.d(2) + eeq.d(4) + eeq.c(j)) + (eeq.d(3) + eeq.d(1) + eeq.d(i));
    }

    public static int b(int i, String str, mrk mrkVar) {
        LogUtil.a("CommonFile_CommandUtils", "handleAppPackageNameTlv type: ", Integer.valueOf(i));
        if (i == 8) {
            mrkVar.g(eeq.d(str));
            return 0;
        }
        if (i == 9) {
            mrkVar.d(eeq.d(str));
            return 0;
        }
        if (i == 11) {
            mrkVar.i(eeq.d(str));
            return 0;
        }
        if (i == 12) {
            mrkVar.a(eeq.d(str));
            return 0;
        }
        if (i != 127) {
            return 0;
        }
        return CommonUtil.v(str);
    }

    public static void c(int i, String str, mrk mrkVar) {
        if (i == 1) {
            String strD = eeq.d(str);
            mrkVar.b(strD);
            LogUtil.a("CommonFile_CommandUtils", "handleAppFileMessageTlv file_name :", strD);
        } else if (i == 3) {
            int iV = CommonUtil.v(str);
            mrkVar.f(iV);
            LogUtil.a("CommonFile_CommandUtils", "handleAppFileMessageTlv file_type :", Integer.valueOf(iV));
        } else {
            if (i != 4) {
                LogUtil.j("CommonFile_CommandUtils", "handleAppFileMessageTlv default");
                return;
            }
            int iV2 = CommonUtil.v(str);
            mrkVar.a(iV2);
            LogUtil.a("CommonFile_CommandUtils", "handleAppFileMessageTlv file_id :", Integer.valueOf(iV2));
        }
    }

    public static int d(int i, mrk mrkVar, String str) {
        if (i == 127) {
            int iV = CommonUtil.v(str);
            LogUtil.a("CommonFile_CommandUtils", "handleRequestPackageNameTlv error code:", Integer.valueOf(iV));
            return iV;
        }
        switch (i) {
            case 7:
                String strD = eeq.d(str);
                mrkVar.g(strD);
                LogUtil.a("CommonFile_CommandUtils", "handleRequestPackageNameTlv source:", strD);
                return 0;
            case 8:
                String strD2 = eeq.d(str);
                mrkVar.d(strD2);
                LogUtil.a("CommonFile_CommandUtils", "handleRequestPackageNameTlv destination:", strD2);
                return 0;
            case 9:
                String strD3 = eeq.d(str);
                mrkVar.e(strD3);
                LogUtil.a("CommonFile_CommandUtils", "handleRequestPackageNameTlv description:", strD3);
                return 0;
            case 10:
                String strD4 = eeq.d(str);
                mrkVar.i(strD4);
                LogUtil.a("CommonFile_CommandUtils", "handleRequestPackageNameTlv sourceCertificate:", strD4);
                return 0;
            case 11:
                String strD5 = eeq.d(str);
                mrkVar.a(strD5);
                LogUtil.a("CommonFile_CommandUtils", "handleRequestPackageNameTlv destinationCertificate:", strD5);
                return 0;
            default:
                LogUtil.j("CommonFile_CommandUtils", "handleRequestPackageNameTlv default");
                return 0;
        }
    }

    public static void e(int i, mrk mrkVar, String str) {
        if (i == 1) {
            String strD = eeq.d(str);
            mrkVar.b(strD);
            LogUtil.a("CommonFile_CommandUtils", "handleRequestFileMessageTlv file_name:", strD);
            return;
        }
        if (i == 2) {
            int iV = CommonUtil.v(str);
            mrkVar.f(iV);
            LogUtil.a("CommonFile_CommandUtils", "handleRequestFileMessageTlv file_type:", Integer.valueOf(iV));
        } else if (i == 3) {
            int iV2 = CommonUtil.v(str);
            mrkVar.a(iV2);
            LogUtil.a("CommonFile_CommandUtils", "handleRequestFileMessageTlv file_id:", Integer.valueOf(iV2));
        } else {
            if (i != 4) {
                LogUtil.j("CommonFile_CommandUtils", "handleRequestFileMessageTlv default");
                return;
            }
            int iV3 = CommonUtil.v(str);
            mrkVar.h(iV3);
            LogUtil.a("CommonFile_CommandUtils", "handleRequestFileMessageTlv file_size:", Integer.valueOf(iV3));
        }
    }

    public static DeviceCommand b(mrk mrkVar) {
        StringBuilder sb = new StringBuilder(16);
        String strA = eeq.a(mrkVar.n());
        sb.append(eeq.d(1) + eeq.d(strA.length() / 2) + strA);
        sb.append(eeq.d(2) + eeq.d(1) + eeq.d(mrkVar.q()));
        String strA2 = eeq.a(mrkVar.ac());
        String str = eeq.d(7) + eeq.d(strA2.length() / 2) + strA2;
        sb.append(str);
        String strA3 = eeq.a(mrkVar.ac());
        String str2 = eeq.d(8) + eeq.d(strA3.length() / 2) + strA3;
        String strA4 = eeq.a(mrkVar.v());
        String str3 = eeq.d(10) + eeq.d(strA4.length() / 2) + strA4;
        String strA5 = eeq.a(mrkVar.v());
        String str4 = eeq.d(11) + eeq.d(strA5.length() / 2) + strA5;
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(44);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setDataLen(eeq.c(sb.toString()).length);
        deviceCommand.setNeedAck(true);
        LogUtil.a("CommonFile_CommandUtils", "sendCommonFileInfo,deviceCommand:", deviceCommand.toString());
        return deviceCommand;
    }

    public static DeviceInfo b() {
        LogUtil.a("CommonFile_CommandUtils", "getMainDevice entry !");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "CommonFile_CommandUtils");
        if (deviceList.size() > 0) {
            return deviceList.get(0);
        }
        LogUtil.a("CommonFile_CommandUtils", "getMainDevice is error !");
        return null;
    }

    public static String e() {
        LogUtil.a("CommonFile_CommandUtils", "getMainDeviceMac entry !");
        DeviceInfo deviceInfoB = b();
        if (deviceInfoB != null) {
            return deviceInfoB.getDeviceIdentify();
        }
        return "";
    }

    public static String a() {
        LogUtil.a("CommonFile_CommandUtils", "getAw70DeviceMac entry !");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "CommonFile_CommandUtils");
        String deviceIdentify = "";
        if (deviceList.size() == 1) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                deviceIdentify = it.next().getDeviceIdentify();
            }
            return deviceIdentify;
        }
        LogUtil.a("CommonFile_CommandUtils", "getAw70DeviceMac is error !");
        return "";
    }

    public static RequestFileInfo a(DeviceInfo deviceInfo, mrk mrkVar) {
        RequestFileInfo requestFileInfo = new RequestFileInfo();
        requestFileInfo.setFileName(mrkVar.n());
        requestFileInfo.setFileType(mrkVar.q());
        requestFileInfo.setFileId(mrkVar.j());
        requestFileInfo.setFileSize(mrkVar.p());
        requestFileInfo.setDescription(mrkVar.e());
        requestFileInfo.setSourcePackageName(mrkVar.ac());
        requestFileInfo.setDestinationPackageName(mrkVar.f());
        requestFileInfo.setSourceCertificate(mrkVar.v());
        requestFileInfo.setDestinationCertificate(mrkVar.i());
        requestFileInfo.setCancelTransmission(mrkVar.ai());
        requestFileInfo.setNeedVerify(mrkVar.aj());
        requestFileInfo.setTimes(new int[]{mrkVar.ab(), mrkVar.h()});
        requestFileInfo.setKit(false);
        requestFileInfo.setDeviceReport(true);
        if (deviceInfo != null) {
            requestFileInfo.setDeviceMac(deviceInfo.getDeviceIdentify());
        }
        return requestFileInfo;
    }
}
