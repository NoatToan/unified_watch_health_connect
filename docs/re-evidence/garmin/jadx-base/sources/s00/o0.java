package s00;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.SubscriptionCommonPushNotificationHandler$handleSubscriptionExpiringNotification$1", f = "SubscriptionCommonPushNotificationHandler.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f155371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f155372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f155373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f155374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n00.c f155375f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Bundle bundle, k0 k0Var, Context context, n00.c cVar, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f155372c = bundle;
        this.f155373d = k0Var;
        this.f155374e = context;
        this.f155375f = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o0 o0Var = new o0(this.f155372c, this.f155373d, this.f155374e, this.f155375f, dVar);
        o0Var.f155371b = obj;
        return o0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155370a;
        if (i14 == 0) {
            o13.r.b(obj);
            String string = this.f155372c.getString("days_until_expiration");
            if (string == null) {
                a2 a2Var = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "SubscriptionCommonPushNotificationHandler", "Missing days_until_expiration.");
                string = "";
            }
            Context context = this.f155374e;
            String string2 = context.getString(R.string.your_subscription_expires_in_days, string);
            string2.getClass();
            this.f155371b = null;
            this.f155370a = 1;
            if (k0.f(this.f155373d, context, this.f155375f, string2, this) == aVar) {
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
