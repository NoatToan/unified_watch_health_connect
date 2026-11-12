package com.huawei.openalliance.ad;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class im {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static im f18971b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18970a = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18972c = new byte[0];
    private static Map<String, Long> d = new HashMap();
    private static boolean e = false;

    public void b(boolean z) {
        synchronized (f18972c) {
            a(z);
        }
    }

    public void b() {
        synchronized (f18972c) {
            d.clear();
            a(false);
        }
    }

    public void a(String str, long j) {
        synchronized (f18972c) {
            if (d.containsKey(str)) {
                d.put(str, Long.valueOf(d.get(str).longValue() + j));
            } else {
                d.put(str, Long.valueOf(j));
            }
        }
    }

    public long a(String str) {
        synchronized (f18972c) {
            if (d.containsKey(str)) {
                return d.get(str).longValue();
            }
            d.put(str, 0L);
            return 0L;
        }
    }

    private static im c() {
        im imVar;
        synchronized (f18970a) {
            if (f18971b == null) {
                f18971b = new im();
            }
            imVar = f18971b;
        }
        return imVar;
    }

    public static void a(boolean z) {
        e = z;
    }

    public static im a() {
        return c();
    }

    private im() {
    }
}
