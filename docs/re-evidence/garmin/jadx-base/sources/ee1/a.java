package ee1;

import g22.k;
import hd1.g0;
import hs1.l;
import java.util.Iterator;
import java.util.List;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.i;
import r53.j;
import t13.d;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f63910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f63911b;

    /* JADX INFO: renamed from: ee1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1354a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f63912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f63913b;

        /* JADX INFO: renamed from: ee1.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.respiration.domain.dashboard.GetRespirationDataUseCase$invoke$$inlined$map$1$2", f = "GetRespirationDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1355a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f63914a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f63915b;

            public C1355a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f63914a = obj;
                this.f63915b |= Integer.MIN_VALUE;
                return C1354a.this.emit(null, this);
            }
        }

        public C1354a(j jVar, b bVar) {
            this.f63912a = jVar;
            this.f63913b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C1355a c1355a;
            T next;
            Integer avgValue;
            DateTime dateTimeC;
            if (dVar instanceof C1355a) {
                c1355a = (C1355a) dVar;
                int i14 = c1355a.f63915b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1355a.f63915b = i14 - Integer.MIN_VALUE;
                } else {
                    c1355a = new C1355a(dVar);
                }
            } else {
                c1355a = new C1355a(dVar);
            }
            Object obj2 = c1355a.f63914a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1355a.f63915b;
            if (i15 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                b bVar = this.f63913b;
                ae0.b bVar2 = bVar.f63918b;
                List list = (List) jVar.f97543b;
                Double d14 = null;
                List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, null);
                List list2 = (List) jVar.f97543b;
                String str = list2 != null ? (String) h0.e0(1, list2) : null;
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!k.g(((hs1.d) next).b(), LocalDate.now()));
                hs1.d dVar2 = next;
                l respiration = dVar2 != null ? dVar2.getRespiration() : null;
                yz1.d dVar3 = jVar.f97542a;
                g0 g0Var = (g0) jVar.f97544c;
                Integer latestValue = respiration != null ? respiration.getLatestValue() : null;
                long millis = (respiration == null || (dateTimeC = respiration.c()) == null) ? 0L : dateTimeC.getMillis();
                Integer numValueOf = g0Var != null ? Integer.valueOf(g0Var.f83381b) : null;
                long j8 = g0Var != null ? g0Var.f83396a : 0L;
                if (numValueOf != null) {
                    if (numValueOf.intValue() > 0) {
                        if (j8 >= millis) {
                            latestValue = numValueOf;
                        }
                    } else if (bVar.f63920d.N4() > 0) {
                        latestValue = null;
                    }
                }
                Double dValueOf = latestValue != null ? Double.valueOf(latestValue.intValue()) : null;
                if (dValueOf == null || dValueOf.doubleValue() < 0.0d) {
                    dValueOf = null;
                }
                Double dA = bVar.f63919c.a(str);
                if (dA == null || dA.doubleValue() < 0.0d) {
                    dA = null;
                }
                if (respiration != null && (avgValue = respiration.getAvgValue()) != null) {
                    Double d15 = new Double(avgValue.intValue());
                    if (d15.doubleValue() >= 0.0d) {
                        d14 = d15;
                    }
                }
                c cVar = new c(dVar3, dValueOf, dA, d14);
                c1355a.f63915b = 1;
                if (this.f63912a.emit(cVar, c1355a) == aVar) {
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

    public a(i iVar, b bVar) {
        this.f63910a = iVar;
        this.f63911b = bVar;
    }

    @Override // r53.i
    public final Object collect(j<? super c> jVar, d dVar) {
        Object objCollect = this.f63910a.collect(new C1354a(jVar, this.f63911b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
