package com.huawei.agconnect.apms;

import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public final class t0 {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    public static String abc() {
        StringBuilder sbAbc = abc.abc("memory status:\n System Status (From: /proc/meminfo)\n");
        sbAbc.append(abc("/proc/meminfo", 0));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        sbAbc.append(" Process Status (From: /proc/PID/status)");
        sbAbc.append("\n");
        sbAbc.append(abc("/proc/self/status", 0));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        sbAbc.append(" Process Limits (From: /proc/PID/limits)");
        sbAbc.append("\n");
        sbAbc.append(abc("/proc/self/limits", 0));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        StringBuilder sb = new StringBuilder(" Process Status (From: android.os.Debug.MemoryInfo)\n");
        Locale locale = Locale.ENGLISH;
        sb.append(String.format(locale, "%21s %8s%n", "", "Pss(KB)"));
        sb.append(String.format(locale, "%21s %8s%n", "", "------"));
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            sb.append(String.format(locale, "%21s %8s%n", "Java Heap:", memoryInfo.getMemoryStat("summary.java-heap")));
            sb.append(String.format(locale, "%21s %8s%n", "Native Heap:", memoryInfo.getMemoryStat("summary.native-heap")));
            sb.append(String.format(locale, "%21s %8s%n", "Code:", memoryInfo.getMemoryStat("summary.code")));
            sb.append(String.format(locale, "%21s %8s%n", "Stack:", memoryInfo.getMemoryStat("summary.stack")));
            sb.append(String.format(locale, "%21s %8s%n", "Graphics:", memoryInfo.getMemoryStat("summary.graphics")));
            sb.append(String.format(locale, "%21s %8s%n", "Private Other:", memoryInfo.getMemoryStat("summary.private-other")));
            sb.append(String.format(locale, "%21s %8s%n", "System:", memoryInfo.getMemoryStat("summary.system")));
            sb.append(String.format(locale, "%21s %8s %21s %8s%n", "TOTAL:", memoryInfo.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo.getMemoryStat("summary.total-swap")));
        } catch (Throwable th) {
            abc.warn("get memory status of process failed. " + th);
        }
        sbAbc.append(sb.toString());
        sbAbc.append("\n");
        return sbAbc.toString();
    }

    public static String bcd() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "network status:\nnot supported collect network statues on Android Q (API level 29) and later.\n\n";
        }
        StringBuilder sbAbc = abc.abc("network status:\n IPv4-based TCP (From: /proc/PID/net/tcp)\n");
        sbAbc.append(abc("/proc/self/net/tcp", 1024));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        sbAbc.append(" IPv6-based TCP (From: /proc/PID/net/tcp6)");
        sbAbc.append("\n");
        sbAbc.append(abc("/proc/self/net/tcp6", 1024));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        sbAbc.append(" IPv4-based UDP (From: /proc/PID/net/udp)");
        sbAbc.append("\n");
        sbAbc.append(abc("/proc/self/net/udp", 1024));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        sbAbc.append(" IPv6-based UDP (From: /proc/PID/net/udp6)");
        sbAbc.append("\n");
        sbAbc.append(abc("/proc/self/net/udp6", 1024));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        sbAbc.append(" IPv4-based ICMP (From: /proc/PID/net/icmp)");
        sbAbc.append("\n");
        sbAbc.append(abc("/proc/self/net/icmp", 256));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        sbAbc.append(" IPv6-based ICMP (From: /proc/PID/net/icmp6)");
        sbAbc.append(abc("/proc/self/net/icmp6", 256));
        sbAbc.append(Constants.LINK);
        sbAbc.append("\n");
        sbAbc.append(" UNIX domain (From: /proc/PID/net/unix)");
        sbAbc.append("\n");
        sbAbc.append(abc("/proc/self/net/unix", 256));
        sbAbc.append("\n");
        return sbAbc.toString();
    }

    public static int abc(int i, StringBuilder sb, String str, int i2, char c2, int i3) {
        BufferedReader bufferedReader;
        String string = Integer.toString(i);
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
        arrayList.add("*:" + c2);
        Object[] array = arrayList.toArray(new String[0]);
        sb.append("--------- tail end of log ");
        sb.append(str);
        sb.append(" (");
        sb.append(TextUtils.join(" ", array));
        sb.append(")\n");
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[0]).command(arrayList).start().getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null || i3 < line.length()) {
                            break;
                            break;
                        }
                        i3 -= line.length();
                        sb.append(line);
                        sb.append("\n");
                    } catch (Throwable th) {
                        th = th;
                        try {
                            abc.warn("run logcat command failed." + th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return i3;
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    abc.warn("close logcat failed.");
                                }
                            }
                            throw th2;
                        }
                    }
                }
                bufferedReader.close();
                return i3;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (IOException unused2) {
            abc.warn("close logcat failed.");
        }
    }

    public static String abc(String str, int i) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(str));
                int i2 = 0;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        String strTrim = line.trim();
                        if (!strTrim.isEmpty()) {
                            i2++;
                            if (i == 0 || i2 <= i) {
                                sb.append("  ");
                                sb.append(strTrim);
                                sb.append("\n");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            abc.warn("get info from " + str + " failed. " + th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                    abc.warn("close file failed.");
                                }
                            }
                            throw th2;
                        }
                    }
                }
                bufferedReader.close();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Exception unused2) {
            abc.warn("close file failed.");
        }
        return sb.toString();
    }
}
