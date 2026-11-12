package b50;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "favoriteCourses", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$addToFavoriteFromDeepLink$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f16070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f16071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.android.apps.connectmobile.courses.model.e eVar, p pVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f16070b = eVar;
        this.f16071c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f16070b, this.f16071c, dVar);
        rVar.f16069a = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(List<? extends com.garmin.android.apps.connectmobile.courses.model.d> list, t13.d<? super Unit> dVar) {
        return ((r) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.d dVar;
        Object next;
        List list = (List) this.f16069a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p pVar = this.f16071c;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.d) next).courseId, pVar.f16019a));
            dVar = (com.garmin.android.apps.connectmobile.courses.model.d) next;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(this.f16070b);
            eVar.isFavorite = true;
            p2 p2Var = pVar.f16041y;
            e50.d dVar2 = (e50.d) p2Var.getValue();
            w20.a aVar2 = ((e50.d) pVar.f16041y.getValue()).f62992d;
            p2Var.k(null, e50.d.a(dVar2, false, null, false, aVar2 != null ? w20.a.b(aVar2, eVar, null, null, null, null, 62) : null, null, null, null, false, false, false, null, null, 4087));
        } else {
            pVar.H4();
        }
        return Unit.INSTANCE;
    }
}
