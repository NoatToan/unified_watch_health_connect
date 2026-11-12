package t13;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lt13/i;", "T", "Lt13/d;", "Lv13/d;", "delegate", "", "initialResult", "<init>", "(Lt13/d;Ljava/lang/Object;)V", "(Lt13/d;)V", "result", "Ljava/lang/Object;", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i<T> implements d<T>, v13.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<i<?>, Object> f161749b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<T> f161750a;
    private volatile Object result;

    static {
        new a(null);
        f161749b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> dVar, Object obj) {
        dVar.getClass();
        this.f161750a = dVar;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        u13.a aVar = u13.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f161749b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return u13.a.COROUTINE_SUSPENDED;
        }
        if (obj == u13.a.RESUMED) {
            return u13.a.COROUTINE_SUSPENDED;
        }
        if (obj instanceof q.b) {
            throw ((q.b) obj).f128598a;
        }
        return obj;
    }

    @Override // v13.d
    public final v13.d getCallerFrame() {
        d<T> dVar = this.f161750a;
        if (dVar instanceof v13.d) {
            return (v13.d) dVar;
        }
        return null;
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public final g getF129302c() {
        return this.f161750a.getF129302c();
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            u13.a aVar = u13.a.UNDECIDED;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f161749b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            if (obj2 != aVar2) {
                vb.h.z("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater2 = f161749b;
            u13.a aVar3 = u13.a.RESUMED;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f161750a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f161750a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt13/i$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<? super T> dVar) {
        this(dVar, u13.a.UNDECIDED);
        dVar.getClass();
    }
}
