package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import dalvik.system.PathClassLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class pu6 {
    public static Method A;
    public static Method B;
    public static Method C;
    public static Method D;
    public static Method E;
    public static Application F;
    public static Context G;
    public static int N;
    public static int O;
    public static int P;
    public static int Q;
    public static Class q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Class f30779r;
    public static PathClassLoader s;
    public static Constructor<Class> t;
    public static Constructor<Class> v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f30776a = Pattern.compile("Inc ([A-Z]+)([\\d]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f30777b = Pattern.compile("MT([\\d]{2})([\\d]+)");
    public static Boolean c = null;
    public static int d = -2;
    public static int e = -2;
    public static Boolean f = null;
    public static int g = -1;
    public static Boolean h = null;
    public static Boolean i = null;
    public static Boolean j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f30778k = -1;
    public static int l = -1;
    public static int m = -1;
    public static int n = -1;
    public static int o = Integer.MAX_VALUE;
    public static final String[] p = {"cactus", "cereus", "pine", "olive", "ginkgo", "olivelite", "olivewood", "willow", "wayne", "dandelion", "angelica", "angelicain", "whyred", "tulip", "onc", "onclite", "lavender", "lotus", "laurus", "merlinnfc", "merlin", "lancelot", "citrus", "pomelo", "lemon", "shiva", "lime", "cannon", "curtana", "durandal", "excalibur", "joyeuse", "gram", "sunny", "mojito", "rainbow", "cattail", "angelican", "camellia"};
    public static Object u = null;
    public static Object w = null;
    public static Method x = null;
    public static Method y = null;
    public static Method z = null;
    public static int H = 1;
    public static int I = 1;
    public static boolean J = false;
    public static int K = 1;
    public static int L = 2;
    public static int M = 3;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30781b;
        public int c;
        public int d;
        public int e;

        public String toString() {
            return "CpuInfo{id=" + this.f30780a + ", implementor=" + Integer.toHexString(this.f30781b) + ", architecture=" + this.c + ", part=" + Integer.toHexString(this.d) + ", maxFreq=" + this.e + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30782a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30783b;
        public int c;
        public int d;

        public String toString() {
            return "CpuStats{level=" + this.f30782a + ", maxFreq=" + this.f30783b + ", bigCoreCount=" + this.c + ", smallCoreCount=" + this.d + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static {
        t = null;
        v = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        try {
            if (Build.VERSION.SDK_INT > 33) {
                PathClassLoader pathClassLoader = new PathClassLoader("/system_ext/framework/MiuiBooster.jar", ClassLoader.getSystemClassLoader());
                s = pathClassLoader;
                q = pathClassLoader.loadClass("com.miui.performance.DeviceLevelUtils");
            } else {
                PathClassLoader pathClassLoader2 = new PathClassLoader("/system/framework/MiuiBooster.jar", ClassLoader.getSystemClassLoader());
                s = pathClassLoader2;
                q = pathClassLoader2.loadClass("com.miui.performance.DeviceLevelUtils");
            }
            t = q.getConstructor(Context.class);
            A = q.getDeclaredMethod("getMiuiLiteVersion", new Class[0]);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("static init(): Load Class Exception:");
            sb.append(e2);
        }
        PathClassLoader pathClassLoader3 = s;
        if (pathClassLoader3 != null) {
            try {
                Class<?> clsLoadClass = pathClassLoader3.loadClass("com.miui.performance.ComputilityLevelUtils");
                f30779r = clsLoadClass;
                v = clsLoadClass.getConstructor(new Class[0]);
                C = f30779r.getDeclaredMethod("initComputilityLevel", new Class[0]);
                D = f30779r.getDeclaredMethod("getComputilityVersion", new Class[0]);
                E = f30779r.getDeclaredMethod("getComputilityLevel", new Class[0]);
            } catch (Exception e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("static init: ComputilityLevel Load Class Exception:");
                sb2.append(e3);
            }
        }
        try {
            B = q.getDeclaredMethod("getMiuiMiddleVersion", new Class[0]);
        } catch (Exception e4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("static init(): Load MiuiMiddle Class Exception:");
            sb3.append(e4);
        }
    }

    public static int A() {
        if (o == Integer.MAX_VALUE) {
            try {
                o = (int) (((((Long) Class.forName("miui.util.HardwareInfo").getMethod("getTotalPhysicalMemory", new Class[0]).invoke(null, new Object[0])).longValue() / 1024) / 1024) / 1024);
            } catch (Throwable th) {
                th.getMessage();
                o = 0;
            }
        }
        return o;
    }

    public static boolean B() {
        boolean z2 = J;
        if (z2) {
            return z2;
        }
        try {
            Class clsX = x();
            if (clsX == null) {
                return J;
            }
            Class<?> cls = Integer.TYPE;
            x = clsX.getDeclaredMethod("getDeviceLevel", cls, cls);
            y = clsX.getDeclaredMethod("getDeviceLevel", cls);
            K = ((Integer) z(clsX, "DEVICE_LEVEL_FOR_RAM", cls)).intValue();
            L = ((Integer) z(clsX, "DEVICE_LEVEL_FOR_CPU", cls)).intValue();
            M = ((Integer) z(clsX, "DEVICE_LEVEL_FOR_GPU", cls)).intValue();
            N = ((Integer) z(clsX, "LOW_DEVICE", cls)).intValue();
            O = ((Integer) z(clsX, "MIDDLE_DEVICE", cls)).intValue();
            P = ((Integer) z(clsX, "HIGH_DEVICE", cls)).intValue();
            Q = ((Integer) z(clsX, "DEVICE_LEVEL_UNKNOWN", cls)).intValue();
            J = true;
            return J;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("initDeviceLevelInfo Fail: Exception:");
            sb.append(e2);
        }
    }

    public static boolean C() {
        if (f == null) {
            f = Boolean.valueOf("true".contentEquals(aie.a("ro.config.low_ram.support_miuilite_plus", "false")));
        }
        return f.booleanValue();
    }

    public static boolean D() {
        if (c == null) {
            try {
                Boolean bool = (Boolean) Class.forName("miui.os.Build").getDeclaredField("IS_MIUI_LITE_VERSION").get(null);
                bool.booleanValue();
                c = bool;
            } catch (Throwable unused) {
                c = null;
            }
        }
        return Boolean.TRUE.equals(c);
    }

    public static boolean E() {
        return D() && s() >= 2;
    }

    public static boolean F() {
        return u() >= 1;
    }

    public static a G(String[] strArr, List<a> list, a aVar) throws Throwable {
        String strTrim = strArr[1].trim();
        if (strArr[0].contains("processor") && TextUtils.isDigitsOnly(strTrim)) {
            a aVarA = a(strTrim);
            list.add(aVarA);
            return aVarA;
        }
        if (aVar == null) {
            return aVar;
        }
        f(strArr[0], strTrim, aVar);
        return aVar;
    }

    public static int H(int i2, int i3, int i4) {
        I = i2;
        if (i4 == L) {
            l = i3;
            return i3;
        }
        if (i4 == M) {
            m = i3;
            return i3;
        }
        if (i4 != K) {
            return -1;
        }
        n = i3;
        return i3;
    }

    public static int I(String str) {
        return str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
    }

    public static int J(int i2) {
        if (i2 == N) {
            return 0;
        }
        if (i2 == O) {
            return 1;
        }
        return i2 == P ? 2 : -1;
    }

    public static a a(String str) throws Throwable {
        a aVar = new a();
        int i2 = Integer.parseInt(str);
        aVar.f30780a = i2;
        String strE = e(String.format(Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i2)));
        if (strE != null) {
            aVar.e = Integer.parseInt(strE);
        }
        return aVar;
    }

    public static void b(b bVar) {
        if (bVar.f30782a != -1) {
            return;
        }
        if (bVar.c < 4) {
            if (bVar.f30783b > 2300000) {
                bVar.f30782a = 1;
                return;
            } else {
                bVar.f30782a = 0;
                return;
            }
        }
        int i2 = bVar.f30783b;
        if (i2 > 2700000) {
            bVar.f30782a = 2;
        } else if (i2 > 2300000) {
            bVar.f30782a = 1;
        } else {
            bVar.f30782a = 0;
        }
    }

    public static void c(b bVar, List<a> list) {
        for (a aVar : list) {
            if (aVar.c < 8) {
                bVar.f30782a = 0;
            }
            int i2 = aVar.e;
            if (i2 > bVar.f30783b) {
                bVar.f30783b = i2;
            }
            if (i2 >= 2000000) {
                bVar.c++;
            } else {
                bVar.d++;
            }
        }
        b(bVar);
    }

    public static Context d() {
        if (G == null) {
            try {
                Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                F = application;
                if (application != null) {
                    G = application.getApplicationContext();
                }
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("android.app.ActivityThread Exception:");
                sb.append(e2);
            }
        }
        if (G == null) {
            try {
                Application application2 = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, null);
                F = application2;
                if (application2 != null) {
                    G = application2.getApplicationContext();
                }
            } catch (Exception e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("android.app.AppGlobals Exception:");
                sb2.append(e3);
            }
        }
        return G;
    }

    public static String e(String str) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        BufferedReader bufferedReader;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    String line = bufferedReader.readLine();
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused2) {
                    }
                    return line;
                } catch (IOException unused3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (bufferedReader == null) {
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (IOException unused7) {
                        throw th;
                    }
                }
            } catch (IOException unused8) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (IOException unused9) {
            bufferedReader = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            bufferedReader = null;
        }
    }

    public static void f(String str, String str2, a aVar) {
        if (str.contains("CPU implementer")) {
            aVar.f30781b = I(str2);
        } else if (str.contains("CPU architecture")) {
            aVar.c = I(str2);
        } else if (str.contains("CPU part")) {
            aVar.d = I(str2);
        }
    }

    public static List<a> g() {
        ArrayList arrayList = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            a aVarG = null;
            while (scanner.hasNextLine()) {
                try {
                    String[] strArrSplit = scanner.nextLine().split(": ");
                    if (strArrSplit.length > 1) {
                        aVarG = G(strArrSplit, arrayList, aVarG);
                    }
                } catch (Throwable th) {
                    try {
                        scanner.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            scanner.close();
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static int h() {
        int iY;
        String strQ = q();
        if (strQ.length() > 0) {
            iY = strQ.contains("Qualcomm") ? y(strQ) : v(strQ);
        } else {
            iY = -1;
        }
        return iY == -1 ? i().f30782a : iY;
    }

    public static b i() {
        List<a> listG = g();
        b bVar = new b();
        if (listG.size() < 8) {
            bVar.f30782a = 0;
        }
        c(bVar, listG);
        return bVar;
    }

    public static int j() {
        return k(H);
    }

    public static int k(int i2) {
        int i3;
        if (I == i2 && (i3 = f30778k) != -1) {
            return i3;
        }
        I = i2;
        int iO = o(i2);
        f30778k = iO;
        return iO != -1 ? iO : m();
    }

    public static int l(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i3 == L) {
            if (I == i2 && (i6 = l) != -1) {
                return i6;
            }
        } else if (i3 == M) {
            if (I == i2 && (i5 = m) != -1) {
                return i5;
            }
        } else if (i3 == K && I == i2 && (i4 = n) != -1) {
            return i4;
        }
        int iP = p(i2, i3);
        return iP != -1 ? H(i2, iP, i3) : H(i2, n(i3), i3);
    }

    public static int m() {
        int i2 = f30778k;
        if (i2 != -1) {
            return i2;
        }
        if (D()) {
            f30778k = 0;
        } else {
            f30778k = r(n(L), n(K), l(H, M));
        }
        return f30778k;
    }

    public static int n(int i2) {
        if (i2 != K) {
            if (i2 == L) {
                return h();
            }
            return -1;
        }
        int iA = A();
        if (iA > 6) {
            return 2;
        }
        if (iA > 4) {
            return 1;
        }
        return iA > 0 ? 0 : -1;
    }

    public static int o(int i2) {
        int iIntValue = -1;
        if (!B()) {
            return -1;
        }
        try {
            Object objW = w();
            if (objW == null) {
                throw new Exception("perf is null!");
            }
            iIntValue = ((Integer) y.invoke(objW, Integer.valueOf(i2))).intValue();
            return J(iIntValue);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("getDeviceLevel failed , e:");
            sb.append(e2.toString());
        }
    }

    public static int p(int i2, int i3) {
        int iIntValue = -1;
        if (!B()) {
            return -1;
        }
        try {
            Object objW = w();
            if (objW == null) {
                throw new Exception("perf is null!");
            }
            iIntValue = ((Integer) x.invoke(objW, Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
            return J(iIntValue);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("getDeviceLevel failed , e:");
            sb.append(e2.toString());
        }
    }

    public static String q() {
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            while (scanner.hasNextLine()) {
                try {
                    String strNextLine = scanner.nextLine();
                    if (!scanner.hasNextLine()) {
                        String[] strArrSplit = strNextLine.split(": ");
                        if (strArrSplit.length > 1) {
                            String str = strArrSplit[1];
                            scanner.close();
                            return str;
                        }
                        return "";
                    }
                } catch (Throwable th) {
                    try {
                        scanner.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            scanner.close();
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static int r(int... iArr) {
        if (iArr.length == 0) {
            return -1;
        }
        int i2 = iArr[0];
        for (int i3 : iArr) {
            if (i3 > -1 && i3 < i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    public static int s() {
        int iIntValue;
        if (!D()) {
            d = 0;
            return 0;
        }
        int i2 = d;
        if (i2 != -2) {
            return i2;
        }
        try {
            Object objW = w();
            if (objW == null) {
                throw new Exception("perf is null!");
            }
            iIntValue = ((Integer) t().invoke(objW, new Object[0])).intValue();
            if (iIntValue >= 2) {
                d = iIntValue;
            } else {
                d = 1;
            }
            return d;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("getMiuiLiteVersion failed , e:");
            sb.append(e2.toString());
            iIntValue = -1;
        }
    }

    public static Method t() throws Exception {
        if (A == null) {
            A = x().getDeclaredMethod("getMiuiLiteVersion", new Class[0]);
        }
        return A;
    }

    public static int u() {
        if (e == -2) {
            try {
                Object objInvoke = B.invoke(w(), new Object[0]);
                if (objInvoke != null) {
                    e = ((Integer) objInvoke).intValue();
                } else {
                    e = -1;
                }
            } catch (Exception e2) {
                e = -1;
                StringBuilder sb = new StringBuilder();
                sb.append("getMiuiMiddleVersion failed , e:");
                sb.append(e2.toString());
            }
        }
        return e;
    }

    public static int v(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f30777b.matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null || (strGroup2 = matcher.group(2)) == null) {
            return -1;
        }
        return (Integer.parseInt(strGroup) != 68 || Integer.parseInt(strGroup2) < 73) ? 0 : 1;
    }

    public static Object w() {
        Constructor<Class> constructor;
        if (u == null) {
            try {
                Context contextD = d();
                if (contextD == null || (constructor = t) == null) {
                    throw new Exception("getAppContext fail");
                }
                u = constructor.newInstance(contextD);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("getPerf DeviceUtils(): newInstance Exception:");
                sb.append(e2);
                e2.printStackTrace();
            }
        }
        return u;
    }

    public static Class x() {
        return q;
    }

    public static int y(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f30776a.matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null || (strGroup2 = matcher.group(2)) == null) {
            return -1;
        }
        String lowerCase = strGroup.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.equals("sm")) {
            if (lowerCase.equals("sdm")) {
                return Integer.parseInt(strGroup2.substring(0, 1)) >= 7 ? 1 : 0;
            }
            return lowerCase.equals("msm") ? 0 : -1;
        }
        int i2 = Integer.parseInt(strGroup2.substring(0, 1));
        if (i2 >= 8) {
            return 2;
        }
        return i2 >= 7 ? 1 : 0;
    }

    public static <T> T z(Class<?> cls, String str, Class<T> cls2) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return (T) declaredField.get(null);
    }
}
