package com.huawei.hms.network.file.core.util;

import android.app.ActivityManager;
import android.content.Context;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static long a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return 0L;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (Exception e) {
            FLogger.w("CpuTool", "getAvailableRam exception:", e);
            return 0L;
        }
    }

    public static int a() throws Throwable {
        BufferedReader bufferedReader;
        IOException e;
        InputStreamReader inputStreamReader;
        Closeable closeable = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"), "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String line = bufferedReader.readLine();
                        int i = Utils.isBlank(line) ? 0 : Integer.parseInt(line.trim());
                        com.huawei.hms.network.file.a.k.b.f.a((Closeable) inputStreamReader);
                        com.huawei.hms.network.file.a.k.b.f.a((Closeable) bufferedReader);
                        return i;
                    } catch (FileNotFoundException unused) {
                        closeable = bufferedReader;
                        FLogger.w("CpuTool", "getCurCpuFreq exception fileNotFoundException", new Object[0]);
                        com.huawei.hms.network.file.a.k.b.f.a((Closeable) inputStreamReader);
                        com.huawei.hms.network.file.a.k.b.f.a(closeable);
                        return 0;
                    } catch (IOException e2) {
                        e = e2;
                        closeable = bufferedReader;
                        FLogger.w("CpuTool", "getCurCpuFreq exception", e);
                        com.huawei.hms.network.file.a.k.b.f.a((Closeable) inputStreamReader);
                        com.huawei.hms.network.file.a.k.b.f.a(closeable);
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        closeable = inputStreamReader;
                        com.huawei.hms.network.file.a.k.b.f.a(closeable);
                        com.huawei.hms.network.file.a.k.b.f.a((Closeable) bufferedReader);
                        throw th;
                    }
                } catch (FileNotFoundException unused2) {
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (FileNotFoundException unused3) {
            inputStreamReader = null;
        } catch (IOException e4) {
            e = e4;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            com.huawei.hms.network.file.a.k.b.f.a(closeable);
            com.huawei.hms.network.file.a.k.b.f.a((Closeable) bufferedReader);
            throw th;
        }
    }
}
