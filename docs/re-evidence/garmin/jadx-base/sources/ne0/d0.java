package ne0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lne0/d0;", "", "Lf12/o;", "optionalFeatureRepository", "<init>", "(Lf12/o;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.o f125440a;

    public d0(f12.o oVar) {
        oVar.getClass();
        this.f125440a = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f125436c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f125436c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objA = c0Var.f125434a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f125436c;
        if (i15 == 0) {
            o13.r.b(objA);
            f12.s sVar = f12.s.DOG_ACTIVITIES;
            f12.v vVar = f12.v.OPT_IN;
            c0Var.f125436c = 1;
            objA = this.f125440a.a(sVar, vVar, c0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            gt2.c.b(a2.GENERAL.f28756a).error("Failed to opt in to dog activities: " + ((v2.a) v2Var).f47383a);
        }
        return Unit.INSTANCE;
    }
}
