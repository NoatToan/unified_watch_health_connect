package x72;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.t1;
import lc.u0;
import o4.f0;
import p3.l0;
import p3.n2;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: x72.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3524a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f189433b;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.System.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.Dark.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f189432a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.RTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.System.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f189433b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    public static final void a(e eVar, d92.a aVar, d92.a aVar2, e23.p pVar, p3.m mVar, int i14) {
        d92.a aVarA;
        d92.a aVar3;
        d92.a aVarB;
        g6.o oVar;
        float f75992b;
        eVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(1188063444);
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2) | SyslogConstants.LOG_LOCAL2;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                aVarA = j92.a.a();
                aVarB = j92.a.b();
            } else {
                o0VarE.e();
                aVarA = aVar;
                aVarB = aVar2;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6046f;
            View view2 = (View) o0VarE.A(y3Var);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int i16 = C3524a.f189433b[eVar.f189453e.ordinal()];
            if (i16 == 1) {
                o0VarE.C(-732319849);
                o0VarE.g0(false);
                oVar = g6.o.Ltr;
            } else if (i16 == 2) {
                o0VarE.C(-732318281);
                o0VarE.g0(false);
                oVar = g6.o.Rtl;
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, -732322027, false);
                }
                o0VarE.C(-732316453);
                oVar = (g6.o) o0VarE.A(t1.f91496n);
                o0VarE.g0(false);
            }
            boolean zH = u1.n.h(o0VarE);
            int i17 = C3524a.f189432a[eVar.f189449a.ordinal()];
            if (i17 != 1) {
                if (i17 == 2) {
                    zH = false;
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return;
                    }
                    zH = true;
                }
            }
            d92.a aVar4 = zH ? aVarA : aVarB;
            gl.a aVarA2 = zH ? gl.d.a() : gl.d.b();
            Context context2 = ((View) o0VarE.A(y3Var)).getContext();
            context2.getClass();
            Activity activity = (Activity) context2;
            int iJ = f0.j(aVar4.c().c());
            Window window = activity.getWindow();
            if (window != null) {
                window.setStatusBarColor(iJ);
            }
            activity.getWindow().setNavigationBarColor(iJ);
            boolean zR = o0VarE.r(context) | o0VarE.r(view2) | o0VarE.h(zH);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zR) {
                objQ = new d92.d(context, view2, zH, 1);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d92.d(context, view2, zH, 1);
                    o0VarE.K(objQ);
                }
            }
            l0.i((e23.a) objQ, o0VarE);
            Object objQ2 = o0VarE.q();
            aVar5.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = d92.a.a(aVar4, null, 2047);
                o0VarE.K(objQ2);
            }
            d92.a aVar6 = (d92.a) objQ2;
            jg.b.S(aVar6, aVar4);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = gl.a.a(aVarA2);
                o0VarE.K(objQ3);
            }
            gl.a aVar7 = (gl.a) objQ3;
            gl.b.T(aVar7, aVarA2);
            n2 n2VarC = gl.d.f77768a.c(aVar7);
            n2 n2VarC2 = d92.c.f58627a.c(aVar6);
            n2 n2VarC3 = t1.f91496n.c(oVar);
            n2 n2VarC4 = d92.c.f58628b.c(Boolean.valueOf(zH));
            y3 y3Var2 = t1.f91490h;
            float f75991a = ((g6.c) o0VarE.A(y3Var2)).getF75991a();
            if (eVar.f189452d == c.System) {
                o0VarE.C(-1225383664);
                f75992b = ((g6.c) o0VarE.A(y3Var2)).getF75992b();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1225316673);
                o0VarE.g0(false);
                f75992b = eVar.f189451c;
            }
            v.b(new n2[]{n2VarC, n2VarC2, n2VarC3, n2VarC4, y3Var2.c(new g6.d(f75991a, f75992b))}, z3.f.c(-584659564, new oc.a(zH, pVar), o0VarE), o0VarE, 56);
            aVar3 = aVarB;
        } else {
            o0VarE.e();
            aVarA = aVar;
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(eVar, aVarA, aVar3, pVar, i14, 19);
        }
    }
}
