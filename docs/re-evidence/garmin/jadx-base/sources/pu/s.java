package pu;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.gcsprotos.generated.Auth;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/gcsprotos/generated/Auth$MobileAppAuthorizeResponse$Status;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/gcsprotos/generated/Auth$MobileAppAuthorizeResponse$Status;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller$execute$authWithGCS$1", f = "PostUserAuthenticationCaller.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Auth.MobileAppAuthorizeResponse.Status>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f141164a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n nVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f141164a = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f141164a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Auth.MobileAppAuthorizeResponse.Status> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Auth.MobileAppAuthorizeResponse.Status status;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Context applicationContext = this.f141164a.f141135a.getApplicationContext();
        applicationContext.getClass();
        a2 a2Var = a2.GENERAL;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PostUserAuthenticationCaller", "authWithGcs()");
        try {
            Auth.MobileAppAuthorizeResponse mobileAppAuthorizeResponse = (Auth.MobileAppAuthorizeResponse) new gk0.b(applicationContext, (gk0.f) new gk0.e(applicationContext), "PostUserAuthenticationCaller", -1L, false, (Auth.Category) null).e();
            String transactionKey = mobileAppAuthorizeResponse.getTransactionKey();
            if (transactionKey == null || !(!d53.w.J(transactionKey))) {
                i2.a.f(a2Var, "PostUserAuthenticationCaller", "authWithGcs() ERROR Invalid GCS Transaction Key Response Status [" + mobileAppAuthorizeResponse.getStatus() + "]");
                status = mobileAppAuthorizeResponse.getStatus();
            } else {
                i2.a.b(a2Var, "PostUserAuthenticationCaller", "authWithGcs() SUCCESS");
                f12.l.f68084a.getClass();
                f12.l lVarA = f12.l.a.a();
                String transactionKey2 = mobileAppAuthorizeResponse.getTransactionKey();
                transactionKey2.getClass();
                lVarA.i1(transactionKey2);
                status = Auth.MobileAppAuthorizeResponse.Status.OK;
            }
            status.getClass();
            return status;
        } catch (Exception e4) {
            a2 a2Var2 = a2.GENERAL;
            String strH = f3.h(e4, "authWithGcs() ERROR [", "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "PostUserAuthenticationCaller", strH);
            return Auth.MobileAppAuthorizeResponse.Status.ERROR;
        }
    }
}
