package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg01/i;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getFoodByBarcode$2", f = "NutritionRepositoryImpl.kt", l = {222}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super c83.a0<g01.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f115723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f115724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h hVar, String str, String str2, String str3, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f115721b = hVar;
        this.f115722c = str;
        this.f115723d = str2;
        this.f115724e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f115721b, this.f115722c, this.f115723d, this.f115724e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<g01.i>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115720a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115721b.f115594a;
        this.f115720a = 1;
        Object objH = bVar.h(this.f115722c, this.f115723d, this.f115724e, this);
        return objH == aVar ? aVar : objH;
    }
}
