package ne0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lne0/v;", "", "Lf12/o;", "optionalFeatureRepository", "<init>", "(Lf12/o;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.o f125522a;

    public v(f12.o oVar) {
        oVar.getClass();
        this.f125522a = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f125521c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f125521c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objB = uVar.f125519a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f125521c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objB);
            f12.s sVar = f12.s.DOG_ACTIVITIES;
            uVar.f125521c = 1;
            objB = this.f125522a.b(sVar, uVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            if (((f12.w) ((v2.b) v2Var).f47386a).getUserOptionType() != f12.v.OPT_IN) {
            }
            return Boolean.valueOf(z14);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }
}
