package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
class oab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, List<String>> f44012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, List<String>> f44013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, List<String>> f44014c;
    private static final List<String> d;
    private static final List<String> e;
    private static final List<String> f;
    private static final List<String> g;
    private static final List<String> h;
    private static final List<String> i;
    private static final List<String> j;
    private static final List<String> k;
    private static final List<String> l;
    private static final List<String> m;
    private static final List<String> n;
    private static final List<String> o;
    private static final List<String> p;
    private static final List<String> q;
    private static final List<String> r;
    private static final List<String> t;

    oab() {
    }

    static {
        HashMap map = new HashMap(16);
        f44012a = map;
        HashMap map2 = new HashMap(16);
        f44014c = map2;
        HashMap map3 = new HashMap(16);
        f44013b = map3;
        ArrayList arrayList = new ArrayList() { // from class: oab.3
            {
                add("com.samsung.android.sm_cn");
                add("com.samsung.android.sm");
            }
        };
        l = arrayList;
        ArrayList arrayList2 = new ArrayList() { // from class: oab.10
            {
                add("com.coloros.phonemanager");
                add("com.coloros.safecenter");
            }
        };
        f = arrayList2;
        ArrayList arrayList3 = new ArrayList() { // from class: oab.8
            {
                add("com.hihonor.systemmanager");
            }
        };
        d = arrayList3;
        ArrayList arrayList4 = new ArrayList() { // from class: oab.12
            {
                add("com.vivo.permissionmanager,com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
                add("com.vivo.permissionmanager,com.vivo.permissionmanager.activity.BgStartUpManagerActivity");
            }
        };
        r = arrayList4;
        ArrayList arrayList5 = new ArrayList() { // from class: oab.13
            {
                add("com.iqoo.powersaving,com.iqoo.powersaving.BackgroundHighUsageActivity");
            }
        };
        p = arrayList5;
        ArrayList arrayList6 = new ArrayList() { // from class: oab.14
            {
                add("com.vivo.permissionmanager,com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
                add("com.vivo.appfilter,com.vivo.appfilter.activity.StartupManagerActivityRom30");
            }
        };
        n = arrayList6;
        ArrayList arrayList7 = new ArrayList() { // from class: oab.11
            {
                add("com.miui.securitycenter,com.miui.permcenter.autostart.AutoStartManagementActivity");
            }
        };
        q = arrayList7;
        t = new ArrayList() { // from class: oab.15
            {
                add("com.miui.powerkeeper,com.miui.powerkeeper.ui.HiddenAppsContainerManagementActivity");
            }
        };
        ArrayList arrayList8 = new ArrayList() { // from class: oab.20
            {
                add("com.letv.android.letvsafe,com.letv.android.letvsafe.AutobootManageActivity");
            }
        };
        e = arrayList8;
        ArrayList arrayList9 = new ArrayList() { // from class: oab.2
            {
                add("com.smartisanos.security");
            }
        };
        k = arrayList9;
        ArrayList arrayList10 = new ArrayList() { // from class: oab.4
            {
                add("com.smartisanos.security,com.smartisanos.powerusage.AppBatteryUseOptimizationActivity");
            }
        };
        o = arrayList10;
        ArrayList arrayList11 = new ArrayList() { // from class: oab.1
            {
                add("com.coloros.phonemanager");
            }
        };
        m = arrayList11;
        ArrayList arrayList12 = new ArrayList() { // from class: oab.5
            {
                add("com.meizu.safe,com.meizu.safe.permission.SmartBGActivity");
            }
        };
        g = arrayList12;
        ArrayList arrayList13 = new ArrayList() { // from class: oab.9
            {
                add("com.coloros.phonemanager");
            }
        };
        j = arrayList13;
        ArrayList arrayList14 = new ArrayList() { // from class: oab.7
            {
                add("com.coloros.phonemanager");
            }
        };
        i = arrayList14;
        ArrayList arrayList15 = new ArrayList() { // from class: oab.6
            {
                add("com.zui.safecenter");
            }
        };
        h = arrayList15;
        map.put("honor", arrayList3);
        map.put("letv", arrayList8);
        map.put("lenovo", arrayList15);
        map.put("meizu", arrayList12);
        map.put("oneplus", arrayList13);
        map.put("oppo", arrayList2);
        map.put("realme", arrayList11);
        map.put("samsung", arrayList);
        map.put("smartisan", arrayList9);
        map.put("vivo", arrayList4);
        map.put("xiaomi", arrayList7);
        map.put("redmi", arrayList7);
        map.put("poco", arrayList7);
        map2.put("honor", arrayList3);
        map2.put("letv", arrayList8);
        map2.put("lenovo", arrayList15);
        map2.put("meizu", arrayList12);
        map2.put("oneplus", arrayList14);
        map2.put("oppo", arrayList2);
        map2.put("realme", arrayList11);
        map2.put("samsung", arrayList);
        map2.put("smartisan", arrayList10);
        map2.put("vivo", arrayList5);
        map3.put("vivo", arrayList6);
    }
}
