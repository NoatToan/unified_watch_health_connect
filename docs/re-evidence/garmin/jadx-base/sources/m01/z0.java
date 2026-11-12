package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg01/t;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$search$2", f = "NutritionRepositoryImpl.kt", l = {278}, m = "invokeSuspend", v = 2)
public final class z0 extends v13.i implements e23.l<t13.d<? super c83.a0<g01.t>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f115737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f115738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f115739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f115740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(h hVar, String str, int i14, int i15, String str2, String str3, t13.d<? super z0> dVar) {
        super(1, dVar);
        this.f115735b = hVar;
        this.f115736c = str;
        this.f115737d = i14;
        this.f115738e = i15;
        this.f115739f = str2;
        this.f115740g = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z0(this.f115735b, this.f115736c, this.f115737d, this.f115738e, this.f115739f, this.f115740g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<g01.t>> dVar) {
        return ((z0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115734a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115735b.f115594a;
        this.f115734a = 1;
        Object objC = bVar.c(this.f115736c, this.f115737d, this.f115738e, this.f115739f, this.f115740g, this);
        return objC == aVar ? aVar : objC;
    }
}
