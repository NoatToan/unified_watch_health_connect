package b21;

import android.content.Context;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$1$1$4$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<i21.c> f14736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i21.d f14737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f14738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(p3.x3<i21.c> x3Var, i21.d dVar, Context context, t13.d<? super i1> dVar2) {
        super(2, dVar2);
        this.f14736a = x3Var;
        this.f14737b = dVar;
        this.f14738c = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i1(this.f14736a, this.f14737b, this.f14738c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g21.j jVar = this.f14736a.getF182175a().f87266u;
        if (jVar != null) {
            this.f14737b.E4();
            p01.a aVar2 = (p01.a) KoinJavaComponent.get$default(p01.a.class, null, null, 6, null);
            boolean z14 = jVar.f75436a;
            int i14 = jVar.f75437b;
            int i15 = jVar.f75438c;
            int i16 = jVar.f75439d;
            int i17 = jVar.f75440e;
            aVar2.c(this.f14738c, z14, i14, i15, i16, jVar.f75441f, i17);
        }
        return Unit.INSTANCE;
    }
}
