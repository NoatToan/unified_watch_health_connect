package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg01/p;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getFood$2", f = "NutritionRepositoryImpl.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super c83.a0<g01.p>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g01.d0 f115714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h hVar, g01.d0 d0Var, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f115713b = hVar;
        this.f115714c = d0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f115713b, this.f115714c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<g01.p>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115712a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115713b.f115594a;
        this.f115712a = 1;
        Object objN = bVar.n(true, this.f115714c, this);
        return objN == aVar ? aVar : objN;
    }
}
