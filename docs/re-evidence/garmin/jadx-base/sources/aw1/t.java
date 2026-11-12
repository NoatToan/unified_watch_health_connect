package aw1;

import am.x0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$fetchCyclingCourses$1", f = "FBTPlanWizardViewModel.kt", l = {3799}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13565b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((com.garmin.android.apps.connectmobile.courses.model.d) t14).createdDate), Long.valueOf(((com.garmin.android.apps.connectmobile.courses.model.d) t7).createdDate));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h hVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f13565b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f13565b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        List<com.garmin.android.apps.connectmobile.courses.model.d> listN0;
        String str;
        z20.e eVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13564a;
        h hVar = this.f13565b;
        if (i14 == 0) {
            o13.r.b(obj);
            hVar.D1.j(g3.a.c(g3.f35298f));
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            String userDisplayName = bVar.getUserDisplayName();
            int userProfilePk = bVar.getUserProfilePk();
            d60.b bVarF4 = hVar.F4();
            Boolean bool = Boolean.TRUE;
            this.f13564a = 1;
            objF = d60.b.f(bVarF4, userDisplayName, userProfilePk, null, null, bool, this, 28);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objF = obj;
        }
        List list = (List) objF;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                com.garmin.android.apps.connectmobile.courses.model.i.a aVar2 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
                x0 x0VarC = ((com.garmin.android.apps.connectmobile.courses.model.d) obj2).C();
                aVar2.getClass();
                if (com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC).c()) {
                    arrayList.add(obj2);
                }
            }
            listN0 = p13.h0.N0(arrayList, new a());
        } else {
            listN0 = null;
        }
        if (listN0 == null) {
            hVar.D1.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (com.garmin.android.apps.connectmobile.courses.model.d dVar : listN0) {
                if (dVar == null || (str = dVar.courseId) == null) {
                    eVar = null;
                } else {
                    String str2 = dVar.courseName;
                    com.garmin.android.apps.connectmobile.courses.model.i.a aVar3 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
                    x0 x0VarC2 = dVar.C();
                    aVar3.getClass();
                    eVar = new z20.e(str, str2, com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC2), dVar.distanceInMeters, dVar.elevationGainInMeters, dVar.F(), dVar.isFavorite);
                }
                if (eVar != null) {
                    arrayList2.add(eVar);
                }
            }
            i53.f fVarJ = i53.a.j(arrayList2);
            int i15 = h.S1;
            jv1.s sVarI6 = hVar.i6();
            jv1.l lVar = new jv1.l(fVarJ, sVarI6 != null ? sVarI6.N : null);
            y0<g3<jv1.l>> y0Var = hVar.D1;
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(lVar));
        }
        return Unit.INSTANCE;
    }
}
