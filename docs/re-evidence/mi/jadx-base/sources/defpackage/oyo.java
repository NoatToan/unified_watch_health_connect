package defpackage;

import com.miui.circulate.device.api.Constant;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes3.dex */
public class oyo {
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final float R;
    public static final int S;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29826a = g("awt.toolkit");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f29827b = g("file.encoding");
    public static final String c = g("file.separator");
    public static final String d = g("java.awt.fonts");
    public static final String e = g("java.awt.graphicsenv");
    public static final String f = g("java.awt.headless");
    public static final String g = g("java.awt.printerjob");
    public static final String h = g("java.class.path");
    public static final String i = g("java.class.version");
    public static final String j = g("java.compiler");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f29828k = g("java.endorsed.dirs");
    public static final String l = g("java.ext.dirs");
    public static final String m = g("java.home");
    public static final String n = g("java.io.tmpdir");
    public static final String o = g("java.library.path");
    public static final String p = g("java.runtime.name");
    public static final String q = g("java.runtime.version");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f29829r = g("java.specification.name");
    public static final String s = g("java.specification.vendor");
    public static final String t = g("java.specification.version");
    public static final String u = g("java.util.prefs.PreferencesFactory");
    public static final String v = g("java.vendor");
    public static final String w = g("java.vendor.url");
    public static final String x = g("java.version");
    public static final String y = g("java.vm.info");
    public static final String z = g("java.vm.name");
    public static final String A = g("java.vm.specification.name");
    public static final String B = g("java.vm.specification.vendor");
    public static final String C = g("java.vm.specification.version");
    public static final String D = g("java.vm.vendor");
    public static final String E = g("java.vm.version");
    public static final String F = g("line.separator");
    public static final String G = g("os.arch");
    public static final String H = g("os.name");
    public static final String I = g("os.version");
    public static final String J = g("path.separator");

    static {
        K = g(g("user.country") == null ? "user.region" : "user.country");
        L = g("user.dir");
        M = g("user.home");
        N = g("user.language");
        O = g("user.name");
        P = g("user.timezone");
        Q = d();
        R = a();
        S = b();
        T = c("1.1");
        U = c("1.2");
        V = c("1.3");
        W = c("1.4");
        X = c("1.5");
        Y = c("1.6");
        Z = c("1.7");
        boolean zF = f("AIX");
        a0 = zF;
        boolean zF2 = f("HP-UX");
        b0 = zF2;
        boolean zF3 = f("Irix");
        c0 = zF3;
        boolean z2 = f("Linux") || f("LINUX");
        d0 = z2;
        e0 = f("Mac");
        boolean zF4 = f("Mac OS X");
        f0 = zF4;
        g0 = f("OS/2");
        boolean zF5 = f("Solaris");
        h0 = zF5;
        boolean zF6 = f("SunOS");
        i0 = zF6;
        j0 = zF || zF2 || zF3 || z2 || zF4 || zF5 || zF6;
        k0 = f(Constant.DeviceType.WINDOWS_PC);
        l0 = e(Constant.DeviceType.WINDOWS_PC, "5.0");
        m0 = e("Windows 9", "4.0");
        n0 = e("Windows 9", "4.1");
        o0 = e(Constant.DeviceType.WINDOWS_PC, "4.9");
        p0 = f("Windows NT");
        q0 = e(Constant.DeviceType.WINDOWS_PC, "5.1");
        r0 = e(Constant.DeviceType.WINDOWS_PC, "6.0");
        s0 = e(Constant.DeviceType.WINDOWS_PC, "6.1");
    }

    public static float a() {
        return l(k(x, 3));
    }

    public static int b() {
        return m(k(x, 3));
    }

    public static boolean c(String str) {
        return h(Q, str);
    }

    public static String d() {
        if (x == null) {
            return null;
        }
        int i2 = 0;
        while (true) {
            String str = x;
            if (i2 >= str.length()) {
                return null;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                return str.substring(i2);
            }
            i2++;
        }
    }

    public static boolean e(String str, String str2) {
        return i(H, I, str, str2);
    }

    public static boolean f(String str) {
        return j(H, str);
    }

    public static String g(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Caught a SecurityException reading the system property '");
            stringBuffer.append(str);
            stringBuffer.append("'; the SystemUtils property value will default to null.");
            printStream.println(stringBuffer.toString());
            return null;
        }
    }

    public static boolean h(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static boolean i(String str, String str2, String str3, String str4) {
        return str != null && str2 != null && str.startsWith(str3) && str2.startsWith(str4);
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static int[] k(String str, int i2) {
        if (str == null) {
            return rj1.f;
        }
        String[] strArrD = llo.d(str, "._- ");
        int iMin = Math.min(i2, strArrD.length);
        int[] iArr = new int[iMin];
        int i3 = 0;
        for (int i4 = 0; i4 < strArrD.length && i3 < i2; i4++) {
            String str2 = strArrD[i4];
            if (str2.length() > 0) {
                try {
                    iArr[i3] = Integer.parseInt(str2);
                    i3++;
                } catch (Exception unused) {
                }
            }
        }
        if (iMin <= i3) {
            return iArr;
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        return iArr2;
    }

    public static float l(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                return iArr[0];
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(iArr[0]);
            stringBuffer.append('.');
            for (int i2 = 1; i2 < iArr.length; i2++) {
                stringBuffer.append(iArr[i2]);
            }
            try {
                return Float.parseFloat(stringBuffer.toString());
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    public static int m(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i2 = length >= 1 ? iArr[0] * 100 : 0;
        if (length >= 2) {
            i2 += iArr[1] * 10;
        }
        return length >= 3 ? i2 + iArr[2] : i2;
    }
}
