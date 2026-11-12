package ug2;

import com.garmin.proto.generated.GDIDataTypes;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u0<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f171033a;

    public u0(r0 r0Var) {
        this.f171033a = r0Var;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) throws Throwable {
        sf2.e eVar = (sf2.e) obj;
        boolean z14 = eVar instanceof sf2.e.i;
        r0 r0Var = this.f171033a;
        if (z14) {
            p2 p2Var = r0Var.f170941r;
            sf2.e.i iVar = (sf2.e.i) eVar;
            int i14 = iVar.f158969a;
            int i15 = iVar.f158970b;
            float fC = MathKt.c(iVar.f158971c * 2) / 2.0f;
            GDIDataTypes.MeasurementUnit measurementUnit = iVar.f158972d;
            int i16 = iVar.f158973e;
            p2Var.k(null, new yg2.g(i14, i15, fC, measurementUnit, i16 > 0 ? i16 * 2 : -1, iVar.f158974f));
            r0Var.f170931h.setValue(vg2.a.c.INSTANCE);
        } else if (eVar instanceof sf2.e.a) {
            sf2.e.a aVar = (sf2.e.a) eVar;
            Object objEmit = r0Var.f170942t.emit(new f(aVar.f158949a, i53.a.j(aVar.f158950b)), dVar);
            return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
