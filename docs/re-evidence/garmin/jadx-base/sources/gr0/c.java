package gr0;

import al0.h;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import kd0.m;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgr0/c;", "Lew/a;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gr0.a f78537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ nr0.a f78538k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.biz.SaveGoalOperation$getStepsTask$1", f = "SaveGoalOperation.kt", l = {44}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f78539a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f78541c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f78539a = obj;
            this.f78541c |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gr0.a aVar, nr0.a aVar2) {
        super(aVar);
        this.f78537j = aVar;
        this.f78538k = aVar2;
        aVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f78541c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f78541c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f78539a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f78541c;
        if (i15 == 0) {
            r.b(objJ);
            al0.a aVarA = al0.a.C0064a.a(al0.a.f3717b);
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            zk0.c cVar = this.f78538k.f127607a;
            if (cVar == null) {
                cVar = new zk0.c(null, null, false, null, null, 31, null);
            }
            aVar.f78541c = 1;
            objJ = f0.J(aVarA, new h(aVarA, dateTimeNow, cVar, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        gr0.a aVar3 = this.f78537j;
        nr0.a aVar4 = (nr0.a) aVar3.f50097g.get(eVar);
        if (aVar4 != null) {
            aVar4.f127607a = (zk0.c) ((v2.b) v2Var).f47386a;
        }
        if (aVar4 != null) {
            aVar3.i(eVar, aVar4);
        }
        bv.b.f21239a.getClass();
        ((m) bv.b.a()).p();
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
