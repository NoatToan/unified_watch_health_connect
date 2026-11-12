package s00;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.ChildAccountsPushNotificationHandler$handleAdminChildContactDeletionNotification$1", f = "ChildAccountsPushNotificationHandler.kt", l = {234}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f155398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f155399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f155401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f155402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f155403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f155404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n00.c f155405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f155406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f155407j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, n nVar, Context context, n00.c cVar, String str3, String str4, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f155401d = str;
        this.f155402e = str2;
        this.f155403f = nVar;
        this.f155404g = context;
        this.f155405h = cVar;
        this.f155406i = str3;
        this.f155407j = str4;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f155401d, this.f155402e, this.f155403f, this.f155404g, this.f155405h, this.f155406i, this.f155407j, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        long j8;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155400c;
        n nVar = this.f155403f;
        if (i14 == 0) {
            o13.r.b(obj);
            String str2 = this.f155401d;
            j8 = Long.parseLong(str2);
            String str3 = this.f155402e;
            this.f155399b = str3;
            this.f155398a = j8;
            this.f155400c = 1;
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
            long j14 = this.f155398a;
            String str4 = this.f155399b;
            o13.r.b(obj);
            j8 = j14;
            str = str4;
        }
        hl.a.b bVar = new hl.a.b(j8, str, (String) obj, null, 8, null);
        LiveTrackActivity.a aVar2 = LiveTrackActivity.f38637g;
        bv0.a.q qVar = bv0.a.q.INSTANCE;
        aVar2.getClass();
        Context context = this.f155404g;
        Intent intentA = LiveTrackActivity.a.a(context, qVar, bVar);
        nVar.getClass();
        PendingIntent pendingIntentC = j.c(context, intentA);
        j.e(this.f155404g, sz0.e.f161376o, nVar.d(this.f155405h), this.f155406i, this.f155407j, pendingIntentC);
        return Unit.INSTANCE;
    }
}
