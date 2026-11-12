package u1;

import android.view.KeyEvent;
import kotlin.k2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.q<h4.r, p3.m, Integer, h4.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z0 f167698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f167699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f167700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p5.l f167701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f167702e;

        public a(z0 z0Var, boolean z14, String str, p5.l lVar, e23.a aVar) {
            this.f167698a = z0Var;
            this.f167699b = z14;
            this.f167700c = str;
            this.f167701d = lVar;
            this.f167702e = aVar;
        }

        @Override // e23.q
        public final h4.r invoke(h4.r rVar, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            num.intValue();
            mVar2.C(-1525724089);
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = tn.k.c(mVar2);
            }
            a2.j jVar = (a2.j) objQ;
            h4.r rVarThen = b1.a(h4.r.S, jVar, this.f167698a).then(new v(jVar, null, false, this.f167699b, this.f167700c, this.f167701d, this.f167702e, null));
            mVar2.f();
            return rVarThen;
        }
    }

    public static final h4.r a(h4.r rVar, a2.j jVar, z0 z0Var, boolean z14, String str, p5.l lVar, e23.a<Unit> aVar) {
        h4.r rVarA;
        if (z0Var instanceof f1) {
            rVarA = new v(jVar, (f1) z0Var, false, z14, str, lVar, aVar, null);
        } else if (z0Var == null) {
            rVarA = new v(jVar, null, false, z14, str, lVar, aVar, null);
        } else if (jVar != null) {
            rVarA = b1.a(h4.r.S, jVar, z0Var).then(new v(jVar, null, false, z14, str, lVar, aVar, null));
        } else {
            rVarA = h4.k.a(h4.r.S, k2.f91249a, new a(z0Var, z14, str, lVar, aVar));
        }
        return rVar.then(rVarA);
    }

    public static /* synthetic */ h4.r b(h4.r rVar, a2.j jVar, f1 f1Var, boolean z14, String str, p5.l lVar, e23.a aVar, int i14) {
        if ((i14 & 4) != 0) {
            z14 = true;
        }
        return a(rVar, jVar, f1Var, z14, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : lVar, aVar);
    }

    public static h4.r c(h4.r rVar, e23.a aVar) {
        return h4.k.a(rVar, k2.f91249a, new ak0.p(aVar, 22));
    }

    public static h4.r d(h4.r rVar, boolean z14, String str, p5.l lVar, e23.a aVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = true;
        }
        return rVar.then(new v(null, null, true, z14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : lVar, aVar, null));
    }

    public static h4.r e(h4.r rVar, a2.j jVar, e23.a aVar) {
        return rVar.then(new b0(jVar, null, false, true, null, null, aVar, null, null, null, true, null));
    }

    public static h4.r f(int i14, e23.a aVar, e23.a aVar2, h4.r rVar, String str, boolean z14) {
        return rVar.then(new b0(null, null, true, (i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? null : str, null, aVar2, null, (i14 & 16) != 0 ? null : aVar, null, true, null));
    }

    public static final boolean g(KeyEvent keyEvent) {
        long jA = z4.d.a(keyEvent);
        z4.a.C3769a c3769a = z4.a.f202280b;
        c3769a.getClass();
        if (z4.a.a(jA, z4.a.f202288j)) {
            return true;
        }
        c3769a.getClass();
        if (z4.a.a(jA, z4.a.f202298t)) {
            return true;
        }
        c3769a.getClass();
        if (z4.a.a(jA, z4.a.G)) {
            return true;
        }
        c3769a.getClass();
        return z4.a.a(jA, z4.a.f202297s);
    }
}
