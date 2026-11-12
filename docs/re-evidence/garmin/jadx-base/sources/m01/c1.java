package m01;

import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lf01/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$submitNutritionPhoto$2", f = "NutritionRepositoryImpl.kt", l = {378}, m = "invokeSuspend", v = 2)
public final class c1 extends v13.i implements e23.l<t13.d<? super c83.a0<f01.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoCategory f115557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f115558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f115559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(h hVar, PhotoCategory photoCategory, String str, MultipartBody.Part part, t13.d<? super c1> dVar) {
        super(1, dVar);
        this.f115556b = hVar;
        this.f115557c = photoCategory;
        this.f115558d = str;
        this.f115559e = part;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c1(this.f115556b, this.f115557c, this.f115558d, this.f115559e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<f01.e>> dVar) {
        return ((c1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115555a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115556b.f115594a;
        String apiKey = this.f115557c.getApiKey();
        this.f115555a = 1;
        Object objU = bVar.u(apiKey, this.f115558d, this.f115559e, this);
        return objU == aVar ? aVar : objU;
    }
}
