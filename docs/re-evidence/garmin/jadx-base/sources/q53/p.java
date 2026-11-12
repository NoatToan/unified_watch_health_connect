package q53;

import kotlinx.coroutines.internal.UndeliveredElementException;
import o53.n2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lq53/p;", "E", "Lq53/b;", "", "capacity", "Lq53/a;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILq53/a;Le23/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p<E> extends b<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f143008m;

    public p(int i14, a aVar, e23.l<? super E, Unit> lVar) {
        super(i14, lVar);
        this.f143008m = aVar;
        if (aVar == a.SUSPEND) {
            androidx.core.view.j.s("This implementation does not support suspension for senders, use ", s0.f105811a.b(b.class).D(), " instead");
            throw null;
        }
        if (i14 >= 1) {
            return;
        }
        vb.h.x(e0.f(i14, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // q53.b
    public final boolean A() {
        return this.f143008m == a.DROP_OLDEST;
    }

    public final Object M(E e4, boolean z14) {
        e23.l<E, Unit> lVar;
        UndeliveredElementException undeliveredElementExceptionU;
        if (this.f143008m == a.DROP_LATEST) {
            Object objI = super.i(e4);
            m.b bVar = m.f142998b;
            if (!(objI instanceof m.c) || (objI instanceof m.a)) {
                return objI;
            }
            if (z14 && (lVar = this.f142959b) != null && (undeliveredElementExceptionU = og.a.u(lVar, e4, null)) != null) {
                throw undeliveredElementExceptionU;
            }
            m.b bVar2 = m.f142998b;
            Unit unit = Unit.INSTANCE;
            bVar2.getClass();
            return unit;
        }
        E e14 = e4;
        Object obj = h.f142978d;
        n nVar = (n) b.f142953h.get(this);
        while (true) {
            long andIncrement = b.f142949d.getAndIncrement(this);
            long j8 = 1152921504606846975L & andIncrement;
            boolean zY = y(andIncrement, false);
            int i14 = h.f142976b;
            long j14 = i14;
            long j15 = j8 / j14;
            int i15 = (int) (j8 % j14);
            if (nVar.f168771c != j15) {
                n nVarA = b.a(this, j15, nVar);
                if (nVarA != null) {
                    nVar = nVarA;
                } else if (zY) {
                    break;
                }
            }
            int iF = b.f(this, nVar, i15, e14, j8, obj, zY);
            if (iF == 0) {
                nVar.b();
                m.b bVar3 = m.f142998b;
                Unit unit2 = Unit.INSTANCE;
                bVar3.getClass();
                return unit2;
            }
            if (iF == 1) {
                m.b bVar4 = m.f142998b;
                Unit unit3 = Unit.INSTANCE;
                bVar4.getClass();
                return unit3;
            }
            if (iF == 2) {
                if (zY) {
                    nVar.i();
                    break;
                }
                n2 n2Var = obj instanceof n2 ? (n2) obj : null;
                if (n2Var != null) {
                    n2Var.b(nVar, i15 + i14);
                }
                p((nVar.f168771c * j14) + ((long) i15));
                m.b bVar5 = m.f142998b;
                Unit unit4 = Unit.INSTANCE;
                bVar5.getClass();
                return unit4;
            }
            if (iF == 3) {
                vb.h.z("unexpected");
                return null;
            }
            if (iF == 4) {
                if (j8 >= b.f142950e.get(this)) {
                    break;
                }
                nVar.b();
                break;
            }
            if (iF == 5) {
                nVar.b();
            }
            e14 = e4;
        }
        m.b bVar6 = m.f142998b;
        Throwable thV = v();
        bVar6.getClass();
        return m.b.a(thV);
    }

    @Override // q53.b, q53.w
    public final Object h(E e4, t13.d<? super Unit> dVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionU;
        if (!(M(e4, true) instanceof m.a)) {
            return Unit.INSTANCE;
        }
        m.b bVar = m.f142998b;
        e23.l<E, Unit> lVar = this.f142959b;
        if (lVar == null || (undeliveredElementExceptionU = og.a.u(lVar, e4, null)) == null) {
            throw v();
        }
        o13.g.a(undeliveredElementExceptionU, v());
        throw undeliveredElementExceptionU;
    }

    @Override // q53.b, q53.w
    public final Object i(E e4) {
        return M(e4, false);
    }

    public /* synthetic */ p(int i14, a aVar, e23.l lVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, aVar, (i15 & 4) != 0 ? null : lVar);
    }
}
