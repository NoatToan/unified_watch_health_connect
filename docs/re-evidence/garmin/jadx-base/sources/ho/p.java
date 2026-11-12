package ho;

import am.e1;
import am.j1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.bc;
import i3.m4;
import i3.x3;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ho/p$a", "Li3/bc;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements bc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b63.z f84661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<eo.d> f84662b;

        public a(b63.z zVar, p1<eo.d> p1Var) {
            this.f84661a = zVar;
            this.f84662b = p1Var;
        }

        @Override // i3.bc
        public final boolean a(long j8) {
            e53.j.f63112c.getClass();
            b63.o oVarB = b63.b.e(e53.j.a.a(j8), this.f84661a).b();
            eo.d.f64761d.getClass();
            boolean z14 = oVarB.compareTo(eo.d.a.b().b()) <= 0;
            eo.d f182175a = this.f84662b.getF182175a();
            return z14 && (f182175a == null || oVarB.compareTo(f182175a.b()) >= 0);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ho/p$b", "Li3/bc;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements bc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b63.z f84663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<eo.d> f84664b;

        public b(b63.z zVar, p1<eo.d> p1Var) {
            this.f84663a = zVar;
            this.f84664b = p1Var;
        }

        @Override // i3.bc
        public final boolean a(long j8) {
            e53.j.f63112c.getClass();
            b63.o oVarB = b63.b.e(e53.j.a.a(j8), this.f84663a).b();
            eo.d.f64761d.getClass();
            boolean z14 = oVarB.compareTo(eo.d.a.b().b()) <= 0;
            eo.d f182175a = this.f84664b.getF182175a();
            return z14 && (f182175a == null || oVarB.compareTo(f182175a.b()) <= 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, eo.d dVar, eo.d dVar2, e23.p<? super eo.d, ? super eo.d, Unit> pVar, p3.m mVar, int i14) {
        p3.m.a.C2565a c2565a;
        Locale locale;
        p1 p1Var;
        p1 p1Var2;
        Object e1Var;
        p1 p1Var3;
        rVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(353843868);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.B(dVar2) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = hb2.h.a(context);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = hb2.h.a(context);
                    o0VarE.K(objQ);
                }
            }
            Locale locale2 = (Locale) objQ;
            b63.z.INSTANCE.getClass();
            b63.z zVarA = b63.z.Companion.a();
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ2 == c2565a2) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) objQ2;
            boolean z14 = (i15 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a2) {
                objQ3 = p0.n(dVar);
                o0VarE.K(objQ3);
            }
            p1 p1Var5 = (p1) objQ3;
            boolean z15 = (i15 & 896) == 256;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a2) {
                objQ4 = p0.n(dVar2);
                o0VarE.K(objQ4);
            }
            p1 p1Var6 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var7 = (p1) objQ5;
            boolean zB2 = o0VarE.B((eo.d) p1Var5.getF182175a()) | o0VarE.B((eo.d) p1Var6.getF182175a());
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == c2565a2) {
                objQ6 = new b(zVarA, p1Var6);
                o0VarE.K(objQ6);
            }
            b bVar = (b) objQ6;
            boolean zB3 = o0VarE.B((eo.d) p1Var5.getF182175a()) | o0VarE.B((eo.d) p1Var6.getF182175a());
            Object objQ7 = o0VarE.q();
            if (zB3 || objQ7 == c2565a2) {
                objQ7 = new a(zVarA, p1Var5);
                o0VarE.K(objQ7);
            }
            a aVar2 = (a) objQ7;
            p1 p1Var8 = p1Var6;
            p1 p1Var9 = p1Var5;
            m4 m4VarP = x3.p(dVar != null ? Long.valueOf(new b63.o(dVar.f64764c, dVar.f64763b, dVar.f64762a).f16206a.toEpochDay() * 86400000) : null, null, bVar, o0VarE, 0, 14);
            m4 m4VarP2 = x3.p(dVar2 != null ? Long.valueOf(new b63.o(dVar2.f64764c, dVar2.f64763b, dVar2.f64762a).f16206a.toEpochDay() * 86400000) : null, null, aVar2, o0VarE, 0, 14);
            if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                o0VarE.C(1515334728);
                if (((eo.e) p1Var4.getF182175a()) == eo.e.MINIMUM) {
                    m4VarP2 = m4VarP;
                }
                boolean zB4 = o0VarE.B(p1Var9) | o0VarE.B(p1Var8) | ((i15 & 7168) == 2048);
                Object objQ8 = o0VarE.q();
                if (zB4 || objQ8 == c2565a2) {
                    locale = locale2;
                    e1Var = new e1(pVar, p1Var4, p1Var9, p1Var8, p1Var7, 24);
                    p1Var3 = p1Var7;
                    p1Var = p1Var4;
                    o0VarE.K(e1Var);
                } else {
                    e1Var = objQ8;
                    locale = locale2;
                    p1Var = p1Var4;
                    p1Var3 = p1Var7;
                }
                e23.l lVar = (e23.l) e1Var;
                Object objQ9 = o0VarE.q();
                if (objQ9 == c2565a2) {
                    objQ9 = new j1(p1Var3, p1Var, 5);
                    o0VarE.K(objQ9);
                }
                c2565a = c2565a2;
                p1Var2 = p1Var3;
                vx.c.c(m4VarP2, null, lVar, null, (e23.a) objQ9, false, o0VarE, 24576, 42);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                p1Var8 = p1Var8;
                c2565a = c2565a2;
                locale = locale2;
                p1Var = p1Var4;
                p1Var2 = p1Var7;
                p1Var9 = p1Var9;
                o0VarE.C(1515978598);
                o0VarE.g0(false);
            }
            eo.d dVar3 = (eo.d) p1Var9.getF182175a();
            locale.getClass();
            String strC = io.a.c(dVar3, locale);
            String strC2 = io.a.c((eo.d) p1Var8.getF182175a(), locale);
            eo.d.f64761d.getClass();
            String strC3 = io.a.c(eo.d.a.b(), locale);
            String strC4 = io.a.c(eo.d.a.b(), locale);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_start);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_end);
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = new j1(p1Var2, p1Var, 6);
                o0VarE.K(objQ10);
            }
            e23.a aVar3 = (e23.a) objQ10;
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = new j1(p1Var2, p1Var, 7);
                o0VarE.K(objQ11);
            }
            o0 o0Var = o0VarE;
            go.e.b(rVar, strC, strC2, strC3, strC4, strQ, strQ2, null, null, aVar3, (e23.a) objQ11, o0Var, (i15 & 14) | 918552576, 0);
            o0VarE = o0Var;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(rVar, dVar, dVar2, pVar, i14, 14);
        }
    }
}
