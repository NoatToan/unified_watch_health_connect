package af0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.j;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfeedback.presentation.FeedbackViewModel$onInit$1", f = "FeedbackViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f3046c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f3046c, dVar);
        gVar.f3045b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long deviceId;
        b0 b0Var = (b0) this.f3045b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3044a;
        h hVar = this.f3046c;
        if (i14 == 0) {
            r.b(obj);
            fj1.b bVar = hVar.f3049c;
            this.f3045b = b0Var;
            this.f3044a = 1;
            obj = bVar.a(this);
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
            gj1.f fVar = (gj1.f) ((v2.b) v2Var).f47386a;
            gj1.b bVarU = gl.b.u(fVar);
            gj1.d primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO();
            gj1.b bVarD = gl.b.D(fVar, primaryTrainingDeviceDTO != null ? primaryTrainingDeviceDTO.getDeviceId() : null);
            if (bVarU == null || (deviceId = bVarU.getDeviceId()) == null) {
                deviceId = bVarD != null ? bVarD.getDeviceId() : null;
            }
            if (deviceId != null) {
                j jVar = rd2.f.a().f152045a;
                long jLongValue = deviceId.longValue();
                jVar.getClass();
                hVar.f3065t = j.i(jLongValue, null);
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.FEEDBACK;
            String strN = fb1.c.n("Failed to get primary device. Error: ", ((v2.a) v2Var).f47385c);
            i2.f36769a.getClass();
            i2.a.e(a2Var, strN);
        }
        return Unit.INSTANCE;
    }
}
