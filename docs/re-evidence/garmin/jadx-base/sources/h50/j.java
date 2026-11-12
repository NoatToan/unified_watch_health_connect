package h50;

import c2.x2;
import e23.r;
import gg1.o0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<i50.a, Unit> f82049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i50.f f82050b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super i50.a, Unit> lVar, i50.f fVar) {
            this.f82049a = lVar;
            this.f82050b = fVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f82049a.invoke(new i50.a.f(this.f82050b.f91746i));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<i50.a, Unit> f82051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i50.f f82052b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super i50.a, Unit> lVar, i50.f fVar) {
            this.f82051a = lVar;
            this.f82052b = fVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f82051a.invoke(new i50.a.e(this.f82052b.f91746i));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<i50.a, Unit> f82053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i50.f f82054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i50.i f82055c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super i50.a, Unit> lVar, i50.f fVar, i50.i iVar) {
            this.f82053a = lVar;
            this.f82054b = fVar;
            this.f82055c = iVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f82053a.invoke(new i50.a.r(this.f82054b.f91746i, this.f82055c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f82056a = new d();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f82057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f82058b;

        public e(e23.l lVar, List list) {
            this.f82057a = lVar;
            this.f82058b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f82057a.invoke(this.f82058b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f82059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f82060b;

        public f(e23.l lVar, List list) {
            this.f82059a = lVar;
            this.f82060b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f82059a.invoke(this.f82060b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f82061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i50.j f82062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l f82063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i50.i f82064d;

        public g(List list, i50.j jVar, e23.l lVar, i50.i iVar) {
            this.f82061a = list;
            this.f82062b = jVar;
            this.f82063c = lVar;
            this.f82064d = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0073  */
        /* JADX WARN: Code duplicated, block: B:32:0x0094  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
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
                x1 x1Var = n.f135158a;
                i50.f fVar = (i50.f) this.f82061a.get(iIntValue);
                mVar2.C(-1108595562);
                i50.j jVar = this.f82062b;
                boolean z14 = jVar.f91782d;
                o0 o0Var = jVar.f91783e;
                e23.l lVar = this.f82063c;
                boolean zB = mVar2.B(lVar) | mVar2.B(fVar);
                Object objQ = mVar2.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new a(lVar, fVar);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(lVar, fVar);
                        mVar2.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                boolean zB2 = mVar2.B(lVar) | mVar2.B(fVar);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new b(lVar, fVar);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b(lVar, fVar);
                        mVar2.K(objQ2);
                    }
                }
                e23.a aVar3 = (e23.a) objQ2;
                boolean zB3 = mVar2.B(lVar) | mVar2.B(fVar);
                i50.i iVar = this.f82064d;
                boolean zK = zB3 | mVar2.k(iVar.ordinal());
                Object objQ3 = mVar2.q();
                if (zK) {
                    objQ3 = new c(lVar, fVar, iVar);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new c(lVar, fVar, iVar);
                        mVar2.K(objQ3);
                    }
                }
                h50.e.c(fVar, z14, o0Var, aVar2, aVar3, (e23.a) objQ3, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    public static final void a(i50.i iVar, i50.j jVar, boolean z14, e23.l<? super i50.a, Unit> lVar, p3.m mVar, int i14) {
        i50.i iVar2;
        jVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(15250804);
        int i15 = 2;
        int i16 = i14 | (o0VarE.k(iVar.ordinal()) ? 4 : 2) | (o0VarE.B(jVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            boolean z15 = (i16 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new gt1.k(lVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gt1.k(lVar, 2);
                    o0VarE.K(objQ);
                }
            }
            iVar2 = iVar;
            m3.l.b(z14, (e23.a) objQ, x2.d(h4.r.S, 1.0f), null, null, null, z3.f.c(64709978, new gw1.e(jVar, i15, iVar2, lVar), o0VarE), o0VarE, ((i16 >> 6) & 14) | 1573248, 56);
        } else {
            iVar2 = iVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g((Object) iVar2, (Object) jVar, z14, (o13.h) lVar, i14, 15);
        }
    }
}
