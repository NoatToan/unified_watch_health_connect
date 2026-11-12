package com.huawei.hihealth.data.type;

import android.content.Context;
import android.util.SparseArray;
import com.amap.api.services.core.AMapException;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthDataType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList<Integer> f12256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<Integer> f12257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<Integer> f12258c;
    public static final int d = DicDataTypeUtil.DataType.BODY_TEMPERATURE.value();
    private static ArrayList<Integer> e;
    private static ArrayList<Integer> f;
    private static ArrayList<Integer> h;
    private static SparseArray<int[]> j;

    public enum Category {
        POINT,
        SET,
        SESSION,
        SEQUENCE,
        STAT,
        REALTIME,
        CONFIG,
        CONFIGSTAT,
        CHECK_DWONLOAD,
        BUSINESS,
        UNKNOWN
    }

    public enum ChangeType {
        UPDATE,
        INCREMENT
    }

    public static class SequenceDataType {
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum TriggerParam {
        TRIGGER_FOREGROUND,
        TRIGGER_BACKGROUND,
        TRIGGER_LOCK,
        TRIGGER_OFFLINE
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum TypeSelector {
        ALL,
        VALID,
        AUTHORIZED
    }

    public static boolean g(int i) {
        return i == 2105 || i == 2002 || i == 2018;
    }

    public static boolean j(int i) {
        return i >= 22100 && i <= 22199;
    }

    public static boolean l(int i) {
        return i >= 10010 && i <= 10060;
    }

    public static boolean m(int i) {
        boolean z = 31001 <= i && i <= 31007;
        boolean z2 = i == 2200 || i == 10009;
        return z | z2 | (i == 10065) | (i == 61001);
    }

    public static boolean p(int i) {
        if (i == 2034 || i == 2104 || i == 10010 || i == 10065 || i == 44000 || i == 47101 || i == 50001 || i == 10001 || i == 10002) {
            return true;
        }
        switch (i) {
            case 10006:
            case 10007:
            case 10008:
                return true;
            default:
                switch (i) {
                    case 30005:
                    case 30006:
                    case 30007:
                        return true;
                    default:
                        switch (i) {
                            case 31001:
                            case 31002:
                            case 31003:
                            case 31004:
                            case 31005:
                            case 31006:
                            case 31007:
                                return true;
                            default:
                                switch (i) {
                                    case 40002:
                                    case 40003:
                                    case 40004:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 47201:
                                            case 47202:
                                            case 47203:
                                            case 47204:
                                                return true;
                                            default:
                                                switch (i) {
                                                    case 101001:
                                                    case 101002:
                                                    case 101003:
                                                        return true;
                                                    default:
                                                        switch (i) {
                                                            case 101201:
                                                            case 101202:
                                                                return true;
                                                            default:
                                                                return false;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static boolean q(int i) {
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8;
    }

    public static boolean r(int i) {
        return i >= 22000 && i <= 22099;
    }

    public static boolean s(int i) {
        if (i == 10001 || i == 10002 || i == 10006 || i == 10010 || i == 10065 || i == 31001) {
            return true;
        }
        switch (i) {
            case 101202:
            case 101203:
            case 101204:
                return true;
            default:
                return false;
        }
    }

    public static boolean t(int i) {
        return (i >= 2019 && i <= 2021) || (i >= 2034 && i <= 2050);
    }

    static {
        SparseArray<int[]> sparseArray = new SparseArray<>(4);
        j = sparseArray;
        sparseArray.put(10001, new int[]{2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2106});
        j.put(10010, new int[]{47401, 47405, 47406, 47402, 47403, 47404});
        j.put(10003, new int[]{2016, 2017, 2005});
        ArrayList<Integer> arrayList = new ArrayList<>(3);
        f = arrayList;
        arrayList.add(30005);
        f.add(30006);
        f.add(30007);
        f.add(30029);
        ArrayList<Integer> arrayList2 = new ArrayList<>(4);
        f12257b = arrayList2;
        arrayList2.add(47201);
        f12257b.add(47202);
        f12257b.add(47203);
        f12257b.add(47204);
        ArrayList<Integer> arrayList3 = new ArrayList<>(9);
        f12256a = arrayList3;
        arrayList3.add(31001);
        f12256a.add(31002);
        ArrayList<Integer> arrayList4 = f12256a;
        Integer numValueOf = Integer.valueOf(AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR);
        arrayList4.add(numValueOf);
        f12256a.add(10009);
        f12256a.add(31006);
        f12256a.add(31005);
        f12256a.add(31003);
        f12256a.add(31004);
        f12256a.add(31007);
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        e = arrayList5;
        arrayList5.add(31001);
        e.add(2019);
        e.add(2020);
        e.add(2021);
        e.add(2034);
        e.add(2035);
        e.add(2036);
        e.add(2037);
        e.add(2050);
        e.add(22103);
        e.add(22102);
        e.add(22105);
        e.add(22101);
        e.add(22104);
        e.add(22106);
        e.add(22107);
        e.add(22001);
        e.add(22002);
        e.add(22003);
        e.add(2104);
        e.add(numValueOf);
        e.add(2109);
        e.add(2018);
        e.add(2002);
        e.add(2101);
        e.add(2102);
        e.add(2105);
        ArrayList<Integer> arrayList6 = new ArrayList<>(2);
        h = arrayList6;
        arrayList6.add(10007);
        h.add(44000);
        ArrayList<Integer> arrayList7 = new ArrayList<>(10);
        f12258c = arrayList7;
        arrayList7.add(Integer.valueOf(DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value()));
    }

    static class MensturalMapHolder {
        static final Map<Integer, String> d;

        private MensturalMapHolder() {
        }

        static {
            HashMap map = new HashMap(16);
            d = map;
            map.put(10010, "menstrual_status");
            map.put(10015, String.valueOf(100));
            map.put(10016, String.valueOf(101));
            map.put(10017, String.valueOf(102));
            map.put(10018, String.valueOf(300));
            map.put(10019, String.valueOf(301));
            map.put(10020, String.valueOf(302));
            map.put(10021, String.valueOf(400));
            map.put(10022, String.valueOf(401));
            map.put(10023, String.valueOf(402));
            map.put(10024, String.valueOf(403));
            map.put(10025, String.valueOf(0));
            map.put(10026, String.valueOf(2));
        }
    }

    public static int[] e(int i) {
        int[] iArr = j.get(i);
        if (iArr == null) {
            List<Integer> listF = HiHealthDictManager.a((Context) null).f(i);
            if (!listF.isEmpty()) {
                int[] iArr2 = new int[listF.size()];
                for (int i2 = 0; i2 < listF.size(); i2++) {
                    iArr2[i2] = listF.get(i2).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Category d(int i) {
        if (i < 1) {
            return Category.UNKNOWN;
        }
        if (i < 10000) {
            return Category.POINT;
        }
        if (i < 20000) {
            return Category.SET;
        }
        if (i < 30000) {
            return Category.SESSION;
        }
        if (i < 40000) {
            return Category.SEQUENCE;
        }
        if (i < 50000) {
            return Category.STAT;
        }
        if (i < 60000) {
            return Category.REALTIME;
        }
        if (i < 70000) {
            return Category.BUSINESS;
        }
        if (i < 80000) {
            return Category.CONFIG;
        }
        if (i < 90000) {
            return Category.CONFIGSTAT;
        }
        if (i < 100000) {
            return Category.CHECK_DWONLOAD;
        }
        int iE = HiHealthDictManager.a((Context) null).e(i);
        if (iE == 0) {
            return Category.POINT;
        }
        if (iE == 2) {
            return Category.STAT;
        }
        HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a((Context) null).a(i);
        if (hiHealthDictTypeA != null) {
            if (hiHealthDictTypeA.c() == 1) {
                return Category.SEQUENCE;
            }
            if (hiHealthDictTypeA.c() == 3) {
                return Category.REALTIME;
            }
            return Category.SET;
        }
        return Category.UNKNOWN;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0038 A[FALL_THROUGH, RETURN] */
    public static int c(int i) {
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return 20001;
        }
        if (i != 7) {
            if (i == 8) {
                return 20001;
            }
            if (i != 2002) {
                if (i != 2034) {
                    if (i != 2105) {
                        if (i != 2200) {
                            switch (i) {
                                case 2018:
                                    break;
                                default:
                                    switch (i) {
                                        default:
                                            if (HiHealthDictManager.a((Context) null).e(i) != 0) {
                                                return 0;
                                            }
                                        case 2101:
                                        case 2102:
                                        case 2103:
                                            return i;
                                    }
                                case 2019:
                                case 2020:
                                case 2021:
                                    return i;
                            }
                        }
                    }
                }
            }
            return 2002;
        }
        return i;
    }

    public static boolean f(int i) {
        if (i >= 2019 && i != 2200) {
            return (i <= 2109 && i > 2050) || HiHealthDictManager.a((Context) null).e(i) == 0;
        }
        return true;
    }

    public static int[] o() {
        return new int[]{2, 4, 3, 5, 7};
    }

    public static int[] n() {
        return new int[]{40011, 40012, 40013, 40031, 40032, 40033, 40034, 40035, 40041, 40042, 40043, 40044, 40045, 40021, 40022, 40023, 40024, 40025, SmartMsgConstant.MSG_TYPE_RIDE_USER};
    }

    public static int[] e() {
        return new int[]{44101, 44102, 44103, 44104, 44105, 44106, 44107, 44108, 44109, 44110, 44201, 44202, 44203, 44204, 44205, 44206, 44207, 44208, 44209, 44210, 44211, 44212, 44213, 44214, 44215, 44216, 44217, 44218, 44219, 44220, 44221, 44222, 44223, 44224, 44225, 44226, 44227, 44228, 44229, 44230, 44231, 44232, 44233, 44234, 44235, 44236, 44111, 44112, 44113};
    }

    public static int[] p() {
        return new int[]{44209, 44210, 44211, 44212, 44213, 44214};
    }

    public static int[] t() {
        return new int[]{44219, 44220, 44221, 44222, 44223, 44224, 44225, 44226, 44227, 44228, 44229, 44230, 44231, 44232, 44233, 44234};
    }

    public static int[] g() {
        return new int[]{44209, 44210, 44211, 44212, 44213, 44214, 44217, 44219, 44220, 44221, 44222, 44223, 44224, 44225, 44226, 44227, 44228, 44229, 44230, 44231, 44232, 44233, 44234};
    }

    public static int[] j() {
        return new int[]{47301, 47302, 47303, 47304, 47305};
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0055 A[FALL_THROUGH, RETURN] */
    public static boolean i(int i) {
        if (i != 2002 && i != 2050 && i != 2109 && i != 2200 && i != 30001 && i != 31001 && i != 33001) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        default:
                                            switch (i) {
                                                default:
                                                    switch (i) {
                                                        default:
                                                            switch (i) {
                                                                default:
                                                                    int iE = HiHealthDictManager.a((Context) null).e(i);
                                                                    if (iE != 0 && iE != 2) {
                                                                        HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a((Context) null).a(i);
                                                                        return hiHealthDictTypeA != null && hiHealthDictTypeA.c() == 1;
                                                                    }
                                                                case 47401:
                                                                case 47402:
                                                                case 47403:
                                                                case 47404:
                                                                case 47405:
                                                                case 47406:
                                                                    return true;
                                                            }
                                                        case 22101:
                                                        case 22102:
                                                        case 22103:
                                                        case 22104:
                                                        case 22105:
                                                        case 22106:
                                                        case 22107:
                                                            return true;
                                                    }
                                                case 22001:
                                                case 22002:
                                                case 22003:
                                                    return true;
                                            }
                                        case 2101:
                                        case 2102:
                                        case 2103:
                                        case 2104:
                                        case 2105:
                                        case 2106:
                                        case 2107:
                                            return true;
                                    }
                                case 2034:
                                case 2035:
                                case 2036:
                                case 2037:
                                    return true;
                            }
                        case 2018:
                        case 2019:
                        case 2020:
                        case 2021:
                            return true;
                    }
                case 2008:
                case 2009:
                case 2010:
                case 2011:
                case 2012:
                case 2013:
                case 2014:
                case 2015:
                    return true;
            }
        }
        return true;
    }

    public static boolean h(int i) {
        if (i <= 2000 || i > 2018) {
            return (i >= 2100 && i <= 2200) || HiHealthDictManager.a((Context) null).e(i) == 0;
        }
        return true;
    }

    public static ArrayList<Integer> q() {
        return f;
    }

    public static ArrayList<Integer> d() {
        return f12257b;
    }

    public static ArrayList<Integer> a() {
        return f12256a;
    }

    public static ArrayList<Integer> k() {
        return h;
    }

    public static ArrayList<Integer> c() {
        return f12258c;
    }

    public static boolean o(int i) {
        return f.contains(Integer.valueOf(i));
    }

    public static boolean n(int i) {
        return f12257b.contains(Integer.valueOf(i));
    }

    public static boolean k(int i) {
        return h.contains(Integer.valueOf(i));
    }

    public static int a(int i) {
        if (m(i)) {
            return 31001;
        }
        if (l(i)) {
            return 10010;
        }
        return i;
    }

    public static String b(int i) {
        return MensturalMapHolder.d.get(Integer.valueOf(i));
    }

    public static int[] h() {
        return new int[]{44304, 44305, 44306, 44307, 44308};
    }

    public static int[] l() {
        return new int[]{44399, 44300};
    }

    public static int[] f() {
        return new int[]{44302, 44303};
    }

    public static int[] m() {
        return new int[]{44001, 44002, 44003, 44004, 44005, 44006, 44007, 44008, 44009};
    }

    public static int[] b() {
        return new int[]{46016, 46017, 46018, 46019, 46020};
    }

    public static int[] i() {
        return new int[]{46016, 46017, 46018, 46019};
    }
}
