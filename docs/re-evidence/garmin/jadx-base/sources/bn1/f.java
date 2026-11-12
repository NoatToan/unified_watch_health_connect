package bn1;

import c2.t2;
import c2.x2;
import e23.l;
import e23.p;
import f4.s;
import h4.r;
import l72.u1;
import li0.v0;
import o4.d0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f19050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19053f;

    public /* synthetic */ f(int i14, w13.a aVar, l lVar, float f14, s sVar) {
        this.f19048a = 3;
        this.f19051d = i14;
        this.f19052e = aVar;
        this.f19049b = lVar;
        this.f19050c = f14;
        this.f19053f = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f19048a;
        int i15 = this.f19051d;
        Object obj3 = this.f19053f;
        Object obj4 = this.f19049b;
        Object obj5 = this.f19052e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                ((h) obj5).b(this.f19050c, (String) obj4, (h4.d.b) obj3, (m) obj, p0.t(1 | i15));
                break;
            case 1:
                ((Integer) obj2).getClass();
                u1.d((t2) obj5, (d0) obj3, (String) obj4, this.f19050c, (m) obj, p0.t(3079), this.f19051d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                v0.a((s) obj5, this.f19050c, (li0.f) obj4, (r) obj3, (m) obj, p0.t(1 | i15));
                break;
            default:
                w13.a aVar = (w13.a) obj5;
                l lVar = (l) obj4;
                s sVar = (s) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    f2.b.C1415b c1415b = new f2.b.C1415b(i15);
                    r rVarD = x2.d(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97917b);
                    boolean zR = mVar.r(aVar) | mVar.B(lVar);
                    float f14 = this.f19050c;
                    boolean zI = zR | mVar.i(f14);
                    Object objQ = mVar.q();
                    if (zI) {
                        io0.a aVar2 = new io0.a(f14, 4, aVar, sVar, lVar);
                        mVar.K(aVar2);
                        objQ = aVar2;
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            io0.a aVar3 = new io0.a(f14, 4, aVar, sVar, lVar);
                            mVar.K(aVar3);
                            objQ = aVar3;
                        }
                    }
                    f2.j.a(c1415b, rVarY, null, null, null, null, null, false, null, (l) objQ, mVar, 0, 0, 1020);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(t2 t2Var, d0 d0Var, String str, float f14, int i14, int i15) {
        this.f19048a = 1;
        this.f19052e = t2Var;
        this.f19053f = d0Var;
        this.f19049b = str;
        this.f19050c = f14;
        this.f19051d = i15;
    }

    public /* synthetic */ f(Object obj, float f14, Object obj2, Object obj3, int i14, int i15) {
        this.f19048a = i15;
        this.f19052e = obj;
        this.f19050c = f14;
        this.f19049b = obj2;
        this.f19053f = obj3;
        this.f19051d = i14;
    }
}
