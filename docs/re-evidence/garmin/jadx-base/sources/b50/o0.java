package b50;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$navigateToEditCourse$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<v2<? extends List<? extends CourseSegmentDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p pVar, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f16018b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o0 o0Var = new o0(this.f16018b, dVar);
        o0Var.f16017a = obj;
        return o0Var;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends List<? extends CourseSegmentDTO>> v2Var, t13.d<? super Unit> dVar) {
        return ((o0) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        v2 v2Var = (v2) this.f16017a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof v2.b;
        p pVar = this.f16018b;
        if (z14) {
            T t7 = ((v2.b) v2Var).f47386a;
            Collection collection = (Collection) t7;
            if (collection != null && !collection.isEmpty()) {
                p2 p2Var = pVar.f16041y;
                p2 p2Var2 = pVar.f16041y;
                w20.a aVar2 = ((e50.d) p2Var.getValue()).f62992d;
                if (aVar2 == null || (eVar2 = aVar2.f181476a) == null) {
                    eVar = null;
                } else {
                    eVar2.h0((List) t7);
                    eVar = eVar2;
                }
                if (eVar != null) {
                    e50.d dVar = (e50.d) p2Var2.getValue();
                    w20.a aVar3 = ((e50.d) p2Var2.getValue()).f62992d;
                    p2Var2.k(null, e50.d.a(dVar, false, null, false, aVar3 != null ? w20.a.b(aVar3, eVar, null, null, null, null, 62) : null, null, null, null, false, false, false, null, null, 4087));
                }
            }
            pVar.z4(e50.b.k.f62961a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            pVar.z4(e50.b.v.f62973a);
        }
        return Unit.INSTANCE;
    }
}
