package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class w0 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f90050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f90051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f90052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f90053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f90054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f90055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90056g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90057a;

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
            f90057a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0(mc mcVar, o53.b0 b0Var, boolean z14, String str, String str2, String str3, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f90050a = mcVar;
        this.f90051b = b0Var;
        this.f90052c = z14;
        this.f90053d = str;
        this.f90054e = str2;
        this.f90055f = str3;
        this.f90056g = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            mc mcVar = this.f90050a;
            boolean zB = mVar2.B(mcVar);
            o53.b0 b0Var = this.f90051b;
            boolean zR = zB | mVar2.r(b0Var);
            Object objQ = mVar2.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new cn1.t(mcVar, b0Var, 15);
                mVar2.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cn1.t(mcVar, b0Var, 15);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarC = u1.w.c(aVar, (e23.a) objQ);
            boolean zB2 = mVar2.B(mcVar) | mVar2.h(this.f90052c) | mVar2.B(this.f90053d) | mVar2.r(b0Var) | mVar2.B(this.f90054e) | mVar2.B(this.f90055f);
            Object objQ2 = mVar2.q();
            if (zB2) {
                ds.e eVar = new ds.e(this.f90050a, this.f90052c, this.f90053d, this.f90054e, this.f90055f, this.f90051b, 3);
                mVar2.K(eVar);
                objQ2 = eVar;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    ds.e eVar2 = new ds.e(this.f90050a, this.f90052c, this.f90053d, this.f90054e, this.f90055f, this.f90051b, 3);
                    mVar2.K(eVar2);
                    objQ2 = eVar2;
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ2, rVarC, true);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
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
            v.h.B(this.f90056g, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
