package v41;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.ProcessPlanUpdatesUseCase$processUpdates$2", f = "ProcessPlanUpdatesUseCase.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f175656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f175657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f175658d;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "list", "", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.ProcessPlanUpdatesUseCase$processUpdates$2$2", f = "ProcessPlanUpdatesUseCase.kt", l = {43, 45, 47, 48, 49}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<List<? extends Object>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f175660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f175661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m0 f175662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f175663e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, m0 m0Var, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f175661c = sVar;
            this.f175662d = m0Var;
            this.f175663e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f175661c, this.f175662d, this.f175663e, dVar);
            aVar.f175660b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(List<? extends Object> list, t13.d<? super Unit> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
        
            if (r11 == r1) goto L50;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE0;
            Object objE1;
            List list = (List) this.f175660b;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175659a;
            s sVar = this.f175661c;
            if (i14 == 0) {
                o13.r.b(obj);
                Object objE2 = p13.h0.e0(3, list);
                if (p005kotlin.jvm.internal.s.g(objE2 instanceof Boolean ? (Boolean) objE2 : null, Boolean.TRUE)) {
                    t tVar = sVar.f175672d;
                    this.f175660b = null;
                    this.f175659a = 1;
                    x53.c cVar = s0.f129406a;
                    Object objE3 = ge1.b.e0(x53.b.f189152a, new w(tVar, null), this);
                    if (objE3 != obj2) {
                        objE3 = Unit.INSTANCE;
                    }
                    if (objE3 != obj2) {
                    }
                } else {
                    t tVar2 = sVar.f175672d;
                    this.f175660b = null;
                    this.f175659a = 2;
                    x53.c cVar2 = s0.f129406a;
                    Object objE4 = ge1.b.e0(x53.b.f189152a, new x(tVar2, null), this);
                    if (objE4 != obj2) {
                        objE4 = Unit.INSTANCE;
                    }
                    if (objE4 != obj2) {
                    }
                }
                return obj2;
            }
            if (i14 == 1 || i14 == 2) {
                o13.r.b(obj);
            } else {
                if (i14 == 3) {
                    o13.r.b(obj);
                    q qVar = sVar.f175673e;
                    this.f175660b = null;
                    this.f175659a = 4;
                    x53.c cVar3 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new p(qVar, null), this);
                    if (objE0 != obj2) {
                        objE0 = Unit.INSTANCE;
                    }
                    if (objE0 != obj2) {
                        o oVar = sVar.f175674f;
                        this.f175660b = null;
                        this.f175659a = 5;
                        x53.c cVar4 = s0.f129406a;
                        objE1 = ge1.b.e0(x53.b.f189152a, new n(oVar, null), this);
                        if (objE1 != obj2) {
                            objE1 = Unit.INSTANCE;
                        }
                    }
                    return obj2;
                }
                if (i14 == 4) {
                    o13.r.b(obj);
                    o oVar2 = sVar.f175674f;
                    this.f175660b = null;
                    this.f175659a = 5;
                    x53.c cVar5 = s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new n(oVar2, null), this);
                    if (objE1 != obj2) {
                        objE1 = Unit.INSTANCE;
                    }
                } else {
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            }
            m0 m0Var = this.f175662d;
            if (!m0Var.f105804a) {
                this.f175663e.invoke();
                m0Var.f105804a = true;
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.PACE_PRO;
            aVar.getClass();
            i2.a.a(a2Var, "processUpdates");
            return Unit.INSTANCE;
            v41.b bVar = sVar.f175671c;
            this.f175660b = null;
            this.f175659a = 3;
            x53.c cVar6 = s0.f129406a;
            Object objE5 = ge1.b.e0(x53.b.f189152a, new v41.a(bVar, null), this);
            if (objE5 != obj2) {
                objE5 = Unit.INSTANCE;
            }
            if (objE5 != obj2) {
                q qVar2 = sVar.f175673e;
                this.f175660b = null;
                this.f175659a = 4;
                x53.c cVar7 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new p(qVar2, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                    o oVar3 = sVar.f175674f;
                    this.f175660b = null;
                    this.f175659a = 5;
                    x53.c cVar8 = s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new n(oVar3, null), this);
                    if (objE1 != obj2) {
                        objE1 = Unit.INSTANCE;
                    }
                }
            }
            return obj2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<List<? extends Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f175664a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f175665a;

            /* JADX INFO: renamed from: v41.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.ProcessPlanUpdatesUseCase$processUpdates$2$invokeSuspend$$inlined$map$1$2", f = "ProcessPlanUpdatesUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C3276a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f175666a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f175667b;

                public C3276a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f175666a = obj;
                    this.f175667b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f175665a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3276a c3276a;
                if (dVar instanceof C3276a) {
                    c3276a = (C3276a) dVar;
                    int i14 = c3276a.f175667b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3276a.f175667b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3276a = new C3276a(dVar);
                    }
                } else {
                    c3276a = new C3276a(dVar);
                }
                Object obj2 = c3276a.f175666a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3276a.f175667b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2 = ((u41.b) obj).f168609a;
                    Long l14 = new Long(aVar2.f39760b.f39773j);
                    com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = aVar2.f39760b;
                    com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2 = aVar2.f39760b;
                    List listK = p13.x.k(l14, new Double(bVar.f39774k), bVar2.f39768e, Boolean.valueOf(bVar2.f39778o), bVar2.f39780q, bVar2.f39771h, bVar2.f39772i);
                    c3276a.f175667b = 1;
                    if (this.f175665a.emit(listK, c3276a) == aVar) {
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
            this.f175664a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super List<? extends Object>> jVar, t13.d dVar) {
            Object objCollect = this.f175664a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, m0 m0Var, e23.a<Unit> aVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f175656b = sVar;
        this.f175657c = m0Var;
        this.f175658d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f175656b, this.f175657c, this.f175658d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175655a;
        if (i14 == 0) {
            o13.r.b(obj);
            s sVar = this.f175656b;
            r53.i iVarS = r53.s.s(new b(sVar.f175669a));
            a aVar2 = new a(sVar, this.f175657c, this.f175658d, null);
            this.f175655a = 1;
            if (r53.s.k(iVarS, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
