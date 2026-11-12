package aj1;

import androidx.lifecycle.t0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000f\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$getDatabaseRecordForDeviceId$1", f = "NotificationsViewModel.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<t0<sd2.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f3446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j8, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f3446c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f3446c, dVar);
        jVar.f3445b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t0<sd2.f> t0Var, t13.d<? super Unit> dVar) {
        return ((j) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f3445b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3444a;
        if (i14 == 0) {
            r.b(obj);
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(this.f3446c, null);
            this.f3445b = null;
            this.f3444a = 1;
            if (t0Var.emit(fVarI, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
