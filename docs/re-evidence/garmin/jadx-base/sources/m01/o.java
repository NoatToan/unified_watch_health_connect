package m01;

import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$deleteNutritionPhoto$2", f = "NutritionRepositoryImpl.kt", l = {388}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoCategory f115645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f115646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, PhotoCategory photoCategory, String str, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f115644b = hVar;
        this.f115645c = photoCategory;
        this.f115646d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f115644b, this.f115645c, this.f115646d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115643a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115644b.f115594a;
        String apiKey = this.f115645c.getApiKey();
        this.f115643a = 1;
        Object objW = bVar.w(apiKey, this.f115646d, this);
        return objW == aVar ? aVar : objW;
    }
}
