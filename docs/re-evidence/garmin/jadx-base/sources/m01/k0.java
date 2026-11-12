package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj01/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getRecipes$2", f = "NutritionRepositoryImpl.kt", l = {344}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.l<t13.d<? super c83.a0<j01.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f115621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f115622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f115623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h hVar, int i14, int i15, String str, t13.d<? super k0> dVar) {
        super(1, dVar);
        this.f115620b = hVar;
        this.f115621c = i14;
        this.f115622d = i15;
        this.f115623e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k0(this.f115620b, this.f115621c, this.f115622d, this.f115623e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<j01.d>> dVar) {
        return ((k0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115619a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115620b.f115594a;
        this.f115619a = 1;
        Object objB = bVar.B(this.f115621c, this.f115622d, this.f115623e, this);
        return objB == aVar ? aVar : objB;
    }
}
