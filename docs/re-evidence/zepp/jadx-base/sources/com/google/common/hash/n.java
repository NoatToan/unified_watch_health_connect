package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class n {
    private static final Supplier<m> a;

    public static class a implements Supplier<m> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m get() {
            return new o();
        }
    }

    public static class b implements Supplier<m> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m get() {
            return new c(null);
        }
    }

    public static final class c extends AtomicLong implements m {
        private c() {
        }

        @Override // com.google.common.hash.m
        public long a() {
            return get();
        }

        @Override // com.google.common.hash.m
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // com.google.common.hash.m
        public void increment() {
            getAndIncrement();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        Supplier<m> bVar;
        try {
            new o();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        a = bVar;
    }

    public static m a() {
        return a.get();
    }
}
