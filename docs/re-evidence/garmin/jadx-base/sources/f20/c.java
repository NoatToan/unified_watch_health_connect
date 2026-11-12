package f20;

import b82.g1;
import b82.k1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import kotlin.t1;
import p005kotlin.Unit;
import p3.x1;
import v62.d2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactActivity f68359b;

    public /* synthetic */ c(ContactActivity contactActivity, int i14) {
        this.f68358a = i14;
        this.f68359b = contactActivity;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x018d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f68358a;
        ContactActivity contactActivity = this.f68359b;
        boolean z14 = false;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ContactActivity.a aVar = ContactActivity.T;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i53.f fVarA = i53.a.a(new g1(gl1.y.Q(mVar, R.string.lbl_connect), null, null, null, 14, null), new g1(gl1.y.Q(mVar, R.string.permission_phone), null, null, null, 14, null));
                    g6.c cVar = (g6.c) mVar.A(t1.f91490h);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    float fH0 = cVar.H0(d92.c.e(j92.f.f97932i).f157323b.f157308c);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58625c.getClass();
                    float f14 = fH0 + j92.b.f97899b.f97919d;
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarH = x2.h(aVar2, f14);
                    int iIntValue2 = contactActivity.B.getF182175a().intValue();
                    boolean zR = mVar.r(contactActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new j(contactActivity, i16);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new j(contactActivity, i16);
                            mVar.K(objQ);
                        }
                    }
                    k1.a(fVarA, iIntValue2, rVarH, null, 0.0f, (e23.l) objQ, mVar, 0, 24);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ContactActivity.a aVar4 = ContactActivity.T;
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-796926522, new c(contactActivity, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ContactActivity.a aVar5 = ContactActivity.T;
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarX = x2.x(aVar6, h4.d.a.f81533k, 2);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVarX, j92.b.f97899b.f97920e);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = d2.a(t62.b.f162798a);
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_admin_setup_feature_required);
                    com.garmin.android.apps.connectmobile.userprofile.model.g gVar = contactActivity.A;
                    String str = gVar != null ? gVar.f46858b : null;
                    if (str == null) {
                        str = "";
                    }
                    b82.n.c(dVarA, strQ, gl1.y.P(R.string.msg_contacts_administrator_required, new Object[]{str}, mVar3), rVarY, null, mVar3, 0, 16);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ContactActivity.a aVar7 = ContactActivity.T;
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1506380854, new c(contactActivity, z14 ? 1 : 0), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
