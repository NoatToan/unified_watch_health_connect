package ab1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import sa1.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lab1/g;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.model.PowerGuideViewModel$getPowerGuideSummaries$1", f = "PowerGuideViewModel.kt", l = {25}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends g>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f2592b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f2592b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends List<? extends g>>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f2591a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        sa1.m mVar = this.f2592b.f2597a;
        this.f2591a = 1;
        mVar.getClass();
        Object objJ = f0.J(mVar, new t(mVar, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
