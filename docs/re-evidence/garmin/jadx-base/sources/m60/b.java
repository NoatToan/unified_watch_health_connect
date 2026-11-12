package m60;

import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.i;
import r53.j;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<m60.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f116874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f116875b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f116876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f116877b;

        /* JADX INFO: renamed from: m60.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.criticalswimspeed.summary.domain.dashboard.GetCriticalSwimSpeedDataUseCase$invoke$$inlined$map$1$2", f = "GetCriticalSwimSpeedDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2221a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f116878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f116879b;

            public C2221a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f116878a = obj;
                this.f116879b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, d dVar) {
            this.f116876a = jVar;
            this.f116877b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2221a c2221a;
            List<g60.b> listD;
            g60.b bVar;
            List<g60.b> listD2;
            g60.b bVar2;
            if (dVar instanceof C2221a) {
                c2221a = (C2221a) dVar;
                int i14 = c2221a.f116879b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2221a.f116879b = i14 - Integer.MIN_VALUE;
                } else {
                    c2221a = new C2221a(dVar);
                }
            } else {
                c2221a = new C2221a(dVar);
            }
            Object obj2 = c2221a.f116878a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2221a.f116879b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String str = (String) dVar2.f97521b;
                d dVar3 = this.f116877b;
                dVar3.getClass();
                n60.b bVar3 = (n60.b) dVar3.a(str, new c());
                Double dB = null;
                String measurementTimestampLocal = (bVar3 == null || (listD2 = bVar3.d()) == null || (bVar2 = (g60.b) h0.d0(listD2)) == null) ? null : bVar2.getMeasurementTimestampLocal();
                if (bVar3 != null && (listD = bVar3.d()) != null && (bVar = (g60.b) h0.d0(listD)) != null) {
                    dB = bVar.b();
                }
                m60.a aVar2 = new m60.a(dVar2.f97520a, measurementTimestampLocal, dB);
                c2221a.f116879b = 1;
                if (this.f116876a.emit(aVar2, c2221a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public b(i iVar, d dVar) {
        this.f116874a = iVar;
        this.f116875b = dVar;
    }

    @Override // r53.i
    public final Object collect(j<? super m60.a> jVar, t13.d dVar) {
        Object objCollect = this.f116874a.collect(new a(jVar, this.f116875b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
