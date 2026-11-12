package z1;

import p005kotlin.Metadata;
import p008y1.o2;
import p008y1.t2;
import p008y1.t3;
import s1.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lz1/o;", "Ly1/t3;", "Lz1/t;", "snapLayoutInfoProvider", "Ls1/y;", "", "decayAnimationSpec", "Ls1/k;", "snapAnimationSpec", "<init>", "(Lz1/t;Ls1/y;Ls1/k;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f200854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y<Float> f200855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.k<Float> f200856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t2.a f200857d = t2.f193656c;

    public o(t tVar, y<Float> yVar, s1.k<Float> kVar) {
        this.f200854a = tVar;
        this.f200855b = yVar;
        this.f200856c = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object c(o oVar, o2 o2Var, float f14, float f15, k kVar, v13.c cVar) {
        n nVar;
        oVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f200853c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f200853c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(oVar, cVar);
            }
        } else {
            nVar = new n(oVar, cVar);
        }
        n nVar2 = nVar;
        Object objA = nVar2.f200851a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar2.f200853c;
        if (i15 == 0) {
            o13.r.b(objA);
            if (Math.abs(f14) == 0.0f || Math.abs(f15) == 0.0f) {
                return s1.v.a(f14, f15, 28);
            }
            nVar2.f200853c = 1;
            y<Float> yVar = oVar.f200855b;
            b cVar2 = Math.abs(s1.v.b(yVar, 0.0f, f15)) >= Math.abs(f14) ? new c(yVar) : new v(oVar.f200856c);
            float f16 = s.f200874a;
            objA = cVar2.a(o2Var, new Float(f14), new Float(f15), kVar, nVar2);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        return ((a) objA).f200824b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p008y1.t3
    public final Object b(o2 o2Var, float f14, e23.l lVar, v13.c cVar) throws Throwable {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f200850c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f200850c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objD = mVar.f200848a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f200850c;
        if (i15 == 0) {
            o13.r.b(objD);
            mVar.f200850c = 1;
            objD = d(o2Var, f14, lVar, mVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        a aVar = (a) objD;
        return new Float(((Number) aVar.f200823a).floatValue() != 0.0f ? ((Number) aVar.f200824b.a()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(o2 o2Var, float f14, e23.l lVar, v13.c cVar) throws Throwable {
        j jVar;
        e23.l lVar2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f200838d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f200838d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objE0 = jVar.f200836b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f200838d;
        if (i15 == 0) {
            o13.r.b(objE0);
            l lVar3 = new l(this, f14, lVar, o2Var, null);
            jVar.f200835a = lVar;
            jVar.f200838d = 1;
            objE0 = ge1.b.e0(this.f200857d, lVar3, jVar);
            if (objE0 == aVar) {
                return aVar;
            }
            lVar2 = lVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar2 = jVar.f200835a;
            o13.r.b(objE0);
        }
        a aVar2 = (a) objE0;
        lVar2.invoke(new Float(0.0f));
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (p005kotlin.jvm.internal.s.g(oVar.f200856c, this.f200856c) && p005kotlin.jvm.internal.s.g(oVar.f200855b, this.f200855b) && p005kotlin.jvm.internal.s.g(oVar.f200854a, this.f200854a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f200854a.hashCode() + ((this.f200855b.hashCode() + (this.f200856c.hashCode() * 31)) * 31);
    }
}
