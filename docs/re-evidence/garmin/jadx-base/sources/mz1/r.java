package mz1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getUpcomingRaceEventsAndProviders$1", f = "AddTIEventViewModel.kt", l = {3149, 3150}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f121905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f121906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f121907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f121908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121909e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getUpcomingRaceEventsAndProviders$1$eventListAsync$1", f = "AddTIEventViewModel.kt", l = {3138}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends fg0.k>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AddTIEventViewModel f121911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f121912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f121913d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AddTIEventViewModel addTIEventViewModel, String str, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f121911b = addTIEventViewModel;
            this.f121912c = str;
            this.f121913d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f121911b, this.f121912c, this.f121913d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends fg0.k>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121910a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            zf0.d dVar = this.f121911b.f204384a;
            String str = this.f121912c;
            if (str == null) {
                str = "";
            }
            String str2 = this.f121913d;
            String str3 = str2 != null ? str2 : "";
            String str4 = gg0.f.f77130f.f77147a;
            this.f121910a = 1;
            Object objG = dVar.g(str, str3, str4, this);
            return objG == aVar ? aVar : objG;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lfg0/n;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getUpcomingRaceEventsAndProviders$1$eventProvidersAsync$1", f = "AddTIEventViewModel.kt", l = {3146}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends fg0.n>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AddTIEventViewModel f121915b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AddTIEventViewModel addTIEventViewModel, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f121915b = addTIEventViewModel;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f121915b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends fg0.n>>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121914a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ig0.b bVarH4 = this.f121915b.H4();
            this.f121914a = 1;
            bVarH4.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVarH4, new ig0.f(bVarH4, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AddTIEventViewModel addTIEventViewModel, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f121909e = addTIEventViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f121909e, dVar);
        rVar.f121908d = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r0 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        Object objC;
        DateTime dateTime;
        DateTime dateTime2;
        v2 v2Var;
        Object objAwait;
        Integer num;
        Object next;
        o53.b0 b0Var = (o53.b0) this.f121908d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121907c;
        AddTIEventViewModel addTIEventViewModel = this.f121909e;
        if (i14 == 0) {
            o13.r.b(obj);
            String[] strArr = AddTIEventViewModel.V2;
            ((androidx.lifecycle.y0) addTIEventViewModel.f46416j2.getValue()).j(g3.a.c(g3.f35298f));
            fg0.x xVar = addTIEventViewModel.f204394k;
            String string = (xVar == null || (dateTime2 = xVar.f71370f) == null) ? null : dateTime2.toString("yyyy-MM-dd");
            fg0.x xVar2 = addTIEventViewModel.f204394k;
            o53.j0 j0VarJ2 = ge1.b.j(v1.a(addTIEventViewModel), null, null, new a(addTIEventViewModel, string, (xVar2 == null || (dateTime = xVar2.f71371g) == null) ? null : dateTime.toString("yyyy-MM-dd"), null), 3);
            j0VarJ = ge1.b.j(v1.a(addTIEventViewModel), null, null, new b(addTIEventViewModel, null), 3);
            this.f121908d = b0Var;
            this.f121905a = j0VarJ;
            this.f121907c = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j0VarJ = this.f121905a;
            o13.r.b(obj);
            objC = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2 v2Var2 = this.f121906b;
            o13.r.b(obj);
            v2Var = v2Var2;
            objAwait = obj;
        }
        v2 v2Var3 = (v2) objAwait;
        if (v2Var instanceof v2.a) {
            String[] strArr2 = AddTIEventViewModel.V2;
            ((androidx.lifecycle.y0) addTIEventViewModel.f46416j2.getValue()).j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            p92.y.f136664a.getClass();
            p92.y.a.c("AddTIEventViewModel", "User Owned events list is being failed");
        } else {
            v2Var.getClass();
            List list = (List) ((v2.b) v2Var).f47386a;
            Iterable iterable = v2Var3 instanceof v2.b ? (List) ((v2.b) v2Var3).f47386a : p13.j0.f134944a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                fg0.k kVar = (fg0.k) obj2;
                Boolean eventOrganizer = kVar.getEventOrganizer();
                Boolean bool = Boolean.TRUE;
                if (!p005kotlin.jvm.internal.s.g(eventOrganizer, bool)) {
                    if (p005kotlin.jvm.internal.s.g(kVar.getSubscribed(), bool)) {
                        List<String> listG0 = kVar.g0();
                        if (listG0 == null || !listG0.contains("OFFICIAL")) {
                            Iterator it = iterable.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!p005kotlin.jvm.internal.s.g(((fg0.n) next).getEventsProviderKey(), kVar.getProvider()));
                            fg0.n nVar = (fg0.n) next;
                            if ((nVar != null ? nVar.getVerifiedStatus() : null) == gg0.j.VERIFIED) {
                            }
                        }
                    }
                }
                lz1.f.a aVar2 = lz1.f.f115404a;
                fg0.x xVar3 = addTIEventViewModel.f204394k;
                aVar2.getClass();
                fg0.d completionTarget = kVar.getCompletionTarget();
                Double dB = completionTarget != null ? completionTarget.b() : null;
                if (dB != null) {
                    og0.a aVar3 = og0.a.f131967a;
                    double dIntValue = (xVar3 == null || (num = xVar3.f71368d) == null) ? 0.0d : num.intValue();
                    aVar3.getClass();
                    o13.p pVarX = og0.a.x(dIntValue, 0.05d);
                    double dDoubleValue = ((Number) pVarX.f128594a).doubleValue();
                    double dDoubleValue2 = ((Number) pVarX.f128595b).doubleValue();
                    double dDoubleValue3 = dB.doubleValue();
                    if (dDoubleValue <= dDoubleValue3 && dDoubleValue3 <= dDoubleValue2) {
                        arrayList.add(obj2);
                    }
                }
            }
            String[] strArr3 = AddTIEventViewModel.V2;
            androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) addTIEventViewModel.f46416j2.getValue();
            g3.a aVar4 = g3.f35298f;
            o13.p pVar = new o13.p(arrayList, iterable);
            aVar4.getClass();
            y0Var.j(g3.a.d(pVar));
        }
        return Unit.INSTANCE;
        v2Var = (v2) objC;
        this.f121908d = b0Var;
        this.f121905a = null;
        this.f121906b = v2Var;
        this.f121907c = 2;
        objAwait = j0VarJ.await(this);
    }
}
