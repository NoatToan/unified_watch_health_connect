package defpackage;

import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class izu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f38264b;

    public static boolean b(int i) {
        return i == 264 || i == 258;
    }

    public static float d(int i) {
        float f;
        float f2;
        float f3;
        if (i == 0) {
            i = 170;
        }
        if (i < 149) {
            f2 = i;
            f3 = 0.48f;
        } else {
            if (i >= 166) {
                if (i < 185) {
                    f2 = i;
                    f3 = 0.56f;
                } else {
                    f = 110.0f;
                }
                return f / 100.0f;
            }
            f2 = i;
            f3 = (0.0025f * f2) + 0.145f;
        }
        f = f2 * f3;
        return f / 100.0f;
    }

    public static float e(int i) {
        if (i <= 0 || i >= 30) {
            return 1.0f;
        }
        if (i <= 8) {
            return 0.75f;
        }
        if (i <= 11) {
            return 0.85f;
        }
        return i >= 15 ? 1.1f : 1.0f;
    }

    public static String c(double d) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
        return numberFormat.format(d);
    }

    public static String a(String str, int i) {
        int size;
        ArrayList arrayList = new ArrayList(10);
        if (!"".equals(str)) {
            ArrayList arrayList2 = (ArrayList) izn.d(str, new TypeToken<ArrayList<Integer>>() { // from class: com.huawei.healthcloud.plugintrack.manager.utils.IndoorRunUtils$1
            });
            if (arrayList2 != null) {
                size = arrayList2.size();
            } else {
                arrayList2 = arrayList;
                size = 0;
            }
            if (size >= 12) {
                arrayList2.remove(0);
                arrayList2.add(Integer.valueOf(i));
                return CommonUtil.c((Object) arrayList2);
            }
            arrayList2.add(Integer.valueOf(i));
            return CommonUtil.c((Object) arrayList2);
        }
        arrayList.add(Integer.valueOf(i));
        return CommonUtil.c((Object) arrayList);
    }

    public static String e(String str, double d) {
        ArrayList arrayList = new ArrayList(10);
        if (!"".equals(str)) {
            ArrayList arrayList2 = (ArrayList) izn.d(str, new TypeToken<ArrayList<Double>>() { // from class: com.huawei.healthcloud.plugintrack.manager.utils.IndoorRunUtils$2
            });
            if (njy.b(arrayList2) && arrayList2.size() >= 12) {
                arrayList2.remove(0);
                arrayList2.add(Double.valueOf(d));
                return CommonUtil.c((Object) arrayList2);
            }
            arrayList2.add(Double.valueOf(d));
            return CommonUtil.c((Object) arrayList2);
        }
        arrayList.add(Double.valueOf(d));
        return CommonUtil.c((Object) arrayList);
    }

    public static void c(UserInfomation userInfomation, String str, String str2, String str3) {
        boolean z = true;
        boolean z2 = str2 == null || str3 == null;
        if (userInfomation != null && !z2) {
            z = false;
        }
        if (str == null || "".equals(str) || z) {
            return;
        }
        ArrayList arrayList = (ArrayList) izn.d(str, new TypeToken<ArrayList<Integer>>() { // from class: com.huawei.healthcloud.plugintrack.manager.utils.IndoorRunUtils$3
        });
        if (arrayList == null) {
            LogUtil.j("Track_IndoorRunUtils", "acquireCalibrationData durationDatasList is null");
            return;
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        f38264b = arrayList.size();
        LogUtil.a("Track_IndoorRunUtils", "acquireCalibrationData(), durationDatas :", Integer.valueOf(size));
        ArrayList arrayList2 = (ArrayList) izn.d(str2, new TypeToken<ArrayList<Integer>>() { // from class: com.huawei.healthcloud.plugintrack.manager.utils.IndoorRunUtils$4
        });
        int size2 = arrayList2.size();
        int[] iArr2 = new int[size2];
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            iArr2[i2] = ((Integer) arrayList2.get(i2)).intValue();
        }
        LogUtil.a("Track_IndoorRunUtils", "acquireCalibrationData(), stepDataList :", Integer.valueOf(size2));
        ArrayList arrayList3 = (ArrayList) izn.d(str3, new TypeToken<ArrayList<Float>>() { // from class: com.huawei.healthcloud.plugintrack.manager.utils.IndoorRunUtils$5
        });
        if (njy.e(arrayList3)) {
            LogUtil.j("Track_IndoorRunUtils", "acquireCalibrationData distanceDataList is empty");
            return;
        }
        int size3 = arrayList3.size();
        float[] fArr = new float[size3];
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            fArr[i3] = ((Float) arrayList3.get(i3)).floatValue();
        }
        LogUtil.a("Track_IndoorRunUtils", "acquireCalibrationData(), distanceData :", Integer.valueOf(size3));
        iym.c(userInfomation, iArr, iArr2, fArr, 0);
    }

    public static int a() {
        return f38264b;
    }

    public static Map<Integer, Float> a(Map<Integer, Float> map, float f, float f2) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Track_IndoorRunUtils", "changePaceMap paceMap is null");
            return map;
        }
        TreeMap treeMap = new TreeMap();
        float f3 = f2 / f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        float f6 = 0.0f;
        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
            float fC = (c(entry.getKey().intValue()) * f3) + f4;
            float fB = b(entry.getKey().intValue(), entry.getValue().floatValue()) + f6;
            f5 = fB / (fC / 1000.0f);
            if (fC > 1000.0f) {
                if (fC > 2000.0f) {
                    i++;
                    treeMap.put(Integer.valueOf(i * ExceptionCode.CRASH_EXCEPTION), Float.valueOf(f5));
                    fC -= 1000.0f;
                    fB -= f5;
                }
                i++;
                treeMap.put(Integer.valueOf(ExceptionCode.CRASH_EXCEPTION * i), Float.valueOf(f5));
                fC -= 1000.0f;
                fB -= f5;
            }
            f6 = fB;
            f4 = fC;
        }
        if (f4 > 1.0E-6d) {
            treeMap.put(Integer.valueOf((int) ((((int) f2) / 1000.0f) * 100.0f * 100000.0f)), Float.valueOf(f5));
        }
        LogUtil.a("Track_IndoorRunUtils", "changePaceMap newPaceMap is ", treeMap.toString());
        return treeMap;
    }

    private static float c(int i) {
        if (i % ExceptionCode.CRASH_EXCEPTION == 0) {
            return 1000.0f;
        }
        return (i / 10000) % 1000;
    }

    private static float b(int i, float f) {
        return i % ExceptionCode.CRASH_EXCEPTION == 0 ? f : (f * ((i / 10000) % 1000)) / 1000.0f;
    }

    public static List<njj> b(List<njj> list, float f, float f2) {
        if (njy.e(list)) {
            LogUtil.a("Track_IndoorRunUtils", "changePaceList paceList is null");
            return list;
        }
        ReleaseLogUtil.d("Track_IndoorRunUtils", "srcData ", npt.d(list));
        ArrayList arrayList = new ArrayList();
        float f3 = f2 / f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i = 0;
        for (njj njjVar : list) {
            float fA = (a(njjVar.c()) * f3) + f4;
            float fD = d(njjVar.c(), njjVar.d()) + f5;
            f6 = fD / (fA / 1000.0f);
            if (fA > 1000.0f) {
                if (fA > 2000.0f) {
                    i++;
                    arrayList.add(new njj(i * 1000, 0, f6));
                    fA -= 1000.0f;
                    fD -= f6;
                }
                i++;
                arrayList.add(new njj(i * 1000, 0, f6));
                fA -= 1000.0f;
                fD -= f6;
            }
            f5 = fD;
            f4 = fA;
        }
        if (f4 > 1.0E-6d) {
            arrayList.add(new njj((int) ((((int) f2) / 1000.0f) * 1000.0f), 0, f6));
        }
        LogUtil.a("Track_IndoorRunUtils", "changePaceList newPaceList is ", arrayList);
        return (List) arrayList.stream().distinct().collect(Collectors.toList());
    }

    private static float a(int i) {
        int i2 = i % 1000;
        if (i2 == 0) {
            return 1000.0f;
        }
        return i2;
    }

    private static float d(int i, float f) {
        int i2 = i % 1000;
        return i2 == 0 ? f : (f * i2) / 1000.0f;
    }

    public static Map<Double, Double> d(Map<Integer, Float> map, boolean z) {
        double d;
        double d2;
        TreeMap treeMap = new TreeMap();
        String str = "Track_IndoorRunUtils";
        if (map == null || map.size() == 0) {
            LogUtil.a("Track_IndoorRunUtils", "changePartTimeMap paceMap is null");
            return treeMap;
        }
        if (z) {
            d = 13.1099865d;
            d2 = 26.219973d;
        } else {
            d = 21.0975d;
            d2 = 42.195d;
        }
        Iterator<Map.Entry<Integer, Float>> it = map.entrySet().iterator();
        double d3 = 0.0d;
        boolean z2 = false;
        boolean z3 = false;
        double dFloatValue = 0.0d;
        while (it.hasNext()) {
            Map.Entry<Integer, Float> next = it.next();
            double dC = c(next.getKey().intValue());
            Iterator<Map.Entry<Integer, Float>> it2 = it;
            String str2 = str;
            double d4 = d2;
            double dB = b(next.getKey().intValue(), next.getValue().floatValue());
            if (!z2 && (d3 * 1000.0d) + dC > d * 1000.0d) {
                treeMap.put(Double.valueOf(d), Double.valueOf(((d - d3) * dB) + dFloatValue));
                z2 = true;
            }
            if (!z3 && (d3 * 1000.0d) + dC > d4 * 1000.0d) {
                treeMap.put(Double.valueOf(d4), Double.valueOf(((d4 - d3) * dB) + dFloatValue));
                z3 = true;
            }
            if (dC >= 1000.0d) {
                dFloatValue += (double) next.getValue().floatValue();
                d3 += 1.0d;
            }
            treeMap.put(Double.valueOf(d3), Double.valueOf(dFloatValue));
            it = it2;
            str = str2;
            d2 = d4;
        }
        LogUtil.a(str, "changePartTimeMap newPaceMap is ", treeMap.toString());
        return treeMap;
    }
}
