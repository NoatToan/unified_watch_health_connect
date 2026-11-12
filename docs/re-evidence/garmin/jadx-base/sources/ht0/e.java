package ht0;

import am.a2;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e11.c0;
import f2.o;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lht0/e;", "Lh82/c;", "<init>", "()V", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f85518g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public vs0.a f85519f = new vs0.a(xs0.a.GENERIC, Double.NaN, Double.NaN, null, null, null, 56, null);

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1379510322);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            vs0.a aVar = (vs0.a) a2.c(bundle, "LACTATE_THRESHOLD_EXTRA");
            if (aVar == null) {
                aVar = new vs0.a(xs0.a.GENERIC, Double.NaN, Double.NaN, null, null, null, 56, null);
            }
            this.f85519f = aVar;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, bundle, i14, 21);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1908756026, true, new d(this, 0)), 4, null), new h82.c.b("READINGS_ACTION", context.getString(R.string.lbl_about_your_readings), null, new z3.e(1901266021, true, new d(this, 1)), 4, null), new h82.c.b("WHAT_IS_LT_ACTION", context.getString(R.string.lbl_what_is_lt), null, new z3.e(1416320772, true, new d(this, 2)), 4, null), new h82.c.b("MEASUREMENT_ACTION", context.getString(R.string.lbl_how_to_get_measurement), null, new z3.e(931375523, true, new d(this, 3)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-832724176);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            ht0.a.f85509a.getClass();
            h82.e.a(ht0.a.f85511c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(this, i14, 2);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(857166592);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new oi0.h(context);
                o0VarE.K(objQ);
            }
            h82.e.a(z3.f.c(-825850861, new c0(27, this, (oi0.h) objQ), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(this, i14, 1);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(141659722);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(280094774, new d(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(this, i14, 0);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1973860314);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            ht0.a.f85509a.getClass();
            h82.e.a(ht0.a.f85510b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(this, i14, 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lht0/e$a;", "", "<init>", "()V", "", "READINGS_ACTION", "Ljava/lang/String;", "WHAT_IS_LT_ACTION", "MEASUREMENT_ACTION", "LACTATE_THRESHOLD_EXTRA", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
