package jy0;

import com.garmin.android.apps.connectmobile.R;
import java.util.Map;
import l72.i3;
import p005kotlin.Unit;
import p13.t0;
import p3.x1;
import p3.x3;
import v62.n3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f101806b;

    public /* synthetic */ t(x3 x3Var, int i14) {
        this.f101805a = i14;
        this.f101806b = x3Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i53.f fVarA;
        String str;
        int i14 = this.f101805a;
        x3 x3Var = this.f101806b;
        switch (i14) {
            case 0:
                v vVar = (v) obj;
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                vVar.getClass();
                mVar.C(1650531099);
                x1 x1Var = p3.n.f135158a;
                if (vVar.equals(v.g.f101832b) || vVar.equals(v.e.f101830b)) {
                    mVar.C(1317460107);
                    fVarA = i53.a.a(new i3("MENU_ITEM_EXIT", gl1.y.Q(mVar, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    mVar.f();
                } else {
                    fVarA = null;
                    if (vVar.equals(v.a.f101826b)) {
                        mVar.C(-2108105531);
                        if (((sy0.b) x3Var.getF182175a()).f161202b.isEmpty()) {
                            mVar.C(-2107863917);
                            mVar.f();
                        } else {
                            mVar.C(-2108030046);
                            String strQ = gl1.y.Q(mVar, R.string.lbl_filter);
                            s62.a.f157643a.getClass();
                            fVarA = i53.a.a(new i3("MENU_ITEM_FILTER", strQ, false, n3.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                            mVar.f();
                        }
                        mVar.f();
                    } else if (vVar.equals(v.d.f101829b)) {
                        mVar.C(1317483075);
                        String strQ2 = gl1.y.Q(mVar, R.string.lbl_filter);
                        s62.a.f157643a.getClass();
                        fVarA = i53.a.a(new i3("MENU_ITEM_FILTER", strQ2, false, n3.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                        mVar.f();
                    } else {
                        mVar.C(-2107418014);
                        mVar.f();
                    }
                }
                mVar.f();
                return fVarA;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ag2.c.a aVar = ag2.c.a.TIMER;
                    ah2.e eVar = (ah2.e) ((Map) x3Var.getF182175a()).get(aVar);
                    if (eVar == null || (str = eVar.f3289a) == null) {
                        str = "";
                    }
                    xg2.j.a(t0.b(new o13.p(aVar, str)), mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                v.h.y(-2120732126, rVar, (Integer) obj3, mVar3);
                x1 x1Var3 = p3.n.f135158a;
                h4.r rVarA = l4.k.a(rVar, ((Number) x3Var.getF182175a()).floatValue());
                mVar3.f();
                return rVarA;
        }
    }
}
