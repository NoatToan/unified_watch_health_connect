package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/f0;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f88041a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f88042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f88043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f88044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f88045e;

    static {
        n3.w0.f123292a.getClass();
        f88042b = n3.w0.f123298g;
        g6.f.a aVar = g6.f.f75994b;
        f88043c = 640;
        f88044d = 56;
        f88045e = 125;
    }

    private f0() {
    }

    public static c2.x1 b(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        int i14 = c2.k3.f22728a;
        c2.c3 c3VarB = c2.q3.b(mVar);
        c2.p3.f22815b.getClass();
        return c2.n3.d(c3VarB, c2.p3.f22823j | c2.p3.f22822i);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    public final void a(h4.r rVar, float f14, float f15, o4.r1 r1Var, long j8, p3.m mVar, int i14) {
        p3.o0 o0Var;
        h4.r rVar2;
        float f16;
        float f17;
        o4.r1 r1Var2;
        long j14;
        h4.r rVar3;
        float f18;
        long jE;
        o4.r1 r1Var3;
        p3.o0 o0VarE = mVar.E(-1364277227);
        int i15 = i14 | 9654;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = h4.r.S;
                n3.w0 w0Var = n3.w0.f123292a;
                w0Var.getClass();
                f16 = n3.w0.f123297f;
                w0Var.getClass();
                f18 = n3.w0.f123296e;
                s7.f89624a.getClass();
                k2.a aVar = s7.b(o0VarE).f87994e;
                w0Var.getClass();
                jE = k2.e(n3.w0.f123295d, o0VarE);
                r1Var3 = aVar;
            } else {
                o0VarE.e();
                rVar3 = rVar;
                f16 = f14;
                f18 = f15;
                r1Var3 = r1Var;
                jE = j8;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            int i17 = l3.n1.f109367b;
            String strH = l3.k.h(o0VarE, R.string.m3c_bottom_sheet_drag_handle_description);
            h4.r rVarA = c2.l.A(rVar3, 0.0f, kc.f88702a, 1);
            boolean zB = o0VarE.B(strH);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new i11.g(strH, i16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.g(strH, i16);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            ve.a(p5.v.c((e23.l) objQ, rVarA, false), r1Var3, jE, 0L, 0.0f, 0.0f, null, z3.f.c(-1039573072, new e0(f16, f18), o0VarE), o0Var, 12582912, 120);
            rVar2 = rVar3;
            f17 = f18;
            r1Var2 = r1Var3;
            j14 = jE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            f16 = f14;
            f17 = f15;
            r1Var2 = r1Var;
            j14 = j8;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.i1(this, rVar2, f16, f17, r1Var2, j14, i14, 1);
        }
    }
}
