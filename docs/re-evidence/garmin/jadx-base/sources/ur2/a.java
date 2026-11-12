package ur2;

import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import c42.d0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.r;
import h4.g;
import h4.k;
import h5.e0;
import i3.mh;
import j92.e;
import j92.f;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v.h;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: ur2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3219a implements l<q, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<q, Unit> f172326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f172327b;

        /* JADX WARN: Multi-variable type inference failed */
        public C3219a(l<? super q, Unit> lVar, q qVar) {
            this.f172326a = lVar;
            this.f172327b = qVar;
        }

        @Override // e23.l
        public final Unit invoke(q qVar) {
            qVar.getClass();
            this.f172326a.invoke(this.f172327b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f172328a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f172329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f172330b;

        public c(l lVar, List list) {
            this.f172329a = lVar;
            this.f172330b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f172329a.invoke(this.f172330b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f172331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f172332b;

        public d(List list, l lVar) {
            this.f172331a = list;
            this.f172332b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006c  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
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
                x1 x1Var = n.f135158a;
                q qVar = (q) this.f172331a.get(iIntValue);
                mVar2.C(-1623926857);
                l lVar = this.f172332b;
                boolean zB = mVar2.B(lVar) | mVar2.r(qVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new C3219a(lVar, qVar);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new C3219a(lVar, qVar);
                        mVar2.K(objQ);
                    }
                }
                ur2.b.a(qVar, (l) objQ, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0288  */
    public static final void a(List<q> list, l<? super q, Unit> lVar, m mVar, int i14) {
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(690272950);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            g.a aVar2 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(aVar, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar2.f97921f);
            bVar2.getClass();
            z zVarA2 = y.a(j.i(eVar2.f97920e), aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarY, o0VarE);
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
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.missing_payment_information);
            f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(f.f97930g), o0VarE), o0VarE, 0, 0, 131070);
            String strQ2 = gl1.y.Q(o0VarE, R.string.billing_address_is_required_to_make_payments);
            fVar2.getClass();
            x0 x0Var = f.f97931h;
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, 0, 0, 131070);
            o0VarE.g0(true);
            bVar2.getClass();
            float f14 = eVar2.f97921f;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar2.f97918c);
            z zVarA3 = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = k.c(rVarZ, o0VarE);
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
            b4.c(eVar, zVarA3, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            String upperCase = gl1.y.Q(o0VarE, R.string.enabled_on_watch_lbl).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            fVar2.getClass();
            mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            boolean zR = o0VarE.r(list) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new d0(list, lVar, 7);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d0(list, lVar, 7);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(null, null, null, null, null, null, false, null, (l) objQ, o0VarE, 0, 511);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e0(lVar, i14, 25, list);
        }
    }
}
