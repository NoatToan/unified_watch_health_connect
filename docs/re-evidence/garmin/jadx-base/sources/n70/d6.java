package n70;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d6 implements r53.i<o70.c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h6 f124145b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h6 f124147b;

        /* JADX INFO: renamed from: n70.d6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetTrainingPlansDataUseCase$invoke$$inlined$map$1$2", f = "GetTrainingPlansDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2343a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124149b;

            public C2343a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124148a = obj;
                this.f124149b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, h6 h6Var) {
            this.f124146a = jVar;
            this.f124147b = h6Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2343a c2343a;
            List list;
            boolean z14;
            DateTime dateTimeB;
            DateTime dateTimePlusDays;
            DateTime dateTimeWithTimeAtStartOfDay;
            if (dVar instanceof C2343a) {
                c2343a = (C2343a) dVar;
                int i14 = c2343a.f124149b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2343a.f124149b = i14 - Integer.MIN_VALUE;
                } else {
                    c2343a = new C2343a(dVar);
                }
            } else {
                c2343a = new C2343a(dVar);
            }
            Object obj2 = c2343a.f124148a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2343a.f124149b;
            int i16 = 1;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.w wVar = (j70.w) obj;
                String str = wVar != null ? wVar.f97666c : null;
                this.f124147b.getClass();
                List list2 = str == null ? p13.j0.f134944a : (List) GsonUtil.f47253b.fromJson(str, new g6().getType());
                j70.k.i iVar = wVar != null ? wVar.f97665b : null;
                String str2 = iVar != null ? iVar.f97600b : null;
                List listI0 = str2 == null ? p13.j0.f134944a : p13.u.i0((Object[]) GsonUtil.f47253b.fromJson(str2, (Class) ww1.t[].class));
                String str3 = iVar != null ? iVar.f97601c : null;
                List listI1 = str3 == null ? p13.j0.f134944a : p13.u.i0((Object[]) GsonUtil.f47253b.fromJson(str3, (Class) xw1.p[].class));
                String str4 = iVar != null ? iVar.f97602d : null;
                if (str4 == null) {
                    list = p13.j0.f134944a;
                } else {
                    List listI2 = p13.u.i0((Object[]) GsonUtil.f47253b.fromJson(str4, (Class) ww1.s[].class));
                    ArrayList arrayList = new ArrayList();
                    for (T t7 : listI2) {
                        ww1.s sVar = (ww1.s) t7;
                        if (sVar.e() && (sVar.c() || sVar.d())) {
                            arrayList.add(t7);
                        }
                    }
                    list = arrayList;
                }
                yz1.d dVarA = yz1.e.a(iVar != null ? iVar.f97599a : null, new e6(listI0, listI1));
                ArrayList arrayList2 = new ArrayList();
                for (T t14 : listI0) {
                    ww1.t tVar = (ww1.t) t14;
                    ww1.c0 trainingPlanDetailBrief = tVar.getTrainingPlanDetailBrief();
                    ww1.b0 b0VarB = tVar.b();
                    if (trainingPlanDetailBrief != null && b0VarB != null) {
                        ww1.y quit = trainingPlanDetailBrief.getQuit();
                        boolean zG = quit != null ? p005kotlin.jvm.internal.s.g(quit.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String(), Boolean.TRUE) : false;
                        ww1.h athleteRace = trainingPlanDetailBrief.getAthleteRace();
                        boolean zIsAfterNow = (athleteRace == null || (dateTimeB = athleteRace.b()) == null || (dateTimePlusDays = dateTimeB.plusDays(i16)) == null || (dateTimeWithTimeAtStartOfDay = dateTimePlusDays.withTimeAtStartOfDay()) == null) ? false : dateTimeWithTimeAtStartOfDay.isAfterNow();
                        boolean z15 = trainingPlanDetailBrief.getPlanComplete() && b0VarB == ww1.b0.FBT_ADAPTIVE;
                        if ((!trainingPlanDetailBrief.getPlanComplete() && !zG && zIsAfterNow) || z15) {
                            arrayList2.add(t14);
                        }
                    }
                    i16 = 1;
                }
                List<ww1.t> listN0 = p13.h0.N0(arrayList2, new f6());
                ArrayList arrayList3 = new ArrayList();
                for (ww1.t tVar2 : listN0) {
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.d> listA = tVar2.a();
                    if (listA != null && listA.isEmpty()) {
                        z14 = false;
                        break;
                    }
                    Iterator<T> it = listA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z14 = false;
                            break;
                        }
                        if (((com.garmin.android.apps.connectmobile.workouts.data.model.d) it.next()).s()) {
                            z14 = true;
                            break;
                        }
                    }
                    ww1.c0 trainingPlanDetailBrief2 = tVar2.getTrainingPlanDetailBrief();
                    r70.s sVarB = m70.f.b(new j70.d(dVarA, new ww1.u(tVar2, list2, listI1, z14, trainingPlanDetailBrief2 != null && trainingPlanDetailBrief2.getPlanComplete(), list)), "TrainingPlanType_" + o70.b0.TRAINING.f129929a);
                    if (sVarB != null) {
                        arrayList3.add(sVarB);
                    }
                }
                o70.c0 c0Var = new o70.c0((wVar != null ? wVar.f97664a : 0) > 1, dVarA, arrayList3);
                c2343a.f124149b = 1;
                if (this.f124146a.emit(c0Var, c2343a) == aVar) {
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

    public d6(r53.i iVar, h6 h6Var) {
        this.f124144a = iVar;
        this.f124145b = h6Var;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super o70.c0> jVar, t13.d dVar) {
        Object objCollect = this.f124144a.collect(new a(jVar, this.f124145b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
