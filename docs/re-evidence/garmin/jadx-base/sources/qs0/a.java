package qs0;

import java.util.Iterator;
import java.util.List;
import o13.r;
import o61.h;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import r53.i;
import r53.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<ps0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f147241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f147242b;

    /* JADX INFO: renamed from: qs0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2769a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f147243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f147244b;

        /* JADX INFO: renamed from: qs0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.dashboard.domain.usecase.GetLactateThresholdDataUseCase$invoke$$inlined$map$1$2", f = "GetLactateThresholdDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2770a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f147245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f147246b;

            public C2770a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f147245a = obj;
                this.f147246b |= Integer.MIN_VALUE;
                return C2769a.this.emit(null, this);
            }
        }

        public C2769a(j jVar, e eVar) {
            this.f147243a = jVar;
            this.f147244b = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2770a c2770a;
            T next;
            T next2;
            T next3;
            Integer numD;
            if (dVar instanceof C2770a) {
                c2770a = (C2770a) dVar;
                int i14 = c2770a.f147246b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2770a.f147246b = i14 - Integer.MIN_VALUE;
                } else {
                    c2770a = new C2770a(dVar);
                }
            } else {
                c2770a = new C2770a(dVar);
            }
            Object obj2 = c2770a.f147245a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2770a.f147246b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                List list = (List) dVar2.f97521b;
                String strK = null;
                String str = list != null ? (String) h0.d0(list) : null;
                e eVar = this.f147244b;
                eVar.getClass();
                xs0.a aVar2 = eVar.f147249b;
                Iterable iterable = (List) eVar.a(str, new c());
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                List list2 = (List) dVar2.f97521b;
                Iterable iterable2 = (List) eVar.a(list2 != null ? (String) h0.n0(list2) : null, new d());
                if (iterable2 == null) {
                    iterable2 = j0.f134944a;
                }
                Iterator<T> it = iterable.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (((vs0.b) next).d(aVar2) == null);
                vs0.b bVar = next;
                Iterator<T> it3 = iterable.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it3.next();
                } while (((vs0.b) next2).f(aVar2) == null);
                vs0.b bVar2 = next2;
                Iterator<T> it4 = iterable2.iterator();
                do {
                    if (!it4.hasNext()) {
                        next3 = (T) null;
                        break;
                    }
                    next3 = it4.next();
                } while (!s.g(((h) next3).getSport(), aVar2.f192068a));
                h hVar = next3;
                LocalDate localDate = (LocalDate) h0.n0(h0.N0(x.k(bVar != null ? bVar.a() : null, bVar2 != null ? bVar2.a() : null), new b()));
                Double d14 = (bVar == null || (numD = bVar.d(aVar2)) == null) ? null : new Double(numD.intValue());
                Double dF = bVar2 != null ? bVar2.f(aVar2) : null;
                Double d15 = (dF == null || Double.isNaN(dF.doubleValue())) ? null : new Double(dF.doubleValue() * ((double) 10));
                Double functionalThresholdPower = hVar != null ? hVar.getFunctionalThresholdPower() : null;
                Double powerToWeight = hVar != null ? hVar.getPowerToWeight() : null;
                if (localDate != null) {
                    c22.j0.f23099a.getClass();
                    strK = c22.j0.k(localDate.toDateTimeAtStartOfDay(), 'M');
                }
                ps0.a aVar3 = new ps0.a(dVar2.f97520a, d14, d15, functionalThresholdPower, powerToWeight, strK);
                c2770a.f147246b = 1;
                if (this.f147243a.emit(aVar3, c2770a) == aVar) {
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

    public a(i iVar, e eVar) {
        this.f147241a = iVar;
        this.f147242b = eVar;
    }

    @Override // r53.i
    public final Object collect(j<? super ps0.a> jVar, t13.d dVar) {
        Object objCollect = this.f147241a.collect(new C2769a(jVar, this.f147242b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
