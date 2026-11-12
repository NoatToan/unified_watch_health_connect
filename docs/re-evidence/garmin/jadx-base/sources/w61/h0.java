package w61;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import java.util.Iterator;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getTrainingStatusPause$1$1", f = "TrainingStatusViewModel.kt", l = {939, 942}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fw.m<com.garmin.android.apps.connectmobile.performance.model.a> f183191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f183192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x61.p f183193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(fw.m<com.garmin.android.apps.connectmobile.performance.model.a> mVar, x xVar, x61.p pVar, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f183191b = mVar;
        this.f183192c = xVar;
        this.f183193d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f183191b, this.f183192c, this.f183193d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r13 == r0) goto L43;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        String str;
        wi1.j jVar;
        String str2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183190a;
        x61.p pVar = this.f183193d;
        x xVar = this.f183192c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
            if (userSettingsDTO != null && (jVar = userSettingsDTO.f43524b) != null && (str2 = jVar.f185557v) != null && str2.length() != 0) {
                pVar.f189269c = true;
            }
            xVar.f183275k.m(Boolean.valueOf(pVar.f189269c));
            xVar.f183274j.m(fw.m.a.g(fw.m.f73767e, pVar, 1));
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.performance.model.a aVar2 = this.f183191b.f73770c;
        Long lJ = (aVar2 == null || (str = aVar2.f39917a) == null) ? null : d53.t.j(str);
        this.f183190a = 1;
        ArrayList arrayList = xVar.f183278m;
        if (arrayList == null) {
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new p0(xVar, lJ, null), this);
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long unitID = ((sd2.f) next).getUnitID();
                if (lJ != null && unitID == lJ.longValue()) {
                    break;
                }
            }
            sd2.f fVar = (sd2.f) next;
            obj = Boolean.valueOf(fVar != null ? fVar.p2() : false);
        }
        if (obj != aVar) {
        }
        return aVar;
        if (((Boolean) obj).booleanValue()) {
            pVar.f189268b = true;
        }
        this.f183190a = 2;
        obj = xVar.f183277l;
        if (obj == null) {
            x53.c cVar2 = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new k0(xVar, null), this);
        }
    }
}
