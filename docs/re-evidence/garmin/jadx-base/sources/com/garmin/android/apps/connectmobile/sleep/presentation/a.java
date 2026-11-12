package com.garmin.android.apps.connectmobile.sleep.presentation;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g6.f;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import i3.n8;
import java.util.List;
import m63.m1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;
import rk0.a1;
import rx1.u;
import s5.x0;
import sg0.q0;
import sm1.g;
import sm1.i;
import v.h;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/a;", "Lh82/c;", "<init>", "()V", "b", "d", "a", "Lhc1/b;", "pulseOxSupportedDevice", "Lql1/a;", "sleepEducationalContent", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f44253g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f44254f = new b(false, false, false, false, (d) null, 31, (j) null);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/sleep/presentation/a$c", "Lbc1/b;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements bc1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<hc1.b> f44261a;

        public c(p1<hc1.b> p1Var) {
            this.f44261a = p1Var;
        }

        @Override // bc1.b
        public final void a(hc1.b bVar) {
            int i14 = a.f44253g;
            this.f44261a.setValue(bVar);
        }
    }

    static {
        new C0831a(null);
    }

    public static String v(Context context, String str) {
        oi0.b bVar = new oi0.b(new l22.a(context), str);
        bVar.p();
        return bVar.f132238b;
    }

    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        Parcelable parcelable;
        o0 o0VarE = mVar.E(-1852671455);
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
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("EXTRA_DATA", b.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("EXTRA_DATA");
                if (!(parcelable2 instanceof b)) {
                    parcelable2 = null;
                }
                parcelable = (b) parcelable2;
            }
            b bVar = (b) parcelable;
            if (bVar != null) {
                this.f44254f = bVar;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(this, bundle, i14, 3);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", u(context, "DEFAULT_ACTION"), null, new e(-1004836952, true, new g(this, 0)), 4, null), new h82.c.b("SLEEP_SCORE_ACTION", u(context, "SLEEP_SCORE_ACTION"), null, new e(-426070807, true, new g(this, 1)), 4, null), new h82.c.b("SLEEP_COACH_ACTION", u(context, "SLEEP_COACH_ACTION"), null, new e(152695338, true, new g(this, 2)), 4, null), new h82.c.b("SLEEP_TIMELINE_METRICS_ACTION", u(context, "SLEEP_TIMELINE_METRICS_ACTION"), null, new e(731461483, true, new g(this, 3)), 4, null), new h82.c.b("SLEEP_ALIGNMENT_ACTION", u(context, "SLEEP_ALIGNMENT_ACTION"), null, new e(1310227628, true, new g(this, 4)), 4, null), new h82.c.b("SLEEP_STAGES_ACTION", u(context, "SLEEP_STAGES_ACTION"), null, new e(1888993773, true, new g(this, 5)), 4, null), new h82.c.b("SLEEP_TRACKING_ACTION", u(context, "SLEEP_TRACKING_ACTION"), null, new e(-1827207378, true, new g(this, 6)), 4, null), new h82.c.b("DATA_ACCURACY_ACTION", u(context, "DATA_ACCURACY_ACTION"), null, new e(-1248441233, true, new g(this, 7)), 4, null));
    }

    public final void g(String str, String str2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -296224145);
        int i15 = i14 | (o0VarK.B(str) ? 4 : 2) | (o0VarK.B(str2) ? 32 : 16);
        if (o0VarK.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            float f14 = 16;
            f.a aVar2 = f.f75994b;
            r rVarA = l.A(aVar, f14, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarK, 0);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            r rVarC = k.c(rVarA, o0VarK);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarK.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar3);
            } else {
                o0VarK.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarK);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarK);
            u2 u2Var = u2.f22900a;
            j92.f.f97924a.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarK), o0VarK, i15 & 14, 0, 131070);
            mh.c(str2, l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarK), o0VarK, ((i15 >> 3) & 14) | 48, 0, 131068);
            o0Var = o0VarK;
            o0Var.g0(true);
        } else {
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(this, str, str2, i14, 15);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1446574145);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(-720466005, new sm1.h(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), 6), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, 10);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1198353562);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(-472245422, new sm1.h(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), 3), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, 7);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1160655484);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(844565104, new sm1.h(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, 8);
        }
    }

    public final void k(m mVar, int i14) {
        o0 o0VarE = mVar.E(-711488349);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(1779029559, new sm1.h(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), 5), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, 9);
        }
    }

    public final void l(m mVar, int i14) {
        o0 o0VarE = mVar.E(-530810433);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-1642896692, new sm1.h(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, i16);
        }
    }

    public final void m(m mVar, int i14) {
        o0 o0VarE = mVar.E(1606743817);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            b bVar = this.f44254f;
            boolean z14 = bVar.f44255a;
            boolean z15 = bVar.f44256b;
            if (z14 && z15) {
                o0VarE.C(-2107412578);
                k(o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else if (z14 && !z15) {
                o0VarE.C(-2107406587);
                i(o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else if (bVar.f44259e.f44264c) {
                o0VarE.C(-2107400825);
                j(o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2107395803);
                h(o0VarE, i15 & 14);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, 5);
        }
    }

    public final void n(m mVar, int i14) {
        o0 o0VarE = mVar.E(140429503);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-924413684, new ry0.g(11, this, new u00.a(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)))), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, i15);
        }
    }

    public final void o(m mVar, int i14) {
        o0 o0VarE = mVar.E(1244358599);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(179515412, new sm1.h(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, i16);
        }
    }

    public final void p(m mVar, int i14) {
        o0 o0VarE = mVar.E(476582260);
        int i15 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(1826181831, new sm1.h(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, i15);
        }
    }

    public final void q(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1265408745);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 6;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(751497508, new g(this, 8), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, i16);
        }
    }

    public final void r(ql1.b bVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1212708968);
        int i15 = i14 | 2 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(ql1.b.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    bVar = (ql1.b) u1VarResolveViewModel;
                }
            } else {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(589647675, new ry0.g(12, this, s9.c.c(bVar.f145234d, o0VarE)), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(this, bVar, i14, 25);
        }
    }

    public final void s(m mVar, int i14) {
        o0 o0VarE = mVar.E(-109726025);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            sm1.b.f160103a.getClass();
            h82.e.a(sm1.b.f160104b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0146  */
    public final void t(String str, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-384265648);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = ((i15 & 14) == 4) | o0VarE.r(context) | o0VarE.r(this);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new sg0.j(context, 7, this, str);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new sg0.j(context, 7, this, str);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            String strQ = y.Q(o0VarE, R.string.lbl_shop_now_period);
            r.a aVar3 = r.S;
            boolean zB = o0VarE.B(strQ) | o0VarE.B(aVar2);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new n8(strQ, aVar2, i16);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new n8(strQ, aVar2, i16);
                    o0VarE.K(objQ2);
                }
            }
            r rVarC = v.c((e23.l) objQ2, aVar3, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(-126305760);
            h82.r rVar = h82.r.f82497a;
            rVar.t(R.string.lbl_start_tracking_sleep, o0VarE, 0);
            rVar.o(R.string.msg_start_tracking_sleep_desc_1, 0, 2, null, o0VarE);
            o0VarE.C(-126299147);
            String str2 = y.Q(o0VarE, R.string.msg_start_tracking_sleep_desc_2) + " <link>" + strQ + "</link>";
            o0VarE.g0(false);
            boolean zB2 = o0VarE.B(aVar2);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                objQ3 = new q0(aVar2, 19);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new q0(aVar2, 19);
                    o0VarE.K(objQ3);
                }
            }
            rVar.w(str2, null, (e23.a) objQ3, o0VarE, 0, 2);
            o0Var = o0VarE;
            o0Var.g0(false);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(this, str, false, i14, 24);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String u(Context context, String str) {
        l22.a aVar = new l22.a(context);
        switch (str.hashCode()) {
            case -1688173320:
                if (str.equals("SLEEP_STAGES_ACTION")) {
                    b bVar = this.f44254f;
                    return (bVar.f44255a || bVar.f44259e.f44264c) ? aVar.getString(R.string.lbl_sleep_stages) : aVar.getString(R.string.lbl_about_sleep_levels);
                }
                break;
            case -532391389:
                if (str.equals("SLEEP_COACH_ACTION")) {
                    return aVar.getString(R.string.lbl_sleep_coach);
                }
                break;
            case -296357066:
                if (str.equals("SLEEP_TRACKING_ACTION")) {
                    return aVar.getString(R.string.lbl_tracking_your_sleep);
                }
                break;
            case 246683047:
                if (str.equals("DATA_ACCURACY_ACTION")) {
                    return aVar.getString(R.string.lbl_ensure_data_accuracy);
                }
                break;
            case 342162312:
                if (str.equals("SLEEP_TIMELINE_METRICS_ACTION")) {
                    return this.f44254f.f44255a ? aVar.getString(R.string.lbl_sleep_timeline) : aVar.getString(R.string.lbl_sleep_timeline_metrics);
                }
                break;
            case 889813291:
                if (str.equals("SLEEP_SCORE_ACTION")) {
                    return this.f44254f.f44256b ? aVar.getString(R.string.lbl_sleep_score) : aVar.getString(R.string.lbl_sleep_score_factors);
                }
                break;
            case 1716935866:
                if (str.equals("SLEEP_ALIGNMENT_ACTION")) {
                    return aVar.getString(R.string.lbl_sleep_alignment);
                }
                break;
            case 2074580500:
                if (str.equals("DEFAULT_ACTION")) {
                    return aVar.getString(R.string.lbl_help);
                }
                break;
        }
        return aVar.getString(R.string.lbl_help);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$b;", "Landroid/os/Parcelable;", "", "showSleepScore", "showSleepNeed", "showPerformanceDevice", "showManagedDevicePriority", "Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$d;", "supportedFeatures", "<init>", "(ZZZZLcom/garmin/android/apps/connectmobile/sleep/presentation/a$d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZZZZLcom/garmin/android/apps/connectmobile/sleep/presentation/a$d;Lm63/u1;)V", "Companion", "a", "b", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f44255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f44256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f44257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f44258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f44259e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<b> CREATOR = new c();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.sleep.presentation.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/sleep/presentation/SleepEnhancedHelpScreen.Data.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0832a implements m63.e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0832a f44260a;
            private static final k63.e descriptor;

            static {
                C0832a c0832a = new C0832a();
                f44260a = c0832a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.sleep.presentation.SleepEnhancedHelpScreen.Data", c0832a, 5);
                m1Var.j("showSleepScore", true);
                m1Var.j("showSleepNeed", true);
                m1Var.j("showPerformanceDevice", true);
                m1Var.j("showManagedDevicePriority", true);
                m1Var.j("supportedFeatures", true);
                descriptor = m1Var;
            }

            private C0832a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.g gVar = m63.g.f116948a;
                return new i63.c[]{gVar, gVar, gVar, gVar, d.C0834a.f44272a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                boolean zG2 = false;
                boolean zG3 = false;
                boolean zG4 = false;
                d dVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        zG = cVarC.g(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        zG2 = cVarC.g(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        zG3 = cVarC.g(eVar2, 2);
                        i15 |= 4;
                    } else if (iE == 3) {
                        zG4 = cVarC.g(eVar2, 3);
                        i15 |= 8;
                    } else {
                        if (iE != 4) {
                            hb.a.o(iE);
                            return null;
                        }
                        dVar = (d) cVarC.l(eVar2, 4, d.C0834a.f44272a, dVar);
                        i15 |= 16;
                    }
                }
                cVarC.b(eVar2);
                return new b(i15, zG, zG2, zG3, zG4, dVar, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x006f  */
            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                d dVar = bVar.f44259e;
                boolean z14 = bVar.f44258d;
                boolean z15 = bVar.f44257c;
                boolean z16 = bVar.f44256b;
                boolean z17 = bVar.f44255a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || z17) {
                    dVarC.n(eVar, 0, z17);
                }
                if (dVarC.C(eVar) || z16) {
                    dVarC.n(eVar, 1, z16);
                }
                if (dVarC.C(eVar) || z15) {
                    dVarC.n(eVar, 2, z15);
                }
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 3, z14);
                }
                if (dVarC.C(eVar)) {
                    dVarC.e(eVar, 4, d.C0834a.f44272a, dVar);
                } else {
                    if (!s.g(dVar, new d(false, false, false, false, false, false, false, false, false, false, 1023, (j) null))) {
                        dVarC.e(eVar, 4, d.C0834a.f44272a, dVar);
                    }
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                boolean z14 = false;
                boolean z15 = true;
                boolean z16 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                if (parcel.readInt() == 0) {
                    z15 = z14;
                }
                return new b(z16, z14, z15, parcel.readInt() != 0, d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(int i14, boolean z14, boolean z15, boolean z16, boolean z17, d dVar, m63.u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f44255a = false;
            } else {
                this.f44255a = z14;
            }
            if ((i14 & 2) == 0) {
                this.f44256b = false;
            } else {
                this.f44256b = z15;
            }
            if ((i14 & 4) == 0) {
                this.f44257c = false;
            } else {
                this.f44257c = z16;
            }
            if ((i14 & 8) == 0) {
                this.f44258d = false;
            } else {
                this.f44258d = z17;
            }
            if ((i14 & 16) != 0) {
                this.f44259e = dVar;
                return;
            }
            this.f44259e = new d(false, false, false, false, false, false, false, false, false, false, 1023, (j) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f44255a == bVar.f44255a && this.f44256b == bVar.f44256b && this.f44257c == bVar.f44257c && this.f44258d == bVar.f44258d && s.g(this.f44259e, bVar.f44259e);
        }

        public final int hashCode() {
            return this.f44259e.hashCode() + q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f44255a) * 31, 31, this.f44256b), 31, this.f44257c), 31, this.f44258d);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Data(showSleepScore=", ", showSleepNeed=", ", showPerformanceDevice=", this.f44255a, this.f44256b);
            kg.f.q(", showManagedDevicePriority=", ", supportedFeatures=", sbM, this.f44257c, this.f44258d);
            sbM.append(this.f44259e);
            sbM.append(")");
            return sbM.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f44255a ? 1 : 0);
            parcel.writeInt(this.f44256b ? 1 : 0);
            parcel.writeInt(this.f44257c ? 1 : 0);
            parcel.writeInt(this.f44258d ? 1 : 0);
            this.f44259e.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.sleep.presentation.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$b$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$b;", "serializer", "()Li63/c;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<b> serializer() {
                return C0832a.f44260a;
            }

            private Companion() {
            }
        }

        public b() {
            this(false, false, false, false, (d) null, 31, (j) null);
        }

        public b(boolean z14, boolean z15, boolean z16, boolean z17, d dVar) {
            dVar.getClass();
            this.f44255a = z14;
            this.f44256b = z15;
            this.f44257c = z16;
            this.f44258d = z17;
            this.f44259e = dVar;
        }

        public /* synthetic */ b(boolean z14, boolean z15, boolean z16, boolean z17, d dVar, int i14, j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) == 0 ? z17 : false, (i14 & 16) != 0 ? new d(false, false, false, false, false, false, false, false, false, false, 1023, (j) null) : dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$d;", "Landroid/os/Parcelable;", "", "breathingVariations", "sleepScore", "rem", "skinTemp", "heartRate", "bodyBattery", "pulseOx", "respiration", "hrv", "sleepAlignment", "<init>", "(ZZZZZZZZZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZZZZZZZZZZLm63/u1;)V", "Companion", "a", "b", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f44262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f44263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f44264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f44265d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f44266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f44267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f44268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f44269h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f44270i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f44271j;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.sleep.presentation.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/sleep/presentation/SleepEnhancedHelpScreen.SupportedFeatures.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0834a implements m63.e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0834a f44272a;
            private static final k63.e descriptor;

            static {
                C0834a c0834a = new C0834a();
                f44272a = c0834a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.sleep.presentation.SleepEnhancedHelpScreen.SupportedFeatures", c0834a, 10);
                m1Var.j("breathingVariations", true);
                m1Var.j("sleepScore", true);
                m1Var.j("rem", true);
                m1Var.j("skinTemp", true);
                m1Var.j("heartRate", true);
                m1Var.j("bodyBattery", true);
                m1Var.j("pulseOx", true);
                m1Var.j("respiration", true);
                m1Var.j("hrv", true);
                m1Var.j("sleepAlignment", true);
                descriptor = m1Var;
            }

            private C0834a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.g gVar = m63.g.f116948a;
                return new i63.c[]{gVar, gVar, gVar, gVar, gVar, gVar, gVar, gVar, gVar, gVar};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                boolean zG2 = false;
                boolean zG3 = false;
                boolean zG4 = false;
                boolean zG5 = false;
                boolean zG6 = false;
                boolean zG7 = false;
                boolean zG8 = false;
                boolean zG9 = false;
                boolean zG10 = false;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    switch (iE) {
                        case -1:
                            z14 = false;
                            break;
                        case 0:
                            zG = cVarC.g(eVar2, 0);
                            i15 |= 1;
                            break;
                        case 1:
                            zG2 = cVarC.g(eVar2, 1);
                            i15 |= 2;
                            break;
                        case 2:
                            zG3 = cVarC.g(eVar2, 2);
                            i15 |= 4;
                            break;
                        case 3:
                            zG4 = cVarC.g(eVar2, 3);
                            i15 |= 8;
                            break;
                        case 4:
                            zG5 = cVarC.g(eVar2, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            zG6 = cVarC.g(eVar2, 5);
                            i15 |= 32;
                            break;
                        case 6:
                            zG7 = cVarC.g(eVar2, 6);
                            i15 |= 64;
                            break;
                        case 7:
                            zG8 = cVarC.g(eVar2, 7);
                            i15 |= 128;
                            break;
                        case 8:
                            zG9 = cVarC.g(eVar2, 8);
                            i15 |= 256;
                            break;
                        case 9:
                            zG10 = cVarC.g(eVar2, 9);
                            i15 |= 512;
                            break;
                        default:
                            hb.a.o(iE);
                            return null;
                    }
                }
                cVarC.b(eVar2);
                return new d(i15, zG, zG2, zG3, zG4, zG5, zG6, zG7, zG8, zG9, zG10, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                boolean z14 = dVar.f44271j;
                boolean z15 = dVar.f44270i;
                boolean z16 = dVar.f44269h;
                boolean z17 = dVar.f44268g;
                boolean z18 = dVar.f44267f;
                boolean z19 = dVar.f44266e;
                boolean z24 = dVar.f44265d;
                boolean z25 = dVar.f44264c;
                boolean z26 = dVar.f44263b;
                boolean z27 = dVar.f44262a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || z27) {
                    dVarC.n(eVar, 0, z27);
                }
                if (dVarC.C(eVar) || z26) {
                    dVarC.n(eVar, 1, z26);
                }
                if (dVarC.C(eVar) || z25) {
                    dVarC.n(eVar, 2, z25);
                }
                if (dVarC.C(eVar) || z24) {
                    dVarC.n(eVar, 3, z24);
                }
                if (dVarC.C(eVar) || z19) {
                    dVarC.n(eVar, 4, z19);
                }
                if (dVarC.C(eVar) || z18) {
                    dVarC.n(eVar, 5, z18);
                }
                if (dVarC.C(eVar) || z17) {
                    dVarC.n(eVar, 6, z17);
                }
                if (dVarC.C(eVar) || z16) {
                    dVarC.n(eVar, 7, z16);
                }
                if (dVarC.C(eVar) || z15) {
                    dVarC.n(eVar, 8, z15);
                }
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 9, z14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                boolean z14 = false;
                boolean z15 = true;
                boolean z16 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                if (parcel.readInt() == 0) {
                    z15 = z14;
                }
                if (parcel.readInt() != 0) {
                    z14 = z15;
                }
                if (parcel.readInt() == 0) {
                    z15 = z14;
                }
                if (parcel.readInt() != 0) {
                    z14 = z15;
                }
                if (parcel.readInt() == 0) {
                    z15 = z14;
                }
                if (parcel.readInt() != 0) {
                    z14 = z15;
                }
                if (parcel.readInt() == 0) {
                    z15 = z14;
                }
                return new d(z16, z14, z15, z14, z15, z14, z15, z14, z15, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public /* synthetic */ d(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, m63.u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f44262a = false;
            } else {
                this.f44262a = z14;
            }
            if ((i14 & 2) == 0) {
                this.f44263b = false;
            } else {
                this.f44263b = z15;
            }
            if ((i14 & 4) == 0) {
                this.f44264c = false;
            } else {
                this.f44264c = z16;
            }
            if ((i14 & 8) == 0) {
                this.f44265d = false;
            } else {
                this.f44265d = z17;
            }
            if ((i14 & 16) == 0) {
                this.f44266e = false;
            } else {
                this.f44266e = z18;
            }
            if ((i14 & 32) == 0) {
                this.f44267f = false;
            } else {
                this.f44267f = z19;
            }
            if ((i14 & 64) == 0) {
                this.f44268g = false;
            } else {
                this.f44268g = z24;
            }
            if ((i14 & 128) == 0) {
                this.f44269h = false;
            } else {
                this.f44269h = z25;
            }
            if ((i14 & 256) == 0) {
                this.f44270i = false;
            } else {
                this.f44270i = z26;
            }
            if ((i14 & 512) == 0) {
                this.f44271j = false;
            } else {
                this.f44271j = z27;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f44262a == dVar.f44262a && this.f44263b == dVar.f44263b && this.f44264c == dVar.f44264c && this.f44265d == dVar.f44265d && this.f44266e == dVar.f44266e && this.f44267f == dVar.f44267f && this.f44268g == dVar.f44268g && this.f44269h == dVar.f44269h && this.f44270i == dVar.f44270i && this.f44271j == dVar.f44271j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f44271j) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f44262a) * 31, 31, this.f44263b), 31, this.f44264c), 31, this.f44265d), 31, this.f44266e), 31, this.f44267f), 31, this.f44268g), 31, this.f44269h), 31, this.f44270i);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SupportedFeatures(breathingVariations=", ", sleepScore=", ", rem=", this.f44262a, this.f44263b);
            kg.f.q(", skinTemp=", ", heartRate=", sbM, this.f44264c, this.f44265d);
            kg.f.q(", bodyBattery=", ", pulseOx=", sbM, this.f44266e, this.f44267f);
            kg.f.q(", respiration=", ", hrv=", sbM, this.f44268g, this.f44269h);
            return com.airbnb.lottie.animation.keyframe.a.f(", sleepAlignment=", ")", sbM, this.f44270i, this.f44271j);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f44262a ? 1 : 0);
            parcel.writeInt(this.f44263b ? 1 : 0);
            parcel.writeInt(this.f44264c ? 1 : 0);
            parcel.writeInt(this.f44265d ? 1 : 0);
            parcel.writeInt(this.f44266e ? 1 : 0);
            parcel.writeInt(this.f44267f ? 1 : 0);
            parcel.writeInt(this.f44268g ? 1 : 0);
            parcel.writeInt(this.f44269h ? 1 : 0);
            parcel.writeInt(this.f44270i ? 1 : 0);
            parcel.writeInt(this.f44271j ? 1 : 0);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.sleep.presentation.a$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$d$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$d;", "serializer", "()Li63/c;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return C0834a.f44272a;
            }

            private Companion() {
            }
        }

        public d() {
            this(false, false, false, false, false, false, false, false, false, false, 1023, (j) null);
        }

        public d(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27) {
            this.f44262a = z14;
            this.f44263b = z15;
            this.f44264c = z16;
            this.f44265d = z17;
            this.f44266e = z18;
            this.f44267f = z19;
            this.f44268g = z24;
            this.f44269h = z25;
            this.f44270i = z26;
            this.f44271j = z27;
        }

        public /* synthetic */ d(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, int i14, j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19, (i14 & 64) != 0 ? false : z24, (i14 & 128) != 0 ? false : z25, (i14 & 256) != 0 ? false : z26, (i14 & 512) != 0 ? false : z27);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.sleep.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$a;", "", "<init>", "()V", "", "SLEEP_SCORE_ACTION", "Ljava/lang/String;", "SLEEP_COACH_ACTION", "DATA_ACCURACY_ACTION", "SLEEP_STAGES_ACTION", "SLEEP_TIMELINE_METRICS_ACTION", "SLEEP_ALIGNMENT_ACTION", "EXTRA_DATA", "SLEEP_ACCURACY_LINK", "DATA_ACCURACY_URL", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0831a {
        public /* synthetic */ C0831a(j jVar) {
            this();
        }

        private C0831a() {
        }
    }
}
