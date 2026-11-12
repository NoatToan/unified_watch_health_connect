package zo1;

import ch.qos.logback.core.net.SyslogConstants;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideDetailsViewModel$onCrossSellingItemClose$1", f = "GroupRideDetailsViewModel.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f206449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f206449b = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f206449b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206448a;
        if (i14 == 0) {
            o13.r.b(obj);
            t60.m mVar = this.f206449b.f206420g;
            t60.a aVar2 = t60.a.EDGE_1050_BANNER;
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            this.f206448a = 1;
            if (mVar.c(aVar2, dateTimeNow, this) == aVar) {
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
