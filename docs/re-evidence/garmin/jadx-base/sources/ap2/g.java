package ap2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity$handleInactivityTimeout$1", f = "FitPayAddCardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FitPayAddCardActivity f11694a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FitPayAddCardActivity fitPayAddCardActivity, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f11694a = fitPayAddCardActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f11694a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        FitPayAddCardActivity fitPayAddCardActivity = this.f11694a;
        if (fitPayAddCardActivity.f51391v && !fitPayAddCardActivity.isFinishing() && !fitPayAddCardActivity.isDestroyed()) {
            FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).debug("showRetryTimeoutDialog");
            String string = fitPayAddCardActivity.getString(R.string.time_expired_title);
            string.getClass();
            String string2 = fitPayAddCardActivity.getString(R.string.time_expired_message);
            string2.getClass();
            String string3 = fitPayAddCardActivity.getString(R.string.lbl_start_over);
            string3.getClass();
            androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, fitPayAddCardActivity, string, string2, new o13.p(string3, new c(fitPayAddCardActivity, 0)), null, null, false, SyslogConstants.LOG_LOCAL6);
            if (eVarQ != null) {
                eVarQ.show();
            }
        }
        return Unit.INSTANCE;
    }
}
