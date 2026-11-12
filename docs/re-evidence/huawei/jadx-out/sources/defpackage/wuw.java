package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class wuw {
    public static String a(String str, Object obj) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        int iD = miq.d(obj, atomicBoolean);
        if (!atomicBoolean.get()) {
            return String.valueOf(iD);
        }
        lua.d(String.valueOf(10000), "ovuFerPerSwitch", iD != 0);
        ReleaseLogUtil.c("R_PhysiologicalCycleUtil_" + str, "getOvulationFertilePeriodSwitch ovulationFertilePeriodSwitch ", Integer.valueOf(iD), " isPullAllStatus ", Boolean.valueOf(lua.e()));
        return String.valueOf(iD);
    }

    public static boolean e() {
        return lua.a(String.valueOf(10000), "ovuFerPerSwitch", true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    public static int b(String str, String str2, List<HiHealthData> list, int i) {
        boolean zE;
        int iB;
        int iE = 1;
        iE = 1;
        zE = true;
        zE = true;
        boolean zE2 = true;
        if (TextUtils.isEmpty(str2) || njy.e(list)) {
            ReleaseLogUtil.d("R_PhysiologicalCycleUtil_" + str, "getTargetDays type ", str2, " currentIndex ", Integer.valueOf(i));
            return 1;
        }
        str2.hashCode();
        switch (str2) {
            case "0.0":
                iB = b(list, i);
                boolean z = zE2;
                iE = iB;
                zE = z;
                break;
            case "2.0":
            case "400.0":
            case "402.0":
                zE2 = e();
                if (zE2) {
                    iB = b("401.0", list, i);
                } else {
                    iB = e(list, i);
                }
                boolean z2 = zE2;
                iE = iB;
                zE = z2;
                break;
            case "100.0":
            case "102.0":
                iB = b("101.0", list, i);
                boolean z3 = zE2;
                iE = iB;
                zE = z3;
                break;
            case "101.0":
            case "301.0":
                zE = true;
                break;
            case "300.0":
            case "302.0":
                iB = b("301.0", list, i);
                boolean z4 = zE2;
                iE = iB;
                zE = z4;
                break;
            case "401.0":
            case "403.0":
                zE = e();
                if (!zE) {
                    iE = e(list, i);
                    break;
                }
                break;
            default:
                ReleaseLogUtil.d("R_PhysiologicalCycleUtil_" + str, "getTargetDays default type ", str2);
                zE = true;
                break;
        }
        LogUtil.b("PhysiologicalCycleUtil_" + str, "getTargetDays targetDays ", Integer.valueOf(iE), " type ", str2, " currentIndex ", Integer.valueOf(i), " isSupportOvulationFertilePeriod ", Boolean.valueOf(zE));
        return iE;
    }

    private static int b(String str, List<HiHealthData> list, int i) {
        for (int i2 = i; i2 < list.size() - 1; i2++) {
            if (str.equals(String.valueOf(list.get(i2).getDouble("point_value")))) {
                return (i2 - i) + 1;
            }
        }
        return 1;
    }

    private static int e(List<HiHealthData> list, int i) {
        int size = list.size();
        int i2 = i;
        while (i2 >= 0 && i2 < size - 1) {
            HiHealthData hiHealthData = list.get(i2);
            if (hiHealthData != null) {
                if ("301.0".equals(String.valueOf(hiHealthData.getDouble("point_value")))) {
                    return i - i2;
                }
                i2--;
            }
        }
        return 1;
    }

    private static int b(List<HiHealthData> list, int i) {
        boolean zE = e();
        for (int i2 = i; i2 >= 0; i2--) {
            String strValueOf = String.valueOf(list.get(i2).getDouble("point_value"));
            if ("101.0".equals(strValueOf) || "301.0".equals(strValueOf) || (zE && "401.0".equals(strValueOf))) {
                return i - i2;
            }
        }
        return 1;
    }

    public static Pair<Integer, CharSequence> a(String str, String str2, List<HiHealthData> list, int i) {
        String strA;
        int iB = b(str, str2, list, i);
        byte b2 = 0;
        String strE = UnitUtil.e(iB, 1, 0);
        if ("FunctionSetPhysiologicalCycleCardReader".equals(str) && LanguageUtil.l(BaseApplication.b())) {
            strE = " " + strE + " ";
        }
        String strE2 = qre.e(R.plurals.IDS_physiology_day_num, iB, strE);
        str2.hashCode();
        int i2 = 3;
        switch (str2.hashCode()) {
            case 47602:
                if (!str2.equals("0.0")) {
                    b2 = -1;
                }
                break;
            case 49524:
                b2 = !str2.equals("2.0") ? (byte) -1 : (byte) 1;
                break;
            case 46730099:
                b2 = !str2.equals("100.0") ? (byte) -1 : (byte) 2;
                break;
            case 46731060:
                b2 = !str2.equals("101.0") ? (byte) -1 : (byte) 3;
                break;
            case 46732021:
                b2 = !str2.equals("102.0") ? (byte) -1 : (byte) 4;
                break;
            case 48577141:
                b2 = !str2.equals("300.0") ? (byte) -1 : (byte) 5;
                break;
            case 48578102:
                b2 = !str2.equals("301.0") ? (byte) -1 : (byte) 6;
                break;
            case 48579063:
                b2 = !str2.equals("302.0") ? (byte) -1 : (byte) 7;
                break;
            case 49500662:
                b2 = !str2.equals("400.0") ? (byte) -1 : (byte) 8;
                break;
            case 49501623:
                b2 = !str2.equals("401.0") ? (byte) -1 : (byte) 9;
                break;
            case 49502584:
                b2 = !str2.equals("402.0") ? (byte) -1 : (byte) 10;
                break;
            case 49503545:
                b2 = !str2.equals("403.0") ? (byte) -1 : (byte) 11;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return b(str, list, i, iB);
            case 1:
            case 8:
            case 9:
            case 10:
            case 11:
                if (e()) {
                    strA = qre.a(R.string.IDS_physiology_pregnancies, strE2);
                } else {
                    strA = qre.a(R.string.IDS_physiology_distances_fore, qre.e(R.plurals.IDS_physiology_day, iB, strE));
                    i2 = 2;
                }
                return new Pair<>(Integer.valueOf(i2), strA);
            case 2:
            case 3:
            case 4:
                return new Pair<>(1, qre.a(R.string.IDS_physiology_menstrual, strE2));
            case 5:
            case 6:
            case 7:
                return new Pair<>(2, qre.a(R.string.IDS_physiology_forecasts, strE2));
            default:
                return new Pair<>(-1, "");
        }
    }

    private static Pair<Integer, CharSequence> b(String str, List<HiHealthData> list, int i, int i2) {
        int i3;
        boolean zE = e();
        String strE = UnitUtil.e(i2, 1, 0);
        if ("FunctionSetPhysiologicalCycleCardReader".equals(str) && LanguageUtil.l(BaseApplication.b())) {
            strE = " " + strE + " ";
        }
        String strE2 = qre.e(R.plurals.IDS_physiology_day, i2, strE);
        String strA = qre.a(R.string.IDS_physiology_distances_fore, strE2);
        while (true) {
            i3 = 4;
            if (i < 0) {
                break;
            }
            String strValueOf = String.valueOf(list.get(i).getDouble("point_value"));
            if ("101.0".equals(strValueOf)) {
                strA = qre.a(R.string.IDS_physiology_distances, strE2);
                break;
            }
            if ("301.0".equals(strValueOf)) {
                strA = qre.a(R.string.IDS_physiology_distances_fore, strE2);
                break;
            }
            if (zE && "401.0".equals(strValueOf)) {
                strA = qre.a(R.string.IDS_physiology_distances_pre, strE2);
                i3 = 5;
                break;
            }
            i--;
        }
        return new Pair<>(Integer.valueOf(i3), strA);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[SYNTHETIC] */
    public static int b(String str, List<HiHealthData> list, int i, long j) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_PhysiologicalCycleUtil_" + str, "getLastIndex dataList ", list);
            return -1;
        }
        boolean zE = e();
        LogUtil.b("PhysiologicalCycleUtil_" + str, "getLastIndex isSupportOvulationFertilePeriod ", Boolean.valueOf(zE), " currentIndex ", Integer.valueOf(i), " lastStartTime ", Long.valueOf(j));
        if (zE) {
            return -1;
        }
        int size = list.size();
        boolean zD = true;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            HiHealthData hiHealthData = list.get(i3);
            if (hiHealthData != null) {
                if (i3 <= i) {
                    String strValueOf = String.valueOf(hiHealthData.getDouble("point_value"));
                    if (TextUtils.isEmpty(strValueOf)) {
                        continue;
                    } else {
                        zD = d(strValueOf);
                        if (!zD) {
                            return -1;
                        }
                        if (j == hiHealthData.getStartTime()) {
                            i2 = i3;
                        }
                    }
                } else {
                    if (!zD) {
                        return -1;
                    }
                    if (j == hiHealthData.getStartTime()) {
                        i2 = i3;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    private static boolean d(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "0.0":
                b2 = 0;
                break;
            case "2.0":
                b2 = 1;
                break;
            case "400.0":
                b2 = 2;
                break;
            case "401.0":
                b2 = 3;
                break;
            case "402.0":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        return b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4;
    }
}
