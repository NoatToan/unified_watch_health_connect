package f11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v01.c0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.CreateEditFoodViewModel$load$1", f = "CreateEditFoodViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f67900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f67901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f67901c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f67901c, dVar);
        bVar.f67900b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f67900b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67899a;
        a aVar2 = this.f67901c;
        if (i14 == 0) {
            r.b(obj);
            aVar2.f67888h.setValue(a.c.LOADING);
            c0 c0Var = aVar2.f67882b;
            a.b bVar = aVar2.f67881a;
            this.f67900b = b0Var;
            this.f67899a = 1;
            obj = ge1.b.e0(c0Var.f174248b, new v01.b0(bVar, c0Var, null), this);
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
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to get units for custom food. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "CreateFoodViewModel", strD);
            aVar2.f67888h.setValue(a.c.LOAD_FAILED);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            aVar2.f67884d.setValue(((v2.b) v2Var).f47386a);
            aVar2.f67888h.setValue(a.c.LOADED);
        }
        return Unit.INSTANCE;
    }
}
