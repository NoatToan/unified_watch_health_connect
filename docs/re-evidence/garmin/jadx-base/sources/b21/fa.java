package b21;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$18$1$4$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fa extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.u0 f14669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<s21.z, Unit> f14670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u21.t f14671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.s> f14672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fa(u21.u0 u0Var, e23.l<? super s21.z, Unit> lVar, u21.t tVar, p3.x3<u21.s> x3Var, t13.d<? super fa> dVar) {
        super(2, dVar);
        this.f14669a = u0Var;
        this.f14670b = lVar;
        this.f14671c = tVar;
        this.f14672d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new fa(this.f14669a, this.f14670b, this.f14671c, this.f14672d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((fa) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fa faVar = this;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        s21.d0 d0Var = faVar.f14672d.getF182175a().f168121j;
        if (d0Var != null) {
            s21.c cVar = d0Var.f156094b;
            b63.v vVar = d0Var.f156095c;
            b63.v vVar2 = d0Var.f156096d;
            List<q01.e> list = d0Var.f156093a;
            u21.u0 u0Var = faVar.f14669a;
            u0Var.getClass();
            u0Var.f168163n = list;
            r53.p2 p2Var = u0Var.f168164o;
            while (true) {
                Object value = p2Var.getValue();
                s21.c cVar2 = cVar;
                s21.a0 a0Var = (s21.a0) value;
                int i14 = 0;
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((q01.e) it.next()).f141997e && (i14 = i14 + 1) < 0) {
                            p13.x.p();
                            throw null;
                        }
                    }
                }
                b63.v vVar3 = vVar;
                b63.v vVar4 = vVar2;
                r53.p2 p2Var2 = p2Var;
                List<q01.e> list2 = list;
                if (p2Var2.b(value, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, vVar3, vVar4, cVar2, i14, 1073741823, 0))) {
                    faVar = this;
                    faVar.f14670b.invoke(s21.z.MealSettings);
                } else {
                    p2Var = p2Var2;
                    vVar = vVar3;
                    vVar2 = vVar4;
                    cVar = cVar2;
                    list = list2;
                }
            }
        }
        faVar.f14671c.A4();
        return Unit.INSTANCE;
    }
}
