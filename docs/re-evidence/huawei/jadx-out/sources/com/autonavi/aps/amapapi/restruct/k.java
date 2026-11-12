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
import com.amap.api.col.p0003sl.np;
import com.huawei.profile.profile.ProfileExtendConstants;
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
    WifiManager f3965a;
    Context i;
    i t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<np> f3966b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<np> f3967c = new ArrayList<>();
    boolean j = false;
    StringBuilder k = null;
    boolean l = true;
    boolean m = true;
    boolean n = true;
    private volatile j B = null;
    String o = null;
    TreeMap<Integer, np> p = null;
    public boolean q = true;
    public boolean r = true;
    public boolean s = false;
    private String C = "";
    long u = 0;
    ConnectivityManager y = null;
    private long D = 30000;
    volatile boolean A = false;

    public k(Context context, WifiManager wifiManager, Handler handler) {
        this.f3965a = wifiManager;
        this.i = context;
        i iVar = new i(context, "wifiAgee", handler);
        this.t = iVar;
        iVar.a();
    }

    public final ArrayList<np> a() {
        if (!this.s) {
            return this.f3967c;
        }
        b(true);
        return this.f3967c;
    }

    private List<np> s() {
        List<ScanResult> scanResults;
        if (this.f3965a != null) {
            try {
                if (com.autonavi.aps.amapapi.utils.k.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                    scanResults = this.f3965a.getScanResults();
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
                        np npVar = new np(!TextUtils.isEmpty(this.C) && this.C.equals(scanResult2.BSSID));
                        npVar.f3232b = scanResult2.SSID;
                        npVar.d = scanResult2.frequency;
                        npVar.e = scanResult2.timestamp;
                        npVar.f3231a = np.a(scanResult2.BSSID);
                        npVar.f3233c = (short) scanResult2.level;
                        npVar.g = (short) ((SystemClock.elapsedRealtime() - (scanResult2.timestamp / 1000)) / 1000);
                        if (npVar.g < 0) {
                            npVar.g = (short) 0;
                        }
                        npVar.f = com.autonavi.aps.amapapi.utils.k.b();
                        arrayList.add(npVar);
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

    public static long b() {
        return ((com.autonavi.aps.amapapi.utils.k.b() - w) / 1000) + 1;
    }

    public final WifiInfo c() {
        try {
            if (this.f3965a == null) {
                return null;
            }
            if (!com.autonavi.aps.amapapi.utils.k.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                com.autonavi.aps.amapapi.utils.c.a(new Exception("gci_n_aws"), "OPENSDK_WMW", "gci_n_aws");
                return null;
            }
            return this.f3965a.getConnectionInfo();
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "WifiManagerWrapper", "getConnectionInfo");
            return null;
        }
    }

    private int t() {
        WifiManager wifiManager = this.f3965a;
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
        if (this.f3965a != null) {
            d = com.autonavi.aps.amapapi.utils.k.b();
            int i = x;
            if (i < 2) {
                x = i + 1;
            }
            if (com.autonavi.aps.amapapi.utils.k.c(this.i, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF")) {
                return this.f3965a.startScan();
            }
            com.autonavi.aps.amapapi.utils.c.a(new Exception("n_cws"), "OPENSDK_WMW", "wfs_n_cws");
        }
        return false;
    }

    public final boolean a(ConnectivityManager connectivityManager) {
        try {
            return com.autonavi.aps.amapapi.utils.k.a(connectivityManager.getActiveNetworkInfo()) == 1 && a(n());
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "WifiManagerWrapper", "wifiAccess");
            return false;
        }
    }

    private boolean v() {
        if (this.y == null) {
            this.y = (ConnectivityManager) com.autonavi.aps.amapapi.utils.k.a(this.i, "connectivity");
        }
        return a(this.y);
    }

    private boolean w() {
        if (this.f3965a == null) {
            return false;
        }
        return com.autonavi.aps.amapapi.utils.k.g(this.i);
    }

    public final void a(boolean z2) {
        Context context = this.i;
        if (!com.autonavi.aps.amapapi.utils.b.n() || !this.n || this.f3965a == null || context == null || !z2 || com.autonavi.aps.amapapi.utils.k.c() <= 17) {
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

    public final String d() {
        return this.o;
    }

    private void d(boolean z2) {
        ArrayList<np> arrayList = this.f3966b;
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
                this.f3967c.clear();
            } catch (Throwable unused) {
            }
        }
        int size = this.f3966b.size();
        this.u = 0L;
        for (int i = 0; i < size; i++) {
            np npVar = this.f3966b.get(i);
            if (npVar.h) {
                this.u = npVar.f;
            }
            if (com.autonavi.aps.amapapi.utils.k.a(npVar != null ? np.a(npVar.f3231a) : "") && (size <= 20 || a(npVar.f3233c))) {
                if (this.s && z2) {
                    this.f3967c.add(npVar);
                }
                if (!TextUtils.isEmpty(npVar.f3232b)) {
                    if (!"<unknown ssid>".equals(npVar.f3232b)) {
                        npVar.f3232b = String.valueOf(i);
                    }
                } else {
                    npVar.f3232b = "unkwn";
                }
                this.p.put(Integer.valueOf((npVar.f3233c * 25) + i), npVar);
            }
        }
        this.f3966b.clear();
        Iterator<np> it = this.p.values().iterator();
        while (it.hasNext()) {
            this.f3966b.add(it.next());
        }
        this.p.clear();
    }

    public final ArrayList<np> e() {
        if (this.f3966b == null) {
            return null;
        }
        ArrayList<np> arrayList = new ArrayList<>();
        if (!this.f3966b.isEmpty()) {
            arrayList.addAll(this.f3966b);
        }
        return arrayList;
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
            this.f3966b.clear();
        }
        e = com.autonavi.aps.amapapi.utils.k.b();
        if (this.f3966b.isEmpty()) {
            g = com.autonavi.aps.amapapi.utils.k.b();
            List<np> listS = s();
            if (listS != null) {
                this.f3966b.addAll(listS);
                z3 = true;
            }
        }
        d(z3);
    }

    public final void f() {
        try {
            this.s = true;
            List<np> listS = s();
            if (listS != null) {
                this.f3966b.clear();
                this.f3966b.addAll(listS);
            }
            d(true);
        } catch (Throwable unused) {
        }
    }

    private void x() {
        if (C()) {
            long jB = com.autonavi.aps.amapapi.utils.k.b();
            if (jB - e >= 10000) {
                this.f3966b.clear();
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

    public final void g() {
        this.B = null;
        this.f3966b.clear();
    }

    public final void h() {
        this.B = null;
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
        List<np> listS;
        if (h != g) {
            try {
                listS = s();
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "WifiManager", "updateScanResult");
                listS = null;
            }
            h = g;
            if (listS != null) {
                this.f3966b.clear();
                this.f3966b.addAll(listS);
            } else {
                this.f3966b.clear();
            }
        }
    }

    public final void a(com.autonavi.aps.amapapi.c cVar) {
        this.E = cVar;
    }

    public final void i() {
        z = System.currentTimeMillis();
        com.autonavi.aps.amapapi.c cVar = this.E;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void j() {
        if (this.f3965a != null && com.autonavi.aps.amapapi.utils.k.b() - g > 4900) {
            g = com.autonavi.aps.amapapi.utils.k.b();
        }
    }

    private void A() {
        int iT;
        try {
            if (this.f3965a == null) {
                return;
            }
            try {
                iT = t();
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "OPENSDK_WMW", "cwsc");
                iT = 4;
            }
            if (this.f3966b == null) {
                this.f3966b = new ArrayList<>();
            }
            if (iT == 0 || iT == 1 || iT == 4) {
                g();
            }
        } catch (Throwable unused) {
        }
    }

    public final void k() {
        if (this.f3965a == null) {
            return;
        }
        this.A = true;
    }

    private static boolean a(int i) {
        try {
            return WifiManager.calculateSignalLevel(i, 20) > 0;
        } catch (ArithmeticException e2) {
            com.autonavi.aps.amapapi.utils.c.a(e2, "Aps", "wifiSigFine");
            return true;
        }
    }

    public final boolean l() {
        return this.q;
    }

    public final boolean m() {
        return this.r;
    }

    private void B() {
        try {
            if (com.autonavi.aps.amapapi.utils.k.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                this.r = this.f3965a.isWifiEnabled();
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
        if (f == 0) {
            return true;
        }
        if (com.autonavi.aps.amapapi.utils.k.b() - f < 4900 || com.autonavi.aps.amapapi.utils.k.b() - g < ProfileExtendConstants.TIME_OUT) {
            return false;
        }
        com.autonavi.aps.amapapi.utils.k.b();
        return true;
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
        StringBuilder sb = this.k;
        int i = 0;
        if (sb == null) {
            this.k = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        this.j = false;
        int size = this.f3966b.size();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean z4 = true;
            if (i >= size) {
                break;
            }
            String strA = np.a(this.f3966b.get(i).f3231a);
            if (!this.m && !"<unknown ssid>".equals(this.f3966b.get(i).f3232b)) {
                z2 = true;
            }
            if (!TextUtils.isEmpty(this.C) && this.C.equals(strA)) {
                str = "access";
            } else {
                z4 = z3;
                str = "nb";
            }
            this.k.append(String.format(Locale.US, "#%s,%s", strA, str));
            i++;
            z3 = z4;
        }
        if (this.f3966b.size() == 0) {
            z2 = true;
        }
        if (!this.m && !z2) {
            this.j = true;
        }
        if (!z3 && !TextUtils.isEmpty(this.C)) {
            StringBuilder sb2 = this.k;
            sb2.append("#");
            sb2.append(this.C);
            this.k.append(",access");
        }
        return this.k.toString();
    }

    public final void c(boolean z2) {
        g();
        this.f3966b.clear();
        this.t.a(z2);
    }

    public static String q() {
        return String.valueOf(com.autonavi.aps.amapapi.utils.k.b() - g);
    }

    public final long r() {
        return this.u;
    }
}
