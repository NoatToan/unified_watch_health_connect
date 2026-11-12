package l72;

import i3.mh;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll72/p;", "", "<init>", "()V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f111202a = new p();

    private p() {
    }

    public final void a(int i14, int i15, h4.r rVar, String str, p3.m mVar) {
        int i16;
        p3.o0 o0VarE = mVar.E(977306881);
        if ((i15 & 6) == 0) {
            i16 = i15 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i16 = i15;
        }
        int i17 = i16 | (o0VarE.B(this) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (i14 == 1) {
                o0VarE.C(-633815449);
                d92.b.f58623a.getClass();
                b(str, rVar, d92.b.a(o0VarE).k().c(), d92.b.a(o0VarE).e().e(), o0VarE, (i17 & 126) | ((i17 << 3) & 57344));
                o0VarE.g0(false);
            } else if (i14 == 2) {
                o0VarE.C(-633654683);
                d92.b.f58623a.getClass();
                b(str, rVar, d92.b.a(o0VarE).k().f63527d, d92.b.a(o0VarE).e().h(), o0VarE, (i17 & 126) | ((i17 << 3) & 57344));
                o0VarE.g0(false);
            } else if (i14 != 3) {
                o0VarE.C(-633352960);
                d92.b.f58623a.getClass();
                b(str, rVar, d92.b.a(o0VarE).k().c(), d92.b.a(o0VarE).c().b(), o0VarE, (i17 & 126) | ((i17 << 3) & 57344));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-633492150);
                b(str, rVar, ds.e0.d(d92.b.f58623a, o0VarE), d92.b.a(o0VarE).e().g(), o0VarE, (i17 & 126) | ((i17 << 3) & 57344));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(this, str, rVar, i14, i15, 16);
        }
    }

    public final void b(String str, h4.r rVar, long j8, long j14, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1091314902);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.l(j14) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarE = d92.c.e(j92.f.f97935l);
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarE = u1.n.e(rVar, j14, k2.i.a(16));
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            mh.c(str, c2.l.z(rVarE, j92.b.f97899b.f97918c, 2), j8, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, o0Var, i16 & 910, 0, 131064);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.x1(this, str, rVar, j8, j14, i14);
        }
    }
}
