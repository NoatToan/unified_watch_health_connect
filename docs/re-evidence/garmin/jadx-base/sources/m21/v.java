package m21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.Collection;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm21/v;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f116176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f116177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f116178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f116179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f116180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f116181f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r53.i<i53.c<? extends b11.v>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f116182a;

        /* JADX INFO: renamed from: m21.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2209a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f116183a;

            /* JADX INFO: renamed from: m21.v$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodsPickerViewModel$special$$inlined$map$1$2", f = "FoodsPickerViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2210a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f116184a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f116185b;

                public C2210a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f116184a = obj;
                    this.f116185b |= Integer.MIN_VALUE;
                    return C2209a.this.emit(null, this);
                }
            }

            public C2209a(r53.j jVar) {
                this.f116183a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2210a c2210a;
                if (dVar instanceof C2210a) {
                    c2210a = (C2210a) dVar;
                    int i14 = c2210a.f116185b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2210a.f116185b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2210a = new C2210a(dVar);
                    }
                } else {
                    c2210a = new C2210a(dVar);
                }
                Object obj2 = c2210a.f116184a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2210a.f116185b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    i53.c cVarE = i53.a.e((List) obj);
                    c2210a.f116185b = 1;
                    if (this.f116183a.emit(cVarE, c2210a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(r53.i iVar) {
            this.f116182a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super i53.c<? extends b11.v>> jVar, t13.d dVar) {
            Object objCollect = this.f116182a.collect(new C2209a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<i53.c<? extends b11.v>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f116187a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f116188a;

            /* JADX INFO: renamed from: m21.v$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodsPickerViewModel$special$$inlined$map$2$2", f = "FoodsPickerViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2211a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f116189a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f116190b;

                public C2211a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f116189a = obj;
                    this.f116190b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f116188a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2211a c2211a;
                if (dVar instanceof C2211a) {
                    c2211a = (C2211a) dVar;
                    int i14 = c2211a.f116190b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2211a.f116190b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2211a = new C2211a(dVar);
                    }
                } else {
                    c2211a = new C2211a(dVar);
                }
                Object obj2 = c2211a.f116189a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2211a.f116190b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    i53.c cVarE = i53.a.e((List) obj);
                    c2211a.f116190b = 1;
                    if (this.f116188a.emit(cVarE, c2211a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar) {
            this.f116187a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super i53.c<? extends b11.v>> jVar, t13.d dVar) {
            Object objCollect = this.f116187a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<i53.c<? extends b11.v>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f116192a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f116193a;

            /* JADX INFO: renamed from: m21.v$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodsPickerViewModel$special$$inlined$map$3$2", f = "FoodsPickerViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2212a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f116194a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f116195b;

                public C2212a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f116194a = obj;
                    this.f116195b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f116193a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2212a c2212a;
                if (dVar instanceof C2212a) {
                    c2212a = (C2212a) dVar;
                    int i14 = c2212a.f116195b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2212a.f116195b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2212a = new C2212a(dVar);
                    }
                } else {
                    c2212a = new C2212a(dVar);
                }
                Object obj2 = c2212a.f116194a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2212a.f116195b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    i53.c cVarE = i53.a.e((List) obj);
                    c2212a.f116195b = 1;
                    if (this.f116193a.emit(cVarE, c2212a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public c(r53.i iVar) {
            this.f116192a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super i53.c<? extends b11.v>> jVar, t13.d dVar) {
            Object objCollect = this.f116192a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public v() {
        j0 j0Var = j0.f134944a;
        p2 p2VarA = q2.a(j0Var);
        this.f116176a = p2VarA;
        p2 p2VarA2 = q2.a(j0Var);
        this.f116177b = p2VarA2;
        p2 p2VarA3 = q2.a(j0Var);
        this.f116178c = p2VarA3;
        a aVar = new a(r53.s.d(p2VarA));
        w9.a aVarA = v1.a(this);
        k2.a aVar2 = k2.f150703a;
        this.f116179d = r53.s.K(aVar, aVarA, k2.a.a(aVar2, 2), j53.l.b());
        this.f116180e = r53.s.K(new b(r53.s.d(p2VarA2)), v1.a(this), k2.a.a(aVar2, 2), j53.l.b());
        this.f116181f = r53.s.K(new c(r53.s.d(p2VarA3)), v1.a(this), k2.a.a(aVar2, 2), j53.l.b());
    }

    public final void x4() {
        this.f116176a.setValue(j53.l.b());
        this.f116177b.setValue(j53.l.b());
        this.f116178c.setValue(j53.l.b());
    }

    public final void y4(b11.a aVar) {
        aVar.getClass();
        boolean z14 = aVar instanceof b11.a.C0202a;
        p2 p2Var = this.f116176a;
        if (z14 || (aVar instanceof b11.a.c)) {
            p2Var.k(null, h0.D0((Collection) p2Var.getValue(), aVar));
        } else if (aVar instanceof b11.a.b) {
            p2Var.k(null, h0.C0((Collection) p2Var.getValue(), ((b11.a.b) aVar).f14233i));
        } else {
            u0.r();
        }
    }
}
