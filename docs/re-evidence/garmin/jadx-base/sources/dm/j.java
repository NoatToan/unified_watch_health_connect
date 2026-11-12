package dm;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import ps.a1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/j;", "Lew/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f60358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f60359k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.biz.ActivitySummaryStatsOperation$getActivityImagesTask$1", f = "ActivitySummaryStatsOperation.kt", l = {194}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60360a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60362c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f60360a = obj;
            this.f60362c |= Integer.MIN_VALUE;
            return j.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, long j8) {
        super(nVar);
        this.f60358j = nVar;
        this.f60359k = j8;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        a1 a1Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f60362c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f60362c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f60360a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f60362c;
        if (i15 == 0) {
            o13.r.b(objJ);
            am.m mVarA = am.m.a.a(am.m.f4066e, 7);
            aVar.f60362c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(mVarA, new am.t(mVarA, this.f60359k, null), aVar);
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
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            }
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = ((aq.d) this.f60358j.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11879a;
        if (hVar != null && (a1Var = hVar.f29459l) != null) {
            a1Var.M0((List) ((v2.b) v2Var).f47386a);
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
