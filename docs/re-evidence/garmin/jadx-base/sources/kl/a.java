package kl;

import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<j70.d<x61.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f105187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f105188b;

    /* JADX INFO: renamed from: kl.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2022a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f105189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f105190b;

        /* JADX INFO: renamed from: kl.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.acclimation.dashboard.domain.usecase.GetAcclimationDataUseCase$invoke$$inlined$map$1$2", f = "GetAcclimationDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2023a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f105191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f105192b;

            public C2023a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f105191a = obj;
                this.f105192b |= Integer.MIN_VALUE;
                return C2022a.this.emit(null, this);
            }
        }

        public C2022a(j jVar, c cVar) {
            this.f105189a = jVar;
            this.f105190b = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2023a c2023a;
            if (dVar instanceof C2023a) {
                c2023a = (C2023a) dVar;
                int i14 = c2023a.f105192b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2023a.f105192b = i14 - Integer.MIN_VALUE;
                } else {
                    c2023a = new C2023a(dVar);
                }
            } else {
                c2023a = new C2023a(dVar);
            }
            Object obj2 = c2023a.f105191a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2023a.f105192b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                yz1.d dVar3 = dVar2.f97520a;
                String str = (String) dVar2.f97521b;
                c cVar = this.f105190b;
                cVar.getClass();
                j70.d dVar4 = new j70.d(dVar3, (x61.e) cVar.a(str, new b()));
                c2023a.f105192b = 1;
                if (this.f105189a.emit(dVar4, c2023a) == aVar) {
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

    public a(i iVar, c cVar) {
        this.f105187a = iVar;
        this.f105188b = cVar;
    }

    @Override // r53.i
    public final Object collect(j<? super j70.d<x61.e>> jVar, t13.d dVar) {
        Object objCollect = this.f105187a.collect(new C2022a(jVar, this.f105188b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
