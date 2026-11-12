package ne0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Li53/f;", "", "<anonymous>", "(Lo53/b0;)Li53/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetDogActivityTypesUseCase$invoke$2", f = "GetDogActivityTypesUseCase.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super i53.f<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f125524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f125525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, long j8, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f125524b = xVar;
        this.f125525c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f125524b, this.f125525c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super i53.f<? extends String>> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125523a;
        if (i14 == 0) {
            o13.r.b(obj);
            me0.w wVar = this.f125524b.f125526a;
            this.f125523a = 1;
            wVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.o(wVar, this.f125525c, null), this);
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
        return v2Var instanceof v2.b ? i53.a.j((Iterable) ((v2.b) v2Var).f47386a) : j53.l.b();
    }
}
