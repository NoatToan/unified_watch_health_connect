package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import health.compact.a.HiDateUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes19.dex */
public class wgr {
    private static List<String> d;

    public static boolean b(int i, int i2, int i3) {
        return i == (i2 != 0 ? i2 + 1 : 0) + i3;
    }

    public static boolean c(int i, int i2) {
        return i == (i2 != 0 ? i2 + 1 : 0) + 1;
    }

    static {
        ArrayList arrayList = new ArrayList(10);
        d = arrayList;
        arrayList.add("sinocare");
        d.add("VivachekCloud");
        d.add("www.bioland.com.cn");
    }

    public static String a(int i, HiHealthData hiHealthData, vzo vzoVar) {
        String str = "";
        if (hiHealthData != null) {
            if (i == 103) {
                return c(hiHealthData.getEndTime(), hiHealthData.getStartTime());
            }
            if (i == 107) {
                int i2 = hiHealthData.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC);
                int i3 = hiHealthData.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC);
                if (Math.abs(i2) >= 0.5d) {
                    str = UnitUtil.e(i2, 1, 0) + "/" + UnitUtil.e(i3, 1, 0);
                } else {
                    LogUtil.j("OperateUtil", "invalid bloodPressure value");
                }
                return wgv.d(str);
            }
        }
        return "";
    }

    public static String e(int i, HiHealthData hiHealthData, vzo vzoVar) {
        if (hiHealthData == null) {
            return "";
        }
        if (i == 103) {
            if (wig.d(hiHealthData.getStartTime(), hiHealthData.getEndTime())) {
                return a(hiHealthData, 1004);
            }
            return a(hiHealthData, 1003);
        }
        if (i != 107) {
            return "";
        }
        if (vzoVar != null && vzoVar.c() == 3) {
            return wig.e(hiHealthData.getStartTime());
        }
        return wig.b(hiHealthData.getStartTime());
    }

    public static String a(HiHealthData hiHealthData, int i) {
        switch (i) {
            case 1000:
                return wig.d(hiHealthData.getStartTime());
            case 1001:
                return wig.e(hiHealthData.getStartTime()) + Constants.LINK + wig.e(hiHealthData.getEndTime());
            case 1002:
            default:
                return "";
            case 1003:
                return wig.b(hiHealthData.getStartTime()) + Constants.LINK + wig.b(hiHealthData.getEndTime());
            case 1004:
                return wig.b(hiHealthData.getStartTime()) + Constants.LINK + wig.e(hiHealthData.getEndTime());
            case 1005:
                return wig.e(hiHealthData.getStartTime());
        }
    }

    public static long d(long j) {
        return HiDateUtil.a(j, TimeZone.getDefault());
    }

    public static long b(long j) {
        return HiDateUtil.c(j, TimeZone.getDefault());
    }

    public static long c(long j) {
        return d(j + 14400000) - 14400000;
    }

    public static long a(long j) {
        return b(j + 14400000) - 14400000;
    }

    public static String c(long j, long j2) {
        return wgv.i((int) ((j - j2) / 60000));
    }

    public static boolean a(HiHealthClient hiHealthClient) {
        HiDeviceInfo hiDeviceInfo = hiHealthClient.getHiDeviceInfo();
        HiAppInfo hiAppInfo = hiHealthClient.getHiAppInfo();
        if (hiDeviceInfo == null || hiAppInfo == null) {
            LogUtil.a("OperateUtil", "deviceInfo or appInfo is null");
            return false;
        }
        return d(hiAppInfo.getPackageName(), hiDeviceInfo.getDeviceUniqueCode());
    }

    public static boolean d(String str, String str2) {
        return vzm.f51747b.equals(str) && "-1".equals(str2);
    }

    public static boolean c(String str) {
        return (str == null || str.isEmpty() || str.equals(vzm.f51747b) || str.equals("com.huawei.ohos.health.device") || str.startsWith("com.huawei.health.cloud.device") || str.startsWith("com.huawei.health.device") || d.contains(str)) ? false : true;
    }

    public static boolean d(int i, Context context) {
        return xjj.d("02B").contains(Integer.valueOf(i));
    }

    public static void c(List<SourceInfo> list, Context context) {
        if (njy.e(list)) {
            return;
        }
        HashSet<Integer> hashSetD = xjj.d("095");
        Iterator<SourceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (hashSetD.contains(Integer.valueOf(it.next().getDeviceType()))) {
                it.remove();
            }
        }
    }

    public static int[] e(HashSet<Integer> hashSet) {
        int[] iArr = new int[hashSet.size()];
        Iterator<Integer> it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }
}
