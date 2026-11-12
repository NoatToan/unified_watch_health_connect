package xa1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.c0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$refreshData$1", f = "EditPowerGuideStrategyViewModel.kt", l = {232, 241}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f189778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f189779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab1.d f189780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f189781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f189782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ab1.f f189783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0<g3<ab1.f>> f189784h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l1 l1Var, ab1.d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, k kVar, ab1.f fVar, y0<g3<ab1.f>> y0Var, t13.d<? super o> dVar2) {
        super(2, dVar2);
        this.f189779c = l1Var;
        this.f189780d = dVar;
        this.f189781e = eVar;
        this.f189782f = kVar;
        this.f189783g = fVar;
        this.f189784h = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f189779c, this.f189780d, this.f189781e, this.f189782f, this.f189783g, this.f189784h, dVar);
        oVar.f189778b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        if (r0 == r8) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objG;
        ab1.g powerGuidanceSummary;
        Float f14;
        w01.b bVar;
        ab1.g powerGuidanceSummary2;
        o53.b0 b0Var = (o53.b0) this.f189778b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189777a;
        y0<g3<ab1.f>> y0Var = this.f189784h;
        k kVar = this.f189782f;
        ab1.f fVar = this.f189783g;
        if (i14 == 0) {
            o13.r.b(obj);
            l1 l1Var = this.f189779c;
            if (l1Var != null) {
                this.f189778b = b0Var;
                this.f189777a = 1;
                if (g8.i.r(l1Var, this) != aVar) {
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objG = obj;
        }
        v2 v2Var = (v2) objG;
        if (v2Var instanceof v2.b) {
            w01.c cVar = fVar.f2566d;
            if (cVar != null) {
                cVar.f181028a = ((w01.c) ((v2.b) v2Var).f47386a).f181028a;
            }
            if (cVar != null) {
                cVar.f181036i = a01.a.CUSTOM;
            }
            if (c0.g(b0Var)) {
                kVar.f189760i.j(fVar);
                kVar.f189761j.j(Boolean.TRUE);
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(fVar));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
        h.e(this.f189780d, this.f189781e, kVar.f189754c);
        w01.c cVar2 = fVar.f2566d;
        if ((cVar2 != null ? cVar2.f181028a : null) != null) {
            ab1.d dVar = fVar.f2563a;
            Integer num = (dVar == null || (powerGuidanceSummary2 = dVar.getPowerGuidanceSummary()) == null) ? null : powerGuidanceSummary2.f2581n;
            w01.c cVar3 = fVar.f2566d;
            Double d14 = (cVar3 == null || (bVar = cVar3.f181028a) == null) ? null : new Double(bVar.getHeatIndexTemperatureCelsius());
            ab1.d dVar2 = fVar.f2563a;
            float fFloatValue = (dVar2 == null || (powerGuidanceSummary = dVar2.getPowerGuidanceSummary()) == null || (f14 = powerGuidanceSummary.f2580m) == null) ? 0.0f : f14.floatValue();
            d60.b bVar2 = (d60.b) kVar.f189758g.getValue();
            Double d15 = new Double(fFloatValue);
            this.f189778b = b0Var;
            this.f189777a = 2;
            d60.b.a aVar2 = d60.b.f57806c;
            objG = bVar2.g(num, d14, d15, null, null, this);
        } else if (c0.g(b0Var)) {
            kVar.f189760i.j(fVar);
            kVar.f189761j.j(Boolean.TRUE);
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(fVar));
        }
        return Unit.INSTANCE;
    }
}
