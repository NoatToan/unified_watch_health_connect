package s00;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.ChildAccountsPushNotificationHandler$handleAdminLiveTrackNotification$1", f = "ChildAccountsPushNotificationHandler.kt", l = {285}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f155408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f155409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f155411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f155412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f155413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f155414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n00.c f155415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f155416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f155417j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, String str2, n nVar, Context context, n00.c cVar, String str3, String str4, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f155411d = str;
        this.f155412e = str2;
        this.f155413f = nVar;
        this.f155414g = context;
        this.f155415h = cVar;
        this.f155416i = str3;
        this.f155417j = str4;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f155411d, this.f155412e, this.f155413f, this.f155414g, this.f155415h, this.f155416i, this.f155417j, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        long j8;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155410c;
        n nVar = this.f155413f;
        if (i14 == 0) {
            o13.r.b(obj);
            String str2 = this.f155411d;
            j8 = Long.parseLong(str2);
            String str3 = this.f155412e;
            this.f155409b = str3;
            this.f155408a = j8;
            this.f155410c = 1;
            obj = n.f(nVar, str2, this);
            if (obj == aVar) {
                return aVar;
            }
            str = str3;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j14 = this.f155408a;
            String str4 = this.f155409b;
            o13.r.b(obj);
            j8 = j14;
            str = str4;
        }
        hl.a.b bVar = new hl.a.b(j8, str, (String) obj, null, 8, null);
        LiveTrackActivity.a aVar2 = LiveTrackActivity.f38637g;
        bv0.a.q qVar = bv0.a.q.INSTANCE;
        aVar2.getClass();
        Context context = this.f155414g;
        Intent intentA = LiveTrackActivity.a.a(context, qVar, bVar);
        nVar.getClass();
        PendingIntent pendingIntentC = j.c(context, intentA);
        j.e(this.f155414g, sz0.e.f161376o, nVar.d(this.f155415h), this.f155416i, this.f155417j, pendingIntentC);
        return Unit.INSTANCE;
    }
}
