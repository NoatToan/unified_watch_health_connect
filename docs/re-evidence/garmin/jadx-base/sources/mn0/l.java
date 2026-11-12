package mn0;

import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lin0/f;", "<anonymous>", "(Lo53/b0;)Lin0/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusFeaturesStateUseCase$invoke$deviceSettings$1", f = "GetHealthStatusFeaturesStateUseCase.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super in0.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f119747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f119748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, long j8, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f119747b = mVar;
        this.f119748c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f119747b, this.f119748c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super in0.f> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119746a;
        if (i14 == 0) {
            r.b(obj);
            p pVar = this.f119747b.f119749a;
            this.f119746a = 1;
            objA = pVar.a(this.f119748c, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objA = ((q) obj).f128597a;
        }
        int i15 = q.f128596b;
        if (objA instanceof q.b) {
            return null;
        }
        return objA;
    }
}
