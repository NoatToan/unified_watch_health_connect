package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lf01/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$setUserPreference$result$1", f = "NutritionRepositoryImpl.kt", l = {450}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.l<t13.d<? super c83.a0<f01.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f115546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f115547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f115548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(String str, boolean z14, h hVar, t13.d<? super b1> dVar) {
        super(1, dVar);
        this.f115546b = str;
        this.f115547c = z14;
        this.f115548d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b1(this.f115546b, this.f115547c, this.f115548d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<f01.k>> dVar) {
        return ((b1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115545a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String strValueOf = String.valueOf(this.f115547c);
        String str = this.f115546b;
        f01.k kVar = new f01.k(str, strValueOf);
        c01.c cVar = this.f115548d.f115595b;
        this.f115545a = 1;
        Object objB = cVar.b(str, kVar, this);
        return objB == aVar ? aVar : objB;
    }
}
