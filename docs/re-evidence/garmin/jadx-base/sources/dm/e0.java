package dm;

import com.garmin.android.apps.connectmobile.v2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/e0;", "Lew/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f60340j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.biz.BaseActivitySummaryStatsOperation$getPersonalRecordsCandidates$1", f = "BaseActivitySummaryStatsOperation.kt", l = {458}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60341a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60343c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f60341a = obj;
            this.f60343c |= Integer.MIN_VALUE;
            return e0.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(o oVar) {
        super(oVar);
        this.f60340j = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f60343c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f60343c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objI = aVar.f60341a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f60343c;
        Object obj = null;
        if (i15 == 0) {
            o13.r.b(objI);
            o91.a aVar3 = (o91.a) KoinJavaComponent.get$default(o91.a.class, null, null, 6, null);
            aVar.f60343c = 1;
            objI = aVar3.i(aVar);
            if (objI == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        v2 v2Var = (v2) objI;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            lc.u0.r();
            return null;
        }
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        o oVar = this.f60340j;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = ((aq.d) oVar.f50097g.get(eVar)).f11879a;
        Long l14 = hVar != null ? new Long(hVar.f29448a) : null;
        for (Object obj2 : (Iterable) ((v2.b) v2Var).f47386a) {
            n91.a aVar4 = (n91.a) obj2;
            if (aVar4.r() && p005kotlin.jvm.internal.s.g(aVar4.getActivityId(), l14)) {
                obj = obj2;
                break;
            }
        }
        ((aq.d) oVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11894p = ((n91.a) obj) != null;
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
