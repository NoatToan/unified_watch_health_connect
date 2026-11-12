package te0;

import c22.s3;
import com.garmin.android.apps.connectmobile.v2;
import f12.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import re0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lte0/h;", "", "Lre0/o;", "managedAccountRepo", "Lf12/l;", "userSettings", "<init>", "(Lre0/o;Lf12/l;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f163932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f163933b;

    public h(o oVar, l lVar) {
        oVar.getClass();
        lVar.getClass();
        this.f163932a = oVar;
        this.f163933b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f163931c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f163931c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objK = gVar.f163929a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f163931c;
        if (i15 == 0) {
            r.b(objK);
            if (s3.b()) {
                gVar.f163931c = 1;
                objK = this.f163932a.k(gVar);
                if (objK == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objK);
        v2 v2Var = (v2) objK;
        if (v2Var instanceof v2.b) {
            ue0.l lVar = (ue0.l) ((v2.b) v2Var).f47386a;
            if (lVar == null) {
                return Unit.INSTANCE;
            }
            this.f163933b.Z(new com.garmin.android.apps.connectmobile.userprofile.model.g(lVar.getUserId(), lVar.getFullName(), lVar.f170208m, lVar.A1(), lVar.getUserLevel()));
        }
        return Unit.INSTANCE;
    }
}
