package u1;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.k2;
import p008y1.e3;
import p3.p2;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final u a(float f14, long j8) {
        return new u(f14, new o4.t1(j8, null), null);
    }

    public static final void b(h4.r rVar, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-932836462);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.l.f(l4.k.d(rVar, lVar), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ht1.s(i14, lVar, rVar);
        }
    }

    public static final h4.r c(float f14, h4.r rVar, o4.w wVar, o4.r1 r1Var) {
        return rVar.then(new m(0L, wVar, f14, r1Var, k2.f91249a, 1, null));
    }

    public static h4.r d(h4.r rVar, o4.w wVar, o4.r1 r1Var, int i14) {
        if ((i14 & 2) != 0) {
            r1Var = o4.m1.f128891a;
        }
        return c(1.0f, rVar, wVar, r1Var);
    }

    public static final h4.r e(h4.r rVar, long j8, o4.r1 r1Var) {
        return rVar.then(new m(j8, null, 1.0f, r1Var, k2.f91249a, 2, null));
    }

    public static h4.r f(long j8, h4.r rVar) {
        return e(rVar, j8, o4.m1.f128891a);
    }

    public static final void g(p008y1.b2 b2Var, long j8) {
        if (b2Var == p008y1.b2.Vertical) {
            if (g6.a.i(j8) != Integer.MAX_VALUE) {
                return;
            }
            b2.e.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (g6.a.j(j8) != Integer.MAX_VALUE) {
                return;
            }
            b2.e.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final boolean h(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        return (((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a)).uiMode & 48) == 32;
    }

    public static final h4.r i(h4.r rVar, e3 e3Var, p008y1.b2 b2Var, r1 r1Var, boolean z14, p008y1.e1 e1Var, a2.k kVar, h2.l lVar) {
        float f14 = a0.f167346a;
        return rVar.then(b2Var == p008y1.b2.Vertical ? l4.k.b(h4.r.S, j2.f167578a) : l4.k.b(h4.r.S, s0.f167677a)).then(new e2(e3Var, b2Var, z14, false, e1Var, kVar, lVar, false, r1Var));
    }
}
