package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcloudmodel.hwwear.hag.model.outdoor.FutureWeatherSunMoonData;
import com.huawei.hwcloudmodel.model.push.WeatherForecastDay;
import com.huawei.hwcloudmodel.model.push.WeatherForecastGlow;
import com.huawei.hwcloudmodel.model.push.WeatherForecastHour;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ned {
    private static String d(lqq lqqVar, nec necVar, neb nebVar) {
        if (lqqVar == null) {
            LogUtil.j("FutureWeatherPushUtils", "pushWeatherForecast() weather is null");
            return "";
        }
        String strE = e(lqqVar, nebVar);
        String strA = a(lqqVar, necVar, nebVar);
        String strD = d(lqqVar, nebVar);
        LogUtil.a("FutureWeatherPushUtils", "message :", strE, strA, strD);
        return strE + strA + strD;
    }

    private static String d(lqq lqqVar, neb nebVar) {
        if (!nebVar.d()) {
            LogUtil.j("FutureWeatherPushUtils", "glowWeather isIsSupportWeatherHumidityAlertExpand is false, not send glowWeather");
            return "";
        }
        List<WeatherForecastGlow> listO = lqqVar.o();
        if (CollectionUtils.a(listO)) {
            LogUtil.j("FutureWeatherPushUtils", "glowWeather weatherForecastGlows is empty");
            return "";
        }
        LogUtil.a("FutureWeatherPushUtils", "glowWeather get command String");
        cqj cqjVar = new cqj();
        cqjVar.a(35);
        for (WeatherForecastGlow weatherForecastGlow : listO) {
            cqjVar.d(36);
            cqjVar.c(37, weatherForecastGlow.getMorningProb());
            cqjVar.d(38, (int) weatherForecastGlow.getMorningStart());
            cqjVar.d(39, (int) weatherForecastGlow.getMorningEnd());
            cqjVar.c(40, weatherForecastGlow.getMorningQuality());
            cqjVar.c(41, weatherForecastGlow.getMorningQualityProb());
            cqjVar.c(42, weatherForecastGlow.getEveningProb());
            cqjVar.d(43, (int) weatherForecastGlow.getEveningStart());
            cqjVar.d(44, (int) weatherForecastGlow.getEveningEnd());
            cqjVar.c(45, weatherForecastGlow.getEveningQuality());
            cqjVar.c(46, weatherForecastGlow.getEveningQualityProb());
            cqjVar.b(cqjVar.b());
        }
        return eeq.e(cqjVar.d());
    }

    private static String a(lqq lqqVar, nec necVar, neb nebVar) {
        List<WeatherForecastDay> listH = lqqVar.h();
        if (listH == null || listH.isEmpty()) {
            LogUtil.j("FutureWeatherPushUtils", "pushWeatherForecast() weatherForecastDays is null or nothing");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listH.size(); i++) {
            WeatherForecastDay weatherForecastDay = listH.get(i);
            sb.append(eeq.d(145));
            String strE = e(weatherForecastDay.getTime(), neg.b(weatherForecastDay, nebVar), weatherForecastDay.getHighestTemperature(), weatherForecastDay.getLowestTemperature());
            String strC = c(weatherForecastDay.getFutureWeatherSunMoonData(), necVar);
            sb.append(eeq.d((strE.length() + strC.length()) / 2));
            sb.append(strE);
            sb.append(strC);
        }
        return eeq.d(144) + eeq.b(sb.toString().length() / 2) + sb.toString();
    }

    private static String e(lqq lqqVar, neb nebVar) {
        List<WeatherForecastHour> listL = lqqVar.l();
        if (listL == null || listL.isEmpty()) {
            LogUtil.j("FutureWeatherPushUtils", "pushWeatherForecast() Hours is null or nothing");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listL.size(); i++) {
            sb.append(eeq.d(130));
            String strA = a(listL.get(i), nebVar);
            sb.append(eeq.d(strA.length() / 2));
            sb.append(strA);
        }
        return eeq.d(129) + eeq.b(sb.toString().length() / 2) + sb.toString();
    }

    private static String a(WeatherForecastHour weatherForecastHour, neb nebVar) {
        String strC = eeq.c(weatherForecastHour.getTime());
        String str = "" + (eeq.d(3) + eeq.b(strC.length() / 2) + strC);
        String strD = eeq.d(neg.b(weatherForecastHour, nebVar));
        String str2 = str + (eeq.d(4) + eeq.b(strD.length() / 2) + strD);
        String strD2 = eeq.d(weatherForecastHour.getTemperature());
        String str3 = str2 + (eeq.d(5) + eeq.b(strD2.length() / 2) + strD2);
        if (!nebVar.d()) {
            return str3;
        }
        String strD3 = eeq.d(weatherForecastHour.getPrecipitation());
        String str4 = str3 + (eeq.d(6) + eeq.b(strD3.length() / 2) + strD3);
        String strD4 = eeq.d(weatherForecastHour.getUvIndex());
        String str5 = str4 + (eeq.d(7) + eeq.b(strD4.length() / 2) + strD4);
        String strC2 = eeq.c(weatherForecastHour.getSomatosensoryTemperature());
        return str5 + (eeq.d(8) + eeq.b(strC2.length() / 2) + strC2);
    }

    private static String e(long j, int i, double d, double d2) {
        String strC = eeq.c(j);
        String str = "" + (eeq.d(18) + eeq.b(strC.length() / 2) + strC);
        String strD = eeq.d(i);
        String str2 = str + (eeq.d(19) + eeq.b(strD.length() / 2) + strD);
        String strD2 = eeq.d((int) d);
        String str3 = str2 + (eeq.d(20) + eeq.b(strD2.length() / 2) + strD2);
        String strD3 = eeq.d((int) d2);
        return str3 + (eeq.d(21) + eeq.b(strD3.length() / 2) + strD3);
    }

    private static String c(FutureWeatherSunMoonData futureWeatherSunMoonData, nec necVar) {
        String str = "";
        if (futureWeatherSunMoonData == null || necVar == null) {
            LogUtil.j("FutureWeatherPushUtils", "not support hagSunriseSunset");
            return "";
        }
        LogUtil.a("FutureWeatherPushUtils", "daySunriseSunset() support hagSunriseSunset");
        if (necVar.b()) {
            if (futureWeatherSunMoonData.getSunriseTime() != 0) {
                String strC = eeq.c(futureWeatherSunMoonData.getSunriseTime());
                str = "" + (eeq.d(22) + eeq.b(strC.length() / 2) + strC);
            }
            if (futureWeatherSunMoonData.getSunsetTime() != 0) {
                String strC2 = eeq.c(futureWeatherSunMoonData.getSunsetTime());
                str = str + (eeq.d(23) + eeq.b(strC2.length() / 2) + strC2);
            }
            if (futureWeatherSunMoonData.getSecondSunriseTime() != 0) {
                String strC3 = eeq.c(futureWeatherSunMoonData.getSecondSunriseTime());
                str = str + (eeq.d(24) + eeq.b(strC3.length() / 2) + strC3);
            }
            if (futureWeatherSunMoonData.getSecondSunsetTime() != 0) {
                String strC4 = eeq.c(futureWeatherSunMoonData.getSecondSunsetTime());
                str = str + (eeq.d(25) + eeq.b(strC4.length() / 2) + strC4);
            }
        }
        return str + d(futureWeatherSunMoonData, necVar);
    }

    private static String d(FutureWeatherSunMoonData futureWeatherSunMoonData, nec necVar) {
        String str = "";
        if (necVar.b()) {
            if (futureWeatherSunMoonData.getMoonRise() != 0) {
                String strC = eeq.c(futureWeatherSunMoonData.getMoonRise());
                str = "" + (eeq.d(26) + eeq.b(strC.length() / 2) + strC);
            }
            if (futureWeatherSunMoonData.getMoonSet() != 0) {
                String strC2 = eeq.c(futureWeatherSunMoonData.getMoonSet());
                str = str + (eeq.d(27) + eeq.b(strC2.length() / 2) + strC2);
            }
            if (futureWeatherSunMoonData.getSecondMoonRise() != 0) {
                String strC3 = eeq.c(futureWeatherSunMoonData.getSecondMoonRise());
                str = str + (eeq.d(28) + eeq.b(strC3.length() / 2) + strC3);
            }
            if (futureWeatherSunMoonData.getSecondMoonSet() != 0) {
                String strC4 = eeq.c(futureWeatherSunMoonData.getSecondMoonSet());
                str = str + (eeq.d(29) + eeq.b(strC4.length() / 2) + strC4);
            }
        }
        String str2 = str + b(futureWeatherSunMoonData, necVar);
        LogUtil.a("FutureWeatherPushUtils", "dayMoonRiseMoonSet() COMMAND:", str2);
        return str2;
    }

    private static String b(FutureWeatherSunMoonData futureWeatherSunMoonData, nec necVar) {
        String str = "";
        if (necVar.e() && futureWeatherSunMoonData.getMoonPhase() != 0) {
            String strD = eeq.d(futureWeatherSunMoonData.getMoonPhase());
            str = "" + (eeq.d(30) + eeq.b(strD.length() / 2) + strD);
        }
        LogUtil.a("FutureWeatherPushUtils", "dayMoonPhase() COMMAND:", str);
        return str;
    }

    public static void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("FutureWeatherPushUtils", "notifyDeviceWeatherCapability DeviceInfo is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("FutureWeatherPushUtils", "notifyDeviceWeatherCapability device disconnect");
            return;
        }
        String strD = eeq.d(3);
        String str = eeq.d(1) + eeq.b(strD.length() / 2) + strD;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(9);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setPriority(1);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("notifyDeviceWeatherCapability", "sendDeviceData command", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void d(DeviceInfo deviceInfo) {
        String str = eeq.d(1) + eeq.d(0);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(10);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private static boolean a(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityE = e(deviceInfo);
        if (deviceCapabilityE == null) {
            LogUtil.j("FutureWeatherPushUtils", "isSupportFutureCapability() Capability is null");
            return false;
        }
        if (deviceCapabilityE.isWeatherSupportFutureInfo()) {
            return true;
        }
        LogUtil.j("FutureWeatherPushUtils", "isSupportFutureCapability() has not Capability");
        return false;
    }

    public static boolean c(DeviceInfo deviceInfo) {
        if (!a(deviceInfo)) {
            LogUtil.j("FutureWeatherPushUtils", "isSupportDeviceFutureWeatherCapability() has 5.15.8 Capability");
            return false;
        }
        DeviceCapability deviceCapabilityE = e(deviceInfo);
        if (deviceCapabilityE == null || !deviceCapabilityE.isSupportDeviceFutureWeatherCapability()) {
            return false;
        }
        LogUtil.j("FutureWeatherPushUtils", "isSupportDeviceFutureWeatherCapability() has 5.15.10 Capability");
        return true;
    }

    public static void c(lqq lqqVar, nec necVar, neb nebVar, DeviceInfo deviceInfo) {
        if (!a(deviceInfo)) {
            LogUtil.j("FutureWeatherPushUtils", "pushFutureWeatherToDevice() has not Capability");
            return;
        }
        String strD = d(lqqVar, necVar, nebVar);
        LogUtil.j("FutureWeatherPushUtils", "pushFutureWeatherToDevice, command:", strD);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(15);
        deviceCommand.setCommandID(8);
        deviceCommand.setDataContent(eeq.c(strD));
        deviceCommand.setDataLen(eeq.c(strD).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private static DeviceCapability e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("FutureWeatherPushUtils", "getCapability deviceInfo is null");
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "FutureWeatherPushUtils");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }
}
