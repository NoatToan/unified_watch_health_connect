package f62;

import android.content.Context;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import java.util.List;
import l72.p2;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69309a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f69310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f69311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f69312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f69313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f69314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f69315g;

    public /* synthetic */ q0(long j8, us1.c cVar, boolean z14, e23.a aVar, e23.p pVar, e23.l lVar, int i14) {
        this.f69310b = j8;
        this.f69312d = cVar;
        this.f69311c = z14;
        this.f69313e = aVar;
        this.f69314f = pVar;
        this.f69315g = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f69309a;
        Object obj3 = this.f69315g;
        Object obj4 = this.f69314f;
        Object obj5 = this.f69313e;
        Object obj6 = this.f69312d;
        switch (i14) {
            case 0:
                final x3 x3Var = (x3) obj6;
                final Context context = (Context) obj5;
                final WorkoutPreCreateActivity workoutPreCreateActivity = (WorkoutPreCreateActivity) obj4;
                final List list = (List) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                WorkoutPreCreateActivity.a aVar = WorkoutPreCreateActivity.f48888d;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.l0.j(t13.h.f161748a, mVar);
                        mVar.K(objQ);
                    }
                    final o53.b0 b0Var = (o53.b0) objQ;
                    boolean zB = mVar.B(x3Var) | mVar.r(context) | mVar.r(workoutPreCreateActivity) | mVar.r(list);
                    final boolean z14 = this.f69311c;
                    boolean zH = zB | mVar.h(z14) | mVar.r(b0Var);
                    final long j8 = this.f69310b;
                    boolean zL = zH | mVar.l(j8);
                    Object objQ2 = mVar.q();
                    if (zL || objQ2 == c2565a) {
                        e23.l lVar = new e23.l() { // from class: f62.r0
                            @Override // e23.l
                            public final Object invoke(Object obj7) {
                                e2.f0 f0Var = (e2.f0) obj7;
                                WorkoutPreCreateActivity.a aVar2 = WorkoutPreCreateActivity.f48888d;
                                f0Var.getClass();
                                f.f69234a.getClass();
                                e2.f0.b(f0Var, null, f.f69235b, 3);
                                x3 x3Var2 = x3Var;
                                Context context2 = context;
                                final WorkoutPreCreateActivity workoutPreCreateActivity2 = workoutPreCreateActivity;
                                e2.f0.b(f0Var, null, new z3.e(649839909, true, new a42.a(x3Var2, 26, context2, workoutPreCreateActivity2)), 3);
                                e2.f0.b(f0Var, null, f.f69236c, 3);
                                final List list2 = list;
                                int size = list2.size();
                                final boolean z15 = z14;
                                final o53.b0 b0Var2 = b0Var;
                                final long j14 = j8;
                                e2.f0.f(f0Var, size, null, new z3.e(1766225719, true, new e23.r() { // from class: f62.s0
                                    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
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
                                    @Override // e23.r
                                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                        int iIntValue2 = ((Integer) obj9).intValue();
                                        p3.m mVar2 = (p3.m) obj10;
                                        int iIntValue3 = ((Integer) obj11).intValue();
                                        WorkoutPreCreateActivity.a aVar3 = WorkoutPreCreateActivity.f48888d;
                                        ((e2.d) obj8).getClass();
                                        if ((iIntValue3 & 48) == 0) {
                                            iIntValue3 |= mVar2.k(iIntValue2) ? 32 : 16;
                                        }
                                        if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                            x1 x1Var2 = p3.n.f135158a;
                                            m52.k kVar = (m52.k) list2.get(iIntValue2);
                                            p2 p2Var = p2.f111205a;
                                            boolean z16 = z15;
                                            String strQ = gl1.y.Q(mVar2, kVar.d(z16));
                                            z3.e eVarC = z3.f.c(-34307485, new ap2.f(kVar, z16, 7), mVar2);
                                            WorkoutPreCreateActivity workoutPreCreateActivity3 = workoutPreCreateActivity2;
                                            boolean zR = mVar2.r(workoutPreCreateActivity3);
                                            o53.b0 b0Var3 = b0Var2;
                                            boolean zR2 = zR | mVar2.r(b0Var3) | mVar2.k(kVar.ordinal());
                                            long j15 = j14;
                                            boolean zL2 = zR2 | mVar2.l(j15);
                                            Object objQ3 = mVar2.q();
                                            if (zL2) {
                                                d62.r rVar = new d62.r(workoutPreCreateActivity3, b0Var3, kVar, j15);
                                                mVar2.K(rVar);
                                                objQ3 = rVar;
                                            } else {
                                                p3.m.f135153a.getClass();
                                                if (objQ3 == p3.m.a.f135155b) {
                                                    d62.r rVar2 = new d62.r(workoutPreCreateActivity3, b0Var3, kVar, j15);
                                                    mVar2.K(rVar2);
                                                    objQ3 = rVar2;
                                                }
                                            }
                                            p2Var.g(strQ, null, null, eVarC, null, false, false, (e23.a) objQ3, mVar2, 3072, 246);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 6);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar);
                        objQ2 = lVar;
                    }
                    e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ2, mVar, 0, 511);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jt1.f.a(this.f69310b, (us1.c) obj6, this.f69311c, (e23.a) obj5, (e23.p) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q0(p1 p1Var, Context context, WorkoutPreCreateActivity workoutPreCreateActivity, List list, boolean z14, long j8) {
        this.f69312d = p1Var;
        this.f69313e = context;
        this.f69314f = workoutPreCreateActivity;
        this.f69315g = list;
        this.f69311c = z14;
        this.f69310b = j8;
    }
}
