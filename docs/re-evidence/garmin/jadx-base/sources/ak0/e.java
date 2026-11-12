package ak0;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.u1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity$launchPurchaseFlow$1", f = "GCPlusHomeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCPlusHomeActivity f3604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GCPlusHomeActivity gCPlusHomeActivity, String str, String str2, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f3604b = gCPlusHomeActivity;
        this.f3605c = str;
        this.f3606d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f3604b, this.f3605c, this.f3606d, dVar);
        eVar.f3603a = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        GCPlusHomeActivity gCPlusHomeActivity = this.f3604b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        try {
            gCPlusHomeActivity.f35326c.a(u1.b(gCPlusHomeActivity.f35324a, gCPlusHomeActivity, this.f3605c, this.f3606d, null, 56), null);
        } catch (IllegalStateException e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.SUBSCRIPTIONS, "GCPlusHomeActivity", "IllegalStateException while launching purchase flow: " + e4);
        } catch (Exception e14) {
            a2 a2Var = a2.SUBSCRIPTIONS;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "Error while launching purchase flow: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GCPlusHomeActivity", strD);
            Toast.makeText(gCPlusHomeActivity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
        }
        return Unit.INSTANCE;
    }
}
