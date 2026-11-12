package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg01/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$saveCustomMeals$2", f = "NutritionRepositoryImpl.kt", l = {356}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.l<t13.d<? super c83.a0<g01.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g01.b f115711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(h hVar, g01.b bVar, t13.d<? super w0> dVar) {
        super(1, dVar);
        this.f115710b = hVar;
        this.f115711c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w0(this.f115710b, this.f115711c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<g01.e>> dVar) {
        return ((w0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115709a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115710b.f115594a;
        this.f115709a = 1;
        Object objA = bVar.A(this.f115711c, this);
        return objA == aVar ? aVar : objA;
    }
}
