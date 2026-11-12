package xz0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestViewModel$declineAuthorizedViewerInvite$1", f = "InboxRequestViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f192847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f192848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p pVar, long j8, t13.d<? super v> dVar) {
        super(1, dVar);
        this.f192847b = pVar;
        this.f192848c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v(this.f192847b, this.f192848c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((v) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192846a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        int i15 = p.f192812n;
        re0.h hVar = (re0.h) this.f192847b.f192815d.getValue();
        this.f192846a = 1;
        Object objC = hVar.c(this.f192848c, this);
        return objC == aVar ? aVar : objC;
    }
}
