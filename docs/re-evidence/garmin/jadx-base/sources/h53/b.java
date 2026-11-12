package h53;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\rB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lh53/b;", "T", "", "value", "Lh53/c;", "trace", "<init>", "(Ljava/lang/Object;Lh53/c;)V", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "a", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<b<?>, Object> f82140b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f82141a;
    private volatile T value;

    static {
        new a(null);
        f82140b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "value");
    }

    public b(T t7, c cVar) {
        cVar.getClass();
        this.f82141a = cVar;
        this.value = t7;
    }

    public final boolean a(T t7, T t14) {
        boolean z14;
        while (true) {
            AtomicReferenceFieldUpdater<b<?>, Object> atomicReferenceFieldUpdater = f82140b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, t7, t14)) {
                z14 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != t7) {
                z14 = false;
                break;
            }
        }
        if (z14 && this.f82141a != c.a.f82142a) {
            Objects.toString(t7);
            Objects.toString(t14);
        }
        return z14;
    }

    public final T b() {
        return this.value;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Rd\u0010\u0007\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh53/b$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lh53/b;", "kotlin.jvm.PlatformType", "FU", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
