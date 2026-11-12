package com.garmin.android.apps.connectmobile.performance.stats.improvement;

import android.content.Context;
import android.os.Bundle;
import c2.b0;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import c22.v1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.z0;
import gl1.y;
import h4.g;
import h4.r;
import h5.e0;
import i3.mh;
import i3.tb;
import java.util.List;
import k2.i;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
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
import v.h;
import w61.j;
import w61.k;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/c;", "Lh82/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends h82.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f40122j = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40126i;

    public c() {
        f40122j.getClass();
        this.f40124g = bo1.a.a().c().S();
        this.f40125h = bo1.a.a().c().e();
        this.f40126i = bo1.a.a().c().N();
    }

    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(28163455);
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
            this.f40123f = bundle.getInt("NO_OF_PRIMARY_TRAINING_DEVICE", 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, bundle, i14, 7);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new e(-630995949, true, new j(this, 6)), 4, null), new h82.c.b("RECEIVE_ACTION", context.getString(R.string.gcm_receiving_training_status), null, new e(518836338, true, new j(this, 15)), 4, null), new h82.c.b("TRAINING_STATUS_ABOUT_ACTION", context.getString(R.string.gcm_training_status_about_title), null, new e(1668668625, true, new j(this, 16)), 4, null), new h82.c.b("PRIMARY_TRAINING_DEVICE_ACTION", context.getString(R.string.primary_training_device), null, new e(-1476466384, true, new j(this, 17)), 4, null), new h82.c.b("VO2_MAX_ACTION", context.getString(R.string.lbl_help), null, new e(-326634097, true, new j(this, 18)), 4, null), new h82.c.b("WHAT_IS_VO2_MAX_ACTION", context.getString(R.string.lbl_what_is_vo2_max), null, new e(823198190, true, new j(this, 0)), 4, null), new h82.c.b("HOW_TO_GET_VO2_MAX_ACTION", context.getString(R.string.lbl_how_to_get_vo2_max), null, new e(1973030477, true, new j(this, 1)), 4, null), new h82.c.b("HRV_STATUS", context.getString(R.string.ohrv_status), null, new e(-1172104532, true, new j(this, 2)), 4, null), new h82.c.b("LOAD_FOCUS_ACTION", context.getString(R.string.gcm_training_status_training_load_focus), null, new e(-22272245, true, new j(this, 3)), 4, null), new h82.c.b("HEAT_ACTION", context.getString(R.string.lbl_heat_acclimation), null, new e(1127560042, true, new j(this, 4)), 4, null), new h82.c.b("ALTITUDE_ACTION", context.getString(R.string.lbl_altitude_acclimation), null, new e(-1687875646, true, new j(this, 10)), 4, null), new h82.c.b("SEVEN_DAY_ACTION", context.getString(R.string.gcm_training_status_acute_training_load), null, new e(-538043359, true, new j(this, 12)), 4, null), new h82.c.b("ACUTE_ACTION", context.getString(R.string.lbl_training_load), null, new e(611788928, true, new j(this, 13)), 4, null), new h82.c.b("ACUTE_CHRONIC_WORKLOAD_ACTION", context.getString(R.string.lbl_training_load), null, new e(1761621215, true, new j(this, 14)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-930753491);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (this.f40125h && this.f40126i) {
                z14 = true;
            }
            h82.e.a(f.c(1650732544, new tb(z14, this, 5), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 9);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1238929403);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w61.a.f183133a.getClass();
            h82.e.a(w61.a.f183140h, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 13);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(-364122625);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w61.a.f183133a.getClass();
            h82.e.a(w61.a.f183138f, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 8);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(164118951);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w61.a.f183133a.getClass();
            h82.e.a(w61.a.f183141i, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void k(final int i14, final long j8, boolean z14, m mVar, final int i15, final int i16) {
        boolean z15;
        boolean z16;
        final boolean z17;
        p2 p2VarI0;
        boolean z18;
        r.a aVar;
        g gVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        z0 z0VarD2;
        boolean z19;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        boolean z24;
        o0 o0VarE = mVar.E(-1635564139);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.l(j8) ? 32 : 16);
        int i18 = i16 & 4;
        if (i18 == 0) {
            if ((i15 & 384) == 0) {
                z15 = z14;
                i17 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i18 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                x1 x1Var = n.f135158a;
                aVar = r.S;
                g6.f.a aVar3 = g6.f.f75994b;
                r rVarA = l.A(aVar, 16, 0.0f, 2);
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81524b;
                z0VarD = q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    cVar = cVar2;
                } else {
                    cVar = cVar2;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    u uVar = u.f22885a;
                    r rVarC3 = l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
                    z0VarD2 = q.d(gVar, false);
                    z19 = z18;
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC3, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    if (z19) {
                        o0VarE.C(-171621250);
                        q.a(u1.n.e(l4.k.b(x2.q(aVar, 7), i.f102406a), j8, m1.f128891a), o0VarE, 0);
                        o0VarE.g0(false);
                        z24 = true;
                    } else {
                        o0VarE.C(-171320984);
                        r rVarQ = x2.q(aVar, 7);
                        k2.h hVar = i.f102406a;
                        z24 = true;
                        q.a(u1.q.b(1, j8, l4.k.b(rVarQ, hVar), hVar), o0VarE, 0);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z24);
                    String strQ = y.Q(o0VarE, i14);
                    j92.f.f97924a.getClass();
                    mh.c(strQ, l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
                    o0VarE.g0(z24);
                    z17 = z19;
                }
                h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u uVar2 = u.f22885a;
                r rVarC4 = l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
                z0VarD2 = q.d(gVar, false);
                z19 = z18;
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (z19) {
                    o0VarE.C(-171621250);
                    q.a(u1.n.e(l4.k.b(x2.q(aVar, 7), i.f102406a), j8, m1.f128891a), o0VarE, 0);
                    o0VarE.g0(false);
                    z24 = true;
                } else {
                    o0VarE.C(-171320984);
                    r rVarQ2 = x2.q(aVar, 7);
                    k2.h hVar2 = i.f102406a;
                    z24 = true;
                    q.a(u1.q.b(1, j8, l4.k.b(rVarQ2, hVar2), hVar2), o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z24);
                String strQ2 = y.Q(o0VarE, i14);
                j92.f.f97924a.getClass();
                mh.c(strQ2, l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
                o0VarE.g0(z24);
                z17 = z19;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: w61.m
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                        this.f183217a.k(i14, j8, z17, mVar2, p3.p0.t(i15 | 1), i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 384;
        z15 = z14;
        if ((i17 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            if (i18 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = n.f135158a;
            aVar = r.S;
            g6.f.a aVar4 = g6.f.f75994b;
            r rVarA2 = l.A(aVar, 16, 0.0f, 2);
            h4.d.f81522a.getClass();
            gVar = h4.d.a.f81524b;
            z0VarD = q.d(gVar, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u uVar3 = u.f22885a;
                r rVarC5 = l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
                z0VarD2 = q.d(gVar, false);
                z19 = z18;
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (z19) {
                    o0VarE.C(-171621250);
                    q.a(u1.n.e(l4.k.b(x2.q(aVar, 7), i.f102406a), j8, m1.f128891a), o0VarE, 0);
                    o0VarE.g0(false);
                    z24 = true;
                } else {
                    o0VarE.C(-171320984);
                    r rVarQ3 = x2.q(aVar, 7);
                    k2.h hVar3 = i.f102406a;
                    z24 = true;
                    q.a(u1.q.b(1, j8, l4.k.b(rVarQ3, hVar3), hVar3), o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z24);
                String strQ3 = y.Q(o0VarE, i14);
                j92.f.f97924a.getClass();
                mh.c(strQ3, l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
                o0VarE.g0(z24);
                z17 = z19;
            } else {
                cVar = cVar2;
            }
            h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar4 = u.f22885a;
            r rVarC6 = l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
            z0VarD2 = q.d(gVar, false);
            z19 = z18;
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC6, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (z19) {
                o0VarE.C(-171621250);
                q.a(u1.n.e(l4.k.b(x2.q(aVar, 7), i.f102406a), j8, m1.f128891a), o0VarE, 0);
                o0VarE.g0(false);
                z24 = true;
            } else {
                o0VarE.C(-171320984);
                r rVarQ4 = x2.q(aVar, 7);
                k2.h hVar4 = i.f102406a;
                z24 = true;
                q.a(u1.q.b(1, j8, l4.k.b(rVarQ4, hVar4), hVar4), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(z24);
            String strQ4 = y.Q(o0VarE, i14);
            j92.f.f97924a.getClass();
            mh.c(strQ4, l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
            o0VarE.g0(z24);
            z17 = z19;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: w61.m
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                    this.f183217a.k(i14, j8, z17, mVar2, p3.p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void l(final int i14, final int i15, final int i16, final int i17, final long j8, m mVar, boolean z14) {
        boolean z15;
        final boolean z16;
        o0 o0VarE = mVar.E(15830740);
        int i18 = (o0VarE.k(i14) ? 4 : 2) | i16 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        int i19 = i17 & 8;
        if (i19 != 0) {
            i18 |= 3072;
            z15 = z14;
        } else if ((i16 & 3072) == 0) {
            z15 = z14;
            i18 |= o0VarE.h(z15) ? 2048 : 1024;
        } else {
            z15 = z14;
        }
        int i24 = i18 | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i24 & 1, (i24 & 9363) != 9362)) {
            boolean z17 = i19 != 0 ? true : z15;
            x1 x1Var = n.f135158a;
            m(i24 & 65408, 0, j8, y.Q(o0VarE, i14), y.Q(o0VarE, i15), o0VarE, z17);
            z16 = z17;
        } else {
            o0VarE.e();
            z16 = z15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: w61.n
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                    this.f183224a.l(i14, i15, p3.p0.t(i16 | 1), i17, j8, mVar2, z16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0171  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x0229  */
    /* JADX WARN: Code duplicated, block: B:79:0x0233  */
    /* JADX WARN: Code duplicated, block: B:81:0x0286  */
    /* JADX WARN: Code duplicated, block: B:83:0x028a  */
    /* JADX WARN: Code duplicated, block: B:85:0x028e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0292  */
    /* JADX WARN: Code duplicated, block: B:90:0x029c  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public final void m(int i14, int i15, long j8, String str, String str2, m mVar, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17;
        p2 p2VarI0;
        boolean z18;
        r.a aVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        int i16;
        h5.g.a.f fVar;
        float f14;
        g gVar;
        boolean z19;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        z0 z0VarD2;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        boolean z24;
        boolean z25;
        boolean z26;
        o0 o0VarE = mVar.E(1118488186);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.l(j8) ? 256 : 128;
        }
        int i18 = i15 & 8;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i17 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i17 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i18 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                x1 x1Var = n.f135158a;
                aVar = r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    i16 = i17;
                } else {
                    i16 = i17;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    f14 = 16;
                    g6.f.a aVar3 = g6.f.f75994b;
                    r rVarA = l.A(aVar, f14, 0.0f, 2);
                    gVar = h4.d.a.f81524b;
                    z19 = z18;
                    z0VarD = q.d(gVar, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarA, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u uVar = u.f22885a;
                    r rVarC4 = l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
                    z0VarD2 = q.d(gVar, false);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarC4, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD2, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    if (z19) {
                        o0VarE.C(-571613031);
                        q.a(u1.n.e(l4.k.b(x2.q(aVar, 12), i.a(3)), j8, m1.f128891a), o0VarE, 0);
                        o0VarE.g0(false);
                        z24 = true;
                        z25 = false;
                    } else {
                        o0VarE.C(-571266637);
                        z24 = true;
                        z25 = false;
                        q.a(u1.q.b(1, j8, l4.k.b(x2.q(aVar, 12), i.a(3)), i.f102406a), o0VarE, 0);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z24);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    z26 = z25;
                    mh.c(str, l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i16 & 14) | 48, 0, 131068);
                    o0VarE.g0(z24);
                    if (str2 == null) {
                        o0VarE.C(799511985);
                        o0VarE.g0(z26);
                    } else {
                        o0VarE.C(799511986);
                        j92.f.f97924a.getClass();
                        mh.c(str2, l.C(aVar, 36, 0.0f, f14, f14, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
                        Unit unit = Unit.INSTANCE;
                        o0VarE.g0(z26);
                    }
                    o0VarE.g0(z24);
                    z17 = z19;
                }
                h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                f14 = 16;
                g6.f.a aVar4 = g6.f.f75994b;
                r rVarA2 = l.A(aVar, f14, 0.0f, 2);
                gVar = h4.d.a.f81524b;
                z19 = z18;
                z0VarD = q.d(gVar, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u uVar2 = u.f22885a;
                r rVarC5 = l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
                z0VarD2 = q.d(gVar, false);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarC5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                if (z19) {
                    o0VarE.C(-571613031);
                    q.a(u1.n.e(l4.k.b(x2.q(aVar, 12), i.a(3)), j8, m1.f128891a), o0VarE, 0);
                    o0VarE.g0(false);
                    z24 = true;
                    z25 = false;
                } else {
                    o0VarE.C(-571266637);
                    z24 = true;
                    z25 = false;
                    q.a(u1.q.b(1, j8, l4.k.b(x2.q(aVar, 12), i.a(3)), i.f102406a), o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z24);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                z26 = z25;
                mh.c(str, l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i16 & 14) | 48, 0, 131068);
                o0VarE.g0(z24);
                if (str2 == null) {
                    o0VarE.C(799511985);
                    o0VarE.g0(z26);
                } else {
                    o0VarE.C(799511986);
                    j92.f.f97924a.getClass();
                    mh.c(str2, l.C(aVar, 36, 0.0f, f14, f14, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarE.g0(z26);
                }
                o0VarE.g0(z24);
                z17 = z19;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v1(this, str, str2, j8, z17, i14, i15);
            }
        }
        i17 |= 3072;
        z15 = z14;
        if ((i17 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            if (i18 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = n.f135158a;
            aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                i16 = i17;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var3 = b0.f22601a;
                f14 = 16;
                g6.f.a aVar5 = g6.f.f75994b;
                r rVarA3 = l.A(aVar, f14, 0.0f, 2);
                gVar = h4.d.a.f81524b;
                z19 = z18;
                z0VarD = q.d(gVar, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u uVar3 = u.f22885a;
                r rVarC6 = l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
                z0VarD2 = q.d(gVar, false);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarC6, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                if (z19) {
                    o0VarE.C(-571613031);
                    q.a(u1.n.e(l4.k.b(x2.q(aVar, 12), i.a(3)), j8, m1.f128891a), o0VarE, 0);
                    o0VarE.g0(false);
                    z24 = true;
                    z25 = false;
                } else {
                    o0VarE.C(-571266637);
                    z24 = true;
                    z25 = false;
                    q.a(u1.q.b(1, j8, l4.k.b(x2.q(aVar, 12), i.a(3)), i.f102406a), o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z24);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                z26 = z25;
                mh.c(str, l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i16 & 14) | 48, 0, 131068);
                o0VarE.g0(z24);
                if (str2 == null) {
                    o0VarE.C(799511985);
                    o0VarE.g0(z26);
                } else {
                    o0VarE.C(799511986);
                    j92.f.f97924a.getClass();
                    mh.c(str2, l.C(aVar, 36, 0.0f, f14, f14, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
                    Unit unit3 = Unit.INSTANCE;
                    o0VarE.g0(z26);
                }
                o0VarE.g0(z24);
                z17 = z19;
            } else {
                i16 = i17;
            }
            h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var4 = b0.f22601a;
            f14 = 16;
            g6.f.a aVar6 = g6.f.f75994b;
            r rVarA4 = l.A(aVar, f14, 0.0f, 2);
            gVar = h4.d.a.f81524b;
            z19 = z18;
            z0VarD = q.d(gVar, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u uVar4 = u.f22885a;
            r rVarC7 = l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
            z0VarD2 = q.d(gVar, false);
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = h4.k.c(rVarC7, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            } else {
                h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            if (z19) {
                o0VarE.C(-571613031);
                q.a(u1.n.e(l4.k.b(x2.q(aVar, 12), i.a(3)), j8, m1.f128891a), o0VarE, 0);
                o0VarE.g0(false);
                z24 = true;
                z25 = false;
            } else {
                o0VarE.C(-571266637);
                z24 = true;
                z25 = false;
                q.a(u1.q.b(1, j8, l4.k.b(x2.q(aVar, 12), i.a(3)), i.f102406a), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(z24);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            z26 = z25;
            mh.c(str, l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i16 & 14) | 48, 0, 131068);
            o0VarE.g0(z24);
            if (str2 == null) {
                o0VarE.C(799511985);
                o0VarE.g0(z26);
            } else {
                o0VarE.C(799511986);
                j92.f.f97924a.getClass();
                mh.c(str2, l.C(aVar, 36, 0.0f, f14, f14, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
                Unit unit4 = Unit.INSTANCE;
                o0VarE.g0(z26);
            }
            o0VarE.g0(z24);
            z17 = z19;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v1(this, str, str2, j8, z17, i14, i15);
        }
    }

    public final void n(m mVar, int i14) {
        o0 o0VarE = mVar.E(-732044417);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 11;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(-406873454, new j(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 11);
        }
    }

    public final void o(m mVar, int i14) {
        o0 o0VarE = mVar.E(752608589);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w61.a.f183133a.getClass();
            h82.e.a(w61.a.f183137e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 3);
        }
    }

    public final void p(m mVar, int i14) {
        o0 o0VarE = mVar.E(487516435);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w61.a.f183133a.getClass();
            h82.e.a(w61.a.f183134b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 2);
        }
    }

    public final void q(m mVar, int i14) {
        o0 o0VarE = mVar.E(325129555);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w61.a.f183133a.getClass();
            h82.e.a(w61.a.f183136d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 6);
        }
    }

    public final void r(m mVar, int i14) {
        o0 o0VarE = mVar.E(976965939);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w61.a.f183133a.getClass();
            h82.e.a(w61.a.f183135c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 12);
        }
    }

    public final void s(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1026571612);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(189407863, new j(this, 5), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 0);
        }
    }

    public final void t(m mVar, int i14) {
        o0 o0VarE = mVar.E(1935899031);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(f.c(-353847677, new j(this, 8), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 7);
        }
    }

    public final void u(m mVar, int i14) {
        o0 o0VarE = mVar.E(106520261);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w61.a.f183133a.getClass();
            h82.e.a(w61.a.f183139g, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 5);
        }
    }

    public final void v(m mVar, int i14) {
        o0 o0VarE = mVar.E(-75355576);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(656606229, new j(this, 9), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 10);
        }
    }

    public final void w(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1443886730);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(573019523, new j(this, 7), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/c$a;", "", "<init>", "()V", "", "LINK_FRONTIERS_PUBLIC_HEALTH", "Ljava/lang/String;", "LINK_COOPER_INSTITUTE", "HRV_STATUS", "VO2_MAX_ACTION", "WHAT_IS_VO2_MAX_ACTION", "HOW_TO_GET_VO2_MAX_ACTION", "TRAINING_STATUS_ABOUT_ACTION", "PRIMARY_TRAINING_DEVICE_ACTION", "RECEIVE_ACTION", "LOAD_FOCUS_ACTION", "HEAT_ACTION", "ALTITUDE_ACTION", "SEVEN_DAY_ACTION", "ACUTE_ACTION", "ACUTE_CHRONIC_WORKLOAD_ACTION", "NO_OF_PRIMARY_TRAINING_DEVICE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Bundle a(a aVar, int i14) {
            aVar.getClass();
            h82.c.f82428d.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ACTION", null);
            bundle.putInt("NO_OF_PRIMARY_TRAINING_DEVICE", i14);
            return bundle;
        }

        private a() {
        }
    }
}
