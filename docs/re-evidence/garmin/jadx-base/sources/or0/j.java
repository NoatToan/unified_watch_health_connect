package or0;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b82.w0;
import c2.b0;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.List;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.h0;
import p5.k0;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lor0/j;", "Lh82/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f133348g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ir0.d f133349f;

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        Parcelable parcelable;
        o0 o0VarE = mVar.E(-429143828);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            if (s.g(bundle.getString("EXTRA_ACTION", "DEFAULT_ACTION"), "DEFAULT_ACTION")) {
                boolean zC = ((lr0.a) KoinJavaComponent.get$default(lr0.a.class, null, null, 6, null)).c();
                String str = zC ? "DEFAULT_ACTION" : "TRACKING_NON_CUSTOMIZABLE_ACTION";
                this.f82432c = str;
                if (str.equals("TRACKING_ACTION") && !zC) {
                    this.f82432c = "TRACKING_NON_CUSTOMIZABLE_ACTION";
                }
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("KEY_INTENSITY_MINUTES_EXTRA", ir0.d.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("KEY_INTENSITY_MINUTES_EXTRA");
                parcelable = (ir0.d) (parcelable2 instanceof ir0.d ? parcelable2 : null);
            }
            this.f133349f = (ir0.d) parcelable;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(this, bundle, i14, 9);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        String strE = a0.e(R.string.intensity_minutes_tracking, context);
        if (strE.length() > 35) {
            strE = context.getString(R.string.intensity_minutes_tracking_abbrv);
            strE.getClass();
        }
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-791386752, true, new d(this, 1)), 4, null), new h82.c.b("CALCULATING_ACTION", context.getString(R.string.intensity_minutes_config_calc_label), null, new z3.e(1462905439, true, new d(this, 2)), 4, null), new h82.c.b("TRACKING_ACTION", strE, null, new z3.e(-577769666, true, new d(this, 3)), 4, null), new h82.c.b("TRACKING_NON_CUSTOMIZABLE_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1676522525, true, new d(this, 4)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-912210351);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            or0.a.f133327a.getClass();
            h82.e.a(or0.a.f133328b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:66:0x013a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x022d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0231  */
    /* JADX WARN: Code duplicated, block: B:78:0x0235  */
    /* JADX WARN: Code duplicated, block: B:81:0x0244  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public final void h(String str, String str2, String str3, Integer num, r rVar, h4.d.b bVar, p3.m mVar, int i14, int i15) {
        int i16;
        Integer num2;
        int i17;
        boolean z14;
        o0 o0Var;
        h4.d.b bVar2;
        Integer num3;
        r rVar2;
        p2 p2VarI0;
        r.a aVar;
        h4.d.a aVar2;
        h4.g.a aVar3;
        float f14;
        int i18;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar4;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar3;
        Integer num4;
        int i19;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        o0 o0VarE = mVar.E(-463155453);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str3) ? 256 : 128;
        }
        int i24 = i15 & 8;
        if (i24 == 0) {
            if ((i14 & 3072) == 0) {
                num2 = num;
                i16 |= o0VarE.B(num2) ? 2048 : 1024;
            }
            i17 = i16 | 221184;
            if ((74899 & i17) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                if (i24 != 0) {
                    num2 = null;
                }
                aVar = r.S;
                aVar2 = h4.d.f81522a;
                aVar2.getClass();
                aVar3 = h4.d.a.f81536n;
                x1 x1Var = p3.n.f135158a;
                float f15 = 0;
                g6.f.a aVar5 = g6.f.f75994b;
                f14 = 8;
                r rVarThen = c2.l.B(aVar, f15, f14, f15, f14).then(aVar);
                i18 = i17 >> 9;
                c2.j.f22691a.getClass();
                zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i18 & 896) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen, o0VarE);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar3 = h5.g.a.f81813j;
                num4 = num2;
                if (o0VarE.T) {
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    aVar2.getClass();
                    s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(aVar, o0VarE);
                    if (cVar != null) {
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
                    d92.b.f58623a.getClass();
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, i17 & 14, 0, 131070);
                    fVar2.getClass();
                    mh.c(str2, c2.l.y(aVar, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, ((i17 >> 3) & 14) | 48, 0, 131068);
                    if (num4 != null) {
                        o0VarE.C(1934009197);
                        c2.q.a(l4.r.a(c2.l.C(l4.k.b(x2.q(aVar, 24), k2.i.f102406a), 0.0f, f14, 0.0f, 0.0f, 13), n5.c.a(num4.intValue(), o0VarE, i19 & 14), null, null, 0.0f, null, 62), o0VarE, 0);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1934359001);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    fVar2.getClass();
                    mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, (i17 >> 6) & 14, 0, 131070);
                    o0Var = o0VarE;
                    o0Var.g0(true);
                    bVar2 = aVar3;
                    rVar2 = aVar;
                    num3 = num4;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                c2.j.C0343j c0343j2 = c2.j.f22692b;
                aVar2.getClass();
                s2VarA = q2.a(c0343j2, h4.d.a.f81533k, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
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
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var2 = u2.f22900a;
                d92.b.f58623a.getClass();
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, i17 & 14, 0, 131070);
                fVar3.getClass();
                mh.c(str2, c2.l.y(aVar, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, ((i17 >> 3) & 14) | 48, 0, 131068);
                if (num4 != null) {
                    o0VarE.C(1934009197);
                    c2.q.a(l4.r.a(c2.l.C(l4.k.b(x2.q(aVar, 24), k2.i.f102406a), 0.0f, f14, 0.0f, 0.0f, 13), n5.c.a(num4.intValue(), o0VarE, i19 & 14), null, null, 0.0f, null, 62), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1934359001);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                fVar3.getClass();
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, (i17 >> 6) & 14, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(true);
                bVar2 = aVar3;
                rVar2 = aVar;
                num3 = num4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                bVar2 = bVar;
                num3 = num2;
                rVar2 = rVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new w0(this, str, str2, str3, num3, rVar2, bVar2, i14, i15);
            }
        }
        i16 |= 3072;
        num2 = num;
        i17 = i16 | 221184;
        if ((74899 & i17) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            if (i24 != 0) {
                num2 = null;
            }
            aVar = r.S;
            aVar2 = h4.d.f81522a;
            aVar2.getClass();
            aVar3 = h4.d.a.f81536n;
            x1 x1Var2 = p3.n.f135158a;
            float f16 = 0;
            g6.f.a aVar6 = g6.f.f75994b;
            f14 = 8;
            r rVarThen2 = c2.l.B(aVar, f16, f14, f16, f14).then(aVar);
            i18 = i17 >> 9;
            c2.j.f22691a.getClass();
            zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i18 & 896) >> 3) & 112);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen2, o0VarE);
            h5.g.V.getClass();
            aVar4 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar3 = h5.g.a.f81813j;
            num4 = num2;
            if (o0VarE.T) {
                i19 = i18;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var3 = b0.f22601a;
                c2.j.C0343j c0343j3 = c2.j.f22692b;
                aVar2.getClass();
                s2VarA = q2.a(c0343j3, h4.d.a.f81533k, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
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
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var3 = u2.f22900a;
                d92.b.f58623a.getClass();
                j92.f fVar4 = d92.b.f58624b;
                fVar4.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, i17 & 14, 0, 131070);
                fVar4.getClass();
                mh.c(str2, c2.l.y(aVar, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, ((i17 >> 3) & 14) | 48, 0, 131068);
                if (num4 != null) {
                    o0VarE.C(1934009197);
                    c2.q.a(l4.r.a(c2.l.C(l4.k.b(x2.q(aVar, 24), k2.i.f102406a), 0.0f, f14, 0.0f, 0.0f, 13), n5.c.a(num4.intValue(), o0VarE, i19 & 14), null, null, 0.0f, null, 62), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1934359001);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                fVar4.getClass();
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, (i17 >> 6) & 14, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(true);
                bVar2 = aVar3;
                rVar2 = aVar;
                num3 = num4;
            } else {
                i19 = i18;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var4 = b0.f22601a;
            c2.j.C0343j c0343j4 = c2.j.f22692b;
            aVar2.getClass();
            s2VarA = q2.a(c0343j4, h4.d.a.f81533k, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
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
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var4 = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.f fVar5 = d92.b.f58624b;
            fVar5.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, i17 & 14, 0, 131070);
            fVar5.getClass();
            mh.c(str2, c2.l.y(aVar, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, ((i17 >> 3) & 14) | 48, 0, 131068);
            if (num4 != null) {
                o0VarE.C(1934009197);
                c2.q.a(l4.r.a(c2.l.C(l4.k.b(x2.q(aVar, 24), k2.i.f102406a), 0.0f, f14, 0.0f, 0.0f, 13), n5.c.a(num4.intValue(), o0VarE, i19 & 14), null, null, 0.0f, null, 62), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1934359001);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            fVar5.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, (i17 >> 6) & 14, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            bVar2 = aVar3;
            rVar2 = aVar;
            num3 = num4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            bVar2 = bVar;
            num3 = num2;
            rVar2 = rVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w0(this, str, str2, str3, num3, rVar2, bVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:53:0x0161  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:59:0x0180  */
    /* JADX WARN: Code duplicated, block: B:61:0x0247  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [or0.j] */
    /* JADX WARN: Type inference failed for: r0v12, types: [or0.j] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r37v0, types: [or0.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p3.m, p3.o0] */
    public final void i(ir0.d dVar, p3.m mVar, int i14) {
        int i15;
        ?? r14;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        int i16;
        r rVarC;
        ?? r15 = this;
        ?? E = mVar.E(-1975283588);
        p3.c<?> cVar2 = E.f135177b;
        int i17 = ((i14 & 8) == 0 ? E.B(dVar) : E.r(dVar) ? 4 : 2) | i14 | (E.r(r15) ? 32 : 16);
        if (E.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            final x00.a aVar = new x00.a((Context) E.A(AndroidCompositionLocals_androidKt.f6042b));
            final int i18 = dVar != null ? dVar.f94789a : 0;
            int i19 = dVar != null ? dVar.f94790b : 0;
            final int i24 = dVar != null ? dVar.f94791c : 0;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            r.a aVar3 = r.S;
            g6.f.a aVar4 = g6.f.f75994b;
            final int i25 = i19;
            r rVarE = u1.n.e(c2.l.E(x2.f(c2.l.y(aVar3, 16), 1.0f), q1.Max), tn.k.b(d92.b.f58623a, E), m1.f128891a);
            Object objQ = E.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = new oe2.g(17);
                E.K(objQ);
            }
            r rVarC2 = v.c((e23.l) objQ, rVarE, true);
            boolean zR = E.r(aVar) | E.k(i18) | E.k(i25) | E.k(i24);
            Object objQ2 = E.q();
            if (zR || objQ2 == obj) {
                objQ2 = new e23.l() { // from class: or0.h
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        k0 k0Var = (k0) obj2;
                        j.a aVar5 = j.f133348g;
                        k0Var.getClass();
                        h0.n(k0Var, aVar.a(Integer.valueOf(i18), Integer.valueOf(i25), Integer.valueOf(i24)));
                        return Unit.INSTANCE;
                    }
                };
                E.K(objQ2);
            }
            r rVarB = v.b(rVarC2, (e23.l) objQ2);
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar2, E, 48);
            int iHashCode2 = Long.hashCode(E.U);
            i2 i2VarA1 = E.a0();
            r rVarC3 = h4.k.c(rVarB, E);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar5);
            } else {
                E.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, E);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(E.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, E);
                b0 b0Var = b0.f22601a;
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, E, 0);
                iHashCode = Long.hashCode(E.U);
                i2VarA0 = E.a0();
                i16 = i18;
                rVarC = h4.k.c(aVar3, E);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar5);
                } else {
                    E.c();
                }
                b4.c(eVar, s2VarA, E);
                b4.c(c1623g, i2VarA0, E);
                if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, E, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, E);
                u2 u2Var = u2.f22900a;
                int i26 = (i17 << 15) & 3670016;
                h(String.valueOf(i16), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.lbl_intensity_moderate_short), null, null, null, E, i26, 56);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97930g;
                float f14 = 8;
                mh.c(Marker.ANY_NON_NULL_MARKER, c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, E), E, 54, 0, 131068);
                h(String.valueOf(i25), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.lbl_intensity_vigorous_short), Integer.valueOf(R.drawable.intensity_minutes_x2), null, null, E, i26, 48);
                fVar2.getClass();
                mh.c("=", c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, E), E, 54, 0, 131068);
                ?? r16 = this;
                r16.h(String.valueOf(i24), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.challenge_leaderboard_header_total_label), null, null, null, E, i26, 56);
                i15 = 1;
                E.g0(true);
                E.g0(true);
                r14 = r16;
            }
            v.h.A(iHashCode2, E, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, E);
            b0 b0Var2 = b0.f22601a;
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, E, 0);
            iHashCode = Long.hashCode(E.U);
            i2VarA0 = E.a0();
            i16 = i18;
            rVarC = h4.k.c(aVar3, E);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar5);
            } else {
                E.c();
            }
            b4.c(eVar, s2VarA, E);
            b4.c(c1623g, i2VarA0, E);
            if (E.T) {
                v.h.A(iHashCode, E, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, E, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, E);
            u2 u2Var2 = u2.f22900a;
            int i27 = (i17 << 15) & 3670016;
            h(String.valueOf(i16), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.lbl_intensity_moderate_short), null, null, null, E, i27, 56);
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0Var2 = j92.f.f97930g;
            float f15 = 8;
            mh.c(Marker.ANY_NON_NULL_MARKER, c2.l.y(aVar3, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, E), E, 54, 0, 131068);
            h(String.valueOf(i25), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.lbl_intensity_vigorous_short), Integer.valueOf(R.drawable.intensity_minutes_x2), null, null, E, i27, 48);
            fVar3.getClass();
            mh.c("=", c2.l.y(aVar3, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, E), E, 54, 0, 131068);
            ?? r17 = this;
            r17.h(String.valueOf(i24), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.challenge_leaderboard_header_total_label), null, null, null, E, i27, 56);
            i15 = 1;
            E.g0(true);
            E.g0(true);
            r14 = r17;
        } else {
            i15 = 1;
            E.e();
            r14 = r15;
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(r14, dVar, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [or0.j] */
    /* JADX WARN: Type inference failed for: r0v13, types: [or0.j] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r45v0, types: [or0.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p3.m, p3.o0] */
    public final void j(ir0.d dVar, p3.m mVar, int i14) {
        int i15;
        ?? r14;
        Integer num;
        Integer num2;
        Integer num3;
        ?? r15 = this;
        ?? E = mVar.E(-1819609115);
        p3.c<?> cVar = E.f135177b;
        int i16 = ((i14 & 8) == 0 ? E.B(dVar) : E.r(dVar) ? 4 : 2) | i14 | (E.r(r15) ? 32 : 16);
        if (E.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            x00.a aVar = new x00.a((Context) E.A(AndroidCompositionLocals_androidKt.f6042b));
            Integer numValueOf = dVar != null ? Integer.valueOf(dVar.f94789a) : null;
            Integer numValueOf2 = dVar != null ? Integer.valueOf(dVar.f94790b) : null;
            Integer numValueOf3 = dVar != null ? Integer.valueOf(dVar.f94791c) : null;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            r.a aVar3 = r.S;
            g6.f.a aVar4 = g6.f.f75994b;
            Integer num4 = numValueOf;
            r rVarE = u1.n.e(c2.l.E(x2.f(c2.l.y(aVar3, 16), 1.0f), q1.Max), tn.k.b(d92.b.f58623a, E), m1.f128891a);
            Object objQ = E.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = new oe2.g(16);
                E.K(objQ);
            }
            r rVarC = v.c((e23.l) objQ, rVarE, true);
            boolean zR = E.r(aVar) | E.B(num4) | E.B(numValueOf2) | E.B(numValueOf3);
            Object objQ2 = E.q();
            if (zR || objQ2 == obj) {
                num = num4;
                Integer num5 = numValueOf2;
                Integer num6 = numValueOf3;
                mt0.e0 e0Var = new mt0.e0(aVar, num, num5, num6, 7);
                num2 = num5;
                num3 = num6;
                E.K(e0Var);
                objQ2 = e0Var;
            } else {
                num2 = numValueOf2;
                num3 = numValueOf3;
                num = num4;
            }
            r rVarB = v.b(rVarC, (e23.l) objQ2);
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar2, E, 48);
            int iHashCode = Long.hashCode(E.U);
            i2 i2VarA0 = E.a0();
            r rVarC2 = h4.k.c(rVarB, E);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar5);
            } else {
                E.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, E);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, E, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, E);
            b0 b0Var = b0.f22601a;
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.g.b bVar2 = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar2, E, 0);
            int iHashCode2 = Long.hashCode(E.U);
            i2 i2VarA1 = E.a0();
            r rVarC3 = h4.k.c(aVar3, E);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar5);
            } else {
                E.c();
            }
            b4.c(eVar, s2VarA, E);
            b4.c(c1623g, i2VarA1, E);
            if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, E, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, E);
            u2 u2Var = u2.f22900a;
            int i17 = (i16 << 15) & 3670016;
            h(String.valueOf(num), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.lbl_intensity_moderate_short), null, null, null, E, i17, 56);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97930g;
            float f14 = 8;
            mh.c(Marker.ANY_NON_NULL_MARKER, c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, E), E, 54, 0, 131068);
            h(String.valueOf(num2), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.lbl_intensity_vigorous_short), Integer.valueOf(R.drawable.intensity_minutes_x2), null, null, E, i17, 48);
            fVar2.getClass();
            mh.c("=", c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, E), E, 54, 0, 131068);
            E.g0(true);
            i15 = 0;
            s2 s2VarA2 = q2.a(c0343j, bVar2, E, 0);
            int iHashCode3 = Long.hashCode(E.U);
            i2 i2VarA2 = E.a0();
            r rVarC4 = h4.k.c(aVar3, E);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar5);
            } else {
                E.c();
            }
            b4.c(eVar, s2VarA2, E);
            b4.c(c1623g, i2VarA2, E);
            if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, E, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC4, E);
            ?? r16 = this;
            r16.h(String.valueOf(num3), gl1.y.Q(E, R.string.common_min_abbreviated_without_period), gl1.y.Q(E, R.string.challenge_leaderboard_header_total_label), null, null, null, E, i17, 56);
            E.g0(true);
            E.g0(true);
            r14 = r16;
        } else {
            i15 = 0;
            E.e();
            r14 = r15;
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(r14, dVar, i14, i15);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-801785596);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(1471848432, new d(this, 6), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 0);
        }
    }

    public final void l(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-998659040);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(824239219, new d(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 1);
        }
    }

    public final void m(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1159164287);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(857741966, new d(this, 5), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lor0/j$a;", "", "<init>", "()V", "", "TRACKING_ACTION", "Ljava/lang/String;", "CALCULATING_ACTION", "TRACKING_NON_CUSTOMIZABLE_ACTION", "KEY_INTENSITY_MINUTES_EXTRA", "CDC_URL", "HEART_URL", "PLUS_SIGN", "EQUAL_SIGN", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
