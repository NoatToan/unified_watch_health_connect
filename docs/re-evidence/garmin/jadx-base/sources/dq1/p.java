package dq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import java.util.Set;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import p13.h0;
import p13.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationUserRoleRefreshUseCase$invoke$2", f = "GraduationUserRoleRefreshUseCase.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f60782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f60782c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f60782c, dVar);
        pVar.f60781b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f60781b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60780a;
        o oVar = this.f60782c;
        boolean z14 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            qo1.c cVar = oVar.f60778a;
            this.f60781b = b0Var;
            this.f60780a = 1;
            obj = qo1.c.b(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            List<String> listY = ((com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a).y();
            Set setG1 = listY != null ? h0.g1(h0.Z(listY)) : null;
            if (setG1 == null) {
                a2 a2Var = a2.CHILD_ACCOUNTS;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GraduationUserRoleRefreshUseCase", "User role refresh returned no roles");
            } else if (!setG1.contains("ROLE_USER_MANAGED_ACCOUNTS_CHILD")) {
                oVar.f60779b.G3(l0.f134950a, a1.b("ROLE_USER_MANAGED_ACCOUNTS_CHILD"));
            }
            return Boolean.valueOf(z14);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        a2 a2Var2 = a2.CHILD_ACCOUNTS;
        String strF = b71.i.f("User role refresh failed: ", v2Var);
        i2.f36769a.getClass();
        i2.a.f(a2Var2, "GraduationUserRoleRefreshUseCase", strF);
        z14 = false;
        return Boolean.valueOf(z14);
    }
}
