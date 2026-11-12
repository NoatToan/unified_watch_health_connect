package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/u6;", "Lpk1/n;", "Lm12/m;", "getLoginTokenUseCase", "<init>", "(Lm12/m;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u6 implements pk1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m12.m f104389a;

    public u6(m12.m mVar) {
        mVar.getClass();
        this.f104389a = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // pk1.n
    public final Object a(String str, v13.c cVar) {
        t6 t6Var;
        if (cVar instanceof t6) {
            t6Var = (t6) cVar;
            int i14 = t6Var.f104379c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t6Var.f104379c = i14 - Integer.MIN_VALUE;
            } else {
                t6Var = new t6(this, cVar);
            }
        } else {
            t6Var = new t6(this, cVar);
        }
        Object objA = t6Var.f104377a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t6Var.f104379c;
        if (i15 == 0) {
            o13.r.b(objA);
            t6Var.f104379c = 1;
            objA = this.f104389a.a(str, t6Var);
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
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            com.garmin.android.apps.connectmobile.v2.a aVar2 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
            return new com.garmin.android.apps.connectmobile.v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
            return new com.garmin.android.apps.connectmobile.v2.b(((pu.k) bVar.f47386a).a(), bVar.f47387b, bVar.f47388c, bVar.f47389d);
        }
        lc.u0.r();
        return null;
    }
}
