package v41;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.InitializePaceProPlanUseCase$fetchRelatedPaceProPlans$1", f = "InitializePaceProPlanUseCase.kt", l = {278}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f175601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f175602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, long j8, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f175601b = mVar;
        this.f175602c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f175601b, this.f175602c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        u41.b value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175600a;
        long j8 = this.f175602c;
        m mVar = this.f175601b;
        if (i14 == 0) {
            o13.r.b(obj);
            r41.a aVar2 = mVar.f175638g;
            Long l14 = new Long(j8);
            this.f175600a = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new r41.e(aVar2, l14, null), this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            List listM0 = p13.h0.M0((Iterable) ((v2.b) v2Var).f47386a);
            i2.a aVar3 = i2.f36769a;
            aVar3.getClass();
            i2.a.a(a2.PACE_PRO, "Fetched related pacepro plans for courseId=" + j8 + ": " + listM0);
            z1<u41.b> z1Var = mVar.f175635d;
            while (true) {
                u41.b value2 = z1Var.getValue();
                List list = listM0;
                if (z1Var.b(value2, u41.b.a(value2, null, null, null, 0, 0, null, null, null, list, null, null, false, false, false, 16127))) {
                    break;
                }
                listM0 = list;
            }
        } else {
            i2.a aVar4 = i2.f36769a;
            aVar4.getClass();
            i2.a.e(a2.PACE_PRO, "Could not fetch related pacepro plans for courseId=" + j8 + "!");
            z1<u41.b> z1Var2 = mVar.f175635d;
            do {
                value = z1Var2.getValue();
            } while (!z1Var2.b(value, u41.b.a(value, null, null, null, 0, 0, null, null, null, null, null, null, false, true, false, 12287)));
        }
        return Unit.INSTANCE;
    }
}
