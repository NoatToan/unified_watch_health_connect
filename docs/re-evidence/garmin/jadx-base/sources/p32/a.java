package p32;

import o13.r;
import o61.p;
import o61.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import t13.d;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<o32.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f135400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f135401b;

    /* JADX INFO: renamed from: p32.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2566a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f135402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f135403b;

        /* JADX INFO: renamed from: p32.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.vo2.dashboard.domain.usecase.GetVO2MaxDataUseCase$invoke$$inlined$map$1$2", f = "GetVO2MaxDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2567a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f135404a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f135405b;

            public C2567a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f135404a = obj;
                this.f135405b |= Integer.MIN_VALUE;
                return C2566a.this.emit(null, this);
            }
        }

        public C2566a(j jVar, c cVar) {
            this.f135402a = jVar;
            this.f135403b = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005f A[PHI: r6
          0x005f: PHI (r6v8 double) = (r6v5 double), (r6v6 double) binds: [B:20:0x005d, B:23:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C2567a c2567a;
            Double d14;
            Float f14;
            if (dVar instanceof C2567a) {
                c2567a = (C2567a) dVar;
                int i14 = c2567a.f135405b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2567a.f135405b = i14 - Integer.MIN_VALUE;
                } else {
                    c2567a = new C2567a(dVar);
                }
            } else {
                c2567a = new C2567a(dVar);
            }
            Object obj2 = c2567a.f135404a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2567a.f135405b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String str = (String) dVar2.f97521b;
                c cVar = this.f135403b;
                cVar.getClass();
                q71.e eVar = cVar.f135408b;
                p pVar = (p) cVar.a(str, new b());
                q qVarC = pVar != null ? pVar.c(eVar) : null;
                if (qVarC != null) {
                    double vo2MaxPreciseValue = qVarC.getVo2MaxPreciseValue();
                    double d15 = 20.0d;
                    if (vo2MaxPreciseValue < 20.0d) {
                        vo2MaxPreciseValue = d15;
                    } else {
                        d15 = 60.0d;
                        if (vo2MaxPreciseValue > 60.0d) {
                            vo2MaxPreciseValue = d15;
                        }
                    }
                    d14 = new Double(vo2MaxPreciseValue);
                } else {
                    d14 = null;
                }
                a61.e.f1563a.getClass();
                double[] dArrG = a61.e.g();
                q71.a aVarB = d14 != null ? a61.e.b(d14.doubleValue(), dArrG) : null;
                if (qVarC != null) {
                    double vo2MaxPreciseValue2 = qVarC.getVo2MaxPreciseValue();
                    dArrG.getClass();
                    f14 = new Float(((Number) oi0.c.I(vo2MaxPreciseValue2, oi0.c.j(new p13.q(dArrG), vo2MaxPreciseValue2)).f128595b).floatValue() / 100.0f);
                } else {
                    f14 = null;
                }
                o32.a aVar2 = new o32.a(dVar2.f97520a, aVarB, qVarC != null ? new Integer((int) qVarC.getVo2MaxValue()) : null, f14, eVar);
                c2567a.f135405b = 1;
                if (this.f135402a.emit(aVar2, c2567a) == aVar) {
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
        this.f135400a = iVar;
        this.f135401b = cVar;
    }

    @Override // r53.i
    public final Object collect(j<? super o32.a> jVar, d dVar) {
        Object objCollect = this.f135400a.collect(new C2566a(jVar, this.f135401b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
