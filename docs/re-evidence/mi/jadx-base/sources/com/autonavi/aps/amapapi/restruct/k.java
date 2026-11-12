package com.autonavi.aps.amapapi.restruct;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.cbt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    static long d;
    static long e;
    static long f;
    public static long g;
    static long h;
    public static HashMap<String, Long> v = new HashMap<>(36);
    public static long w = 0;
    static int x = 0;
    public static long z = 0;
    private com.autonavi.aps.amapapi.c E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WifiManager f6871a;
    Context i;
    i t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<cbt> f6872b = new ArrayList<>();
    ArrayList<cbt> c = new ArrayList<>();
    boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    StringBuilder f6873k = null;
    boolean l = true;
    boolean m = true;
    boolean n = true;
    private volatile j B = null;
    String o = null;
    TreeMap<Integer, cbt> p = null;
    public boolean q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6874r = true;
    public boolean s = false;
    private String C = "";
    long u = 0;
    ConnectivityManager y = null;
    private long D = 30000;
    volatile boolean A = false;

    public k(Context context, WifiManager wifiManager, Handler handler) {
        this.f6871a = wifiManager;
        this.i = context;
        i iVar = new i(context, "wifiAgee", handler);
        this.t = iVar;
        iVar.a();
    }

    private void A() {
        int iT;
        try {
            if (this.f6871a == null) {
                return;
            }
            try {
                iT = t();
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "OPENSDK_WMW", "cwsc");
                iT = 4;
            }
            if (this.f6872b == null) {
                this.f6872b = new ArrayList<>();
            }
            if (iT == 0 || iT == 1 || iT == 4) {
                g();
            }
        } catch (Throwable unused) {
        }
    }

    private void B() {
        try {
            if (com.autonavi.aps.amapapi.utils.k.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                this.f6874r = this.f6871a.isWifiEnabled();
            }
        } catch (Throwable unused) {
            com.autonavi.aps.amapapi.utils.e.b();
        }
    }

    private boolean C() {
        this.q = w();
        B();
        if (!this.q || !this.l) {
            return false;
        }
        if (f != 0) {
            if (com.autonavi.aps.amapapi.utils.k.b() - f < 4900 || com.autonavi.aps.amapapi.utils.k.b() - g < 1500) {
                return false;
            }
            com.autonavi.aps.amapapi.utils.k.b();
        }
        return true;
    }

    public static long b() {
        return ((com.autonavi.aps.amapapi.utils.k.b() - w) / 1000) + 1;
    }

    public static String q() {
        return String.valueOf(com.autonavi.aps.amapapi.utils.k.b() - g);
    }

    private List<cbt> s() {
        List<ScanResult> scanResults;
        if (this.f6871a != null) {
            try {
                if (com.autonavi.aps.amapapi.utils.k.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                    scanResults = this.f6871a.getScanResults();
                } else {
                    com.autonavi.aps.amapapi.utils.c.a(new Exception("gst_n_aws"), "OPENSDK_WMW", "gsr_n_aws");
                    scanResults = null;
                }
                HashMap<String, Long> map = new HashMap<>(36);
                if (scanResults != null) {
                    for (ScanResult scanResult : scanResults) {
                        map.put(scanResult.BSSID, Long.valueOf(scanResult.timestamp));
                    }
                }
                if (v.isEmpty() || !v.equals(map)) {
                    v = map;
                    w = com.autonavi.aps.amapapi.utils.k.b();
                }
                this.o = null;
                ArrayList arrayList = new ArrayList();
                this.C = "";
                this.B = n();
                if (a(this.B)) {
                    this.C = this.B.a();
                }
                if (scanResults != null && scanResults.size() > 0) {
                    int size = scanResults.size();
                    for (int i = 0; i < size; i++) {
                        ScanResult scanResult2 = scanResults.get(i);
                        cbt cbtVar = new cbt(!TextUtils.isEmpty(this.C) && this.C.equals(scanResult2.BSSID));
                        cbtVar.f5175b = scanResult2.SSID;
                        cbtVar.d = scanResult2.frequency;
                        cbtVar.e = scanResult2.timestamp;
                        cbtVar.f5174a = cbt.a(scanResult2.BSSID);
                        cbtVar.c = (short) scanResult2.level;
                        short sElapsedRealtime = (short) ((SystemClock.elapsedRealtime() - (scanResult2.timestamp / 1000)) / 1000);
                        cbtVar.g = sElapsedRealtime;
                        if (sElapsedRealtime < 0) {
                            cbtVar.g = (short) 0;
                        }
                        cbtVar.f = com.autonavi.aps.amapapi.utils.k.b();
                        arrayList.add(cbtVar);
                    }
                }
                this.t.a((List) arrayList);
                return arrayList;
            } catch (SecurityException e2) {
                this.o = e2.getMessage();
            } catch (Throwable th) {
                this.o = null;
                com.autonavi.aps.amapapi.utils.c.a(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    private int t() {
        WifiManager wifiManager = this.f6871a;
        if (wifiManager != null) {
            return wifiManager.getWifiState();
        }
        return 4;
    }

    private boolean u() {
        long jB = com.autonavi.aps.amapapi.utils.k.b() - d;
        if (jB < 4900) {
            return false;
        }
        if (v() && jB < 9900) {
            return false;
        }
        if (x > 1) {
            long jO = this.D;
            if (jO == 30000) {
                jO = com.autonavi.aps.amapapi.utils.b.o() != -1 ? com.autonavi.aps.amapapi.utils.b.o() : 30000L;
            }
            if (Build.VERSION.SDK_INT >= 28 && jB < jO) {
                return false;
            }
        }
        if (this.f6871a != null) {
            d = com.autonavi.aps.amapapi.utils.k.b();
            int i = x;
            if (i < 2) {
                x = i + 1;
            }
            if (com.autonavi.aps.amapapi.utils.k.c(this.i, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF")) {
                return this.f6871a.startScan();
            }
            com.autonavi.aps.amapapi.utils.c.a(new Exception("n_cws"), "OPENSDK_WMW", "wfs_n_cws");
        }
        return false;
    }

    private boolean v() {
        if (this.y == null) {
            this.y = (ConnectivityManager) com.autonavi.aps.amapapi.utils.k.a(this.i, OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        }
        return a(this.y);
    }

    private boolean w() {
        if (this.f6871a == null) {
            return false;
        }
        return com.autonavi.aps.amapapi.utils.k.g(this.i);
    }

    private void x() {
        if (C()) {
            long jB = com.autonavi.aps.amapapi.utils.k.b();
            if (jB - e >= 10000) {
                this.f6872b.clear();
                h = g;
            }
            y();
            if (jB - e >= 10000) {
                for (int i = 20; i > 0 && g == h; i--) {
                    try {
                        Thread.sleep(150L);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private void y() {
        if (C()) {
            try {
                if (u()) {
                    f = com.autonavi.aps.amapapi.utils.k.b();
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "WifiManager", "wifiScan");
            }
        }
    }

    private void z() {
        List<cbt> listS;
        if (h != g) {
            try {
                listS = s();
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "WifiManager", "updateScanResult");
                listS = null;
            }
            h = g;
            if (listS == null) {
                this.f6872b.clear();
            } else {
                this.f6872b.clear();
                this.f6872b.addAll(listS);
            }
        }
    }

    public final ArrayList<cbt> a() {
        if (!this.s) {
            return this.c;
        }
        b(true);
        return this.c;
    }

    public final WifiInfo c() {
        try {
            if (this.f6871a == null) {
                return null;
            }
            if (com.autonavi.aps.amapapi.utils.k.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                return this.f6871a.getConnectionInfo();
            }
            com.autonavi.aps.amapapi.utils.c.a(new Exception("gci_n_aws"), "OPENSDK_WMW", "gci_n_aws");
            return null;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "WifiManagerWrapper", "getConnectionInfo");
            return null;
        }
    }

    public final String d() {
        return this.o;
    }

    public final ArrayList<cbt> e() {
        if (this.f6872b == null) {
            return null;
        }
        ArrayList<cbt> arrayList = new ArrayList<>();
        if (!this.f6872b.isEmpty()) {
            arrayList.addAll(this.f6872b);
        }
        return arrayList;
    }

    public final void f() {
        try {
            this.s = true;
            List<cbt> listS = s();
            if (listS != null) {
                this.f6872b.clear();
                this.f6872b.addAll(listS);
            }
            d(true);
        } catch (Throwable unused) {
        }
    }

    public final void g() {
        this.B = null;
        this.f6872b.clear();
    }

    public final void h() {
        this.B = null;
    }

    public final void i() {
        z = System.currentTimeMillis();
        com.autonavi.aps.amapapi.c cVar = this.E;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void j() {
        if (this.f6871a != null && com.autonavi.aps.amapapi.utils.k.b() - g > 4900) {
            g = com.autonavi.aps.amapapi.utils.k.b();
        }
    }

    public final void k() {
        if (this.f6871a == null) {
            return;
        }
        this.A = true;
    }

    public final boolean l() {
        return this.q;
    }

    public final boolean m() {
        return this.f6874r;
    }

    public final j n() {
        B();
        if (!m()) {
            return null;
        }
        if (this.B == null) {
            this.B = new j(c());
        }
        return this.B;
    }

    public final boolean o() {
        return this.j;
    }

    public final String p() {
        String str;
        StringBuilder sb = this.f6873k;
        int i = 0;
        if (sb == null) {
            this.f6873k = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        this.j = false;
        int size = this.f6872b.size();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean z4 = true;
            if (i >= size) {
                break;
            }
            String strC = cbt.c(this.f6872b.get(i).f5174a);
            if (!this.m && !"<unknown ssid>".equals(this.f6872b.get(i).f5175b)) {
                z2 = true;
            }
            if (TextUtils.isEmpty(this.C) || !this.C.equals(strC)) {
                z4 = z3;
                str = "nb";
            } else {
                str = "access";
            }
            this.f6873k.append(String.format(Locale.US, "#%s,%s", strC, str));
            i++;
            z3 = z4;
        }
        if (this.f6872b.size() == 0) {
            z2 = true;
        }
        if (!this.m && !z2) {
            this.j = true;
        }
        if (!z3 && !TextUtils.isEmpty(this.C)) {
            StringBuilder sb2 = this.f6873k;
            sb2.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
            sb2.append(this.C);
            this.f6873k.append(",access");
        }
        return this.f6873k.toString();
    }

    public final long r() {
        return this.u;
    }

    private void d(boolean z2) {
        ArrayList<cbt> arrayList = this.f6872b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (com.autonavi.aps.amapapi.utils.k.b() - g > 3600000) {
            g();
        }
        if (this.p == null) {
            this.p = new TreeMap<>(Collections.reverseOrder());
        }
        this.p.clear();
        if (this.s && z2) {
            try {
                this.c.clear();
            } catch (Throwable unused) {
            }
        }
        int size = this.f6872b.size();
        this.u = 0L;
        for (int i = 0; i < size; i++) {
            cbt cbtVar = this.f6872b.get(i);
            if (cbtVar.h) {
                this.u = cbtVar.f;
            }
            if (com.autonavi.aps.amapapi.utils.k.a(cbt.c(cbtVar.f5174a)) && (size <= 20 || a(cbtVar.c))) {
                if (this.s && z2) {
                    this.c.add(cbtVar);
                }
                if (TextUtils.isEmpty(cbtVar.f5175b)) {
                    cbtVar.f5175b = "unkwn";
                } else if (!"<unknown ssid>".equals(cbtVar.f5175b)) {
                    cbtVar.f5175b = String.valueOf(i);
                }
                this.p.put(Integer.valueOf((cbtVar.c * 25) + i), cbtVar);
            }
        }
        this.f6872b.clear();
        Iterator<cbt> it = this.p.values().iterator();
        while (it.hasNext()) {
            this.f6872b.add(it.next());
        }
        this.p.clear();
    }

    public final void b(boolean z2) {
        if (z2) {
            x();
        } else {
            y();
        }
        boolean z3 = false;
        if (this.A) {
            this.A = false;
            A();
        }
        z();
        if (com.autonavi.aps.amapapi.utils.k.b() - g > 20000) {
            this.f6872b.clear();
        }
        e = com.autonavi.aps.amapapi.utils.k.b();
        if (this.f6872b.isEmpty()) {
            g = com.autonavi.aps.amapapi.utils.k.b();
            List<cbt> listS = s();
            if (listS != null) {
                this.f6872b.addAll(listS);
                z3 = true;
            }
        }
        d(z3);
    }

    public final boolean a(ConnectivityManager connectivityManager) {
        try {
            return com.autonavi.aps.amapapi.utils.k.a(connectivityManager.getActiveNetworkInfo()) == 1 && a(n());
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "WifiManagerWrapper", "wifiAccess");
            return false;
        }
    }

    public final void c(boolean z2) {
        g();
        this.f6872b.clear();
        this.t.a(z2);
    }

    public final void a(boolean z2) {
        Context context = this.i;
        if (!com.autonavi.aps.amapapi.utils.b.n() || !this.n || this.f6871a == null || context == null || !z2 || com.autonavi.aps.amapapi.utils.k.c() <= 17) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (((Integer) com.autonavi.aps.amapapi.utils.g.a("android.provider.Settings$Global", "getInt", new Object[]{contentResolver, "wifi_scan_always_enabled"}, (Class<?>[]) new Class[]{ContentResolver.class, String.class})).intValue() == 0) {
                com.autonavi.aps.amapapi.utils.g.a("android.provider.Settings$Global", "putInt", new Object[]{contentResolver, "wifi_scan_always_enabled", 1}, (Class<?>[]) new Class[]{ContentResolver.class, String.class, Integer.TYPE});
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "WifiManagerWrapper", "enableWifiAlwaysScan");
        }
    }

    public static boolean a(j jVar) {
        if (jVar == null) {
            return false;
        }
        return jVar.d();
    }

    public final void a(boolean z2, boolean z3, boolean z4, long j) {
        this.l = z2;
        this.m = z3;
        this.n = z4;
        if (j < 10000) {
            this.D = 10000L;
        } else {
            this.D = j;
        }
    }

    public final void a(com.autonavi.aps.amapapi.c cVar) {
        this.E = cVar;
    }

    private static boolean a(int i) {
        try {
            return WifiManager.calculateSignalLevel(i, 20) > 0;
        } catch (ArithmeticException e2) {
            com.autonavi.aps.amapapi.utils.c.a(e2, "Aps", "wifiSigFine");
            return true;
        }
    }
}
