package defpackage;

import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Integer> f39916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Integer> f39917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f39918c;
    public static final List<String> d;
    public static final List<Integer> e;
    private static final Map<Integer, String> f;
    public static final List<Integer> i;

    static {
        HashMap map = new HashMap(16);
        f = map;
        ArrayList arrayList = new ArrayList();
        arrayList.add(2004);
        arrayList.add(2022);
        arrayList.add(2023);
        arrayList.add(2024);
        arrayList.add(2025);
        arrayList.add(2026);
        arrayList.add(2027);
        arrayList.add(2028);
        arrayList.add(2029);
        arrayList.add(2030);
        arrayList.add(2031);
        arrayList.add(Integer.valueOf(Constants.START_TO_MAIN_ACTIVITY));
        arrayList.add(2033);
        arrayList.add(2053);
        arrayList.add(2076);
        arrayList.add(2077);
        arrayList.add(2078);
        arrayList.add(2079);
        arrayList.add(2080);
        arrayList.add(2081);
        arrayList.add(2083);
        arrayList.add(2084);
        arrayList.add(2085);
        arrayList.add(2086);
        arrayList.add(2087);
        arrayList.add(2088);
        arrayList.add(2090);
        i = Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(2008);
        arrayList2.add(2009);
        arrayList2.add(2010);
        arrayList2.add(2011);
        arrayList2.add(2012);
        arrayList2.add(2013);
        arrayList2.add(2014);
        arrayList2.add(2015);
        arrayList2.add(2106);
        e = Collections.unmodifiableList(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(2006);
        arrayList3.add(2007);
        arrayList3.add(2018);
        f39916a = Collections.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(2201);
        arrayList4.add(2202);
        arrayList4.add(2203);
        arrayList4.add(2204);
        f39917b = Collections.unmodifiableList(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("meta_data");
        arrayList5.add("detail_data");
        arrayList5.add("simple_data");
        d = Collections.unmodifiableList(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(BleConstants.SPORT_TYPE);
        arrayList6.add("totalTime");
        arrayList6.add(BleConstants.TOTAL_CALORIES);
        arrayList6.add("skipNum");
        arrayList6.add("skipSpeed");
        arrayList6.add("stumblingRope");
        arrayList6.add("maxSkippingTimes");
        f39918c = Collections.unmodifiableList(arrayList6);
        map.put(10011, "com.huawei.health.mc");
        map.put(10065, "com.huawei.health.ecg.activate.status");
        map.put(10067, "com.huawei.health.ecgce.activate.status");
        map.put(10066, "osa_switch_status");
        map.put(10068, "com.huawei.health.ppg.activate.status");
        map.put(10069, "com.huawei.health.vascularhealth.activate.status");
    }

    public static String d(int i2) {
        return f.get(Integer.valueOf(i2));
    }

    public static boolean c(int i2) {
        return f.containsKey(Integer.valueOf(i2));
    }
}
