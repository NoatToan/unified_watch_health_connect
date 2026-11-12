package com.alipay.sdk.m.z;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import defpackage.mu;
import defpackage.on;
import defpackage.oq;
import defpackage.ox;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f2148a;
    public static ExecutorService d = Executors.newFixedThreadPool(16);

    /* JADX INFO: renamed from: com.alipay.sdk.m.z.a$a, reason: collision with other inner class name */
    public interface InterfaceC0023a<T, R> {
        R a(T t);
    }

    public static void a(int i, Object obj) {
        synchronized (a.class) {
            if (f2148a == null) {
                f2148a = new ConcurrentHashMap<>();
            }
            f2148a.put(Integer.valueOf(i), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
        }
    }

    public static Pair<Boolean, ?> a(int i, TimeUnit timeUnit, long j) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f2148a;
        if (concurrentHashMap == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Pair<Long, ?> pair = concurrentHashMap.get(Integer.valueOf(i));
        if (pair == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Long l = (Long) pair.first;
        Object obj = pair.second;
        if (l != null && SystemClock.elapsedRealtime() - l.longValue() <= TimeUnit.MILLISECONDS.convert(j, timeUnit)) {
            return new Pair<>(Boolean.TRUE, obj);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    public static Context a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static <T> T a(int i, long j, TimeUnit timeUnit, InterfaceC0023a<Object, Boolean> interfaceC0023a, Callable<T> callable, boolean z, long j2, TimeUnit timeUnit2, on onVar, boolean z2) {
        T tCall;
        try {
            Pair<Boolean, ?> pairA = a(i, timeUnit, j);
            if (((Boolean) pairA.first).booleanValue() && interfaceC0023a.a(pairA.second).booleanValue()) {
                oq.c("getC", i + " got " + pairA.second);
                return (T) pairA.second;
            }
            if (z2 && ox.i()) {
                mu.e(onVar, "biz", "ch_get_main", "" + i);
                oq.c("getC", i + " skip");
                tCall = null;
            } else {
                if (z) {
                    tCall = d.submit(callable).get(j2, timeUnit2);
                } else {
                    tCall = callable.call();
                }
                a(i, tCall);
            }
            oq.c("getC", i + " new " + tCall);
            return tCall;
        } catch (Throwable th) {
            oq.b("CDT", "ch_get_e|" + i, th);
            mu.c(onVar, "biz", "ch_get_e|" + i, th);
            oq.c("getC", i + " err");
            return null;
        }
    }
}
