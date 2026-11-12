package org.apache.commons.lang3;

import java.io.File;
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
    public static final boolean IS_JAVA_1_8;

    @Deprecated
    public static final boolean IS_JAVA_1_9;
    public static final boolean IS_JAVA_9;
    public static final boolean IS_OS_400;
    public static final boolean IS_OS_AIX;
    public static final boolean IS_OS_FREE_BSD;
    public static final boolean IS_OS_HP_UX;
    public static final boolean IS_OS_IRIX;
    public static final boolean IS_OS_LINUX;
    public static final boolean IS_OS_MAC;
    public static final boolean IS_OS_MAC_OSX;
    public static final boolean IS_OS_MAC_OSX_CHEETAH;
    public static final boolean IS_OS_MAC_OSX_EL_CAPITAN;
    public static final boolean IS_OS_MAC_OSX_JAGUAR;
    public static final boolean IS_OS_MAC_OSX_LEOPARD;
    public static final boolean IS_OS_MAC_OSX_LION;
    public static final boolean IS_OS_MAC_OSX_MAVERICKS;
    public static final boolean IS_OS_MAC_OSX_MOUNTAIN_LION;
    public static final boolean IS_OS_MAC_OSX_PANTHER;
    public static final boolean IS_OS_MAC_OSX_PUMA;
    public static final boolean IS_OS_MAC_OSX_SNOW_LEOPARD;
    public static final boolean IS_OS_MAC_OSX_TIGER;
    public static final boolean IS_OS_MAC_OSX_YOSEMITE;
    public static final boolean IS_OS_NET_BSD;
    public static final boolean IS_OS_OPEN_BSD;
    public static final boolean IS_OS_OS2;
    public static final boolean IS_OS_SOLARIS;
    public static final boolean IS_OS_SUN_OS;
    public static final boolean IS_OS_UNIX;
    public static final boolean IS_OS_WINDOWS;
    public static final boolean IS_OS_WINDOWS_10;
    public static final boolean IS_OS_WINDOWS_2000;
    public static final boolean IS_OS_WINDOWS_2003;
    public static final boolean IS_OS_WINDOWS_2008;
    public static final boolean IS_OS_WINDOWS_2012;
    public static final boolean IS_OS_WINDOWS_7;
    public static final boolean IS_OS_WINDOWS_8;
    public static final boolean IS_OS_WINDOWS_95;
    public static final boolean IS_OS_WINDOWS_98;
    public static final boolean IS_OS_WINDOWS_ME;
    public static final boolean IS_OS_WINDOWS_NT;
    public static final boolean IS_OS_WINDOWS_VISTA;
    public static final boolean IS_OS_WINDOWS_XP;
    public static final boolean IS_OS_ZOS;
    public static final String JAVA_SPECIFICATION_VERSION;
    public static final String JAVA_UTIL_PREFS_PREFERENCES_FACTORY;
    public static final String JAVA_VENDOR;
    public static final String JAVA_VENDOR_URL;
    public static final String JAVA_VERSION;
    public static final String JAVA_VM_INFO;
    public static final String JAVA_VM_NAME;
    public static final String JAVA_VM_SPECIFICATION_NAME;
    public static final String JAVA_VM_SPECIFICATION_VENDOR;
    public static final String JAVA_VM_SPECIFICATION_VERSION;
    public static final String JAVA_VM_VENDOR;
    public static final String JAVA_VM_VERSION;

    @Deprecated
    public static final String LINE_SEPARATOR;
    public static final String OS_ARCH;
    public static final String OS_NAME;
    public static final String OS_VERSION;

    @Deprecated
    public static final String PATH_SEPARATOR;
    public static final String USER_COUNTRY;
    public static final String USER_DIR;
    public static final String USER_HOME;
    public static final String USER_LANGUAGE;
    public static final String USER_NAME;
    public static final String USER_TIMEZONE;
    private static final String a = "Windows";
    private static final String b = "user.home";
    private static final String c = "user.dir";
    private static final JavaVersion f;
    public static final String AWT_TOOLKIT = d("awt.toolkit");
    public static final String FILE_ENCODING = d("file.encoding");

    @Deprecated
    public static final String FILE_SEPARATOR = d("file.separator");
    public static final String JAVA_AWT_FONTS = d("java.awt.fonts");
    public static final String JAVA_AWT_GRAPHICSENV = d("java.awt.graphicsenv");
    public static final String JAVA_AWT_HEADLESS = d("java.awt.headless");
    public static final String JAVA_AWT_PRINTERJOB = d("java.awt.printerjob");
    public static final String JAVA_CLASS_PATH = d("java.class.path");
    public static final String JAVA_CLASS_VERSION = d("java.class.version");
    public static final String JAVA_COMPILER = d("java.compiler");
    public static final String JAVA_ENDORSED_DIRS = d("java.endorsed.dirs");
    public static final String JAVA_EXT_DIRS = d("java.ext.dirs");
    private static final String e = "java.home";
    public static final String JAVA_HOME = d(e);
    private static final String d = "java.io.tmpdir";
    public static final String JAVA_IO_TMPDIR = d(d);
    public static final String JAVA_LIBRARY_PATH = d("java.library.path");
    public static final String JAVA_RUNTIME_NAME = d("java.runtime.name");
    public static final String JAVA_RUNTIME_VERSION = d("java.runtime.version");
    public static final String JAVA_SPECIFICATION_NAME = d("java.specification.name");
    public static final String JAVA_SPECIFICATION_VENDOR = d("java.specification.vendor");

    static {
        String strD = d("java.specification.version");
        JAVA_SPECIFICATION_VERSION = strD;
        f = JavaVersion.a(strD);
        JAVA_UTIL_PREFS_PREFERENCES_FACTORY = d("java.util.prefs.PreferencesFactory");
        JAVA_VENDOR = d("java.vendor");
        JAVA_VENDOR_URL = d(LoggerFactory.t);
        JAVA_VERSION = d("java.version");
        JAVA_VM_INFO = d("java.vm.info");
        JAVA_VM_NAME = d("java.vm.name");
        JAVA_VM_SPECIFICATION_NAME = d("java.vm.specification.name");
        JAVA_VM_SPECIFICATION_VENDOR = d("java.vm.specification.vendor");
        JAVA_VM_SPECIFICATION_VERSION = d("java.vm.specification.version");
        JAVA_VM_VENDOR = d("java.vm.vendor");
        JAVA_VM_VERSION = d("java.vm.version");
        LINE_SEPARATOR = d("line.separator");
        OS_ARCH = d("os.arch");
        OS_NAME = d("os.name");
        OS_VERSION = d("os.version");
        PATH_SEPARATOR = d("path.separator");
        USER_COUNTRY = d(d("user.country") == null ? "user.region" : "user.country");
        USER_DIR = d(c);
        USER_HOME = d(b);
        USER_LANGUAGE = d("user.language");
        USER_NAME = d("user.name");
        USER_TIMEZONE = d("user.timezone");
        IS_JAVA_1_1 = a("1.1");
        IS_JAVA_1_2 = a("1.2");
        IS_JAVA_1_3 = a("1.3");
        IS_JAVA_1_4 = a("1.4");
        IS_JAVA_1_5 = a("1.5");
        IS_JAVA_1_6 = a("1.6");
        IS_JAVA_1_7 = a("1.7");
        IS_JAVA_1_8 = a("1.8");
        IS_JAVA_1_9 = a("9");
        IS_JAVA_9 = a("9");
        boolean zC = c("AIX");
        IS_OS_AIX = zC;
        boolean zC2 = c("HP-UX");
        IS_OS_HP_UX = zC2;
        IS_OS_400 = c("OS/400");
        boolean zC3 = c("Irix");
        IS_OS_IRIX = zC3;
        boolean z = c("Linux") || c("LINUX");
        IS_OS_LINUX = z;
        IS_OS_MAC = c("Mac");
        boolean zC4 = c("Mac OS X");
        IS_OS_MAC_OSX = zC4;
        IS_OS_MAC_OSX_CHEETAH = b("Mac OS X", "10.0");
        IS_OS_MAC_OSX_PUMA = b("Mac OS X", "10.1");
        IS_OS_MAC_OSX_JAGUAR = b("Mac OS X", "10.2");
        IS_OS_MAC_OSX_PANTHER = b("Mac OS X", "10.3");
        IS_OS_MAC_OSX_TIGER = b("Mac OS X", "10.4");
        IS_OS_MAC_OSX_LEOPARD = b("Mac OS X", "10.5");
        IS_OS_MAC_OSX_SNOW_LEOPARD = b("Mac OS X", "10.6");
        IS_OS_MAC_OSX_LION = b("Mac OS X", "10.7");
        IS_OS_MAC_OSX_MOUNTAIN_LION = b("Mac OS X", "10.8");
        IS_OS_MAC_OSX_MAVERICKS = b("Mac OS X", "10.9");
        IS_OS_MAC_OSX_YOSEMITE = b("Mac OS X", "10.10");
        IS_OS_MAC_OSX_EL_CAPITAN = b("Mac OS X", "10.11");
        boolean zC5 = c("FreeBSD");
        IS_OS_FREE_BSD = zC5;
        boolean zC6 = c("OpenBSD");
        IS_OS_OPEN_BSD = zC6;
        boolean zC7 = c("NetBSD");
        IS_OS_NET_BSD = zC7;
        IS_OS_OS2 = c("OS/2");
        boolean zC8 = c("Solaris");
        IS_OS_SOLARIS = zC8;
        boolean zC9 = c("SunOS");
        IS_OS_SUN_OS = zC9;
        IS_OS_UNIX = zC || zC2 || zC3 || z || zC4 || zC8 || zC9 || zC5 || zC6 || zC7;
        IS_OS_WINDOWS = c(a);
        IS_OS_WINDOWS_2000 = c("Windows 2000");
        IS_OS_WINDOWS_2003 = c("Windows 2003");
        IS_OS_WINDOWS_2008 = c("Windows Server 2008");
        IS_OS_WINDOWS_2012 = c("Windows Server 2012");
        IS_OS_WINDOWS_95 = c("Windows 95");
        IS_OS_WINDOWS_98 = c("Windows 98");
        IS_OS_WINDOWS_ME = c("Windows Me");
        IS_OS_WINDOWS_NT = c("Windows NT");
        IS_OS_WINDOWS_XP = c("Windows XP");
        IS_OS_WINDOWS_VISTA = c("Windows Vista");
        IS_OS_WINDOWS_7 = c("Windows 7");
        IS_OS_WINDOWS_8 = c("Windows 8");
        IS_OS_WINDOWS_10 = c("Windows 10");
        IS_OS_ZOS = c("z/OS");
    }

    private static boolean a(String str) {
        return e(JAVA_SPECIFICATION_VERSION, str);
    }

    private static boolean b(String str, String str2) {
        return f(OS_NAME, OS_VERSION, str, str2);
    }

    private static boolean c(String str) {
        return g(OS_NAME, str);
    }

    private static String d(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            System.err.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    public static boolean e(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static boolean f(String str, String str2, String str3, String str4) {
        return str != null && str2 != null && g(str, str3) && h(str2, str4);
    }

    public static boolean g(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static String getHostName() {
        return System.getenv(IS_OS_WINDOWS ? "COMPUTERNAME" : "HOSTNAME");
    }

    public static File getJavaHome() {
        return new File(System.getProperty(e));
    }

    public static File getJavaIoTmpDir() {
        return new File(System.getProperty(d));
    }

    public static File getUserDir() {
        return new File(System.getProperty(c));
    }

    public static File getUserHome() {
        return new File(System.getProperty(b));
    }

    public static boolean h(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        for (int i = 0; i < Math.min(strArrSplit.length, strArrSplit2.length); i++) {
            if (!strArrSplit[i].equals(strArrSplit2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isJavaAwtHeadless() {
        return Boolean.TRUE.toString().equals(JAVA_AWT_HEADLESS);
    }

    public static boolean isJavaVersionAtLeast(JavaVersion javaVersion) {
        return f.atLeast(javaVersion);
    }
}
