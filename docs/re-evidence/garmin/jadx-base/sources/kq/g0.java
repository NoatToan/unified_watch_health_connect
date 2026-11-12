package kq;

import android.content.Context;
import android.os.Bundle;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import i3.i7;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lkq/g0;", "Lh82/c;", "<init>", "()V", "b", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f106072g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public im.n f106073f = im.n.SEATED_STANDING;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkq/g0$b;", "", "", "iconResId", "labelResId", "<init>", "(II)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106075b;

        public b(int i14, int i15) {
            this.f106074a = i14;
            this.f106075b = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f106074a == bVar.f106074a && this.f106075b == bVar.f106075b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f106075b) + (Integer.hashCode(this.f106074a) * 31);
        }

        public final String toString() {
            return am.j.g(this.f106074a, this.f106075b, "PositionIconData(iconResId=", ", labelResId=", ")");
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106076a;

        static {
            int[] iArr = new int[im.n.values().length];
            try {
                iArr[im.n.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[im.n.LUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[im.n.SEATED_STANDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f106076a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        Object bVar;
        im.n nVar;
        p3.o0 o0VarE = mVar.E(-1342372225);
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
            String string = bundle.getString("extra_cycling_position_mode");
            if (string != null) {
                try {
                    int i16 = o13.q.f128596b;
                    bVar = im.n.valueOf(string);
                } catch (Throwable th3) {
                    int i17 = o13.q.f128596b;
                    bVar = new o13.q.b(th3);
                }
                if (bVar instanceof o13.q.b) {
                    bVar = null;
                }
                nVar = (im.n) bVar;
                if (nVar == null) {
                    nVar = im.n.SEATED_STANDING;
                }
            } else {
                nVar = im.n.SEATED_STANDING;
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            if (!k1.f37122a.t()) {
                nVar = im.n.SEATED_STANDING;
            }
            this.f106073f = nVar;
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(this, bundle, i14, 17);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(47126034, true, new e0(this, 0)), 4, null));
    }

    public final void g(b bVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-158326681);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            i7.a(n5.c.a(bVar.f106074a, o0VarE, 0), null, null, hb.a.d(d92.b.f58623a, o0VarE), o0VarE, 48, 4);
            String strQ = gl1.y.Q(o0VarE, bVar.f106075b);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(this, bVar, i14, 18);
        }
    }

    public final void h(List<b> list, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(586548403);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            bVar.getClass();
            h4.r rVarA = c2.l.A(rVarC, eVar.f97923h, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(1142072345);
            for (b bVar3 : list) {
                h4.r rVarA2 = u2Var.a(h4.r.S, 1.0f, true);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, z14);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarA2, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (cVar == null) {
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
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                c2.u uVar = c2.u.f22885a;
                g(bVar3, o0VarE, i15 & 112);
                o0VarE.g0(true);
                z14 = false;
            }
            o0VarE.g0(z14);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(this, list, i14, 17);
        }
    }

    public final void i(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1038079583);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(404146092, new e0(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(this, i14, 1);
        }
    }

    public final void j(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(740852887);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = c.f106076a[this.f106073f.ordinal()];
            if (i16 == 1 || i16 == 2) {
                o0VarE.C(-1004941905);
                i(o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, -1004945473, false);
                }
                o0VarE.C(-1004939438);
                k(o0VarE, i15 & 14);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(this, i14, 0);
        }
    }

    public final void k(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-963553362);
        int i15 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1504983231, new e0(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(this, i14, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkq/g0$a;", "", "<init>", "()V", "", "EXTRA_CYCLING_POSITION_MODE", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
