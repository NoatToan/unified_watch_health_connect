package pf0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h82.r f137539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.ecg.presentation.stats.b f137540c;

    public /* synthetic */ w(h82.r rVar, com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar, int i14) {
        this.f137538a = i14;
        this.f137539b = rVar;
        this.f137540c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
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
        int i14 = this.f137538a;
        p3.m.a aVar = p3.m.f135153a;
        final com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar = this.f137540c;
        Object[] objArr = 0;
        final int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar2 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h82.r rVar = this.f137539b;
                    rVar.D(R.string.lbl_how_the_ecg_app_works, mVar, 0);
                    rVar.l(R.string.msg_how_the_ecg_app_works, 0, 2, null, mVar);
                    rVar.D(R.string.lbl_results_you_might_see, mVar, 0);
                    rVar.a(z3.f.c(614222651, new w(rVar, bVar, i16), mVar), mVar, 6);
                    rVar.c(mVar, 0);
                    rVar.D(R.string.lbl_important_things_to_know, mVar, 0);
                    rVar.a(z3.f.c(1909853234, new w(rVar, bVar, i15), mVar), mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar3 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: pf0.t
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = objArr2;
                                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar4 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("SINUS_ACTION");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ATRIAL_ACTION");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("HEART_RATE_ACTION");
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("INCONCLUSIVE_ACTION");
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ECG_CAPABILITIES_ACTION");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("USING_THE_APP_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: pf0.t
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = objArr3;
                                    com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                    switch (i17) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar4 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("SINUS_ACTION");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ATRIAL_ACTION");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("HEART_RATE_ACTION");
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("INCONCLUSIVE_ACTION");
                                            break;
                                        case 4:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ECG_CAPABILITIES_ACTION");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("USING_THE_APP_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a<Unit> aVar4 = (e23.a) objQ;
                    h82.r rVar2 = this.f137539b;
                    rVar2.B(R.string.lbl_sinus_rhythm, null, false, aVar4, mVar2, 0, 6);
                    boolean zR2 = mVar2.r(bVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: pf0.t
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("SINUS_ACTION");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ATRIAL_ACTION");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("HEART_RATE_ACTION");
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("INCONCLUSIVE_ACTION");
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ECG_CAPABILITIES_ACTION");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("USING_THE_APP_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: pf0.t
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i16;
                                    com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                    switch (i17) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("SINUS_ACTION");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ATRIAL_ACTION");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("HEART_RATE_ACTION");
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("INCONCLUSIVE_ACTION");
                                            break;
                                        case 4:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ECG_CAPABILITIES_ACTION");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("USING_THE_APP_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    rVar2.B(R.string.lbl_atrial_fibrillation_with_abrev, null, false, (e23.a) objQ2, mVar2, 0, 6);
                    boolean zR3 = mVar2.r(bVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: pf0.t
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i15;
                                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("SINUS_ACTION");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ATRIAL_ACTION");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("HEART_RATE_ACTION");
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("INCONCLUSIVE_ACTION");
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ECG_CAPABILITIES_ACTION");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("USING_THE_APP_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: pf0.t
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i15;
                                    com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                    switch (i17) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("SINUS_ACTION");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ATRIAL_ACTION");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("HEART_RATE_ACTION");
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("INCONCLUSIVE_ACTION");
                                            break;
                                        case 4:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ECG_CAPABILITIES_ACTION");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("USING_THE_APP_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    rVar2.B(R.string.lbl_heart_rate_too_high_or_too_low, null, false, (e23.a) objQ3, mVar2, 0, 6);
                    boolean zR4 = mVar2.r(bVar);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        final int i17 = 3;
                        objQ4 = new e23.a() { // from class: pf0.t
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                switch (i18) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("SINUS_ACTION");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ATRIAL_ACTION");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("HEART_RATE_ACTION");
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("INCONCLUSIVE_ACTION");
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ECG_CAPABILITIES_ACTION");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("USING_THE_APP_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i18 = 3;
                            objQ4 = new e23.a() { // from class: pf0.t
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i18;
                                    com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                    switch (i19) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("SINUS_ACTION");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ATRIAL_ACTION");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("HEART_RATE_ACTION");
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("INCONCLUSIVE_ACTION");
                                            break;
                                        case 4:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ECG_CAPABILITIES_ACTION");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("USING_THE_APP_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    rVar2.B(R.string.lbl_inconclusive, null, false, (e23.a) objQ4, mVar2, 0, 6);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR5 = mVar3.r(bVar);
                    Object objQ5 = mVar3.q();
                    if (zR5) {
                        final int i19 = 4;
                        objQ5 = new e23.a() { // from class: pf0.t
                            @Override // e23.a
                            public final Object invoke() {
                                int i110 = i19;
                                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                switch (i110) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("SINUS_ACTION");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ATRIAL_ACTION");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("HEART_RATE_ACTION");
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("INCONCLUSIVE_ACTION");
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ECG_CAPABILITIES_ACTION");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar11 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("USING_THE_APP_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            final int i110 = 4;
                            objQ5 = new e23.a() { // from class: pf0.t
                                @Override // e23.a
                                public final Object invoke() {
                                    int i111 = i110;
                                    com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                    switch (i111) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("SINUS_ACTION");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ATRIAL_ACTION");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("HEART_RATE_ACTION");
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("INCONCLUSIVE_ACTION");
                                            break;
                                        case 4:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ECG_CAPABILITIES_ACTION");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar11 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("USING_THE_APP_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ5);
                        }
                    }
                    h82.r rVar3 = this.f137539b;
                    rVar3.B(R.string.lbl_ecg_capabilities, null, false, (e23.a) objQ5, mVar3, 0, 6);
                    boolean zR6 = mVar3.r(bVar);
                    Object objQ6 = mVar3.q();
                    if (zR6) {
                        final int i24 = 5;
                        objQ6 = new e23.a() { // from class: pf0.t
                            @Override // e23.a
                            public final Object invoke() {
                                int i111 = i24;
                                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                switch (i111) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("SINUS_ACTION");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ATRIAL_ACTION");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("HEART_RATE_ACTION");
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("INCONCLUSIVE_ACTION");
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("ECG_CAPABILITIES_ACTION");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar11 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                        bVar2.e("USING_THE_APP_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            final int i25 = 5;
                            objQ6 = new e23.a() { // from class: pf0.t
                                @Override // e23.a
                                public final Object invoke() {
                                    int i111 = i25;
                                    com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar2 = bVar;
                                    switch (i111) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("SINUS_ACTION");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ATRIAL_ACTION");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("HEART_RATE_ACTION");
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("INCONCLUSIVE_ACTION");
                                            break;
                                        case 4:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("ECG_CAPABILITIES_ACTION");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar11 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                                            bVar2.e("USING_THE_APP_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ6);
                        }
                    }
                    rVar3.B(R.string.lbl_using_the_ecg_app, null, false, (e23.a) objQ6, mVar3, 0, 6);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
