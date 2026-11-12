package r70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$showPrivacyPolicyReconsentDialog$1$1$1$1", f = "DashboardActivity.kt", l = {312}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f151085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s92.g f151086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s92.g gVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f151086c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f151086c, dVar);
        mVar.f151085b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151084a;
        if (i14 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.DASHBOARD;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DashboardActivity", "User reconsents to privacy policy");
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_PRIVACY;
            this.f151085b = null;
            this.f151084a = 1;
            if (oVar.p(xVar, this.f151086c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
