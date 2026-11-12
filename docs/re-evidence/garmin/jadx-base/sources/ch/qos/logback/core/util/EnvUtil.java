package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class EnvUtil {
    private static final Pattern versionPattern = Pattern.compile("^(1\\.)?([0-9]+)");

    private EnvUtil() {
    }

    public static boolean isAndroidOS() {
        String systemProperty = OptionHelper.getSystemProperty("os.name");
        String env = OptionHelper.getEnv("ANDROID_ROOT");
        String env2 = OptionHelper.getEnv("ANDROID_DATA");
        return systemProperty != null && systemProperty.contains("Linux") && env != null && env.contains("/system") && env2 != null && env2.contains("/data");
    }

    public static boolean isJDK5() {
        return isJDK_N_OrHigher(5);
    }

    public static boolean isJDK7OrHigher() {
        return isJDK_N_OrHigher(7);
    }

    private static boolean isJDK_N_OrHigher(int i14) {
        Matcher matcher = versionPattern.matcher(System.getProperty("java.version", ""));
        return matcher.find() && i14 <= Integer.parseInt(matcher.group(2));
    }
}
