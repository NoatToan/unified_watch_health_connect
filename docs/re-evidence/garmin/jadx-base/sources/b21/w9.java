package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$12$1$1$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w9 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.u0 f15368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4.e0 f15369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(u21.u0 u0Var, l4.e0 e0Var, t13.d<? super w9> dVar) {
        super(2, dVar);
        this.f15368a = u0Var;
        this.f15369b = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w9(this.f15368a, this.f15369b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w9) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        s21.a0 a0Var;
        Object value;
        Object value2;
        s21.a aVar;
        l01.h hVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l01.k kVar = this.f15369b.f14873b;
        u21.u0 u0Var = this.f15368a;
        if (kVar != null) {
            boolean zE = u0Var.f168153d.e();
            Boolean bool = kVar.f107883f;
            Integer num = kVar.f107882e;
            s21.s.Companion companion = s21.s.INSTANCE;
            String str = kVar.f107878a;
            companion.getClass();
            s21.s sVarA = s21.s.Companion.a(str);
            Double d14 = kVar.f107892o;
            Double d15 = kVar.f107893p;
            b63.o oVar = kVar.f107879b;
            Integer num2 = kVar.f107880c;
            Float fValueOf = num2 != null ? Float.valueOf(num2.intValue()) : null;
            if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                v21.f.f175333a.getClass();
                if (v21.f.s(num)) {
                    aVar = s21.a.CUSTOM_ACTIVE_CALORIES;
                } else if (p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                    v21.f.f175333a.getClass();
                    if (v21.f.s(num)) {
                        aVar = s21.a.ACTIVE_CALORIES;
                    } else {
                        aVar = s21.a.ACTIVITY_MULTIPLIER;
                    }
                } else {
                    aVar = s21.a.ACTIVITY_MULTIPLIER;
                }
            } else if (p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                v21.f.f175333a.getClass();
                if (v21.f.s(num)) {
                    aVar = s21.a.ACTIVE_CALORIES;
                } else {
                    aVar = s21.a.ACTIVITY_MULTIPLIER;
                }
            } else {
                aVar = s21.a.ACTIVITY_MULTIPLIER;
            }
            s21.a aVar3 = aVar;
            l01.a.Companion companion2 = l01.a.INSTANCE;
            String str2 = kVar.f107881d;
            companion2.getClass();
            l01.a aVarA = l01.a.Companion.a(str2);
            Integer num3 = (num == null || num.intValue() <= 0) ? null : num;
            Boolean bool2 = kVar.f107883f;
            Integer num4 = kVar.f107884g;
            Integer num5 = (num4 == null || num4.intValue() <= 0) ? null : num4;
            l01.i iVar = kVar.f107885h;
            s21.e eVar = iVar != null ? new s21.e(iVar.f107867a, iVar.f107868b, iVar.f107869c) : null;
            s21.o oVarA0 = (!zE || (hVar = kVar.f107886i) == null) ? null : o72.t.a0(hVar);
            Boolean bool3 = kVar.f107887j;
            o13.p pVar = new o13.p(kVar.f107888k, null);
            o13.p pVar2 = new o13.p(kVar.f107889l, null);
            s21.c.a aVar4 = s21.c.f156079a;
            l01.e eVar2 = kVar.f107894q;
            aVar4.getClass();
            a0Var = new s21.a0(null, null, null, false, false, sVarA, null, null, null, null, d14, d15, oVar, fValueOf, aVar3, aVarA, num3, bool2, num5, eVar, oVarA0, bool3, pVar, pVar2, false, false, null, false, false, null, kVar.f107890m, kVar.f107891n, s21.c.a.a(eVar2, zE), 0, 1056965599, 2, null);
        } else {
            u0Var.getClass();
            a0Var = new s21.a0(null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -1, 3, null);
        }
        r53.p2 p2Var = u0Var.f168160k;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, i53.a.j(p13.h0.y0((i53.c) value, s21.z.MealSettings))));
        r53.p2 p2Var2 = u0Var.f168164o;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, s21.a0.a((s21.a0) value2, null, null, false, false, a0Var.f156041f, null, null, null, null, a0Var.f156046k, a0Var.f156047l, a0Var.f156048m, a0Var.f156049n, a0Var.f156050o, a0Var.f156051p, a0Var.f156052q, a0Var.f156053r, a0Var.f156054s, a0Var.f156055t, a0Var.f156056u, a0Var.f156057v, a0Var.f156058w, a0Var.f156059x, false, false, null, false, false, null, a0Var.E, a0Var.F, a0Var.G, 0, 1056965589, 2)));
        return Unit.INSTANCE;
    }
}
