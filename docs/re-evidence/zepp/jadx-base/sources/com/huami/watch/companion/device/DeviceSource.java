package com.huami.watch.companion.device;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companionlib.R;
import com.huami.watch.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceSource {
    private static final String A = "Amazfit Pace";
    private static final String B = "Amazfit Sports Watch 2";
    private static final String C = "Amazfit Sports Watch 2S";
    private static final String D = "Amazfit Stratos";
    public static final String DATA_SOURCE_ALL = "run.watch.huami.com,run.watch.everest.huami.com,run.watch.everests.huami.com,run.watch.qogir.huami.com,run.watch.xihu.huami.com,run.watch.xihue.huami.com,run.watch.xihuea.huami.com,run.watch.xihu.disney.huami.com,run.watch.everest2.huami.com,run.405.huami.com,run.410.huami.com,run.411.huami.com,run.412.huami.com,run.413.huami.com";
    public static final String DATA_SOURCE_EVEREST = "run.watch.everest.huami.com";
    public static final String DATA_SOURCE_EVEREST_S = "run.watch.everests.huami.com";
    public static final String DATA_SOURCE_HUANGHE = "run.watch.huami.com";
    public static final String DATA_SOURCE_QOGIR = "run.watch.qogir.huami.com";
    public static final String DATA_SOURCE_XIHU = "run.watch.xihu.huami.com";
    public static final String DATA_SOURCE_XIHUE = "run.watch.xihue.huami.com";
    public static final String DATA_SOURCE_XIHUEA = "run.watch.xihuea.huami.com";
    public static final String DATA_SOURCE_XIHU_DISNEY = "run.watch.xihu.disney.huami.com";
    public static final int DEVICE_TYPE_WATCH = 4;
    private static final String E = "Amazfit Stratos +";
    private static final String F = "Amazfit Smartwatch";
    private static final String G = "Amazfit Verge";
    private static final String H = "Amazfit Smartwatch2";
    private static final String I = "Amazfit Stratos 3";
    private static final String J = "Amazfit Stratos 3+";
    private static final String K = "Amazfit Stratos 3X";
    private static final String L = "run.watch.everest2.huami.com";
    private static final String M = "run.405.huami.com";
    public static final String MODEL_HUANGHE = "A1602";
    public static final String MODEL_HUANGHE_PACE = "A1612";
    private static final String N = "run.410.huami.com";
    private static final String O = "run.411.huami.com";
    private static final String P = "run.412.huami.com";
    private static final String Q = "run.413.huami.com";
    private static HashMap<String, Integer> R = null;
    private static SparseIntArray S = null;
    private static Map<String, Integer> T = null;
    private static final String a = "Device-Source";
    private static final int b = 400;
    private static final int c = 401;
    private static final int d = 402;
    private static final int e = 403;
    private static final int f = 404;
    private static final int g = 407;
    private static final int h = 408;
    private static final int i = 409;
    private static final int j = 405;
    private static final int k = 410;
    private static final int l = 411;
    private static final int m = 412;
    private static final int n = 413;
    private static final String o = "A1609";
    private static final String p = "A1619";
    private static final String q = "A1801";
    private static final String r = "A1811";
    private static final String s = "AC1807";
    private static final String t = "AC1903";
    private static final String u = "AC1817";
    private static final String v = "A1928";
    private static final String w = "A1916";
    private static final String x = "A1929";
    private static final String y = "A1940";
    private static final String z = "Amazfit Sports Watch";

    private static int a(int i2) {
        return c().get(i2, R.string.device_name_default);
    }

    @NonNull
    private static Map<String, Integer> b() {
        if (T == null) {
            HashMap map = new HashMap();
            T = map;
            map.put(DATA_SOURCE_HUANGHE, 400);
            T.put(DATA_SOURCE_EVEREST, 401);
            T.put(DATA_SOURCE_EVEREST_S, 402);
            T.put(DATA_SOURCE_QOGIR, 403);
            T.put(DATA_SOURCE_XIHU, 404);
            T.put(DATA_SOURCE_XIHUE, Integer.valueOf(g));
            T.put(DATA_SOURCE_XIHUEA, Integer.valueOf(h));
            T.put(DATA_SOURCE_XIHU_DISNEY, 409);
            T.put(L, 405);
            T.put(M, 405);
            T.put(N, Integer.valueOf(k));
            T.put(O, Integer.valueOf(l));
            T.put(P, 412);
            T.put(Q, Integer.valueOf(n));
        }
        return T;
    }

    @NonNull
    private static SparseIntArray c() {
        if (S == null) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            S = sparseIntArray;
            sparseIntArray.put(400, R.string.device_name_huanghe);
            S.put(401, R.string.device_name_everest);
            S.put(402, R.string.device_name_everest_s);
            S.put(403, R.string.device_name_qogir);
            S.put(404, R.string.device_name_xihu);
            S.put(g, R.string.device_name_xihuE);
            S.put(h, R.string.device_name_xihuEA);
            S.put(409, R.string.device_name_xihu_disney);
            S.put(405, R.string.device_name_everest2);
            S.put(k, R.string.device_name_everest2_s);
            S.put(l, R.string.device_name_everest2_oversea);
            S.put(412, R.string.device_name_everest2_s_oversea);
            S.put(n, R.string.device_name_everest2_starwar);
        }
        return S;
    }

    private static void d() {
        HashMap<String, Integer> map = new HashMap<>();
        R = map;
        map.put(MODEL_HUANGHE, 400);
        R.put(MODEL_HUANGHE_PACE, 400);
        R.put(o, 401);
        R.put(p, 401);
        R.put("A1801", 403);
        R.put(r, 403);
        R.put("AC1807", 404);
        R.put("AC1903", Integer.valueOf(g));
        R.put(u, Integer.valueOf(h));
        R.put("A1928", 405);
        R.put(w, 405);
        R.put(x, Integer.valueOf(l));
        R.put(y, 412);
    }

    private static boolean e(String str) {
        boolean z2 = "A1928".equalsIgnoreCase(str) || w.equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", IsModelEverest2: " + z2, new Object[0]);
        return z2;
    }

    private static boolean f(String str) {
        boolean zEqualsIgnoreCase = o.equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", isModelEverestMainland: " + zEqualsIgnoreCase, new Object[0]);
        return zEqualsIgnoreCase;
    }

    private static boolean g(String str) {
        boolean zEqualsIgnoreCase = MODEL_HUANGHE.equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", IsModelHuangheMainland: " + zEqualsIgnoreCase, new Object[0]);
        return zEqualsIgnoreCase;
    }

    public static int getCurrentDeviceSource(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice != null) {
            return getDeviceSource(currentDevice);
        }
        return 400;
    }

    public static String getDataSource(@NonNull Device device) {
        switch (getDeviceSource(device)) {
            case k /* 410 */:
                return N;
            case l /* 411 */:
                return O;
            case 412:
                return P;
            case n /* 413 */:
                return Q;
            default:
                return L;
        }
    }

    public static String getDeviceName(@NonNull Context context, @Nullable Device device) {
        int deviceSource;
        String strModelNumber;
        if (device != null) {
            deviceSource = getDeviceSource(device);
            strModelNumber = device.info().modelNumber();
        } else {
            deviceSource = 0;
            strModelNumber = null;
        }
        return getDeviceNameBySource(context, deviceSource, strModelNumber);
    }

    public static String getDeviceNameByDataSource(@NonNull Context context, @NonNull String str) {
        return getDeviceNameByDataSource(context, str, null);
    }

    public static String getDeviceNameBySource(@NonNull Context context, int i2, @Nullable String str) {
        int iA = a(i2);
        if (isDeviceHuangheOversea(context, i2, str)) {
            iA = R.string.device_name_pace;
        } else if (isDeviceQogirOversea(context, i2, str)) {
            iA = R.string.device_name_qogir_verge;
        }
        String string = context.getString(iA);
        Log.d(a, "DeviceSource[" + i2 + "], ModelName[" + str + "] => " + string, new Object[0]);
        return string;
    }

    public static int getDeviceSource(@NonNull Device device) {
        int i2;
        if (isModelEverest(device)) {
            i2 = isModelEverestS(device) ? 402 : 401;
        } else if (isModelQogir(device)) {
            i2 = 403;
        } else if (isModelXihu(device)) {
            i2 = isModelXihuDisney(device) ? 409 : 404;
        } else if (isModelXihuE(device)) {
            i2 = g;
        } else if (isModelXihuEA(device)) {
            i2 = h;
        } else if (isModelEverest2(device)) {
            if (isModelEverest2S(device)) {
                i2 = k;
            } else {
                i2 = isModelEverest2StarWar(device) ? n : 405;
            }
        } else if (isModelEverest2Oversea(device)) {
            i2 = isModelEverest2SOversea(device) ? 412 : l;
        } else {
            i2 = 400;
        }
        Log.d(a, "Get DeviceSource, Device[Model: " + device.info().getHuamiModel() + ", ModelName: " + device.info().modelNumber() + "] => " + i2, new Object[0]);
        return i2;
    }

    public static int getDeviceSourceByDataSource(String str) {
        Integer num = b().get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    private static boolean h(String str) {
        boolean zEqualsIgnoreCase = "A1801".equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", isModelQogirMainland: " + zEqualsIgnoreCase, new Object[0]);
        return zEqualsIgnoreCase;
    }

    public static boolean isAvailableWatchModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (R == null) {
            d();
        }
        return R.containsKey(str);
    }

    public static boolean isDataSourceEverest(String str) {
        return DATA_SOURCE_EVEREST.equalsIgnoreCase(str);
    }

    public static boolean isDataSourceEverestS(String str) {
        return DATA_SOURCE_EVEREST_S.equalsIgnoreCase(str);
    }

    public static boolean isDataSourceHuangehe(String str) {
        return DATA_SOURCE_HUANGHE.equalsIgnoreCase(str);
    }

    public static boolean isDataSourceQogir(String str) {
        return DATA_SOURCE_QOGIR.equalsIgnoreCase(str);
    }

    public static boolean isDataSourceXihu(String str) {
        return DATA_SOURCE_XIHU.equalsIgnoreCase(str);
    }

    public static boolean isDataSourceXihuDisney(String str) {
        return DATA_SOURCE_XIHU_DISNEY.equalsIgnoreCase(str);
    }

    public static boolean isDataSourceXihuE(String str) {
        return DATA_SOURCE_XIHUE.equalsIgnoreCase(str);
    }

    public static boolean isDataSourceXihuEA(String str) {
        return DATA_SOURCE_XIHUEA.equalsIgnoreCase(str);
    }

    public static boolean isDeviceHuangheOversea(@NonNull Context context, int i2, String str) {
        if (i2 == 400) {
            return A.equalsIgnoreCase(str) || Config.isUserOversea(context);
        }
        return false;
    }

    public static boolean isDeviceQogirOversea(@NonNull Context context, int i2, String str) {
        if (i2 == 403) {
            return G.equalsIgnoreCase(str) || Config.isUserOversea(context);
        }
        return false;
    }

    public static boolean isModelEverest(@NonNull Device device) {
        return isModelEverest(device.info().getHuamiModel());
    }

    public static boolean isModelEverest2(@NonNull Device device) {
        return e(device.info().getHuamiModel());
    }

    public static boolean isModelEverest2Oversea(String str) {
        boolean z2 = x.equalsIgnoreCase(str) || y.equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", IsModelEverest2 Oversea: " + z2, new Object[0]);
        return z2;
    }

    public static boolean isModelEverest2S(@NonNull Device device) {
        return J.equalsIgnoreCase(device.info().modelNumber());
    }

    public static boolean isModelEverest2SOversea(@NonNull Device device) {
        return y.equalsIgnoreCase(device.info().getHuamiModel());
    }

    public static boolean isModelEverest2StarWar(@NonNull Device device) {
        return K.equalsIgnoreCase(device.info().modelNumber());
    }

    public static boolean isModelEverestMainland(@NonNull Device device) {
        return f(DeviceUtil.getHuamiModel(device));
    }

    public static boolean isModelEverestS(@NonNull Device device) {
        String strModelNumber = device.info().modelNumber();
        boolean z2 = C.equalsIgnoreCase(strModelNumber) || E.equalsIgnoreCase(strModelNumber);
        Log.d(a, "ModelName: " + strModelNumber + ", isModelEverestS: " + z2, new Object[0]);
        return z2;
    }

    public static boolean isModelHuanghe(@NonNull Device device) {
        return isModelHuanghe(DeviceUtil.getHuamiModel(device));
    }

    public static boolean isModelHuangheMainland(@NonNull Device device) {
        return g(DeviceUtil.getHuamiModel(device));
    }

    public static boolean isModelQogir(@NonNull Device device) {
        return isModelQogir(DeviceUtil.getHuamiModel(device));
    }

    public static boolean isModelQogirMainland(@NonNull Device device) {
        return h(DeviceUtil.getHuamiModel(device));
    }

    public static boolean isModelXihu(String str) {
        boolean zEqualsIgnoreCase = "AC1807".equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", IsModelXihu: " + zEqualsIgnoreCase, new Object[0]);
        return zEqualsIgnoreCase;
    }

    public static boolean isModelXihuDisney(@NonNull Device device) {
        return isModelXihu(device) && DeviceUtil.isRomSupport(device, new String[]{"1", "3", "0", "0"});
    }

    public static boolean isModelXihuE(String str) {
        boolean zEqualsIgnoreCase = "AC1903".equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", IsModelXihuE: " + zEqualsIgnoreCase, new Object[0]);
        return zEqualsIgnoreCase;
    }

    public static boolean isModelXihuEA(String str) {
        boolean zEqualsIgnoreCase = u.equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", IsModelXihuEA: " + zEqualsIgnoreCase, new Object[0]);
        return zEqualsIgnoreCase;
    }

    public static boolean isSeriesEverest(@NonNull Device device) {
        boolean z2 = isModelEverest(device) || isModelEverestS(device) || isSeriesEverest2(device);
        Log.d(a, "Is Series Everest: " + z2, new Object[0]);
        return z2;
    }

    public static boolean isSeriesEverest2(String str) {
        boolean z2 = e(str) || isModelEverest2Oversea(str);
        Log.d(a, "Is Series Everest2: " + z2, new Object[0]);
        return z2;
    }

    public static boolean isSeriesXihu(String str) {
        return isModelXihu(str) || isModelXihuE(str) || isModelXihuEA(str);
    }

    public static String getDeviceNameByDataSource(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        return getDeviceNameBySource(context, getDeviceSourceByDataSource(str), str2);
    }

    public static boolean isModelEverest(String str) {
        boolean z2 = o.equalsIgnoreCase(str) || p.equalsIgnoreCase(str);
        Log.d(a, "HuamiModel : " + str + ", isModelEverest: " + z2, new Object[0]);
        return z2;
    }

    public static boolean isModelHuanghe(String str) {
        boolean z2 = MODEL_HUANGHE.equalsIgnoreCase(str) || MODEL_HUANGHE_PACE.equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", IsModelHuanghe: " + z2, new Object[0]);
        return z2;
    }

    public static boolean isModelQogir(String str) {
        boolean z2 = "A1801".equalsIgnoreCase(str) || r.equalsIgnoreCase(str);
        Log.d(a, "HuamiModel: " + str + ", IsModelQogir: " + z2, new Object[0]);
        return z2;
    }

    public static boolean isModelXihu(@NonNull Device device) {
        return isModelXihu(device.info().getHuamiModel());
    }

    public static boolean isModelXihuE(@NonNull Device device) {
        return isModelXihuE(device.info().getHuamiModel());
    }

    public static boolean isModelXihuEA(@NonNull Device device) {
        return isModelXihuEA(device.info().getHuamiModel());
    }

    public static boolean isSeriesEverest2(@NonNull Device device) {
        boolean z2 = isModelEverest2(device) || isModelEverest2Oversea(device);
        Log.d(a, "Is Series Everest2: " + z2, new Object[0]);
        return z2;
    }

    public static boolean isModelEverest2Oversea(@NonNull Device device) {
        return isModelEverest2Oversea(device.info().getHuamiModel());
    }

    public static boolean isSeriesXihu(@NonNull Device device) {
        return isSeriesXihu(device.info().getHuamiModel());
    }

    public static boolean isSeriesEverest2(int i2) {
        boolean z2 = i2 == 405 || i2 == k || i2 == l || i2 == 412 || i2 == n;
        Log.d(a, "Is Series Everest2: " + z2 + ", DeviceSource: " + i2, new Object[0]);
        return z2;
    }
}
