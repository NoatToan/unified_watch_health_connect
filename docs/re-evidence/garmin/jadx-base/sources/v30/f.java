package v30;

import e23.p;
import h2.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv30/f;", "Lq82/b;", "Lm82/f;", "pagerState", "", "pageMultiplier", "Lq82/c;", "titleFormatter", "<init>", "(Lm82/f;ILq82/c;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements q82.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m82.f f175410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f175411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q82.c<Integer> f175412c;

    public f(m82.f fVar, int i14, q82.c<Integer> cVar) {
        fVar.getClass();
        cVar.getClass();
        this.f175410a = fVar;
        this.f175411b = i14;
        this.f175412c = cVar;
    }

    @Override // q82.b
    public final Object a(i iVar) {
        m82.f fVar = this.f175410a;
        j0 j0Var = fVar.f117196a;
        int iL = j0Var.l() + 1;
        if (iL < 0) {
            iL = j0Var.o() - 1;
        } else if (iL > j0Var.o() - 1) {
            iL = 0;
        }
        Object objW = j0.w(fVar.f117196a, iL >= 0 ? iL : 0, iVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objW != aVar) {
            objW = Unit.INSTANCE;
        }
        if (objW != aVar) {
            objW = Unit.INSTANCE;
        }
        return objW == aVar ? objW : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    @Override // q82.b
    public final p1 b(m mVar, int i14) {
        mVar.C(1338299984);
        x1 x1Var = n.f135158a;
        m82.f fVar = this.f175410a;
        j0 j0Var = fVar.f117196a;
        int iO = j0Var.o() / this.f175411b;
        Integer numValueOf = Integer.valueOf(j0Var.l() % iO);
        q82.c<Integer> cVar = this.f175412c;
        q82.b.a aVar = new q82.b.a(cVar.a(numValueOf), false, false);
        boolean zK = mVar.k(iO) | ((((i14 & 14) ^ 6) > 4 && mVar.B(this)) || (i14 & 6) == 4);
        Object objQ = mVar.q();
        if (zK) {
            objQ = new e(this, iO, null);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new e(this, iO, null);
                mVar.K(objQ);
            }
        }
        p1 p1VarP = p0.p(aVar, fVar, cVar, (p) objQ, mVar, 0);
        mVar.f();
        return p1VarP;
    }

    @Override // q82.b
    public final Object c(i iVar) {
        m82.f fVar = this.f175410a;
        j0 j0Var = fVar.f117196a;
        int iL = j0Var.l() - 1;
        if (iL < 0) {
            iL = j0Var.o() - 1;
        } else if (iL > j0Var.o() - 1) {
            iL = 0;
        }
        Object objW = j0.w(fVar.f117196a, iL >= 0 ? iL : 0, iVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objW != aVar) {
            objW = Unit.INSTANCE;
        }
        if (objW != aVar) {
            objW = Unit.INSTANCE;
        }
        return objW == aVar ? objW : Unit.INSTANCE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f175410a.equals(fVar.f175410a) && this.f175412c.equals(fVar.f175412c);
    }

    public final int hashCode() {
        return this.f175412c.hashCode() + (this.f175410a.f117196a.hashCode() * 31);
    }
}
