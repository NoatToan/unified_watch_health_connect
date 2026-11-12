package org.apache.commons.lang;

import java.io.File;
import java.io.PrintStream;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes23.dex */
public class SystemUtils {
    public static final boolean IS_JAVA_1_1;
    public static final boolean IS_JAVA_1_2;
    public static final boolean IS_JAVA_1_3;
    public static final boolean IS_JAVA_1_4;
    public static final boolean IS_JAVA_1_5;
    public static final boolean IS_JAVA_1_6;
    public static final boolean IS_JAVA_1_7;
    public static final boolean IS_OS_AIX;
    public static final boolean IS_OS_HP_UX;
    public static final boolean IS_OS_IRIX;
    public static final boolean IS_OS_LINUX;
    public static final boolean IS_OS_MAC;
    public static final boolean IS_OS_MAC_OSX;
    public static final boolean IS_OS_OS2;
    public static final boolean IS_OS_SOLARIS;
    public static final boolean IS_OS_SUN_OS;
    public static final boolean IS_OS_UNIX;
    public static final boolean IS_OS_WINDOWS;
    public static final boolean IS_OS_WINDOWS_2000;
    public static final boolean IS_OS_WINDOWS_7;
    public static final boolean IS_OS_WINDOWS_95;
    public static final boolean IS_OS_WINDOWS_98;
    public static final boolean IS_OS_WINDOWS_ME;
    public static final boolean IS_OS_WINDOWS_NT;
    public static final boolean IS_OS_WINDOWS_VISTA;
    public static final boolean IS_OS_WINDOWS_XP;
    public static final float JAVA_VERSION_FLOAT;
    public static final int JAVA_VERSION_INT;
    public static final String JAVA_VERSION_TRIMMED;
    public static final String USER_COUNTRY;
    public static final String USER_DIR;
    public static final String USER_HOME;
    public static final String USER_LANGUAGE;
    public static final String USER_NAME;
    public static final String USER_TIMEZONE;
    private static final int a = 3;
    private static final String b = "Windows";
    private static final String c = "user.home";
    private static final String d = "user.dir";
    public static final String AWT_TOOLKIT = g("awt.toolkit");
    public static final String FILE_ENCODING = g("file.encoding");
    public static final String FILE_SEPARATOR = g("file.separator");
    public static final String JAVA_AWT_FONTS = g("java.awt.fonts");
    public static final String JAVA_AWT_GRAPHICSENV = g("java.awt.graphicsenv");
    public static final String JAVA_AWT_HEADLESS = g("java.awt.headless");
    public static final String JAVA_AWT_PRINTERJOB = g("java.awt.printerjob");
    public static final String JAVA_CLASS_PATH = g("java.class.path");
    public static final String JAVA_CLASS_VERSION = g("java.class.version");
    public static final String JAVA_COMPILER = g("java.compiler");
    public static final String JAVA_ENDORSED_DIRS = g("java.endorsed.dirs");
    public static final String JAVA_EXT_DIRS = g("java.ext.dirs");
    private static final String f = "java.home";
    public static final String JAVA_HOME = g(f);
    private static final String e = "java.io.tmpdir";
    public static final String JAVA_IO_TMPDIR = g(e);
    public static final String JAVA_LIBRARY_PATH = g("java.library.path");
    public static final String JAVA_RUNTIME_NAME = g("java.runtime.name");
    public static final String JAVA_RUNTIME_VERSION = g("java.runtime.version");
    public static final String JAVA_SPECIFICATION_NAME = g("java.specification.name");
    public static final String JAVA_SPECIFICATION_VENDOR = g("java.specification.vendor");
    public static final String JAVA_SPECIFICATION_VERSION = g("java.specification.version");
    public static final String JAVA_UTIL_PREFS_PREFERENCES_FACTORY = g("java.util.prefs.PreferencesFactory");
    public static final String JAVA_VENDOR = g("java.vendor");
    public static final String JAVA_VENDOR_URL = g(LoggerFactory.t);
    public static final String JAVA_VERSION = g("java.version");
    public static final String JAVA_VM_INFO = g("java.vm.info");
    public static final String JAVA_VM_NAME = g("java.vm.name");
    public static final String JAVA_VM_SPECIFICATION_NAME = g("java.vm.specification.name");
    public static final String JAVA_VM_SPECIFICATION_VENDOR = g("java.vm.specification.vendor");
    public static final String JAVA_VM_SPECIFICATION_VERSION = g("java.vm.specification.version");
    public static final String JAVA_VM_VENDOR = g("java.vm.vendor");
    public static final String JAVA_VM_VERSION = g("java.vm.version");
    public static final String LINE_SEPARATOR = g("line.separator");
    public static final String OS_ARCH = g("os.arch");
    public static final String OS_NAME = g("os.name");
    public static final String OS_VERSION = g("os.version");
    public static final String PATH_SEPARATOR = g("path.separator");

