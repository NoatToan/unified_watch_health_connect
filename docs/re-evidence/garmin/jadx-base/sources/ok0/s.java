package ok0;

import am.i1;
import am.x0;
import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n0;
import c2.n3;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jk0.x;
import l72.p2;
import o53.b0;
import o72.o3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c1;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import uk0.u;
import v62.fa;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d4.l f132518a = d4.a.b(new o3(14), new oe2.g(5));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ManageActivityGearScreenKt$ManageActivityGearScreen$5$1", f = "ManageActivityGearScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f132519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<t.c> f132520b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, x3<t.c> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f132519a = aVar;
            this.f132520b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f132519a, this.f132520b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            d4.l lVar = s.f132518a;
            if (this.f132520b.getF182175a().f132566h != null) {
                this.f132519a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ManageActivityGearScreenKt$ManageActivityGearScreen$6$1", f = "ManageActivityGearScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<t.c> f132521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<i53.e<String>> f132522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ok0.n f132523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<t.c> x3Var, p1<i53.e<String>> p1Var, ok0.n nVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f132521a = x3Var;
            this.f132522b = p1Var;
            this.f132523c = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f132521a, this.f132522b, this.f132523c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            d4.l lVar = s.f132518a;
            x xVar = this.f132521a.getF182175a().f132567i;
            if (xVar != null && (str = xVar.f99356f) != null) {
                p1<i53.e<String>> p1Var = this.f132522b;
                p1Var.setValue(i53.a.h(c1.i(p1Var.getF182175a(), str)));
                this.f132523c.j();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<i53.e<String>> f132524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f132525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i53.e<String> f132526c;

        public c(p1<i53.e<String>> p1Var, boolean z14, i53.e<String> eVar) {
            this.f132524a = p1Var;
            this.f132525b = z14;
            this.f132526c = eVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            boolean z14 = this.f132525b;
            i53.e<String> eVar = this.f132526c;
            p1<i53.e<String>> p1Var = this.f132524a;
            p1Var.setValue(z14 ? i53.a.h(c1.g(p1Var.getF182175a(), eVar)) : i53.a.h(c1.h(p1Var.getF182175a(), eVar)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<i53.e<String>> f132527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ uk0.a f132528b;

        public d(p1<i53.e<String>> p1Var, uk0.a aVar) {
            this.f132527a = p1Var;
            this.f132528b = aVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            p1<i53.e<String>> p1Var = this.f132527a;
            i53.e<String> f182175a = p1Var.getF182175a();
            String str = this.f132528b.f171795a;
            p1Var.setValue(i53.a.h(f182175a.contains(str) ? c1.f(p1Var.getF182175a(), str) : c1.i(p1Var.getF182175a(), str)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f132529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f132530b;

        public e(Comparator comparator, Context context) {
            this.f132529a = comparator;
            this.f132530b = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            Context context = this.f132530b;
            return this.f132529a.compare(((uk0.a) t7).b(context), ((uk0.a) t14).b(context));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f132531a;

        public f(Comparator comparator) {
            this.f132531a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return this.f132531a.compare(((t.b) t7).f132556b, ((t.b) t14).f132556b);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f132532a = new g();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f132533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f132534b;

        public h(e23.l lVar, List list) {
            this.f132533a = lVar;
            this.f132534b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f132533a.invoke(this.f132534b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f132535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f132536b;

        public i(e23.l lVar, List list) {
            this.f132535a = lVar;
            this.f132536b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f132535a.invoke(this.f132536b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f132537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1 f132538b;

        public j(List list, p1 p1Var) {
            this.f132537a = list;
            this.f132538b = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0097  */
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
            boolean z14 = true;
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                t.b bVar = (t.b) this.f132537a.get(iIntValue);
                mVar2.C(-404020547);
                i53.e<String> eVar = bVar.f132557c;
                boolean zIsEmpty = eVar.isEmpty();
                p1 p1Var = this.f132538b;
                if (!zIsEmpty) {
                    Iterator<String> it = eVar.iterator();
                    while (it.hasNext()) {
                        if (!((i53.e) p1Var.getF182175a()).contains(it.next())) {
                            z14 = false;
                            break;
                        }
                    }
                }
                boolean zB = mVar2.B(p1Var) | mVar2.h(z14) | mVar2.B(eVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new c(p1Var, z14, eVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c(p1Var, z14, eVar);
                        mVar2.K(objQ);
                    }
                }
                s.a(bVar, z14, (e23.a) objQ, mVar2, 0);
                mVar2.f();
                x1 x1Var2 = p3.n.f135158a;
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f132539a = new k();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f132540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f132541b;

        public l(e23.l lVar, List list) {
            this.f132540a = lVar;
            this.f132541b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f132540a.invoke(this.f132541b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f132542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f132543b;

        public m(e23.l lVar, List list) {
            this.f132542a = lVar;
            this.f132543b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f132542a.invoke(this.f132543b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class n implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f132544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1 f132545b;

        public n(List list, p1 p1Var) {
            this.f132544a = list;
            this.f132545b = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0078  */
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
                uk0.a aVar = (uk0.a) this.f132544a.get(iIntValue);
                mVar2.C(-1876641322);
                p1 p1Var = this.f132545b;
                boolean zContains = ((i53.e) p1Var.getF182175a()).contains(aVar.f171795a);
                boolean zB = mVar2.B(p1Var) | mVar2.r(aVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new d(p1Var, aVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d(p1Var, aVar);
                        mVar2.K(objQ);
                    }
                }
                u.b(aVar, zContains, (e23.a) objQ, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(t.b bVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        Throwable th3;
        z3.e eVar;
        o0 o0VarE = mVar.E(-439252107);
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                ok0.l.f132499a.getClass();
                eVar = ok0.l.f132503e;
                th3 = null;
            } else {
                th3 = null;
                eVar = null;
            }
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw th3;
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
            p2 p2Var = p2.f111205a;
            h4.r rVarB = j2.b.b(aVar2, z14, false, null, aVar, 14);
            String str = bVar.f132556b;
            ok0.l.f132499a.getClass();
            p2Var.g(str, rVarB, null, ok0.l.f132504f, eVar, false, z14, null, o0VarE, ((i15 << 15) & 3670016) | 3072, 420);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(bVar, z14, aVar, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:64:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ok0.n nVar, x0 x0Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        x0 x0Var2;
        boolean z14;
        ok0.n nVar2 = nVar;
        nVar2.getClass();
        x0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(1176530545);
        int i15 = i14 | (o0VarE.B(nVar2) ? 4 : 2) | (o0VarE.k(x0Var.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(nVar2.getUiState(), o0VarE);
            Object[] objArr = new Object[0];
            int i16 = i15 & 14;
            boolean z15 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z15) {
                objQ = new o(nVar2, 3);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new o(nVar2, 3);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) d4.a.c(objArr, f132518a, (e23.a) objQ, o0VarE, 0);
            t.c cVar = (t.c) p1VarC.getF182175a();
            boolean z16 = (cVar.f132559a && !cVar.f132561c) || cVar.f132560b;
            n0 n0Var = n3.f22788a;
            n0 n0Var2 = new n0(0, 0, 0, 0);
            na0.a aVar5 = new na0.a(aVar2, nVar2, p1Var, p1VarC, 13);
            nVar2 = nVar2;
            x0Var2 = x0Var;
            z02.d.a(z16, z3.f.c(1928781708, aVar5, o0VarE), null, null, n0Var2, z3.f.c(-584036344, new p(nVar2, x0Var2, p1Var, aVar), o0VarE), o0VarE, 196656, 12);
            if (((t.c) p1VarC.getF182175a()).f132563e) {
                o0VarE.C(-1205148094);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.pregnancy_something_went_wrong);
                String strQ2 = gl1.y.Q(o0VarE, R.string.connect_iq_try_again);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                boolean z17 = i16 == 4;
                Object objQ2 = o0VarE.q();
                if (z17) {
                    objQ2 = new o(nVar2, 4);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new o(nVar2, 4);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a<Unit> aVar6 = (e23.a) objQ2;
                boolean z18 = i16 == 4;
                Object objQ3 = o0VarE.q();
                if (z18) {
                    objQ3 = new o(nVar2, 5);
                    o0VarE.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new o(nVar2, 5);
                        o0VarE.K(objQ3);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar6, null, (e23.a) objQ3, o0VarE, 0, 0, 729);
                o0VarE = o0VarE;
                z14 = false;
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(-1204733903);
                o0VarE.g0(false);
            }
            i53.e<String> eVar = ((t.c) p1VarC.getF182175a()).f132566h;
            boolean zB = o0VarE.B(p1VarC) | ((i15 & 57344) == 16384 ? true : z14);
            Object objQ4 = o0VarE.q();
            if (zB) {
                objQ4 = new a(aVar3, p1VarC, null);
                o0VarE.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new a(aVar3, p1VarC, null);
                    o0VarE.K(objQ4);
                }
            }
            l0.e((e23.p) objQ4, eVar, o0VarE);
            x xVar = ((t.c) p1VarC.getF182175a()).f132567i;
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.B(p1Var) | (i16 != 4 ? z14 : true);
            Object objQ5 = o0VarE.q();
            if (zB2) {
                objQ5 = new b(p1VarC, p1Var, nVar2, null);
                o0VarE.K(objQ5);
            } else {
                aVar4.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new b(p1VarC, p1Var, nVar2, null);
                    o0VarE.K(objQ5);
                }
            }
            l0.e((e23.p) objQ5, xVar, o0VarE);
        } else {
            x0Var2 = x0Var;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e((Object) nVar2, (Parcelable) x0Var2, (e23.a) aVar, (e23.a) aVar2, (e23.a) aVar3, i14, 1);
        }
    }

    public static final void c(boolean z14, e23.a aVar, z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1896670223);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            m3.s sVarE = m3.l.e(o0VarE);
            m3.l.b(z14, aVar, x2.d(h4.r.S, 1.0f), sVarE, null, z3.f.c(312211670, new p003ji0.e(z14, sVarE, 6), o0VarE), z3.f.c(-1959256075, new aa2.k(eVar, 6), o0VarE), o0VarE, (i15 & 14) | 1769856 | (i15 & 112), 16);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(z14, aVar, eVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(ok0.n nVar, x0 x0Var, p1<i53.e<String>> p1Var, e23.a<Unit> aVar, p3.m mVar, int i14) {
        boolean z14;
        o0 o0VarE = mVar.E(-1447621138);
        int i15 = i14 | (o0VarE.B(nVar) ? 4 : 2) | (o0VarE.k(x0Var.ordinal()) ? 32 : 16) | (o0VarE.B(p1Var) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            t.c cVar = (t.c) s9.c.c(nVar.getUiState(), o0VarE).getF182175a();
            boolean z15 = cVar.f132562d;
            boolean z16 = cVar.f132561c;
            boolean z17 = cVar.f132559a;
            p3.m.a aVar2 = p3.m.f135153a;
            if (z15) {
                o0VarE.C(-314363136);
                s62.a.f157643a.getClass();
                u4.d dVarA = fa.a(t62.b.f162798a);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_error_occurred);
                String strQ2 = gl1.y.Q(o0VarE, R.string.loading_error_message);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_try_again);
                z14 = (i15 & 14) == 4;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new o(nVar, 0);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new o(nVar, 0);
                        o0VarE.K(objQ);
                    }
                }
                b82.n.d(dVarA, strQ, strQ2, rVarC, strQ3, (e23.a) objQ, null, null, o0VarE, 0, 192);
                o0VarE.g0(false);
            } else if (!cVar.f132564f.isEmpty() || ((z17 && !z16) || cVar.f132560b)) {
                o0VarE.C(-312849499);
                boolean z18 = z17 && z16;
                z14 = (i15 & 14) == 4;
                Object objQ2 = o0VarE.q();
                if (z14) {
                    objQ2 = new o(nVar, 2);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new o(nVar, 2);
                        o0VarE.K(objQ2);
                    }
                }
                c(z18, (e23.a) objQ2, z3.f.c(487747904, new na0.a(x0Var, cVar, p1Var, context, 12), o0VarE), o0VarE, 384);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-313840507);
                boolean z19 = z17 && z16;
                boolean z24 = (i15 & 14) == 4;
                Object objQ3 = o0VarE.q();
                if (z24) {
                    objQ3 = new o(nVar, 1);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new o(nVar, 1);
                        o0VarE.K(objQ3);
                    }
                }
                c(z19, (e23.a) objQ3, z3.f.c(45700896, new ll1.g(aVar, 27), o0VarE), o0VarE, 384);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(nVar, x0Var, p1Var, aVar, i14);
        }
    }
}
