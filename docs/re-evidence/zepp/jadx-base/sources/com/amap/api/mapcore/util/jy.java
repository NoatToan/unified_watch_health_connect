package com.amap.api.mapcore.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jy {
    public static long d;
    public static long e;
    public static long f;
    public static long g;
    public static long h;
    public static HashMap<String, Long> s = new HashMap<>(36);
    public static long t = 0;
    public static int u = 0;
    public static long w = 0;
    public WifiManager a;
    public Context i;
    public ArrayList<ScanResult> b = new ArrayList<>();
    public ArrayList<ld> c = new ArrayList<>();
    public boolean j = false;
    public StringBuilder k = null;
    public boolean l = true;
    public boolean m = true;
    public boolean n = true;
    private volatile WifiInfo y = null;
    public String o = null;
    public TreeMap<Integer, ScanResult> p = null;
    public boolean q = true;
    public boolean r = false;
    public ConnectivityManager v = null;
    private long z = 30000;
    public volatile boolean x = false;

    public jy(Context context, WifiManager wifiManager) {
        this.a = wifiManager;
        this.i = context;
    }

    private static boolean a(int i) {
        int iCalculateSignalLevel = 20;
        try {
            iCalculateSignalLevel = WifiManager.calculateSignalLevel(i, 20);
        } catch (ArithmeticException e2) {
            ke.a(e2, "Aps", "wifiSigFine");
        }
        return iCalculateSignalLevel > 0;
    }

    public static boolean a(WifiInfo wifiInfo) {
        return (wifiInfo == null || TextUtils.isEmpty(wifiInfo.getSSID()) || !ki.a(wifiInfo.getBSSID())) ? false : true;
    }

    private void c(boolean z) {
        String strValueOf;
        ArrayList<ScanResult> arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (ki.b() - g > 3600000) {
            a();
        }
        if (this.p == null) {
            this.p = new TreeMap<>(Collections.reverseOrder());
        }
        this.p.clear();
        if (this.r && z) {
            try {
                this.c.clear();
            } catch (Throwable unused) {
            }
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ScanResult scanResult = this.b.get(i);
            if (ki.a(scanResult != null ? scanResult.BSSID : "") && (size <= 20 || a(scanResult.level))) {
                if (this.r && z) {
                    try {
                        ld ldVar = new ld(false);
                        ldVar.b = scanResult.SSID;
                        ldVar.d = scanResult.frequency;
                        ldVar.e = scanResult.timestamp;
                        ldVar.a = ld.a(scanResult.BSSID);
                        ldVar.c = (short) scanResult.level;
                        if (Build.VERSION.SDK_INT >= 17) {
                            short sElapsedRealtime = (short) ((SystemClock.elapsedRealtime() - (scanResult.timestamp / 1000)) / 1000);
                            ldVar.g = sElapsedRealtime;
                            if (sElapsedRealtime < 0) {
                                ldVar.g = (short) 0;
                            }
                        }
                        ldVar.f = System.currentTimeMillis();
                        this.c.add(ldVar);
                    } catch (Throwable unused2) {
                    }
                }
                if (!TextUtils.isEmpty(scanResult.SSID)) {
                    strValueOf = "<unknown ssid>".equals(scanResult.SSID) ? "unkwn" : String.valueOf(i);
                    this.p.put(Integer.valueOf((scanResult.level * 25) + i), scanResult);
                }
                scanResult.SSID = strValueOf;
                this.p.put(Integer.valueOf((scanResult.level * 25) + i), scanResult);
            }
        }
        this.b.clear();
        Iterator<ScanResult> it2 = this.p.values().iterator();
        while (it2.hasNext()) {
            this.b.add(it2.next());
        }
        this.p.clear();
    }

    public static String d() {
        return String.valueOf(ki.b() - g);
    }

    private List<ScanResult> e() {
        long jB;
        WifiManager wifiManager = this.a;
        if (wifiManager != null) {
            try {
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (Build.VERSION.SDK_INT >= 17) {
                    HashMap<String, Long> map = new HashMap<>(36);
                    if (scanResults != null) {
                        for (ScanResult scanResult : scanResults) {
                            map.put(scanResult.BSSID, Long.valueOf(scanResult.timestamp));
                        }
                    }
                    if (s.isEmpty() || !s.equals(map)) {
                        s = map;
                        jB = ki.b();
                    }
                    this.o = null;
                    return scanResults;
                }
                jB = ki.b();
                t = jB;
                this.o = null;
                return scanResults;
            } catch (SecurityException e2) {
                this.o = e2.getMessage();
            } catch (Throwable th) {
                this.o = null;
                ke.a(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    private WifiInfo f() {
        try {
            WifiManager wifiManager = this.a;
            if (wifiManager != null) {
                return wifiManager.getConnectionInfo();
            }
            return null;
        } catch (Throwable th) {
            ke.a(th, "WifiManagerWrapper", "getConnectionInfo");
            return null;
        }
    }

    private boolean g() {
        long jB = ki.b() - d;
        if (jB < 4900) {
            return false;
        }
        if (this.v == null) {
            this.v = (ConnectivityManager) ki.a(this.i, "connectivity");
        }
        if (a(this.v) && jB < 9900) {
            return false;
        }
        if (u > 1) {
            long jB2 = this.z;
            if (jB2 == 30000) {
                jB2 = kd.b() != -1 ? kd.b() : 30000L;
            }
            if (Build.VERSION.SDK_INT >= 28 && jB < jB2) {
                return false;
            }
        }
        if (this.a == null) {
            return false;
        }
        d = ki.b();
        int i = u;
        if (i < 2) {
            u = i + 1;
        }
        return this.a.startScan();
    }

    private boolean h() {
        if (this.a == null) {
            return false;
        }
        return ki.c(this.i);
    }

    private void i() {
        if (j()) {
            try {
                if (g()) {
                    f = ki.b();
                }
            } catch (Throwable th) {
                ke.a(th, "WifiManager", "wifiScan");
            }
        }
    }

    private boolean j() {
        boolean zH = h();
        this.q = zH;
        if (zH && this.l) {
            if (f == 0) {
                return true;
            }
            if (ki.b() - f >= 4900 && ki.b() - g >= 1500) {
                ki.b();
                return true;
            }
        }
        return false;
    }

    public final void a() {
        this.y = null;
        this.b.clear();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0062 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:20:0x004a, B:30:0x005e, B:32:0x0062, B:37:0x0070, B:28:0x0058, B:25:0x0052), top: B:65:0x004a, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:20:0x004a, B:30:0x005e, B:32:0x0062, B:37:0x0070, B:28:0x0058, B:25:0x0052), top: B:65:0x004a, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    public final void a(boolean z) {
        int wifiState;
        if (!z) {
            i();
        } else if (j()) {
            long jB = ki.b();
            if (jB - e >= 10000) {
                this.b.clear();
                h = g;
            }
            i();
            if (jB - e >= 10000) {
                for (int i = 20; i > 0 && g == h; i--) {
                    try {
                        Thread.sleep(150L);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        boolean z2 = true;
        if (this.x) {
            this.x = false;
            try {
                WifiManager wifiManager = this.a;
                if (wifiManager != null) {
                    if (wifiManager != null) {
                        try {
                            wifiState = wifiManager.getWifiState();
                        } catch (Throwable th) {
                            ke.a(th, "WifiManager", "onReceive part");
                            wifiState = 4;
                        }
                        if (this.b == null) {
                            this.b = new ArrayList<>();
                        }
                        if (wifiState != 0 || wifiState == 1 || wifiState == 4) {
                            a();
                        }
                    } else {
                        wifiState = 4;
                        if (this.b == null) {
                            this.b = new ArrayList<>();
                        }
                        if (wifiState != 0) {
                            a();
                        } else {
                            a();
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (h != g) {
            List<ScanResult> listE = null;
            try {
                listE = e();
            } catch (Throwable th2) {
                ke.a(th2, "WifiManager", "updateScanResult");
            }
            h = g;
            if (listE != null) {
                this.b.clear();
                this.b.addAll(listE);
            } else {
                this.b.clear();
            }
        }
        if (ki.b() - g > 20000) {
            this.b.clear();
        }
        e = ki.b();
        if (this.b.isEmpty()) {
            g = ki.b();
            List<ScanResult> listE2 = e();
            if (listE2 != null) {
                this.b.addAll(listE2);
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        c(z2);
    }

    public final boolean a(ConnectivityManager connectivityManager) {
        WifiManager wifiManager = this.a;
        if (wifiManager == null) {
            return false;
        }
        try {
            return ki.a(connectivityManager.getActiveNetworkInfo()) == 1 && a(wifiManager.getConnectionInfo());
        } catch (Throwable th) {
            ke.a(th, "WifiManagerWrapper", "wifiAccess");
            return false;
        }
    }

    public final WifiInfo b() {
        this.y = f();
        return this.y;
    }

    public final void b(boolean z) {
        this.l = z;
        this.m = true;
        this.n = true;
        this.z = 30000L;
    }

    public final void c() {
        a();
        this.b.clear();
    }
}
