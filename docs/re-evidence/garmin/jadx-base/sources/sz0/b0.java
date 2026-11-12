package sz0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Luz0/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsRepo$getInboxNotificationRequest$2", f = "NotificationsRepo.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super c83.a0<uz0.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f161353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f161354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f161355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var, int i14, String str, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f161353b = a0Var;
        this.f161354c = i14;
        this.f161355d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f161353b, this.f161354c, this.f161355d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<uz0.e>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161352a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        vz0.d dVar = this.f161353b.f161326a;
        vz0.b.f180871b.getClass();
        o53.i0<c83.a0<uz0.e>> i0VarC = dVar.c(this.f161354c, this.f161355d, vz0.b.a.a(), p13.x.k("PREMIUM_FRIEND", "FRAMED_FRIEND"));
        this.f161352a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
