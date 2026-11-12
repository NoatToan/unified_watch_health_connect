package q42;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lq42/p;", "Lh82/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f142668f = 0;

    static {
        new a(null);
    }

    public static String m(int i14, p3.m mVar, int i15) {
        x1 x1Var = p3.n.f135158a;
        return new d53.k(j20.x.d(am.j.m("\\(", gl1.y.Q(mVar, R.string.lbl_kg), "\\)"), "|", am.j.m("\\(", gl1.y.Q(mVar, R.string.lbl_lbs), "\\)"), "|", am.j.m("\\(", gl1.y.Q(mVar, R.string.lbl_abbrev_stone), "\\)"))).f(gl1.y.Q(mVar, i14), "");
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-622725004, true, new m(this, 0)), 4, null), new h82.c.b("WEIGHT_ACTION", context.getString(R.string.lbl_body_weight), null, new z3.e(176849525, true, new m(this, 2)), 4, null), new h82.c.b("BMI_ACTION", context.getString(R.string.lbl_weight_characteristic_bmi), null, new z3.e(976424054, true, new m(this, 3)), 4, null), new h82.c.b("PERCENT_BODY_FAT_ACTION", context.getString(R.string.title_percent_body_fat), null, new z3.e(1775998583, true, new m(this, 4)), 4, null), new h82.c.b("PERCENT_BODY_WATER_ACTION", context.getString(R.string.title_percent_body_water), null, new z3.e(-1719394184, true, new m(this, 5)), 4, null), new h82.c.b("SKELETAL_MUSCLE_MASS_ACTION", context.getString(R.string.lbl_skeletal_muscle_mass), null, new z3.e(-919819655, true, new m(this, 6)), 4, null), new h82.c.b("BONE_MASS_ACTION", context.getString(R.string.lbl_weight_characteristic_bone_mass), null, new z3.e(-120245126, true, new m(this, 7)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-866491703);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            q42.a.f142593a.getClass();
            h82.e.a(q42.a.f142594b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 4);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-675421098);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            q42.a.f142593a.getClass();
            h82.e.a(q42.a.f142595c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 0);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-175010127);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(884536318, new pa0.b(this, 27), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 1);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(118442352);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-722420732, new m(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 2);
        }
    }

    public final void k(int i14, int i15, int i16, p3.m mVar) {
        int i17;
        o0 o0VarE = mVar.E(1921693239);
        int i18 = 2;
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= o0VarE.k(i15) ? 32 : 16;
        }
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(856850052, new ct1.f(i14, i15, i18), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.g(this, i14, i15, i16, 2);
        }
    }

    public final void l(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(903121547);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-208964712, new pa0.b(this, 28), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, i14, 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lq42/p$a;", "", "<init>", "()V", "", "WEIGHT_ACTION", "Ljava/lang/String;", "BMI_ACTION", "PERCENT_BODY_FAT_ACTION", "PERCENT_BODY_WATER_ACTION", "SKELETAL_MUSCLE_MASS_ACTION", "BONE_MASS_ACTION", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
