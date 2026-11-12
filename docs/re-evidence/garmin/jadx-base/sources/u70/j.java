package u70;

import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import o70.o;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.focus.SelectHomeLayoutViewModel$fetchDashboardPrimaryStats$1", f = "SelectHomeLayoutViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f169437b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f169438a;

        public a(i iVar) {
            this.f169438a = iVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            this.f169438a.f169432d.k(null, bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f169439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f169440b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f169441a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f169442b;

            /* JADX INFO: renamed from: u70.j$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.focus.SelectHomeLayoutViewModel$fetchDashboardPrimaryStats$1$invokeSuspend$$inlined$map$1$2", f = "SelectHomeLayoutViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C3170a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f169443a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f169444b;

                public C3170a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f169443a = obj;
                    this.f169444b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, i iVar) {
                this.f169441a = jVar;
                this.f169442b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3170a c3170a;
                if (dVar instanceof C3170a) {
                    c3170a = (C3170a) dVar;
                    int i14 = c3170a.f169444b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3170a.f169444b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3170a = new C3170a(dVar);
                    }
                } else {
                    c3170a = new C3170a(dVar);
                }
                Object obj2 = c3170a.f169443a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3170a.f169444b;
                if (i15 == 0) {
                    r.b(obj2);
                    int i16 = i.f169428h;
                    this.f169442b.getClass();
                    j70.c dailyStatsConfig = ((j70.f) obj).getDailyStatsConfig();
                    List<j70.b> listD = dailyStatsConfig != null ? dailyStatsConfig.d() : null;
                    if (listD == null) {
                        listD = j0.f134944a;
                    }
                    Boolean boolValueOf = Boolean.valueOf(listD.size() == 1 && s.g(((j70.b) h0.I0(listD)).getCardType(), o.TRAINING_READINESS.f130049a));
                    c3170a.f169444b = 1;
                    if (this.f169441a.emit(boolValueOf, c3170a) == aVar) {
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

        public b(r53.i iVar, i iVar2) {
            this.f169439a = iVar;
            this.f169440b = iVar2;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f169439a.collect(new a(jVar, this.f169440b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f169437b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f169437b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169436a;
        if (i14 == 0) {
            r.b(obj);
            i iVar = this.f169437b;
            r53.i iVarS = r53.s.s(new b(iVar.f169430b.p(), iVar));
            a aVar2 = new a(iVar);
            this.f169436a = 1;
            if (iVarS.collect(aVar2, this) == aVar) {
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
