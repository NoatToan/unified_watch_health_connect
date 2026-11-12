package d52;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.EditPushesGoalActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesActivity;
import o53.f0;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushesActivity f57564b;

    public /* synthetic */ c(PushesActivity pushesActivity, int i14) {
        this.f57563a = i14;
        this.f57564b = pushesActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        int i14 = this.f57563a;
        final PushesActivity pushesActivity = this.f57564b;
        Object[] objArr = 0;
        final int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                PushesActivity.a aVar = PushesActivity.f48030d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(pushesActivity.da().f57618g, mVar);
                    pushesActivity.setRequestedOrientation((((r) p1VarC.getF182175a()).f57662g && ((r) p1VarC.getF182175a()).f57664i) ? -1 : 5);
                    q qVarDa = pushesActivity.da();
                    boolean zE = f0.E((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a));
                    p2 p2Var = qVarDa.f57618g;
                    if (zE != ((r) p2Var.getValue()).f57660e) {
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, r.a((r) value, null, null, null, false, zE, false, false, false, false, 495)));
                        qVarDa.B4();
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(-559802944, new c(pushesActivity, i16), mVar), mVar, 196608, 31);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                PushesActivity.a aVar2 = PushesActivity.f48030d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    q qVarDa2 = pushesActivity.da();
                    boolean zR = mVar2.r(pushesActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: d52.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = objArr2;
                                PushesActivity pushesActivity2 = pushesActivity;
                                switch (i17) {
                                    case 0:
                                        PushesActivity.a aVar4 = PushesActivity.f48030d;
                                        pushesActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        f.c<Intent> cVar = pushesActivity2.f48033c;
                                        EditPushesGoalActivity.f48020l.getClass();
                                        cVar.a(new Intent(pushesActivity2, (Class<?>) EditPushesGoalActivity.class), null);
                                        break;
                                    case 2:
                                        PushesActivity.a aVar5 = PushesActivity.f48030d;
                                        HelpActivity.a.e(HelpActivity.f36653a, pushesActivity, ro0.l.PUSHES, null, null, 12);
                                        break;
                                    default:
                                        pushesActivity2.startActivity(pushesActivity2.f48032b.a());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: d52.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = objArr3;
                                    PushesActivity pushesActivity2 = pushesActivity;
                                    switch (i17) {
                                        case 0:
                                            PushesActivity.a aVar4 = PushesActivity.f48030d;
                                            pushesActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            f.c<Intent> cVar = pushesActivity2.f48033c;
                                            EditPushesGoalActivity.f48020l.getClass();
                                            cVar.a(new Intent(pushesActivity2, (Class<?>) EditPushesGoalActivity.class), null);
                                            break;
                                        case 2:
                                            PushesActivity.a aVar5 = PushesActivity.f48030d;
                                            HelpActivity.a.e(HelpActivity.f36653a, pushesActivity, ro0.l.PUSHES, null, null, 12);
                                            break;
                                        default:
                                            pushesActivity2.startActivity(pushesActivity2.f48032b.a());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(pushesActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: d52.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                PushesActivity pushesActivity2 = pushesActivity;
                                switch (i17) {
                                    case 0:
                                        PushesActivity.a aVar5 = PushesActivity.f48030d;
                                        pushesActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        f.c<Intent> cVar = pushesActivity2.f48033c;
                                        EditPushesGoalActivity.f48020l.getClass();
                                        cVar.a(new Intent(pushesActivity2, (Class<?>) EditPushesGoalActivity.class), null);
                                        break;
                                    case 2:
                                        PushesActivity.a aVar6 = PushesActivity.f48030d;
                                        HelpActivity.a.e(HelpActivity.f36653a, pushesActivity, ro0.l.PUSHES, null, null, 12);
                                        break;
                                    default:
                                        pushesActivity2.startActivity(pushesActivity2.f48032b.a());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: d52.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i16;
                                    PushesActivity pushesActivity2 = pushesActivity;
                                    switch (i17) {
                                        case 0:
                                            PushesActivity.a aVar5 = PushesActivity.f48030d;
                                            pushesActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            f.c<Intent> cVar = pushesActivity2.f48033c;
                                            EditPushesGoalActivity.f48020l.getClass();
                                            cVar.a(new Intent(pushesActivity2, (Class<?>) EditPushesGoalActivity.class), null);
                                            break;
                                        case 2:
                                            PushesActivity.a aVar6 = PushesActivity.f48030d;
                                            HelpActivity.a.e(HelpActivity.f36653a, pushesActivity, ro0.l.PUSHES, null, null, 12);
                                            break;
                                        default:
                                            pushesActivity2.startActivity(pushesActivity2.f48032b.a());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ2;
                    boolean zR3 = mVar2.r(pushesActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: d52.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i15;
                                PushesActivity pushesActivity2 = pushesActivity;
                                switch (i17) {
                                    case 0:
                                        PushesActivity.a aVar6 = PushesActivity.f48030d;
                                        pushesActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        f.c<Intent> cVar = pushesActivity2.f48033c;
                                        EditPushesGoalActivity.f48020l.getClass();
                                        cVar.a(new Intent(pushesActivity2, (Class<?>) EditPushesGoalActivity.class), null);
                                        break;
                                    case 2:
                                        PushesActivity.a aVar7 = PushesActivity.f48030d;
                                        HelpActivity.a.e(HelpActivity.f36653a, pushesActivity, ro0.l.PUSHES, null, null, 12);
                                        break;
                                    default:
                                        pushesActivity2.startActivity(pushesActivity2.f48032b.a());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: d52.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i17 = i15;
                                    PushesActivity pushesActivity2 = pushesActivity;
                                    switch (i17) {
                                        case 0:
                                            PushesActivity.a aVar6 = PushesActivity.f48030d;
                                            pushesActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            f.c<Intent> cVar = pushesActivity2.f48033c;
                                            EditPushesGoalActivity.f48020l.getClass();
                                            cVar.a(new Intent(pushesActivity2, (Class<?>) EditPushesGoalActivity.class), null);
                                            break;
                                        case 2:
                                            PushesActivity.a aVar7 = PushesActivity.f48030d;
                                            HelpActivity.a.e(HelpActivity.f36653a, pushesActivity, ro0.l.PUSHES, null, null, 12);
                                            break;
                                        default:
                                            pushesActivity2.startActivity(pushesActivity2.f48032b.a());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ3;
                    boolean zR4 = mVar2.r(pushesActivity);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        final int i17 = 3;
                        objQ4 = new e23.a() { // from class: d52.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                PushesActivity pushesActivity2 = pushesActivity;
                                switch (i18) {
                                    case 0:
                                        PushesActivity.a aVar7 = PushesActivity.f48030d;
                                        pushesActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        f.c<Intent> cVar = pushesActivity2.f48033c;
                                        EditPushesGoalActivity.f48020l.getClass();
                                        cVar.a(new Intent(pushesActivity2, (Class<?>) EditPushesGoalActivity.class), null);
                                        break;
                                    case 2:
                                        PushesActivity.a aVar8 = PushesActivity.f48030d;
                                        HelpActivity.a.e(HelpActivity.f36653a, pushesActivity, ro0.l.PUSHES, null, null, 12);
                                        break;
                                    default:
                                        pushesActivity2.startActivity(pushesActivity2.f48032b.a());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i18 = 3;
                            objQ4 = new e23.a() { // from class: d52.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i18;
                                    PushesActivity pushesActivity2 = pushesActivity;
                                    switch (i19) {
                                        case 0:
                                            PushesActivity.a aVar7 = PushesActivity.f48030d;
                                            pushesActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            f.c<Intent> cVar = pushesActivity2.f48033c;
                                            EditPushesGoalActivity.f48020l.getClass();
                                            cVar.a(new Intent(pushesActivity2, (Class<?>) EditPushesGoalActivity.class), null);
                                            break;
                                        case 2:
                                            PushesActivity.a aVar8 = PushesActivity.f48030d;
                                            HelpActivity.a.e(HelpActivity.f36653a, pushesActivity, ro0.l.PUSHES, null, null, 12);
                                            break;
                                        default:
                                            pushesActivity2.startActivity(pushesActivity2.f48032b.a());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    o.a(qVarDa2, aVar4, aVar5, aVar6, (e23.a) objQ4, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
