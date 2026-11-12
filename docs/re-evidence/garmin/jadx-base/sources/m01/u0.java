package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lk01/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$quickAddFood$2", f = "NutritionRepositoryImpl.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.l<t13.d<? super c83.a0<k01.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i01.g f115697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(h hVar, i01.g gVar, t13.d<? super u0> dVar) {
        super(1, dVar);
        this.f115696b = hVar;
        this.f115697c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u0(this.f115696b, this.f115697c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<k01.b>> dVar) {
        return ((u0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115695a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115696b.f115594a;
        this.f115695a = 1;
        Object objE = bVar.e(this.f115697c, this);
        return objE == aVar ? aVar : objE;
    }
}
