package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$8$1$1$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ka extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.u0 f14809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.e1 f14810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<s21.z, Unit> f14811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s21.b0> f14812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ka(u21.u0 u0Var, u21.e1 e1Var, e23.l<? super s21.z, Unit> lVar, p3.x3<s21.b0> x3Var, t13.d<? super ka> dVar) {
        super(2, dVar);
        this.f14809a = u0Var;
        this.f14810b = e1Var;
        this.f14811c = lVar;
        this.f14812d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ka(this.f14809a, this.f14810b, this.f14811c, this.f14812d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ka) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Double d14;
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<s21.b0> x3Var = this.f14812d;
        if (x3Var.getF182175a().f156078m) {
            Double d15 = x3Var.getF182175a().f156066a;
            Double d16 = null;
            if (d15 != null) {
                double dDoubleValue = d15.doubleValue();
                c22.l3.f23124b.getClass();
                d14 = new Double(dDoubleValue * ((double) 1000));
            } else {
                d14 = null;
            }
            Double d17 = x3Var.getF182175a().f156067b;
            if (d17 != null) {
                double dDoubleValue2 = d17.doubleValue();
                c22.l3.f23124b.getClass();
                d16 = new Double(dDoubleValue2 * ((double) 1000));
            }
            Double d18 = d16;
            r53.p2 p2Var = this.f14809a.f168164o;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s21.a0.a((s21.a0) value, null, null, true, false, null, null, null, null, null, d14, d18, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -3097, 3)));
            r53.p2 p2Var2 = this.f14810b.f167945d;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, s21.b0.a((s21.b0) value2, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 2047)));
            this.f14811c.invoke(s21.z.Weight);
        }
        return Unit.INSTANCE;
    }
}
