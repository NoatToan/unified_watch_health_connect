package ab1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.model.PowerGuideViewModel$sendStrategyToDevice$1", f = "PowerGuideViewModel.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, long j8, long j14, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f2594b = kVar;
        this.f2595c = j8;
        this.f2596d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f2594b, this.f2595c, this.f2596d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2593a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        sa1.m mVar = this.f2594b.f2597a;
        this.f2593a = 1;
        mVar.getClass();
        Object objJ = f0.J(mVar, new sa1.o(mVar, this.f2595c, this.f2596d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
