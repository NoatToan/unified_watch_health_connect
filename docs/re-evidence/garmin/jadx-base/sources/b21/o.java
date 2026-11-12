package b21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionMealSettingsSubGraphKt$mealSettingsSubGraph$1$1$1$1", f = "NutritionMealSettingsSubGraph.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.t f15083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u21.n f15085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.m> f15086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u21.t tVar, lc.m0 m0Var, u21.n nVar, p3.x3<u21.m> x3Var, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f15083a = tVar;
        this.f15084b = m0Var;
        this.f15085c = nVar;
        this.f15086d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f15083a, this.f15084b, this.f15085c, this.f15086d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object next;
        k01.d dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<u21.m> x3Var = this.f15086d;
        if (x3Var.getF182175a().f168040c) {
            List<s21.i> list = x3Var.getF182175a().f168038a;
            u21.t tVar = this.f15083a;
            boolean z14 = tVar.f168139i;
            list.getClass();
            r53.p2 p2Var = tVar.f168140j;
            s21.c cVar = ((u21.s) p2Var.getValue()).f168114c;
            ?? r14 = tVar.f168142l;
            ArrayList arrayList = new ArrayList(p13.y.r(r14, 10));
            Iterator it = r14.iterator();
            while (true) {
                k01.d dVar2 = null;
                if (!it.hasNext()) {
                    break;
                }
                q01.e eVarA = (q01.e) it.next();
                Iterator<T> it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((s21.i) next).f156125a != eVarA.f141993a);
                s21.i iVar = (s21.i) next;
                if (iVar != null) {
                    boolean z15 = iVar.f156128d;
                    if (!z14) {
                        dVar = dVar2;
                    } else if (z15) {
                        dVar2 = eVarA.f142002j;
                        dVar = dVar2;
                    } else {
                        Double dValueOf = Double.valueOf(0.0d);
                        dVar = new k01.d((Integer) 0, (Integer) null, dValueOf, dValueOf, dValueOf, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, 16777186, (p005kotlin.jvm.internal.j) null);
                    }
                    eVarA = q01.e.a(eVarA, null, z15, false, null, null, dVar, 0, 3567);
                }
                arrayList.add(eVarA);
            }
            if (!arrayList.equals(tVar.f168142l)) {
                if (cVar == s21.c.TIMELINE) {
                    arrayList = u21.t.F4(arrayList);
                }
                tVar.f168142l = arrayList;
                if (z14) {
                    tVar.E4();
                }
                ArrayList arrayListS4 = tVar.S4(tVar.f168142l, cVar, false);
                o13.p pVarD4 = u21.t.D4(tVar, arrayListS4);
                s21.e0 e0Var = (s21.e0) pVarD4.f128594a;
                s21.e0 e0Var2 = (s21.e0) pVarD4.f128595b;
                List<s21.k> listU4 = tVar.U4(tVar.f168142l, cVar, arrayListS4, e0Var, e0Var2);
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, u21.s.a((u21.s) value2, false, null, false, listU4, e0Var, e0Var2, null, u21.t.J4(cVar, listU4, e0Var, e0Var2), false, false, false, tVar.f168139i, null, 39487)));
            }
            k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(c.g.class);
            boolean z16 = lc.y.f111902i;
            this.f15084b.o(dVarB, true);
            r53.p2 p2Var2 = this.f15085c.f168044b;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, u21.m.a((u21.m) value, null, false, false, 3)));
        }
        return Unit.INSTANCE;
    }
}
