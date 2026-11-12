package gn;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements r53.i<hn.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f78044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f78045b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f78046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f78047b;

        /* JADX INFO: renamed from: gn.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.activities.domain.dashboard.GetLastActivityDataUseCase$invoke$$inlined$map$1$2", f = "GetLastActivityDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1574a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f78048a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f78049b;

            public C1574a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f78048a = obj;
                this.f78049b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, n nVar) {
            this.f78046a = jVar;
            this.f78047b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1574a c1574a;
            if (dVar instanceof C1574a) {
                c1574a = (C1574a) dVar;
                int i14 = c1574a.f78049b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1574a.f78049b = i14 - Integer.MIN_VALUE;
                } else {
                    c1574a = new C1574a(dVar);
                }
            } else {
                c1574a = new C1574a(dVar);
            }
            Object obj2 = c1574a.f78048a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1574a.f78049b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String str = (String) dVar2.f97521b;
                n nVar = this.f78047b;
                nVar.getClass();
                List list = (List) nVar.a(str, new m());
                jr.q qVar = null;
                ActivityListItemDTO activityListItemDTO = list != null ? (ActivityListItemDTO) h0.d0(list) : null;
                yz1.d dVar3 = dVar2.f97520a;
                if (activityListItemDTO != null) {
                    kr.a aVar2 = new kr.a(nVar.f78051a);
                    x0 x0Var = activityListItemDTO.f29265g;
                    x0Var.getClass();
                    List<jr.q> listA = aVar2.a(x0Var).a();
                    if (listA != null) {
                        for (T t7 : listA) {
                            if (((jr.q) t7).d() == jr.s.Home) {
                                qVar = t7;
                                break;
                            }
                        }
                        qVar = qVar;
                    }
                }
                hn.a aVar3 = new hn.a(dVar3, activityListItemDTO, qVar);
                c1574a.f78049b = 1;
                if (this.f78046a.emit(aVar3, c1574a) == aVar) {
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

    public l(r53.i iVar, n nVar) {
        this.f78044a = iVar;
        this.f78045b = nVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super hn.a> jVar, t13.d dVar) {
        Object objCollect = this.f78044a.collect(new a(jVar, this.f78045b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
