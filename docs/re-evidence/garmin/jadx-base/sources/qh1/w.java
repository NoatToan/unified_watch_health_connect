package qh1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionViewModel$validateMeasurementDate$1", f = "IndexScale2AdjustBodyCompositionViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f144798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rh1.b f144799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p pVar, rh1.b bVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f144798b = pVar;
        this.f144799c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f144798b, this.f144799c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144797a;
        rh1.b bVar = this.f144799c;
        p pVar = this.f144798b;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVar = pVar.f144766a;
            LocalDate measurementDate = bVar.getMeasurementDate();
            LocalDate localDateMinusDays = measurementDate != null ? measurementDate.minusDays(15) : null;
            LocalDate measurementDate2 = bVar.getMeasurementDate();
            LocalDate localDatePlusDays = measurementDate2 != null ? measurementDate2.plusDays(15) : null;
            this.f144797a = 1;
            obj = mVar.c(localDateMinusDays, localDatePlusDays, this);
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
        y0<rh1.a> y0Var = pVar.f144769d;
        y0<rh1.a> y0Var2 = pVar.f144769d;
        rh1.a aVarD = y0Var.d();
        if (aVarD != null) {
            if (v2Var instanceof v2.b) {
                rh1.a.C2881a c2881a = rh1.a.f152744f;
                boolean zBooleanValue = ((Boolean) ((v2.b) v2Var).f47386a).booleanValue();
                c2881a.getClass();
                bVar.getClass();
                y0Var2.j(rh1.a.a(aVarD, bVar, null, null, fw.m.a.g(fw.m.f73767e, bVar, 1), zBooleanValue, 6));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                rh1.a.C2881a c2881a2 = rh1.a.f152744f;
                Exception exc = ((v2.a) v2Var).f47383a;
                c2881a2.getClass();
                exc.getClass();
                bVar.getClass();
                fw.m.f73767e.getClass();
                y0Var2.j(rh1.a.a(aVarD, bVar, null, null, fw.m.a.a(null, exc), false, 6));
            }
        }
        return Unit.INSTANCE;
    }
}
