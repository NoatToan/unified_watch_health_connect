package vg1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.common.TransferSensorsViewModel$checkForSensorsToTransfer$1", f = "TransferSensorsViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<g3<Boolean>> f178077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f178078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(androidx.lifecycle.y0<g3<Boolean>> y0Var, d1 d1Var, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f178077b = y0Var;
        this.f178078c = d1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f178077b, this.f178078c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178076a;
        androidx.lifecycle.y0<g3<Boolean>> y0Var = this.f178077b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            pc0.a aVar2 = this.f178078c.f178094a;
            this.f178076a = 1;
            aVar2.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(aVar2, new pc0.d(aVar2, null, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            g3.a aVar3 = g3.f35298f;
            Boolean boolValueOf = Boolean.valueOf(((qv.a) ((v2.b) v2Var).f47386a).getHasSensorsBackups());
            aVar3.getClass();
            y0Var.j(g3.a.d(boolValueOf));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
