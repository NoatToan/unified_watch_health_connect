package xa1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.drawablepainter.DrawablePainter2Kt;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.List;
import o4.d0;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import w52.k0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxa1/b0;", "Lh82/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f189732f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-222389883, true, new x(this, 0)), 4, null), new h82.c.b("ABOUT_POWER_GUIDE_ACTION", context.getString(R.string.about_power_guide_help_title), null, new z3.e(-637716700, true, new x(this, 1)), 4, null), new h82.c.b("ABOUT_EFFORT_LEVEL_ACTION", context.getString(R.string.power_guide_effort_level_title), null, new z3.e(-1053043517, true, new x(this, 2)), 4, null), new h82.c.b("ABOUT_RIDING_POSITION_ACTION", context.getString(R.string.lbl_riding_position), null, new z3.e(-1468370334, true, new x(this, 3)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1174902144);
        int i15 = 4;
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(1322996563, new x(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, i14, 1);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1383714629);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            xa1.a.f189726a.getClass();
            h82.e.a(xa1.a.f189727b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, i14, 3);
        }
    }

    public final void i(Drawable drawable, String str, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1294378370);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(drawable) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar, f14, f14, f14, 0.0f, 8);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (drawable != null) {
                o0VarE.C(-1936728929);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                int iC = (int) c22.b.c(context, context.getResources().getDimensionPixelSize(R.dimen.icon_large), 1.5f);
                t4.d dVarRememberDrawablePainter = DrawablePainter2Kt.rememberDrawablePainter(drawable, o0VarE, i15 & 14);
                d0.f128823b.getClass();
                i7.a(dVarRememberDrawablePainter, null, x2.q(aVar, w02.b0.x(o0VarE, iC)), d0.f128832k, o0VarE, 3120, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1936201340);
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, c2.l.A(aVar, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, ((i15 >> 3) & 14) | 48, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(this, drawable, str, i14, 10);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-603322940);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-477874351, new x(this, 5), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, i14, 2);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2045062570);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(1748110742, new x(this, 6), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(this, i14, 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lxa1/b0$a;", "", "<init>", "()V", "", "ABOUT_POWER_GUIDE_ACTION", "Ljava/lang/String;", "ABOUT_EFFORT_LEVEL_ACTION", "ABOUT_RIDING_POSITION_ACTION", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
