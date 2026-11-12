package mz1;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getCourseDetails$1", f = "AddTIEventViewModel.kt", l = {968}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f121795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f121796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AddTIEventViewModel addTIEventViewModel, long j8, boolean z14, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f121794b = addTIEventViewModel;
        this.f121795c = j8;
        this.f121796d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f121794b, this.f121795c, this.f121796d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121793a;
        Object obj2 = null;
        AddTIEventViewModel addTIEventViewModel = this.f121794b;
        if (i14 == 0) {
            o13.r.b(obj);
            zf0.d dVar = addTIEventViewModel.f204384a;
            this.f121793a = 1;
            dVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.l(dVar, this.f121795c, null), this);
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
            o13.p pVar = new o13.p(eVar, Boolean.valueOf(this.f121796d));
            androidx.lifecycle.y0<List<com.garmin.android.apps.connectmobile.courses.model.d>> y0VarM5 = addTIEventViewModel.m5();
            o13.t tVar = addTIEventViewModel.f46413i1;
            List<com.garmin.android.apps.connectmobile.courses.model.d> listD = y0VarM5.d();
            if (listD != null && !listD.isEmpty()) {
                List arrayList = (List) ((androidx.lifecycle.y0) tVar.getValue()).d();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (Object obj3 : arrayList) {
                    if (p005kotlin.jvm.internal.s.g(((o13.p) obj3).f128594a, pVar.f128594a)) {
                        obj2 = obj3;
                        break;
                    }
                }
                o13.p pVar2 = (o13.p) obj2;
                if (pVar2 != null) {
                    arrayList.remove(pVar2);
                    arrayList.add(pVar2);
                    ((androidx.lifecycle.y0) tVar.getValue()).m(arrayList);
                }
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String[] strArr = AddTIEventViewModel.V2;
            ((androidx.lifecycle.y0) addTIEventViewModel.f46413i1.getValue()).j(null);
        }
        return Unit.INSTANCE;
    }
}
