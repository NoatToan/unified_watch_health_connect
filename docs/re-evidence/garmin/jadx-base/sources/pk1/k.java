package pk1;

import android.content.Context;
import android.os.Bundle;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h5.e0;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpk1/k;", "Lh82/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f138297g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f138298f;

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-626348793);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 16;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f138298f = bundle.getBoolean("EXTRA_INDEX_BPM", false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(this, bundle, i14, i16);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1956202651, true, new i(this, 0)), 4, null), new h82.c.b("PERSONAL_INFORMATION", context.getString(R.string.personal_info_title_help), null, new z3.e(-228073286, true, new i(this, 1)), 4, null), new h82.c.b("ACTIVITY_CLASS", context.getString(R.string.lbl_activity_class), null, new z3.e(1882618073, true, new i(this, 2)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1193296178);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(149979013, new i(this, 3), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x016a  */
    public final void h(String str, String str2, h4.r rVar, h4.d.b bVar, p3.m mVar, int i14) {
        h4.r rVar2;
        h4.d.b bVar2;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        o0 o0VarE = mVar.E(-190986600);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | 3456 | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            h4.r.a aVar = h4.r.S;
            h4.d.a aVar2 = h4.d.f81522a;
            aVar2.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            float f14 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            float f15 = 8;
            h4.r rVarThen = c2.l.C(rVarF, f14, f15, f14, 0.0f, 8).then(aVar);
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                aVar2.getClass();
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                i(6 | ((i15 >> 6) & 896), 0L, str2, o0VarE);
                h4.r rVarC3 = c2.l.C(aVar, f15, 0.0f, 0.0f, 0.0f, 14);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
                bVar2 = aVar3;
                rVar2 = aVar;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            aVar2.getClass();
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            i(6 | ((i15 >> 6) & 896), 0L, str2, o0VarE);
            h4.r rVarC4 = c2.l.C(aVar, f15, 0.0f, 0.0f, 0.0f, 14);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
            bVar2 = aVar3;
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            bVar2 = bVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e(this, str, str2, rVar2, bVar2, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    public final void i(int i14, long j8, String str, p3.m mVar) {
        String str2;
        int i15;
        o0 o0Var;
        long j14;
        int i16;
        long jG;
        o0 o0VarE = mVar.E(1422570748);
        if ((i14 & 6) == 0) {
            str2 = str;
            i15 = i14 | (o0VarE.B(str2) ? 4 : 2);
        } else {
            str2 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                d92.b.f58623a.getClass();
                i16 = i15 & (-113);
                jG = d92.b.a(o0VarE).c().g();
            } else {
                o0VarE.e();
                i16 = i15 & (-113);
                jG = j8;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(aVar, 16);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            boolean zL = o0VarE.l(jG);
            Object objQ = o0VarE.q();
            if (zL) {
                objQ = new j82.d(jG, 19);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j82.d(jG, 19);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = l4.k.d(aVar, (e23.l) objQ);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str2, rVarD, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, i16 & 14, 0, 131064);
            o0Var = o0VarE;
            o0Var.g0(true);
            j14 = jG;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            j14 = j8;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.m(this, str, j14, i14);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1790232563);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            pk1.a.f138271a.getClass();
            h82.e.a(pk1.a.f138272b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 1);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1638887649);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-912779509, new i(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lpk1/k$a;", "", "<init>", "()V", "", "EXTRA_INDEX_BPM", "Ljava/lang/String;", "PERSONAL_INFORMATION", "ACTIVITY_CLASS", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
