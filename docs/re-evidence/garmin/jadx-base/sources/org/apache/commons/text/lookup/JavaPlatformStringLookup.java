package org.apache.commons.text.lookup;

import am.j;
import java.io.PrintStream;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
final class JavaPlatformStringLookup extends AbstractStringLookup {
    static final JavaPlatformStringLookup INSTANCE = new JavaPlatformStringLookup();
    private static final String KEY_HARDWARE = "hardware";
    private static final String KEY_LOCALE = "locale";
    private static final String KEY_OS = "os";
    private static final String KEY_RUNTIME = "runtime";
    private static final String KEY_VERSION = "version";
    private static final String KEY_VM = "vm";

    private JavaPlatformStringLookup() {
    }

    private String getSystemProperty(String str, String str2) {
        String systemProperty = getSystemProperty(str2);
        return StringUtils.isEmpty(systemProperty) ? "" : k.g(str, systemProperty);
    }

    public static void main(String[] strArr) {
        System.out.println(JavaPlatformStringLookup.class);
        PrintStream printStream = System.out;
        JavaPlatformStringLookup javaPlatformStringLookup = INSTANCE;
        printStream.printf("%s = %s%n", KEY_VERSION, javaPlatformStringLookup.lookup(KEY_VERSION));
        System.out.printf("%s = %s%n", KEY_RUNTIME, javaPlatformStringLookup.lookup(KEY_RUNTIME));
        System.out.printf("%s = %s%n", KEY_VM, javaPlatformStringLookup.lookup(KEY_VM));
        System.out.printf("%s = %s%n", KEY_OS, javaPlatformStringLookup.lookup(KEY_OS));
        System.out.printf("%s = %s%n", KEY_HARDWARE, javaPlatformStringLookup.lookup(KEY_HARDWARE));
        System.out.printf("%s = %s%n", KEY_LOCALE, javaPlatformStringLookup.lookup(KEY_LOCALE));
    }

    public String getHardware() {
        return "processors: " + Runtime.getRuntime().availableProcessors() + ", architecture: " + getSystemProperty("os.arch") + getSystemProperty("-", "sun.arch.data.model") + getSystemProperty(", instruction sets: ", "sun.cpu.isalist");
    }

    public String getLocale() {
        return "default locale: " + Locale.getDefault() + ", platform encoding: " + getSystemProperty("file.encoding");
    }

    public String getOperatingSystem() {
        return getSystemProperty("os.name") + StringUtils.SPACE + getSystemProperty("os.version") + getSystemProperty(StringUtils.SPACE, "sun.os.patch.level") + ", architecture: " + getSystemProperty("os.arch") + getSystemProperty("-", "sun.arch.data.model");
    }

    public String getRuntime() {
        return getSystemProperty("java.runtime.name") + " (build " + getSystemProperty("java.runtime.version") + ") from " + getSystemProperty("java.vendor");
    }

    public String getVirtualMachine() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getSystemProperty("java.vm.name"));
        sb3.append(" (build ");
        sb3.append(getSystemProperty("java.vm.version"));
        sb3.append(", ");
        return j.o(getSystemProperty("java.vm.info"), ")", sb3);
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "locale":
                return getLocale();
            case "os":
                return getOperatingSystem();
            case "vm":
                return getVirtualMachine();
            case "hardware":
                return getHardware();
            case "version":
                return "Java version " + getSystemProperty("java.version");
            case "runtime":
                return getRuntime();
            default:
                h.s(str);
                return null;
        }
    }

    private String getSystemProperty(String str) {
        return StringLookupFactory.INSTANCE_SYSTEM_PROPERTIES.lookup(str);
    }
}
