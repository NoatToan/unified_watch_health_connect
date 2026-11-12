package dm;

import am.x1;
import am.z1;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/s;", "Lew/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f60407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f60408k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.biz.BaseActivitySummaryStatsOperation$getActivityDivingTankPressure$1", f = "BaseActivitySummaryStatsOperation.kt", l = {236}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60409a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60411c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f60409a = obj;
            this.f60411c |= Integer.MIN_VALUE;
            return s.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o oVar, long j8) {
        super(oVar);
        this.f60407j = oVar;
        this.f60408k = j8;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f60411c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f60411c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f60409a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f60411c;
        if (i15 == 0) {
            o13.r.b(objJ);
            x1 x1Var = new x1();
            aVar.f60411c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(x1Var, new z1(this.f60408k, null, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        aq.d dVar2 = (aq.d) this.f60407j.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
        v2.b bVar = v2Var instanceof v2.b ? (v2.b) v2Var : null;
        dVar2.f11892n = bVar != null ? (com.garmin.android.apps.connectmobile.activities.newmodel.l0) bVar.f47386a : null;
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
