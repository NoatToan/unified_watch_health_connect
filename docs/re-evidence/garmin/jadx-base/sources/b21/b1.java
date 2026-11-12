package b21;

import i3.fe;
import i3.se;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$NutritionReportsGraphContainer$1$1", f = "NutritionReportsNav.kt", l = {1235}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i21.d f14524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i21.a f14525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<i21.a> f14528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fe f14529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f14530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i21.d f14531h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(String str, p3.x3<i21.a> x3Var, fe feVar, String str2, i21.d dVar, t13.d<? super b1> dVar2) {
        super(2, dVar2);
        this.f14527d = str;
        this.f14528e = x3Var;
        this.f14529f = feVar;
        this.f14530g = str2;
        this.f14531h = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f14527d, this.f14528e, this.f14529f, this.f14530g, this.f14531h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        i21.a aVar;
        i21.d dVar;
        e23.a<Unit> aVar2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f14526c;
        if (i14 == 0) {
            o13.r.b(obj);
            i21.a f182175a = this.f14528e.getF182175a();
            if (f182175a != null && (str = this.f14527d) != null) {
                String str2 = f182175a.f87238b != null ? this.f14530g : null;
                i21.d dVar2 = this.f14531h;
                this.f14524a = dVar2;
                this.f14525b = f182175a;
                this.f14526c = 1;
                Object objC = l72.d3.c(this.f14529f, str, str2, this);
                if (objC == aVar3) {
                    return aVar3;
                }
                aVar = f182175a;
                obj = objC;
                dVar = dVar2;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aVar = this.f14525b;
        dVar = this.f14524a;
        o13.r.b(obj);
        se seVar = (se) obj;
        dVar.F4();
        if (seVar == se.ActionPerformed && (aVar2 = aVar.f87238b) != null) {
            aVar2.invoke();
        }
        return Unit.INSTANCE;
    }
}
