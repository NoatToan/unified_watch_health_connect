package com.loc;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huami.watch.ota.UpdateUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes18.dex */
public final class dw {
    public static long d;
    public static long e;
    public static long f;
    public static long g;
    public static long h;
    public static HashMap<String, Long> s = new HashMap<>(36);
    public static long t = 0;
    public static int u = 0;
    public static long w = 0;
    private dn A;
    public WifiManager a;
    public Context i;
    public ArrayList<ScanResult> b = new ArrayList<>();
    public ArrayList<dc> c = new ArrayList<>();
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

    public dw(Context context, WifiManager wifiManager) {
        this.a = wifiManager;
        this.i = context;
    }

    private static boolean a(int i) {
        int iCalculateSignalLevel = 20;
        try {
            iCalculateSignalLevel = WifiManager.calculateSignalLevel(i, 20);
        } catch (ArithmeticException e2) {
            ei.a(e2, "Aps", "wifiSigFine");
        }
        return iCalculateSignalLevel > 0;
    }

    public static boolean a(WifiInfo wifiInfo) {
        return (wifiInfo == null || TextUtils.isEmpty(wifiInfo.getSSID()) || !eo.a(wifiInfo.getBSSID())) ? false : true;
    }

    public static long b() {
        return ((eo.b() - t) / 1000) + 1;
    }

