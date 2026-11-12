package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg01/b0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getFoodsFromNaturalLanguage$2", f = "NutritionRepositoryImpl.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.l<t13.d<? super c83.a0<g01.b0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f115531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f115532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h hVar, String str, String str2, String str3, t13.d<? super a0> dVar) {
        super(1, dVar);
        this.f115529b = hVar;
        this.f115530c = str;
        this.f115531d = str2;
        this.f115532e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a0(this.f115529b, this.f115530c, this.f115531d, this.f115532e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<g01.b0>> dVar) {
        return ((a0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115528a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115529b.f115594a;
        this.f115528a = 1;
        Object objR = bVar.r(this.f115530c, this.f115531d, this.f115532e, this);
        return objR == aVar ? aVar : objR;
    }
}
