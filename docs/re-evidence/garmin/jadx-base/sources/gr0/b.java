package gr0;

import am.j;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import kd0.m;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgr0/b;", "Lew/a;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f78532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f78533k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.biz.SaveGoalOperation$getSaveWellnessGoalTask$1", f = "SaveGoalOperation.kt", l = {68}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f78534a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f78536c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f78534a = obj;
            this.f78536c |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gr0.a aVar, String str, h hVar) {
        super(aVar);
        this.f78532j = str;
        this.f78533k = hVar;
        aVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f78536c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f78536c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f78534a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f78536c;
        String str = this.f78532j;
        if (i15 == 0) {
            r.b(objA);
            al0.a aVarA = al0.a.C0064a.a(al0.a.f3717b);
            String string = new fz0.c(DateTime.now(), null, 2, null).toString();
            aVar.f78536c = 1;
            objA = aVarA.a(str, string, this.f78533k, aVar);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        String strM = j.m("Successfully saved ", str, " goal");
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var, "SaveGoalOperation", strM);
        bv.b.f21239a.getClass();
        ((m) bv.b.a()).p();
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
