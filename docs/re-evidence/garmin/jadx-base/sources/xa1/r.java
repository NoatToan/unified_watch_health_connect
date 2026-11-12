package xa1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideAlgorithm;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$savePowerGuideStrategyChanges$1", f = "EditPowerGuideStrategyViewModel.kt", l = {334}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab1.d f189793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f189794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f189795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f189796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab1.f f189797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0<g3<ab1.f>> f189798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ab1.d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, k kVar, long j8, ab1.f fVar, y0<g3<ab1.f>> y0Var, t13.d<? super r> dVar2) {
        super(2, dVar2);
        this.f189793b = dVar;
        this.f189794c = eVar;
        this.f189795d = kVar;
        this.f189796e = j8;
        this.f189797f = fVar;
        this.f189798g = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f189793b, this.f189794c, this.f189795d, this.f189796e, this.f189797f, this.f189798g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189792a;
        k kVar = this.f189795d;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f189794c;
            PowerGuideAlgorithm powerGuideAlgorithm = kVar.f189754c;
            ab1.d dVar = this.f189793b;
            h.e(dVar, eVar, powerGuideAlgorithm);
            sa1.m mVar = kVar.f189755d;
            this.f189792a = 1;
            mVar.getClass();
            obj = f0.J(mVar, new sa1.v(mVar, this.f189796e, dVar, null), this);
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
        boolean z14 = v2Var instanceof v2.b;
        y0<g3<ab1.f>> y0Var = this.f189798g;
        if (z14) {
            y0<ab1.f> y0Var2 = kVar.f189760i;
            ab1.f fVar = this.f189797f;
            y0Var2.j(fVar);
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(fVar));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
