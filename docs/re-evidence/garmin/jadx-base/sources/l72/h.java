package l72;

import com.google.firebase.messaging.Constants;
import l6.m.b;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class h extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f111029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p007l6.m f111030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f111031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.a f111032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f111033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f111034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f111035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f111036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f111037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f111038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f111039k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p3.p1 p1Var, p007l6.m mVar, e23.a aVar, b92.a aVar2, String str, String str2, boolean z14, String str3, String str4, String str5, String str6) {
        super(2);
        this.f111029a = p1Var;
        this.f111030b = mVar;
        this.f111031c = aVar;
        this.f111032d = aVar2;
        this.f111033e = str;
        this.f111034f = str2;
        this.f111035g = z14;
        this.f111036h = str3;
        this.f111037i = str4;
        this.f111038j = str5;
        this.f111039k = str6;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        if ((num.intValue() & 3) == 2 && mVar2.b()) {
            mVar2.e();
        } else {
            p3.x1 x1Var = p3.n.f135158a;
            this.f111029a.setValue(Unit.INSTANCE);
            p007l6.m mVar3 = this.f111030b;
            mVar3.getClass();
            mVar3.c();
            mVar2.C(-742465321);
            l6.m.b bVar = mVar3.f110483b;
            if (bVar == null) {
                bVar = mVar3.new b();
                mVar3.f110483b = bVar;
            }
            p007l6.m mVar4 = p007l6.m.this;
            p007l6.e eVarB = mVar4.b();
            p007l6.e eVarB2 = mVar4.b();
            b92.a aVar = this.f111032d;
            boolean zB = mVar2.B(aVar);
            Object objQ = mVar2.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                if (aVar != null) {
                    objQ = l.k(aVar, Constants.ScionAnalytics.PARAM_LABEL, "label_secondary");
                } else {
                    objQ = null;
                }
                mVar2.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (aVar != null) {
                        objQ = l.k(aVar, Constants.ScionAnalytics.PARAM_LABEL, "label_secondary");
                    } else {
                        objQ = null;
                    }
                    mVar2.K(objQ);
                }
            }
            b92.a aVar3 = (b92.a) objQ;
            h4.r.a aVar4 = h4.r.S;
            boolean zB2 = mVar2.B(eVarB2);
            Object objQ2 = mVar2.q();
            if (zB2) {
                objQ2 = new i(eVarB2);
                mVar2.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i(eVarB2);
                    mVar2.K(objQ2);
                }
            }
            h4.r rVarA = p007l6.m.a(aVar4, eVarB, (e23.l) objQ2);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar2.getU());
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarA, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar5);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            l.j(0, aVar3, this.f111033e, this.f111034f, mVar2, this.f111035g);
            mVar2.y();
            boolean zB3 = mVar2.B(eVarB);
            Object objQ3 = mVar2.q();
            if (zB3) {
                objQ3 = new j(eVarB);
                mVar2.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new j(eVarB);
                    mVar2.K(objQ3);
                }
            }
            h4.r rVarA2 = p007l6.m.a(aVar4, eVarB2, (e23.l) objQ3);
            c2.j.f22691a.getClass();
            c2.t0.a(rVarA2, c2.j.f22693c, null, null, 0, 0, z3.f.c(1364742268, new k(this.f111032d, this.f111036h, this.f111037i, this.f111035g, this.f111038j, this.f111039k), mVar2), mVar2, 1572912, 60);
            mVar2.f();
        }
        return Unit.INSTANCE;
    }
}
