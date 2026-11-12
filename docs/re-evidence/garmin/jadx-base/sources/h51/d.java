package h51;

import ak0.o;
import b.u;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import go1.j;
import i3.fe;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.o1;
import p3.p1;
import p3.p2;
import p3.x1;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o1 f82083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f82084b;

        public b(o1 o1Var, p1<Boolean> p1Var) {
            this.f82083a = o1Var;
            this.f82084b = p1Var;
        }

        @Override // e23.l
        public final Unit invoke(Long l14) {
            this.f82083a.k(l14.longValue());
            this.f82084b.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Long, Unit> f82085a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super Long, Unit> lVar) {
            this.f82085a = lVar;
        }

        @Override // e23.l
        public final Unit invoke(Long l14) {
            this.f82085a.invoke(Long.valueOf(l14.longValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: h51.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.composables.list.PaceProListScreenKt$PaceProListScreen$3$2$1$5$1", f = "PaceProListScreen.kt", l = {178}, m = "invokeSuspend", v = 2)
    public static final class C1625d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o51.c f82087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i0 f82088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Long> f82089d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1625d(o51.c cVar, i0 i0Var, p1<Long> p1Var, t13.d<? super C1625d> dVar) {
            super(2, dVar);
            this.f82087b = cVar;
            this.f82088c = i0Var;
            this.f82089d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1625d(this.f82087b, this.f82088c, this.f82089d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1625d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82086a;
            if (i14 == 0) {
                r.b(obj);
                p1<Long> p1Var = this.f82089d;
                Long f182175a = p1Var.getF182175a();
                o51.c cVar = this.f82087b;
                if (!s.g(f182175a, cVar != null ? new Long(cVar.f129221c) : null)) {
                    p1Var.setValue(cVar != null ? new Long(cVar.f129221c) : null);
                    this.f82086a = 1;
                    i0.a aVar2 = i0.f62432x;
                    if (this.f82088c.l(0, 0, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f82090a = new e();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f82091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f82092b;

        public f(l lVar, List list) {
            this.f82091a = lVar;
            this.f82092b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f82091a.invoke(this.f82092b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f82093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f82094b;

        public g(l lVar, List list) {
            this.f82093a = lVar;
            this.f82094b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f82093a.invoke(this.f82094b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f82095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o1 f82096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1 f82097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f82098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f82099e;

        public h(List list, o1 o1Var, p1 p1Var, l lVar, l lVar2) {
            this.f82095a = list;
            this.f82096b = o1Var;
            this.f82097c = p1Var;
            this.f82098d = lVar;
            this.f82099e = lVar2;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:32:0x008c  */
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
                o51.c cVar = (o51.c) this.f82095a.get(iIntValue);
                mVar2.C(1412105765);
                o1 o1Var = this.f82096b;
                boolean zB = mVar2.B(o1Var);
                p1 p1Var = this.f82097c;
                boolean zB2 = zB | mVar2.B(p1Var);
                Object objQ = mVar2.q();
                m.a aVar = m.f135153a;
                if (zB2) {
                    objQ = new b(o1Var, p1Var);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new b(o1Var, p1Var);
                        mVar2.K(objQ);
                    }
                }
                l lVar = (l) objQ;
                l lVar2 = this.f82099e;
                boolean zB3 = mVar2.B(lVar2);
                Object objQ2 = mVar2.q();
                if (zB3) {
                    objQ2 = new c(lVar2);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new c(lVar2);
                        mVar2.K(objQ2);
                    }
                }
                h51.f.a(cVar, lVar, this.f82098d, (l) objQ2, mVar2, 0, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(o51.d dVar, fe feVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, l<? super Long, Unit> lVar, l<? super Long, Unit> lVar2, e23.a<Unit> aVar3, l<? super Long, Unit> lVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        int i15;
        o0 o0Var;
        dVar.getClass();
        feVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar3.getClass();
        lVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(530207858);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new j(20);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new j(21);
                o0VarE.K(objQ2);
            }
            o1 o1Var = (o1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            m3.s sVarE = m3.l.e(o0VarE);
            boolean z14 = dVar.f129223a || dVar.f129227e.f129262a;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new j(22);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            z02.d.a(z14, z3.f.c(1082102797, new cq0.p(aVar4, 28), o0VarE), z3.f.c(1566739628, new o(feVar, 15), o0VarE), null, null, z3.f.c(-1274317175, new dj0.j(dVar, aVar, sVarE, p1Var, lVar3, o1Var, aVar3, i0VarA, lVar2, lVar, (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48), aVar2), o0VarE), o0Var, 197040, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(dVar, feVar, aVar, aVar2, lVar, lVar2, aVar3, lVar3, aVar4, i14);
        }
    }
}
