package hs;

import ds.y;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import f2.o;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import qr.t;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.stats.StatsScreenKt$StatsList$2$1", f = "StatsScreen.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f85320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f85321c;

        /* JADX INFO: renamed from: hs.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1695a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t f85322a;

            public C1695a(t tVar) {
                this.f85322a = tVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f85322a.f146557s2.k(null, bool);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f85323a;

            /* JADX INFO: renamed from: hs.g$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1696a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f85324a;

                /* JADX INFO: renamed from: hs.g$a$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.stats.StatsScreenKt$StatsList$2$1$invokeSuspend$$inlined$map$1$2", f = "StatsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C1697a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f85325a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f85326b;

                    public C1697a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f85325a = obj;
                        this.f85326b |= Integer.MIN_VALUE;
                        return C1696a.this.emit(null, this);
                    }
                }

                public C1696a(r53.j jVar) {
                    this.f85324a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C1697a c1697a;
                    if (dVar instanceof C1697a) {
                        c1697a = (C1697a) dVar;
                        int i14 = c1697a.f85326b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c1697a.f85326b = i14 - Integer.MIN_VALUE;
                        } else {
                            c1697a = new C1697a(dVar);
                        }
                    } else {
                        c1697a = new C1697a(dVar);
                    }
                    Object obj2 = c1697a.f85325a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c1697a.f85326b;
                    if (i15 == 0) {
                        r.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                        c1697a.f85326b = 1;
                        if (this.f85324a.emit(boolValueOf, c1697a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar) {
                this.f85323a = iVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
                Object objCollect = this.f85323a.collect(new C1696a(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var, t tVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f85320b = i0Var;
            this.f85321c = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f85320b, this.f85321c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f85319a;
            if (i14 == 0) {
                r.b(obj);
                r53.i iVarS = s.s(new b(p0.s(new ct1.c(this.f85320b, 2))));
                C1695a c1695a = new C1695a(this.f85321c);
                this.f85319a = 1;
                if (iVarS.collect(c1695a, this) == aVar) {
                    return aVar;
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
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f85328a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f85329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f85330b;

        public c(l lVar, List list) {
            this.f85329a = lVar;
            this.f85330b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f85329a.invoke(this.f85330b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f85331a;

        public d(List list) {
            this.f85331a = list;
        }

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
                nr.n nVar = (nr.n) this.f85331a.get(iIntValue);
                mVar2.C(1858178848);
                e.b(nVar, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    public static final void a(List<nr.n> list, t tVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(45613859);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(tVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            z02.b.a(false, null, null, null, false, z3.f.c(-1783219495, new g80.e(27, i0VarA, list), o0VarE), o0VarE, 196608, 31);
            boolean zB = o0VarE.B(i0VarA) | o0VarE.r(tVar);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new a(i0VarA, tVar, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(i0VarA, tVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, i0VarA, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(list, tVar, i14, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(t tVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1151754957);
        int i15 = (o0VarE.r(tVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            a(((nr.t.h) s9.c.c(tVar.N1, o0VarE).getF182175a()).f127354a, tVar, o0VarE, (i15 << 3) & 112);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(tVar, i14, 1);
        }
    }
}
