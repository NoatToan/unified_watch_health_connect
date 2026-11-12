package o62;

import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.EditRepsActivity;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditRepsActivity f129657b;

    public /* synthetic */ e(EditRepsActivity editRepsActivity, int i14) {
        this.f129656a = i14;
        this.f129657b = editRepsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f129656a;
        EditRepsActivity editRepsActivity = this.f129657b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                EditRepsActivity.a aVar = EditRepsActivity.f49554a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1538491873, new e(editRepsActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                EditRepsActivity.a aVar2 = EditRepsActivity.f49554a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.p0.n(String.valueOf(editRepsActivity.getIntent().getIntExtra("reps", 0)));
                        mVar2.K(objQ);
                    }
                    p1 p1Var = (p1) objQ;
                    boolean booleanExtra = editRepsActivity.getIntent().getBooleanExtra("is_reps_plus_supported", false);
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p3.p0.n(Boolean.valueOf(editRepsActivity.getIntent().getBooleanExtra("is_reps_plus_enabled", false)));
                        mVar2.K(objQ2);
                    }
                    p1 p1Var2 = (p1) objQ2;
                    String str = (String) p1Var.getF182175a();
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new j10.q(p1Var, p1Var2, i15);
                        mVar2.K(objQ3);
                    }
                    h.a(str, booleanExtra, zBooleanValue, (e23.p) objQ3, mVar2, 3072);
                    boolean zR = mVar2.r(editRepsActivity);
                    Object objQ4 = mVar2.q();
                    if (zR || objQ4 == c2565a) {
                        objQ4 = new nw0.p(editRepsActivity, 3, p1Var, p1Var2);
                        mVar2.K(objQ4);
                    }
                    c.w.a(0, 1, (e23.a) objQ4, mVar2, false);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
