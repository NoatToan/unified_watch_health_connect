package sk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
import c2.n3;
import c2.x2;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d4.l f159729a = d4.a.b(new si1.a(22), new se0.a(28));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.ManageCollectionGearScreenKt$ManageCollectionGearScreenImpl$1$1", f = "ManageCollectionGearScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<m1> f159730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1<i53.e<String>> f159731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i1 f159732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3<m1> x3Var, p3.p1<i53.e<String>> p1Var, i1 i1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159730a = x3Var;
            this.f159731b = p1Var;
            this.f159732c = i1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f159730a, this.f159731b, this.f159732c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            d4.l lVar = l1.f159729a;
            jk0.x xVar = this.f159730a.getF182175a().f159759e;
            if (xVar != null && (str = xVar.f99356f) != null) {
                p3.p1<i53.e<String>> p1Var = this.f159731b;
                p1Var.setValue(i53.a.h(p13.c1.i(p1Var.getF182175a(), str)));
                this.f159732c.j();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.p1<i53.e<String>> f159733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f159734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uk0.a f159735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f159736d;

        public b(p3.p1<i53.e<String>> p1Var, boolean z14, uk0.a aVar, p3.p1<Boolean> p1Var2) {
            this.f159733a = p1Var;
            this.f159734b = z14;
            this.f159735c = aVar;
            this.f159736d = p1Var2;
        }

        @Override // e23.a
        public final Unit invoke() {
            i53.e<String> eVarI;
            boolean z14 = this.f159734b;
            uk0.a aVar = this.f159735c;
            p3.p1<i53.e<String>> p1Var = this.f159733a;
            if (z14) {
                eVarI = p13.c1.f(p1Var.getF182175a(), aVar.f171795a);
            } else if (p1Var.getF182175a().size() >= 50) {
                d4.l lVar = l1.f159729a;
                this.f159736d.setValue(Boolean.TRUE);
                eVarI = p1Var.getF182175a();
            } else {
                eVarI = p13.c1.i(p1Var.getF182175a(), aVar.f171795a);
            }
            p1Var.setValue(i53.a.h(eVarI));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((c80.u) t7).ordinal()), Integer.valueOf(((c80.u) t14).ordinal()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f159737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f159738b;

        public d(Comparator comparator, Context context) {
            this.f159737a = comparator;
            this.f159738b = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            Context context = this.f159738b;
            return this.f159737a.compare(((uk0.a) t7).b(context), ((uk0.a) t14).b(context));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f159739a = new e();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f159740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f159741b;

        public f(e23.l lVar, List list) {
            this.f159740a = lVar;
            this.f159741b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f159740a.invoke(this.f159741b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f159742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f159743b;

        public g(e23.l lVar, List list) {
            this.f159742a = lVar;
            this.f159743b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f159742a.invoke(this.f159743b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f159744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1 f159745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p3.p1 f159746c;

        public h(List list, p3.p1 p1Var, p3.p1 p1Var2) {
            this.f159744a = list;
            this.f159745b = p1Var;
            this.f159746c = p1Var2;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0084  */
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
                uk0.a aVar = (uk0.a) this.f159744a.get(iIntValue);
                mVar2.C(228579418);
                p3.p1 p1Var = this.f159745b;
                boolean zContains = ((i53.e) p1Var.getF182175a()).contains(aVar.f171795a);
                boolean zB = mVar2.B(p1Var) | mVar2.h(zContains) | mVar2.r(aVar);
                p3.p1 p1Var2 = this.f159746c;
                boolean zB2 = zB | mVar2.B(p1Var2);
                Object objQ = mVar2.q();
                if (zB2) {
                    objQ = new b(p1Var, zContains, aVar, p1Var2);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new b(p1Var, zContains, aVar, p1Var2);
                        mVar2.K(objQ);
                    }
                }
                uk0.u.b(aVar, zContains, (e23.a) objQ, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(n1 n1Var, e23.l<? super List<uk0.a>, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        n1Var.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1977939955);
        int i15 = i14 | (o0VarE.r(n1Var) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            b(n1Var, lVar, aVar, aVar2, o0VarE, i15 & 8190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d((u1) n1Var, (e23.l) lVar, (e23.a) aVar, (o13.h) aVar2, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(i1 i1Var, e23.l<? super List<uk0.a>, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-161128226);
        int i15 = i14 | (o0VarE.B(i1Var) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p3.p1 p1VarC = s9.c.c(i1Var.getUiState(), o0VarE);
            Object[] objArr = new Object[0];
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new j1(i1Var, 0);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j1(i1Var, 0);
                    o0VarE.K(objQ);
                }
            }
            p3.p1 p1Var = (p3.p1) d4.a.c(objArr, f159729a, (e23.a) objQ, o0VarE, 0);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new i0(8);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            jk0.x xVar = ((m1) p1VarC.getF182175a()).f159759e;
            boolean zB = (i16 == 4) | o0VarE.B(p1VarC) | o0VarE.B(p1Var);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new a(p1VarC, p1Var, i1Var, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, xVar, o0VarE);
            m1 m1Var = (m1) p1VarC.getF182175a();
            boolean z15 = m1Var.f159755a && !m1Var.f159756b;
            c2.n0 n0Var = n3.f22788a;
            o0Var = o0VarE;
            z02.d.a(z15, z3.f.c(933373987, new k1((Object) aVar2, (Object) lVar, (Object) p1VarC, (Object) p1Var, 0), o0VarE), null, null, new c2.n0(0, 0, 0, 0), z3.f.c(1511525159, new oy0.b((Object) i1Var, p1Var2, p1VarC, (Object) aVar, (Object) p1Var, (Object) context, 24), o0VarE), o0Var, 196656, 12);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1((Object) i1Var, (e23.l) lVar, (e23.a) aVar, (o13.h) aVar2, i14, 1);
        }
    }

    public static final void c(boolean z14, e23.a aVar, z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1421789168);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            m3.s sVarE = m3.l.e(o0VarE);
            m3.l.b(z14, aVar, x2.d(h4.r.S, 1.0f), sVarE, null, z3.f.c(-1588800873, new p003ji0.e(z14, sVarE, 12), o0VarE), z3.f.c(-826919562, new aa2.k(eVar, 11), o0VarE), o0VarE, (i15 & 14) | 1769856 | (i15 & 112), 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ok0.r(z14, aVar, eVar, i14, 1);
        }
    }
}
