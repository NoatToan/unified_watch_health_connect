package lp1;

import android.content.Context;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import gl1.y;
import l72.i3;
import p005kotlin.Unit;
import p3.x1;
import v62.s6;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f114154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f114155c;

    public /* synthetic */ j(e23.a aVar, Context context, int i14) {
        this.f114153a = i14;
        this.f114154b = aVar;
        this.f114155c = context;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x014d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0184  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f114153a;
        e23.a aVar = this.f114154b;
        p3.m.a aVar2 = p3.m.f135153a;
        Context context = this.f114155c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = y.Q(mVar, R.string.onboarding_solar_intensity_title);
                    boolean zB = mVar.B(aVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new ll0.a(aVar, 3);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ll0.a(aVar, 3);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    i53.f fVarA = i53.a.a(new i3("HELP_MENU", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR = mVar.r(context);
                    Object objQ2 = mVar.q();
                    if (zR) {
                        objQ2 = new a51.m(context, 23);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a51.m(context, 23);
                            mVar.K(objQ2);
                        }
                    }
                    z02.f.d(strQ, null, null, aVar3, fVarA, null, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.f23492ka);
                    boolean zB2 = mVar2.B(aVar);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new rk0.y(aVar, 11);
                        mVar2.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new rk0.y(aVar, 11);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ3;
                    String strW2 = gl1.d.W(x0.X9);
                    s62.a.f157643a.getClass();
                    i53.f fVarA2 = i53.a.a(new i3("MENU_ITEM_CREATE", strW2, false, s6.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                    boolean zR2 = mVar2.r(context);
                    Object objQ4 = mVar2.q();
                    if (zR2) {
                        objQ4 = new ot.c(context, 10);
                        mVar2.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ot.c(context, 10);
                            mVar2.K(objQ4);
                        }
                    }
                    z02.f.d(strW, null, null, aVar4, fVarA2, null, (e23.l) objQ4, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ2 = y.Q(mVar3, R.string.concept_profile_privacy);
                    i53.f fVarA3 = i53.a.a(new i3("HELP", y.Q(mVar3, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR3 = mVar3.r(context);
                    Object objQ5 = mVar3.q();
                    if (zR3) {
                        objQ5 = new ot.c(context, 18);
                        mVar3.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ot.c(context, 18);
                            mVar3.K(objQ5);
                        }
                    }
                    z02.f.d(strQ2, null, null, this.f114154b, fVarA3, null, (e23.l) objQ5, mVar3, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
