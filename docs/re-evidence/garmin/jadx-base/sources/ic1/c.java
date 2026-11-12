package ic1;

import c22.b0;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.pulseox.presentation.PulseOxActivity;
import e23.p;
import java.util.Locale;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PulseOxActivity f92609b;

    public /* synthetic */ c(PulseOxActivity pulseOxActivity, int i14) {
        this.f92608a = i14;
        this.f92609b = pulseOxActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f92608a;
        final PulseOxActivity pulseOxActivity = this.f92609b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = PulseOxActivity.f41055b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(831703766, new c(pulseOxActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = PulseOxActivity.f41055b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    m mVar3 = (m) pulseOxActivity.f41056a.getValue();
                    boolean zR = mVar2.r(pulseOxActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: ic1.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (objArr2) {
                                    case 0:
                                        int i18 = PulseOxActivity.f41055b;
                                        pulseOxActivity.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        int i19 = PulseOxActivity.f41055b;
                                        boolean zEqualsIgnoreCase = b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry());
                                        HelpActivity.a.e(HelpActivity.f36653a, pulseOxActivity, ro0.l.PULSE_OX, zEqualsIgnoreCase ? "BLOOD_EFFICIENCY_ACTION" : null, null, 8);
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
                            objQ = new e23.a() { // from class: ic1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (objArr3) {
                                        case 0:
                                            int i18 = PulseOxActivity.f41055b;
                                            pulseOxActivity.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            int i19 = PulseOxActivity.f41055b;
                                            boolean zEqualsIgnoreCase = b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry());
                                            HelpActivity.a.e(HelpActivity.f36653a, pulseOxActivity, ro0.l.PULSE_OX, zEqualsIgnoreCase ? "BLOOD_EFFICIENCY_ACTION" : null, null, 8);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(pulseOxActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: ic1.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        int i18 = PulseOxActivity.f41055b;
                                        pulseOxActivity.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        int i19 = PulseOxActivity.f41055b;
                                        boolean zEqualsIgnoreCase = b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry());
                                        HelpActivity.a.e(HelpActivity.f36653a, pulseOxActivity, ro0.l.PULSE_OX, zEqualsIgnoreCase ? "BLOOD_EFFICIENCY_ACTION" : null, null, 8);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: ic1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            int i18 = PulseOxActivity.f41055b;
                                            pulseOxActivity.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            int i19 = PulseOxActivity.f41055b;
                                            boolean zEqualsIgnoreCase = b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry());
                                            HelpActivity.a.e(HelpActivity.f36653a, pulseOxActivity, ro0.l.PULSE_OX, zEqualsIgnoreCase ? "BLOOD_EFFICIENCY_ACTION" : null, null, 8);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ2;
                    boolean zR3 = mVar2.r(pulseOxActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new ho0.g(pulseOxActivity, 22);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ho0.g(pulseOxActivity, 22);
                            mVar2.K(objQ3);
                        }
                    }
                    l.a(mVar3, aVar2, aVar3, (e23.l) objQ3, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
