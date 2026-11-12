package aq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/y2;", "Lh82/c;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y2 extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f12312f = 0;

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1137751873, true, new w2(this, 0)), 4, null));
    }

    public final void g(long j8, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(1216646641);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.q.a(u1.n.e(l4.k.b(c2.x2.q(aVar, j92.b.f97899b.f97920e), k2.i.f102406a), j8, o4.m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x2(this, j8, i14, 0);
        }
    }

    public final void h(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1174743334);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(783776231, new w2(this, 1), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(this, i14, 3);
        }
    }
}
