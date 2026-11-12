package j2;

import e23.q;
import h4.r;
import kotlin.k2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import p5.l;
import u1.b1;
import u1.f1;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements q<r, m, Integer, r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z0 f96515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f96516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f96517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f96518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f96519e;

        public a(z0 z0Var, boolean z14, boolean z15, l lVar, e23.a aVar) {
            this.f96515a = z0Var;
            this.f96516b = z14;
            this.f96517c = z15;
            this.f96518d = lVar;
            this.f96519e = aVar;
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
            r rVarThen = b1.a(r.S, jVar, this.f96515a).then(new j2.a(this.f96516b, jVar, null, false, this.f96517c, this.f96518d, this.f96519e, null));
            mVar2.f();
            return rVarThen;
        }
    }

    public static final r a(r rVar, boolean z14, a2.j jVar, z0 z0Var, boolean z15, l lVar, e23.a<Unit> aVar) {
        r rVarA;
        if (z0Var instanceof f1) {
            rVarA = new j2.a(z14, jVar, (f1) z0Var, false, z15, lVar, aVar, null);
        } else if (z0Var == null) {
            rVarA = new j2.a(z14, jVar, null, false, z15, lVar, aVar, null);
        } else if (jVar != null) {
            rVarA = b1.a(r.S, jVar, z0Var).then(new j2.a(z14, jVar, null, false, z15, lVar, aVar, null));
        } else {
            rVarA = h4.k.a(r.S, k2.f91249a, new a(z0Var, z14, z15, lVar, aVar));
        }
        return rVar.then(rVarA);
    }

    public static r b(r rVar, boolean z14, boolean z15, l lVar, e23.a aVar, int i14) {
        if ((i14 & 2) != 0) {
            z15 = true;
        }
        boolean z16 = z15;
        if ((i14 & 4) != 0) {
            lVar = null;
        }
        return rVar.then(new j2.a(z14, null, null, true, z16, lVar, aVar, null));
    }
}
