package z53;

import e23.l;
import e23.q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o53.f0;
import o53.j;
import o53.k;
import o53.n2;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.u;
import u53.x;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lz53/b;", "Lz53/e;", "Lz53/a;", "", "locked", "<init>", "(Z)V", "Lh53/b;", "", "owner", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b extends e implements z53.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f202554h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz53/b$a;", "Lo53/j;", "", "Lo53/n2;", "Lo53/k;", "cont", "", "owner", "<init>", "(Lz53/b;Lo53/k;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements j<Unit>, n2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k<Unit> f202555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f202556b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k<? super Unit> kVar, Object obj) {
            this.f202555a = kVar;
            this.f202556b = obj;
        }

        @Override // o53.j
        public final void B(Object obj) {
            this.f202555a.B(obj);
        }

        @Override // o53.j
        public final void F(z zVar, Unit unit) {
            this.f202555a.F(zVar, unit);
        }

        @Override // o53.j
        public final x G(Throwable th3) {
            return this.f202555a.G(th3);
        }

        @Override // o53.n2
        public final void b(u<?> uVar, int i14) {
            this.f202555a.b(uVar, i14);
        }

        @Override // o53.j
        public final boolean e() {
            return this.f202555a.e();
        }

        @Override // t13.d
        /* JADX INFO: renamed from: getContext */
        public final t13.g getF129302c() {
            return this.f202555a.f129362e;
        }

        @Override // o53.j
        public final boolean isActive() {
            return this.f202555a.isActive();
        }

        @Override // o53.j
        public final x o(Object obj, q qVar) {
            b bVar = b.this;
            yu1.h hVar = new yu1.h(3, bVar, this);
            x xVarD = this.f202555a.D((Unit) obj, hVar);
            if (xVarD != null) {
                b.f202554h.set(bVar, this.f202556b);
            }
            return xVarD;
        }

        @Override // o53.j
        public final void r(l<? super Throwable, Unit> lVar) {
            this.f202555a.r(lVar);
        }

        @Override // t13.d
        public final void resumeWith(Object obj) {
            this.f202555a.resumeWith(obj);
        }

        @Override // o53.j
        public final boolean u(Throwable th3) {
            return this.f202555a.u(th3);
        }

        @Override // o53.j
        public final void y(Object obj, q qVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f202554h;
            Object obj2 = this.f202556b;
            b bVar = b.this;
            atomicReferenceFieldUpdater.set(bVar, obj2);
            yt.f fVar = new yt.f(9, bVar, this);
            k<Unit> kVar = this.f202555a;
            kVar.A((Unit) obj, new kh0.d(fVar, 28), kVar.f129380c);
        }
    }

    public b(boolean z14) {
        super(1, z14 ? 1 : 0);
        this.owner$volatile = z14 ? null : c.f202558a;
    }

    @Override // z53.a
    public final boolean a() {
        return Math.max(e.f202563g.get(this), 0) == 0;
    }

    @Override // z53.a
    public final Object c(t13.d dVar) throws Throwable {
        if (f()) {
            return Unit.INSTANCE;
        }
        k kVarA = gg.b.A(u13.f.b(dVar));
        try {
            a aVar = new a(kVarA, null);
            while (true) {
                int andDecrement = e.f202563g.getAndDecrement(this);
                if (andDecrement <= this.f202564a) {
                    if (andDecrement > 0) {
                        aVar.y(Unit.INSTANCE, this.f202565b);
                        break;
                    }
                    if (d(aVar)) {
                        break;
                    }
                }
            }
            Object objP = kVarA.p();
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            if (objP != aVar2) {
                objP = Unit.INSTANCE;
            }
            return objP == aVar2 ? objP : Unit.INSTANCE;
        } catch (Throwable th3) {
            kVarA.z();
            throw th3;
        }
    }

    @Override // z53.a
    public final void e(Object obj) {
        while (a()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f202554h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            x xVar = c.f202558a;
            if (obj2 != xVar) {
                if (obj2 != obj && obj != null) {
                    l2.l(obj2, ", but ", obj, " is expected", "This mutex is locked by ");
                    return;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, xVar)) {
                        release();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        vb.h.z("This mutex is not locked");
    }

    public final boolean f() {
        int i14;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f202563g;
            int i15 = atomicIntegerFieldUpdater.get(this);
            int i16 = this.f202564a;
            if (i15 > i16) {
                do {
                    i14 = atomicIntegerFieldUpdater.get(this);
                    if (i14 <= i16) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, i16));
            } else {
                if (i15 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i15, i15 - 1)) {
                    f202554h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + f0.u(this) + "[isLocked=" + a() + ",owner=" + f202554h.get(this) + ']';
    }
}
