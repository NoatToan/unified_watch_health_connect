package rg0;

import android.content.DialogInterface;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthorizedViewerDetailActivity f152567b;

    public /* synthetic */ j(AuthorizedViewerDetailActivity authorizedViewerDetailActivity, int i14) {
        this.f152566a = i14;
        this.f152567b = authorizedViewerDetailActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f152566a;
        int i15 = 2;
        int i16 = 3;
        AuthorizedViewerDetailActivity authorizedViewerDetailActivity = this.f152567b;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                AuthorizedViewerDetailActivity.a aVar = AuthorizedViewerDetailActivity.f34963c;
                ((DialogInterface) obj).getClass();
                ht.a.f85464a.getClass();
                ht.a.a(null, "AuthorizedViewersAccessRemoved");
                if (iIntValue == -1) {
                    authorizedViewerDetailActivity.da().x4();
                }
                break;
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                AuthorizedViewerDetailActivity.a aVar2 = AuthorizedViewerDetailActivity.f34963c;
                ((DialogInterface) obj).getClass();
                if (iIntValue2 == -1) {
                    authorizedViewerDetailActivity.da().x4();
                }
                break;
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                AuthorizedViewerDetailActivity.a aVar3 = AuthorizedViewerDetailActivity.f34963c;
                ((DialogInterface) obj).getClass();
                ht.a.f85464a.getClass();
                ht.a.a(null, "AuthorizedViewersAccessRemoved");
                if (iIntValue3 == -1) {
                    authorizedViewerDetailActivity.da().x4();
                }
                break;
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                AuthorizedViewerDetailActivity.a aVar4 = AuthorizedViewerDetailActivity.f34963c;
                ((DialogInterface) obj).getClass();
                if (iIntValue4 == -1) {
                    authorizedViewerDetailActivity.da().x4();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                AuthorizedViewerDetailActivity.a aVar5 = AuthorizedViewerDetailActivity.f34963c;
                ((DialogInterface) obj).getClass();
                ht.a.f85464a.getClass();
                ht.a.a(null, "AuthorizedViewersWebViewOpened");
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d dVarDa = authorizedViewerDetailActivity.da();
                dVarDa.f35040f.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
                ge1.b.T(v1.a(dVarDa), dVarDa.f35038d.f22991c, null, new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.e(dVarDa, null), 2);
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                AuthorizedViewerDetailActivity.a aVar6 = AuthorizedViewerDetailActivity.f34963c;
                int i17 = 1;
                if (mVar.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zR = mVar.r(authorizedViewerDetailActivity);
                    Object objQ = mVar.q();
                    p3.m.a aVar7 = p3.m.f135153a;
                    if (zR) {
                        objQ = new k(authorizedViewerDetailActivity, i17);
                        mVar.K(objQ);
                    } else {
                        aVar7.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k(authorizedViewerDetailActivity, i17);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ;
                    boolean zR2 = mVar.r(authorizedViewerDetailActivity);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new k(authorizedViewerDetailActivity, i15);
                        mVar.K(objQ2);
                    } else {
                        aVar7.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new k(authorizedViewerDetailActivity, i15);
                            mVar.K(objQ2);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ2;
                    boolean zR3 = mVar.r(authorizedViewerDetailActivity);
                    Object objQ3 = mVar.q();
                    if (zR3) {
                        objQ3 = new k(authorizedViewerDetailActivity, i16);
                        mVar.K(objQ3);
                    } else {
                        aVar7.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new k(authorizedViewerDetailActivity, i16);
                            mVar.K(objQ3);
                        }
                    }
                    e23.a aVar10 = (e23.a) objQ3;
                    boolean zR4 = mVar.r(authorizedViewerDetailActivity);
                    Object objQ4 = mVar.q();
                    if (zR4) {
                        objQ4 = new k(authorizedViewerDetailActivity, 4);
                        mVar.K(objQ4);
                    } else {
                        aVar7.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new k(authorizedViewerDetailActivity, 4);
                            mVar.K(objQ4);
                        }
                    }
                    e23.a aVar11 = (e23.a) objQ4;
                    boolean zR5 = mVar.r(authorizedViewerDetailActivity);
                    Object objQ5 = mVar.q();
                    if (zR5) {
                        objQ5 = new k(authorizedViewerDetailActivity, 5);
                        mVar.K(objQ5);
                    } else {
                        aVar7.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new k(authorizedViewerDetailActivity, 5);
                            mVar.K(objQ5);
                        }
                    }
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.c.a(aVar8, aVar9, aVar10, aVar11, (e23.a) objQ5, authorizedViewerDetailActivity.da(), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
