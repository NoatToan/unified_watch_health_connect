package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$9$1$5$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pa extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s21.b> f15151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.o0 f15152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(p3.x3<s21.b> x3Var, u21.o0 o0Var, lc.v vVar, t13.d<? super pa> dVar) {
        super(2, dVar);
        this.f15151a = x3Var;
        this.f15152b = o0Var;
        this.f15153c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new pa(this.f15151a, this.f15152b, this.f15153c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((pa) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u21.o0 o0Var;
        u21.h1 h1Var;
        r53.p2 p2Var;
        Object obj2;
        Object value;
        Object value2;
        s21.x xVar;
        l01.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        s21.b f182175a = this.f15151a.getF182175a();
        if (f182175a != null) {
            s21.a aVar3 = f182175a.f156064c;
            u21.o0 o0Var2 = this.f15152b;
            u21.h1 h1Var2 = o0Var2.f168056a;
            r53.p2 p2Var2 = o0Var2.f168062g;
            int i14 = u21.o0.a.f168064a[aVar3.ordinal()];
            Object obj3 = null;
            if (i14 == 1) {
                o0Var = o0Var2;
                h1Var = h1Var2;
                p2Var = p2Var2;
                obj2 = null;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, s21.x.a((s21.x) value, null, null, f182175a.f156062a, null, aVar3, null, null, 0.0f, false, null, 8151)));
            } else if (i14 == 2) {
                o0Var = o0Var2;
                h1Var = h1Var2;
                p2Var = p2Var2;
                obj2 = null;
                do {
                    value2 = p2Var.getValue();
                    xVar = (s21.x) value2;
                    aVar = f182175a.f156065d;
                    if (aVar == null) {
                        aVar = u21.t0.f168148a;
                    }
                } while (!p2Var.b(value2, s21.x.a(xVar, null, null, null, null, aVar3, aVar, null, 0.0f, false, null, 8095)));
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                while (true) {
                    Object value3 = p2Var2.getValue();
                    o0Var = o0Var2;
                    p2Var = p2Var2;
                    h1Var = h1Var2;
                    obj2 = obj3;
                    if (p2Var.b(value3, s21.x.a((s21.x) value3, null, null, null, f182175a.f156063b, aVar3, null, null, 0.0f, false, null, 8143))) {
                        break;
                    }
                    p2Var2 = p2Var;
                    obj3 = obj2;
                    h1Var2 = h1Var;
                    o0Var2 = o0Var;
                }
            }
            o13.p<l01.a, Integer> pVarD4 = o0Var.D4();
            l01.a aVar4 = pVarD4.f128594a;
            Integer num = pVarD4.f128595b;
            float f14 = ((s21.x) p2Var.getValue()).f156200i;
            Integer numG4 = o0Var.G4();
            l01.i iVarE4 = o0Var.E4();
            u21.h1 h1Var3 = h1Var;
            int i15 = h1Var3.f167990c;
            int i16 = h1Var3.f167991d;
            v21.f.f175333a.getClass();
            o0Var.A4(i15, i16, v21.f.p(f14), h1Var3.f167989b, fz0.d.a(g22.l.d(b63.o.INSTANCE)).toString(), iVarE4, aVar4, num, numG4);
            this.f15153c.a().f(obj2, "activityLevelResult");
        }
        return Unit.INSTANCE;
    }
}
