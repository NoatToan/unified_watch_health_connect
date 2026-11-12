package d71;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r53.i<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f58136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f58137b;

    /* JADX INFO: renamed from: d71.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1238a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f58138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f58139b;

        /* JADX INFO: renamed from: d71.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingload.domain.dashboard.GetLoadFocusDataUseCase$invoke$$inlined$map$1$2", f = "GetLoadFocusDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1239a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f58140a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f58141b;

            public C1239a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f58140a = obj;
                this.f58141b |= Integer.MIN_VALUE;
                return C1238a.this.emit(null, this);
            }
        }

        public C1238a(r53.j jVar, d dVar) {
            this.f58138a = jVar;
            this.f58139b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1239a c1239a;
            Double monthlyLoadAerobicLowTargetMax;
            Double monthlyLoadAerobicLowTargetMin;
            Double monthlyLoadAerobicLow;
            Double monthlyLoadAerobicHighTargetMax;
            Double monthlyLoadAerobicHighTargetMin;
            Double monthlyLoadAerobicHigh;
            Double monthlyLoadAnaerobicTargetMax;
            Double monthlyLoadAnaerobicTargetMin;
            Double monthlyLoadAnaerobic;
            Collection<x61.i> collectionValues;
            List listN0;
            if (dVar instanceof C1239a) {
                c1239a = (C1239a) dVar;
                int i14 = c1239a.f58141b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1239a.f58141b = i14 - Integer.MIN_VALUE;
                } else {
                    c1239a = new C1239a(dVar);
                }
            } else {
                c1239a = new C1239a(dVar);
            }
            Object obj2 = c1239a.f58140a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1239a.f58141b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String str = (String) dVar2.f97521b;
                d dVar3 = this.f58139b;
                dVar3.getClass();
                o61.e eVar = (o61.e) dVar3.a(str, new c());
                Map<String, x61.i> mapA = eVar != null ? eVar.a() : null;
                x61.i iVar = (mapA == null || (collectionValues = mapA.values()) == null || (listN0 = h0.N0(collectionValues, new b())) == null) ? null : (x61.i) h0.n0(listN0);
                yz1.d dVar4 = dVar2.f97520a;
                Integer num = (iVar == null || (monthlyLoadAnaerobic = iVar.getMonthlyLoadAnaerobic()) == null) ? null : new Integer(MathKt.b(monthlyLoadAnaerobic.doubleValue()));
                Integer num2 = (iVar == null || (monthlyLoadAnaerobicTargetMin = iVar.getMonthlyLoadAnaerobicTargetMin()) == null) ? null : new Integer(MathKt.b(monthlyLoadAnaerobicTargetMin.doubleValue()));
                Integer num3 = (iVar == null || (monthlyLoadAnaerobicTargetMax = iVar.getMonthlyLoadAnaerobicTargetMax()) == null) ? null : new Integer(MathKt.b(monthlyLoadAnaerobicTargetMax.doubleValue()));
                Integer num4 = (iVar == null || (monthlyLoadAerobicHigh = iVar.getMonthlyLoadAerobicHigh()) == null) ? null : new Integer(MathKt.b(monthlyLoadAerobicHigh.doubleValue()));
                Integer num5 = (iVar == null || (monthlyLoadAerobicHighTargetMin = iVar.getMonthlyLoadAerobicHighTargetMin()) == null) ? null : new Integer(MathKt.b(monthlyLoadAerobicHighTargetMin.doubleValue()));
                Integer num6 = (iVar == null || (monthlyLoadAerobicHighTargetMax = iVar.getMonthlyLoadAerobicHighTargetMax()) == null) ? null : new Integer(MathKt.b(monthlyLoadAerobicHighTargetMax.doubleValue()));
                Integer num7 = (iVar == null || (monthlyLoadAerobicLow = iVar.getMonthlyLoadAerobicLow()) == null) ? null : new Integer(MathKt.b(monthlyLoadAerobicLow.doubleValue()));
                Integer num8 = (iVar == null || (monthlyLoadAerobicLowTargetMin = iVar.getMonthlyLoadAerobicLowTargetMin()) == null) ? null : new Integer(MathKt.b(monthlyLoadAerobicLowTargetMin.doubleValue()));
                Integer num9 = (iVar == null || (monthlyLoadAerobicLowTargetMax = iVar.getMonthlyLoadAerobicLowTargetMax()) == null) ? null : new Integer(MathKt.b(monthlyLoadAerobicLowTargetMax.doubleValue()));
                x61.c.m mVar = x61.c.f189186c;
                String trainingBalanceFeedbackPhraseKey = iVar != null ? iVar.getTrainingBalanceFeedbackPhraseKey() : null;
                mVar.getClass();
                i iVar2 = new i(dVar4, num, num2, num3, num4, num5, num6, num7, num8, num9, x61.c.m.a(trainingBalanceFeedbackPhraseKey).f189188b);
                c1239a.f58141b = 1;
                if (this.f58138a.emit(iVar2, c1239a) == aVar) {
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

    public a(r53.i iVar, d dVar) {
        this.f58136a = iVar;
        this.f58137b = dVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super i> jVar, t13.d dVar) {
        Object objCollect = this.f58136a.collect(new C1238a(jVar, this.f58137b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
