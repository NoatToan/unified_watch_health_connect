package dm;

import am.c2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/k;", "Lew/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f60373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f60374k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.biz.ActivitySummaryStatsOperation$getConversationTask$1", f = "ActivitySummaryStatsOperation.kt", l = {SyslogConstants.LOG_LOCAL4}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60375a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60377c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f60375a = obj;
            this.f60377c |= Integer.MIN_VALUE;
            return k.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, long j8) {
        super(nVar);
        this.f60373j = nVar;
        this.f60374k = j8;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f60377c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f60377c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f60375a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f60377c;
        if (i15 == 0) {
            o13.r.b(objA);
            fo1.f.f72522b.getClass();
            fo1.f fVarA = fo1.f.a.a();
            String string = c2.ACTIVITY.toString();
            String strValueOf = String.valueOf(this.f60374k);
            aVar.f60377c = 1;
            objA = fVarA.a(string, strValueOf, aVar);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            ((aq.d) this.f60373j.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11888j = (mo1.d) ((v2.b) v2Var).f47386a;
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        lc.u0.r();
        return null;
    }
}
