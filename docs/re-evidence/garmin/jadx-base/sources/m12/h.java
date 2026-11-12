package m12;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.GetActivityListWithSocialInfoUseCase$invoke$safeApiCall$1", f = "GetActivityListWithSocialInfoUseCase.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super v2<? extends ActivityListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f115826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f115828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f115829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, String str, int i14, int i15, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f115826b = eVar;
        this.f115827c = str;
        this.f115828d = i14;
        this.f115829e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f115826b, this.f115827c, this.f115828d, this.f115829e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends ActivityListDTO>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115825a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a22.h hVar = this.f115826b.f115816a;
        this.f115825a = 1;
        Object objJ = f0.J(hVar, new a22.g(hVar, this.f115827c, this.f115828d, this.f115829e, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
