package po0;

import c2.t;
import e23.q;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f139019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f139020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139021d;

    public /* synthetic */ f(String str, String str2, int i14, int i15) {
        this.f139018a = i15;
        this.f139019b = str;
        this.f139020c = str2;
        this.f139021d = i14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f139018a;
        int i15 = this.f139021d;
        String str = this.f139020c;
        String str2 = this.f139019b;
        t tVar = (t) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                tVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    a.a(i15, 0, str2, str, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                tVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    a.a(i15, 0, str2, str, mVar);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
