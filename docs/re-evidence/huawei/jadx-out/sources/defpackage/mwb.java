package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.datatype.GpsParameter;
import com.huawei.datatype.GpsStruct;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mwb {
    public static boolean b(Context context) {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        if (context == null) {
            LogUtil.j("HwGpsUtil", "context is null");
            return false;
        }
        Object systemService = context.getSystemService("location");
        if (systemService instanceof LocationManager) {
            LocationManager locationManager = (LocationManager) systemService;
            zIsProviderEnabled2 = locationManager.isProviderEnabled(GeocodeSearch.GPS);
            zIsProviderEnabled = locationManager.isProviderEnabled("network");
            LogUtil.a("HwGpsUtil", "isGPSLocationEnable:", Boolean.valueOf(zIsProviderEnabled2), "isNetWorkLocationEnable:", Boolean.valueOf(zIsProviderEnabled));
        } else {
            zIsProviderEnabled = false;
            zIsProviderEnabled2 = false;
        }
        return zIsProviderEnabled2 || zIsProviderEnabled;
    }

    public static void e(int i, long j, Location location, float f, GpsStruct gpsStruct) {
        if (location == null || gpsStruct == null) {
            LogUtil.j("HwGpsUtil", "location or gpsStruct is null");
            return;
        }
        switch (i) {
            case 0:
                gpsStruct.setGpsSpeed((int) (location.getSpeed() * 10.0f));
                return;
            case 1:
                gpsStruct.setGpsDistance((int) (f * 10.0f));
                return;
            case 2:
                gpsStruct.setGpsAltitude((int) location.getAltitude());
                return;
            case 3:
                gpsStruct.setGpsTotalDistance(j);
                return;
            case 4:
                gpsStruct.setGpsLongitude(location.getLongitude());
                gpsStruct.setGpsLatitude(location.getLatitude());
                return;
            case 5:
                Location locationD = nps.d(BaseApplication.getContext(), location);
                gpsStruct.setGpsMarsLongitude(locationD.getLongitude());
                gpsStruct.setGpsMarsLatitude(locationD.getLatitude());
                return;
            case 6:
                gpsStruct.setGpsDirection(location.getBearing());
                return;
            case 7:
                gpsStruct.setGpsPrecision(location.getAccuracy());
                return;
            case 8:
                int i2 = 0;
                try {
                    int i3 = location.getExtras().getInt("gpsQuality");
                    LogUtil.a("HwGpsUtil", "gpsQuality: ", Integer.valueOf(i3));
                    i2 = i3;
                } catch (Exception unused) {
                    LogUtil.e("HwGpsUtil", "gpsQuality Exception.");
                }
                gpsStruct.setGpsQuality(i2);
                break;
        }
        LogUtil.j("HwGpsUtil", "type does not match");
    }

    public static void e(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null) {
            LogUtil.j("HwGpsUtil", "dataInfos is null");
            return;
        }
        cpl.d("HwGpsUtil", bArr, "getResult(): ");
        if (deviceInfo != null) {
            b(mmx.b(deviceInfo.getProductType()));
        }
        if (eet.e(bArr)) {
            return;
        }
        String strE = eeq.e(bArr);
        if (strE.length() < 4) {
            LogUtil.e("HwGpsUtil", "Receive command error");
            return;
        }
        try {
            ees eesVarB = new eet().b(strE.substring(4, strE.length()));
            List<ees> listB = eesVarB.b();
            List<eew> listE = eesVarB.e();
            byte b2 = bArr[1];
            if (b2 == 1) {
                if (e(listE)) {
                    return;
                }
                b(listB);
            } else {
                if (b2 == 2) {
                    a(listE);
                    return;
                }
                if (b2 == 3) {
                    d(listE);
                    return;
                }
                if (b2 == 4) {
                    c(listE);
                } else if (b2 != 8) {
                    LogUtil.j("HwGpsUtil", "type does not match");
                } else {
                    b(bArr, deviceInfo);
                }
            }
        } catch (eeu unused) {
            LogUtil.e("HwGpsUtil", "Receive command error");
            xjt.h("Receive command error");
        }
    }

    private static void b(byte[] bArr, DeviceInfo deviceInfo) {
        mvu.a().d(deviceInfo);
        if (bArr.length != 5) {
            cpl.d("HwGpsUtil", bArr, "arKitSwitch() status: ");
            return;
        }
        byte b2 = bArr[4];
        LogUtil.a("HwGpsUtil", "arKitSwitch() status:", Byte.valueOf(b2));
        mvx.e().a(b2);
    }

    private static void b(List<ees> list) {
        int i;
        if (list == null || list.size() == 0) {
            LogUtil.j("HwGpsUtil", "processGetGpsLocationParameter tlvFatherList is null");
            return;
        }
        GpsParameter gpsParameter = new GpsParameter();
        for (eew eewVar : list.get(0).e()) {
            try {
                i = Integer.parseInt(eewVar.e(), 16);
            } catch (NumberFormatException unused) {
                LogUtil.e("HwGpsUtil", "tlv.getTag() NumberFormatException");
                i = 0;
            }
            if (i == 2) {
                gpsParameter.setGpsInfoBitmap(CommonUtil.v(eewVar.b()));
            } else if (i == 3) {
                gpsParameter.setGpsParaFormat(CommonUtil.v(eewVar.b()));
            } else if (i == 4) {
                gpsParameter.setGpsParaElementNum(CommonUtil.v(eewVar.b()));
            } else if (i == 5) {
                gpsParameter.setGpsThreshold(CommonUtil.v(eewVar.b()));
            } else {
                LogUtil.j("HwGpsUtil", "domainTag does not match");
            }
        }
        synchronized (mvw.d()) {
            if (mvw.d().size() != 0) {
                mvw.d().get(0).a(100000, gpsParameter);
                mvw.d().remove(0);
            }
        }
    }

    private static boolean e(List<eew> list) {
        if (list.size() == 0) {
            LogUtil.j("HwGpsUtil", "tlvs is empty");
            return false;
        }
        if (b(list.get(0).e(), 127, 16) != 127) {
            return false;
        }
        synchronized (mvw.d()) {
            if (mvw.d().size() != 0) {
                try {
                    mvw.d().get(0).a(Integer.parseInt(list.get(0).b(), 16), null);
                    mvw.d().remove(0);
                } catch (NumberFormatException unused) {
                    LogUtil.e("HwGpsUtil", "processGetGpsLocationParameter NumberFormatException");
                    xjt.h("processGetGpsLocationParameter NumberFormatException");
                }
            }
        }
        return true;
    }

    private static int b(String str, int i, int i2) {
        if (str != null) {
            try {
                return Integer.parseInt(str, i2);
            } catch (NumberFormatException unused) {
                LogUtil.e("HwGpsUtil", "parseInt errorcode fail");
            }
        }
        return i;
    }

    private static void a(List<eew> list) {
        boolean z;
        if (list.size() <= 0) {
            z = false;
        } else if (CommonUtil.v(list.get(0).e()) != 127) {
            Iterator<eew> it = list.iterator();
            loop0: while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    eew next = it.next();
                    if (CommonUtil.v(next.e()) == 1) {
                        if (CommonUtil.v(next.b()) == 1) {
                            z = true;
                        }
                    } else {
                        LogUtil.j("HwGpsUtil", "processNotifiactionGpsParaEnable default");
                    }
                }
            }
        } else {
            return;
        }
        synchronized (mvw.b()) {
            if (mvw.b().size() != 0) {
                mvw.b().get(0).a(100000, Boolean.valueOf(z));
            }
        }
    }

    private static void d(List<eew> list) {
        int iV = 0;
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 127) {
                iV = CommonUtil.v(eewVar.b());
            } else {
                LogUtil.j("HwGpsUtil", "processSetGpsParameter default");
            }
        }
        synchronized (mvw.a()) {
            if (mvw.a().size() != 0 && mvw.a().get(0) != null) {
                mvw.a().get(0).a(iV, null);
                mvw.a().remove(0);
            }
        }
    }

    private static void c(List<eew> list) {
        int i = 0;
        for (eew eewVar : list) {
            try {
                if (Integer.parseInt(eewVar.e(), 16) == 127) {
                    i = Integer.parseInt(eewVar.b(), 16);
                } else {
                    LogUtil.j("HwGpsUtil", "processSetSupportGpsParameter default");
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwGpsUtil", "processSetSupportGpsParameter NumberFormatException");
            }
        }
        synchronized (mvw.c()) {
            if (mvw.c().size() != 0) {
                mvw.c().get(0).a(i, null);
                mvw.c().remove(0);
            }
        }
    }

    public static int b() {
        return SharedPreferenceManager.c("connect_gps_module_id", "key_connect_gps_device_type", 0);
    }

    public static void b(int i) {
        LogUtil.a("HwGpsUtil", "saveDeviceTypeToStorage isDeviceBand: ", Integer.valueOf(i));
        SharedPreferenceManager.d("connect_gps_module_id", "key_connect_gps_device_type", i);
    }
}
