package mz1;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getCourseDetails$2", f = "EventDetailsViewModel.kt", l = {466}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f121896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f121897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e0 e0Var, Integer num, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f121896b = e0Var;
        this.f121897c = num;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p0(this.f121896b, this.f121897c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121895a;
        Object obj2 = null;
        e0 e0Var = this.f121896b;
        if (i14 == 0) {
            o13.r.b(obj);
            zf0.d dVar = e0Var.f204384a;
            long jIntValue = this.f121897c.intValue();
            this.f121895a = 1;
            dVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.l(dVar, jIntValue, null), this);
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
            com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            s20.d dVar2 = s20.d.f156005a;
            List<GeoPointDTO> list = eVar.geoPoints;
            dVar2.getClass();
            eVar.intervalMarkers = s20.d.f(list, zY);
            int i15 = e0.K1;
            List<com.garmin.android.apps.connectmobile.courses.model.e> listD = e0Var.f5().d();
            ArrayList arrayList = listD != null ? new ArrayList(listD) : new ArrayList();
            for (Object obj3 : arrayList) {
                if (((com.garmin.android.apps.connectmobile.courses.model.e) obj3).m() == eVar.m()) {
                    obj2 = obj3;
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) obj2;
            if (eVar2 != null) {
                arrayList.remove(eVar2);
            }
            arrayList.add(eVar);
            e0Var.f5().m(arrayList);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            int i16 = e0.K1;
            e0Var.e5().j(null);
        }
        return Unit.INSTANCE;
    }
}
