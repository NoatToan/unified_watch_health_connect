package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.hwwear.hag.model.tide.HagTide;
import com.huawei.hwcloudmodel.hwwear.hag.model.tide.HagTideStationBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nef {
    private static String a(lqq lqqVar) {
        if (lqqVar == null || lqqVar.e() == null) {
            LogUtil.j("FutureTidePushUtils", "makeTideCommand() weather is null or HagTideDataBean is null");
            return "";
        }
        String str = "" + eeq.d(129);
        List<HagTideStationBean> tideStations = lqqVar.e().getTideStations();
        if (tideStations != null && !tideStations.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tideStations.size(); i++) {
                HagTideStationBean hagTideStationBean = tideStations.get(i);
                if (hagTideStationBean == null) {
                    LogUtil.j("FutureTidePushUtils", "makeTideCommand() tideStationBean is null");
                } else {
                    sb.append(eeq.d(130));
                    String strB = b(hagTideStationBean);
                    sb.append(eeq.b(strB.length() / 2));
                    sb.append(strB);
                }
            }
            return str + eeq.b(sb.toString().length() / 2) + sb.toString();
        }
        String str2 = str + eeq.d(0);
        mik.a("FutureTidePushUtils", "getTideStations is null,please check Weather CP");
        return str2;
    }

    private static String b(HagTideStationBean hagTideStationBean) {
        String strD;
        List<HagTide> hagTides = hagTideStationBean.getHagTides();
        if (hagTides == null || hagTides.isEmpty()) {
            mik.a("FutureTidePushUtils", "Tides for given station " + hagTideStationBean.getName() + " not exist,please check Weather CP");
            strD = "00";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < hagTides.size(); i++) {
                if (hagTides.get(i) == null) {
                    LogUtil.j("FutureTidePushUtils", "parseHagTideStation() hagTide is null");
                } else {
                    sb.append(eeq.d(OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL));
                    String strA = a(hagTides.get(i));
                    sb.append(eeq.b(strA.length() / 2));
                    sb.append(strA);
                }
            }
            strD = "" + eeq.b(sb.toString().length() / 2) + sb.toString();
        }
        String name = hagTideStationBean.getName();
        if (TextUtils.isEmpty(name)) {
            mik.a("FutureTidePushUtils", "get TideStationName is null, please check Weather CP");
        } else {
            String strA2 = eeq.a(name);
            if (strA2.length() > 120) {
                strA2 = strA2.substring(0, 120);
            }
            strD = strD + eeq.d(3) + eeq.b(strA2.length() / 2) + strA2;
        }
        if (TextUtils.isEmpty(strD)) {
            strD = eeq.d(0);
        }
        return eeq.d(UserInfomation.WEIGHT_DEFAULT_ENGLISH) + strD;
    }

    private static String a(HagTide hagTide) {
        String str = "";
        if (hagTide == null) {
            return "";
        }
        if (hagTide.getTideTime() != 0) {
            String strC = eeq.c(hagTide.getTideTime());
            str = "" + (eeq.d(6) + eeq.d(strC.length() / 2) + strC);
        }
        if (hagTide.getTideType() != 0) {
            String strD = eeq.d(hagTide.getTideType());
            str = str + (eeq.d(7) + eeq.d(strD.length() / 2) + strD);
        }
        if (hagTide.getTideHeight() == -32768) {
            return str;
        }
        String strE = eeq.e(hagTide.getTideHeight());
        return str + (eeq.d(8) + eeq.d(strE.length() / 2) + strE);
    }

    public static void b(lqq lqqVar, DeviceInfo deviceInfo) {
        LogUtil.a("FutureTidePushUtils", "pushTideToDevice()");
        if (!d()) {
            LogUtil.j("FutureTidePushUtils", "pushTideToDevice() has not Capability");
            return;
        }
        String strA = a(lqqVar);
        if (!TextUtils.isEmpty(strA)) {
            LogUtil.a("FutureTidePushUtils", "pushTideToDevice(), command :", strA);
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(15);
            deviceCommand.setCommandID(11);
            deviceCommand.setDataContent(eeq.c(strA));
            deviceCommand.setDataLen(eeq.c(strA).length);
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
            return;
        }
        LogUtil.j("FutureTidePushUtils", "pushTideToDevice() command is empty");
    }

    public static boolean d() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", "FutureTidePushUtils");
        DeviceCapability value = null;
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        if (value == null) {
            LogUtil.j("FutureTidePushUtils", "isSupportTideCapability() Capability is null");
            return false;
        }
        if (value.isSupportTide()) {
            return true;
        }
        LogUtil.j("FutureTidePushUtils", "isSupportTideCapability() has not Capability");
        return false;
    }

    public static void a(Map<String, Object> map, String str) {
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return;
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }
}
