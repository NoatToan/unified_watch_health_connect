package xc0;

import androidx.compose.ui.platform.ComposeView;
import c2.x2;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f189949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.settings.realtime.c f189950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComposeView f189951d;

    public /* synthetic */ o(String str, com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar, ComposeView composeView, int i14) {
        this.f189948a = i14;
        this.f189949b = str;
        this.f189950c = cVar;
        this.f189951d = composeView;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f189948a;
        ComposeView composeView = this.f189951d;
        com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar = this.f189950c;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Logger logger = com.garmin.android.apps.connectmobile.devices.settings.realtime.c.f34371f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1875479461, new o(this.f189949b, cVar, composeView, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                Logger logger2 = com.garmin.android.apps.connectmobile.devices.settings.realtime.c.f34371f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    n80.a aVar = new n80.a(this.f189949b, null, cVar.f34373b.getProductNumber(), false, 10, null);
                    boolean zR = mVar2.r(composeView);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new uc0.c(composeView, i15);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new uc0.c(composeView, i15);
                            mVar2.K(objQ);
                        }
                    }
                    h4.r rVarX = x2.x(x2.f(h4.r.S, 1.0f), null, 3);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    p80.a.a(aVar, (e23.l) objQ, c2.l.C(rVarX, f14, f14, f14, 0.0f, 8), null, mVar2, n80.a.f124926e, 8);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
