package kw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import d60.e0;
import e23.p;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.domain.GetTriathlonTypesUseCase$invoke$2", f = "GetTriathlonTypesUseCase.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f106968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f106968c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f106968c, dVar);
        gVar.f106967b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.workouts.data.model.f>> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f106967b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106966a;
        if (i14 == 0) {
            r.b(obj);
            d60.b bVar = this.f106968c.f106965a;
            this.f106967b = b0Var;
            this.f106966a = 1;
            obj = f0.J(bVar, new e0(bVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            List list = (List) ((v2.b) v2Var).f47386a;
            return list == null ? j0.f134944a : list;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Exception getting triathlon types=");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "GetTriathlonTypesUseCase", strD);
        return j0.f134944a;
    }
}
