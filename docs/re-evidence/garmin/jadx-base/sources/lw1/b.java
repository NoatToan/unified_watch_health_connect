package lw1;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanActivity;
import e23.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FindTrainingPlanActivity f115088b;

    public /* synthetic */ b(FindTrainingPlanActivity findTrainingPlanActivity, int i14) {
        this.f115087a = i14;
        this.f115088b = findTrainingPlanActivity;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f115087a;
        boolean z14 = false;
        int i15 = 2;
        final FindTrainingPlanActivity findTrainingPlanActivity = this.f115088b;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                FindTrainingPlanActivity.a aVar = FindTrainingPlanActivity.f45585g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-2068439039, new b(findTrainingPlanActivity, i16), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                FindTrainingPlanActivity.a aVar2 = FindTrainingPlanActivity.f45585g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(findTrainingPlanActivity.getOnBackPressedDispatcher()), z3.f.c(-669956927, new b(findTrainingPlanActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                FindTrainingPlanActivity.a aVar3 = FindTrainingPlanActivity.f45585g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    f fVar = (f) findTrainingPlanActivity.f45586e.getValue();
                    ub1.g gVar = (ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null);
                    boolean zR = mVar3.r(findTrainingPlanActivity);
                    Object objQ = mVar3.q();
                    m.a aVar4 = m.f135153a;
                    if (zR) {
                        final int i17 = z14 ? 1 : 0;
                        objQ = new e23.a() { // from class: lw1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                FindTrainingPlanActivity findTrainingPlanActivity2 = findTrainingPlanActivity;
                                switch (i18) {
                                    case 0:
                                        FindTrainingPlanActivity.a aVar5 = FindTrainingPlanActivity.f45585g;
                                        findTrainingPlanActivity2.onBackPressed();
                                        break;
                                    default:
                                        FindTrainingPlanActivity.a aVar6 = FindTrainingPlanActivity.f45585g;
                                        findTrainingPlanActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == m.a.f135155b) {
                            final int i18 = z14 ? 1 : 0;
                            objQ = new e23.a() { // from class: lw1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i18;
                                    FindTrainingPlanActivity findTrainingPlanActivity2 = findTrainingPlanActivity;
                                    switch (i19) {
                                        case 0:
                                            FindTrainingPlanActivity.a aVar5 = FindTrainingPlanActivity.f45585g;
                                            findTrainingPlanActivity2.onBackPressed();
                                            break;
                                        default:
                                            FindTrainingPlanActivity.a aVar6 = FindTrainingPlanActivity.f45585g;
                                            findTrainingPlanActivity2.finish();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ;
                    boolean zR2 = mVar3.r(findTrainingPlanActivity);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new b(findTrainingPlanActivity, 3);
                        mVar3.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new b(findTrainingPlanActivity, 3);
                            mVar3.K(objQ2);
                        }
                    }
                    p pVar = (p) objQ2;
                    boolean zR3 = mVar3.r(findTrainingPlanActivity);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: lw1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i16;
                                FindTrainingPlanActivity findTrainingPlanActivity2 = findTrainingPlanActivity;
                                switch (i19) {
                                    case 0:
                                        FindTrainingPlanActivity.a aVar6 = FindTrainingPlanActivity.f45585g;
                                        findTrainingPlanActivity2.onBackPressed();
                                        break;
                                    default:
                                        FindTrainingPlanActivity.a aVar7 = FindTrainingPlanActivity.f45585g;
                                        findTrainingPlanActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: lw1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i16;
                                    FindTrainingPlanActivity findTrainingPlanActivity2 = findTrainingPlanActivity;
                                    switch (i19) {
                                        case 0:
                                            FindTrainingPlanActivity.a aVar6 = FindTrainingPlanActivity.f45585g;
                                            findTrainingPlanActivity2.onBackPressed();
                                            break;
                                        default:
                                            FindTrainingPlanActivity.a aVar7 = FindTrainingPlanActivity.f45585g;
                                            findTrainingPlanActivity2.finish();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ3);
                        }
                    }
                    nw1.c.a(fVar, gVar, aVar5, pVar, (e23.a) objQ3, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            default:
                FindTrainingPlanActivity.a aVar6 = FindTrainingPlanActivity.f45585g;
                findTrainingPlanActivity.setResult(((Integer) obj).intValue(), (Intent) obj2);
                break;
        }
        return Unit.INSTANCE;
    }
}
