package aq;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p3.b4;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Laq/o3;", "Lh82/c;", "<init>", "()V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o3 extends h82.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f12139h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f12140f = b.TRAINING_EFFECT_HELP_BOTH;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12141g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/o3$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        TRAINING_EFFECT_HELP_AEROBIC,
        TRAINING_EFFECT_HELP_ANAEROBIC,
        TRAINING_EFFECT_HELP_BOTH
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12146a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.TRAINING_EFFECT_HELP_BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.TRAINING_EFFECT_HELP_AEROBIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.TRAINING_EFFECT_HELP_ANAEROBIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12146a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        Object serializable;
        p3.o0 o0VarE = mVar.E(1957441042);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("help_mode_key", b.class);
            } else {
                Object serializable2 = bundle.getSerializable("help_mode_key");
                if (!(serializable2 instanceof b)) {
                    serializable2 = null;
                }
                serializable = (b) serializable2;
            }
            b bVar = (b) serializable;
            if (bVar == null) {
                bVar = b.TRAINING_EFFECT_HELP_BOTH;
            }
            this.f12140f = bVar;
            this.f12141g = bundle.getBoolean("has_primary_benefit");
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(this, bundle, i14, i16);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1488255234, true, new l3(this, 1)), 4, null), new h82.c.b("USING_TRAINING_EFFECT_ACTION", context.getString(R.string.activities_using_training_effect), null, new z3.e(-909489089, true, new l3(this, 2)), 4, null), new h82.c.b("AEROBIC_ACTION", context.getString(R.string.activity_aerobic_label), null, new z3.e(-330722944, true, new l3(this, 3)), 4, null), new h82.c.b("ANAEROBIC_ACTION", context.getString(R.string.activity_anaerobic_label), null, new z3.e(248043201, true, new l3(this, 4)), 4, null), new h82.c.b("PRIMARY_BENEFIT_ACTION", context.getString(R.string.activities_primary_benefit), null, new z3.e(826809346, true, new l3(this, 5)), 4, null), new h82.c.b("EXERCISE_LOAD_ACTION", context.getString(R.string.activities_load_title), null, new z3.e(1405575491, true, new l3(this, 6)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1073191755);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            m.f12045a.getClass();
            h82.e.a(m.f12047c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k3(this, i14, 1);
        }
    }

    public final void h(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1200981342);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            m.f12045a.getClass();
            h82.e.a(m.f12048d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k3(this, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:45:0x0174  */
    public final void i(String str, h4.r rVar, int i14, h4.d.b bVar, p3.m mVar, int i15) {
        h4.r rVar2;
        p3.o0 o0Var;
        h4.d.b bVar2;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.s2 s2VarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        int i16 = i14;
        p3.o0 o0VarE = mVar.E(-1433681122);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = i15 | (o0VarE.B(str) ? 4 : 2) | 48 | (o0VarE.k(i16) ? 256 : 128) | 3072 | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            h4.r.a aVar = h4.r.S;
            h4.d.a aVar2 = h4.d.f81522a;
            aVar2.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            float f14 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarThen = c2.l.C(rVarF, f14, f14, 0.0f, 0.0f, 12).then(aVar);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
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
                c2.b0 b0Var = c2.b0.f22601a;
                aVar2.getClass();
                s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
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
                c2.u2 u2Var = c2.u2.f22900a;
                i16 = i14;
                j(i16, o0VarE, ((i17 >> 6) & 14) | ((i17 >> 9) & 112));
                float f15 = 0;
                h4.r rVarB = c2.l.B(aVar, f14, f15, f15, f15);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                o0Var = o0VarE;
                mh.c(str, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0Var, (i17 & 14) | 48, 0, 131068);
                o0Var.g0(true);
                o0Var.g0(true);
                rVar2 = aVar;
                bVar2 = aVar3;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            aVar2.getClass();
            s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p3.p0.l();
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
            c2.u2 u2Var2 = c2.u2.f22900a;
            i16 = i14;
            j(i16, o0VarE, ((i17 >> 6) & 14) | ((i17 >> 9) & 112));
            float f16 = 0;
            h4.r rVarB2 = c2.l.B(aVar, f14, f16, f16, f16);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0Var, (i17 & 14) | 48, 0, 131068);
            o0Var.g0(true);
            o0Var.g0(true);
            rVar2 = aVar;
            bVar2 = aVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            o0Var = o0VarE;
            bVar2 = bVar;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, str, rVar2, i16, bVar2, i15);
        }
    }

    public final void j(int i14, p3.m mVar, int i15) {
        int i16;
        p3.o0 o0VarE = mVar.E(-1746313827);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            g6.f.a aVar3 = g6.f.f75994b;
            c2.q.a(u1.n.e(l4.k.b(c2.x2.q(aVar, 16), k2.i.f102406a), n5.a.a(o0VarE, i14), o4.m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m3(this, i14, i15, i17);
        }
    }

    public final void k(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1730964266);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            m.f12045a.getClass();
            h82.e.a(m.f12049e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k3(this, i14, 3);
        }
    }

    public final void l(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-698122465);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1563756238, new l3(this, 7), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k3(this, i14, 0);
        }
    }

    public final void m(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1121889018);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(2138889870, new l3(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k3(this, i14, 2);
        }
    }

    public final void n(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(148790401);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            m.f12045a.getClass();
            h82.e.a(m.f12046b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k3(this, i14, 5);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Laq/o3$a;", "", "<init>", "()V", "", "HELP_MODE_KEY", "Ljava/lang/String;", "HAS_PRIMARY_BENEFIT", "USING_TRAINING_EFFECT_ACTION", "AEROBIC_ACTION", "ANAEROBIC_ACTION", "PRIMARY_BENEFIT_ACTION", "EXERCISE_LOAD_ACTION", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
