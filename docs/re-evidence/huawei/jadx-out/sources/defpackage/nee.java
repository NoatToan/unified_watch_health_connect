package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.model.push.AlertWeather;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nee {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f42978b;

    public static void c() {
        String str = eeq.d(1) + eeq.d(0);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(6);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwWeatherCommandUtils", "sendWeatherConstraintMsgExpand 0F06 deviceCommand: ", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - f42978b) < 500) {
            LogUtil.j("HwWeatherCommandUtils", "sendWeatherConstraintMsg less than 500ms.");
            return;
        }
        f42978b = jCurrentTimeMillis;
        String str = eeq.d(1) + eeq.d(0);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwWeatherCommandUtils", "sendWeatherConstraintMsg 0F02 deviceCommand: ", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void c(int i, int i2) {
        DeviceCommand deviceCommandD;
        if (neg.m()) {
            deviceCommandD = b(i, i2);
        } else if (neg.o()) {
            deviceCommandD = d(i);
        } else {
            LogUtil.j("HwWeatherCommandUtils", "sendWeatherErrorCode has not Capability");
            return;
        }
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommandD);
    }

    private static DeviceCommand b(int i, int i2) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(12);
        String strC = c(2, 1, i);
        if (neg.c(i, i2)) {
            strC = strC + c(3, 1, i2);
        }
        String str = eeq.d(129) + eeq.b(strC.length() / 2) + strC;
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwWeatherCommandUtils", "makeExpandWeatherErrorCodeCommand 0F0C is ", deviceCommand.toString());
        return deviceCommand;
    }

    private static DeviceCommand d(int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(7);
        String strC = c(1, 1, i);
        deviceCommand.setDataContent(eeq.c(strC));
        deviceCommand.setDataLen(eeq.c(strC).length);
        LogUtil.a("HwWeatherCommandUtils", "makeWeatherErrorCodeCommand 0F07 is ", deviceCommand.toString());
        return deviceCommand;
    }

    private static String c(int i, int i2, int i3) {
        return eeq.d(i) + eeq.d(i2) + eeq.d(i3);
    }

    public static void d(int i, int i2, int i3) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(i);
        deviceCommand.setCommandID(i2);
        byte[] bArrC = c(i3);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static byte[] c(int i) {
        return new cqj().j(127, i).e();
    }

    private static String i(lqq lqqVar, neb nebVar) {
        if (nebVar.m()) {
            String str = eeq.d(2) + eeq.d(1) + eeq.d(neg.a(lqqVar, nebVar));
            LogUtil.a("HwWeatherCommandUtils", "makeWeatherTlv weatherTlvHex: ", str);
            return str;
        }
        return "";
    }

    private static String j(lqq lqqVar, neb nebVar) {
        if (nebVar.k()) {
            return eeq.d(3) + eeq.d(2) + eeq.d(lqqVar.y()) + eeq.d(lqqVar.w());
        }
        return "";
    }

    private static String e(lqq lqqVar, neb nebVar) {
        if (nebVar.i() && lqqVar.r() != -1) {
            return eeq.d(4) + eeq.d(2) + eeq.e(lqqVar.r());
        }
        return "";
    }

    private static String c(lqq lqqVar, neb nebVar) {
        if (nebVar.h()) {
            return (eeq.d(OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL) + eeq.d(6)) + (eeq.d(6) + eeq.d(1) + eeq.d(lqqVar.t())) + (eeq.d(7) + eeq.d(1) + eeq.d(lqqVar.q()));
        }
        return "";
    }

    private static String a(lqq lqqVar, neb nebVar) {
        if (nebVar.f() && !TextUtils.isEmpty(lqqVar.g())) {
            String strD = eeq.d(14);
            String strA = eeq.a(lqqVar.g());
            return strD + eeq.b(strA.length() / 2) + strA;
        }
        return "";
    }

    private static String e(lqq lqqVar) {
        LogUtil.a("HwWeatherCommandUtils", "makeUvIndexTlv enter");
        String strD = eeq.d(15);
        String strD2 = eeq.d(lqqVar.i());
        return strD + eeq.d(1) + strD2;
    }

    public static String b(lqq lqqVar, neb nebVar) {
        String strD;
        String str;
        String str2;
        String str3;
        String str4 = "";
        if (lqqVar == null || nebVar == null) {
            return "";
        }
        String strI = i(lqqVar, nebVar);
        String strJ = j(lqqVar, nebVar);
        String strB = eeq.b((strI + strJ).length() / 2);
        if (strB.length() == 0) {
            strD = "";
        } else {
            strD = eeq.d(129);
        }
        if (!nebVar.a()) {
            str = "";
        } else {
            String strA = eeq.a(lqqVar.s());
            str = eeq.d(8) + eeq.d(strA.length() / 2) + strA;
        }
        if (!nebVar.e()) {
            str2 = "";
        } else {
            str2 = eeq.d(9) + eeq.d(1) + eeq.d(lqqVar.n());
        }
        if (!nebVar.g()) {
            str3 = "";
        } else {
            str3 = eeq.d(10) + eeq.d(1) + eeq.d(lqqVar.x());
            LogUtil.a("HwWeatherCommandUtils", "makeWeatherPromptMsg weatherUnitTlvHex: ", str3);
        }
        if (nebVar.b() && lqqVar.k() != -1) {
            str4 = eeq.d(11) + eeq.d(2) + eeq.e(lqqVar.k());
            LogUtil.a("HwWeatherCommandUtils", "makeWeatherPromptMsg aqiTlvHex: ", str4);
        }
        return (strD + strB) + strI + strJ + e(lqqVar, nebVar) + c(lqqVar, nebVar) + str + str2 + str3 + str4;
    }

    public static String d(lqq lqqVar, neb nebVar) {
        String str;
        if (lqqVar == null || nebVar == null) {
            LogUtil.j("HwWeatherCommandUtils", "setWeatherPromptMsgExpand weather or dataWeatherSupport is null");
            return "";
        }
        if (nebVar.j()) {
            str = eeq.d(12) + eeq.d(4) + eeq.c(lqqVar.p());
            LogUtil.a("HwWeatherCommandUtils", "setWeatherPromptMsgExpand observationTimeTLVHex:", str);
        } else {
            str = "";
        }
        return str + (nebVar.f() ? a(lqqVar, nebVar) : "") + (neg.n() ? e(lqqVar) : "");
    }

    public static void b(int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(5);
        String str = eeq.d(1) + eeq.d(1) + eeq.d(i);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwWeatherCommandUtils", "pushWeatherUnitToDevice 0F05: ", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void c(String str, lqq lqqVar, boolean z) {
        mik.b("HwWeatherCommandUtils", 15, 1);
        if (TextUtils.isEmpty(str) || lqqVar == null) {
            LogUtil.j("HwWeatherCommandUtils", "pushWeatherToDevice TextUtils.isEmpty(command) || weather == null");
            xjt.as("pushWeatherToDevice command is empty or weather is null");
            return;
        }
        byte[] bArrC = eeq.c(str);
        if (z) {
            byte[] bArrB = b(lqqVar);
            LogUtil.a("HwWeatherCommandUtils", "pushWeatherToDevice humidityBytes : ", bArrB);
            byte[] bArr = new byte[bArrC.length + bArrB.length];
            System.arraycopy(bArrC, 0, bArr, 0, bArrC.length);
            System.arraycopy(bArrB, 0, bArr, bArrC.length, bArrB.length);
            bArrC = bArr;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setDataLen(bArrC.length);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        b(false, "");
        LogUtil.a("HwWeatherCommandUtils", "pushWeatherToDevice 0F01 command: ", str);
    }

    private static byte[] b(lqq lqqVar) {
        cqj cqjVar = new cqj();
        cqjVar.g(16, lsk.a(lqqVar.f(), 10)).j(17, lqqVar.m()).j(18, lqqVar.j());
        List<AlertWeather> listA = lqqVar.a();
        if (listA != null && listA.size() > 0) {
            cqjVar.a(19);
            for (AlertWeather alertWeather : listA) {
                if (alertWeather != null) {
                    cqjVar.b(cqjVar.d(20).e(21, alertWeather.getAlertTitle()).e(22, alertWeather.getAlertAreaName()).c(23, alertWeather.getAlertLevel()).e(24, alertWeather.getAlertLevelName()).c(25, alertWeather.getAlertType()).e(26, alertWeather.getAlertTypeName()).e(27, "").b(28, alertWeather.getAlertPublicTime()).b());
                }
            }
            cqjVar.a(cqjVar.d());
        }
        return cqjVar.e();
    }

    public static void b(boolean z, String str) {
        DeviceCapability deviceCapabilityB = neg.b();
        if (deviceCapabilityB == null || !deviceCapabilityB.isSupportGpsSearchStarOptimization()) {
            LogUtil.j("HwWeatherCommandUtils", "sendGpsAndTimeToDevice not is support GpsSearchStarOptimization");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(15), "gps_and_time");
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwWeatherCommandUtils", "sendGpsAndTimeToDevice gpsAndTime is null");
            if (z) {
                d(24, 6, 100001);
                return;
            }
            return;
        }
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 3) {
            LogUtil.j("HwWeatherCommandUtils", "sendGpsAndTimeToDevice gpsAndTime is error");
            if (z) {
                d(24, 6, 100001);
                return;
            }
            return;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        String str4 = strArrSplit[2];
        mik.b("HwWeatherCommandUtils", 24, 7);
        StringBuilder sb = new StringBuilder(16);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        byte[] bArrC = eeq.c(sb.toString());
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(24);
        deviceCommand.setCommandID(7);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        LogUtil.a("HwWeatherCommandUtils", "sendGpsAndTimeToDevice deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void a(String str) {
        LogUtil.a("HwWeatherCommandUtils", "pushAtmosphereCommandToDevice command: ", str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
