package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class pre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final spo<ore> f30679a;

    public class a implements spo<ore> {
        @Override // defpackage.spo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ore get() {
            return new qre();
        }
    }

    public class b implements spo<ore> {
        @Override // defpackage.spo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ore get() {
            return new c(null);
        }
    }

    public static final class c extends AtomicLong implements ore {
        public c() {
        }

        @Override // defpackage.ore
        public long a() {
            return get();
        }

        @Override // defpackage.ore
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // defpackage.ore
        public void increment() {
            getAndIncrement();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        spo<ore> bVar;
        try {
            new qre();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f30679a = bVar;
    }

    public static ore a() {
        return f30679a.get();
    }
}
