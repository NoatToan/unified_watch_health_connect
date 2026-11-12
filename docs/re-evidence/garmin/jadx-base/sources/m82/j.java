package m82;

import e23.p;
import h2.j0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm82/j;", "Lq82/b;", "Lm82/f;", "pagerState", "Lq82/c;", "", "titleFormatter", "<init>", "(Lm82/f;Lq82/c;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements q82.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f117210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q82.c<Integer> f117211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f117212c;

    public j(f fVar, q82.c<Integer> cVar) {
        fVar.getClass();
        cVar.getClass();
        this.f117210a = fVar;
        this.f117211b = cVar;
        this.f117212c = p0.n(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q82.b
    public final Object a(v13.i iVar) {
        Object objD;
        return (!((Boolean) this.f117212c.getF182175a()).booleanValue() && (objD = d(this.f117210a.f117196a.l() + 1, iVar)) == u13.a.COROUTINE_SUSPENDED) ? objD : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    @Override // q82.b
    public final p1 b(m mVar, int i14) {
        mVar.C(695100344);
        x1 x1Var = n.f135158a;
        f fVar = this.f117210a;
        j0 j0Var = fVar.f117196a;
        Integer numValueOf = Integer.valueOf(j0Var.l());
        q82.c<Integer> cVar = this.f117211b;
        boolean z14 = true;
        q82.b.a aVar = new q82.b.a(cVar.a(numValueOf), !j0Var.e(), !j0Var.c());
        if ((((i14 & 14) ^ 6) <= 4 || !mVar.B(this)) && (i14 & 6) != 4) {
            z14 = false;
        }
        Object objQ = mVar.q();
        if (z14) {
            objQ = new i(this, null);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new i(this, null);
                mVar.K(objQ);
            }
        }
        p1 p1VarP = p0.p(aVar, fVar, cVar, (p) objQ, mVar, 0);
        mVar.f();
        return p1VarP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q82.b
    public final Object c(v13.i iVar) {
        Object objD;
        return (!((Boolean) this.f117212c.getF182175a()).booleanValue() && (objD = d(this.f117210a.f117196a.l() + (-1), iVar)) == u13.a.COROUTINE_SUSPENDED) ? objD : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i14, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i15 = gVar.f117199c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f117199c = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f117197a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = gVar.f117199c;
        c2 c2Var = this.f117212c;
        try {
            if (i16 == 0) {
                r.b(obj);
                c2Var.setValue(Boolean.TRUE);
                f fVar = this.f117210a;
                gVar.f117199c = 1;
                j0 j0Var = fVar.f117196a;
                if (i14 < 0) {
                    i14 = 0;
                }
                Object objG = j0.g(j0Var, i14, null, gVar, 6);
                if (objG != obj2) {
                    objG = Unit.INSTANCE;
                }
                if (objG == obj2) {
                    return obj2;
                }
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            c2Var.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            c2Var.setValue(Boolean.FALSE);
            throw th3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        j jVar = (j) obj;
        if (this.f117210a.equals(jVar.f117210a)) {
            return this.f117211b.equals(jVar.f117211b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f117211b.hashCode() + (this.f117210a.f117196a.hashCode() * 31);
    }
}
