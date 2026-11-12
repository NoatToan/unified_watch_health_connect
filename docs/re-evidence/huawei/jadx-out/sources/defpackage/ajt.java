package defpackage;

import com.google.common.base.Supplier;
import com.google.common.cache.ElementTypesAreNonnullByDefault;
import com.google.common.cache.LongAddable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ajt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Supplier<LongAddable> f489b;

    ajt() {
    }

    static {
        Supplier<LongAddable> supplier;
        try {
            new ajw();
            supplier = new Supplier<LongAddable>() { // from class: ajt.2
                @Override // com.google.common.base.Supplier
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public LongAddable get() {
                    return new ajw();
                }
            };
        } catch (Throwable unused) {
            supplier = new Supplier<LongAddable>() { // from class: ajt.3
                @Override // com.google.common.base.Supplier
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public LongAddable get() {
                    return new a();
                }
            };
        }
        f489b = supplier;
    }

    public static LongAddable b() {
        return f489b.get();
    }

    static final class a extends AtomicLong implements LongAddable {
        private a() {
        }

        @Override // com.google.common.cache.LongAddable
        public void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.LongAddable
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // com.google.common.cache.LongAddable
        public long sum() {
            return get();
        }
    }
}
