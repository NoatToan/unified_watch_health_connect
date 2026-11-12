package ne0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.DeleteDogUseCase$invoke$2", f = "DeleteDogUseCase.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f125438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f125439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, long j8, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f125438b = eVar;
        this.f125439c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f125438b, this.f125439c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125437a;
        boolean z14 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            me0.w wVar = this.f125438b.f125441a;
            this.f125437a = 1;
            obj = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.d(wVar, this.f125439c, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