    static {
        USER_COUNTRY = g(g("user.country") == null ? "user.region" : "user.country");
        USER_DIR = g(d);
        USER_HOME = g(c);
        USER_LANGUAGE = g("user.language");
        USER_NAME = g("user.name");
        USER_TIMEZONE = g("user.timezone");
        JAVA_VERSION_TRIMMED = d();
        JAVA_VERSION_FLOAT = a();
        JAVA_VERSION_INT = b();
        IS_JAVA_1_1 = c("1.1");
        IS_JAVA_1_2 = c("1.2");
        IS_JAVA_1_3 = c("1.3");
        IS_JAVA_1_4 = c("1.4");
        IS_JAVA_1_5 = c("1.5");
        IS_JAVA_1_6 = c("1.6");
        IS_JAVA_1_7 = c("1.7");
        boolean zF = f("AIX");
        IS_OS_AIX = zF;
        boolean zF2 = f("HP-UX");
        IS_OS_HP_UX = zF2;
        boolean zF3 = f("Irix");
        IS_OS_IRIX = zF3;
        boolean z = f("Linux") || f("LINUX");
        IS_OS_LINUX = z;
        IS_OS_MAC = f("Mac");
        boolean zF4 = f("Mac OS X");
        IS_OS_MAC_OSX = zF4;
        IS_OS_OS2 = f("OS/2");
        boolean zF5 = f("Solaris");
        IS_OS_SOLARIS = zF5;
        boolean zF6 = f("SunOS");
        IS_OS_SUN_OS = zF6;
        IS_OS_UNIX = zF || zF2 || zF3 || z || zF4 || zF5 || zF6;
        IS_OS_WINDOWS = f(b);
        IS_OS_WINDOWS_2000 = e(b, "5.0");
        IS_OS_WINDOWS_95 = e("Windows 9", "4.0");
        IS_OS_WINDOWS_98 = e("Windows 9", "4.1");
        IS_OS_WINDOWS_ME = e(b, "4.9");
        IS_OS_WINDOWS_NT = f("Windows NT");
        IS_OS_WINDOWS_XP = e(b, "5.1");
        IS_OS_WINDOWS_VISTA = e(b, "6.0");
        IS_OS_WINDOWS_7 = e(b, "6.1");
    }

    private static float a() {
        return o(n(JAVA_VERSION, 3));
    }

    private static int b() {
        return p(n(JAVA_VERSION, 3));
    }

    private static boolean c(String str) {
        return h(JAVA_VERSION_TRIMMED, str);
    }

    private static String d() {
        if (JAVA_VERSION == null) {
            return null;
        }
        int i = 0;
        while (true) {
            String str = JAVA_VERSION;
            if (i >= str.length()) {
                return null;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                return str.substring(i);
            }
            i++;
        }
    }

    private static boolean e(String str, String str2) {
        return i(OS_NAME, OS_VERSION, str, str2);
    }

    private static boolean f(String str) {
        return j(OS_NAME, str);
    }

    private static String g(String str) {
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

    public static File getJavaHome() {
        return new File(System.getProperty(f));
    }

    public static File getJavaIoTmpDir() {
        return new File(System.getProperty(e));
    }

    public static float getJavaVersion() {
        return JAVA_VERSION_FLOAT;
    }

    public static File getUserDir() {
        return new File(System.getProperty(d));
    }

    public static File getUserHome() {
        return new File(System.getProperty(c));
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

    public static boolean isJavaAwtHeadless() {
        String str = JAVA_AWT_HEADLESS;
        if (str != null) {
            return str.equals(Boolean.TRUE.toString());
        }
        return false;
    }

    public static boolean isJavaVersionAtLeast(float f2) {
        return JAVA_VERSION_FLOAT >= f2;
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static float k(String str) {
        return o(n(str, 3));
    }

    public static int l(String str) {
        return p(n(str, 3));
    }

    public static int[] m(String str) {
        return n(str, Integer.MAX_VALUE);
    }

    private static int[] n(String str, int i) {
        if (str == null) {
            return ArrayUtils.EMPTY_INT_ARRAY;
        }
        String[] strArrSplit = StringUtils.split(str, "._- ");
        int iMin = Math.min(i, strArrSplit.length);
        int[] iArr = new int[iMin];
        int i2 = 0;
        for (int i3 = 0; i3 < strArrSplit.length && i2 < i; i3++) {
            String str2 = strArrSplit[i3];
            if (str2.length() > 0) {
                try {
                    iArr[i2] = Integer.parseInt(str2);
                    i2++;
                } catch (Exception unused) {
                }
            }
        }
        if (iMin <= i2) {
            return iArr;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return iArr2;
    }

    private static float o(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                return iArr[0];
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(iArr[0]);
            stringBuffer.append('.');
            for (int i = 1; i < iArr.length; i++) {
                stringBuffer.append(iArr[i]);
            }
            try {
                return Float.parseFloat(stringBuffer.toString());
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    private static int p(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length >= 1 ? iArr[0] * 100 : 0;
        if (length >= 2) {
            i += iArr[1] * 10;
        }
        return length >= 3 ? i + iArr[2] : i;
    }

    public static boolean isJavaVersionAtLeast(int i) {
        return JAVA_VERSION_INT >= i;
    }
}
