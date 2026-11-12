package com.garmin.android.library.backgroundtaskmanagement;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f50123c = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f50125b = new AtomicLong(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<Long, b> f50124a = new ConcurrentHashMap<>();

    private c() {
    }

    public static long d(b bVar, b.InterfaceC0995b interfaceC0995b) {
        c cVar = f50123c;
        AtomicLong atomicLong = cVar.f50125b;
        long andIncrement = atomicLong.getAndIncrement();
        if (andIncrement == Long.MAX_VALUE) {
            atomicLong.set(1L);
        }
        cVar.f50124a.put(Long.valueOf(andIncrement), bVar);
        bVar.f50096f = andIncrement;
        if (interfaceC0995b == null) {
            bVar.f50100j = null;
        } else {
            bVar.f50100j = new SoftReference<>(interfaceC0995b);
        }
        bVar.e();
        return andIncrement;
    }

    public final void a(long j8) {
        Long lValueOf = Long.valueOf(j8);
        ConcurrentHashMap<Long, b> concurrentHashMap = this.f50124a;
        b bVar = concurrentHashMap.get(lValueOf);
        if (bVar != null) {
            bVar.d();
            concurrentHashMap.remove(Long.valueOf(j8));
        }
    }

    public final void b(Long l14) {
        if (l14 != null) {
            a(l14.longValue());
        }
    }

    public final void c(List<Long> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            b(list.get(i14));
        }
    }

    public final boolean e(Long l14) {
        return (l14 == null || this.f50124a.get(l14) == null) ? false : true;
    }
}
