package te2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lte2/k0;", "", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f164137b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f164138a = o13.m.b(new ta0.g(8));

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(k0 k0Var, v13.c cVar) throws Exception {
        p0 p0Var;
        String str;
        k0Var.getClass();
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f164231c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f164231c = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(k0Var, cVar);
            }
        } else {
            p0Var = new p0(k0Var, cVar);
        }
        Object objP = p0Var.f164229a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f164231c;
        if (i15 == 0) {
            o13.r.b(objP);
            re2.b bVar = re2.b.f152215a;
            bVar.L();
            p0Var.f164231c = 1;
            objP = re2.b.p(bVar, p0Var);
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objP);
        }
        sc2.o oVar = (sc2.o) objP;
        if (oVar != null && (str = oVar.f158544a) != null) {
            return str;
        }
        r1.q2.u("no usable IT2 access token");
        return null;
    }

    public static final String b(k0 k0Var) {
        String userData;
        k0Var.getClass();
        j2 j2Var = j2.f164115a;
        Context contextB = re2.b.f152215a.b();
        j2Var.getClass();
        Account accountK = j2.k(contextB);
        if (accountK != null && (userData = AccountManager.get(contextB).getUserData(accountK, "CUST_AGE_STATUS_RESPONSE")) != null) {
            return userData;
        }
        g2.f164047a.getClass();
        SharedPreferences sharedPreferences = g2.f164049c;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("user.age.status.response", null);
        }
        p005kotlin.jvm.internal.s.m("prefs");
        throw null;
    }

    public final Object c(v13.i iVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new l0(this, null), iVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lte2/k0$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
