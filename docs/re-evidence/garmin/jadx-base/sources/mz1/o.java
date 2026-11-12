package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getSelectedLocationTimeZone$1", f = "AddTIEventViewModel.kt", l = {2315}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.f f121885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AddTIEventViewModel addTIEventViewModel, com.garmin.android.library.mapsdkadapter.f fVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f121884c = addTIEventViewModel;
        this.f121885d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f121884c, this.f121885d, dVar);
        oVar.f121883b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121883b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121882a;
        AddTIEventViewModel addTIEventViewModel = this.f121884c;
        if (i14 == 0) {
            o13.r.b(obj);
            sy1.a aVar2 = addTIEventViewModel.f46433r2;
            LatLng latLng = this.f121885d.f50283a;
            double d14 = latLng.latitude;
            double d15 = latLng.longitude;
            this.f121883b = b0Var;
            this.f121882a = 1;
            aVar2.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(aVar2, new sy1.b(aVar2, d14, d15, null), this);
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
            String[] strArr = AddTIEventViewModel.V2;
            ((androidx.lifecycle.y0) addTIEventViewModel.P1.getValue()).j(((v2.b) v2Var).f47386a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "Event: problem in getting timezone ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "AddTIEventViewModel", strG);
        }
        return Unit.INSTANCE;
    }
}
