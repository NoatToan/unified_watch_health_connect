package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$updateMealFavorite$2", f = "NutritionRepositoryImpl.kt", l = {266}, m = "invokeSuspend", v = 2)
public final class e1 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f115579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f115580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h hVar, long j8, boolean z14, t13.d<? super e1> dVar) {
        super(1, dVar);
        this.f115578b = hVar;
        this.f115579c = j8;
        this.f115580d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e1(this.f115578b, this.f115579c, this.f115580d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((e1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115577a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115578b.f115594a;
        h01.a aVar2 = new h01.a(this.f115579c, this.f115580d);
        this.f115577a = 1;
        Object objF = bVar.F(aVar2, this);
        return objF == aVar ? aVar : objF;
    }
}
