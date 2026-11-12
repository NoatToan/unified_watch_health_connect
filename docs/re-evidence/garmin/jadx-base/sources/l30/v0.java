package l30;

import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity.c;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity.d;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import r53.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultipleCoursesActivity f109636b;

    public /* synthetic */ v0(MultipleCoursesActivity multipleCoursesActivity, int i14) {
        this.f109635a = i14;
        this.f109636b = multipleCoursesActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f109635a;
        MultipleCoursesActivity multipleCoursesActivity = this.f109636b;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                MultipleCoursesActivity.a aVar = MultipleCoursesActivity.f33000c;
                a1 a1VarDa = multipleCoursesActivity.da();
                a1VarDa.getClass();
                a1VarDa.x4(new n30.j.n(iIntValue));
                a1 a1VarDa2 = multipleCoursesActivity.da();
                a1VarDa2.getClass();
                a1VarDa2.x4(new n30.j.e(iIntValue2));
                break;
            case 1:
                ((Integer) obj).getClass();
                int iIntValue3 = ((Integer) obj2).intValue();
                MultipleCoursesActivity.a aVar2 = MultipleCoursesActivity.f33000c;
                multipleCoursesActivity.da().z4(iIntValue3);
                break;
            case 2:
                ((Integer) obj).getClass();
                int iIntValue4 = ((Integer) obj2).intValue();
                MultipleCoursesActivity.a aVar3 = MultipleCoursesActivity.f33000c;
                multipleCoursesActivity.da().z4(iIntValue4);
                break;
            case 3:
                p3.m mVar = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                MultipleCoursesActivity.a aVar4 = MultipleCoursesActivity.f33000c;
                if (mVar.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-27984986, new v0(multipleCoursesActivity, 4), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                MultipleCoursesActivity.a aVar5 = MultipleCoursesActivity.f33000c;
                if (mVar2.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(multipleCoursesActivity.da().f109524j, mVar2);
                    n30.l lVar = (n30.l) p1VarC.getF182175a();
                    a2 a2Var = multipleCoursesActivity.da().f109526l;
                    boolean zR = mVar2.r(multipleCoursesActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar6 = p3.m.f135153a;
                    if (zR) {
                        objQ = new MultipleCoursesActivity.b(multipleCoursesActivity);
                        mVar2.K(objQ);
                    } else {
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new MultipleCoursesActivity.b(multipleCoursesActivity);
                            mVar2.K(objQ);
                        }
                    }
                    m30.o.a(lVar, a2Var, (e23.l) ((k23.g) objQ), mVar2, 0);
                    Boolean boolValueOf = Boolean.valueOf(((n30.l) p1VarC.getF182175a()).f123525a);
                    n50.a aVar7 = ((n30.l) p1VarC.getF182175a()).f123526b;
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(multipleCoursesActivity);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = multipleCoursesActivity.new c(p1VarC, null);
                        mVar2.K(objQ2);
                    } else {
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = multipleCoursesActivity.new c(p1VarC, null);
                            mVar2.K(objQ2);
                        }
                    }
                    p3.l0.f(boolValueOf, aVar7, (e23.p) objQ2, mVar2);
                    Unit unit = Unit.INSTANCE;
                    boolean zR2 = mVar2.r(multipleCoursesActivity);
                    Object objQ3 = mVar2.q();
                    if (zR2) {
                        objQ3 = multipleCoursesActivity.new d(null);
                        mVar2.K(objQ3);
                    } else {
                        aVar6.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = multipleCoursesActivity.new d(null);
                            mVar2.K(objQ3);
                        }
                    }
                    p3.l0.e((e23.p) objQ3, unit, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
