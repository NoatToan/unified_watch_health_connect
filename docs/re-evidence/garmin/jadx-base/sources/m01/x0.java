package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg01/z;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$saveMeals$2", f = "NutritionRepositoryImpl.kt", l = {200}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.l<t13.d<? super c83.a0<g01.z>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f115717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f115718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g01.z f115719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(h hVar, int i14, b63.o oVar, g01.z zVar, t13.d<? super x0> dVar) {
        super(1, dVar);
        this.f115716b = hVar;
        this.f115717c = i14;
        this.f115718d = oVar;
        this.f115719e = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x0(this.f115716b, this.f115717c, this.f115718d, this.f115719e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<g01.z>> dVar) {
        return ((x0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115715a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115716b.f115594a;
        fz0.c cVarA = fz0.d.a(this.f115718d);
        this.f115715a = 1;
        Object objM = bVar.M(this.f115717c, cVarA, this.f115719e, this);
        return objM == aVar ? aVar : objM;
    }
}
