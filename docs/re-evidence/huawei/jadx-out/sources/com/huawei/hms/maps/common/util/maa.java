package com.huawei.hms.maps.common.util;

import android.app.Application;
import android.content.Context;
import android.os.RemoteException;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.MapClientIdentify;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.internal.ICoordinateConverterDelegate;
import com.huawei.hms.maps.internal.ICreator;
import com.huawei.hms.maps.internal.IDistanceCalculatorDelegate;
import com.huawei.hms.maps.internal.mab;
import com.huawei.hms.maps.model.CoordinateLatLng;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.utils.LogM;
import com.huawei.hms.maps.utils.MapClientUtil;
import com.huawei.hms.maps.utils.MapsAdvUtil;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.operation.utils.Constants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class maa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IDistanceCalculatorDelegate f14159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ICoordinateConverterDelegate f14160b;

    protected static double a(LatLng latLng, LatLng latLng2) {
        IDistanceCalculatorDelegate iDistanceCalculatorDelegate;
        if (latLng == null || latLng2 == null) {
            return 0.0d;
        }
        try {
            if (MapsAdvUtil.containsMapsBasic()) {
                LogM.d("MapUtil", "computeDistanceBetween from basic.");
                if (f14159a == null) {
                    f14159a = new com.huawei.hms.maps.provider.inhuawei.IDistanceCalculatorDelegate();
                }
                iDistanceCalculatorDelegate = f14159a;
            } else {
                if (f14159a == null) {
                    a(0);
                }
                iDistanceCalculatorDelegate = f14159a;
                if (iDistanceCalculatorDelegate == null) {
                    return 0.0d;
                }
            }
            return iDistanceCalculatorDelegate.computeDistanceBetween(latLng, latLng2);
        } catch (RemoteException e) {
            LogM.d("MapUtil", "RemoteException: " + e.toString());
            return 0.0d;
        }
    }

    private static void a(int i) {
        StringBuilder sb;
        String str;
        String str2;
        try {
            Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            MapClientIdentify mapClientIdentify = new MapClientIdentify();
            int iIsHmsAvailable = HmsUtil.isHmsAvailable(application);
            if (iIsHmsAvailable != 0) {
                LogM.e("MapUtil", "hmsState check failed: " + iIsHmsAvailable);
            }
            ICreator iCreatorC = mab.c(application);
            mapClientIdentify.regestIdentity(application, iCreatorC);
            if (iCreatorC == null) {
                LogM.d("MapUtil", "creator is null");
                return;
            }
            Context contextE = mab.e(application);
            if (i == 0) {
                f14159a = iCreatorC.newDistanceCalculatorDelegate(ObjectWrapper.wrap(contextE));
                str2 = "iDistanceCalculatorDelegate: ";
            } else {
                if (i != 1) {
                    return;
                }
                f14160b = iCreatorC.newCoordinateConverterDelegate(ObjectWrapper.wrap(contextE));
                str2 = "iCoordinateConverterDelegate: ";
            }
            LogM.i("MapUtil", str2);
        } catch (RemoteException e) {
            e = e;
            sb = new StringBuilder();
            str = "RemoteException: ";
            sb.append(str);
            sb.append(e.toString());
            LogM.e("MapUtil", sb.toString());
        } catch (ClassNotFoundException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "ClassNotFoundException: ";
            sb.append(str);
            sb.append(e.toString());
            LogM.e("MapUtil", sb.toString());
        } catch (IllegalAccessException e3) {
            e = e3;
            sb = new StringBuilder();
            str = "IllegalAccessException: ";
            sb.append(str);
            sb.append(e.toString());
            LogM.e("MapUtil", sb.toString());
        } catch (NoSuchMethodException e4) {
            e = e4;
            sb = new StringBuilder();
            str = "NoSuchMethodException: ";
            sb.append(str);
            sb.append(e.toString());
            LogM.e("MapUtil", sb.toString());
        } catch (InvocationTargetException e5) {
            e = e5;
            sb = new StringBuilder();
            str = "InvocationTargetException: ";
            sb.append(str);
            sb.append(e.toString());
            LogM.e("MapUtil", sb.toString());
        }
    }

    private static boolean a() {
        return "cn".equalsIgnoreCase(MapClientUtil.getSystemProperties("ro.product.locale.region", "")) || "cn".equalsIgnoreCase(MapClientUtil.getSystemProperties(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP, "")) || "cn".equalsIgnoreCase(MapClientUtil.getSystemProperties(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP_HN, ""));
    }

    protected static int a(Context context) {
        if (a() && !b()) {
            LogM.d("MapUtil", "isHmsMapAvailable is 2");
            return 2;
        }
        if (new AvailableAdapter(HmsUtil.getMinHmsVersion(context)).isHuaweiMobileServicesAvailable(context) != 0) {
            LogM.d("MapUtil", "isHmsMapAvailable is 1");
            return 1;
        }
        LogM.d("MapUtil", "isHmsMapAvailable is 0");
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r2 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CoordinateLatLng[] a(CoordinateLatLng[] coordinateLatLngArr) {
        ICoordinateConverterDelegate iCoordinateConverterDelegate;
        if (coordinateLatLngArr == null || coordinateLatLngArr.length == 0) {
            LogM.e("MapUtil", "the input locations data is null.");
            return null;
        }
        try {
            if (MapsAdvUtil.containsMapsBasic()) {
                LogM.d("MapUtil", "rectifyCoordinate from basic.");
                if (f14160b == null) {
                    f14160b = new com.huawei.hms.maps.provider.inhuawei.ICoordinateConverterDelegate();
                }
                iCoordinateConverterDelegate = f14160b;
            } else {
                if (f14160b == null) {
                    a(1);
                }
                iCoordinateConverterDelegate = f14160b;
            }
            return iCoordinateConverterDelegate.rectifyCoordinate(coordinateLatLngArr);
        } catch (RemoteException e) {
            LogM.i("MapUtil", "rectifyCoordinate RemoteException: " + e.toString());
        }
        return null;
    }

    private static boolean b() {
        StringBuilder sb;
        int length;
        if (MapClientUtil.getSystemProperties("ro.build.version.magic", "").equals("") && MapClientUtil.getSystemProperties("ro.build.version.emui", "").contains("EmotionUI_10")) {
            String systemProperties = MapClientUtil.getSystemProperties("ro.huawei.build.display.id", "");
            LogM.d("MapUtil", "huaweiSubVersion is " + systemProperties);
            if ("".equals(systemProperties)) {
                systemProperties = MapClientUtil.getSystemProperties("ro.build.display.id", "");
                LogM.d("MapUtil", "emuiSubVersion is " + systemProperties);
            }
            String[] strArrSplit = systemProperties.split(" ");
            boolean z = false;
            if (1 < strArrSplit.length) {
                String[] strArrSplit2 = strArrSplit[1].split("\\.");
                if (3 < strArrSplit2.length) {
                    String strSubstring = strArrSplit2[3];
                    int iIndexOf = strSubstring.indexOf(Constants.LEFT_BRACKET_ONLY);
                    if (-1 != iIndexOf) {
                        strSubstring = strSubstring.substring(0, iIndexOf);
                    }
                    try {
                        int i = Integer.parseInt(strArrSplit2[0]);
                        int i2 = Integer.parseInt(strArrSplit2[1]);
                        int i3 = Integer.parseInt(strArrSplit2[2]);
                        int i4 = Integer.parseInt(strSubstring);
                        if (i < 10 || (i == 10 && i2 == 0 && i3 < 1 && i4 < 122)) {
                            z = true;
                        }
                        return !z;
                    } catch (NumberFormatException e) {
                        LogM.e("MapUtil", "NumberFormatException" + e.toString());
                    }
                } else {
                    sb = new StringBuilder("versionStrs.length <= 3: ");
                    length = strArrSplit2.length;
                }
            } else {
                sb = new StringBuilder("versions.length <= 1: ");
                length = strArrSplit.length;
            }
            sb.append(length);
            LogM.e("MapUtil", sb.toString());
            return false;
        }
        return true;
    }
}
