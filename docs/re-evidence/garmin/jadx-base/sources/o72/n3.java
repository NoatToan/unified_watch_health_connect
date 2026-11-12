package o72;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Metadata;
import p3.b4;
import v62.j8;
import v62.z4;

/* JADX INFO: loaded from: classes9.dex */
public final class n3 {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o72/n3$a", "Lb82/q1$a;", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements b82.q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f130503a;

        public a(Context context) {
            this.f130503a = context;
        }

        @Override // b82.q1.a
        public final void a() {
            n3.d(this.f130503a, "Comment");
        }

        @Override // b82.q1.a
        public final void b() {
            n3.d(this.f130503a, "Like");
        }

        @Override // b82.q1.a
        public final void c() {
            n3.d(this.f130503a, "Comment list");
        }

        @Override // b82.q1.a
        public final void d() {
            n3.d(this.f130503a, "Like list");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o72/n3$b", "Lb82/q1$a;", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements b82.q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f130504a;

        public b(Context context) {
            this.f130504a = context;
        }

        @Override // b82.q1.a
        public final void a() {
            n3.d(this.f130504a, "Comment");
        }

        @Override // b82.q1.a
        public final void b() {
            n3.d(this.f130504a, "Like");
        }

        @Override // b82.q1.a
        public final void c() {
            n3.d(this.f130504a, "Comment list");
        }

        @Override // b82.q1.a
        public final void d() {
            n3.d(this.f130504a, "Like list");
        }
    }

    public static final void a(String str, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-533132693);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            g6.f.a aVar = g6.f.f75994b;
            o0Var = o0VarE;
            mh.c(str, c2.l.z(h4.r.S, 16, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, 6, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h3(str, i14, 1);
        }
    }

    public static final void b(p3.m mVar, int i14) {
        p3.o0 o0Var;
        Integer numValueOf = Integer.valueOf(R.drawable.avatar);
        p3.o0 o0VarE = mVar.E(-742306863);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            a("Footer for user content that can be shared with other users.", o0VarE, 6);
            b82.q1 q1Var = b82.q1.f16749a;
            q1Var.a(null, p13.x.k(numValueOf, null, numValueOf), 8, 2, true, new a(context), o0VarE, 28032, 65);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            q1Var.a(null, null, 0, 0, false, new b(context), o0VarE, 0, 95);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            a("User review rating and associated meta data for activity locations.", o0VarE, 6);
            q1Var.c(null, null, "4.5 (25)", p13.x.k("Meta 1", "Meta 2"), o0VarE, 27696, 37);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            s62.a.f157643a.getClass();
            q1Var.c(null, j8.a(t62.b.f162798a), "Awaiting rating", null, o0VarE, 3120, 49);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c("Social headers", c2.l.z(aVar, f14, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 6, 0, 131068);
            o0Var = o0VarE;
            c(o0Var, 0);
            c2.l.f(c2.x2.h(aVar, f14), o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 28);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1852053376);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            i53.f fVarA = i53.a.a("Details", "Edit", "Remove");
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            b82.q1 q1Var = b82.q1.f16749a;
            s62.a.f157643a.getClass();
            t62.b bVar2 = t62.b.f162798a;
            q1Var.b(Integer.valueOf(R.drawable.avatar), v62.b.a(bVar2), null, z3.f.c(-1738655077, new m3(p1Var, fVarA), o0VarE), o0VarE, 1573296);
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            u4.d dVarA = v62.b.a(bVar2);
            f1.f130377a.getClass();
            q1Var.b(null, dVarA, null, f1.f130378b, o0VarE, 1573302);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            u4.d dVarA2 = v62.b.a(bVar2);
            u4.d dVarA3 = z4.a(bVar2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new i2(22);
                o0VarE.K(objQ2);
            }
            q1Var.d(dVarA2, dVarA3, null, (e23.a) objQ2, o0VarE, 1573248);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 29);
        }
    }

    public static final void d(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }
}
