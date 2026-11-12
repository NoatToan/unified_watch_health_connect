package a21;

import com.garmin.android.apps.connectmobile.calories.model.MyFitnessPalUserAuthDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.viewmodel.CaloriesLinkAccountsViewModel$setUserAUth$1", f = "CaloriesLinkAccountsViewModel.kt", l = {15}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyFitnessPalUserAuthDTO f503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, MyFitnessPalUserAuthDTO myFitnessPalUserAuthDTO, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f502b = cVar;
        this.f503c = myFitnessPalUserAuthDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f502b, this.f503c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f501a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        m01.a aVar2 = this.f502b.f504a;
        this.f501a = 1;
        Object objA = aVar2.a(this.f503c, this);
        return objA == aVar ? aVar : objA;
    }
}
