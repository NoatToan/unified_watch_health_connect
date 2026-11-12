package yt;

import c2.x2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class x implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p007l6.m f199403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p007l6.e f199404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g6.f f199405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f199406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<List<eu.g>> f199407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p<Integer, tt.m, Unit> f199408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f199409g;

    /* JADX WARN: Multi-variable type inference failed */
    public x(p007l6.m mVar, p007l6.e eVar, g6.f fVar, float f14, x3<? extends List<eu.g>> x3Var, e23.p<? super Integer, ? super tt.m, Unit> pVar, n nVar) {
        this.f199403a = mVar;
        this.f199404b = eVar;
        this.f199405c = fVar;
        this.f199406d = f14;
        this.f199407e = x3Var;
        this.f199408f = pVar;
        this.f199409g = nVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        g6.f fVarA;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = v.f199399a;
                mVar2.K(objQ);
            }
            this.f199403a.getClass();
            h4.r rVarA = p007l6.m.a(rVarF, this.f199404b, (e23.l) objQ);
            g6.f fVar = this.f199405c;
            if (fVar != null) {
                float f14 = fVar.f75997a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                fVarA = g6.f.a(f14 - j92.b.f97899b.f97921f);
            } else {
                fVarA = null;
            }
            g6.f fVar2 = fVarA;
            x3<List<eu.g>> x3Var = this.f199407e;
            List<eu.g> f182175a = x3Var.getF182175a();
            boolean zB = mVar2.B(x3Var);
            e23.p<Integer, tt.m, Unit> pVar = this.f199408f;
            boolean zB2 = zB | mVar2.B(pVar);
            n nVar = this.f199409g;
            boolean zR = zB2 | mVar2.r(nVar);
            Object objQ2 = mVar2.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new w(nVar, x3Var, pVar);
                mVar2.K(objQ2);
            }
            f0.a(rVarA, fVar2, this.f199406d, f182175a, (e23.l) objQ2, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
