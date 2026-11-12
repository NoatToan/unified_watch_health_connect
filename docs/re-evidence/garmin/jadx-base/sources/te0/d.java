package te0;

import com.garmin.android.apps.connectmobile.b1;
import com.garmin.android.apps.connectmobile.v2;
import f12.l;
import java.util.Set;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import re0.o;
import ue0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lte0/d;", "", "Lre0/o;", "managedAccountsRepository", "Lf12/l;", "userSettings", "Lcom/garmin/android/apps/connectmobile/b1;", "featureItemAvailability", "<init>", "(Lre0/o;Lf12/l;Lcom/garmin/android/apps/connectmobile/b1;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f163919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f163920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f163921c;

    public d(o oVar, l lVar, b1 b1Var) {
        oVar.getClass();
        lVar.getClass();
        b1Var.getClass();
        this.f163919a = oVar;
        this.f163920b = lVar;
        this.f163921c = b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f163918c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f163918c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objD = cVar2.f163916a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f163918c;
        l lVar = this.f163920b;
        if (i15 == 0) {
            r.b(objD);
            Set<String> setN = lVar.N();
            if (!this.f163921c.O()) {
                lVar.b2(false);
            } else if (setN.contains("ROLE_USER_MANAGED_ACCOUNTS_ADMIN")) {
                lVar.b2(true);
            } else if (setN.contains("ROLE_USER_MANAGED_ACCOUNTS_CHILD")) {
                lVar.b2(false);
            } else {
                cVar2.f163918c = 1;
                objD = this.f163919a.d(cVar2);
                if (objD == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objD);
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            lVar.b2((bVar.f47387b == 204 || ((k) bVar.f47386a).b().isEmpty()) ? false : true);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            lVar.b2(false);
        }
        return Unit.INSTANCE;
    }
}
