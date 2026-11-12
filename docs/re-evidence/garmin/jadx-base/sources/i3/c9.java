package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class c9 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f87730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f87731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f87732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f87734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f87735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f87736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87737h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87738a;

        static {
            int[] iArr = new int[pc.values().length];
            try {
                iArr[pc.Expanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pc.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87738a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c9(mc mcVar, e23.a<Unit> aVar, o53.b0 b0Var, boolean z14, String str, String str2, String str3, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f87730a = mcVar;
        this.f87731b = aVar;
        this.f87732c = b0Var;
        this.f87733d = z14;
        this.f87734e = str;
        this.f87735f = str2;
        this.f87736g = str3;
        this.f87737h = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            mc mcVar = this.f87730a;
            boolean zB = mVar2.B(mcVar);
            e23.a<Unit> aVar2 = this.f87731b;
            boolean zB2 = zB | mVar2.B(aVar2);
            o53.b0 b0Var = this.f87732c;
            boolean zR = zB2 | mVar2.r(b0Var);
            Object objQ = mVar2.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new eu.b(mcVar, aVar2, b0Var);
                mVar2.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new eu.b(mcVar, aVar2, b0Var);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarC = u1.w.c(aVar, (e23.a) objQ);
            boolean zB3 = mVar2.B(mcVar) | mVar2.h(this.f87733d) | mVar2.B(this.f87734e) | mVar2.B(aVar2) | mVar2.B(this.f87735f) | mVar2.r(b0Var) | mVar2.B(this.f87736g);
            Object objQ2 = mVar2.q();
            if (zB3) {
                b21.z8 z8Var = new b21.z8(this.f87733d, this.f87730a, this.f87734e, this.f87735f, this.f87736g, this.f87731b, this.f87732c);
                mVar2.K(z8Var);
                objQ2 = z8Var;
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    b21.z8 z8Var2 = new b21.z8(this.f87733d, this.f87730a, this.f87734e, this.f87735f, this.f87736g, this.f87731b, this.f87732c);
                    mVar2.K(z8Var2);
                    objQ2 = z8Var2;
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ2, rVarC, true);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar4);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC3, mVar2);
            c2.u uVar = c2.u.f22885a;
            v.h.B(this.f87737h, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
