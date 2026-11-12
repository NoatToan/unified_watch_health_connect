package n81;

import j70.x;
import java.util.Iterator;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f124933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n81.a f124934b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f124935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n81.a f124936b;

        /* JADX INFO: renamed from: n81.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.domain.dashboard.GetHillScoreDataUseCase$invoke$$inlined$map$1$2", f = "GetHillScoreDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2404a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124937a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124938b;

            public C2404a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124937a = obj;
                this.f124938b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, n81.a aVar) {
            this.f124935a = jVar;
            this.f124936b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2404a c2404a;
            x xVarB;
            Integer hillScore;
            List<k81.a> listD;
            if (dVar instanceof C2404a) {
                c2404a = (C2404a) dVar;
                int i14 = c2404a.f124938b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2404a.f124938b = i14 - Integer.MIN_VALUE;
                } else {
                    c2404a = new C2404a(dVar);
                }
            } else {
                c2404a = new C2404a(dVar);
            }
            Object obj2 = c2404a.f124937a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2404a.f124938b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String str = (String) dVar2.f97521b;
                int i16 = n81.a.f124931b;
                n81.a aVar2 = this.f124936b;
                aVar2.getClass();
                k81.b bVar = (k81.b) aVar2.a(str, new d());
                List listN0 = (bVar == null || (listD = bVar.d()) == null) ? null : h0.N0(listD, new c());
                if (listN0 == null) {
                    listN0 = j0.f134944a;
                }
                k81.a aVar3 = (k81.a) h0.n0(listN0);
                k81.a aVar4 = (k81.a) h0.e0(listN0.size() - 2, listN0);
                if ((aVar3 != null ? aVar3.getHillScore() : null) == null) {
                    xVarB = null;
                } else {
                    if ((aVar4 != null ? aVar4.getHillScore() : null) == null) {
                        xVarB = null;
                    } else {
                        x.a aVar5 = x.f97667d;
                        double dIntValue = aVar4.getHillScore().intValue();
                        double dIntValue2 = aVar3.getHillScore().intValue();
                        aVar5.getClass();
                        xVarB = x.a.b(dIntValue, dIntValue2);
                    }
                }
                yz1.d dVar3 = dVar2.f97520a;
                Integer hillScore2 = aVar3 != null ? aVar3.getHillScore() : null;
                Float f14 = (aVar3 == null || (hillScore = aVar3.getHillScore()) == null) ? null : new Float((float) ((((double) hillScore.intValue()) - 0.0d) / 100.0d));
                Integer num = xVarB != null ? new Integer(xVarB.f97672a) : null;
                boolean z14 = false;
                if (!listN0.isEmpty()) {
                    Iterator<T> it = listN0.iterator();
                    while (it.hasNext()) {
                        if (((k81.a) it.next()).getHillScore() != null) {
                            z14 = true;
                            break;
                        }
                    }
                }
                e eVar = new e(dVar3, hillScore2, f14, num, Boolean.valueOf(z14));
                c2404a.f124938b = 1;
                if (this.f124935a.emit(eVar, c2404a) == aVar) {
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

    public b(i iVar, n81.a aVar) {
        this.f124933a = iVar;
        this.f124934b = aVar;
    }

    @Override // r53.i
    public final Object collect(j<? super e> jVar, t13.d dVar) {
        Object objCollect = this.f124933a.collect(new a(jVar, this.f124934b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
