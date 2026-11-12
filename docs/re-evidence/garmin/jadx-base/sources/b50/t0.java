package b50;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "Lk30/u;", "onCourseFeatures", "Lw20/e;", "powerGuideData", "Lw20/d;", "paceProData", "Lw20/c;", "eventsData", "Le50/d;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;Lk30/u;Lw20/e;Lw20/d;Lw20/c;)Le50/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$refreshAllData$1", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.t<com.garmin.android.apps.connectmobile.courses.model.e, k30.u, w20.e, w20.d, w20.c, t13.d<? super e50.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f16081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ k30.u f16082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ w20.e f16083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ w20.d f16084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ w20.c f16085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f16086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(p pVar, t13.d<? super t0> dVar) {
        super(6, dVar);
        this.f16086f = pVar;
    }

    @Override // e23.t
    public final Object invoke(com.garmin.android.apps.connectmobile.courses.model.e eVar, k30.u uVar, w20.e eVar2, w20.d dVar, w20.c cVar, t13.d<? super e50.d> dVar2) {
        t0 t0Var = new t0(this.f16086f, dVar2);
        t0Var.f16081a = eVar;
        t0Var.f16082b = uVar;
        t0Var.f16083c = eVar2;
        t0Var.f16084d = dVar;
        t0Var.f16085e = cVar;
        return t0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        w20.a aVar;
        ArrayList arrayList;
        List<fn0.b> listD;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f16081a;
        k30.u uVar = this.f16082b;
        w20.e eVar2 = this.f16083c;
        w20.d dVar = this.f16084d;
        w20.c cVar = this.f16085e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p pVar = this.f16086f;
        if (eVar != null) {
            List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
            if (uVar == null || (listD = uVar.d()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(p13.y.r(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList2.add(p.y4(pVar, (fn0.b) it.next()));
                }
                arrayList = arrayList2;
            }
            aVar = new w20.a(eVar, listB, arrayList, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
        } else {
            aVar = null;
        }
        return e50.d.a((e50.d) pVar.f16041y.getValue(), false, null, false, aVar, cVar, dVar, eVar2, p.x4(pVar, eVar != null ? eVar.D() : null, (com.garmin.android.library.mapsdkadapter.i.d) pVar.C.getValue()), !pVar.f16022d, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), null, null, 3078);
    }
}
