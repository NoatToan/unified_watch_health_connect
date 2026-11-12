package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes34.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15617a = "DnsUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15618b = 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15619c = 15000;
    public static int d = 10000;
    public static final int e = 4;
    public static final int f = 16;
    public static ExecutorService g = ExecutorsUtils.newCachedThreadPool("Dns_executor");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f15620a = "trigger_type";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f15621b = "request_domain";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f15622c = "error_code";
        public static final int d = 10020000;
        public static final int e = 10020001;
        public static final String f = "dns_subtype";
        public static final String g = "site_detect";
        public static final String h = "dns_change";
        public static final String i = "protocol_impl";
        public static final String j = "okhttp";
        public static final String k = "tcpconn_time";
        public static final String l = "ssl_time";
        public static final String m = "connect_time";
        public static final String n = "dns_request";
        public static final String o = "site_detect_threshold";
        public static final String p = "server_ip";
    }

    public static void c(m0 m0Var) {
        List<InetAddress> listA;
        if (b(m0Var) || (listA = a(m0Var.d())) == null || listA.size() <= 0) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (InetAddress inetAddress : listA) {
            if (inetAddress.getAddress().length == 4) {
                z = true;
            } else if (inetAddress.getAddress().length == 16) {
                z2 = true;
            }
        }
        a(m0Var, z, z2);
    }

    public static boolean b(m0 m0Var) {
        return m0Var == null || m0Var.j();
    }

    public static <T> void b(List<T> list) {
        if (list == null) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size());
        linkedHashSet.addAll(list);
        list.clear();
        list.addAll(linkedHashSet);
    }

    public static ExecutorService b() {
        return g;
    }

    public static List<InetAddress> b(String str) throws UnknownHostException {
        return r0.a().a(str, h0.f14838b);
    }

    public static boolean a(InetAddress inetAddress) {
        return inetAddress instanceof Inet4Address;
    }

    public static boolean a(String str) {
        try {
            return InetAddress.getByName(str) instanceof Inet4Address;
        } catch (SecurityException | UnknownHostException e2) {
            Logger.d(f15617a, "isIPv4 failed,exception message is:" + e2.getMessage());
            return false;
        }
    }

    public static void a(m0 m0Var, boolean z, boolean z2) {
        if (m0Var == null) {
            Logger.w(f15617a, "dnsResult is null.");
            return;
        }
        if (z && z2) {
            m0Var.c("ALL");
            return;
        }
        if (z) {
            m0Var.c("A");
        } else if (z2) {
            m0Var.c("AAAA");
        } else {
            Logger.w(f15617a, "invalid ip type");
        }
    }

    public static void a(int i) {
        if (i <= 0 || i > 15000) {
            return;
        }
        d = i;
    }

    public static List<InetAddress> a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(InetAddress.getByName(str));
            } catch (UnknownHostException unused) {
                Logger.w(f15617a, "convertAddress failed, ip:" + str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    public static List<InetAddress> a(String str, String str2) throws UnknownHostException {
        r0 r0VarA;
        h0 h0Var;
        byte b2 = 0;
        t.m().d(0);
        int iHashCode = str2.hashCode();
        if (iHashCode != -1387696287) {
            if (iHashCode != 1001410588) {
                if (iHashCode != 1965413854 || !str2.equals(w.k)) {
                    b2 = -1;
                }
            } else if (str2.equals(w.l)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str2.equals(w.m)) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            t.m().f(2);
            r0VarA = r0.a();
            h0Var = h0.f14838b;
        } else if (b2 == 1) {
            t.m().f(1);
            r0VarA = r0.a();
            h0Var = h0.f14839c;
        } else {
            if (b2 != 2) {
                return Collections.EMPTY_LIST;
            }
            t.m().f(3);
            r0VarA = r0.a();
            h0Var = h0.d;
        }
        return r0VarA.a(str, h0Var);
    }

    public static List<String> a(m0 m0Var) {
        List<String> listD = m0Var.d();
        b(listD);
        return listD;
    }

    public static m0 a(InetAddress[] inetAddressArr) {
        boolean z;
        m0 m0Var = new m0();
        boolean z2 = false;
        if (inetAddressArr == null || inetAddressArr.length <= 0) {
            z = false;
        } else {
            z = false;
            boolean z3 = false;
            for (InetAddress inetAddress : inetAddressArr) {
                if (inetAddress.getAddress().length == 4) {
                    z3 = true;
                } else if (inetAddress.getAddress().length == 16) {
                    z = true;
                }
                m0Var.a(inetAddress.getHostAddress());
            }
            z2 = z3;
        }
        a(m0Var, z2, z);
        return m0Var;
    }

    public static HianalyticsBaseData a(n5 n5Var, long j) {
        if (n5Var != null) {
            return new a(n5Var, j);
        }
        Logger.w(f15617a, "Site detect metrics is null");
        return null;
    }

    public static int a() {
        return d;
    }

    public static class a extends HianalyticsBaseData {
        public a(n5 n5Var, long j) {
            put("sdk_version", "8.0.1.320");
            put("dns_subtype", b.g);
            put("trigger_type", b.h);
            put("request_domain", n5Var.d());
            put("error_code", n5Var.h() ? 10020000L : 10020001L);
            put("protocol_impl", b.j);
            put("tcpconn_time", n5Var.f() - n5Var.a());
            put("ssl_time", n5Var.g());
            put("connect_time", n5Var.b());
            put(b.o, j);
            put("server_ip", n5Var.e());
        }
    }
}
