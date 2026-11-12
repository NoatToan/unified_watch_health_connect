package a3;

import p005kotlin.Metadata;
import p3.x1;
import s1.e2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La3/b0;", "La3/p;", "Lg6/f;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFFLkotlin/jvm/internal/j;)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f621e;

    private b0(float f14, float f15, float f16, float f17, float f18) {
        this.f617a = f14;
        this.f618b = f15;
        this.f619c = f16;
        this.f620d = f17;
        this.f621e = f18;
    }

    @Override // a3.p
    public final s1.m a(boolean z14, a2.j jVar, p3.m mVar, int i14) {
        float f14;
        s1.b bVar;
        mVar.C(-1588756907);
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        Object obj = p3.m.a.f135155b;
        if (objQ == obj) {
            objQ = new f4.s();
            mVar.K(objQ);
        }
        f4.s sVar = (f4.s) objQ;
        boolean z15 = true;
        boolean z16 = (((i14 & 112) ^ 48) > 32 && mVar.B(jVar)) || (i14 & 48) == 32;
        Object objQ2 = mVar.q();
        if (z16 || objQ2 == obj) {
            objQ2 = new z(jVar, sVar, null);
            mVar.K(objQ2);
        }
        p3.l0.e((e23.p) objQ2, jVar, mVar);
        a2.h hVar = (a2.h) p13.h0.n0(sVar);
        if (!z14) {
            f14 = this.f619c;
        } else if (hVar instanceof a2.l.b) {
            f14 = this.f618b;
        } else if (hVar instanceof a2.e) {
            f14 = this.f620d;
        } else {
            f14 = hVar instanceof a2.b ? this.f621e : this.f617a;
        }
        Object objQ3 = mVar.q();
        if (objQ3 == obj) {
            Object bVar2 = new s1.b(g6.f.a(f14), e2.f155570c, null, null, 12, null);
            mVar.K(bVar2);
            objQ3 = bVar2;
        }
        s1.b bVar3 = (s1.b) objQ3;
        g6.f fVarA = g6.f.a(f14);
        boolean zR = mVar.r(bVar3) | mVar.i(f14) | ((((i14 & 14) ^ 6) > 4 && mVar.h(z14)) || (i14 & 6) == 4);
        if ((((i14 & 896) ^ 384) <= 256 || !mVar.B(this)) && (i14 & 384) != 256) {
            z15 = false;
        }
        boolean zR2 = zR | z15 | mVar.r(hVar);
        Object objQ4 = mVar.q();
        if (zR2 || objQ4 == obj) {
            bVar = bVar3;
            Object a0Var = new a0(bVar, f14, z14, this, hVar, null);
            mVar.K(a0Var);
            objQ4 = a0Var;
        } else {
            bVar = bVar3;
        }
        p3.l0.e((e23.p) objQ4, fVarA, mVar);
        s1.m<T, V> mVar2 = bVar.f155489c;
        mVar.f();
        return mVar2;
    }

    public /* synthetic */ b0(float f14, float f15, float f16, float f17, float f18, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, f18);
    }
}
