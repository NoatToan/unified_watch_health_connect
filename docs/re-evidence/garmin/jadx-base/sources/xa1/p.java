package xa1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lab1/d;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$savePowerGuideStrategy$1", f = "EditPowerGuideStrategyViewModel.kt", l = {381}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super v2<? extends ab1.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f189786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ab1.d f189787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, ab1.d dVar, t13.d<? super p> dVar2) {
        super(1, dVar2);
        this.f189786b = kVar;
        this.f189787c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f189786b, this.f189787c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends ab1.d>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189785a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        sa1.m mVar = this.f189786b.f189755d;
        this.f189785a = 1;
        mVar.getClass();
        Object objJ = f0.J(mVar, new sa1.n(mVar, this.f189787c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
