package yj0;

import android.widget.Toast;
import c80.d1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gcplus.presentation.dev.SubscriptionDevMenuActivity;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.u1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.dev.SubscriptionDevMenuActivity$launchPurchaseFlow$1", f = "SubscriptionDevMenuActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f197476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionDevMenuActivity f197477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f197479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SubscriptionDevMenuActivity subscriptionDevMenuActivity, String str, String str2, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f197477b = subscriptionDevMenuActivity;
        this.f197478c = str;
        this.f197479d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f197477b, this.f197478c, this.f197479d, dVar);
        bVar.f197476a = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        SubscriptionDevMenuActivity subscriptionDevMenuActivity = this.f197477b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            subscriptionDevMenuActivity.f35312c.a(u1.b(subscriptionDevMenuActivity.f35310a, subscriptionDevMenuActivity, this.f197478c, this.f197479d, d1.OMT, 48), null);
        } catch (IllegalStateException e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.SUBSCRIPTIONS, "SubscriptionDevMenuActivity", "IllegalStateException while launching purchase flow: " + e4);
        } catch (Exception e14) {
            a2 a2Var = a2.SUBSCRIPTIONS;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "Error while launching purchase flow: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SubscriptionDevMenuActivity", strD);
            Toast.makeText(subscriptionDevMenuActivity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
        }
        return Unit.INSTANCE;
    }
}
