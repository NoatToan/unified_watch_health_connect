package defpackage;

import android.text.TextUtils;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class mxv {
    public static String d(iof iofVar) {
        if (iofVar == null) {
            ReleaseLogUtil.e("DEVMGR_SosUtils", "buildEmergencyInfoCommand emergencyInfo is null");
            xjt.ak("SosUtils buildEmergencyInfoCommand: emergencyInfo is null");
            return "";
        }
        return b(iofVar) + e(iofVar);
    }

    public static String d() {
        return eeq.d(1) + eeq.d(0) + eeq.d(2) + eeq.d(0) + eeq.d(3) + eeq.d(0);
    }

    public static DeviceCommand b(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_SosUtils", "getDeviceCommand commandHex is null or empty string");
            xjt.ak("SosUtils getDeviceCommand: commandHex is null or empty");
            return null;
        }
        LogUtil.a("SosUtils", "getDeviceCommand commanHex:" + str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(51);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        return deviceCommand;
    }

    public static DeviceCommand c(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_SosUtils", "getImageInfoCommand commandHex is null or empty string");
            xjt.ak("SosUtils getImageInfoCommand: commandHex is null or empty");
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        LogUtil.a("SosUtils", "getImageInfoCommand commandHex:", str);
        deviceCommand.setServiceID(51);
        deviceCommand.setCommandID(4);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        return deviceCommand;
    }

    public static String e(iof iofVar) {
        String strC;
        String strA;
        String str;
        String strE;
        StringBuilder sb = new StringBuilder();
        if (iofVar == null) {
            ReleaseLogUtil.e("DEVMGR_SosUtils", "buildUpContactInfo emergencyInfo is null");
            xjt.ak("SosUtils buildUpContactInfo: emergencyInfo is null");
            return "";
        }
        ArrayList<iof.b> arrayListA = iofVar.a();
        if (arrayListA != null && arrayListA.size() > 0) {
            for (iof.b bVar : arrayListA) {
                if (bVar != null) {
                    String str2 = eeq.d(10) + eeq.d(1) + eeq.d(bVar.b());
                    if (bVar.c() == null) {
                        strC = "";
                    } else {
                        strC = bVar.c();
                    }
                    String strA2 = eeq.a(strC);
                    String str3 = eeq.d(11) + eeq.b(strA2.length() / 2) + strA2;
                    if (bVar.a() == null) {
                        strA = "";
                    } else {
                        strA = bVar.a();
                    }
                    String strA3 = eeq.a(strA);
                    String str4 = eeq.d(12) + eeq.d(strA3.length() / 2) + strA3;
                    if (b()) {
                        str = "";
                    } else {
                        if (TextUtils.isEmpty(eeq.e(bVar.e()))) {
                            strE = "";
                        } else {
                            strE = eeq.e(bVar.e());
                        }
                        str = eeq.d(13) + eeq.b(strE.length() / 2) + strE;
                    }
                    String str5 = str2 + str3 + str4 + str;
                    sb.append(eeq.d(137) + eeq.b(str5.length() / 2) + str5);
                }
            }
            String str6 = eeq.d(TsExtractor.TS_STREAM_TYPE_DTS_HD) + eeq.b(sb.length() / 2);
            if (sb.length() > 0) {
                sb.insert(0, str6);
            }
        } else {
            sb.append(eeq.d(TsExtractor.TS_STREAM_TYPE_DTS_HD) + eeq.d(0));
        }
        return sb.toString();
    }

    public static String b(iof iofVar) {
        if (iofVar == null) {
            ReleaseLogUtil.e("DEVMGR_SosUtils", "buildUpEmergencyInfo emergencyInfo is null");
            xjt.ak("SosUtils buildUpEmergencyInfo: emergencyInfo is null");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b(1, iofVar.i()));
        sb.append(b(2, iofVar.g()));
        sb.append(b(3, iofVar.b()));
        sb.append(c(6, iofVar.j()));
        if (!b()) {
            sb.append(b(4, iofVar.e()));
            sb.append(b(5, iofVar.d()));
            sb.append(b(7, iofVar.c()));
        }
        return sb.toString();
    }

    public static String b(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return eeq.d(i) + eeq.d(0);
        }
        String strA = eeq.a(str);
        return eeq.d(i) + eeq.b(strA.length() / 2) + strA;
    }

    public static String b(int i, int i2) {
        if (i2 >= 0 && i2 <= 9) {
            return eeq.d(i) + eeq.d(1) + eeq.d(i2);
        }
        ReleaseLogUtil.e("DEVMGR_SosUtils", "buildUpBloodTypeHex bloodType value is invalid");
        return "";
    }

    public static String c(int i, int i2) {
        if (i2 >= 0 && i2 <= 2) {
            return eeq.d(i) + eeq.d(1) + eeq.d(i2);
        }
        ReleaseLogUtil.e("DEVMGR_SosUtils", "buildUpOrganDonorHex organDonor value is invalid");
        return "";
    }

    public static boolean b() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "SosUtils");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DEVMGR_SosUtils", "currentDevice is null");
            return false;
        }
        boolean zD = eey.d(deviceInfo, 268);
        ReleaseLogUtil.d("DEVMGR_SosUtils", "currentDevice name is ", deviceInfo.getDeviceName(), " isSupportSportWatchSos ", Boolean.valueOf(zD));
        return zD;
    }
}
