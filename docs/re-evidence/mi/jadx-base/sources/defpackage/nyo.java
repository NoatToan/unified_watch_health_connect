package defpackage;

import com.miui.circulate.device.api.Constant;
import org.apache.commons.lang3.JavaVersion;

/* JADX INFO: loaded from: classes3.dex */
public class nyo {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final boolean R;
    public static final boolean S;
    public static final boolean T;
    public static final boolean U;
    public static final boolean V;
    public static final boolean W;
    public static final boolean X;
    public static final boolean Y;
    public static final boolean Z;
    public static final boolean a0;
    public static final boolean b0;
    public static final boolean c0;
    public static final boolean d0;
    public static final boolean e0;
    public static final boolean f0;
    public static final boolean g0;
    public static final boolean h0;
    public static final boolean i0;
    public static final boolean j0;
    public static final boolean k0;
    public static final boolean l0;
    public static final boolean m0;
    public static final boolean n0;
    public static final boolean o0;
    public static final boolean p0;
    public static final boolean q0;
    public static final boolean r0;
    public static final boolean s0;
    public static final String t;
    public static final boolean t0;
    public static final JavaVersion u;
    public static final boolean u0;
    public static final String v;
    public static final boolean v0;
    public static final String w;
    public static final boolean w0;
    public static final String x;
    public static final boolean x0;
    public static final String y;
    public static final boolean y0;
    public static final String z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28572a = d("awt.toolkit");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28573b = d("file.encoding");
    public static final String c = d("file.separator");
    public static final String d = d("java.awt.fonts");
    public static final String e = d("java.awt.graphicsenv");
    public static final String f = d("java.awt.headless");
    public static final String g = d("java.awt.printerjob");
    public static final String h = d("java.class.path");
    public static final String i = d("java.class.version");
    public static final String j = d("java.compiler");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f28574k = d("java.endorsed.dirs");
    public static final String l = d("java.ext.dirs");
    public static final String m = d("java.home");
    public static final String n = d("java.io.tmpdir");
    public static final String o = d("java.library.path");
    public static final String p = d("java.runtime.name");
    public static final String q = d("java.runtime.version");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f28575r = d("java.specification.name");
    public static final String s = d("java.specification.vendor");

    static {
        String strD = d("java.specification.version");
        t = strD;
        u = JavaVersion.get(strD);
        v = d("java.util.prefs.PreferencesFactory");
        w = d("java.vendor");
        x = d("java.vendor.url");
        y = d("java.version");
        z = d("java.vm.info");
        A = d("java.vm.name");
        B = d("java.vm.specification.name");
        C = d("java.vm.specification.vendor");
        D = d("java.vm.specification.version");
        E = d("java.vm.vendor");
        F = d("java.vm.version");
        G = d("line.separator");
        H = d("os.arch");
        I = d("os.name");
        J = d("os.version");
        K = d("path.separator");
        L = d(d("user.country") == null ? "user.region" : "user.country");
        M = d("user.dir");
        N = d("user.home");
        O = d("user.language");
        P = d("user.name");
        Q = d("user.timezone");
        R = a("1.1");
        S = a("1.2");
        T = a("1.3");
        U = a("1.4");
        V = a("1.5");
        W = a("1.6");
        X = a("1.7");
        Y = a("1.8");
        boolean zC = c("AIX");
        Z = zC;
        boolean zC2 = c("HP-UX");
        a0 = zC2;
        b0 = c("OS/400");
        boolean zC3 = c("Irix");
        c0 = zC3;
        boolean z2 = c("Linux") || c("LINUX");
        d0 = z2;
        e0 = c("Mac");
        boolean zC4 = c("Mac OS X");
        f0 = zC4;
        boolean zC5 = c("FreeBSD");
        g0 = zC5;
        boolean zC6 = c("OpenBSD");
        h0 = zC6;
        boolean zC7 = c("NetBSD");
        i0 = zC7;
        j0 = c("OS/2");
        boolean zC8 = c("Solaris");
        k0 = zC8;
        boolean zC9 = c("SunOS");
        l0 = zC9;
        m0 = zC || zC2 || zC3 || z2 || zC4 || zC8 || zC9 || zC5 || zC6 || zC7;
        n0 = c(Constant.DeviceType.WINDOWS_PC);
        o0 = b(Constant.DeviceType.WINDOWS_PC, "5.0");
        p0 = b(Constant.DeviceType.WINDOWS_PC, "5.2");
        q0 = b("Windows Server 2008", "6.1");
        r0 = b("Windows 9", "4.0");
        s0 = b("Windows 9", "4.1");
        t0 = b(Constant.DeviceType.WINDOWS_PC, "4.9");
        u0 = c("Windows NT");
        v0 = b(Constant.DeviceType.WINDOWS_PC, "5.1");
        w0 = b(Constant.DeviceType.WINDOWS_PC, "6.0");
        x0 = b(Constant.DeviceType.WINDOWS_PC, "6.1");
        y0 = b(Constant.DeviceType.WINDOWS_PC, "6.2");
    }

    public static boolean a(String str) {
        return f(t, str);
    }

    public static boolean b(String str, String str2) {
        return g(I, J, str, str2);
    }

    public static boolean c(String str) {
        return h(I, str);
    }

    public static String d(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            System.err.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    public static boolean e(JavaVersion javaVersion) {
        return u.atLeast(javaVersion);
    }

    public static boolean f(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static boolean g(String str, String str2, String str3, String str4) {
        return str != null && str2 != null && str.startsWith(str3) && str2.startsWith(str4);
    }

    public static boolean h(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }
}
