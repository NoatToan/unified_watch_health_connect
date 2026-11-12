package xh0;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.floors.presentation.FloorsActivity;
import com.garmin.android.apps.connectmobile.floors.presentation.details.EditFloorsGoalActivity;
import e23.p;
import o53.f0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloorsActivity f190975b;

    public /* synthetic */ a(FloorsActivity floorsActivity, int i14) {
        this.f190974a = i14;
        this.f190975b = floorsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f190974a;
        final FloorsActivity floorsActivity = this.f190975b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                ?? r14 = floorsActivity.f35230a;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = FloorsActivity.f35229c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    p1 p1VarC = s9.c.c(((h) r14.getValue()).f191013f, mVar);
                    floorsActivity.setRequestedOrientation((((g) p1VarC.getF182175a()).f191006g && ((g) p1VarC.getF182175a()).f191007h) ? -1 : 5);
                    h hVar = (h) r14.getValue();
                    boolean zE = f0.E((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a));
                    p2 p2Var = hVar.f191013f;
                    if (zE != ((g) p2Var.getValue()).f191003d) {
                        while (true) {
                            Object value = p2Var.getValue();
                            boolean z14 = zE;
                            if (p2Var.b(value, g.a((g) value, null, null, false, z14, false, false, false, false, 247))) {
                                hVar.y4();
                            } else {
                                zE = z14;
                            }
                        }
                    }
                    z02.b.a(false, null, null, null, true, z3.f.c(-1456614753, new a(floorsActivity, i15), mVar), mVar, 221184, 15);
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = FloorsActivity.f35229c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    h hVar2 = (h) floorsActivity.f35230a.getValue();
                    boolean zR = mVar2.r(floorsActivity);
                    Object objQ = mVar2.q();
                    m.a aVar = m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: xh0.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = objArr2;
                                FloorsActivity floorsActivity2 = floorsActivity;
                                switch (i18) {
                                    case 0:
                                        int i19 = FloorsActivity.f35229c;
                                        floorsActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        f.c<Intent> cVar = floorsActivity2.f35231b;
                                        EditFloorsGoalActivity.f35236k.getClass();
                                        cVar.a(new Intent(floorsActivity2, (Class<?>) EditFloorsGoalActivity.class), null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: xh0.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = objArr3;
                                    FloorsActivity floorsActivity2 = floorsActivity;
                                    switch (i18) {
                                        case 0:
                                            int i19 = FloorsActivity.f35229c;
                                            floorsActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            f.c<Intent> cVar = floorsActivity2.f35231b;
                                            EditFloorsGoalActivity.f35236k.getClass();
                                            cVar.a(new Intent(floorsActivity2, (Class<?>) EditFloorsGoalActivity.class), null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(floorsActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: xh0.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i15;
                                FloorsActivity floorsActivity2 = floorsActivity;
                                switch (i18) {
                                    case 0:
                                        int i19 = FloorsActivity.f35229c;
                                        floorsActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        f.c<Intent> cVar = floorsActivity2.f35231b;
                                        EditFloorsGoalActivity.f35236k.getClass();
                                        cVar.a(new Intent(floorsActivity2, (Class<?>) EditFloorsGoalActivity.class), null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: xh0.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i15;
                                    FloorsActivity floorsActivity2 = floorsActivity;
                                    switch (i18) {
                                        case 0:
                                            int i19 = FloorsActivity.f35229c;
                                            floorsActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            f.c<Intent> cVar = floorsActivity2.f35231b;
                                            EditFloorsGoalActivity.f35236k.getClass();
                                            cVar.a(new Intent(floorsActivity2, (Class<?>) EditFloorsGoalActivity.class), null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    f.a(hVar2, aVar2, (e23.a) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
