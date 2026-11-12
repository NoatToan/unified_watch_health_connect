package wv0;

import b82.y1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e2.f0;
import java.util.List;
import java.util.Set;
import l72.l2;
import l72.p2;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.x1;
import vd0.d0;
import w51.n0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f187403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv0.d f187404b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Long, Unit> lVar, pv0.d dVar) {
            this.f187403a = lVar;
            this.f187404b = dVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f187403a.invoke(Long.valueOf(this.f187404b.f141358a));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f187405a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f187406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f187407b;

        public c(e23.l lVar, List list) {
            this.f187406a = lVar;
            this.f187407b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f187406a.invoke(this.f187407b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f187408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f187409b;

        public d(List list, e23.l lVar) {
            this.f187408a = list;
            this.f187409b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0076  */
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
                pv0.d dVar3 = (pv0.d) this.f187408a.get(iIntValue);
                mVar2.C(37250046);
                String str = dVar3.f141361d;
                if (str == null) {
                    str = "";
                }
                boolean zF = pv0.f.f(dVar3);
                e23.l lVar = this.f187409b;
                boolean zB = mVar2.B(lVar) | mVar2.r(dVar3);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new a(lVar, dVar3);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(lVar, dVar3);
                        mVar2.K(objQ);
                    }
                }
                i.f(0, (e23.a) objQ, str, mVar2, zF);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f187410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv0.d f187411b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(e23.l<? super Long, Unit> lVar, pv0.d dVar) {
            this.f187410a = lVar;
            this.f187411b = dVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f187410a.invoke(Long.valueOf(this.f187411b.f141358a));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f187412a = new f();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f187413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f187414b;

        public g(e23.l lVar, List list) {
            this.f187413a = lVar;
            this.f187414b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f187413a.invoke(this.f187414b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f187415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f187416b;

        public h(List list, e23.l lVar) {
            this.f187415a = list;
            this.f187416b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0076  */
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
                pv0.d dVar3 = (pv0.d) this.f187415a.get(iIntValue);
                mVar2.C(1052374055);
                String str = dVar3.f141361d;
                if (str == null) {
                    str = "";
                }
                boolean zF = pv0.f.f(dVar3);
                e23.l lVar = this.f187416b;
                boolean zB = mVar2.B(lVar) | mVar2.r(dVar3);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new e(lVar, dVar3);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(lVar, dVar3);
                        mVar2.K(objQ);
                    }
                }
                i.f(0, (e23.a) objQ, str, mVar2, zF);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: wv0.i$i, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3486i implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f187417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv0.d f187418b;

        /* JADX WARN: Multi-variable type inference failed */
        public C3486i(e23.l<? super Long, Unit> lVar, pv0.d dVar) {
            this.f187417a = lVar;
            this.f187418b = dVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f187417a.invoke(Long.valueOf(this.f187418b.f141358a));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f187419a = new j();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f187420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f187421b;

        public k(e23.l lVar, List list) {
            this.f187420a = lVar;
            this.f187421b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f187420a.invoke(this.f187421b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f187422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f187423b;

        public l(List list, e23.l lVar) {
            this.f187422a = list;
            this.f187423b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0076  */
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
                pv0.d dVar3 = (pv0.d) this.f187422a.get(iIntValue);
                mVar2.C(32589442);
                String str = dVar3.f141361d;
                if (str == null) {
                    str = "";
                }
                boolean zF = pv0.f.f(dVar3);
                e23.l lVar = this.f187423b;
                boolean zB = mVar2.B(lVar) | mVar2.r(dVar3);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new C3486i(lVar, dVar3);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new C3486i(lVar, dVar3);
                        mVar2.K(objQ);
                    }
                }
                i.f(0, (e23.a) objQ, str, mVar2, zF);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f187424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv0.d f187425b;

        /* JADX WARN: Multi-variable type inference failed */
        public m(e23.l<? super Long, Unit> lVar, pv0.d dVar) {
            this.f187424a = lVar;
            this.f187425b = dVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f187424a.invoke(Long.valueOf(this.f187425b.f141358a));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class n implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f187426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv0.d f187427b;

        /* JADX WARN: Multi-variable type inference failed */
        public n(e23.l<? super Long, Unit> lVar, pv0.d dVar) {
            this.f187426a = lVar;
            this.f187427b = dVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f187426a.invoke(Long.valueOf(this.f187427b.f141358a));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class o implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f187428a = new o();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class p implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f187429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f187430b;

        public p(e23.l lVar, List list) {
            this.f187429a = lVar;
            this.f187430b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f187429a.invoke(this.f187430b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class q implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f187431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f187432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l f187433c;

        public q(List list, e23.l lVar, e23.l lVar2) {
            this.f187431a = list;
            this.f187432b = lVar;
            this.f187433c = lVar2;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0072  */
        /* JADX WARN: Code duplicated, block: B:35:0x0094  */
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
                pv0.d dVar3 = (pv0.d) this.f187431a.get(iIntValue);
                mVar2.C(-697427735);
                String str = dVar3.f141361d;
                if (str == null) {
                    str = "";
                }
                e23.l lVar = this.f187432b;
                boolean zB = mVar2.B(lVar) | mVar2.r(dVar3);
                Object objQ = mVar2.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new m(lVar, dVar3);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new m(lVar, dVar3);
                        mVar2.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                e23.l lVar2 = this.f187433c;
                boolean zB2 = mVar2.B(lVar2) | mVar2.r(dVar3);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new n(lVar2, dVar3);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new n(lVar2, dVar3);
                        mVar2.K(objQ2);
                    }
                }
                i.k(str, aVar2, (e23.a) objQ2, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    public static final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        o0 o0VarE = mVar.E(1921310601);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            h4.r rVarE = u1.n.e(rVar, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_add_custom_behavior);
            t.f187446a.getClass();
            z3.e eVar = t.f187447b;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new w51.j(aVar, 24);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w51.j(aVar, 24);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(strQ, rVarE, null, null, eVar, false, false, (e23.a) objQ, o0VarE, 24576, 236);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.w(rVar, aVar, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    public static final void b(i53.c<pv0.d> cVar, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1220459755);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((i15 & 896) == 256) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar))) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d0(cVar, lVar, aVar, i16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d0(cVar, lVar, aVar, i16);
                    o0VarE.K(objQ);
                }
            }
            e((e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wv0.g(cVar, lVar, aVar, i14, 0);
        }
    }

    public static final void c(i53.c cVar, z3.e eVar, p3.m mVar, int i14) {
        cVar.getClass();
        o0 o0VarE = mVar.E(1901134248);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y1.f16902a.c(cVar, 0, true, true, true, 0L, 0L, z3.f.c(-1946923376, new aa2.k(eVar, 15), o0VarE), o0VarE, (i15 & 14) | 12610944, 98);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wb1.i(cVar, eVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    public static final void d(i53.c<pv0.d> cVar, e23.l<? super Long, Unit> lVar, p3.m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1928652590);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar))) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d50.j(2, lVar, cVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d50.j(2, lVar, cVar);
                    o0VarE.K(objQ);
                }
            }
            e((e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.f(cVar, lVar, i14, 5);
        }
    }

    public static final void e(e23.l<? super f0, Unit> lVar, p3.m mVar, int i14) {
        e23.l<? super f0, Unit> lVar2;
        o0 o0VarE = mVar.E(-119723065);
        int i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            lVar2 = lVar;
            e2.c.b(u1.n.e(x2.d(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), null, null, null, null, null, false, null, lVar2, o0VarE, (i15 << 27) & 1879048192, 510);
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(lVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    public static final void f(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        o0 o0VarE = mVar.E(-534807831);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            h4.r rVarE = u1.n.e(h4.r.S, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            z3.e eVarC = z3.f.c(1438876532, new rw0.g(z14, 17), o0VarE);
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new w51.j(aVar, 23);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w51.j(aVar, 23);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(str, rVarE, null, null, eVarC, false, false, (e23.a) objQ, o0VarE, (i15 & 14) | 24576, 236);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(str, z14, aVar, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    public static final void g(i53.c<pv0.d> cVar, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-868225961);
        int i15 = 2;
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((i16 & 14) == 4 || ((i16 & 8) != 0 && o0VarE.r(cVar))) | ((i16 & 896) == 256) | ((i16 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d0(cVar, aVar, lVar, i15);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d0(cVar, aVar, lVar, i15);
                    o0VarE.K(objQ);
                }
            }
            e((e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wv0.g(cVar, lVar, aVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    public static final void h(i53.c cVar, e23.l lVar, e23.a aVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        Object obj;
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1776867854);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            obj = aVar;
            i15 |= o0VarE.r(obj) ? 256 : 128;
        } else {
            obj = aVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar))) | ((i15 & 896) == 256) | ((i15 & 112) == 32) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z14) {
                wv0.h hVar = new wv0.h(cVar, obj, lVar, eVar, 1);
                o0VarE.K(hVar);
                objQ = hVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    wv0.h hVar2 = new wv0.h(cVar, obj, lVar, eVar, 1);
                    o0VarE.K(hVar2);
                    objQ = hVar2;
                }
            }
            e((e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(cVar, lVar, aVar, eVar, i14);
        }
    }

    public static final void i(String str, boolean z14, e23.a aVar, z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(154403104);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            c92.a aVar2 = c92.a.DELETE;
            Set setM0 = p13.u.m0(new c92.b[]{new c92.b.C0397b(aVar2, gl1.y.Q(o0VarE, R.string.lbl_delete)), new c92.b.a(aVar2, gl1.y.Q(o0VarE, R.string.lbl_delete))});
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new wn1.d0(12);
                o0VarE.K(objQ2);
            }
            l2.a(setM0, b0Var, false, null, (e23.a) objQ2, z3.f.c(1366454921, new af1.g(str, z14, aVar), o0VarE), eVar, o0VarE, 1794048, 12);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(str, z14, (Object) aVar, (o13.h) eVar, i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    public static final void j(i53.c<pv0.d> cVar, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        cVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-2107142994);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar))) | ((i15 & 7168) == 2048) | ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                wv0.h hVar = new wv0.h(cVar, aVar, lVar, lVar2, 0);
                o0VarE.K(hVar);
                objQ = hVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    wv0.h hVar2 = new wv0.h(cVar, aVar, lVar, lVar2, 0);
                    o0VarE.K(hVar2);
                    objQ = hVar2;
                }
            }
            e((e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.o(cVar, lVar, lVar2, aVar, i14, 1);
        }
    }

    public static final void k(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1319607236);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p2.f111205a.g(str, u1.n.e(h4.r.S, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a), null, z3.f.c(157516784, new n0(aVar2, 9), o0VarE), z3.f.c(393686607, new n0(aVar, 10), o0VarE), false, false, null, o0VarE, (i15 & 14) | 27648, 484);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gt1.t(str, aVar, aVar2, i14, 7);
        }
    }
}
