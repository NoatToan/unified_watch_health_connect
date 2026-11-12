package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f2877a = "9aj&#k81";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f2878b = "IaHR0cDovL2xvZ3MuYW1hcC5jb20vd3MvbG9nL3VwbG9hZD9wcm9kdWN0PSVzJnR5cGU9JXMmcGxhdGZvcm09JXMmY2hhbm5lbD0lcyZzaWduPSVz";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static byte[] f2879c = null;
    public static boolean d = false;
    public static boolean e = false;
    private static String k = "ADgAJQBdABEAbgAJAHcAFQCMAEEAzQBFARIAIQEzADkBbAA9AakAoQJKATEDewAJA4QADQORABFLWVc1a2NtOXBaQzV2Y3k1VFpYSjJhV05sVFdGdVlXZGxjZz09UVoyVjBVMlZ5ZG1salpRPT1JY0dodmJtVT1VYVhCb2IyNWxjM1ZpYVc1bWJ3PT1NWTI5dExtRnVaSEp2YVdRdWFXNTBaWEp1WVd3dWRHVnNaWEJvYjI1NUxrbFVaV3hsY0dodmJua2tVM1IxWWc9PVFZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsUWFHOXVaVk4xWWtsdVptOGtVM1IxWWc9PUdWRkpCVGxOQlExUkpUMDVmWjJWMFJHVjJhV05sU1dRPUVZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsVVpXeGxjR2h2Ym5rPUlZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsUWFHOXVaVk4xWWtsdVptOD1FSW10bGVTSTZJaVZ6SWl3aWNHeGhkR1p2Y20waU9pSmhibVJ5YjJsa0lpd2laR2wxSWpvaUpYTWlMQ0p3YTJjaU9pSWxjeUlzSW0xdlpHVnNJam9pSlhNaUxDSmhjSEJ1WVcxbElqb2lKWE1pTENKaGNIQjJaWEp6YVc5dUlqb2lKWE1pTENKemVYTjJaWEp6YVc5dUlqb2lKWE1pTEE9PVNJbXRsZVNJNklpVnpJaXdpY0d4aGRHWnZjbTBpT2lKaGJtUnliMmxrSWl3aVpHbDFJam9pSlhNaUxDSnRZV01pT2lJbGN5SXNJblJwWkNJNklpVnpJaXdpZFcxcFpIUWlPaUlsY3lJc0ltMWhiblZtWVdOMGRYSmxJam9pSlhNaUxDSmtaWFpwWTJVaU9pSWxjeUlzSW5OcGJTSTZJaVZ6SWl3aWNHdG5Jam9pSlhNaUxDSnRiMlJsYkNJNklpVnpJaXdpWVhCd2RtVnljMmx2YmlJNklpVnpJaXdpWVhCd2JtRnRaU0k2SWlWeklpd2liMkZwWkNJNklpVnpJaXdpWVdScGRTSTZJaVZ6SWl3aWIzTmZkbVZ5SWpvaUpYTWlMQ0poWVdsa0lqb2lKWE1pSVlXbGtQUT09TWZITmxjbWxoYkQwPVFZVzVrY205cFpGOXBaQT09";
    private static volatile ConcurrentHashMap<String, String> l = new ConcurrentHashMap<>(8);
    public static final Integer f = 1;
    public static final Integer g = 2;
    public static final Integer h = 3;
    public static final Integer i = 4;
    public static final Integer j = 5;

    public static byte[] a() {
        if (f2879c == null) {
            f2879c = iq.b(k);
        }
        byte[] bArr = new byte[4];
        System.arraycopy(f2879c, 40, bArr, 0, 4);
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        int i2 = ((bArr[2] & 255) * 256) + (bArr[3] & 255);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(f2879c, ((b2 & 255) * 256) + (b3 & 255), bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            synchronized (l) {
                try {
                    if (l == null) {
                        l = new ConcurrentHashMap<>(8);
                    }
                    if (!l.containsKey(str)) {
                        l.put(str, str2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(String str) {
        String str2 = "";
        try {
            synchronized (l) {
                if (l != null && l.containsKey(str)) {
                    str2 = l.get(str);
                }
            }
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }
}
