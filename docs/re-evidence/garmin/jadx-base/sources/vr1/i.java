package vr1;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import e23.p;
import o53.f0;
import p005kotlin.Unit;
import p1.z;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StressReportsActivity f179503b;

    public /* synthetic */ i(StressReportsActivity stressReportsActivity, int i14) {
        this.f179502a = i14;
        this.f179503b = stressReportsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f179502a;
        final StressReportsActivity stressReportsActivity = this.f179503b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                ?? r14 = stressReportsActivity.f45014a;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = StressReportsActivity.f45013d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(((qr1.d) r14.getValue()).f146912h, mVar);
                    stressReportsActivity.setRequestedOrientation((((qr1.c) p1VarC.getF182175a()).f146901f && ((qr1.c) p1VarC.getF182175a()).f146903h) ? -1 : 5);
                    qr1.d dVar = (qr1.d) r14.getValue();
                    boolean zE = f0.E((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a));
                    p2 p2Var = dVar.f146911g;
                    if (zE != ((qr1.c) p2Var.getValue()).f146898c) {
                        while (true) {
                            Object value = p2Var.getValue();
                            boolean z14 = zE;
                            if (p2Var.b(value, qr1.c.a((qr1.c) value, null, null, z14, false, false, false, 0, false, 251))) {
                                dVar.z4();
                            } else {
                                zE = z14;
                            }
                        }
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(-857604163, new i(stressReportsActivity, i15), mVar), mVar, 196608, 31);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = StressReportsActivity.f45013d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    qr1.d dVar2 = (qr1.d) stressReportsActivity.f45014a.getValue();
                    boolean z15 = ((yb0.a) stressReportsActivity.f45015b.getValue()).f195679b.h() > 0;
                    boolean zR = mVar2.r(stressReportsActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: vr1.j
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = objArr2;
                                StressReportsActivity stressReportsActivity2 = stressReportsActivity;
                                switch (i18) {
                                    case 0:
                                        int i19 = StressReportsActivity.f45013d;
                                        stressReportsActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        int i24 = StressReportsActivity.f45013d;
                                        z<sd2.f> zVar = ((yb0.a) stressReportsActivity2.f45015b.getValue()).f195679b;
                                        int iH = zVar.h();
                                        if (iH == 1) {
                                            stressReportsActivity2.f45016c.a(stressReportsActivity2, new n(zVar.i(0)).f179557a);
                                        } else if (iH > 1) {
                                            xb0.a.f189862b.getClass();
                                            xb0.a aVar2 = new xb0.a();
                                            aVar2.setCancelable(false);
                                            aVar2.show(stressReportsActivity2.getSupportFragmentManager(), "");
                                        }
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
                            objQ = new e23.a() { // from class: vr1.j
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = objArr3;
                                    StressReportsActivity stressReportsActivity2 = stressReportsActivity;
                                    switch (i18) {
                                        case 0:
                                            int i19 = StressReportsActivity.f45013d;
                                            stressReportsActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            int i24 = StressReportsActivity.f45013d;
                                            z<sd2.f> zVar = ((yb0.a) stressReportsActivity2.f45015b.getValue()).f195679b;
                                            int iH = zVar.h();
                                            if (iH == 1) {
                                                stressReportsActivity2.f45016c.a(stressReportsActivity2, new n(zVar.i(0)).f179557a);
                                            } else if (iH > 1) {
                                                xb0.a.f189862b.getClass();
                                                xb0.a aVar2 = new xb0.a();
                                                aVar2.setCancelable(false);
                                                aVar2.show(stressReportsActivity2.getSupportFragmentManager(), "");
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(stressReportsActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new h(stressReportsActivity, 1);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h(stressReportsActivity, 1);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.l lVar = (e23.l) objQ2;
                    boolean zR3 = mVar2.r(stressReportsActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: vr1.j
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i15;
                                StressReportsActivity stressReportsActivity2 = stressReportsActivity;
                                switch (i18) {
                                    case 0:
                                        int i19 = StressReportsActivity.f45013d;
                                        stressReportsActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        int i24 = StressReportsActivity.f45013d;
                                        z<sd2.f> zVar = ((yb0.a) stressReportsActivity2.f45015b.getValue()).f195679b;
                                        int iH = zVar.h();
                                        if (iH == 1) {
                                            stressReportsActivity2.f45016c.a(stressReportsActivity2, new n(zVar.i(0)).f179557a);
                                        } else if (iH > 1) {
                                            xb0.a.f189862b.getClass();
                                            xb0.a aVar3 = new xb0.a();
                                            aVar3.setCancelable(false);
                                            aVar3.show(stressReportsActivity2.getSupportFragmentManager(), "");
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: vr1.j
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i15;
                                    StressReportsActivity stressReportsActivity2 = stressReportsActivity;
                                    switch (i18) {
                                        case 0:
                                            int i19 = StressReportsActivity.f45013d;
                                            stressReportsActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            int i24 = StressReportsActivity.f45013d;
                                            z<sd2.f> zVar = ((yb0.a) stressReportsActivity2.f45015b.getValue()).f195679b;
                                            int iH = zVar.h();
                                            if (iH == 1) {
                                                stressReportsActivity2.f45016c.a(stressReportsActivity2, new n(zVar.i(0)).f179557a);
                                            } else if (iH > 1) {
                                                xb0.a.f189862b.getClass();
                                                xb0.a aVar3 = new xb0.a();
                                                aVar3.setCancelable(false);
                                                aVar3.show(stressReportsActivity2.getSupportFragmentManager(), "");
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    m.a(dVar2, z15, aVar2, lVar, (e23.a) objQ3, mVar2, qr1.d.f146904j);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
