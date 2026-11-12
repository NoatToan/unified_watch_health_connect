package b40;

import a03.t0;
import a11.g0;
import androidx.room.w0;
import c2.q;
import c2.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e2.d;
import e23.l;
import e23.r;
import f5.z0;
import g6.f;
import gl1.y;
import h4.k;
import h5.e0;
import h5.g;
import java.util.List;
import l72.j0;
import l72.n0;
import m92.o;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s1.y0;
import v.h;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f15697a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements l<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<r30.b> f15698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<r30.a, Unit> f15700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r30.a f15701d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<r30.b> list, int i14, l<? super r30.a, Unit> lVar, r30.a aVar) {
            this.f15698a = list;
            this.f15699b = i14;
            this.f15700c = lVar;
            this.f15701d = aVar;
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            bool.getClass();
            r30.b bVar = (r30.b) h0.e0(this.f15699b, this.f15698a);
            r30.a aVar = bVar != null ? bVar.f149981a : null;
            this.f15700c.invoke(this.f15701d != aVar ? aVar : null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: b40.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0221b implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f15702a;

        public C0221b(List list) {
            this.f15702a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f15702a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r<d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f15703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f15704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f15705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r30.a f15706d;

        public c(List list, List list2, l lVar, r30.a aVar) {
            this.f15703a = list;
            this.f15704b = list2;
            this.f15705c = lVar;
            this.f15706d = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0118  */
        @Override // e23.r
        public final Unit invoke(d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            d dVar2 = dVar;
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
                j0 j0Var = (j0) this.f15703a.get(iIntValue);
                mVar2.C(-1846507053);
                h4.r.a aVar = h4.r.S;
                h4.d.f81522a.getClass();
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                h4.r rVarC = k.c(aVar, mVar2);
                g.V.getClass();
                e0.a aVar2 = g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                b4.c(g.a.f81810g, z0VarD, mVar2);
                b4.c(g.a.f81809f, i2VarX, mVar2);
                g.a.b bVar = g.a.f81813j;
                if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, mVar2);
                u uVar = u.f22885a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11);
                List list = this.f15704b;
                boolean zR = mVar2.r(list);
                boolean z14 = (((i14 & 112) ^ 48) > 32 && mVar2.k(iIntValue)) || (i14 & 48) == 32;
                l lVar = this.f15705c;
                boolean zB = zR | z14 | mVar2.B(lVar);
                r30.a aVar3 = this.f15706d;
                boolean zK = zB | mVar2.k(aVar3 == null ? -1 : aVar3.ordinal());
                Object objQ = mVar2.q();
                if (zK) {
                    objQ = new a(list, iIntValue, lVar, aVar3);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a(list, iIntValue, lVar, aVar3);
                        mVar2.K(objQ);
                    }
                }
                n0.a(rVarC2, j0Var, 0L, (l) objQ, mVar2, 0, 4);
                r30.b bVar2 = (r30.b) h0.e0(iIntValue, list);
                if (bVar2 == null || !bVar2.f149982b) {
                    mVar2.C(793981945);
                    mVar2.f();
                } else {
                    mVar2.C(793758032);
                    b.b(rVarC2, j0Var, mVar2, 0);
                    mVar2.f();
                }
                mVar2.y();
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        f.a aVar = f.f75994b;
        f15697a = 325;
    }

    public static final void a(h4.r rVar, CustomLineChart customLineChart, List<r30.b> list, r30.a aVar, l<? super r30.a, Unit> lVar, e23.a<Unit> aVar2, m mVar, int i14) {
        int i15;
        e eVarC;
        rVar.getClass();
        customLineChart.getClass();
        list.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1375609264);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(customLineChart) : o0VarE.r(customLineChart) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.activity_details_elevation);
            e eVarC2 = z3.f.c(395715280, new a3.e(rVar, 17, customLineChart, aVar2), o0VarE);
            if (list.isEmpty()) {
                o0VarE.C(1804568630);
                o0VarE.g0(false);
                eVarC = null;
            } else {
                o0VarE.C(1803117427);
                eVarC = z3.f.c(838345140, new a3.e(list, 18, lVar, aVar), o0VarE);
                o0VarE.g0(false);
            }
            o.a(null, strQ, null, null, eVarC2, eVarC, null, o0VarE, 24576, 77);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(rVar, customLineChart, list, aVar, lVar, aVar2, i14, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, j0 j0Var, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1844199478);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(j0Var) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r rVarA = l4.k.a(rVar, ((Number) s1.p0.a(s1.p0.c(null, o0VarE, 1), 1.0f, 0.15f, s1.l.a(s1.l.d(1000, 0, null, 6), y0.Reverse, 4), null, o0VarE, 4536, 8).f155651d.getF182175a()).floatValue());
            j0 j0VarA = j0.a(j0Var, null, true, 15);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new w0(26);
                o0VarE.K(objQ);
            }
            n0.a(rVarA, j0VarA, 0L, (l) objQ, o0VarE, 3072, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(rVar, j0Var, i14, 15);
        }
    }
}
