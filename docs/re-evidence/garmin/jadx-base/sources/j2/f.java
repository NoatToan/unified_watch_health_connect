package j2;

import e23.q;
import h4.r;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;
import p5.l;
import u1.b1;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class f implements q<r, m, Integer, r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f96532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r5.a f96533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f96534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f96535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f96536e;

    public f(z0 z0Var, r5.a aVar, boolean z14, l lVar, e23.a aVar2) {
        this.f96532a = z0Var;
        this.f96533b = aVar;
        this.f96534c = z14;
        this.f96535d = lVar;
        this.f96536e = aVar2;
    }

    @Override // e23.q
    public final r invoke(r rVar, m mVar, Integer num) {
        m mVar2 = mVar;
        num.intValue();
        mVar2.C(-1525724089);
        x1 x1Var = n.f135158a;
        Object objQ = mVar2.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = tn.k.c(mVar2);
        }
        a2.j jVar = (a2.j) objQ;
        r rVarThen = b1.a(r.S, jVar, this.f96532a).then(new j(this.f96533b, jVar, null, false, this.f96534c, this.f96535d, this.f96536e, null));
        mVar2.f();
        return rVarThen;
    }
}
