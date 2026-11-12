package xa1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lab1/d;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$savePowerGuideStrategy$2", f = "EditPowerGuideStrategyViewModel.kt", l = {385}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super v2<? extends ab1.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f189789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f189790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab1.d f189791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k kVar, Long l14, ab1.d dVar, t13.d<? super q> dVar2) {
        super(1, dVar2);
        this.f189789b = kVar;
        this.f189790c = l14;
        this.f189791d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f189789b, this.f189790c, this.f189791d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends ab1.d>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189788a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        sa1.m mVar = this.f189789b.f189755d;
        long jLongValue = this.f189790c.longValue();
        this.f189788a = 1;
        mVar.getClass();
        Object objJ = f0.J(mVar, new sa1.v(mVar, jLongValue, this.f189791d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
