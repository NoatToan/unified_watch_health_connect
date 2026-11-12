package dm;

import c22.l3;
import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/m;", "Lew/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f60390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DateTime f60391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f60392l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.biz.ActivitySummaryStatsOperation$getUserWeightTask$1", f = "ActivitySummaryStatsOperation.kt", l = {177}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60393a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60395c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f60393a = obj;
            this.f60395c |= Integer.MIN_VALUE;
            return m.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, DateTime dateTime, boolean z14) {
        super(nVar);
        this.f60390j = nVar;
        this.f60391k = dateTime;
        this.f60392l = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f60395c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f60395c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objM = aVar.f60393a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f60395c;
        if (i15 == 0) {
            o13.r.b(objM);
            am.d dVar2 = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            aVar.f60395c = 1;
            objM = dVar2.m(this.f60391k, this.f60392l, aVar);
            if (objM == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        v2 v2Var = (v2) objM;
        boolean z14 = v2Var instanceof v2.b;
        n nVar = this.f60390j;
        if (!z14) {
            if (v2Var instanceof v2.a) {
                ((aq.d) nVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11895q = 0.0d;
                return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            }
            lc.u0.r();
            return null;
        }
        aq.d dVar3 = (aq.d) nVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
        l3.a aVar3 = l3.f23124b;
        Double d14 = (Double) ((v2.b) v2Var).f47386a;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        aVar3.getClass();
        dVar3.f11895q = l3.a.P1(dDoubleValue);
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
