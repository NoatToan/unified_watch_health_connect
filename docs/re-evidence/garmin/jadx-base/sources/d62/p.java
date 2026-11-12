package d62;

import c.w;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import java.util.List;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutActivityProfileSelectionActivity f58054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f58055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f58056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f58057e;

    public /* synthetic */ p(WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity, String str, o13.l lVar, long j8, int i14) {
        this.f58053a = i14;
        this.f58054b = workoutActivityProfileSelectionActivity;
        this.f58055c = str;
        this.f58056d = lVar;
        this.f58057e = j8;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x0152  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, o13.l] */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        final WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity;
        p3.m mVar;
        Object obj5;
        Object obj6;
        Object obj7;
        final int i14 = 1;
        boolean z14 = false;
        boolean z15 = false;
        switch (this.f58053a) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-656589430, new p(this.f58054b, this.f58055c, this.f58056d, this.f58057e, 1), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                WorkoutActivityProfileSelectionActivity.b bVar2 = WorkoutActivityProfileSelectionActivity.f48559a;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    final ?? r14 = this.f58056d;
                    final p1 p1VarC = s9.c.c(((t) r14.getValue()).f58073d, mVar3);
                    int i15 = WorkoutActivityProfileSelectionActivity.d.f48564a[((b) p1VarC.getF182175a()).f57998a.ordinal()];
                    final WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity2 = this.f58054b;
                    long j8 = this.f58057e;
                    p3.m.a aVar = p3.m.f135153a;
                    if (i15 == 1) {
                        mVar3.C(-1174430081);
                        List<i> list = ((b) p1VarC.getF182175a()).f58001d;
                        i iVar = ((b) p1VarC.getF182175a()).f57999b;
                        boolean zR = mVar3.r(r14) | mVar3.B(p1VarC);
                        Object objQ = mVar3.q();
                        if (zR) {
                            obj3 = objQ;
                            final boolean z16 = z14 ? 1 : 0;
                            e23.l lVar = new e23.l() { // from class: d62.q
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
                                @Override // e23.l
                                public final Object invoke(Object obj8) {
                                    Object value;
                                    int i16 = z16;
                                    p1 p1Var = p1VarC;
                                    ?? r15 = r14;
                                    switch (i16) {
                                        case 0:
                                            i iVar2 = (i) obj8;
                                            WorkoutActivityProfileSelectionActivity.b bVar3 = WorkoutActivityProfileSelectionActivity.f48559a;
                                            iVar2.getClass();
                                            t tVar = (t) r15.getValue();
                                            i iVar3 = !iVar2.equals(((b) p1Var.getF182175a()).f57999b) ? iVar2 : null;
                                            p2 p2Var = tVar.f58072c;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, b.a((b) value, null, iVar3, null, null, 13)));
                                            break;
                                        default:
                                            j jVar = (j) obj8;
                                            WorkoutActivityProfileSelectionActivity.b bVar4 = WorkoutActivityProfileSelectionActivity.f48559a;
                                            jVar.getClass();
                                            ((t) r15.getValue()).y4(((b) p1Var.getF182175a()).f58000c != jVar ? jVar : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(lVar);
                            obj3 = lVar;
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj3 = objQ;
                                final int z17 = z14 ? 1 : 0;
                                e23.l lVar2 = new e23.l() { // from class: d62.q
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
                                    @Override // e23.l
                                    public final Object invoke(Object obj8) {
                                        Object value;
                                        int i16 = z17;
                                        p1 p1Var = p1VarC;
                                        ?? r15 = r14;
                                        switch (i16) {
                                            case 0:
                                                i iVar2 = (i) obj8;
                                                WorkoutActivityProfileSelectionActivity.b bVar3 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                iVar2.getClass();
                                                t tVar = (t) r15.getValue();
                                                i iVar3 = !iVar2.equals(((b) p1Var.getF182175a()).f57999b) ? iVar2 : null;
                                                p2 p2Var = tVar.f58072c;
                                                do {
                                                    value = p2Var.getValue();
                                                } while (!p2Var.b(value, b.a((b) value, null, iVar3, null, null, 13)));
                                                break;
                                            default:
                                                j jVar = (j) obj8;
                                                WorkoutActivityProfileSelectionActivity.b bVar4 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                jVar.getClass();
                                                ((t) r15.getValue()).y4(((b) p1Var.getF182175a()).f58000c != jVar ? jVar : null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(lVar2);
                                obj3 = lVar2;
                            }
                        }
                        obj3 = objQ;
                        e23.l<? super i, Unit> lVar3 = (e23.l) obj3;
                        boolean zB = mVar3.B(p1VarC) | mVar3.r(workoutActivityProfileSelectionActivity2) | mVar3.l(j8) | mVar3.r(r14);
                        Object objQ2 = mVar3.q();
                        if (zB) {
                            r rVar = new r(workoutActivityProfileSelectionActivity2, j8, p1VarC, r14, 0);
                            mVar3.K(rVar);
                            objQ2 = rVar;
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                r rVar2 = new r(workoutActivityProfileSelectionActivity2, j8, p1VarC, r14, 0);
                                mVar3.K(rVar2);
                                objQ2 = rVar2;
                            }
                        }
                        e23.a<Unit> aVar2 = (e23.a) objQ2;
                        boolean zR2 = mVar3.r(workoutActivityProfileSelectionActivity2);
                        Object objQ3 = mVar3.q();
                        if (zR2) {
                            obj4 = objQ3;
                            cq0.g gVar = new cq0.g(workoutActivityProfileSelectionActivity2, 14);
                            mVar3.K(gVar);
                            obj4 = gVar;
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                obj4 = objQ3;
                                cq0.g gVar2 = new cq0.g(workoutActivityProfileSelectionActivity2, 14);
                                mVar3.K(gVar2);
                                obj4 = gVar2;
                            }
                        }
                        obj4 = objQ3;
                        workoutActivityProfileSelectionActivity2.fa(list, iVar, this.f58055c, lVar3, aVar2, (e23.a) obj4, mVar3, com.garmin.android.apps.connectmobile.d.$stable << 18);
                        workoutActivityProfileSelectionActivity = workoutActivityProfileSelectionActivity2;
                        p3.m mVar4 = mVar3;
                        mVar4.f();
                        mVar = mVar4;
                    } else {
                        if (i15 != 2) {
                            throw n23.j.m(mVar3, 377756321);
                        }
                        mVar3.C(-1172964742);
                        i iVar2 = ((b) p1VarC.getF182175a()).f57999b;
                        if (iVar2 == null) {
                            mVar3.C(-1172964743);
                            mVar3.f();
                        } else {
                            mVar3.C(-1172964742);
                            j jVar = ((b) p1VarC.getF182175a()).f58000c;
                            boolean zR3 = mVar3.r(r14) | mVar3.B(p1VarC);
                            Object objQ4 = mVar3.q();
                            if (zR3) {
                                obj6 = objQ4;
                                e23.l lVar4 = new e23.l() { // from class: d62.q
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
                                    @Override // e23.l
                                    public final Object invoke(Object obj8) {
                                        Object value;
                                        int i16 = i14;
                                        p1 p1Var = p1VarC;
                                        ?? r15 = r14;
                                        switch (i16) {
                                            case 0:
                                                i iVar3 = (i) obj8;
                                                WorkoutActivityProfileSelectionActivity.b bVar3 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                iVar3.getClass();
                                                t tVar = (t) r15.getValue();
                                                i iVar4 = !iVar3.equals(((b) p1Var.getF182175a()).f57999b) ? iVar3 : null;
                                                p2 p2Var = tVar.f58072c;
                                                do {
                                                    value = p2Var.getValue();
                                                } while (!p2Var.b(value, b.a((b) value, null, iVar4, null, null, 13)));
                                                break;
                                            default:
                                                j jVar2 = (j) obj8;
                                                WorkoutActivityProfileSelectionActivity.b bVar4 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                jVar2.getClass();
                                                ((t) r15.getValue()).y4(((b) p1Var.getF182175a()).f58000c != jVar2 ? jVar2 : null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(lVar4);
                                obj6 = lVar4;
                            } else {
                                aVar.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    obj6 = objQ4;
                                    e23.l lVar5 = new e23.l() { // from class: d62.q
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
                                        @Override // e23.l
                                        public final Object invoke(Object obj8) {
                                            Object value;
                                            int i16 = i14;
                                            p1 p1Var = p1VarC;
                                            ?? r15 = r14;
                                            switch (i16) {
                                                case 0:
                                                    i iVar3 = (i) obj8;
                                                    WorkoutActivityProfileSelectionActivity.b bVar3 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                    iVar3.getClass();
                                                    t tVar = (t) r15.getValue();
                                                    i iVar4 = !iVar3.equals(((b) p1Var.getF182175a()).f57999b) ? iVar3 : null;
                                                    p2 p2Var = tVar.f58072c;
                                                    do {
                                                        value = p2Var.getValue();
                                                    } while (!p2Var.b(value, b.a((b) value, null, iVar4, null, null, 13)));
                                                    break;
                                                default:
                                                    j jVar2 = (j) obj8;
                                                    WorkoutActivityProfileSelectionActivity.b bVar4 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                    jVar2.getClass();
                                                    ((t) r15.getValue()).y4(((b) p1Var.getF182175a()).f58000c != jVar2 ? jVar2 : null);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar3.K(lVar5);
                                    obj6 = lVar5;
                                }
                            }
                            obj6 = objQ4;
                            e23.l<? super j, Unit> lVar6 = (e23.l) obj6;
                            boolean zR4 = mVar3.r(r14) | mVar3.r(workoutActivityProfileSelectionActivity2);
                            Object objQ5 = mVar3.q();
                            if (zR4) {
                                obj7 = objQ5;
                                e23.a aVar3 = new e23.a() { // from class: d62.l
                                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i16 = i14;
                                        ?? r15 = r14;
                                        WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity3 = workoutActivityProfileSelectionActivity2;
                                        switch (i16) {
                                            case 0:
                                                WorkoutActivityProfileSelectionActivity.b bVar3 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                if (((t) r15.getValue()).x4()) {
                                                    ((t) r15.getValue()).y4(null);
                                                } else {
                                                    workoutActivityProfileSelectionActivity3.setResult(0);
                                                    workoutActivityProfileSelectionActivity3.finish();
                                                }
                                                break;
                                            default:
                                                WorkoutActivityProfileSelectionActivity.b bVar4 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                if (((t) r15.getValue()).x4()) {
                                                    ((t) r15.getValue()).y4(null);
                                                } else {
                                                    workoutActivityProfileSelectionActivity3.setResult(0);
                                                    workoutActivityProfileSelectionActivity3.finish();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(aVar3);
                                obj7 = aVar3;
                            } else {
                                aVar.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    obj7 = objQ5;
                                    e23.a aVar4 = new e23.a() { // from class: d62.l
                                        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i16 = i14;
                                            ?? r15 = r14;
                                            WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity3 = workoutActivityProfileSelectionActivity2;
                                            switch (i16) {
                                                case 0:
                                                    WorkoutActivityProfileSelectionActivity.b bVar3 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                    if (((t) r15.getValue()).x4()) {
                                                        ((t) r15.getValue()).y4(null);
                                                    } else {
                                                        workoutActivityProfileSelectionActivity3.setResult(0);
                                                        workoutActivityProfileSelectionActivity3.finish();
                                                    }
                                                    break;
                                                default:
                                                    WorkoutActivityProfileSelectionActivity.b bVar4 = WorkoutActivityProfileSelectionActivity.f48559a;
                                                    if (((t) r15.getValue()).x4()) {
                                                        ((t) r15.getValue()).y4(null);
                                                    } else {
                                                        workoutActivityProfileSelectionActivity3.setResult(0);
                                                        workoutActivityProfileSelectionActivity3.finish();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar3.K(aVar4);
                                    obj7 = aVar4;
                                }
                            }
                            obj7 = objQ5;
                            e23.a<Unit> aVar5 = (e23.a) obj7;
                            boolean zR5 = mVar3.r(workoutActivityProfileSelectionActivity2) | mVar3.B(p1VarC) | mVar3.l(j8);
                            Object objQ6 = mVar3.q();
                            if (zR5) {
                                s sVar = new s(workoutActivityProfileSelectionActivity2, j8, p1VarC, 0);
                                mVar3.K(sVar);
                                objQ6 = sVar;
                            } else {
                                aVar.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    s sVar2 = new s(workoutActivityProfileSelectionActivity2, j8, p1VarC, 0);
                                    mVar3.K(sVar2);
                                    objQ6 = sVar2;
                                }
                            }
                            workoutActivityProfileSelectionActivity2.ea(iVar2, jVar, lVar6, aVar5, (e23.a) objQ6, mVar3, com.garmin.android.apps.connectmobile.d.$stable << 15);
                            mVar3.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar3.f();
                        mVar = mVar3;
                        workoutActivityProfileSelectionActivity = workoutActivityProfileSelectionActivity2;
                    }
                    boolean zR6 = mVar.r(r14) | mVar.r(workoutActivityProfileSelectionActivity);
                    Object objQ7 = mVar.q();
                    if (zR6) {
                        obj5 = objQ7;
                        final boolean z18 = z15 ? 1 : 0;
                        e23.a aVar6 = new e23.a() { // from class: d62.l
                            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = z18;
                                ?? r15 = r14;
                                WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity3 = workoutActivityProfileSelectionActivity;
                                switch (i16) {
                                    case 0:
                                        WorkoutActivityProfileSelectionActivity.b bVar3 = WorkoutActivityProfileSelectionActivity.f48559a;
                                        if (((t) r15.getValue()).x4()) {
                                            ((t) r15.getValue()).y4(null);
                                        } else {
                                            workoutActivityProfileSelectionActivity3.setResult(0);
                                            workoutActivityProfileSelectionActivity3.finish();
                                        }
                                        break;
                                    default:
                                        WorkoutActivityProfileSelectionActivity.b bVar4 = WorkoutActivityProfileSelectionActivity.f48559a;
                                        if (((t) r15.getValue()).x4()) {
                                            ((t) r15.getValue()).y4(null);
                                        } else {
                                            workoutActivityProfileSelectionActivity3.setResult(0);
                                            workoutActivityProfileSelectionActivity3.finish();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(aVar6);
                        obj5 = aVar6;
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            obj5 = objQ7;
                            final int z19 = z15 ? 1 : 0;
                            e23.a aVar7 = new e23.a() { // from class: d62.l
                                /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = z19;
                                    ?? r15 = r14;
                                    WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity3 = workoutActivityProfileSelectionActivity;
                                    switch (i16) {
                                        case 0:
                                            WorkoutActivityProfileSelectionActivity.b bVar3 = WorkoutActivityProfileSelectionActivity.f48559a;
                                            if (((t) r15.getValue()).x4()) {
                                                ((t) r15.getValue()).y4(null);
                                            } else {
                                                workoutActivityProfileSelectionActivity3.setResult(0);
                                                workoutActivityProfileSelectionActivity3.finish();
                                            }
                                            break;
                                        default:
                                            WorkoutActivityProfileSelectionActivity.b bVar4 = WorkoutActivityProfileSelectionActivity.f48559a;
                                            if (((t) r15.getValue()).x4()) {
                                                ((t) r15.getValue()).y4(null);
                                            } else {
                                                workoutActivityProfileSelectionActivity3.setResult(0);
                                                workoutActivityProfileSelectionActivity3.finish();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(aVar7);
                            obj5 = aVar7;
                        }
                    }
                    obj5 = objQ7;
                    w.a(0, 1, (e23.a) obj5, mVar, false);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
