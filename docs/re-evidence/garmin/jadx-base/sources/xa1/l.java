package xa1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$deletePowerGuideStrategy$1", f = "EditPowerGuideStrategyViewModel.kt", l = {394}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f189763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f189764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, long j8, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f189763b = kVar;
        this.f189764c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f189763b, this.f189764c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189762a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        sa1.m mVar = this.f189763b.f189755d;
        this.f189762a = 1;
        mVar.getClass();
        Object objJ = f0.J(mVar, new sa1.q(mVar, this.f189764c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
