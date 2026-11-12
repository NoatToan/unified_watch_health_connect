package e30;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.DeletePowerGuideUseCase$invoke$1", f = "DeletePowerGuideUseCase.kt", l = {16, 18}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f62661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f62662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, long j8, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f62661c = dVar;
        this.f62662d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f62661c, this.f62662d, dVar);
        cVar.f62660b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0.emit((com.garmin.android.apps.connectmobile.v2) r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f62660b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62659a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        sa1.m mVar = this.f62661c.f62668a;
        this.f62660b = jVar;
        this.f62659a = 1;
        obj = f0.J(mVar, new sa1.q(mVar, this.f62662d, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f62660b = null;
        this.f62659a = 2;
    }
}
