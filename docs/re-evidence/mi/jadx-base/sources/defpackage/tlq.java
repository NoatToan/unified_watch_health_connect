package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.system.Os;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import xcrash.XCrash;

/* JADX INFO: loaded from: classes3.dex */
public class tlq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f34837a = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};

    public static class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return TextUtils.isDigitsOnly(str);
        }
    }

    public static boolean a(String str) {
        File file = new File(str);
        try {
            if (file.exists()) {
                return file.isDirectory();
            }
            file.mkdirs();
            return file.exists() && file.isDirectory();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Context context, long j) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        if (activityManager == null) {
            return false;
        }
        int iMyPid = Process.myPid();
        long j2 = j / 500;
        for (int i = 0; i < j2; i++) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                        return true;
                    }
                }
            }
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String c() {
        return TextUtils.join(",", Build.SUPPORTED_ABIS);
    }

    public static String d(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    public static String e() {
        String str;
        StringBuilder sb = new StringBuilder("open files:\n");
        try {
            File[] fileArrListFiles = new File("/proc/self/fd").listFiles(new a());
            if (fileArrListFiles != null) {
                int i = 0;
                for (File file : fileArrListFiles) {
                    try {
                        str = Os.readlink(file.getAbsolutePath());
                    } catch (Exception unused) {
                        str = null;
                    }
                    sb.append("    fd ");
                    sb.append(file.getName());
                    sb.append(": ");
                    sb.append(TextUtils.isEmpty(str) ? "???" : str.trim());
                    sb.append('\n');
                    i++;
                    if (i > 1024) {
                        break;
                    }
                }
                if (fileArrListFiles.length > 1024) {
                    sb.append("    ......\n");
                }
                sb.append("    (number of FDs: ");
                sb.append(fileArrListFiles.length);
                sb.append(")\n");
            }
        } catch (Exception unused2) {
        }
        sb.append('\n');
        return sb.toString();
    }

    public static String f(String str) {
        return g(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static String g(String str, int i) throws Throwable {
        StringBuilder sb = new StringBuilder();
        ?? r1 = 0;
        r1 = 0;
        try {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
                    int i2 = 0;
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String strTrim = line.trim();
                            if (strTrim.length() > 0) {
                                i2++;
                                if (i == 0 || i2 <= i) {
                                    sb.append("  ");
                                    sb.append(strTrim);
                                    sb.append("\n");
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            r1 = bufferedReader;
                            XCrash.f().i("xcrash", "Util getInfo(" + str + ") failed", e);
                            if (r1 != 0) {
                                r1.close();
                                r1 = r1;
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            r1 = bufferedReader;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (i > 0 && i2 > i) {
                        sb.append("  ......\n");
                        sb.append("  (number of records: ");
                        sb.append(i2);
                        sb.append(")\n");
                    }
                    bufferedReader.close();
                    r1 = i2;
                } catch (Exception unused2) {
                }
            } catch (Exception e2) {
                e = e2;
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String h(Date date, Date date2, String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_ISO8601, Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\nTombstone maker: 'xCrash 2.4.9'\nCrash type: '");
        sb.append(str);
        sb.append("'\nStart time: '");
        sb.append(simpleDateFormat.format(date));
        sb.append("'\nCrash time: '");
        sb.append(simpleDateFormat.format(date2));
        sb.append("'\nApp ID: '");
        sb.append(str2);
        sb.append("'\nApp version: '");
        sb.append(str3);
        sb.append("'\nRooted: '");
        sb.append(o() ? "Yes" : "No");
        sb.append("'\nAPI level: '");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("'\nOS version: '");
        sb.append(Build.VERSION.RELEASE);
        sb.append("'\nABI list: '");
        sb.append(c());
        sb.append("'\nManufacturer: '");
        sb.append(Build.MANUFACTURER);
        sb.append("'\nBrand: '");
        sb.append(Build.BRAND);
        sb.append("'\nModel: '");
        sb.append(Build.MODEL);
        sb.append("'\nBuild fingerprint: '");
        sb.append(Build.FINGERPRINT);
        sb.append("'\n");
        return sb.toString();
    }

    public static String i(int i, int i2, int i3) throws Throwable {
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder();
        sb.append("logcat:\n");
        if (i > 0) {
            j(iMyPid, sb, FaceSchema.FACE_PAGE_MAIN, i, 'D');
        }
        if (i2 > 0) {
            j(iMyPid, sb, "system", i2, 'W');
        }
        if (i3 > 0) {
            j(iMyPid, sb, "events", i2, 'I');
        }
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void j(int i, StringBuilder sb, String str, int i2, char c) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e;
        String string = Integer.toString(i);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(string);
        sb2.append(" ");
        ArrayList arrayList = new ArrayList();
        arrayList.add("/system/bin/logcat");
        arrayList.add("-b");
        arrayList.add(str);
        arrayList.add("-d");
        arrayList.add("-v");
        arrayList.add("threadtime");
        arrayList.add("-t");
        arrayList.add(Integer.toString(i2));
        arrayList.add("--pid");
        arrayList.add(string);
        arrayList.add("*:" + c);
        Object[] array = arrayList.toArray();
        sb.append("--------- tail end of log ");
        sb.append(str);
        sb.append(" (");
        sb.append(TextUtils.join(" ", array));
        sb.append(")\n");
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[0]).command(arrayList).start().getInputStream()));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append("\n");
                    } catch (Exception e2) {
                        e = e2;
                        XCrash.f().w("xcrash", "Util run logcat command failed", e);
                        if (bufferedReader == null) {
                            return;
                        }
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e3) {
            bufferedReader = null;
            e = e3;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
        bufferedReader.close();
    }

    public static String k() {
        return "memory info:\n System Summary (From: /proc/meminfo)\n" + f("/proc/meminfo") + "-\n Process Status (From: /proc/PID/status)\n" + f("/proc/self/status") + "-\n Process Limits (From: /proc/PID/limits)\n" + f("/proc/self/limits") + "-\n" + m() + "\n";
    }

    public static String l() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "network info:\nNot supported on Android Q (API level 29) and later.\n\n";
        }
        return "network info:\n TCP over IPv4 (From: /proc/PID/net/tcp)\n" + g("/proc/self/net/tcp", 1024) + "-\n TCP over IPv6 (From: /proc/PID/net/tcp6)\n" + g("/proc/self/net/tcp6", 1024) + "-\n UDP over IPv4 (From: /proc/PID/net/udp)\n" + g("/proc/self/net/udp", 1024) + "-\n UDP over IPv6 (From: /proc/PID/net/udp6)\n" + g("/proc/self/net/udp6", 1024) + "-\n ICMP in IPv4 (From: /proc/PID/net/icmp)\n" + g("/proc/self/net/icmp", 256) + "-\n ICMP in IPv6 (From: /proc/PID/net/icmp6)\n" + g("/proc/self/net/icmp6", 256) + "-\n UNIX domain (From: /proc/PID/net/unix)\n" + g("/proc/self/net/unix", 256) + "\n";
    }

    public static String m() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Process Summary (From: android.os.Debug.MemoryInfo)\n");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%21s %8s\n", "", "Pss(KB)"));
        sb.append(String.format(locale, "%21s %8s\n", "", "------"));
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            sb.append(String.format(locale, "%21s %8s\n", "Java Heap:", memoryInfo.getMemoryStat("summary.java-heap")));
            sb.append(String.format(locale, "%21s %8s\n", "Native Heap:", memoryInfo.getMemoryStat("summary.native-heap")));
            sb.append(String.format(locale, "%21s %8s\n", "Code:", memoryInfo.getMemoryStat("summary.code")));
            sb.append(String.format(locale, "%21s %8s\n", "Stack:", memoryInfo.getMemoryStat("summary.stack")));
            sb.append(String.format(locale, "%21s %8s\n", "Graphics:", memoryInfo.getMemoryStat("summary.graphics")));
            sb.append(String.format(locale, "%21s %8s\n", "Private Other:", memoryInfo.getMemoryStat("summary.private-other")));
            sb.append(String.format(locale, "%21s %8s\n", "System:", memoryInfo.getMemoryStat("summary.system")));
            sb.append(String.format(locale, "%21s %8s %21s %8s\n", "TOTAL:", memoryInfo.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo.getMemoryStat("summary.total-swap")));
        } catch (Exception e) {
            XCrash.f().i("xcrash", "Util getProcessMemoryInfo failed", e);
        }
        return sb.toString();
    }

    public static String n(Context context, int i) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i && !TextUtils.isEmpty(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Exception unused) {
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    String strTrim = line.trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused2) {
                        }
                        return strTrim;
                    }
                }
            } catch (Exception unused3) {
                if (bufferedReader != null) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
        try {
            bufferedReader.close();
        } catch (Exception unused6) {
        }
        return null;
    }

    public static boolean o() {
        try {
            for (String str : f34837a) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
