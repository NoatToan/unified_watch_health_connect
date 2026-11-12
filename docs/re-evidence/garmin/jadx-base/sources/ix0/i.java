package ix0;

import android.content.Context;
import c2.b0;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.List;
import o4.d0;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lix0/i;", "Lh82/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f95700f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1512882988, true, new c(this, 0)), 4, null), new h82.c.b("ABOUT_MENSTRUAL_CYCLES", context.getString(R.string.mct_about_menstrual_cycles), null, new z3.e(776593429, true, new c(this, 2)), 4, null), new h82.c.b("CYCLE_TYPES_AND_PREDICTIONS", context.getString(R.string.mct_cycle_types_predictions), null, new z3.e(-1228897450, true, new c(this, 3)), 4, null), new h82.c.b("PREGNANCY_TRACKING", context.getString(R.string.pregnancy_tracking), null, new z3.e(1060578967, true, new c(this, 4)), 4, null), new h82.c.b("CALENDAR_LEGEND", context.getString(R.string.mct_calendar_legend), null, new z3.e(-944911912, true, new c(this, 5)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1537741767);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            ix0.a.f95672a.getClass();
            h82.e.a(ix0.a.f95673b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:76:0x0183  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public final void h(d0 d0Var, Integer num, boolean z14, m mVar, int i14, int i15) {
        d0 d0Var2;
        int i16;
        Integer num2;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        d0 d0Var3;
        Integer num3;
        boolean z17;
        p2 p2VarI0;
        r.a aVar;
        float f14;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        long j8;
        o0 o0VarE = mVar.E(-815289370);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            d0Var2 = d0Var;
        } else if ((i14 & 6) == 0) {
            d0Var2 = d0Var;
            i16 = (o0VarE.B(d0Var2) ? 4 : 2) | i14;
        } else {
            d0Var2 = d0Var;
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 48) == 0) {
                num2 = num;
                i16 |= o0VarE.B(num2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i16 & 147) != 146) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i19 != 0) {
                        d0Var2 = null;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i17 != 0) {
                        z15 = true;
                    }
                    x1 x1Var = n.f135158a;
                    aVar = r.S;
                    f14 = 16;
                    g6.f.a aVar3 = g6.f.f75994b;
                    r rVarA = l.A(aVar, f14, 0.0f, 2);
                    h4.d.f81522a.getClass();
                    z0VarD = q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarA, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
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
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    u uVar = u.f22885a;
                    if (d0Var2 != null) {
                        j8 = d0Var2.f128833a;
                        o0VarE.C(601031215);
                        if (z15) {
                            o0VarE.C(601048420);
                            q.a(u1.n.e(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), j8, m1.f128891a), o0VarE, 0);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(601342145);
                            q.a(u1.q.b(1, j8, x2.q(aVar, f14), k2.i.f102406a), o0VarE, 0);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(601756770);
                        o0VarE.g0(false);
                    }
                    if (num2 != null) {
                        o0VarE.C(601805099);
                        q.a(l4.r.a(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), n5.c.a(num2.intValue(), o0VarE, (i16 >> 3) & 14), null, null, 0.0f, null, 62), o0VarE, 0);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(602073218);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                } else {
                    o0VarE.e();
                }
                d0Var3 = d0Var2;
                num3 = num2;
                z17 = z15;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new aa2.g(this, d0Var3, num3, z17, i14, i15, 9);
                }
            }
            i16 |= 384;
            z15 = z14;
            if ((i16 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i19 != 0) {
                    d0Var2 = null;
                }
                if (i24 != 0) {
                    num2 = null;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                x1 x1Var2 = n.f135158a;
                aVar = r.S;
                f14 = 16;
                g6.f.a aVar4 = g6.f.f75994b;
                r rVarA2 = l.A(aVar, f14, 0.0f, 2);
                h4.d.f81522a.getClass();
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarA2, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar2 = u.f22885a;
                if (d0Var2 != null) {
                    j8 = d0Var2.f128833a;
                    o0VarE.C(601031215);
                    if (z15) {
                        o0VarE.C(601048420);
                        q.a(u1.n.e(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), j8, m1.f128891a), o0VarE, 0);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(601342145);
                        q.a(u1.q.b(1, j8, x2.q(aVar, f14), k2.i.f102406a), o0VarE, 0);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(601756770);
                    o0VarE.g0(false);
                }
                if (num2 != null) {
                    o0VarE.C(601805099);
                    q.a(l4.r.a(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), n5.c.a(num2.intValue(), o0VarE, (i16 >> 3) & 14), null, null, 0.0f, null, 62), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(602073218);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
            } else {
                o0VarE.e();
            }
            d0Var3 = d0Var2;
            num3 = num2;
            z17 = z15;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new aa2.g(this, d0Var3, num3, z17, i14, i15, 9);
            }
        }
        i16 |= 48;
        num2 = num;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i16 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i19 != 0) {
                    d0Var2 = null;
                }
                if (i24 != 0) {
                    num2 = null;
                }
                if (i17 != 0) {
                    z15 = true;
                }
                x1 x1Var3 = n.f135158a;
                aVar = r.S;
                f14 = 16;
                g6.f.a aVar5 = g6.f.f75994b;
                r rVarA3 = l.A(aVar, f14, 0.0f, 2);
                h4.d.f81522a.getClass();
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarA3, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar3 = u.f22885a;
                if (d0Var2 != null) {
                    j8 = d0Var2.f128833a;
                    o0VarE.C(601031215);
                    if (z15) {
                        o0VarE.C(601048420);
                        q.a(u1.n.e(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), j8, m1.f128891a), o0VarE, 0);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(601342145);
                        q.a(u1.q.b(1, j8, x2.q(aVar, f14), k2.i.f102406a), o0VarE, 0);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(601756770);
                    o0VarE.g0(false);
                }
                if (num2 != null) {
                    o0VarE.C(601805099);
                    q.a(l4.r.a(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), n5.c.a(num2.intValue(), o0VarE, (i16 >> 3) & 14), null, null, 0.0f, null, 62), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(602073218);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
            } else {
                o0VarE.e();
            }
            d0Var3 = d0Var2;
            num3 = num2;
            z17 = z15;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new aa2.g(this, d0Var3, num3, z17, i14, i15, 9);
            }
        }
        i16 |= 384;
        z15 = z14;
        if ((i16 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i19 != 0) {
                d0Var2 = null;
            }
            if (i24 != 0) {
                num2 = null;
            }
            if (i17 != 0) {
                z15 = true;
            }
            x1 x1Var4 = n.f135158a;
            aVar = r.S;
            f14 = 16;
            g6.f.a aVar6 = g6.f.f75994b;
            r rVarA4 = l.A(aVar, f14, 0.0f, 2);
            h4.d.f81522a.getClass();
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarA4, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar4 = u.f22885a;
            if (d0Var2 != null) {
                j8 = d0Var2.f128833a;
                o0VarE.C(601031215);
                if (z15) {
                    o0VarE.C(601048420);
                    q.a(u1.n.e(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), j8, m1.f128891a), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(601342145);
                    q.a(u1.q.b(1, j8, x2.q(aVar, f14), k2.i.f102406a), o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(601756770);
                o0VarE.g0(false);
            }
            if (num2 != null) {
                o0VarE.C(601805099);
                q.a(l4.r.a(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), n5.c.a(num2.intValue(), o0VarE, (i16 >> 3) & 14), null, null, 0.0f, null, 62), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(602073218);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        d0Var3 = d0Var2;
        num3 = num2;
        z17 = z15;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(this, d0Var3, num3, z17, i14, i15, 9);
        }
    }

    public final void i(long j8, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1110340372);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
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
            r rVarR = x2.r(aVar, 48, 8);
            m1.a aVar4 = m1.f128891a;
            q.a(u1.n.e(l4.k.b(rVarR, aVar4), j8, aVar4), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aq.x2(this, j8, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:107:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0205  */
    /* JADX WARN: Code duplicated, block: B:112:0x0234  */
    /* JADX WARN: Code duplicated, block: B:114:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x026c  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0139  */
    /* JADX WARN: Code duplicated, block: B:84:0x0142  */
    /* JADX WARN: Code duplicated, block: B:85:0x0146  */
    /* JADX WARN: Code duplicated, block: B:88:0x015b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:93:0x0195  */
    /* JADX WARN: Code duplicated, block: B:95:0x019c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j(String str, r rVar, d0 d0Var, Integer num, boolean z14, boolean z15, h4.d.b bVar, m mVar, int i14, int i15) {
        int i16;
        d0 d0Var2;
        int i17;
        Integer num2;
        int i18;
        int i19;
        boolean z16;
        int i24;
        int i25;
        boolean z17;
        int i26;
        int i27;
        boolean z18;
        h4.d.b bVar2;
        d0 d0Var3;
        Integer num3;
        boolean z19;
        boolean z24;
        r rVar2;
        p2 p2VarI0;
        r.a aVar;
        boolean z25;
        h4.d.a aVar2;
        h4.g.a aVar3;
        float f14;
        int i28;
        int i29;
        z zVarA;
        boolean z26;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar4;
        Integer num4;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar3;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        int i30;
        boolean z27;
        Integer num5;
        boolean z28;
        int i34;
        boolean z29;
        boolean zR;
        int i35;
        o0 o0VarE = mVar.E(-798075151);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i36 = i16 | 48;
        int i37 = i15 & 4;
        if (i37 == 0) {
            if ((i14 & 384) == 0) {
                d0Var2 = d0Var;
                i36 |= o0VarE.B(d0Var2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    num2 = num;
                    if (o0VarE.B(num2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i36 |= i18;
                }
                i19 = i15 & 16;
                if (i19 != 0) {
                    if ((i14 & 24576) == 0) {
                        z16 = z14;
                        if (o0VarE.h(z16)) {
                            i24 = 16384;
                        } else {
                            i24 = 8192;
                        }
                        i36 |= i24;
                    }
                    i25 = i15 & 32;
                    if (i25 != 0) {
                        if ((196608 & i14) == 0) {
                            z17 = z15;
                            if (o0VarE.h(z17)) {
                                i26 = 131072;
                            } else {
                                i26 = 65536;
                            }
                            i36 |= i26;
                        }
                        i27 = i36 | 1572864;
                        if ((12582912 & i14) == 0) {
                            if ((16777216 & i14) == 0) {
                                zR = o0VarE.B(this);
                            } else {
                                zR = o0VarE.r(this);
                            }
                            if (zR) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i27 |= i35;
                        }
                        if ((4793491 & i27) != 4793490) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (o0VarE.n(i27 & 1, z18)) {
                            aVar = r.S;
                            if (i37 != 0) {
                                d0Var2 = null;
                            }
                            if (i17 != 0) {
                                num2 = null;
                            }
                            if (i19 != 0) {
                                z25 = false;
                            } else {
                                z25 = z16;
                            }
                            if (i25 != 0) {
                                z17 = true;
                            }
                            aVar2 = h4.d.f81522a;
                            aVar2.getClass();
                            aVar3 = h4.d.a.f81536n;
                            x1 x1Var = n.f135158a;
                            r rVarF = x2.f(aVar, 1.0f);
                            f14 = 16;
                            g6.f.a aVar5 = g6.f.f75994b;
                            r rVarThen = l.C(rVarF, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                            i28 = i27 >> 12;
                            c2.j.f22691a.getClass();
                            i29 = i27;
                            zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                            z26 = z25;
                            iHashCode = Long.hashCode(o0VarE.U);
                            i2VarA0 = o0VarE.a0();
                            rVarC = k.c(rVarThen, o0VarE);
                            h5.g.V.getClass();
                            aVar4 = h5.g.a.f81805b;
                            if (cVar != null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            num4 = num2;
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
                            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC, o0VarE);
                            b0 b0Var = b0.f22601a;
                            aVar2.getClass();
                            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                            iHashCode2 = Long.hashCode(o0VarE.U);
                            i2VarA1 = o0VarE.a0();
                            rVarC2 = k.c(aVar, o0VarE);
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
                            i30 = h82.c.f82429e;
                            if (z26) {
                                o0VarE.C(-2071764679);
                                if (d0Var2 != null) {
                                    o0VarE.C(-2071720070);
                                    i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                                    z29 = false;
                                    o0VarE.g0(false);
                                } else {
                                    z29 = false;
                                    o0VarE.C(-2071642229);
                                    o0VarE.g0(false);
                                }
                                o0VarE.g0(z29);
                                z27 = z17;
                                num5 = num4;
                                i34 = z29;
                            } else {
                                o0VarE.C(-2071609307);
                                if (d0Var2 != null) {
                                    o0VarE.C(-2071568821);
                                    boolean z34 = z17;
                                    h(d0Var2, null, z34, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                                    z27 = z34;
                                    o0VarE.g0(false);
                                } else {
                                    z27 = z17;
                                    o0VarE.C(-2071476565);
                                    o0VarE.g0(false);
                                }
                                if (num4 != null) {
                                    o0VarE.C(-2071426314);
                                    h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                                    num5 = num4;
                                    z28 = false;
                                    o0VarE.g0(false);
                                } else {
                                    num5 = num4;
                                    z28 = false;
                                    o0VarE.C(-2071344629);
                                    o0VarE.g0(false);
                                }
                                o0VarE.g0(z28);
                                i34 = z28;
                            }
                            float f15 = i34;
                            r rVarB = l.B(aVar, f14, f15, f15, f15);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            mh.c(str, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                            o0VarE.g0(true);
                            o0VarE.g0(true);
                            d0Var3 = d0Var2;
                            num3 = num5;
                            z19 = z26;
                            bVar2 = aVar3;
                            z24 = z27;
                            rVar2 = aVar;
                        } else {
                            o0VarE.e();
                            bVar2 = bVar;
                            d0Var3 = d0Var2;
                            num3 = num2;
                            z19 = z16;
                            z24 = z17;
                            rVar2 = rVar;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                        }
                    }
                    i36 |= 196608;
                    z17 = z15;
                    i27 = i36 | 1572864;
                    if ((12582912 & i14) == 0) {
                        if ((16777216 & i14) == 0) {
                            zR = o0VarE.B(this);
                        } else {
                            zR = o0VarE.r(this);
                        }
                        if (zR) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i27 |= i35;
                    }
                    if ((4793491 & i27) != 4793490) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        aVar = r.S;
                        if (i37 != 0) {
                            d0Var2 = null;
                        }
                        if (i17 != 0) {
                            num2 = null;
                        }
                        if (i19 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        }
                        aVar2 = h4.d.f81522a;
                        aVar2.getClass();
                        aVar3 = h4.d.a.f81536n;
                        x1 x1Var2 = n.f135158a;
                        r rVarF2 = x2.f(aVar, 1.0f);
                        f14 = 16;
                        g6.f.a aVar6 = g6.f.f75994b;
                        r rVarThen2 = l.C(rVarF2, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                        i28 = i27 >> 12;
                        c2.j.f22691a.getClass();
                        i29 = i27;
                        zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                        z26 = z25;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = k.c(rVarThen2, o0VarE);
                        h5.g.V.getClass();
                        aVar4 = h5.g.a.f81805b;
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        num4 = num2;
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
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        b0 b0Var2 = b0.f22601a;
                        aVar2.getClass();
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(aVar, o0VarE);
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
                        i30 = h82.c.f82429e;
                        if (z26) {
                            o0VarE.C(-2071764679);
                            if (d0Var2 != null) {
                                o0VarE.C(-2071720070);
                                i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                                z29 = false;
                                o0VarE.g0(false);
                            } else {
                                z29 = false;
                                o0VarE.C(-2071642229);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z29);
                            z27 = z17;
                            num5 = num4;
                            i34 = z29;
                        } else {
                            o0VarE.C(-2071609307);
                            if (d0Var2 != null) {
                                o0VarE.C(-2071568821);
                                boolean z35 = z17;
                                h(d0Var2, null, z35, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                                z27 = z35;
                                o0VarE.g0(false);
                            } else {
                                z27 = z17;
                                o0VarE.C(-2071476565);
                                o0VarE.g0(false);
                            }
                            if (num4 != null) {
                                o0VarE.C(-2071426314);
                                h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                                num5 = num4;
                                z28 = false;
                                o0VarE.g0(false);
                            } else {
                                num5 = num4;
                                z28 = false;
                                o0VarE.C(-2071344629);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z28);
                            i34 = z28;
                        }
                        float f16 = i34;
                        r rVarB2 = l.B(aVar, f14, f16, f16, f16);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        d0Var3 = d0Var2;
                        num3 = num5;
                        z19 = z26;
                        bVar2 = aVar3;
                        z24 = z27;
                        rVar2 = aVar;
                    } else {
                        o0VarE.e();
                        bVar2 = bVar;
                        d0Var3 = d0Var2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        rVar2 = rVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                    }
                }
                i36 |= 24576;
                z16 = z14;
                i25 = i15 & 32;
                if (i25 != 0) {
                    if ((196608 & i14) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i36 |= i26;
                    }
                    i27 = i36 | 1572864;
                    if ((12582912 & i14) == 0) {
                        if ((16777216 & i14) == 0) {
                            zR = o0VarE.B(this);
                        } else {
                            zR = o0VarE.r(this);
                        }
                        if (zR) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i27 |= i35;
                    }
                    if ((4793491 & i27) != 4793490) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        aVar = r.S;
                        if (i37 != 0) {
                            d0Var2 = null;
                        }
                        if (i17 != 0) {
                            num2 = null;
                        }
                        if (i19 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        }
                        aVar2 = h4.d.f81522a;
                        aVar2.getClass();
                        aVar3 = h4.d.a.f81536n;
                        x1 x1Var3 = n.f135158a;
                        r rVarF3 = x2.f(aVar, 1.0f);
                        f14 = 16;
                        g6.f.a aVar7 = g6.f.f75994b;
                        r rVarThen3 = l.C(rVarF3, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                        i28 = i27 >> 12;
                        c2.j.f22691a.getClass();
                        i29 = i27;
                        zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                        z26 = z25;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = k.c(rVarThen3, o0VarE);
                        h5.g.V.getClass();
                        aVar4 = h5.g.a.f81805b;
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        num4 = num2;
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
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        b0 b0Var3 = b0.f22601a;
                        aVar2.getClass();
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(aVar, o0VarE);
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
                        i30 = h82.c.f82429e;
                        if (z26) {
                            o0VarE.C(-2071764679);
                            if (d0Var2 != null) {
                                o0VarE.C(-2071720070);
                                i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                                z29 = false;
                                o0VarE.g0(false);
                            } else {
                                z29 = false;
                                o0VarE.C(-2071642229);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z29);
                            z27 = z17;
                            num5 = num4;
                            i34 = z29;
                        } else {
                            o0VarE.C(-2071609307);
                            if (d0Var2 != null) {
                                o0VarE.C(-2071568821);
                                boolean z36 = z17;
                                h(d0Var2, null, z36, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                                z27 = z36;
                                o0VarE.g0(false);
                            } else {
                                z27 = z17;
                                o0VarE.C(-2071476565);
                                o0VarE.g0(false);
                            }
                            if (num4 != null) {
                                o0VarE.C(-2071426314);
                                h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                                num5 = num4;
                                z28 = false;
                                o0VarE.g0(false);
                            } else {
                                num5 = num4;
                                z28 = false;
                                o0VarE.C(-2071344629);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z28);
                            i34 = z28;
                        }
                        float f17 = i34;
                        r rVarB3 = l.B(aVar, f14, f17, f17, f17);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarB3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        d0Var3 = d0Var2;
                        num3 = num5;
                        z19 = z26;
                        bVar2 = aVar3;
                        z24 = z27;
                        rVar2 = aVar;
                    } else {
                        o0VarE.e();
                        bVar2 = bVar;
                        d0Var3 = d0Var2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        rVar2 = rVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                    }
                }
                i36 |= 196608;
                z17 = z15;
                i27 = i36 | 1572864;
                if ((12582912 & i14) == 0) {
                    if ((16777216 & i14) == 0) {
                        zR = o0VarE.B(this);
                    } else {
                        zR = o0VarE.r(this);
                    }
                    if (zR) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i27 |= i35;
                }
                if ((4793491 & i27) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    aVar = r.S;
                    if (i37 != 0) {
                        d0Var2 = null;
                    }
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    }
                    aVar2 = h4.d.f81522a;
                    aVar2.getClass();
                    aVar3 = h4.d.a.f81536n;
                    x1 x1Var4 = n.f135158a;
                    r rVarF4 = x2.f(aVar, 1.0f);
                    f14 = 16;
                    g6.f.a aVar8 = g6.f.f75994b;
                    r rVarThen4 = l.C(rVarF4, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                    i28 = i27 >> 12;
                    c2.j.f22691a.getClass();
                    i29 = i27;
                    zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                    z26 = z25;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarThen4, o0VarE);
                    h5.g.V.getClass();
                    aVar4 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    num4 = num2;
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
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var4 = b0.f22601a;
                    aVar2.getClass();
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(aVar, o0VarE);
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
                    i30 = h82.c.f82429e;
                    if (z26) {
                        o0VarE.C(-2071764679);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071720070);
                            i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                            z29 = false;
                            o0VarE.g0(false);
                        } else {
                            z29 = false;
                            o0VarE.C(-2071642229);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z29);
                        z27 = z17;
                        num5 = num4;
                        i34 = z29;
                    } else {
                        o0VarE.C(-2071609307);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071568821);
                            boolean z37 = z17;
                            h(d0Var2, null, z37, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                            z27 = z37;
                            o0VarE.g0(false);
                        } else {
                            z27 = z17;
                            o0VarE.C(-2071476565);
                            o0VarE.g0(false);
                        }
                        if (num4 != null) {
                            o0VarE.C(-2071426314);
                            h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                            num5 = num4;
                            z28 = false;
                            o0VarE.g0(false);
                        } else {
                            num5 = num4;
                            z28 = false;
                            o0VarE.C(-2071344629);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z28);
                        i34 = z28;
                    }
                    float f18 = i34;
                    r rVarB4 = l.B(aVar, f14, f18, f18, f18);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarB4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    d0Var3 = d0Var2;
                    num3 = num5;
                    z19 = z26;
                    bVar2 = aVar3;
                    z24 = z27;
                    rVar2 = aVar;
                } else {
                    o0VarE.e();
                    bVar2 = bVar;
                    d0Var3 = d0Var2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    rVar2 = rVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                }
            }
            i36 |= 3072;
            num2 = num;
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i36 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    if ((196608 & i14) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i36 |= i26;
                    }
                    i27 = i36 | 1572864;
                    if ((12582912 & i14) == 0) {
                        if ((16777216 & i14) == 0) {
                            zR = o0VarE.B(this);
                        } else {
                            zR = o0VarE.r(this);
                        }
                        if (zR) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i27 |= i35;
                    }
                    if ((4793491 & i27) != 4793490) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        aVar = r.S;
                        if (i37 != 0) {
                            d0Var2 = null;
                        }
                        if (i17 != 0) {
                            num2 = null;
                        }
                        if (i19 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        }
                        aVar2 = h4.d.f81522a;
                        aVar2.getClass();
                        aVar3 = h4.d.a.f81536n;
                        x1 x1Var5 = n.f135158a;
                        r rVarF5 = x2.f(aVar, 1.0f);
                        f14 = 16;
                        g6.f.a aVar9 = g6.f.f75994b;
                        r rVarThen5 = l.C(rVarF5, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                        i28 = i27 >> 12;
                        c2.j.f22691a.getClass();
                        i29 = i27;
                        zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                        z26 = z25;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = k.c(rVarThen5, o0VarE);
                        h5.g.V.getClass();
                        aVar4 = h5.g.a.f81805b;
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        num4 = num2;
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
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        b0 b0Var5 = b0.f22601a;
                        aVar2.getClass();
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(aVar, o0VarE);
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
                        u2 u2Var5 = u2.f22900a;
                        i30 = h82.c.f82429e;
                        if (z26) {
                            o0VarE.C(-2071764679);
                            if (d0Var2 != null) {
                                o0VarE.C(-2071720070);
                                i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                                z29 = false;
                                o0VarE.g0(false);
                            } else {
                                z29 = false;
                                o0VarE.C(-2071642229);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z29);
                            z27 = z17;
                            num5 = num4;
                            i34 = z29;
                        } else {
                            o0VarE.C(-2071609307);
                            if (d0Var2 != null) {
                                o0VarE.C(-2071568821);
                                boolean z38 = z17;
                                h(d0Var2, null, z38, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                                z27 = z38;
                                o0VarE.g0(false);
                            } else {
                                z27 = z17;
                                o0VarE.C(-2071476565);
                                o0VarE.g0(false);
                            }
                            if (num4 != null) {
                                o0VarE.C(-2071426314);
                                h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                                num5 = num4;
                                z28 = false;
                                o0VarE.g0(false);
                            } else {
                                num5 = num4;
                                z28 = false;
                                o0VarE.C(-2071344629);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z28);
                            i34 = z28;
                        }
                        float f19 = i34;
                        r rVarB5 = l.B(aVar, f14, f19, f19, f19);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarB5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        d0Var3 = d0Var2;
                        num3 = num5;
                        z19 = z26;
                        bVar2 = aVar3;
                        z24 = z27;
                        rVar2 = aVar;
                    } else {
                        o0VarE.e();
                        bVar2 = bVar;
                        d0Var3 = d0Var2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        rVar2 = rVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                    }
                }
                i36 |= 196608;
                z17 = z15;
                i27 = i36 | 1572864;
                if ((12582912 & i14) == 0) {
                    if ((16777216 & i14) == 0) {
                        zR = o0VarE.B(this);
                    } else {
                        zR = o0VarE.r(this);
                    }
                    if (zR) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i27 |= i35;
                }
                if ((4793491 & i27) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    aVar = r.S;
                    if (i37 != 0) {
                        d0Var2 = null;
                    }
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    }
                    aVar2 = h4.d.f81522a;
                    aVar2.getClass();
                    aVar3 = h4.d.a.f81536n;
                    x1 x1Var6 = n.f135158a;
                    r rVarF6 = x2.f(aVar, 1.0f);
                    f14 = 16;
                    g6.f.a aVar10 = g6.f.f75994b;
                    r rVarThen6 = l.C(rVarF6, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                    i28 = i27 >> 12;
                    c2.j.f22691a.getClass();
                    i29 = i27;
                    zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                    z26 = z25;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarThen6, o0VarE);
                    h5.g.V.getClass();
                    aVar4 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    num4 = num2;
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
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var6 = b0.f22601a;
                    aVar2.getClass();
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(aVar, o0VarE);
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
                    u2 u2Var6 = u2.f22900a;
                    i30 = h82.c.f82429e;
                    if (z26) {
                        o0VarE.C(-2071764679);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071720070);
                            i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                            z29 = false;
                            o0VarE.g0(false);
                        } else {
                            z29 = false;
                            o0VarE.C(-2071642229);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z29);
                        z27 = z17;
                        num5 = num4;
                        i34 = z29;
                    } else {
                        o0VarE.C(-2071609307);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071568821);
                            boolean z39 = z17;
                            h(d0Var2, null, z39, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                            z27 = z39;
                            o0VarE.g0(false);
                        } else {
                            z27 = z17;
                            o0VarE.C(-2071476565);
                            o0VarE.g0(false);
                        }
                        if (num4 != null) {
                            o0VarE.C(-2071426314);
                            h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                            num5 = num4;
                            z28 = false;
                            o0VarE.g0(false);
                        } else {
                            num5 = num4;
                            z28 = false;
                            o0VarE.C(-2071344629);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z28);
                        i34 = z28;
                    }
                    float f110 = i34;
                    r rVarB6 = l.B(aVar, f14, f110, f110, f110);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarB6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    d0Var3 = d0Var2;
                    num3 = num5;
                    z19 = z26;
                    bVar2 = aVar3;
                    z24 = z27;
                    rVar2 = aVar;
                } else {
                    o0VarE.e();
                    bVar2 = bVar;
                    d0Var3 = d0Var2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    rVar2 = rVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                }
            }
            i36 |= 24576;
            z16 = z14;
            i25 = i15 & 32;
            if (i25 != 0) {
                if ((196608 & i14) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i36 |= i26;
                }
                i27 = i36 | 1572864;
                if ((12582912 & i14) == 0) {
                    if ((16777216 & i14) == 0) {
                        zR = o0VarE.B(this);
                    } else {
                        zR = o0VarE.r(this);
                    }
                    if (zR) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i27 |= i35;
                }
                if ((4793491 & i27) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    aVar = r.S;
                    if (i37 != 0) {
                        d0Var2 = null;
                    }
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    }
                    aVar2 = h4.d.f81522a;
                    aVar2.getClass();
                    aVar3 = h4.d.a.f81536n;
                    x1 x1Var7 = n.f135158a;
                    r rVarF7 = x2.f(aVar, 1.0f);
                    f14 = 16;
                    g6.f.a aVar11 = g6.f.f75994b;
                    r rVarThen7 = l.C(rVarF7, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                    i28 = i27 >> 12;
                    c2.j.f22691a.getClass();
                    i29 = i27;
                    zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                    z26 = z25;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarThen7, o0VarE);
                    h5.g.V.getClass();
                    aVar4 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    num4 = num2;
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
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var7 = b0.f22601a;
                    aVar2.getClass();
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(aVar, o0VarE);
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
                    u2 u2Var7 = u2.f22900a;
                    i30 = h82.c.f82429e;
                    if (z26) {
                        o0VarE.C(-2071764679);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071720070);
                            i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                            z29 = false;
                            o0VarE.g0(false);
                        } else {
                            z29 = false;
                            o0VarE.C(-2071642229);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z29);
                        z27 = z17;
                        num5 = num4;
                        i34 = z29;
                    } else {
                        o0VarE.C(-2071609307);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071568821);
                            boolean z310 = z17;
                            h(d0Var2, null, z310, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                            z27 = z310;
                            o0VarE.g0(false);
                        } else {
                            z27 = z17;
                            o0VarE.C(-2071476565);
                            o0VarE.g0(false);
                        }
                        if (num4 != null) {
                            o0VarE.C(-2071426314);
                            h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                            num5 = num4;
                            z28 = false;
                            o0VarE.g0(false);
                        } else {
                            num5 = num4;
                            z28 = false;
                            o0VarE.C(-2071344629);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z28);
                        i34 = z28;
                    }
                    float f111 = i34;
                    r rVarB7 = l.B(aVar, f14, f111, f111, f111);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarB7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    d0Var3 = d0Var2;
                    num3 = num5;
                    z19 = z26;
                    bVar2 = aVar3;
                    z24 = z27;
                    rVar2 = aVar;
                } else {
                    o0VarE.e();
                    bVar2 = bVar;
                    d0Var3 = d0Var2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    rVar2 = rVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                }
            }
            i36 |= 196608;
            z17 = z15;
            i27 = i36 | 1572864;
            if ((12582912 & i14) == 0) {
                if ((16777216 & i14) == 0) {
                    zR = o0VarE.B(this);
                } else {
                    zR = o0VarE.r(this);
                }
                if (zR) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i27 |= i35;
            }
            if ((4793491 & i27) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                aVar = r.S;
                if (i37 != 0) {
                    d0Var2 = null;
                }
                if (i17 != 0) {
                    num2 = null;
                }
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i25 != 0) {
                    z17 = true;
                }
                aVar2 = h4.d.f81522a;
                aVar2.getClass();
                aVar3 = h4.d.a.f81536n;
                x1 x1Var8 = n.f135158a;
                r rVarF8 = x2.f(aVar, 1.0f);
                f14 = 16;
                g6.f.a aVar12 = g6.f.f75994b;
                r rVarThen8 = l.C(rVarF8, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                i28 = i27 >> 12;
                c2.j.f22691a.getClass();
                i29 = i27;
                zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                z26 = z25;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarThen8, o0VarE);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                num4 = num2;
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
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var8 = b0.f22601a;
                aVar2.getClass();
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(aVar, o0VarE);
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
                u2 u2Var8 = u2.f22900a;
                i30 = h82.c.f82429e;
                if (z26) {
                    o0VarE.C(-2071764679);
                    if (d0Var2 != null) {
                        o0VarE.C(-2071720070);
                        i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                        z29 = false;
                        o0VarE.g0(false);
                    } else {
                        z29 = false;
                        o0VarE.C(-2071642229);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z29);
                    z27 = z17;
                    num5 = num4;
                    i34 = z29;
                } else {
                    o0VarE.C(-2071609307);
                    if (d0Var2 != null) {
                        o0VarE.C(-2071568821);
                        boolean z311 = z17;
                        h(d0Var2, null, z311, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                        z27 = z311;
                        o0VarE.g0(false);
                    } else {
                        z27 = z17;
                        o0VarE.C(-2071476565);
                        o0VarE.g0(false);
                    }
                    if (num4 != null) {
                        o0VarE.C(-2071426314);
                        h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                        num5 = num4;
                        z28 = false;
                        o0VarE.g0(false);
                    } else {
                        num5 = num4;
                        z28 = false;
                        o0VarE.C(-2071344629);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z28);
                    i34 = z28;
                }
                float f112 = i34;
                r rVarB8 = l.B(aVar, f14, f112, f112, f112);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, rVarB8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                o0VarE.g0(true);
                o0VarE.g0(true);
                d0Var3 = d0Var2;
                num3 = num5;
                z19 = z26;
                bVar2 = aVar3;
                z24 = z27;
                rVar2 = aVar;
            } else {
                o0VarE.e();
                bVar2 = bVar;
                d0Var3 = d0Var2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                rVar2 = rVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
            }
        }
        i36 = i16 | 432;
        d0Var2 = d0Var;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                num2 = num;
                if (o0VarE.B(num2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i36 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i36 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    if ((196608 & i14) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i36 |= i26;
                    }
                    i27 = i36 | 1572864;
                    if ((12582912 & i14) == 0) {
                        if ((16777216 & i14) == 0) {
                            zR = o0VarE.B(this);
                        } else {
                            zR = o0VarE.r(this);
                        }
                        if (zR) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i27 |= i35;
                    }
                    if ((4793491 & i27) != 4793490) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        aVar = r.S;
                        if (i37 != 0) {
                            d0Var2 = null;
                        }
                        if (i17 != 0) {
                            num2 = null;
                        }
                        if (i19 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        if (i25 != 0) {
                            z17 = true;
                        }
                        aVar2 = h4.d.f81522a;
                        aVar2.getClass();
                        aVar3 = h4.d.a.f81536n;
                        x1 x1Var9 = n.f135158a;
                        r rVarF9 = x2.f(aVar, 1.0f);
                        f14 = 16;
                        g6.f.a aVar13 = g6.f.f75994b;
                        r rVarThen9 = l.C(rVarF9, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                        i28 = i27 >> 12;
                        c2.j.f22691a.getClass();
                        i29 = i27;
                        zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                        z26 = z25;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = k.c(rVarThen9, o0VarE);
                        h5.g.V.getClass();
                        aVar4 = h5.g.a.f81805b;
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        num4 = num2;
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
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        b0 b0Var9 = b0.f22601a;
                        aVar2.getClass();
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(aVar, o0VarE);
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
                        u2 u2Var9 = u2.f22900a;
                        i30 = h82.c.f82429e;
                        if (z26) {
                            o0VarE.C(-2071764679);
                            if (d0Var2 != null) {
                                o0VarE.C(-2071720070);
                                i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                                z29 = false;
                                o0VarE.g0(false);
                            } else {
                                z29 = false;
                                o0VarE.C(-2071642229);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z29);
                            z27 = z17;
                            num5 = num4;
                            i34 = z29;
                        } else {
                            o0VarE.C(-2071609307);
                            if (d0Var2 != null) {
                                o0VarE.C(-2071568821);
                                boolean z312 = z17;
                                h(d0Var2, null, z312, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                                z27 = z312;
                                o0VarE.g0(false);
                            } else {
                                z27 = z17;
                                o0VarE.C(-2071476565);
                                o0VarE.g0(false);
                            }
                            if (num4 != null) {
                                o0VarE.C(-2071426314);
                                h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                                num5 = num4;
                                z28 = false;
                                o0VarE.g0(false);
                            } else {
                                num5 = num4;
                                z28 = false;
                                o0VarE.C(-2071344629);
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z28);
                            i34 = z28;
                        }
                        float f113 = i34;
                        r rVarB9 = l.B(aVar, f14, f113, f113, f113);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarB9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        d0Var3 = d0Var2;
                        num3 = num5;
                        z19 = z26;
                        bVar2 = aVar3;
                        z24 = z27;
                        rVar2 = aVar;
                    } else {
                        o0VarE.e();
                        bVar2 = bVar;
                        d0Var3 = d0Var2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        rVar2 = rVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                    }
                }
                i36 |= 196608;
                z17 = z15;
                i27 = i36 | 1572864;
                if ((12582912 & i14) == 0) {
                    if ((16777216 & i14) == 0) {
                        zR = o0VarE.B(this);
                    } else {
                        zR = o0VarE.r(this);
                    }
                    if (zR) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i27 |= i35;
                }
                if ((4793491 & i27) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    aVar = r.S;
                    if (i37 != 0) {
                        d0Var2 = null;
                    }
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    }
                    aVar2 = h4.d.f81522a;
                    aVar2.getClass();
                    aVar3 = h4.d.a.f81536n;
                    x1 x1Var10 = n.f135158a;
                    r rVarF10 = x2.f(aVar, 1.0f);
                    f14 = 16;
                    g6.f.a aVar14 = g6.f.f75994b;
                    r rVarThen10 = l.C(rVarF10, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                    i28 = i27 >> 12;
                    c2.j.f22691a.getClass();
                    i29 = i27;
                    zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                    z26 = z25;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarThen10, o0VarE);
                    h5.g.V.getClass();
                    aVar4 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    num4 = num2;
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
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var10 = b0.f22601a;
                    aVar2.getClass();
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(aVar, o0VarE);
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
                    u2 u2Var10 = u2.f22900a;
                    i30 = h82.c.f82429e;
                    if (z26) {
                        o0VarE.C(-2071764679);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071720070);
                            i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                            z29 = false;
                            o0VarE.g0(false);
                        } else {
                            z29 = false;
                            o0VarE.C(-2071642229);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z29);
                        z27 = z17;
                        num5 = num4;
                        i34 = z29;
                    } else {
                        o0VarE.C(-2071609307);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071568821);
                            boolean z313 = z17;
                            h(d0Var2, null, z313, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                            z27 = z313;
                            o0VarE.g0(false);
                        } else {
                            z27 = z17;
                            o0VarE.C(-2071476565);
                            o0VarE.g0(false);
                        }
                        if (num4 != null) {
                            o0VarE.C(-2071426314);
                            h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                            num5 = num4;
                            z28 = false;
                            o0VarE.g0(false);
                        } else {
                            num5 = num4;
                            z28 = false;
                            o0VarE.C(-2071344629);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z28);
                        i34 = z28;
                    }
                    float f114 = i34;
                    r rVarB10 = l.B(aVar, f14, f114, f114, f114);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarB10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    d0Var3 = d0Var2;
                    num3 = num5;
                    z19 = z26;
                    bVar2 = aVar3;
                    z24 = z27;
                    rVar2 = aVar;
                } else {
                    o0VarE.e();
                    bVar2 = bVar;
                    d0Var3 = d0Var2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    rVar2 = rVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                }
            }
            i36 |= 24576;
            z16 = z14;
            i25 = i15 & 32;
            if (i25 != 0) {
                if ((196608 & i14) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i36 |= i26;
                }
                i27 = i36 | 1572864;
                if ((12582912 & i14) == 0) {
                    if ((16777216 & i14) == 0) {
                        zR = o0VarE.B(this);
                    } else {
                        zR = o0VarE.r(this);
                    }
                    if (zR) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i27 |= i35;
                }
                if ((4793491 & i27) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    aVar = r.S;
                    if (i37 != 0) {
                        d0Var2 = null;
                    }
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    }
                    aVar2 = h4.d.f81522a;
                    aVar2.getClass();
                    aVar3 = h4.d.a.f81536n;
                    x1 x1Var11 = n.f135158a;
                    r rVarF11 = x2.f(aVar, 1.0f);
                    f14 = 16;
                    g6.f.a aVar15 = g6.f.f75994b;
                    r rVarThen11 = l.C(rVarF11, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                    i28 = i27 >> 12;
                    c2.j.f22691a.getClass();
                    i29 = i27;
                    zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                    z26 = z25;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarThen11, o0VarE);
                    h5.g.V.getClass();
                    aVar4 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    num4 = num2;
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
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var11 = b0.f22601a;
                    aVar2.getClass();
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(aVar, o0VarE);
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
                    u2 u2Var11 = u2.f22900a;
                    i30 = h82.c.f82429e;
                    if (z26) {
                        o0VarE.C(-2071764679);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071720070);
                            i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                            z29 = false;
                            o0VarE.g0(false);
                        } else {
                            z29 = false;
                            o0VarE.C(-2071642229);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z29);
                        z27 = z17;
                        num5 = num4;
                        i34 = z29;
                    } else {
                        o0VarE.C(-2071609307);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071568821);
                            boolean z314 = z17;
                            h(d0Var2, null, z314, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                            z27 = z314;
                            o0VarE.g0(false);
                        } else {
                            z27 = z17;
                            o0VarE.C(-2071476565);
                            o0VarE.g0(false);
                        }
                        if (num4 != null) {
                            o0VarE.C(-2071426314);
                            h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                            num5 = num4;
                            z28 = false;
                            o0VarE.g0(false);
                        } else {
                            num5 = num4;
                            z28 = false;
                            o0VarE.C(-2071344629);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z28);
                        i34 = z28;
                    }
                    float f115 = i34;
                    r rVarB11 = l.B(aVar, f14, f115, f115, f115);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarB11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    d0Var3 = d0Var2;
                    num3 = num5;
                    z19 = z26;
                    bVar2 = aVar3;
                    z24 = z27;
                    rVar2 = aVar;
                } else {
                    o0VarE.e();
                    bVar2 = bVar;
                    d0Var3 = d0Var2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    rVar2 = rVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                }
            }
            i36 |= 196608;
            z17 = z15;
            i27 = i36 | 1572864;
            if ((12582912 & i14) == 0) {
                if ((16777216 & i14) == 0) {
                    zR = o0VarE.B(this);
                } else {
                    zR = o0VarE.r(this);
                }
                if (zR) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i27 |= i35;
            }
            if ((4793491 & i27) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                aVar = r.S;
                if (i37 != 0) {
                    d0Var2 = null;
                }
                if (i17 != 0) {
                    num2 = null;
                }
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i25 != 0) {
                    z17 = true;
                }
                aVar2 = h4.d.f81522a;
                aVar2.getClass();
                aVar3 = h4.d.a.f81536n;
                x1 x1Var12 = n.f135158a;
                r rVarF12 = x2.f(aVar, 1.0f);
                f14 = 16;
                g6.f.a aVar16 = g6.f.f75994b;
                r rVarThen12 = l.C(rVarF12, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                i28 = i27 >> 12;
                c2.j.f22691a.getClass();
                i29 = i27;
                zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                z26 = z25;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarThen12, o0VarE);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                num4 = num2;
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
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var12 = b0.f22601a;
                aVar2.getClass();
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(aVar, o0VarE);
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
                u2 u2Var12 = u2.f22900a;
                i30 = h82.c.f82429e;
                if (z26) {
                    o0VarE.C(-2071764679);
                    if (d0Var2 != null) {
                        o0VarE.C(-2071720070);
                        i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                        z29 = false;
                        o0VarE.g0(false);
                    } else {
                        z29 = false;
                        o0VarE.C(-2071642229);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z29);
                    z27 = z17;
                    num5 = num4;
                    i34 = z29;
                } else {
                    o0VarE.C(-2071609307);
                    if (d0Var2 != null) {
                        o0VarE.C(-2071568821);
                        boolean z315 = z17;
                        h(d0Var2, null, z315, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                        z27 = z315;
                        o0VarE.g0(false);
                    } else {
                        z27 = z17;
                        o0VarE.C(-2071476565);
                        o0VarE.g0(false);
                    }
                    if (num4 != null) {
                        o0VarE.C(-2071426314);
                        h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                        num5 = num4;
                        z28 = false;
                        o0VarE.g0(false);
                    } else {
                        num5 = num4;
                        z28 = false;
                        o0VarE.C(-2071344629);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z28);
                    i34 = z28;
                }
                float f116 = i34;
                r rVarB12 = l.B(aVar, f14, f116, f116, f116);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, rVarB12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                o0VarE.g0(true);
                o0VarE.g0(true);
                d0Var3 = d0Var2;
                num3 = num5;
                z19 = z26;
                bVar2 = aVar3;
                z24 = z27;
                rVar2 = aVar;
            } else {
                o0VarE.e();
                bVar2 = bVar;
                d0Var3 = d0Var2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                rVar2 = rVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
            }
        }
        i36 |= 3072;
        num2 = num;
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((i14 & 24576) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i36 |= i24;
            }
            i25 = i15 & 32;
            if (i25 != 0) {
                if ((196608 & i14) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i36 |= i26;
                }
                i27 = i36 | 1572864;
                if ((12582912 & i14) == 0) {
                    if ((16777216 & i14) == 0) {
                        zR = o0VarE.B(this);
                    } else {
                        zR = o0VarE.r(this);
                    }
                    if (zR) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i27 |= i35;
                }
                if ((4793491 & i27) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    aVar = r.S;
                    if (i37 != 0) {
                        d0Var2 = null;
                    }
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        z17 = true;
                    }
                    aVar2 = h4.d.f81522a;
                    aVar2.getClass();
                    aVar3 = h4.d.a.f81536n;
                    x1 x1Var13 = n.f135158a;
                    r rVarF13 = x2.f(aVar, 1.0f);
                    f14 = 16;
                    g6.f.a aVar17 = g6.f.f75994b;
                    r rVarThen13 = l.C(rVarF13, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                    i28 = i27 >> 12;
                    c2.j.f22691a.getClass();
                    i29 = i27;
                    zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                    z26 = z25;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarThen13, o0VarE);
                    h5.g.V.getClass();
                    aVar4 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    num4 = num2;
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
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var13 = b0.f22601a;
                    aVar2.getClass();
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(aVar, o0VarE);
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
                    u2 u2Var13 = u2.f22900a;
                    i30 = h82.c.f82429e;
                    if (z26) {
                        o0VarE.C(-2071764679);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071720070);
                            i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                            z29 = false;
                            o0VarE.g0(false);
                        } else {
                            z29 = false;
                            o0VarE.C(-2071642229);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z29);
                        z27 = z17;
                        num5 = num4;
                        i34 = z29;
                    } else {
                        o0VarE.C(-2071609307);
                        if (d0Var2 != null) {
                            o0VarE.C(-2071568821);
                            boolean z316 = z17;
                            h(d0Var2, null, z316, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                            z27 = z316;
                            o0VarE.g0(false);
                        } else {
                            z27 = z17;
                            o0VarE.C(-2071476565);
                            o0VarE.g0(false);
                        }
                        if (num4 != null) {
                            o0VarE.C(-2071426314);
                            h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                            num5 = num4;
                            z28 = false;
                            o0VarE.g0(false);
                        } else {
                            num5 = num4;
                            z28 = false;
                            o0VarE.C(-2071344629);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z28);
                        i34 = z28;
                    }
                    float f117 = i34;
                    r rVarB13 = l.B(aVar, f14, f117, f117, f117);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarB13, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    d0Var3 = d0Var2;
                    num3 = num5;
                    z19 = z26;
                    bVar2 = aVar3;
                    z24 = z27;
                    rVar2 = aVar;
                } else {
                    o0VarE.e();
                    bVar2 = bVar;
                    d0Var3 = d0Var2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    rVar2 = rVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
                }
            }
            i36 |= 196608;
            z17 = z15;
            i27 = i36 | 1572864;
            if ((12582912 & i14) == 0) {
                if ((16777216 & i14) == 0) {
                    zR = o0VarE.B(this);
                } else {
                    zR = o0VarE.r(this);
                }
                if (zR) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i27 |= i35;
            }
            if ((4793491 & i27) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                aVar = r.S;
                if (i37 != 0) {
                    d0Var2 = null;
                }
                if (i17 != 0) {
                    num2 = null;
                }
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i25 != 0) {
                    z17 = true;
                }
                aVar2 = h4.d.f81522a;
                aVar2.getClass();
                aVar3 = h4.d.a.f81536n;
                x1 x1Var14 = n.f135158a;
                r rVarF14 = x2.f(aVar, 1.0f);
                f14 = 16;
                g6.f.a aVar18 = g6.f.f75994b;
                r rVarThen14 = l.C(rVarF14, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                i28 = i27 >> 12;
                c2.j.f22691a.getClass();
                i29 = i27;
                zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                z26 = z25;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarThen14, o0VarE);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                num4 = num2;
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
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var14 = b0.f22601a;
                aVar2.getClass();
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(aVar, o0VarE);
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
                u2 u2Var14 = u2.f22900a;
                i30 = h82.c.f82429e;
                if (z26) {
                    o0VarE.C(-2071764679);
                    if (d0Var2 != null) {
                        o0VarE.C(-2071720070);
                        i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                        z29 = false;
                        o0VarE.g0(false);
                    } else {
                        z29 = false;
                        o0VarE.C(-2071642229);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z29);
                    z27 = z17;
                    num5 = num4;
                    i34 = z29;
                } else {
                    o0VarE.C(-2071609307);
                    if (d0Var2 != null) {
                        o0VarE.C(-2071568821);
                        boolean z317 = z17;
                        h(d0Var2, null, z317, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                        z27 = z317;
                        o0VarE.g0(false);
                    } else {
                        z27 = z17;
                        o0VarE.C(-2071476565);
                        o0VarE.g0(false);
                    }
                    if (num4 != null) {
                        o0VarE.C(-2071426314);
                        h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                        num5 = num4;
                        z28 = false;
                        o0VarE.g0(false);
                    } else {
                        num5 = num4;
                        z28 = false;
                        o0VarE.C(-2071344629);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z28);
                    i34 = z28;
                }
                float f118 = i34;
                r rVarB14 = l.B(aVar, f14, f118, f118, f118);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, rVarB14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                o0VarE.g0(true);
                o0VarE.g0(true);
                d0Var3 = d0Var2;
                num3 = num5;
                z19 = z26;
                bVar2 = aVar3;
                z24 = z27;
                rVar2 = aVar;
            } else {
                o0VarE.e();
                bVar2 = bVar;
                d0Var3 = d0Var2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                rVar2 = rVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
            }
        }
        i36 |= 24576;
        z16 = z14;
        i25 = i15 & 32;
        if (i25 != 0) {
            if ((196608 & i14) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i36 |= i26;
            }
            i27 = i36 | 1572864;
            if ((12582912 & i14) == 0) {
                if ((16777216 & i14) == 0) {
                    zR = o0VarE.B(this);
                } else {
                    zR = o0VarE.r(this);
                }
                if (zR) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i27 |= i35;
            }
            if ((4793491 & i27) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                aVar = r.S;
                if (i37 != 0) {
                    d0Var2 = null;
                }
                if (i17 != 0) {
                    num2 = null;
                }
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i25 != 0) {
                    z17 = true;
                }
                aVar2 = h4.d.f81522a;
                aVar2.getClass();
                aVar3 = h4.d.a.f81536n;
                x1 x1Var15 = n.f135158a;
                r rVarF15 = x2.f(aVar, 1.0f);
                f14 = 16;
                g6.f.a aVar19 = g6.f.f75994b;
                r rVarThen15 = l.C(rVarF15, f14, f14, 0.0f, 0.0f, 12).then(aVar);
                i28 = i27 >> 12;
                c2.j.f22691a.getClass();
                i29 = i27;
                zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
                z26 = z25;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarThen15, o0VarE);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                num4 = num2;
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
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var15 = b0.f22601a;
                aVar2.getClass();
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(aVar, o0VarE);
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
                u2 u2Var15 = u2.f22900a;
                i30 = h82.c.f82429e;
                if (z26) {
                    o0VarE.C(-2071764679);
                    if (d0Var2 != null) {
                        o0VarE.C(-2071720070);
                        i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                        z29 = false;
                        o0VarE.g0(false);
                    } else {
                        z29 = false;
                        o0VarE.C(-2071642229);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z29);
                    z27 = z17;
                    num5 = num4;
                    i34 = z29;
                } else {
                    o0VarE.C(-2071609307);
                    if (d0Var2 != null) {
                        o0VarE.C(-2071568821);
                        boolean z318 = z17;
                        h(d0Var2, null, z318, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                        z27 = z318;
                        o0VarE.g0(false);
                    } else {
                        z27 = z17;
                        o0VarE.C(-2071476565);
                        o0VarE.g0(false);
                    }
                    if (num4 != null) {
                        o0VarE.C(-2071426314);
                        h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                        num5 = num4;
                        z28 = false;
                        o0VarE.g0(false);
                    } else {
                        num5 = num4;
                        z28 = false;
                        o0VarE.C(-2071344629);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z28);
                    i34 = z28;
                }
                float f119 = i34;
                r rVarB15 = l.B(aVar, f14, f119, f119, f119);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, rVarB15, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
                o0VarE.g0(true);
                o0VarE.g0(true);
                d0Var3 = d0Var2;
                num3 = num5;
                z19 = z26;
                bVar2 = aVar3;
                z24 = z27;
                rVar2 = aVar;
            } else {
                o0VarE.e();
                bVar2 = bVar;
                d0Var3 = d0Var2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                rVar2 = rVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
            }
        }
        i36 |= 196608;
        z17 = z15;
        i27 = i36 | 1572864;
        if ((12582912 & i14) == 0) {
            if ((16777216 & i14) == 0) {
                zR = o0VarE.B(this);
            } else {
                zR = o0VarE.r(this);
            }
            if (zR) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i27 |= i35;
        }
        if ((4793491 & i27) != 4793490) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i27 & 1, z18)) {
            aVar = r.S;
            if (i37 != 0) {
                d0Var2 = null;
            }
            if (i17 != 0) {
                num2 = null;
            }
            if (i19 != 0) {
                z25 = false;
            } else {
                z25 = z16;
            }
            if (i25 != 0) {
                z17 = true;
            }
            aVar2 = h4.d.f81522a;
            aVar2.getClass();
            aVar3 = h4.d.a.f81536n;
            x1 x1Var16 = n.f135158a;
            r rVarF16 = x2.f(aVar, 1.0f);
            f14 = 16;
            g6.f.a aVar110 = g6.f.f75994b;
            r rVarThen16 = l.C(rVarF16, f14, f14, 0.0f, 0.0f, 12).then(aVar);
            i28 = i27 >> 12;
            c2.j.f22691a.getClass();
            i29 = i27;
            zVarA = y.a(c2.j.f22694d, aVar3, o0VarE, ((i28 & 896) >> 3) & 112);
            z26 = z25;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarThen16, o0VarE);
            h5.g.V.getClass();
            aVar4 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            num4 = num2;
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
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var16 = b0.f22601a;
            aVar2.getClass();
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(aVar, o0VarE);
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
            u2 u2Var16 = u2.f22900a;
            i30 = h82.c.f82429e;
            if (z26) {
                o0VarE.C(-2071764679);
                if (d0Var2 != null) {
                    o0VarE.C(-2071720070);
                    i(d0Var2.f128833a, o0VarE, (i30 << 3) | ((i29 >> 6) & 14) | ((i29 >> 18) & 112));
                    z29 = false;
                    o0VarE.g0(false);
                } else {
                    z29 = false;
                    o0VarE.C(-2071642229);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z29);
                z27 = z17;
                num5 = num4;
                i34 = z29;
            } else {
                o0VarE.C(-2071609307);
                if (d0Var2 != null) {
                    o0VarE.C(-2071568821);
                    boolean z319 = z17;
                    h(d0Var2, null, z319, o0VarE, ((i29 >> 6) & 14) | ((i29 >> 9) & 896) | (i30 << 9) | (i28 & 7168), 2);
                    z27 = z319;
                    o0VarE.g0(false);
                } else {
                    z27 = z17;
                    o0VarE.C(-2071476565);
                    o0VarE.g0(false);
                }
                if (num4 != null) {
                    o0VarE.C(-2071426314);
                    h(null, num4, false, o0VarE, (i30 << 9) | ((i29 >> 6) & 112) | (i28 & 7168), 5);
                    num5 = num4;
                    z28 = false;
                    o0VarE.g0(false);
                } else {
                    num5 = num4;
                    z28 = false;
                    o0VarE.C(-2071344629);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z28);
                i34 = z28;
            }
            float f1110 = i34;
            r rVarB16 = l.B(aVar, f14, f1110, f1110, f1110);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, rVarB16, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i29 & 14) | 48, 0, 131068);
            o0VarE.g0(true);
            o0VarE.g0(true);
            d0Var3 = d0Var2;
            num3 = num5;
            z19 = z26;
            bVar2 = aVar3;
            z24 = z27;
            rVar2 = aVar;
        } else {
            o0VarE.e();
            bVar2 = bVar;
            d0Var3 = d0Var2;
            num3 = num2;
            z19 = z16;
            z24 = z17;
            rVar2 = rVar;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, str, rVar2, d0Var3, num3, z19, z24, bVar2, i14, i15);
        }
    }

    public final void k(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1456994787);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-1131823824, new c(this, 6), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 2);
        }
    }

    public final void l(m mVar, int i14) {
        o0 o0VarE = mVar.E(-86577758);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(1130080879, new c(this, 7), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 3);
        }
    }

    public final void m(m mVar, int i14) {
        o0 o0VarE = mVar.E(1257728208);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(84145252, new c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 1);
        }
    }

    public final void n(m mVar, int i14) {
        o0 o0VarE = mVar.E(1107652531);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            ix0.a.f95672a.getClass();
            h82.e.a(ix0.a.f95674c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, i14, 4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lix0/i$a;", "", "<init>", "()V", "", "ABOUT_MENSTRUAL_CYCLES", "Ljava/lang/String;", "CYCLE_TYPES_AND_PREDICTIONS", "PREGNANCY_TRACKING", "CALENDAR_LEGEND", "MAYO_CLINIC_HELP_LINK", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
