package sz1;

import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrainingReadinessActivity f161538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f161539c;

    public /* synthetic */ b(TrainingReadinessActivity trainingReadinessActivity, b63.o oVar, int i14) {
        this.f161537a = i14;
        this.f161538b = trainingReadinessActivity;
        this.f161539c = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f161537a;
        final TrainingReadinessActivity trainingReadinessActivity = this.f161538b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = TrainingReadinessActivity.f46481b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1937290943, new b(trainingReadinessActivity, this.f161539c, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = TrainingReadinessActivity.f46481b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    t tVar = (t) trainingReadinessActivity.f46482a.getValue();
                    boolean zR = mVar2.r(trainingReadinessActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: sz1.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (objArr2) {
                                    case 0:
                                        int i18 = TrainingReadinessActivity.f46481b;
                                        trainingReadinessActivity.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        int i19 = TrainingReadinessActivity.f46481b;
                                        HelpActivity.a.e(HelpActivity.f36653a, trainingReadinessActivity, ro0.l.TRAINING_READINESS, null, null, 12);
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
                            objQ = new e23.a() { // from class: sz1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (objArr3) {
                                        case 0:
                                            int i18 = TrainingReadinessActivity.f46481b;
                                            trainingReadinessActivity.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            int i19 = TrainingReadinessActivity.f46481b;
                                            HelpActivity.a.e(HelpActivity.f36653a, trainingReadinessActivity, ro0.l.TRAINING_READINESS, null, null, 12);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(trainingReadinessActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: sz1.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        int i18 = TrainingReadinessActivity.f46481b;
                                        trainingReadinessActivity.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        int i19 = TrainingReadinessActivity.f46481b;
                                        HelpActivity.a.e(HelpActivity.f36653a, trainingReadinessActivity, ro0.l.TRAINING_READINESS, null, null, 12);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: sz1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            int i18 = TrainingReadinessActivity.f46481b;
                                            trainingReadinessActivity.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            int i19 = TrainingReadinessActivity.f46481b;
                                            HelpActivity.a.e(HelpActivity.f36653a, trainingReadinessActivity, ro0.l.TRAINING_READINESS, null, null, 12);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    s.a(tVar, this.f161539c, aVar2, (e23.a) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
