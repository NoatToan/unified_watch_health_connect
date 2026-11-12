package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class c {
    private static final Supplier<com.google.common.cache.b> a;

    public static class a implements Supplier<com.google.common.cache.b> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.b get() {
            return new d();
        }
    }

    public static class b implements Supplier<com.google.common.cache.b> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.b get() {
            return new C0176c(null);
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.c$c, reason: collision with other inner class name */
    public static final class C0176c extends AtomicLong implements com.google.common.cache.b {
        private C0176c() {
        }

        @Override // com.google.common.cache.b
        public long a() {
            return get();
        }

        @Override // com.google.common.cache.b
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // com.google.common.cache.b
        public void increment() {
            getAndIncrement();
        }

        public /* synthetic */ C0176c(a aVar) {
            this();
        }
    }

    static {
        Supplier<com.google.common.cache.b> bVar;
        try {
            new d();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        a = bVar;
    }

    public static com.google.common.cache.b a() {
        return a.get();
    }
}
