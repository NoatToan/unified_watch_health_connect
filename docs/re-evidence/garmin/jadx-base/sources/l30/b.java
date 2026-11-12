package l30;

import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import r53.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109545b;

    public /* synthetic */ b(CreateCourseActivity createCourseActivity, int i14) {
        this.f109544a = i14;
        this.f109545b = createCourseActivity;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x012a  */
    /* JADX WARN: Code duplicated, block: B:38:0x015c  */
    /* JADX WARN: Code duplicated, block: B:43:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f109544a;
        int i15 = 1;
        CreateCourseActivity createCourseActivity = this.f109545b;
        switch (i14) {
            case 0:
                ((Integer) obj).getClass();
                int iIntValue = ((Integer) obj2).intValue();
                CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
                createCourseActivity.ea().C4(iIntValue);
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(createCourseActivity.ea().f109669x, mVar);
                    n30.f fVar = (n30.f) p1VarC.getF182175a();
                    a2 a2Var = createCourseActivity.ea().f109671z;
                    boolean zR = mVar.r(createCourseActivity);
                    Object objQ = mVar.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new g(createCourseActivity);
                        mVar.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g(createCourseActivity);
                            mVar.K(objQ);
                        }
                    }
                    m30.c.a(fVar, a2Var, (e23.l) ((k23.g) objQ), mVar, 0);
                    Boolean boolValueOf = Boolean.valueOf(((n30.f) p1VarC.getF182175a()).f123453a);
                    boolean zR2 = mVar.r(createCourseActivity) | mVar.B(p1VarC);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new h(createCourseActivity, p1VarC, null);
                        mVar.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h(createCourseActivity, p1VarC, null);
                            mVar.K(objQ2);
                        }
                    }
                    p3.l0.e((e23.p) objQ2, boolValueOf, mVar);
                    Unit unit = Unit.INSTANCE;
                    boolean zR3 = mVar.r(createCourseActivity);
                    Object objQ3 = mVar.q();
                    if (zR3) {
                        objQ3 = new i(createCourseActivity, null);
                        mVar.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new i(createCourseActivity, null);
                            mVar.K(objQ3);
                        }
                    }
                    p3.l0.e((e23.p) objQ3, unit, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                CreateCourseActivity.a aVar4 = CreateCourseActivity.f32989g;
                z zVarEa = createCourseActivity.ea();
                zVarEa.getClass();
                zVarEa.z4(new n30.c.w(iIntValue3));
                z zVarEa2 = createCourseActivity.ea();
                zVarEa2.getClass();
                zVarEa2.z4(new n30.c.n(iIntValue4));
                break;
            case 3:
                ((Integer) obj).getClass();
                int iIntValue5 = ((Integer) obj2).intValue();
                CreateCourseActivity.a aVar5 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().C4(iIntValue5);
                break;
            case 4:
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                CreateCourseActivity.a aVar6 = CreateCourseActivity.f32989g;
                z zVarEa3 = createCourseActivity.ea();
                zVarEa3.getClass();
                zVarEa3.z4(new n30.c.w(iIntValue6));
                z zVarEa4 = createCourseActivity.ea();
                zVarEa4.getClass();
                zVarEa4.z4(new n30.c.n(iIntValue7));
                break;
            case 5:
                ((Integer) obj).getClass();
                int iIntValue8 = ((Integer) obj2).intValue();
                CreateCourseActivity.a aVar7 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().C4(iIntValue8);
                break;
            case 6:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                CreateCourseActivity.a aVar8 = CreateCourseActivity.f32989g;
                if (mVar2.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1152923365, new b(createCourseActivity, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            default:
                double dDoubleValue = ((Double) obj).doubleValue();
                double dDoubleValue2 = ((Double) obj2).doubleValue();
                CreateCourseActivity.a aVar9 = CreateCourseActivity.f32989g;
                createCourseActivity.fa(new n30.a.x(dDoubleValue, dDoubleValue2));
                break;
        }
        return Unit.INSTANCE;
    }
}
