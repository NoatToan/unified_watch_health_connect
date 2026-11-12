package o50;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.nutrition.model.HydrationUserPreferenceDTO;
import com.garmin.android.apps.connectmobile.v2;
import d60.h0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationViewModel$saveUserHydrationUnitPreference$1", f = "NutritionHydrationViewModel.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f129195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f129196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q22.b f129197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, q22.b bVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f129196b = hVar;
        this.f129197c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f129196b, this.f129197c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f129195a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        d60.b bVar = (d60.b) this.f129196b.f129201a.getValue();
        HydrationUserPreferenceDTO hydrationUserPreferenceDTO = new HydrationUserPreferenceDTO(this.f129197c);
        this.f129195a = 1;
        bVar.getClass();
        Object objJ = f0.J(bVar, new h0(bVar, hydrationUserPreferenceDTO, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
