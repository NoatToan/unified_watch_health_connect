package gl1;

import lc.m0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f77825c;

    public /* synthetic */ a(String str, m0 m0Var, int i14) {
        this.f77823a = i14;
        this.f77824b = str;
        this.f77825c = m0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Long l14 = (Long) obj;
        switch (this.f77823a) {
            case 0:
                long jLongValue = l14.longValue();
                String str = this.f77824b;
                m0 m0Var = this.f77825c;
                if (str != null) {
                    q.b(m0Var, jLongValue, str);
                } else {
                    q.c(m0Var, jLongValue, true);
                }
                break;
            case 1:
                long jLongValue2 = l14.longValue();
                String str2 = this.f77824b;
                m0 m0Var2 = this.f77825c;
                if (str2 != null) {
                    q.b(m0Var2, jLongValue2, str2);
                } else {
                    q.c(m0Var2, jLongValue2, false);
                }
                break;
            default:
                long jLongValue3 = l14.longValue();
                String str3 = this.f77824b;
                m0 m0Var3 = this.f77825c;
                if (str3 != null) {
                    q.b(m0Var3, jLongValue3, str3);
                } else {
                    q.c(m0Var3, jLongValue3, true);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
