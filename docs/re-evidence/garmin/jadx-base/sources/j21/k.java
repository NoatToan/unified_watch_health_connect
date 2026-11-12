package j21;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c42.d0;
import com.garmin.android.apps.connectmobile.R;
import et1.i1;
import h5.e0;
import i3.mh;
import java.util.List;
import kotlin.t1;
import l72.r1;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<String, Unit> f96673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f96674b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super String, Unit> lVar, String str) {
            this.f96673a = lVar;
            this.f96674b = str;
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            str.getClass();
            this.f96673a.invoke(this.f96674b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f96675a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f96676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f96677b;

        public c(e23.l lVar, List list) {
            this.f96676a = lVar;
            this.f96677b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f96676a.invoke(this.f96677b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f96678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f96679b;

        public d(List list, e23.l lVar) {
            this.f96678a = list;
            this.f96679b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006c  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                String str = (String) this.f96678a.get(iIntValue);
                mVar2.C(772436185);
                e23.l lVar = this.f96679b;
                boolean zB = mVar2.B(lVar) | mVar2.B(str);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new a(lVar, str);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(lVar, str);
                        mVar2.K(objQ);
                    }
                }
                k.a(str, (e23.l) objQ, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    public static final void a(String str, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-462627555);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            boolean z14 = (i15 & 112) == 32;
            int i16 = i15 & 14;
            boolean z15 = z14 | (i16 == 4);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z15) {
                objQ = new bb1.d(lVar, str, 3);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new bb1.d(lVar, str, 3);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = w.d(rVarF, false, null, null, (e23.a) objQ, 15);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97920e);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new j02.r(7);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = v.c((e23.l) objQ2, rVarY, true);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58624b.getClass();
            mh.c(str, aVar, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i16 | 48, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f40.c(str, lVar, i14, 3, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    public static final void b(List<String> list, h4.r rVar, boolean z14, e23.l<? super String, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        int i17;
        e23.l<? super String, Unit> lVar2;
        int i18;
        boolean z16;
        e23.l<? super String, Unit> lVar3;
        h4.r rVar2;
        e23.l<? super String, Unit> lVar4;
        list.getClass();
        o0 o0VarE = mVar.E(-934698653);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.r(list) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i19 = i16 | 48;
        int i24 = i15 & 4;
        if (i24 != 0) {
            i17 = i16 | 432;
            z15 = z14;
        } else {
            z15 = z14;
            i17 = i19 | (o0VarE.h(z15) ? 256 : 128);
        }
        int i25 = i15 & 8;
        if (i25 != 0) {
            i18 = i17 | 3072;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i18 = i17 | (o0VarE.r(lVar2) ? 2048 : 1024);
        }
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            h4.r.a aVar = h4.r.S;
            if (i24 != 0) {
                z15 = false;
            }
            p3.m.a aVar2 = p3.m.f135153a;
            if (i25 != 0) {
                Object objQ = o0VarE.q();
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j02.r(6);
                    o0VarE.K(objQ);
                }
                lVar4 = (e23.l) objQ;
            } else {
                lVar4 = lVar2;
            }
            x1 x1Var = p3.n.f135158a;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            int i26 = i18 >> 3;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_suggestions), null, o0VarE, 0, 2);
            boolean zR = o0VarE.r(qVar) | ((i18 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new i1(qVar, lVar4, 2);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i1(qVar, lVar4, 2);
                    o0VarE.K(objQ2);
                }
            }
            c(list, z15, (e23.l) objQ2, o0VarE, (i18 & 14) | (i26 & 112));
            o0VarE.g0(true);
            z16 = z15;
            lVar3 = lVar4;
            rVar2 = aVar;
        } else {
            o0VarE.e();
            z16 = z15;
            lVar3 = lVar2;
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(list, rVar2, z16, lVar3, i14, i15, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    public static final void c(List<String> list, boolean z14, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(255141288);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(-1177846343);
                l72.p2.f111205a.a(gl1.y.Q(o0VarE, R.string.lbl_searching_for_results), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1177732790);
                h4.r rVarE = u1.n.e(h4.r.S, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                boolean zR = o0VarE.r(list) | ((i15 & 896) == 256);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new d0(list, lVar, 2);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d0(list, lVar, 2);
                        o0VarE.K(objQ);
                    }
                }
                e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(list, z14, lVar, i14, 10);
        }
    }
}
