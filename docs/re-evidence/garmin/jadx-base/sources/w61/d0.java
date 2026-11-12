package w61;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Set;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getPrimaryTrainingDevices$1", f = "TrainingStatusViewModel.kt", l = {242, 249}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f183165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f183166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f183167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f183168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.model.a f183169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(x xVar, com.garmin.android.apps.connectmobile.performance.model.a aVar, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f183168d = xVar;
        this.f183169e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f183168d, this.f183169e, dVar);
        d0Var.f183167c = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strValueOf;
        gj1.d primaryTrainingDeviceDTO;
        Long deviceId;
        String strValueOf2;
        com.garmin.android.apps.connectmobile.performance.model.a aVar;
        o53.b0 b0Var = (o53.b0) this.f183167c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183166b;
        x xVar = this.f183168d;
        if (i14 == 0) {
            o13.r.b(obj);
            fj1.b bVar = xVar.I0;
            this.f183167c = b0Var;
            this.f183166b = 1;
            obj = bVar.a(this);
            if (obj != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar = this.f183165a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            String str = ((TrainingStatusDeviceDTO) ((v2.b) v2Var).f47386a).f39908a;
            if (str == null) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.k(a2Var, "TrainingStatusViewModel", "last used device is null, using first device from selector list");
                Set<com.garmin.android.apps.connectmobile.performance.model.a> setD = xVar.f183272h.d();
                if (setD == null || (aVar = (com.garmin.android.apps.connectmobile.performance.model.a) p13.h0.c0(setD)) == null || (strValueOf2 = aVar.f39917a) == null) {
                    strValueOf2 = "";
                }
            } else {
                strValueOf2 = String.valueOf(str);
            }
            int i15 = x.O0;
            xVar.B4(strValueOf2);
        } else {
            p92.y.f136664a.getClass();
            p92.y.a.c("TrainingStatusViewModel", "No primary device found, using cached last used device");
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) obj;
        if (v2Var2 instanceof v2.b) {
            gj1.f fVar = (gj1.f) ((v2.b) v2Var2).f47386a;
            xVar.J0 = fVar;
            if (fVar == null || (primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO()) == null || (deviceId = primaryTrainingDeviceDTO.getDeviceId()) == null || (strValueOf = String.valueOf(deviceId.longValue())) == null) {
                com.garmin.android.apps.connectmobile.performance.model.a aVar4 = this.f183169e;
                strValueOf = aVar4 != null ? aVar4.f39917a : null;
            }
            if (strValueOf == null || strValueOf.length() == 0) {
                iw.e eVar = xVar.f183265a;
                this.f183167c = b0Var;
                this.f183165a = xVar;
                this.f183166b = 2;
                eVar.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(eVar, new iw.h(eVar, null), this);
            } else {
                xVar.B4(strValueOf);
            }
        } else {
            if (!(v2Var2 instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strG = androidx.room.a0.g(((v2.a) v2Var2).f47384b, "there is a problem in fetching primary device data ");
            p92.y.f136664a.getClass();
            p92.y.a.c("TrainingStatusViewModel", strG);
        }
        return Unit.INSTANCE;
    }
}
