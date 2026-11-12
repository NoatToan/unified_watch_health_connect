package o13;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\rB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lo13/s;", "T", "Lo13/l;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Le23/a;)V", "", "b", "Ljava/lang/Object;", "_value", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s<T> implements l<T>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<s<?>, Object> f128599c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile e23.a<? extends T> f128600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public volatile Object _value;

    static {
        new a(null);
        f128599c = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "b");
    }

    public s(e23.a<? extends T> aVar) {
        aVar.getClass();
        this.f128600a = aVar;
        this._value = b0.f128566a;
    }

    @Override // o13.l
    public final T getValue() {
        T t7 = (T) this._value;
        b0 b0Var = b0.f128566a;
        if (t7 != b0Var) {
            return t7;
        }
        e23.a<? extends T> aVar = this.f128600a;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater<s<?>, Object> atomicReferenceFieldUpdater = f128599c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b0Var, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != b0Var) {
                }
            }
            this.f128600a = null;
            return tInvoke;
        }
        return (T) this._value;
    }

    @Override // o13.l
    public final boolean isInitialized() {
        return this._value != b0.f128566a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Rd\u0010\u0007\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo13/s$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lo13/s;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
