package com.huawei.agconnect.apms;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class xyz {
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final int[] bcd = {Process.myPid()};
    public static final abc cde = new abc();

    public final class abc implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            if (file == null) {
                return false;
            }
            try {
                String name = file.getName();
                if (name.startsWith("cpu")) {
                    for (int i = 3; i < name.length(); i++) {
                        if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    public static int abc(BufferedReader bufferedReader) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.contains("MemTotal")) {
                            for (int i = 0; i < line.length(); i++) {
                                if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                                    sb.append(line.charAt(i));
                                }
                            }
                        }
                    } catch (IOException e) {
                        cde.abc(e, com.huawei.agconnect.apms.abc.abc("failed to close /proc/meminfo file: "), abc);
                    }
                } catch (NumberFormatException e2) {
                    abc.warn("failed to parse mem info: " + e2.getMessage());
                    bufferedReader.close();
                    return -1;
                } catch (Throwable th) {
                    abc.warn("failed to read /proc/meminfo file: " + th.getMessage());
                    bufferedReader.close();
                    return -1;
                }
                cde.abc(e, com.huawei.agconnect.apms.abc.abc("failed to close /proc/meminfo file: "), abc);
                return -1;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException e3) {
                    cde.abc(e3, com.huawei.agconnect.apms.abc.abc("failed to close /proc/meminfo file: "), abc);
                }
                throw th2;
            }
        }
        if (sb.length() == 0) {
            try {
                bufferedReader.close();
                return -1;
            } catch (IOException e4) {
                cde.abc(e4, com.huawei.agconnect.apms.abc.abc("failed to close /proc/meminfo file: "), abc);
                return -1;
            }
        }
        int i2 = Integer.parseInt(sb.toString());
        try {
            bufferedReader.close();
            return i2;
        } catch (IOException e5) {
            cde.abc(e5, com.huawei.agconnect.apms.abc.abc("failed to close /proc/meminfo file: "), abc);
            return i2;
        }
        cde.abc(e, com.huawei.agconnect.apms.abc.abc("failed to close /proc/meminfo file: "), abc);
        return -1;
    }

    public static long bcd(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        try {
            memoryInfo = new ActivityManager.MemoryInfo();
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null) {
                    return -1L;
                }
                activityManager.getMemoryInfo(memoryInfo);
            } catch (Throwable th) {
                th = th;
                def.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get memory info: "), abc);
            }
        } catch (Throwable th2) {
            th = th2;
            memoryInfo = null;
        }
        if (memoryInfo != null) {
            return memoryInfo.totalMem;
        }
        return -1L;
    }

    public static long abc(Context context) {
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (processMemoryInfo = activityManager.getProcessMemoryInfo(bcd)) == null || processMemoryInfo.length <= 0 || (memoryInfo = processMemoryInfo[0]) == null) {
                return 0L;
            }
            long totalPss = memoryInfo.getTotalPss();
            if (totalPss >= 0) {
                return totalPss / 1024;
            }
        } catch (Throwable th) {
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get memory usage: "), abc);
        }
        return 0L;
    }

    public static long abc() {
        long[] jArr = new long[2];
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getCanonicalPath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getCanonicalPath());
            jArr[0] = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            long availableBlocksLong = statFs2.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            jArr[1] = availableBlocksLong;
            if (jArr[0] < 0) {
                jArr[0] = 0;
            }
            if (availableBlocksLong < 0) {
                jArr[1] = 0;
            }
        } catch (Throwable th) {
            try {
                abc.warn("can not get available disk size: " + th.getMessage());
            } finally {
                if (jArr[0] < 0) {
                    jArr[0] = 0;
                }
                if (jArr[1] < 0) {
                    jArr[1] = 0;
                }
            }
        }
        return jArr[0] + jArr[1];
    }
}
