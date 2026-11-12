package g51;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg51/f;", "Lh82/c;", "<init>", "()V", "a", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f75946f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1701216203, true, new b(this, 0)), 4, null), new h82.c.b("ABOUT_PACEPRO_ACTION", context.getString(R.string.pacepro_lbl_about), null, new z3.e(1464598378, true, new b(this, 2)), 4, null), new h82.c.b("PACING_STRATEGY_ACTION", context.getString(R.string.pacepro_lbl_pacing_strategy), null, new z3.e(1227980553, true, new b(this, 3)), 4, null), new h82.c.b("UPHILL_EFFORT_ACTION", context.getString(R.string.pacepro_lbl_uphill_effort), null, new z3.e(991362728, true, new b(this, 4)), 4, null), new h82.c.b("PACE_INTENSITY_ACTION", context.getString(R.string.pacepro_lbl_pace_intensity), null, new z3.e(754744903, true, new b(this, 5)), 4, null), new h82.c.b("ELEVATION_SENSITIVITY_ACTION", context.getString(R.string.pacepro_elevation_based_splits), null, new z3.e(518127078, true, new b(this, 6)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1249051962);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-1281237607, new b(this, 1), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 2);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-885381395);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            g51.a.f75932a.getClass();
            h82.e.a(g51.a.f75936e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 5);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(-720803698);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(1659438882, new b(this, 7), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 0);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1338935517);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            g51.a.f75932a.getClass();
            h82.e.a(g51.a.f75935d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 1);
        }
    }

    public final void k(m mVar, int i14) {
        o0 o0VarE = mVar.E(980893048);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            g51.a.f75932a.getClass();
            h82.e.a(g51.a.f75933b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 3);
        }
    }

    public final void l(m mVar, int i14) {
        o0 o0VarE = mVar.E(-331528707);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            g51.a.f75932a.getClass();
            h82.e.a(g51.a.f75934c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lg51/f$a;", "", "<init>", "()V", "", "ABOUT_PACEPRO_ACTION", "Ljava/lang/String;", "PACING_STRATEGY_ACTION", "UPHILL_EFFORT_ACTION", "PACE_INTENSITY_ACTION", "ELEVATION_SENSITIVITY_ACTION", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
