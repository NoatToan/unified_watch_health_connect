package nn0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import t13.d;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f126678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nn0.a f126679b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f126680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nn0.a f126681b;

        /* JADX INFO: renamed from: nn0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.dashboard.GetHealthStatusCardDataUseCase$invoke$$inlined$map$1$2", f = "GetHealthStatusCardDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2436a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f126682a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f126683b;

            public C2436a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f126682a = obj;
                this.f126683b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, nn0.a aVar) {
            this.f126680a = jVar;
            this.f126681b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C2436a c2436a;
            ArrayList arrayList;
            in0.d dVar2;
            LocalDate localDate;
            LocalDate localDate2;
            LocalDate localDate3;
            in0.c cVarD;
            if (dVar instanceof C2436a) {
                c2436a = (C2436a) dVar;
                int i14 = c2436a.f126683b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2436a.f126683b = i14 - Integer.MIN_VALUE;
                } else {
                    c2436a = new C2436a(dVar);
                }
            } else {
                c2436a = new C2436a(dVar);
            }
            Object obj2 = c2436a.f126682a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2436a.f126683b;
            String str = null;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar3 = (j70.d) obj;
                pb2.e.l lVar = (pb2.e.l) dVar3.f97521b;
                int i16 = nn0.a.f126675c;
                nn0.a aVar2 = this.f126681b;
                aVar2.getClass();
                if (lVar == null) {
                    dVar2 = null;
                } else {
                    DateTime dateTime = lVar.f137057a;
                    String strValueOf = String.valueOf((dateTime == null || (localDate3 = dateTime.toLocalDate()) == null) ? null : fz0.d.c(localDate3));
                    Integer num = lVar.f137058b;
                    LocalDateTime localDateTime = lVar.f137059c;
                    String strValueOf2 = String.valueOf((localDateTime == null || (localDate2 = localDateTime.toLocalDate()) == null) ? null : fz0.d.c(localDate2));
                    LocalDateTime localDateTime2 = lVar.f137060d;
                    String strValueOf3 = String.valueOf((localDateTime2 == null || (localDate = localDateTime2.toLocalDate()) == null) ? null : fz0.d.c(localDate));
                    List<pb2.e.s> list = lVar.f137061e;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (pb2.e.s sVar : list) {
                            arrayList2.add(new in0.i(sVar != null ? sVar.f137092g : str, sVar != null ? sVar.f137086a : null, sVar != null ? sVar.f137087b : null, sVar != null ? sVar.f137088c : null, sVar != null ? sVar.f137089d : null, sVar != null ? sVar.f137090e : null, sVar != null ? sVar.f137091f : null));
                            str = null;
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    dVar2 = new in0.d(strValueOf, num, strValueOf2, strValueOf3, arrayList);
                }
                if (dVar2 == null) {
                    cVarD = null;
                } else {
                    cVarD = on0.a.d(dVar2, aVar2.f126677b.y());
                    if (cVarD == null) {
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "GetHealthStatusDataUseCase", "Mapping failed: missing required field");
                        cVarD = null;
                    }
                }
                c cVar = new c(dVar3.f97520a, cVarD != null ? cVarD.f94424e : null);
                c2436a.f126683b = 1;
                if (this.f126680a.emit(cVar, c2436a) == aVar) {
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

    public b(i iVar, nn0.a aVar) {
        this.f126678a = iVar;
        this.f126679b = aVar;
    }

    @Override // r53.i
    public final Object collect(j<? super c> jVar, d dVar) {
        Object objCollect = this.f126678a.collect(new a(jVar, this.f126679b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
