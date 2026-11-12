package b50;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements r53.i<o13.p<? extends w20.a, ? extends r30.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f16076a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f16077a;

        /* JADX INFO: renamed from: b50.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$clearChartOverlayWhenUnavailable$$inlined$map$1$2", f = "CourseDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
        public static final class C0226a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f16078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f16079b;

            public C0226a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f16078a = obj;
                this.f16079b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f16077a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C0226a c0226a;
            if (dVar instanceof C0226a) {
                c0226a = (C0226a) dVar;
                int i14 = c0226a.f16079b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c0226a.f16079b = i14 - Integer.MIN_VALUE;
                } else {
                    c0226a = new C0226a(dVar);
                }
            } else {
                c0226a = new C0226a(dVar);
            }
            Object obj2 = c0226a.f16078a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c0226a.f16079b;
            if (i15 == 0) {
                o13.r.b(obj2);
                e50.d dVar2 = (e50.d) obj;
                o13.p pVar = new o13.p(dVar2.f62992d, dVar2.f63000l);
                c0226a.f16079b = 1;
                if (this.f16077a.emit(pVar, c0226a) == aVar) {
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

    public t(r53.i iVar) {
        this.f16076a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super o13.p<? extends w20.a, ? extends r30.a>> jVar, t13.d dVar) {
        Object objCollect = this.f16076a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
