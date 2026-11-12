package uc0;

import androidx.compose.ui.platform.ComposeView;
import c2.x2;
import e23.l;
import e23.p;
import h4.r;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f169943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f169944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComposeView f169945d;

    public /* synthetic */ b(String str, d dVar, ComposeView composeView, int i14) {
        this.f169942a = i14;
        this.f169943b = str;
        this.f169944c = dVar;
        this.f169945d = composeView;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f169942a;
        ComposeView composeView = this.f169945d;
        d dVar = this.f169944c;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Logger logger = d.f169948i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(970196231, new b(this.f169943b, dVar, composeView, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                Logger logger2 = d.f169948i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    n80.a aVar = new n80.a(this.f169943b, null, dVar.f169950b.getProductNumber(), false, 10, null);
                    boolean zR = mVar2.r(composeView);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new c(composeView, 0);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new c(composeView, 0);
                            mVar2.K(objQ);
                        }
                    }
                    r rVarX = x2.x(x2.f(r.S, 1.0f), null, 3);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    p80.a.a(aVar, (l) objQ, c2.l.C(rVarX, f14, f14, f14, 0.0f, 8), null, mVar2, n80.a.f124926e, 8);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
