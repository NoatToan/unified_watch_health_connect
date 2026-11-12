package ya0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.BlePairingFailedViewModel$removeDevice$1", f = "BlePairingFailedViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f195398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f195399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, long j8, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f195398c = aVar;
        this.f195399d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f195398c, this.f195399d, dVar);
        bVar.f195397b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objB;
        Object value2;
        o53.b0 b0Var = (o53.b0) this.f195397b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195396a;
        a aVar2 = this.f195398c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = aVar2.f195393b;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, Boolean.TRUE));
            a2 a2Var = a2.DEVICE_SETUP;
            long j8 = this.f195399d;
            String strF = androidx.room.a0.f(j8, "Removing device with unitId: ", " and canceling device setup");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BlePairingFailedViewModel", strF);
            lc0.k kVar = aVar2.f195392a;
            this.f195397b = b0Var;
            this.f195396a = 1;
            int i15 = lc0.k.f111948d;
            objB = kVar.b(j8, this, true);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objB = ((o13.q) obj).f128597a;
        }
        int i16 = o13.q.f128596b;
        vm2.h hVar = (vm2.h) (objB instanceof o13.q.b ? null : objB);
        boolean z14 = hVar != null ? hVar.f178831a : false;
        a2 a2Var2 = a2.DEVICE_SETUP;
        String strG = com.airbnb.lottie.animation.keyframe.a.g("Device remove finished with success: ", StringSubstitutor.DEFAULT_VAR_END, z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "BlePairingFailedViewModel", strG);
        p2 p2Var2 = aVar2.f195393b;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, Boolean.FALSE));
        return Unit.INSTANCE;
    }
}
