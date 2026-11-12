package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lk01/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$bulkLogFood$2", f = "NutritionRepositoryImpl.kt", l = {93}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super c83.a0<k01.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i01.c f115611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, i01.c cVar, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f115610b = hVar;
        this.f115611c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f115610b, this.f115611c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<k01.b>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115609a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115610b.f115594a;
        this.f115609a = 1;
        Object objK = bVar.k(this.f115611c, this);
        return objK == aVar ? aVar : objK;
    }
}
