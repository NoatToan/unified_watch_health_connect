package v41;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.InitializePaceProPlanUseCase$reinitializeCourse$1", f = "InitializePaceProPlanUseCase.kt", l = {130}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f175631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f175631b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f175631b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        l lVar = this;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = lVar.f175630a;
        m mVar = lVar.f175631b;
        if (i14 == 0) {
            o13.r.b(obj);
            Long l14 = mVar.f175635d.getValue().f168609a.f39760b.f39766c;
            if (l14 == null || l14.longValue() == 0) {
                l14 = null;
            }
            if (l14 != null) {
                z1<u41.b> z1Var = mVar.f175635d;
                while (!z1Var.b(z1Var.getValue(), u41.b.a(mVar.f175642k, null, null, null, 0, 0, null, null, null, null, null, null, true, false, false, 14335))) {
                    lVar = this;
                }
                long jLongValue = l14.longValue();
                lVar.f175630a = 1;
                if (m.b(lVar.f175631b, jLongValue, null, null, lVar) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        z1<u41.b> z1Var2 = mVar.f175635d;
        while (!z1Var2.b(z1Var2.getValue(), u41.b.a(mVar.f175642k, null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 14335))) {
        }
        return Unit.INSTANCE;
    }
}
