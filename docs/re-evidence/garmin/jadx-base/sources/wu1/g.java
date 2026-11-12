package wu1;

import b50.o;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f187313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f187314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f187315d;

    public /* synthetic */ g(String str, boolean z14, h hVar, int i14) {
        this.f187312a = i14;
        this.f187313b = str;
        this.f187314c = z14;
        this.f187315d = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f187312a;
        h hVar = this.f187315d;
        boolean z14 = this.f187314c;
        String str = this.f187313b;
        int i15 = 1;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1009570620, new g(str, z14, hVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (str == null) {
                        str = "";
                    }
                    boolean zR = mVar.r(hVar) | mVar.h(z14);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new o(hVar, z14, 16);
                        mVar.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new o(hVar, z14, 16);
                            mVar.K(objQ);
                        }
                    }
                    cv1.f.a(0, (e23.a) objQ, str, mVar, z14);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
