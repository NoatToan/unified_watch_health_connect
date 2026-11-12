package d60;

import com.garmin.android.apps.connectmobile.nutrition.model.NutritionUserPreferenceDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/nutrition/model/NutritionUserPreferenceDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getNutritionAndHydrationAsync$nutritionUnitPreferenceResult$1", f = "CoursesRepo.kt", l = {493}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super c83.a0<NutritionUserPreferenceDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b bVar, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f57940b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f57940b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<NutritionUserPreferenceDTO>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57939a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b.a aVar2 = b.f57806c;
        o53.i0<c83.a0<NutritionUserPreferenceDTO>> i0VarY = this.f57940b.b().y();
        this.f57939a = 1;
        Object objAwait = i0VarY.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
