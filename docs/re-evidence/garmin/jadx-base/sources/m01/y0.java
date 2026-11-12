package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll01/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$saveNutritionSettings$2", f = "NutritionRepositoryImpl.kt", l = {164}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.l<t13.d<? super c83.a0<l01.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f115727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f115728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f115729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l01.k f115730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(h hVar, int i14, b63.o oVar, Boolean bool, l01.k kVar, t13.d<? super y0> dVar) {
        super(1, dVar);
        this.f115726b = hVar;
        this.f115727c = i14;
        this.f115728d = oVar;
        this.f115729e = bool;
        this.f115730f = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y0(this.f115726b, this.f115727c, this.f115728d, this.f115729e, this.f115730f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<l01.k>> dVar) {
        return ((y0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115725a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115726b.f115594a;
        fz0.c cVarA = fz0.d.a(this.f115728d);
        this.f115725a = 1;
        Object objB = bVar.b(this.f115727c, cVarA, this.f115729e, this.f115730f, this);
        return objB == aVar ? aVar : objB;
    }
}
