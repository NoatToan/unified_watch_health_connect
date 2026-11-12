package x40;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements r53.i<o13.p<? extends w20.a, ? extends r30.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f188806a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f188807a;

        /* JADX INFO: renamed from: x40.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$clearChartOverlayWhenUnavailable$$inlined$map$1$2", f = "CreateCustomCourseViewModel.kt", l = {50}, m = "emit", v = 2)
        public static final class C3511a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f188808a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f188809b;

            public C3511a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f188808a = obj;
                this.f188809b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f188807a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C3511a c3511a;
            if (dVar instanceof C3511a) {
                c3511a = (C3511a) dVar;
                int i14 = c3511a.f188809b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3511a.f188809b = i14 - Integer.MIN_VALUE;
                } else {
                    c3511a = new C3511a(dVar);
                }
            } else {
                c3511a = new C3511a(dVar);
            }
            Object obj2 = c3511a.f188808a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3511a.f188809b;
            if (i15 == 0) {
                o13.r.b(obj2);
                a50.g gVar = (a50.g) obj;
                o13.p pVar = new o13.p(gVar.f1393d, gVar.f1405p);
                c3511a.f188809b = 1;
                if (this.f188807a.emit(pVar, c3511a) == aVar) {
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

    public x(r53.i iVar) {
        this.f188806a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super o13.p<? extends w20.a, ? extends r30.a>> jVar, t13.d dVar) {
        Object objCollect = this.f188806a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
