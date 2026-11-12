package o12;

import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileActivity f128537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f128538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w12.d f128539d;

    public /* synthetic */ c(boolean z14, EditProfileActivity editProfileActivity, w12.d dVar) {
        this.f128536a = 2;
        this.f128538c = z14;
        this.f128537b = editProfileActivity;
        this.f128539d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f128536a;
        w12.d dVar = this.f128539d;
        boolean z14 = this.f128538c;
        EditProfileActivity editProfileActivity = this.f128537b;
        boolean z15 = false;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                EditProfileActivity.a aVar = EditProfileActivity.f46981h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1193766624, new c(editProfileActivity, z14, dVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                EditProfileActivity.a aVar2 = EditProfileActivity.f46981h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(editProfileActivity.getOnBackPressedDispatcher()), z3.f.c(-1120070560, new c(z14, editProfileActivity, dVar), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                EditProfileActivity.a aVar3 = EditProfileActivity.f46981h;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    com.garmin.android.apps.connectmobile.userprofile.presentation.d dVarEa = editProfileActivity.ea();
                    boolean zR = mVar3.r(editProfileActivity);
                    Object objQ = mVar3.q();
                    m.a aVar4 = m.f135153a;
                    if (zR) {
                        objQ = new m92.f(editProfileActivity, 14);
                        mVar3.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new m92.f(editProfileActivity, 14);
                            mVar3.K(objQ);
                        }
                    }
                    p pVar = (p) objQ;
                    boolean zR2 = mVar3.r(editProfileActivity);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new b(editProfileActivity, i15);
                        mVar3.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new b(editProfileActivity, i15);
                            mVar3.K(objQ2);
                        }
                    }
                    l lVar = (l) objQ2;
                    boolean zR3 = mVar3.r(editProfileActivity);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new n82.i(editProfileActivity, 12);
                        mVar3.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new n82.i(editProfileActivity, 12);
                            mVar3.K(objQ3);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ3;
                    boolean zR4 = mVar3.r(editProfileActivity);
                    Object objQ4 = mVar3.q();
                    if (zR4) {
                        objQ4 = new b(editProfileActivity, z15 ? 1 : 0);
                        mVar3.K(objQ4);
                    } else {
                        aVar4.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new b(editProfileActivity, z15 ? 1 : 0);
                            mVar3.K(objQ4);
                        }
                    }
                    w12.c.a(this.f128538c, dVarEa, this.f128539d, pVar, lVar, aVar5, (l) objQ4, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(EditProfileActivity editProfileActivity, boolean z14, w12.d dVar, int i14) {
        this.f128536a = i14;
        this.f128537b = editProfileActivity;
        this.f128538c = z14;
        this.f128539d = dVar;
    }
}
