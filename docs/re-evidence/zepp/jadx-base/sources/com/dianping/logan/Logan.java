package com.dianping.logan;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Logan {
    private static OnLoganProtocolStatus a = null;
    private static a b = null;
    public static boolean c = false;

    public static void a(String str, int i) {
        OnLoganProtocolStatus onLoganProtocolStatus = a;
        if (onLoganProtocolStatus != null) {
            onLoganProtocolStatus.loganProtocolStatus(str, i);
        }
    }

    public static void f() {
        a aVar = b;
        if (aVar == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        aVar.a();
    }

    public static Map<String, Long> getAllFilesInfo() {
        File[] fileArrListFiles;
        a aVar = b;
        if (aVar == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        File fileC = aVar.c();
        if (!fileC.exists() || (fileArrListFiles = fileC.listFiles()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (File file : fileArrListFiles) {
            try {
                map.put(Util.getDateStr(Long.parseLong(file.getName())), Long.valueOf(file.length()));
            } catch (NumberFormatException unused) {
            }
        }
        return map;
    }

    public static void init(LoganConfig loganConfig) {
        b = a.e(loganConfig);
    }

    public static void s(String[] strArr, SendLogRunnable sendLogRunnable) {
        a aVar = b;
        if (aVar == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        aVar.f(strArr, sendLogRunnable);
    }

    public static void setDebug(boolean z) {
        c = z;
    }

    public static void setOnLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus) {
        a = onLoganProtocolStatus;
    }

    public static void w(String str, int i) {
        a aVar = b;
        if (aVar == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        aVar.g(str, i);
    }
}
