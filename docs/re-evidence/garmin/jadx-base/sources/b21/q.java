package b21;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionMealSettingsSubGraphKt$mealSettingsSubGraph$1$3$1$2$1", f = "NutritionMealSettingsSubGraph.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.t f15155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u21.f f15156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.g> f15158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i14, u21.t tVar, u21.f fVar, lc.m0 m0Var, p3.x3<u21.g> x3Var, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f15154a = i14;
        this.f15155b = tVar;
        this.f15156c = fVar;
        this.f15157d = m0Var;
        this.f15158e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f15154a, this.f15155b, this.f15156c, this.f15157d, this.f15158e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
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
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<u21.g> x3Var = this.f15158e;
        if (x3Var.getF182175a().f167970j) {
            String str = x3Var.getF182175a().f167962b;
            boolean z14 = x3Var.getF182175a().f167963c;
            u21.i1 i1Var = x3Var.getF182175a().f167969i;
            b63.v vVar = i1Var != null ? i1Var.f168006a : null;
            u21.i1 i1Var2 = x3Var.getF182175a().f167969i;
            s21.d dVar = new s21.d(this.f15154a, str, z14, vVar, i1Var2 != null ? i1Var2.f168009d : null);
            u21.t tVar = this.f15155b;
            r53.p2 p2Var = tVar.f168140j;
            ?? r14 = tVar.f168142l;
            ArrayList arrayList = new ArrayList(p13.y.r(r14, 10));
            for (q01.e eVarA : r14) {
                if (eVarA.f141993a == dVar.f156088a) {
                    String string = d53.w.i0(dVar.f156089b).toString();
                    b63.v vVar2 = dVar.f156091d;
                    if (vVar2 == null) {
                        vVar2 = eVarA.f141999g;
                    }
                    b63.v vVar3 = vVar2;
                    b63.v vVar4 = dVar.f156092e;
                    if (vVar4 == null) {
                        vVar4 = eVarA.f142000h;
                    }
                    eVarA = q01.e.a(eVarA, string, false, dVar.f156090c, vVar3, vVar4, null, 0, 3867);
                }
                arrayList.add(eVarA);
            }
            tVar.f168142l = arrayList;
            s21.c cVar = ((u21.s) p2Var.getValue()).f168114c;
            ArrayList arrayListS4 = tVar.S4(tVar.f168142l, cVar, false);
            o13.p pVarD4 = u21.t.D4(tVar, arrayListS4);
            s21.e0 e0Var = (s21.e0) pVarD4.f128594a;
            s21.e0 e0Var2 = (s21.e0) pVarD4.f128595b;
            List<s21.k> listU4 = tVar.U4(tVar.f168142l, cVar, arrayListS4, e0Var, e0Var2);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u21.s.a((u21.s) value, false, null, false, listU4, e0Var, e0Var2, null, u21.t.K4(tVar, null, listU4, e0Var, e0Var2, 1), false, false, false, false, null, 64063)));
            List<s21.j> list = this.f15156c.f167951b;
            if (list != null) {
                tVar.Q4(list);
            }
            k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(c.g.class);
            boolean z15 = lc.y.f111902i;
            this.f15157d.o(dVarB, true);
        }
        return Unit.INSTANCE;
    }
}
