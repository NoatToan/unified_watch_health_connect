package q52;

import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements r53.i<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f142904a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f142905a;

        /* JADX INFO: renamed from: q52.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.domain.details.LoadAdaptiveCoachWorkoutUseCase$invoke$$inlined$map$1$2", f = "LoadAdaptiveCoachWorkoutUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2687a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f142906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f142907b;

            public C2687a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f142906a = obj;
                this.f142907b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar) {
            this.f142905a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2687a c2687a;
            b bVar;
            if (dVar instanceof C2687a) {
                c2687a = (C2687a) dVar;
                int i14 = c2687a.f142907b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2687a.f142907b = i14 - Integer.MIN_VALUE;
                } else {
                    c2687a = new C2687a(dVar);
                }
            } else {
                c2687a = new C2687a(dVar);
            }
            Object obj2 = c2687a.f142906a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2687a.f142907b;
            if (i15 == 0) {
                r.b(obj2);
                Object obj3 = ((q) obj).f128597a;
                boolean z14 = obj3 instanceof q.b;
                if (z14) {
                    bVar = b.DISCONNECTED;
                } else {
                    if (z14) {
                        obj3 = null;
                    }
                    bVar = (b) obj3;
                    if (bVar == null) {
                        bVar = b.FAILURE;
                    }
                }
                c2687a.f142907b = 1;
                if (this.f142905a.emit(bVar, c2687a) == aVar) {
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

    public d(r53.i iVar) {
        this.f142904a = iVar;
    }

    @Override // r53.i
    public final Object collect(j<? super b> jVar, t13.d dVar) {
        Object objCollect = this.f142904a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
