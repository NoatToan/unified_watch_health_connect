package j91;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivity;
import d91.t;
import d91.u;
import e23.l;
import e23.p;
import e23.q;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PersonalizedInsightsDevMenuActivity f97857b;

    public /* synthetic */ a(PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity, int i14) {
        this.f97856a = i14;
        this.f97857b = personalizedInsightsDevMenuActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f97856a;
        final PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity = this.f97857b;
        boolean z14 = false;
        final int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                PersonalizedInsightsDevMenuActivity.a aVar = PersonalizedInsightsDevMenuActivity.f40322b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1839219633, new a(personalizedInsightsDevMenuActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                PersonalizedInsightsDevMenuActivity.a aVar2 = PersonalizedInsightsDevMenuActivity.f40322b;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(personalizedInsightsDevMenuActivity.getOnBackPressedDispatcher()), z3.f.c(-360198257, new a(personalizedInsightsDevMenuActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                PersonalizedInsightsDevMenuActivity.a aVar3 = PersonalizedInsightsDevMenuActivity.f40322b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zR = mVar3.r(personalizedInsightsDevMenuActivity);
                    Object objQ = mVar3.q();
                    m.a aVar4 = m.f135153a;
                    if (zR) {
                        final int i17 = z14 ? 1 : 0;
                        objQ = new e23.a() { // from class: j91.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity2 = personalizedInsightsDevMenuActivity;
                                switch (i18) {
                                    case 0:
                                        PersonalizedInsightsDevMenuActivity.a aVar5 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        PersonalizedInsightsDevMenuActivity.a aVar6 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.ca().f97886b.e(false);
                                        break;
                                    default:
                                        PersonalizedInsightsDevMenuActivity.a aVar7 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.ca().f97885a.a(u.DEVELOPER_MENU);
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
                            objQ = new e23.a() { // from class: j91.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i18;
                                    PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity2 = personalizedInsightsDevMenuActivity;
                                    switch (i19) {
                                        case 0:
                                            PersonalizedInsightsDevMenuActivity.a aVar5 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            PersonalizedInsightsDevMenuActivity.a aVar6 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.ca().f97886b.e(false);
                                            break;
                                        default:
                                            PersonalizedInsightsDevMenuActivity.a aVar7 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.ca().f97885a.a(u.DEVELOPER_MENU);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ;
                    g3 g3Var = (g3) s9.c.c(personalizedInsightsDevMenuActivity.ca().f97888d, mVar3).getF182175a();
                    t tVar = (t) s9.c.b(personalizedInsightsDevMenuActivity.ca().f97889e, t.d.f58594b, mVar3, 48).getF182175a();
                    boolean zR2 = mVar3.r(personalizedInsightsDevMenuActivity);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new iz1.f(personalizedInsightsDevMenuActivity, 8);
                        mVar3.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new iz1.f(personalizedInsightsDevMenuActivity, 8);
                            mVar3.K(objQ2);
                        }
                    }
                    l lVar = (l) objQ2;
                    boolean zR3 = mVar3.r(personalizedInsightsDevMenuActivity);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new et1.v(personalizedInsightsDevMenuActivity, 27);
                        mVar3.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new et1.v(personalizedInsightsDevMenuActivity, 27);
                            mVar3.K(objQ3);
                        }
                    }
                    q qVar = (q) objQ3;
                    boolean zR4 = mVar3.r(personalizedInsightsDevMenuActivity);
                    Object objQ4 = mVar3.q();
                    if (zR4) {
                        objQ4 = new e23.a() { // from class: j91.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i16;
                                PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity2 = personalizedInsightsDevMenuActivity;
                                switch (i19) {
                                    case 0:
                                        PersonalizedInsightsDevMenuActivity.a aVar6 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        PersonalizedInsightsDevMenuActivity.a aVar7 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.ca().f97886b.e(false);
                                        break;
                                    default:
                                        PersonalizedInsightsDevMenuActivity.a aVar8 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.ca().f97885a.a(u.DEVELOPER_MENU);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ4);
                    } else {
                        aVar4.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new e23.a() { // from class: j91.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i16;
                                    PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity2 = personalizedInsightsDevMenuActivity;
                                    switch (i19) {
                                        case 0:
                                            PersonalizedInsightsDevMenuActivity.a aVar6 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            PersonalizedInsightsDevMenuActivity.a aVar7 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.ca().f97886b.e(false);
                                            break;
                                        default:
                                            PersonalizedInsightsDevMenuActivity.a aVar8 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.ca().f97885a.a(u.DEVELOPER_MENU);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ4);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ4;
                    f fVarCa = personalizedInsightsDevMenuActivity.ca();
                    boolean zR5 = mVar3.r(fVarCa);
                    Object objQ5 = mVar3.q();
                    if (zR5) {
                        objQ5 = new PersonalizedInsightsDevMenuActivity.b(fVarCa);
                        mVar3.K(objQ5);
                    } else {
                        aVar4.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new PersonalizedInsightsDevMenuActivity.b(fVarCa);
                            mVar3.K(objQ5);
                        }
                    }
                    e23.a aVar7 = (e23.a) ((k23.g) objQ5);
                    boolean zR6 = mVar3.r(personalizedInsightsDevMenuActivity);
                    Object objQ6 = mVar3.q();
                    if (zR6) {
                        objQ6 = new e23.a() { // from class: j91.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i15;
                                PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity2 = personalizedInsightsDevMenuActivity;
                                switch (i19) {
                                    case 0:
                                        PersonalizedInsightsDevMenuActivity.a aVar8 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.getOnBackPressedDispatcher().d();
                                        break;
                                    case 1:
                                        PersonalizedInsightsDevMenuActivity.a aVar9 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.ca().f97886b.e(false);
                                        break;
                                    default:
                                        PersonalizedInsightsDevMenuActivity.a aVar10 = PersonalizedInsightsDevMenuActivity.f40322b;
                                        personalizedInsightsDevMenuActivity2.ca().f97885a.a(u.DEVELOPER_MENU);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ6);
                    } else {
                        aVar4.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new e23.a() { // from class: j91.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i15;
                                    PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity2 = personalizedInsightsDevMenuActivity;
                                    switch (i19) {
                                        case 0:
                                            PersonalizedInsightsDevMenuActivity.a aVar8 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.getOnBackPressedDispatcher().d();
                                            break;
                                        case 1:
                                            PersonalizedInsightsDevMenuActivity.a aVar9 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.ca().f97886b.e(false);
                                            break;
                                        default:
                                            PersonalizedInsightsDevMenuActivity.a aVar10 = PersonalizedInsightsDevMenuActivity.f40322b;
                                            personalizedInsightsDevMenuActivity2.ca().f97885a.a(u.DEVELOPER_MENU);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ6);
                        }
                    }
                    e.a(aVar5, g3Var, tVar, lVar, qVar, aVar6, aVar7, (e23.a) objQ6, mVar3, g3.f35299g << 3);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
