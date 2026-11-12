package xa1;

import androidx.lifecycle.y0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$getObservablePowerGuideDetails$1$1", f = "EditPowerGuideStrategyViewModel.kt", l = {126, SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f189770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ab1.d f189771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f189772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f189773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f189774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab1.f f189775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0<g3<ab1.f>> f189776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, ab1.f fVar, y0<g3<ab1.f>> y0Var, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f189773d = kVar;
        this.f189774e = eVar;
        this.f189775f = fVar;
        this.f189776g = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f189773d, this.f189774e, this.f189775f, this.f189776g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x015e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:0x016b  */
    /* JADX WARN: Code duplicated, block: B:57:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long l14;
        Object objJ;
        Object objH;
        ab1.d dVar;
        Long l15;
        v2 v2Var;
        w01.c cVar;
        w01.c cVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189772c;
        y0<g3<ab1.f>> y0Var = this.f189776g;
        ab1.f fVar = this.f189775f;
        k kVar = this.f189773d;
        if (i14 != 0) {
            if (i14 == 1) {
                Long l16 = this.f189770a;
                o13.r.b(obj);
                l14 = l16;
                objJ = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = this.f189771b;
                l15 = this.f189770a;
                o13.r.b(obj);
                objH = obj;
            }
            v2Var = (v2) objH;
            if (v2Var instanceof v2.b) {
                cVar = (w01.c) ((v2.b) v2Var).f47386a;
                fVar.f2566d = cVar;
                if (cVar != null) {
                    cVar.f181031d = dVar.getPowerGuidanceSummary().f2581n;
                }
                cVar2 = fVar.f2566d;
                if (cVar2 != null) {
                    cVar2.f181032e = l15;
                }
                if (cVar2 != null) {
                    cVar2.f181033f = dVar.getPowerGuidanceSummary().f2580m;
                }
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            l14 = l15;
            kVar.f189757f.c(new ta1.a(new wv0.h(fVar, l14, kVar, y0Var, 3), new i(y0Var, 1)));
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        ab1.g gVar = kVar.f189752a;
        l14 = gVar.f2568a;
        if (l14 != null) {
            sa1.m mVar = kVar.f189755d;
            long jLongValue = l14.longValue();
            this.f189770a = l14;
            this.f189772c = 1;
            mVar.getClass();
            objJ = f0.J(mVar, new sa1.s(mVar, jLongValue, null), this);
            if (objJ != aVar) {
            }
            return aVar;
        }
        String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f189774e;
        String string = (!p005kotlin.jvm.internal.s.g(strValueOf, eVar.userProfilePk) || eVar.f0()) ? ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a().getString(R.string.workout_duplicate_default_format, eVar.courseName) : eVar.courseName;
        String str = gVar.f2569b;
        if (str == null || str.length() == 0) {
            gVar.f2569b = string;
        }
        gVar.f2585r = new Long((long) eVar.q());
        ab1.p.a aVar2 = ab1.p.f2628e;
        com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
        if (iVarM == null) {
            iVarM = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
        }
        aVar2.getClass();
        gVar.i(ab1.p.a.a(iVarM));
        ab1.d dVar2 = new ab1.d(kVar.f189753b, kVar.f189752a, null, null, 12, null);
        h.e(dVar2, eVar, kVar.f189754c);
        fVar.f2563a = dVar2;
        kVar.f189757f.c(new ta1.a(new wv0.h(fVar, l14, kVar, y0Var, 3), new i(y0Var, 1)));
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) objJ;
        if (v2Var2 instanceof v2.b) {
            ab1.d dVar3 = (ab1.d) ((v2.b) v2Var2).f47386a;
            Float f14 = dVar3.getPowerGuidanceSummary().f2577j;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            f12.l.f68084a.getClass();
            float fV3 = (float) f12.l.a.a().v3();
            int i15 = k.f189751k;
            kVar.getClass();
            if (Math.abs(fV3 - fFloatValue) >= 2.5d) {
                dVar3.h(new ab1.a(p13.w.c(new ab1.a.b.C0033b(fV3)), ab1.a.AbstractC0027a.C0028a.f2534a));
            }
            fVar.f2563a = dVar3;
            d60.b bVar = (d60.b) kVar.f189758g.getValue();
            long jLongValue2 = l14.longValue();
            this.f189770a = l14;
            this.f189771b = dVar3;
            this.f189772c = 2;
            objH = bVar.h(jLongValue2, this);
            if (objH != aVar) {
                dVar = dVar3;
                l15 = l14;
                v2Var = (v2) objH;
                if (v2Var instanceof v2.b) {
                    cVar = (w01.c) ((v2.b) v2Var).f47386a;
                    fVar.f2566d = cVar;
                    if (cVar != null) {
                        cVar.f181031d = dVar.getPowerGuidanceSummary().f2581n;
                    }
                    cVar2 = fVar.f2566d;
                    if (cVar2 != null) {
                        cVar2.f181032e = l15;
                    }
                    if (cVar2 != null) {
                        cVar2.f181033f = dVar.getPowerGuidanceSummary().f2580m;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                }
                l14 = l15;
            }
            return aVar;
        }
        if (!(v2Var2 instanceof v2.a)) {
            u0.r();
            return null;
        }
        y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        kVar.f189757f.c(new ta1.a(new wv0.h(fVar, l14, kVar, y0Var, 3), new i(y0Var, 1)));
        return Unit.INSTANCE;
    }
}
