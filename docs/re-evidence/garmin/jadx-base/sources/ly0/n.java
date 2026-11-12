package ly0;

import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenViewModel$setMapProxy$6", f = "MapFullscreenViewModel.kt", l = {258}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f115339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f115339b = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f115339b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115338a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f115338a = 1;
            o oVar = this.f115339b;
            oVar.getClass();
            Object objE = c0.e(new k(oVar, null), this);
            if (objE != obj2) {
                objE = Unit.INSTANCE;
            }
            if (objE == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
