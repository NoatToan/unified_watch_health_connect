package n82;

import b63.o;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln82/n;", "Lq82/b;", "Ln82/f;", "datePagerState", "Lq82/c;", "Ln82/d;", "titleFormatter", "<init>", "(Ln82/f;Lq82/c;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements q82.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f124981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q82.c<d> f124982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f124983c;

    public n(f fVar, q82.c<d> cVar) {
        fVar.getClass();
        cVar.getClass();
        this.f124981a = fVar;
        this.f124982b = cVar;
        this.f124983c = p0.n(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q82.b
    public final Object a(v13.i iVar) {
        if (((Boolean) this.f124983c.getF182175a()).booleanValue()) {
            return Unit.INSTANCE;
        }
        f fVar = this.f124981a;
        Object objD = d(fVar.f124961b.a().f130862a.c(fVar.b()).f130843a, iVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    @Override // q82.b
    public final p1 b(p3.m mVar, int i14) {
        mVar.C(889040556);
        x1 x1Var = p3.n.f135158a;
        f fVar = this.f124981a;
        d dVar = new d(fVar.b(), fVar.f124961b.a());
        q82.c<d> cVar = this.f124982b;
        String strA = cVar.a(dVar);
        m82.f fVar2 = fVar.f124960a;
        boolean z14 = true;
        q82.b.a aVar = new q82.b.a(strA, !fVar2.f117196a.e(), !fVar2.f117196a.c());
        if ((((i14 & 14) ^ 6) <= 4 || !mVar.B(this)) && (i14 & 6) != 4) {
            z14 = false;
        }
        Object objQ = mVar.q();
        if (z14) {
            objQ = new m(this, null);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new m(this, null);
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
        if (((Boolean) this.f124983c.getF182175a()).booleanValue()) {
            return Unit.INSTANCE;
        }
        f fVar = this.f124981a;
        Object objD = d(fVar.f124961b.a().f130862a.d(fVar.b()).f130843a, iVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(o oVar, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f124971c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f124971c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f124969a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f124971c;
        c2 c2Var = this.f124983c;
        try {
            if (i15 == 0) {
                r.b(obj);
                c2Var.setValue(Boolean.TRUE);
                f fVar = this.f124981a;
                kVar.f124971c = 1;
                if (fVar.a(oVar, kVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
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
        if (!n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        n nVar = (n) obj;
        if (this.f124981a.equals(nVar.f124981a)) {
            return this.f124982b.equals(nVar.f124982b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f124982b.hashCode() + (this.f124981a.hashCode() * 31);
    }
}
