package w31;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181851a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f181852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f181853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f181854d;

    public /* synthetic */ e(h hVar, String str, String str2) {
        this.f181852b = hVar;
        this.f181853c = str;
        this.f181854d = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f181851a;
        String str = this.f181854d;
        String str2 = this.f181853c;
        h hVar = this.f181852b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                hVar.e(str2, str, mVar, p0.t(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    hVar.e(str2, str, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(h hVar, String str, String str2, int i14) {
        this.f181852b = hVar;
        this.f181853c = str;
        this.f181854d = str2;
    }
}
