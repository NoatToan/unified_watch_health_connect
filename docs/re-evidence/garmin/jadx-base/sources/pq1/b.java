package pq1;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.s2;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.details.EditStepsGoalActivity;
import e23.p;
import o53.f0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import r53.p2;
import ro0.l;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StepsActivity f139566b;

    public /* synthetic */ b(StepsActivity stepsActivity, int i14) {
        this.f139565a = i14;
        this.f139566b = stepsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        int i14 = this.f139565a;
        final StepsActivity stepsActivity = this.f139566b;
        Object[] objArr = 0;
        final int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                StepsActivity.a aVar = StepsActivity.f44915d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    stepsActivity.setRequestedOrientation((((yq1.d) s9.c.c(stepsActivity.da().f198806g, mVar).getF182175a()).f198797g && s2.a(stepsActivity)) ? -1 : 5);
                    yq1.e eVarDa = stepsActivity.da();
                    boolean zE = f0.E((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a));
                    p2 p2Var = eVarDa.f198806g;
                    if (zE != ((yq1.d) p2Var.getValue()).f198795e) {
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, yq1.d.a((yq1.d) value, null, null, null, false, zE, false, false, false, 495)));
                        eVarDa.B4();
                    }
                    z02.b.a(false, null, null, null, true, z3.f.c(-380019897, new b(stepsActivity, i16), mVar), mVar, 221184, 15);
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                StepsActivity.a aVar2 = StepsActivity.f44915d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    yq1.e eVarDa2 = stepsActivity.da();
                    boolean zR = mVar2.r(stepsActivity);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: pq1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = objArr2;
                                StepsActivity stepsActivity2 = stepsActivity;
                                switch (i17) {
                                    case 0:
                                        StepsActivity.a aVar4 = StepsActivity.f44915d;
                                        stepsActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        stepsActivity2.startActivity(stepsActivity2.f44917b.a());
                                        break;
                                    case 2:
                                        f.c<Intent> cVar = stepsActivity2.f44918c;
                                        EditStepsGoalActivity.f44923l.getClass();
                                        cVar.a(new Intent(stepsActivity2, (Class<?>) EditStepsGoalActivity.class), null);
                                        break;
                                    default:
                                        StepsActivity.a aVar5 = StepsActivity.f44915d;
                                        HelpActivity.a.e(HelpActivity.f36653a, stepsActivity, l.STEPS, null, null, 12);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: pq1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = objArr3;
                                    StepsActivity stepsActivity2 = stepsActivity;
                                    switch (i17) {
                                        case 0:
                                            StepsActivity.a aVar4 = StepsActivity.f44915d;
                                            stepsActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            stepsActivity2.startActivity(stepsActivity2.f44917b.a());
                                            break;
                                        case 2:
                                            f.c<Intent> cVar = stepsActivity2.f44918c;
                                            EditStepsGoalActivity.f44923l.getClass();
                                            cVar.a(new Intent(stepsActivity2, (Class<?>) EditStepsGoalActivity.class), null);
                                            break;
                                        default:
                                            StepsActivity.a aVar5 = StepsActivity.f44915d;
                                            HelpActivity.a.e(HelpActivity.f36653a, stepsActivity, l.STEPS, null, null, 12);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(stepsActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: pq1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                StepsActivity stepsActivity2 = stepsActivity;
                                switch (i17) {
                                    case 0:
                                        StepsActivity.a aVar5 = StepsActivity.f44915d;
                                        stepsActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        stepsActivity2.startActivity(stepsActivity2.f44917b.a());
                                        break;
                                    case 2:
                                        f.c<Intent> cVar = stepsActivity2.f44918c;
                                        EditStepsGoalActivity.f44923l.getClass();
                                        cVar.a(new Intent(stepsActivity2, (Class<?>) EditStepsGoalActivity.class), null);
                                        break;
                                    default:
                                        StepsActivity.a aVar6 = StepsActivity.f44915d;
                                        HelpActivity.a.e(HelpActivity.f36653a, stepsActivity, l.STEPS, null, null, 12);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: pq1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i16;
                                    StepsActivity stepsActivity2 = stepsActivity;
                                    switch (i17) {
                                        case 0:
                                            StepsActivity.a aVar5 = StepsActivity.f44915d;
                                            stepsActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            stepsActivity2.startActivity(stepsActivity2.f44917b.a());
                                            break;
                                        case 2:
                                            f.c<Intent> cVar = stepsActivity2.f44918c;
                                            EditStepsGoalActivity.f44923l.getClass();
                                            cVar.a(new Intent(stepsActivity2, (Class<?>) EditStepsGoalActivity.class), null);
                                            break;
                                        default:
                                            StepsActivity.a aVar6 = StepsActivity.f44915d;
                                            HelpActivity.a.e(HelpActivity.f36653a, stepsActivity, l.STEPS, null, null, 12);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ2;
                    boolean zR3 = mVar2.r(stepsActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: pq1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i15;
                                StepsActivity stepsActivity2 = stepsActivity;
                                switch (i17) {
                                    case 0:
                                        StepsActivity.a aVar6 = StepsActivity.f44915d;
                                        stepsActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        stepsActivity2.startActivity(stepsActivity2.f44917b.a());
                                        break;
                                    case 2:
                                        f.c<Intent> cVar = stepsActivity2.f44918c;
                                        EditStepsGoalActivity.f44923l.getClass();
                                        cVar.a(new Intent(stepsActivity2, (Class<?>) EditStepsGoalActivity.class), null);
                                        break;
                                    default:
                                        StepsActivity.a aVar7 = StepsActivity.f44915d;
                                        HelpActivity.a.e(HelpActivity.f36653a, stepsActivity, l.STEPS, null, null, 12);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: pq1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i15;
                                    StepsActivity stepsActivity2 = stepsActivity;
                                    switch (i17) {
                                        case 0:
                                            StepsActivity.a aVar6 = StepsActivity.f44915d;
                                            stepsActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            stepsActivity2.startActivity(stepsActivity2.f44917b.a());
                                            break;
                                        case 2:
                                            f.c<Intent> cVar = stepsActivity2.f44918c;
                                            EditStepsGoalActivity.f44923l.getClass();
                                            cVar.a(new Intent(stepsActivity2, (Class<?>) EditStepsGoalActivity.class), null);
                                            break;
                                        default:
                                            StepsActivity.a aVar7 = StepsActivity.f44915d;
                                            HelpActivity.a.e(HelpActivity.f36653a, stepsActivity, l.STEPS, null, null, 12);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ3;
                    boolean zR4 = mVar2.r(stepsActivity);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        final int i17 = 3;
                        objQ4 = new e23.a() { // from class: pq1.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                StepsActivity stepsActivity2 = stepsActivity;
                                switch (i18) {
                                    case 0:
                                        StepsActivity.a aVar7 = StepsActivity.f44915d;
                                        stepsActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        stepsActivity2.startActivity(stepsActivity2.f44917b.a());
                                        break;
                                    case 2:
                                        f.c<Intent> cVar = stepsActivity2.f44918c;
                                        EditStepsGoalActivity.f44923l.getClass();
                                        cVar.a(new Intent(stepsActivity2, (Class<?>) EditStepsGoalActivity.class), null);
                                        break;
                                    default:
                                        StepsActivity.a aVar8 = StepsActivity.f44915d;
                                        HelpActivity.a.e(HelpActivity.f36653a, stepsActivity, l.STEPS, null, null, 12);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == m.a.f135155b) {
                            final int i18 = 3;
                            objQ4 = new e23.a() { // from class: pq1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i18;
                                    StepsActivity stepsActivity2 = stepsActivity;
                                    switch (i19) {
                                        case 0:
                                            StepsActivity.a aVar7 = StepsActivity.f44915d;
                                            stepsActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            stepsActivity2.startActivity(stepsActivity2.f44917b.a());
                                            break;
                                        case 2:
                                            f.c<Intent> cVar = stepsActivity2.f44918c;
                                            EditStepsGoalActivity.f44923l.getClass();
                                            cVar.a(new Intent(stepsActivity2, (Class<?>) EditStepsGoalActivity.class), null);
                                            break;
                                        default:
                                            StepsActivity.a aVar8 = StepsActivity.f44915d;
                                            HelpActivity.a.e(HelpActivity.f36653a, stepsActivity, l.STEPS, null, null, 12);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    h.a(eVarDa2, aVar4, aVar5, aVar6, (e23.a) objQ4, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
