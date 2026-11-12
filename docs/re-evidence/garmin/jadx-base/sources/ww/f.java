package ww;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import aq.m3;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import i3.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.i;
import kw.m;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import uk0.p;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lww/f;", "Lh82/c;", "<init>", "()V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends h82.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f187506i = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f187507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f187508g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pw.a f187509h;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ww/f$b", "Le32/e;", "Lkw/m;", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends e32.e<m> {
        public b() {
        }

        @Override // e32.e
        public final void a(m mVar) {
            f.this.f187507f = mVar;
        }
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        Parcelable parcelable;
        o0 o0VarE = mVar.E(343143869);
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
            this.f187508g = bundle.getInt("KEY_MEASUREMENT_TYPE");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("KEY_MEASUREMENT", pw.a.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("KEY_MEASUREMENT");
                if (!(parcelable2 instanceof pw.a)) {
                    parcelable2 = null;
                }
                parcelable = (pw.a) parcelable2;
            }
            this.f187509h = (pw.a) parcelable;
            n0 n0Var = (n0) o0VarE.A(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                y0 y0Var = ((g) v9.b.a(s0.f105811a.b(g.class), viewModelStoreOwnerA, null, null, viewModelStoreOwnerA instanceof y ? ((y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE)).f187513c;
                if (y0Var != null) {
                    y0Var.f(n0Var, new b());
                }
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, bundle, i14, 12);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1384038825, true, new ww.b(this, 3)), 4, null), new h82.c.b("ABOUT_ACTION", context.getString(R.string.lbl_about_your_reading), null, new z3.e(-1625865942, true, new ww.b(this, 4)), 4, null), new h82.c.b("MEASURING_ACTION", context.getString(R.string.lbl_blood_pressure_help_measuring), null, new z3.e(-340803413, true, new ww.b(this, 5)), 4, null), new h82.c.b("USAGE_ACTION", context.getString(R.string.lbl_how_to_use_reading), null, new z3.e(944259116, true, new ww.b(this, 6)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-725481906);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(6479899, new ww.b(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ww.a(this, i14, 2);
        }
    }

    public final void h(int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(1536529928);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            g6.f.a aVar3 = g6.f.f75994b;
            q.a(u1.n.e(l4.k.b(x2.q(aVar, 16), i.f102406a), n5.a.a(o0VarE, i14), m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m3(this, i14, i15, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x019d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public final void i(t2 t2Var, String str, r rVar, String str2, float f14, h4.d.b bVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str3;
        int i17;
        boolean z14;
        o0 o0Var;
        r rVar2;
        h4.d.b bVar2;
        String str4;
        p2 p2VarI0;
        r.a aVar;
        h4.g.a aVar2;
        float f15;
        int i18;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar3;
        h5.g.a.b bVar3;
        j92.f fVar;
        String str5;
        int i19;
        o0 o0VarE = mVar.E(1321443487);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        int i24 = i16 | 384;
        int i25 = i15 & 4;
        if (i25 == 0) {
            if ((i14 & 3072) == 0) {
                str3 = str2;
                i24 |= o0VarE.B(str3) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.i(f14)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i24 |= i19;
            }
            i17 = i24 | 196608;
            if ((74899 & i17) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                aVar = r.S;
                if (i25 != 0) {
                    str3 = null;
                }
                h4.d.f81522a.getClass();
                aVar2 = h4.d.a.f81536n;
                x1 x1Var = n.f135158a;
                if (str3 != null) {
                    f15 = 8;
                } else {
                    f15 = 10;
                }
                g6.f.a aVar4 = g6.f.f75994b;
                float f16 = 0;
                r rVarThen = l.B(t2Var.a(aVar, f14, true), f16, f15, f16, str3 == null ? 22 : 8).then(aVar);
                i18 = i17 >> 9;
                j.f22691a.getClass();
                zVarA = c2.y.a(j.f22694d, aVar2, o0VarE, ((i18 & 896) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarThen, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                d92.b.f58623a.getClass();
                fVar = d92.b.f58624b;
                fVar.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, (i17 >> 3) & 14, 0, 131070);
                o0Var = o0VarE;
                if (str3 != null) {
                    o0Var.C(-274307265);
                    fVar.getClass();
                    String str6 = str3;
                    mh.c(str6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, i18 & 14, 0, 131070);
                    str5 = str6;
                    o0Var = o0Var;
                    o0Var.g0(false);
                } else {
                    str5 = str3;
                    o0Var.C(-274220775);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                String str7 = str5;
                bVar2 = aVar2;
                rVar2 = aVar;
                str4 = str7;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                bVar2 = bVar;
                str4 = str3;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v(this, t2Var, str, rVar2, str4, f14, bVar2, i14, i15);
            }
        }
        i24 = i16 | 3456;
        str3 = str2;
        if ((i14 & 24576) == 0) {
            if (o0VarE.i(f14)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i24 |= i19;
        }
        i17 = i24 | 196608;
        if ((74899 & i17) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            aVar = r.S;
            if (i25 != 0) {
                str3 = null;
            }
            h4.d.f81522a.getClass();
            aVar2 = h4.d.a.f81536n;
            x1 x1Var2 = n.f135158a;
            if (str3 != null) {
                f15 = 8;
            } else {
                f15 = 10;
            }
            g6.f.a aVar5 = g6.f.f75994b;
            float f17 = 0;
            r rVarThen2 = l.B(t2Var.a(aVar, f14, true), f17, f15, f17, str3 == null ? 22 : 8).then(aVar);
            i18 = i17 >> 9;
            j.f22691a.getClass();
            zVarA = c2.y.a(j.f22694d, aVar2, o0VarE, ((i18 & 896) >> 3) & 112);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarThen2, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            d92.b.f58623a.getClass();
            fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, (i17 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            if (str3 != null) {
                o0Var.C(-274307265);
                fVar.getClass();
                String str8 = str3;
                mh.c(str8, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, i18 & 14, 0, 131070);
                str5 = str8;
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                str5 = str3;
                o0Var.C(-274220775);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            String str9 = str5;
            bVar2 = aVar2;
            rVar2 = aVar;
            str4 = str9;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            bVar2 = bVar;
            str4 = str3;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(this, t2Var, str, rVar2, str4, f14, bVar2, i14, i15);
        }
    }

    public final void j(r rVar, z3.e eVar, p3.m mVar, int i14) {
        z3.e eVar2;
        r rVar2;
        o0 o0VarE = mVar.E(-844655535);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = l.C(rVarE, f14, 0.0f, f14, 0.0f, 10);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            s2 s2VarA = q2.a(j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            eVar2 = eVar;
            eVar2.invoke(u2.f22900a, o0VarE, 54);
            o0VarE.g0(true);
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            eVar2 = eVar;
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, rVar2, eVar2, i14, 1);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1824951040);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-334585779, new ww.b(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ww.a(this, i14, 1);
        }
    }

    public final void l(t2 t2Var, String str, int i14, r rVar, float f14, h4.d.b bVar, p3.m mVar, int i15) {
        int i16;
        o0 o0Var;
        r rVar2;
        h4.d.b bVar2;
        o0 o0VarE = mVar.E(-604856404);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.k(i14) ? 256 : 128;
        }
        int i17 = i16 | 3072;
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.i(f14) ? 16384 : 8192;
        }
        int i18 = i17 | 196608;
        if ((1572864 & i15) == 0) {
            i18 |= o0VarE.r(this) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i18 & 1, (599187 & i18) != 599186)) {
            r.a aVar = r.S;
            h4.d.a aVar2 = h4.d.f81522a;
            aVar2.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            x1 x1Var = n.f135158a;
            r rVarThen = t2Var.a(x2.f(aVar, 1.0f), f14, true).then(aVar);
            j.f22691a.getClass();
            z zVarA = c2.y.a(j.f22694d, aVar3, o0VarE, (((i18 >> 9) & 896) >> 3) & 112);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            int i19 = i18;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            aVar2.getClass();
            s2 s2VarA = q2.a(j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            h(i14, o0VarE, ((i19 >> 6) & 14) | ((i19 >> 15) & 112));
            g6.f.a aVar5 = g6.f.f75994b;
            float f15 = 0;
            r rVarB = l.B(aVar, 8, f15, f15, f15);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, ((i19 >> 3) & 14) | 48, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
            rVar2 = aVar;
            bVar2 = aVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            bVar2 = bVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, t2Var, str, i14, rVar2, f14, bVar2, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x015b  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public final void m(t2 t2Var, String str, r rVar, float f14, h4.d.b bVar, boolean z14, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        o0 o0Var;
        r rVar2;
        h4.d.b bVar2;
        boolean z17;
        p2 p2VarI0;
        r.a aVar;
        h4.g.a aVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar3;
        h5.g.a.b bVar3;
        x0 x0VarF;
        o0 o0VarE = mVar.E(938299971);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        int i17 = i16 | 384;
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.i(f14) ? 2048 : 1024;
        }
        int i18 = i17 | 24576;
        int i19 = i15 & 16;
        if (i19 == 0) {
            if ((196608 & i14) == 0) {
                z15 = z14;
                i18 |= o0VarE.h(z15) ? 131072 : 65536;
            }
            if ((74899 & i18) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i18 & 1, z16)) {
                aVar = r.S;
                h4.d.f81522a.getClass();
                aVar2 = h4.d.a.f81536n;
                if (i19 != 0) {
                    z15 = true;
                }
                x1 x1Var = n.f135158a;
                r rVarThen = t2Var.a(aVar, f14, true).then(aVar);
                j.f22691a.getClass();
                zVarA = c2.y.a(j.f22694d, aVar2, o0VarE, (((i18 >> 6) & 896) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarThen, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                if (z15) {
                    o0VarE.C(-1875051589);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.b(j92.f.f97933j, o0VarE);
                } else {
                    o0VarE.C(-1875050403);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                }
                o0VarE.g0(false);
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i18 >> 3) & 14, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(true);
                rVar2 = aVar;
                bVar2 = aVar2;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                bVar2 = bVar;
            }
            z17 = z15;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new gs.s(this, t2Var, str, rVar2, f14, bVar2, z17, i14, i15);
            }
        }
        i18 = 221184 | i17;
        z15 = z14;
        if ((74899 & i18) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i18 & 1, z16)) {
            aVar = r.S;
            h4.d.f81522a.getClass();
            aVar2 = h4.d.a.f81536n;
            if (i19 != 0) {
                z15 = true;
            }
            x1 x1Var2 = n.f135158a;
            r rVarThen2 = t2Var.a(aVar, f14, true).then(aVar);
            j.f22691a.getClass();
            zVarA = c2.y.a(j.f22694d, aVar2, o0VarE, (((i18 >> 6) & 896) >> 3) & 112);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarThen2, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            if (z15) {
                o0VarE.C(-1875051589);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.b(j92.f.f97933j, o0VarE);
            } else {
                o0VarE.C(-1875050403);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            }
            o0VarE.g0(false);
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i18 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            rVar2 = aVar;
            bVar2 = aVar2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            bVar2 = bVar;
        }
        z17 = z15;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gs.s(this, t2Var, str, rVar2, f14, bVar2, z17, i14, i15);
        }
    }

    public final void n(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-646595419);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(1385700665, new ww.b(this, 7), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ww.a(this, i14, 3);
        }
    }

    public final void o(r rVar, z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1667510602);
        int i15 = i14 | 6;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            rVar = r.S;
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.f(rVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            float f14 = 16;
            g6.f.a aVar = g6.f.f75994b;
            float f15 = 8;
            r rVarThen = l.B(rVarE, f14, f15, f14, f15).then(rVar);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar.invoke(u2.f22900a, o0VarE, 54);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        r rVar2 = rVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, rVar2, eVar, i14, 0);
        }
    }

    public final void p(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1262272698);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(1994234503, new ww.b(this, 8), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ww.a(this, i14, 0);
        }
    }

    public final String q(Context context, pw.a aVar, int i14, boolean z14) {
        Collection<kw.f> collectionValues;
        Object next;
        Collection<kw.f> collectionValues2;
        Object next2;
        Collection<kw.f> collectionValues3;
        Object next3;
        Collection<kw.f> collectionValues4;
        Object next4;
        Double diastolic;
        Double systolic;
        m mVar = this.f187507f;
        String str = null;
        Map<kw.b, kw.f> map = mVar != null ? mVar.f106878b : null;
        Object objValueOf = (aVar == null || (systolic = aVar.getSystolic()) == null) ? null : Integer.valueOf((int) systolic.doubleValue());
        Object objValueOf2 = (aVar == null || (diastolic = aVar.getDiastolic()) == null) ? null : Integer.valueOf((int) diastolic.doubleValue());
        String categoryName = aVar != null ? aVar.getCategoryName() : null;
        if (z14) {
            if (i14 == 1) {
                if (objValueOf == null) {
                    objValueOf = "";
                }
                if (objValueOf2 == null) {
                    objValueOf2 = "";
                }
                if (map != null && (collectionValues3 = map.values()) != null) {
                    Iterator<T> it = collectionValues3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (!s.g(((kw.f) next3).f106836a, categoryName));
                    kw.f fVar = (kw.f) next3;
                    if (fVar != null) {
                        str = fVar.f106837b;
                    }
                }
                String string = context.getString(R.string.lbl_blood_pressure_help_about_reading_day_content_description, objValueOf, objValueOf2, str);
                string.getClass();
                return string;
            }
            if (i14 == 2) {
                if (objValueOf == null) {
                    objValueOf = "";
                }
                if (objValueOf2 == null) {
                    objValueOf2 = "";
                }
                if (map != null && (collectionValues4 = map.values()) != null) {
                    Iterator<T> it3 = collectionValues4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it3.next();
                    } while (!s.g(((kw.f) next4).f106836a, categoryName));
                    kw.f fVar2 = (kw.f) next4;
                    if (fVar2 != null) {
                        str = fVar2.f106837b;
                    }
                }
                String string2 = context.getString(R.string.lbl_blood_pressure_help_about_reading_range_content_description, objValueOf, objValueOf2, str);
                string2.getClass();
                return string2;
            }
        } else {
            if (i14 == 1) {
                if (objValueOf == null) {
                    objValueOf = "";
                }
                if (objValueOf2 == null) {
                    objValueOf2 = "";
                }
                if (map != null && (collectionValues = map.values()) != null) {
                    Iterator<T> it4 = collectionValues.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (!s.g(((kw.f) next).f106836a, categoryName));
                    kw.f fVar3 = (kw.f) next;
                    if (fVar3 != null) {
                        str = fVar3.f106837b;
                    }
                }
                String string3 = context.getString(R.string.lbl_blood_pressure_help_about_reading_day, objValueOf, objValueOf2, str);
                string3.getClass();
                return string3;
            }
            if (i14 == 2) {
                if (objValueOf == null) {
                    objValueOf = "";
                }
                if (objValueOf2 == null) {
                    objValueOf2 = "";
                }
                if (map != null && (collectionValues2 = map.values()) != null) {
                    Iterator<T> it5 = collectionValues2.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                    } while (!s.g(((kw.f) next2).f106836a, categoryName));
                    kw.f fVar4 = (kw.f) next2;
                    if (fVar4 != null) {
                        str = fVar4.f106837b;
                    }
                }
                String string4 = context.getString(R.string.lbl_blood_pressure_help_about_reading_range, objValueOf, objValueOf2, str);
                string4.getClass();
                return string4;
            }
        }
        return "";
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lww/f$a;", "", "<init>", "()V", "", "MEASUREMENT_DAY", "I", "MEASUREMENT_RANGE", "", "KEY_MEASUREMENT_TYPE", "Ljava/lang/String;", "KEY_MEASUREMENT", "ABOUT_ACTION", "MEASURING_ACTION", "USAGE_ACTION", "AMERICAN_HEART_LINK2", "AMERICAN_HEART_LINK3", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
