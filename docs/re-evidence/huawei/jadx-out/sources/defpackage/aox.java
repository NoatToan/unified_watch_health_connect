package defpackage;

import com.google.common.base.Supplier;
import com.google.common.hash.ElementTypesAreNonnullByDefault;
import com.google.common.hash.LongAddable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aox {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Supplier<LongAddable> f640c;

    aox() {
    }

    static {
        Supplier<LongAddable> supplier;
        try {
            new aou();
            supplier = new Supplier<LongAddable>() { // from class: aox.4
                @Override // com.google.common.base.Supplier
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public LongAddable get() {
                    return new aou();
                }
            };
        } catch (Throwable unused) {
            supplier = new Supplier<LongAddable>() { // from class: aox.2
                @Override // com.google.common.base.Supplier
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public LongAddable get() {
                    return new e();
                }
            };
        }
        f640c = supplier;
    }

    public static LongAddable a() {
        return f640c.get();
    }

    static final class e extends AtomicLong implements LongAddable {
        private e() {
        }

        @Override // com.google.common.hash.LongAddable
        public void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.hash.LongAddable
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // com.google.common.hash.LongAddable
        public long sum() {
            return get();
        }
    }
}
