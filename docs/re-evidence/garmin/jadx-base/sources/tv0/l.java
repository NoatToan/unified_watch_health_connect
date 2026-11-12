package tv0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ltv0/h;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase$invoke$1", f = "SaveBehaviourChangesUseCase.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<r53.j<? super h>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f166584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f166585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<pv0.d> f166586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<pv0.d> f166587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b63.o f166588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Boolean f166589g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/i$b;", "it", "Ltv0/i$c;", "<anonymous>", "(Ltv0/i$b;)Ltv0/i$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase$invoke$1$1", f = "SaveBehaviourChangesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<i.b, t13.d<? super i.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f166590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f166591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166591b = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f166591b, dVar);
            aVar.f166590a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(i.b bVar, t13.d<? super i.c> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i.b bVar = (i.b) this.f166590a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = i.f166561f;
            this.f166591b.getClass();
            if (!bVar.f166567a.equals(bVar.f166568b)) {
                return new i.c.b(bVar);
            }
            a2 a2Var = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SaveBehaviourChangesUseCase", "No behaviour changes to save");
            return new i.c.a(new h.c(bVar.f166567a, false));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/i$b;", "it", "Ltv0/i$c;", "<anonymous>", "(Ltv0/i$b;)Ltv0/i$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase$invoke$1$2", f = "SaveBehaviourChangesUseCase.kt", l = {45}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<i.b, t13.d<? super i.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f166593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f166594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f166594c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f166594c, dVar);
            bVar.f166593b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(i.b bVar, t13.d<? super i.c> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i.b bVar = (i.b) this.f166593b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166592a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f166593b = null;
            this.f166592a = 1;
            Object objA = i.a(this.f166594c, bVar, this);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/i$b;", "it", "Ltv0/i$c;", "<anonymous>", "(Ltv0/i$b;)Ltv0/i$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase$invoke$1$3", f = "SaveBehaviourChangesUseCase.kt", l = {46}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<i.b, t13.d<? super i.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f166596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f166597c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f166597c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(this.f166597c, dVar);
            cVar.f166596b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(i.b bVar, t13.d<? super i.c> dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i.b bVar = (i.b) this.f166596b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166595a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f166596b = null;
            this.f166595a = 1;
            Object objC = i.c(this.f166597c, bVar, this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/i$b;", "it", "Ltv0/i$c;", "<anonymous>", "(Ltv0/i$b;)Ltv0/i$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase$invoke$1$4", f = "SaveBehaviourChangesUseCase.kt", l = {47}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<i.b, t13.d<? super i.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f166599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f166600c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f166600c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f166600c, dVar);
            dVar2.f166599b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(i.b bVar, t13.d<? super i.c> dVar) {
            return ((d) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i.b bVar = (i.b) this.f166599b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166598a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f166599b = null;
            this.f166598a = 1;
            Object objE = i.e(this.f166600c, bVar, this);
            return objE == aVar ? aVar : objE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/i$b;", "it", "Ltv0/i$c;", "<anonymous>", "(Ltv0/i$b;)Ltv0/i$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase$invoke$1$5", f = "SaveBehaviourChangesUseCase.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<i.b, t13.d<? super i.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f166602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f166603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b63.o f166604d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i iVar, b63.o oVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f166603c = iVar;
            this.f166604d = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = new e(this.f166603c, this.f166604d, dVar);
            eVar.f166602b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(i.b bVar, t13.d<? super i.c> dVar) {
            return ((e) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i.b bVar = (i.b) this.f166602b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166601a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f166602b = null;
            this.f166601a = 1;
            Object objD = i.d(this.f166603c, bVar, this.f166604d, this);
            return objD == aVar ? aVar : objD;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/i$b;", "it", "Ltv0/i$c;", "<anonymous>", "(Ltv0/i$b;)Ltv0/i$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase$invoke$1$6", f = "SaveBehaviourChangesUseCase.kt", l = {49}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<i.b, t13.d<? super i.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f166606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f166607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(i iVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f166607c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = new f(this.f166607c, dVar);
            fVar.f166606b = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(i.b bVar, t13.d<? super i.c> dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i.b bVar = (i.b) this.f166606b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166605a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f166606b = null;
            this.f166605a = 1;
            int i15 = i.f166561f;
            i iVar = this.f166607c;
            iVar.getClass();
            a2 a2Var = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SaveBehaviourChangesUseCase", "Request device update");
            tv0.g gVar = iVar.f166564c;
            int i16 = tv0.g.f166548d;
            gVar.a(0L);
            i.c.b bVar2 = new i.c.b(bVar);
            return bVar2 == aVar ? aVar : bVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/i$b;", "it", "Ltv0/i$c;", "<anonymous>", "(Ltv0/i$b;)Ltv0/i$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase$invoke$1$7", f = "SaveBehaviourChangesUseCase.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<i.b, t13.d<? super i.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f166609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f166610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f166611d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(i iVar, Boolean bool, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f166610c = iVar;
            this.f166611d = bool;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = new g(this.f166610c, this.f166611d, dVar);
            gVar.f166609b = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(i.b bVar, t13.d<? super i.c> dVar) {
            return ((g) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i.b bVar = (i.b) this.f166609b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166608a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f166609b = null;
            this.f166608a = 1;
            Object objF = i.f(this.f166610c, this.f166611d, bVar, this);
            return objF == aVar ? aVar : objF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, List<pv0.d> list, List<pv0.d> list2, b63.o oVar, Boolean bool, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f166585c = iVar;
        this.f166586d = list;
        this.f166587e = list2;
        this.f166588f = oVar;
        this.f166589g = bool;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f166585c, this.f166586d, this.f166587e, this.f166588f, this.f166589g, dVar);
        lVar.f166584b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super h> jVar, t13.d<? super Unit> dVar) {
        return ((l) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f166584b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166583a;
        if (i14 == 0) {
            o13.r.b(obj);
            i.b bVar = new i.b(this.f166586d, this.f166587e);
            i iVar = this.f166585c;
            e23.p[] pVarArr = {new a(iVar, null), new b(iVar, null), new c(iVar, null), new d(iVar, null), new e(iVar, this.f166588f, null), new f(iVar, null), new g(iVar, this.f166589g, null)};
            this.f166584b = null;
            this.f166583a = 1;
            if (i.b(iVar, jVar, bVar, pVarArr, this) == aVar) {
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
