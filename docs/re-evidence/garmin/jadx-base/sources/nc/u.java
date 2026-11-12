package nc;

import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import p3.x3;
import s1.a1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class u implements e23.r<r1.l, lc.v, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1<lc.v> f125343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f125344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d4.c f125345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f125346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<List<lc.v>> f125347e;

    /* JADX WARN: Multi-variable type inference failed */
    public u(a1<lc.v> a1Var, lc.v vVar, d4.c cVar, p1<Boolean> p1Var, x3<? extends List<lc.v>> x3Var) {
        this.f125343a = a1Var;
        this.f125344b = vVar;
        this.f125345c = cVar;
        this.f125346d = p1Var;
        this.f125347e = x3Var;
    }

    @Override // e23.r
    public final Unit invoke(r1.l lVar, lc.v vVar, p3.m mVar, Integer num) {
        lc.v vVarPrevious;
        r1.l lVar2 = lVar;
        lc.v vVar2 = vVar;
        p3.m mVar2 = mVar;
        num.intValue();
        x1 x1Var = p3.n.f135158a;
        boolean zG = p005kotlin.jvm.internal.s.g(this.f125343a.f155463c.getF182175a(), this.f125344b);
        if (!this.f125346d.getF182175a().booleanValue() && !zG) {
            List<lc.v> f182175a = this.f125347e.getF182175a();
            ListIterator<lc.v> listIterator = f182175a.listIterator(f182175a.size());
            do {
                if (!listIterator.hasPrevious()) {
                    vVarPrevious = null;
                    break;
                }
                vVarPrevious = listIterator.previous();
            } while (!p005kotlin.jvm.internal.s.g(vVar2, vVarPrevious));
            vVar2 = vVarPrevious;
        }
        if (vVar2 == null) {
            mVar2.C(105930796);
        } else {
            mVar2.C(-1520603531);
            gl1.d.c(vVar2, this.f125345c, z3.f.c(-1263531443, new t(vVar2, lVar2), mVar2), mVar2, 384);
        }
        mVar2.f();
        x1 x1Var2 = p3.n.f135158a;
        return Unit.INSTANCE;
    }
}