    private void c(boolean z) {
        String strValueOf;
        ArrayList<ScanResult> arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (eo.b() - g > 3600000) {
            g();
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
            if (eo.a(scanResult != null ? scanResult.BSSID : "") && (size <= 20 || a(scanResult.level))) {
                if (this.r && z) {
                    try {
                        dc dcVar = new dc(false);
                        dcVar.b = scanResult.SSID;
                        dcVar.d = scanResult.frequency;
                        dcVar.e = scanResult.timestamp;
                        dcVar.a = dc.a(scanResult.BSSID);
                        dcVar.c = (short) scanResult.level;
                        if (Build.VERSION.SDK_INT >= 17) {
                            short sElapsedRealtime = (short) ((SystemClock.elapsedRealtime() - (scanResult.timestamp / 1000)) / 1000);
                            dcVar.g = sElapsedRealtime;
                            if (sElapsedRealtime < 0) {
                                dcVar.g = (short) 0;
                            }
                        }
                        dcVar.f = System.currentTimeMillis();
                        this.c.add(dcVar);
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

    public static String o() {
        return String.valueOf(eo.b() - g);
    }

    private List<ScanResult> p() {
        long jB;
        WifiManager wifiManager = this.a;
        if (wifiManager != null) {
            try {
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (Build.VERSION.SDK_INT >= 17) {
                    HashMap<String, Long> map = new HashMap<>(36);
                    for (ScanResult scanResult : scanResults) {
                        map.put(scanResult.BSSID, Long.valueOf(scanResult.timestamp));
                    }
                    if (s.isEmpty() || !s.equals(map)) {
                        s = map;
                        jB = eo.b();
                    }
                    this.o = null;
                    return scanResults;
                }
                jB = eo.b();
                t = jB;
                this.o = null;
                return scanResults;
            } catch (SecurityException e2) {
                this.o = e2.getMessage();
            } catch (Throwable th) {
                this.o = null;
                ei.a(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:4:0x0006, B:6:0x0013, B:8:0x0017, B:9:0x0023, B:13:0x0031, B:15:0x0036, B:22:0x004f, B:18:0x003f, B:20:0x0049, B:26:0x0059, B:28:0x005d, B:30:0x0068, B:31:0x006b, B:34:0x0075), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:4:0x0006, B:6:0x0013, B:8:0x0017, B:9:0x0023, B:13:0x0031, B:15:0x0036, B:22:0x004f, B:18:0x003f, B:20:0x0049, B:26:0x0059, B:28:0x005d, B:30:0x0068, B:31:0x006b, B:34:0x0075), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0068 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:4:0x0006, B:6:0x0013, B:8:0x0017, B:9:0x0023, B:13:0x0031, B:15:0x0036, B:22:0x004f, B:18:0x003f, B:20:0x0049, B:26:0x0059, B:28:0x005d, B:30:0x0068, B:31:0x006b, B:34:0x0075), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    private void q() {
        boolean zStartScan;
        int i;
        if (r()) {
            try {
                long jB = eo.b() - d;
                if (jB < 4900) {
                    zStartScan = false;
                } else {
                    if (this.v == null) {
                        this.v = (ConnectivityManager) eo.a(this.i, "connectivity");
                    }
                    if (a(this.v) && jB < 9900) {
                        zStartScan = false;
                    } else if (u > 1) {
                        long jU = this.z;
                        if (jU == 30000) {
                            jU = eh.u() != -1 ? eh.u() : 30000L;
                        }
                        if (Build.VERSION.SDK_INT >= 28 && jB < jU) {
                            zStartScan = false;
                        } else if (this.a != null) {
                            d = eo.b();
                            i = u;
                            if (i < 2) {
                                u = i + 1;
                            }
                            zStartScan = this.a.startScan();
                        } else {
                            zStartScan = false;
                        }
                    } else if (this.a != null) {
                        d = eo.b();
                        i = u;
                        if (i < 2) {
                            u = i + 1;
                        }
                        zStartScan = this.a.startScan();
                    } else {
                        zStartScan = false;
                    }
                }
                if (zStartScan) {
                    f = eo.b();
                }
            } catch (Throwable th) {
                ei.a(th, "WifiManager", "wifiScan");
            }
        }
    }

    private boolean r() {
        boolean zH = this.a == null ? false : eo.h(this.i);
        this.q = zH;
        if (!zH || !this.l) {
            return false;
        }
        if (f != 0) {
            if (eo.b() - f < 4900 || eo.b() - g < 1500) {
                return false;
            }
            eo.b();
        }
        return true;
    }

    public final ArrayList<dc> a() {
        if (!this.r) {
            return this.c;
        }
        b(true);
        return this.c;
    }

    public final void a(dn dnVar) {
        this.A = dnVar;
    }

    public final void a(boolean z) {
        Context context = this.i;
        if (!eh.t() || !this.n || this.a == null || context == null || !z || eo.c() <= 17) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (((Integer) el.a("android.provider.Settings$Global", "getInt", new Object[]{contentResolver, "wifi_scan_always_enabled"}, (Class<?>[]) new Class[]{ContentResolver.class, String.class})).intValue() == 0) {
                el.a("android.provider.Settings$Global", "putInt", new Object[]{contentResolver, "wifi_scan_always_enabled", 1}, (Class<?>[]) new Class[]{ContentResolver.class, String.class, Integer.TYPE});
            }
        } catch (Throwable th) {
            ei.a(th, "WifiManagerWrapper", "enableWifiAlwaysScan");
        }
    }

    public final void a(boolean z, boolean z2, boolean z3, long j) {
        this.l = z;
        this.m = z2;
        this.n = z3;
        if (j < 10000) {
            this.z = 10000L;
        } else {
            this.z = j;
        }
    }

    public final boolean a(ConnectivityManager connectivityManager) {
        WifiManager wifiManager = this.a;
        if (wifiManager == null) {
            return false;
        }
        try {
            return eo.a(connectivityManager.getActiveNetworkInfo()) == 1 && a(wifiManager.getConnectionInfo());
        } catch (Throwable th) {
            ei.a(th, "WifiManagerWrapper", "wifiAccess");
            return false;
        }
    }

    public final void b(boolean z) {
        if (!z) {
            q();
        } else if (r()) {
            long jB = eo.b();
            if (jB - e >= 10000) {
                this.b.clear();
                h = g;
            }
            q();
            if (jB - e >= 10000) {
                for (int i = 20; i > 0 && g == h; i--) {
                    try {
                        Thread.sleep(150L);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        boolean z2 = false;
        if (this.x) {
            this.x = false;
            g();
        }
        if (h != g) {
            List<ScanResult> listP = null;
            try {
                listP = p();
            } catch (Throwable th) {
                ei.a(th, "WifiManager", "updateScanResult");
            }
            h = g;
            if (listP != null) {
                this.b.clear();
                this.b.addAll(listP);
            } else {
                this.b.clear();
            }
        }
        if (eo.b() - g > 20000) {
            this.b.clear();
        }
        e = eo.b();
        if (this.b.isEmpty()) {
            g = eo.b();
            List<ScanResult> listP2 = p();
            if (listP2 != null) {
                this.b.addAll(listP2);
                z2 = true;
            }
        }
        c(z2);
    }

    public final WifiInfo c() {
        try {
            WifiManager wifiManager = this.a;
            if (wifiManager != null) {
                return wifiManager.getConnectionInfo();
            }
            return null;
        } catch (Throwable th) {
            ei.a(th, "WifiManagerWrapper", "getConnectionInfo");
            return null;
        }
    }

    public final String d() {
        return this.o;
    }

    public final ArrayList<ScanResult> e() {
        if (this.b == null) {
            return null;
        }
        ArrayList<ScanResult> arrayList = new ArrayList<>();
        if (!this.b.isEmpty()) {
            arrayList.addAll(this.b);
        }
        return arrayList;
    }

    public final void f() {
        try {
            this.r = true;
            List<ScanResult> listP = p();
            if (listP != null) {
                this.b.clear();
                this.b.addAll(listP);
            }
            c(true);
        } catch (Throwable unused) {
        }
    }

    public final void g() {
        this.y = null;
        this.b.clear();
    }

    public final void h() {
        w = System.currentTimeMillis();
        dn dnVar = this.A;
        if (dnVar != null) {
            dnVar.b();
        }
    }

    public final void i() {
        if (this.a != null && eo.b() - g > 4900) {
            g = eo.b();
        }
    }

    public final void j() {
        int wifiState;
        WifiManager wifiManager = this.a;
        if (wifiManager == null) {
            return;
        }
        if (wifiManager != null) {
            try {
                wifiState = wifiManager.getWifiState();
            } catch (Throwable th) {
                ei.a(th, "Aps", "onReceive part");
                wifiState = 4;
            }
        } else {
            wifiState = 4;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        if (wifiState == 0 || wifiState == 1 || wifiState == 4) {
            this.x = true;
        }
    }

    public final WifiInfo k() {
        this.y = c();
        return this.y;
    }

    public final boolean l() {
        return this.j;
    }

    public final String m() {
        boolean z;
        String str;
        StringBuilder sb = this.k;
        if (sb == null) {
            this.k = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        this.j = false;
        this.y = k();
        String bssid = a(this.y) ? this.y.getBSSID() : "";
        int size = this.b.size();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < size) {
            String str2 = this.b.get(i).BSSID;
            if (!this.m && !"<unknown ssid>".equals(this.b.get(i).SSID)) {
                z2 = true;
            }
            if (bssid.equals(str2)) {
                str = "access";
                z = true;
            } else {
                z = z3;
                str = "nb";
            }
            this.k.append(String.format(Locale.US, "#%s,%s", str2, str));
            i++;
            z3 = z;
        }
        if (this.b.size() == 0) {
            z2 = true;
        }
        if (!this.m && !z2) {
            this.j = true;
        }
        if (!z3 && !TextUtils.isEmpty(bssid)) {
            StringBuilder sb2 = this.k;
            sb2.append(UpdateUtils.CMD_FILTER);
            sb2.append(bssid);
            this.k.append(",access");
        }
        return this.k.toString();
    }

    public final void n() {
        g();
        this.b.clear();
    }
}
